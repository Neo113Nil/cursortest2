package xsna;

import xsna.cxs;
import xsna.j11;

/* compiled from: LevelPlayFullscreenAdvertisement.kt */
/* loaded from: classes6.dex */
public final class n2z {
    public final /* synthetic */ cxs.a a;
    public final /* synthetic */ o2z b;

    public n2z(cxs.a aVar, o2z o2zVar) {
        this.a = aVar;
        this.b = o2zVar;
    }

    public final void a(String str, String str2) {
        this.a.b(new cxs.b(str, str2));
    }

    public final void b() {
        this.a.e(this.b);
    }

    public final void c(int i, String str) {
        this.a.d(new j11.a(i, str, "Hasn't banners error"));
    }

    public final void d() {
        this.a.c(new j11.b(1308, "Failed to show ad"));
    }

    public final void e() {
        this.a.onClick();
    }

    public final void f() {
        this.a.onDismiss();
    }

    public final void g() {
        this.a.a();
    }

    public final void h(int i, String str) {
        this.a.c(new j11.a(i, str, "Failed to show ad"));
    }
}
