package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class hvx0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ t611 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ hvx0(t611 t611Var, tls tlsVar, int i) {
        this.a = i;
        this.b = t611Var;
        this.c = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o430 o430Var = did.a;
        final tls tlsVar = this.c;
        boolean z = false;
        final int i2 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    f530 o = an91.o(c530.a, 0.0f, 0.0f, 7.0f, 0.0f, 11);
                    final t611 t611Var = this.b;
                    boolean e = btsVar.e(t611Var) | btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    Object obj4 = Q;
                    if (e || Q == o430Var) {
                        final boolean z2 = z ? 1 : 0;
                        sls slsVar = new sls() { // from class: ivx0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i3 = z2;
                                zy11 zy11Var2 = zy11.a;
                                tls tlsVar2 = tlsVar;
                                t611 t611Var2 = t611Var;
                                switch (i3) {
                                    case 0:
                                        String str = t611Var2.e;
                                        if (str != null) {
                                            tlsVar2.invoke(new dvx0(str));
                                            break;
                                        }
                                        break;
                                    default:
                                        String str2 = t611Var2.e;
                                        if (str2 != null) {
                                            tlsVar2.invoke(str2);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var2;
                            }
                        };
                        btsVar.o0(slsVar);
                        obj4 = slsVar;
                    }
                    wkb1.a(t611Var, o, (sls) obj4, btsVar, 48, 0);
                    break;
                }
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    final t611 t611Var2 = this.b;
                    boolean e2 = btsVar2.e(t611Var2) | btsVar2.k(tlsVar);
                    Object Q2 = btsVar2.Q();
                    Object obj5 = Q2;
                    if (e2 || Q2 == o430Var) {
                        sls slsVar2 = new sls() { // from class: ivx0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i3 = i2;
                                zy11 zy11Var2 = zy11.a;
                                tls tlsVar2 = tlsVar;
                                t611 t611Var22 = t611Var2;
                                switch (i3) {
                                    case 0:
                                        String str = t611Var22.e;
                                        if (str != null) {
                                            tlsVar2.invoke(new dvx0(str));
                                            break;
                                        }
                                        break;
                                    default:
                                        String str2 = t611Var22.e;
                                        if (str2 != null) {
                                            tlsVar2.invoke(str2);
                                            break;
                                        }
                                        break;
                                }
                                return zy11Var2;
                            }
                        };
                        btsVar2.o0(slsVar2);
                        obj5 = slsVar2;
                    }
                    wkb1.a(t611Var2, null, (sls) obj5, btsVar2, 0, 2);
                    break;
                }
        }
        return zy11Var;
    }
}
