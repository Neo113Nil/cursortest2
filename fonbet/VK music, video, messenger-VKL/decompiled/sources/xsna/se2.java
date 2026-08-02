package xsna;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;

/* compiled from: AndroidWindowInfo.android.kt */
/* loaded from: classes11.dex */
public final class se2 {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        xsna.grx0.a.getClass();
        r7 = xsna.grx0.a.a;
        r7 = xsna.grx0.a.b.a(r0);
        r1 = (r7.a.c().width() << 32) | (r7.a.c().height() & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        return new xsna.d1m(r1, xsna.hpt0.d(r0).E(xsna.pli.w(r1)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final d1m a(View view) {
        Context context = view.getContext();
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService) || (context2 instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
        }
        context2 = null;
        Configuration configuration = context.getResources().getConfiguration();
        ezl d = hpt0.d(context);
        long b = byc0.b(configuration.screenWidthDp, configuration.screenHeightDp);
        return new d1m(pli.t(d.p1(b)), b);
    }
}
