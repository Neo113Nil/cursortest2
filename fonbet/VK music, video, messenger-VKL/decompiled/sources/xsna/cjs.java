package xsna;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vk.dto.common.MutualInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.user.ProfileDescription;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.chromium.base.TimeUtils;
import xsna.ayv0;
import xsna.hss;
import xsna.ngv0;
import xsna.ogv0;
import xsna.ozv;
import xsna.tgv0;
import xsna.tlo0;

/* compiled from: FriendRequestHolderRedesignDefault.kt */
/* loaded from: classes16.dex */
public final class cjs extends ld6 {
    public static final /* synthetic */ int v = 0;
    public final String p;
    public final hss q;
    public final VkRichCell r;
    public final VkAvatar s;
    public final VkAvatar t;
    public final com.vk.im.ui.views.avatars.b u;

    /* compiled from: FriendRequestHolderRedesignDefault.kt */
    public final class a implements VkCell.d {
        public final VkAvatar a;

        public a() {
            this.a = cjs.this.s;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            RequestUserProfile requestUserProfile;
            Peer.Type type;
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null || (requestUserProfile = cVar.a) == null) {
                return;
            }
            VkAvatar vkAvatar = this.a;
            vkAvatar.S0();
            cjs cjsVar = cjs.this;
            com.vk.im.ui.views.avatars.b bVar = cjsVar.u;
            ozv ozvVar = ozv.a;
            RequestUserProfile requestUserProfile2 = (RequestUserProfile) cjsVar.m;
            ozvVar.getClass();
            boolean z = requestUserProfile2.p0;
            if (z) {
                type = Peer.Type.CONTACT;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                type = Peer.Type.USER;
            }
            ozv.b bVar2 = new ozv.b(requestUserProfile2, type);
            bVar.getClass();
            vkAvatar.setPlaceholderImage(bVar.e(bVar2.name(), bVar2.t8()));
            vkAvatar.o0(requestUserProfile.o(72), null);
            if (requestUserProfile.n.Bb()) {
                vkAvatar.Q0(new com.vk.core.view.components.avatar.badge.e(vkAvatar.getContext(), VkAvatarBadge.Alignment.BottomRight, null));
            }
            boolean z2 = requestUserProfile.T;
            String string = vkAvatar.getContext().getString(R.string.accessibility_catalog_story_at_avatar);
            if (!z2) {
                string = null;
            }
            if (string == null) {
                string = "";
            }
            vkAvatar.setContentDescription(string);
            if (z2) {
                vkAvatar.W0(new odu0(), false);
            } else {
                vkAvatar.W0(null, false);
            }
            if (z2) {
                vkAvatar.setOnClickListener(new f9(cjsVar, 8));
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: FriendRequestHolderRedesignDefault.kt */
    public final class b implements VkCell.e {
        public b() {
        }

        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return cjs.this.new a();
        }
    }

    /* compiled from: FriendRequestHolderRedesignDefault.kt */
    public static final class c implements VkCell.f {
        public final RequestUserProfile a;

        public c(RequestUserProfile requestUserProfile) {
            this.a = requestUserProfile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "AvatarViewParams(profile=" + this.a + ')';
        }
    }

    public cjs(ViewGroup viewGroup, String str, mss mssVar, hss hssVar) {
        super(R.layout.vkui_friend_request_item, viewGroup, mssVar);
        this.p = str;
        this.q = hssVar;
        this.r = (VkRichCell) this.itemView;
        VkAvatar vkAvatar = new VkAvatar(this.itemView.getContext(), null, 6, 0);
        vkAvatar.setTag("Photo");
        this.s = vkAvatar;
        this.t = vkAvatar;
        this.u = new com.vk.im.ui.views.avatars.b(this.itemView.getContext(), true);
    }

    public static final int q6(int i, int i2) {
        return an10.b(swe0.f((i - ((1 - 0.64f) * i2)) / 0.64f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 255.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pss
    public final void D2(boolean z) {
        i6((RequestUserProfile) this.m);
    }

    @Override // xsna.pss
    public final hss H5() {
        return this.q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pss
    public final void I1() {
        i6((RequestUserProfile) this.m);
    }

    @Override // xsna.pss
    public final View m4() {
        return this.t;
    }

    public final SpannableStringBuilder s6(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Context context = this.itemView.getContext();
        FontFamily fontFamily = FontFamily.REGULAR;
        int i = a.C1933a.C1934a.$EnumSwitchMapping$0[TextSizeUnit.SP.ordinal()];
        float f = 15.0f;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = com.vk.typography.b.b(15.0f);
        }
        nik0.a(spannableStringBuilder, cqi.a(Font.Companion, fontFamily, f, context), 0, str.length());
        int f2 = e3m.f(R.attr.vk_ui_text_secondary, this.itemView.getContext());
        int f3 = e3m.f(R.attr.vk_ui_background_content, this.itemView.getContext());
        return cqm0.c(Color.rgb(q6(Color.red(f2), Color.red(f3)), q6(Color.green(f2), Color.green(f3)), q6(Color.blue(f2), Color.blue(f3))), spannableStringBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean t6() {
        return xo9.s((UserProfile) this.m) || xo9.r((UserProfile) this.m) || ((UserProfile) this.m).s.getInt("friend_request_status", 0) == -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016e  */
    @Override // xsna.vif0
    /* renamed from: v6, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(RequestUserProfile requestUserProfile) {
        ugv0 ugv0Var;
        qgv0 qgv0Var;
        Pair pair;
        ogv0.a aVar;
        int i;
        VkButton.Mode mode;
        VkButton.Size size;
        RequestUserProfile requestUserProfile2;
        ogv0 ogv0Var;
        tgv0.a aVar2;
        UserProfile[] userProfileArr;
        Integer num;
        Integer num2;
        String str;
        VerifyInfo verifyInfo = requestUserProfile.B;
        bjs bjsVar = new bjs(this, requestUserProfile, 0);
        VkRichCell vkRichCell = this.r;
        vkRichCell.setOnClickListener(bjsVar);
        vkRichCell.setLeftMainAvatarController(new b());
        vkRichCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new c(requestUserProfile), VkCell.Left.Main.Size.Large)));
        List<ProfileDescription> list = requestUserProfile.E;
        List<ProfileDescription> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            ugv0Var = null;
            qgv0Var = null;
        } else {
            String str2 = list.get(0).e;
            if (str2 == null || str2.length() == 0) {
                ugv0Var = null;
            } else {
                tlo0.a aVar3 = tlo0.Companion;
                SpannableStringBuilder c2 = cqm0.c(e3m.f(R.attr.vk_ui_text_secondary, this.itemView.getContext()), str2);
                aVar3.getClass();
                tlo0.h hVar = new tlo0.h(c2);
                int i2 = list.size() == 1 ? 2 : 1;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                ugv0Var = new ugv0(hVar, (ngv0.a) null, (ngv0.a) null, i2, (fy0) null, 38);
            }
            qgv0Var = (list.size() <= 1 || (str = list.get(1).e) == null || str.length() == 0) ? null : new qgv0(oq.d(tlo0.Companion, str), (ngv0.a) null, (ngv0.a) null, 0, 30);
        }
        Pair pair2 = new Pair(ugv0Var, qgv0Var);
        if (requestUserProfile.j) {
            tlo0.a aVar4 = tlo0.Companion;
            SpannableStringBuilder s6 = s6(g6(R.string.profile_btn_is_friend));
            aVar4.getClass();
            pair = new Pair(new ogv0(new tlo0.h(s6), new h13(13), null, VkButton.Size.Small, VkButton.Mode.Link, VkButton.Appearance.Neutral, false, false, 536), null);
        } else if (requestUserProfile.p0) {
            pair = new Pair(new ogv0(tq.h(tlo0.Companion, R.string.recommendations_invite), new p3h(this, 18), null, VkButton.Size.Medium, VkButton.Mode.Primary, VkButton.Appearance.Accent, !t6(), xo9.s((UserProfile) this.m), 24), null);
        } else {
            Boolean bool = requestUserProfile.i0;
            hss hssVar = this.q;
            if (bool != null) {
                Boolean bool2 = ((RequestUserProfile) this.m).i0;
                Boolean bool3 = Boolean.FALSE;
                boolean z = epx.f(bool2, bool3) && ((RequestUserProfile) this.m).q0;
                if (!z) {
                    RequestUserProfile requestUserProfile3 = (RequestUserProfile) this.m;
                    if (!requestUserProfile3.l0 && epx.f(requestUserProfile3.i0, Boolean.TRUE)) {
                        aVar = new ogv0.a(new gko(R.drawable.vk_icon_check_20));
                        if (z) {
                            RequestUserProfile requestUserProfile4 = (RequestUserProfile) this.m;
                            boolean equals = Boolean.TRUE.equals(requestUserProfile4.i0);
                            i = requestUserProfile4.l0 ? R.string.request_canceled : (requestUserProfile4.m0 || requestUserProfile4.n0) ? equals ? hssVar instanceof hss.b ? R.string.subscribe_done : R.string.request_sent : R.string.suggest_declined : equals ? R.string.request_accepted : R.string.request_decline;
                        } else {
                            i = R.string.report_sent;
                        }
                        String g6 = g6(i);
                        tlo0.a aVar5 = tlo0.Companion;
                        SpannableStringBuilder s62 = s6(g6);
                        aVar5.getClass();
                        tlo0.h hVar2 = new tlo0.h(s62);
                        VkButton.Appearance appearance = VkButton.Appearance.Neutral;
                        mode = VkButton.Mode.Link;
                        size = VkButton.Size.Small;
                        ogv0 ogv0Var2 = new ogv0(hVar2, new com.vk.movika.sdk.android.defaultplayer.interactive.b(16), aVar, size, mode, appearance, false, false, 536);
                        if ((epx.f(((RequestUserProfile) this.m).i0, bool3) || !((RequestUserProfile) this.m).q0) && ((RequestUserProfile) this.m).d()) {
                            requestUserProfile2 = (RequestUserProfile) this.m;
                            if (!requestUserProfile2.m0 && !requestUserProfile2.l0 && requestUserProfile2.c.b != 0) {
                                ogv0Var = new ogv0(new tlo0.f(!epx.f(requestUserProfile2.i0, bool3) ? R.string.report_send : R.string.request_new_message), new cnh(this, 9), null, size, mode, VkButton.Appearance.Accent, !t6(), false, 536);
                                pair = new Pair(ogv0Var2, ogv0Var);
                            }
                        }
                        ogv0Var = null;
                        pair = new Pair(ogv0Var2, ogv0Var);
                    }
                }
                aVar = null;
                if (z) {
                }
                String g62 = g6(i);
                tlo0.a aVar52 = tlo0.Companion;
                SpannableStringBuilder s622 = s6(g62);
                aVar52.getClass();
                tlo0.h hVar22 = new tlo0.h(s622);
                VkButton.Appearance appearance2 = VkButton.Appearance.Neutral;
                mode = VkButton.Mode.Link;
                size = VkButton.Size.Small;
                ogv0 ogv0Var22 = new ogv0(hVar22, new com.vk.movika.sdk.android.defaultplayer.interactive.b(16), aVar, size, mode, appearance2, false, false, 536);
                if (epx.f(((RequestUserProfile) this.m).i0, bool3)) {
                }
                requestUserProfile2 = (RequestUserProfile) this.m;
                if (!requestUserProfile2.m0) {
                    ogv0Var = new ogv0(new tlo0.f(!epx.f(requestUserProfile2.i0, bool3) ? R.string.report_send : R.string.request_new_message), new cnh(this, 9), null, size, mode, VkButton.Appearance.Accent, !t6(), false, 536);
                    pair = new Pair(ogv0Var22, ogv0Var);
                }
                ogv0Var = null;
                pair = new Pair(ogv0Var22, ogv0Var);
            } else {
                ogv0 ogv0Var3 = ((RequestUserProfile) this.m).l0 ? null : new ogv0(tq.h(tlo0.Companion, hssVar instanceof hss.b ? R.string.subscribe : R.string.friends_add), new k5h(this, 17), null, VkButton.Size.Medium, VkButton.Mode.Primary, VkButton.Appearance.Accent, !t6(), xo9.s((UserProfile) this.m), 24);
                tlo0.a aVar6 = tlo0.Companion;
                RequestUserProfile requestUserProfile5 = (RequestUserProfile) this.m;
                pair = new Pair(ogv0Var3, new ogv0(tq.h(aVar6, requestUserProfile5.l0 ? R.string.request_cancel : (requestUserProfile5.m0 || requestUserProfile5.n0) ? R.string.suggest_hide : R.string.request_declined), new c5f(this, 19), null, VkButton.Size.Medium, VkButton.Mode.Secondary, VkButton.Appearance.Accent, !t6(), xo9.r((UserProfile) this.m), 24));
            }
        }
        Drawable h = verifyInfo.Cb() ? VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, this.itemView.getContext(), null, 28) : null;
        tlo0.h d = oq.d(tlo0.Companion, requestUserProfile.e);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        vgv0 vgv0Var = new vgv0(d, (ngv0.a) null, h != null ? new ngv0.a(new eko(h), null, null, null, 12) : null, 1, 2);
        ugv0 ugv0Var2 = (ugv0) pair2.i();
        qgv0 qgv0Var2 = (qgv0) pair2.j();
        MutualInfo mutualInfo = requestUserProfile.d0;
        if (((mutualInfo == null || (num2 = mutualInfo.b) == null) ? requestUserProfile.k0 : num2.intValue()) <= 0 || (userProfileArr = requestUserProfile.j0) == null) {
            aVar2 = null;
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
            tlo0.a aVar7 = tlo0.Companion;
            Context context = this.itemView.getContext();
            RequestUserProfile requestUserProfile6 = (RequestUserProfile) this.m;
            MutualInfo mutualInfo2 = requestUserProfile6.d0;
            tlo0.h d2 = oq.d(aVar7, enj.f(R.plurals.friends_catalog_mutual_friends, (mutualInfo2 == null || (num = mutualInfo2.b) == null) ? requestUserProfile6.k0 : num.intValue(), context));
            TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.END;
            aVar2 = new tgv0.a(arrayList2, null, d2, VkUserStack.Size.Medium, null, 66);
        }
        vkRichCell.setMiddle(new pgv0(vgv0Var, ugv0Var2, qgv0Var2, aVar2, (ogv0) pair.i(), (ogv0) pair.j(), 296));
        int a3 = pvo0.a();
        StringBuilder sb = new StringBuilder("friend_recomm_view:");
        sb.append(requestUserProfile.c);
        sb.append(':');
        String str3 = this.p;
        sb.append(str3);
        sb.append(':');
        sb.append(requestUserProfile.J);
        String sb2 = sb.toString();
        if (!com.vkontakte.android.data.b.i(sb2)) {
            String str4 = requestUserProfile.c + '|' + a3 + "||" + str3 + "||" + requestUserProfile.J;
            b.d dVar = new b.d("show_user_rec");
            dVar.b = true;
            dVar.c = true;
            dVar.b(str4, "user_ids");
            dVar.e();
            com.vkontakte.android.data.b.e(TimeUtils.MILLISECONDS_PER_DAY, sb2);
        }
        u1u0.g(vkRichCell);
    }

    @Override // xsna.pss
    public final void x5() {
    }
}
