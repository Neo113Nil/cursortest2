package defpackage;

/* loaded from: classes5.dex */
public final class aye extends o15 {
    public aye() {
        super("cost-detail");
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(614255050);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof xxe)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: zxe
                        public final /* synthetic */ aye b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            aye ayeVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    ayeVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    ayeVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            lsb1.a((xxe) n351Var, btsVar, i2 & 14);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: zxe
                public final /* synthetic */ aye b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    aye ayeVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            ayeVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            ayeVar.e(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
