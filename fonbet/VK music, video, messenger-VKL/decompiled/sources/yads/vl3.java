package yads;

import kotlin.jvm.internal.Lambda;
import xsna.s3q0;
import xsna.wzs;

/* loaded from: classes10.dex */
public final class vl3 extends Lambda implements wzs {
    public final /* synthetic */ am3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl3(am3 am3Var) {
        super(2);
        this.b = am3Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (ul3.a[((z90) obj).ordinal()] == 1) {
            this.b.a.invoke(new c90(booleanValue));
        }
        return s3q0.a;
    }
}
