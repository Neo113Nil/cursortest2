package ru.ok.android.externcalls.sdk.stereo;

import io.reactivex.rxjava3.core.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.izs;
import xsna.s3q0;

/* compiled from: StereoRoomManagerAdapters.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class StereoRoomManagerAdaptersKt$revokePromotion$1$2 extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
    public StereoRoomManagerAdaptersKt$revokePromotion$1$2(Object obj) {
        super(1, obj, b.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
        invoke2(th);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        ((b) this.receiver).onError(th);
    }
}
