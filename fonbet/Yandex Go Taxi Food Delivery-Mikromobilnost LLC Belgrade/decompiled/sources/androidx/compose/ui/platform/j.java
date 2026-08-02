package androidx.compose.ui.platform;

import defpackage.a7u0;
import defpackage.aii0;
import defpackage.bts;
import defpackage.dg21;
import defpackage.fid;
import defpackage.k4z;
import defpackage.m390;
import defpackage.qwd;
import defpackage.sb2;
import defpackage.vng;
import defpackage.vvf0;
import defpackage.wls;
import defpackage.zy11;

/* loaded from: classes.dex */
public abstract class j {
    public static final a7u0 a = new a7u0(CompositionLocalsKt$LocalAccessibilityManager$1.w);
    public static final a7u0 b = new a7u0(CompositionLocalsKt$LocalAutofill$1.w);
    public static final a7u0 c = new a7u0(CompositionLocalsKt$LocalAutofillTree$1.w);
    public static final a7u0 d = new a7u0(CompositionLocalsKt$LocalAutofillManager$1.w);
    public static final a7u0 e = new a7u0(CompositionLocalsKt$LocalClipboardManager$1.w);
    public static final a7u0 f = new a7u0(CompositionLocalsKt$LocalClipboard$1.w);
    public static final a7u0 g = new a7u0(CompositionLocalsKt$LocalGraphicsContext$1.w);
    public static final a7u0 h = new a7u0(CompositionLocalsKt$LocalDensity$1.w);
    public static final a7u0 i = new a7u0(CompositionLocalsKt$LocalFocusManager$1.w);
    public static final a7u0 j = new a7u0(CompositionLocalsKt$LocalFontLoader$1.w);
    public static final a7u0 k = new a7u0(CompositionLocalsKt$LocalFontFamilyResolver$1.w);
    public static final a7u0 l = new a7u0(CompositionLocalsKt$LocalHapticFeedback$1.w);
    public static final a7u0 m = new a7u0(CompositionLocalsKt$LocalInputModeManager$1.w);
    public static final a7u0 n = new a7u0(CompositionLocalsKt$LocalLayoutDirection$1.w);
    public static final a7u0 o = new a7u0(CompositionLocalsKt$LocalProvidableLocaleList$1.w);
    public static final a7u0 p = new a7u0(CompositionLocalsKt$LocalTextInputService$1.w);
    public static final a7u0 q = new a7u0(CompositionLocalsKt$LocalSoftwareKeyboardController$1.w);
    public static final a7u0 r = new a7u0(CompositionLocalsKt$LocalTextToolbar$1.w);
    public static final a7u0 s = new a7u0(CompositionLocalsKt$LocalUriHandler$1.w);
    public static final a7u0 t = new a7u0(CompositionLocalsKt$LocalViewConfiguration$1.w);
    public static final a7u0 u = new a7u0(CompositionLocalsKt$LocalWindowInfo$1.w);
    public static final a7u0 v = new a7u0(CompositionLocalsKt$LocalPointerIconService$1.w);
    public static final qwd w = new qwd(CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1.w);
    public static final a7u0 x = new a7u0(CompositionLocalsKt$LocalCursorBlinkEnabled$1.w);

    public static final void a(final m390 m390Var, final dg21 dg21Var, final wls wlsVar, fid fidVar, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1925803616);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? btsVar.k(m390Var) : btsVar.e(m390Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? btsVar.k(dg21Var) : btsVar.e(dg21Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= btsVar.e(wlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            vvf0 a2 = a.a(m390Var.getAccessibilityManager());
            vvf0 a3 = b.a(m390Var.getAutofill());
            vvf0 a4 = d.a(m390Var.getAutofillManager());
            vvf0 a5 = c.a(m390Var.getAutofillTree());
            vvf0 a6 = e.a(m390Var.getClipboardManager());
            vvf0 a7 = f.a(m390Var.getClipboard());
            vvf0 a8 = h.a(m390Var.getDensity());
            vvf0 a9 = i.a(m390Var.getFocusOwner());
            vvf0 a10 = j.a(m390Var.getFontLoader());
            a10.f = false;
            int i4 = i3;
            vvf0 a11 = k.a(m390Var.getFontFamilyResolver());
            a11.f = false;
            sb2.c(new vvf0[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, l.a(m390Var.getHapticFeedBack()), m.a(m390Var.getInputModeManager()), n.a(m390Var.getLayoutDirection()), p.a(m390Var.getTextInputService()), q.a(m390Var.getSoftwareKeyboardController()), r.a(m390Var.getTextToolbar()), s.a(dg21Var), t.a(m390Var.getViewConfiguration()), u.a(m390Var.getWindowInfo()), v.a(m390Var.getPointerIconService()), g.a(m390Var.getGraphicsContext()), k4z.a.a(m390Var.getRetainedValuesStore()), o.a(m390Var.getLocaleList())}, wlsVar, btsVar, ((i4 >> 3) & 112) | 8);
        } else {
            btsVar.Y();
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    j.a(m390.this, dg21Var, wlsVar, (fid) obj, vng.O(i2 | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
