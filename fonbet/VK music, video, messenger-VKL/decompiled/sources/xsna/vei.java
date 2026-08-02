package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class vei implements a0t {
    @Override // xsna.a0t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        jdo0 jdo0Var = (jdo0) obj;
        wco0 wco0Var = (wco0) obj2;
        gzs gzsVar = (gzs) obj3;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj4;
        int intValue = ((Integer) obj5).intValue();
        if ((intValue & 6) == 0) {
            i = ((intValue & 8) == 0 ? aVar.J(jdo0Var) : aVar.y(jdo0Var) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= (intValue & 64) == 0 ? aVar.J(wco0Var) : aVar.y(wco0Var) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= aVar.y(gzsVar) ? 256 : 128;
        }
        if (aVar.t(i & 1, (i & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(636288403, i, -1, "androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda$636288403.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:90)");
            }
            vol.c(jdo0Var, wco0Var, gzsVar, aVar, i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
