package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class mxs0 implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public Iterator w;
    public final /* synthetic */ AbstractMap x;

    public /* synthetic */ mxs0(g8b1 g8b1Var) {
        this.a = 4;
        Objects.requireNonNull(g8b1Var);
        this.x = g8b1Var;
        this.b = -1;
    }

    public Iterator a() {
        int i = this.a;
        AbstractMap abstractMap = this.x;
        switch (i) {
            case 0:
                if (this.w == null) {
                    this.w = ((axs0) abstractMap).c.entrySet().iterator();
                }
                break;
            case 1:
                if (this.w == null) {
                    this.w = ((bxs0) abstractMap).c.entrySet().iterator();
                }
                break;
            default:
                if (this.w == null) {
                    this.w = ((cxs0) abstractMap).b.entrySet().iterator();
                }
                break;
        }
        return this.w;
    }

    public Iterator b() {
        int i = this.a;
        AbstractMap abstractMap = this.x;
        switch (i) {
            case 3:
                if (this.w == null) {
                    this.w = ((jga1) abstractMap).c.entrySet().iterator();
                }
                break;
            default:
                if (this.w == null) {
                    this.w = ((g8b1) abstractMap).c.entrySet().iterator();
                }
                break;
        }
        return this.w;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractMap abstractMap = this.x;
        switch (i) {
            case 0:
                axs0 axs0Var = (axs0) abstractMap;
                if (this.b + 1 >= axs0Var.b.size()) {
                    if (axs0Var.c.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
            case 1:
                bxs0 bxs0Var = (bxs0) abstractMap;
                if (this.b + 1 >= bxs0Var.b) {
                    if (bxs0Var.c.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
            case 2:
                cxs0 cxs0Var = (cxs0) abstractMap;
                if (this.b + 1 >= cxs0Var.a.size()) {
                    if (cxs0Var.b.isEmpty() || !a().hasNext()) {
                        break;
                    }
                }
                break;
            case 3:
                jga1 jga1Var = (jga1) abstractMap;
                if (this.b + 1 >= jga1Var.b) {
                    if (jga1Var.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
            default:
                g8b1 g8b1Var = (g8b1) abstractMap;
                if (this.b + 1 >= g8b1Var.b) {
                    if (g8b1Var.c.isEmpty() || !b().hasNext()) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractMap abstractMap = this.x;
        switch (i) {
            case 0:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                axs0 axs0Var = (axs0) abstractMap;
                if (i2 >= axs0Var.b.size()) {
                    break;
                } else {
                    break;
                }
            case 1:
                this.c = true;
                int i3 = this.b + 1;
                this.b = i3;
                bxs0 bxs0Var = (bxs0) abstractMap;
                if (i3 >= bxs0Var.b) {
                    break;
                } else {
                    break;
                }
            case 2:
                this.c = true;
                int i4 = this.b + 1;
                this.b = i4;
                cxs0 cxs0Var = (cxs0) abstractMap;
                if (i4 >= cxs0Var.a.size()) {
                    break;
                } else {
                    break;
                }
            case 3:
                this.c = true;
                int i5 = this.b + 1;
                this.b = i5;
                jga1 jga1Var = (jga1) abstractMap;
                if (i5 >= jga1Var.b) {
                    break;
                } else {
                    break;
                }
            default:
                this.c = true;
                int i6 = this.b + 1;
                this.b = i6;
                g8b1 g8b1Var = (g8b1) abstractMap;
                if (i6 >= g8b1Var.b) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractMap abstractMap = this.x;
        switch (i) {
            case 0:
                axs0 axs0Var = (axs0) abstractMap;
                if (!this.c) {
                    ny61.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    int i2 = axs0.A;
                    axs0Var.b();
                    if (this.b >= axs0Var.b.size()) {
                        a().remove();
                        break;
                    } else {
                        int i3 = this.b;
                        this.b = i3 - 1;
                        axs0Var.g(i3);
                        break;
                    }
                }
            case 1:
                bxs0 bxs0Var = (bxs0) abstractMap;
                if (!this.c) {
                    ny61.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    int i4 = bxs0.z;
                    bxs0Var.b();
                    int i5 = this.b;
                    if (i5 >= bxs0Var.b) {
                        a().remove();
                        break;
                    } else {
                        this.b = i5 - 1;
                        bxs0Var.h(i5);
                        break;
                    }
                }
            case 2:
                cxs0 cxs0Var = (cxs0) abstractMap;
                if (!this.c) {
                    ny61.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    int i6 = cxs0.z;
                    cxs0Var.b();
                    if (this.b >= cxs0Var.a.size()) {
                        a().remove();
                        break;
                    } else {
                        int i7 = this.b;
                        this.b = i7 - 1;
                        cxs0Var.h(i7);
                        break;
                    }
                }
            case 3:
                jga1 jga1Var = (jga1) abstractMap;
                if (!this.c) {
                    ny61.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    int i8 = jga1.z;
                    jga1Var.h();
                    int i9 = this.b;
                    if (i9 >= jga1Var.b) {
                        b().remove();
                        break;
                    } else {
                        this.b = i9 - 1;
                        jga1Var.f(i9);
                        break;
                    }
                }
            default:
                if (!this.c) {
                    ny61.r("remove() was called before next()");
                    break;
                } else {
                    this.c = false;
                    g8b1 g8b1Var = (g8b1) abstractMap;
                    g8b1Var.g();
                    int i10 = this.b;
                    if (i10 >= g8b1Var.b) {
                        b().remove();
                        break;
                    } else {
                        this.b = i10 - 1;
                        g8b1Var.e(i10);
                        break;
                    }
                }
        }
    }

    public /* synthetic */ mxs0(AbstractMap abstractMap, int i) {
        this.a = i;
        this.x = abstractMap;
        this.b = -1;
    }
}
