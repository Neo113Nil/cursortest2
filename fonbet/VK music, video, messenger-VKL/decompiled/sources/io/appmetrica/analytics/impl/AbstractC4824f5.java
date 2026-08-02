package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC4824f5 {
    public final C4927j5 a;
    public final String b = "[ComponentMigrationToV113]";

    public AbstractC4824f5(C4927j5 c4927j5) {
        this.a = c4927j5;
    }

    public final C4927j5 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public abstract boolean b(int i);

    public abstract void c();

    public final void a(int i) {
        if (b(i)) {
            c();
        }
    }
}
