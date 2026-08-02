package xsna;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: MusicPlaylistError.kt */
/* loaded from: classes3.dex */
public final class uz40 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(wh50 wh50Var, final ivp ivpVar, final KidsModeRestrictionRenderer kidsModeRestrictionRenderer, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        wh50 wh50Var2;
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(740042731);
        if ((i & 6) == 0) {
            wh50Var2 = wh50Var;
            i2 = (M.J(wh50Var2) ? 4 : 2) | i;
        } else {
            wh50Var2 = wh50Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(ivpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(kidsModeRestrictionRenderer) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(740042731, i3, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistError (MusicPlaylistError.kt:33)");
            }
            final float j1 = ((azl) M.r(uvi.h)).j1(((Number) wh50Var2.getValue()).intValue());
            jai c = kai.c(948868804, new wzs() { // from class: xsna.sz40
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    TopBar$Before.e eVar;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(948868804, intValue, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistError.<anonymous> (MusicPlaylistError.kt:40)");
                        }
                        if (ivp.this.c) {
                            aVar3.K(-1725789506);
                        } else {
                            aVar3.K(-1724133796);
                            q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                            if (skd.m(aVar3)) {
                                aVar3.K(-1723985802);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
                                }
                                lg90 b = or.b(aVar3, -45049119, R.drawable.vk_icon_arrow_left_outline_28, aVar3, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                String N = d370.N(R.string.music_talkback_go_back, 0, aVar3);
                                izs izsVar2 = izsVar;
                                boolean J = aVar3.J(izsVar2);
                                Object x = aVar3.x();
                                if (J || x == a.C0011a.a) {
                                    x = new zn1(izsVar2, 8);
                                    aVar3.R(x);
                                }
                                eVar = TopBar$Before.e.a.a(b, N, (gzs) x, null, null, null, aVar3, 1572872, 56);
                                aVar3.j();
                            } else {
                                aVar3.K(-1723572263);
                                aVar3.j();
                                eVar = null;
                            }
                            muv0.h(TopBar$Middle.a.c, H, null, null, null, eVar, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar3, 6, 0, 8156);
                        }
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M);
            jai c2 = kai.c(473870607, new yzs() { // from class: xsna.tz40
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(473870607, intValue, -1, "com.vk.music.playlist.display.presentation.MusicPlaylistError.<anonymous> (MusicPlaylistError.kt:57)");
                        }
                        ivp ivpVar2 = ivp.this;
                        boolean z = ivpVar2.c;
                        izs izsVar2 = izsVar;
                        Object obj4 = a.C0011a.a;
                        if (z) {
                            aVar3.K(-478183930);
                            KidsModeRestrictionRenderer.Source source = KidsModeRestrictionRenderer.Source.ADULT_CONTENT;
                            boolean J = aVar3.J(izsVar2);
                            Object x = aVar3.x();
                            if (J || x == obj4) {
                                x = new gc0(izsVar2, 6);
                                aVar3.R(x);
                            }
                            gzs gzsVar = (gzs) x;
                            boolean J2 = aVar3.J(izsVar2);
                            Object x2 = aVar3.x();
                            if (J2 || x2 == obj4) {
                                x2 = new z8c(izsVar2, 7);
                                aVar3.R(x2);
                            }
                            KidsModeRestrictionRenderer.b.a(source, gzsVar, (gzs) x2, kidsModeRestrictionRenderer, aVar3, 6);
                            aVar3.j();
                        } else {
                            aVar3.K(-477808427);
                            q630 D = p490.D(txj0.f(txj0.h(q630.a.a, ((Configuration) aVar3.r(AndroidCompositionLocals_androidKt.a)).screenHeightDp), 1.0f), p490.x(aVar3), 14);
                            boolean z2 = ivpVar2.b;
                            int i4 = ivpVar2.a;
                            boolean J3 = aVar3.J(izsVar2);
                            Object x3 = aVar3.x();
                            if (J3 || x3 == obj4) {
                                x3 = new z87(izsVar2, 8);
                                aVar3.R(x3);
                            }
                            gzs gzsVar2 = (gzs) x3;
                            boolean J4 = aVar3.J(izsVar2);
                            Object x4 = aVar3.x();
                            if (J4 || x4 == obj4) {
                                x4 = new tzo(izsVar2, 6);
                                aVar3.R(x4);
                            }
                            xj40.a(gzsVar2, (gzs) x4, D, z2, Integer.valueOf(i4), aVar3, 0, 0);
                            aVar3.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M);
            int i4 = ((i3 >> 12) & 14) | 805306416;
            q630Var2 = q630.a.a;
            aVar2 = M;
            phv0.b(q630Var2, c, null, null, null, 0, 0L, 0L, c2, aVar2, i4, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new yn1(wh50Var2, ivpVar, kidsModeRestrictionRenderer, izsVar, q630Var2, i);
        }
    }
}
