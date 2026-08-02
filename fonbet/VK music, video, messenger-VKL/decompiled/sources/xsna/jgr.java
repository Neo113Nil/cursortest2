package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: Filters.kt */
/* loaded from: classes5.dex */
public final class jgr {
    public final ArrayList a;

    /* compiled from: Filters.kt */
    public static final class a implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_content_arr_0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        @Override // xsna.ecr
        public final int getIndex() {
            return 0;
        }

        @Override // xsna.ecr
        public final String getType() {
            return "all";
        }

        public final int hashCode() {
            return ((Boolean.hashCode(true) + shy.a(R.string.video_search_content_arr_0, Integer.hashCode(0) * 31, 31)) * 31) + 96673;
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "All(index=0, titleResId=2131966064, isEnabled=true, type=all)";
        }
    }

    /* compiled from: Filters.kt */
    public static final class b implements ecr {
        public final int a;
        public final boolean b;

        public b(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // xsna.ecr
        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.a == bVar.a && this.b == bVar.b;
        }

        @Override // xsna.ecr
        public final int getIndex() {
            return 2;
        }

        @Override // xsna.ecr
        public final String getType() {
            return "clip";
        }

        public final int hashCode() {
            return ((Boolean.hashCode(this.b) + shy.a(this.a, Integer.hashCode(2) * 31, 31)) * 31) + 3056464;
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Clips(index=2, titleResId=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return n23.b(sb, this.b, ", type=clip)");
        }
    }

    /* compiled from: Filters.kt */
    public static final class c implements ecr {
        public final int a;
        public final boolean b;

        public c(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        @Override // xsna.ecr
        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            return this.a == cVar.a && this.b == cVar.b;
        }

        @Override // xsna.ecr
        public final int getIndex() {
            return 3;
        }

        @Override // xsna.ecr
        public final String getType() {
            return "live";
        }

        public final int hashCode() {
            return ((Boolean.hashCode(this.b) + shy.a(this.a, Integer.hashCode(3) * 31, 31)) * 31) + 3322092;
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Live(index=3, titleResId=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return n23.b(sb, this.b, ", type=live)");
        }
    }

    /* compiled from: Filters.kt */
    public static final class d implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_content_arr_1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        @Override // xsna.ecr
        public final int getIndex() {
            return 1;
        }

        @Override // xsna.ecr
        public final String getType() {
            return "video";
        }

        public final int hashCode() {
            return ((Boolean.hashCode(true) + shy.a(R.string.video_search_content_arr_1, Integer.hashCode(1) * 31, 31)) * 31) + 112202875;
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "Video(index=1, titleResId=2131966065, isEnabled=true, type=video)";
        }
    }

    public jgr(boolean z) {
        this.a = e43.o(new a(), new d(), new b(R.string.video_search_content_arr_2, !z), new c(R.string.video_search_content_arr_3, true));
    }
}
