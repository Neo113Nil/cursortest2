package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mtk implements gtk {
    public static final d7l c = new d7l();
    public final pav a;
    public final List b;

    public mtk(pav pavVar, List list) {
        this.a = pavVar;
        this.b = list;
    }

    public final hxy a(String str, btk btkVar, wls wlsVar) {
        hgv hgvVar;
        Uri parse = Uri.parse(str);
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                hgvVar = null;
                break;
            }
            hgvVar = ((igv) it.next()).a(parse);
            if (hgvVar != null) {
                break;
            }
        }
        boolean l = jl40.l(hgvVar, ngd0.A);
        d7l d7lVar = c;
        if (l) {
            btkVar.d(null);
            return d7lVar;
        }
        if (hgvVar instanceof ggv) {
            btkVar.f(((ggv) hgvVar).a);
            return d7lVar;
        }
        if (hgvVar instanceof fgv) {
            return (hxy) wlsVar.invoke(parse, ((fgv) hgvVar).a);
        }
        if (hgvVar != null) {
            w511.b();
            return null;
        }
        jst.e.d("DivImageLoaderImpl", "Not recognized mapper for uri: " + str);
        btkVar.d(null);
        return d7lVar;
    }

    @Override // defpackage.gtk
    public final hxy loadAnimatedImage(String str, btk btkVar) {
        return a(str, btkVar, new htk(0, (yrk) btkVar, this));
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, btk btkVar, int i) {
        return a(str, btkVar, new s1d(btkVar, this, i, 3));
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, btk btkVar) {
        return loadImage(str, btkVar, 0);
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, ImageView imageView) {
        throw new IllegalStateException("Must not be used");
    }
}
