package xsna;

import java.util.Iterator;

/* compiled from: Iterables.kt */
/* loaded from: classes8.dex */
public final class bmi0 implements Iterable<String>, gcy {
    public final /* synthetic */ yrp b;

    public bmi0(yrp yrpVar) {
        this.b = yrpVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new ami0(this.b);
    }
}
