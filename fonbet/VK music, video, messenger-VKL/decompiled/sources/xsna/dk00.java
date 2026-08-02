package xsna;

import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dk00 implements wzs {
    public final /* synthetic */ boolean b;

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        s90 s90Var = (s90) obj2;
        if (this.b) {
            return new Pair(num, s90Var.k);
        }
        return "activity_section_" + s90Var.hashCode() + '_' + intValue;
    }
}
