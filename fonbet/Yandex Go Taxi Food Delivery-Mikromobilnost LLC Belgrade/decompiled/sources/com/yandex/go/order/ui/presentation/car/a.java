package com.yandex.go.order.ui.presentation.car;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.c58;
import defpackage.f2z;
import defpackage.gic;
import defpackage.m810;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.y48;
import defpackage.z48;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.ui.api.car.CarIconPart$Layer;

/* loaded from: classes14.dex */
public final class a implements f2z {
    public final gic a;
    public final c58 b;
    public final y48 c;
    public final tt2 d;
    public final Resources e;
    public Integer f;
    public WeakReference g = new WeakReference(null);

    public a(Context context, gic gicVar, c58 c58Var, y48 y48Var, tt2 tt2Var) {
        this.a = gicVar;
        this.b = c58Var;
        this.c = y48Var;
        this.d = tt2Var;
        this.e = context.getResources();
    }

    public final Bitmap a(int i) {
        Integer num;
        Bitmap bitmap = (Bitmap) this.g.get();
        if (bitmap != null && (num = this.f) != null && num.intValue() == i) {
            return bitmap;
        }
        List list = this.c.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c58 c58Var = this.b;
            if (!hasNext) {
                int i2 = c58Var.a;
                int i3 = c58Var.b;
                int i4 = c58Var.c;
                int i5 = c58Var.d;
                this.a.getClass();
                Bitmap a = gic.a(i, i2, i3, i4, i5, arrayList);
                this.f = Integer.valueOf(i);
                this.g = new WeakReference(a);
                return a;
            }
            Pair pair = (Pair) it.next();
            CarIconPart$Layer carIconPart$Layer = (CarIconPart$Layer) pair.getFirst();
            Bitmap decodeResource = BitmapFactory.decodeResource(this.e, ((Number) pair.getSecond()).intValue());
            int i6 = (c58Var.a - c58Var.c) - c58Var.e;
            arrayList.add(new z48(carIconPart$Layer, Bitmap.createScaledBitmap(decodeResource, i6, m810.b((i6 / decodeResource.getWidth()) * decodeResource.getHeight()), true)));
        }
    }

    public final Object b(int i, ContinuationImpl continuationImpl) {
        this.d.getClass();
        return tje.k0(uyj.a, new LocalColorizedCarIconFactoryImpl$createCarIconSuspend$2(this, i, null), continuationImpl);
    }
}
