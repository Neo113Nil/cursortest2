package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.contact.c;

/* loaded from: classes5.dex */
public final class g71 extends o15 {
    public final /* synthetic */ int b;
    public final p070 c;
    public final a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(p070 p070Var, a aVar, int i) {
        super("carousel-items");
        this.b = i;
        switch (i) {
            case 3:
                super("contact");
                this.c = p070Var;
                this.d = aVar;
                break;
            case 4:
            case 5:
            case 6:
            case 10:
            case 13:
            case 16:
            default:
                this.c = p070Var;
                this.d = aVar;
                break;
            case 7:
                super("multi-address");
                this.c = p070Var;
                this.d = aVar;
                break;
            case 8:
                super("notification");
                this.c = p070Var;
                this.d = aVar;
                break;
            case 9:
                super("payment-method");
                this.c = p070Var;
                this.d = aVar;
                break;
            case 11:
                super("scrollable-items");
                this.c = p070Var;
                this.d = aVar;
                break;
            case 12:
                super("segment");
                this.c = p070Var;
                this.d = aVar;
                break;
            case 14:
                super("tabs");
                this.c = p070Var;
                this.d = aVar;
                break;
            case 15:
                super("tag-line");
                this.c = p070Var;
                this.d = aVar;
                break;
            case 17:
                super("picker");
                this.c = p070Var;
                this.d = aVar;
                break;
        }
    }

    private final void f(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1270898363);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof e6x0)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: i6x0
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            oip0 o = pw91.o(btsVar);
            c530 c530Var = c530.a;
            f530 l = pw91.l(c530Var, o, 14);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, l);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o2);
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d2);
            g6x0 g6x0Var = ((e6x0) n351Var).d;
            f530 m = an91.m(c530Var, 8.0f, 0.0f, 2);
            boolean e = btsVar.e(this);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new tls(this) { // from class: j6x0
                    public final /* synthetic */ g71 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        g71 g71Var = this.b;
                        switch (i5) {
                            case 0:
                                g71Var.c.a((x2s) obj);
                                break;
                            default:
                                g71Var.d.a((b151) obj);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            boolean e2 = btsVar.e(this);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new tls(this) { // from class: j6x0
                    public final /* synthetic */ g71 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        g71 g71Var = this.b;
                        switch (i5) {
                            case 0:
                                g71Var.c.a((x2s) obj);
                                break;
                            default:
                                g71Var.d.a((b151) obj);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q2);
            }
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.p(g6x0Var, m, 0L, 56.0f, tlsVar, (tls) Q2, btsVar, 384);
            btsVar.t(true);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: i6x0
                public final /* synthetic */ g71 b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    g71 g71Var = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            g71Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            g71Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    private final void g(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1879132786);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(this) ? 32 : 16;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (!(n351Var instanceof muy0)) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: guy0
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i3;
                            zy11 zy11Var = zy11.a;
                            int i6 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            muy0 muy0Var = (muy0) n351Var;
            boolean e = btsVar.e(this);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new tls(this) { // from class: huy0
                    public final /* synthetic */ g71 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        g71 g71Var = this.b;
                        switch (i5) {
                            case 0:
                                g71Var.c.a((x2s) obj);
                                break;
                            default:
                                g71Var.d.a((b151) obj);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            boolean e2 = btsVar.e(this);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new tls(this) { // from class: huy0
                    public final /* synthetic */ g71 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        g71 g71Var = this.b;
                        switch (i5) {
                            case 0:
                                g71Var.c.a((x2s) obj);
                                break;
                            default:
                                g71Var.d.a((b151) obj);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q2);
            }
            ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text.a.a(muy0Var, tlsVar, (tls) Q2, btsVar, i2 & 14);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(this) { // from class: guy0
                public final /* synthetic */ g71 b;

                {
                    this.b = this;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    int i6 = i;
                    n351 n351Var2 = n351Var;
                    g71 g71Var = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            g71Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                        default:
                            g71Var.e(n351Var2, fidVar2, vng.O(i6 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    @Override // defpackage.o15
    public final void e(final n351 n351Var, fid fidVar, final int i) {
        int i2;
        aii0 v;
        wls wlsVar;
        int i3;
        aii0 v2;
        wls wlsVar2;
        int i4;
        aii0 v3;
        wls wlsVar3;
        int i5;
        aii0 v4;
        wls wlsVar4;
        int i6;
        aii0 v5;
        wls wlsVar5;
        int i7;
        aii0 v6;
        wls wlsVar6;
        f530 f530Var;
        int i8;
        aii0 v7;
        wls wlsVar7;
        int i9;
        aii0 v8;
        wls wlsVar8;
        int i10;
        aii0 v9;
        wls wlsVar9;
        int i11;
        aii0 v10;
        wls wlsVar10;
        int i12;
        aii0 v11;
        wls wlsVar11;
        int i13;
        aii0 v12;
        wls wlsVar12;
        int i14;
        aii0 v13;
        wls wlsVar13;
        int i15;
        aii0 v14;
        wls wlsVar14;
        int i16;
        aii0 v15;
        wls wlsVar15;
        int i17;
        bts btsVar;
        aii0 v16;
        wls wlsVar16;
        int i18 = this.b;
        o430 o430Var = did.a;
        final int i19 = 2;
        final int i20 = 0;
        final int i21 = 1;
        switch (i18) {
            case 0:
                bts btsVar2 = (bts) fidVar;
                btsVar2.g0(1733768013);
                if ((i & 6) == 0) {
                    i2 = (btsVar2.k(n351Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= btsVar2.e(this) ? 32 : 16;
                }
                if (!btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
                    btsVar2.Y();
                } else {
                    if (!(n351Var instanceof x61)) {
                        v = btsVar2.v();
                        if (v != null) {
                            wlsVar = new wls(this) { // from class: e71
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v.d = wlsVar;
                            return;
                        }
                        return;
                    }
                    x61 x61Var = (x61) n351Var;
                    boolean e = btsVar2.e(this);
                    Object Q = btsVar2.Q();
                    if (e || Q == o430Var) {
                        Q = new tls(this) { // from class: f71
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar2.o0(Q);
                    }
                    tls tlsVar = (tls) Q;
                    boolean e2 = btsVar2.e(this);
                    Object Q2 = btsVar2.Q();
                    if (e2 || Q2 == o430Var) {
                        Q2 = new tls(this) { // from class: f71
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar2.o0(Q2);
                    }
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.address_selector.a.a(x61Var, tlsVar, (tls) Q2, btsVar2, i2 & 14);
                }
                v = btsVar2.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: e71
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                    return;
                }
                return;
            case 1:
                bts btsVar3 = (bts) fidVar;
                btsVar3.g0(-197100924);
                if ((i & 6) == 0) {
                    i3 = (btsVar3.k(n351Var) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= btsVar3.e(this) ? 32 : 16;
                }
                if (btsVar3.V(i3 & 1, (i3 & 19) != 18)) {
                    if (n351Var instanceof ry8) {
                        ry8 ry8Var = (ry8) n351Var;
                        if (ry8Var.c.isEmpty()) {
                            v2 = btsVar3.v();
                            if (v2 == null) {
                                return;
                            } else {
                                wlsVar2 = new wls(this) { // from class: ty8
                                    public final /* synthetic */ g71 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj, Object obj2) {
                                        int i22 = i21;
                                        zy11 zy11Var = zy11.a;
                                        int i23 = i;
                                        n351 n351Var2 = n351Var;
                                        g71 g71Var = this.b;
                                        fid fidVar2 = (fid) obj;
                                        ((Integer) obj2).getClass();
                                        switch (i22) {
                                            case 0:
                                                g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                                break;
                                            case 1:
                                                g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                                break;
                                            default:
                                                g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                                break;
                                        }
                                        return zy11Var;
                                    }
                                };
                            }
                        } else {
                            boolean e3 = btsVar3.e(this);
                            Object Q3 = btsVar3.Q();
                            if (e3 || Q3 == o430Var) {
                                Q3 = new tls(this) { // from class: uy8
                                    public final /* synthetic */ g71 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        int i22 = i20;
                                        zy11 zy11Var = zy11.a;
                                        g71 g71Var = this.b;
                                        switch (i22) {
                                            case 0:
                                                g71Var.d.a((b151) obj);
                                                break;
                                            default:
                                                g71Var.c.a((x2s) obj);
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
                                Q4 = new tls(this) { // from class: uy8
                                    public final /* synthetic */ g71 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj) {
                                        int i22 = i21;
                                        zy11 zy11Var = zy11.a;
                                        g71 g71Var = this.b;
                                        switch (i22) {
                                            case 0:
                                                g71Var.d.a((b151) obj);
                                                break;
                                            default:
                                                g71Var.c.a((x2s) obj);
                                                break;
                                        }
                                        return zy11Var;
                                    }
                                };
                                btsVar3.o0(Q4);
                            }
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items.b.f(ry8Var, tlsVar2, (tls) Q4, btsVar3, i3 & 14);
                        }
                    } else {
                        v2 = btsVar3.v();
                        if (v2 == null) {
                            return;
                        } else {
                            wlsVar2 = new wls(this) { // from class: ty8
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        case 1:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                        }
                    }
                    v2.d = wlsVar2;
                    return;
                }
                btsVar3.Y();
                v2 = btsVar3.v();
                if (v2 != null) {
                    wlsVar2 = new wls(this) { // from class: ty8
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i19;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                case 1:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v2.d = wlsVar2;
                    return;
                }
                return;
            case 2:
                bts btsVar4 = (bts) fidVar;
                btsVar4.g0(806735893);
                if ((i & 6) == 0) {
                    i4 = (btsVar4.k(n351Var) ? 4 : 2) | i;
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= btsVar4.e(this) ? 32 : 16;
                }
                if (!btsVar4.V(i4 & 1, (i4 & 19) != 18)) {
                    btsVar4.Y();
                } else {
                    if (!(n351Var instanceof y09)) {
                        v3 = btsVar4.v();
                        if (v3 != null) {
                            wlsVar3 = new wls(this) { // from class: w09
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v3.d = wlsVar3;
                            return;
                        }
                        return;
                    }
                    y09 y09Var = (y09) n351Var;
                    boolean e5 = btsVar4.e(this);
                    Object Q5 = btsVar4.Q();
                    if (e5 || Q5 == o430Var) {
                        Q5 = new tls(this) { // from class: x09
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.d.a((b151) obj);
                                        break;
                                    default:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar4.o0(Q5);
                    }
                    tls tlsVar3 = (tls) Q5;
                    boolean e6 = btsVar4.e(this);
                    Object Q6 = btsVar4.Q();
                    if (e6 || Q6 == o430Var) {
                        Q6 = new tls(this) { // from class: x09
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.d.a((b151) obj);
                                        break;
                                    default:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar4.o0(Q6);
                    }
                    ngb1.a(y09Var, tlsVar3, (tls) Q6, btsVar4, i4 & 14);
                }
                v3 = btsVar4.v();
                if (v3 != null) {
                    wlsVar3 = new wls(this) { // from class: w09
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v3.d = wlsVar3;
                    return;
                }
                return;
            case 3:
                bts btsVar5 = (bts) fidVar;
                btsVar5.g0(513417193);
                if ((i & 6) == 0) {
                    i5 = (btsVar5.k(n351Var) ? 4 : 2) | i;
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= btsVar5.e(this) ? 32 : 16;
                }
                if (!btsVar5.V(i5 & 1, (i5 & 19) != 18)) {
                    btsVar5.Y();
                } else {
                    if (!(n351Var instanceof oae)) {
                        v4 = btsVar5.v();
                        if (v4 != null) {
                            wlsVar4 = new wls(this) { // from class: ube
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v4.d = wlsVar4;
                            return;
                        }
                        return;
                    }
                    oae oaeVar = (oae) n351Var;
                    boolean e7 = btsVar5.e(this);
                    Object Q7 = btsVar5.Q();
                    if (e7 || Q7 == o430Var) {
                        Q7 = new tls(this) { // from class: vbe
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar5.o0(Q7);
                    }
                    tls tlsVar4 = (tls) Q7;
                    boolean e8 = btsVar5.e(this);
                    Object Q8 = btsVar5.Q();
                    if (e8 || Q8 == o430Var) {
                        Q8 = new tls(this) { // from class: vbe
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar5.o0(Q8);
                    }
                    c.b(oaeVar, tlsVar4, (tls) Q8, btsVar5, i5 & 14);
                }
                v4 = btsVar5.v();
                if (v4 != null) {
                    wlsVar4 = new wls(this) { // from class: ube
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v4.d = wlsVar4;
                    return;
                }
                return;
            case 4:
                bts btsVar6 = (bts) fidVar;
                btsVar6.g0(-984196654);
                if ((i & 6) == 0) {
                    i6 = (btsVar6.k(n351Var) ? 4 : 2) | i;
                } else {
                    i6 = i;
                }
                if ((i & 48) == 0) {
                    i6 |= btsVar6.e(this) ? 32 : 16;
                }
                if (!btsVar6.V(i6 & 1, (i6 & 19) != 18)) {
                    btsVar6.Y();
                } else {
                    if (!(n351Var instanceof qoj)) {
                        v5 = btsVar6.v();
                        if (v5 != null) {
                            wlsVar5 = new wls(this) { // from class: voj
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v5.d = wlsVar5;
                            return;
                        }
                        return;
                    }
                    qoj qojVar = (qoj) n351Var;
                    boolean e9 = btsVar6.e(this);
                    Object Q9 = btsVar6.Q();
                    if (e9 || Q9 == o430Var) {
                        Q9 = new tls(this) { // from class: woj
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.d.a((b151) obj);
                                        break;
                                    default:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar6.o0(Q9);
                    }
                    tls tlsVar5 = (tls) Q9;
                    boolean e10 = btsVar6.e(this);
                    Object Q10 = btsVar6.Q();
                    if (e10 || Q10 == o430Var) {
                        Q10 = new tls(this) { // from class: woj
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.d.a((b151) obj);
                                        break;
                                    default:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar6.o0(Q10);
                    }
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.discount.a.a(qojVar, tlsVar5, (tls) Q10, btsVar6, i6 & 14);
                }
                v5 = btsVar6.v();
                if (v5 != null) {
                    wlsVar5 = new wls(this) { // from class: voj
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v5.d = wlsVar5;
                    return;
                }
                return;
            case 5:
                bts btsVar7 = (bts) fidVar;
                btsVar7.g0(1883234896);
                if ((i & 6) == 0) {
                    i7 = (btsVar7.k(n351Var) ? 4 : 2) | i;
                } else {
                    i7 = i;
                }
                if ((i & 48) == 0) {
                    i7 |= btsVar7.e(this) ? 32 : 16;
                }
                if (!btsVar7.V(i7 & 1, (i7 & 19) != 18)) {
                    btsVar7.Y();
                } else {
                    if (!(n351Var instanceof mxq)) {
                        v6 = btsVar7.v();
                        if (v6 != null) {
                            wlsVar6 = new wls(this) { // from class: oxq
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v6.d = wlsVar6;
                            return;
                        }
                        return;
                    }
                    mxq mxqVar = (mxq) n351Var;
                    pus0 pus0Var = mxqVar.k;
                    ldc ldcVar = pus0Var.a;
                    c530 c530Var = c530.a;
                    if (ldcVar == null || (f530Var = m4m0.b(c530Var, ldcVar.a, cyk0.c(pus0Var.b))) == null) {
                        f530Var = c530Var;
                    }
                    f530 k = an91.m(c530Var, pus0Var.c, 0.0f, 2).k(f530Var);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar7.T);
                    r1b0 o = btsVar7.o();
                    f530 d2 = b.d(btsVar7, k);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, d);
                    qje.W(btsVar7, d.e, o);
                    wls wlsVar17 = d.g;
                    if (btsVar7.S || !jl40.l(btsVar7.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar7, hashCode, wlsVar17);
                    }
                    qje.W(btsVar7, d.d, d2);
                    boolean e11 = btsVar7.e(this);
                    Object Q11 = btsVar7.Q();
                    if (e11 || Q11 == o430Var) {
                        Q11 = new tls(this) { // from class: pxq
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar7.o0(Q11);
                    }
                    tls tlsVar6 = (tls) Q11;
                    boolean e12 = btsVar7.e(this);
                    Object Q12 = btsVar7.Q();
                    if (e12 || Q12 == o430Var) {
                        Q12 = new tls(this) { // from class: pxq
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar7.o0(Q12);
                    }
                    ula1.c(mxqVar, tlsVar6, (tls) Q12, btsVar7, i7 & 14);
                    btsVar7.t(true);
                }
                v6 = btsVar7.v();
                if (v6 != null) {
                    wlsVar6 = new wls(this) { // from class: oxq
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v6.d = wlsVar6;
                    return;
                }
                return;
            case 6:
                bts btsVar8 = (bts) fidVar;
                btsVar8.g0(121615258);
                if ((i & 6) == 0) {
                    i8 = (btsVar8.k(n351Var) ? 4 : 2) | i;
                } else {
                    i8 = i;
                }
                if ((i & 48) == 0) {
                    i8 |= btsVar8.e(this) ? 32 : 16;
                }
                if (!btsVar8.V(i8 & 1, (i8 & 19) != 18)) {
                    btsVar8.Y();
                } else {
                    if (!(n351Var instanceof xau)) {
                        v7 = btsVar8.v();
                        if (v7 != null) {
                            wlsVar7 = new wls(this) { // from class: geu
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v7.d = wlsVar7;
                            return;
                        }
                        return;
                    }
                    xau xauVar = (xau) n351Var;
                    boolean e13 = btsVar8.e(this);
                    Object Q13 = btsVar8.Q();
                    if (e13 || Q13 == o430Var) {
                        Q13 = new tls(this) { // from class: heu
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar8.o0(Q13);
                    }
                    tls tlsVar7 = (tls) Q13;
                    boolean e14 = btsVar8.e(this);
                    Object Q14 = btsVar8.Q();
                    if (e14 || Q14 == o430Var) {
                        Q14 = new tls(this) { // from class: heu
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar8.o0(Q14);
                    }
                    l0b1.b(xauVar, tlsVar7, (tls) Q14, btsVar8, i8 & 14);
                }
                v7 = btsVar8.v();
                if (v7 != null) {
                    wlsVar7 = new wls(this) { // from class: geu
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v7.d = wlsVar7;
                    return;
                }
                return;
            case 7:
                bts btsVar9 = (bts) fidVar;
                btsVar9.g0(-675249569);
                if ((i & 6) == 0) {
                    i9 = (btsVar9.k(n351Var) ? 4 : 2) | i;
                } else {
                    i9 = i;
                }
                if ((i & 48) == 0) {
                    i9 |= btsVar9.e(this) ? 32 : 16;
                }
                if (!btsVar9.V(i9 & 1, (i9 & 19) != 18)) {
                    btsVar9.Y();
                } else {
                    if (!(n351Var instanceof xk40)) {
                        v8 = btsVar9.v();
                        if (v8 != null) {
                            wlsVar8 = new wls(this) { // from class: zk40
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v8.d = wlsVar8;
                            return;
                        }
                        return;
                    }
                    xk40 xk40Var = (xk40) n351Var;
                    boolean e15 = btsVar9.e(this);
                    Object Q15 = btsVar9.Q();
                    if (e15 || Q15 == o430Var) {
                        Q15 = new tls(this) { // from class: al40
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar9.o0(Q15);
                    }
                    tls tlsVar8 = (tls) Q15;
                    boolean e16 = btsVar9.e(this);
                    Object Q16 = btsVar9.Q();
                    if (e16 || Q16 == o430Var) {
                        Q16 = new tls(this) { // from class: al40
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar9.o0(Q16);
                    }
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address.a.a(xk40Var, tlsVar8, (tls) Q16, btsVar9, i9 & 14);
                }
                v8 = btsVar9.v();
                if (v8 != null) {
                    wlsVar8 = new wls(this) { // from class: zk40
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v8.d = wlsVar8;
                    return;
                }
                return;
            case 8:
                bts btsVar10 = (bts) fidVar;
                btsVar10.g0(-1483423724);
                if ((i & 6) == 0) {
                    i10 = (btsVar10.k(n351Var) ? 4 : 2) | i;
                } else {
                    i10 = i;
                }
                if ((i & 48) == 0) {
                    i10 |= btsVar10.e(this) ? 32 : 16;
                }
                if (!btsVar10.V(i10 & 1, (i10 & 19) != 18)) {
                    btsVar10.Y();
                } else {
                    if (!(n351Var instanceof sk60)) {
                        v9 = btsVar10.v();
                        if (v9 != null) {
                            wlsVar9 = new wls(this) { // from class: qk60
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v9.d = wlsVar9;
                            return;
                        }
                        return;
                    }
                    sk60 sk60Var = (sk60) n351Var;
                    boolean e17 = btsVar10.e(this);
                    Object Q17 = btsVar10.Q();
                    if (e17 || Q17 == o430Var) {
                        Q17 = new tls(this) { // from class: rk60
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar10.o0(Q17);
                    }
                    tls tlsVar9 = (tls) Q17;
                    boolean e18 = btsVar10.e(this);
                    Object Q18 = btsVar10.Q();
                    if (e18 || Q18 == o430Var) {
                        Q18 = new tls(this) { // from class: rk60
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar10.o0(Q18);
                    }
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.notification.a.a(sk60Var, tlsVar9, (tls) Q18, btsVar10, i10 & 14);
                }
                v9 = btsVar10.v();
                if (v9 != null) {
                    wlsVar9 = new wls(this) { // from class: qk60
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v9.d = wlsVar9;
                    return;
                }
                return;
            case 9:
                bts btsVar11 = (bts) fidVar;
                btsVar11.g0(1419251007);
                if ((i & 6) == 0) {
                    i11 = (btsVar11.k(n351Var) ? 4 : 2) | i;
                } else {
                    i11 = i;
                }
                if ((i & 48) == 0) {
                    i11 |= btsVar11.e(this) ? 32 : 16;
                }
                if (!btsVar11.V(i11 & 1, (i11 & 19) != 18)) {
                    btsVar11.Y();
                } else {
                    if (!(n351Var instanceof h6a0)) {
                        v10 = btsVar11.v();
                        if (v10 != null) {
                            wlsVar10 = new wls(this) { // from class: q8a0
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v10.d = wlsVar10;
                            return;
                        }
                        return;
                    }
                    h6a0 h6a0Var = (h6a0) n351Var;
                    boolean e19 = btsVar11.e(this);
                    Object Q19 = btsVar11.Q();
                    if (e19 || Q19 == o430Var) {
                        Q19 = new tls(this) { // from class: r8a0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar11.o0(Q19);
                    }
                    tls tlsVar10 = (tls) Q19;
                    boolean e20 = btsVar11.e(this);
                    Object Q20 = btsVar11.Q();
                    if (e20 || Q20 == o430Var) {
                        Q20 = new tls(this) { // from class: r8a0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar11.o0(Q20);
                    }
                    ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_method.a.a(h6a0Var, tlsVar10, (tls) Q20, btsVar11, i11 & 14);
                }
                v10 = btsVar11.v();
                if (v10 != null) {
                    wlsVar10 = new wls(this) { // from class: q8a0
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v10.d = wlsVar10;
                    return;
                }
                return;
            case 10:
                bts btsVar12 = (bts) fidVar;
                btsVar12.g0(110716575);
                if ((i & 6) == 0) {
                    i12 = (btsVar12.k(n351Var) ? 4 : 2) | i;
                } else {
                    i12 = i;
                }
                if ((i & 48) == 0) {
                    i12 |= btsVar12.e(this) ? 32 : 16;
                }
                if (!btsVar12.V(i12 & 1, (i12 & 19) != 18)) {
                    btsVar12.Y();
                } else {
                    if (!(n351Var instanceof vmm0)) {
                        v11 = btsVar12.v();
                        if (v11 != null) {
                            wlsVar11 = new wls(this) { // from class: anm0
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v11.d = wlsVar11;
                            return;
                        }
                        return;
                    }
                    vmm0 vmm0Var = (vmm0) n351Var;
                    boolean e21 = btsVar12.e(this);
                    Object Q21 = btsVar12.Q();
                    if (e21 || Q21 == o430Var) {
                        Q21 = new tls(this) { // from class: bnm0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.d.a((b151) obj);
                                        break;
                                    default:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar12.o0(Q21);
                    }
                    tls tlsVar11 = (tls) Q21;
                    boolean e22 = btsVar12.e(this);
                    Object Q22 = btsVar12.Q();
                    if (e22 || Q22 == o430Var) {
                        Q22 = new tls(this) { // from class: bnm0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.d.a((b151) obj);
                                        break;
                                    default:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar12.o0(Q22);
                    }
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scenario_selector.a.b(vmm0Var, tlsVar11, (tls) Q22, btsVar12, i12 & 14);
                }
                v11 = btsVar12.v();
                if (v11 != null) {
                    wlsVar11 = new wls(this) { // from class: anm0
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v11.d = wlsVar11;
                    return;
                }
                return;
            case 11:
                bts btsVar13 = (bts) fidVar;
                btsVar13.g0(-914956309);
                if ((i & 6) == 0) {
                    i13 = (btsVar13.k(n351Var) ? 4 : 2) | i;
                } else {
                    i13 = i;
                }
                if ((i & 48) == 0) {
                    i13 |= btsVar13.e(this) ? 32 : 16;
                }
                if (!btsVar13.V(i13 & 1, (i13 & 19) != 18)) {
                    btsVar13.Y();
                } else {
                    if (!(n351Var instanceof ckp0)) {
                        v12 = btsVar13.v();
                        if (v12 != null) {
                            wlsVar12 = new wls(this) { // from class: ekp0
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v12.d = wlsVar12;
                            return;
                        }
                        return;
                    }
                    ckp0 ckp0Var = (ckp0) n351Var;
                    boolean e23 = btsVar13.e(this);
                    Object Q23 = btsVar13.Q();
                    if (e23 || Q23 == o430Var) {
                        Q23 = new tls(this) { // from class: fkp0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.d.a((b151) obj);
                                        break;
                                    default:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar13.o0(Q23);
                    }
                    tls tlsVar12 = (tls) Q23;
                    boolean e24 = btsVar13.e(this);
                    Object Q24 = btsVar13.Q();
                    if (e24 || Q24 == o430Var) {
                        Q24 = new tls(this) { // from class: fkp0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.d.a((b151) obj);
                                        break;
                                    default:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar13.o0(Q24);
                    }
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items.a.f(ckp0Var, tlsVar12, (tls) Q24, btsVar13, i13 & 14);
                }
                v12 = btsVar13.v();
                if (v12 != null) {
                    wlsVar12 = new wls(this) { // from class: ekp0
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v12.d = wlsVar12;
                    return;
                }
                return;
            case 12:
                bts btsVar14 = (bts) fidVar;
                btsVar14.g0(-653178220);
                if ((i & 6) == 0) {
                    i14 = (btsVar14.k(n351Var) ? 4 : 2) | i;
                } else {
                    i14 = i;
                }
                if ((i & 48) == 0) {
                    i14 |= btsVar14.e(this) ? 32 : 16;
                }
                if (!btsVar14.V(i14 & 1, (i14 & 19) != 18)) {
                    btsVar14.Y();
                } else {
                    if (!(n351Var instanceof n8q0)) {
                        v13 = btsVar14.v();
                        if (v13 != null) {
                            wlsVar13 = new wls(this) { // from class: t8q0
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v13.d = wlsVar13;
                            return;
                        }
                        return;
                    }
                    n8q0 n8q0Var = (n8q0) n351Var;
                    boolean e25 = btsVar14.e(this);
                    Object Q25 = btsVar14.Q();
                    if (e25 || Q25 == o430Var) {
                        Q25 = new tls(this) { // from class: u8q0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar14.o0(Q25);
                    }
                    tls tlsVar13 = (tls) Q25;
                    boolean e26 = btsVar14.e(this);
                    Object Q26 = btsVar14.Q();
                    if (e26 || Q26 == o430Var) {
                        Q26 = new tls(this) { // from class: u8q0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar14.o0(Q26);
                    }
                    c7b1.a(n8q0Var, tlsVar13, (tls) Q26, btsVar14, i14 & 14);
                }
                v13 = btsVar14.v();
                if (v13 != null) {
                    wlsVar13 = new wls(this) { // from class: t8q0
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v13.d = wlsVar13;
                    return;
                }
                return;
            case 13:
                bts btsVar15 = (bts) fidVar;
                btsVar15.g0(143686328);
                if ((i & 6) == 0) {
                    i15 = (btsVar15.k(n351Var) ? 4 : 2) | i;
                } else {
                    i15 = i;
                }
                if ((i & 48) == 0) {
                    i15 |= btsVar15.e(this) ? 32 : 16;
                }
                if (!btsVar15.V(i15 & 1, (i15 & 19) != 18)) {
                    btsVar15.Y();
                } else {
                    if (!(n351Var instanceof rlq0)) {
                        v14 = btsVar15.v();
                        if (v14 != null) {
                            wlsVar14 = new wls(this) { // from class: umq0
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v14.d = wlsVar14;
                            return;
                        }
                        return;
                    }
                    rlq0 rlq0Var = (rlq0) n351Var;
                    boolean e27 = btsVar15.e(this);
                    Object Q27 = btsVar15.Q();
                    if (e27 || Q27 == o430Var) {
                        Q27 = new tls(this) { // from class: vmq0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar15.o0(Q27);
                    }
                    tls tlsVar14 = (tls) Q27;
                    boolean e28 = btsVar15.e(this);
                    Object Q28 = btsVar15.Q();
                    if (e28 || Q28 == o430Var) {
                        Q28 = new tls(this) { // from class: vmq0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar15.o0(Q28);
                    }
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.selector.a.c(rlq0Var, tlsVar14, (tls) Q28, btsVar15, i15 & 14);
                }
                v14 = btsVar15.v();
                if (v14 != null) {
                    wlsVar14 = new wls(this) { // from class: umq0
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v14.d = wlsVar14;
                    return;
                }
                return;
            case 14:
                f(n351Var, fidVar, i);
                return;
            case 15:
                bts btsVar16 = (bts) fidVar;
                btsVar16.g0(-474394980);
                if ((i & 6) == 0) {
                    i16 = (btsVar16.k(n351Var) ? 4 : 2) | i;
                } else {
                    i16 = i;
                }
                if ((i & 48) == 0) {
                    i16 |= btsVar16.e(this) ? 32 : 16;
                }
                if (!btsVar16.V(i16 & 1, (i16 & 19) != 18)) {
                    btsVar16.Y();
                } else {
                    if (!(n351Var instanceof x6x0)) {
                        v15 = btsVar16.v();
                        if (v15 != null) {
                            wlsVar15 = new wls(this) { // from class: d7x0
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v15.d = wlsVar15;
                            return;
                        }
                        return;
                    }
                    x6x0 x6x0Var = (x6x0) n351Var;
                    boolean e29 = btsVar16.e(this);
                    Object Q29 = btsVar16.Q();
                    if (e29 || Q29 == o430Var) {
                        Q29 = new tls(this) { // from class: e7x0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.d.a((b151) obj);
                                        break;
                                    default:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar16.o0(Q29);
                    }
                    tls tlsVar15 = (tls) Q29;
                    boolean e30 = btsVar16.e(this);
                    Object Q30 = btsVar16.Q();
                    if (e30 || Q30 == o430Var) {
                        Q30 = new tls(this) { // from class: e7x0
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.d.a((b151) obj);
                                        break;
                                    default:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar16.o0(Q30);
                    }
                    lkb1.d(x6x0Var, tlsVar15, (tls) Q30, btsVar16, i16 & 14);
                }
                v15 = btsVar16.v();
                if (v15 != null) {
                    wlsVar15 = new wls(this) { // from class: d7x0
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v15.d = wlsVar15;
                    return;
                }
                return;
            case 16:
                g(n351Var, fidVar, i);
                return;
            default:
                bts btsVar17 = (bts) fidVar;
                btsVar17.g0(-941611851);
                if ((i & 6) == 0) {
                    i17 = (btsVar17.k(n351Var) ? 4 : 2) | i;
                } else {
                    i17 = i;
                }
                if ((i & 48) == 0) {
                    i17 |= btsVar17.e(this) ? 32 : 16;
                }
                if (!btsVar17.V(i17 & 1, (i17 & 19) != 18)) {
                    btsVar = btsVar17;
                    btsVar.Y();
                } else {
                    if (!(n351Var instanceof by41)) {
                        v16 = btsVar17.v();
                        if (v16 != null) {
                            wlsVar16 = new wls(this) { // from class: gy41
                                public final /* synthetic */ g71 b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj, Object obj2) {
                                    int i22 = i20;
                                    zy11 zy11Var = zy11.a;
                                    int i23 = i;
                                    n351 n351Var2 = n351Var;
                                    g71 g71Var = this.b;
                                    fid fidVar2 = (fid) obj;
                                    ((Integer) obj2).getClass();
                                    switch (i22) {
                                        case 0:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                        default:
                                            g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v16.d = wlsVar16;
                            return;
                        }
                        return;
                    }
                    by41 by41Var = (by41) n351Var;
                    boolean e31 = btsVar17.e(this);
                    Object Q31 = btsVar17.Q();
                    if (e31 || Q31 == o430Var) {
                        Q31 = new tls(this) { // from class: hy41
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i20;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar17.o0(Q31);
                    }
                    tls tlsVar16 = (tls) Q31;
                    boolean e32 = btsVar17.e(this);
                    Object Q32 = btsVar17.Q();
                    if (e32 || Q32 == o430Var) {
                        Q32 = new tls(this) { // from class: hy41
                            public final /* synthetic */ g71 b;

                            {
                                this.b = this;
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                int i22 = i21;
                                zy11 zy11Var = zy11.a;
                                g71 g71Var = this.b;
                                switch (i22) {
                                    case 0:
                                        g71Var.c.a((x2s) obj);
                                        break;
                                    default:
                                        g71Var.d.a((b151) obj);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar17.o0(Q32);
                    }
                    btsVar = btsVar17;
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.wheel_picker.a.a(by41Var, tlsVar16, (tls) Q32, null, btsVar, i17 & 14);
                }
                v16 = btsVar.v();
                if (v16 != null) {
                    wlsVar16 = new wls(this) { // from class: gy41
                        public final /* synthetic */ g71 b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = i21;
                            zy11 zy11Var = zy11.a;
                            int i23 = i;
                            n351 n351Var2 = n351Var;
                            g71 g71Var = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i22) {
                                case 0:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                                default:
                                    g71Var.e(n351Var2, fidVar2, vng.O(i23 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v16.d = wlsVar16;
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g71(a aVar, p070 p070Var, int i) {
        super("address-selector-item");
        this.b = i;
        switch (i) {
            case 2:
                super("cart");
                this.d = aVar;
                this.c = p070Var;
                break;
            case 4:
                super("discount");
                this.d = aVar;
                this.c = p070Var;
                break;
            case 5:
                super("field-display");
                this.d = aVar;
                this.c = p070Var;
                break;
            case 6:
                super("header");
                this.d = aVar;
                this.c = p070Var;
                break;
            case 10:
                super("scenario-selector");
                this.d = aVar;
                this.c = p070Var;
                break;
            case 13:
                super("selector");
                this.d = aVar;
                this.c = p070Var;
                break;
            case 16:
                super("text");
                this.d = aVar;
                this.c = p070Var;
                break;
            default:
                this.d = aVar;
                this.c = p070Var;
                break;
        }
    }
}
