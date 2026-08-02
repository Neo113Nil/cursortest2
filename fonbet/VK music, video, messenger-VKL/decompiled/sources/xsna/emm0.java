package xsna;

import com.vk.dto.hints.HintId;

/* compiled from: StoryViewHint.kt */
/* loaded from: classes6.dex */
public abstract class emm0 {
    public final HintId a;

    /* compiled from: StoryViewHint.kt */
    public static final class a extends emm0 {
        public static final a b = new a(HintId.STORIES_REMOVE_PRIVACY_ONLY_ME);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -444930323;
        }

        public final String toString() {
            return "LegacyPrivacyRemoval";
        }
    }

    public emm0(HintId hintId) {
        this.a = hintId;
    }
}
