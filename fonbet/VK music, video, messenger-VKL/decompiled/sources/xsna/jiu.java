package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GroupCallParticipantView.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class jiu extends FunctionReferenceImpl implements wzs<Integer, Integer, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(Integer num, Integer num2) {
        num.intValue();
        num2.intValue();
        giu giuVar = (giu) this.receiver;
        if (giuVar.R) {
            giuVar.R = false;
            giuVar.post(new yn2(giuVar, 5));
        }
        return s3q0.a;
    }
}
