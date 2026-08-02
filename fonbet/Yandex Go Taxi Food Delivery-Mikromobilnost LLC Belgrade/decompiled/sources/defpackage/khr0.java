package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class khr0 implements vq90, e35, uix {
    public final String b;
    public final boolean c;
    public final LottieDrawable d;
    public final thr0 e;
    public boolean f;
    public final Path a = new Path();
    public final dwd g = new dwd();

    public khr0(LottieDrawable lottieDrawable, l35 l35Var, cir0 cir0Var) {
        this.b = cir0Var.a;
        this.c = cir0Var.d;
        this.d = lottieDrawable;
        thr0 thr0Var = new thr0((List) cir0Var.c.b);
        this.e = thr0Var;
        l35Var.c(thr0Var);
        thr0Var.a(this);
    }

    @Override // defpackage.tix
    public final void a(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        ti20.g(sixVar, i, arrayList, sixVar2, this);
    }

    @Override // defpackage.e35
    public final void d() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.e.m = arrayList;
                return;
            }
            uee ueeVar = (uee) arrayList2.get(i);
            if (ueeVar instanceof ff11) {
                ff11 ff11Var = (ff11) ueeVar;
                if (ff11Var.c == ShapeTrimPath$Type.SIMULTANEOUSLY) {
                    this.g.a.add(ff11Var);
                    ff11Var.a(this);
                    i++;
                }
            }
            if (ueeVar instanceof fyk0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                fyk0 fyk0Var = (fyk0) ueeVar;
                fyk0Var.b.a(this);
                arrayList.add(fyk0Var);
            }
            i++;
        }
    }

    @Override // defpackage.tix
    public final void g(puz puzVar, Object obj) {
        if (obj == cuz.N) {
            this.e.k(puzVar);
        }
    }

    @Override // defpackage.uee
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.vq90
    public final Path getPath() {
        boolean z = this.f;
        thr0 thr0Var = this.e;
        Path path = this.a;
        if (z && thr0Var.e == null) {
            return path;
        }
        path.reset();
        if (this.c) {
            this.f = true;
            return path;
        }
        Path path2 = (Path) thr0Var.f();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.g.a(path);
        this.f = true;
        return path;
    }
}
