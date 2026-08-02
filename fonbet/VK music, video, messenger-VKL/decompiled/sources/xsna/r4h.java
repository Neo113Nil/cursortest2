package xsna;

import java.util.LinkedList;
import java.util.List;

/* compiled from: CommunityInfoItemModel.kt */
/* loaded from: classes5.dex */
public final class r4h implements t4h {
    public final List<s4h> a;
    public final a b;

    /* compiled from: CommunityInfoItemModel.kt */
    public interface a {

        /* compiled from: CommunityInfoItemModel.kt */
        /* renamed from: xsna.r4h$a$a, reason: collision with other inner class name */
        public static final class C3596a implements a {
            public static final C3596a a = new C3596a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3596a);
            }

            public final int hashCode() {
                return -215575919;
            }

            public final String toString() {
                return "GovernmentVerification";
            }
        }

        /* compiled from: CommunityInfoItemModel.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1256265417;
            }

            public final String toString() {
                return "LiveVideos";
            }
        }

        /* compiled from: CommunityInfoItemModel.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -500890582;
            }

            public final String toString() {
                return "Suggestions";
            }
        }

        /* compiled from: CommunityInfoItemModel.kt */
        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1418788958;
            }

            public final String toString() {
                return "TextLive";
            }
        }
    }

    public r4h(LinkedList linkedList, a aVar) {
        this.a = linkedList;
        this.b = aVar;
    }
}
