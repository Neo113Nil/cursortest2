package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import xsna.dhr0;

/* compiled from: ResourceResolver.kt */
/* loaded from: classes.dex */
public final class abg0 {
    public final gzs<dhr0.c> a;
    public final gzs<Context> b;

    /* JADX WARN: Multi-variable type inference failed */
    public abg0(gzs<? extends dhr0.c> gzsVar, gzs<? extends Context> gzsVar2) {
        this.a = gzsVar;
        this.b = gzsVar2;
    }

    public final Drawable a(int i) {
        return m33.a(i, this.b.invoke());
    }

    public final baf0 b(int i, int i2) {
        Context invoke = this.b.invoke();
        LinkedHashMap linkedHashMap = x1z.a;
        return new baf0(m33.a(i, invoke), c(i2));
    }

    public final int c(int i) {
        return this.a.invoke().a(i, this.b.invoke());
    }

    public final Drawable d(int i) {
        return e3m.e(i, this.b.invoke());
    }
}
