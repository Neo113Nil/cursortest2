package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import defpackage.e6y;
import defpackage.hcc;
import defpackage.tig0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class c implements e6y {
    public final /* synthetic */ b a;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.e6y
    public final int a() {
        b bVar = this.a;
        return (-bVar.g().n) + bVar.g().r;
    }

    @Override // defpackage.e6y
    public final Object b(int i, Continuation continuation) {
        tig0 tig0Var = b.w;
        b bVar = this.a;
        bVar.getClass();
        Object d = bVar.d(MutatePriority.Default, new LazyGridState$scrollToItem$2(bVar, i, 0, null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (d != coroutineSingletons) {
            d = zy11Var;
        }
        return d == coroutineSingletons ? d : zy11Var;
    }

    @Override // defpackage.e6y
    public final float c() {
        b bVar = this.a;
        return (bVar.d.a.getIntValue() * 500) + bVar.d.b.getIntValue();
    }

    @Override // defpackage.e6y
    public final float d() {
        b bVar = this.a;
        int intValue = bVar.d.a.getIntValue();
        int intValue2 = bVar.d.b.getIntValue();
        return bVar.b() ? (intValue * 500) + intValue2 + 100.0f : (intValue * 500) + intValue2;
    }

    @Override // defpackage.e6y
    public final hcc e() {
        return new hcc(-1, -1);
    }

    @Override // defpackage.e6y
    public final int f() {
        b bVar = this.a;
        return (int) (bVar.g().q == Orientation.Vertical ? bVar.g().e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : bVar.g().e() >> 32);
    }
}
