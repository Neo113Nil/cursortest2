package xsna;

import com.vk.core.compose.component.datetime.DateTimePickerState;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class a71 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a71(com.vk.core.compose.component.topbar.a aVar, int i) {
        this.b = 0;
        this.d = aVar;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((com.vk.core.compose.component.topbar.a) this.d).a(q630.a.a, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                qb90 qb90Var = (qb90) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1142237095, intValue, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:221)");
                    }
                    p8v l = qb90Var.b.l();
                    int i = this.c;
                    nox b = l.b(i);
                    ((jb90) b.c).b.invoke(yb90.a, Integer.valueOf(i - b.a), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((plo0) this.d).p(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                com.vk.core.compose.component.datetime.p.c((DateTimePickerState) this.d, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ a71(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }
}
