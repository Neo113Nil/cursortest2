package xsna;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: PollEditorAnswerInputLayout.kt */
/* loaded from: classes4.dex */
public final class xnb0 {
    public static final void a(final int i, final boolean z, final String str, final boolean z2, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final int i2, final boolean z3, final boolean z4, final wzs wzsVar, final izs izsVar, final gzs gzsVar, final Drawable drawable, androidx.compose.runtime.a aVar, final int i3, final int i4) {
        int i5;
        int i6;
        androidx.compose.runtime.a M = aVar.M(-1426860270);
        int i7 = i3 | (M.o(i) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.J(str) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | (M.J(str2) ? 16384 : 8192) | (M.J(str3) ? 1048576 : 524288) | (M.J(str4) ? 8388608 : 4194304) | (M.J(str5) ? 67108864 : 33554432) | (M.J(str6) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if ((i4 & 6) == 0) {
            i5 = i4 | (M.J(str7) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= M.J(str8) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 = i2;
            i5 |= M.o(i6) ? 256 : 128;
        } else {
            i6 = i2;
        }
        if ((i4 & 3072) == 0) {
            i5 |= M.l(z3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= M.l(z4) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i5 |= M.y(wzsVar) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i5 |= M.y(izsVar) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i5 |= M.y(gzsVar) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i5 |= M.y(drawable) ? 67108864 : 33554432;
        }
        int i8 = i5;
        if (M.t(i7 & 1, ((i7 & 306783379) == 306783378 && (38347923 & i8) == 38347922) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1426860270, i7, i8, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.AnimatedPollAnswerInputLayout (PollEditorAnswerInputLayout.kt:44)");
            }
            final int i9 = i6;
            mm2.f(z, q630.a.a, anp.d(null, null, null, 15).b(anp.e(null, 3)), anp.k(null, null, 15).b(anp.f(null, 3)), null, kai.c(162612026, new yzs() { // from class: xsna.snb0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(162612026, intValue, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.AnimatedPollAnswerInputLayout.<anonymous> (PollEditorAnswerInputLayout.kt:51)");
                    }
                    String str9 = z2 ? str2 : null;
                    wzs wzsVar2 = wzsVar;
                    boolean J = aVar2.J(wzsVar2);
                    final int i10 = i;
                    boolean o = J | aVar2.o(i10);
                    Object x = aVar2.x();
                    Object obj4 = a.C0011a.a;
                    if (o || x == obj4) {
                        x = new nfb(i10, wzsVar2);
                        aVar2.R(x);
                    }
                    izs izsVar2 = (izs) x;
                    final boolean z5 = z4;
                    boolean l = aVar2.l(z5);
                    final izs izsVar3 = izsVar;
                    boolean J2 = l | aVar2.J(izsVar3) | aVar2.o(i10);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == obj4) {
                        x2 = new gzs() { // from class: xsna.unb0
                            @Override // xsna.gzs
                            public final Object invoke() {
                                if (z5) {
                                    izsVar3.invoke(Integer.valueOf(i10));
                                }
                                return s3q0.a;
                            }
                        };
                        aVar2.R(x2);
                    }
                    xnb0.b(str, z, izsVar2, str4, str5, str3, str9, str6, str7, str8, i9, z3, z5, (gzs) x2, gzsVar, drawable, aVar2, 196608);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i7 >> 3) & 14) | 200112, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(i, z, str, z2, str2, str3, str4, str5, str6, str7, str8, i2, z3, z4, wzsVar, izsVar, gzsVar, drawable, i3, i4) { // from class: xsna.tnb0
                public final /* synthetic */ int b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String g;
                public final /* synthetic */ String h;
                public final /* synthetic */ String i;
                public final /* synthetic */ String j;
                public final /* synthetic */ String k;
                public final /* synthetic */ String l;
                public final /* synthetic */ int m;
                public final /* synthetic */ boolean n;
                public final /* synthetic */ boolean o;
                public final /* synthetic */ wzs p;
                public final /* synthetic */ izs q;
                public final /* synthetic */ gzs r;
                public final /* synthetic */ Drawable s;
                public final /* synthetic */ int t;

                {
                    this.t = i4;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(196609);
                    int I2 = ne7.I(this.t);
                    xnb0.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (androidx.compose.runtime.a) obj, I, I2);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final String str, final boolean z, final izs izsVar, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final int i, final boolean z2, final boolean z3, final gzs gzsVar, final gzs gzsVar2, final Drawable drawable, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1849174688);
        int i3 = i2 | (M.J(str) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(str2) ? 2048 : 1024) | (M.J(str3) ? 16384 : 8192) | (M.J(str4) ? 1048576 : 524288) | (M.J(str5) ? 8388608 : 4194304) | (M.J(str6) ? 67108864 : 33554432) | (M.J(str7) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i4 = (M.J(str8) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.l(z2) ? 256 : 128) | (M.l(z3) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192) | (M.y(gzsVar2) ? 131072 : 65536) | (M.y(drawable) ? 1048576 : 524288);
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i4) == 599186) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1849174688, i3, i4, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollAnswerInputLayout (PollEditorAnswerInputLayout.kt:99)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.e;
            q630.a aVar3 = q630.a.a;
            float f = 16;
            float f2 = 0;
            q630 H = s200.H(txj0.f(aVar3, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 12, 2);
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f3 = z3 ? f2 : f;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(str);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            q630 f4 = txj0.f(s200.H(ra8.a.b(aVar3, ty6Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 1.0f);
            boolean z4 = (i3 & 896) == 256;
            Object x2 = M.x();
            if (z4 || x2 == c0012a) {
                x2 = new vnb0(0, izsVar, wh50Var);
                M.R(x2);
            }
            int i5 = i3 >> 3;
            int i6 = i3 >> 6;
            int i7 = i4 << 3;
            aVar2 = M;
            ne2.a(str, z, str2, f4, str4, str5, z2, i, str6, str7, (izs) x2, gzsVar2, drawable, str3, z3, gzsVar, Integer.valueOf(R.id.edit_text_input_remove_auto_test), str8, aVar2, (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i5 & 896) | (i6 & 57344) | (i6 & 458752) | ((i4 << 12) & 3670016) | ((i4 << 18) & 29360128) | (234881024 & i3) | (i3 & 1879048192), ((i4 >> 12) & 1008) | (i5 & 7168) | (i7 & 57344) | (i7 & 458752) | ((i4 << 21) & 29360128), 0);
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
            s.d = new wzs(str, z, izsVar, str2, str3, str4, str5, str6, str7, str8, i, z2, z3, gzsVar, gzsVar2, drawable, i2) { // from class: xsna.wnb0
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String g;
                public final /* synthetic */ String h;
                public final /* synthetic */ String i;
                public final /* synthetic */ String j;
                public final /* synthetic */ String k;
                public final /* synthetic */ int l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ boolean n;
                public final /* synthetic */ gzs o;
                public final /* synthetic */ gzs p;
                public final /* synthetic */ Drawable q;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(196609);
                    xnb0.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
