package defpackage;

import com.yandex.go.places.api.navigation.CardRevealing;
import com.yandex.go.places.api.navigation.OrganizationCardSliderPinDisplayStrategy;

/* loaded from: classes13.dex */
public final class he80 {
    public boolean a;
    public boolean b;
    public ity e;
    public boolean f;
    public boolean g;
    public Integer h;
    public Float i;
    public CardRevealing m;
    public Float n;
    public boolean o;
    public boolean r;
    public boolean s;
    public boolean c = true;
    public boolean d = true;
    public boolean j = true;
    public boolean k = true;
    public boolean l = true;
    public OrganizationCardSliderPinDisplayStrategy p = OrganizationCardSliderPinDisplayStrategy.ALL_PINS;
    public boolean q = true;

    public final je80 a() {
        return new je80(this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null, this.n, this.b, this.o, this.p, this.q, this.r, this.s);
    }

    public final void b() {
        this.s = true;
    }

    public final void c(float f) {
        this.i = Float.valueOf(f);
    }

    public final void d(boolean z) {
        this.l = z;
    }

    public final void e() {
        this.a = true;
    }

    public final void f() {
        this.f = true;
    }

    public final void g() {
        this.f = true;
        this.g = true;
    }

    public final void h(boolean z) {
        this.r = z;
    }

    public final void i() {
        this.g = true;
    }

    public final void j() {
        this.q = false;
    }

    public final void k() {
        this.j = false;
    }

    public final void l() {
        this.a = false;
        this.f = true;
        this.g = true;
        this.b = true;
        this.s = true;
    }

    public final void m(CardRevealing cardRevealing) {
        this.m = cardRevealing;
    }

    public final void n(float f) {
        this.n = Float.valueOf(f);
    }

    public final void o(boolean z) {
        this.o = z;
    }

    public final void p() {
        this.k = false;
        this.f = false;
        this.g = false;
        this.a = false;
        this.d = false;
        this.c = false;
    }
}
