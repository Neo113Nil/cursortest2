package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.fullscreenvideo.a;

/* compiled from: ControlButton.kt */
/* loaded from: classes16.dex */
public final class bqj {

    /* compiled from: ControlButton.kt */
    public static final class a implements gzs {
        public static final a b = new a();

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final dqj dqjVar, final izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar, final q630 q630Var, boolean z, float f, eqj eqjVar, gzs<? extends j8o> gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        float f2;
        int i5;
        eqj eqjVar2;
        int i6;
        final boolean z3;
        final float f3;
        final gzs<? extends j8o> gzsVar2;
        androidx.compose.runtime.f s;
        gzs<? extends j8o> gzsVar3;
        boolean z4;
        a.d dVar = dqjVar.c;
        androidx.compose.runtime.a M = aVar.M(781395781);
        if ((i & 6) == 0) {
            i3 = (M.J(dqjVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= M.n(f2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    eqjVar2 = eqjVar;
                    i3 |= M.J(eqjVar2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= M.y(gzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                    if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                        M.h();
                        z3 = z2;
                        f3 = f2;
                        gzsVar2 = gzsVar;
                    } else {
                        boolean z5 = i7 != 0 ? false : z2;
                        float f4 = i4 != 0 ? 12 : f2;
                        eqj eqjVar3 = i5 != 0 ? new eqj(false, false, null) : eqjVar2;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (i6 != 0) {
                            Object x = M.x();
                            if (x == c0012a) {
                                x = a.b;
                                M.R(x);
                            }
                            gzsVar3 = (gzs) x;
                        } else {
                            gzsVar3 = gzsVar;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(781395781, i3, -1, "com.vk.fullscreenvideo.icons.ControlButton (ControlButton.kt:21)");
                        }
                        if (dVar instanceof a.d.c) {
                            M.K(-160582954);
                            if (eqjVar3.c != null) {
                                M.K(-160534253);
                                rhs0.a(dqjVar.b, eqjVar3.c, gzsVar3, q630Var, M, ((i3 >> 12) & 896) | ((i3 << 3) & 7168));
                            } else {
                                M.K(-161495811);
                            }
                            M.j();
                            M.j();
                            eqjVar2 = eqjVar3;
                        } else if (dVar instanceof a.d.b.C1073b) {
                            M.K(-160166748);
                            boolean z6 = eqjVar3.a;
                            Integer a2 = vqj.a(eqjVar3, dVar, (i3 >> 15) & 14);
                            z4 = (i3 & 112) == 32;
                            Object x2 = M.x();
                            if (z4 || x2 == c0012a) {
                                x2 = new oyg(izsVar, 1);
                                M.R(x2);
                            }
                            eqjVar2 = eqjVar3;
                            float f5 = f4;
                            k6z.a(dqjVar, z6, z5, a2, (izs) x2, q630Var, f5, M, (i3 & 14) | ((i3 >> 3) & 896) | ((i3 << 9) & 458752) | ((i3 << 6) & 3670016));
                            f4 = f5;
                            M = M;
                            M.j();
                        } else {
                            eqjVar2 = eqjVar3;
                            M.K(-159712412);
                            Integer a3 = vqj.a(eqjVar2, dVar, (i3 >> 15) & 14);
                            z4 = (i3 & 112) == 32;
                            Object x3 = M.x();
                            if (z4 || x3 == c0012a) {
                                x3 = new ypd(izsVar, 1);
                                M.R(x3);
                            }
                            ods0.a(dqjVar, a3, z5, q630Var, f4, (izs) x3, M, (i3 & 14) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | (i3 & 57344));
                            M.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        f3 = f4;
                        gzsVar2 = gzsVar3;
                        z3 = z5;
                    }
                    androidx.compose.runtime.a aVar2 = M;
                    final eqj eqjVar4 = eqjVar2;
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.aqj
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                bqj.a(dqj.this, izsVar, q630Var, z3, f3, eqjVar4, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                eqjVar2 = eqjVar;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
                }
                androidx.compose.runtime.a aVar22 = M;
                final eqj eqjVar42 = eqjVar2;
                s = aVar22.s();
                if (s == null) {
                }
            }
            f2 = f;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            eqjVar2 = eqjVar;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
            }
            androidx.compose.runtime.a aVar222 = M;
            final eqj eqjVar422 = eqjVar2;
            s = aVar222.s();
            if (s == null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        eqjVar2 = eqjVar;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if (M.t(i3 & 1, (i3 & 599187) == 599186)) {
        }
        androidx.compose.runtime.a aVar2222 = M;
        final eqj eqjVar4222 = eqjVar2;
        s = aVar2222.s();
        if (s == null) {
        }
    }
}
