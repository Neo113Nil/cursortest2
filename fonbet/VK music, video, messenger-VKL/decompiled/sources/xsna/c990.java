package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.ui.fave.FaveTagViewGroup;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.Platform;
import com.vk.dto.user.VisibleStatus;
import com.vk.fave.entities.FavePage;
import com.vk.fave.entities.FaveSource;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.api.StoryViewerRouter;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cq5;
import xsna.e3m;

/* compiled from: PageFullHolder.kt */
/* loaded from: classes18.dex */
public final class c990 extends vif0<z990> {
    public static final /* synthetic */ int x = 0;
    public final FaveSource n;
    public final StoryViewerRouter o;
    public final VKAvatarView p;
    public final ImageView q;
    public final ImageView r;
    public final TextView s;
    public final TextView t;
    public final FaveTagViewGroup u;
    public final View v;
    public final Object w;

    /* compiled from: PageFullHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<View, s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            c990 c990Var = (c990) this.receiver;
            int i = c990.x;
            xm60 xm60Var = new xm60(null, null, ((z990) c990Var.m).a, false, false, false, false, null, false, false, false, false, false, false, false, 130810);
            la60.e((la60) c990Var.w.getValue(), view, xm60Var, new o7(c990Var, 29), null, 24);
            return s3q0.a;
        }
    }

    /* compiled from: PageFullHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<View, s3q0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            View view2 = view;
            c990 c990Var = (c990) this.receiver;
            int i = c990.x;
            Owner owner = ((z990) c990Var.m).a.e;
            if (e3m.h(c990Var.itemView.getContext()) == null || owner == null || !owner.q) {
                c990Var.s6();
            } else {
                c990Var.o.l(view2, new StoryOwner.Owner(owner), MobileOfficialAppsConStoriesStat$ViewEntryPoint.AVATAR, MobileOfficialAppsCoreNavStat$EventScreen.FAVE, new b990(c990Var, 0));
            }
            return s3q0.a;
        }
    }

    public c990(ViewGroup viewGroup, FaveSource faveSource, StoryViewerRouter storyViewerRouter) {
        super(viewGroup, R.layout.page_full_holder, 0);
        this.n = faveSource;
        this.o = storyViewerRouter;
        VKAvatarView vKAvatarView = (VKAvatarView) this.itemView.findViewById(R.id.page_full_photo);
        this.p = vKAvatarView;
        this.q = (ImageView) this.itemView.findViewById(R.id.page_full_online_status);
        this.r = (ImageView) this.itemView.findViewById(R.id.verified);
        this.s = (TextView) this.itemView.findViewById(R.id.page_full_title);
        this.t = (TextView) this.itemView.findViewById(R.id.page_full_subtitle);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.iv_page_action);
        this.u = (FaveTagViewGroup) this.itemView.findViewById(R.id.page_full_tag_group);
        this.v = this.itemView.findViewById(R.id.iv_tag_icon);
        this.w = msy.a(LazyThreadSafetyMode.NONE, new kk1(17));
        bwt0.i0(imageView, new a(1, this, c990.class, "openMenu", "openMenu(Landroid/view/View;)V", 0));
        bwt0.i0(this.itemView, new yr00(this, 14));
        bwt0.j0(vKAvatarView, new b(1, this, c990.class, "showStories", "showStories(Landroid/view/View;)V", 0), 1000L);
    }

    public static CharSequence q6(String str, Pair pair) {
        int intValue;
        int intValue2;
        if (str == null) {
            return null;
        }
        if (pair == null || ((intValue = ((Number) pair.i()).intValue()) >= (intValue2 = ((Number) pair.j()).intValue()) && intValue2 - intValue >= str.length())) {
            return str;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new BackgroundColorSpan(676498380), intValue, intValue2, 0);
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    @Override // xsna.vif0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(z990 z990Var) {
        Drawable a2;
        VerifyInfo verifyInfo;
        z990 z990Var2 = z990Var;
        ViewGroup viewGroup = this.l;
        if (z990Var2 != null) {
            FavePage favePage = z990Var2.a;
            Owner owner = favePage.e;
            List<FaveTag> list = favePage.i;
            boolean z = owner != null && owner.q;
            VKAvatarView vKAvatarView = this.p;
            vKAvatarView.setAvatarBorderConfigParamsOverride(o9r0.a(vKAvatarView.getAvatarBorderConfigParamsOverride(), false, null, Float.valueOf(cn70.a() * (z ? 2.0f : 3.0f)), z ? com.vk.movika.sdk.base.model.n.a(10.0f) : null, null, null, null, null, false, 2035));
            vKAvatarView.setClickable(z);
            String string = b6().getString(R.string.fave_accessibility_story_at_avatar);
            if (!z) {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            vKAvatarView.setContentDescription(string);
            Drawable a3 = dhr0.t.a(epx.f(favePage.b, "user") ? R.drawable.user_placeholder : R.drawable.group_placeholder);
            cq5 cq5Var = (owner == null || !owner.q) ? cq5.b.a : cq5.h.a;
            String f = owner != null ? owner.f(iah0.a(48)) : null;
            AvatarBorderType avatarBorderType = AvatarBorderType.CIRCLE;
            far0 far0Var = vKAvatarView.m;
            zjt<?> zjtVar = far0Var.a;
            ear0.d(far0Var, avatarBorderType, cq5Var, 4);
            if (a3 != null) {
                zjtVar.setPlaceholderImage(a3);
            }
            zjtVar.load(f);
            Context context = viewGroup.getContext();
            VisibleStatus zb = favePage.g.zb();
            if (zb != null && zb.c) {
                Platform platform = zb.e;
                if (platform == Platform.WEB) {
                    e3m.a aVar = e3m.a;
                    a2 = m33.a(R.drawable.ic_online_web_composite_16, context);
                } else if (platform == Platform.MOBILE) {
                    e3m.a aVar2 = e3m.a;
                    a2 = m33.a(R.drawable.ic_online_mobile_vkapp_composite_16, context);
                }
                this.q.setImageDrawable(a2);
                this.r.setImageDrawable((owner != null || (verifyInfo = owner.f) == null) ? null : VerifyInfoHelper.j(VerifyInfoHelper.a, viewGroup.getContext(), verifyInfo, false, null, 12));
                this.s.setText(q6(owner == null ? owner.c : null, z990Var2.b));
                CharSequence q6 = q6(favePage.c, null);
                TextView textView = this.t;
                textView.setText(q6);
                bwt0.p0(textView, false);
                boolean z2 = !list.isEmpty();
                FaveTagViewGroup faveTagViewGroup = this.u;
                bwt0.p0(faveTagViewGroup, z2);
                bwt0.p0(this.v, !r1.isEmpty());
                faveTagViewGroup.setTags(list);
            }
            a2 = null;
            this.q.setImageDrawable(a2);
            this.r.setImageDrawable((owner != null || (verifyInfo = owner.f) == null) ? null : VerifyInfoHelper.j(VerifyInfoHelper.a, viewGroup.getContext(), verifyInfo, false, null, 12));
            this.s.setText(q6(owner == null ? owner.c : null, z990Var2.b));
            CharSequence q62 = q6(favePage.c, null);
            TextView textView2 = this.t;
            textView2.setText(q62);
            bwt0.p0(textView2, false);
            boolean z22 = !list.isEmpty();
            FaveTagViewGroup faveTagViewGroup2 = this.u;
            bwt0.p0(faveTagViewGroup2, z22);
            bwt0.p0(this.v, !r1.isEmpty());
            faveTagViewGroup2.setTags(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s6() {
        urq.a(this.itemView.getContext(), ((z990) this.m).a);
    }
}
