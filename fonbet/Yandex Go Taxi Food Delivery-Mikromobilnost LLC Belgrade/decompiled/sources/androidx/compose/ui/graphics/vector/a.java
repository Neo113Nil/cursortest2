package androidx.compose.ui.graphics.vector;

import android.graphics.Bitmap;
import androidx.compose.runtime.f;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.c36;
import defpackage.c531;
import defpackage.cjs0;
import defpackage.f4b1;
import defpackage.fwi;
import defpackage.i28;
import defpackage.ixv;
import defpackage.j28;
import defpackage.k28;
import defpackage.lam;
import defpackage.ldc;
import defpackage.oz40;
import defpackage.peb1;
import defpackage.qam;
import defpackage.qy21;
import defpackage.rzo;
import defpackage.s72;
import defpackage.sls;
import defpackage.tls;
import defpackage.u92;
import defpackage.wec;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class a extends qy21 {
    public final GroupComponent b;
    public String c;
    public boolean d;
    public final lam e;
    public sls f;
    public final oz40 g;
    public c36 h;
    public final oz40 i;
    public long j;
    public float k;
    public float l;
    public final tls m;

    public a(GroupComponent groupComponent) {
        this.b = groupComponent;
        groupComponent.i = new tls() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                a aVar = a.this;
                aVar.d = true;
                aVar.f.invoke();
                return zy11.a;
            }
        };
        this.c = "";
        this.d = true;
        this.e = new lam();
        this.f = VectorComponent$invalidateCallback$1.w;
        this.g = f.j(null);
        this.i = f.j(new cjs0(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new VectorComponent$drawVectorBlock$1(this);
    }

    @Override // defpackage.qy21
    public final void a(qam qamVar) {
        e(qamVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r3 != (r8 == null ? r8.a() : 0)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0114, code lost:
    
        if (r9.d == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(qam qamVar, float f, wec wecVar) {
        int i;
        boolean z;
        lam lamVar;
        c36 c36Var;
        u92 u92Var;
        char c;
        long j;
        wec wecVar2;
        u92 u92Var2;
        int i2;
        int i3;
        GroupComponent groupComponent = this.b;
        boolean z2 = groupComponent.d;
        oz40 oz40Var = this.g;
        if (z2 && groupComponent.e != 16) {
            wec wecVar3 = (wec) oz40Var.getValue();
            int i4 = c531.a;
            if (!(wecVar3 instanceof c36) ? wecVar3 == null : !((i3 = ((c36) wecVar3).c) != 5 && i3 != 3)) {
                if (!(wecVar instanceof c36) ? wecVar == null : !((i2 = ((c36) wecVar).c) != 5 && i2 != 3)) {
                    i = 1;
                    z = this.d;
                    lamVar = this.e;
                    if (!z && cjs0.a(this.j, qamVar.c())) {
                        u92 u92Var3 = lamVar.a;
                    }
                    if (i != 1) {
                        long j2 = groupComponent.e;
                        int i5 = c531.a;
                        if (ldc.d(j2) != 1.0f) {
                            j2 = ldc.b(j2, 1.0f, 0.0f, 0.0f, 0.0f, 14);
                        }
                        c36Var = new c36(j2, 5);
                    } else {
                        c36Var = null;
                    }
                    this.h = c36Var;
                    float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32));
                    oz40 oz40Var2 = this.i;
                    this.k = intBitsToFloat / Float.intBitsToFloat((int) (((cjs0) oz40Var2.getValue()).a >> 32));
                    this.l = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / Float.intBitsToFloat((int) (((cjs0) oz40Var2.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (qamVar.c() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    LayoutDirection layoutDirection = qamVar.getLayoutDirection();
                    u92Var = lamVar.a;
                    s72 s72Var = lamVar.b;
                    if (u92Var != null || s72Var == null) {
                        c = ' ';
                        j = 4294967295L;
                    } else {
                        int i6 = (int) (ceil >> 32);
                        Bitmap bitmap = u92Var.a;
                        c = ' ';
                        j = 4294967295L;
                        if (i6 <= bitmap.getWidth()) {
                            if (((int) (ceil & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) <= bitmap.getHeight()) {
                            }
                        }
                    }
                    u92Var = f4b1.b((int) (ceil >> c), (int) (ceil & j), i, 24);
                    s72Var = peb1.a(u92Var);
                    lamVar.a = u92Var;
                    lamVar.b = s72Var;
                    lamVar.d = i;
                    lamVar.c = ceil;
                    k28 k28Var = lamVar.e;
                    long a0 = rzo.a0(ceil);
                    j28 j28Var = k28Var.a;
                    fwi fwiVar = j28Var.a;
                    LayoutDirection layoutDirection2 = j28Var.b;
                    i28 i28Var = j28Var.c;
                    s72 s72Var2 = s72Var;
                    long j3 = j28Var.d;
                    j28Var.a = qamVar;
                    j28Var.b = layoutDirection;
                    j28Var.c = s72Var2;
                    j28Var.d = a0;
                    s72Var2.save();
                    qam.t0(k28Var, ldc.b, 0L, 0L, 0.0f, null, 62);
                    ((VectorComponent$drawVectorBlock$1) this.m).invoke(k28Var);
                    s72Var2.n();
                    j28 j28Var2 = k28Var.a;
                    j28Var2.a = fwiVar;
                    j28Var2.b = layoutDirection2;
                    j28Var2.c = i28Var;
                    j28Var2.d = j3;
                    u92Var.a.prepareToDraw();
                    this.d = false;
                    this.j = qamVar.c();
                    if (wecVar == null) {
                        wecVar2 = wecVar;
                    } else {
                        wecVar2 = ((wec) oz40Var.getValue()) != null ? (wec) oz40Var.getValue() : this.h;
                    }
                    u92Var2 = lamVar.a;
                    if (u92Var2 == null) {
                        ixv.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    qam.S(qamVar, u92Var2, lamVar.c, 0L, 0L, f, wecVar2, 0, 858);
                }
            }
        }
        i = 0;
        z = this.d;
        lamVar = this.e;
        if (!z) {
            u92 u92Var32 = lamVar.a;
        }
        if (i != 1) {
        }
        this.h = c36Var;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() >> 32));
        oz40 oz40Var22 = this.i;
        this.k = intBitsToFloat2 / Float.intBitsToFloat((int) (((cjs0) oz40Var22.getValue()).a >> 32));
        this.l = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / Float.intBitsToFloat((int) (((cjs0) oz40Var22.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (qamVar.c() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        LayoutDirection layoutDirection3 = qamVar.getLayoutDirection();
        u92Var = lamVar.a;
        s72 s72Var3 = lamVar.b;
        if (u92Var != null) {
        }
        c = ' ';
        j = 4294967295L;
        u92Var = f4b1.b((int) (ceil2 >> c), (int) (ceil2 & j), i, 24);
        s72Var3 = peb1.a(u92Var);
        lamVar.a = u92Var;
        lamVar.b = s72Var3;
        lamVar.d = i;
        lamVar.c = ceil2;
        k28 k28Var2 = lamVar.e;
        long a02 = rzo.a0(ceil2);
        j28 j28Var3 = k28Var2.a;
        fwi fwiVar2 = j28Var3.a;
        LayoutDirection layoutDirection22 = j28Var3.b;
        i28 i28Var2 = j28Var3.c;
        s72 s72Var22 = s72Var3;
        long j32 = j28Var3.d;
        j28Var3.a = qamVar;
        j28Var3.b = layoutDirection3;
        j28Var3.c = s72Var22;
        j28Var3.d = a02;
        s72Var22.save();
        qam.t0(k28Var2, ldc.b, 0L, 0L, 0.0f, null, 62);
        ((VectorComponent$drawVectorBlock$1) this.m).invoke(k28Var2);
        s72Var22.n();
        j28 j28Var22 = k28Var2.a;
        j28Var22.a = fwiVar2;
        j28Var22.b = layoutDirection22;
        j28Var22.c = i28Var2;
        j28Var22.d = j32;
        u92Var.a.prepareToDraw();
        this.d = false;
        this.j = qamVar.c();
        if (wecVar == null) {
        }
        u92Var2 = lamVar.a;
        if (u92Var2 == null) {
        }
        qam.S(qamVar, u92Var2, lamVar.c, 0L, 0L, f, wecVar2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        oz40 oz40Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((cjs0) oz40Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((cjs0) oz40Var.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        sb.append("\n");
        return sb.toString();
    }
}
