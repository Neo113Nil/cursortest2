package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AudioBookChaptersHeaderButtons.kt */
/* loaded from: classes3.dex */
public final class if4 {
    public static final void a(final boolean z, final boolean z2, final boolean z3, final boolean z4, final i8o i8oVar, final q630 q630Var, final boolean z5, final gzs gzsVar, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        boolean z6;
        int i2;
        boolean z7;
        boolean z8;
        izs izsVar2;
        lg90 d1;
        androidx.compose.runtime.a M = aVar.M(1697775147);
        if ((i & 6) == 0) {
            z6 = z;
            i2 = (M.l(z6) ? 4 : 2) | i;
        } else {
            z6 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z7 = z3;
            i2 |= M.l(z7) ? 256 : 128;
        } else {
            z7 = z3;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(i8oVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z8 = z5;
            i2 |= M.l(z8) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            z8 = z5;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.y(gzsVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 67108864 : 33554432;
        } else {
            izsVar2 = izsVar;
        }
        if (M.t(i2 & 1, (38347923 & i2) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1697775147, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.AudioBookChaptersHeaderButtons (AudioBookChaptersHeaderButtons.kt:88)");
            }
            a.j g = androidx.compose.foundation.layout.a.g(8);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (z4 && i8oVar == null) {
                M.K(-2070078618);
                int i3 = i2 << 3;
                int i4 = i2 >> 6;
                d(z6, z2, z7, z8, gzsVar, izsVar2, M, (i3 & 896) | 6 | (i3 & 112) | (i3 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016));
                M = M;
                M.j();
            } else if (z4 && i8oVar != null) {
                M.K(-2069749801);
                int i5 = i2 << 3;
                int i6 = (458752 & i5) | 6 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | ((i2 >> 6) & 57344);
                int i7 = i2 >> 3;
                f(z, z2, z3, z5, i8oVar, gzsVar, izsVar, M, (29360128 & i7) | i6 | (i7 & 3670016));
                M.j();
            } else if (z4 || i8oVar != null) {
                if (z4 || i8oVar == null) {
                    M.K(-2073748677);
                } else {
                    M.K(-2068663964);
                    e(z2, z3, i8oVar, gzsVar, M, 6 | (i2 & 112) | (i2 & 896) | ((i2 >> 3) & 7168) | ((i2 >> 9) & 57344));
                }
                M.j();
            } else {
                M.K(-2069364223);
                String str = z2 ? "pauseAudiobookButton" : "playAudiobookButton";
                q630.a aVar3 = q630.a.a;
                q630 g2 = ahn.E(aVar3, str).g(txj0.v(aVar3, 181));
                String N = d370.N(z2 ? R.string.music_audio_books_pause : R.string.music_audio_books_listen, 0, M);
                if (z2) {
                    M.K(1734375502);
                    qzu0.a.getClass();
                    d1 = qzu0.V0(M);
                } else {
                    M.K(1734376173);
                    qzu0.a.getClass();
                    d1 = qzu0.d1(M);
                }
                M.j();
                boolean z9 = (29360128 & i2) == 8388608;
                Object x = M.x();
                if (z9 || x == a.C0011a.a) {
                    x = new xe4(0, gzsVar);
                    M.R(x);
                }
                b(N, d1, z3, null, g2, (gzs) x, M, 3136 | (i2 & 896));
                M.j();
            }
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.af4
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    if4.a(z, z2, z3, z4, i8oVar, q630Var, z5, gzsVar, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final String str, final lg90 lg90Var, final boolean z, final String str2, final q630 q630Var, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-317019119);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str3 = str2;
            i2 |= M.J(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(gzsVar) ? 131072 : 65536;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-317019119, i3, -1, "com.vk.music.playlist.display.audiobook.presentation.AudioBookHeaderButton (AudioBookChaptersHeaderButtons.kt:259)");
            }
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
            ButtonSize buttonSize = ButtonSize.Medium;
            int i4 = i3 >> 3;
            pqv a = cp8.b.a.a(lg90Var, null, null, str3, null, M, (i4 & 14) | 196616 | (i3 & 7168), 22);
            gio0 gio0Var = null;
            if (str == null) {
                M.K(317067776);
            } else {
                M.K(317067777);
                gio0Var = cp8.d.a.a(str, null, M, 3072, 6);
            }
            M.j();
            bhu0.d(gzsVar, buttonStyle, buttonAppearance, q630Var, buttonSize, null, a, gio0Var, z, null, M, ((i3 >> 15) & 14) | 25008 | (i4 & 7168) | ((i3 << 21) & 1879048192), 3360);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.bf4
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    if4.b(str, lg90Var, z, str2, q630Var, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ddn ddnVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        ddn ddnVar2 = ddnVar;
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.a M = aVar.M(-112866769);
        int i2 = i | (M.y(ddnVar2) ? 4 : 2) | (M.J(q630Var2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-112866769, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.DownloadAudioBookButton (AudioBookChaptersHeaderButtons.kt:282)");
            }
            bn20 z = hr80.z();
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            mgu0 mgu0Var = (mgu0) z.b(buttonStyle, ButtonAppearance.Overlay, M, 54);
            wh50 a = mgu0Var.a(false, M, 6);
            wh50 b = mgu0Var.b(false, M, 6);
            wh50 d = mgu0Var.d(false, M, 6);
            bn20 z2 = hr80.z();
            ButtonSize buttonSize = ButtonSize.Medium;
            r5j0 x = z2.x(6, M);
            bn20 z3 = hr80.z();
            long j = ((l5g) a.getValue()).a;
            long j2 = ((l5g) a.getValue()).a;
            long j3 = ((l5g) b.getValue()).a;
            long j4 = ((l5g) b.getValue()).a;
            long j5 = ((l5g) d.getValue()).a;
            long j6 = ((l5g) d.getValue()).a;
            z3.getClass();
            aVar2 = M;
            ddnVar2 = ddnVar;
            q630Var2 = q630Var;
            bhu0.f(ddnVar2, q630Var2, false, null, null, null, null, null, x, op8.a(j, j2, j3, j4, j5, j6, 0L, 0L, 0L, 0L, M, 0, 0, VideoRecord.DEFAULT_MAX_DIMENSION), hr80.z().c(buttonSize, buttonStyle, true, aVar2, 438, 0).getValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(1810437752, new ze4(d, 0), aVar2), aVar2, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 1572864, 63740);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new e3(ddnVar2, q630Var2, i, 3);
        }
    }

    public static final void d(final boolean z, final boolean z2, final boolean z3, final boolean z4, final gzs gzsVar, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z5;
        lg90 d1;
        androidx.compose.runtime.a M = aVar.M(1713364260);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z5 = z3;
            i2 |= M.l(z5) ? 2048 : 1024;
        } else {
            z5 = z3;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(gzsVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1713364260, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.PlaybackAndAddButtons (AudioBookChaptersHeaderButtons.kt:152)");
            }
            String str = z2 ? "pauseAudiobookButton" : "playAudiobookButton";
            q630.a aVar2 = q630.a.a;
            q630 g = ahn.E(aVar2, str).g(tpg0Var.b(1.0f, aVar2, true));
            if (z2) {
                M.K(1570597771);
                qzu0.a.getClass();
                d1 = qzu0.V0(M);
            } else {
                M.K(1570598442);
                qzu0.a.getClass();
                d1 = qzu0.d1(M);
            }
            M.j();
            String N = d370.N(z2 ? R.string.music_audio_books_talkback_pause : R.string.music_audio_books_talkback_play, 0, M);
            boolean z6 = (i2 & 458752) == 131072;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z6 || x == obj) {
                x = new ef4(0, gzsVar);
                M.R(x);
            }
            int i4 = i2 >> 3;
            int i5 = i4 & 896;
            int i6 = i2;
            b(null, d1, z5, N, g, (gzs) x, M, 70 | i5);
            q630 E = ahn.E(tpg0Var.b(1.0f, aVar2, true), z ? "deleteAudiobookButton" : "addAudiobookButton");
            int i7 = (i4 & 14) | ((i6 >> 9) & 112);
            String h = h(z, z4, M, i7);
            lg90 g2 = g(z, z4, M, i7);
            boolean z7 = ((i6 & 112) == 32) | ((i6 & 3670016) == 1048576);
            Object x2 = M.x();
            if (z7 || x2 == obj) {
                x2 = new ff4(0, izsVar, z);
                M.R(x2);
            }
            b(h, g2, z3, null, E, (gzs) x2, M, 3136 | i5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gf4
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    if4.d(z, z2, z3, z4, gzsVar, izsVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(boolean z, boolean z2, i8o i8oVar, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 d1;
        androidx.compose.runtime.a M = aVar.M(628306513);
        if ((i & 48) == 0) {
            i2 = (M.l(z) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(i8oVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9361) != 9360)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(628306513, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.PlaybackAndDownloadButtons (AudioBookChaptersHeaderButtons.kt:232)");
            }
            String str = z ? "pauseAudiobookButton" : "playAudiobookButton";
            q630.a aVar2 = q630.a.a;
            float f = 181;
            q630 g = ahn.E(aVar2, str).g(txj0.v(aVar2, f));
            String N = d370.N(z ? R.string.music_audio_books_pause : R.string.music_audio_books_listen, 0, M);
            if (z) {
                M.K(-1787811464);
                qzu0.a.getClass();
                d1 = qzu0.V0(M);
            } else {
                M.K(-1787810793);
                qzu0.a.getClass();
                d1 = qzu0.d1(M);
            }
            M.j();
            boolean z3 = (57344 & i2) == 16384;
            Object x = M.x();
            if (z3 || x == a.C0011a.a) {
                x = new cf4(0, gzsVar);
                M.R(x);
            }
            b(N, d1, z2, null, g, (gzs) x, M, 3136 | (i2 & 896));
            c(i8oVar.a, ahn.E(aVar2, "downloadAudioBookButton").g(txj0.v(aVar2, f)), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new df4(z, z2, i8oVar, gzsVar, i);
        }
    }

    public static final void f(final boolean z, final boolean z2, final boolean z3, final boolean z4, final i8o i8oVar, final gzs gzsVar, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z5;
        lg90 d1;
        androidx.compose.runtime.a M = aVar.M(-1156412351);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z5 = z3;
            i2 |= M.l(z5) ? 2048 : 1024;
        } else {
            z5 = z3;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z4) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(i8oVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(gzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.y(izsVar) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1156412351, i2, -1, "com.vk.music.playlist.display.audiobook.presentation.PlaybackDownloadAndAddButtons (AudioBookChaptersHeaderButtons.kt:191)");
            }
            String str = z2 ? "pauseAudiobookButton" : "playAudiobookButton";
            q630.a aVar2 = q630.a.a;
            q630 g = ahn.E(aVar2, str).g(tpg0Var.b(0.5f, aVar2, true));
            if (z2) {
                M.K(1084280520);
                qzu0.a.getClass();
                d1 = qzu0.V0(M);
            } else {
                M.K(1084281191);
                qzu0.a.getClass();
                d1 = qzu0.d1(M);
            }
            M.j();
            String N = d370.N(z2 ? R.string.music_audio_books_talkback_pause : R.string.music_audio_books_talkback_play, 0, M);
            lg90 lg90Var = d1;
            boolean z6 = (i2 & 3670016) == 1048576;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z6 || x == obj) {
                x = new m3(1, gzsVar);
                M.R(x);
            }
            int i4 = i2 >> 3;
            int i5 = i4 & 896;
            int i6 = i2;
            b(null, lg90Var, z5, N, g, (gzs) x, M, 70 | i5);
            c(i8oVar.a, ahn.E(aVar2, "downloadAudioBookButton").g(tpg0Var.b(0.5f, aVar2, true)), M, 0);
            q630 E = ahn.E(tpg0Var.b(1.0f, aVar2, true), z ? "deleteAudiobookButton" : "addAudiobookButton");
            int i7 = (i4 & 14) | ((i6 >> 9) & 112);
            String h = h(z, z4, M, i7);
            lg90 g2 = g(z, z4, M, i7);
            boolean z7 = ((i6 & 29360128) == 8388608) | ((i6 & 112) == 32);
            Object x2 = M.x();
            if (z7 || x2 == obj) {
                x2 = new hf4(izsVar, z, 0);
                M.R(x2);
            }
            b(h, g2, z3, null, E, (gzs) x2, M, 3136 | i5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ye4
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    if4.f(z, z2, z3, z4, i8oVar, gzsVar, izsVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final lg90 g(boolean z, boolean z2, androidx.compose.runtime.a aVar, int i) {
        lg90 b;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1404437816, i, -1, "com.vk.music.playlist.display.audiobook.presentation.resolveAddRemoveIcon (AudioBookChaptersHeaderButtons.kt:316)");
        }
        if (z2 && z) {
            aVar.K(1045015038);
            qzu0.a.getClass();
            b = qzu0.x0(aVar);
            aVar.j();
        } else if (z) {
            aVar.K(1045016192);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1066817700, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Delete24> (VkSdkIcons.kt:606)");
            }
            b = or.b(aVar, 1192058125, R.drawable.vk_icon_delete_24, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else if (z2) {
            aVar.K(1045017541);
            qzu0.a.getClass();
            b = qzu0.y0(aVar);
            aVar.j();
        } else {
            aVar.K(1045018717);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
            }
            b = or.b(aVar, -1058716730, R.drawable.vk_icon_add_24, aVar, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return b;
    }

    public static final String h(boolean z, boolean z2, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1853440240, i, -1, "com.vk.music.playlist.display.audiobook.presentation.resolveAddRemoveStringRes (AudioBookChaptersHeaderButtons.kt:324)");
        }
        String N = d370.N((z2 && z) ? R.string.music_audio_book_kids_added_label : z ? R.string.music_playlist_delete : R.string.music_playlist_add, 0, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return N;
    }
}
