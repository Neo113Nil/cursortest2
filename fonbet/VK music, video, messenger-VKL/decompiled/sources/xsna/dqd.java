package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.upload.ui.impl.compose.views.island.IslandPart;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.tlo0;

/* compiled from: ClipsDescriptionBlock.kt */
/* loaded from: classes17.dex */
public final class dqd {
    public static final void a(final long j, final izs<? super mbf, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1900416473);
        int i2 = (M.p(j) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1900416473, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.description.OpenEditorButton (ClipsDescriptionBlock.kt:150)");
            }
            q630.a aVar3 = q630.a.a;
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, dtx.a(txj0.f(aVar3, 1.0f), IslandPart.Middle, j));
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            String obj = tlo0.b.a(tq.h(tlo0.Companion, R.string.clips_publish_open_editor), (Context) M.r(AndroidCompositionLocals_androidKt.b)).toString();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-741638904, 6, -1, "com.vk.clips.upload.ui.impl.compose.views.theme.ClipsUploadTheme.<get-icons> (ClipsUploadTheme.kt:34)");
            }
            egf egfVar = (egf) M.r(okf.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            lg90 d = egfVar.d(M);
            q630 f = txj0.f(aVar3, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new w2(izsVar, 2);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f, null, false, false, d, null, null, obj, null, null, null, null, false, null, null, null, aVar2, 1073769904, 0, 0, 4189664);
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
            s.d = new wzs(i, j, izsVar) { // from class: xsna.spd
                public final /* synthetic */ long b;
                public final /* synthetic */ izs c;

                {
                    this.b = j;
                    this.c = izsVar;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(1);
                    dqd.a(this.b, this.c, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final pgf pgfVar, final int i, final t1m t1mVar, final long j, final izs<? super mbf, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a aVar2;
        q630 q630Var;
        androidx.compose.runtime.a M = aVar.M(1631399112);
        if ((i2 & 6) == 0) {
            i3 = (M.J(pgfVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(t1mVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.p(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= M.y(izsVar) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1631399112, i3, -1, "com.vk.clips.upload.ui.impl.compose.views.description.UploadListedItem (ClipsDescriptionBlock.kt:99)");
            }
            q630 a = dtx.a(q630.a.a, i == 0 ? IslandPart.Top : i == e43.h(new wow(t1mVar.c)) ? IslandPart.Bottom : IslandPart.Middle, j);
            if (pgfVar instanceof zdd) {
                M.K(111499640);
                ((zdd) pgfVar).b.invoke(a, M, 0);
                M.j();
                aVar2 = M;
            } else {
                if (!(pgfVar instanceof hze)) {
                    throw alb0.c(111499280, M);
                }
                M.K(-838381207);
                hze hzeVar = (hze) pgfVar;
                int i4 = i3 & 57344;
                boolean z = i4 == 16384;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z || x == c0012a) {
                    x = new op3(izsVar, 3);
                    M.R(x);
                }
                izs izsVar2 = (izs) x;
                boolean z2 = i4 == 16384;
                Object x2 = M.x();
                if (z2 || x2 == c0012a) {
                    x2 = new jh9(izsVar, 1);
                    M.R(x2);
                }
                izs izsVar3 = (izs) x2;
                boolean z3 = i4 == 16384;
                Object x3 = M.x();
                if (z3 || x3 == c0012a) {
                    q630Var = a;
                    x3 = new npd(izsVar, 0, (byte) 0);
                    M.R(x3);
                } else {
                    q630Var = a;
                }
                wzs wzsVar = (wzs) x3;
                boolean z4 = i4 == 16384;
                Object x4 = M.x();
                if (z4 || x4 == c0012a) {
                    x4 = new cv4(izsVar, 1);
                    M.R(x4);
                }
                wzs wzsVar2 = (wzs) x4;
                boolean z5 = i4 == 16384;
                Object x5 = M.x();
                if (z5 || x5 == c0012a) {
                    x5 = new opd(izsVar, 0);
                    M.R(x5);
                }
                izs izsVar4 = (izs) x5;
                boolean z6 = i4 == 16384;
                Object x6 = M.x();
                if (z6 || x6 == c0012a) {
                    x6 = new ppd(izsVar, 0);
                    M.R(x6);
                }
                izs izsVar5 = (izs) x6;
                boolean z7 = i4 == 16384;
                Object x7 = M.x();
                if (z7 || x7 == c0012a) {
                    x7 = new qpd(izsVar, 0);
                    M.R(x7);
                }
                jaq0.c(hzeVar, izsVar2, izsVar3, q630Var, wzsVar, wzsVar2, izsVar4, izsVar5, (izs) x7, M, 0);
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
            s.d = new wzs() { // from class: xsna.rpd
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dqd.b(pgf.this, i, t1mVar, j, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
