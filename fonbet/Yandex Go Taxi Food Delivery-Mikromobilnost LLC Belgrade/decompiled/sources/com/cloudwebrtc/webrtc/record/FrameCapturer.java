package com.cloudwebrtc.webrtc.record;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Handler;
import android.os.Looper;
import defpackage.da20;
import defpackage.ejp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import org.webrtc.YuvHelper;

/* loaded from: classes10.dex */
public class FrameCapturer implements VideoSink {
    private final da20 callback;
    private File file;
    private boolean gotFrame = false;
    private final VideoTrack videoTrack;

    public FrameCapturer(VideoTrack videoTrack, File file, da20 da20Var) {
        this.videoTrack = videoTrack;
        this.file = file;
        this.callback = da20Var;
        videoTrack.addSink(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrame$0() {
        this.videoTrack.removeSink(this);
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.gotFrame) {
            return;
        }
        this.gotFrame = true;
        videoFrame.retain();
        VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
        ByteBuffer dataY = i420.getDataY();
        ByteBuffer dataU = i420.getDataU();
        ByteBuffer dataV = i420.getDataV();
        int width = i420.getWidth();
        int height = i420.getHeight();
        int[] iArr = {i420.getStrideY(), i420.getStrideU(), i420.getStrideV()};
        int i = (width * height) + (((width + 1) / 2) * ((height + 1) / 2) * 2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        YuvHelper.I420ToNV12(dataY, iArr[0], dataV, iArr[2], dataU, iArr[1], allocateDirect, width, height);
        YuvImage yuvImage = new YuvImage(Arrays.copyOfRange(allocateDirect.array(), allocateDirect.arrayOffset(), i), 17, width, height, null);
        i420.release();
        videoFrame.release();
        new Handler(Looper.getMainLooper()).post(new ejp(11, this));
        try {
            if (!this.file.exists()) {
                this.file.getParentFile().mkdirs();
                this.file.createNewFile();
            }
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.file);
                    try {
                        yuvImage.compressToJpeg(new Rect(0, 0, width, height), 100, fileOutputStream);
                        int rotation = videoFrame.getRotation();
                        if (rotation != 0) {
                            if (rotation != 90 && rotation != 180 && rotation != 270) {
                                throw new RuntimeException("Invalid rotation");
                            }
                            Bitmap decodeFile = BitmapFactory.decodeFile(this.file.toString());
                            Matrix matrix = new Matrix();
                            matrix.postRotate(videoFrame.getRotation());
                            Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true).compress(Bitmap.CompressFormat.JPEG, 100, new FileOutputStream(this.file));
                        }
                        this.callback.success(null);
                        fileOutputStream.close();
                    } finally {
                    }
                } finally {
                    this.file = null;
                }
            } catch (IOException e) {
                this.callback.error("IOException", e.getLocalizedMessage(), e);
            } catch (IllegalArgumentException e2) {
                this.callback.error("IllegalArgumentException", e2.getLocalizedMessage(), e2);
            }
        } catch (IOException e3) {
            this.callback.error("IOException", e3.getLocalizedMessage(), e3);
        }
    }
}
