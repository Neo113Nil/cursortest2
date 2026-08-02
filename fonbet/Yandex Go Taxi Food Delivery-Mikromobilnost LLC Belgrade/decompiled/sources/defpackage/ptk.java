package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import com.yandex.div.svg.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ptk implements gtk {
    public final gtk a;
    public final Context b;
    public final List c;
    public final a d;
    public final int e;

    public ptk(Context context, gtk gtkVar) {
        this.a = gtkVar;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = Collections.singletonList(new qsk());
        this.d = !gtkVar.hasSvgSupport().booleanValue() ? new a(applicationContext) : null;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.e = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public final String a(String str) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((qsk) it.next()).getClass();
            if (cvu0.x(str, "divkit-asset", false)) {
                str = "file:///android_asset/divkit/".concat(evu0.Q("divkit-asset://", str));
            }
        }
        return str;
    }

    public final gtk b(String str) {
        a aVar = this.d;
        if (aVar != null) {
            int G = evu0.G(str, '?', 0, 6);
            if (G < 0) {
                G = str.length();
            }
            if (cvu0.s(str.substring(0, G), ".svg", false)) {
                return aVar;
            }
        }
        return this.a;
    }

    @Override // defpackage.gtk
    public final hxy loadAnimatedImage(String str, btk btkVar) {
        if (jl40.l(str, "empty://")) {
            btkVar.c();
            return new d7l();
        }
        String a = a(str);
        return b(a).loadAnimatedImage(a, btkVar);
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, btk btkVar) {
        if (jl40.l(str, "empty://")) {
            btkVar.b();
            return new d7l();
        }
        String a = a(str);
        gtk b = b(a);
        if (b.needLimitBitmapSize()) {
            btkVar = new otk(this, btkVar, this.b);
        }
        return b.loadImage(a, btkVar);
    }
}
