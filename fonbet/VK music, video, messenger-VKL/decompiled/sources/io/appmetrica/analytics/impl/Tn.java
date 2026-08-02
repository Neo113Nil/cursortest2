package io.appmetrica.analytics.impl;

/* loaded from: classes8.dex */
public class Tn implements Qi {
    public final int a;
    public final int b;
    public int c = 0;

    public Tn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        int i = this.c;
        this.c = i + 1;
        return i < this.a;
    }

    public final void c() {
        this.c = 0;
    }
}
