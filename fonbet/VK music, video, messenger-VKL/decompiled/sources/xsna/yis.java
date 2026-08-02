package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.Platform;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.VisibleStatus;
import com.vk.friends.requests.api.di.ScreenType;
import com.vk.toggle.features.CatalogFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ayv0;
import xsna.fss;
import xsna.hss;
import xsna.ngv0;
import xsna.tgv0;
import xsna.tlo0;

/* compiled from: FriendRequestHolderRedesign3LinesIcons.kt */
/* loaded from: classes16.dex */
public final class yis extends ld6 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final Size D;
    public static final Size E;
    public final String p;
    public final cis q;
    public final hss r;
    public final UserId s;
    public final ScreenType t;
    public final VkRichCell u;
    public final f v;
    public final UserId w;
    public final VkAvatar x;
    public final VkAvatar y;
    public final mis z;

    /* compiled from: FriendRequestHolderRedesign3LinesIcons.kt */
    public static final class a {
        public final boolean a;
        public final VkButton b;

        public a(VkButton vkButton, boolean z) {
            this.a = z;
            this.b = vkButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "FriendRequestButton(isInProgress=" + this.a + ", button=" + this.b + ')';
        }
    }

    /* compiled from: FriendRequestHolderRedesign3LinesIcons.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new c(context);
        }
    }

    /* compiled from: FriendRequestHolderRedesign3LinesIcons.kt */
    public static final class c implements VkCell.d {
        public final Context a;
        public final LinearLayout b;

        public c(Context context) {
            this.a = context;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setOrientation(0);
            linearLayout.setGravity(8388613);
            this.b = linearLayout;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            d dVar = fVar instanceof d ? (d) fVar : null;
            if (dVar != null) {
                LinearLayout linearLayout = this.b;
                linearLayout.removeAllViews();
                a aVar = dVar.a;
                if (aVar != null) {
                    if (aVar.a) {
                        linearLayout.addView(b());
                    } else {
                        linearLayout.addView(aVar.b);
                    }
                }
                a aVar2 = dVar.b;
                if (aVar2 != null) {
                    View view = new View(this.a);
                    int i = yis.A;
                    view.setLayoutParams(new FrameLayout.LayoutParams(yis.A, yis.C));
                    linearLayout.addView(view);
                    if (aVar2.a) {
                        linearLayout.addView(b());
                    } else {
                        linearLayout.addView(aVar2.b);
                    }
                }
            }
        }

        public final VkSpinner b() {
            VkSpinner vkSpinner = new VkSpinner(this.a, null, 6, 0);
            vkSpinner.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            vkSpinner.setSpinnerSize(VkSpinner.SpinnerSize.Size28);
            int i = yis.C;
            vkSpinner.setMinimumHeight(i);
            vkSpinner.setMinimumWidth(i);
            int i2 = (i - yis.B) / 2;
            bwt0.e0(vkSpinner, i2, i2, i2, i2);
            return vkSpinner;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.b;
        }
    }

    /* compiled from: FriendRequestHolderRedesign3LinesIcons.kt */
    public static final class d implements VkCell.f {
        public final a a;
        public final a b;

        public d() {
            this((a) null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            a aVar2 = this.b;
            return hashCode + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        public final String toString() {
            return "FriendRequestRightExtraViewParams(firstButton=" + this.a + ", secondButton=" + this.b + ')';
        }

        public /* synthetic */ d(a aVar, int i) {
            this((i & 1) != 0 ? null : aVar, (a) null);
        }

        public d(a aVar, a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }
    }

    /* compiled from: FriendRequestHolderRedesign3LinesIcons.kt */
    public static final class e {
        public final String a;
        public final boolean b;
        public final OnlineInfo c;

        public e(String str, boolean z, OnlineInfo onlineInfo) {
            this.a = str;
            this.b = z;
            this.c = onlineInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "FriendsAvatar(baseUrl=" + this.a + ", hasUnseenStories=" + this.b + ", online=" + this.c + ')';
        }
    }

    /* compiled from: FriendRequestHolderRedesign3LinesIcons.kt */
    public final class f implements VkCell.e {
        public f() {
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new g(yis.this);
        }
    }

    /* compiled from: FriendRequestHolderRedesign3LinesIcons.kt */
    public final class g implements VkCell.d {
        public final VkAvatar a;

        public g(yis yisVar) {
            this.a = yisVar.x;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            h hVar = fVar instanceof h ? (h) fVar : null;
            if (hVar == null) {
                return;
            }
            e eVar = hVar.a;
            String a = js5.a(200, eVar.a);
            if (a == null) {
                a = "";
            }
            VkAvatar vkAvatar = this.a;
            vkAvatar.s0(a);
            izs<View, s3q0> izsVar = hVar.b;
            if (izsVar != null) {
                vkAvatar.setOnClickListener(new cm1(2, izsVar, this));
            }
            boolean z = eVar.b;
            OnlineInfo onlineInfo = eVar.c;
            vkAvatar.S0();
            if (onlineInfo.Bb()) {
                VisibleStatus zb = onlineInfo.zb();
                if ((zb != null ? zb.e : null) == Platform.WEB) {
                    vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.e(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight, null));
                } else {
                    vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.c(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight));
                }
            }
            String string = vkAvatar.getContext().getString(R.string.accessibility_catalog_story_at_avatar);
            if (!z) {
                string = null;
            }
            vkAvatar.setContentDescription(string != null ? string : "");
            if (z) {
                vkAvatar.W0(new odu0(), false);
            } else {
                vkAvatar.W0(null, false);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: FriendRequestHolderRedesign3LinesIcons.kt */
    public static final class h implements VkCell.f {
        public final e a;
        public final izs<View, s3q0> b;

        public h(e eVar, uoh uohVar) {
            this.a = eVar;
            this.b = uohVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            izs<View, s3q0> izsVar = this.b;
            return hashCode + (izsVar == null ? 0 : izsVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendsAvatarViewParams(avatar=");
            sb.append(this.a);
            sb.append(", onClick=");
            return up.c(sb, this.b, ')');
        }
    }

    static {
        int a2 = iah0.a(8);
        A = a2;
        float f2 = 28;
        B = iah0.a(f2);
        int a3 = iah0.a(f2);
        C = a3;
        D = new Size((a3 * 2) + a2, a3);
        E = new Size(a3, a3);
    }

    public yis(ViewGroup viewGroup, String str, mss mssVar, cis cisVar, hss hssVar, UserId userId, ScreenType screenType) {
        super(R.layout.vk_redesign_friend_request_item_3_lines, viewGroup, mssVar);
        this.p = str;
        this.q = cisVar;
        this.r = hssVar;
        this.s = userId;
        this.t = screenType;
        this.u = (VkRichCell) this.itemView;
        this.v = new f();
        this.w = vx2.d.c();
        VkAvatar vkAvatar = new VkAvatar(this.itemView.getContext(), null, 6, 0);
        vkAvatar.setTag("Photo");
        this.x = vkAvatar;
        this.y = vkAvatar;
        this.z = new mis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a A6() {
        return new a(v6(R.drawable.vk_icon_cancel_circle_outline_28, R.attr.vk_ui_icon_tertiary, R.string.suggest_hide, true, "HideButton", new xqf(this, 21)), xo9.r((UserProfile) this.m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a B6() {
        this.itemView.getContext();
        return new a(v6(R.drawable.vk_icon_message_outline_28, R.attr.vk_ui_icon_accent, R.string.request_new_message, ((RequestUserProfile) this.m).d(), "MessageButton", new x3i(this, 10)), false);
    }

    @Override // xsna.pss
    public final void D2(boolean z) {
        VkRichCell vkRichCell = this.u;
        pgv0 middle = vkRichCell.getMiddle();
        pgv0 pgv0Var = null;
        if (middle != null) {
            ogv0 ogv0Var = middle.g;
            pgv0Var = pgv0.a(middle, null, null, null, ogv0Var != null ? new ogv0(ogv0Var.a, ogv0Var.b, ogv0Var.c, ogv0Var.d, ogv0Var.e, ogv0Var.f, ogv0Var.g, ogv0Var.h, ogv0Var.i, z) : null, null, 447);
        }
        vkRichCell.setMiddle(pgv0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D6() {
        this.n.a(new fss.c((RequestUserProfile) this.m, this.r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean E6() {
        return (this.r instanceof hss.b) && !(((RequestUserProfile) this.m).v == 2);
    }

    public final boolean F6() {
        CatalogFeatures catalogFeatures = CatalogFeatures.COM_FRIENDS;
        catalogFeatures.getClass();
        if (!com.vk.toggle.b.A.a(catalogFeatures) || !o25.a().a(this.s)) {
            return false;
        }
        ScreenType screenType = ScreenType.FRIENDS_LIST;
        ScreenType screenType2 = this.t;
        if (screenType2 != screenType) {
            return !this.r.a() || screenType2 == ScreenType.RECOMMENDATIONS;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0388  */
    @Override // xsna.vif0
    /* renamed from: G6, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(RequestUserProfile requestUserProfile) {
        String str;
        tgv0.a aVar;
        ogv0 ogv0Var;
        ogv0 ogv0Var2;
        UserProfile[] userProfileArr;
        Integer num;
        Integer num2;
        ProfileDescription profileDescription;
        ProfileDescription profileDescription2;
        Image image;
        ImageSize Ab;
        com.vk.im.video.d dVar = new com.vk.im.video.d(this, 6);
        VkRichCell vkRichCell = this.u;
        vkRichCell.setOnClickListener(dVar);
        vkRichCell.setLeftMainAvatarController(this.v);
        if (!F6()) {
            vkRichCell.setRightExtraViewController(new b());
        }
        String str2 = requestUserProfile.g;
        boolean z = !F6() && requestUserProfile.T;
        vkRichCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new h(new e(str2, z, requestUserProfile.n), z ? new uoh(this, 17) : null), VkCell.Left.Main.Size.Medium)));
        Drawable h2 = ((RequestUserProfile) this.m).B.Cb() ? VerifyInfoHelper.h(VerifyInfoHelper.a, ((RequestUserProfile) this.m).B, vkRichCell.getContext(), null, 28) : null;
        ImageStatus imageStatus = ((RequestUserProfile) this.m).R;
        String str3 = (imageStatus == null || (image = imageStatus.d) == null || (Ab = image.Ab(iah0.a((float) 20), false)) == null) ? null : Ab.d.d;
        ngv0 aVar2 = (h2 == null || str3 == null) ? h2 != null ? new ngv0.a(new eko(h2), null, null, null, 12) : str3 != null ? new ngv0.a(new gko(R.drawable.user_placeholder), null, null, null, 12) : null : new ngv0.b(new ngv0.a(new gko(R.drawable.user_placeholder), null, null, null, 12), new ngv0.a(new eko(h2), null, null, null, 12));
        tlo0.h d2 = oq.d(tlo0.Companion, ((RequestUserProfile) this.m).e);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vgv0 vgv0Var = new vgv0(d2, (ngv0.a) null, aVar2, 1, 2);
        List<ProfileDescription> list = ((RequestUserProfile) this.m).E;
        String str4 = (list == null || (profileDescription2 = list.get(0)) == null) ? null : profileDescription2.e;
        if (str4 == null || drm0.N(str4)) {
            String str5 = ((RequestUserProfile) this.m).r;
            if (str5 != null && !drm0.N(str5)) {
                str = ((RequestUserProfile) this.m).r;
            }
            str = null;
        } else {
            List<ProfileDescription> list2 = ((RequestUserProfile) this.m).E;
            if (list2 != null && (profileDescription = list2.get(0)) != null) {
                str = profileDescription.e;
            }
            str = null;
        }
        qgv0 qgv0Var = str != null ? new qgv0(new tlo0.h(str), (ngv0.a) null, (ngv0.a) null, 1, 6) : null;
        RequestUserProfile requestUserProfile2 = (RequestUserProfile) this.m;
        MutualInfo mutualInfo = requestUserProfile2.d0;
        if (((mutualInfo == null || (num2 = mutualInfo.b) == null) ? requestUserProfile2.k0 : num2.intValue()) <= 0 || (userProfileArr = ((RequestUserProfile) this.m).j0) == null) {
            aVar = null;
        } else {
            ArrayList arrayList = new ArrayList(userProfileArr.length);
            for (UserProfile userProfile : userProfileArr) {
                arrayList.add(userProfile.g);
            }
            List H0 = j5g.H0(arrayList, 3);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = H0.iterator();
            while (it.hasNext()) {
                String a2 = js5.a(50, (String) it.next());
                ayv0.c cVar = a2 != null ? new ayv0.c(a2) : null;
                if (cVar != null) {
                    arrayList2.add(cVar);
                }
            }
            tlo0.a aVar3 = tlo0.Companion;
            Context context = this.itemView.getContext();
            RequestUserProfile requestUserProfile3 = (RequestUserProfile) this.m;
            MutualInfo mutualInfo2 = requestUserProfile3.d0;
            tlo0.h d3 = oq.d(aVar3, enj.f(R.plurals.friends_catalog_mutual_friends, (mutualInfo2 == null || (num = mutualInfo2.b) == null) ? requestUserProfile3.k0 : num.intValue(), context));
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            aVar = new tgv0.a(arrayList2, null, d3, VkUserStack.Size.Medium, null, 66);
        }
        boolean F6 = F6();
        hss hssVar = this.r;
        if (F6) {
            if (hssVar.a()) {
                Boolean bool = ((RequestUserProfile) this.m).i0;
                if (bool == null) {
                    ogv0Var = new ogv0(tq.h(tlo0.Companion, R.string.friends_catalog_follow), new r5i(this, 16), null, VkButton.Size.Small, VkButton.Mode.Primary, null, false, false, 924);
                } else if (bool.equals(Boolean.TRUE)) {
                    ogv0Var = new ogv0(tq.h(tlo0.Companion, R.string.friends_catalog_started_following), new ocg(this, 22), null, VkButton.Size.Small, VkButton.Mode.Primary, null, false, false, 924);
                } else if (!bool.equals(Boolean.FALSE)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                Boolean bool2 = ((RequestUserProfile) this.m).i0;
                if (bool2 == null) {
                    ogv0Var = new ogv0(tq.h(tlo0.Companion, R.string.friends_catalog_add_2), new y3i(this, 9), null, VkButton.Size.Small, VkButton.Mode.Primary, null, !((RequestUserProfile) this.m).G, false, 668);
                } else if (bool2.equals(Boolean.TRUE)) {
                    ogv0Var = new ogv0(tq.h(tlo0.Companion, R.string.friends_catalog_remove_from_friends), new x5i(this, 19), null, VkButton.Size.Small, VkButton.Mode.Primary, VkButton.Appearance.Overlay, false, false, 796);
                } else if (!bool2.equals(Boolean.FALSE)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (F6()) {
                if (hssVar.a()) {
                    if (((RequestUserProfile) this.m).i0 == null) {
                        ogv0Var2 = new ogv0(tq.h(tlo0.Companion, R.string.friends_catalog_hide), new ncg(this, 21), null, VkButton.Size.Small, VkButton.Mode.Secondary, null, false, false, 924);
                    }
                } else if (((RequestUserProfile) this.m).i0 == null) {
                    ogv0Var2 = new ogv0(tq.h(tlo0.Companion, R.string.friends_catalog_delete_from_subscribers_short), new xis(this, 0), null, VkButton.Size.Small, VkButton.Mode.Secondary, null, false, false, 924);
                }
                vkRichCell.setMiddle(new pgv0(vgv0Var, null, qgv0Var, aVar, ogv0Var, ogv0Var2, 298));
                u1u0.g(vkRichCell);
                if (F6()) {
                    vkRichCell.setRight((VkCell.Right.d) null);
                } else {
                    Boolean bool3 = requestUserProfile.i0;
                    boolean f2 = epx.f(bool3, Boolean.TRUE);
                    Size size = D;
                    if (f2) {
                        this.itemView.setForeground(null);
                        boolean z2 = ((RequestUserProfile) this.m).j;
                        if (z2 && (hssVar instanceof hss.c)) {
                            vkRichCell.setRight(t6());
                        } else if (!z2 || hssVar.a()) {
                            int i = ((RequestUserProfile) this.m).v;
                            if (i == 3 || i == 1) {
                                vkRichCell.setRight(t6());
                            } else {
                                I6();
                            }
                        } else {
                            vkRichCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.d(new d(x6(), B6()), size), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
                        }
                    } else if (epx.f(bool3, Boolean.FALSE)) {
                        this.itemView.setForeground(new ColorDrawable(l8g.f(0.4f, dhr0.t.c(R.attr.vk_ui_text_contrast_themed))));
                        vkRichCell.setRight((VkCell.Right.d) null);
                    } else {
                        this.itemView.setForeground(null);
                        if (hssVar instanceof hss.c) {
                            if (((RequestUserProfile) this.m).G()) {
                                vkRichCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.d(new d(A6(), 2), E), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
                            } else {
                                vkRichCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.d(new d(A6(), s6()), size), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
                            }
                        } else if (epx.f(((RequestUserProfile) this.m).c, this.w)) {
                            vkRichCell.setRight((VkCell.Right.d) null);
                        } else {
                            RequestUserProfile requestUserProfile4 = (RequestUserProfile) this.m;
                            int i2 = requestUserProfile4.v;
                            if (i2 != 1 && i2 != 3) {
                                I6();
                            } else if (!requestUserProfile4.n0) {
                                vkRichCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.d(new d(x6(), B6()), size), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
                            }
                        }
                    }
                }
                this.z.getClass();
                mis.d(requestUserProfile, this.p);
            }
            ogv0Var2 = null;
            vkRichCell.setMiddle(new pgv0(vgv0Var, null, qgv0Var, aVar, ogv0Var, ogv0Var2, 298));
            u1u0.g(vkRichCell);
            if (F6()) {
            }
            this.z.getClass();
            mis.d(requestUserProfile, this.p);
        }
        ogv0Var = null;
        if (F6()) {
        }
        ogv0Var2 = null;
        vkRichCell.setMiddle(new pgv0(vgv0Var, null, qgv0Var, aVar, ogv0Var, ogv0Var2, 298));
        u1u0.g(vkRichCell);
        if (F6()) {
        }
        this.z.getClass();
        mis.d(requestUserProfile, this.p);
    }

    @Override // xsna.pss
    public final hss H5() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pss
    public final void I1() {
        i6((RequestUserProfile) this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I6() {
        hss hssVar = this.r;
        a A6 = hssVar.a() ? this.q.d ? A6() : null : B6();
        boolean G = ((RequestUserProfile) this.m).G();
        Size size = E;
        int i = 2;
        VkRichCell vkRichCell = this.u;
        if (G) {
            vkRichCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(new d(A6, i), size), null, null, 29));
            return;
        }
        Size size2 = D;
        if (A6 != null && hssVar.a()) {
            vkRichCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(new d(A6, s6()), size2), null, null, 29));
        } else if (A6 != null) {
            vkRichCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.d(new d(s6(), A6), size2), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
        } else {
            vkRichCell.setRight(new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.d(new d(s6(), i), size), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29));
        }
    }

    @Override // xsna.pss
    public final View m4() {
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q6() {
        RequestUserProfile requestUserProfile = (RequestUserProfile) this.m;
        boolean z = requestUserProfile.p0;
        mss mssVar = this.n;
        if (z) {
            mssVar.a(new fss.b.a(requestUserProfile));
        } else {
            mssVar.a(new fss.d(requestUserProfile, this.r));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a s6() {
        boolean s = xo9.s((UserProfile) this.m);
        int i = E6() ? R.drawable.vk_icon_add_square_outline_28 : R.drawable.vk_icon_user_add_outline_28;
        this.itemView.getContext();
        return new a(v6(i, R.attr.vk_ui_icon_accent, E6() ? R.string.subscribe : R.string.friends_add, true, "AddButton", new pce(this, 26)), s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final VkCell.Right.d t6() {
        int i;
        boolean z = ((UserProfile) this.m).s.getInt("friend_request_status", 0) == -3;
        if (E6()) {
            this.itemView.getContext();
            i = R.drawable.vk_icon_done_outline_28;
        } else {
            i = R.drawable.vk_icon_user_added_outline_28;
        }
        int i2 = i;
        this.itemView.getContext();
        LinkedHashMap linkedHashMap = x1z.a;
        return new VkCell.Right.d((VkCell.Right.a) null, new VkCell.Right.e.d(new d(new a(v6(i2, R.attr.vk_ui_icon_secondary, E6() ? R.string.subscribe_done : R.string.request_sent, true, "CancelButton", new cwg(this, 20)), z), 2), E), (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 29);
    }

    public final VkButton v6(int i, int i2, int i3, boolean z, String str, gzs<s3q0> gzsVar) {
        VkButton vkButton = new VkButton(this.itemView.getContext(), null, 6, 0);
        vkButton.setTag(str);
        this.itemView.getContext();
        vkButton.setMode(VkButton.Mode.Tertiary);
        vkButton.setCornerRadius(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        vkButton.setSize(VkButton.Size.Small);
        vkButton.setContentDescription(vkButton.getContext().getString(i3));
        vkButton.getContext();
        LinkedHashMap linkedHashMap = x1z.a;
        vkButton.a5(true, Integer.valueOf(i));
        vkButton.setIconTint(i2);
        vkButton.setIconSize(Integer.valueOf(B));
        vkButton.setEnabled(z);
        vkButton.setOnClickListener(new qj8(gzsVar, 5));
        vkButton.setPadding(0, 0, 0, 0);
        vkButton.setClipToOutline(false);
        int i4 = C;
        vkButton.setLayoutParams(new ViewGroup.LayoutParams(i4, i4));
        return vkButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pss
    public final void x5() {
        D2(false);
        i6((RequestUserProfile) this.m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a x6() {
        this.itemView.getContext();
        return new a(v6(R.drawable.vk_icon_phone_outline_28, R.attr.vk_ui_icon_accent, R.string.friends_action_make_call_audio, epx.f(((RequestUserProfile) this.m).y, Boolean.TRUE), "CallButton", new trf(this, 26)), false);
    }
}
