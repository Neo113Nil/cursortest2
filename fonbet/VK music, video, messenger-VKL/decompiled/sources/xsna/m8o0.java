package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.form.FormField$Style;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.f8s;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;
import xsna.s2x;

/* compiled from: TemplateDetailsField.kt */
/* loaded from: classes3.dex */
public final class m8o0 {
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        if (r9 == r1) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final String str2, final h4m h4mVar, final boolean z, final String str3, q630 q630Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        g8s a;
        vr9 vr9Var;
        a.C0011a.C0012a c0012a;
        tlo0 tlo0Var = h4mVar.b;
        androidx.compose.runtime.a M = aVar.M(360402130);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.J(h4mVar) ? 256 : 128) | 196608 | (M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(360402130, i2, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsField (TemplateDetailsField.kt:29)");
            }
            String str4 = h4mVar.a;
            if (str4 == null) {
                str4 = "";
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = or.a(str4, 0L, 6, M);
            }
            wh50 wh50Var = (wh50) x;
            boolean J = M.J(str4);
            Object x2 = M.x();
            if (J || x2 == c0012a2) {
                x2 = new l8o0(str4, wh50Var, null);
                M.R(x2);
            }
            bap.g(str4, (wzs) x2, M, 0);
            InputSelect$State inputSelect$State = tlo0Var != null ? InputSelect$State.Error : InputSelect$State.Default;
            boolean z2 = (3670016 & i2) == 1048576;
            Object x3 = M.x();
            if (z2 || x3 == c0012a2) {
                x3 = new kpk0(5, izsVar, wh50Var);
                M.R(x3);
            }
            izs izsVar2 = (izs) x3;
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            InputSelect$State inputSelect$State2 = inputSelect$State;
            hly a2 = h8s.a.a(str, false, null, null, null, M, (i2 & 14) | 196608, 30);
            if (z) {
                M.K(-677492709);
                tho0 tho0Var = (tho0) wh50Var.getValue();
                int i3 = (i2 >> 3) & 7182;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-352483002, i3, -1, "com.vk.messagetemplates.impl.details.ui.singleLineContent (TemplateDetailsField.kt:87)");
                }
                boolean J2 = M.J(izsVar2);
                Object x4 = M.x();
                if (J2) {
                    c0012a = c0012a2;
                } else {
                    c0012a = c0012a2;
                }
                x4 = new y8t(izsVar2, 2);
                M.R(x4);
                b2x b = s2x.a.C3649a.b(tho0Var, (izs) x4, str2, 0L, 0L, null, null, null, null, null, false, null, M, (i3 << 6) & 896, 196608, 32760);
                SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                Object x5 = M.x();
                if (x5 == c0012a) {
                    x5 = new zl1(str3, 8);
                    M.R(x5);
                }
                a = g8s.b.a.a(b, inputSelect$State2, false, com.vk.core.compose.component.semantics.b.a(mode, (izs) x5, 2), M, 24576, 4);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(-1545872370);
                tho0 tho0Var2 = (tho0) wh50Var.getValue();
                int i4 = (i2 >> 3) & 7182;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1598428719, i4, -1, "com.vk.messagetemplates.impl.details.ui.multiLineContent (TemplateDetailsField.kt:66)");
                }
                boolean J3 = M.J(izsVar2);
                Object x6 = M.x();
                if (J3 || x6 == c0012a2) {
                    x6 = new uzo(izsVar2, 4);
                    M.R(x6);
                }
                izs izsVar3 = (izs) x6;
                SemanticsConfiguration.Mode mode2 = SemanticsConfiguration.Mode.Merge;
                Object x7 = M.x();
                if (x7 == c0012a2) {
                    x7 = new sqd(str3, 2);
                    M.R(x7);
                }
                a = g8s.e.a.a(tho0Var2, izsVar3, str2, inputSelect$State2, 0, 0, false, null, null, null, com.vk.core.compose.component.semantics.b.a(mode2, (izs) x7, 2), M, (i4 << 6) & 896, 24576, 8176);
                M = M;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            String d = kq01.d(tlo0Var, M);
            if (d == null) {
                M.K(-677258133);
                M.j();
                vr9Var = null;
            } else {
                M.K(-1545866537);
                androidx.compose.runtime.a aVar3 = M;
                vr9 a3 = f8s.a.a(d, FormField$Style.Error, null, aVar3, 3120, 4);
                M = aVar3;
                M.j();
                vr9Var = a3;
            }
            nvu0.a(a, f, a2, null, vr9Var, M, 0, 8);
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
            s.d = new wzs(str, str2, h4mVar, z, str3, q630Var2, izsVar, i) { // from class: xsna.k8o0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ h4m d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ String f;
                public final /* synthetic */ q630 g;
                public final /* synthetic */ izs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(27649);
                    m8o0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
