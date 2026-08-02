package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: PostingViewState.kt */
/* loaded from: classes4.dex */
public interface gvz {

    /* compiled from: PostingViewState.kt */
    public static final class a implements gvz {
        public final List<fvz> a;

        public a(ListBuilder listBuilder) {
            this.a = listBuilder;
        }

        public final List<fvz> a() {
            return this.a;
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
            return ms9.a(')', new StringBuilder("Content(items="), this.a);
        }
    }

    /* compiled from: PostingViewState.kt */
    public static final class b implements gvz {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1115104806;
        }

        public final String toString() {
            return "EmptyGallery";
        }
    }

    /* compiled from: PostingViewState.kt */
    public static final class c implements gvz {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 462727373;
        }

        public final String toString() {
            return "GalleryViewPermissionNotGranted";
        }
    }

    /* compiled from: PostingViewState.kt */
    public static final class d implements gvz {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -49076110;
        }

        public final String toString() {
            return "Placeholder";
        }
    }
}
