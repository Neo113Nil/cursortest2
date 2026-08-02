package xsna;

import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import xsna.mhl;

/* compiled from: ClipsGridBlockBadgeContainer.kt */
/* loaded from: classes17.dex */
public final class wae {
    public final ClipBadge a;

    /* compiled from: ClipsGridBlockBadgeContainer.kt */
    public static final class a implements rzt0 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("BadgeImageContent(iconRes="), this.a, ')');
        }
    }

    /* compiled from: ClipsGridBlockBadgeContainer.kt */
    public static final class b implements rzt0 {
        public final tlo0 a;

        public b(tlo0 tlo0Var) {
            this.a = tlo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return bt.a(new StringBuilder("BadgeTextContent(textSource="), this.a, ')');
        }
    }

    public wae(ClipBadge clipBadge) {
        this.a = clipBadge;
        int f = l8g.f(0.7f, e3m.f(R.attr.vk_ui_background_contrast_inverse, clipBadge.getContext()));
        clipBadge.setAppearance(new ClipBadge.a.c(new b8g(f), new b8g(f)));
        clipBadge.setMode(ClipBadge.BadgeMode.STATIC_FADE_END);
        int i = 7;
        af2 af2Var = new af2(i);
        int i2 = 2;
        yg7 yg7Var = new yg7(clipBadge, i2);
        VKReplacerView a2 = clipBadge.a();
        mhl.a aVar = new mhl.a(new mhl(af2Var, yg7Var), a2.getContext());
        clipBadge.f = aVar;
        s3q0 s3q0Var = s3q0.a;
        a2.a(aVar.getView());
        vd1 vd1Var = new vd1(i);
        w69 w69Var = new w69(clipBadge, i2);
        VKReplacerView c = clipBadge.c();
        mhl.a aVar2 = new mhl.a(new mhl(vd1Var, w69Var), c.getContext());
        clipBadge.g = aVar2;
        c.a(aVar2.getView());
    }
}
