package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.airbnb.lottie.utils.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class fge implements ccm, vq90, e35, tix {
    public final OffscreenLayer.a a;
    public final RectF b;
    public final OffscreenLayer c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final ArrayList i;
    public final LottieDrawable j;
    public ArrayList k;
    public final iw01 l;

    public fge(LottieDrawable lottieDrawable, l35 l35Var, String str, boolean z, ArrayList arrayList, ge2 ge2Var) {
        this.a = new OffscreenLayer.a();
        this.b = new RectF();
        this.c = new OffscreenLayer();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.g = str;
        this.j = lottieDrawable;
        this.h = z;
        this.i = arrayList;
        if (ge2Var != null) {
            iw01 iw01Var = new iw01(ge2Var);
            this.l = iw01Var;
            iw01Var.a(l35Var);
            iw01Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            uee ueeVar = (uee) arrayList.get(size);
            if (ueeVar instanceof q0u) {
                arrayList2.add((q0u) ueeVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((q0u) arrayList2.get(size2)).c(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // defpackage.tix
    public final void a(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        String str = this.g;
        if (!sixVar.e(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            sixVar2 = sixVar2.a(str);
            if (sixVar.b(i, str)) {
                arrayList.add(sixVar2.g(this));
            }
        }
        if (!sixVar.f(i, str)) {
            return;
        }
        int d = sixVar.d(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            uee ueeVar = (uee) arrayList2.get(i2);
            if (ueeVar instanceof tix) {
                ((tix) ueeVar).a(sixVar, d, arrayList, sixVar2);
            }
            i2++;
        }
    }

    @Override // defpackage.ccm
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        iw01 iw01Var = this.l;
        if (iw01Var != null) {
            matrix2.preConcat(iw01Var.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            uee ueeVar = (uee) arrayList.get(size);
            if (ueeVar instanceof ccm) {
                ((ccm) ueeVar).b(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List c() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                uee ueeVar = (uee) arrayList.get(i);
                if (ueeVar instanceof vq90) {
                    this.k.add((vq90) ueeVar);
                }
                i++;
            }
        }
        return this.k;
    }

    @Override // defpackage.e35
    public final void d() {
        this.j.invalidateSelf();
    }

    @Override // defpackage.uee
    public final void e(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            uee ueeVar = (uee) arrayList.get(size2);
            ueeVar.e(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(ueeVar);
        }
    }

    @Override // defpackage.ccm
    public final void f(Canvas canvas, Matrix matrix, int i, a aVar) {
        if (this.h) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        iw01 iw01Var = this.l;
        if (iw01Var != null) {
            matrix2.preConcat(iw01Var.e());
            i = (int) (((((iw01Var.p == null ? 100 : ((Integer) r1.f()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        LottieDrawable lottieDrawable = this.j;
        boolean z = (lottieDrawable.isApplyingOpacityToLayersEnabled() && h() && i != 255) || (aVar != null && lottieDrawable.isApplyingShadowToLayersEnabled() && h());
        int i2 = z ? 255 : i;
        OffscreenLayer offscreenLayer = this.c;
        if (z) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            b(rectF, matrix, true);
            OffscreenLayer.a aVar2 = this.a;
            aVar2.a = i;
            if (aVar != null) {
                if (Color.alpha(aVar.d) > 0) {
                    aVar2.b = aVar;
                } else {
                    aVar2.b = null;
                }
                aVar = null;
            } else {
                aVar2.b = null;
            }
            canvas = offscreenLayer.e(canvas, rectF, aVar2);
        } else if (aVar != null) {
            a aVar3 = new a(aVar);
            aVar3.b(i2);
            aVar = aVar3;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof ccm) {
                ((ccm) obj).f(canvas, matrix2, i2, aVar);
            }
        }
        if (z) {
            offscreenLayer.c();
        }
    }

    @Override // defpackage.tix
    public final void g(puz puzVar, Object obj) {
        iw01 iw01Var = this.l;
        if (iw01Var != null) {
            iw01Var.c(puzVar, obj);
        }
    }

    @Override // defpackage.uee
    public final String getName() {
        throw null;
    }

    @Override // defpackage.vq90
    public final Path getPath() {
        Matrix matrix = this.d;
        matrix.reset();
        iw01 iw01Var = this.l;
        if (iw01Var != null) {
            matrix.set(iw01Var.e());
        }
        Path path = this.e;
        path.reset();
        if (!this.h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                uee ueeVar = (uee) arrayList.get(size);
                if (ueeVar instanceof vq90) {
                    path.addPath(((vq90) ueeVar).getPath(), matrix);
                }
            }
        }
        return path;
    }

    public final boolean h() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof ccm) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fge(LottieDrawable lottieDrawable, l35 l35Var, qhr0 qhr0Var, nsz nszVar) {
        this(lottieDrawable, l35Var, r3, r4, r5, r11);
        ge2 ge2Var;
        String str = qhr0Var.a;
        boolean z = qhr0Var.c;
        List list = qhr0Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            uee a = ((ehe) list.get(i2)).a(lottieDrawable, nszVar, l35Var);
            if (a != null) {
                arrayList.add(a);
            }
        }
        while (true) {
            if (i >= list.size()) {
                ge2Var = null;
                break;
            }
            ehe eheVar = (ehe) list.get(i);
            if (eheVar instanceof ge2) {
                ge2Var = (ge2) eheVar;
                break;
            }
            i++;
        }
    }
}
