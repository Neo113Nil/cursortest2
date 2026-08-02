package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ipi;
import xsna.tlo0;

/* compiled from: SitpostingHolder.kt */
/* loaded from: classes4.dex */
public final class swj0 extends rp6<twj0, NewsEntry> {
    public final VkBanner E;

    /* compiled from: SitpostingHolder.kt */
    public interface a {

        /* compiled from: SitpostingHolder.kt */
        /* renamed from: xsna.swj0$a$a, reason: collision with other inner class name */
        public static final class C3696a implements a {
            public static final C3696a a = new C3696a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3696a);
            }

            public final int hashCode() {
                return 1483331618;
            }

            public final String toString() {
                return "Action";
            }
        }

        /* compiled from: SitpostingHolder.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 604149388;
            }

            public final String toString() {
                return "Close";
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public swj0(ViewGroup viewGroup) {
        super(r0, viewGroup);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        VkBanner vkBanner = new VkBanner(viewGroup.getContext(), null, 6);
        this.E = vkBanner;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setPadding(cn70.b(12), cn70.b(12), cn70.b(12), cn70.b(12));
        frameLayout.removeAllViews();
        frameLayout.addView(vkBanner);
    }

    @Override // xsna.rp6
    public final void R6(twj0 twj0Var) {
        String str;
        twj0 twj0Var2 = twj0Var;
        this.C = twj0Var2;
        if (dhr0.C().b || (str = twj0Var2.k) == null) {
            str = twj0Var2.j;
        }
        CharSequence charSequence = twj0Var2.h;
        CharSequence charSequence2 = twj0Var2.i;
        VkBanner vkBanner = this.E;
        vkBanner.setBackgroundColor(new b8g(e3m.f(R.attr.vk_ui_background_info_tint, vkBanner.getContext())));
        if (str != null) {
            vkBanner.setBackgroundImage(new vlw(str, null));
        }
        tlo0.h f = charSequence != null ? u11.f(tlo0.Companion, charSequence) : null;
        String str2 = twj0Var2.s.q;
        vkBanner.setMiddle(new VkBanner.e(f, str2 != null ? oq.d(tlo0.Companion, str2) : null, null, new VkBanner.c(charSequence2 != null ? u11.f(tlo0.Companion, charSequence2) : null, new stg0(this, 6), VkButton.Mode.Primary, VkButton.Appearance.Accent, VkButton.Size.Small, null, null, 992), null, null, 116));
        vkBanner.setAfter(new VkBanner.a.b(new yei0(this, 3), null, null, new VkBanner.a.b.C0805a(new gko(R.drawable.vk_icon_dismiss_dark_24), ipi.a.a), 6));
    }

    public final void b7(a aVar) {
        SituationalSuggest situationalSuggest;
        twj0 twj0Var = (twj0) this.C;
        if (twj0Var == null || (situationalSuggest = twj0Var.s) == null || jjc.b()) {
            return;
        }
        if (epx.f(aVar, a.C3696a.a)) {
            this.D.sa(new NewsfeedExternalAction.Navigation.t(situationalSuggest));
            this.D.sa(new fi60(situationalSuggest));
        } else {
            if (!epx.f(aVar, a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.D.sa(new fi60(situationalSuggest));
        }
    }
}
