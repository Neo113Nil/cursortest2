package sg.bigo.ads.cf;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.cg.b;
import sg.bigo.ads.ch.d;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public interface e extends c {

    public static class a implements e {
        private final sg.bigo.ads.cf.a a;
        private final sg.bigo.ads.cg.b b;
        private final sg.bigo.ads.an.g c;
        private final sg.bigo.ads.ai.j d;
        private final String e;
        private String f;
        private i g;
        private i h;
        private final boolean i;
        private boolean j;
        private boolean k;
        private String l;
        private f m;
        private String n;
        private final AtomicBoolean o = new AtomicBoolean(false);
        private final AtomicBoolean p = new AtomicBoolean(false);
        private final Runnable q = new Runnable() { // from class: sg.bigo.ads.cf.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b();
            }
        };

        public a(@NonNull sg.bigo.ads.cf.a aVar, @NonNull sg.bigo.ads.an.g gVar, @NonNull sg.bigo.ads.ai.j jVar, @NonNull String str, String str2) {
            this.n = null;
            boolean z = false;
            this.a = aVar;
            this.c = gVar;
            this.d = jVar;
            this.e = str;
            this.n = str2;
            str.getClass();
            if (str.equals("/Ad/GetSDKConfig")) {
                this.b = aVar.g;
                z = true;
            } else {
                this.b = !str.equals("/Ad/ReportUniBaina") ? aVar.i : aVar.h;
            }
            this.i = z;
        }

        @Override // sg.bigo.ads.bo.a
        public final String a() {
            sg.bigo.ads.ch.d dVar;
            f fVar;
            f fVar2;
            String str = this.n;
            if (str != null) {
                return sg.bigo.ads.b.a(str, this.e);
            }
            if (r.a((CharSequence) this.f)) {
                String v = this.c.v();
                d a = this.b.a(v, this.d.s());
                sg.bigo.ads.cf.a aVar = this.a;
                this.j = aVar.a;
                this.k = aVar.b;
                this.l = aVar.c;
                this.g = a.a;
                this.h = this.b.a;
                dVar = d.a.a;
                dVar.a(this.e, this.g, this.h);
                this.f = sg.bigo.ads.b.a(this.g.c() ? this.g.b() : this.g.a(), this.e);
                if (a.c && (fVar2 = this.m) != null) {
                    fVar2.a();
                }
                if (a.b && (fVar = this.m) != null) {
                    fVar.a(v, this.i);
                }
            }
            return this.f;
        }

        @Override // sg.bigo.ads.bo.a
        public final void b() {
            f fVar;
            boolean z = false;
            if (this.o.compareAndSet(false, true)) {
                sg.bigo.ads.bh.d.a(this.q);
                String d = d();
                sg.bigo.ads.cg.b bVar = this.b;
                b.C2452b c2452b = bVar.b;
                if (c2452b != null && (z = TextUtils.equals(d, c2452b.a()))) {
                    bVar.c++;
                }
                if (z && (fVar = this.m) != null) {
                    fVar.a();
                }
            }
        }

        @Override // sg.bigo.ads.bo.a
        public final void c() {
            f fVar;
            boolean z = false;
            if (this.o.compareAndSet(false, true)) {
                sg.bigo.ads.bh.d.a(this.q);
                String d = d();
                sg.bigo.ads.cg.b bVar = this.b;
                b.C2452b c2452b = bVar.b;
                if (c2452b != null) {
                    boolean z2 = TextUtils.equals(d, c2452b.a()) && bVar.c > 0;
                    if (z2) {
                        bVar.c = 0;
                    }
                    z = z2;
                }
                if (z && (fVar = this.m) != null) {
                    fVar.a();
                }
            }
        }

        @Override // sg.bigo.ads.bo.a
        public final String d() {
            i iVar = this.g;
            return iVar != null ? iVar.a() : "";
        }

        @Override // sg.bigo.ads.bo.a
        public final boolean e() {
            i iVar = this.g;
            return iVar != null && iVar.c();
        }

        @Override // sg.bigo.ads.bo.a
        public final String f() {
            i iVar = this.h;
            return iVar != null ? iVar.a() : "";
        }

        @Override // sg.bigo.ads.cf.c
        @Nullable
        public final i g() {
            return this.g;
        }

        @Override // sg.bigo.ads.cf.c
        public final boolean h() {
            return this.k;
        }

        @Override // sg.bigo.ads.cf.c
        public final String i() {
            return this.l;
        }

        @Override // sg.bigo.ads.cf.c
        public final void a(long j) {
            if (this.p.compareAndSet(false, true)) {
                sg.bigo.ads.bh.d.a(3, this.q, j);
            }
        }

        @Override // sg.bigo.ads.cf.c
        public final void a(f fVar) {
            this.m = fVar;
        }
    }
}
