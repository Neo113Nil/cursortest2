package xsna;

import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFileModeration;

/* compiled from: ActionButtonMappingData.kt */
/* loaded from: classes17.dex */
public final class zu {
    public final SdkActionLink a;
    public final boolean b;
    public final a c;
    public final boolean d;
    public final boolean e;
    public final uu f;
    public final cut0 g;
    public final cut0 h;

    /* compiled from: ActionButtonMappingData.kt */
    public interface a {

        /* compiled from: ActionButtonMappingData.kt */
        /* renamed from: xsna.zu$a$a, reason: collision with other inner class name */
        public static final class C4202a implements a {
            public final boolean a;
            public final SdkActionLink b;
            public final boolean c;
            public final SdkVideoFileModeration d;

            public C4202a(boolean z, SdkActionLink sdkActionLink, boolean z2, SdkVideoFileModeration sdkVideoFileModeration) {
                this.a = z;
                this.b = sdkActionLink;
                this.c = z2;
                this.d = sdkVideoFileModeration;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4202a)) {
                    return false;
                }
                C4202a c4202a = (C4202a) obj;
                return this.a == c4202a.a && epx.f(this.b, c4202a.b) && this.c == c4202a.c && this.d == c4202a.d;
            }

            public final int hashCode() {
                int hashCode = Boolean.hashCode(this.a) * 31;
                SdkActionLink sdkActionLink = this.b;
                return this.d.hashCode() + qoy.b((hashCode + (sdkActionLink == null ? 0 : sdkActionLink.hashCode())) * 31, 31, this.c);
            }

            public final String toString() {
                return "ActiveUserLink(isUserLinkVisible=" + this.a + ", actionLink=" + this.b + ", isUserCanEditClipsUserLink=" + this.c + ", moderationStatus=" + this.d + ')';
            }
        }

        /* compiled from: ActionButtonMappingData.kt */
        public static final class b implements a {
            public static final b a = new b();
        }
    }

    public zu(SdkActionLink sdkActionLink, boolean z, a aVar, boolean z2, boolean z3, uu uuVar, cut0 cut0Var, cut0 cut0Var2) {
        this.a = sdkActionLink;
        this.b = z;
        this.c = aVar;
        this.d = z2;
        this.e = z3;
        this.f = uuVar;
        this.g = cut0Var;
        this.h = cut0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu)) {
            return false;
        }
        zu zuVar = (zu) obj;
        return epx.f(this.a, zuVar.a) && this.b == zuVar.b && epx.f(this.c, zuVar.c) && this.d == zuVar.d && this.e == zuVar.e && epx.f(this.f, zuVar.f) && epx.f(this.g, zuVar.g) && epx.f(this.h, zuVar.h);
    }

    public final int hashCode() {
        SdkActionLink sdkActionLink = this.a;
        int b = qoy.b(qoy.b((this.c.hashCode() + qoy.b((sdkActionLink == null ? 0 : sdkActionLink.hashCode()) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        uu uuVar = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((b + (uuVar != null ? uuVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ActionButtonMappingData(actionLink=" + this.a + ", isSubscribedToOwner=" + this.b + ", userLink=" + this.c + ", actionButtonWasShown=" + this.d + ", actionButtonWasActive=" + this.e + ", icon=" + this.f + ", activeBackgroundColor=" + this.g + ", activeTextColor=" + this.h + ')';
    }
}
