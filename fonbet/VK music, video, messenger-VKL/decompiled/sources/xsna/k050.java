package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.music.playlist.framework.presentation.track.MusicTrackPlayState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.bi40;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MusicPlaylistHeaderButtons.kt */
/* loaded from: classes3.dex */
public final class k050 {
    public static final void a(final bi40 bi40Var, final boolean z, final gzs gzsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1759766038);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(bi40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1759766038, i2, -1, "com.vk.music.playlist.display.presentation.DownloadingStateButton (MusicPlaylistHeaderButtons.kt:342)");
            }
            aVar2 = M;
            bhu0.f(gzsVar, tpg0Var.b(1.0f, q630Var, true), false, null, null, null, null, null, null, g(M), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(1206027585, new c050(bi40Var, z), M), aVar2, (i2 >> 9) & 14, 1572864, 65020);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.d050
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k050.a(bi40.this, z, gzsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final l050 l050Var, final q630 q630Var, final boolean z, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-965138185);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(l050Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-965138185, i2, -1, "com.vk.music.playlist.display.presentation.PlayPauseButton (MusicPlaylistHeaderButtons.kt:249)");
            }
            aVar2 = M;
            bhu0.f(gzsVar, tpg0Var.b(1.0f, q630Var, true), false, null, null, null, null, null, null, g(M), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(2143385358, new yzs() { // from class: xsna.h050
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    lg90 d1;
                    int i4;
                    int i5;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2143385358, intValue, -1, "com.vk.music.playlist.display.presentation.PlayPauseButton.<anonymous> (MusicPlaylistHeaderButtons.kt:255)");
                        }
                        MusicTrackPlayState musicTrackPlayState = l050.this.a;
                        MusicTrackPlayState musicTrackPlayState2 = MusicTrackPlayState.REQUESTED;
                        q630.a aVar4 = q630.a.a;
                        if (musicTrackPlayState == musicTrackPlayState2) {
                            aVar3.K(314480856);
                            mku0.a(2, 390, 24, k050.h(aVar3), aVar3, txj0.q(aVar4, 24));
                            aVar3.j();
                        } else {
                            aVar3.K(314728918);
                            MusicTrackPlayState musicTrackPlayState3 = MusicTrackPlayState.PLAYING;
                            if (musicTrackPlayState == musicTrackPlayState3) {
                                aVar3.K(314799133);
                                qzu0.a.getClass();
                                d1 = qzu0.V0(aVar3);
                                aVar3.j();
                            } else {
                                aVar3.K(314859614);
                                qzu0.a.getClass();
                                d1 = qzu0.d1(aVar3);
                                aVar3.j();
                            }
                            if (musicTrackPlayState == musicTrackPlayState3) {
                                i4 = 315004787;
                                i5 = R.string.music_talkback_pause;
                            } else {
                                i4 = 315106932;
                                i5 = R.string.music_talkback_play;
                            }
                            pzu0.b(d1, zq.a(aVar3, i4, i5, aVar3, 0), ahn.E(txj0.q(aVar4, hr80.z().v(ButtonSize.Medium, aVar3, 6)), musicTrackPlayState == musicTrackPlayState3 ? "listenPlaylistButtonPauseIcon" : "listenPlaylistButtonPlayIcon"), k050.h(aVar3), aVar3, 8, 0);
                            aVar3.j();
                        }
                        if (z) {
                            aVar3.K(315712269);
                            hr80.z().getClass();
                            op8.h();
                            f9t.e(txj0.v(aVar4, kqu0.s), aVar3, 0);
                            yqv0.c(d370.N(R.string.music_playlist_play, 0, aVar3), null, 0L, null, null, 0, 0, null, 2, false, 0, 1, null, null, aVar3, 100663296, 48, 14078);
                            aVar3 = aVar3;
                        } else {
                            aVar3.K(304667124);
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
            }, M), aVar2, (i2 >> 12) & 14, 1572864, 65020);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.i050
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k050.b(l050.this, q630Var, z, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final l050 l050Var, final q630 q630Var, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, final gzs gzsVar4, final gzs gzsVar5, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        lg90 b;
        lg90 H;
        int i6;
        l050 l050Var2 = l050Var;
        boolean z2 = l050Var2.h;
        boolean z3 = l050Var2.l;
        boolean z4 = l050Var2.k;
        bi40 bi40Var = l050Var2.i;
        boolean z5 = l050Var2.e;
        androidx.compose.runtime.a M = aVar.M(-53708115);
        if ((i & 6) == 0) {
            i2 = (M.J(l050Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(gzsVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(gzsVar5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= M.l(z) ? 8388608 : 4194304;
        }
        if (M.t(i2 & 1, (i2 & 4793491) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-53708115, i2, -1, "com.vk.music.playlist.display.presentation.PlaylistHeaderButtons (MusicPlaylistHeaderButtons.kt:124)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            int i7 = i2;
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            String str = null;
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
            boolean z6 = l050Var2.c;
            q630.a aVar3 = q630.a.a;
            if (z6) {
                M.K(-174038915);
                int i8 = i7 << 3;
                int i9 = 390 | (i8 & 112) | ((i7 >> 12) & 7168);
                i3 = i7;
                b(l050Var2, ahn.E(aVar3, "listenPlaylistButton"), z, gzsVar, M, i9 | ((i7 << 6) & 57344));
                float f = 8;
                f9t.e(txj0.v(aVar3, f), M, 6);
                l050Var2 = l050Var;
                d(l050Var2, ahn.E(aVar3, "shufflePlaylistButton"), z, gzsVar2, M, i9 | (i8 & 57344));
                mq.d(aVar3, f, M, 6);
                i4 = -179430063;
            } else {
                i3 = i7;
                i4 = -179430063;
                M.K(-179430063);
                M.j();
            }
            boolean z7 = l050Var2.d;
            tpg0 tpg0Var = tpg0.a;
            if (z7) {
                M.K(-173327279);
                q630 E = ahn.E(tpg0Var.b(1.0f, aVar3, true), "editPlaylistButton");
                if (androidx.compose.runtime.b.d()) {
                    i6 = 0;
                    androidx.compose.runtime.b.f(-672921252, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-EditOutline28> (VkSdkIcons.kt:772)");
                } else {
                    i6 = 0;
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_edit_outline_28, i6, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (z2) {
                    M.K(-172948212);
                    M.j();
                } else {
                    str = zq.a(M, -421223089, R.string.music_playlist_edit, M, i6);
                }
                e(a2, E, str, d370.N(R.string.music_talkback_playlist_edit, i6, M), gzsVar4, M, 70 | (i3 & 458752), 0);
                if (z2) {
                    M.K(-172765528);
                    f9t.e(txj0.v(aVar3, 8), M, 6);
                    a(l050Var2.i, l050Var2.j, gzsVar5, ahn.E(aVar3, i(bi40Var)), M, 6 | ((i3 >> 9) & 7168));
                } else {
                    M.K(i4);
                }
                M.j();
                M.j();
            } else {
                int i10 = R.string.music_talkback_playlist_add_to_my_music;
                if (z5) {
                    M.K(-172283013);
                    q630 E2 = ahn.E(tpg0Var.b(1.0f, aVar3, true), "removePlaylistButton");
                    if (z4) {
                        M.K(-421190473);
                        qzu0.a.getClass();
                        H = qzu0.x0(M);
                    } else {
                        M.K(-421189826);
                        qzu0.a.getClass();
                        H = qzu0.H(M);
                    }
                    M.j();
                    lg90 lg90Var = H;
                    if (z5 && z3) {
                        i10 = R.string.music_talkback_remove_kids_playlist;
                    } else if (z5) {
                        i10 = R.string.music_talkback_remove_playlist;
                    } else if (z3) {
                        i10 = R.string.music_talkback_playlist_add_to_my_collection;
                    }
                    e(lg90Var, E2, null, d370.N(i10, 0, M), gzsVar3, M, 70 | ((i3 << 3) & 458752), 4);
                    if (z2) {
                        M.K(-171792376);
                        f9t.e(txj0.v(aVar3, 8), M, 6);
                        a(l050Var2.i, l050Var2.j, gzsVar5, ahn.E(aVar3, i(bi40Var)), M, 6 | ((i3 >> 9) & 7168));
                    } else {
                        M.K(i4);
                    }
                    M.j();
                    M.j();
                } else {
                    if (l050Var2.f || l050Var2.g) {
                        M.K(-171299724);
                        q630 E3 = ahn.E(tpg0Var.b(2.0f, aVar3, true), "addPlaylistButton");
                        if (z4) {
                            M.K(-421158466);
                            qzu0.a.getClass();
                            b = qzu0.y0(M);
                            M.j();
                            i5 = 0;
                        } else {
                            M.K(-421157514);
                            if (androidx.compose.runtime.b.d()) {
                                i5 = 0;
                                androidx.compose.runtime.b.f(849846374, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Add24> (VkSdkIcons.kt:12)");
                            } else {
                                i5 = 0;
                            }
                            b = or.b(M, -1058716730, R.drawable.vk_icon_add_24, M, i5);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            M.j();
                        }
                        lg90 lg90Var2 = b;
                        String N = d370.N(R.string.music_playlist_add, i5, M);
                        if (z5 && z3) {
                            i10 = R.string.music_talkback_remove_kids_playlist;
                        } else if (z5) {
                            i10 = R.string.music_talkback_remove_playlist;
                        } else if (z3) {
                            i10 = R.string.music_talkback_playlist_add_to_my_collection;
                        }
                        e(lg90Var2, E3, N, d370.N(i10, i5, M), gzsVar3, M, 70 | ((i3 << 3) & 458752), 0);
                    } else {
                        M.K(i4);
                    }
                    M.j();
                }
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
            s.d = new wzs() { // from class: xsna.b050
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k050.c(l050.this, q630Var, gzsVar, gzsVar2, gzsVar3, gzsVar4, gzsVar5, z, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final l050 l050Var, final q630 q630Var, final boolean z, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-45152690);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(l050Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.l(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-45152690, i2, -1, "com.vk.music.playlist.display.presentation.ShuffleButton (MusicPlaylistHeaderButtons.kt:304)");
            }
            aVar2 = M;
            bhu0.f(gzsVar, tpg0Var.b(1.0f, q630Var, true), false, null, null, null, null, null, null, g(M), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(-1011749339, new yzs() { // from class: xsna.f050
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i4;
                    int i5;
                    long h;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1011749339, intValue, -1, "com.vk.music.playlist.display.presentation.ShuffleButton.<anonymous> (MusicPlaylistHeaderButtons.kt:310)");
                        }
                        qzu0.a.getClass();
                        lg90 n1 = qzu0.n1(aVar3);
                        l050 l050Var2 = l050.this;
                        if (l050Var2.b) {
                            i4 = 1056049274;
                            i5 = R.string.music_talkback_shuffle_disable;
                        } else {
                            i4 = 1056153403;
                            i5 = R.string.music_talkback_shuffle_enable;
                        }
                        String a = zq.a(aVar3, i4, i5, aVar3, 0);
                        float v = hr80.z().v(ButtonSize.Medium, aVar3, 6);
                        q630.a aVar4 = q630.a.a;
                        q630 q = txj0.q(aVar4, v);
                        if (l050Var2.b) {
                            aVar3.K(1056377254);
                            h = s7g.a(R.color.vk_azure_300, aVar3);
                            aVar3.j();
                        } else {
                            aVar3.K(1056468518);
                            h = k050.h(aVar3);
                            aVar3.j();
                        }
                        pzu0.b(n1, a, q, h, aVar3, 8, 0);
                        if (z) {
                            aVar3.K(1056563347);
                            hr80.z().getClass();
                            op8.h();
                            f9t.e(txj0.v(aVar4, kqu0.s), aVar3, 0);
                            yqv0.c(d370.N(R.string.music_playlist_shuffle, 0, aVar3), null, 0L, null, null, 0, 0, null, 2, false, 0, 1, null, null, aVar3, 100663296, 48, 14078);
                            aVar3 = aVar3;
                        } else {
                            aVar3.K(1044260253);
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
            }, M), aVar2, (i2 >> 12) & 14, 1572864, 65020);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.g050
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k050.d(l050.this, q630Var, z, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final lg90 lg90Var, final q630 q630Var, String str, final String str2, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        String str3;
        androidx.compose.runtime.a aVar2;
        final String str4;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1077332454);
        int i4 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i4 == 0) {
            i3 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str3 = str;
            i3 |= M.J(str3) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= M.J(str2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= M.y(gzsVar) ? 131072 : 65536;
            }
            if (M.t(i3 & 1, (74899 & i3) == 74898)) {
                aVar2 = M;
                aVar2.h();
                str4 = str3;
            } else {
                String str5 = i5 != 0 ? null : str3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1077332454, i3, -1, "com.vk.music.playlist.display.presentation.SimpleButton (MusicPlaylistHeaderButtons.kt:222)");
                }
                String str6 = str5;
                aVar2 = M;
                bhu0.f(gzsVar, tpg0Var.b(1.0f, q630Var, true), false, null, null, null, null, null, null, g(M), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(1540881263, new qn20(lg90Var, str2, str5, 1), M), aVar2, (i3 >> 15) & 14, 1572864, 65020);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                str4 = str6;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.e050
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        k050.e(lg90.this, q630Var, str4, str2, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        str3 = str;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (M.t(i3 & 1, (74899 & i3) == 74898)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final long f(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-370512990, 0, -1, "com.vk.music.playlist.display.presentation.getButtonBackgroundColor (MusicPlaylistHeaderButtons.kt:379)");
        }
        long a = s7g.a(R.color.vk_gray_A40, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static final mgu0 g(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(836472797, 0, -1, "com.vk.music.playlist.display.presentation.getButtonColors (MusicPlaylistHeaderButtons.kt:385)");
        }
        bn20 z = hr80.z();
        long f = f(aVar);
        long h = h(aVar);
        long c = l5g.c(14, f(aVar), 0.64f);
        long c2 = l5g.c(14, h(aVar), 0.64f);
        z.getClass();
        mgu0 a = op8.a(f, c, h, c2, 0L, 0L, 0L, 0L, 0L, 0L, aVar, 0, 0, 1008);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static final long h(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-215208711, 0, -1, "com.vk.music.playlist.display.presentation.getButtonContentColor (MusicPlaylistHeaderButtons.kt:382)");
        }
        long a = s7g.a(R.color.vk_gray_800, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static final String i(bi40 bi40Var) {
        if (epx.f(bi40Var, bi40.c.a)) {
            return "downloadPlaylistButton";
        }
        if ((bi40Var instanceof bi40.b) || epx.f(bi40Var, bi40.d.a)) {
            return "downloadingButton";
        }
        if (epx.f(bi40Var, bi40.a.a)) {
            return "removeFromDownloadedButton";
        }
        throw new NoWhenBranchMatchedException();
    }
}
