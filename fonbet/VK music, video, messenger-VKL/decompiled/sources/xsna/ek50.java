package xsna;

/* compiled from: MviComposeComponent.kt */
/* loaded from: classes3.dex */
public final class ek50 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ dk50<mm50<?, ?, ?>> b;
    public final /* synthetic */ mm50<?, ?, ?> c;

    public ek50(dk50<mm50<?, ?, ?>> dk50Var, mm50<?, ?, ?> mm50Var) {
        this.b = dk50Var;
        this.c = mm50Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1574693276, intValue, -1, "com.vk.mvi.component.MviComposeComponent.render.<anonymous>.<anonymous>.<anonymous> (MviComposeComponent.kt:23)");
            }
            this.b.b(this.c, aVar2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
