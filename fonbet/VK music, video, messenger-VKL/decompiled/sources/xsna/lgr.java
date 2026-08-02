package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: Filters.kt */
/* loaded from: classes5.dex */
public final class lgr {
    public final ArrayList a = e43.o(new a(), new c(), new b(R.string.video_search_duration_arr_2, true));

    /* compiled from: Filters.kt */
    public static final class a implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_duration_arr_0;
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
            return "any";
        }

        public final int hashCode() {
            return ((Boolean.hashCode(true) + shy.a(R.string.video_search_duration_arr_0, Integer.hashCode(0) * 31, 31)) * 31) + 96748;
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "All(index=0, titleResId=2131966079, isEnabled=true, type=any)";
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
            return "long";
        }

        public final int hashCode() {
            return ((Boolean.hashCode(this.b) + shy.a(this.a, Integer.hashCode(2) * 31, 31)) * 31) + 3327612;
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Long(index=2, titleResId=");
            sb.append(this.a);
            sb.append(", isEnabled=");
            return n23.b(sb, this.b, ", type=long)");
        }
    }

    /* compiled from: Filters.kt */
    public static final class c implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_duration_arr_1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        @Override // xsna.ecr
        public final int getIndex() {
            return 1;
        }

        @Override // xsna.ecr
        public final String getType() {
            return "short";
        }

        public final int hashCode() {
            return ((Boolean.hashCode(true) + shy.a(R.string.video_search_duration_arr_1, Integer.hashCode(1) * 31, 31)) * 31) + 109413500;
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "Short(index=1, titleResId=2131966080, isEnabled=true, type=short)";
        }
    }
}
