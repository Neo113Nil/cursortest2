package xsna;

import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupAgeMark;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.deactivation.Deactivation;
import com.vk.profile.core.avatar.StoryBorderMode;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.cq5;

/* compiled from: CommunityHeaderItemModel.kt */
/* loaded from: classes5.dex */
public final class l3h extends s4h {
    public final UserId b;
    public final String c;
    public final VerifyInfo d;
    public final GroupAgeMark e;
    public final a f;
    public final boolean g;
    public final ExtendedCommunityProfile.d h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final b n;
    public final ExtendedUserProfile.a o;
    public final boolean p;

    /* compiled from: CommunityHeaderItemModel.kt */
    public static final class a {
        public final StoryBorderMode a;
        public final cq5 b;
        public final AvatarBorderType c;
        public final String d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final int i;
        public final boolean j;
        public final boolean k;
        public final StoriesContainer l;
        public final String m;

        public a(StoryBorderMode storyBorderMode, cq5 cq5Var, AvatarBorderType avatarBorderType, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6, StoriesContainer storiesContainer, String str2) {
            this.a = storyBorderMode;
            this.b = cq5Var;
            this.c = avatarBorderType;
            this.d = str;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
            this.i = i;
            this.j = z5;
            this.k = z6;
            this.l = storiesContainer;
            this.m = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && epx.f(this.l, aVar.l) && epx.f(this.m, aVar.m);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            String str = this.d;
            int b = qoy.b(qoy.b(shy.a(this.i, qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k);
            StoriesContainer storiesContainer = this.l;
            int hashCode2 = (b + (storiesContainer == null ? 0 : storiesContainer.hashCode())) * 31;
            String str2 = this.m;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommunityAvatarItemModel(avatarStoryBorderMode=");
            sb.append(this.a);
            sb.append(", avatarBorderState=");
            sb.append(this.b);
            sb.append(", avatarBorderType=");
            sb.append(this.c);
            sb.append(", avatarUrl=");
            sb.append(this.d);
            sb.append(", avatarDeactivated=");
            sb.append(this.e);
            sb.append(", isCommunityPrivate=");
            sb.append(this.f);
            sb.append(", isCommunityAdmin=");
            sb.append(this.g);
            sb.append(", isCommunityEditor=");
            sb.append(this.h);
            sb.append(", storiesCount=");
            sb.append(this.i);
            sb.append(", hasAnyLive=");
            sb.append(this.j);
            sb.append(", hasPhoto=");
            sb.append(this.k);
            sb.append(", stories=");
            sb.append(this.l);
            sb.append(", thumbHash=");
            return ho8.a(sb, this.m, ')');
        }
    }

    /* compiled from: CommunityHeaderItemModel.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommunityVerifyBcsItemModel(isConfirmedBusiness=");
            sb.append(this.a);
            sb.append(", isPremiumBusiness=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommunityHeaderItemModel.kt */
    public static final class c {

        /* compiled from: CommunityHeaderItemModel.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StoryBorderMode.values().length];
                try {
                    iArr[StoryBorderMode.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StoryBorderMode.LIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StoryBorderMode.FINISHED_LIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StoryBorderMode.STORY_SEEN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StoryBorderMode.FINISHED_LIVE_SEEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[StoryBorderMode.UPLOAD_ERROR.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[StoryBorderMode.STORY_NEW.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static l3h a(ExtendedCommunityProfile extendedCommunityProfile, vig0 vig0Var, int i) {
            cq5 cq5Var;
            boolean z;
            boolean z2;
            boolean z3;
            Float f;
            Deactivation deactivation;
            Deactivation deactivation2;
            StoryBorderMode.a aVar = StoryBorderMode.Companion;
            ArrayList<StoriesContainer> arrayList = extendedCommunityProfile.v1;
            aVar.getClass();
            Pair a2 = StoryBorderMode.a.a(i, arrayList);
            StoryBorderMode storyBorderMode = (StoryBorderMode) a2.d();
            StoriesContainer storiesContainer = (StoriesContainer) a2.g();
            if (storiesContainer != null) {
                storiesContainer.b = new StoryOwner.Community(bwd0.k(extendedCommunityProfile), null, 2, null);
            }
            switch (a.$EnumSwitchMapping$0[storyBorderMode.ordinal()]) {
                case 1:
                    cq5Var = cq5.b.a;
                    break;
                case 2:
                case 3:
                    cq5Var = cq5.g.a;
                    break;
                case 4:
                case 5:
                    cq5Var = cq5.m.a;
                    break;
                case 6:
                    cq5Var = cq5.d.a;
                    break;
                case 7:
                    cq5Var = cq5.h.a;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            cq5 cq5Var2 = cq5Var;
            AvatarBorderType avatarBorderType = extendedCommunityProfile.a.Y ? AvatarBorderType.HEXAGON : AvatarBorderType.CIRCLE;
            if (extendedCommunityProfile.g() || (!((deactivation = extendedCommunityProfile.q) == null || deactivation.getReason() == Deactivation.Reason.Deleted) || ((deactivation2 = extendedCommunityProfile.q) != null && deactivation2.getReason() == Deactivation.Reason.Banned))) {
                z = true;
                z2 = true;
            } else {
                z = true;
                z2 = false;
            }
            String str = extendedCommunityProfile.j;
            boolean f2 = bwd0.f(extendedCommunityProfile);
            boolean a3 = w2h.a(extendedCommunityProfile);
            boolean b = w2h.b(extendedCommunityProfile);
            int c = extendedCommunityProfile.c();
            ArrayList<StoriesContainer> arrayList2 = extendedCommunityProfile.v1;
            if (!arrayList2.isEmpty()) {
                Iterator<T> it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (fsk.x((StoriesContainer) it.next())) {
                        z3 = z;
                        boolean z4 = extendedCommunityProfile.n0;
                        UserProfile userProfile = extendedCommunityProfile.a;
                        a aVar2 = new a(storyBorderMode, cq5Var2, avatarBorderType, str, z2, f2, a3, b, c, z3, z4, storiesContainer, userProfile.c0);
                        UserId userId = userProfile.c;
                        String str2 = userProfile.e;
                        VerifyInfo verifyInfo = userProfile.B;
                        GroupAgeMark groupAgeMark = extendedCommunityProfile.O2;
                        boolean z5 = extendedCommunityProfile.s2;
                        ExtendedCommunityProfile.d dVar = extendedCommunityProfile.C2;
                        String a4 = (dVar != null || (f = dVar.a) == null) ? null : vig0Var.a(f.floatValue());
                        boolean z6 = extendedCommunityProfile.z2;
                        int i2 = extendedCommunityProfile.a1;
                        return new l3h(userId, str2, verifyInfo, groupAgeMark, aVar2, z5, dVar, a4, z6, extendedCommunityProfile.A2, extendedCommunityProfile.B2, i2 != 1 || i2 == 2 || i2 == 4, new b(extendedCommunityProfile.Z2, extendedCommunityProfile.a3), extendedCommunityProfile.S1, w2h.a(extendedCommunityProfile));
                    }
                }
            }
            z3 = false;
            boolean z42 = extendedCommunityProfile.n0;
            UserProfile userProfile2 = extendedCommunityProfile.a;
            a aVar22 = new a(storyBorderMode, cq5Var2, avatarBorderType, str, z2, f2, a3, b, c, z3, z42, storiesContainer, userProfile2.c0);
            UserId userId2 = userProfile2.c;
            String str22 = userProfile2.e;
            VerifyInfo verifyInfo2 = userProfile2.B;
            GroupAgeMark groupAgeMark2 = extendedCommunityProfile.O2;
            boolean z52 = extendedCommunityProfile.s2;
            ExtendedCommunityProfile.d dVar2 = extendedCommunityProfile.C2;
            if (dVar2 != null) {
            }
            boolean z62 = extendedCommunityProfile.z2;
            int i22 = extendedCommunityProfile.a1;
            return new l3h(userId2, str22, verifyInfo2, groupAgeMark2, aVar22, z52, dVar2, a4, z62, extendedCommunityProfile.A2, extendedCommunityProfile.B2, i22 != 1 || i22 == 2 || i22 == 4, new b(extendedCommunityProfile.Z2, extendedCommunityProfile.a3), extendedCommunityProfile.S1, w2h.a(extendedCommunityProfile));
        }
    }

    public l3h(UserId userId, String str, VerifyInfo verifyInfo, GroupAgeMark groupAgeMark, a aVar, boolean z, ExtendedCommunityProfile.d dVar, String str2, boolean z2, boolean z3, boolean z4, boolean z5, b bVar, ExtendedUserProfile.a aVar2, boolean z6) {
        this.b = userId;
        this.c = str;
        this.d = verifyInfo;
        this.e = groupAgeMark;
        this.f = aVar;
        this.g = z;
        this.h = dVar;
        this.i = str2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = bVar;
        this.o = aVar2;
        this.p = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3h)) {
            return false;
        }
        l3h l3hVar = (l3h) obj;
        return epx.f(this.b, l3hVar.b) && epx.f(this.c, l3hVar.c) && epx.f(this.d, l3hVar.d) && this.e == l3hVar.e && epx.f(this.f, l3hVar.f) && this.g == l3hVar.g && epx.f(this.h, l3hVar.h) && epx.f(this.i, l3hVar.i) && this.j == l3hVar.j && this.k == l3hVar.k && this.l == l3hVar.l && this.m == l3hVar.m && epx.f(this.n, l3hVar.n) && epx.f(this.o, l3hVar.o) && this.p == l3hVar.p;
    }

    public final int hashCode() {
        int b2 = qoy.b((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c)) * 31)) * 31)) * 31, 31, this.g);
        ExtendedCommunityProfile.d dVar = this.h;
        int hashCode = (b2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.i;
        int hashCode2 = (this.n.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m)) * 31;
        ExtendedUserProfile.a aVar = this.o;
        return Boolean.hashCode(this.p) + ((hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityHeaderItemModel(communityId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", verifyInfo=");
        sb.append(this.d);
        sb.append(", ageMark=");
        sb.append(this.e);
        sb.append(", avatarModel=");
        sb.append(this.f);
        sb.append(", adminReviews=");
        sb.append(this.g);
        sb.append(", rating=");
        sb.append(this.h);
        sb.append(", ratingText=");
        sb.append(this.i);
        sb.append(", isGovernmentOrganization=");
        sb.append(this.j);
        sb.append(", isNonProfitOrganization=");
        sb.append(this.k);
        sb.append(", isNonProfitAndVerifiedOrganization=");
        sb.append(this.l);
        sb.append(", isMember=");
        sb.append(this.m);
        sb.append(", verifyBcsModel=");
        sb.append(this.n);
        sb.append(", aPlusMark=");
        sb.append(this.o);
        sb.append(", isCommunityAdmin=");
        return defpackage.q0.a(sb, this.p, ')');
    }
}
