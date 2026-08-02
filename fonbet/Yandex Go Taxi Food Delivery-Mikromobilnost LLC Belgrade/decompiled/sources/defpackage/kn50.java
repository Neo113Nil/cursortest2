package defpackage;

import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class kn50 implements gn50 {
    public final View a;
    public final sn50 b;
    public final int[] c;

    public kn50(View view) {
        this.a = view;
        sn50 sn50Var = new sn50(view);
        sn50Var.g(true);
        this.b = sn50Var;
        this.c = new int[2];
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.n(view, true);
    }

    @Override // defpackage.gn50
    /* renamed from: onPostFling-RZ2iAVY */
    public final Object mo28onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        sn50 sn50Var = this.b;
        if (sn50Var.f(0)) {
            sn50Var.i(0);
        }
        if (sn50Var.f(1)) {
            sn50Var.i(1);
        }
        return new k631(0L);
    }

    @Override // defpackage.gn50
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo29onPostScrollDzOQY0M(long j, long j2, int i) {
        if (!this.b.h(zrb1.b(j2), (i == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        f73.o(0, iArr);
        int d = zrb1.d(Float.intBitsToFloat((int) (j2 >> 32)));
        int d2 = zrb1.d(Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        int d3 = zrb1.d(Float.intBitsToFloat((int) (j >> 32)));
        int d4 = zrb1.d(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        int i2 = i == 1 ? 1 : 0;
        this.b.d(d3, d4, d, d2, null, i2 ^ 1, this.c);
        return zrb1.c(d, d2, j2, iArr);
    }

    @Override // defpackage.gn50
    /* renamed from: onPreFling-QWom1Mo */
    public final Object mo33onPreFlingQWom1Mo(long j, Continuation continuation) {
        float c = k631.c(j) * (-1.0f);
        float d = k631.d(j) * (-1.0f);
        sn50 sn50Var = this.b;
        if (!sn50Var.b(c, d) && !sn50Var.a(k631.c(j) * (-1.0f), k631.d(j) * (-1.0f), true)) {
            j = 0;
        }
        return new k631(j);
    }

    @Override // defpackage.gn50
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo34onPreScrollOzD1aCk(long j, int i) {
        if (!this.b.h(zrb1.b(j), (i == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        f73.o(0, iArr);
        int d = zrb1.d(Float.intBitsToFloat((int) (j >> 32)));
        int d2 = zrb1.d(Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j)));
        this.b.c(d, d2, this.c, null, (i == 1 ? 1 : 0) ^ 1);
        return zrb1.c(d, d2, j, iArr);
    }
}
