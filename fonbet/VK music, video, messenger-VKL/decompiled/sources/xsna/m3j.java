package xsna;

import androidx.compose.runtime.a;
import com.vk.profile.core.tabs.ui.fab.ProfileFabState;
import com.vk.profile.design.view.fab.ProfileFabView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class m3j implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m3j(int i, izs izsVar, q630 q630Var, boolean z) {
        this.d = q630Var;
        this.c = z;
        this.e = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                com.vk.ecomm.reviews.impl.communities.yclients.h.a(I, (androidx.compose.runtime.a) obj, (izs) obj3, (q630) obj4, this.c);
                break;
            default:
                ProfileFabState profileFabState = (ProfileFabState) obj4;
                ProfileFabView profileFabView = (ProfileFabView) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = ProfileFabView.r;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1357141568, intValue, -1, "com.vk.profile.design.view.fab.ProfileFabView.getNextTabPlaceable.<anonymous> (ProfileFabView.kt:231)");
                    }
                    boolean y = aVar.y(profileFabView);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new jsl(profileFabView, 3);
                        aVar.R(x);
                    }
                    gzs gzsVar = (gzs) ((fcy) x);
                    boolean y2 = aVar.y(profileFabView);
                    Object x2 = aVar.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new hrp(profileFabView);
                        aVar.R(x2);
                    }
                    mwd0.a(profileFabState, gzsVar, (gzs) ((fcy) x2), this.c, aVar, 0);
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

    public /* synthetic */ m3j(ProfileFabState profileFabState, ProfileFabView profileFabView, boolean z) {
        this.d = profileFabState;
        this.e = profileFabView;
        this.c = z;
    }
}
