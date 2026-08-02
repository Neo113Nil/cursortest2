package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.bvf0;
import defpackage.fia1;
import defpackage.fse;
import defpackage.gwk0;
import defpackage.gzc0;
import defpackage.khp0;
import defpackage.knq0;
import defpackage.oz40;
import defpackage.rzx;
import defpackage.s8o;
import defpackage.uvc;
import defpackage.wz40;
import defpackage.xgd;
import defpackage.zii0;
import java.util.Arrays;
import java.util.function.Consumer;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class b implements xgd {
    public final oz40 a = f.j(Boolean.FALSE);

    public final void a(AndroidComposeView androidComposeView, knq0 knq0Var, fse fseVar, Consumer consumer) {
        wz40 wz40Var = new wz40(new khp0[16]);
        c.a(knq0Var.a(), 0, new ScrollCapture$onScrollCaptureSearch$1(wz40Var));
        Arrays.sort(wz40Var.a, 0, wz40Var.c, uvc.a(ScrollCapture$onScrollCaptureSearch$2.w, ScrollCapture$onScrollCaptureSearch$3.w));
        int i = wz40Var.c;
        khp0 khp0Var = (khp0) (i == 0 ? null : wz40Var.a[i - 1]);
        if (khp0Var == null) {
            return;
        }
        ComposeScrollCaptureCallback composeScrollCaptureCallback = new ComposeScrollCaptureCallback(khp0Var.b(), khp0Var.c(), bvf0.a(fseVar), this, androidComposeView);
        rzx a = khp0Var.a();
        zii0 j = gwk0.o(a).j(a, true);
        long c = khp0Var.c().c();
        ScrollCaptureTarget m = gzc0.m(androidComposeView, fia1.d(s8o.P(j)), new Point((int) (c >> 32), (int) (c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), composeScrollCaptureCallback);
        m.setScrollBounds(fia1.d(khp0Var.c()));
        consumer.accept(m);
    }
}
