package xsna;

import com.vk.clips.viewer.impl.feed.wrapper.ui.topbar.RedesignedClipsTopBar;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class am20 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ am20(RedesignedClipsTopBar redesignedClipsTopBar, String str, boolean z, q630 q630Var, gzs gzsVar, int i) {
        this.e = redesignedClipsTopBar;
        this.f = str;
        this.c = z;
        this.g = q630Var;
        this.h = gzsVar;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = this.d;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ContentBadgeSize contentBadgeSize = (ContentBadgeSize) obj3;
                ((Integer) obj2).getClass();
                int I = ne7.I(i2 | 1);
                ((bm20) obj6).a(I, (androidx.compose.runtime.a) obj, (ContentBadgeAppearance) obj5, (ContentBadgeMode) obj4, contentBadgeSize, this.c);
                break;
            default:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                ((Integer) obj2).getClass();
                int i3 = RedesignedClipsTopBar.N;
                int I2 = ne7.I(i2 | 1);
                ((RedesignedClipsTopBar) obj6).G(I2, aVar, (String) obj5, (gzs) obj3, (q630) obj4, this.c);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ am20(bm20 bm20Var, ContentBadgeAppearance contentBadgeAppearance, ContentBadgeMode contentBadgeMode, ContentBadgeSize contentBadgeSize, boolean z, int i) {
        this.e = bm20Var;
        this.f = contentBadgeAppearance;
        this.g = contentBadgeMode;
        this.h = contentBadgeSize;
        this.c = z;
        this.d = i;
    }
}
