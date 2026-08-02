package xsna;

import com.vk.dto.music.audiobook.AudioBookPerson;
import java.util.List;

/* compiled from: AudioBookNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface ph4 {

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class a implements ph4 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1482730142;
        }

        public final String toString() {
            return "CopyBookLinkClick";
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class b implements ph4 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -413947338;
        }

        public final String toString() {
            return "Download";
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class c implements ph4 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1077289286;
        }

        public final String toString() {
            return "GoToEqualizerClicked";
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class d implements ph4 {
        public final List<AudioBookPerson> a;

        public d(List<AudioBookPerson> list) {
            this.a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("GoToPerson(people="), this.a);
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class e implements ph4 {
        public final boolean a;

        public e(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("MarkAsListened(isSuccess="), this.a, ')');
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class f implements ph4 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "PersonClicked(personId=0)";
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class g implements ph4 {
        public final String a;

        public g(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Share(shareLink="), this.a, ')');
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class h implements ph4 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -433007509;
        }

        public final String toString() {
            return "ShowKidsContentRestriction";
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class i extends j {
        public final boolean b;

        public i(boolean z) {
            super(z);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Subscribe(isSuccess="), this.b, ')');
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static abstract class j implements ph4 {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class k implements ph4 {
        public static final k a = new k();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1224785777;
        }

        public final String toString() {
            return "TimerClick";
        }
    }

    /* compiled from: AudioBookNavigationEvent.kt */
    public static final class l extends j {
        public final boolean b;

        public l(boolean z) {
            super(z);
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Unsubscribe(isSuccess="), this.b, ')');
        }
    }
}
