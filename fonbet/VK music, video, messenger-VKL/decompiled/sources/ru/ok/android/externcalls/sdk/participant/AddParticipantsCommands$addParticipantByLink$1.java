package ru.ok.android.externcalls.sdk.participant;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.utils.Consumer;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AddParticipantsCommands.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class AddParticipantsCommands$addParticipantByLink$1 extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
    public AddParticipantsCommands$addParticipantByLink$1(Object obj) {
        super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    @Override // xsna.izs
    public /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
        invoke2(th);
        return s3q0.a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        ((Consumer) this.receiver).accept(th);
    }
}
