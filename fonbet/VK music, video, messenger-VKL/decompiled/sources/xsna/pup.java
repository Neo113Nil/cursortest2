package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: EqualizerSlider.kt */
/* loaded from: classes3.dex */
public final class pup {
    public static final void a(final boolean z, final xtp xtpVar, final rtp rtpVar, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1231623849);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(xtpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(rtpVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1231623849, i2, -1, "com.vk.music.design.compose.equalizer.DefaultThumb (EqualizerSlider.kt:212)");
            }
            float f = z2 ? xtpVar.h : xtpVar.i;
            q630.a aVar2 = q630.a.a;
            q630 q = txj0.q(aVar2, f);
            long j = z2 ? z ? rtpVar.g : rtpVar.f : rtpVar.m;
            uog0 uog0Var = vog0.a;
            q630 m = hr80.m(q, j, uog0Var);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (z2) {
                M.K(-849220591);
            } else {
                M.K(-841508380);
                ja8.a(ahn.E(hr80.m(ra8.a.b(txj0.q(aVar2, xtpVar.j), dt1.a.f), rtpVar.n, uog0Var), "equalizerDefaultThumb"), M, 0);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.hup
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    pup.a(z, xtpVar, rtpVar, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final xtp xtpVar, final rtp rtpVar, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1980835636);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(xtpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(rtpVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1980835636, i2, -1, "com.vk.music.design.compose.equalizer.DefaultTrack (EqualizerSlider.kt:243)");
            }
            ja8.a(hr80.m(txj0.c(txj0.v(q630.a.a, xtpVar.d), 1.0f), z2 ? z ? rtpVar.g : rtpVar.b : rtpVar.i, androidx.compose.ui.graphics.e.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gup
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    pup.b(z, xtpVar, rtpVar, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(short s, final short s2, final short s3, final String str, final boolean z, final xtp xtpVar, final rtp rtpVar, yzs yzsVar, yzs yzsVar2, jai jaiVar, final izs izsVar, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z2;
        androidx.compose.runtime.a aVar2;
        final jai jaiVar2;
        short s4;
        yzs yzsVar3;
        yzs yzsVar4;
        yzs c;
        yzs yzsVar5;
        q630 q630Var;
        boolean z3;
        int i3;
        androidx.compose.runtime.a M = aVar.M(1143542007);
        if ((i & 6) == 0) {
            i2 = (M.m(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.m(s2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.m(s3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(xtpVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.J(rtpVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i2 | 113246208;
        if ((805306368 & i) == 0) {
            i4 |= M.y(jaiVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i5 = (M.y(izsVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                jai c2 = kai.c(-79949238, new yzs() { // from class: xsna.dup
                    @Override // xsna.yzs
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        if ((intValue & 6) == 0) {
                            intValue |= aVar3.l(booleanValue) ? 4 : 2;
                        }
                        if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-79949238, intValue, -1, "com.vk.music.design.compose.equalizer.EqualizerSlider.<anonymous> (EqualizerSlider.kt:59)");
                            }
                            pup.b(booleanValue, xtp.this, rtpVar, z, aVar3, intValue & 14);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, M);
                c = kai.c(-948004193, new eup(xtpVar, rtpVar, z, 0), M);
                yzsVar5 = c2;
            } else {
                M.h();
                yzsVar5 = yzsVar;
                c = yzsVar2;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1143542007, i4, i5, "com.vk.music.design.compose.equalizer.EqualizerSlider (EqualizerSlider.kt:77)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new l06(s, s2, izsVar, gzsVar);
                M.R(x);
            }
            l06 l06Var = (l06) x;
            l06Var.d(s3);
            wh50 wh50Var = l06Var.f;
            Orientation orientation = Orientation.Vertical;
            boolean c3 = l06Var.c();
            boolean y = M.y(l06Var);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new nup(l06Var, null);
                M.R(x2);
            }
            yzs yzsVar6 = (yzs) x2;
            yzs yzsVar7 = c;
            int i6 = i4;
            q630 q630Var2 = q630.a.a;
            z2 = z;
            aVar2 = M;
            yzs yzsVar8 = yzsVar5;
            q630 a = fho.a(q630Var2, l06Var, orientation, z2, null, c3, yzsVar6, false, 168);
            if (z2) {
                aVar2.K(-419236821);
                boolean y2 = aVar2.y(l06Var);
                Object x3 = aVar2.x();
                if (y2 || x3 == c0012a) {
                    x3 = new oup(l06Var);
                    aVar2.R(x3);
                }
                q630Var = skn0.b(q630Var2, l06Var, (PointerInputEventHandler) x3);
                aVar2.j();
            } else {
                aVar2.K(-418984109);
                aVar2.j();
                q630Var = q630Var2;
            }
            if (z2) {
                aVar2.K(-418901959);
                short shortValue = ((Number) ((zak0) wh50Var).getValue()).shortValue();
                if (androidx.compose.runtime.b.d()) {
                    i3 = 0;
                    androidx.compose.runtime.b.f(202734923, 0, -1, "com.vk.music.design.compose.equalizer.formatAsDbForSemantic (EqualizerSlider.kt:268)");
                } else {
                    i3 = 0;
                }
                int i7 = shortValue / 100;
                String F = d370.F(R.plurals.equalizer_band_value_long_label_dB, i7, new Object[]{Integer.valueOf(i7)}, aVar2, i3);
                if (shortValue > 0) {
                    F = go9.b("+", F);
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String O = d370.O(R.string.equalizer_track_info_accessibility, new Object[]{str, F}, aVar2);
                String N = d370.N(R.string.equalizer_double_tap_accessibility, 0, aVar2);
                boolean y3 = aVar2.y(l06Var) | aVar2.J(O) | aVar2.J(N);
                Object x4 = aVar2.x();
                if (y3 || x4 == c0012a) {
                    x4 = new p83(l06Var, O, N, 2);
                    aVar2.R(x4);
                }
                z3 = false;
                q630Var2 = egi0.b(q630Var2, false, (izs) x4);
                aVar2.j();
            } else {
                z3 = false;
                aVar2.K(-418447437);
                aVar2.j();
            }
            icv icvVar = zax.a;
            q630 g = mxr.b(2, zr20.a, z2).g(a).g(q630Var).g(q630Var2);
            boolean y4 = aVar2.y(l06Var) | ((i6 & 14) == 4 ? true : z3) | ((i6 & 112) == 32 ? true : z3) | ((i6 & 896) != 256 ? z3 : true);
            Object x5 = aVar2.x();
            if (y4 || x5 == c0012a) {
                s4 = s;
                x5 = new mup(l06Var, s4, s2, s3);
                aVar2.R(x5);
            } else {
                s4 = s;
            }
            cp10 cp10Var = (cp10) x5;
            int hashCode = Long.hashCode(n34.n(aVar2));
            sy90 D = aVar2.D();
            q630 c4 = qri.c(aVar2, g);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, cp10Var, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(aVar2, cri.a.h);
            k9q0.w(aVar2, c4, cri.a.d);
            yzsVar3 = yzsVar8;
            f(l06Var.c(), yzsVar3, aVar2, (i6 >> 18) & 112);
            yzsVar4 = yzsVar7;
            e(l06Var.c(), yzsVar4, aVar2, (i6 >> 21) & 112);
            if (l06Var.c()) {
                aVar2.K(446354144);
                jaiVar2 = jaiVar;
                d(((Number) ((zak0) wh50Var).getValue()).shortValue(), jaiVar2, aVar2, (i6 >> 24) & 112);
            } else {
                jaiVar2 = jaiVar;
                aVar2.K(441690690);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            aVar2 = M;
            jaiVar2 = jaiVar;
            s4 = s;
            aVar2.h();
            yzsVar3 = yzsVar;
            yzsVar4 = yzsVar2;
        }
        androidx.compose.runtime.f s5 = aVar2.s();
        if (s5 != null) {
            final short s6 = s4;
            final boolean z4 = z2;
            final yzs yzsVar9 = yzsVar3;
            final yzs yzsVar10 = yzsVar4;
            s5.d = new wzs() { // from class: xsna.fup
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pup.c(s6, s2, s3, str, z4, xtpVar, rtpVar, yzsVar9, yzsVar10, jaiVar2, izsVar, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final short s, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1978684145);
        if ((i & 6) == 0) {
            i2 = (M.m(s) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1978684145, i2, -1, "com.vk.music.design.compose.equalizer.LabelContainer (EqualizerSlider.kt:196)");
            }
            q630 B = txj0.B(vua0.u(q630.a.a, mtp.LABEL), null, 3);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, B);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar.invoke(Short.valueOf(s), M, Integer.valueOf(i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs() { // from class: xsna.iup
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    pup.d(s, jaiVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final boolean z, final yzs<? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1413571205);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1413571205, i2, -1, "com.vk.music.design.compose.equalizer.ThumbContainer (EqualizerSlider.kt:182)");
            }
            q630 B = txj0.B(vua0.u(q630.a.a, mtp.THUMB), null, 3);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, B);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yzsVar.invoke(Boolean.valueOf(z), M, Integer.valueOf(i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kup
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    pup.e(z, yzsVar, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(boolean z, yzs<? super Boolean, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(457301626);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(457301626, i2, -1, "com.vk.music.design.compose.equalizer.TrackContainer (EqualizerSlider.kt:167)");
            }
            q630 c = txj0.c(txj0.C(vua0.u(q630.a.a, mtp.TRACK), null, 3), 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            yzsVar.invoke(Boolean.valueOf(z), M, Integer.valueOf(i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jup(z, yzsVar, i, 0);
        }
    }
}
