package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;

/* compiled from: RelatedAudioTracker.kt */
/* loaded from: classes7.dex */
public final class hsf0 {

    /* compiled from: RelatedAudioTracker.kt */
    public interface a {

        /* compiled from: RelatedAudioTracker.kt */
        /* renamed from: xsna.hsf0$a$a, reason: collision with other inner class name */
        public static final class C3019a implements a {
            public static final C3019a a = new C3019a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3019a);
            }

            public final int hashCode() {
                return -965341679;
            }

            public final String toString() {
                return "Add";
            }
        }

        /* compiled from: RelatedAudioTracker.kt */
        public static final class b implements a {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Added(isFirstTime="), this.a, ')');
            }
        }

        /* compiled from: RelatedAudioTracker.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 21675768;
            }

            public final String toString() {
                return "Click";
            }
        }

        /* compiled from: RelatedAudioTracker.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -89118966;
            }

            public final String toString() {
                return "ContinueWatching";
            }
        }

        /* compiled from: RelatedAudioTracker.kt */
        public static final class e implements a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 694204987;
            }

            public final String toString() {
                return "Delete";
            }
        }

        /* compiled from: RelatedAudioTracker.kt */
        public static final class f implements a {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1614284625;
            }

            public final String toString() {
                return "OpenLogin";
            }
        }

        /* compiled from: RelatedAudioTracker.kt */
        public static final class g implements a {
            public static final g a = new g();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -547640628;
            }

            public final String toString() {
                return "OpenPlaylist";
            }
        }

        /* compiled from: RelatedAudioTracker.kt */
        public static final class h implements a {
            public static final h a = new h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public final int hashCode() {
                return -644054291;
            }

            public final String toString() {
                return "SimilarClick";
            }
        }

        /* compiled from: RelatedAudioTracker.kt */
        public static final class i implements a {
            public static final i a = new i();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public final int hashCode() {
                return 139809589;
            }

            public final String toString() {
                return "View";
            }
        }
    }

    public static void a(SchemeStat$EventItem schemeStat$EventItem, SchemeStat$TypeClick.b bVar) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(schemeStat$EventItem, bVar, 2)).q();
    }

    public static void b(SchemeStat$EventItem schemeStat$EventItem, SchemeStat$TypeView.b bVar) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        UiTracker uiTracker = UiTracker.a;
        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(schemeStat$EventItem, valueOf, valueOf, null, bVar, 8)).q();
    }
}
