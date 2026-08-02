package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gmf0 implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ izs c;
    public final /* synthetic */ q630 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ gmf0(RedesignedClipsTopBar redesignedClipsTopBar, List list, int i, q630 q630Var, izs izsVar, int i2) {
        this.g = redesignedClipsTopBar;
        this.h = list;
        this.e = i;
        this.d = q630Var;
        this.c = izsVar;
        this.f = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                ((Integer) obj2).getClass();
                int i2 = RedesignedClipsTopBar.N;
                ((RedesignedClipsTopBar) obj4).H((List) obj3, this.e, this.d, this.c, aVar, ne7.I(this.f | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.e | 1);
                izs izsVar = this.c;
                q630 q630Var = this.d;
                twu0.d(izsVar, (af90) obj4, q630Var, (gzs) obj3, (androidx.compose.runtime.a) obj, I, this.f);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ gmf0(izs izsVar, af90 af90Var, q630 q630Var, gzs gzsVar, int i, int i2) {
        this.c = izsVar;
        this.g = af90Var;
        this.d = q630Var;
        this.h = gzsVar;
        this.e = i;
        this.f = i2;
    }
}
