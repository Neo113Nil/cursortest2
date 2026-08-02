package com.ybsdk.core.design.animation.ticker;

import com.ybsdk.core.design.animation.ticker.TickerView;
import defpackage.i6z0;
import defpackage.w511;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c {
    public ArrayList a;
    public final d b;
    public char c;
    public char d;
    public char[] e = new char[0];
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;

    public c(ArrayList arrayList, d dVar) {
        this.a = arrayList;
        this.b = dVar;
    }

    public final void a() {
        float a = this.b.a(this.d);
        float f = this.l;
        float f2 = this.m;
        if (f != f2 || f2 == a) {
            return;
        }
        this.m = a;
        this.l = a;
        this.n = a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (((r10 - r11) + r12) < (r11 - r12)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        r12 = r12 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (((r10 - r12) + r11) < (r12 - r11)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        r11 = r11 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r11 <= r12) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007a, code lost:
    
        if (r12 < r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(char c) {
        i6z0 i6z0Var;
        this.d = c;
        this.k = this.l;
        d dVar = this.b;
        float a = dVar.a(c);
        this.m = a;
        float f = this.k;
        if (f >= a) {
            a = f;
        }
        this.n = a;
        this.e = null;
        int size = this.a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                if (this.e == null) {
                    char c2 = this.c;
                    char c3 = this.d;
                    if (c2 == c3) {
                        this.e = new char[]{c2};
                        this.g = 0;
                        this.f = 0;
                    } else {
                        this.e = new char[]{c2, c3};
                        this.f = 0;
                        this.g = 1;
                    }
                }
                this.q = this.g < this.f ? -1 : 1;
                this.p = this.o;
                this.o = 0.0f;
                return;
            }
            b bVar = (b) this.a.get(i);
            char c4 = this.c;
            char c5 = this.d;
            TickerView.ScrollingDirection scrollingDirection = dVar.e;
            int i2 = bVar.b;
            int a2 = bVar.a(c4);
            int a3 = bVar.a(c5);
            if (a2 < 0 || a3 < 0) {
                i6z0Var = null;
            } else {
                int i3 = a.a[scrollingDirection.ordinal()];
                if (i3 == 1) {
                    if (c5 == 0) {
                        a3 = bVar.a.length;
                    }
                    i6z0Var = new i6z0(a2, a3, 11);
                } else if (i3 != 2) {
                    if (i3 != 3) {
                        w511.b();
                        return;
                    }
                    if (c4 != 0 && c5 != 0) {
                        if (a3 >= a2) {
                            if (a2 < a3) {
                            }
                        }
                    }
                    i6z0Var = new i6z0(a2, a3, 11);
                }
            }
            if (i6z0Var != null) {
                this.e = ((b) this.a.get(i)).a;
                this.f = i6z0Var.b;
                this.g = i6z0Var.c;
            }
            i++;
        }
    }
}
