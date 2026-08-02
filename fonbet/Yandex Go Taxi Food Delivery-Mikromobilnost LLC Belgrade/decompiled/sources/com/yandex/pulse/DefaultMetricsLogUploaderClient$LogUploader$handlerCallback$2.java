package com.yandex.pulse;

import android.os.Message;
import com.yandex.pulse.DefaultMetricsLogUploaderClient;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class DefaultMetricsLogUploaderClient$LogUploader$handlerCallback$2 extends FunctionReferenceImpl implements tls {
    public final void i(Message message) {
        DefaultMetricsLogUploaderClient.LogUploader logUploader = (DefaultMetricsLogUploaderClient.LogUploader) this.receiver;
        DefaultMetricsLogUploaderClient.LogUploader.Companion companion = DefaultMetricsLogUploaderClient.LogUploader.h;
        logUploader.b(message);
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((Message) obj);
        return zy11.a;
    }
}
