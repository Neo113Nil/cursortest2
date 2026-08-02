package com.yandex.go.scooters.photocontrol.domain;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import defpackage.d6z;
import defpackage.i73;
import defpackage.ixn;
import defpackage.j73;
import defpackage.jdv;
import defpackage.kdv;
import defpackage.lw01;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pzn0;
import defpackage.qrq0;
import defpackage.scc;
import defpackage.sgb1;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uy80;
import defpackage.uyj;
import defpackage.y5e;
import defpackage.ycc;
import defpackage.yw01;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class g {
    public final tt2 a;
    public final ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a b;
    public final kdv c = new kdv();

    public g(tt2 tt2Var, ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar) {
        this.a = tt2Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jdv jdvVar, List list, ContinuationImpl continuationImpl) {
        ScootersPhotocontrolPointsTransformInteractor$transformPoints$1 scootersPhotocontrolPointsTransformInteractor$transformPoints$1;
        int i;
        uy80 uy80Var;
        if (continuationImpl instanceof ScootersPhotocontrolPointsTransformInteractor$transformPoints$1) {
            scootersPhotocontrolPointsTransformInteractor$transformPoints$1 = (ScootersPhotocontrolPointsTransformInteractor$transformPoints$1) continuationImpl;
            int i2 = scootersPhotocontrolPointsTransformInteractor$transformPoints$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPhotocontrolPointsTransformInteractor$transformPoints$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPhotocontrolPointsTransformInteractor$transformPoints$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPhotocontrolPointsTransformInteractor$transformPoints$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPhotocontrolPointsTransformInteractor$transformPoints$1.L$0 = jdvVar;
                    scootersPhotocontrolPointsTransformInteractor$transformPoints$1.L$1 = list;
                    scootersPhotocontrolPointsTransformInteractor$transformPoints$1.label = 1;
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(o400.a, new ScootersPhotocontrolPointsTransformInteractor$getPreviewViewOutputTransform$2(this, null), scootersPhotocontrolPointsTransformInteractor$transformPoints$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) scootersPhotocontrolPointsTransformInteractor$transformPoints$1.L$1;
                    jdvVar = (jdv) scootersPhotocontrolPointsTransformInteractor$transformPoints$1.L$0;
                    kotlin.b.b(obj);
                }
                uy80Var = (uy80) obj;
                if (uy80Var != null) {
                    return null;
                }
                Size size = uy80Var.b;
                kdv kdvVar = this.c;
                kdvVar.a = true;
                uy80 a = kdvVar.a(jdvVar);
                Size size2 = a.b;
                if (!lw01.e(size2, false, size)) {
                    Objects.toString(size2);
                    Objects.toString(size);
                    sgb1.g(5, "CoordinateTransform");
                }
                Matrix matrix = new Matrix();
                d6z.y("The source transform cannot be inverted", a.a.invert(matrix));
                matrix.postConcat(uy80Var.a);
                ArrayList arrayList = new ArrayList();
                for (PointF pointF : list) {
                    ycc.s(arrayList, j73.v(new Float[]{new Float(pointF.x), new Float(pointF.y)}));
                }
                float[] G0 = kotlin.collections.a.G0(arrayList);
                matrix.mapPoints(G0);
                qrq0 i73Var = G0.length == 0 ? ixn.a : new i73(1, G0);
                pzn0 pzn0Var = new pzn0(22);
                y5e.j(2, 2);
                return kotlin.collections.a.q0(kotlin.sequences.b.s(new yw01(new kotlin.collections.c(i73Var), pzn0Var)));
            }
        }
        scootersPhotocontrolPointsTransformInteractor$transformPoints$1 = new ScootersPhotocontrolPointsTransformInteractor$transformPoints$1(this, continuationImpl);
        Object obj2 = scootersPhotocontrolPointsTransformInteractor$transformPoints$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotocontrolPointsTransformInteractor$transformPoints$1.label;
        if (i != 0) {
        }
        uy80Var = (uy80) obj2;
        if (uy80Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(jdv jdvVar, Rect rect, ContinuationImpl continuationImpl) {
        ScootersPhotocontrolPointsTransformInteractor$transformRect$1 scootersPhotocontrolPointsTransformInteractor$transformRect$1;
        int i;
        uy80 uy80Var;
        if (continuationImpl instanceof ScootersPhotocontrolPointsTransformInteractor$transformRect$1) {
            scootersPhotocontrolPointsTransformInteractor$transformRect$1 = (ScootersPhotocontrolPointsTransformInteractor$transformRect$1) continuationImpl;
            int i2 = scootersPhotocontrolPointsTransformInteractor$transformRect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPhotocontrolPointsTransformInteractor$transformRect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPhotocontrolPointsTransformInteractor$transformRect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPhotocontrolPointsTransformInteractor$transformRect$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPhotocontrolPointsTransformInteractor$transformRect$1.L$0 = jdvVar;
                    scootersPhotocontrolPointsTransformInteractor$transformRect$1.L$1 = rect;
                    scootersPhotocontrolPointsTransformInteractor$transformRect$1.label = 1;
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(o400.a, new ScootersPhotocontrolPointsTransformInteractor$getPreviewViewOutputTransform$2(this, null), scootersPhotocontrolPointsTransformInteractor$transformRect$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rect = (Rect) scootersPhotocontrolPointsTransformInteractor$transformRect$1.L$1;
                    jdvVar = (jdv) scootersPhotocontrolPointsTransformInteractor$transformRect$1.L$0;
                    kotlin.b.b(obj);
                }
                uy80Var = (uy80) obj;
                if (uy80Var != null) {
                    return null;
                }
                Size size = uy80Var.b;
                kdv kdvVar = this.c;
                kdvVar.a = false;
                uy80 a = kdvVar.a(jdvVar);
                Size size2 = a.b;
                if (!lw01.e(size2, false, size)) {
                    Objects.toString(size2);
                    Objects.toString(size);
                    sgb1.g(5, "CoordinateTransform");
                }
                Matrix matrix = new Matrix();
                d6z.y("The source transform cannot be inverted", a.a.invert(matrix));
                matrix.postConcat(uy80Var.a);
                RectF rectF = new RectF(rect);
                matrix.mapRect(rectF);
                return scc.g(new Point((int) rectF.left, (int) rectF.top), new Point((int) rectF.right, (int) rectF.top), new Point((int) rectF.right, (int) rectF.bottom), new Point((int) rectF.left, (int) rectF.bottom));
            }
        }
        scootersPhotocontrolPointsTransformInteractor$transformRect$1 = new ScootersPhotocontrolPointsTransformInteractor$transformRect$1(this, continuationImpl);
        Object obj2 = scootersPhotocontrolPointsTransformInteractor$transformRect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotocontrolPointsTransformInteractor$transformRect$1.label;
        if (i != 0) {
        }
        uy80Var = (uy80) obj2;
        if (uy80Var != null) {
        }
    }
}
