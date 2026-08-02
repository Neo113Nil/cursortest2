package xsna;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.form.FormField$Style;
import com.vk.core.compose.component.input.InputSelect$State;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.regex.Matcher;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.f8s;
import xsna.g8s;
import xsna.q630;
import xsna.s2x;
import xsna.t2x;

/* compiled from: LinkModalBottomSheet.kt */
/* loaded from: classes6.dex */
public final class w9z extends jmu0 {
    public static final /* synthetic */ int k1 = 0;
    public final String h1;
    public final String i1;
    public final izs<String, s3q0> j1;

    /* compiled from: LinkModalBottomSheet.kt */
    public static final class a extends kmu0 {
        public final String h;
        public final String i;
        public final d9s j;

        public a(Context context, String str, String str2, d9s d9sVar) {
            super(context, tzp0.a(null, 3));
            this.h = str;
            this.i = str2;
            this.j = d9sVar;
            T0();
            n0(0);
            o0(0);
            p0(0);
            m0(0);
            K0(16);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new w9z(this.h, this.i, this.j);
        }
    }

    /* compiled from: LinkModalBottomSheet.kt */
    public static final class b {
        public static boolean a(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return false;
            }
            Matcher matcher = eaz.d().matcher(charSequence);
            return matcher.find() && matcher.start() == 0 && matcher.end() == charSequence.length();
        }
    }

    /* compiled from: Effects.kt */
    public static final class c implements kgn {
        public final /* synthetic */ View a;
        public final /* synthetic */ n9z b;

        public c(View view, n9z n9zVar) {
            this.a = view;
            this.b = n9zVar;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
        }
    }

    /* compiled from: LinkModalBottomSheet.kt */
    @b6l(c = "com.vk.textformat.menu.LinkModalBottomSheet$UrlInput$1$1", f = "LinkModalBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ rwr $focusRequester;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(rwr rwrVar, spj<? super d> spjVar) {
            super(2, spjVar);
            this.$focusRequester = rwrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new d(this.$focusRequester, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            rwr.b(this.$focusRequester);
            return s3q0.a;
        }
    }

    public w9z(String str, String str2, d9s d9sVar) {
        this.h1 = str;
        this.i1 = str2;
        this.j1 = d9sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(32116343);
        int i2 = (M.y(this) ? 4 : 2) | i;
        boolean z = false;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(32116343, i2, -1, "com.vk.textformat.menu.LinkModalBottomSheet.ThemedContent (LinkModalBottomSheet.kt:74)");
            }
            String str = this.i1;
            boolean J = M.J(str);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = io.reactivex.rxjava3.internal.operators.mixed.j.d(!(str == null || str.length() == 0), M);
            }
            wh50 wh50Var = (wh50) x;
            final int i3 = ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).orientation;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = bbk0.b(new gzs() { // from class: xsna.v9z
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return Boolean.valueOf(i3 == 2);
                    }
                });
                M.R(x2);
            }
            mtk0 mtk0Var = (mtk0) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var2 = (wh50) x3;
            if (((Boolean) mtk0Var.getValue()).booleanValue()) {
                M.K(-999311155);
                Object obj2 = (View) M.r(AndroidCompositionLocals_androidKt.f);
                Object rect = new Rect();
                boolean y = M.y(obj2) | M.y(rect);
                Object x4 = M.x();
                if (y || x4 == obj) {
                    x4 = new n15(obj2, rect, wh50Var2, 5);
                    M.R(x4);
                }
                bap.c(obj2, (izs) x4, M, 0);
            } else {
                M.K(-1003060853);
            }
            M.j();
            boolean l = M.l(((Boolean) wh50Var.getValue()).booleanValue());
            Object x5 = M.x();
            if (l || x5 == obj) {
                x5 = androidx.compose.runtime.k.b(getString(((Boolean) wh50Var.getValue()).booleanValue() ? R.string.text_format_link_change_button_save : R.string.text_format_link_create_button_add));
                M.R(x5);
            }
            wh50 wh50Var3 = (wh50) x5;
            boolean l2 = M.l(((Boolean) wh50Var.getValue()).booleanValue());
            Object x6 = M.x();
            if (l2 || x6 == obj) {
                x6 = androidx.compose.runtime.k.b(getString(((Boolean) wh50Var.getValue()).booleanValue() ? R.string.text_format_link_change_header : R.string.text_format_link_create_header));
                M.R(x6);
            }
            wh50 wh50Var4 = (wh50) x6;
            String str2 = this.h1;
            boolean J2 = M.J(str2);
            Object x7 = M.x();
            if (J2 || x7 == obj) {
                x7 = androidx.compose.runtime.k.b(str2.length() > 0 ? getString(R.string.text_format_link_info, str2) : "");
                M.R(x7);
            }
            String str3 = (String) wh50Var4.getValue();
            String str4 = (String) wh50Var3.getValue();
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            String str5 = (String) ((wh50) x7).getValue();
            if (((Boolean) mtk0Var.getValue()).booleanValue() && ((Boolean) wh50Var2.getValue()).booleanValue()) {
                z = true;
            }
            go(str3, str4, booleanValue, str5, z, M, ((i2 << 15) & 458752) | SQLiteDatabase.OPEN_PRIVATECACHE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.t(this, i, 7);
        }
    }

    public final void eo(final String str, String str2, final boolean z, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, final int i) {
        String str3;
        int i2;
        String str4;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(950010164);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (M.J(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= M.J(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(gzsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar2) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(950010164, i2, -1, "com.vk.textformat.menu.LinkModalBottomSheet.ActionButtons (LinkModalBottomSheet.kt:288)");
            }
            float f = 16;
            q630.a aVar3 = q630.a.a;
            q630 f2 = txj0.f(txj0.z(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), null, 3), 1.0f);
            ButtonSize buttonSize = ButtonSize.Large;
            bhu0.e(gzsVar, buttonSize, ButtonStyle.Primary, ButtonAppearance.Accent, f2, null, false, false, null, null, null, str3, null, null, null, null, b.a(str4), null, null, null, M, ((i2 >> 9) & 14) | 28080, (i2 << 6) & 896, 0, 4059104);
            aVar2 = M;
            if (z) {
                aVar2.K(-2081010013);
                f9t.e(txj0.h(aVar3, 12), aVar2, 6);
                bhu0.e(gzsVar2, buttonSize, ButtonStyle.Secondary, ButtonAppearance.Negative, txj0.f(txj0.z(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), null, 3), 1.0f), null, false, false, null, null, null, d370.N(R.string.text_format_link_change_button_delete, 0, aVar2), null, null, null, null, false, null, null, null, aVar2, ((i2 >> 12) & 14) | 28080, 0, 0, 4190176);
                aVar2 = aVar2;
            } else {
                aVar2.K(-2093332978);
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final String str5 = str4;
            s.d = new wzs() { // from class: xsna.m9z
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    w9z.this.eo(str, str5, z, gzsVar, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void fo(final String str, final String str2, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        String str3;
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2126978857);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (M.J(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2126978857, i2, -1, "com.vk.textformat.menu.LinkModalBottomSheet.DescriptionTexts (LinkModalBottomSheet.kt:250)");
            }
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = bbk0.b(new gzs() { // from class: xsna.r9z
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return new pco(z ? 0 : 8);
                    }
                });
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            boolean z3 = i3 == 256;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = bbk0.b(new gzs() { // from class: xsna.s9z
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return Integer.valueOf(z ? 1 : 2);
                    }
                });
                M.R(x2);
            }
            float f = 16;
            q630.a aVar3 = q630.a.a;
            aVar2 = M;
            yqv0.c(str3, txj0.f(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 1.0f), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 1, null, wlb0.l(M).C, aVar2, (i2 & 14) | 48, 48, 6072);
            f9t.e(txj0.h(aVar3, ((pco) mtk0Var.getValue()).b), aVar2, 0);
            yqv0.c(str2, txj0.f(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 1.0f), wlb0.h(aVar2).getText().r, null, null, 0, 3, null, 2, false, 0, ((Number) ((mtk0) x2).getValue()).intValue(), null, wlb0.l(aVar2).e0, aVar2, ((i2 >> 3) & 14) | 100663344, 0, 5816);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.t9z
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    w9z.this.fo(str, str2, z, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x00de, code lost:
    
        if (r1 == null) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void go(final String str, final String str2, final boolean z, final String str3, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str4;
        String str5;
        androidx.compose.runtime.a M = aVar.M(-1407537140);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str4 = str3;
            i2 |= M.J(str4) ? 2048 : 1024;
        } else {
            str4 = str3;
        }
        if ((i & 24576) == 0) {
            i2 |= M.l(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? M.J(this) : M.y(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1407537140, i2, -1, "com.vk.textformat.menu.LinkModalBottomSheet.LinkForm (LinkModalBottomSheet.kt:135)");
            }
            xfd xfdVar = (xfd) M.r(uvi.e);
            int i3 = i2 & 896;
            boolean z3 = i3 == 256;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z3 || x == obj) {
                if (!z && xfdVar.a()) {
                    str5 = String.valueOf(xfdVar.getText());
                    if (!b.a(str5)) {
                        str5 = null;
                    }
                }
                str5 = "";
                x = androidx.compose.runtime.k.b(str5);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object obj2 = (String) wh50Var.getValue();
            String str6 = this.i1;
            boolean J = M.J(str6) | M.J(obj2);
            Object x2 = M.x();
            if (J || x2 == obj) {
                if (str6 == null) {
                    str6 = (String) wh50Var.getValue();
                }
                x2 = androidx.compose.runtime.k.b(new tho0(str6, 0L, 6));
                M.R(x2);
            }
            wh50<tho0> wh50Var2 = (wh50) x2;
            int i4 = i2 & 458752;
            boolean J2 = (i4 == 131072 || ((i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && M.y(this))) | M.J(wh50Var2);
            Object x3 = M.x();
            if (J2 || x3 == obj) {
                x3 = new com.vk.movika.sdk.android.defaultplayer.container.e(13, this, wh50Var2);
                M.R(x3);
            }
            gzs<s3q0> gzsVar = (gzs) x3;
            int i5 = 57344 & i2;
            boolean z4 = i5 == 16384;
            Object x4 = M.x();
            if (z4 || x4 == obj) {
                x4 = bbk0.b(new gzs() { // from class: xsna.o9z
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return new pco(z2 ? 0 : 8);
                    }
                });
                M.R(x4);
            }
            mtk0 mtk0Var = (mtk0) x4;
            boolean z5 = i5 == 16384;
            Object x5 = M.x();
            if (z5 || x5 == obj) {
                x5 = bbk0.b(new gzs() { // from class: xsna.p9z
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return new pco(z2 ? 0 : 4);
                    }
                });
                M.R(x5);
            }
            mtk0 mtk0Var2 = (mtk0) x5;
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            dt1.a.getClass();
            q630 z6 = txj0.z(f, dt1.a.k, 2);
            float f2 = 8;
            q630 D = p490.D(n34.t(s200.G(z6, f2, f2, f2, ((pco) mtk0Var.getValue()).b), dz5.I(6, 0, M, true), null), p490.x(M), 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(D, ylu0Var.getBackground().r, f5v0.a);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, m);
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
            k9q0.w(M, d2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D2, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            int i6 = i2;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16, 1, aVar2);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, F);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            int i7 = i6 >> 6;
            fo(str, str4, z2, M, (i6 & 14) | (i7 & 112) | (i7 & 896) | 4096 | (i7 & 7168));
            f9t.e(txj0.h(aVar2, ((pco) mtk0Var2.getValue()).b), M, 0);
            ho(wh50Var2, M, ((i6 >> 12) & 112) | 64);
            f9t.e(txj0.h(aVar2, 4), M, 6);
            String str7 = ((tho0) wh50Var2.getValue()).a.c;
            boolean z7 = i4 == 131072 || ((i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && M.y(this));
            Object x6 = M.x();
            if (z7 || x6 == obj) {
                x6 = new f5x(this, 2);
                M.R(x6);
            }
            eo(str2, str7, z, gzsVar, (gzs) x6, M, ((i6 >> 3) & 14) | i3 | SQLiteDatabase.OPEN_PRIVATECACHE | i4);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.q9z
                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    w9z.this.go(str, str2, z, str3, z2, (androidx.compose.runtime.a) obj3, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ho(wh50<tho0> wh50Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String str;
        vr9 vr9Var;
        androidx.compose.runtime.a M = aVar.M(1477256777);
        if ((i & 6) == 0) {
            i2 = (M.J(wh50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(this) : M.y(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1477256777, i2, -1, "com.vk.textformat.menu.LinkModalBottomSheet.UrlInput (LinkModalBottomSheet.kt:192)");
            }
            nek0 nek0Var = (nek0) M.r(uvi.q);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new rwr();
                M.R(x);
            }
            rwr rwrVar = (rwr) x;
            s3q0 s3q0Var = s3q0.a;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new d(rwrVar, null);
                M.R(x2);
            }
            bap.g(s3q0Var, (wzs) x2, M, 6);
            boolean J = M.J(wh50Var.getValue().a.c);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = bbk0.b(new d5(12, wh50Var, this));
                M.R(x3);
            }
            mtk0 mtk0Var = (mtk0) x3;
            q630 f = txj0.f(q630.a.a, 1.0f);
            dt1.a.getClass();
            q630 d2 = jvi.d(txj0.y(f, dt1.a.m, true), rwrVar);
            tho0 value = wh50Var.getValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new v1k(1, wh50Var);
                M.R(x4);
            }
            izs izsVar = (izs) x4;
            String N = d370.N(R.string.text_format_link_hint, 0, M);
            rgy rgyVar = new rgy(7);
            boolean J2 = M.J(nek0Var);
            Object x5 = M.x();
            if (J2 || x5 == c0012a) {
                x5 = new k7f(nek0Var, 28);
                M.R(x5);
            }
            uey ueyVar = new uey((izs) x5, null, null, 62);
            qzu0.a.getClass();
            lg90 x6 = qzu0.x(M);
            String N2 = d370.N(R.string.accessibility_clear, 0, M);
            boolean z2 = i3 == 4;
            Object x7 = M.x();
            if (z2 || x7 == c0012a) {
                x7 = new loj(1, wh50Var);
                M.R(x7);
            }
            b2x b2 = s2x.a.C3649a.b(value, izsVar, N, 0L, 0L, rgyVar, ueyVar, null, null, t2x.b.a.a(x6, N2, (gzs) x7, 0L, null, M, 196616, 24), false, null, M, 0, 196608, 28280);
            String str2 = (String) mtk0Var.getValue();
            u2x a2 = g8s.b.a.a(b2, str2 == null || str2.length() == 0 ? InputSelect$State.Default : InputSelect$State.Error, false, null, M, 24576, 12);
            String str3 = (String) mtk0Var.getValue();
            if (str3 != null) {
                if (str3.length() > 0) {
                    str = str3;
                    if (str != null) {
                        M.K(-1571109548);
                        M.j();
                        vr9Var = null;
                        aVar2 = M;
                    } else {
                        M.K(-1571109547);
                        vr9 a3 = f8s.a.a(str, FormField$Style.Error, null, M, 3120, 4);
                        aVar2 = M;
                        aVar2.j();
                        vr9Var = a3;
                    }
                    nvu0.a(a2, d2, null, null, vr9Var, aVar2, 0, 12);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            str = null;
            if (str != null) {
            }
            nvu0.a(a2, d2, null, null, vr9Var, aVar2, 0, 12);
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new u9z(this, wh50Var, i, 0);
        }
    }
}
