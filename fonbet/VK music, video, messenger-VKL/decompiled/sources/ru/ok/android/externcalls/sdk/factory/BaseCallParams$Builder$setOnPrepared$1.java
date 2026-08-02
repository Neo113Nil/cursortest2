package ru.ok.android.externcalls.sdk.factory;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.izs;
import xsna.s3q0;

/* compiled from: BaseCallParams.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class BaseCallParams$Builder$setOnPrepared$1 extends FunctionReferenceImpl implements izs<Conversation, s3q0> {
    public BaseCallParams$Builder$setOnPrepared$1(Object obj) {
        super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(Conversation conversation) {
        invoke2(conversation);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Conversation conversation) {
        ((Consumer) this.receiver).accept(conversation);
    }
}
