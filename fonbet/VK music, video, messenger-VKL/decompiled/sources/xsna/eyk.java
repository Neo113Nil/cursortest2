package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.datetime.EditingMode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Date;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DatePickerDialog.kt */
/* loaded from: classes17.dex */
public final class eyk {
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final izs izsVar, q630 q630Var, SemanticsConfiguration semanticsConfiguration, final Date date, final Date date2, final Date date3, final gzs gzsVar, final gzs gzsVar2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        SemanticsConfiguration semanticsConfiguration2;
        int i5;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final SemanticsConfiguration semanticsConfiguration3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(118174159);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                semanticsConfiguration2 = semanticsConfiguration;
                i3 |= M.J(semanticsConfiguration2) ? 2048 : 1024;
                i5 = i3 | 24576;
                if ((196608 & i) == 0) {
                    i5 |= M.y(date) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i5 |= M.y(date2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                if ((i & 12582912) == 0) {
                    i5 |= M.y(date3) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i5 |= M.y(gzsVar) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    i5 |= M.y(gzsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                }
                if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
                    q630 q630Var4 = i6 != 0 ? q630.a.a : q630Var2;
                    SemanticsConfiguration semanticsConfiguration4 = i4 != 0 ? null : semanticsConfiguration2;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(118174159, i5, -1, "com.vk.core.tool.compose.dialogs.DatePickerDialog (DatePickerDialog.kt:39)");
                    }
                    com.vk.core.compose.component.datetime.l.a.getClass();
                    DateTimePickerState a = com.vk.core.compose.component.datetime.i.a(date, null, null, new fai0(date2, date3), DateTimePickerState.UpdateValueFromDialogsStrategy.Transaction, M, ((i5 >> 15) & 14) | 24576, 6);
                    jai c = kai.c(-1191354413, new fn7(str, a, semanticsConfiguration4, 4), M);
                    boolean z = (1879048192 & i5) == 536870912;
                    Object x = M.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (z || x == c0012a) {
                        x = new nvg(gzsVar2, 10);
                        M.R(x);
                    }
                    izs izsVar2 = (izs) x;
                    q630 q630Var5 = q630Var4;
                    String N = d370.N(R.string.date_picker_dialog_button_change, 0, M);
                    boolean J = ((i5 & 112) == 32) | M.J(a);
                    Object x2 = M.x();
                    if (J || x2 == c0012a) {
                        x2 = new tx(10, (Object) a, izsVar);
                        M.R(x2);
                    }
                    Alert$Button.Style style = Alert$Button.Style.Neutral;
                    Alert$Button alert$Button = new Alert$Button(N, (gzs) x2, style, null);
                    String N2 = d370.N(R.string.date_picker_dialog_button_cancel, 0, M);
                    boolean z2 = (234881024 & i5) == 67108864;
                    Object x3 = M.x();
                    if (z2 || x3 == c0012a) {
                        x3 = new cf4(1, gzsVar);
                        M.R(x3);
                    }
                    p7u0.d(((i5 << 3) & 7168) | 6, M, alert$Button, new Alert$Button(N2, (gzs) x3, style, null), c, null, izsVar2, q630Var5);
                    aVar2 = M;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    semanticsConfiguration3 = semanticsConfiguration4;
                    q630Var3 = q630Var5;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    q630Var3 = q630Var2;
                    semanticsConfiguration3 = semanticsConfiguration2;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.dyk
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            eyk.a(str, izsVar, q630Var3, semanticsConfiguration3, date, date2, date3, gzsVar, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            semanticsConfiguration2 = semanticsConfiguration;
            i5 = i3 | 24576;
            if ((196608 & i) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        semanticsConfiguration2 = semanticsConfiguration;
        i5 = i3 | 24576;
        if ((196608 & i) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if (M.t(i5 & 1, (i5 & 306783379) != 306783378)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void b(String str, DateTimePickerState dateTimePickerState, q630 q630Var, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(404226621);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(dateTimePickerState) ? 32 : 16) | 384 | (M.J(semanticsConfiguration) ? 2048 : 1024) | (M.J(null) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(404226621, i2, -1, "com.vk.core.tool.compose.dialogs.DatePickerDialogContent (DatePickerDialog.kt:85)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, 7);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, H, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.z, aVar2, (i2 & 14) | 48, 0, 8184);
            int i3 = i2 >> 3;
            com.vk.core.compose.component.datetime.p.b(dateTimePickerState, txj0.f(aVar3, 1.0f), semanticsConfiguration, null, null, null, false, EditingMode.Picker, aVar2, (i3 & 14) | 100663344 | (i3 & 896) | (i3 & 7168), PsExtractor.VIDEO_STREAM_MASK);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ehf(str, dateTimePickerState, q630Var2, semanticsConfiguration, i, 1);
        }
    }
}
