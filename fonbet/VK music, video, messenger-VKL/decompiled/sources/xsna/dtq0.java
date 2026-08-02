package xsna;

import android.os.Bundle;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.common.links.LinksParserData;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.TrackableOwner;
import com.vk.dto.newsfeed.entries.FriendsBlock;
import com.vk.dto.profile.FollowersBlock;
import com.vk.dto.profile.MutualFriendsBlock;
import com.vk.dto.profile.Occupation;
import com.vk.dto.profile.RequestsBlock;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.InvisibleStatus;
import com.vk.dto.user.OnlineInfo;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.VisibleStatus;
import com.vk.profile.core.avatar.StoryBorderMode;
import com.vk.profile.user.api.data.UserProfileSkeletonParams;
import com.vk.profile.user.api.domain.UserProfileMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.profile.user.impl.ui.g;
import com.vk.toggle.features.VasFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.d9f0;
import xsna.dj90;
import xsna.nym0;

/* compiled from: UserProfileOldItemFactory.kt */
/* loaded from: classes5.dex */
public final class dtq0 implements mqq0 {
    public final orq0 a;
    public final wpq0 b;
    public final qpq0 c;
    public final xuq0 d;

    public dtq0(orq0 orq0Var, wpq0 wpq0Var, qpq0 qpq0Var, auq0 auq0Var, itq0 itq0Var, vtq0 vtq0Var, xuq0 xuq0Var, c960 c960Var, kqq0 kqq0Var) {
        this.a = orq0Var;
        this.b = wpq0Var;
        this.c = qpq0Var;
        this.d = xuq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x09ab, code lost:
    
        if (r4 != null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0a9e, code lost:
    
        if (r6 == null) goto L603;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0860, code lost:
    
        if (r4 != null) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x08d7, code lost:
    
        if (r4 != null) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x01e8, code lost:
    
        if (r14.equals("school") == false) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b17  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0b23  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0b73 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0550  */
    /* JADX WARN: Type inference failed for: r14v10, types: [com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem$h$a] */
    /* JADX WARN: Type inference failed for: r14v8, types: [com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem$h$b$b] */
    /* JADX WARN: Type inference failed for: r4v150, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v48, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.mqq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(com.vk.profile.user.impl.ui.g gVar, ExtendedUserProfile extendedUserProfile, List list, List list2, je40 je40Var) {
        int i;
        ListBuilder g;
        ArrayList arrayList;
        Iterator it;
        int i2;
        ListBuilder.a aVar;
        Object next;
        int i3;
        ImageStatus imageStatus;
        UserProfileAdapterItem.MainInfo.c.a.AbstractC1700a c1701a;
        String concat;
        Group group;
        UserProfileAdapterItem.MainInfo.ActionButtons.State state;
        UserProfileAdapterItem.MainInfo.ActionButtons.State state2;
        boolean z;
        boolean z2;
        UserProfileAdapterItem.MainInfo.ActionButtons actionButtons;
        VasFeatures vasFeatures;
        int i4;
        ExtendedUserProfile.j jVar;
        UserProfileAdapterItem.MainInfo.b bVar;
        UserProfileAdapterItem.MainInfo.c cVar;
        d9f0 d9f0Var;
        nym0 nym0Var;
        s8u0 s8u0Var;
        String str;
        UserProfileAdapterItem.r rVar;
        ArrayList arrayList2;
        UserProfile userProfile;
        UserProfileAdapterItem.h.b.a aVar2;
        Iterable iterable;
        Object obj;
        List list3;
        UserProfileAdapterItem.h.b.a aVar3;
        hyn hynVar;
        UserProfileAdapterItem.s a;
        ArrayList arrayList3;
        idc0 idc0Var;
        boolean d;
        yc0 yc0Var;
        UserProfileAdapterItem.p a2;
        Set set;
        List list4;
        c920 bVar2;
        List list5;
        TrackableOwner trackableOwner;
        UserProfileAdapterItem.p a3;
        int i5;
        StoryEntry Fb;
        ListBuilder e = e43.e();
        if (extendedUserProfile != null) {
            orq0 orq0Var = this.a;
            htq0 htq0Var = orq0Var.a;
            dvq0 dvq0Var = orq0Var.e;
            OnlineInfo onlineInfo = extendedUserProfile.a.n;
            OnlineInfo onlineInfo2 = ((!epx.f(onlineInfo, VisibleStatus.f) && !(onlineInfo instanceof InvisibleStatus)) && (!extendedUserProfile.a.A && !dvq0Var.d(extendedUserProfile))) ? onlineInfo : null;
            StoryBorderMode.a aVar4 = StoryBorderMode.Companion;
            ArrayList<StoriesContainer> arrayList4 = extendedUserProfile.v1;
            Iterator it2 = arrayList4.iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                i6 += orq0Var.d.F((StoriesContainer) it2.next());
            }
            aVar4.getClass();
            Pair a4 = StoryBorderMode.a.a(i6, arrayList4);
            StoryBorderMode storyBorderMode = (StoryBorderMode) a4.d();
            StoriesContainer storiesContainer = (StoriesContainer) a4.g();
            UserProfileSkeletonParams userProfileSkeletonParams = htq0Var.j;
            String str2 = userProfileSkeletonParams != null ? userProfileSkeletonParams.c : null;
            Image image = (!bwd0.d(extendedUserProfile) || extendedUserProfile.n0 || extendedUserProfile.g()) ? extendedUserProfile.a.O : null;
            AvatarBorderType avatarBorderType = extendedUserProfile.a.Y ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
            UserProfileMode userProfileMode = htq0Var.i;
            boolean d2 = bwd0.d(extendedUserProfile);
            StoriesContainer storiesContainer2 = (StoriesContainer) j5g.a0(extendedUserProfile.v1);
            boolean z3 = storiesContainer2 != null && storiesContainer2.Gb().isEmpty();
            StoriesContainer storiesContainer3 = (StoriesContainer) j5g.a0(extendedUserProfile.v1);
            String Kb = (storiesContainer3 == null || (Fb = storiesContainer3.Fb()) == null) ? null : Fb.Kb();
            UserProfile userProfile2 = extendedUserProfile.a;
            UserProfileAdapterItem.MainInfo.a aVar5 = new UserProfileAdapterItem.MainInfo.a(str2, image, avatarBorderType, storyBorderMode, onlineInfo2, userProfileMode, d2, storiesContainer, z3, Kb, userProfile2.c0);
            String str3 = userProfile2.e;
            ImageStatus imageStatus2 = userProfile2.R;
            ucp ucpVar = ucp.a;
            CharSequence i7 = ucp.i(orq0Var.c.a().d(extendedUserProfile.g1, new LinksParserData(2939, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382)));
            String str4 = extendedUserProfile.g() ? "@" + extendedUserProfile.A0 : null;
            MusicTrack musicTrack = extendedUserProfile.f1;
            String str5 = extendedUserProfile.s0;
            if (!myc0.f(str5) || !dvq0Var.k(extendedUserProfile) || dvq0Var.d(extendedUserProfile)) {
                str5 = null;
            }
            Occupation occupation = extendedUserProfile.L;
            if (occupation != null) {
                String str6 = occupation.d;
                String str7 = occupation.b;
                if (str7 != null) {
                    int hashCode = str7.hashCode();
                    if (hashCode == -907977868) {
                        imageStatus = imageStatus2;
                    } else if (hashCode != 3655441) {
                        if (hashCode == 189328014 && str7.equals("university")) {
                            imageStatus = imageStatus2;
                            if (str6 != null) {
                                Long l = occupation.e;
                                if (l != null) {
                                    if ((l.longValue() > 0 ? l : null) != null && (concat = str6.concat(String.format(" '%02d", Arrays.copyOf(new Object[]{Long.valueOf(l.longValue() % 100)}, 1)))) != null) {
                                        str6 = concat;
                                    }
                                }
                                String str8 = myc0.f(str6) ? str6 : null;
                                if (str8 != null) {
                                    c1701a = new UserProfileAdapterItem.MainInfo.c.a.AbstractC1700a.C1701a(str8);
                                    UserProfileAdapterItem.MainInfo.c.a aVar6 = new UserProfileAdapterItem.MainInfo.c.a(str5, !dvq0Var.d(extendedUserProfile) ? c1701a : null, !dvq0Var.d(extendedUserProfile));
                                    VerifyInfo verifyInfo = extendedUserProfile.a.B;
                                    boolean a5 = orq0Var.e.a(orq0Var.b.a);
                                    UserProfile userProfile3 = extendedUserProfile.a;
                                    UserProfileAdapterItem.MainInfo.c cVar2 = new UserProfileAdapterItem.MainInfo.c(str3, i7, str4, imageStatus, musicTrack, aVar6, verifyInfo, a5, userProfile3.A, userProfile3.X, userProfile3.K().booleanValue(), dvq0Var.d(extendedUserProfile), onlineInfo2);
                                    if (orq0Var.e.a(orq0Var.b.a)) {
                                        UserProfileAdapterItem.MainInfo.ActionButtons.State state3 = UserProfileAdapterItem.MainInfo.ActionButtons.State.NONE;
                                        actionButtons = new UserProfileAdapterItem.MainInfo.ActionButtons(new UserProfileAdapterItem.MainInfo.ActionButtons.a(state3, false), new UserProfileAdapterItem.MainInfo.ActionButtons.a(extendedUserProfile.B1 ? UserProfileAdapterItem.MainInfo.ActionButtons.State.PROMOTE : state3, false), new UserProfileAdapterItem.MainInfo.ActionButtons.a(state3, false), false, false, false, false, false);
                                    } else {
                                        if (!dvq0Var.d(extendedUserProfile) && ((Boolean) orq0Var.f.getValue()).booleanValue() && extendedUserProfile.e0) {
                                            int i8 = extendedUserProfile.a1;
                                            if (i8 == 0 && extendedUserProfile.a.e0 == SocialButtonType.ADD) {
                                                state = UserProfileAdapterItem.MainInfo.ActionButtons.State.ADD_TO_FRIEND;
                                            } else if (i8 == 0 && extendedUserProfile.a.e0 == SocialButtonType.FOLLOW) {
                                                state = UserProfileAdapterItem.MainInfo.ActionButtons.State.FOLLOW;
                                            } else if (i8 == 0 && extendedUserProfile.k0) {
                                                state = UserProfileAdapterItem.MainInfo.ActionButtons.State.ADD_TO_FRIEND;
                                            } else if (i8 == 0 && !extendedUserProfile.k0) {
                                                state = UserProfileAdapterItem.MainInfo.ActionButtons.State.FOLLOW;
                                            } else if (i8 == 3) {
                                                VasFeatures vasFeatures2 = VasFeatures.VAS_GIFT_BUTTON_IN_PROFILE;
                                                vasFeatures2.getClass();
                                                state = com.vk.toggle.b.A.a(vasFeatures2) ? UserProfileAdapterItem.MainInfo.ActionButtons.State.GIFT : UserProfileAdapterItem.MainInfo.ActionButtons.State.AT_FRIENDS;
                                            } else {
                                                state = (i8 == 1 && extendedUserProfile.k0) ? UserProfileAdapterItem.MainInfo.ActionButtons.State.FRIEND_REQUEST_SENT : (i8 != 1 || extendedUserProfile.k0) ? UserProfileAdapterItem.MainInfo.ActionButtons.State.NONE : UserProfileAdapterItem.MainInfo.ActionButtons.State.FOLLOWING;
                                            }
                                        } else {
                                            state = UserProfileAdapterItem.MainInfo.ActionButtons.State.NONE;
                                        }
                                        UserProfileAdapterItem.MainInfo.ActionButtons.State state4 = UserProfileAdapterItem.MainInfo.ActionButtons.State.NONE;
                                        if (state == state4) {
                                            if (!dvq0Var.d(extendedUserProfile)) {
                                                if (extendedUserProfile.a.A && extendedUserProfile.e0) {
                                                    state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.MESSAGE;
                                                } else {
                                                    int i9 = extendedUserProfile.a1;
                                                    if (i9 == 3 && extendedUserProfile.e0) {
                                                        state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.MESSAGE;
                                                    } else if (i9 != 3 || extendedUserProfile.e0) {
                                                        if (extendedUserProfile.A1) {
                                                            i4 = 1;
                                                            if (i9 == 1 && extendedUserProfile.k0) {
                                                                state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.FRIEND_REQUEST_SENT_PRIVATE;
                                                            }
                                                        } else {
                                                            i4 = 1;
                                                        }
                                                        if (i9 == i4 && extendedUserProfile.k0) {
                                                            state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.FRIEND_REQUEST_SENT;
                                                        } else if (i9 == i4 && !extendedUserProfile.k0) {
                                                            state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.FOLLOWING;
                                                        } else if (i9 == 2 && dvq0Var.h().a0) {
                                                            state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.YOUR_FOLLOWER;
                                                        } else if (extendedUserProfile.a1 != 2 || dvq0Var.h().a0) {
                                                            int i10 = extendedUserProfile.a1;
                                                            if (i10 == 0 && extendedUserProfile.a.e0 == SocialButtonType.ADD) {
                                                                state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.ADD_TO_FRIEND;
                                                            } else if (i10 == 0 && extendedUserProfile.a.e0 == SocialButtonType.FOLLOW) {
                                                                state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.FOLLOW;
                                                            } else if (i10 == 0 && extendedUserProfile.k0) {
                                                                state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.ADD_TO_FRIEND;
                                                            } else if (i10 == 0 && !extendedUserProfile.k0) {
                                                                state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.FOLLOW;
                                                            }
                                                        } else {
                                                            state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.REPLY_TO_REQUEST;
                                                        }
                                                    } else {
                                                        VasFeatures vasFeatures3 = VasFeatures.VAS_GIFT_BUTTON_IN_PROFILE;
                                                        vasFeatures3.getClass();
                                                        state2 = com.vk.toggle.b.A.a(vasFeatures3) ? UserProfileAdapterItem.MainInfo.ActionButtons.State.GIFT : UserProfileAdapterItem.MainInfo.ActionButtons.State.AT_FRIENDS;
                                                    }
                                                }
                                            }
                                            state2 = state4;
                                        } else {
                                            state2 = UserProfileAdapterItem.MainInfo.ActionButtons.State.MESSAGE;
                                        }
                                        if (state2 == state4 && !dvq0Var.d(extendedUserProfile)) {
                                            tv4.b("Can't detect profile primary action state", com.vk.metrics.eventtracking.b.a);
                                        }
                                        UserProfileAdapterItem.MainInfo.ActionButtons.a aVar7 = new UserProfileAdapterItem.MainInfo.ActionButtons.a(state2, extendedUserProfile.a.K().booleanValue());
                                        UserProfileAdapterItem.MainInfo.ActionButtons.a aVar8 = new UserProfileAdapterItem.MainInfo.ActionButtons.a(state4, false);
                                        UserProfileAdapterItem.MainInfo.ActionButtons.a aVar9 = new UserProfileAdapterItem.MainInfo.ActionButtons.a(state, false);
                                        boolean z4 = !extendedUserProfile.a.A;
                                        if (state == state4 && extendedUserProfile.a1 == 3 && state2 != UserProfileAdapterItem.MainInfo.ActionButtons.State.AT_FRIENDS) {
                                            VasFeatures vasFeatures4 = VasFeatures.VAS_GIFT_BUTTON_IN_PROFILE;
                                            vasFeatures4.getClass();
                                            if (!com.vk.toggle.b.A.a(vasFeatures4)) {
                                                z = true;
                                                if (state == state4 && extendedUserProfile.a1 == 3 && state2 != UserProfileAdapterItem.MainInfo.ActionButtons.State.AT_FRIENDS && state2 != UserProfileAdapterItem.MainInfo.ActionButtons.State.GIFT) {
                                                    vasFeatures = VasFeatures.VAS_GIFT_BUTTON_IN_PROFILE;
                                                    vasFeatures.getClass();
                                                    if (com.vk.toggle.b.A.a(vasFeatures)) {
                                                        z2 = true;
                                                        actionButtons = new UserProfileAdapterItem.MainInfo.ActionButtons(aVar7, aVar8, aVar9, (extendedUserProfile.e0 || state2 == UserProfileAdapterItem.MainInfo.ActionButtons.State.MESSAGE) ? false : true, z4, true, z, z2);
                                                    }
                                                }
                                                z2 = false;
                                                actionButtons = new UserProfileAdapterItem.MainInfo.ActionButtons(aVar7, aVar8, aVar9, (extendedUserProfile.e0 || state2 == UserProfileAdapterItem.MainInfo.ActionButtons.State.MESSAGE) ? false : true, z4, true, z, z2);
                                            }
                                        }
                                        z = false;
                                        if (state == state4) {
                                            vasFeatures = VasFeatures.VAS_GIFT_BUTTON_IN_PROFILE;
                                            vasFeatures.getClass();
                                            if (com.vk.toggle.b.A.a(vasFeatures)) {
                                            }
                                        }
                                        z2 = false;
                                        actionButtons = new UserProfileAdapterItem.MainInfo.ActionButtons(aVar7, aVar8, aVar9, (extendedUserProfile.e0 || state2 == UserProfileAdapterItem.MainInfo.ActionButtons.State.MESSAGE) ? false : true, z4, true, z, z2);
                                    }
                                    UserProfileAdapterItem.MainInfo.ActionButtons actionButtons2 = actionButtons;
                                    UserProfileAdapterItem.MainInfo.b bVar3 = new UserProfileAdapterItem.MainInfo.b((extendedUserProfile.A1 || !orq0Var.e.a(orq0Var.b.a) || dvq0Var.d(extendedUserProfile)) ? false : true, gVar.l, new UserProfileAdapterItem.MainInfo.b.a(extendedUserProfile.C1));
                                    boolean e2 = extendedUserProfile.e();
                                    boolean z5 = extendedUserProfile.a.X;
                                    boolean z6 = extendedUserProfile.B1;
                                    jVar = extendedUserProfile.R1;
                                    if (jVar != null) {
                                        ArrayList arrayList5 = jVar.c;
                                        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                                        Iterator it3 = arrayList5.iterator();
                                        while (it3.hasNext()) {
                                            ExtendedUserProfile.j.a aVar10 = (ExtendedUserProfile.j.a) it3.next();
                                            arrayList6.add(new d9f0.b(aVar10.a, aVar10.b.longValue()));
                                            cVar2 = cVar2;
                                        }
                                        cVar = cVar2;
                                        int i11 = jVar.a;
                                        Integer valueOf = i11 > 0 ? Integer.valueOf(i11) : null;
                                        bVar = bVar3;
                                        d9f0Var = new d9f0(arrayList6, valueOf != null ? valueOf.intValue() : jVar.c.size(), jVar.b, new d9f0.a(jVar.d, jVar.e, jVar.f, jVar.g, jVar.h, jVar.i, jVar.j, jVar.k), extendedUserProfile.h, orq0Var.e.a(orq0Var.b.a), extendedUserProfile.a.c.b);
                                    } else {
                                        bVar = bVar3;
                                        cVar = cVar2;
                                        d9f0Var = null;
                                    }
                                    boolean z7 = extendedUserProfile.S1 != null;
                                    if (!bwd0.d(extendedUserProfile) && !dvq0Var.d(extendedUserProfile) && ((Boolean) orq0Var.g.getValue()).booleanValue()) {
                                        i5 = extendedUserProfile.a1;
                                        if (i5 != 0 && extendedUserProfile.Q1) {
                                            nym0Var = new nym0(extendedUserProfile.a.d, R.string.user_profile_follow_promo, !((Boolean) orq0Var.h.getValue()).booleanValue() ? new nym0.a(extendedUserProfile.a.d, R.string.user_profile_follow_onboarding_title, R.string.user_profile_follow_onboarding_subtitle) : null);
                                        } else if (i5 != 1 && extendedUserProfile.Q1) {
                                            nym0Var = new nym0(extendedUserProfile.a.d, R.string.user_profile_following_promo, new nym0.a(extendedUserProfile.b, R.string.user_profile_following_onboarding_title, R.string.user_profile_following_onboarding_subtitle));
                                        } else if (i5 == 2) {
                                            int i12 = extendedUserProfile.a.K().booleanValue() ? R.string.user_profile_reply_to_request_promo_f : R.string.user_profile_reply_to_request_promo_m;
                                            String str9 = extendedUserProfile.a.d;
                                            nym0Var = new nym0(str9, i12, new nym0.a(str9, R.string.user_profile_follow_you_onboarding_title, R.string.user_profile_following_onboarding_subtitle));
                                        }
                                        e.add(new UserProfileAdapterItem.MainInfo(aVar5, cVar, actionButtons2, bVar, e2, z5, z6, d9f0Var, z7, nym0Var));
                                        xuq0 xuq0Var = this.d;
                                        if (!extendedUserProfile.g()) {
                                            s8u0Var = new s8u0(0);
                                            int i13 = s8u0Var.i(new klv0(VkTypographyToken.TextNormal, VkColorToken.TextSecondary));
                                            try {
                                                s8u0Var.e(extendedUserProfile.q.q5());
                                                s3q0 s3q0Var = s3q0.a;
                                            } finally {
                                            }
                                        } else if (!extendedUserProfile.m || (str = extendedUserProfile.o) == null) {
                                            s8u0Var = null;
                                        } else {
                                            ct2 ct2Var = (ct2) xuq0Var.a.getValue();
                                            ct2Var.getClass();
                                            ArrayList arrayList7 = new ArrayList();
                                            Matcher matcher = ct2Var.a.matcher(str);
                                            int i14 = 0;
                                            while (matcher.find()) {
                                                String group2 = matcher.group(0);
                                                if (group2 != null && group2.length() != 0) {
                                                    int start = matcher.start();
                                                    if (start != i14) {
                                                        arrayList7.add(new dj90.b(str.substring(i14, start)));
                                                    }
                                                    i14 = matcher.end();
                                                    Pattern pattern = yjo0.a;
                                                    l9z h = yjo0.h(matcher.start(), matcher.end(), group2);
                                                    if (h != null) {
                                                        arrayList7.add(new dj90.a(h.d, h.c));
                                                    }
                                                }
                                            }
                                            if (i14 != str.length()) {
                                                arrayList7.add(new dj90.b(str.substring(i14)));
                                            }
                                            ndz ndzVar = new ndz(arrayList7);
                                            s8u0Var = new s8u0(0);
                                            int h2 = s8u0Var.h(new uav0(VkTypographyToken.TextNormal));
                                            try {
                                                for (dj90 dj90Var : ndzVar.a) {
                                                    if (dj90Var instanceof dj90.a) {
                                                        int g2 = s8u0Var.g(new h2v0(((dj90.a) dj90Var).a, new zqv0(new klv0(VkTypographyToken.TextNormal, VkColorToken.TextLink), 14), new wuq0(je40Var, (dj90.a) dj90Var)));
                                                        try {
                                                            s8u0Var.e(((dj90.a) dj90Var).b);
                                                            s3q0 s3q0Var2 = s3q0.a;
                                                            s8u0Var.f(g2);
                                                        } catch (Throwable th) {
                                                            s8u0Var.f(g2);
                                                            throw th;
                                                        }
                                                    } else {
                                                        if (!(dj90Var instanceof dj90.b)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        int i15 = s8u0Var.i(new klv0(VkTypographyToken.TextNormal, VkColorToken.TextSecondary));
                                                        try {
                                                            s8u0Var.e(((dj90.b) dj90Var).a);
                                                            s3q0 s3q0Var3 = s3q0.a;
                                                            s8u0Var.f(i15);
                                                        } finally {
                                                        }
                                                    }
                                                }
                                                s3q0 s3q0Var4 = s3q0.a;
                                                s8u0Var.f(h2);
                                            } catch (Throwable th2) {
                                                s8u0Var.f(h2);
                                                throw th2;
                                            }
                                        }
                                        rVar = s8u0Var == null ? new UserProfileAdapterItem.r(s8u0Var) : null;
                                        if (rVar == null) {
                                            e.add(rVar);
                                        } else {
                                            if (!extendedUserProfile.A1 && (a3 = auq0.a(extendedUserProfile)) != null) {
                                                e.add(a3);
                                            }
                                            e.addAll(vtq0.a(extendedUserProfile, list));
                                            ArrayList arrayList8 = new ArrayList();
                                            ExtendedUserProfile.f[] fVarArr = extendedUserProfile.x1;
                                            if (fVarArr != null) {
                                                ArrayList arrayList9 = new ArrayList(fVarArr.length);
                                                for (ExtendedUserProfile.f fVar : fVarArr) {
                                                    Image image2 = fVar.c;
                                                    arrayList9.add(new UserProfileAdapterItem.PromoButtons.a(image2 != null ? image2.Cb(iah0.a(48), false, true).d.d : null, fVar.a, fVar.e, fVar.b));
                                                }
                                                arrayList2 = arrayList9;
                                            } else {
                                                arrayList2 = null;
                                            }
                                            i = 0;
                                            if (arrayList2 != null) {
                                                arrayList8.addAll(arrayList2);
                                            }
                                            e.addAll(arrayList8);
                                            UserProfileAdapterItem.l lVar = list2.isEmpty() ? null : new UserProfileAdapterItem.l(list2);
                                            if (lVar != null) {
                                                e.add(lVar);
                                            }
                                            UserProfileAdapterItem.o oVar = (bwd0.c(extendedUserProfile) && (userProfile = extendedUserProfile.a) != null) ? new UserProfileAdapterItem.o(userProfile) : null;
                                            if (oVar != null) {
                                                e.add(oVar);
                                            }
                                            if (extendedUserProfile.b("followers") > 0 || extendedUserProfile.b("friends") > 0) {
                                                UserProfile userProfile4 = extendedUserProfile.a;
                                                if (userProfile4.a0) {
                                                    qpq0 qpq0Var = this.c;
                                                    boolean z8 = gVar.w;
                                                    if (qpq0Var.a.a(userProfile4.c)) {
                                                        int b = extendedUserProfile.b("friends");
                                                        int b2 = extendedUserProfile.b("followers");
                                                        FriendsBlock friendsBlock = extendedUserProfile.O;
                                                        List a6 = qpq0.a(3, friendsBlock != null ? friendsBlock.b : null);
                                                        FollowersBlock followersBlock = extendedUserProfile.P;
                                                        aVar3 = new UserProfileAdapterItem.h.a(b, b2, a6, qpq0.a(3, followersBlock != null ? followersBlock.b : null), z8);
                                                    } else {
                                                        if (extendedUserProfile.Q1) {
                                                            int b3 = extendedUserProfile.b("followers");
                                                            int b4 = extendedUserProfile.b("friends");
                                                            if (b4 + b3 == 0) {
                                                                aVar2 = null;
                                                            } else {
                                                                FollowersBlock followersBlock2 = extendedUserProfile.P;
                                                                int i16 = followersBlock2 != null ? followersBlock2.e : 0;
                                                                if (followersBlock2 != null) {
                                                                    iterable = j5g.D0(new hj30(2), followersBlock2.b);
                                                                }
                                                                iterable = EmptyList.b;
                                                                FollowersBlock followersBlock3 = extendedUserProfile.P;
                                                                List a7 = qpq0.a(3, followersBlock3 != null ? followersBlock3.b : null);
                                                                FriendsBlock friendsBlock2 = extendedUserProfile.O;
                                                                List a8 = qpq0.a(3, friendsBlock2 != null ? friendsBlock2.b : null);
                                                                Iterator it4 = iterable.iterator();
                                                                while (true) {
                                                                    if (!it4.hasNext()) {
                                                                        obj = null;
                                                                        break;
                                                                    }
                                                                    obj = it4.next();
                                                                    if (((TrackableOwner) obj).b.i(512)) {
                                                                        break;
                                                                    }
                                                                }
                                                                TrackableOwner trackableOwner2 = (TrackableOwner) obj;
                                                                String str10 = trackableOwner2 != null ? trackableOwner2.b.m : null;
                                                                int b5 = extendedUserProfile.b("mutual_friends");
                                                                MutualFriendsBlock mutualFriendsBlock = extendedUserProfile.N;
                                                                if (mutualFriendsBlock != null) {
                                                                    ArrayList<TrackableOwner> arrayList10 = mutualFriendsBlock.b;
                                                                    ArrayList arrayList11 = new ArrayList();
                                                                    Iterator it5 = arrayList10.iterator();
                                                                    while (it5.hasNext()) {
                                                                        String str11 = ((TrackableOwner) it5.next()).b.m;
                                                                        if (str11 != null) {
                                                                            arrayList11.add(str11);
                                                                        }
                                                                    }
                                                                    list3 = j5g.H0(arrayList11, 2);
                                                                }
                                                                list3 = EmptyList.b;
                                                                aVar3 = new UserProfileAdapterItem.h.b.C1702b(b3, b4, a7, a8, str10, i16, b5, list3, extendedUserProfile.a());
                                                            }
                                                        } else {
                                                            int b6 = extendedUserProfile.b("friends");
                                                            int b7 = extendedUserProfile.b("mutual_friends");
                                                            FriendsBlock friendsBlock3 = extendedUserProfile.O;
                                                            ArrayList<TrackableOwner> arrayList12 = friendsBlock3 != null ? friendsBlock3.b : null;
                                                            List a9 = qpq0.a(arrayList12 != null ? arrayList12.size() : 0, arrayList12);
                                                            MutualFriendsBlock mutualFriendsBlock2 = extendedUserProfile.N;
                                                            ArrayList<TrackableOwner> arrayList13 = mutualFriendsBlock2 != null ? mutualFriendsBlock2.b : null;
                                                            aVar2 = new UserProfileAdapterItem.h.b.a(b6, b7, a9, qpq0.a(arrayList13 != null ? arrayList13.size() : 0, arrayList13), extendedUserProfile.a());
                                                        }
                                                        if (aVar2 != null) {
                                                            e.add(aVar2);
                                                        }
                                                        if (extendedUserProfile.A1 && (a2 = auq0.a(extendedUserProfile)) != null) {
                                                            e.add(a2);
                                                        }
                                                        hynVar = gVar.s;
                                                        if (hynVar != null) {
                                                            e.add(new UserProfileAdapterItem.c(hynVar));
                                                        }
                                                        a = kqq0.a(gVar.u);
                                                        if (a != null) {
                                                            e.add(a);
                                                        }
                                                        arrayList3 = new ArrayList();
                                                        idc0Var = gVar.q;
                                                        d = bwd0.d(extendedUserProfile);
                                                        if ((!d && extendedUserProfile.g0) || (d && !(gVar.n.b instanceof g.c.a))) {
                                                            arrayList3.add(new UserProfileAdapterItem.m(d, idc0Var.b, idc0Var.c));
                                                        }
                                                        if (idc0Var.d && idc0Var.a && extendedUserProfile.g0) {
                                                            arrayList3.add(new UserProfileAdapterItem.d());
                                                        }
                                                        e.addAll(arrayList3);
                                                        yc0Var = gVar.x;
                                                        if (yc0Var != null) {
                                                            e.add(new UserProfileAdapterItem.a(yc0Var));
                                                        }
                                                        if (!extendedUserProfile.A1 && gVar.g == null) {
                                                            e.add(new UserProfileAdapterItem.k(2));
                                                        }
                                                    }
                                                    aVar2 = aVar3;
                                                    if (aVar2 != null) {
                                                    }
                                                    if (extendedUserProfile.A1) {
                                                        e.add(a2);
                                                    }
                                                    hynVar = gVar.s;
                                                    if (hynVar != null) {
                                                    }
                                                    a = kqq0.a(gVar.u);
                                                    if (a != null) {
                                                    }
                                                    arrayList3 = new ArrayList();
                                                    idc0Var = gVar.q;
                                                    d = bwd0.d(extendedUserProfile);
                                                    if (!d) {
                                                        arrayList3.add(new UserProfileAdapterItem.m(d, idc0Var.b, idc0Var.c));
                                                        if (idc0Var.d) {
                                                            arrayList3.add(new UserProfileAdapterItem.d());
                                                        }
                                                        e.addAll(arrayList3);
                                                        yc0Var = gVar.x;
                                                        if (yc0Var != null) {
                                                        }
                                                        if (!extendedUserProfile.A1) {
                                                            e.add(new UserProfileAdapterItem.k(2));
                                                        }
                                                    }
                                                    arrayList3.add(new UserProfileAdapterItem.m(d, idc0Var.b, idc0Var.c));
                                                    if (idc0Var.d) {
                                                    }
                                                    e.addAll(arrayList3);
                                                    yc0Var = gVar.x;
                                                    if (yc0Var != null) {
                                                    }
                                                    if (!extendedUserProfile.A1) {
                                                    }
                                                }
                                            }
                                            boolean a10 = this.b.a.a(extendedUserProfile.a.c);
                                            boolean z9 = extendedUserProfile.a.B.b;
                                            boolean z10 = extendedUserProfile.a1 == 3;
                                            if (a10) {
                                                RequestsBlock requestsBlock = extendedUserProfile.Q;
                                                int i17 = requestsBlock != null ? requestsBlock.c : 0;
                                                int b8 = extendedUserProfile.b("friends");
                                                if (i17 == 0 && b8 == 0) {
                                                    bVar2 = UserProfileAdapterItem.i.b.a.c;
                                                } else if (b8 != 0) {
                                                    FriendsBlock friendsBlock4 = extendedUserProfile.O;
                                                    bVar2 = new UserProfileAdapterItem.i.b.c(b8, i17, wpq0.a(friendsBlock4 != null ? friendsBlock4.b : null));
                                                } else {
                                                    RequestsBlock requestsBlock2 = extendedUserProfile.Q;
                                                    bVar2 = new UserProfileAdapterItem.i.b.C1703b(i17, wpq0.a(requestsBlock2 != null ? requestsBlock2.b : null));
                                                }
                                            } else if (!z9 || z10) {
                                                int b9 = extendedUserProfile.b("friends");
                                                if (b9 != 0) {
                                                    int b10 = extendedUserProfile.b("mutual_friends");
                                                    if (bwd0.c(extendedUserProfile) && b10 == 0) {
                                                        bVar2 = new UserProfileAdapterItem.i.c.a(extendedUserProfile.b("friends"));
                                                    } else {
                                                        int min = Math.min(2, b10);
                                                        MutualFriendsBlock mutualFriendsBlock3 = extendedUserProfile.N;
                                                        if (mutualFriendsBlock3 != null) {
                                                            ArrayList<TrackableOwner> arrayList14 = mutualFriendsBlock3.b;
                                                            ArrayList arrayList15 = new ArrayList(c5g.u(arrayList14, 10));
                                                            Iterator it6 = arrayList14.iterator();
                                                            while (it6.hasNext()) {
                                                                arrayList15.add(((TrackableOwner) it6.next()).b.b);
                                                            }
                                                            set = j5g.S0(arrayList15);
                                                        } else {
                                                            set = null;
                                                        }
                                                        ListBuilder e3 = e43.e();
                                                        MutualFriendsBlock mutualFriendsBlock4 = extendedUserProfile.N;
                                                        if (mutualFriendsBlock4 != null) {
                                                            e3.addAll(mutualFriendsBlock4.b);
                                                        }
                                                        FriendsBlock friendsBlock5 = extendedUserProfile.O;
                                                        if (friendsBlock5 != null) {
                                                            for (TrackableOwner trackableOwner3 : friendsBlock5.b) {
                                                                if (set != null && set.contains(trackableOwner3.b.b)) {
                                                                }
                                                                e3.add(trackableOwner3);
                                                            }
                                                        }
                                                        ListBuilder g3 = e3.g();
                                                        if (g3 != null) {
                                                            ArrayList arrayList16 = new ArrayList();
                                                            Iterator it7 = g3.iterator();
                                                            while (true) {
                                                                ListBuilder.a aVar11 = (ListBuilder.a) it7;
                                                                if (!aVar11.hasNext()) {
                                                                    break;
                                                                }
                                                                String str12 = ((TrackableOwner) aVar11.next()).b.m;
                                                                if (str12 != null) {
                                                                    arrayList16.add(str12);
                                                                }
                                                            }
                                                            list4 = j5g.H0(arrayList16, min);
                                                        }
                                                        list4 = EmptyList.b;
                                                        bVar2 = new UserProfileAdapterItem.i.c.b(b9, b10, list4, wpq0.a(g3));
                                                    }
                                                }
                                                bVar2 = null;
                                            } else {
                                                boolean c = bwd0.c(extendedUserProfile);
                                                int b11 = extendedUserProfile.b("followers");
                                                if (!c) {
                                                    FollowersBlock followersBlock4 = extendedUserProfile.P;
                                                    int i18 = followersBlock4 != null ? followersBlock4.e : 0;
                                                    if (followersBlock4 != null) {
                                                        list5 = j5g.D0(new nj30(2), followersBlock4.b);
                                                    }
                                                    list5 = EmptyList.b;
                                                    Iterator it8 = list5.iterator();
                                                    while (true) {
                                                        if (!it8.hasNext()) {
                                                            trackableOwner = null;
                                                            break;
                                                        }
                                                        ?? next2 = it8.next();
                                                        if (((TrackableOwner) next2).b.i(512)) {
                                                            trackableOwner = next2;
                                                            break;
                                                        }
                                                    }
                                                    TrackableOwner trackableOwner4 = trackableOwner;
                                                    bVar2 = new UserProfileAdapterItem.i.a(b11, trackableOwner4 != null ? trackableOwner4.b.m : null, i18, bwd0.c(extendedUserProfile), wpq0.a(list5));
                                                }
                                                bVar2 = null;
                                            }
                                            if (bVar2 != null) {
                                                e.add(bVar2);
                                            }
                                            if (extendedUserProfile.A1) {
                                            }
                                            hynVar = gVar.s;
                                            if (hynVar != null) {
                                            }
                                            a = kqq0.a(gVar.u);
                                            if (a != null) {
                                            }
                                            arrayList3 = new ArrayList();
                                            idc0Var = gVar.q;
                                            d = bwd0.d(extendedUserProfile);
                                            if (!d) {
                                            }
                                            arrayList3.add(new UserProfileAdapterItem.m(d, idc0Var.b, idc0Var.c));
                                            if (idc0Var.d) {
                                            }
                                            e.addAll(arrayList3);
                                            yc0Var = gVar.x;
                                            if (yc0Var != null) {
                                            }
                                            if (!extendedUserProfile.A1) {
                                            }
                                        }
                                    }
                                    nym0Var = null;
                                    e.add(new UserProfileAdapterItem.MainInfo(aVar5, cVar, actionButtons2, bVar, e2, z5, z6, d9f0Var, z7, nym0Var));
                                    xuq0 xuq0Var2 = this.d;
                                    if (!extendedUserProfile.g()) {
                                    }
                                    if (s8u0Var == null) {
                                    }
                                    if (rVar == null) {
                                    }
                                }
                            }
                            c1701a = null;
                            UserProfileAdapterItem.MainInfo.c.a aVar62 = new UserProfileAdapterItem.MainInfo.c.a(str5, !dvq0Var.d(extendedUserProfile) ? c1701a : null, !dvq0Var.d(extendedUserProfile));
                            VerifyInfo verifyInfo2 = extendedUserProfile.a.B;
                            boolean a52 = orq0Var.e.a(orq0Var.b.a);
                            UserProfile userProfile32 = extendedUserProfile.a;
                            UserProfileAdapterItem.MainInfo.c cVar22 = new UserProfileAdapterItem.MainInfo.c(str3, i7, str4, imageStatus, musicTrack, aVar62, verifyInfo2, a52, userProfile32.A, userProfile32.X, userProfile32.K().booleanValue(), dvq0Var.d(extendedUserProfile), onlineInfo2);
                            if (orq0Var.e.a(orq0Var.b.a)) {
                            }
                            UserProfileAdapterItem.MainInfo.ActionButtons actionButtons22 = actionButtons;
                            UserProfileAdapterItem.MainInfo.b bVar32 = new UserProfileAdapterItem.MainInfo.b((extendedUserProfile.A1 || !orq0Var.e.a(orq0Var.b.a) || dvq0Var.d(extendedUserProfile)) ? false : true, gVar.l, new UserProfileAdapterItem.MainInfo.b.a(extendedUserProfile.C1));
                            boolean e22 = extendedUserProfile.e();
                            boolean z52 = extendedUserProfile.a.X;
                            boolean z62 = extendedUserProfile.B1;
                            jVar = extendedUserProfile.R1;
                            if (jVar != null) {
                            }
                            if (extendedUserProfile.S1 != null) {
                            }
                            if (!bwd0.d(extendedUserProfile)) {
                                i5 = extendedUserProfile.a1;
                                if (i5 != 0) {
                                }
                                if (i5 != 1) {
                                }
                                if (i5 == 2) {
                                }
                            }
                            nym0Var = null;
                            e.add(new UserProfileAdapterItem.MainInfo(aVar5, cVar, actionButtons22, bVar, e22, z52, z62, d9f0Var, z7, nym0Var));
                            xuq0 xuq0Var22 = this.d;
                            if (!extendedUserProfile.g()) {
                            }
                            if (s8u0Var == null) {
                            }
                            if (rVar == null) {
                            }
                        }
                    } else if (str7.equals("work")) {
                        ArrayList<Group> arrayList17 = extendedUserProfile.K;
                        if (arrayList17 != null) {
                            Iterator<Group> it9 = arrayList17.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    imageStatus = imageStatus2;
                                    group = null;
                                    break;
                                }
                                group = it9.next();
                                imageStatus = imageStatus2;
                                Iterator<Group> it10 = it9;
                                if (epx.f(group.c, new UserId(occupation.c))) {
                                    break;
                                }
                                imageStatus2 = imageStatus;
                                it9 = it10;
                            }
                            Group group3 = group;
                            if (group3 != null) {
                                c1701a = new UserProfileAdapterItem.MainInfo.c.a.AbstractC1700a.b(group3.d, group3.e);
                                if (c1701a == null) {
                                    if (str6 != null) {
                                        c1701a = new UserProfileAdapterItem.MainInfo.c.a.AbstractC1700a.b(str6, null);
                                    }
                                    c1701a = null;
                                }
                                UserProfileAdapterItem.MainInfo.c.a aVar622 = new UserProfileAdapterItem.MainInfo.c.a(str5, !dvq0Var.d(extendedUserProfile) ? c1701a : null, !dvq0Var.d(extendedUserProfile));
                                VerifyInfo verifyInfo22 = extendedUserProfile.a.B;
                                boolean a522 = orq0Var.e.a(orq0Var.b.a);
                                UserProfile userProfile322 = extendedUserProfile.a;
                                UserProfileAdapterItem.MainInfo.c cVar222 = new UserProfileAdapterItem.MainInfo.c(str3, i7, str4, imageStatus, musicTrack, aVar622, verifyInfo22, a522, userProfile322.A, userProfile322.X, userProfile322.K().booleanValue(), dvq0Var.d(extendedUserProfile), onlineInfo2);
                                if (orq0Var.e.a(orq0Var.b.a)) {
                                }
                                UserProfileAdapterItem.MainInfo.ActionButtons actionButtons222 = actionButtons;
                                UserProfileAdapterItem.MainInfo.b bVar322 = new UserProfileAdapterItem.MainInfo.b((extendedUserProfile.A1 || !orq0Var.e.a(orq0Var.b.a) || dvq0Var.d(extendedUserProfile)) ? false : true, gVar.l, new UserProfileAdapterItem.MainInfo.b.a(extendedUserProfile.C1));
                                boolean e222 = extendedUserProfile.e();
                                boolean z522 = extendedUserProfile.a.X;
                                boolean z622 = extendedUserProfile.B1;
                                jVar = extendedUserProfile.R1;
                                if (jVar != null) {
                                }
                                if (extendedUserProfile.S1 != null) {
                                }
                                if (!bwd0.d(extendedUserProfile)) {
                                }
                                nym0Var = null;
                                e.add(new UserProfileAdapterItem.MainInfo(aVar5, cVar, actionButtons222, bVar, e222, z522, z622, d9f0Var, z7, nym0Var));
                                xuq0 xuq0Var222 = this.d;
                                if (!extendedUserProfile.g()) {
                                }
                                if (s8u0Var == null) {
                                }
                                if (rVar == null) {
                                }
                            }
                        } else {
                            imageStatus = imageStatus2;
                        }
                        c1701a = null;
                        if (c1701a == null) {
                        }
                        UserProfileAdapterItem.MainInfo.c.a aVar6222 = new UserProfileAdapterItem.MainInfo.c.a(str5, !dvq0Var.d(extendedUserProfile) ? c1701a : null, !dvq0Var.d(extendedUserProfile));
                        VerifyInfo verifyInfo222 = extendedUserProfile.a.B;
                        boolean a5222 = orq0Var.e.a(orq0Var.b.a);
                        UserProfile userProfile3222 = extendedUserProfile.a;
                        UserProfileAdapterItem.MainInfo.c cVar2222 = new UserProfileAdapterItem.MainInfo.c(str3, i7, str4, imageStatus, musicTrack, aVar6222, verifyInfo222, a5222, userProfile3222.A, userProfile3222.X, userProfile3222.K().booleanValue(), dvq0Var.d(extendedUserProfile), onlineInfo2);
                        if (orq0Var.e.a(orq0Var.b.a)) {
                        }
                        UserProfileAdapterItem.MainInfo.ActionButtons actionButtons2222 = actionButtons;
                        UserProfileAdapterItem.MainInfo.b bVar3222 = new UserProfileAdapterItem.MainInfo.b((extendedUserProfile.A1 || !orq0Var.e.a(orq0Var.b.a) || dvq0Var.d(extendedUserProfile)) ? false : true, gVar.l, new UserProfileAdapterItem.MainInfo.b.a(extendedUserProfile.C1));
                        boolean e2222 = extendedUserProfile.e();
                        boolean z5222 = extendedUserProfile.a.X;
                        boolean z6222 = extendedUserProfile.B1;
                        jVar = extendedUserProfile.R1;
                        if (jVar != null) {
                        }
                        if (extendedUserProfile.S1 != null) {
                        }
                        if (!bwd0.d(extendedUserProfile)) {
                        }
                        nym0Var = null;
                        e.add(new UserProfileAdapterItem.MainInfo(aVar5, cVar, actionButtons2222, bVar, e2222, z5222, z6222, d9f0Var, z7, nym0Var));
                        xuq0 xuq0Var2222 = this.d;
                        if (!extendedUserProfile.g()) {
                        }
                        if (s8u0Var == null) {
                        }
                        if (rVar == null) {
                        }
                    }
                    g = e.g();
                    arrayList = new ArrayList(c5g.u(g, 10));
                    it = g.iterator();
                    i2 = i;
                    while (true) {
                        aVar = (ListBuilder.a) it;
                        if (aVar.hasNext()) {
                            return arrayList;
                        }
                        next = aVar.next();
                        i3 = i2 + 1;
                        if (i2 < 0) {
                            e43.t();
                            throw null;
                        }
                        UserProfileAdapterItem userProfileAdapterItem = (UserProfileAdapterItem) next;
                        znk0.a(userProfileAdapterItem, (UserProfileAdapterItem) j5g.b0(i2 - 1, g), (UserProfileAdapterItem) j5g.b0(i3, g));
                        arrayList.add(userProfileAdapterItem);
                        i2 = i3;
                    }
                }
            }
            imageStatus = imageStatus2;
            c1701a = null;
            UserProfileAdapterItem.MainInfo.c.a aVar62222 = new UserProfileAdapterItem.MainInfo.c.a(str5, !dvq0Var.d(extendedUserProfile) ? c1701a : null, !dvq0Var.d(extendedUserProfile));
            VerifyInfo verifyInfo2222 = extendedUserProfile.a.B;
            boolean a52222 = orq0Var.e.a(orq0Var.b.a);
            UserProfile userProfile32222 = extendedUserProfile.a;
            UserProfileAdapterItem.MainInfo.c cVar22222 = new UserProfileAdapterItem.MainInfo.c(str3, i7, str4, imageStatus, musicTrack, aVar62222, verifyInfo2222, a52222, userProfile32222.A, userProfile32222.X, userProfile32222.K().booleanValue(), dvq0Var.d(extendedUserProfile), onlineInfo2);
            if (orq0Var.e.a(orq0Var.b.a)) {
            }
            UserProfileAdapterItem.MainInfo.ActionButtons actionButtons22222 = actionButtons;
            UserProfileAdapterItem.MainInfo.b bVar32222 = new UserProfileAdapterItem.MainInfo.b((extendedUserProfile.A1 || !orq0Var.e.a(orq0Var.b.a) || dvq0Var.d(extendedUserProfile)) ? false : true, gVar.l, new UserProfileAdapterItem.MainInfo.b.a(extendedUserProfile.C1));
            boolean e22222 = extendedUserProfile.e();
            boolean z52222 = extendedUserProfile.a.X;
            boolean z62222 = extendedUserProfile.B1;
            jVar = extendedUserProfile.R1;
            if (jVar != null) {
            }
            if (extendedUserProfile.S1 != null) {
            }
            if (!bwd0.d(extendedUserProfile)) {
            }
            nym0Var = null;
            e.add(new UserProfileAdapterItem.MainInfo(aVar5, cVar, actionButtons22222, bVar, e22222, z52222, z62222, d9f0Var, z7, nym0Var));
            xuq0 xuq0Var22222 = this.d;
            if (!extendedUserProfile.g()) {
            }
            if (s8u0Var == null) {
            }
            if (rVar == null) {
            }
        }
        i = 0;
        g = e.g();
        arrayList = new ArrayList(c5g.u(g, 10));
        it = g.iterator();
        i2 = i;
        while (true) {
            aVar = (ListBuilder.a) it;
            if (aVar.hasNext()) {
            }
            UserProfileAdapterItem userProfileAdapterItem2 = (UserProfileAdapterItem) next;
            znk0.a(userProfileAdapterItem2, (UserProfileAdapterItem) j5g.b0(i2 - 1, g), (UserProfileAdapterItem) j5g.b0(i3, g));
            arrayList.add(userProfileAdapterItem2);
            i2 = i3;
        }
    }
}
