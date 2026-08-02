package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.m3b0;
import xsna.q630;

/* compiled from: PlayerSettingsMviView.kt */
/* loaded from: classes3.dex */
public final class a4b0 extends i6v0<m3b0, h3b0> {
    public final boolean f;
    public final boolean g;

    /* compiled from: PlayerSettingsMviView.kt */
    @b6l(c = "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView$PlayerSettingsMenuContent$1$1$1$1$1", f = "PlayerSettingsMviView.kt", l = {149}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ String $equalizerDisabledReason;
        final /* synthetic */ dlv0 $snackbarHostState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dlv0 dlv0Var, String str, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$snackbarHostState = dlv0Var;
            this.$equalizerDisabledReason = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$snackbarHostState, this.$equalizerDisabledReason, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.$snackbarHostState.a();
                dlv0 dlv0Var = this.$snackbarHostState;
                String str = this.$equalizerDisabledReason;
                this.label = 1;
                if (dlv0.d(dlv0Var, str, null, this, 30) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* compiled from: PlayerSettingsMviView.kt */
    public static final class b {
        public static final float a = 4;
        public static final long b;

        static {
            float f = 12;
            b = byc0.b(f, f);
        }
    }

    public a4b0(o3b0 o3b0Var, Context context, boolean z, boolean z2) {
        super(context, o3b0Var);
        this.f = z;
        this.g = z2;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        n((m3b0) ao50Var, izsVar, aVar, 512);
    }

    @Override // xsna.i6v0
    public final void g(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1853635818);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(this) : M.y(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1853635818, i2, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.Theme (PlayerSettingsMviView.kt:82)");
            }
            if (this.f) {
                M.K(-1270029916);
                aVar2 = M;
                rrv0.e(true, null, null, null, null, null, kai.c(-1957958124, new s3b0(0, jaiVar), M), aVar2, 1572870, 62);
                aVar2.j();
            } else {
                M.K(-1269953377);
                rrv0.d(null, null, null, null, kai.c(-1801376161, new t3b0(0, jaiVar), M), M, 24576, 15);
                aVar2 = M;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new gs5(this, jaiVar, i);
        }
    }

    public final void h(int i, androidx.compose.runtime.a aVar, izs izsVar, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2 = z;
        androidx.compose.runtime.a M = aVar.M(-222522901);
        if ((i & 6) == 0) {
            i2 = (M.o(R.string.smooth_transition_between_tracks) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(R.string.smoothes_out_music_switching) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? M.J(this) : M.y(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-222522901, i2, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.CrossfadeMenuItem (PlayerSettingsMviView.kt:293)");
            }
            final String N = d370.N(R.string.smooth_transition_between_tracks, i2 & 14, M);
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i7 = i2;
            if (!(((double) 1.0f) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
                szw.a("invalid weight; must be greater than zero");
            }
            float f2 = 16;
            q630 E = s200.E(new xpy(1.0f, true), f2, 10);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            d8v0.a(new Pair(0, Integer.valueOf(N.length())), null, null, VkOnboarding$TintColor.Lime, this.g, false, false, null, kai.c(-973052031, new zzs() { // from class: xsna.z3b0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i8;
                    long j;
                    izs izsVar2 = (izs) obj;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i8 = (aVar4.y(izsVar2) ? 4 : 2) | intValue;
                    } else {
                        i8 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i8 |= aVar4.l(booleanValue) ? 32 : 16;
                    }
                    if (aVar4.t(i8 & 1, (i8 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-973052031, i8, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.CrossfadeMenuItem.<anonymous>.<anonymous>.<anonymous> (PlayerSettingsMviView.kt:311)");
                        }
                        if (booleanValue) {
                            aVar4.K(1199873766);
                            aVar4.j();
                            j = l5g.b;
                        } else {
                            aVar4.K(1199874764);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j = ylu0Var.getText().m;
                            aVar4.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        yqv0.c(N, null, j, null, null, 0, 0, null, 0, false, 0, 0, izsVar2, wuv0Var.N, aVar4, 0, (i8 << 6) & 896, 4090);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 805309440, 486);
            f9t.e(txj0.h(aVar2, 2), M, 6);
            String N2 = d370.N(R.string.smoothes_out_music_switching, (i7 >> 3) & 14, M);
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                i3 = -1;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N2, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.i0, M, 0, 0, 8186);
            M = M;
            M.G();
            if (z) {
                i5 = -1193174127;
                i6 = R.string.smoothes_out_music_switching_enabled;
                i4 = 0;
            } else {
                i4 = 0;
                i5 = -1193070928;
                i6 = R.string.smoothes_out_music_switching_disabled;
            }
            String a4 = zq.a(M, i5, i6, M, i4);
            q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            boolean J = M.J(a4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new et0(a4, 1);
                M.R(x);
            }
            q630 E2 = ahn.E(egi0.b(H, false, (izs) x), z ? "crossfadeSwitcherOn" : "crossfadeSwitcherOff");
            boolean z3 = (i7 & 7168) == 2048;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new nif(izsVar, 3);
                M.R(x2);
            }
            z2 = z;
            zov0.a(z2, (izs) x2, E2, false, null, M, (i7 >> 6) & 14, 24);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new yue(this, z2, izsVar, i);
        }
    }

    public final void i(final String str, final boolean z, final izs<? super Boolean, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1130762524);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1130762524, i2, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.EqualizerMenuItem (PlayerSettingsMviView.kt:223)");
            }
            q630 a2 = o19.a(txj0.f(q630.a.a, 1.0f), z ? 1.0f : 0.64f);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1785853730, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-SlidersVerticalOutline28> (VkIcons.kt:10004)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_sliders_vertical_outline_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.x a4 = com.vk.core.compose.component.cell.content.f.a(a3, size, ylu0Var.getIcon().b, null, null, M, 196664, 24);
            com.vk.core.compose.component.cell.content.h1 a5 = Cell$Middle.d.b.a(d370.N(R.string.equalizer_settings_menu, 0, M), null, null, 1, null, null, M, 12610560, 102);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new dl70(7);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.k0 a6 = Cell$Middle.a.a(a5, Cell$Middle.c.b.b(str, 1, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, (i2 & 14) | 12583344, 88), null, null, M, 196608, 28);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new gzs() { // from class: xsna.r3b0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        izs.this.invoke(Boolean.valueOf(z));
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            wiu0.b(a2, false, a4, a6, null, (gzs) x2, null, M, 0, 82);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.u3b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    a4b0.this.i(str, z, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void j(final int i, androidx.compose.runtime.a aVar, final izs izsVar, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        final boolean z2 = z;
        androidx.compose.runtime.a M = aVar.M(873413260);
        if ((i & 6) == 0) {
            i2 = (M.o(R.string.sound_normalization_title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(R.string.sound_normalization_subtitle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? M.J(this) : M.y(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(873413260, i2, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.NormalizationMenuItem (PlayerSettingsMviView.kt:349)");
            }
            String N = d370.N(R.string.sound_normalization_title, i2 & 14, M);
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i7 = i2;
            if (!(((double) 1.0f) > ConnectivityTracker.DEFAULT_UPLINK_BITRATE)) {
                szw.a("invalid weight; must be greater than zero");
            }
            float f2 = 16;
            q630 E = s200.E(new xpy(1.0f, true), f2, 10);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            d8v0.a(new Pair(0, Integer.valueOf(N.length())), null, null, VkOnboarding$TintColor.Lime, this.g, false, false, null, kai.c(1872909602, new w3b0(0, this, N), M), M, 805309440, 486);
            f9t.e(txj0.h(aVar2, 2), M, 6);
            String N2 = d370.N(R.string.sound_normalization_subtitle, (i7 >> 3) & 14, M);
            if (androidx.compose.runtime.b.d()) {
                i3 = -1;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                i3 = -1;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N2, null, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.i0, M, 0, 0, 8186);
            M = M;
            M.G();
            if (z) {
                i5 = 1271918169;
                i6 = R.string.sound_normalization_enabled;
                i4 = 0;
            } else {
                i4 = 0;
                i5 = 1272012440;
                i6 = R.string.sound_normalization_disabled;
            }
            String a4 = zq.a(M, i5, i6, M, i4);
            q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            boolean J = M.J(a4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new zw(a4, 5);
                M.R(x);
            }
            q630 b2 = egi0.b(H, false, (izs) x);
            boolean z3 = (i7 & 7168) == 2048;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new x3b0(izsVar, 0);
                M.R(x2);
            }
            z2 = z;
            zov0.a(z2, (izs) x2, b2, false, null, M, (i7 >> 6) & 14, 24);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.y3b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    a4b0.this.j(I, (androidx.compose.runtime.a) obj, izsVar, z2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(m3b0.b bVar, izs<? super h3b0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        izs<? super h3b0, s3q0> izsVar2;
        q630.a aVar3;
        dlv0 dlv0Var;
        int i2;
        int i3;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        String a2;
        Object obj;
        int i4;
        int i5;
        a4b0 a4b0Var = this;
        androidx.compose.runtime.a M = aVar.M(426018219);
        int i6 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(a4b0Var) ? 256 : 128);
        if (M.t(i6 & 1, (i6 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(426018219, i6, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.PlayerSettingsMenuContent (PlayerSettingsMviView.kt:108)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = yq.f(M);
            }
            dlv0 dlv0Var2 = (dlv0) x;
            Object x2 = M.x();
            if (x2 == c0012a2) {
                x2 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x2);
            }
            yvj yvjVar = (yvj) x2;
            q630.a aVar4 = q630.a.a;
            q630 B = txj0.B(aVar4, null, 3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 12;
            q630 E = ahn.E(hr80.m(B, ylu0Var.getBackground().r, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), "playerSettingsBottomSheet");
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630 f2 = txj0.f(aVar4, 1.0f);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, f2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            wh50 c3 = jk50.c(bVar.a, M);
            wh50 c4 = jk50.c(bVar.b, M);
            wh50 c5 = jk50.c(bVar.c, M);
            wh50 c6 = jk50.c(bVar.d, M);
            wh50 a4 = jk50.a(bVar.f, M, 0, 3);
            wh50 c7 = jk50.c(bVar.g, M);
            wh50 c8 = jk50.c(bVar.h, M);
            wh50 c9 = jk50.c(bVar.i, M);
            wh50 c10 = jk50.c(bVar.j, M);
            int i7 = i6 >> 3;
            a4b0Var.o(izsVar, M, (i7 & 112) | (i7 & 14) | 64);
            if (((Boolean) c10.getValue()).booleanValue()) {
                M.K(155692687);
                String N = d370.N(R.string.equalizer_disabled_because_player_is_not_up_notification_message, 0, M);
                boolean booleanValue = ((Boolean) c3.getValue()).booleanValue();
                boolean booleanValue2 = ((Boolean) c4.getValue()).booleanValue();
                boolean booleanValue3 = ((Boolean) c5.getValue()).booleanValue();
                ztp ztpVar = (ztp) c6.getValue();
                int i8 = 32768 | ((i6 << 6) & 57344);
                if (androidx.compose.runtime.b.d()) {
                    z2 = booleanValue2;
                    androidx.compose.runtime.b.f(1658928906, i8, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.getEqualizerSubtitle (PlayerSettingsMviView.kt:544)");
                } else {
                    z2 = booleanValue2;
                }
                if (booleanValue) {
                    z3 = false;
                    if (booleanValue3 && z2) {
                        M.K(797824651);
                        a2 = d370.O(R.string.equalizer_turned_on, new Object[]{d370.N(bup.b(ztpVar), 0, M)}, M);
                        M.j();
                    } else {
                        a2 = booleanValue3 ? zq.a(M, 797828764, R.string.equalizer_turned_off, M, 0) : zq.a(M, 797831037, R.string.equalizer_unavailable, M, 0);
                    }
                } else {
                    z3 = false;
                    a2 = zq.a(M, 797820066, R.string.equalizer_disabled_because_player_is_not_up__menu_item_subtitle, M, 0);
                }
                String str2 = a2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                boolean z4 = (((Boolean) c3.getValue()).booleanValue() && ((Boolean) c5.getValue()).booleanValue()) ? true : z3;
                boolean J = ((i6 & 112) == 32 ? true : z3) | M.J(c3) | M.y(yvjVar) | M.J(N);
                Object x3 = M.x();
                if (J || x3 == c0012a2) {
                    z = z3;
                    dlv0Var = dlv0Var2;
                    obj = null;
                    i4 = 6;
                    i5 = 149692947;
                    izsVar2 = izsVar;
                    i6 i6Var = new i6(izsVar2, yvjVar, c3, dlv0Var, N, 1);
                    M.R(i6Var);
                    x3 = i6Var;
                } else {
                    izsVar2 = izsVar;
                    z = z3;
                    dlv0Var = dlv0Var2;
                    obj = null;
                    i4 = 6;
                    i5 = 149692947;
                }
                c0012a = c0012a2;
                aVar3 = aVar4;
                i3 = i4;
                i2 = i5;
                boolean z5 = z4;
                a4b0Var = this;
                a4b0Var.i(str2, z5, (izs) x3, M, ((i6 << 3) & 7168) | 4096);
                aVar2 = M;
            } else {
                c0012a = c0012a2;
                izsVar2 = izsVar;
                aVar2 = M;
                aVar3 = aVar4;
                dlv0Var = dlv0Var2;
                i2 = 149692947;
                i3 = 6;
                z = false;
                aVar2.K(149692947);
            }
            aVar2.j();
            String str3 = (String) a4.getValue();
            boolean z6 = (i6 & 112) != 32 ? z : true;
            Object x4 = aVar2.x();
            if (z6 || x4 == c0012a) {
                x4 = new iz7(izsVar2, 5);
                aVar2.R(x4);
            }
            int i9 = i6 & 896;
            a4b0Var.m(str3, (gzs) x4, aVar2, 512 | i9);
            a4b0Var.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, aVar2, 560 | i9, 1);
            if (((Boolean) c10.getValue()).booleanValue()) {
                aVar2.K(157017224);
                int i10 = i6 << 6;
                a4b0Var.h((i10 & 57344) | (i10 & 7168) | 32768, aVar2, izsVar2, ((Boolean) c7.getValue()).booleanValue());
            } else {
                aVar2.K(i2);
            }
            aVar2.j();
            if (((Boolean) c10.getValue()).booleanValue() && ((Boolean) c8.getValue()).booleanValue()) {
                aVar2.K(157401996);
                int i11 = i6 << 6;
                a4b0Var.j((i11 & 57344) | (i11 & 7168) | 32768, aVar2, izsVar2, ((Boolean) c9.getValue()).booleanValue());
            } else {
                aVar2.K(i2);
            }
            aVar2.j();
            a4b0Var.q(bVar, izsVar2, aVar2, (i6 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512 | i9);
            a4b0Var.l(32, false, aVar2, 518 | i9, 2);
            aVar2.G();
            q630 b2 = ra8.a.b(aVar3, dt1.a.i);
            l7k0 b3 = dlv0Var.b();
            if (b3 == null || (str = b3.a) == null) {
                str = "";
            }
            zkv0.c(dlv0Var, wlb0.m(str, null, null, aVar2, i3), b2, null, null, null, aVar2, 6, 120);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new fe4(this, bVar, izsVar, i, 3);
        }
    }

    public final void l(float f, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final boolean z2;
        androidx.compose.runtime.a M = aVar.M(-61242095);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (M.n(f) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.l(z) ? 32 : 16;
        }
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                f = 24;
            }
            boolean z3 = i5 != 0 ? false : z;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-61242095, i3, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.Separator (PlayerSettingsMviView.kt:399)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f2 = txj0.f(txj0.h(aVar2, f), 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (z3) {
                M.K(2103716994);
                q630 F = s200.F(12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(txj0.h(aVar2, (float) 0.33d), 1.0f));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                ja8.a(hr80.m(F, ylu0Var.p().a, androidx.compose.ui.graphics.e.a), M, 0);
            } else {
                M.K(2087072629);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z2 = z3;
        } else {
            M.h();
            z2 = z;
        }
        final float f3 = f;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.v3b0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a4b0.this.l(f3, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    public final void m(String str, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        String str2;
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar.M(-1036504433);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1036504433, i2, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.SleepTimerMenuItem (PlayerSettingsMviView.kt:258)");
            }
            q630 f = txj0.f(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2132105284, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ClockOutline28> (VkSdkIcons.kt:548)");
            }
            lg90 b2 = or.b(M, 723000486, R.drawable.vk_icon_clock_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Medium;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.x a2 = com.vk.core.compose.component.cell.content.f.a(b2, size, ylu0Var.getIcon().b, null, null, M, 196664, 24);
            com.vk.core.compose.component.cell.content.h1 a3 = Cell$Middle.d.b.a(d370.N(R.string.music_sleep_timer, 0, M), null, null, 1, null, null, M, 12610560, 102);
            com.vk.core.compose.component.cell.content.h1 h1Var = null;
            if (str == null) {
                M.K(-1982964828);
                M.j();
                aVar3 = M;
            } else {
                M.K(-1982964827);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new p2u(17);
                    M.R(x);
                }
                h1Var = Cell$Middle.c.b.b(str, 1, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 12583344, 88);
                aVar3 = M;
                aVar3.j();
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            aVar2 = aVar4;
            str2 = str;
            gzsVar2 = gzsVar;
            wiu0.b(f, false, a2, Cell$Middle.a.a(a3, h1Var, null, null, aVar4, 196608, 28), null, gzsVar2, null, aVar2, ((i2 << 12) & 458752) | 6, 82);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            gzsVar2 = gzsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qi1(this, str2, gzsVar2, i);
        }
    }

    public final void n(m3b0 m3b0Var, izs<? super h3b0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1167122454);
        int i2 = (M.J(m3b0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1167122454, i2, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.ThemedContent (PlayerSettingsMviView.kt:94)");
            }
            fm50 fm50Var = (fm50) d(m3b0.a.a, (n0u0[]) Arrays.copyOf(new n0u0[]{m3b0Var.a}, 1), M, (((((i2 << 3) & 7168) | 4102) >> 3) & 896) | 6).getValue();
            if (fm50Var instanceof m3b0.b) {
                M.K(-1862061490);
                k((m3b0.b) fm50Var, izsVar, M, (i2 & 896) | (i2 & 112) | 512);
            } else {
                M.K(-1866311807);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zl3(i, 5, this, m3b0Var, izsVar);
        }
    }

    public final void o(izs<? super h3b0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(833126745);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(833126745, i2, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.TitleRow (PlayerSettingsMviView.kt:190)");
            }
            q630.a aVar3 = q630.a.a;
            float f = 14;
            q630 G = s200.G(txj0.f(aVar3, 1.0f), f, f, 16, 18);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 d = rte0.d(txj0.q(aVar3, 28), vog0.a);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new nac(izsVar, 5);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(d, false, null, null, (gzs) x, 15), "closeButton");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-218864772, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel28> (VkSdkIcons.kt:236)");
            }
            lg90 b2 = or.b(M, -439898899, R.drawable.vk_icon_cancel_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b2, d370.N(R.string.accessibility_close, 0, M), E, wlb0.h(M).getIcon().b, M, 8, 0);
            f9t.e(txj0.v(aVar3, f), M, 6);
            aVar2 = M;
            yqv0.c(d370.N(R.string.music_player_settings_menu_title, 0, M), null, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).f, aVar2, 0, 0, 8186);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ct3(this, izsVar, i, 3);
        }
    }

    public final void p(gzs gzsVar, gzs gzsVar2, i0k0 i0k0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1182785719);
        int i2 = (M.y(gzsVar) ? 4 : 2) | i | (M.y(gzsVar2) ? 32 : 16) | (M.J(i0k0Var) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1182785719, i2, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.Track (PlayerSettingsMviView.kt:494)");
            }
            q630.a aVar2 = q630.a.a;
            q630 h = txj0.h(txj0.f(aVar2, 1.0f), b.a);
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zgb(i0k0Var, gzsVar2, gzsVar, 5);
                M.R(x);
            }
            xa4.i(0, M, (izs) x, h);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jta0(this, gzsVar, gzsVar2, i0k0Var, q630Var2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x018b, code lost:
    
        if (r10 == r8) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(m3b0.b bVar, izs<? super h3b0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(1425330913);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1425330913, i2, -1, "com.vk.music.bottomsheets.playermenu.PlayerSettingsMviView.VolumeRow (PlayerSettingsMviView.kt:423)");
            }
            q630.a aVar3 = q630.a.a;
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(txj0.h(ahn.E(aVar3, "volumeRow"), 41), 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = ir.h(M);
            }
            sg50 sg50Var = (sg50) x;
            wh50 c2 = jk50.c(bVar.e, M);
            q630 H = s200.H(txj0.q(aVar3, 24), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1065969246, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Volume24> (VkIcons.kt:11808)");
            }
            lg90 b2 = or.b(M, 698544394, R.drawable.vk_icon_volume_24, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b2, null, H, wlb0.h(M).getIcon().b, M, 440, 0);
            m0k0 m0k0Var = m0k0.a;
            i0k0 c3 = m0k0.c(wlb0.h(M).m().b, wlb0.h(M).m().b, wlb0.h(M).b().a, M, 0);
            q630 f = txj0.f(aVar3, 1.0f);
            float floatValue = ((Number) c2.getValue()).floatValue();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x2 = M.x();
            if (z) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x2 = new p3b0(izsVar, 0);
            M.R(x2);
            izs izsVar2 = (izs) x2;
            boolean z2 = i3 == 32;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new zyf(izsVar, 5);
                M.R(x3);
            }
            x0k0.a(floatValue, izsVar2, f, false, (gzs) x3, null, null, kai.c(-1614857151, new azf(2, sg50Var, c3), M), kai.c(-2099802400, new q3b0(0, this, c3), M), null, M, 905970048, 1256);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n77(this, bVar, izsVar, i, 4);
        }
    }
}
