package sg.bigo.ads.f;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.ai.n;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.dh.a;
import sg.bigo.ads.dh.p;
import sg.bigo.ads.h.a;
import sg.bigo.ads.h.b;
import sg.bigo.ads.h.c;

/* loaded from: classes9.dex */
public final class a implements sg.bigo.ads.h.b, sg.bigo.ads.h.c {
    public boolean a;

    @Nullable
    public sg.bigo.ads.h.a b;
    final a.C2487a c = new a.C2487a();

    /* renamed from: sg.bigo.ads.f.a$a, reason: collision with other inner class name */
    public final class C2482a implements b.a {
        private C2482a() {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void a(WebView webView, int i) {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void b(@NonNull sg.bigo.ads.api.core.b bVar) {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void c() {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void d() {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void e(@NonNull sg.bigo.ads.api.core.b bVar) {
        }

        public /* synthetic */ C2482a(a aVar, byte b) {
            this();
        }

        @Override // sg.bigo.ads.h.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar) {
            a.this.c.a(bVar, 6, 0L);
        }

        @Override // sg.bigo.ads.h.b.a
        public final void b(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            a.this.c.a(bVar, 2, j);
        }

        @Override // sg.bigo.ads.h.b.a
        public final void c(@NonNull sg.bigo.ads.api.core.b bVar) {
        }

        @Override // sg.bigo.ads.h.b.a
        public final void d(@NonNull sg.bigo.ads.api.core.b bVar) {
        }

        @Override // sg.bigo.ads.h.b.a
        public final boolean e() {
            return true;
        }

        @Override // sg.bigo.ads.h.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            a.this.c.a(bVar, 0, j);
        }

        @Override // sg.bigo.ads.h.b.a
        public final void c(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            a.this.c.a(bVar, 1, j);
        }

        @Override // sg.bigo.ads.h.b.a
        public final void d(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            a.this.c.a(bVar, 5, j);
        }
    }

    public final class b implements c.b {
        private b() {
        }

        @Override // sg.bigo.ads.h.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar) {
            a.this.c.a(bVar, 6, 0L);
        }

        public /* synthetic */ b(a aVar, byte b) {
            this();
        }

        @Override // sg.bigo.ads.h.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
            a.this.c.a(bVar, 5, j);
        }

        @Override // sg.bigo.ads.h.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j, @Nullable String str, int i, @Nullable String str2) {
            a.this.c.a(bVar, 3, j, str, i, str2, null);
        }

        @Override // sg.bigo.ads.h.c.b
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j, @Nullable String str, int i, @Nullable String str2, @Nullable String str3) {
            a.this.c.a(bVar, 4, j, str, i, str2, str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z, @NonNull Ad ad, @NonNull n nVar, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable sg.bigo.ads.core.player.c cVar, @Nullable p pVar) {
        a.C2478a c2478a;
        sg.bigo.ads.dh.a next;
        if ((bVar.as() || nVar.t()) && !z) {
            if (bVar.y() == 3 || bVar.y() == 4 || bVar.y() == 12 || bVar.y() == 20) {
                a.C2478a c2478a2 = null;
                if (pVar != null) {
                    Iterator<sg.bigo.ads.dh.a> it = pVar.A.iterator();
                    a.C2478a c2478a3 = null;
                    while (it.hasNext() && ((next = it.next()) == null || (((c2478a2 = sg.bigo.ads.dh.a.a(next.b)) == null || !c2478a2.a()) && ((c2478a3 = next.a()) == null || !c2478a3.a())))) {
                    }
                    c2478a = c2478a3;
                } else {
                    c2478a = null;
                }
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (c2478a2 != null && c2478a2.a()) {
                    this.b = new sg.bigo.ads.g.c(ad, bVar, cVar, pVar, new b(this, objArr2 == true ? 1 : 0));
                }
                if (this.b == null && c2478a != null && c2478a.a()) {
                    this.b = new sg.bigo.ads.g.b(ad, bVar, cVar, pVar, c2478a, new C2482a(this, objArr == true ? 1 : 0));
                }
                this.a = this.b != null;
                nVar.l();
                nVar.n();
            }
        }
    }

    @Override // sg.bigo.ads.h.a
    @Nullable
    public final View a() {
        sg.bigo.ads.h.a aVar;
        if (this.a && (aVar = this.b) != null) {
            return aVar.a();
        }
        return null;
    }

    @Override // sg.bigo.ads.h.a
    public final boolean b() {
        sg.bigo.ads.h.a aVar;
        if (this.a && (aVar = this.b) != null) {
            return aVar.b();
        }
        return false;
    }

    @Override // sg.bigo.ads.h.a
    public final void c() {
        sg.bigo.ads.h.a aVar = this.b;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void d() {
        sg.bigo.ads.h.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void e() {
        sg.bigo.ads.h.a aVar = this.b;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void f() {
        sg.bigo.ads.h.a aVar = this.b;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void a(int i) {
        sg.bigo.ads.h.a aVar;
        if (this.a && (aVar = this.b) != null) {
            aVar.a(i);
        }
    }

    @Override // sg.bigo.ads.h.a
    public final void a(int i, int i2) {
        sg.bigo.ads.h.a aVar;
        if (this.a && (aVar = this.b) != null) {
            aVar.a(i, i2);
        }
    }

    public final void a(h hVar) {
        sg.bigo.ads.h.a aVar = this.b;
        if (aVar instanceof sg.bigo.ads.g.b) {
            ((sg.bigo.ads.g.b) aVar).h = hVar;
        }
    }

    public final void a(c.a aVar) {
        sg.bigo.ads.h.a aVar2 = this.b;
        if (aVar2 instanceof sg.bigo.ads.g.c) {
            ((sg.bigo.ads.g.c) aVar2).f = aVar;
        }
    }

    @Override // sg.bigo.ads.h.a
    public final boolean a(Context context) {
        sg.bigo.ads.h.a aVar;
        if (this.a && (aVar = this.b) != null) {
            return aVar.a(context);
        }
        return false;
    }
}
