package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: CarouselCropDelegate.kt */
/* loaded from: classes4.dex */
public final class mu9 {
    public final ybc0 a;
    public final izs<PostingAction, s3q0> b;
    public final gzs<String> c;

    /* compiled from: CarouselCropDelegate.kt */
    public static final class a {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("AttachRatio(ratio="));
        }
    }

    public mu9(ybc0 ybc0Var, izs izsVar, gzs gzsVar) {
        this.a = ybc0Var;
        this.b = izsVar;
        this.c = gzsVar;
    }
}
