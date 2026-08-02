package xsna;

import com.vk.core.compose.component.defaults.SubnavigationBarAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import xsna.uum0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class nga implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nga(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((rga) this.d).b((sga) this.e, (izs) this.f, (jai) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                uum0.b bVar = (uum0.b) this.d;
                q630 q630Var = (q630) this.e;
                SubnavigationButtonMode subnavigationButtonMode = (SubnavigationButtonMode) this.f;
                SubnavigationBarAppearance subnavigationBarAppearance = (SubnavigationBarAppearance) this.g;
                ((Integer) obj2).intValue();
                bVar.a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, subnavigationBarAppearance, subnavigationButtonMode, q630Var);
                break;
        }
        return s3q0.a;
    }
}
