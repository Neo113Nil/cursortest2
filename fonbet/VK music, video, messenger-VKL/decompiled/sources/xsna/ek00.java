package xsna;

import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ek00 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                r7t r7tVar = (r7t) obj2;
                if (this.c) {
                    return new Pair(num, r7tVar.n);
                }
                return "notification_section_" + r7tVar.hashCode() + '_' + intValue;
            default:
                ((Integer) obj2).getClass();
                jiv0.c(this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ ek00(boolean z, int i) {
        this.c = z;
    }
}
