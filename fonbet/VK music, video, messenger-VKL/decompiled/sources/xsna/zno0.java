package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TextWithChipsHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class zno0 extends FunctionReferenceImpl implements izs<Integer, Boolean> {
    @Override // xsna.izs
    public final Boolean invoke(Integer num) {
        boolean z;
        int intValue = num.intValue();
        xno0 xno0Var = (xno0) this.receiver;
        xno0Var.getClass();
        try {
            z = xno0Var.c.onTextContextMenuItem(intValue);
        } catch (Exception unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
