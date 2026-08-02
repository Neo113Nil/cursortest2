package androidx.compose.ui.window;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.did;
import defpackage.eae0;
import defpackage.eja1;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.jt1;
import defpackage.k6w;
import defpackage.m3u0;
import defpackage.nt1;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qje;
import defpackage.qwd;
import defpackage.r1b0;
import defpackage.rzx;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tls;
import defpackage.tra1;
import defpackage.u9e0;
import defpackage.ub2;
import defpackage.vb2;
import defpackage.vng;
import defpackage.vvf0;
import defpackage.w50;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xm91;
import defpackage.xvz;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.util.UUID;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class e {
    public static final qwd a = new qwd(AndroidPopup_androidKt$LocalPopupTestTag$1.w);
    public static final qwd b = new qwd(AndroidPopup_androidKt$LocalIsInPopupLayout$1.w);

    /* JADX WARN: Removed duplicated region for block: B:101:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(u9e0 u9e0Var, sls slsVar, eae0 eae0Var, final wls wlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        sls slsVar2;
        int i4;
        eae0 eae0Var2;
        final sls slsVar3;
        final eae0 eae0Var3;
        aii0 v;
        int i5;
        boolean z;
        String str;
        int i6;
        LayoutDirection layoutDirection;
        final u9e0 u9e0Var2 = u9e0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(u9e0Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            slsVar2 = slsVar;
            i3 |= btsVar.e(slsVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                eae0Var2 = eae0Var;
                i3 |= btsVar.k(eae0Var2) ? 256 : 128;
                if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    i3 |= btsVar.e(wlsVar) ? 2048 : 1024;
                }
                if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
                    final sls slsVar4 = i7 != 0 ? null : slsVar2;
                    final eae0 eae0Var4 = i4 != 0 ? new eae0(31) : eae0Var2;
                    View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
                    fwi fwiVar = (fwi) btsVar.m(j.h);
                    String str2 = (String) btsVar.m(a);
                    final LayoutDirection layoutDirection2 = (LayoutDirection) btsVar.m(j.n);
                    androidx.compose.runtime.c y0 = cma1.y0(btsVar);
                    final oz40 n = androidx.compose.runtime.f.n(wlsVar, btsVar);
                    Object[] objArr = new Object[0];
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (Q == o430Var) {
                        Q = AndroidPopup_androidKt$Popup$popupId$1$1.w;
                        btsVar.o0(Q);
                    }
                    UUID uuid = (UUID) cvw.V(objArr, (sls) Q, btsVar, 48);
                    boolean booleanValue = ((Boolean) btsVar.m(b)).booleanValue();
                    Object Q2 = btsVar.Q();
                    if (Q2 == o430Var) {
                        i5 = i3;
                        z = false;
                        i6 = 32;
                        str = str2;
                        final PopupLayout popupLayout = new PopupLayout(slsVar4, eae0Var4, str, view, fwiVar, u9e0Var2, uuid, booleanValue, null, 256, null);
                        u9e0Var2 = u9e0Var2;
                        popupLayout.setContent(y0, new androidx.compose.runtime.internal.a(-297523940, new wls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                fid fidVar2 = (fid) obj;
                                int intValue = ((Number) obj2).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                    vvf0 a2 = e.b.a(Boolean.TRUE);
                                    final PopupLayout popupLayout2 = PopupLayout.this;
                                    final m3u0 m3u0Var = n;
                                    sb2.b(a2, wwg.S(1022273628, true, new wls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // defpackage.wls
                                        public final Object invoke(Object obj3, Object obj4) {
                                            fid fidVar3 = (fid) obj3;
                                            int intValue2 = ((Number) obj4).intValue();
                                            bts btsVar3 = (bts) fidVar3;
                                            if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                Object Q3 = btsVar3.Q();
                                                o430 o430Var2 = did.a;
                                                if (Q3 == o430Var2) {
                                                    Q3 = AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1.w;
                                                    btsVar3.o0(Q3);
                                                }
                                                f530 b2 = fnq0.b(c530.a, false, (tls) Q3);
                                                boolean e = btsVar3.e(PopupLayout.this);
                                                final PopupLayout popupLayout3 = PopupLayout.this;
                                                Object Q4 = btsVar3.Q();
                                                if (e || Q4 == o430Var2) {
                                                    Q4 = new tls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // defpackage.tls
                                                        public final Object invoke(Object obj5) {
                                                            PopupLayout.this.m97setPopupContentSizefhxjrPA(new k6w(((k6w) obj5).a));
                                                            PopupLayout.this.updatePosition();
                                                            return zy11.a;
                                                        }
                                                    };
                                                    btsVar3.o0(Q4);
                                                }
                                                f530 b3 = tra1.b(xm91.b(b2, (tls) Q4), PopupLayout.this.getCanCalculatePosition() ? 1.0f : 0.0f);
                                                m3u0 m3u0Var2 = m3u0Var;
                                                qwd qwdVar = e.a;
                                                wls wlsVar2 = (wls) m3u0Var2.getValue();
                                                Object Q5 = btsVar3.Q();
                                                if (Q5 == o430Var2) {
                                                    Q5 = vb2.a;
                                                    btsVar3.o0(Q5);
                                                }
                                                z910 z910Var = (z910) Q5;
                                                int hashCode = Long.hashCode(btsVar3.T);
                                                r1b0 o = btsVar3.o();
                                                f530 d = androidx.compose.ui.b.d(btsVar3, b3);
                                                ohd.G1.getClass();
                                                sls slsVar5 = androidx.compose.ui.node.d.b;
                                                if (btsVar3.a == null) {
                                                    cma1.b0();
                                                    throw null;
                                                }
                                                btsVar3.i0();
                                                if (btsVar3.S) {
                                                    btsVar3.n(slsVar5);
                                                } else {
                                                    btsVar3.r0();
                                                }
                                                qje.W(btsVar3, androidx.compose.ui.node.d.f, z910Var);
                                                qje.W(btsVar3, androidx.compose.ui.node.d.e, o);
                                                qje.W(btsVar3, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                                                qje.M(btsVar3, androidx.compose.ui.node.d.h);
                                                qje.W(btsVar3, androidx.compose.ui.node.d.d, d);
                                                xvz.u(0, wlsVar2, btsVar3, true);
                                            } else {
                                                btsVar3.Y();
                                            }
                                            return zy11.a;
                                        }
                                    }, btsVar2), btsVar2, 56);
                                } else {
                                    btsVar2.Y();
                                }
                                return zy11.a;
                            }
                        }, true));
                        btsVar.o0(popupLayout);
                        Q2 = popupLayout;
                    } else {
                        i5 = i3;
                        z = false;
                        str = str2;
                        i6 = 32;
                    }
                    final PopupLayout popupLayout2 = (PopupLayout) Q2;
                    int i8 = i5;
                    int i9 = i8 & 112;
                    int i10 = i8 & 896;
                    boolean e = btsVar.e(popupLayout2) | (i9 == i6 ? true : z) | (i10 == 256 ? true : z) | btsVar.k(str) | btsVar.c(layoutDirection2.ordinal());
                    Object Q3 = btsVar.Q();
                    if (e || Q3 == o430Var) {
                        final String str3 = str;
                        Q3 = new tls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                PopupLayout.this.show();
                                PopupLayout.this.updateParameters(slsVar4, eae0Var4, str3, layoutDirection2);
                                return new w50(2, PopupLayout.this);
                            }
                        };
                        btsVar.o0(Q3);
                    }
                    zpn.a(popupLayout2, (tls) Q3, btsVar);
                    boolean e2 = btsVar.e(popupLayout2) | (i9 == i6 ? true : z) | (i10 == 256 ? true : z) | btsVar.k(str) | btsVar.c(layoutDirection2.ordinal());
                    Object Q4 = btsVar.Q();
                    if (e2 || Q4 == o430Var) {
                        final String str4 = str;
                        Q4 = new sls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // defpackage.sls
                            public final Object invoke() {
                                PopupLayout.this.updateParameters(slsVar4, eae0Var4, str4, layoutDirection2);
                                return zy11.a;
                            }
                        };
                        layoutDirection = layoutDirection2;
                        btsVar.o0(Q4);
                    } else {
                        layoutDirection = layoutDirection2;
                    }
                    zpn.i((sls) Q4, btsVar);
                    boolean e3 = btsVar.e(popupLayout2) | ((i8 & 14) == 4 ? true : z);
                    Object Q5 = btsVar.Q();
                    if (e3 || Q5 == o430Var) {
                        Q5 = new tls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                PopupLayout.this.setPositionProvider(u9e0Var2);
                                PopupLayout.this.updatePosition();
                                return new ub2();
                            }
                        };
                        btsVar.o0(Q5);
                    }
                    zpn.a(u9e0Var2, (tls) Q5, btsVar);
                    boolean e4 = btsVar.e(popupLayout2);
                    Object Q6 = btsVar.Q();
                    if (e4 || Q6 == o430Var) {
                        Q6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout2, null);
                        btsVar.o0(Q6);
                    }
                    zpn.e(btsVar, (wls) Q6, popupLayout2);
                    boolean e5 = btsVar.e(popupLayout2);
                    Object Q7 = btsVar.Q();
                    if (e5 || Q7 == o430Var) {
                        Q7 = new tls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                            {
                                super(1);
                            }

                            @Override // defpackage.tls
                            public final Object invoke(Object obj) {
                                PopupLayout.this.updateParentLayoutCoordinates(((rzx) obj).q());
                                return zy11.a;
                            }
                        };
                        btsVar.o0(Q7);
                    }
                    f530 y = eja1.y(c530.a, (tls) Q7);
                    boolean e6 = btsVar.e(popupLayout2) | btsVar.c(layoutDirection.ordinal());
                    Object Q8 = btsVar.Q();
                    if (e6 || Q8 == o430Var) {
                        Q8 = new d(popupLayout2, layoutDirection);
                        btsVar.o0(Q8);
                    }
                    z910 z910Var = (z910) Q8;
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = androidx.compose.ui.b.d(btsVar, y);
                    ohd.G1.getClass();
                    sls slsVar5 = androidx.compose.ui.node.d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar5);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, androidx.compose.ui.node.d.f, z910Var);
                    qje.W(btsVar, androidx.compose.ui.node.d.e, o);
                    qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, androidx.compose.ui.node.d.h);
                    qje.W(btsVar, androidx.compose.ui.node.d.d, d);
                    btsVar.t(true);
                    slsVar3 = slsVar4;
                    eae0Var3 = eae0Var4;
                } else {
                    btsVar.Y();
                    slsVar3 = slsVar2;
                    eae0Var3 = eae0Var2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new wls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Number) obj2).intValue();
                            e.a(u9e0.this, slsVar3, eae0Var3, wlsVar, (fid) obj, vng.O(i | 1), i2);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            eae0Var2 = eae0Var;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            }
            if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        slsVar2 = slsVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        eae0Var2 = eae0Var;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(jt1 jt1Var, long j, sls slsVar, eae0 eae0Var, final wls wlsVar, fid fidVar, final int i, final int i2) {
        jt1 jt1Var2;
        int i3;
        long j2;
        int i4;
        sls slsVar2;
        int i5;
        eae0 eae0Var2;
        wls wlsVar2;
        final jt1 jt1Var3;
        bts btsVar;
        final sls slsVar3;
        final eae0 eae0Var3;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(71005054);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            jt1Var2 = jt1Var;
        } else if ((i & 6) == 0) {
            jt1Var2 = jt1Var;
            i3 = (btsVar2.k(jt1Var2) ? 4 : 2) | i;
        } else {
            jt1Var2 = jt1Var;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            j2 = j;
            i3 |= btsVar2.d(j2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                slsVar2 = slsVar;
                i3 |= btsVar2.e(slsVar2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= HProv.ALG_TYPE_SECURECHANNEL;
                } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                    eae0Var2 = eae0Var;
                    i3 |= btsVar2.k(eae0Var2) ? 2048 : 1024;
                    if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
                        wlsVar2 = wlsVar;
                        i3 |= btsVar2.e(wlsVar2) ? 16384 : 8192;
                    } else {
                        wlsVar2 = wlsVar;
                    }
                    if (btsVar2.V(i3 & 1, (i3 & 9363) == 9362)) {
                        btsVar2.Y();
                        jt1Var3 = jt1Var2;
                        btsVar = btsVar2;
                        slsVar3 = slsVar2;
                        eae0Var3 = eae0Var2;
                    } else {
                        jt1 jt1Var4 = i6 != 0 ? x4c.b : jt1Var2;
                        if (i7 != 0) {
                            j2 = 0;
                        }
                        if (i4 != 0) {
                            slsVar2 = null;
                        }
                        eae0 eae0Var4 = i5 != 0 ? new eae0(31) : eae0Var2;
                        boolean k = btsVar2.k(null) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | btsVar2.c(eae0Var4.f);
                        Object Q = btsVar2.Q();
                        if (k || Q == did.a) {
                            Q = new nt1(jt1Var4, j2);
                            btsVar2.o0(Q);
                        }
                        sls slsVar4 = slsVar2;
                        a((nt1) Q, slsVar4, eae0Var4, wlsVar2, btsVar2, (i3 >> 3) & 8176, 0);
                        eae0Var3 = eae0Var4;
                        btsVar = btsVar2;
                        slsVar3 = slsVar4;
                        jt1Var3 = jt1Var4;
                    }
                    final long j3 = j2;
                    v = btsVar.v();
                    if (v == null) {
                        v.d = new wls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.wls
                            public final Object invoke(Object obj, Object obj2) {
                                ((Number) obj2).intValue();
                                e.b(jt1.this, j3, slsVar3, eae0Var3, wlsVar, (fid) obj, vng.O(i | 1), i2);
                                return zy11.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                eae0Var2 = eae0Var;
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
                }
                if (btsVar2.V(i3 & 1, (i3 & 9363) == 9362)) {
                }
                final long j32 = j2;
                v = btsVar.v();
                if (v == null) {
                }
            }
            slsVar2 = slsVar;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            eae0Var2 = eae0Var;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
            }
            if (btsVar2.V(i3 & 1, (i3 & 9363) == 9362)) {
            }
            final long j322 = j2;
            v = btsVar.v();
            if (v == null) {
            }
        }
        j2 = j;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        slsVar2 = slsVar;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        eae0Var2 = eae0Var;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
        }
        if (btsVar2.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        final long j3222 = j2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
