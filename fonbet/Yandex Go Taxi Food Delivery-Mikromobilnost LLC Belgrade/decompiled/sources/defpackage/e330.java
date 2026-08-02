package defpackage;

/* loaded from: classes5.dex */
public final class e330 extends a151 {
    public e330() {
        super("modal-view-skeleton");
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-346812146);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        final int i3 = 1;
        final int i4 = 0;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof c330)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: d330
                        public final /* synthetic */ e330 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            e330 e330Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    e330Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    e330Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            c330 c330Var = (c330) n351Var;
            xnb1.c(c330Var.c, c330Var.d, btsVar, 0);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: d330
                public final /* synthetic */ e330 b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    e330 e330Var = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            e330Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            e330Var.a(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }
}
