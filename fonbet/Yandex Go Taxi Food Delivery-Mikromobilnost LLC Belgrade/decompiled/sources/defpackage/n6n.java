package defpackage;

/* loaded from: classes5.dex */
public final class n6n extends a151 {
    public n6n() {
        super("dynamic-content-separator-key");
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1521991495);
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
            if (!(n351Var instanceof l6n)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: m6n
                        public final /* synthetic */ n6n b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            n6n n6nVar = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    n6nVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    n6nVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            dk91.a(0.0f, 0, 6, 0L, btsVar, an91.o(c530.a, 56.0f, ((l6n) n351Var).c, 16.0f, 0.0f, 8));
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: m6n
                public final /* synthetic */ n6n b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    n6n n6nVar = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            n6nVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            n6nVar.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
