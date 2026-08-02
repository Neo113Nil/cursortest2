package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a;

/* loaded from: classes5.dex */
public final class lw0 extends o15 {
    public final /* synthetic */ int b = 1;
    public final a c;
    public final p070 d;
    public final Object e;

    public lw0(hwo0 hwo0Var, a aVar, p070 p070Var) {
        super("text-input");
        this.e = hwo0Var;
        this.c = aVar;
        this.d = p070Var;
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        aii0 v;
        wls wlsVar;
        int i3;
        bts btsVar2;
        aii0 v2;
        wls wlsVar2;
        int i4 = this.b;
        o430 o430Var = did.a;
        final int i5 = 1;
        final int i6 = 0;
        switch (i4) {
            case 0:
                bts btsVar3 = (bts) fidVar;
                btsVar3.g0(-135361415);
                if ((i & 6) == 0) {
                    i2 = (btsVar3.k(n351Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= btsVar3.e(this) ? 32 : 16;
                }
                if (!btsVar3.V(i2 & 1, (i2 & 19) != 18)) {
                    btsVar = btsVar3;
                    btsVar.Y();
                } else if (!(n351Var instanceof hw0)) {
                    v = btsVar3.v();
                    if (v != null) {
                        wlsVar = new wls(this) { // from class: jw0
                            public final /* synthetic */ lw0 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i7 = i6;
                                zy11 zy11Var = zy11.a;
                                int i8 = i;
                                n351 n351Var2 = n351Var;
                                lw0 lw0Var = this.b;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).getClass();
                                switch (i7) {
                                    case 0:
                                        lw0Var.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                        break;
                                    default:
                                        lw0Var.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        v.d = wlsVar;
                        break;
                    }
                } else {
                    hw0 hw0Var = (hw0) n351Var;
                    boolean e = btsVar3.e(this);
                    Object Q = btsVar3.Q();
                    if (e || Q == o430Var) {
                        Q = new tn1(8, this);
                        btsVar3.o0(Q);
                    }
                    wls wlsVar3 = (wls) Q;
                    boolean e2 = btsVar3.e(this);
                    Object Q2 = btsVar3.Q();
                    if (e2 || Q2 == o430Var) {
                        Q2 = new tls(this) { // from class: kw0
                            public final /* synthetic */ lw0 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i7 = i6;
                                zy11 zy11Var = zy11.a;
                                lw0 lw0Var = this.b;
                                switch (i7) {
                                    case 0:
                                        lw0Var.c.a((b151) obj);
                                        break;
                                    case 1:
                                        lw0Var.c.a((b151) obj);
                                        break;
                                    default:
                                        lw0Var.d.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar3.o0(Q2);
                    }
                    tls tlsVar = (tls) Q2;
                    boolean e3 = btsVar3.e(this);
                    Object Q3 = btsVar3.Q();
                    if (e3 || Q3 == o430Var) {
                        Q3 = new tls(this) { // from class: kw0
                            public final /* synthetic */ lw0 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i7 = i5;
                                zy11 zy11Var = zy11.a;
                                lw0 lw0Var = this.b;
                                switch (i7) {
                                    case 0:
                                        lw0Var.c.a((b151) obj);
                                        break;
                                    case 1:
                                        lw0Var.c.a((b151) obj);
                                        break;
                                    default:
                                        lw0Var.d.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar3.o0(Q3);
                    }
                    tls tlsVar2 = (tls) Q3;
                    boolean e4 = btsVar3.e(this);
                    Object Q4 = btsVar3.Q();
                    if (e4 || Q4 == o430Var) {
                        Q4 = new tls(this) { // from class: kw0
                            public final /* synthetic */ lw0 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i7 = r2;
                                zy11 zy11Var = zy11.a;
                                lw0 lw0Var = this.b;
                                switch (i7) {
                                    case 0:
                                        lw0Var.c.a((b151) obj);
                                        break;
                                    case 1:
                                        lw0Var.c.a((b151) obj);
                                        break;
                                    default:
                                        lw0Var.d.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar3.o0(Q4);
                    }
                    btsVar = btsVar3;
                    coa1.a(hw0Var, null, wlsVar3, tlsVar, tlsVar2, (tls) Q4, btsVar, i2 & 14);
                }
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: jw0
                        public final /* synthetic */ lw0 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i5;
                            zy11 zy11Var = zy11.a;
                            int i8 = i;
                            n351 n351Var2 = n351Var;
                            lw0 lw0Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    lw0Var.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                    break;
                                default:
                                    lw0Var.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                break;
            default:
                bts btsVar4 = (bts) fidVar;
                btsVar4.g0(-88355781);
                if ((i & 6) == 0) {
                    i3 = (btsVar4.k(n351Var) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= btsVar4.e(this) ? 32 : 16;
                }
                if (!btsVar4.V(i3 & 1, (i3 & 19) != 18)) {
                    btsVar2 = btsVar4;
                    btsVar2.Y();
                } else if (!(n351Var instanceof jpy0)) {
                    v2 = btsVar4.v();
                    if (v2 != null) {
                        wlsVar2 = new wls(this) { // from class: eqy0
                            public final /* synthetic */ lw0 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                int i7 = i6;
                                zy11 zy11Var = zy11.a;
                                int i8 = i;
                                n351 n351Var2 = n351Var;
                                lw0 lw0Var = this.b;
                                fid fidVar2 = (fid) obj;
                                ((Integer) obj2).getClass();
                                switch (i7) {
                                    case 0:
                                        lw0Var.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                        break;
                                    default:
                                        lw0Var.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        v2.d = wlsVar2;
                        break;
                    }
                } else {
                    jpy0 jpy0Var = (jpy0) n351Var;
                    int i7 = i3 & 14;
                    boolean e5 = btsVar4.e(this) | (i7 == 4);
                    Object Q5 = btsVar4.Q();
                    if (e5 || Q5 == o430Var) {
                        Q5 = new hex0(10, this, n351Var);
                        btsVar4.o0(Q5);
                    }
                    wls wlsVar4 = (wls) Q5;
                    boolean e6 = btsVar4.e(this);
                    Object Q6 = btsVar4.Q();
                    if (e6 || Q6 == o430Var) {
                        Q6 = new tls(this) { // from class: fqy0
                            public final /* synthetic */ lw0 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i8 = i6;
                                zy11 zy11Var = zy11.a;
                                lw0 lw0Var = this.b;
                                switch (i8) {
                                    case 0:
                                        lw0Var.c.a((b151) obj);
                                        break;
                                    default:
                                        lw0Var.d.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar4.o0(Q6);
                    }
                    tls tlsVar3 = (tls) Q6;
                    boolean e7 = btsVar4.e(this);
                    Object Q7 = btsVar4.Q();
                    if (e7 || Q7 == o430Var) {
                        Q7 = new tls(this) { // from class: fqy0
                            public final /* synthetic */ lw0 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i8 = i5;
                                zy11 zy11Var = zy11.a;
                                lw0 lw0Var = this.b;
                                switch (i8) {
                                    case 0:
                                        lw0Var.c.a((b151) obj);
                                        break;
                                    default:
                                        lw0Var.d.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar4.o0(Q7);
                    }
                    btsVar2 = btsVar4;
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.a.b(jpy0Var, wlsVar4, tlsVar3, (tls) Q7, btsVar2, i7);
                }
                v2 = btsVar2.v();
                if (v2 != null) {
                    wlsVar2 = new wls(this) { // from class: eqy0
                        public final /* synthetic */ lw0 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i72 = i5;
                            zy11 zy11Var = zy11.a;
                            int i8 = i;
                            n351 n351Var2 = n351Var;
                            lw0 lw0Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i72) {
                                case 0:
                                    lw0Var.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                    break;
                                default:
                                    lw0Var.e(n351Var2, fidVar2, vng.O(i8 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v2.d = wlsVar2;
                }
                break;
        }
    }

    public lw0(a aVar, p070 p070Var, h0w h0wVar) {
        super("address-input-field");
        this.c = aVar;
        this.d = p070Var;
        this.e = h0wVar;
    }
}
