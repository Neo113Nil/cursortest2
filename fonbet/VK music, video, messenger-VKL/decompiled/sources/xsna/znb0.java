package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vk.core.compose.component.defaults.CellButton$IconSize;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Map;
import xsna.q630;

/* compiled from: PollEditorAnswersList.kt */
/* loaded from: classes4.dex */
public final class znb0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final List list, final List list2, final Map map, final PollEditorUiConfig pollEditorUiConfig, final gzs gzsVar, final wzs wzsVar, final izs izsVar, final gzs gzsVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        gzs gzsVar3;
        androidx.compose.runtime.a aVar2;
        boolean z;
        String str;
        boolean z2;
        String str2;
        String str3;
        List list3 = list;
        List list4 = list2;
        Map map2 = map;
        int i3 = pollEditorUiConfig.f;
        androidx.compose.runtime.a M = aVar.M(-958563541);
        if ((i & 6) == 0) {
            i2 = (M.J(list3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(map2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? M.J(pollEditorUiConfig) : M.y(pollEditorUiConfig) ? 2048 : 1024;
        }
        if ((196608 & i) == 0) {
            gzsVar3 = gzsVar;
            i2 |= M.y(gzsVar3) ? 131072 : 65536;
        } else {
            gzsVar3 = gzsVar;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(wzsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= M.y(izsVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= M.y(gzsVar2) ? 67108864 : 33554432;
        }
        if (M.t(i2 & 1, (38339731 & i2) != 38339730)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-958563541, i2, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollAnswersList (PollEditorAnswersList.kt:37)");
            }
            baf0 b = dhr0.t.b(R.drawable.vk_icon_cancel_outline_24, R.attr.vk_ui_icon_secondary);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            M.K(-2056537382);
            int size = list3.size();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                qv2 qv2Var = (qv2) list3.get(i4);
                M.W(-2056534970, qv2Var);
                int i6 = i2;
                boolean contains = list4.contains(qv2Var);
                if (contains) {
                    i5++;
                }
                int i7 = i5;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    iv2 iv2Var = (iv2) map2.get(qv2Var);
                    if (iv2Var == null || (str3 = iv2Var.b) == null) {
                        str3 = "";
                    }
                    x2 = androidx.compose.runtime.k.b(str3);
                    M.R(x2);
                }
                wh50 wh50Var2 = (wh50) x2;
                boolean f = epx.f(qv2Var, j5g.k0(new wow(list4)));
                boolean o = M.o(((String) wh50Var2.getValue()).length());
                Object x3 = M.x();
                if (o || x3 == c0012a) {
                    z = f;
                    x3 = Boolean.valueOf(((String) wh50Var2.getValue()).length() >= i3 - pollEditorUiConfig.g);
                    M.R(x3);
                } else {
                    z = f;
                }
                boolean booleanValue = ((Boolean) x3).booleanValue();
                boolean o2 = M.o(((String) wh50Var2.getValue()).length()) | M.o(i3);
                Object x4 = M.x();
                if (o2 || x4 == c0012a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(((String) wh50Var2.getValue()).length());
                    sb.append('/');
                    sb.append(i3);
                    x4 = sb.toString();
                    M.R(x4);
                }
                String str4 = (String) x4;
                if (z && ((Boolean) wh50Var.getValue()).booleanValue()) {
                    str = "";
                    z2 = true;
                } else {
                    str = "";
                    z2 = false;
                }
                String str5 = (String) wh50Var2.getValue();
                int i8 = i3;
                boolean z3 = list2.size() > pollEditorUiConfig.d;
                if (i7 == 1) {
                    str2 = zq.a(M, -2056497182, R.string.poll_editor_options_title, M, 0);
                } else {
                    M.K(673155667);
                    M.j();
                    str2 = str;
                }
                String O = d370.O(R.string.poll_editor_option_hint, new Object[]{Integer.valueOf(i7)}, M);
                String O2 = d370.O(R.string.poll_editor_accessibility_remove_option, new Object[]{Integer.valueOf(i7)}, M);
                int i9 = pollEditorUiConfig.f;
                String a = lhg.a(i7, "pollEditorAnswerVariant");
                String a2 = lhg.a(i7, "pollEditorAnswerVariantLengthCounter");
                String a3 = lhg.a(i7, "pollEditorAnswerVariantDeleteButton");
                String str6 = str2;
                boolean J = ((i6 & 3670016) == 1048576) | M.J(qv2Var);
                Object x5 = M.x();
                if (J || x5 == c0012a) {
                    x5 = new n87(wzsVar, qv2Var, wh50Var2, 6);
                    M.R(x5);
                }
                wzs wzsVar2 = (wzs) x5;
                boolean J2 = ((i6 & 29360128) == 8388608) | M.J(qv2Var);
                Object x6 = M.x();
                if (J2 || x6 == c0012a) {
                    x6 = new ysd(izsVar, qv2Var, wh50Var2, 9);
                    M.R(x6);
                }
                a.C0011a.C0012a c0012a2 = c0012a;
                androidx.compose.runtime.a aVar3 = M;
                int i10 = i4;
                int i11 = size;
                xnb0.a(i10, contains, str5, booleanValue, str4, str6, O, O2, a, a2, a3, i9, z2, z3, wzsVar2, (izs) x6, gzsVar3, b, aVar3, 196608, (i6 << 6) & 29360128);
                M = aVar3;
                if (z && ((Boolean) wh50Var.getValue()).booleanValue()) {
                    wh50Var.setValue(Boolean.FALSE);
                }
                M.a0();
                i4 = i10 + 1;
                map2 = map;
                gzsVar3 = gzsVar;
                c0012a = c0012a2;
                i2 = i6;
                size = i11;
                i5 = i7;
                i3 = i8;
                list3 = list;
                list4 = list2;
            }
            int i12 = i2;
            a.C0011a.C0012a c0012a3 = c0012a;
            M.j();
            String N = d370.N(R.string.poll_editor_add_option, 0, M);
            qzu0.a.getClass();
            lg90 d = qzu0.d(M);
            CellButton$Appearance cellButton$Appearance = CellButton$Appearance.Accent;
            CellButton$IconSize cellButton$IconSize = CellButton$IconSize.Small;
            boolean z4 = list2.size() < pollEditorUiConfig.e;
            q630 f2 = txj0.f(ahn.E(q630.a.a, "pollEditorAddAnswerButton"), 1.0f);
            boolean z5 = (i12 & 234881024) == 67108864;
            Object x7 = M.x();
            if (z5 || x7 == c0012a3) {
                x7 = new u14(17, gzsVar2, wh50Var);
                M.R(x7);
            }
            aVar2 = M;
            qiu0.a(N, (gzs) x7, f2, d, null, null, 0, cellButton$Appearance, null, cellButton$IconSize, null, z4, aVar2, 817893760, 5488);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ynb0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    znb0.a(list, list2, map, pollEditorUiConfig, gzsVar, wzsVar, izsVar, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
