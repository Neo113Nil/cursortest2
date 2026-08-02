package ru.ok.proto.okmp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes9.dex */
public class OkmpHandler extends Handler {
    private static final String LOG_TAG = "Publisher";
    private OkmpPublisherNative _publisher;

    public OkmpHandler(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        OkmpPublisherNative okmpPublisherNative = this._publisher;
        if (okmpPublisherNative != null) {
            okmpPublisherNative.handleMessage(message.what);
        }
    }

    public boolean isAlive() {
        return true;
    }

    public void post(int i) {
        sendEmptyMessage(i);
    }

    public void postDelayed(int i, long j) {
        sendEmptyMessageDelayed(i, j);
    }

    public void setPublisher(OkmpPublisherNative okmpPublisherNative) {
        this._publisher = okmpPublisherNative;
    }
}
