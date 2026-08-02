package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Map;
import xsna.q630;
import xsna.xpb0;

/* compiled from: PollEditorModal.kt */
/* loaded from: classes4.dex */
public final class pob0 {
    public static final void a(final xpb0.a aVar, final yrb0 yrb0Var, final aob0 aob0Var, final q630 q630Var, final List list, final List list2, final Map map, final PollEditorUiConfig pollEditorUiConfig, final wzs wzsVar, final izs izsVar, final gzs gzsVar, final izs izsVar2, final izs izsVar3, final gzs gzsVar2, final gzs gzsVar3, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(-2017095947);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.J(yrb0Var) ? 32 : 16) | (M.J(aob0Var) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024) | (M.J(new wow(list)) ? 16384 : 8192) | (M.J(new wow(list2)) ? 131072 : 65536) | (M.J(new bpw(map)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(pollEditorUiConfig) ? 8388608 : 4194304) | (M.y(wzsVar) ? 67108864 : 33554432) | (M.y(izsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i3 = (M.y(gzsVar) ? 4 : 2) | (M.y(izsVar2) ? 32 : 16) | (M.y(izsVar3) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024) | (M.y(gzsVar3) ? 16384 : 8192);
        if (M.t(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 9363) == 9362) ? false : true)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2017095947, i2, i3, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollEditorContent (PollEditorModal.kt:47)");
            }
            boolean s = p490.s(p490.u(yrb0Var, list, list2, map, null, false), pollEditorUiConfig);
            boolean z = ((i3 & 896) == 256) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new defpackage.u(28, izsVar3, yrb0Var);
                M.R(x);
            }
            gzs gzsVar4 = (gzs) x;
            if (!s) {
                gzsVar4 = null;
            }
            jai c = kai.c(548739982, new q85(8, gzsVar4, izsVar2), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar3 = M;
            phv0.b(q630Var, c, null, null, null, 0, ylu0Var.getBackground().r, 0L, kai.c(-482074855, new yzs() { // from class: xsna.oob0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar4.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-482074855, intValue, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollEditorContent.<anonymous> (PollEditorModal.kt:79)");
                        }
                        eob0.a(xpb0.a.this, yrb0Var, aob0Var, q630.a.a, list, list2, map, pollEditorUiConfig, izsVar2, wzsVar, izsVar, gzsVar, gzsVar2, gzsVar3, aVar4, 3072);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar3, ((i2 >> 9) & 14) | 805306416, 380);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s2 = aVar3.s();
        if (s2 != null) {
            s2.d = new wzs(yrb0Var, aob0Var, q630Var, list, list2, map, pollEditorUiConfig, wzsVar, izsVar, gzsVar, izsVar2, izsVar3, gzsVar2, gzsVar3, i) { // from class: xsna.nob0
                public final /* synthetic */ yrb0 c;
                public final /* synthetic */ aob0 d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ List f;
                public final /* synthetic */ List g;
                public final /* synthetic */ Map h;
                public final /* synthetic */ PollEditorUiConfig i;
                public final /* synthetic */ wzs j;
                public final /* synthetic */ izs k;
                public final /* synthetic */ gzs l;
                public final /* synthetic */ izs m;
                public final /* synthetic */ izs n;
                public final /* synthetic */ gzs o;
                public final /* synthetic */ gzs p;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    pob0.a(xpb0.a.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
