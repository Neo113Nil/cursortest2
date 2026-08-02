package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.common.links.LinksParserData;
import com.vk.community.design.compose.components.channel.MediaType;
import com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock;
import com.vk.donut.design.compose.banner.InfoBannerIcon;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.common.GroupsSuggestions;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.id.UserId;
import com.vk.dto.community.ReBookingBannerData;
import com.vk.dto.community.entries.widget.Widget;
import com.vk.dto.donut.DonutFriendPreviewUserProfile;
import com.vk.dto.group.GroupAgeMark;
import com.vk.dto.group.GroupChannelBlock;
import com.vk.dto.group.GroupChannelInfo;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboarding;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingBlock;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.photo.Photo;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dto.profile.DonutBanner;
import com.vk.dto.user.UserProfile;
import com.vk.profile.community.impl.ui.item.header.model.CommunityDescriptionItemModel;
import com.vk.profile.community.impl.ui.item.header.model.CommunityTrustMarkItemModel;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.profile.community.impl.ui.suggestions.model.SuggestionVariant;
import com.vk.profile.community.impl.ui.trust_mark.d;
import com.vk.profile.design.compose.buttons.ProfileButtons;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.a;
import com.vk.profile.design.compose.header.b;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.b;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.asg;
import xsna.ddh;
import xsna.e6h;
import xsna.ewh;
import xsna.gwu;
import xsna.jyn;
import xsna.kug;
import xsna.l3h;
import xsna.mdh;
import xsna.r4h;
import xsna.sbd0;
import xsna.tbd0;
import xsna.uwn;
import xsna.v5v;
import xsna.w7h;
import xsna.wfq0;
import xsna.wrg;
import xsna.x7h;
import xsna.xrh;
import xsna.z1h;
import xsna.z4h;

/* compiled from: CommunityProfileCommonMapper.kt */
/* loaded from: classes5.dex */
public final class bfh extends kph {
    public final Context c;
    public final vig0 d;
    public final ctg e;
    public final ynh f;
    public final c g = new c();
    public final b h = new b();
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    /* compiled from: CommunityProfileCommonMapper.kt */
    public interface a {
        boolean a();

        boolean b();

        void c(pvn pvnVar, o9d0 o9d0Var);

        boolean d(r8h r8hVar, boolean z);

        boolean e();

        boolean f();
    }

    /* compiled from: CommunityProfileCommonMapper.kt */
    public final class b implements a {
        public b() {
        }

        @Override // xsna.bfh.a
        public final boolean a() {
            return true;
        }

        @Override // xsna.bfh.a
        public final boolean b() {
            return true;
        }

        @Override // xsna.bfh.a
        public final void c(pvn pvnVar, o9d0 o9d0Var) {
            int i = o9d0Var.f;
            ExtendedCommunityProfile extendedCommunityProfile = o9d0Var.a;
            bfh bfhVar = bfh.this;
            vig0 vig0Var = bfhVar.d;
            if (!o9d0Var.e) {
                pvnVar.g(l3h.c.a(extendedCommunityProfile, vig0Var, i));
                return;
            }
            xrh xrhVar = o9d0Var.d;
            pvnVar.g(new d9h(l3h.c.a(extendedCommunityProfile, vig0Var, i), new gpg(extendedCommunityProfile.a.c, new ctg(bfhVar.c).a(extendedCommunityProfile), extendedCommunityProfile.a1, extendedCommunityProfile.Y, extendedCommunityProfile.Z, w2h.a(extendedCommunityProfile), xrhVar instanceof xrh.d.a ? (xrh.d.a) xrhVar : null)));
        }

        @Override // xsna.bfh.a
        public final boolean d(r8h r8hVar, boolean z) {
            return false;
        }

        @Override // xsna.bfh.a
        public final boolean e() {
            return true;
        }

        @Override // xsna.bfh.a
        public final boolean f() {
            return true;
        }
    }

    /* compiled from: CommunityProfileCommonMapper.kt */
    public final class c implements a {
        public c() {
        }

        @Override // xsna.bfh.a
        public final boolean a() {
            return false;
        }

        @Override // xsna.bfh.a
        public final boolean b() {
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:291:0x01b6, code lost:
        
            if (r8.e == true) goto L175;
         */
        /* JADX WARN: Code restructure failed: missing block: B:310:0x01e1, code lost:
        
            if (r8.g == true) goto L172;
         */
        /* JADX WARN: Code restructure failed: missing block: B:356:0x0122, code lost:
        
            if (r3.Z == 2) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:359:0x0129, code lost:
        
            if (r3.Z == 1) goto L65;
         */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0433  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x044c  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0455  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0460  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x0478  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x048c  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x04a0  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x04a9  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x057e  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0581  */
        /* JADX WARN: Removed duplicated region for block: B:153:0x04ae  */
        /* JADX WARN: Removed duplicated region for block: B:189:0x04a6  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x0457  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:236:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:273:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:284:0x01a4  */
        /* JADX WARN: Removed duplicated region for block: B:286:0x01a7  */
        /* JADX WARN: Removed duplicated region for block: B:289:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:324:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:325:0x01aa  */
        /* JADX WARN: Removed duplicated region for block: B:326:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:330:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x02c3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x02ce  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x02d9  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x02e8  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x02eb  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0308  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x05ab  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x05c0 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x05af  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x030f  */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.bfh.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void c(pvn pvnVar, o9d0 o9d0Var) {
            AuthorHeaderConfig.Author.AuthorState authorState;
            boolean z;
            int i;
            boolean z2;
            com.vk.profile.design.compose.header.a bVar;
            com.vk.profile.design.compose.header.a c1660a;
            boolean z3;
            com.vk.profile.design.compose.header.b bVar2;
            AuthorHeaderConfig.Header.Main main;
            AuthorHeaderConfig.Header.Main.Name name;
            boolean z4;
            AuthorHeaderConfig.Header.Main.Name.Default.Verification verification;
            boolean z5;
            mp80 mp80Var;
            String string;
            AuthorHeaderConfig.Header.Main.Subtitle.a aVar;
            com.vk.profile.design.compose.header.b bVar3;
            ProfileButtons.a aVar2;
            ProfileButtons profileButtons;
            ListBuilder g;
            AuthorHeaderConfig.Header.Main main2;
            com.vk.profile.design.compose.header.b bVar4;
            boolean z6;
            String b;
            AuthorHeaderConfig.Info.InfoSlotData.g gVar;
            GroupMarketInfo groupMarketInfo;
            GroupMarketInfo.CommunityTrustMarks communityTrustMarks;
            GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark;
            AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type type;
            AuthorHeaderConfig.Info.InfoSlotData.TrustTag trustTag;
            AuthorHeaderConfig.Info.InfoSlotData.h hVar;
            AuthorHeaderConfig.Info.InfoSlotData.d dVar;
            AuthorHeaderConfig.Info.InfoSlotData.e eVar;
            AuthorHeaderConfig.Info.InfoSlotData.a aVar3;
            AuthorHeaderConfig.Info info;
            int intValue;
            List list;
            AuthorHeaderConfig.Info.b aVar4;
            ArrayList<UserProfile> arrayList;
            int i2;
            String str;
            Integer num;
            String str2;
            int i3;
            AuthorHeaderConfig.Info.a aVar5;
            AuthorHeaderConfig.Info.a aVar6;
            int i4;
            int i5;
            String str3;
            String str4;
            int i6;
            int i7;
            AuthorHeaderConfig.Viewer.ViewerRole viewerRole;
            zph zphVar = (zph) bfh.this.j.getValue();
            ExtendedCommunityProfile extendedCommunityProfile = o9d0Var.a;
            r8h r8hVar = o9d0Var.b;
            e6h e6hVar = o9d0Var.c;
            List<String> list2 = o9d0Var.g;
            asg asgVar = zphVar.a;
            Context context = asgVar.a;
            asgVar.d.getClass();
            x7h.a a = x7h.a(extendedCommunityProfile);
            x7h.a.C3982a c3982a = x7h.a.C3982a.a;
            if (epx.f(a, c3982a)) {
                authorState = AuthorHeaderConfig.Author.AuthorState.Blocked;
            } else if (epx.f(a, x7h.a.b.a)) {
                authorState = AuthorHeaderConfig.Author.AuthorState.Default;
            } else if (a instanceof x7h.a.d) {
                authorState = AuthorHeaderConfig.Author.AuthorState.Default;
            } else {
                if (!(a instanceof x7h.a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                w7h w7hVar = ((x7h.a.c) a).a;
                if (w7hVar instanceof w7h.b) {
                    authorState = AuthorHeaderConfig.Author.AuthorState.Blocked;
                } else if (epx.f(w7hVar, w7h.d.a)) {
                    authorState = AuthorHeaderConfig.Author.AuthorState.Private;
                } else if (epx.f(w7hVar, w7h.a.a)) {
                    authorState = AuthorHeaderConfig.Author.AuthorState.Closed;
                } else {
                    if (!(w7hVar instanceof w7h.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    authorState = AuthorHeaderConfig.Author.AuthorState.Default;
                }
            }
            ComFeatures comFeatures = ComFeatures.COM_LEGO_BUTTONS_REDESIGN;
            comFeatures.getClass();
            com.vk.toggle.b bVar5 = com.vk.toggle.b.A;
            if (!bVar5.a(comFeatures) && !epx.f(a, c3982a)) {
                if (epx.f(a, x7h.a.b.a)) {
                    z = epx.f(e6hVar, e6h.b.a);
                } else if (!(a instanceof x7h.a.d)) {
                    if (!(a instanceof x7h.a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    w7h w7hVar2 = ((x7h.a.c) a).a;
                    if (!(w7hVar2 instanceof w7h.b) && !(w7hVar2 instanceof w7h.c)) {
                        if (!epx.f(w7hVar2, w7h.d.a) && !epx.f(w7hVar2, w7h.a.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (extendedCommunityProfile.z1 != null || (((i = extendedCommunityProfile.Y) != 0 || extendedCommunityProfile.Z != 2) && (i != 1 || extendedCommunityProfile.Z != 1))) {
                            z = false;
                        }
                    }
                }
                if (!epx.f(a, c3982a)) {
                    if (!epx.f(a, x7h.a.b.a) && !(a instanceof x7h.a.d)) {
                        if (!(a instanceof x7h.a.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        w7h w7hVar3 = ((x7h.a.c) a).a;
                        if (!(w7hVar3 instanceof w7h.b)) {
                            if (epx.f(w7hVar3, w7h.d.a) || epx.f(w7hVar3, w7h.a.a)) {
                                if (extendedCommunityProfile.z1 == null) {
                                    int i8 = extendedCommunityProfile.Y;
                                    if (i8 == 0) {
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                            } else if (!(w7hVar3 instanceof w7h.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    z2 = false;
                    if (extendedCommunityProfile.n0) {
                        List a2 = asg.a(extendedCommunityProfile, list2);
                        if (!a2.isEmpty()) {
                            c1660a = new a.C1660a(a2);
                            List b2 = asg.b(r8hVar);
                            if (r8hVar != null || b2.isEmpty()) {
                                z3 = z2;
                                bVar2 = b.a.a;
                            } else {
                                z3 = z2;
                                bVar2 = new b.C1661b(b2, r8hVar.i, b2.size() > 1, 8);
                            }
                            if (authorState == AuthorHeaderConfig.Author.AuthorState.Private || w2h.a(extendedCommunityProfile)) {
                                UserProfile userProfile = extendedCommunityProfile.a;
                                String str5 = userProfile == null ? userProfile.e : null;
                                String str6 = str5 != null ? str5 : "";
                                VerifyInfo verifyInfo = userProfile == null ? userProfile.B : null;
                                if (extendedCommunityProfile.a3) {
                                    if (verifyInfo != null) {
                                        z4 = z;
                                        z5 = true;
                                    } else {
                                        z4 = z;
                                        z5 = true;
                                    }
                                    if (extendedCommunityProfile.Z2 || (verifyInfo != null && verifyInfo.f == z5)) {
                                        verification = AuthorHeaderConfig.Header.Main.Name.Default.Verification.ConfirmedBusiness;
                                    } else if (verifyInfo != null && verifyInfo.d == z5) {
                                        verification = AuthorHeaderConfig.Header.Main.Name.Default.Verification.Confirmed;
                                    } else if (extendedCommunityProfile.B2) {
                                        verification = AuthorHeaderConfig.Header.Main.Name.Default.Verification.NcoOrganization;
                                    } else {
                                        if (!extendedCommunityProfile.A2) {
                                            boolean z7 = verifyInfo != null ? true : true;
                                            verification = extendedCommunityProfile.z2 ? AuthorHeaderConfig.Header.Main.Name.Default.Verification.Government : (verifyInfo == null || verifyInfo.b != z7) ? null : AuthorHeaderConfig.Header.Main.Name.Default.Verification.Verified;
                                        }
                                        verification = AuthorHeaderConfig.Header.Main.Name.Default.Verification.NcoOrganization;
                                    }
                                    name = new AuthorHeaderConfig.Header.Main.Name.Default(str6, null, null, verification);
                                } else {
                                    z4 = z;
                                }
                                verification = AuthorHeaderConfig.Header.Main.Name.Default.Verification.PremiumBusiness;
                                name = new AuthorHeaderConfig.Header.Main.Name.Default(str6, null, null, verification);
                            } else {
                                name = AuthorHeaderConfig.Header.Main.Name.a.a;
                                z4 = z;
                            }
                            mp80Var = extendedCommunityProfile.f2;
                            if (mp80Var != null) {
                                int i9 = mp80Var.a;
                                if (i9 == 1) {
                                    string = context.getString(R.string.community_reply_status_online);
                                } else if (i9 == 2) {
                                    string = enj.f(R.plurals.community_reply_minutes, mp80Var.b, context);
                                }
                                aVar = new AuthorHeaderConfig.Header.Main.Subtitle.a(string);
                                if (z4) {
                                    bVar3 = bVar2;
                                } else {
                                    zrg zrgVar = asgVar.c;
                                    zrgVar.getClass();
                                    if (extendedCommunityProfile.a0 < 2) {
                                        bVar3 = bVar2;
                                        ProfileButtons.a b3 = zrg.b(extendedCommunityProfile);
                                        int i10 = extendedCommunityProfile.a1;
                                        if (i10 == 4) {
                                            profileButtons = zrgVar.a(extendedCommunityProfile, b3, e6h.c.a);
                                        } else if (i10 == 1 || i10 == 2 || i10 == 4) {
                                            if (extendedCommunityProfile.e0) {
                                                aVar2 = new ProfileButtons.a(ProfileButtons.ButtonType.Message, null, null, 6);
                                            } else if (b3 != null) {
                                                aVar2 = b3;
                                            }
                                            if (!extendedCommunityProfile.e0) {
                                                b3 = null;
                                            }
                                            profileButtons = new ProfileButtons(aVar2, b3, extendedCommunityProfile.j1 ? ProfileButtons.ButtonType.BellChecked : ProfileButtons.ButtonType.BellUnChecked, 8);
                                        } else {
                                            profileButtons = zrgVar.a(extendedCommunityProfile, b3, e6hVar);
                                        }
                                        main = new AuthorHeaderConfig.Header.Main(name, aVar, null, profileButtons);
                                        ListBuilder e = e43.e();
                                        if (extendedCommunityProfile.S1 != null) {
                                        }
                                        if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_18) {
                                        }
                                        if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_16) {
                                        }
                                        g = e.g();
                                        if (g.isEmpty()) {
                                        }
                                        if (r8hVar == null) {
                                        }
                                        main2 = main;
                                        bVar4 = bVar3;
                                        z6 = false;
                                        AuthorHeaderConfig.Header header = new AuthorHeaderConfig.Header(c1660a, bVar4, main2, g, z6);
                                        if (z3) {
                                        }
                                        i6 = extendedCommunityProfile.a0;
                                        if (i6 >= i5) {
                                        }
                                        i7 = 1;
                                        int i11 = extendedCommunityProfile.a1;
                                        csg csgVar = new csg(new AuthorHeaderConfig(header, info, new AuthorHeaderConfig.Viewer(viewerRole, (i11 != i7 || i11 == i4) ? AuthorHeaderConfig.Viewer.RelationToAuthor.Subscriber : AuthorHeaderConfig.Viewer.RelationToAuthor.None), new AuthorHeaderConfig.Author(AuthorHeaderConfig.Author.AuthorType.Community, authorState, AuthorHeaderConfig.Author.AuthorSex.Unknown)), extendedCommunityProfile);
                                        csgVar.a = true;
                                        pvnVar.g(csgVar);
                                    }
                                    if (extendedCommunityProfile.k2) {
                                        ProfileButtons.ButtonType buttonType = ProfileButtons.ButtonType.Messages;
                                        int i12 = extendedCommunityProfile.i2;
                                        Integer valueOf = Integer.valueOf(i12);
                                        if (i12 <= 0) {
                                            valueOf = null;
                                        }
                                        bVar3 = bVar2;
                                        ProfileButtons.a aVar7 = new ProfileButtons.a(buttonType, valueOf, null, 4);
                                        ProfileButtons.a b4 = zrg.b(extendedCommunityProfile);
                                        profileButtons = new ProfileButtons(aVar7, null, b4 != null ? b4.a : null, 8);
                                        main = new AuthorHeaderConfig.Header.Main(name, aVar, null, profileButtons);
                                        ListBuilder e2 = e43.e();
                                        if (extendedCommunityProfile.S1 != null) {
                                            e2.add(AuthorHeaderConfig.Header.a.C1655a.a);
                                        }
                                        if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_18) {
                                            e2.add(AuthorHeaderConfig.Header.a.c.a);
                                        }
                                        if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_16) {
                                            e2.add(AuthorHeaderConfig.Header.a.b.a);
                                        }
                                        g = e2.g();
                                        if (g.isEmpty()) {
                                            g = null;
                                        }
                                        if (r8hVar == null && r8hVar.d) {
                                            main2 = main;
                                            bVar4 = bVar3;
                                            z6 = true;
                                        } else {
                                            main2 = main;
                                            bVar4 = bVar3;
                                            z6 = false;
                                        }
                                        AuthorHeaderConfig.Header header2 = new AuthorHeaderConfig.Header(c1660a, bVar4, main2, g, z6);
                                        if (z3) {
                                            info = AuthorHeaderConfig.Info.g;
                                            i5 = 3;
                                            i4 = 2;
                                        } else {
                                            ListBuilder e3 = e43.e();
                                            boolean z8 = extendedCommunityProfile.y2 || extendedCommunityProfile.x2;
                                            HashMap<String, Integer> hashMap = extendedCommunityProfile.Z0;
                                            AuthorHeaderConfig.Info.InfoSlotData.f fVar = (z8 && w2h.a(extendedCommunityProfile) && ((str3 = extendedCommunityProfile.V) == null || drm0.N(str3)) && (((str4 = extendedCommunityProfile.t0) == null || drm0.N(str4)) && !extendedCommunityProfile.a2 && extendedCommunityProfile.Z1 == 0)) ? AuthorHeaderConfig.Info.InfoSlotData.f.a : null;
                                            if (fVar != null) {
                                                e3.add(fVar);
                                            }
                                            int i13 = extendedCommunityProfile.T;
                                            int i14 = extendedCommunityProfile.U;
                                            if (i13 == 0 && i14 == 0) {
                                                gVar = null;
                                            } else {
                                                if (i13 > pvo0.a() || i14 > pvo0.a()) {
                                                    StringBuilder sb = new StringBuilder();
                                                    if (i13 > 0) {
                                                        sb.append(pvo0.i(true, i13, false, false));
                                                    }
                                                    if (i14 > 0) {
                                                        sb.append(" - ");
                                                        Calendar calendar = Calendar.getInstance();
                                                        calendar.setTimeInMillis(i13 * 1000);
                                                        Calendar calendar2 = Calendar.getInstance();
                                                        calendar2.setTimeInMillis(i14 * 1000);
                                                        if (c09.c(calendar, calendar2)) {
                                                            sb.append(pvo0.c(i14));
                                                        } else {
                                                            sb.append(pvo0.i(true, i14, false, false));
                                                        }
                                                    }
                                                    b = cqm0.b(sb.toString());
                                                } else {
                                                    b = i14 == 0 ? context.getString(R.string.community_event_past, pvo0.i(false, i13, false, false)) : context.getString(R.string.community_event_past_with_end_date, pvo0.i(false, i14, false, false));
                                                }
                                                gVar = new AuthorHeaderConfig.Info.InfoSlotData.g(b);
                                            }
                                            if (gVar != null) {
                                                e3.add(gVar);
                                            }
                                            ComFeatures comFeatures2 = ComFeatures.COM_TRUST_MARKS_AB;
                                            comFeatures2.getClass();
                                            if (!bVar5.a(comFeatures2) && (groupMarketInfo = extendedCommunityProfile.J2) != null && (communityTrustMarks = groupMarketInfo.i) != null && (communityTrustMark = communityTrustMarks.b) != null) {
                                                switch (asg.a.$EnumSwitchMapping$0[communityTrustMark.b.ordinal()]) {
                                                    case 1:
                                                        type = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.Popular;
                                                        break;
                                                    case 2:
                                                        type = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.FriendsBuy;
                                                        break;
                                                    case 3:
                                                        type = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.VerifyBusiness;
                                                        break;
                                                    case 4:
                                                        type = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.YClients;
                                                        break;
                                                    case 5:
                                                        type = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.Ozon;
                                                        break;
                                                    case 6:
                                                        type = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.FreeDelivery;
                                                        break;
                                                    case 7:
                                                        type = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.SelfPickup;
                                                        break;
                                                    case 8:
                                                    case 9:
                                                        type = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.Delivery;
                                                        break;
                                                    case 10:
                                                        type = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.VKAge;
                                                        break;
                                                    case 11:
                                                        type = AuthorHeaderConfig.Info.InfoSlotData.TrustTag.Type.None;
                                                        break;
                                                    default:
                                                        type = null;
                                                        break;
                                                }
                                                if (type != null) {
                                                    trustTag = new AuthorHeaderConfig.Info.InfoSlotData.TrustTag(communityTrustMark.c, type);
                                                    if (trustTag != null) {
                                                        e3.add(trustTag);
                                                    }
                                                    String str7 = extendedCommunityProfile.V;
                                                    hVar = (str7 != null || drm0.N(str7)) ? null : new AuthorHeaderConfig.Info.InfoSlotData.h(extendedCommunityProfile.V);
                                                    if (hVar != null) {
                                                        e3.add(hVar);
                                                    }
                                                    dVar = extendedCommunityProfile.d() ? null : new AuthorHeaderConfig.Info.InfoSlotData.d(extendedCommunityProfile.b0);
                                                    if (dVar != null) {
                                                        e3.add(dVar);
                                                    }
                                                    String str8 = extendedCommunityProfile.c0;
                                                    eVar = (str8 != null || str8.isEmpty()) ? null : new AuthorHeaderConfig.Info.InfoSlotData.e(extendedCommunityProfile.c0);
                                                    if (eVar != null) {
                                                        e3.add(eVar);
                                                    }
                                                    String str9 = extendedCommunityProfile.O0;
                                                    aVar3 = (str9 != null || str9.length() == 0) ? AuthorHeaderConfig.Info.InfoSlotData.a.a : null;
                                                    if (aVar3 != null) {
                                                        e3.add(aVar3);
                                                    }
                                                    ListBuilder g2 = e3.g();
                                                    Integer num2 = hashMap.get("members");
                                                    intValue = num2 == null ? num2.intValue() : 0;
                                                    if (intValue != 0) {
                                                        aVar4 = AuthorHeaderConfig.Info.b.C1659b.a;
                                                    } else {
                                                        boolean f = bwd0.f(extendedCommunityProfile);
                                                        int intValue2 = (f || (num = hashMap.get("friends_members")) == null) ? 0 : num.intValue();
                                                        if (f || intValue2 <= 0) {
                                                            list = EmptyList.b;
                                                        } else {
                                                            ArrayList<UserProfile> arrayList2 = extendedCommunityProfile.I;
                                                            if (arrayList2 == null) {
                                                                list = EmptyList.b;
                                                            } else {
                                                                ListBuilder e4 = e43.e();
                                                                int min = Math.min(3, arrayList2.size());
                                                                int i15 = 0;
                                                                while (i15 < min) {
                                                                    Image image = arrayList2.get(i15).O;
                                                                    if (image != null) {
                                                                        arrayList = arrayList2;
                                                                        i2 = min;
                                                                        ImageSize Cb = image.Cb(50, true, false);
                                                                        if (Cb != null && (str = Cb.d.d) != null) {
                                                                            if (drm0.N(str)) {
                                                                                str = null;
                                                                            }
                                                                            if (str != null) {
                                                                                e4.add(str);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        arrayList = arrayList2;
                                                                        i2 = min;
                                                                    }
                                                                    i15++;
                                                                    arrayList2 = arrayList;
                                                                    min = i2;
                                                                }
                                                                list = e4.g();
                                                            }
                                                        }
                                                        aVar4 = new AuthorHeaderConfig.Info.b.a(0, intValue, intValue2, list, false);
                                                    }
                                                    str2 = extendedCommunityProfile.O0;
                                                    if (str2 == null && !drm0.N(str2)) {
                                                        ucp ucpVar = ucp.a;
                                                        aVar6 = new AuthorHeaderConfig.Info.a.b(ucp.i(asgVar.b.d(brm0.y(cqm0.d(str2), "\n", " "), new LinksParserData(0, (Bundle) null, 0, R.attr.vk_ui_text_accent, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16375))));
                                                    } else if (w2h.a(extendedCommunityProfile)) {
                                                        i3 = 0;
                                                        aVar5 = null;
                                                        i4 = 2;
                                                        i5 = 3;
                                                        info = new AuthorHeaderConfig.Info(aVar4, aVar5, (AuthorHeaderConfig.Info.InfoSlotData) j5g.b0(i3, g2), (AuthorHeaderConfig.Info.InfoSlotData) j5g.b0(1, g2), (AuthorHeaderConfig.Info.InfoSlotData) j5g.b0(2, g2), (AuthorHeaderConfig.Info.InfoSlotData) j5g.b0(3, g2));
                                                    } else {
                                                        aVar6 = AuthorHeaderConfig.Info.a.C1658a.a;
                                                    }
                                                    aVar5 = aVar6;
                                                    i3 = 0;
                                                    i4 = 2;
                                                    i5 = 3;
                                                    info = new AuthorHeaderConfig.Info(aVar4, aVar5, (AuthorHeaderConfig.Info.InfoSlotData) j5g.b0(i3, g2), (AuthorHeaderConfig.Info.InfoSlotData) j5g.b0(1, g2), (AuthorHeaderConfig.Info.InfoSlotData) j5g.b0(2, g2), (AuthorHeaderConfig.Info.InfoSlotData) j5g.b0(3, g2));
                                                }
                                            }
                                            trustTag = null;
                                            if (trustTag != null) {
                                            }
                                            String str72 = extendedCommunityProfile.V;
                                            if (str72 != null) {
                                            }
                                            if (hVar != null) {
                                            }
                                            if (extendedCommunityProfile.d()) {
                                            }
                                            if (dVar != null) {
                                            }
                                            String str82 = extendedCommunityProfile.c0;
                                            if (str82 != null) {
                                            }
                                            if (eVar != null) {
                                            }
                                            String str92 = extendedCommunityProfile.O0;
                                            if (str92 != null) {
                                            }
                                            if (aVar3 != null) {
                                            }
                                            ListBuilder g22 = e3.g();
                                            Integer num22 = hashMap.get("members");
                                            if (num22 == null) {
                                            }
                                            if (intValue != 0) {
                                            }
                                            str2 = extendedCommunityProfile.O0;
                                            if (str2 == null) {
                                            }
                                            if (w2h.a(extendedCommunityProfile)) {
                                            }
                                        }
                                        i6 = extendedCommunityProfile.a0;
                                        if (i6 >= i5) {
                                            viewerRole = AuthorHeaderConfig.Viewer.ViewerRole.Admin;
                                        } else {
                                            if (i6 < i4) {
                                                i7 = 1;
                                                viewerRole = i6 >= 1 ? AuthorHeaderConfig.Viewer.ViewerRole.Moderator : AuthorHeaderConfig.Viewer.ViewerRole.None;
                                                int i112 = extendedCommunityProfile.a1;
                                                csg csgVar2 = new csg(new AuthorHeaderConfig(header2, info, new AuthorHeaderConfig.Viewer(viewerRole, (i112 != i7 || i112 == i4) ? AuthorHeaderConfig.Viewer.RelationToAuthor.Subscriber : AuthorHeaderConfig.Viewer.RelationToAuthor.None), new AuthorHeaderConfig.Author(AuthorHeaderConfig.Author.AuthorType.Community, authorState, AuthorHeaderConfig.Author.AuthorSex.Unknown)), extendedCommunityProfile);
                                                csgVar2.a = true;
                                                pvnVar.g(csgVar2);
                                            }
                                            viewerRole = AuthorHeaderConfig.Viewer.ViewerRole.Editor;
                                        }
                                        i7 = 1;
                                        int i1122 = extendedCommunityProfile.a1;
                                        csg csgVar22 = new csg(new AuthorHeaderConfig(header2, info, new AuthorHeaderConfig.Viewer(viewerRole, (i1122 != i7 || i1122 == i4) ? AuthorHeaderConfig.Viewer.RelationToAuthor.Subscriber : AuthorHeaderConfig.Viewer.RelationToAuthor.None), new AuthorHeaderConfig.Author(AuthorHeaderConfig.Author.AuthorType.Community, authorState, AuthorHeaderConfig.Author.AuthorSex.Unknown)), extendedCommunityProfile);
                                        csgVar22.a = true;
                                        pvnVar.g(csgVar22);
                                    }
                                    bVar3 = bVar2;
                                }
                                profileButtons = null;
                                main = new AuthorHeaderConfig.Header.Main(name, aVar, null, profileButtons);
                                ListBuilder e22 = e43.e();
                                if (extendedCommunityProfile.S1 != null) {
                                }
                                if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_18) {
                                }
                                if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_16) {
                                }
                                g = e22.g();
                                if (g.isEmpty()) {
                                }
                                if (r8hVar == null) {
                                }
                                main2 = main;
                                bVar4 = bVar3;
                                z6 = false;
                                AuthorHeaderConfig.Header header22 = new AuthorHeaderConfig.Header(c1660a, bVar4, main2, g, z6);
                                if (z3) {
                                }
                                i6 = extendedCommunityProfile.a0;
                                if (i6 >= i5) {
                                }
                                i7 = 1;
                                int i11222 = extendedCommunityProfile.a1;
                                csg csgVar222 = new csg(new AuthorHeaderConfig(header22, info, new AuthorHeaderConfig.Viewer(viewerRole, (i11222 != i7 || i11222 == i4) ? AuthorHeaderConfig.Viewer.RelationToAuthor.Subscriber : AuthorHeaderConfig.Viewer.RelationToAuthor.None), new AuthorHeaderConfig.Author(AuthorHeaderConfig.Author.AuthorType.Community, authorState, AuthorHeaderConfig.Author.AuthorSex.Unknown)), extendedCommunityProfile);
                                csgVar222.a = true;
                                pvnVar.g(csgVar222);
                            }
                            aVar = null;
                            if (z4) {
                            }
                            profileButtons = null;
                            main = new AuthorHeaderConfig.Header.Main(name, aVar, null, profileButtons);
                            ListBuilder e222 = e43.e();
                            if (extendedCommunityProfile.S1 != null) {
                            }
                            if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_18) {
                            }
                            if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_16) {
                            }
                            g = e222.g();
                            if (g.isEmpty()) {
                            }
                            if (r8hVar == null) {
                            }
                            main2 = main;
                            bVar4 = bVar3;
                            z6 = false;
                            AuthorHeaderConfig.Header header222 = new AuthorHeaderConfig.Header(c1660a, bVar4, main2, g, z6);
                            if (z3) {
                            }
                            i6 = extendedCommunityProfile.a0;
                            if (i6 >= i5) {
                            }
                            i7 = 1;
                            int i112222 = extendedCommunityProfile.a1;
                            csg csgVar2222 = new csg(new AuthorHeaderConfig(header222, info, new AuthorHeaderConfig.Viewer(viewerRole, (i112222 != i7 || i112222 == i4) ? AuthorHeaderConfig.Viewer.RelationToAuthor.Subscriber : AuthorHeaderConfig.Viewer.RelationToAuthor.None), new AuthorHeaderConfig.Author(AuthorHeaderConfig.Author.AuthorType.Community, authorState, AuthorHeaderConfig.Author.AuthorSex.Unknown)), extendedCommunityProfile);
                            csgVar2222.a = true;
                            pvnVar.g(csgVar2222);
                        }
                        bVar = new a.b("");
                    } else {
                        String str10 = extendedCommunityProfile.j;
                        if (str10 == null) {
                            str10 = "";
                        }
                        bVar = new a.b(str10);
                    }
                    c1660a = bVar;
                    List b22 = asg.b(r8hVar);
                    if (r8hVar != null) {
                    }
                    z3 = z2;
                    bVar2 = b.a.a;
                    if (authorState == AuthorHeaderConfig.Author.AuthorState.Private) {
                    }
                    UserProfile userProfile2 = extendedCommunityProfile.a;
                    if (userProfile2 == null) {
                    }
                    if (str5 != null) {
                    }
                    if (userProfile2 == null) {
                    }
                    if (extendedCommunityProfile.a3) {
                    }
                    verification = AuthorHeaderConfig.Header.Main.Name.Default.Verification.PremiumBusiness;
                    name = new AuthorHeaderConfig.Header.Main.Name.Default(str6, null, null, verification);
                    mp80Var = extendedCommunityProfile.f2;
                    if (mp80Var != null) {
                    }
                    aVar = null;
                    if (z4) {
                    }
                    profileButtons = null;
                    main = new AuthorHeaderConfig.Header.Main(name, aVar, null, profileButtons);
                    ListBuilder e2222 = e43.e();
                    if (extendedCommunityProfile.S1 != null) {
                    }
                    if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_18) {
                    }
                    if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_16) {
                    }
                    g = e2222.g();
                    if (g.isEmpty()) {
                    }
                    if (r8hVar == null) {
                    }
                    main2 = main;
                    bVar4 = bVar3;
                    z6 = false;
                    AuthorHeaderConfig.Header header2222 = new AuthorHeaderConfig.Header(c1660a, bVar4, main2, g, z6);
                    if (z3) {
                    }
                    i6 = extendedCommunityProfile.a0;
                    if (i6 >= i5) {
                    }
                    i7 = 1;
                    int i1122222 = extendedCommunityProfile.a1;
                    csg csgVar22222 = new csg(new AuthorHeaderConfig(header2222, info, new AuthorHeaderConfig.Viewer(viewerRole, (i1122222 != i7 || i1122222 == i4) ? AuthorHeaderConfig.Viewer.RelationToAuthor.Subscriber : AuthorHeaderConfig.Viewer.RelationToAuthor.None), new AuthorHeaderConfig.Author(AuthorHeaderConfig.Author.AuthorType.Community, authorState, AuthorHeaderConfig.Author.AuthorSex.Unknown)), extendedCommunityProfile);
                    csgVar22222.a = true;
                    pvnVar.g(csgVar22222);
                }
                z2 = true;
                if (extendedCommunityProfile.n0) {
                }
                c1660a = bVar;
                List b222 = asg.b(r8hVar);
                if (r8hVar != null) {
                }
                z3 = z2;
                bVar2 = b.a.a;
                if (authorState == AuthorHeaderConfig.Author.AuthorState.Private) {
                }
                UserProfile userProfile22 = extendedCommunityProfile.a;
                if (userProfile22 == null) {
                }
                if (str5 != null) {
                }
                if (userProfile22 == null) {
                }
                if (extendedCommunityProfile.a3) {
                }
                verification = AuthorHeaderConfig.Header.Main.Name.Default.Verification.PremiumBusiness;
                name = new AuthorHeaderConfig.Header.Main.Name.Default(str6, null, null, verification);
                mp80Var = extendedCommunityProfile.f2;
                if (mp80Var != null) {
                }
                aVar = null;
                if (z4) {
                }
                profileButtons = null;
                main = new AuthorHeaderConfig.Header.Main(name, aVar, null, profileButtons);
                ListBuilder e22222 = e43.e();
                if (extendedCommunityProfile.S1 != null) {
                }
                if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_18) {
                }
                if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_16) {
                }
                g = e22222.g();
                if (g.isEmpty()) {
                }
                if (r8hVar == null) {
                }
                main2 = main;
                bVar4 = bVar3;
                z6 = false;
                AuthorHeaderConfig.Header header22222 = new AuthorHeaderConfig.Header(c1660a, bVar4, main2, g, z6);
                if (z3) {
                }
                i6 = extendedCommunityProfile.a0;
                if (i6 >= i5) {
                }
                i7 = 1;
                int i11222222 = extendedCommunityProfile.a1;
                csg csgVar222222 = new csg(new AuthorHeaderConfig(header22222, info, new AuthorHeaderConfig.Viewer(viewerRole, (i11222222 != i7 || i11222222 == i4) ? AuthorHeaderConfig.Viewer.RelationToAuthor.Subscriber : AuthorHeaderConfig.Viewer.RelationToAuthor.None), new AuthorHeaderConfig.Author(AuthorHeaderConfig.Author.AuthorType.Community, authorState, AuthorHeaderConfig.Author.AuthorSex.Unknown)), extendedCommunityProfile);
                csgVar222222.a = true;
                pvnVar.g(csgVar222222);
            }
            z = true;
            if (!epx.f(a, c3982a)) {
            }
            z2 = true;
            if (extendedCommunityProfile.n0) {
            }
            c1660a = bVar;
            List b2222 = asg.b(r8hVar);
            if (r8hVar != null) {
            }
            z3 = z2;
            bVar2 = b.a.a;
            if (authorState == AuthorHeaderConfig.Author.AuthorState.Private) {
            }
            UserProfile userProfile222 = extendedCommunityProfile.a;
            if (userProfile222 == null) {
            }
            if (str5 != null) {
            }
            if (userProfile222 == null) {
            }
            if (extendedCommunityProfile.a3) {
            }
            verification = AuthorHeaderConfig.Header.Main.Name.Default.Verification.PremiumBusiness;
            name = new AuthorHeaderConfig.Header.Main.Name.Default(str6, null, null, verification);
            mp80Var = extendedCommunityProfile.f2;
            if (mp80Var != null) {
            }
            aVar = null;
            if (z4) {
            }
            profileButtons = null;
            main = new AuthorHeaderConfig.Header.Main(name, aVar, null, profileButtons);
            ListBuilder e222222 = e43.e();
            if (extendedCommunityProfile.S1 != null) {
            }
            if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_18) {
            }
            if (extendedCommunityProfile.O2 == GroupAgeMark.OVER_16) {
            }
            g = e222222.g();
            if (g.isEmpty()) {
            }
            if (r8hVar == null) {
            }
            main2 = main;
            bVar4 = bVar3;
            z6 = false;
            AuthorHeaderConfig.Header header222222 = new AuthorHeaderConfig.Header(c1660a, bVar4, main2, g, z6);
            if (z3) {
            }
            i6 = extendedCommunityProfile.a0;
            if (i6 >= i5) {
            }
            i7 = 1;
            int i112222222 = extendedCommunityProfile.a1;
            csg csgVar2222222 = new csg(new AuthorHeaderConfig(header222222, info, new AuthorHeaderConfig.Viewer(viewerRole, (i112222222 != i7 || i112222222 == i4) ? AuthorHeaderConfig.Viewer.RelationToAuthor.Subscriber : AuthorHeaderConfig.Viewer.RelationToAuthor.None), new AuthorHeaderConfig.Author(AuthorHeaderConfig.Author.AuthorType.Community, authorState, AuthorHeaderConfig.Author.AuthorSex.Unknown)), extendedCommunityProfile);
            csgVar2222222.a = true;
            pvnVar.g(csgVar2222222);
        }

        @Override // xsna.bfh.a
        public final boolean d(r8h r8hVar, boolean z) {
            return z && r8hVar != null && r8hVar.d;
        }

        @Override // xsna.bfh.a
        public final boolean e() {
            return false;
        }

        @Override // xsna.bfh.a
        public final boolean f() {
            return false;
        }
    }

    /* compiled from: CommunityProfileCommonMapper.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupContentTabType.values().length];
            try {
                iArr[GroupContentTabType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupContentTabType.MARKET_ALBUMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupContentTabType.SERVICES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupContentTabType.PHOTOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GroupContentTabType.VIDEOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GroupContentTabType.AUDIOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GroupContentTabType.CHATS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GroupContentTabType.SHORT_VIDEOS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GroupContentTabType.FILES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GroupContentTabType.DISCUSSIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GroupContentTabType.ARTICLES.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GroupContentTabType.PODCASTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[GroupContentTabType.ROOMS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[GroupContentTabType.EVENTS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[GroupContentTabType.CHANNEL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[GroupContentTabType.NARRATIVES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bfh(Context context, vig0 vig0Var, ctg ctgVar, ynh ynhVar) {
        this.c = context;
        this.d = vig0Var;
        this.e = ctgVar;
        this.f = ynhVar;
        i9 i9Var = new i9(17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.i = msy.a(lazyThreadSafetyMode, i9Var);
        this.j = msy.a(lazyThreadSafetyMode, new qc(this, 27));
        this.k = msy.a(lazyThreadSafetyMode, new pd4(7));
        this.l = msy.a(lazyThreadSafetyMode, new ml7(4));
        this.m = msy.a(lazyThreadSafetyMode, new qo0(10));
        this.n = msy.a(lazyThreadSafetyMode, new uw3(12));
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0661 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0aad  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0a43 A[LOOP:6: B:402:0x0a3d->B:404:0x0a43, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0b77  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0b6a  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0650  */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.s770
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<r4h> h(kn00 kn00Var) {
        LinkedList linkedList;
        xrh.b bVar;
        e6h e6hVar;
        xrh xrhVar;
        boolean z;
        bfh bfhVar;
        pvn pvnVar;
        ed0 ed0Var;
        ExtendedCommunityProfile extendedCommunityProfile;
        xrh xrhVar2;
        boolean z2;
        ExtendedCommunityProfile.f fVar;
        SuggestionVariant suggestionVariant;
        mru mruVar;
        ExtendedUserProfile.e eVar;
        kn00 kn00Var2;
        xrh.c.b bVar2;
        z4h z4hVar;
        kdh kdhVar;
        String str;
        LinkedList linkedList2;
        ExtendedUserProfile.f[] fVarArr;
        ArrayList<ExtendedUserProfile.c> arrayList;
        ExtendedUserProfile.d dVar;
        String str2;
        xrh.d dVar2;
        boolean z3;
        boolean equals;
        kdh kdhVar2;
        Iterator it;
        String str3;
        boolean z4;
        Iterator it2;
        sbd0 bVar3;
        ImageSize Fb;
        mdh mdhVar;
        String a2;
        String a3;
        mdh mdhVar2;
        e11 e11Var;
        e11 e11Var2;
        wdh wdhVar;
        xrh.d dVar3;
        boolean z5;
        tbd0 cVar;
        int i;
        wdh wdhVar2;
        e11 e11Var3;
        e11 e11Var4;
        List<z4h.a> list;
        CatchUpBanner catchUpBanner;
        String str4;
        j0h j0hVar;
        CommunityCreationOnboardingBlock bVar4;
        CommunityCreationOnboardingBlock communityCreationOnboardingBlock;
        String str5;
        String str6;
        c0h c0hVar;
        ArrayList arrayList2;
        Iterator it3;
        ArrayList arrayList3;
        int i2;
        int i3;
        String string;
        yua yuaVar;
        int i4;
        Object obj;
        mp80 mp80Var;
        k9h k9hVar = kn00Var.d;
        boolean z6 = kn00Var.f;
        spg spgVar = kn00Var.j;
        ExtendedCommunityProfile extendedCommunityProfile2 = kn00Var.a;
        xrh xrhVar3 = kn00Var.c;
        xrh.b bVar5 = xrhVar3 instanceof xrh.b ? (xrh.b) xrhVar3 : null;
        ed0 ed0Var2 = kn00Var.h;
        pvn pvnVar2 = new pvn(null);
        r8h r8hVar = kn00Var.b;
        xrh xrhVar4 = kn00Var.c;
        int i5 = kn00Var.e;
        List<String> list2 = kn00Var.g;
        e6h a4 = f6h.a(extendedCommunityProfile2, z6);
        ((jmh) this.i.getValue()).getClass();
        boolean z7 = jmh.a(extendedCommunityProfile2, r8hVar) instanceof CommunityProfileViewState.Data.c.b;
        a aVar = this.h;
        a aVar2 = this.g;
        if (!z6) {
            aVar2 = aVar;
        }
        pvn pvnVar3 = new pvn(null);
        LinkedList linkedList3 = (LinkedList) pvnVar3.b;
        aVar2.c(pvnVar3, new o9d0(extendedCommunityProfile2, r8hVar, f6h.a(extendedCommunityProfile2, z6), xrhVar4, z7, i5, list2));
        if (aVar2.b()) {
            linkedList = linkedList3;
            bVar = bVar5;
            e6hVar = a4;
            xrhVar = xrhVar4;
            z = z7;
            bfhVar = this;
            pvnVar = pvnVar2;
            ed0Var = ed0Var2;
            extendedCommunityProfile = extendedCommunityProfile2;
            xrhVar2 = xrhVar3;
            bfhVar.u(pvnVar3, extendedCommunityProfile, xrhVar, z, aVar2.f());
        } else {
            linkedList = linkedList3;
            bVar = bVar5;
            e6hVar = a4;
            xrhVar = xrhVar4;
            z = z7;
            bfhVar = this;
            pvnVar = pvnVar2;
            ed0Var = ed0Var2;
            extendedCommunityProfile = extendedCommunityProfile2;
            xrhVar2 = xrhVar3;
        }
        if (!aVar2.d(r8hVar, z)) {
            boolean a5 = aVar2.a();
            boolean e = aVar2.e();
            if (a5 && (mp80Var = extendedCommunityProfile.f2) != null && mp80Var.a != 0) {
                pvnVar3.g(new fxh(mp80Var, z));
            }
            if (e && extendedCommunityProfile.d()) {
                String str7 = extendedCommunityProfile.b0;
                mp80 mp80Var2 = extendedCommunityProfile.f2;
                pvnVar3.g(new yrg(bwd0.i(extendedCommunityProfile), str7, (mp80Var2 == null || mp80Var2.a == 0) ? false : true));
            }
            if (xrhVar instanceof xrh.b) {
                xrh.b bVar6 = (xrh.b) xrhVar;
                if (bfhVar.v(bVar6) && !(xrhVar instanceof xrh.b.a) && !(bVar6 instanceof xrh.b.C4043b)) {
                    pvnVar3.g(new ash(bVar6));
                }
            }
        }
        ((s4h) linkedList.getLast()).a = true;
        if (!linkedList.isEmpty()) {
            pvnVar.g(new r4h(linkedList, null));
        }
        e6h e6hVar2 = e6hVar;
        if (epx.f(e6hVar2, e6h.b.a)) {
            LinkedList linkedList4 = new LinkedList();
            linkedList4.add(new y7h(extendedCommunityProfile.z1, extendedCommunityProfile.Y));
            pvnVar.g(new r4h(linkedList4, null));
        } else if (epx.f(e6hVar2, e6h.a.a)) {
            LinkedList linkedList5 = new LinkedList();
            linkedList5.add(new i6h(extendedCommunityProfile.z1, extendedCommunityProfile.Y));
            pvnVar.g(new r4h(linkedList5, null));
        }
        if (((Boolean) bfhVar.l.getValue()).booleanValue() && k9hVar != null) {
            r4h.a.b bVar7 = r4h.a.b.a;
            LinkedList linkedList6 = new LinkedList();
            linkedList6.add(new j9h(k9hVar));
            pvnVar.g(new r4h(linkedList6, bVar7));
        }
        if (bfhVar.v(bVar) && (bVar instanceof xrh.b.C4043b) && bVar != null && bVar != null) {
            LinkedList linkedList7 = new LinkedList();
            linkedList7.add(new ash(bVar));
            pvnVar.g(new r4h(linkedList7, null));
        }
        GroupChannelBlock groupChannelBlock = extendedCommunityProfile.X2;
        int i6 = 10;
        if (groupChannelBlock != null) {
            kug kugVar = kug.d;
            String str8 = groupChannelBlock.c;
            List<GroupChannelBlock.GroupChannelMessagePreview> list3 = groupChannelBlock.b;
            if (list3 != null) {
                List<GroupChannelBlock.GroupChannelMessagePreview> list4 = list3;
                ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    GroupChannelBlock.GroupChannelMessagePreview groupChannelMessagePreview = (GroupChannelBlock.GroupChannelMessagePreview) it4.next();
                    kug kugVar2 = kug.d;
                    int i7 = groupChannelMessagePreview.b;
                    String str9 = groupChannelMessagePreview.d;
                    String str10 = str9 == null ? "" : str9;
                    List<GroupChannelBlock.GroupChannelMessagePreview.PreviewMedia> list5 = groupChannelMessagePreview.g;
                    if (list5 != null) {
                        List<GroupChannelBlock.GroupChannelMessagePreview.PreviewMedia> list6 = list5;
                        it3 = it4;
                        ArrayList arrayList5 = new ArrayList(c5g.u(list6, i6));
                        Iterator it5 = list6.iterator();
                        while (it5.hasNext()) {
                            GroupChannelBlock.GroupChannelMessagePreview.PreviewMedia previewMedia = (GroupChannelBlock.GroupChannelMessagePreview.PreviewMedia) it5.next();
                            kug kugVar3 = kug.d;
                            Iterator it6 = it5;
                            Image image = previewMedia.b;
                            MediaType.a aVar3 = MediaType.Companion;
                            boolean z8 = z6;
                            String str11 = previewMedia.d;
                            aVar3.getClass();
                            Iterator<E> it7 = MediaType.h().iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    i4 = i7;
                                    obj = null;
                                    break;
                                }
                                obj = it7.next();
                                i4 = i7;
                                if (epx.f(((MediaType) obj).i(), str11)) {
                                    break;
                                }
                                i7 = i4;
                            }
                            MediaType mediaType = (MediaType) obj;
                            if (mediaType == null) {
                                mediaType = MediaType.UNKNOWN;
                            }
                            arrayList5.add(new kug.b(image, mediaType, previewMedia.c));
                            it5 = it6;
                            i7 = i4;
                            z6 = z8;
                        }
                        arrayList3 = arrayList5;
                    } else {
                        it3 = it4;
                        arrayList3 = null;
                    }
                    boolean z9 = z6;
                    int i8 = i7;
                    int i9 = groupChannelMessagePreview.f;
                    String str12 = groupChannelMessagePreview.e;
                    String str13 = str12 != null ? str12 : "";
                    String str14 = str13.length() == 0 ? str8 : str13;
                    int i10 = groupChannelMessagePreview.c;
                    if (pvo0.g(i10)) {
                        yuaVar = new yua(pvo0.c(i10), null);
                    } else {
                        Calendar d2 = pvo0.d();
                        int i11 = d2.get(1);
                        long j = i10 * 1000;
                        d2.setTimeInMillis(j);
                        if (i11 == d2.get(1)) {
                            yuaVar = new yua(pvo0.o(i10, true, false), null);
                        } else {
                            String o = pvo0.o(i10, true, false);
                            Calendar d3 = pvo0.d();
                            int i12 = d3.get(1);
                            i2 = i9;
                            Resources resources = e43.a.getResources();
                            d3.setTimeInMillis(j);
                            if (d3.get(1) == i12) {
                                string = resources.getStringArray(R.array.months_short_without_declension)[Math.min(d3.get(2), 11)];
                                i3 = 1;
                            } else {
                                i3 = 1;
                                string = resources.getString(R.string.date_format_month_year, resources.getStringArray(R.array.months_short_without_declension)[Math.min(d3.get(2), 11)], Integer.valueOf(d3.get(1)));
                            }
                            if (string.length() > 0) {
                                string = Character.toUpperCase(string.charAt(0)) + string.substring(i3);
                            }
                            yuaVar = new yua(o, string);
                            arrayList4.add(new kug.a(i8, str10, arrayList3, i2, str14, yuaVar));
                            it4 = it3;
                            z6 = z9;
                            i6 = 10;
                        }
                    }
                    i2 = i9;
                    arrayList4.add(new kug.a(i8, str10, arrayList3, i2, str14, yuaVar));
                    it4 = it3;
                    z6 = z9;
                    i6 = 10;
                }
                arrayList2 = arrayList4;
            } else {
                arrayList2 = null;
            }
            z2 = z6;
            kug kugVar4 = new kug(str8, arrayList2);
            LinkedList linkedList8 = new LinkedList();
            linkedList8.add(kugVar4);
            pvnVar.g(new r4h(linkedList8, null));
        } else {
            z2 = z6;
            GroupChannelInfo groupChannelInfo = extendedCommunityProfile.Y2;
            if ((groupChannelInfo == null || groupChannelInfo.c) && (fVar = extendedCommunityProfile.W2) != null) {
                String str15 = fVar.a;
                String str16 = fVar.b;
                wrg.b bVar8 = (str15 == null || str16 == null) ? null : new wrg.b(str15, str16);
                if (bVar8 != null) {
                    LinkedList linkedList9 = new LinkedList();
                    linkedList9.add(bVar8);
                    pvnVar.g(new r4h(linkedList9, null));
                }
            }
        }
        ExtendedCommunityProfile.g gVar = extendedCommunityProfile.R2;
        if (gVar != null) {
            t2i t2iVar = new t2i(gVar);
            LinkedList linkedList10 = new LinkedList();
            linkedList10.add(t2iVar);
            pvnVar.g(new r4h(linkedList10, null));
        }
        GroupsSuggestions groupsSuggestions = extendedCommunityProfile.n2;
        if (groupsSuggestions == null) {
            if (extendedCommunityProfile.o2 != null) {
                suggestionVariant = SuggestionVariant.PERMANENT;
            }
            mruVar = null;
            if (mruVar != null) {
                LinkedList linkedList11 = new LinkedList();
                linkedList11.add(mruVar);
                pvnVar.g(new r4h(linkedList11, null));
            }
            eVar = extendedCommunityProfile.k1;
            if (eVar != null && eVar.b > 0 && eVar != null) {
                LinkedList linkedList12 = new LinkedList();
                linkedList12.add(new psg(eVar));
                pvnVar.g(new r4h(linkedList12, null));
            }
            if (extendedCommunityProfile.s2) {
                if (spgVar != null) {
                    upg upgVar = new upg(new zc0(spgVar.a, spgVar.b, spgVar.c, spgVar.d, spgVar.e, spgVar.f, spgVar.g, spgVar.h, spgVar.i, spgVar.j, spgVar.k));
                    LinkedList linkedList13 = new LinkedList();
                    linkedList13.add(upgVar);
                    pvnVar.g(new r4h(linkedList13, null));
                }
                ComFeatures comFeatures = ComFeatures.COM_ADVERT_BANNER;
                comFeatures.getClass();
                kn00Var2 = kn00Var;
                if ((!com.vk.toggle.b.A.a(comFeatures) || (kn00Var2.k && spgVar == null)) && (catchUpBanner = extendedCommunityProfile.I2) != null) {
                    LinkedList linkedList14 = new LinkedList();
                    linkedList14.add(new ech(catchUpBanner));
                    pvnVar.g(new r4h(linkedList14, null));
                }
                zwg zwgVar = extendedCommunityProfile.G2;
                bxg bxgVar = zwgVar != null ? new bxg(zwgVar.b, zwgVar.a, zwgVar.c, zwgVar.d) : null;
                if (bxgVar != null) {
                    LinkedList linkedList15 = new LinkedList();
                    linkedList15.add(bxgVar);
                    pvnVar.g(new r4h(linkedList15, null));
                }
                GroupCreationOnboarding groupCreationOnboarding = extendedCommunityProfile.K2;
                if (groupCreationOnboarding != null) {
                    GroupCreationOnboardingBlock groupCreationOnboardingBlock = groupCreationOnboarding.e;
                    GroupCreationOnboarding.OnboardingType onboardingType = groupCreationOnboarding.b;
                    if ((onboardingType == GroupCreationOnboarding.OnboardingType.BUSINESS || onboardingType == GroupCreationOnboarding.OnboardingType.CONTENT) && groupCreationOnboardingBlock.b != GroupCreationOnboardingBlock.Step.FINISH) {
                        bpn0 bpn0Var = v5v.c;
                        v5v a6 = v5v.a.a(groupCreationOnboardingBlock.c);
                        j0h j0hVar2 = new j0h(a6.a, a6.b);
                        String str17 = groupCreationOnboardingBlock.d;
                        String str18 = groupCreationOnboardingBlock.h;
                        String str19 = groupCreationOnboardingBlock.e;
                        GroupCreationOnboardingBlock.Step step = groupCreationOnboardingBlock.b;
                        GroupCreationOnboardingBlock.Progress progress = groupCreationOnboardingBlock.f;
                        List<GroupCreationOnboardingBlock.Option> list7 = groupCreationOnboardingBlock.g;
                        int i13 = b0h.$EnumSwitchMapping$0[step.ordinal()];
                        if (i13 == 1 || i13 == 2 || i13 == 3) {
                            str4 = str17;
                            j0hVar = j0hVar2;
                            if (progress != null) {
                                ListBuilder e2 = e43.e();
                                int i14 = progress.b;
                                int i15 = 0;
                                while (i15 < i14) {
                                    e2.add(new CommunityCreationOnboardingBlock.Item.Progress(i15 < progress.c ? CommunityCreationOnboardingBlock.Item.Progress.ProgressState.Completed : CommunityCreationOnboardingBlock.Item.Progress.ProgressState.Default));
                                    i15++;
                                }
                                bVar4 = new CommunityCreationOnboardingBlock.b(e2.g());
                                communityCreationOnboardingBlock = bVar4;
                                str5 = str18;
                                str6 = str19;
                            }
                            bVar4 = null;
                            communityCreationOnboardingBlock = bVar4;
                            str5 = str18;
                            str6 = str19;
                        } else if (i13 != 4) {
                            if (i13 == 5 && list7 != null) {
                                ListBuilder e3 = e43.e();
                                Iterator<T> it8 = list7.iterator();
                                while (it8.hasNext()) {
                                    int i16 = b0h.$EnumSwitchMapping$1[((GroupCreationOnboardingBlock.Option) it8.next()).d.ordinal()];
                                    CommunityCreationOnboardingBlock.Item.Regularity.RegularityState regularityState = i16 != 1 ? i16 != 2 ? i16 != 3 ? i16 != 4 ? null : CommunityCreationOnboardingBlock.Item.Regularity.RegularityState.Disabled : CommunityCreationOnboardingBlock.Item.Regularity.RegularityState.NotCompleted : CommunityCreationOnboardingBlock.Item.Regularity.RegularityState.Done : CommunityCreationOnboardingBlock.Item.Regularity.RegularityState.Default;
                                    if (regularityState != null) {
                                        e3.add(new CommunityCreationOnboardingBlock.Item.Regularity(regularityState));
                                    }
                                }
                                str4 = str17;
                                j0hVar = j0hVar2;
                                str5 = str18;
                                str6 = str19;
                                communityCreationOnboardingBlock = new CommunityCreationOnboardingBlock.c(e3.g());
                            } else {
                                str4 = str17;
                                j0hVar = j0hVar2;
                                str5 = str18;
                                str6 = str19;
                                communityCreationOnboardingBlock = null;
                            }
                        } else if (progress == null) {
                            str4 = str17;
                            j0hVar = j0hVar2;
                            bVar4 = null;
                            communityCreationOnboardingBlock = bVar4;
                            str5 = str18;
                            str6 = str19;
                        } else {
                            ListBuilder e4 = e43.e();
                            int i17 = progress.b;
                            int i18 = 0;
                            while (i18 < i17) {
                                String str20 = str17;
                                CommunityCreationOnboardingBlock.Item.Count.CountState countState = i18 < progress.c ? CommunityCreationOnboardingBlock.Item.Count.CountState.Done : CommunityCreationOnboardingBlock.Item.Count.CountState.Default;
                                i18++;
                                e4.add(new CommunityCreationOnboardingBlock.Item.Count(countState, String.valueOf(i18)));
                                j0hVar2 = j0hVar2;
                                str17 = str20;
                            }
                            str4 = str17;
                            j0hVar = j0hVar2;
                            bVar4 = new CommunityCreationOnboardingBlock.a(e4.g());
                            communityCreationOnboardingBlock = bVar4;
                            str5 = str18;
                            str6 = str19;
                        }
                        c0hVar = new c0h(j0hVar, str4, str5, str6, communityCreationOnboardingBlock);
                        if (c0hVar == null) {
                            LinkedList linkedList16 = new LinkedList();
                            linkedList16.add(c0hVar);
                            pvnVar.g(new r4h(linkedList16, null));
                        } else {
                            xrh.c.a aVar4 = xrhVar2 instanceof xrh.c.a ? (xrh.c.a) xrhVar2 : null;
                            if (aVar4 != null && !x2h.c(extendedCommunityProfile) && !bfhVar.f.d().n()) {
                                LinkedList linkedList17 = new LinkedList();
                                linkedList17.add(new wbh(aVar4.b, aVar4.d, aVar4.e, aVar4.f));
                                pvnVar.g(new r4h(linkedList17, null));
                            }
                        }
                    }
                }
                c0hVar = null;
                if (c0hVar == null) {
                }
            } else {
                kn00Var2 = kn00Var;
            }
            boolean a7 = w2h.a(extendedCommunityProfile);
            bVar2 = xrhVar2 instanceof xrh.c.b ? (xrh.c.b) xrhVar2 : null;
            if (bVar2 != null || !a7) {
                bVar2 = null;
            }
            z4hVar = extendedCommunityProfile.g2;
            if (z4hVar != null) {
                if (z4hVar.b) {
                    z4hVar = null;
                }
                if (z4hVar != null && (list = z4hVar.a) != null) {
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : list) {
                        z4h.a aVar5 = (z4h.a) obj2;
                        if (a7 || !aVar5.h) {
                            arrayList6.add(obj2);
                        }
                    }
                    if (arrayList6.isEmpty()) {
                        arrayList6 = null;
                    }
                    if (arrayList6 != null) {
                        LinkedList linkedList18 = new LinkedList();
                        linkedList18.add(new o5h(arrayList6, extendedCommunityProfile.a.c, a7, bVar2));
                        pvnVar.g(new r4h(linkedList18, null));
                    }
                }
            }
            kdhVar = kn00Var2.i;
            if (kdhVar != null) {
                boolean z10 = kdhVar.f;
                boolean z11 = kdhVar.g;
                String str21 = kdhVar.a;
                ddh ddhVar = kdhVar.c;
                boolean z12 = kdhVar.e;
                boolean z13 = kdhVar.d;
                int i19 = d.$EnumSwitchMapping$0[kdhVar.b.ordinal()];
                Context context = bfhVar.c;
                if (i19 == 1 || i19 == 2) {
                    bpn0 bpn0Var2 = mdh.e;
                    xrh.d dVar4 = xrhVar2 instanceof xrh.d ? (xrh.d) xrhVar2 : null;
                    if (z12) {
                        if (str21 == null) {
                            str21 = context.getString(R.string.community_priority_block_market_goods_title);
                        }
                        String str22 = str21;
                        ddh.a b2 = kdhVar.b();
                        Integer num = b2 != null ? b2.f : null;
                        ddh.a b3 = kdhVar.b();
                        gwu.a aVar6 = new gwu.a(str22, false, ddhVar != null, b3 != null ? b3.c() : false, mdh.a.a(kdhVar), null, num);
                        sbd0.d dVar5 = sbd0.d.a;
                        ddh.a b4 = kdhVar.b();
                        mdhVar2 = new mdh(aVar6, dVar5, (b4 == null || (e11Var2 = b4.g) == null) ? null : new rvw(e11Var2.b, e11Var2.a));
                    } else if (z13) {
                        if (str21 == null) {
                            str21 = context.getString(R.string.community_priority_block_market_goods_title);
                        }
                        String str23 = str21;
                        boolean z14 = dVar4 != null;
                        ddh.a b5 = kdhVar.b();
                        Integer num2 = b5 != null ? b5.f : null;
                        ddh.a b6 = kdhVar.b();
                        gwu.a aVar7 = new gwu.a(str23, z14, ddhVar != null, b6 != null ? b6.c() : false, mdh.a.a(kdhVar), null, num2);
                        sbd0.c cVar2 = new sbd0.c(context.getString(R.string.community_priority_block_market_goods_error_description), context.getString(R.string.community_priority_block_market_goods_error_btn_text));
                        ddh.a b7 = kdhVar.b();
                        mdhVar2 = new mdh(aVar7, cVar2, (b7 == null || (e11Var = b7.g) == null) ? null : new rvw(e11Var.b, e11Var.a));
                    } else {
                        ddh.a b8 = kdhVar.b();
                        if (b8 == null) {
                            mdhVar = null;
                        } else {
                            List<lsh> list8 = b8.b;
                            List<o9h> list9 = b8.a;
                            xrh.d.b.a aVar8 = dVar4 instanceof xrh.d.b.a ? (xrh.d.b.a) dVar4 : null;
                            String str24 = aVar8 != null ? aVar8.c : null;
                            if (dVar4 == null || (a3 = dVar4.a()) == null) {
                                dVar2 = dVar4;
                            } else {
                                dVar2 = dVar4;
                                if (a3.equals(HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_GOODS_AND_SERVICES_ONBOARDING.getId()) || a3.equals(HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_SERVICES_ONBOARDING.getId())) {
                                    z3 = true;
                                    equals = (dVar2 != null || (a2 = dVar2.a()) == null) ? false : a2.equals(HintId.GROUP_COMMUNITY_PRIMARY_BLOCK_ADMIN_ALBUMS_VIEW_SETTINGS_ONBOARDING.getId());
                                    if (list9.isEmpty() || !list8.isEmpty()) {
                                        List<lsh> list10 = list8;
                                        boolean z15 = equals;
                                        kdhVar2 = kdhVar;
                                        ArrayList arrayList7 = new ArrayList(c5g.u(list10, 10));
                                        it = list10.iterator();
                                        boolean z16 = z15;
                                        while (it.hasNext()) {
                                            lsh lshVar = (lsh) it.next();
                                            int i20 = lshVar.c;
                                            Iterator it9 = it;
                                            String str25 = lshVar.e;
                                            int i21 = lshVar.f;
                                            boolean z17 = !list9.isEmpty();
                                            bpn0 bpn0Var3 = mdh.e;
                                            Photo photo = lshVar.g;
                                            String str26 = str21;
                                            arrayList7.add(new o7d0(str25, z16, z17, (photo == null || (Fb = photo.Fb((int) hbh0.a(context, 154.0f), false)) == null) ? null : Fb.d.d, i20, i21));
                                            it = it9;
                                            str21 = str26;
                                            z16 = false;
                                        }
                                        str3 = str21;
                                        z4 = true;
                                        List<o9h> list11 = list9;
                                        ArrayList arrayList8 = new ArrayList(c5g.u(list11, 10));
                                        it2 = list11.iterator();
                                        while (it2.hasNext()) {
                                            o9h o9hVar = (o9h) it2.next();
                                            kc10 kc10Var = (kc10) mdh.e.getValue();
                                            boolean z18 = o9hVar.b;
                                            Iterator it10 = it2;
                                            wfq0.b bVar9 = wfq0.b.a;
                                            kc10Var.getClass();
                                            arrayList8.add(kc10.a(o9hVar, z18, bVar9));
                                            it2 = it10;
                                        }
                                        bVar3 = new sbd0.b(arrayList8, arrayList7, z10, z11);
                                    } else {
                                        bVar3 = new sbd0.a(context.getString(R.string.community_priority_block_market_goods_empty_items_description), b8.b() ? context.getString(R.string.community_priority_block_market_goods_empty_items_btn_text) : null);
                                        kdhVar2 = kdhVar;
                                        str3 = str21;
                                        z4 = true;
                                    }
                                    gwu.a aVar9 = new gwu.a(str3 != null ? context.getString(R.string.community_priority_block_market_goods_title) : str3, z3, (!z12 || z13) ? false : z4, (b8.c() || z12 || z13) ? false : z4, mdh.a.a(kdhVar2), str24, b8.f);
                                    e11 e11Var5 = b8.g;
                                    mdhVar = new mdh(aVar9, bVar3, e11Var5 == null ? new rvw(e11Var5.b, e11Var5.a) : null);
                                }
                            }
                            z3 = false;
                            if (dVar2 != null) {
                            }
                            if (list9.isEmpty()) {
                            }
                            List<lsh> list102 = list8;
                            boolean z152 = equals;
                            kdhVar2 = kdhVar;
                            ArrayList arrayList72 = new ArrayList(c5g.u(list102, 10));
                            it = list102.iterator();
                            boolean z162 = z152;
                            while (it.hasNext()) {
                            }
                            str3 = str21;
                            z4 = true;
                            List<o9h> list112 = list9;
                            ArrayList arrayList82 = new ArrayList(c5g.u(list112, 10));
                            it2 = list112.iterator();
                            while (it2.hasNext()) {
                            }
                            bVar3 = new sbd0.b(arrayList82, arrayList72, z10, z11);
                            gwu.a aVar92 = new gwu.a(str3 != null ? context.getString(R.string.community_priority_block_market_goods_title) : str3, z3, (!z12 || z13) ? false : z4, (b8.c() || z12 || z13) ? false : z4, mdh.a.a(kdhVar2), str24, b8.f);
                            e11 e11Var52 = b8.g;
                            mdhVar = new mdh(aVar92, bVar3, e11Var52 == null ? new rvw(e11Var52.b, e11Var52.a) : null);
                        }
                        if (mdhVar != null) {
                            LinkedList linkedList19 = new LinkedList();
                            linkedList19.add(mdhVar);
                            pvnVar.g(new r4h(linkedList19, null));
                        }
                    }
                    mdhVar = mdhVar2;
                    if (mdhVar != null) {
                    }
                } else if (i19 == 3) {
                    bpn0 bpn0Var4 = wdh.e;
                    xrh.d dVar6 = xrhVar2 instanceof xrh.d ? (xrh.d) xrhVar2 : null;
                    if (z12) {
                        String string2 = context.getString(R.string.community_priority_block_market_services_title);
                        ddh.a b9 = kdhVar.b();
                        gwu.b bVar10 = new gwu.b(string2, false, ddhVar != null, b9 != null ? b9.b() : false);
                        tbd0.e eVar2 = tbd0.e.a;
                        ddh.b c2 = kdhVar.c();
                        wdhVar2 = new wdh(bVar10, eVar2, (c2 == null || (e11Var4 = c2.c) == null) ? null : new rvw(e11Var4.b, e11Var4.a));
                    } else if (z13) {
                        String string3 = context.getString(R.string.community_priority_block_market_services_title);
                        boolean z19 = dVar6 != null;
                        ddh.a b10 = kdhVar.b();
                        gwu.b bVar11 = new gwu.b(string3, z19, ddhVar != null, b10 != null ? b10.b() : false);
                        tbd0.b bVar12 = new tbd0.b(context.getString(R.string.community_priority_block_market_services_error_description), context.getString(R.string.community_priority_block_market_services_error_btn_text));
                        ddh.b c3 = kdhVar.c();
                        wdhVar2 = new wdh(bVar11, bVar12, (c3 == null || (e11Var3 = c3.c) == null) ? null : new rvw(e11Var3.b, e11Var3.a));
                    } else {
                        ddh.b c4 = kdhVar.c();
                        if (c4 != null) {
                            String str27 = c4.b;
                            List<p9h> list12 = c4.a;
                            if (list12.isEmpty()) {
                                cVar = new tbd0.a(context.getString(R.string.community_priority_block_market_services_empty_items_description), (str27 == null || str27.length() <= 0) ? null : context.getString(R.string.community_priority_block_market_services_empty_items_btn_text));
                                dVar3 = dVar6;
                                i = R.string.community_priority_block_market_services_title;
                                z5 = z12;
                            } else {
                                List<p9h> list13 = list12;
                                dVar3 = dVar6;
                                ArrayList arrayList9 = new ArrayList(c5g.u(list13, 10));
                                Iterator it11 = list13.iterator();
                                while (it11.hasNext()) {
                                    p9h p9hVar = (p9h) it11.next();
                                    kc10 kc10Var2 = (kc10) wdh.e.getValue();
                                    Iterator it12 = it11;
                                    wfq0.a aVar10 = wfq0.a.a;
                                    kc10Var2.getClass();
                                    arrayList9.add(kc10.a(p9hVar, false, aVar10));
                                    z12 = z12;
                                    it11 = it12;
                                }
                                z5 = z12;
                                cVar = c4.e ? new tbd0.c(arrayList9, kdhVar.h, z10, z11) : new tbd0.d(arrayList9, z10, z11);
                                i = R.string.community_priority_block_market_services_title;
                            }
                            gwu.b bVar13 = new gwu.b(context.getString(i), dVar3 != null, (z5 || z13) ? false : true, (str27 == null || str27.length() <= 0 || z5 || z13) ? false : true);
                            e11 e11Var6 = c4.c;
                            wdhVar = new wdh(bVar13, cVar, e11Var6 != null ? new rvw(e11Var6.b, e11Var6.a) : null);
                        } else {
                            wdhVar = null;
                        }
                        if (wdhVar != null) {
                            LinkedList linkedList20 = new LinkedList();
                            linkedList20.add(wdhVar);
                            pvnVar.g(new r4h(linkedList20, null));
                        }
                    }
                    wdhVar = wdhVar2;
                    if (wdhVar != null) {
                    }
                }
            }
            if (z2) {
                aVar = aVar2;
            }
            if (aVar.e() && (str2 = extendedCommunityProfile.c0) != null && !str2.isEmpty()) {
                if (extendedCommunityProfile.d()) {
                    LinkedList linkedList21 = new LinkedList();
                    ExtendedUserProfile.f[] fVarArr2 = extendedCommunityProfile.x1;
                    if (fVarArr2 != null) {
                        if (fVarArr2.length == 0) {
                            fVarArr2 = null;
                        }
                        if (fVarArr2 != null) {
                            for (ExtendedUserProfile.f fVar2 : fVarArr2) {
                                linkedList21.add(new r0h(fVar2));
                            }
                        }
                    }
                    linkedList21.add(new o0h(extendedCommunityProfile.c0));
                    if (!linkedList21.isEmpty()) {
                        pvnVar.g(new r4h(linkedList21, null));
                    }
                } else {
                    LinkedList linkedList22 = new LinkedList();
                    linkedList22.add(new o0h(extendedCommunityProfile.c0));
                    pvnVar.g(new r4h(linkedList22, null));
                }
            }
            str = extendedCommunityProfile.c0;
            if ((str != null || str.isEmpty()) && !extendedCommunityProfile.d()) {
                linkedList2 = new LinkedList();
                fVarArr = extendedCommunityProfile.x1;
                if (fVarArr != null) {
                    if (fVarArr.length == 0) {
                        fVarArr = null;
                    }
                    if (fVarArr != null) {
                        for (ExtendedUserProfile.f fVar3 : fVarArr) {
                            linkedList2.add(new r0h(fVar3));
                        }
                    }
                }
                if (!linkedList2.isEmpty()) {
                    pvnVar.g(new r4h(linkedList2, null));
                }
            }
            arrayList = extendedCommunityProfile.p;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    LinkedList linkedList23 = new LinkedList();
                    for (ExtendedUserProfile.c cVar3 : arrayList) {
                        String str28 = cVar3.b;
                        Iterator<ExtendedUserProfile.d> it13 = cVar3.c.iterator();
                        while (true) {
                            if (!it13.hasNext()) {
                                dVar = null;
                                break;
                            }
                            dVar = it13.next();
                            if (dVar.b >= iah0.a(24)) {
                                break;
                            }
                        }
                        ExtendedUserProfile.d dVar7 = dVar;
                        if (dVar7 == null) {
                            dVar7 = (ExtendedUserProfile.d) j5g.b0(0, cVar3.c);
                        }
                        linkedList23.add(new wrg.a(bwd0.i(extendedCommunityProfile), cVar3.a, str28, dVar7 != null ? dVar7.a : null));
                    }
                    if (!linkedList23.isEmpty()) {
                        pvnVar.g(new r4h(linkedList23, null));
                    }
                }
            }
            t(pvnVar, extendedCommunityProfile, bVar, kn00Var2.c, ed0Var, kn00Var2.f);
            return (LinkedList) pvnVar.b;
        }
        suggestionVariant = SuggestionVariant.ON_SUBSCRIBE;
        if (groupsSuggestions == null) {
            groupsSuggestions = extendedCommunityProfile.o2;
        }
        GroupsSuggestions groupsSuggestions2 = groupsSuggestions;
        if (groupsSuggestions2 != null) {
            if (groupsSuggestions2.l.size() <= 0) {
                groupsSuggestions2 = null;
            }
            if (groupsSuggestions2 != null) {
                mruVar = new mru(groupsSuggestions2, fkq0.e(extendedCommunityProfile.a.c), com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.GROUP), suggestionVariant);
                if (mruVar != null) {
                }
                eVar = extendedCommunityProfile.k1;
                if (eVar != null) {
                    LinkedList linkedList122 = new LinkedList();
                    linkedList122.add(new psg(eVar));
                    pvnVar.g(new r4h(linkedList122, null));
                }
                if (extendedCommunityProfile.s2) {
                }
                boolean a72 = w2h.a(extendedCommunityProfile);
                if (xrhVar2 instanceof xrh.c.b) {
                }
                if (bVar2 != null) {
                }
                bVar2 = null;
                z4hVar = extendedCommunityProfile.g2;
                if (z4hVar != null) {
                }
                kdhVar = kn00Var2.i;
                if (kdhVar != null) {
                }
                if (z2) {
                }
                if (aVar.e()) {
                    if (extendedCommunityProfile.d()) {
                    }
                }
                str = extendedCommunityProfile.c0;
                if (str != null) {
                }
                linkedList2 = new LinkedList();
                fVarArr = extendedCommunityProfile.x1;
                if (fVarArr != null) {
                }
                if (!linkedList2.isEmpty()) {
                }
                arrayList = extendedCommunityProfile.p;
                if (arrayList != null) {
                }
                t(pvnVar, extendedCommunityProfile, bVar, kn00Var2.c, ed0Var, kn00Var2.f);
                return (LinkedList) pvnVar.b;
            }
        }
        mruVar = null;
        if (mruVar != null) {
        }
        eVar = extendedCommunityProfile.k1;
        if (eVar != null) {
        }
        if (extendedCommunityProfile.s2) {
        }
        boolean a722 = w2h.a(extendedCommunityProfile);
        if (xrhVar2 instanceof xrh.c.b) {
        }
        if (bVar2 != null) {
        }
        bVar2 = null;
        z4hVar = extendedCommunityProfile.g2;
        if (z4hVar != null) {
        }
        kdhVar = kn00Var2.i;
        if (kdhVar != null) {
        }
        if (z2) {
        }
        if (aVar.e()) {
        }
        str = extendedCommunityProfile.c0;
        if (str != null) {
        }
        linkedList2 = new LinkedList();
        fVarArr = extendedCommunityProfile.x1;
        if (fVarArr != null) {
        }
        if (!linkedList2.isEmpty()) {
        }
        arrayList = extendedCommunityProfile.p;
        if (arrayList != null) {
        }
        t(pvnVar, extendedCommunityProfile, bVar, kn00Var2.c, ed0Var, kn00Var2.f);
        return (LinkedList) pvnVar.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void s(pvn pvnVar, kn00 kn00Var) {
        jmh jmhVar = (jmh) this.i.getValue();
        ExtendedCommunityProfile extendedCommunityProfile = kn00Var.a;
        r8h r8hVar = kn00Var.b;
        jmhVar.getClass();
        boolean z = jmh.a(extendedCommunityProfile, r8hVar) instanceof CommunityProfileViewState.Data.c.b;
        boolean z2 = kn00Var.f;
        a aVar = z2 ? this.g : this.h;
        ExtendedCommunityProfile extendedCommunityProfile2 = kn00Var.a;
        aVar.c(pvnVar, new o9d0(extendedCommunityProfile2, kn00Var.b, f6h.a(extendedCommunityProfile2, z2), kn00Var.c, z, kn00Var.e, kn00Var.g));
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0171  */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(pvn pvnVar, ExtendedCommunityProfile extendedCommunityProfile, xrh.b bVar, xrh xrhVar, ed0 ed0Var, boolean z) {
        ewh ewhVar;
        gvw gvwVar;
        iyn iynVar;
        syn a2;
        uwn bVar2;
        ReBookingBannerData reBookingBannerData = extendedCommunityProfile.H2;
        if (reBookingBannerData != null) {
            List<ReBookingBannerData.RecordData> list = reBookingBannerData.b;
            int i = 10;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (ReBookingBannerData.RecordData recordData : list) {
                int i2 = recordData.b;
                ReBookingBannerData.RecordData.Staff staff = recordData.c;
                ewh.a.b bVar3 = new ewh.a.b(staff.b, staff.c, staff.d);
                List<ReBookingBannerData.RecordData.Service> list2 = recordData.d;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, i));
                for (ReBookingBannerData.RecordData.Service service : list2) {
                    arrayList2.add(new ewh.a.C2838a(service.b, service.c));
                }
                arrayList.add(new ewh.a(i2, bVar3, arrayList2, recordData.e));
                i = 10;
            }
            ewhVar = new ewh(arrayList);
        } else {
            ewhVar = null;
        }
        if (ewhVar != null) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(ewhVar);
            pvnVar.g(new r4h(linkedList, null));
        }
        Widget widget = extendedCommunityProfile.w1;
        if (widget != null) {
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(new h5i(widget));
            pvnVar.g(new r4h(linkedList2, null));
        }
        DonutBanner donutBanner = extendedCommunityProfile.u2;
        ynh ynhVar = this.f;
        if (donutBanner != null) {
            xrh.d.c cVar = xrhVar instanceof xrh.d.c ? (xrh.d.c) xrhVar : null;
            Hint hint = cVar != null ? new Hint(cVar.b, cVar.c, cVar.d, null, 8, null) : null;
            iyn iynVar2 = iyn.l;
            a2o kf = ((DonutPriceComponent) ynhVar.Z0.getValue()).kf();
            DonutBanner.DonutRegularSupport donutRegularSupport = donutBanner.f;
            DonutBanner.b bVar4 = donutBanner.g;
            Action action = bVar4 != null ? bVar4.b.b : null;
            Action action2 = donutRegularSupport != null ? donutRegularSupport.b.b : null;
            DonutBanner.DonutInfoBanner donutInfoBanner = donutBanner.h;
            if (donutInfoBanner != null) {
                if (jyn.a.$EnumSwitchMapping$1[donutInfoBanner.a.ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                gvwVar = new gvw(InfoBannerIcon.ERROR, donutInfoBanner.b);
            } else {
                gvwVar = null;
            }
            if (donutRegularSupport == null || bVar4 == null) {
                if (donutRegularSupport != null) {
                    a2 = jyn.b(donutRegularSupport, kf);
                } else if (bVar4 != null) {
                    a2 = jyn.a(bVar4, kf);
                } else {
                    iynVar = null;
                    if (iynVar != null) {
                        LinkedList linkedList3 = new LinkedList();
                        linkedList3.add(iynVar);
                        pvnVar.g(new r4h(linkedList3, null));
                    }
                }
                bVar2 = new uwn.b(a2);
            } else {
                bVar2 = new uwn.c(jyn.b(donutRegularSupport, kf), jyn.a(bVar4, kf));
            }
            uwn uwnVar = bVar2;
            String str = donutBanner.a;
            String str2 = donutBanner.b;
            String str3 = donutBanner.c;
            DonutBanner.a aVar = donutBanner.d;
            Action action3 = aVar != null ? aVar.b : null;
            DonutBanner.a aVar2 = donutBanner.e;
            iynVar = new iyn(str, str2, str3, uwnVar, gvwVar, action3, aVar2 != null ? aVar2.b : null, action, action2, hint);
            if (iynVar != null) {
            }
        }
        ComFeatures comFeatures = ComFeatures.COM_LEGO_BUTTONS_REDESIGN;
        comFeatures.getClass();
        com.vk.toggle.b bVar5 = com.vk.toggle.b.A;
        boolean z2 = !bVar5.a(comFeatures) && (w2h.e(extendedCommunityProfile) || (fkq0.d(o25.a().o().a) && extendedCommunityProfile.h0 && !extendedCommunityProfile.g0));
        if (v(bVar) && (bVar instanceof xrh.b.a) && !(bVar instanceof xrh.b.C4043b) && bVar != null) {
            LinkedList linkedList4 = new LinkedList();
            linkedList4.add(new ash(bVar));
            pvnVar.g(new r4h(linkedList4, null));
        }
        if (z2) {
            LinkedList linkedList5 = new LinkedList();
            wch.k.getClass();
            int i3 = extendedCommunityProfile.a0;
            boolean z3 = i3 >= 3;
            boolean z4 = i3 >= 2;
            boolean z5 = extendedCommunityProfile.y1;
            boolean z6 = extendedCommunityProfile.l0;
            boolean z7 = extendedCommunityProfile.w2 && ((zof) ynhVar.C.getValue()).c() && extendedCommunityProfile.a0 > 0;
            boolean z8 = extendedCommunityProfile.h0 && !extendedCommunityProfile.g0;
            boolean z9 = extendedCommunityProfile.g0 && !epx.f(extendedCommunityProfile.a.c, ynhVar.a().o().a) && (extendedCommunityProfile.Y == 2 || extendedCommunityProfile.d0 > 0);
            boolean z10 = !bVar5.a(comFeatures) && fkq0.d(ynhVar.a().o().a) && extendedCommunityProfile.h0 && !extendedCommunityProfile.g0;
            GroupChannelInfo groupChannelInfo = extendedCommunityProfile.Y2;
            boolean z11 = groupChannelInfo != null && groupChannelInfo.b;
            String str4 = groupChannelInfo != null ? groupChannelInfo.d : null;
            if (str4 == null) {
                str4 = "";
            }
            linkedList5.add(new wch(z3, z4, z5, z6, z7, z8, z9, z10, new iug(z11, str4)));
            pvnVar.g(new r4h(linkedList5, null));
        }
        if (ed0Var != null) {
            LinkedList linkedList6 = new LinkedList();
            linkedList6.add(new vpg(ed0Var, bwd0.i(extendedCommunityProfile)));
            pvnVar.g(new r4h(linkedList6, null));
        }
        if (!z || extendedCommunityProfile.j2 == null) {
            return;
        }
        LinkedList linkedList7 = new LinkedList();
        ExtendedCommunityProfile.a aVar3 = extendedCommunityProfile.j2;
        String str5 = aVar3 != null ? aVar3.a : null;
        linkedList7.add(new u7h(str5 != null ? str5 : ""));
        pvnVar.g(new r4h(linkedList7, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0240  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(pvn pvnVar, ExtendedCommunityProfile extendedCommunityProfile, xrh xrhVar, boolean z, boolean z2) {
        t4h w4iVar;
        String str;
        ExtendedCommunityProfile.d dVar;
        boolean z3;
        String str2;
        String str3;
        String str4;
        int i;
        GroupMarketInfo groupMarketInfo;
        GroupMarketInfo.CommunityTrustMarks communityTrustMarks;
        GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark.Code code;
        CommunityTrustMarkItemModel.Type type;
        GroupContentTabType groupContentTabType;
        String string;
        boolean z4;
        List list;
        int i2;
        ArrayList<UserProfile> arrayList;
        boolean z5;
        String str5;
        int i3 = extendedCommunityProfile.a1;
        boolean z6 = i3 == 1 || i3 == 2 || i3 == 4;
        if (((Boolean) this.k.getValue()).booleanValue()) {
            z1h z1hVar = z1h.l;
            ArrayList<UserProfile> arrayList2 = extendedCommunityProfile.I;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                z4 = z6;
                list = EmptyList.b;
                i2 = 0;
            } else {
                ListBuilder e = e43.e();
                int size = arrayList2.size();
                if (size > 3) {
                    size = 3;
                }
                int i4 = 0;
                i2 = 0;
                while (i4 < size) {
                    UserProfile userProfile = arrayList2.get(i4);
                    Image image = userProfile.O;
                    if (image == null) {
                        arrayList = arrayList2;
                        z5 = z6;
                    } else {
                        arrayList = arrayList2;
                        z5 = z6;
                        ImageSize Cb = image.Cb(50, true, false);
                        if (Cb != null && (str5 = Cb.d.d) != null) {
                            z1h z1hVar2 = z1h.l;
                            boolean z7 = (userProfile instanceof DonutFriendPreviewUserProfile) && ((DonutFriendPreviewUserProfile) userProfile).h0;
                            if (z7) {
                                i2++;
                            }
                            e.add(new Pair(str5, Boolean.valueOf(z7)));
                        }
                    }
                    i4++;
                    arrayList2 = arrayList;
                    z6 = z5;
                }
                z4 = z6;
                list = e.g();
            }
            w4iVar = new z1h(z4, extendedCommunityProfile.Y, extendedCommunityProfile.m0, extendedCommunityProfile.q, new z1h.a(extendedCommunityProfile.b("members"), extendedCommunityProfile.b("friends_members"), i2), list, extendedCommunityProfile.x, extendedCommunityProfile.a.c, !bwd0.f(extendedCommunityProfile), false);
        } else {
            w4iVar = z6 ? new w4i(extendedCommunityProfile.Y, extendedCommunityProfile.m0, extendedCommunityProfile.q, extendedCommunityProfile.b("members")) : new nah(extendedCommunityProfile.a.c, extendedCommunityProfile.b("friends_members"), extendedCommunityProfile.b("members"), extendedCommunityProfile.x, extendedCommunityProfile.I, !bwd0.f(extendedCommunityProfile), false);
        }
        pvnVar.g(w4iVar);
        String str6 = extendedCommunityProfile.O0;
        b.d i5 = com.vk.toggle.b.A.i(ComFeatures.COM_SECTIONS_REDESIGN);
        if (epx.f(i5 != null ? i5.d() : null, "B") && (groupContentTabType = extendedCommunityProfile.V2) != null) {
            int i6 = d.$EnumSwitchMapping$0[groupContentTabType.ordinal()];
            Context context = this.c;
            switch (i6) {
                case 1:
                    string = context.getString(R.string.profile_content_tab_goods);
                    break;
                case 2:
                default:
                    string = null;
                    break;
                case 3:
                    string = context.getString(R.string.profile_content_tab_services);
                    break;
                case 4:
                    string = context.getString(R.string.profile_content_tab_photo);
                    break;
                case 5:
                    string = context.getString(R.string.profile_content_tab_video);
                    break;
                case 6:
                    string = context.getString(R.string.profile_content_tab_music);
                    break;
                case 7:
                    string = context.getString(R.string.profile_content_tab_chats);
                    break;
                case 8:
                    string = context.getString(R.string.profile_content_tab_clips);
                    break;
                case 9:
                    string = context.getString(R.string.profile_content_tab_document);
                    break;
                case 10:
                    string = context.getString(R.string.profile_content_tab_discussion);
                    break;
                case 11:
                    string = context.getString(R.string.profile_content_tab_article);
                    break;
                case 12:
                    string = context.getString(R.string.profile_content_tab_podcast);
                    break;
                case 13:
                    string = context.getString(R.string.profile_content_tab_stereo_rooms);
                    break;
                case 14:
                    string = context.getString(R.string.profile_content_tab_event);
                    break;
                case 15:
                    string = context.getString(R.string.profile_content_tab_channel);
                    break;
                case 16:
                    string = context.getString(R.string.profile_content_tab_narrative);
                    break;
            }
            String m = string != null ? cqm0.m(string) : null;
            if (m != null) {
                str = " + ".concat(m);
                pvnVar.g(new CommunityDescriptionItemModel(str6, z, str, !(xrhVar instanceof xrh.d.C4044d) ? CommunityDescriptionItemModel.SectionsTooltip.Editor : xrhVar instanceof xrh.d.e ? CommunityDescriptionItemModel.SectionsTooltip.User : null));
                dVar = extendedCommunityProfile.C2;
                if (dVar != null) {
                    Float f = dVar.a;
                    float floatValue = f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    String a2 = f != null ? this.d.a(f.floatValue()) : null;
                    Integer num = dVar.b;
                    pvnVar.g(new mzh(floatValue, num != null ? num.intValue() : 0, a2));
                }
                if (((Boolean) this.m.getValue()).booleanValue() && (groupMarketInfo = extendedCommunityProfile.J2) != null && (communityTrustMarks = groupMarketInfo.i) != null) {
                    GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark = communityTrustMarks.b;
                    code = communityTrustMark.b;
                    String str7 = communityTrustMark.c;
                    switch (d.a.$EnumSwitchMapping$1[code.ordinal()]) {
                        case 1:
                            type = CommunityTrustMarkItemModel.Type.DOCS;
                            break;
                        case 2:
                            type = CommunityTrustMarkItemModel.Type.POPULAR;
                            break;
                        case 3:
                            type = CommunityTrustMarkItemModel.Type.FRIENDS;
                            break;
                        case 4:
                            type = CommunityTrustMarkItemModel.Type.DATE;
                            break;
                        case 5:
                            type = CommunityTrustMarkItemModel.Type.YCLIENTS;
                            break;
                        case 6:
                            type = CommunityTrustMarkItemModel.Type.OZON;
                            break;
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            type = CommunityTrustMarkItemModel.Type.DELIVERY;
                            break;
                        default:
                            type = CommunityTrustMarkItemModel.Type.NONE;
                            break;
                    }
                    pvnVar.g(new CommunityTrustMarkItemModel(code, type, str7, w2h.a(extendedCommunityProfile)));
                }
                if (extendedCommunityProfile.Y == 1 || (i = extendedCommunityProfile.T) <= 0) {
                    z3 = false;
                } else {
                    int i7 = extendedCommunityProfile.U;
                    UserProfile userProfile2 = extendedCommunityProfile.a;
                    String str8 = userProfile2 != null ? userProfile2.e : null;
                    z3 = false;
                    pvnVar.g(new j2h(i, i7, str8, x2h.b(extendedCommunityProfile, false), extendedCommunityProfile.O0));
                }
                if (myc0.f(extendedCommunityProfile.V)) {
                    pvnVar.g(new f5i(extendedCommunityProfile.V, bwd0.i(extendedCommunityProfile)));
                }
                boolean z8 = (extendedCommunityProfile.Y == 1 || extendedCommunityProfile.T <= 0) ? z3 : true;
                if (((Boolean) this.n.getValue()).booleanValue()) {
                    boolean z9 = extendedCommunityProfile.W1 != null ? true : z3;
                    if (z8 && myc0.f(extendedCommunityProfile.s0)) {
                        z3 = true;
                    }
                    if (z9 || z3) {
                        String b2 = x2h.b(extendedCommunityProfile, true);
                        String str9 = extendedCommunityProfile.j;
                        Address address = extendedCommunityProfile.W1;
                        String str10 = extendedCommunityProfile.s0;
                        double d2 = extendedCommunityProfile.W;
                        double d3 = extendedCommunityProfile.X;
                        UserProfile userProfile3 = extendedCommunityProfile.a;
                        pvnVar.g(new uch(b2, str9, address, str10, d2, d3, userProfile3 != null ? userProfile3.e : null, extendedCommunityProfile.Z1));
                    }
                }
                if (w2h.a(extendedCommunityProfile) && ((str4 = extendedCommunityProfile.O0) == null || str4.length() == 0)) {
                    pvnVar.g(new lqg(bwd0.i(extendedCommunityProfile)));
                }
                if ((!extendedCommunityProfile.y2 || extendedCommunityProfile.x2) && w2h.a(extendedCommunityProfile) && (((str2 = extendedCommunityProfile.V) == null || drm0.N(str2)) && (((str3 = extendedCommunityProfile.t0) == null || drm0.N(str3)) && !extendedCommunityProfile.a2 && extendedCommunityProfile.Z1 == 0))) {
                    UserId i8 = bwd0.i(extendedCommunityProfile);
                    ExtendedCommunityProfile.c cVar = extendedCommunityProfile.b2;
                    String str11 = extendedCommunityProfile.t0;
                    String str12 = extendedCommunityProfile.V;
                    Address address2 = extendedCommunityProfile.W1;
                    pvnVar.g(new zpg(i8, cVar, str11, str12, address2 == null ? address2.f : null));
                }
                ArrayList a3 = this.e.a(extendedCommunityProfile);
                if (z2 || z || a3.isEmpty()) {
                    return;
                }
                pvnVar.g(new gpg(extendedCommunityProfile.a.c, a3, extendedCommunityProfile.a1, extendedCommunityProfile.Y, extendedCommunityProfile.Z, w2h.a(extendedCommunityProfile), xrhVar instanceof xrh.d.a ? (xrh.d.a) xrhVar : null));
                return;
            }
        }
        str = null;
        pvnVar.g(new CommunityDescriptionItemModel(str6, z, str, !(xrhVar instanceof xrh.d.C4044d) ? CommunityDescriptionItemModel.SectionsTooltip.Editor : xrhVar instanceof xrh.d.e ? CommunityDescriptionItemModel.SectionsTooltip.User : null));
        dVar = extendedCommunityProfile.C2;
        if (dVar != null) {
        }
        if (((Boolean) this.m.getValue()).booleanValue()) {
            GroupMarketInfo.CommunityTrustMarks.CommunityTrustMark communityTrustMark2 = communityTrustMarks.b;
            code = communityTrustMark2.b;
            String str72 = communityTrustMark2.c;
            switch (d.a.$EnumSwitchMapping$1[code.ordinal()]) {
            }
            pvnVar.g(new CommunityTrustMarkItemModel(code, type, str72, w2h.a(extendedCommunityProfile)));
        }
        if (extendedCommunityProfile.Y == 1) {
        }
        z3 = false;
        if (myc0.f(extendedCommunityProfile.V)) {
        }
        if (extendedCommunityProfile.Y == 1) {
        }
        if (((Boolean) this.n.getValue()).booleanValue()) {
        }
        if (w2h.a(extendedCommunityProfile)) {
            pvnVar.g(new lqg(bwd0.i(extendedCommunityProfile)));
        }
        if (!extendedCommunityProfile.y2) {
        }
        UserId i82 = bwd0.i(extendedCommunityProfile);
        ExtendedCommunityProfile.c cVar2 = extendedCommunityProfile.b2;
        String str112 = extendedCommunityProfile.t0;
        String str122 = extendedCommunityProfile.V;
        Address address22 = extendedCommunityProfile.W1;
        pvnVar.g(new zpg(i82, cVar2, str112, str122, address22 == null ? address22.f : null));
        ArrayList a32 = this.e.a(extendedCommunityProfile);
        if (z2) {
        }
    }

    public final boolean v(xrh.b bVar) {
        if (bVar == null || !bVar.d()) {
            return false;
        }
        HashSet hashSet = iah0.a;
        return fnj.c(this.c);
    }
}
