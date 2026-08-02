package xsna;

import com.vk.profile.core.tabs.ui.fab.ProfileFabState;
import com.vk.profile.design.view.fab.ProfileFabView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fkb0 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ fkb0(ProfileFabView profileFabView, ProfileFabState profileFabState, boolean z, ProfileFabState profileFabState2, boolean z2, float f, boolean z3, int i) {
        this.g = profileFabView;
        this.h = profileFabState;
        this.c = z;
        this.i = profileFabState2;
        this.d = z2;
        this.e = f;
        this.f = z3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(3073);
                vkb0.a((izs) obj5, (x17) obj4, this.c, (wh50) obj3, this.e, this.d, this.f, (androidx.compose.runtime.a) obj, I);
                break;
            default:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                ((Integer) obj2).getClass();
                int i2 = ProfileFabView.r;
                int I2 = ne7.I(2293761);
                ((ProfileFabView) obj5).G((ProfileFabState) obj4, this.c, (ProfileFabState) obj3, this.d, this.e, this.f, aVar, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ fkb0(izs izsVar, x17 x17Var, boolean z, wh50 wh50Var, float f, boolean z2, boolean z3, int i) {
        this.g = izsVar;
        this.h = x17Var;
        this.c = z;
        this.i = wh50Var;
        this.e = f;
        this.d = z2;
        this.f = z3;
    }
}
