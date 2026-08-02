package xsna;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import com.vk.community.design.view.avatar.CommunityProfileAvatarViewContainer;
import com.vk.community.tool.view.header.actionbuttons.OnMeasureCustomActionsView;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vk.profile.design.view.ProfileTitleText;
import com.vkontakte.android.R;
import org.chromium.net.NetError;
import xsna.j8h;
import xsna.xrh;

/* compiled from: CommunityBaseLiveCoverHeaderItem.kt */
/* loaded from: classes5.dex */
public abstract class qsg extends we6 {
    public final l3h g;
    public final gpg h;
    public final h7v i;
    public final xrh.d j;
    public final j8h.a k;
    public final izs<View, s3q0> l;
    public final int m = NetError.ERR_CERT_COMMON_NAME_INVALID;

    /* compiled from: CommunityBaseLiveCoverHeaderItem.kt */
    public interface a {
        void a();

        void b();

        void c(String str, View view, boolean z);

        void d();

        void e();

        void f();

        void g(boolean z);

        void h();

        void j(View view, CommunityActionTags communityActionTags);

        void k();

        void l();
    }

    /* compiled from: CommunityBaseLiveCoverHeaderItem.kt */
    public static class b<T extends qsg> extends vif0<T> {
        public final CommunityProfileAvatarViewContainer n;
        public final ProfileTitleText o;
        public final b3h p;
        public final LinearLayout q;
        public final VkContentBadge r;
        public final VkContentBadge s;
        public final ksg t;
        public final t3i u;
        public final jpg v;

        public b(View view, String str, j8h.a aVar, h7v h7vVar, Lifecycle lifecycle, f5z f5zVar, izs izsVar, wvw wvwVar) {
            super(view);
            CommunityProfileAvatarViewContainer communityProfileAvatarViewContainer = (CommunityProfileAvatarViewContainer) this.itemView.findViewById(R.id.community_avatar);
            this.n = communityProfileAvatarViewContainer;
            this.o = (ProfileTitleText) this.itemView.findViewById(R.id.community_live_cover_title);
            this.p = new b3h((OnMeasureCustomActionsView) this.itemView.findViewById(R.id.community_live_cover_action_buttons), wvwVar);
            this.q = (LinearLayout) this.itemView.findViewById(R.id.reviews_ll);
            this.r = (VkContentBadge) this.itemView.findViewById(R.id.community_header_age_mark);
            TextView textView = (TextView) this.itemView.findViewById(R.id.liveCoverVerifyBcs);
            VkContentBadge vkContentBadge = (VkContentBadge) this.itemView.findViewById(R.id.community_header_a_plus);
            this.s = vkContentBadge;
            this.t = new ksg(str, h7vVar, new usg(0, aVar, a.class, "avatarClick", "avatarClick()V", 0), new vsg(0, aVar, a.class, "createStory", "createStory()V", 0), new wsg(3, aVar, a.class, "openStories", "openStories(Landroid/view/View;Ljava/lang/String;Z)V", 0), new xsg(1, aVar, a.class, "openProfilePhotos", "openProfilePhotos(Z)V", 0), new ysg(0, aVar, a.class, "changeProfilePhoto", "changeProfilePhoto()V", 0), lifecycle, f5zVar);
            this.u = new t3i();
            this.v = new jpg(h7vVar, izsVar);
            CardView cardView = (CardView) this.itemView;
            cardView.setOutlineProvider(new rsg(cardView));
            communityProfileAvatarViewContainer.setSolidFillColor(R.color.vk_white);
            textView.setOnClickListener(new hn2(this, 2));
            iut0.q(vkContentBadge, new hnu0());
        }
    }

    public qsg(l3h l3hVar, gpg gpgVar, h7v h7vVar, xrh.d dVar, j8h.a aVar, izs izsVar) {
        this.g = l3hVar;
        this.h = gpgVar;
        this.i = h7vVar;
        this.j = dVar;
        this.k = aVar;
        this.l = izsVar;
    }

    @Override // xsna.we6
    public int h() {
        return this.m;
    }
}
