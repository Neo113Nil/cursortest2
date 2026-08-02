package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.channelrestrictions.RestrictionBadge;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.modal.Mode;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.profile.design.compose.user.FriendsAndFollowersBlockData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cri;
import xsna.dt1;
import xsna.jdt;
import xsna.lrq0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k71 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k71(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                final com.vk.channelrestrictions.a aVar = (com.vk.channelrestrictions.a) obj5;
                fdj0 fdj0Var = (fdj0) obj4;
                final RestrictionBadge restrictionBadge = (RestrictionBadge) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = com.vk.channelrestrictions.a.g1;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(649099446, intValue, -1, "com.vk.channelrestrictions.AgeRestrictionModal.Content.<anonymous> (AgeRestrictionModal.kt:37)");
                    }
                    Mode mode = Mode.Card;
                    q630 E = ahn.E(q630.a.a, "MODAL_CONTENT");
                    boolean y = aVar2.y(aVar);
                    Object x = aVar2.x();
                    if (y || x == a.C0011a.a) {
                        x = new na(aVar, 3);
                        aVar2.R(x);
                    }
                    a030.b(mode, (gzs) x, E, fdj0Var, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(-482798572, new yzs() { // from class: xsna.m71
                        @Override // xsna.yzs
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj7;
                            int intValue2 = ((Integer) obj8).intValue();
                            int i3 = com.vk.channelrestrictions.a.g1;
                            if (aVar3.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-482798572, intValue2, -1, "com.vk.channelrestrictions.AgeRestrictionModal.Content.<anonymous>.<anonymous> (AgeRestrictionModal.kt:43)");
                                }
                                float f = 16;
                                q630.a aVar4 = q630.a.a;
                                q630 E2 = s200.E(aVar4, f, f);
                                dt1.a.getClass();
                                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar3, 48);
                                int hashCode = Long.hashCode(n34.n(aVar3));
                                sy90 D = aVar3.D();
                                q630 c = qri.c(aVar3, E2);
                                cri.h7.getClass();
                                LayoutNode.a aVar5 = cri.a.b;
                                if (aVar3.N() == null) {
                                    n34.r();
                                    throw null;
                                }
                                aVar3.H();
                                if (aVar3.L()) {
                                    aVar3.I(aVar5);
                                } else {
                                    aVar3.f();
                                }
                                k9q0.w(aVar3, a, cri.a.f);
                                k9q0.w(aVar3, D, cri.a.e);
                                k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                                k9q0.t(aVar3, cri.a.h);
                                k9q0.w(aVar3, c, cri.a.d);
                                qzu0.a.getClass();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1258623458, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationAgeLimit112H> (VkIcons.kt:3536)");
                                }
                                lg90 a2 = pg90.a(R.drawable.vk_icon_illustration_age_limit_112h, 0, aVar3);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                vjw.a(a2, null, ahn.E(aVar4, "AGE_LIMIT_IMAGE"), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar3, 440, 120);
                                RestrictionBadge restrictionBadge2 = RestrictionBadge.OVER_18;
                                RestrictionBadge restrictionBadge3 = restrictionBadge;
                                int i4 = restrictionBadge3 == restrictionBadge2 ? R.string.vk_channel_age_restriction_18_title : R.string.vk_channel_age_restriction_16_title;
                                com.vk.channelrestrictions.a aVar6 = com.vk.channelrestrictions.a.this;
                                float f2 = 8;
                                yqv0.c(aVar6.getString(i4), ahn.E(s200.D(txj0.f(aVar4, 1.0f), f2), "TITLE_TEXT"), wlb0.h(aVar3).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar3).C, aVar3, 48, 0, 8120);
                                yqv0.c(aVar6.getString(restrictionBadge3 == restrictionBadge2 ? R.string.vk_channel_age_restriction_18_description : R.string.vk_channel_age_restriction_16_description), ahn.E(s200.D(txj0.f(aVar4, 1.0f), f2), "DESCRIPTION_TEXT"), wlb0.h(aVar3).getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar3).e0, aVar3, 48, 0, 8120);
                                f9t.e(txj0.h(aVar4, 32), aVar3, 6);
                                q630 E3 = ahn.E(txj0.f(aVar4, 1.0f), "OK_BUTTON");
                                String string = aVar6.getString(R.string.vk_channel_age_restriction_button);
                                ButtonSize buttonSize = ButtonSize.Large;
                                ButtonStyle buttonStyle = ButtonStyle.Primary;
                                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                                boolean y2 = aVar3.y(aVar6);
                                Object x2 = aVar3.x();
                                if (y2 || x2 == a.C0011a.a) {
                                    x2 = new sa0(aVar6, 2);
                                    aVar3.R(x2);
                                }
                                bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E3, null, false, false, null, null, null, string, null, null, null, null, false, null, null, null, aVar3, 28080, 0, 0, 4190176);
                                aVar3.G();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar3.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar2), aVar2, 390, 100663296, 262128);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((ew9) obj5).h((com.vk.ecomm.cart.impl.cart.a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ay9.i((String) obj5, (Integer) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                p8c.b((ArrayList) obj5, (l22) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((g4e) obj5).g((com.vk.clips.favorites.impl.ui.folders.renaming.f) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((m3o) obj5).h((y3o) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((qwo) obj5).i((fwo) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((lat) obj5).j((jdt.a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 8:
                ((Integer) obj2).getClass();
                j710.g((MediaContentItem) obj5, (q630) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((cs70) obj5).h((qs70) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 10:
                ((Integer) obj2).getClass();
                pf80.g(ne7.I(7), (androidx.compose.runtime.a) obj, (izs) obj4, (hh80) obj5, (mc90) obj3);
                break;
            case 11:
                lrq0.b bVar = (lrq0.b) obj5;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-678745775, intValue2, -1, "com.vk.profile.user.impl.dialogs.lego.contextmenu.viewer.UserProfileLegoViewerModalMenu.show.<anonymous> (UserProfileLegoViewerModalMenu.kt:51)");
                    }
                    rrv0.a(null, null, kai.c(149721593, new sa5(bVar, ref$ObjectRef, ref$ObjectRef2, (sp) null), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                com.vk.profile.design.compose.user.a.b((FriendsAndFollowersBlockData) obj5, (jf7) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ k71(com.vk.channelrestrictions.a aVar, fdj0 fdj0Var, RestrictionBadge restrictionBadge) {
        this.b = 0;
        this.c = aVar;
        this.d = fdj0Var;
        this.e = restrictionBadge;
    }

    public /* synthetic */ k71(lrq0.b bVar, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, sp spVar) {
        this.b = 11;
        this.c = bVar;
        this.d = ref$ObjectRef;
        this.e = ref$ObjectRef2;
    }
}
