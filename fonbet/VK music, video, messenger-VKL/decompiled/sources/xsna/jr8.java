package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jr8 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jr8(hkr0 hkr0Var, String str, boolean z, rv5 rv5Var, int i) {
        this.d = hkr0Var;
        this.e = str;
        this.c = z;
        this.f = rv5Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                nr8.a((hkr0) this.d, (String) this.e, this.c, (rv5) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                squ0 squ0Var = (squ0) this.d;
                buw buwVar = (buw) this.e;
                jai jaiVar = (jai) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1327393682, intValue, -1, "com.vk.core.compose.theme.LegoSupportedVkTheme.<anonymous> (VkTheme.kt:135)");
                    }
                    rrv0.e(this.c, null, null, null, squ0Var, buwVar, jaiVar, aVar, 0, 0);
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

    public /* synthetic */ jr8(boolean z, squ0 squ0Var, buw buwVar, jai jaiVar) {
        this.c = z;
        this.d = squ0Var;
        this.e = buwVar;
        this.f = jaiVar;
    }
}
