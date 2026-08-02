package xsna;

import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewResult;

/* compiled from: CommunityCreateReviewEvent.kt */
/* loaded from: classes18.dex */
public abstract class tyg {

    /* compiled from: CommunityCreateReviewEvent.kt */
    public static final class a extends tyg {
        public final CreateCommunityReviewResult a;

        public a(CreateCommunityReviewResult createCommunityReviewResult) {
            this.a = createCommunityReviewResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DismissWithSavedData(savedData=" + this.a + ')';
        }
    }

    /* compiled from: CommunityCreateReviewEvent.kt */
    public static final class b extends tyg {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -616024520;
        }

        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: CommunityCreateReviewEvent.kt */
    public static final class c extends tyg {
        public final CreateCommunityReviewResult a;

        public c(CreateCommunityReviewResult createCommunityReviewResult) {
            this.a = createCommunityReviewResult;
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
            return "SaveInputData(savedData=" + this.a + ')';
        }
    }

    /* compiled from: CommunityCreateReviewEvent.kt */
    public static final class d extends tyg {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1727973674;
        }

        public final String toString() {
            return "ToCloseDialog";
        }
    }
}
