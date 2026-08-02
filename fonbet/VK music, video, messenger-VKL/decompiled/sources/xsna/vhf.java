package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;
import com.vk.clips.upload.edit.api.ClipsUploadSdkEditComponent;
import com.vk.clips.upload.ui.api.di.ClipsUploadSdkUiComponent;
import xsna.jqd;
import xsna.mbf;
import xsna.nld;
import xsna.tw50;
import xsna.zih0;

/* compiled from: ClipsUploadScreen.kt */
/* loaded from: classes17.dex */
public final class vhf {
    public static final void a(final yhf yhfVar, final Object obj, final izs izsVar, final Object obj2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        boolean z;
        Class cls;
        ylu0 ylu0Var;
        tw50 tw50Var;
        jqd jqdVar;
        Boolean bool;
        androidx.compose.runtime.a M = aVar.M(-852280207);
        int i3 = i | (M.J(yhfVar) ? 4 : 2) | (M.J(obj) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(ofe.a) ? 2048 : 1024) | (M.J(q630Var) ? 131072 : 65536);
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-852280207, i3, -1, "com.vk.clips.upload.ui.impl.compose.views.ClipsUploadScreen (ClipsUploadScreen.kt:131)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            f5z f5zVar = (f5z) M.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean booleanValue = ((Boolean) M.r(c5x.a)).booleanValue();
            w8i w8iVar = (w8i) obj2;
            int i4 = i3 & 896;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-669154560, i4, -1, "com.vk.clips.upload.ui.impl.compose.views.rememberPreviewLauncher (ClipsUploadScreen.kt:300)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                if (booleanValue) {
                    x = nld.a.a.getSTUB();
                } else {
                    ((ClipsUploadSdkUiComponent) ((k7m) m7m.f(w8iVar)).mo408a(fpf0.a(ClipsUploadSdkUiComponent.class))).k().getClass();
                    x = null;
                }
                M.R(x);
            }
            nld nldVar = (nld) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                i2 = i3;
                z = booleanValue;
                androidx.compose.runtime.b.f(452246512, 0, -1, "com.vk.clips.upload.ui.impl.compose.views.rememberDescriptionEditController (ClipsUploadScreen.kt:260)");
            } else {
                i2 = i3;
                z = booleanValue;
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = !z ? ((ClipsUploadSdkEditComponent) ((k7m) m7m.f(w8iVar)).mo408a(fpf0.a(ClipsUploadSdkEditComponent.class))).F5() : jqd.a.a.getSTUB();
                M.R(x2);
            }
            jqd jqdVar2 = (jqd) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                cls = ClipsUploadSdkEditComponent.class;
                ylu0Var = ylu0Var2;
                androidx.compose.runtime.b.f(1136478460, 0, -1, "com.vk.clips.upload.ui.impl.compose.views.rememberNavigationCallbackHolder (ClipsUploadScreen.kt:273)");
            } else {
                cls = ClipsUploadSdkEditComponent.class;
                ylu0Var = ylu0Var2;
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = !z ? ((ClipsUploadSdkEditComponent) ((k7m) m7m.f(w8iVar)).mo408a(fpf0.a(cls))).k().b() : tw50.a.a.getSTUB();
                M.R(x3);
            }
            tw50 tw50Var2 = (tw50) x3;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i5 = i2 >> 3;
            int i6 = i5 & 112;
            if (androidx.compose.runtime.b.d()) {
                tw50Var = tw50Var2;
                jqdVar = jqdVar2;
                androidx.compose.runtime.b.f(547597401, i6, -1, "com.vk.clips.upload.ui.impl.compose.views.rememberSuggestsAnalyticsDelegate (ClipsUploadScreen.kt:284)");
            } else {
                tw50Var = tw50Var2;
                jqdVar = jqdVar2;
            }
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = !z ? new zih0() { // from class: xsna.rhf
                    @Override // xsna.zih0
                    public final void a(ajh0 ajh0Var) {
                        izs.this.invoke(new mbf.c.z(ajh0Var));
                    }
                } : zih0.a.a.getSTUB();
                M.R(x4);
            }
            zih0 zih0Var = (zih0) x4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            cb0 cb0Var = new cb0();
            boolean y = (i4 == 256) | M.y(nldVar);
            Object x5 = M.x();
            if (y || x5 == c0012a) {
                x5 = new sf4(4, nldVar, izsVar);
                M.R(x5);
            }
            rh00 h = nzo.h(cb0Var, (izs) x5, M);
            c(yhfVar, izsVar, q630Var, M, (i5 & 896) | (i2 & 14) | i6 | ((i2 >> 6) & 7168));
            boolean z2 = i4 == 256;
            Object x6 = M.x();
            if (z2 || x6 == c0012a) {
                x6 = new z8c(izsVar, 1);
                M.R(x6);
            }
            fo50.k(0, 1, M, (gzs) x6, false);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean s = ylu0Var3.s();
            Boolean valueOf = Boolean.valueOf(s);
            jqd jqdVar3 = jqdVar;
            tw50 tw50Var3 = tw50Var;
            ylu0 ylu0Var4 = ylu0Var;
            boolean y2 = M.y(f5zVar) | ((i2 & 112) == 32) | M.y(nldVar) | M.y(h) | M.y(context) | M.l(s) | M.y(jqdVar3) | M.y(tw50Var3) | M.y(zih0Var) | (i4 == 256) | M.J(ylu0Var4);
            Object x7 = M.x();
            if (y2 || x7 == c0012a) {
                bool = valueOf;
                aVar2 = M;
                thf thfVar = new thf(f5zVar, obj, nldVar, h, context, s, jqdVar3, tw50Var3, zih0Var, obj2, izsVar, ylu0Var4, null);
                aVar2.R(thfVar);
                x7 = thfVar;
            } else {
                aVar2 = M;
                bool = valueOf;
            }
            bap.g(bool, (wzs) x7, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new wzs(obj, izsVar, obj2, q630Var, i) { // from class: xsna.phf
                public final /* synthetic */ Object c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ Object e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ne7.I(24577);
                    vhf.a(yhf.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj3, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(xhf xhfVar, int i, q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        androidx.compose.runtime.a M = aVar.M(483869382);
        int i3 = (M.J(xhfVar) ? 4 : 2) | i2 | (M.J(ofe.a) ? 32 : 16) | (M.o(i) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(483869382, i3, -1, "com.vk.clips.upload.ui.impl.compose.views.ClipsUploadScreenContainer (ClipsUploadScreen.kt:90)");
            }
            yhf yhfVar = (yhf) nr2.u(xhfVar.h, M).getValue();
            iyk0 iyk0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) M.r(iyk0Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                qow qowVar = new qow(new uhf());
                M.R(qowVar);
                x = qowVar;
            }
            T t = ((qow) x).a;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = ((ClipsUploadSdkUiComponent) ((k7m) m7m.f((w8i) t)).mo408a(fpf0.a(ClipsUploadSdkUiComponent.class))).k().a().a();
                M.R(x2);
            }
            rvi.b(new c9e0[]{ckw.b.b((ClipsComposeImageLoader) x2), iyk0Var.b(new lpj(context, i))}, kai.c(660919814, new lhf(yhfVar, xhfVar, t, q630Var), M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ohf(i, i2, 0, xhfVar, q630Var);
        }
    }

    public static final void c(yhf yhfVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-392451430);
        if ((i & 6) == 0) {
            i2 = (M.J(yhfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(ofe.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-392451430, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.Content (ClipsUploadScreen.kt:210)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            jai c = kai.c(-948092941, new shf(izsVar, 0, (byte) 0), M);
            jai c2 = kai.c(1244420852, new wja(izsVar, yhfVar), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(d, c, c2, null, null, 0, ylu0Var.getBackground().a, 0L, kai.c(52112830, new mn7(1, yhfVar, izsVar), M), aVar2, 805306800, 376);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new mhf(i, 0, yhfVar, izsVar, q630Var);
        }
    }
}
