package xsna;

import android.os.Bundle;

/* compiled from: VideoContainerFragmentEntryEvent.kt */
/* loaded from: classes2.dex */
public interface kds0 {

    /* compiled from: VideoContainerFragmentEntryEvent.kt */
    public static final class a implements kds0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -295003517;
        }

        public final String toString() {
            return "OnCommitFragment";
        }
    }

    /* compiled from: VideoContainerFragmentEntryEvent.kt */
    public static final class b implements kds0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -632263266;
        }

        public final String toString() {
            return "OnDestroy";
        }
    }

    /* compiled from: VideoContainerFragmentEntryEvent.kt */
    public static final class c implements kds0 {
        public final Bundle a;

        public c(Bundle bundle) {
            this.a = bundle;
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
            return uf3.c(new StringBuilder("OnNewIntent(args="), this.a, ')');
        }
    }

    /* compiled from: VideoContainerFragmentEntryEvent.kt */
    public static final class d implements kds0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1092116430;
        }

        public final String toString() {
            return "OnRestore";
        }
    }
}
