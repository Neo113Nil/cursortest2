package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.d;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class f6y implements e6y {
    public final /* synthetic */ d a;
    public final /* synthetic */ boolean b;

    public f6y(d dVar, boolean z) {
        this.a = dVar;
        this.b = z;
    }

    @Override // defpackage.e6y
    public final int a() {
        d dVar = this.a;
        return (-dVar.n().f) + dVar.n().d;
    }

    @Override // defpackage.e6y
    public final Object b(int i, Continuation continuation) {
        Object u = d.u(this.a, i, (SuspendLambda) continuation);
        return u == CoroutineSingletons.COROUTINE_SUSPENDED ? u : zy11.a;
    }

    @Override // defpackage.e6y
    public final float c() {
        return hg21.b(this.a);
    }

    @Override // defpackage.e6y
    public final float d() {
        d dVar = this.a;
        return a990.a(dVar.n(), dVar.o());
    }

    @Override // defpackage.e6y
    public final hcc e() {
        boolean z = this.b;
        d dVar = this.a;
        return z ? new hcc(dVar.o(), 1) : new hcc(1, dVar.o());
    }

    @Override // defpackage.e6y
    public final int f() {
        d dVar = this.a;
        return (int) (dVar.n().e == Orientation.Vertical ? dVar.n().e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : dVar.n().e() >> 32);
    }
}
