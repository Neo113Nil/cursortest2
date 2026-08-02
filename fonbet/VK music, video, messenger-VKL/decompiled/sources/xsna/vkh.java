package xsna;

import com.vk.profile.core.tabs.state.CommunityProfileContent;

/* compiled from: CommunityProfileContentReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class vkh {

    /* compiled from: CommunityProfileContentReducerDelegate.kt */
    public static final class a {
        public final boolean a;
        public final CommunityProfileContent b;

        public a(boolean z, CommunityProfileContent communityProfileContent) {
            this.a = z;
            this.b = communityProfileContent;
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
            int hashCode = Boolean.hashCode(this.a) * 31;
            CommunityProfileContent communityProfileContent = this.b;
            return hashCode + (communityProfileContent == null ? 0 : communityProfileContent.hashCode());
        }

        public final String toString() {
            return "UpdateContentData(isNeedToUpdateContent=" + this.a + ", content=" + this.b + ')';
        }
    }
}
