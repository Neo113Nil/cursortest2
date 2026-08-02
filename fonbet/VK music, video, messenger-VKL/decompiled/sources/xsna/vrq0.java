package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.a;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.im.ui.views.online.OnlineMode;
import com.vk.profile.core.cover.a;
import com.vk.profile.design.view.avatar.UserProfileAvatarView;
import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoView;
import com.vk.profile.design.view.silentmodebanner.SilentModeBannerView;
import com.vk.profile.design.view.subscriptioninfo.SubscriptionInfoView;
import com.vk.profile.user.api.domain.UserProfileMode;
import com.vk.profile.user.impl.ui.adapter.MergeMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.profile.user.impl.ui.f;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.nym0;
import xsna.olq0;

/* compiled from: UserProfileMainInfoViewHolder.kt */
@SuppressLint({"CheckResult"})
/* loaded from: classes5.dex */
public final class vrq0 extends aq6<UserProfileAdapterItem.MainInfo> {
    public final olq0 A;
    public final pmq0 B;
    public final SilentModeBannerView C;
    public final SnowballsCoverHolder D;
    public final VkContentBadge E;
    public final SubscriptionInfoView F;
    public final View G;
    public final qrq0 H;
    public final Object I;
    public final View n;
    public final slq0 o;
    public final zuq0 p;
    public final com.vk.profile.core.cover.a q;
    public final UserProfileHeaderView r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final View x;
    public final UserProfileAvatarView y;
    public final UserProfileBaseInfoView z;

    /* JADX WARN: Type inference failed for: r1v2, types: [xsna.qrq0] */
    public vrq0(View view, hpq0 hpq0Var, khc0 khc0Var, com.vk.profile.core.cover.a aVar, UserProfileHeaderView userProfileHeaderView) {
        super(view);
        this.n = view;
        this.o = hpq0Var;
        this.p = khc0Var;
        this.q = aVar;
        this.r = userProfileHeaderView;
        this.s = bwt0.y(R.dimen.profile_avatar_with_border_size, view);
        this.t = (int) view.getResources().getDimension(R.dimen.profile_avatar_background_offset);
        this.u = (int) view.getResources().getDimension(R.dimen.user_profile_main_info_block_max_width);
        this.v = (int) view.getResources().getDimension(R.dimen.user_profile_main_info_content_padding_small);
        this.w = (int) view.getResources().getDimension(R.dimen.user_profile_main_info_content_padding);
        this.x = view.findViewById(R.id.v_profile_main_info_background);
        this.y = (UserProfileAvatarView) view.findViewById(R.id.profile_main_info_avatar);
        this.z = (UserProfileBaseInfoView) view.findViewById(R.id.profile_main_info_base);
        this.A = new olq0((LinearLayout) view.findViewById(R.id.profile_main_buttons));
        this.B = new pmq0((VkLinkedText) view.findViewById(R.id.profile_closed));
        this.C = (SilentModeBannerView) view.findViewById(R.id.silent_mode);
        this.D = new SnowballsCoverHolder((SnowballsCoverView) view.findViewById(R.id.snowballs_cover));
        VkContentBadge vkContentBadge = (VkContentBadge) view.findViewById(R.id.profile_main_a_plus);
        this.E = vkContentBadge;
        this.F = (SubscriptionInfoView) view.findViewById(R.id.profile_main_subscription_info);
        this.G = view.findViewById(R.id.v_bottom_content);
        this.H = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.qrq0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                vrq0 vrq0Var = vrq0.this;
                vrq0Var.n.post(new fs2(vrq0Var, 17));
            }
        };
        this.I = msy.a(LazyThreadSafetyMode.NONE, new j8n0(this, 4));
        q6(null);
        this.itemView.addOnAttachStateChangeListener(new trq0(this));
        iut0.q(vkContentBadge, new urq0());
        ucp ucpVar = ucp.a;
        ucp.a().subscribe(new nan0(new fda0(this, 16), 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x054e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0427  */
    /* JADX WARN: Type inference failed for: r4v35, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // xsna.vif0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(Object obj) {
        boolean z;
        View view;
        UserProfileAdapterItem.MainInfo.a aVar;
        boolean z2;
        String string;
        OnlineInfo onlineInfo;
        UserProfileBaseInfoState.a aVar2;
        UserProfileBaseInfoState.b bVar;
        String string2;
        String str;
        UserProfileAdapterItem.MainInfo.c.a.AbstractC1700a abstractC1700a;
        String str2;
        UserProfileBaseInfoState.c.a aVar3;
        UserProfileBaseInfoState.c cVar;
        a.b d;
        UserProfileBaseInfoState.VerifyInfo verifyInfo;
        boolean K;
        boolean z3;
        Pair pair;
        Pair pair2;
        boolean z4;
        boolean z5;
        SilentModeBannerView silentModeBannerView;
        boolean z6;
        nym0 nym0Var;
        ImageSize Cb;
        UserProfileAdapterItem.MainInfo mainInfo = (UserProfileAdapterItem.MainInfo) obj;
        UserProfileAdapterItem.MainInfo.a aVar4 = mainInfo.c;
        UserProfileAdapterItem.MainInfo.b bVar2 = mainInfo.f;
        int h = mainInfo.b.h();
        View view2 = this.x;
        view2.setBackgroundResource(h);
        boolean z7 = mainInfo.g;
        int i = 2;
        f4m.t(z7 ? (this.s / 2) - this.t : cn70.b(0), view2);
        d9f0 d9f0Var = mainInfo.j;
        View view3 = this.n;
        int i2 = 1;
        if (d9f0Var == null || d9f0Var.a.isEmpty()) {
            this.D.a.setVisibility(8);
        } else {
            io.reactivex.rxjava3.subjects.g<com.vk.core.view.components.topbar.a> onToolbarComposedCallback = this.r.getOnToolbarComposedCallback();
            ac20 ac20Var = new ac20(new q8w(26), 18);
            onToolbarComposedCallback.getClass();
            hg1.b(view3, new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(onToolbarComposedCallback, ac20Var), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new e7q0(new z7k0(z7, this, d9f0Var, i2), i)));
        }
        Image image = aVar4.b;
        UserProfileAvatarView userProfileAvatarView = this.y;
        userProfileAvatarView.setup(new kmq0((image == null || (Cb = image.Cb(userProfileAvatarView.getAvatarSize(), true, false)) == null) ? null : Cb.d.d, aVar4.a, aVar4.c, aVar4.h, aVar4.d, aVar4.e, aVar4.f, aVar4.g, new rka0(this, 24), new srq0(this, 0), this.q, aVar4.k));
        UserProfileAdapterItem.MainInfo.c cVar2 = mainInfo.d;
        UserProfileBaseInfoView userProfileBaseInfoView = this.z;
        Context context = userProfileBaseInfoView.getContext();
        boolean z8 = cVar2.h;
        ImageStatus imageStatus = cVar2.d;
        CharSequence charSequence = cVar2.b;
        String str3 = cVar2.a;
        OnlineInfo onlineInfo2 = cVar2.m;
        boolean z9 = cVar2.i;
        String string3 = z9 ? context.getString(R.string.dead_user_talkback) : null;
        if (z9) {
            aVar = aVar4;
            z2 = z7;
            z = z8;
            view = view3;
            string = null;
        } else {
            z = z8;
            view = view3;
            gp80 gp80Var = new gp80(context, new hp80(2));
            OnlineMode.Companion.getClass();
            if (ikq0.$EnumSwitchMapping$0[OnlineMode.a.a(onlineInfo2).ordinal()] == 1) {
                boolean z10 = cVar2.k;
                if (onlineInfo2 == null) {
                    z2 = z7;
                    aVar = aVar4;
                    onlineInfo = new InvisibleStatus(null, 1, null);
                } else {
                    aVar = aVar4;
                    z2 = z7;
                    onlineInfo = onlineInfo2;
                }
                string = context.getString(R.string.user_offline_detail_accessibility, gp80Var.c(z10, onlineInfo));
            } else {
                aVar = aVar4;
                z2 = z7;
                string = context.getString(R.string.user_online_accessibility);
            }
        }
        List l = e43.l(str3, string3, string);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : l) {
            String str4 = (String) obj2;
            if (str4 != null && !drm0.N(str4)) {
                arrayList.add(obj2);
            }
        }
        UserProfileBaseInfoState.d dVar = new UserProfileBaseInfoState.d(str3, j5g.g0(arrayList, " ", null, null, 0, null, 62));
        if (charSequence != null) {
            UserProfileBaseInfoState.a aVar5 = new UserProfileBaseInfoState.a(charSequence, context.getString(R.string.user_short_info_accessibility, charSequence));
            if (!drm0.N(charSequence)) {
                aVar2 = aVar5;
                String str5 = cVar2.c;
                if (imageStatus == null) {
                    ImageSize Cb2 = imageStatus.d.Cb(iah0.a(16), true, false);
                    bVar = new UserProfileBaseInfoState.b(Cb2 != null ? Cb2.d.d : null, context.getString(R.string.user_emoji_status_accessibility, imageStatus.c));
                } else {
                    bVar = null;
                }
                MusicTrack musicTrack = cVar2.e;
                String musicTrack2 = musicTrack == null ? musicTrack.toString() : null;
                string2 = context.getString(R.string.user_profile_detailed_info);
                UserProfileAdapterItem.MainInfo.c.a aVar6 = cVar2.f;
                str = aVar6.a;
                abstractC1700a = aVar6.b;
                if (str != null && str.length() != 0 && abstractC1700a != null) {
                    string2 = null;
                }
                if (abstractC1700a == null) {
                    str2 = str5;
                    aVar3 = new UserProfileBaseInfoState.c.a(abstractC1700a.b(), abstractC1700a.a, abstractC1700a.a());
                } else {
                    str2 = str5;
                    aVar3 = null;
                }
                cVar = new UserProfileBaseInfoState.c(string2, str, aVar3, aVar6.c);
                if (cVar2.a() && z) {
                    cVar = null;
                }
                Object obj3 = com.vk.core.utils.a.a;
                VerifyInfo verifyInfo2 = cVar2.g;
                d = com.vk.core.utils.a.d(context, verifyInfo2, null, 20);
                if (d == null) {
                    baf0 baf0Var = d.a;
                    boolean z11 = d.b;
                    UserProfileBaseInfoState.VerifyInfo.VerificationType verificationType = verifyInfo2.b ? UserProfileBaseInfoState.VerifyInfo.VerificationType.VkVerified : verifyInfo2.Db() ? UserProfileBaseInfoState.VerifyInfo.VerificationType.ServiceVerified : null;
                    boolean z12 = verifyInfo2.c;
                    verifyInfo = new UserProfileBaseInfoState.VerifyInfo(baf0Var, z11, (z12 && verifyInfo2.b) ? context.getString(R.string.user_profile_talkback_trending_verified_icon) : (z12 && verifyInfo2.Db()) ? context.getString(R.string.user_profile_talkback_trending_service_verified_icon) : verifyInfo2.b ? context.getString(R.string.user_profile_talkback_verified_icon) : verifyInfo2.Db() ? context.getString(R.string.user_profile_talkback_service_verified_icon) : verifyInfo2.c ? context.getString(R.string.user_profile_talkback_trending_icon) : null, verificationType);
                } else {
                    verifyInfo = null;
                }
                userProfileBaseInfoView.setState(new UserProfileBaseInfoState(dVar, aVar2, str2, bVar, musicTrack2, cVar, verifyInfo, !z9 ? context.getString(R.string.user_profile_user_is_dead) : null, (cVar2.a() || !z || cVar2.l) ? null : context.getString(R.string.user_profile_set_info)));
                int i3 = 25;
                userProfileBaseInfoView.setOnAction(new aq1(i3, cVar2, this));
                UserProfileAdapterItem.MainInfo.ActionButtons actionButtons = mainInfo.e;
                Integer valueOf = Integer.valueOf(R.drawable.vk_icon_gift_outline_24);
                olq0 olq0Var = this.A;
                VkButton vkButton = olq0Var.f;
                LinearLayout linearLayout = olq0Var.a;
                UserProfileAdapterItem.MainInfo.ActionButtons.a aVar7 = actionButtons.a;
                bwt0.p0(linearLayout, aVar7.a == UserProfileAdapterItem.MainInfo.ActionButtons.State.NONE);
                K = bwt0.K(linearLayout);
                int i4 = 3;
                int i5 = 21;
                int i6 = 17;
                slq0 slq0Var = this.o;
                if (K) {
                    z3 = false;
                    z4 = true;
                } else {
                    olq0Var.b.a(aVar7, slq0Var);
                    olq0Var.h.a(actionButtons.b, slq0Var);
                    VkButton vkButton2 = olq0Var.c;
                    UserProfileAdapterItem.MainInfo.ActionButtons.a aVar8 = actionButtons.c;
                    Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_done_24);
                    int i7 = 27;
                    switch (olq0.a.$EnumSwitchMapping$0[aVar8.a.ordinal()]) {
                        case 1:
                            z3 = false;
                            pair = new Pair(Integer.valueOf(R.drawable.vk_icon_user_add_outline_24), new ge0(i6, slq0Var, vkButton2));
                            pair2 = pair;
                            int intValue = ((Number) pair2.d()).intValue();
                            gzs gzsVar = (gzs) pair2.g();
                            Integer valueOf3 = Integer.valueOf(intValue);
                            int[] iArr = VkButton.W;
                            vkButton2.a5(true, valueOf3);
                            olq0.a(vkButton2, true, gzsVar);
                            break;
                        case 2:
                            z3 = false;
                            pair = new Pair(Integer.valueOf(R.drawable.vk_icon_user_added_outline_24), new wo1(18, slq0Var, vkButton2));
                            pair2 = pair;
                            int intValue2 = ((Number) pair2.d()).intValue();
                            gzs gzsVar2 = (gzs) pair2.g();
                            Integer valueOf32 = Integer.valueOf(intValue2);
                            int[] iArr2 = VkButton.W;
                            vkButton2.a5(true, valueOf32);
                            olq0.a(vkButton2, true, gzsVar2);
                            break;
                        case 3:
                            z3 = false;
                            pair = new Pair(valueOf2, new uh3(i7, slq0Var, vkButton2));
                            pair2 = pair;
                            int intValue22 = ((Number) pair2.d()).intValue();
                            gzs gzsVar22 = (gzs) pair2.g();
                            Integer valueOf322 = Integer.valueOf(intValue22);
                            int[] iArr22 = VkButton.W;
                            vkButton2.a5(true, valueOf322);
                            olq0.a(vkButton2, true, gzsVar22);
                            break;
                        case 4:
                            z3 = false;
                            pair2 = new Pair(Integer.valueOf(R.drawable.vk_icon_add_square_outline_24), new vq6(i3, slq0Var, vkButton2));
                            int intValue222 = ((Number) pair2.d()).intValue();
                            gzs gzsVar222 = (gzs) pair2.g();
                            Integer valueOf3222 = Integer.valueOf(intValue222);
                            int[] iArr222 = VkButton.W;
                            vkButton2.a5(true, valueOf3222);
                            olq0.a(vkButton2, true, gzsVar222);
                            break;
                        case 5:
                            z3 = false;
                            pair = new Pair(valueOf2, new com.vk.movika.sdk.base.flow.binding.g(i7, slq0Var, vkButton2));
                            pair2 = pair;
                            int intValue2222 = ((Number) pair2.d()).intValue();
                            gzs gzsVar2222 = (gzs) pair2.g();
                            Integer valueOf32222 = Integer.valueOf(intValue2222);
                            int[] iArr2222 = VkButton.W;
                            vkButton2.a5(true, valueOf32222);
                            olq0.a(vkButton2, true, gzsVar2222);
                            break;
                        case 6:
                            z3 = false;
                            pair2 = new Pair(valueOf, new defpackage.e0(i7, slq0Var, vkButton2));
                            int intValue22222 = ((Number) pair2.d()).intValue();
                            gzs gzsVar22222 = (gzs) pair2.g();
                            Integer valueOf322222 = Integer.valueOf(intValue22222);
                            int[] iArr22222 = VkButton.W;
                            vkButton2.a5(true, valueOf322222);
                            olq0.a(vkButton2, true, gzsVar22222);
                            break;
                        default:
                            z3 = false;
                            bwt0.p0(vkButton2, false);
                            break;
                    }
                    olq0.a(olq0Var.e, actionButtons.d, new zv(19, slq0Var, olq0Var));
                    olq0.a(olq0Var.d, actionButtons.e, new com.vk.movika.sdk.base.flow.binding.l(24, slq0Var, olq0Var));
                    olq0.a(vkButton, actionButtons.g, new com.vk.movika.sdk.base.ui.l(i5, slq0Var, olq0Var));
                    z4 = true;
                    if (actionButtons.h) {
                        bwt0.p0(vkButton, true);
                        int[] iArr3 = VkButton.W;
                        vkButton.a5(true, valueOf);
                        bwt0.i0(vkButton, new hmj0(i4, slq0Var, olq0Var));
                    }
                    olq0.a(olq0Var.g, actionButtons.f, new j6(i6, slq0Var, olq0Var));
                }
                pmq0 pmq0Var = this.B;
                pmq0Var.getClass();
                boolean z13 = bVar2.b;
                z5 = bVar2.a;
                long j = bVar2.c.a;
                bwt0.p0(pmq0Var.a, ((!z5 || z13) && j <= 0) ? z4 : z3);
                pmq0Var.b = slq0Var;
                if (!z5) {
                    pmq0Var.a(R.string.user_profile_make_profile_open, R.string.user_profile_change_privacy, R.drawable.vk_icon_lock_outline_20, new mqe0(pmq0Var, i5));
                } else if (!z5 && z13) {
                    pmq0Var.a(R.string.user_profile_privacy_open, R.string.user_profile_privacy_setup, R.drawable.vk_icon_unlock_outline_20, new dck0(pmq0Var, 10));
                }
                boolean z14 = ((!z5 || bVar2.b) && j > 0) ? z4 : z3;
                silentModeBannerView = this.C;
                bwt0.p0(silentModeBannerView, z14);
                if (bwt0.K(silentModeBannerView)) {
                    Context context2 = silentModeBannerView.getContext();
                    silentModeBannerView.setState(new fnj0(context2.getString(R.string.user_profile_silent_mode_title), context2.getString(R.string.user_profile_silent_mode_subtitle, new SimpleDateFormat("d MMMM", Locale.getDefault()).format(new Date(TimeUnit.MILLISECONDS.convert(j, TimeUnit.SECONDS))))));
                    silentModeBannerView.setOnClick(new mlf0(this, 11));
                }
                z6 = mainInfo.k;
                final UserProfileMode userProfileMode = aVar.f;
                VkContentBadge vkContentBadge = this.E;
                bwt0.p0(vkContentBadge, z6);
                if (z6) {
                    androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    bVar3.i(constraintLayout);
                    if (z2) {
                        bVar3.l(R.id.profile_main_a_plus, 4, R.id.v_profile_main_info_background, 3, cn70.b(12));
                        bVar3.l(R.id.profile_main_a_plus, 7, 0, 7, cn70.b(12));
                    } else {
                        bVar3.l(R.id.profile_main_a_plus, 4, R.id.profile_main_info_avatar, 4, cn70.b(12));
                        bVar3.l(R.id.profile_main_a_plus, 7, 0, 7, cn70.b(12));
                    }
                    bVar3.b(constraintLayout);
                    if (z2) {
                        vkContentBadge.setMode(VkContentBadge.Mode.Secondary);
                        vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Overlay);
                    } else {
                        vkContentBadge.setMode(VkContentBadge.Mode.Outline);
                        vkContentBadge.setAppearance(VkContentBadge.Appearance.Design.Neutral);
                    }
                    final boolean z15 = z2;
                    this.q.l.add(new a.InterfaceC1639a() { // from class: xsna.rrq0
                        @Override // com.vk.profile.core.cover.a.InterfaceC1639a
                        public final void a(float f) {
                            float min = 1 - Math.min(f, 0.5f);
                            vrq0 vrq0Var = vrq0.this;
                            vrq0Var.E.setAlpha(min);
                            if (z15) {
                                return;
                            }
                            if (userProfileMode == UserProfileMode.Profile) {
                                f4m.q(an10.b((cn70.b(9) * min) + (((1.0f - min) * vrq0Var.y.getHeight()) / 2.0f)) + cn70.b(3), vrq0Var.E);
                            }
                        }
                    });
                }
                nym0Var = mainInfo.l;
                boolean z16 = nym0Var == null ? z4 : z3;
                SubscriptionInfoView subscriptionInfoView = this.F;
                bwt0.p0(subscriptionInfoView, z16);
                this.G.setVisibility(nym0Var == null ? 8 : z3);
                if (nym0Var != null) {
                    return;
                }
                MergeMode mergeMode = mainInfo.b;
                float f = (mergeMode == MergeMode.MergeBottom || mergeMode == MergeMode.MergeBoth) ? 8 : 20;
                subscriptionInfoView.setShape(vog0.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 3));
                subscriptionInfoView.setSubscriptionInfoText(this.itemView.getContext().getString(nym0Var.b, nym0Var.a));
                nym0.a aVar9 = nym0Var.c;
                f.c.r rVar = aVar9 != null ? new f.c.r(this.itemView.getContext().getString(aVar9.b, aVar9.a), this.itemView.getContext().getString(aVar9.c)) : null;
                subscriptionInfoView.setOnClick(rVar != null ? new vf1(i6, this, rVar) : null);
                return;
            }
        }
        aVar2 = null;
        String str52 = cVar2.c;
        if (imageStatus == null) {
        }
        MusicTrack musicTrack3 = cVar2.e;
        if (musicTrack3 == null) {
        }
        string2 = context.getString(R.string.user_profile_detailed_info);
        UserProfileAdapterItem.MainInfo.c.a aVar62 = cVar2.f;
        str = aVar62.a;
        abstractC1700a = aVar62.b;
        if (str != null) {
            string2 = null;
        }
        if (abstractC1700a == null) {
        }
        cVar = new UserProfileBaseInfoState.c(string2, str, aVar3, aVar62.c);
        if (cVar2.a()) {
            cVar = null;
        }
        Object obj32 = com.vk.core.utils.a.a;
        VerifyInfo verifyInfo22 = cVar2.g;
        d = com.vk.core.utils.a.d(context, verifyInfo22, null, 20);
        if (d == null) {
        }
        userProfileBaseInfoView.setState(new UserProfileBaseInfoState(dVar, aVar2, str2, bVar, musicTrack2, cVar, verifyInfo, !z9 ? context.getString(R.string.user_profile_user_is_dead) : null, (cVar2.a() || !z || cVar2.l) ? null : context.getString(R.string.user_profile_set_info)));
        int i32 = 25;
        userProfileBaseInfoView.setOnAction(new aq1(i32, cVar2, this));
        UserProfileAdapterItem.MainInfo.ActionButtons actionButtons2 = mainInfo.e;
        Integer valueOf4 = Integer.valueOf(R.drawable.vk_icon_gift_outline_24);
        olq0 olq0Var2 = this.A;
        VkButton vkButton3 = olq0Var2.f;
        LinearLayout linearLayout2 = olq0Var2.a;
        UserProfileAdapterItem.MainInfo.ActionButtons.a aVar72 = actionButtons2.a;
        bwt0.p0(linearLayout2, aVar72.a == UserProfileAdapterItem.MainInfo.ActionButtons.State.NONE);
        K = bwt0.K(linearLayout2);
        int i42 = 3;
        int i52 = 21;
        int i62 = 17;
        slq0 slq0Var2 = this.o;
        if (K) {
        }
        pmq0 pmq0Var2 = this.B;
        pmq0Var2.getClass();
        boolean z132 = bVar2.b;
        z5 = bVar2.a;
        long j2 = bVar2.c.a;
        bwt0.p0(pmq0Var2.a, ((!z5 || z132) && j2 <= 0) ? z4 : z3);
        pmq0Var2.b = slq0Var2;
        if (!z5) {
        }
        if (z5) {
        }
        silentModeBannerView = this.C;
        bwt0.p0(silentModeBannerView, z14);
        if (bwt0.K(silentModeBannerView)) {
        }
        z6 = mainInfo.k;
        final UserProfileMode userProfileMode2 = aVar.f;
        VkContentBadge vkContentBadge2 = this.E;
        bwt0.p0(vkContentBadge2, z6);
        if (z6) {
        }
        nym0Var = mainInfo.l;
        if (nym0Var == null) {
        }
        SubscriptionInfoView subscriptionInfoView2 = this.F;
        bwt0.p0(subscriptionInfoView2, z16);
        this.G.setVisibility(nym0Var == null ? 8 : z3);
        if (nym0Var != null) {
        }
    }

    @Override // xsna.aq6
    public final void onConfigurationChanged(Configuration configuration) {
        q6(configuration != null ? Integer.valueOf(cn70.b(configuration.screenWidthDp)) : null);
    }

    @Override // xsna.aq6
    public final void onResume() {
        q6(null);
    }

    public final void q6(Integer num) {
        int intValue = num != null ? num.intValue() : this.n.getWidth();
        int i = this.u;
        int i2 = intValue > i ? (intValue - i) / 2 : 0;
        int i3 = this.v + i2;
        UserProfileBaseInfoView userProfileBaseInfoView = this.z;
        f4m.s(i3, userProfileBaseInfoView);
        f4m.r(i3, userProfileBaseInfoView);
        LinearLayout linearLayout = this.A.a;
        f4m.s(i3, linearLayout);
        f4m.r(i3, linearLayout);
        VkLinkedText vkLinkedText = this.B.a;
        int i4 = i2 + this.w;
        f4m.s(i4, vkLinkedText);
        f4m.r(i4, vkLinkedText);
        SilentModeBannerView silentModeBannerView = this.C;
        f4m.s(i4, silentModeBannerView);
        f4m.r(i4, silentModeBannerView);
    }
}
