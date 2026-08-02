package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.em20;
import xsna.tlo0;

/* compiled from: MidscreenBannerViewHolder.kt */
/* loaded from: classes18.dex */
public final class gm20 extends vfz<em20> {
    public final a l;
    public final VkPlaceholder m;
    public final ulj n;

    /* compiled from: MidscreenBannerViewHolder.kt */
    public interface a {
        void C();

        void e();

        void m();
    }

    public gm20(ViewGroup viewGroup, a aVar) {
        super(R.layout.vh_midscreen_banner, viewGroup);
        this.l = aVar;
        this.m = (VkPlaceholder) this.itemView.findViewById(R.id.midscreen_placeholder);
        this.n = new ulj();
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(em20 em20Var) {
        em20 em20Var2 = em20Var;
        ulj uljVar = this.n;
        View view = uljVar.a;
        VkPlaceholder vkPlaceholder = this.m;
        if (view == null) {
            View view2 = this.itemView;
            tlj tljVar = uljVar.e;
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnDrawListener(tljVar);
                }
                uljVar.a = null;
                uljVar.b = null;
            }
            uljVar.a = view2;
            uljVar.b = vkPlaceholder;
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            if (viewTreeObserver2 != null) {
                viewTreeObserver2.addOnDrawListener(tljVar);
            }
            uljVar.c.setEmpty();
        }
        int i = 14;
        int i2 = 2;
        if (em20Var2 instanceof em20.a) {
            vkPlaceholder.setMode(VkPlaceholder.Mode.Primary);
            vkPlaceholder.setWithVerticalPaddings(true);
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_illustration_messenger_users_book_120h), new b8g(0), null, 12));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(i2, tq.h(tlo0.Companion, R.string.vkim_onboarding_friends_title)), new VkPlaceholder.b.C0859b(i, new tlo0.f(R.string.vkim_onboarding_friends_subtitle))));
            VkPlaceholder.a.C0857a.C0858a c0858a = null;
            VkPlaceholder.a.C0857a.C0858a c0858a2 = null;
            VkPlaceholder.a.C0857a c0857a = null;
            vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vkim_onboarding_friends_sync_contacts), (gzs) new fm20(this, 0), c0858a, c0858a2, VkButton.Size.Small, VkButton.Mode.Primary, VkButton.Appearance.Accent, false, 284), c0857a, c0857a, null, 8));
            return;
        }
        if (em20Var2 instanceof em20.b) {
            vkPlaceholder.setMode(VkPlaceholder.Mode.Primary);
            vkPlaceholder.setWithVerticalPaddings(true);
            vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_illustration_comments_share_120h), new b8g(0), null, 12));
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(i2, tq.h(tlo0.Companion, R.string.im_engine_info_bar_connect_edu_chats_title)), new VkPlaceholder.b.C0859b(i, new tlo0.f(R.string.im_engine_info_bar_connect_edu_chats_desc))));
            VkPlaceholder.a.C0857a.C0858a c0858a3 = null;
            VkPlaceholder.a.C0857a.C0858a c0858a4 = null;
            VkPlaceholder.a.C0857a c0857a2 = null;
            vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.im_engine_info_bar_connect_edu_chats_btn), (gzs) new m2j(this, 26), c0858a3, c0858a4, VkButton.Size.Small, VkButton.Mode.Primary, VkButton.Appearance.Accent, false, 284), c0857a2, c0857a2, null, 8));
            return;
        }
        if (!(em20Var2 instanceof em20.c)) {
            throw new NoWhenBranchMatchedException();
        }
        vkPlaceholder.setMode(VkPlaceholder.Mode.Primary);
        vkPlaceholder.setWithVerticalPaddings(true);
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_illustration_messenger_bubbles_120h), new b8g(0), null, 12));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(i2, tq.h(tlo0.Companion, R.string.vkim_empty_dialogs_list_title)), new VkPlaceholder.b.C0859b(i, new tlo0.f(R.string.vkim_empty_dialogs_list_description))));
        VkPlaceholder.a.C0857a.C0858a c0858a5 = null;
        VkPlaceholder.a.C0857a.C0858a c0858a6 = null;
        VkPlaceholder.a.C0857a c0857a3 = null;
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.vkim_create_chat), (gzs) new xsw(this, 8), c0858a5, c0858a6, VkButton.Size.Small, VkButton.Mode.Primary, VkButton.Appearance.Accent, false, 284), c0857a3, c0857a3, null, 8));
    }

    @Override // xsna.vfz
    public final void g6() {
        ViewTreeObserver viewTreeObserver;
        ulj uljVar = this.n;
        View view = uljVar.a;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnDrawListener(uljVar.e);
        }
        uljVar.a = null;
        uljVar.b = null;
    }
}
