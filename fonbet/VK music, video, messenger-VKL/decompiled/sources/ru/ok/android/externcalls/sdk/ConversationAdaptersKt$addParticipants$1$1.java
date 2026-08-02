package ru.ok.android.externcalls.sdk;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.participant.add.AddParticipantsResult;
import xsna.izs;
import xsna.s3q0;

/* compiled from: ConversationAdapters.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class ConversationAdaptersKt$addParticipants$1$1 extends FunctionReferenceImpl implements izs<AddParticipantsResult, s3q0> {
    public ConversationAdaptersKt$addParticipants$1$1(Object obj) {
        super(1, obj, io.reactivex.rxjava3.core.y.class, "onSuccess", "onSuccess(Ljava/lang/Object;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(AddParticipantsResult addParticipantsResult) {
        invoke2(addParticipantsResult);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddParticipantsResult addParticipantsResult) {
        ((io.reactivex.rxjava3.core.y) this.receiver).onSuccess(addParticipantsResult);
    }
}
