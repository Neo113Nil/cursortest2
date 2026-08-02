package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class g6y implements e6y {
    public final qxi a;
    public final /* synthetic */ b b;
    public final /* synthetic */ boolean c;

    public g6y(b bVar, boolean z) {
        this.b = bVar;
        this.c = z;
        this.a = f.d(new vs9(bVar, 6));
    }

    @Override // defpackage.e6y
    public final int a() {
        b bVar = this.b;
        return (-bVar.j().l) + bVar.j().p;
    }

    @Override // defpackage.e6y
    public final Object b(int i, Continuation continuation) {
        tig0 tig0Var = b.y;
        Object l = this.b.l(i, 0, (ContinuationImpl) continuation);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }

    @Override // defpackage.e6y
    public final float c() {
        b bVar = this.b;
        return (bVar.h() * 500) + bVar.i();
    }

    @Override // defpackage.e6y
    public final float d() {
        b bVar = this.b;
        int h = bVar.h();
        int i = bVar.i();
        return bVar.b() ? (h * 500) + i + 100.0f : (h * 500) + i;
    }

    @Override // defpackage.e6y
    public final hcc e() {
        boolean z = this.c;
        qxi qxiVar = this.a;
        return z ? new hcc(((Number) qxiVar.getValue()).intValue(), 1) : new hcc(1, ((Number) qxiVar.getValue()).intValue());
    }

    @Override // defpackage.e6y
    public final int f() {
        b bVar = this.b;
        return (int) (bVar.j().o == Orientation.Vertical ? bVar.j().e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : bVar.j().e() >> 32);
    }
}
