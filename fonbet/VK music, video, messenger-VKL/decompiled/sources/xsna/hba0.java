package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.yjq0;

/* compiled from: PhotoSettings.kt */
/* loaded from: classes5.dex */
public final class hba0 {
    public static final void a(final izs izsVar, q630 q630Var, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final ir5 ir5Var, final o2k o2kVar, final yjq0.b bVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        final q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(772501664);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.y(gzsVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(ir5Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.J(o2kVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= M.J(bVar) ? 8388608 : 4194304;
        }
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            M.V();
            int i4 = i & 1;
            q630.a aVar2 = q630.a.a;
            if (i4 == 0 || M.i()) {
                q630Var3 = aVar2;
            } else {
                M.h();
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(772501664, i3, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.PhotosSettings (PhotoSettings.kt:32)");
            }
            ua8.a(txj0.f(aVar2, 1.0f), null, false, kai.c(867578102, new yzs() { // from class: xsna.eba0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(va8Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(867578102, intValue, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.photo.PhotosSettings.<anonymous> (PhotoSettings.kt:34)");
                        }
                        azl azlVar = (azl) aVar3.r(uvi.h);
                        float min = Math.min(azlVar.k1(o6j.i(va8Var.f()) * 0.4f), azlVar.j1(o6j.h(va8Var.f())));
                        float d = r490.d(R.dimen.user_profile_item_corner_height, aVar3);
                        q630 h = txj0.h(txj0.f(q630.this, 1.0f), 32 + d + min);
                        dt1.a.getClass();
                        cp10 d2 = ja8.d(dt1.a.b, false);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c = qri.c(aVar3, h);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar4);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, d2, cri.a.f);
                        k9q0.w(aVar3, D, cri.a.e);
                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar3, cri.a.h);
                        k9q0.w(aVar3, c, cri.a.d);
                        q630.a aVar5 = q630.a.a;
                        q630 h2 = txj0.h(aVar5, d + min);
                        izs izsVar2 = izsVar;
                        gzs gzsVar4 = gzsVar;
                        gzs gzsVar5 = gzsVar2;
                        gzs gzsVar6 = gzsVar3;
                        l1k.b(min, izsVar2, h2, gzsVar4, gzsVar5, gzsVar6, o2kVar, aVar3, 0);
                        q630 b = ra8.a.b(aVar5, dt1.a.i);
                        boolean J = aVar3.J(gzsVar4) | aVar3.J(gzsVar5) | aVar3.J(gzsVar6);
                        Object x = aVar3.x();
                        if (J || x == a.C0011a.a) {
                            x = new gba0(gzsVar4, gzsVar5, gzsVar6, 0);
                            aVar3.R(x);
                        }
                        vq5.a(izsVar2, b, (gzs) x, ir5Var, bVar, aVar3, 0);
                        aVar3.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3078, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.fba0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hba0.a(izs.this, q630Var2, gzsVar, gzsVar2, gzsVar3, ir5Var, o2kVar, bVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
