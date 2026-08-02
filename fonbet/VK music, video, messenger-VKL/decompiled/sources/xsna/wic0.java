package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public interface wic0 extends com.vk.newsfeed.posting.impl.domain.model.e {

    /* compiled from: PostingPatch.kt */
    public static final class a implements wic0 {
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
            return ho8.a(new StringBuilder("Changed(text="), this.b, ')');
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class b implements wic0 {
        public final ArrayList b;

        public b(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b.equals(((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("ParsedLinks(urls="), this.b);
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class c implements wic0 {
        public final List<String> b;

        public c(List<String> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("RemoveLinks(urls="), this.b);
        }
    }
}
