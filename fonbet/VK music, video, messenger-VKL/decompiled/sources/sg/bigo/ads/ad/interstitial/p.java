package sg.bigo.ads.ad.interstitial;

import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import sg.bigo.ads.h.b;
import sg.bigo.ads.i.a;

/* loaded from: classes9.dex */
public final class p implements b.a {

    @NonNull
    final sg.bigo.ads.y.b a;
    final u b;
    int c;
    int d;
    int e;
    int f;
    int g;
    boolean i;
    volatile boolean j;
    View k;
    ProgressBar l;
    sg.bigo.ads.f.c o;
    public a.InterfaceC2488a p;
    sg.bigo.ads.common.utils.o q;
    int m = 5;
    boolean n = false;
    boolean h = false;

    public p(@NonNull sg.bigo.ads.y.b bVar, u uVar) {
        this.a = bVar;
        this.b = uVar;
    }

    @Override // sg.bigo.ads.h.b.a
    public final void a(WebView webView, int i) {
        if (i < 80 || this.d != 0) {
            ProgressBar progressBar = this.l;
            if (progressBar != null && i > this.m) {
                progressBar.setProgress(i <= 95 ? i : 95);
            }
        } else {
            b();
        }
        this.m = i;
    }

    public final void b() {
        if (this.k == null || !this.j) {
            return;
        }
        this.j = false;
        this.k.setVisibility(8);
    }

    @Override // sg.bigo.ads.h.b.a
    public final void c() {
        this.n = true;
        b();
    }

    @Override // sg.bigo.ads.h.b.a
    public final void d() {
    }

    @Override // sg.bigo.ads.h.b.a
    public final void e(@NonNull sg.bigo.ads.api.core.b bVar) {
    }

    public final void a(@NonNull AdCountDownButton adCountDownButton) {
        adCountDownButton.e();
        sg.bigo.ads.common.utils.o oVar = this.q;
        if (oVar != null) {
            oVar.b();
        }
    }

    @Override // sg.bigo.ads.h.b.a
    public final void b(@NonNull sg.bigo.ads.api.core.b bVar) {
    }

    @Override // sg.bigo.ads.h.b.a
    public final void c(@NonNull sg.bigo.ads.api.core.b bVar) {
    }

    @Override // sg.bigo.ads.h.b.a
    public final void d(@NonNull sg.bigo.ads.api.core.b bVar) {
    }

    @Override // sg.bigo.ads.h.b.a
    public final boolean e() {
        return false;
    }

    @Override // sg.bigo.ads.h.b.a
    public final void a(@NonNull sg.bigo.ads.api.core.b bVar) {
    }

    @Override // sg.bigo.ads.h.b.a
    public final void b(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
    }

    @Override // sg.bigo.ads.h.b.a
    public final void c(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
    }

    @Override // sg.bigo.ads.h.b.a
    public final void d(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
    }

    @Override // sg.bigo.ads.h.b.a
    public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j) {
    }

    public final boolean a() {
        return this.h && this.g == 3;
    }
}
