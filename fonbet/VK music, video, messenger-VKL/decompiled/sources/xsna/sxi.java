package xsna;

import kotlin.LazyThreadSafetyMode;
import xsna.z550;

/* compiled from: ConfigMusicPlayerListenerDelegate.kt */
/* loaded from: classes3.dex */
public final class sxi implements i7f0 {
    public final Object b;
    public final Object c;

    public /* synthetic */ sxi(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        return (px40) this.c.getValue();
    }

    public sxi(rx40 rx40Var, z550.a aVar) {
        this.b = aVar;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new cm(9, this, rx40Var));
    }
}
