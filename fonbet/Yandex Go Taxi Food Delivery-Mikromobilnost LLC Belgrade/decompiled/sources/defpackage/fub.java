package defpackage;

import androidx.compose.runtime.internal.a;
import defpackage.a151;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cbu;
import defpackage.cma1;
import defpackage.did;
import defpackage.eqb1;
import defpackage.f530;
import defpackage.f6n;
import defpackage.fid;
import defpackage.fub;
import defpackage.gau;
import defpackage.gxd0;
import defpackage.jfe0;
import defpackage.jl40;
import defpackage.jtq;
import defpackage.k0a1;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.mcz0;
import defpackage.n351;
import defpackage.nt90;
import defpackage.o430;
import defpackage.o5n;
import defpackage.ohd;
import defpackage.ptb;
import defpackage.pv4;
import defpackage.pxd0;
import defpackage.qic;
import defpackage.qje;
import defpackage.qt90;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tls;
import defpackage.w9z0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.ztb;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.e;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.f;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll.c;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.rover.d;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.timeline.b;

/* loaded from: classes5.dex */
public final class fub extends a151 {
    public final /* synthetic */ int b = 2;
    public final Object c;
    public final Object d;

    public fub(d dVar, dci dciVar) {
        super("rover-key");
        this.d = dVar;
        this.c = dciVar;
    }

    @Override // defpackage.a151
    public final void a(final n351 n351Var, fid fidVar, final int i) {
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
        int i8;
        aii0 v7;
        wls wlsVar7;
        int i9;
        aii0 v8;
        wls wlsVar8;
        long j;
        int i10;
        aii0 v9;
        wls wlsVar9;
        int i11;
        aii0 v10;
        wls wlsVar10;
        int i12 = this.b;
        Object obj = this.c;
        final int i13 = 0;
        final int i14 = 1;
        switch (i12) {
            case 0:
                bts btsVar = (bts) fidVar;
                btsVar.g0(-1512872187);
                if ((i & 6) == 0) {
                    i2 = (btsVar.k(n351Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= btsVar.e(this) ? 32 : 16;
                }
                if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
                    btsVar.Y();
                } else {
                    if (!(n351Var instanceof ztb)) {
                        v = btsVar.v();
                        if (v != null) {
                            wlsVar = new wls(this) { // from class: eub
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    int i16 = i;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i15) {
                                        case 0:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                        default:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                    sb2.b(ua3.a.a((dci) obj), wwg.S(811019205, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.circle_buttons.d
                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                ztb ztbVar = (ztb) n351.this;
                                Object Q = btsVar2.Q();
                                fub fubVar = this;
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    CircleButtonsWidget$Content$2$1$1 circleButtonsWidget$Content$2$1$1 = new CircleButtonsWidget$Content$2$1$1(1, (ptb) fubVar.d, ptb.class, "onClick", "onClick(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/circle_buttons/CircleButtonModel$Payload;)V", 0);
                                    btsVar2.o0(circleButtonsWidget$Content$2$1$1);
                                    Q = circleButtonsWidget$Content$2$1$1;
                                }
                                tls tlsVar = (tls) ((tfx) Q);
                                Object Q2 = btsVar2.Q();
                                if (Q2 == o430Var) {
                                    CircleButtonsWidget$Content$2$2$1 circleButtonsWidget$Content$2$2$1 = new CircleButtonsWidget$Content$2$2$1(1, (ptb) fubVar.d, ptb.class, "onShown", "onShown(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/circle_buttons/CircleButtonModel$Payload;)V", 0);
                                    btsVar2.o0(circleButtonsWidget$Content$2$2$1);
                                    Q2 = circleButtonsWidget$Content$2$2$1;
                                }
                                c.d(ztbVar, tlsVar, (tls) ((tfx) Q2), btsVar2, 432);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar), btsVar, 56);
                }
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(this) { // from class: eub
                        public final /* synthetic */ fub b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            int i16 = i;
                            n351 n351Var2 = n351Var;
                            fub fubVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                                default:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                bts btsVar2 = (bts) fidVar;
                btsVar2.g0(-1611143933);
                if ((i & 6) == 0) {
                    i3 = (btsVar2.k(n351Var) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= btsVar2.e(this) ? 32 : 16;
                }
                if (!btsVar2.V(i3 & 1, (i3 & 19) != 18)) {
                    btsVar2.Y();
                } else {
                    if (!(n351Var instanceof o5n)) {
                        v2 = btsVar2.v();
                        if (v2 != null) {
                            wlsVar2 = new wls(this) { // from class: p5n
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    int i16 = i;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i15) {
                                        case 0:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                        default:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            v2.d = wlsVar2;
                            return;
                        }
                        return;
                    }
                    sb2.b(ua3.a.a((dci) obj), wwg.S(1373252035, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.b
                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i13;
                            zy11 zy11Var = zy11.a;
                            o430 o430Var = did.a;
                            a151 a151Var = this;
                            n351 n351Var2 = n351Var;
                            fub fubVar = (fub) a151Var;
                            switch (i15) {
                                case 0:
                                    fid fidVar2 = (fid) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    bts btsVar3 = (bts) fidVar2;
                                    if (!btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        o5n o5nVar = (o5n) n351Var2;
                                        f530 o = an91.o(c530.a, 0.0f, o5nVar.i, 0.0f, 0.0f, 13);
                                        Object Q = btsVar3.Q();
                                        if (Q == o430Var) {
                                            DynamicContentBarcodeWidget$Content$2$1$1 dynamicContentBarcodeWidget$Content$2$1$1 = new DynamicContentBarcodeWidget$Content$2$1$1(1, (pv4) fubVar.d, pv4.class, "onBarcodeClick", "onBarcodeClick(Lcom/yandex/delivery/mapper/model/state/Payload;)V", 0);
                                            btsVar3.o0(dynamicContentBarcodeWidget$Content$2$1$1);
                                            Q = dynamicContentBarcodeWidget$Content$2$1$1;
                                        }
                                        tls tlsVar = (tls) ((tfx) Q);
                                        Object Q2 = btsVar3.Q();
                                        if (Q2 == o430Var) {
                                            DynamicContentBarcodeWidget$Content$2$2$1 dynamicContentBarcodeWidget$Content$2$2$1 = new DynamicContentBarcodeWidget$Content$2$2$1(1, (pv4) fubVar.d, pv4.class, "onBarcodeShow", "onBarcodeShow(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/dynamic_content/model/DynamicContentBarcodeModel;)V", 0);
                                            btsVar3.o0(dynamicContentBarcodeWidget$Content$2$2$1);
                                            Q2 = dynamicContentBarcodeWidget$Content$2$2$1;
                                        }
                                        tls tlsVar2 = (tls) ((tfx) Q2);
                                        Object Q3 = btsVar3.Q();
                                        if (Q3 == o430Var) {
                                            DynamicContentBarcodeWidget$Content$2$3$1 dynamicContentBarcodeWidget$Content$2$3$1 = new DynamicContentBarcodeWidget$Content$2$3$1(1, (pv4) fubVar.d, pv4.class, "onBarcodeHide", "onBarcodeHide(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/dynamic_content/model/DynamicContentBarcodeModel;)V", 0);
                                            btsVar3.o0(dynamicContentBarcodeWidget$Content$2$3$1);
                                            Q3 = dynamicContentBarcodeWidget$Content$2$3$1;
                                        }
                                        k0a1.b(o5nVar, o, tlsVar, tlsVar2, (tls) ((tfx) Q3), btsVar3, 28032);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    bts btsVar4 = (bts) fidVar3;
                                    if (!btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        f6n f6nVar = (f6n) n351Var2;
                                        Object Q4 = btsVar4.Q();
                                        if (Q4 == o430Var) {
                                            DynamicContentPostcardWidget$Content$2$1$1 dynamicContentPostcardWidget$Content$2$1$1 = new DynamicContentPostcardWidget$Content$2$1$1(0, (jfe0) fubVar.d, jfe0.class, "onPostcardClick", "onPostcardClick()V", 0);
                                            btsVar4.o0(dynamicContentPostcardWidget$Content$2$1$1);
                                            Q4 = dynamicContentPostcardWidget$Content$2$1$1;
                                        }
                                        sls slsVar = (sls) ((tfx) Q4);
                                        Object Q5 = btsVar4.Q();
                                        if (Q5 == o430Var) {
                                            DynamicContentPostcardWidget$Content$2$2$1 dynamicContentPostcardWidget$Content$2$2$1 = new DynamicContentPostcardWidget$Content$2$2$1(0, (jfe0) fubVar.d, jfe0.class, "onPostcardShown", "onPostcardShown()V", 0);
                                            btsVar4.o0(dynamicContentPostcardWidget$Content$2$2$1);
                                            Q5 = dynamicContentPostcardWidget$Content$2$2$1;
                                        }
                                        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.ui.b.a(f6nVar, null, slsVar, (sls) ((tfx) Q5), btsVar4, 3456);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar2), btsVar2, 56);
                }
                v2 = btsVar2.v();
                if (v2 != null) {
                    wlsVar2 = new wls(this) { // from class: p5n
                        public final /* synthetic */ fub b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            int i16 = i;
                            n351 n351Var2 = n351Var;
                            fub fubVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                                default:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                bts btsVar3 = (bts) fidVar;
                btsVar3.g0(582105973);
                if ((i & 6) == 0) {
                    i4 = (btsVar3.k(n351Var) ? 4 : 2) | i;
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= btsVar3.e(this) ? 32 : 16;
                }
                if (!btsVar3.V(i4 & 1, (i4 & 19) != 18)) {
                    btsVar3.Y();
                } else {
                    if (!(n351Var instanceof f6n)) {
                        v3 = btsVar3.v();
                        if (v3 != null) {
                            wlsVar3 = new wls(this) { // from class: g6n
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    int i16 = i;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i15) {
                                        case 0:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                        default:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                    sb2.b(ua3.a.a((dci) obj), wwg.S(-451522507, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.b
                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            o430 o430Var = did.a;
                            a151 a151Var = this;
                            n351 n351Var2 = n351Var;
                            fub fubVar = (fub) a151Var;
                            switch (i15) {
                                case 0:
                                    fid fidVar2 = (fid) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    bts btsVar32 = (bts) fidVar2;
                                    if (!btsVar32.V(intValue & 1, (intValue & 3) != 2)) {
                                        btsVar32.Y();
                                        break;
                                    } else {
                                        o5n o5nVar = (o5n) n351Var2;
                                        f530 o = an91.o(c530.a, 0.0f, o5nVar.i, 0.0f, 0.0f, 13);
                                        Object Q = btsVar32.Q();
                                        if (Q == o430Var) {
                                            DynamicContentBarcodeWidget$Content$2$1$1 dynamicContentBarcodeWidget$Content$2$1$1 = new DynamicContentBarcodeWidget$Content$2$1$1(1, (pv4) fubVar.d, pv4.class, "onBarcodeClick", "onBarcodeClick(Lcom/yandex/delivery/mapper/model/state/Payload;)V", 0);
                                            btsVar32.o0(dynamicContentBarcodeWidget$Content$2$1$1);
                                            Q = dynamicContentBarcodeWidget$Content$2$1$1;
                                        }
                                        tls tlsVar = (tls) ((tfx) Q);
                                        Object Q2 = btsVar32.Q();
                                        if (Q2 == o430Var) {
                                            DynamicContentBarcodeWidget$Content$2$2$1 dynamicContentBarcodeWidget$Content$2$2$1 = new DynamicContentBarcodeWidget$Content$2$2$1(1, (pv4) fubVar.d, pv4.class, "onBarcodeShow", "onBarcodeShow(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/dynamic_content/model/DynamicContentBarcodeModel;)V", 0);
                                            btsVar32.o0(dynamicContentBarcodeWidget$Content$2$2$1);
                                            Q2 = dynamicContentBarcodeWidget$Content$2$2$1;
                                        }
                                        tls tlsVar2 = (tls) ((tfx) Q2);
                                        Object Q3 = btsVar32.Q();
                                        if (Q3 == o430Var) {
                                            DynamicContentBarcodeWidget$Content$2$3$1 dynamicContentBarcodeWidget$Content$2$3$1 = new DynamicContentBarcodeWidget$Content$2$3$1(1, (pv4) fubVar.d, pv4.class, "onBarcodeHide", "onBarcodeHide(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/dynamic_content/model/DynamicContentBarcodeModel;)V", 0);
                                            btsVar32.o0(dynamicContentBarcodeWidget$Content$2$3$1);
                                            Q3 = dynamicContentBarcodeWidget$Content$2$3$1;
                                        }
                                        k0a1.b(o5nVar, o, tlsVar, tlsVar2, (tls) ((tfx) Q3), btsVar32, 28032);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    bts btsVar4 = (bts) fidVar3;
                                    if (!btsVar4.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        f6n f6nVar = (f6n) n351Var2;
                                        Object Q4 = btsVar4.Q();
                                        if (Q4 == o430Var) {
                                            DynamicContentPostcardWidget$Content$2$1$1 dynamicContentPostcardWidget$Content$2$1$1 = new DynamicContentPostcardWidget$Content$2$1$1(0, (jfe0) fubVar.d, jfe0.class, "onPostcardClick", "onPostcardClick()V", 0);
                                            btsVar4.o0(dynamicContentPostcardWidget$Content$2$1$1);
                                            Q4 = dynamicContentPostcardWidget$Content$2$1$1;
                                        }
                                        sls slsVar = (sls) ((tfx) Q4);
                                        Object Q5 = btsVar4.Q();
                                        if (Q5 == o430Var) {
                                            DynamicContentPostcardWidget$Content$2$2$1 dynamicContentPostcardWidget$Content$2$2$1 = new DynamicContentPostcardWidget$Content$2$2$1(0, (jfe0) fubVar.d, jfe0.class, "onPostcardShown", "onPostcardShown()V", 0);
                                            btsVar4.o0(dynamicContentPostcardWidget$Content$2$2$1);
                                            Q5 = dynamicContentPostcardWidget$Content$2$2$1;
                                        }
                                        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.ui.b.a(f6nVar, null, slsVar, (sls) ((tfx) Q5), btsVar4, 3456);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar3), btsVar3, 56);
                }
                v3 = btsVar3.v();
                if (v3 != null) {
                    wlsVar3 = new wls(this) { // from class: g6n
                        public final /* synthetic */ fub b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            int i16 = i;
                            n351 n351Var2 = n351Var;
                            fub fubVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                                default:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                bts btsVar4 = (bts) fidVar;
                btsVar4.g0(1524663146);
                if ((i & 6) == 0) {
                    i5 = (btsVar4.k(n351Var) ? 4 : 2) | i;
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= btsVar4.e(this) ? 32 : 16;
                }
                if (!btsVar4.V(i5 & 1, (i5 & 19) != 18)) {
                    btsVar4.Y();
                } else {
                    if (!(n351Var instanceof jtq)) {
                        v4 = btsVar4.v();
                        if (v4 != null) {
                            wlsVar4 = new wls(this) { // from class: tvq
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    int i16 = i;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i15) {
                                        case 0:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                        default:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                    sb2.b(ua3.a.a((dci) obj), wwg.S(822462506, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.f
                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar5 = (bts) fidVar2;
                            if (btsVar5.V(intValue & 1, (intValue & 3) != 2)) {
                                jtq jtqVar = (jtq) n351.this;
                                Object Q = btsVar5.Q();
                                fub fubVar = this;
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    FeedbackWidget$Content$2$1$1 feedbackWidget$Content$2$1$1 = new FeedbackWidget$Content$2$1$1(1, (e) fubVar.d, e.class, "onRatingClicked", "onRatingClicked(I)V", 0);
                                    btsVar5.o0(feedbackWidget$Content$2$1$1);
                                    Q = feedbackWidget$Content$2$1$1;
                                }
                                tls tlsVar = (tls) ((tfx) Q);
                                Object Q2 = btsVar5.Q();
                                if (Q2 == o430Var) {
                                    FeedbackWidget$Content$2$2$1 feedbackWidget$Content$2$2$1 = new FeedbackWidget$Content$2$2$1(1, (e) fubVar.d, e.class, "onReasonClicked", "onReasonClicked(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/feedback/FeedbackReasonModel;)V", 0);
                                    btsVar5.o0(feedbackWidget$Content$2$2$1);
                                    Q2 = feedbackWidget$Content$2$2$1;
                                }
                                tls tlsVar2 = (tls) ((tfx) Q2);
                                Object Q3 = btsVar5.Q();
                                if (Q3 == o430Var) {
                                    FeedbackWidget$Content$2$3$1 feedbackWidget$Content$2$3$1 = new FeedbackWidget$Content$2$3$1(1, (e) fubVar.d, e.class, "onTipClicked", "onTipClicked(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/feedback/TipModel;)V", 0);
                                    btsVar5.o0(feedbackWidget$Content$2$3$1);
                                    Q3 = feedbackWidget$Content$2$3$1;
                                }
                                tls tlsVar3 = (tls) ((tfx) Q3);
                                Object Q4 = btsVar5.Q();
                                if (Q4 == o430Var) {
                                    FeedbackWidget$Content$2$4$1 feedbackWidget$Content$2$4$1 = new FeedbackWidget$Content$2$4$1(0, (e) fubVar.d, e.class, "onTipsShown", "onTipsShown()V", 0);
                                    btsVar5.o0(feedbackWidget$Content$2$4$1);
                                    Q4 = feedbackWidget$Content$2$4$1;
                                }
                                a.a(jtqVar, tlsVar, tlsVar2, tlsVar3, (sls) ((tfx) Q4), btsVar5, 28080);
                            } else {
                                btsVar5.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar4), btsVar4, 56);
                }
                v4 = btsVar4.v();
                if (v4 != null) {
                    wlsVar4 = new wls(this) { // from class: tvq
                        public final /* synthetic */ fub b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            int i16 = i;
                            n351 n351Var2 = n351Var;
                            fub fubVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                                default:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                bts btsVar5 = (bts) fidVar;
                btsVar5.g0(880543202);
                if ((i & 6) == 0) {
                    i6 = (btsVar5.k(n351Var) ? 4 : 2) | i;
                } else {
                    i6 = i;
                }
                if ((i & 48) == 0) {
                    i6 |= btsVar5.e(this) ? 32 : 16;
                }
                if (!btsVar5.V(i6 & 1, (i6 & 19) != 18)) {
                    btsVar5.Y();
                } else {
                    if (!(n351Var instanceof cbu)) {
                        v5 = btsVar5.v();
                        if (v5 != null) {
                            wlsVar5 = new wls(this) { // from class: feu
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    int i16 = i;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i15) {
                                        case 0:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                        default:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                    sb2.b(ua3.a.a((dci) obj), wwg.S(-836511070, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.g
                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar6 = (bts) fidVar2;
                            if (btsVar6.V(intValue & 1, (intValue & 3) != 2)) {
                                Object Q = btsVar6.Q();
                                fub fubVar = this;
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    HeaderWidget$Content$2$action$1$1 headerWidget$Content$2$action$1$1 = new HeaderWidget$Content$2$action$1$1(0, (f) fubVar.d, f.class, "onClick", "onClick()V", 0);
                                    btsVar6.o0(headerWidget$Content$2$action$1$1);
                                    Q = headerWidget$Content$2$action$1$1;
                                }
                                sls slsVar = (sls) ((tfx) Q);
                                Object Q2 = btsVar6.Q();
                                if (Q2 == o430Var) {
                                    Q2 = new gau(5, fubVar);
                                    btsVar6.o0(Q2);
                                }
                                a.a((cbu) n351.this, slsVar, (tls) Q2, btsVar6, 432);
                            } else {
                                btsVar6.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar5), btsVar5, 56);
                }
                v5 = btsVar5.v();
                if (v5 != null) {
                    wlsVar5 = new wls(this) { // from class: feu
                        public final /* synthetic */ fub b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            int i16 = i;
                            n351 n351Var2 = n351Var;
                            fub fubVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                                default:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                bts btsVar6 = (bts) fidVar;
                btsVar6.g0(-1085602696);
                if ((i & 6) == 0) {
                    i7 = (btsVar6.k(n351Var) ? 4 : 2) | i;
                } else {
                    i7 = i;
                }
                if ((i & 48) == 0) {
                    i7 |= btsVar6.e(this) ? 32 : 16;
                }
                if (!btsVar6.V(i7 & 1, (i7 & 19) != 18)) {
                    btsVar6.Y();
                } else {
                    if (!(n351Var instanceof nt90)) {
                        v6 = btsVar6.v();
                        if (v6 != null) {
                            wlsVar6 = new wls(this) { // from class: pt90
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    int i16 = i;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i15) {
                                        case 0:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                        default:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                    sb2.b(ua3.a.a((dci) obj), wwg.S(1520289720, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.pay_now.b
                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar7 = (bts) fidVar2;
                            if (btsVar7.V(intValue & 1, (intValue & 3) != 2)) {
                                nt90 nt90Var = (nt90) n351.this;
                                Object Q = btsVar7.Q();
                                fub fubVar = this;
                                o430 o430Var = did.a;
                                if (Q == o430Var) {
                                    PayNowWidget$Content$2$1$1 payNowWidget$Content$2$1$1 = new PayNowWidget$Content$2$1$1(1, (qt90) fubVar.d, qt90.class, "onPaymentItemClick", "onPaymentItemClick(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/pay_now/PaymentClickPayload;)V", 0);
                                    btsVar7.o0(payNowWidget$Content$2$1$1);
                                    Q = payNowWidget$Content$2$1$1;
                                }
                                tls tlsVar = (tls) ((tfx) Q);
                                Object Q2 = btsVar7.Q();
                                if (Q2 == o430Var) {
                                    PayNowWidget$Content$2$2$1 payNowWidget$Content$2$2$1 = new PayNowWidget$Content$2$2$1(1, (qt90) fubVar.d, qt90.class, "onButtonClick", "onButtonClick(Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/pay_now/ButtonClickPayload;)V", 0);
                                    btsVar7.o0(payNowWidget$Content$2$2$1);
                                    Q2 = payNowWidget$Content$2$2$1;
                                }
                                tls tlsVar2 = (tls) ((tfx) Q2);
                                Object Q3 = btsVar7.Q();
                                if (Q3 == o430Var) {
                                    PayNowWidget$Content$2$3$1 payNowWidget$Content$2$3$1 = new PayNowWidget$Content$2$3$1(1, (qt90) fubVar.d, qt90.class, "onButtonShown", "onButtonShown(Ljava/util/Map;)V", 0);
                                    btsVar7.o0(payNowWidget$Content$2$3$1);
                                    Q3 = payNowWidget$Content$2$3$1;
                                }
                                a.c(nt90Var, tlsVar, tlsVar2, (tls) ((tfx) Q3), btsVar7, 3504);
                            } else {
                                btsVar7.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar6), btsVar6, 56);
                }
                v6 = btsVar6.v();
                if (v6 != null) {
                    wlsVar6 = new wls(this) { // from class: pt90
                        public final /* synthetic */ fub b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            int i16 = i;
                            n351 n351Var2 = n351Var;
                            fub fubVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                                default:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                bts btsVar7 = (bts) fidVar;
                btsVar7.g0(1293523760);
                if ((i & 6) == 0) {
                    i8 = (btsVar7.k(n351Var) ? 4 : 2) | i;
                } else {
                    i8 = i;
                }
                if ((i & 48) == 0) {
                    i8 |= btsVar7.e(this) ? 32 : 16;
                }
                if (!btsVar7.V(i8 & 1, (i8 & 19) != 18)) {
                    btsVar7.Y();
                } else {
                    if (!(n351Var instanceof pxd0)) {
                        v7 = btsVar7.v();
                        if (v7 != null) {
                            wlsVar7 = new wls(this) { // from class: hyd0
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    int i16 = i;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i15) {
                                        case 0:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                        default:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                    sb2.b(ua3.a.a((dci) obj), wwg.S(-479199248, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.poll.d
                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar8 = (bts) fidVar2;
                            if (btsVar8.V(intValue & 1, (intValue & 3) != 2)) {
                                pxd0 pxd0Var = (pxd0) n351.this;
                                Object Q = btsVar8.Q();
                                if (Q == did.a) {
                                    PollWidget$Content$2$1$1 pollWidget$Content$2$1$1 = new PollWidget$Content$2$1$1(2, (c) this.d, c.class, "onAnswerClick", "onAnswerClick(Ljava/lang/String;Ljava/lang/String;)V", 0);
                                    btsVar8.o0(pollWidget$Content$2$1$1);
                                    Q = pollWidget$Content$2$1$1;
                                }
                                gxd0.e(pxd0Var, (wls) ((tfx) Q), btsVar8, 48);
                            } else {
                                btsVar8.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar7), btsVar7, 56);
                }
                v7 = btsVar7.v();
                if (v7 != null) {
                    wlsVar7 = new wls(this) { // from class: hyd0
                        public final /* synthetic */ fub b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            int i16 = i;
                            n351 n351Var2 = n351Var;
                            fub fubVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                                default:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                bts btsVar8 = (bts) fidVar;
                btsVar8.g0(-1956954643);
                if ((i & 6) == 0) {
                    i9 = i | (btsVar8.k(n351Var) ? 4 : 2);
                } else {
                    i9 = i;
                }
                if ((i & 48) == 0) {
                    i9 |= btsVar8.e(this) ? 32 : 16;
                }
                if (!btsVar8.V(i9 & 1, (i9 & 19) != 18)) {
                    btsVar8.Y();
                } else {
                    if (!(n351Var instanceof udf0)) {
                        v8 = btsVar8.v();
                        if (v8 != null) {
                            wlsVar8 = new wls(this) { // from class: mdf0
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    int i16 = i;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i15) {
                                        case 0:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                        default:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                    udf0 udf0Var = (udf0) n351Var;
                    boolean z = udf0Var instanceof fmo;
                    c530 c530Var = c530.a;
                    o430 o430Var = did.a;
                    if (z) {
                        btsVar8.e0(250488139);
                        f530 o = an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10);
                        fmo fmoVar = (fmo) n351Var;
                        String str = fmoVar.c;
                        emo emoVar = fmoVar.d;
                        String str2 = emoVar != null ? emoVar.a : null;
                        ldc ldcVar = emoVar != null ? emoVar.b : null;
                        if (ldcVar == null) {
                            btsVar8.e0(562279478);
                            j = ((el51) btsVar8.m(gl51.a)).o();
                            btsVar8.t(false);
                        } else {
                            btsVar8.e0(562277277);
                            btsVar8.t(false);
                            j = ldcVar.a;
                        }
                        long j2 = j;
                        boolean z2 = fmoVar.g;
                        boolean z3 = fmoVar.h;
                        a S = wwg.S(-1799048625, true, new qq0(n351Var, 5), btsVar8);
                        boolean e = ((i9 & 14) == 4) | btsVar8.e(this);
                        Object Q = btsVar8.Q();
                        if (e || Q == o430Var) {
                            Q = new sls(this) { // from class: ndf0
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    switch (i15) {
                                        case 0:
                                            e eVar = (e) fubVar.d;
                                            fmo fmoVar2 = (fmo) n351Var2;
                                            hhg hhgVar = fmoVar2.j;
                                            ifa0 ifa0Var = fmoVar2.i;
                                            eVar.c.a(hhgVar);
                                            if (ifa0Var != null) {
                                                eVar.b.c.invoke(ifa0Var);
                                                break;
                                            }
                                            break;
                                        default:
                                            ((lw) fubVar.c).a(((u7f) n351Var2).f);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            btsVar8.o0(Q);
                        }
                        dlb1.a(o, str, str2, j2, z2, z3, null, 0L, null, null, S, (sls) Q, btsVar8, 6, 6, 960);
                        btsVar8.t(false);
                    } else {
                        if (!(udf0Var instanceof u7f)) {
                            throw unr0.y(562268330, btsVar8, false);
                        }
                        btsVar8.e0(251684584);
                        f530 o2 = an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 16.0f, 0.0f, 10);
                        u7f u7fVar = (u7f) n351Var;
                        String str3 = u7fVar.c;
                        a37 a37Var = u7fVar.d;
                        boolean z4 = u7fVar.e;
                        boolean e2 = ((i9 & 14) == 4) | btsVar8.e(this);
                        Object Q2 = btsVar8.Q();
                        if (e2 || Q2 == o430Var) {
                            Q2 = new sls(this) { // from class: ndf0
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i15 = i14;
                                    zy11 zy11Var = zy11.a;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    switch (i15) {
                                        case 0:
                                            e eVar = (e) fubVar.d;
                                            fmo fmoVar2 = (fmo) n351Var2;
                                            hhg hhgVar = fmoVar2.j;
                                            ifa0 ifa0Var = fmoVar2.i;
                                            eVar.c.a(hhgVar);
                                            if (ifa0Var != null) {
                                                eVar.b.c.invoke(ifa0Var);
                                                break;
                                            }
                                            break;
                                        default:
                                            ((lw) fubVar.c).a(((u7f) n351Var2).f);
                                            break;
                                    }
                                    return zy11Var;
                                }
                            };
                            btsVar8.o0(Q2);
                        }
                        e7a1.b(str3, a37Var, z4, (sls) Q2, o2, btsVar8, HProv.ALG_CLASS_DATA_ENCRYPT, 0);
                        btsVar8.t(false);
                    }
                }
                v8 = btsVar8.v();
                if (v8 != null) {
                    wlsVar8 = new wls(this) { // from class: mdf0
                        public final /* synthetic */ fub b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            int i16 = i;
                            n351 n351Var2 = n351Var;
                            fub fubVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                                default:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                bts btsVar9 = (bts) fidVar;
                btsVar9.g0(-523029413);
                if ((i & 6) == 0) {
                    i10 = (btsVar9.k(n351Var) ? 4 : 2) | i;
                } else {
                    i10 = i;
                }
                if ((i & 48) == 0) {
                    i10 |= btsVar9.e(this) ? 32 : 16;
                }
                if (!btsVar9.V(i10 & 1, (i10 & 19) != 18)) {
                    btsVar9.Y();
                } else {
                    if (!(n351Var instanceof tgl0)) {
                        v9 = btsVar9.v();
                        if (v9 != null) {
                            wlsVar9 = new wls(this) { // from class: chl0
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    int i16 = i;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i15) {
                                        case 0:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                        default:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                    sb2.b(ua3.a.a((dci) obj), wwg.S(-796289125, true, new t7l0(3, n351Var, this), btsVar9), btsVar9, 56);
                }
                v9 = btsVar9.v();
                if (v9 != null) {
                    wlsVar9 = new wls(this) { // from class: chl0
                        public final /* synthetic */ fub b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            int i16 = i;
                            n351 n351Var2 = n351Var;
                            fub fubVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                                default:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v9.d = wlsVar9;
                    return;
                }
                return;
            default:
                bts btsVar10 = (bts) fidVar;
                btsVar10.g0(872139438);
                if ((i & 6) == 0) {
                    i11 = (btsVar10.k(n351Var) ? 4 : 2) | i;
                } else {
                    i11 = i;
                }
                if ((i & 48) == 0) {
                    i11 |= btsVar10.e(this) ? 32 : 16;
                }
                if (!btsVar10.V(i11 & 1, (i11 & 19) != 18)) {
                    btsVar10.Y();
                } else {
                    if (!(n351Var instanceof mcz0)) {
                        v10 = btsVar10.v();
                        if (v10 != null) {
                            wlsVar10 = new wls(this) { // from class: wdz0
                                public final /* synthetic */ fub b;

                                {
                                    this.b = this;
                                }

                                @Override // defpackage.wls
                                public final Object invoke(Object obj2, Object obj3) {
                                    int i15 = i13;
                                    zy11 zy11Var = zy11.a;
                                    int i16 = i;
                                    n351 n351Var2 = n351Var;
                                    fub fubVar = this.b;
                                    fid fidVar2 = (fid) obj2;
                                    ((Integer) obj3).getClass();
                                    switch (i15) {
                                        case 0:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                            break;
                                        default:
                                            fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
                    sb2.b(ua3.a.a((dci) obj), wwg.S(169938798, true, new wls() { // from class: ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.timeline.c
                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            c530 c530Var2;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar11 = (bts) fidVar2;
                            if (btsVar11.V(intValue & 1, (intValue & 3) != 2)) {
                                sic a = qic.a(lr20.c, x4c.G, btsVar11, 0);
                                int hashCode = Long.hashCode(btsVar11.T);
                                r1b0 o3 = btsVar11.o();
                                c530 c530Var3 = c530.a;
                                f530 d = androidx.compose.ui.b.d(btsVar11, c530Var3);
                                ohd.G1.getClass();
                                sls slsVar = androidx.compose.ui.node.d.b;
                                if (btsVar11.a == null) {
                                    cma1.b0();
                                    throw null;
                                }
                                btsVar11.i0();
                                if (btsVar11.S) {
                                    btsVar11.n(slsVar);
                                } else {
                                    btsVar11.r0();
                                }
                                qje.W(btsVar11, androidx.compose.ui.node.d.f, a);
                                qje.W(btsVar11, androidx.compose.ui.node.d.e, o3);
                                wls wlsVar11 = androidx.compose.ui.node.d.g;
                                if (btsVar11.S || !jl40.l(btsVar11.Q(), Integer.valueOf(hashCode))) {
                                    b64.z(hashCode, btsVar11, hashCode, wlsVar11);
                                }
                                qje.W(btsVar11, androidx.compose.ui.node.d.d, d);
                                mcz0 mcz0Var = (mcz0) n351.this;
                                eqb1.a(mcz0Var.c, ljs0.c(an91.o(c530Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), btsVar11, 48);
                                if (mcz0Var.d != null) {
                                    btsVar11.e0(1992117369);
                                    f530 o4 = an91.o(c530Var3, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                                    c530Var2 = c530Var3;
                                    w9z0 w9z0Var = mcz0Var.d;
                                    Object Q3 = btsVar11.Q();
                                    fub fubVar = this;
                                    o430 o430Var2 = did.a;
                                    if (Q3 == o430Var2) {
                                        TimelineWidget$Content$2$1$1$1 timelineWidget$Content$2$1$1$1 = new TimelineWidget$Content$2$1$1$1(1, (b) fubVar.d, b.class, "onButtonClick", "onButtonClick(Lru/yandex/taxi/logistics/sdk/ui_models/timeline/TimelineBubbleActionState;)V", 0);
                                        btsVar11.o0(timelineWidget$Content$2$1$1$1);
                                        Q3 = timelineWidget$Content$2$1$1$1;
                                    }
                                    tls tlsVar = (tls) ((tfx) Q3);
                                    Object Q4 = btsVar11.Q();
                                    if (Q4 == o430Var2) {
                                        TimelineWidget$Content$2$1$2$1 timelineWidget$Content$2$1$2$1 = new TimelineWidget$Content$2$1$2$1(0, (b) fubVar.d, b.class, "onBubbleShow", "onBubbleShow()V", 0);
                                        btsVar11.o0(timelineWidget$Content$2$1$2$1);
                                        Q4 = timelineWidget$Content$2$1$2$1;
                                    }
                                    ru.yandex.taxi.logistics.sdk.ui.component.misc.b.c(o4, w9z0Var, tlsVar, false, 0L, (sls) ((tfx) Q4), btsVar11, 196998, 24);
                                    btsVar11.t(false);
                                } else {
                                    c530Var2 = c530Var3;
                                    btsVar11.e0(1992521950);
                                    btsVar11.t(false);
                                }
                                ly3.B(c530Var2, 8.0f, btsVar11, true);
                            } else {
                                btsVar11.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar10), btsVar10, 56);
                }
                v10 = btsVar10.v();
                if (v10 != null) {
                    wlsVar10 = new wls(this) { // from class: wdz0
                        public final /* synthetic */ fub b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj2, Object obj3) {
                            int i15 = i14;
                            zy11 zy11Var = zy11.a;
                            int i16 = i;
                            n351 n351Var2 = n351Var;
                            fub fubVar = this.b;
                            fid fidVar2 = (fid) obj2;
                            ((Integer) obj3).getClass();
                            switch (i15) {
                                case 0:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
                                    break;
                                default:
                                    fubVar.a(n351Var2, fidVar2, vng.O(i16 | 1));
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
    }

    public fub(dci dciVar, f fVar) {
        super("tracking-header-key");
        this.c = dciVar;
        this.d = fVar;
    }

    public fub(dci dciVar, c cVar) {
        super("poll-key");
        this.c = dciVar;
        this.d = cVar;
    }

    public fub(qt90 qt90Var, dci dciVar) {
        super("pay-now-key");
        this.d = qt90Var;
        this.c = dciVar;
    }

    public fub(ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.e eVar, dci dciVar) {
        super("feedback-key");
        this.d = eVar;
        this.c = dciVar;
    }

    public fub(ptb ptbVar, dci dciVar) {
        super("action-buttons-key");
        this.d = ptbVar;
        this.c = dciVar;
    }

    public fub(dci dciVar, jfe0 jfe0Var) {
        super("dynamic-content-postcard-key");
        this.c = dciVar;
        this.d = jfe0Var;
    }

    public fub(dci dciVar, pv4 pv4Var) {
        super("dynamic-content-barcode-key");
        this.c = dciVar;
        this.d = pv4Var;
    }

    public fub(dci dciVar, b bVar) {
        super("tracking-timeline-key");
        this.c = dciVar;
        this.d = bVar;
    }

    public fub(e eVar, lw lwVar) {
        super("profile_button");
        this.d = eVar;
        this.c = lwVar;
    }
}
