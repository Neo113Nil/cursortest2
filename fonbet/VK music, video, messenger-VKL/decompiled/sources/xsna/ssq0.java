package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.e3m;
import xsna.q630;

/* compiled from: UserProfileMusicTrack.kt */
/* loaded from: classes5.dex */
public final class ssq0 {
    public static final void a(final String str, final String str2, final String str3, final String str4, final efj efjVar, final boolean z, final Boolean bool, final boolean z2, final String str5, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.a aVar2;
        int i5;
        final z190 z190Var;
        int i6;
        int i7;
        int i8;
        q630.a aVar3;
        androidx.compose.runtime.a aVar4;
        com.vk.core.compose.component.cell.content.x xVar;
        com.vk.core.compose.component.cell.content.y0 y0Var;
        androidx.compose.runtime.a M = aVar.M(798533783);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(efjVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.l(z) ? 131072 : 65536;
        }
        int i9 = 1572864 & i;
        q630.a aVar5 = q630.a.a;
        if (i9 == 0) {
            i3 |= M.J(aVar5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= M.J(bool) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= M.l(z2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= M.J(str5) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.y(gzsVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(798533783, i3, i4, "com.vk.profile.core.tabs.ui.music.MilkshakeImpl (UserProfileMusicTrack.kt:220)");
            }
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (bool == null) {
                M.K(-703517585);
                M.j();
                i5 = i3;
                z190Var = tgp.a;
            } else {
                M.K(-703482834);
                boolean booleanValue = bool.booleanValue();
                int i10 = (i3 >> 21) & 14;
                if (androidx.compose.runtime.b.d()) {
                    i5 = i3;
                    androidx.compose.runtime.b.f(-2069450341, i10, -1, "com.vk.music.compose.rememberPlayingOverlay (MusicPlayingOverlay.kt:36)");
                } else {
                    i5 = i3;
                }
                Object x = M.x();
                if (x == c0012a) {
                    x = new fz40(booleanValue);
                    M.R(x);
                }
                fz40 fz40Var = (fz40) x;
                ((zak0) fz40Var.a).setValue(bool);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                z190Var = fz40Var;
            }
            int i11 = i5 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2055271803, i11, -1, "com.vk.profile.core.tabs.ui.music.rememberMilkshakeTitleText (UserProfileMusicTrack.kt:292)");
            }
            iyk0 iyk0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) M.r(iyk0Var);
            boolean J = ((((i5 & 14) ^ 6) > 4 && M.J(str)) || (i5 & 6) == 4) | M.J(context) | ((((i5 & 112) ^ 48) > 32 && M.J(str2)) || (i5 & 48) == 32);
            Object x2 = M.x();
            int i12 = i4;
            if (J || x2 == c0012a) {
                ucp ucpVar = ucp.a;
                x2 = ws2.d(ucp.j(s490.d(context, str, str2, R.attr.vk_ui_text_secondary), null), null);
                M.R(x2);
            }
            us2 us2Var = (us2) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i13 = (i5 >> 12) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1081148570, i13, -1, "com.vk.profile.core.tabs.ui.music.rememberMilkshakeLeft (UserProfileMusicTrack.kt:329)");
            }
            com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(Cell$Left.Main.a.C0731a.a(kai.c(1026264846, new zzs() { // from class: xsna.rsq0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    q630 q630Var = (q630) obj2;
                    androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= aVar6.J(q630Var) ? 32 : 16;
                    }
                    if (aVar6.t(intValue & 1, (intValue & 145) != 144)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1026264846, intValue, -1, "com.vk.profile.core.tabs.ui.music.rememberMilkshakeLeft.<anonymous> (UserProfileMusicTrack.kt:332)");
                        }
                        uog0 b = vog0.b(10);
                        float f = 48;
                        q630 q = txj0.q(q630Var, f);
                        float f2 = (float) 0.5d;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        y18 a2 = aqw.a(f2, ylu0Var.getImage().a);
                        gdv0.c(efj.this, f, r18.b(a2.a, a2.b, q, b), PictureRadius.Large, null, z190Var, null, aVar6, 3120, 80);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar6.h();
                    }
                    return s3q0.a;
                }
            }, M), M), null, M, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i14 = (i5 >> 15) & 14;
            M.K(542126976);
            if (androidx.compose.runtime.b.d()) {
                i6 = -1;
                androidx.compose.runtime.b.f(542126976, i14, -1, "com.vk.profile.core.tabs.ui.music.rememberMilkshakeExplicit (UserProfileMusicTrack.kt:272)");
            } else {
                i6 = -1;
            }
            if (z) {
                Context context2 = (Context) M.r(iyk0Var);
                boolean J2 = M.J(context2);
                Object x3 = M.x();
                if (J2 || x3 == c0012a) {
                    e3m.a aVar6 = e3m.a;
                    x3 = m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context2);
                    M.R(x3);
                }
                i7 = i6;
                i8 = i12;
                aVar3 = aVar5;
                com.vk.core.compose.component.cell.content.x a2 = Cell$Middle.d.a.InterfaceC0732a.C0733a.a(w65.p((Drawable) x3, M, 0), l5g.k, null, null, M, 24632, 12);
                aVar4 = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                xVar = a2;
            } else {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                aVar3 = aVar5;
                i7 = i6;
                xVar = null;
                aVar4 = M;
                i8 = i12;
            }
            if (str4.length() == 0) {
                aVar4.K(-703102185);
                aVar4.j();
                y0Var = null;
            } else {
                aVar4.K(-703072332);
                int i15 = ((i5 >> 9) & 14) | ((i5 >> 24) & 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-375698235, i15, i7, "com.vk.profile.core.tabs.ui.music.rememberMilkshakeRight (UserProfileMusicTrack.kt:308)");
                }
                boolean z3 = (((i15 & 112) ^ 48) > 32 && aVar4.J(str5)) || (i15 & 48) == 32;
                Object x4 = aVar4.x();
                if (z3 || x4 == c0012a) {
                    com.vk.core.compose.component.semantics.a a3 = str5 != null ? com.vk.core.compose.component.semantics.b.a(SemanticsConfiguration.Mode.ClearAndSet, new ow00(str5, 1), 2) : null;
                    aVar4.R(a3);
                    x4 = a3;
                }
                androidx.compose.runtime.a aVar7 = aVar4;
                com.vk.core.compose.component.cell.content.y0 a4 = o.c.a(com.vk.core.compose.component.cell.content.m.a(str4, (SemanticsConfiguration) x4, aVar4, (i15 & 14) | 384, 0), null, null, null, null, aVar7, 62);
                aVar4 = aVar7;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar4.j();
                y0Var = a4;
            }
            q630 f = txj0.f(aVar3, 1.0f);
            Object x5 = aVar4.x();
            if (x5 == c0012a) {
                x5 = new qyn0(3);
                aVar4.R(x5);
            }
            androidx.compose.runtime.a aVar8 = aVar4;
            wiu0.b(f, z2, a, Cell$Middle.a.a(Cell$Middle.d.b.b(us2Var, null, null, xVar, 1, 2, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), null, null, aVar8, 221184, 6, 902), Cell$Middle.c.b.a(ws2.e(str3), null, 1, 2, null, null, null, null, aVar8, 805309824, 498), null, null, aVar8, 196608, 28), y0Var, gzsVar, null, aVar8, ((i5 >> 21) & 112) | ((i8 << 15) & 458752), 64);
            aVar2 = aVar8;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qsq0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ssq0.a(str, str2, str3, str4, efjVar, z, bool, z2, str5, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, final String str3, final efj efjVar, q630 q630Var, final String str4, final boolean z, final Boolean bool, final boolean z2, final String str5, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(250534596);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(str3) ? 256 : 128) | (M.J(efjVar) ? 2048 : 1024) | 24576 | (M.J(str4) ? 131072 : 65536) | (M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(bool) ? 8388608 : 4194304) | (M.l(z2) ? 67108864 : 33554432) | (M.J(str5) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i3 = M.y(gzsVar) ? 4 : 2;
        if (M.t(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(250534596, i2, i3, "com.vk.profile.core.tabs.ui.music.UserProfileMusicTrack (UserProfileMusicTrack.kt:68)");
            }
            M.K(-976208079);
            int i4 = i2 << 3;
            a(str, str4, str2, str3, efjVar, z, bool, z2, str5, gzsVar, M, (i2 & 14) | ((i2 >> 12) & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (458752 & (i2 >> 3)) | 1572864 | (29360128 & i2) | (234881024 & i2) | (i2 & 1879048192), i3 & 14);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, str2, str3, efjVar, q630Var2, str4, z, bool, z2, str5, gzsVar, i) { // from class: xsna.psq0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ efj e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ String g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ Boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ String k;
                public final /* synthetic */ gzs l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ssq0.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
