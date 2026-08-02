package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: Filters.kt */
/* loaded from: classes5.dex */
public final class mgr {
    public final ArrayList a = e43.o(new a(), new b(), new c());

    /* compiled from: Filters.kt */
    public static final class a implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_sort_arr_0;
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
            return "0";
        }

        public final int hashCode() {
            return ((Boolean.hashCode(true) + shy.a(R.string.video_search_sort_arr_0, Integer.hashCode(0) * 31, 31)) * 31) + 48;
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "Date(index=0, titleResId=2131966089, isEnabled=true, type=0)";
        }
    }

    /* compiled from: Filters.kt */
    public static final class b implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_sort_arr_1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        @Override // xsna.ecr
        public final int getIndex() {
            return 1;
        }

        @Override // xsna.ecr
        public final String getType() {
            return "1";
        }

        public final int hashCode() {
            return ((Boolean.hashCode(true) + shy.a(R.string.video_search_sort_arr_1, Integer.hashCode(1) * 31, 31)) * 31) + 49;
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "Durations(index=1, titleResId=2131966090, isEnabled=true, type=1)";
        }
    }

    /* compiled from: Filters.kt */
    public static final class c implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_sort_arr_2;
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
            return 2;
        }

        @Override // xsna.ecr
        public final String getType() {
            return "2";
        }

        public final int hashCode() {
            return ((Boolean.hashCode(true) + shy.a(R.string.video_search_sort_arr_2, Integer.hashCode(2) * 31, 31)) * 31) + 50;
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "Relevance(index=2, titleResId=2131966091, isEnabled=true, type=2)";
        }
    }
}
