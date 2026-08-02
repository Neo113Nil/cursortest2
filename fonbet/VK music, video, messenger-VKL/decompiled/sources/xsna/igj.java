package xsna;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.utils.OffscreenLayer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.tf6;

/* compiled from: ContentGroup.java */
/* loaded from: classes12.dex */
public final class igj implements plo, gq90, tf6.a, vdy {
    public final OffscreenLayer.b a;
    public final RectF b;
    public final OffscreenLayer c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final ArrayList i;
    public final k800 j;

    @Nullable
    public ArrayList k;

    @Nullable
    public final ikp0 l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public igj(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, a6j0 a6j0Var, i700 i700Var) {
        this(k800Var, aVar, r3, r4, r5, r11);
        dg2 dg2Var;
        String str = a6j0Var.a;
        boolean z = a6j0Var.c;
        List<eij> list = a6j0Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            gfj a = list.get(i2).a(k800Var, i700Var, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        while (true) {
            if (i >= list.size()) {
                dg2Var = null;
                break;
            }
            eij eijVar = list.get(i);
            if (eijVar instanceof dg2) {
                dg2Var = (dg2) eijVar;
                break;
            }
            i++;
        }
    }

    @Override // xsna.gfj
    public final void b(List<gfj> list, List<gfj> list2) {
        int size = list.size();
        ArrayList arrayList = this.i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            gfj gfjVar = (gfj) arrayList.get(size2);
            gfjVar.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(gfjVar);
        }
    }

    @Override // xsna.vdy
    public final void d(udy udyVar, int i, ArrayList arrayList, udy udyVar2) {
        String str = this.g;
        if (!udyVar.c(i, str) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            udy udyVar3 = new udy(udyVar2);
            udyVar3.a.add(str);
            if (udyVar.a(i, str)) {
                udy udyVar4 = new udy(udyVar3);
                udyVar4.b = this;
                arrayList.add(udyVar4);
            }
            udyVar2 = udyVar3;
        }
        if (!udyVar.d(i, str)) {
            return;
        }
        int b = udyVar.b(i, str) + i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i2 >= arrayList2.size()) {
                return;
            }
            gfj gfjVar = (gfj) arrayList2.get(i2);
            if (gfjVar instanceof vdy) {
                ((vdy) gfjVar).d(udyVar, b, arrayList, udyVar2);
            }
            i2++;
        }
    }

    @Override // xsna.plo
    public final void e(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        if (this.h) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        ikp0 ikp0Var = this.l;
        if (ikp0Var != null) {
            matrix2.preConcat(ikp0Var.e());
            i = (int) (((((ikp0Var.p == null ? 100 : r1.f().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        k800 k800Var = this.j;
        boolean z = (k800Var.v && j() && i != 255) || (aVar != null && k800Var.w && j());
        int i2 = z ? 255 : i;
        OffscreenLayer offscreenLayer = this.c;
        if (z) {
            RectF rectF = this.b;
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            g(rectF, matrix, true);
            OffscreenLayer.b bVar = this.a;
            bVar.a = i;
            if (aVar != null) {
                if (Color.alpha(aVar.d) > 0) {
                    bVar.b = aVar;
                } else {
                    bVar.b = null;
                }
                aVar = null;
            } else {
                bVar.b = null;
            }
            canvas = offscreenLayer.e(canvas, rectF, bVar);
        } else if (aVar != null) {
            com.airbnb.lottie.utils.a aVar2 = new com.airbnb.lottie.utils.a(aVar);
            aVar2.b(i2);
            aVar = aVar2;
        }
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof plo) {
                ((plo) obj).e(canvas, matrix2, i2, aVar);
            }
        }
        if (z) {
            offscreenLayer.c();
        }
    }

    @Override // xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        ikp0 ikp0Var = this.l;
        if (ikp0Var != null) {
            ikp0Var.c(t, a900Var);
        }
    }

    @Override // xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        ikp0 ikp0Var = this.l;
        if (ikp0Var != null) {
            matrix2.preConcat(ikp0Var.e());
        }
        RectF rectF2 = this.f;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ArrayList arrayList = this.i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            gfj gfjVar = (gfj) arrayList.get(size);
            if (gfjVar instanceof plo) {
                ((plo) gfjVar).g(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // xsna.gfj
    public final String getName() {
        throw null;
    }

    @Override // xsna.gq90
    public final Path getPath() {
        Matrix matrix = this.d;
        matrix.reset();
        ikp0 ikp0Var = this.l;
        if (ikp0Var != null) {
            matrix.set(ikp0Var.e());
        }
        Path path = this.e;
        path.reset();
        if (!this.h) {
            ArrayList arrayList = this.i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                gfj gfjVar = (gfj) arrayList.get(size);
                if (gfjVar instanceof gq90) {
                    path.addPath(((gq90) gfjVar).getPath(), matrix);
                }
            }
        }
        return path;
    }

    public final List<gq90> h() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.i;
                if (i >= arrayList.size()) {
                    break;
                }
                gfj gfjVar = (gfj) arrayList.get(i);
                if (gfjVar instanceof gq90) {
                    this.k.add((gq90) gfjVar);
                }
                i++;
            }
        }
        return this.k;
    }

    @Override // xsna.tf6.a
    public final void i() {
        this.j.invalidateSelf();
    }

    public final boolean j() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof plo) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public igj(k800 k800Var, com.airbnb.lottie.model.layer.a aVar, String str, boolean z, ArrayList arrayList, @Nullable dg2 dg2Var) {
        this.a = new OffscreenLayer.b();
        this.b = new RectF();
        this.c = new OffscreenLayer();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.g = str;
        this.j = k800Var;
        this.h = z;
        this.i = arrayList;
        if (dg2Var != null) {
            ikp0 ikp0Var = new ikp0(dg2Var);
            this.l = ikp0Var;
            ikp0Var.a(aVar);
            ikp0Var.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            gfj gfjVar = (gfj) arrayList.get(size);
            if (gfjVar instanceof keu) {
                arrayList2.add((keu) gfjVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((keu) arrayList2.get(size2)).h(arrayList.listIterator(arrayList.size()));
        }
    }
}
