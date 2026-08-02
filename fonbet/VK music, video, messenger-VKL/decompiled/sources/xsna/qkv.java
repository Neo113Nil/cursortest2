package xsna;

import java.util.ArrayDeque;
import xsna.wjy;

/* compiled from: HttpSessionInWindowFallbackCondition.kt */
/* loaded from: classes.dex */
public final class qkv {
    public final gzs<Boolean> a;
    public final gzs<Integer> b;
    public final gzs<Long> c;
    public final wjy.d d;
    public final ArrayDeque<Long> e = new ArrayDeque<>();

    public qkv(gzs gzsVar, gzs gzsVar2, gzs gzsVar3, wjy.d dVar) {
        this.a = gzsVar;
        this.b = gzsVar2;
        this.c = gzsVar3;
        this.d = dVar;
    }

    public final synchronized boolean a() {
        if (this.a.invoke().booleanValue()) {
            return this.e.size() >= this.b.invoke().intValue();
        }
        return false;
    }
}
