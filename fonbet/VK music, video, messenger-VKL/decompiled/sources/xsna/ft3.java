package xsna;

import com.vk.core.compose.component.group.footer.GroupFooter;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView;
import xsna.b78;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ft3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ft3(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ((gt3) obj4).a((ksr) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(i2 | 1);
                fct.a(I, (androidx.compose.runtime.a) obj, (gzs) obj4, (q630) obj3);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((GroupFooter.Loader.a) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((kqv) obj4).b((psv0) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                int i3 = VideoProfileCreatorOnboardingItemsView.q;
                ((VideoProfileCreatorOnboardingItemsView) obj4).F((hbk0) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                x8u0.f((b78.g) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ft3(kqv kqvVar, psv0 psv0Var, int i) {
        this.b = 3;
        this.d = kqvVar;
        this.e = psv0Var;
        this.c = i;
    }
}
