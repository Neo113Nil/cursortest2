package xsna;

import java.util.List;

/* compiled from: ExternalApiManager.kt */
/* loaded from: classes.dex */
public class ydq extends l7r0 {
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.l7r0
    public <T> ara<T> k(com.vk.api.sdk.a aVar, ara<? extends T> araVar) {
        int i = aVar.g;
        ara<T> k = super.k(aVar, araVar);
        if (aVar.k && !aVar.h) {
            k = new wu2(this, i, k);
        }
        return (aVar.n || ((List) w2q.a.getValue()).contains(aVar.c)) ? k : new xj(i, k, this);
    }

    @Override // xsna.l7r0
    public <T> ara<T> l(xbr0 xbr0Var, ara<? extends T> araVar) {
        return new xj(xbr0Var.a(), super.l(xbr0Var, araVar), this);
    }
}
