package defpackage;

import android.widget.ImageView;

/* loaded from: classes15.dex */
public final class h2b implements gtk {
    public final xav a;

    public h2b(xav xavVar) {
        this.a = xavVar;
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, btk btkVar, int i) {
        yn50 yn50Var = (yn50) this.a.load(str);
        yn50Var.b.c = i != -1 ? 0 : -1;
        int i2 = 1;
        yn50Var.c(new dnh(i2, btkVar));
        return new g2b(i2, yn50Var);
    }

    @Override // defpackage.gtk
    public final hxy loadImageBytes(String str, btk btkVar, int i) {
        yn50 yn50Var = (yn50) this.a.load(str);
        xn50 xn50Var = yn50Var.b;
        int i2 = 1;
        xn50Var.l = true;
        xn50Var.c = i != -1 ? 0 : -1;
        yn50Var.c(new dnh(i2, btkVar));
        return new g2b(i2, yn50Var);
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, ImageView imageView) {
        g9v load = this.a.load(str);
        ((yn50) load).b(imageView, null);
        return new g2b(0, load);
    }

    @Override // defpackage.gtk
    public final hxy loadImageBytes(String str, btk btkVar) {
        return loadImageBytes(str, btkVar, 0);
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, btk btkVar) {
        return loadImage(str, btkVar, 0);
    }
}
