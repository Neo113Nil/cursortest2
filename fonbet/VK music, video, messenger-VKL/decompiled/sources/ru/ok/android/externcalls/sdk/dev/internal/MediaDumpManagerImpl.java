package ru.ok.android.externcalls.sdk.dev.internal;

import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;
import org.webrtc.DumpCallback;
import org.webrtc.DumpSource;
import org.webrtc.NativeDumpCallback;
import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;
import ru.ok.android.externcalls.sdk.dev.internal.MediaDumpManagerImpl;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.c5g;
import xsna.iq;
import xsna.j5g;
import xsna.s3q0;

/* compiled from: MediaDumpManagerImpl.kt */
/* loaded from: classes9.dex */
public final class MediaDumpManagerImpl implements MediaDumpManager {
    private final Call call;
    private String dumpLocation;
    private final SignalingProvider signalingProvider;

    public MediaDumpManagerImpl(Call call, SignalingProvider signalingProvider) {
        this.call = call;
        this.signalingProvider = signalingProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestMediaDump$lambda$0(MediaDumpManager.RemoteMediaDumpRequestListener remoteMediaDumpRequestListener, JSONObject jSONObject) {
        if (!SignalingProtocol.isCollectDebugDumpResponse(jSONObject) || remoteMediaDumpRequestListener == null) {
            return;
        }
        remoteMediaDumpRequestListener.onRequestSent();
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public void cancelAudioDumpRecord() {
        this.call.cancelLocalAudioDump();
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public String recordAudioDump(int i, Set<? extends MediaDumpManager.Source> set, final MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener) {
        String str = this.dumpLocation;
        Set<DumpSource> set2 = null;
        if (str == null) {
            return null;
        }
        File file = new File(new File(str), iq.a(i, "calldump_", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime()), BundleUtil.UNDERLINE_TAG, UcumUtils.UCUM_SECONDS));
        try {
            if (file.exists() || file.mkdirs()) {
                Call call = this.call;
                String absolutePath = file.getAbsolutePath();
                if (set != null) {
                    Set<? extends MediaDumpManager.Source> set3 = set;
                    ArrayList arrayList = new ArrayList(c5g.u(set3, 10));
                    Iterator<T> it = set3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MediaDumpManager.Source) it.next()).getWebrtcDumpSource$calls_sdk_release());
                    }
                    set2 = j5g.S0(arrayList);
                }
                call.dumpLocalAudio(absolutePath, i, set2, new NativeDumpCallback(new DumpCallback() { // from class: ru.ok.android.externcalls.sdk.dev.internal.MediaDumpManagerImpl$recordAudioDump$1$2
                    @Override // org.webrtc.DumpCallback
                    public void onComplete(String str2) {
                        MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener2 = MediaDumpManager.LocalAudioDumpRecordListener.this;
                        if (localAudioDumpRecordListener2 != null) {
                            localAudioDumpRecordListener2.onRecordCompleted(str2);
                        }
                    }

                    @Override // org.webrtc.DumpCallback
                    public void onStarted(String str2) {
                        MediaDumpManager.LocalAudioDumpRecordListener localAudioDumpRecordListener2 = MediaDumpManager.LocalAudioDumpRecordListener.this;
                        if (localAudioDumpRecordListener2 != null) {
                            localAudioDumpRecordListener2.onRecordStarted(str2);
                        }
                    }
                }));
            }
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
        return file.getAbsolutePath();
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public void requestMediaDump(int i, boolean z, boolean z2, final MediaDumpManager.RemoteMediaDumpRequestListener remoteMediaDumpRequestListener) {
        Signaling signaling = this.signalingProvider.getSignaling();
        if (signaling == null) {
            return;
        }
        signaling.send(SignalingProtocol.createCollectDebugDump(z, z2, i), new Signaling.Listener() { // from class: xsna.sq10
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                MediaDumpManagerImpl.requestMediaDump$lambda$0(MediaDumpManager.RemoteMediaDumpRequestListener.this, jSONObject);
            }
        });
    }

    @Override // ru.ok.android.externcalls.sdk.dev.MediaDumpManager
    public void setLocalAudioDumpLocation(String str) {
        this.dumpLocation = str;
    }
}
