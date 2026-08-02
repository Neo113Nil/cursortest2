package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class os1 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ os1(int i, jai jaiVar) {
        this.c = i;
        this.d = jaiVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).intValue();
                ((us1) this.d).c(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                jai jaiVar = (jai) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(247188153, intValue, -1, "com.vk.core.compose.component.cell.button.group.VkCellButtonGroup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkCellButtonGroup.kt:81)");
                    }
                    int i = this.c - 1;
                    for (int i2 = 0; i2 < i; i2++) {
                        jaiVar.invoke(aVar, 6);
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ os1(us1 us1Var, int i) {
        this.d = us1Var;
        this.c = i;
    }
}
