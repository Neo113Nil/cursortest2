package xsna;

import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import java.util.List;
import xsna.uum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class s5c implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s5c(l5c l5cVar, x1x x1xVar, izs izsVar, q630 q630Var, int i) {
        this.e = l5cVar;
        this.f = x1xVar;
        this.d = izsVar;
        this.g = q630Var;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                u5c.a((l5c) this.e, (x1x) this.f, (izs) this.d, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(32769);
                ((nye) this.e).g((mc90) this.f, (List) this.g, this.c, (izs) this.d, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                uum0.c cVar = (uum0.c) this.e;
                q630 q630Var = (q630) this.g;
                SubnavigationButtonMode subnavigationButtonMode = (SubnavigationButtonMode) this.f;
                SubnavigationBarAppearance subnavigationBarAppearance = (SubnavigationBarAppearance) this.d;
                ((Integer) obj2).intValue();
                cVar.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, subnavigationBarAppearance, subnavigationButtonMode, q630Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ s5c(nye nyeVar, mc90 mc90Var, List list, int i, izs izsVar, int i2) {
        this.e = nyeVar;
        this.f = mc90Var;
        this.g = list;
        this.c = i;
        this.d = izsVar;
    }

    public /* synthetic */ s5c(uum0.c cVar, q630 q630Var, SubnavigationButtonMode subnavigationButtonMode, SubnavigationBarAppearance subnavigationBarAppearance, int i) {
        this.e = cVar;
        this.g = q630Var;
        this.f = subnavigationButtonMode;
        this.d = subnavigationBarAppearance;
        this.c = i;
    }
}
