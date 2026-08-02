package ru.mail.libverify.p;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.libverify.p.f;
import ru.mail.libverify.r.a;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class f {
    private static final TimeUnit f = TimeUnit.MINUTES;
    private final ru.mail.libverify.s.a a;
    private final ru.mail.libverify.r.b b;
    private final ru.mail.libverify.t.a c;
    private final ru.mail.libverify.i0.a d;
    private final ExecutorService e;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ru.mail.libverify.r.c.values().length];
            a = iArr;
            try {
                iArr[ru.mail.libverify.r.c.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ru.mail.libverify.r.c.NOT_MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public abstract class b {
        private final AtomicReference<ru.mail.libverify.p.a> a = new AtomicReference<>();
        private ru.mail.libverify.p.a b;

        @NonNull
        final d c;

        @NonNull
        final String d;

        public b(d dVar) {
            this.c = dVar;
            this.d = dVar.b;
        }

        public final void b() {
            ru.mail.libverify.p.a c = c();
            this.b = c;
            this.a.set(c);
        }

        public abstract ru.mail.libverify.p.a c();

        public final void d() {
            f.this.c.a(this.d);
        }

        @NonNull
        public final ru.mail.libverify.p.a a() {
            if (this.b != null) {
                return this.a.get();
            }
            throw new IllegalStateException("init() must be called before any access to logic");
        }
    }

    public class c extends b {
        private final ExecutorService f;

        public c(d dVar) {
            super(dVar);
            this.f = f.this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(ru.mail.libverify.r.a aVar) {
            if (f.this.c.a(this.d, this.c.e, f.f)) {
                int i = a.a[f.this.b.a(this.d, aVar).ordinal()];
                if (i == 1) {
                    f fVar = f.this;
                    fVar.a.a(this.d, fVar.b.a());
                    ((b) this).a.set(f.this.b.a());
                    ru.mail.libverify.p.b bVar = this.c.d;
                    String str = this.d;
                    bVar.getClass();
                    FileLog.d("Omicron", "onCacheUpdated " + str);
                } else if (i != 2) {
                    return;
                }
                f fVar2 = f.this;
                fVar2.c.a(this.d, Long.valueOf(fVar2.d.b()));
            }
        }

        @Override // ru.mail.libverify.p.f.b
        @NonNull
        public final ru.mail.libverify.p.a c() {
            final ru.mail.libverify.r.a a;
            ru.mail.libverify.p.a a2 = f.this.a.a(this.d);
            if (a2 == null) {
                a2 = ru.mail.libverify.p.a.f().a();
                a = new a.C2214a().a(this.c.f).b(this.c.g).a(this.c.c).a();
                ru.mail.libverify.p.b bVar = this.c.d;
                String str = this.d;
                bVar.getClass();
                FileLog.d("Omicron", "onCacheMiss " + str);
            } else {
                a = new a.C2214a().a(a2.e()).a(a2.c()).a(a2.d()).a(this.c.f).b(this.c.g).a(this.c.c).a();
                ru.mail.libverify.p.b bVar2 = this.c.d;
                String str2 = this.d;
                boolean a3 = f.this.c.a(str2, r3.e, f.f);
                bVar2.getClass();
                FileLog.d("Omicron", "onCacheHit " + str2 + ", " + a3);
            }
            this.f.execute(new Runnable() { // from class: ru.mail.libverify.p.h
                @Override // java.lang.Runnable
                public final void run() {
                    f.c.this.a(a);
                }
            });
            return a2;
        }
    }

    public f(ru.mail.libverify.s.a aVar, ru.mail.libverify.r.b bVar, ru.mail.libverify.t.a aVar2, ru.mail.libverify.i0.a aVar3, ExecutorService executorService) {
        this.a = aVar;
        this.b = bVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = executorService;
    }
}
