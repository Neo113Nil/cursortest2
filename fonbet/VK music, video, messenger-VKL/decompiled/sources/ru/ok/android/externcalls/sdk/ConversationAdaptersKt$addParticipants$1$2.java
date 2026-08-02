package ru.ok.android.externcalls.sdk;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ConversationAdapters.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class ConversationAdaptersKt$addParticipants$1$2 extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
    public ConversationAdaptersKt$addParticipants$1$2(Object obj) {
        super(1, obj, io.reactivex.rxjava3.core.y.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
        invoke2(th);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        ((io.reactivex.rxjava3.core.y) this.receiver).onError(th);
    }
}
