package xsna;

import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;

/* compiled from: CommunityProfileOnboarding.kt */
/* loaded from: classes5.dex */
public abstract class xrh {
    public final String a;

    /* compiled from: CommunityProfileOnboarding.kt */
    public static abstract class a extends xrh {
        public final VkOnboardingCampaign b;
        public final VkOnboardingType c;

        public a(VkOnboardingCampaign vkOnboardingCampaign, VkOnboardingType vkOnboardingType) {
            super(vkOnboardingCampaign.b);
            this.b = vkOnboardingCampaign;
            this.c = vkOnboardingType;
        }
    }

    /* compiled from: CommunityProfileOnboarding.kt */
    public static abstract class b extends xrh {
        public final String b;
        public final String c;
        public final boolean d;

        /* compiled from: CommunityProfileOnboarding.kt */
        public static final class a extends b {
            public final String e;
            public final String f;
            public final String g;
            public final boolean h;

            public a(String str, String str2, String str3, boolean z) {
                super(str, str2, str3, z);
                this.e = str;
                this.f = str2;
                this.g = str3;
                this.h = z;
            }

            @Override // xsna.xrh
            public final String a() {
                return this.e;
            }

            @Override // xsna.xrh.b
            public final String b() {
                return this.g;
            }

            @Override // xsna.xrh.b
            public final String c() {
                return this.f;
            }

            @Override // xsna.xrh.b
            public final boolean d() {
                return this.h;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && this.h == aVar.h;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.h) + urd0.a(urd0.a(this.e.hashCode() * 31, 31, this.f), 31, this.g);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CommunityChannelPost(id=");
                sb.append(this.e);
                sb.append(", title=");
                sb.append(this.f);
                sb.append(", button=");
                sb.append(this.g);
                sb.append(", isVerticalOrientation=");
                return defpackage.q0.a(sb, this.h, ')');
            }
        }

        /* compiled from: CommunityProfileOnboarding.kt */
        /* renamed from: xsna.xrh$b$b, reason: collision with other inner class name */
        public static final class C4043b extends b {
            public final String e;
            public final String f;
            public final String g;
            public final boolean h;

            public C4043b(String str, String str2, String str3, boolean z) {
                super(str, str2, str3, z);
                this.e = str;
                this.f = str2;
                this.g = str3;
                this.h = z;
            }

            @Override // xsna.xrh
            public final String a() {
                return this.e;
            }

            @Override // xsna.xrh.b
            public final String b() {
                return this.g;
            }

            @Override // xsna.xrh.b
            public final String c() {
                return this.f;
            }

            @Override // xsna.xrh.b
            public final boolean d() {
                return this.h;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4043b)) {
                    return false;
                }
                C4043b c4043b = (C4043b) obj;
                return epx.f(this.e, c4043b.e) && epx.f(this.f, c4043b.f) && epx.f(this.g, c4043b.g) && this.h == c4043b.h;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.h) + urd0.a(urd0.a(this.e.hashCode() * 31, 31, this.f), 31, this.g);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CommunityManagedGroupPin(id=");
                sb.append(this.e);
                sb.append(", title=");
                sb.append(this.f);
                sb.append(", button=");
                sb.append(this.g);
                sb.append(", isVerticalOrientation=");
                return defpackage.q0.a(sb, this.h, ')');
            }
        }

        public b(String str, String str2, String str3, boolean z) {
            super(str);
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.b;
        }

        public boolean d() {
            return this.d;
        }
    }

    /* compiled from: CommunityProfileOnboarding.kt */
    public static abstract class c extends a {

        /* compiled from: CommunityProfileOnboarding.kt */
        public static final class a extends c {
            public final String d;
            public final String e;
            public final String f;

            public a(VkOnboardingCampaign vkOnboardingCampaign, String str, String str2, String str3) {
                super(vkOnboardingCampaign, VkOnboardingType.Banner);
                this.d = str;
                this.e = str2;
                this.f = str3;
            }
        }

        /* compiled from: CommunityProfileOnboarding.kt */
        public static final class b extends c {
            public final String d;

            public b(VkOnboardingCampaign vkOnboardingCampaign, String str) {
                super(vkOnboardingCampaign, VkOnboardingType.Tooltip);
                this.d = str;
            }
        }
    }

    /* compiled from: CommunityProfileOnboarding.kt */
    public static abstract class d extends xrh {

        /* compiled from: CommunityProfileOnboarding.kt */
        public static final class a extends d {
            public final String b;
            public final String c;
            public final CommunityActionTags d;
            public final VkTooltip$MarkerSize e;
            public final VkTooltip$MarkerStyle f;

            public a(String str, String str2, CommunityActionTags communityActionTags, VkTooltip$MarkerSize vkTooltip$MarkerSize, VkTooltip$MarkerStyle vkTooltip$MarkerStyle) {
                super(str);
                this.b = str;
                this.c = str2;
                this.d = communityActionTags;
                this.e = vkTooltip$MarkerSize;
                this.f = vkTooltip$MarkerStyle;
            }

            @Override // xsna.xrh
            public final String a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
            }

            public final int hashCode() {
                return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31);
            }

            public final String toString() {
                return "ActionButtonOnboarding(id=" + this.b + ", title=" + this.c + ", actionTag=" + this.d + ", markerSize=" + this.e + ", markerStyle=" + this.f + ')';
            }
        }

        /* compiled from: CommunityProfileOnboarding.kt */
        public static abstract class b extends d {

            /* compiled from: CommunityProfileOnboarding.kt */
            public static final class a extends b {
                public final String b;
                public final String c;

                public a(String str, String str2) {
                    super(str);
                    this.b = str;
                    this.c = str2;
                }

                @Override // xsna.xrh
                public final String a() {
                    return this.b;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.b, aVar.b) && this.c.equals(aVar.c);
                }

                public final int hashCode() {
                    return Boolean.hashCode(true) + urd0.a(this.b.hashCode() * 31, 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ActionButton(id=");
                    sb.append(this.b);
                    sb.append(", title=");
                    return i5s.a(sb, this.c, ", isUnskippable=true)");
                }
            }
        }

        /* compiled from: CommunityProfileOnboarding.kt */
        public static final class c extends d {
            public final String b;
            public final String c;
            public final String d;

            public c(String str, String str2, String str3) {
                super(str);
                this.b = str;
                this.c = str2;
                this.d = str3;
            }

            @Override // xsna.xrh
            public final String a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("DonutAdminOnboarding(id=");
                sb.append(this.b);
                sb.append(", title=");
                sb.append(this.c);
                sb.append(", description=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: CommunityProfileOnboarding.kt */
        /* renamed from: xsna.xrh$d$d, reason: collision with other inner class name */
        public static final class C4044d extends d {
            public static final C4044d b = new C4044d("com:sections_in_about_admin");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C4044d);
            }

            public final int hashCode() {
                return -123701981;
            }

            public final String toString() {
                return "SectionsInDetailsTooltipOnboardingEditor";
            }
        }

        /* compiled from: CommunityProfileOnboarding.kt */
        public static final class e extends d {
            public static final e b = new e("com:sections_in_about_user");

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1206340351;
            }

            public final String toString() {
                return "SectionsInDetailsTooltipOnboardingUser";
            }
        }

        /* compiled from: CommunityProfileOnboarding.kt */
        public static final class f extends d {
            public final String b;
            public final String c;

            public f(String str, String str2) {
                super(str);
                this.b = str;
                this.c = str2;
            }

            @Override // xsna.xrh
            public final String a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StoryCreateEntryPoint(id=");
                sb.append(this.b);
                sb.append(", title=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: CommunityProfileOnboarding.kt */
        public static abstract class g extends d {
            public final String b;

            /* compiled from: CommunityProfileOnboarding.kt */
            public static final class a extends g {
                public final String c;
                public final String d;

                public a(String str, String str2) {
                    super(str, str2);
                    this.c = str;
                    this.d = str2;
                }

                @Override // xsna.xrh
                public final String a() {
                    return this.c;
                }

                @Override // xsna.xrh.d.g
                public final String b() {
                    return this.d;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
                }

                public final int hashCode() {
                    return this.d.hashCode() + (this.c.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ManageActionIcon(id=");
                    sb.append(this.c);
                    sb.append(", title=");
                    return ho8.a(sb, this.d, ')');
                }
            }

            public g(String str, String str2) {
                super(str);
                this.b = str2;
            }

            public String b() {
                return this.b;
            }
        }
    }

    public xrh(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}
