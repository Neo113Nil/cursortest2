package xsna;

import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import xsna.uum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class mrx implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mrx(krx krxVar, u7p0 u7p0Var, q630 q630Var, izs izsVar, int i) {
        this.d = krxVar;
        this.e = u7p0Var;
        this.c = q630Var;
        this.f = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                nrx.b((krx) this.d, (u7p0) this.e, this.c, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(9));
                break;
            default:
                uum0.c cVar = (uum0.c) this.d;
                SubnavigationButtonMode subnavigationButtonMode = (SubnavigationButtonMode) this.e;
                SubnavigationBarAppearance subnavigationBarAppearance = (SubnavigationBarAppearance) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1154441055, intValue, -1, "com.vk.core.compose.component.subnavigation.SubnavigationButton.Right.IconWithContent.Content.<anonymous> (SubnavigationButton.kt:98)");
                    }
                    cVar.b(0, aVar, subnavigationBarAppearance, subnavigationButtonMode, this.c);
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

    public /* synthetic */ mrx(uum0.c cVar, SubnavigationButtonMode subnavigationButtonMode, SubnavigationBarAppearance subnavigationBarAppearance, q630 q630Var) {
        this.d = cVar;
        this.e = subnavigationButtonMode;
        this.f = subnavigationBarAppearance;
        this.c = q630Var;
    }
}
