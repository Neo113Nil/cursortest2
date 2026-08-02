package com.yandex.pulse;

import android.os.Message;
import android.util.Log;
import com.yandex.pulse.DefaultMetricsLogUploaderClient;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class DefaultMetricsLogUploaderClient$LogUploader$handlerCallback$1 extends FunctionReferenceImpl implements tls {
    public DefaultMetricsLogUploaderClient$LogUploader$handlerCallback$1(Object obj) {
        super(1, obj, DefaultMetricsLogUploaderClient.LogUploader.class, "onUploadCompleteWithLogging", "onUploadCompleteWithLogging(Landroid/os/Message;)V", 0);
    }

    public final void i(Message message) {
        DefaultMetricsLogUploaderClient.LogUploader logUploader = (DefaultMetricsLogUploaderClient.LogUploader) this.receiver;
        DefaultMetricsLogUploaderClient.LogUploader.Companion companion = DefaultMetricsLogUploaderClient.LogUploader.h;
        logUploader.getClass();
        Log.i("Pulse", "Histograms sent, code " + message.arg1);
        logUploader.b(message);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Message) obj);
        return zy11.a;
    }
}
