package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.Map;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.xpb0;

/* compiled from: PollEditorContainer.kt */
/* loaded from: classes4.dex */
public final class eob0 {
    public static final void a(final xpb0.a aVar, final yrb0 yrb0Var, final bob0 bob0Var, final q630 q630Var, final List list, final List list2, final Map map, final PollEditorUiConfig pollEditorUiConfig, final izs izsVar, final wzs wzsVar, final izs izsVar2, final gzs gzsVar, final gzs gzsVar2, final gzs gzsVar3, androidx.compose.runtime.a aVar2, final int i) {
        q630.a aVar3;
        q630.a aVar4;
        int i2;
        float f;
        int i3 = pollEditorUiConfig.b;
        String str = yrb0Var.a;
        androidx.compose.runtime.a M = aVar2.M(-6846125);
        int i4 = i | (M.J(aVar) ? 4 : 2) | (M.J(yrb0Var) ? 32 : 16) | (M.J(bob0Var) ? 256 : 128) | (M.J(new wow(list)) ? 16384 : 8192) | (M.J(new wow(list2)) ? 131072 : 65536) | (M.J(new bpw(map)) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(pollEditorUiConfig) ? 8388608 : 4194304) | (M.y(izsVar) ? 67108864 : 33554432) | (M.y(wzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i5 = (M.y(izsVar2) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.y(gzsVar3) ? 2048 : 1024);
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-6846125, i4, i5, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollEditorContainer (PollEditorContainer.kt:54)");
            }
            int i6 = i4 >> 9;
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630.a aVar6 = q630.a.a;
            q630 D2 = p490.D(n34.t(txj0.f(aVar6, 1.0f), dz5.I(0, 1, M, false), null), p490.x(M), 14);
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, D2);
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
            k9q0.w(M, a, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean o = M.o(str.length());
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (o || x == c0012a) {
                x = Boolean.valueOf(str.length() >= i3 - pollEditorUiConfig.c);
                M.R(x);
            }
            boolean booleanValue = ((Boolean) x).booleanValue();
            boolean o2 = M.o(str.length()) | M.o(i3);
            Object x2 = M.x();
            if (o2 || x2 == c0012a) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.length());
                sb.append('/');
                sb.append(i3);
                x2 = sb.toString();
                M.R(x2);
            }
            String str2 = (String) x2;
            String str3 = yrb0Var.a;
            int i7 = pollEditorUiConfig.b;
            int i8 = i4 & 896;
            boolean z = i8 == 256;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                aVar3 = aVar6;
                dob0 dob0Var = new dob0(1, bob0Var, bob0.class, "applyQuestion", "applyQuestion(Ljava/lang/String;)V", 0);
                M.R(dob0Var);
                x3 = dob0Var;
            } else {
                aVar3 = aVar6;
            }
            q630.a aVar7 = aVar3;
            cpb0.a(str3, booleanValue, str2, i7, null, (izs) ((fcy) x3), gzsVar3, M, (i5 << 9) & 3670016);
            float f2 = 12;
            f9t.e(txj0.h(aVar7, f2), M, 6);
            int i9 = i4 >> 12;
            int i10 = i5 << 21;
            znb0.a(list, list2, map, pollEditorUiConfig, gzsVar3, wzsVar, izsVar2, gzsVar, M, (i9 & 7168) | (i9 & 14) | 24576 | (i9 & 112) | (i9 & 896) | ((i5 << 6) & 458752) | (i6 & 3670016) | (29360128 & i10) | (i10 & 234881024));
            M = M;
            f9t.e(txj0.h(aVar7, 8), M, 6);
            ppb0.a(aVar.g, yrb0Var, bob0Var, izsVar, ahn.E(aVar7, "pollEditorSettings"), M, (i4 & 112) | 24576 | i8 | ((i4 >> 15) & 7168));
            if (epx.f(aVar.f, PollEditorMode.Edit.b) && aVar.h) {
                M.K(2016133328);
                f9t.e(txj0.h(aVar7, 10), M, 6);
                jqu0.a(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar7), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
                f9t.e(txj0.h(aVar7, (float) 9.5d), M, 6);
                aVar4 = aVar7;
                i2 = 6;
                f = f2;
                qiu0.a(d370.N(R.string.poll_editor_delete, 0, M), gzsVar2, ahn.E(aVar7, "pollEditorDeletePollButton"), null, null, null, 0, CellButton$Appearance.Negative, null, null, null, false, M, ((i5 >> 3) & 112) | 12583296, 8056);
                M = M;
            } else {
                aVar4 = aVar7;
                i2 = 6;
                f = f2;
                M.K(2011412555);
            }
            M.j();
            f9t.e(txj0.h(aVar4, f), M, i2);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(yrb0Var, bob0Var, q630Var, list, list2, map, pollEditorUiConfig, izsVar, wzsVar, izsVar2, gzsVar, gzsVar2, gzsVar3, i) { // from class: xsna.cob0
                public final /* synthetic */ yrb0 c;
                public final /* synthetic */ bob0 d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ List f;
                public final /* synthetic */ List g;
                public final /* synthetic */ Map h;
                public final /* synthetic */ PollEditorUiConfig i;
                public final /* synthetic */ izs j;
                public final /* synthetic */ wzs k;
                public final /* synthetic */ izs l;
                public final /* synthetic */ gzs m;
                public final /* synthetic */ gzs n;
                public final /* synthetic */ gzs o;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3073);
                    eob0.a(xpb0.a.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
