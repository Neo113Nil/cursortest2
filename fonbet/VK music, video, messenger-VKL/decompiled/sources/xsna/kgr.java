package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: Filters.kt */
/* loaded from: classes5.dex */
public final class kgr {
    public final ArrayList a = e43.o(new a(), new b(), new d(), new c(), new e());

    /* compiled from: Filters.kt */
    public static final class a implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_date_arr_0;
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
            return "";
        }

        public final int hashCode() {
            return qoy.b(shy.a(R.string.video_search_date_arr_0, Integer.hashCode(0) * 31, 31), 31, true);
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "All(index=0, titleResId=2131966069, isEnabled=true, type=)";
        }
    }

    /* compiled from: Filters.kt */
    public static final class b implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_date_arr_1;
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
            return "";
        }

        public final int hashCode() {
            return qoy.b(shy.a(R.string.video_search_date_arr_1, Integer.hashCode(1) * 31, 31), 31, true);
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "Day(index=1, titleResId=2131966070, isEnabled=true, type=)";
        }
    }

    /* compiled from: Filters.kt */
    public static final class c implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_date_arr_3;
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
            return 3;
        }

        @Override // xsna.ecr
        public final String getType() {
            return "";
        }

        public final int hashCode() {
            return qoy.b(shy.a(R.string.video_search_date_arr_3, Integer.hashCode(3) * 31, 31), 31, true);
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "Month(index=3, titleResId=2131966072, isEnabled=true, type=)";
        }
    }

    /* compiled from: Filters.kt */
    public static final class d implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_date_arr_2;
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
            return 2;
        }

        @Override // xsna.ecr
        public final String getType() {
            return "";
        }

        public final int hashCode() {
            return qoy.b(shy.a(R.string.video_search_date_arr_2, Integer.hashCode(2) * 31, 31), 31, true);
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "Weak(index=2, titleResId=2131966071, isEnabled=true, type=)";
        }
    }

    /* compiled from: Filters.kt */
    public static final class e implements ecr {
        @Override // xsna.ecr
        public final int a() {
            return R.string.video_search_date_arr_4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        @Override // xsna.ecr
        public final int getIndex() {
            return 4;
        }

        @Override // xsna.ecr
        public final String getType() {
            return "";
        }

        public final int hashCode() {
            return qoy.b(shy.a(R.string.video_search_date_arr_4, Integer.hashCode(4) * 31, 31), 31, true);
        }

        @Override // xsna.ecr
        public final boolean isEnabled() {
            return true;
        }

        public final String toString() {
            return "Year(index=4, titleResId=2131966073, isEnabled=true, type=)";
        }
    }
}
