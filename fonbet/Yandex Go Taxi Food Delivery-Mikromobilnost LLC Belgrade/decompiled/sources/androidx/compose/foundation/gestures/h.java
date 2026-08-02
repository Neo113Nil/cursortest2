package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.bvf0;
import defpackage.oz40;
import defpackage.tls;
import defpackage.wkp0;
import defpackage.wls;
import defpackage.zjh;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class h implements wkp0 {
    public final tls a;
    public final zjh b = new zjh(this);
    public final androidx.compose.foundation.j c = new androidx.compose.foundation.j();
    public final oz40 d;
    public final oz40 e;
    public final oz40 f;

    public h(tls tlsVar) {
        this.a = tlsVar;
        Boolean bool = Boolean.FALSE;
        this.d = androidx.compose.runtime.f.j(bool);
        this.e = androidx.compose.runtime.f.j(bool);
        this.f = androidx.compose.runtime.f.j(bool);
    }

    @Override // defpackage.wkp0
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.wkp0
    public final float c(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.wkp0
    public final Object d(MutatePriority mutatePriority, wls wlsVar, Continuation continuation) {
        Object n = bvf0.n(new DefaultScrollableState$scroll$2(this, mutatePriority, wlsVar, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }
}
