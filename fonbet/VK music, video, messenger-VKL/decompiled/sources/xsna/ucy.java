package xsna;

import kotlin.Lazy;

/* compiled from: KProperty.kt */
/* loaded from: classes2.dex */
public final class ucy implements Lazy<Object> {
    public final /* synthetic */ gzs<Object> b;

    public ucy(gzs<Object> gzsVar) {
        this.b = gzsVar;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        return this.b.invoke();
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return false;
    }
}
