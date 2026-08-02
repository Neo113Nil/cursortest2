package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.dw20;
import xsna.kbx0;
import xsna.q630;
import xsna.ty6;

/* compiled from: WarningNotificationController.kt */
/* loaded from: classes5.dex */
public final class kbx0 {
    public final FragmentImpl a;
    public dw20 b;

    /* compiled from: WarningNotificationController.kt */
    public interface a {
        void a(fcn fcnVar);

        void b(d dVar);
    }

    /* compiled from: WarningNotificationController.kt */
    public static final class b {
        public final ComposeView a;

        public b(c cVar, ag1 ag1Var, com.vk.movika.sdk.android.defaultplayer.container.e eVar) {
            dhr0.a.getClass();
            ComposeView composeView = new ComposeView(dhr0.E(), null, 6);
            composeView.setContent(new jai(-1567246426, new yro(this, cVar, ag1Var, eVar), true));
            this.a = composeView;
        }

        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13, types: [com.vk.core.compose.component.semantics.a, java.lang.Throwable, xsna.zqv0] */
        /* JADX WARN: Type inference failed for: r0v18 */
        public final void a(c cVar, ag1 ag1Var, com.vk.movika.sdk.android.defaultplayer.container.e eVar, androidx.compose.runtime.a aVar, int i) {
            c cVar2;
            String str;
            a.C0011a.C0012a c0012a;
            int i2;
            q630.a aVar2;
            CharSequence charSequence;
            ?? r0;
            int i3;
            boolean z;
            q630.a aVar3;
            int i4;
            androidx.compose.runtime.a M = aVar.M(-1604519909);
            int i5 = i | (M.J(cVar) ? 4 : 2) | (M.y(ag1Var) ? 32 : 16) | (M.y(eVar) ? 256 : 128);
            if (M.t(i5 & 1, (i5 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1604519909, i5, -1, "com.vk.profile.community.impl.ui.view.WarningNotificationController.ViewHolder.Content (WarningNotificationController.kt:423)");
                }
                jgh0 x = p490.x(M);
                q630.a aVar4 = q630.a.a;
                q630 f = txj0.f(p490.D(aVar4, x, 14), 1.0f);
                a.m mVar = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                ty6.a aVar5 = dt1.a.n;
                androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar5, M, 0);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, f);
                cri.h7.getClass();
                LayoutNode.a aVar6 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar6);
                } else {
                    M.f();
                }
                cri.a.c cVar3 = cri.a.f;
                k9q0.w(M, a, cVar3);
                cri.a.e eVar2 = cri.a.e;
                k9q0.w(M, D, eVar2);
                Integer valueOf = Integer.valueOf(hashCode);
                cri.a.b bVar = cri.a.g;
                k9q0.w(M, valueOf, bVar);
                cri.a.C2678a c2678a = cri.a.h;
                k9q0.t(M, c2678a);
                cri.a.d dVar = cri.a.d;
                k9q0.w(M, c, dVar);
                int i6 = cVar.e;
                CharSequence charSequence2 = cVar.b;
                String str2 = cVar.a;
                lg90 a2 = pg90.a(i6, 0, M);
                float f2 = kqu0.w;
                pzu0.b(a2, null, lr.c(dt1.a.o, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), wlb0.h(M).getIcon().a, M, 56, 0);
                q630 D2 = s200.D(aVar4, f2);
                androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar5, M, 0);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c2 = qri.c(M, D2);
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar6);
                } else {
                    M.f();
                }
                k9q0.w(M, a3, cVar3);
                k9q0.w(M, D3, eVar2);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                a.C0011a.C0012a c0012a2 = a.C0011a.a;
                if (str2 == null) {
                    M.K(-1972553837);
                    M.j();
                    c0012a = c0012a2;
                    i2 = i5;
                    M = M;
                    aVar2 = aVar4;
                    charSequence = charSequence2;
                    str = str2;
                    r0 = 0;
                } else {
                    M.K(-1972553836);
                    frv0 frv0Var = wlb0.l(M).z;
                    long j = wlb0.h(M).getText().m;
                    q630 f3 = txj0.f(aVar4, 1.0f);
                    Object x2 = M.x();
                    if (x2 == c0012a2) {
                        x2 = new wfl0(9);
                        M.R(x2);
                    }
                    str = str2;
                    c0012a = c0012a2;
                    i2 = i5;
                    aVar2 = aVar4;
                    charSequence = charSequence2;
                    r0 = 0;
                    yqv0.c(str, egi0.b(f3, false, (izs) x2), j, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8120);
                    M = M;
                    s3q0 s3q0Var = s3q0.a;
                    M.j();
                }
                if (charSequence == null || str == null) {
                    M.K(-1989176005);
                    M.j();
                } else {
                    M.K(-1971972741);
                    ck70.b(aVar2, kqu0.t, M, 0);
                }
                if (charSequence == null) {
                    M.K(-1971819106);
                } else {
                    M.K(-1971819105);
                    final Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
                    klv0 klv0Var = new klv0(VkTypographyToken.ParagraphNormal, VkColorToken.TextLink);
                    s8u0 s8u0Var = new s8u0(0);
                    s8u0Var.e(charSequence.toString());
                    if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        for (Object obj : spanned.getSpans(0, spanned.length(), qjc.class)) {
                            final qjc qjcVar = (qjc) obj;
                            s8u0Var.d(klv0Var, spanned.getSpanStart(qjcVar), spanned.getSpanEnd(qjcVar));
                            String i7 = qjcVar.i();
                            if (i7 == null) {
                                i7 = "";
                            }
                            s8u0Var.b(new i2v0(i7, r0, new i9z() { // from class: xsna.mbx0
                                @Override // xsna.i9z
                                public final void a(q8z q8zVar) {
                                    qjc.this.f(context, null);
                                }
                            }), spanned.getSpanStart(qjcVar), spanned.getSpanEnd(qjcVar));
                        }
                    }
                    us2 j2 = s8u0Var.j(8, M);
                    if (androidx.compose.runtime.b.d()) {
                        i3 = -1;
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    } else {
                        i3 = -1;
                    }
                    wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var2 = wuv0Var.d0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, i3, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j3 = ylu0Var.getText().r;
                    q630 f4 = txj0.f(aVar2, 1.0f);
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        z = false;
                        x3 = new lbx0(0);
                        M.R(x3);
                    } else {
                        z = false;
                    }
                    androidx.compose.runtime.a aVar7 = M;
                    yqv0.d(j2, egi0.b(f4, z, (izs) x3), j3, 3, null, 0, false, 0, null, null, frv0Var2, aVar7, 0, 0, 8120);
                    M = aVar7;
                    s3q0 s3q0Var2 = s3q0.a;
                }
                M.j();
                M.G();
                q630 D4 = s200.D(aVar2, kqu0.w);
                a.m mVar2 = androidx.compose.foundation.layout.a.c;
                dt1.a.getClass();
                androidx.compose.foundation.layout.c a4 = androidx.compose.foundation.layout.b.a(mVar2, dt1.a.n, M, 0);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D5 = M.D();
                q630 c3 = qri.c(M, D4);
                cri.h7.getClass();
                LayoutNode.a aVar8 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw r0;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar8);
                } else {
                    M.f();
                }
                k9q0.w(M, a4, cri.a.f);
                k9q0.w(M, D5, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode3), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c3, cri.a.d);
                cVar2 = cVar;
                String str3 = cVar2.c;
                if (str3 == null) {
                    M.K(-802115989);
                    M.j();
                    aVar3 = aVar2;
                    i4 = 3072;
                } else {
                    M.K(-802115988);
                    aVar3 = aVar2;
                    i4 = 3072;
                    bhu0.d(eVar, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.f(aVar2, 1.0f), ButtonSize.Large, null, null, cp8.d.a.a(str3, r0, M, 3072, 6), false, null, M, ((i2 >> 6) & 14) | 28080, 3936);
                    s3q0 s3q0Var3 = s3q0.a;
                    M.j();
                }
                String str4 = cVar2.d;
                if (str4 == null) {
                    M.K(-801565119);
                } else {
                    M.K(-801565118);
                    bhu0.d(ag1Var, ButtonStyle.Tertiary, ButtonAppearance.Accent, txj0.f(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.v, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), ButtonSize.Large, null, null, cp8.d.a.a(str4, r0, M, i4, 6), false, null, M, ((i2 >> 3) & 14) | 25008, 3936);
                    s3q0 s3q0Var4 = s3q0.a;
                }
                M.j();
                if (kr.f(M)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                cVar2 = cVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new jiy(this, cVar2, ag1Var, eVar, i, 2);
            }
        }
    }

    /* compiled from: WarningNotificationController.kt */
    public static final class c {
        public final String a;
        public final CharSequence b;
        public final String c;
        public final String d;
        public final int e;
        public final boolean f;

        public c(int i, String str, CharSequence charSequence, String str2, String str3, boolean z) {
            this.a = str;
            this.b = charSequence;
            this.c = str2;
            this.d = str3;
            this.e = i;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f;
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            CharSequence charSequence = this.b;
            int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return Boolean.hashCode(this.f) + shy.a(this.e, (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(title=");
            sb.append(this.a);
            sb.append(", message=");
            sb.append((Object) this.b);
            sb.append(", primaryButton=");
            sb.append(this.c);
            sb.append(", secondaryButton=");
            sb.append(this.d);
            sb.append(", iconResource=");
            sb.append(this.e);
            sb.append(", canClose=");
            return defpackage.q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: WarningNotificationController.kt */
    public static final class d implements fcn {
        public d() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            dw20 dw20Var = kbx0.this.b;
            if (dw20Var != null) {
                dw20Var.dismiss();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    public kbx0(FragmentImpl fragmentImpl) {
        this.a = fragmentImpl;
    }

    public final void a(final a aVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, final c cVar) {
        boolean z = cVar.f;
        final d dVar = new d();
        aVar.b(dVar);
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        FragmentActivity activity = this.a.getActivity();
        if (activity == null) {
            return;
        }
        this.b = new dw20.b(activity, null).D0(new b(cVar, new ag1(20, gzsVar, this), new com.vk.movika.sdk.android.defaultplayer.container.e(29, this, gzsVar2)).a, false).p0(cn70.b(8)).m0(cn70.b(8)).n0(cn70.b(8)).o0(cn70.b(8)).q(z).p(z).Z(new DialogInterface.OnDismissListener() { // from class: xsna.ibx0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                kbx0.a.this.a(dVar);
            }
        }).c0(new DialogInterface.OnKeyListener() { // from class: xsna.jbx0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                if (i2 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                dialogInterface.dismiss();
                if (!kbx0.c.this.f) {
                    this.a.finish();
                }
                return true;
            }
        }).I0("warning_notification");
    }
}
