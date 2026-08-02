package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;

/* compiled from: PostingWithAuthorState.kt */
/* loaded from: classes4.dex */
public interface nqc0 {

    /* compiled from: PostingWithAuthorState.kt */
    public static final class a implements nqc0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1728262516;
        }

        public final String toString() {
            return "NoInternet";
        }
    }

    /* compiled from: PostingWithAuthorState.kt */
    public static final class b implements nqc0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 353724286;
        }

        public final String toString() {
            return "NoUser";
        }
    }

    /* compiled from: PostingWithAuthorState.kt */
    public static final class c implements nqc0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -10341320;
        }

        public final String toString() {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }
    }
}
