package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class gb10 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gb10(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                ddr ddrVar = (ddr) obj2;
                int i = 0;
                int i2 = 3;
                int i3 = 0;
                return ((hb10) this.c).a.a(((kr80) this.d).a, (dz00) obj, (izs) obj3, new g3b(i3, ddrVar, ddr.class, "onDismiss", "onDismiss()V", i, i2), new yte(1, ddrVar, ddr.class, "onKeyPressed", "onKeyPressed(I)Z", 0, 6), new a23(i3, ddrVar, ddr.class, "onCancel", "onCancel()V", i, i2));
            default:
                m5i0 m5i0Var = (m5i0) this.c;
                Integer num = (Integer) this.d;
                qow qowVar = (qow) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(qowVar.a) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1999989071, intValue, -1, "com.vk.core.compose.component.VkSegmentedControl.<anonymous>.<anonymous> (VkSegmentedControl.kt:95)");
                    }
                    pqo pqoVar = hfj.a;
                    m5i0Var.getClass();
                    rvi.a(pqoVar.b(Float.valueOf(m5i0.a(aVar))), kai.c(-1002161679, new wo7(num, qowVar, m5i0Var, 6), aVar), aVar, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
        }
    }
}
