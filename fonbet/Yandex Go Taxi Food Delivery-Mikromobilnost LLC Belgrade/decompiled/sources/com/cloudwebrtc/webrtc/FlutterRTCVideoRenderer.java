package com.cloudwebrtc.webrtc;

import android.util.Log;
import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.cloudwebrtc.webrtc.utils.ConstraintsMap;
import com.cloudwebrtc.webrtc.utils.EglUtils;
import defpackage.afo;
import defpackage.xeo;
import defpackage.zeo;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.MediaStream;
import org.webrtc.RendererCommon;
import org.webrtc.VideoTrack;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes10.dex */
public class FlutterRTCVideoRenderer implements zeo {
    private static final String TAG = "FlutterWebRTCPlugin";
    afo eventChannel;
    xeo eventSink;
    private int id = -1;
    private MediaStream mediaStream;
    private String ownerTag;
    private final TextureRegistry$SurfaceProducer producer;
    private RendererCommon.RendererEvents rendererEvents;
    private final SurfaceTextureRenderer surfaceTextureRenderer;
    private VideoTrack videoTrack;

    public FlutterRTCVideoRenderer(TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        SurfaceTextureRenderer surfaceTextureRenderer = new SurfaceTextureRenderer("");
        this.surfaceTextureRenderer = surfaceTextureRenderer;
        listenRendererEvents();
        surfaceTextureRenderer.init(EglUtils.getRootEglBaseContext(), this.rendererEvents);
        surfaceTextureRenderer.surfaceCreated(textureRegistry$SurfaceProducer);
        this.eventSink = null;
        this.producer = textureRegistry$SurfaceProducer;
        this.ownerTag = null;
    }

    private void listenRendererEvents() {
        this.rendererEvents = new RendererCommon.RendererEvents() { // from class: com.cloudwebrtc.webrtc.FlutterRTCVideoRenderer.1
            private int _rotation = -1;
            private int _width = 0;
            private int _height = 0;

            @Override // org.webrtc.RendererCommon.RendererEvents
            public void onFirstFrameRendered() {
                ConstraintsMap constraintsMap = new ConstraintsMap();
                constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "didFirstFrameRendered");
                constraintsMap.putInt("id", FlutterRTCVideoRenderer.this.id);
                xeo xeoVar = FlutterRTCVideoRenderer.this.eventSink;
                if (xeoVar != null) {
                    xeoVar.success(constraintsMap.toMap());
                }
            }

            @Override // org.webrtc.RendererCommon.RendererEvents
            public void onFrameResolutionChanged(int i, int i2, int i3) {
                if (FlutterRTCVideoRenderer.this.eventSink != null) {
                    if (this._width != i || this._height != i2) {
                        ConstraintsMap constraintsMap = new ConstraintsMap();
                        constraintsMap.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "didTextureChangeVideoSize");
                        constraintsMap.putInt("id", FlutterRTCVideoRenderer.this.id);
                        constraintsMap.putDouble("width", i);
                        constraintsMap.putDouble("height", i2);
                        this._width = i;
                        this._height = i2;
                        FlutterRTCVideoRenderer.this.eventSink.success(constraintsMap.toMap());
                    }
                    if (this._rotation != i3) {
                        ConstraintsMap constraintsMap2 = new ConstraintsMap();
                        constraintsMap2.putString(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "didTextureChangeRotation");
                        constraintsMap2.putInt("id", FlutterRTCVideoRenderer.this.id);
                        constraintsMap2.putInt("rotation", i3);
                        this._rotation = i3;
                        FlutterRTCVideoRenderer.this.eventSink.success(constraintsMap2.toMap());
                    }
                }
            }
        };
    }

    private void removeRendererFromVideoTrack() {
        this.videoTrack.removeSink(this.surfaceTextureRenderer);
    }

    private void tryAddRendererToVideoTrack() throws Exception {
        if (this.videoTrack != null) {
            EglBase.Context rootEglBaseContext = EglUtils.getRootEglBaseContext();
            if (rootEglBaseContext == null) {
                Log.e("FlutterWebRTCPlugin", "Failed to render a VideoTrack!");
                return;
            }
            this.surfaceTextureRenderer.release();
            listenRendererEvents();
            this.surfaceTextureRenderer.init(rootEglBaseContext, this.rendererEvents);
            this.surfaceTextureRenderer.surfaceCreated(this.producer);
            this.videoTrack.addSink(this.surfaceTextureRenderer);
        }
    }

    public void Dispose() {
        SurfaceTextureRenderer surfaceTextureRenderer = this.surfaceTextureRenderer;
        if (surfaceTextureRenderer != null) {
            surfaceTextureRenderer.release();
        }
        afo afoVar = this.eventChannel;
        if (afoVar != null) {
            afoVar.a(null);
        }
        this.eventSink = null;
        this.producer.release();
    }

    public boolean checkMediaStream(String str, String str2) {
        if (str == null || this.mediaStream == null || str2 == null || !str2.equals(this.ownerTag)) {
            return false;
        }
        return str.equals(this.mediaStream.getId());
    }

    public boolean checkVideoTrack(String str, String str2) {
        if (str == null || this.videoTrack == null || str2 == null || !str2.equals(this.ownerTag)) {
            return false;
        }
        return str.equals(this.videoTrack.id());
    }

    @Override // defpackage.zeo
    public void onCancel(Object obj) {
        this.eventSink = null;
    }

    @Override // defpackage.zeo
    public void onListen(Object obj, xeo xeoVar) {
        this.eventSink = new AnyThreadSink(xeoVar);
    }

    public void setEventChannel(afo afoVar) {
        this.eventChannel = afoVar;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setStream(MediaStream mediaStream, String str, String str2) {
        this.mediaStream = mediaStream;
        this.ownerTag = str2;
        if (mediaStream != null) {
            List<VideoTrack> list = mediaStream.videoTracks;
            r5 = list.isEmpty() ? null : list.get(0);
            for (VideoTrack videoTrack : list) {
                if (videoTrack.id().equals(str)) {
                    r5 = videoTrack;
                }
            }
        }
        setVideoTrack(r5);
    }

    public void setVideoTrack(VideoTrack videoTrack) {
        VideoTrack videoTrack2 = this.videoTrack;
        if (videoTrack2 != videoTrack) {
            if (videoTrack2 != null) {
                removeRendererFromVideoTrack();
            }
            this.videoTrack = videoTrack;
            if (videoTrack != null) {
                try {
                    videoTrack.id();
                    tryAddRendererToVideoTrack();
                } catch (Exception e) {
                    Log.e("FlutterWebRTCPlugin", "tryAddRendererToVideoTrack " + e);
                }
            }
        }
    }

    public void setStream(MediaStream mediaStream, String str) {
        this.mediaStream = mediaStream;
        this.ownerTag = str;
        VideoTrack videoTrack = null;
        if (mediaStream != null) {
            List<VideoTrack> list = mediaStream.videoTracks;
            if (!list.isEmpty()) {
                videoTrack = list.get(0);
            }
        }
        setVideoTrack(videoTrack);
    }
}
