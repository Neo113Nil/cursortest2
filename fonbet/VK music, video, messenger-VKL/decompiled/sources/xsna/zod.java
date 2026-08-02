package xsna;

import xsna.c48;
import xsna.kpe;
import xsna.l7p0;
import xsna.x8l;

/* compiled from: ClipsDecorationDependenciesProvider.kt */
/* loaded from: classes17.dex */
public interface zod {
    public static final a a = a.a;

    /* compiled from: ClipsDecorationDependenciesProvider.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final zod STUB = new C4187a();

        /* compiled from: ClipsDecorationDependenciesProvider.kt */
        /* renamed from: xsna.zod$a$a, reason: collision with other inner class name */
        public static final class C4187a implements zod {
            public final l7p0 b = l7p0.a.a.getSTUB();
            public final c48 c = c48.a.a.getSTUB();
            public final kpe d = kpe.a.a.getSTUB();
            public final x8l e = x8l.a.a.getSTUB();

            @Override // xsna.zod
            public final l7p0 a() {
                return this.b;
            }

            @Override // xsna.zod
            public final x8l b() {
                return this.e;
            }

            @Override // xsna.zod
            public final kpe c() {
                return this.d;
            }

            @Override // xsna.zod
            public final c48 d() {
                return this.c;
            }
        }

        public final zod getSTUB() {
            return STUB;
        }
    }

    l7p0 a();

    x8l b();

    kpe c();

    c48 d();
}
