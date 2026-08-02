package ru.ok.android.webrtc.mediarecord;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements izs {
    public a(VideoRecord videoRecord) {
        super(1, videoRecord, VideoRecord.class, "logBufferTransform", "logBufferTransform(Ljava/lang/String;)V", 0);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ((VideoRecord) this.receiver).getLog().log(VideoRecord.LOG_TAG_TRANSFORM, (String) obj);
        return s3q0.a;
    }
}
