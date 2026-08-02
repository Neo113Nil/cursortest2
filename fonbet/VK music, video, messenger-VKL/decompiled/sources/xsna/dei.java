package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class dei implements d0t {
    @Override // xsna.d0t
    public final Object f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.a aVar, Integer num) {
        int i;
        String str = (String) obj;
        boolean booleanValue = bool.booleanValue();
        mnj mnjVar = (mnj) obj2;
        yzs yzsVar = (yzs) obj3;
        gzs gzsVar = (gzs) obj4;
        int intValue = num.intValue();
        int i2 = intValue & 6;
        q630.a aVar2 = q630.a.a;
        if (i2 == 0) {
            i = (aVar.J(aVar2) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= aVar.J(str) ? 32 : 16;
        }
        if ((intValue & 384) == 0) {
            i |= aVar.l(booleanValue) ? 256 : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= aVar.J(mnjVar) ? 2048 : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= aVar.y(yzsVar) ? 16384 : 8192;
        }
        if ((intValue & 196608) == 0) {
            i |= aVar.y(gzsVar) ? 131072 : 65536;
        }
        if (aVar.t(i & 1, (599187 & i) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1571120048, i, -1, "androidx.compose.foundation.contextmenu.ComposableSingletons$ContextMenuUiKt.lambda$-1571120048.<anonymous> (ContextMenuUi.kt:136)");
            }
            bpj.c(str, booleanValue, mnjVar, aVar2, yzsVar, gzsVar, aVar, ((i >> 3) & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
