package xsna;

import java.util.ArrayList;

/* compiled from: TaggedItemsPatch.kt */
/* loaded from: classes18.dex */
public interface h1o0 extends xl50 {

    /* compiled from: TaggedItemsPatch.kt */
    public static final class a implements h1o0 {
        public final Long b;
        public final boolean c;

        public a(Long l, boolean z) {
            this.b = l;
            this.c = z;
        }
    }

    /* compiled from: TaggedItemsPatch.kt */
    public interface b extends h1o0 {

        /* compiled from: TaggedItemsPatch.kt */
        public static final class a implements b {
        }

        /* compiled from: TaggedItemsPatch.kt */
        /* renamed from: xsna.h1o0$b$b, reason: collision with other inner class name */
        public static final class C2967b implements b {
            public final ArrayList b;
            public final int c;
            public final int d;

            public C2967b(ArrayList arrayList, int i, int i2) {
                this.b = arrayList;
                this.c = i;
                this.d = i2;
            }
        }

        /* compiled from: TaggedItemsPatch.kt */
        public static final class c implements b {
            public static final c b = new c();
        }
    }

    /* compiled from: TaggedItemsPatch.kt */
    public interface c extends h1o0 {

        /* compiled from: TaggedItemsPatch.kt */
        public static final class a implements c {
        }

        /* compiled from: TaggedItemsPatch.kt */
        public static final class b implements c {
            public final ArrayList b;
            public final int c;
            public final int d;

            public b(ArrayList arrayList, int i, int i2) {
                this.b = arrayList;
                this.c = i;
                this.d = i2;
            }
        }

        /* compiled from: TaggedItemsPatch.kt */
        /* renamed from: xsna.h1o0$c$c, reason: collision with other inner class name */
        public static final class C2968c implements c {
            public static final C2968c b = new C2968c();
        }
    }
}
