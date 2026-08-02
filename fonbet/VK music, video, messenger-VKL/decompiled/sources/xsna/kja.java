package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kja implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ xzs f;

    public /* synthetic */ kja(int i, String str, String str2, gzs gzsVar, q630 q630Var) {
        this.c = str;
        this.d = str2;
        this.e = q630Var;
        this.f = gzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                q630 q630Var = (q630) this.e;
                gzs gzsVar = (gzs) this.f;
                ((Integer) obj2).getClass();
                lja.a(ne7.I(1), (androidx.compose.runtime.a) obj, this.c, this.d, gzsVar, q630Var);
                break;
            default:
                SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) this.e;
                SemanticsConfiguration semanticsConfiguration2 = (SemanticsConfiguration) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(204317775, intValue, -1, "com.vk.core.compose.component.VkAlertNew.<anonymous> (VkAlertNew.kt:43)");
                    }
                    String str = this.c;
                    if (str != null) {
                        aVar.K(862212586);
                        t7u0.c(str, semanticsConfiguration, aVar, 0);
                    } else {
                        aVar.K(860547731);
                    }
                    aVar.j();
                    String str2 = this.d;
                    if (str2 != null) {
                        aVar.K(862355000);
                        t7u0.b(str2, semanticsConfiguration2, aVar, 0);
                    } else {
                        aVar.K(860547731);
                    }
                    aVar.j();
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

    public /* synthetic */ kja(String str, SemanticsConfiguration semanticsConfiguration, String str2, SemanticsConfiguration semanticsConfiguration2) {
        this.c = str;
        this.e = semanticsConfiguration;
        this.d = str2;
        this.f = semanticsConfiguration2;
    }
}
