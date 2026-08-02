package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sej;
import defpackage.sls;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.xvz;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.util.UUID;

/* loaded from: classes10.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final sls slsVar, sej sejVar, final wls wlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        sej sejVar2;
        int i4;
        final sej sejVar3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(826668973);
        if ((i & 6) == 0) {
            i3 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            sejVar2 = sejVar;
            i3 |= btsVar.k(sejVar2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar.e(wlsVar) ? 256 : 128;
            }
            i4 = i3;
            if (btsVar.V(i4 & 1, (i4 & 147) == 146)) {
                btsVar.Y();
                sejVar3 = sejVar2;
            } else {
                sejVar3 = i5 != 0 ? new sej(7) : sejVar2;
                View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
                fwi fwiVar = (fwi) btsVar.m(j.h);
                final LayoutDirection layoutDirection = (LayoutDirection) btsVar.m(j.n);
                androidx.compose.runtime.c y0 = cma1.y0(btsVar);
                final oz40 n = androidx.compose.runtime.f.n(wlsVar, btsVar);
                Object[] objArr = new Object[0];
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = AndroidDialog_androidKt$Dialog$dialogId$1$1.w;
                    btsVar.o0(Q);
                }
                UUID uuid = (UUID) cvw.V(objArr, (sls) Q, btsVar, 48);
                boolean c = btsVar.c(sejVar3.g) | btsVar.k(view) | btsVar.k(fwiVar) | btsVar.k(null);
                Object Q2 = btsVar.Q();
                if (c || Q2 == o430Var) {
                    DialogWrapper dialogWrapper = new DialogWrapper(slsVar, sejVar3, view, layoutDirection, fwiVar, uuid);
                    dialogWrapper.setContent(y0, new androidx.compose.runtime.internal.a(-1338939603, new wls() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
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
                                Object Q3 = btsVar2.Q();
                                if (Q3 == did.a) {
                                    Q3 = AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1.w;
                                    btsVar2.o0(Q3);
                                }
                                c.b(fnq0.b(c530.a, false, (tls) Q3), (wls) n.getValue(), btsVar2, 0, 0);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11.a;
                        }
                    }, true));
                    btsVar.o0(dialogWrapper);
                    Q2 = dialogWrapper;
                }
                final DialogWrapper dialogWrapper2 = (DialogWrapper) Q2;
                boolean e = btsVar.e(dialogWrapper2);
                Object Q3 = btsVar.Q();
                if (e || Q3 == o430Var) {
                    Q3 = new tls() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            DialogWrapper.this.show();
                            return new a(DialogWrapper.this);
                        }
                    };
                    btsVar.o0(Q3);
                }
                zpn.a(dialogWrapper2, (tls) Q3, btsVar);
                boolean e2 = btsVar.e(dialogWrapper2) | ((i4 & 14) == 4) | ((i4 & 112) == 32) | btsVar.c(layoutDirection.ordinal());
                Object Q4 = btsVar.Q();
                if (e2 || Q4 == o430Var) {
                    Q4 = new sls() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            DialogWrapper.this.updateParameters(slsVar, sejVar3, layoutDirection);
                            return zy11.a;
                        }
                    };
                    btsVar.o0(Q4);
                }
                zpn.i((sls) Q4, btsVar);
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        c.a(sls.this, sejVar3, wlsVar, (fid) obj, vng.O(i | 1), i2);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        sejVar2 = sejVar;
        if ((i & 384) == 0) {
        }
        i4 = i3;
        if (btsVar.V(i4 & 1, (i4 & 147) == 146)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(final f530 f530Var, final wls wlsVar, fid fidVar, final int i, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1090521195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(wlsVar) ? 32 : 16;
        }
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = b.a;
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, z910Var);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            xvz.u((i5 >> 6) & 14, wlsVar, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    c.b(f530.this, wlsVar, (fid) obj, vng.O(i | 1), i2);
                    return zy11.a;
                }
            };
        }
    }
}
