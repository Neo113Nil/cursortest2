package xsna;

import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import java.util.ArrayList;
import java.util.List;
import xsna.tlo0;

/* compiled from: CommunityCreateReviewPatch.kt */
/* loaded from: classes18.dex */
public abstract class czg implements xl50 {

    /* compiled from: CommunityCreateReviewPatch.kt */
    public static final class a extends czg {
        public final String b;

        public a(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CommentChanged(text="), this.b, ')');
        }
    }

    /* compiled from: CommunityCreateReviewPatch.kt */
    public static final class b extends czg {
        public final n7k b;

        public b(n7k n7kVar) {
            this.b = n7kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CreateCommunityReviewConfig(config=" + this.b + ')';
        }
    }

    /* compiled from: CommunityCreateReviewPatch.kt */
    public static final class c extends czg {
        public final int b;
        public final String c;
        public final List<UploadImageModel> d;
        public final CreateCommunityReviewData e;

        public c(int i, String str, List<UploadImageModel> list, CreateCommunityReviewData createCommunityReviewData) {
            this.b = i;
            this.c = str;
            this.d = list;
            this.e = createCommunityReviewData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e);
        }

        public final int hashCode() {
            int a = fw3.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
            CreateCommunityReviewData createCommunityReviewData = this.e;
            return a + (createCommunityReviewData == null ? 0 : createCommunityReviewData.hashCode());
        }

        public final String toString() {
            return "Init(mark=" + this.b + ", comment=" + this.c + ", reviewImages=" + this.d + ", initialState=" + this.e + ')';
        }
    }

    /* compiled from: CommunityCreateReviewPatch.kt */
    public static final class d extends czg {
        public final tlo0.f b;
        public final tlo0.f c;

        public d(tlo0.f fVar, tlo0.f fVar2) {
            this.b = fVar;
            this.c = fVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b.a) * 31;
            tlo0.f fVar = this.c;
            return hashCode + (fVar == null ? 0 : Integer.hashCode(fVar.a));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitError(title=");
            sb.append(this.b);
            sb.append(", description=");
            return pr.b(sb, this.c, ')');
        }
    }

    /* compiled from: CommunityCreateReviewPatch.kt */
    public static final class e extends czg {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1002546623;
        }

        public final String toString() {
            return "InitialStateLoading";
        }
    }

    /* compiled from: CommunityCreateReviewPatch.kt */
    public static final class f extends czg {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -999036372;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: CommunityCreateReviewPatch.kt */
    public static final class g extends czg {
        public final float b;

        public g(float f) {
            this.b = f;
        }
    }

    /* compiled from: CommunityCreateReviewPatch.kt */
    public static final class h extends czg {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -473440224;
        }

        public final String toString() {
            return "ReviewSent";
        }
    }

    /* compiled from: CommunityCreateReviewPatch.kt */
    public static abstract class i extends czg {

        /* compiled from: CommunityCreateReviewPatch.kt */
        public static final class a extends i {
            public final ArrayList b;

            public a(ArrayList arrayList) {
                this.b = arrayList;
            }
        }
    }
}
