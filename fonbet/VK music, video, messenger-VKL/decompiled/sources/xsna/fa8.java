package xsna;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: bounds.kt */
/* loaded from: classes4.dex */
public final class fa8 {
    public static final /* synthetic */ qcy<Object>[] a;
    public static final xqo0 b;

    static {
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(fa8.class, "path", "getPath()Landroid/graphics/Path;");
        fpf0.a.getClass();
        a = new qcy[]{propertyReference0Impl};
        b = new xqo0(new com.vk.movika.sdk.base.logic.interactor.m(4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(hq90 hq90Var, RectF rectF) {
        qcy<Object>[] qcyVarArr = a;
        qcy<Object> qcyVar = qcyVarArr[0];
        xqo0 xqo0Var = b;
        ((Path) xqo0Var.b.get()).rewind();
        eq90 eq90Var = hq90Var.b;
        List<glb0> list = hq90Var.e;
        qcy<Object> qcyVar2 = qcyVarArr[0];
        eq90.d(eq90Var, list, (Path) xqo0Var.b.get(), hq90Var.c, 8);
        qcy<Object> qcyVar3 = qcyVarArr[0];
        ((Path) xqo0Var.b.get()).computeBounds(rectF, true);
    }

    public static final void b(mmb0 mmb0Var, RectF rectF) {
        if (mmb0Var.d.isEmpty()) {
            rectF.setEmpty();
        }
        Iterator<T> it = mmb0Var.d.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float f = ((glb0) it.next()).a;
        while (it.hasNext()) {
            f = Math.min(f, ((glb0) it.next()).a);
        }
        Iterator<T> it2 = mmb0Var.d.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        float f2 = ((glb0) it2.next()).b;
        while (it2.hasNext()) {
            f2 = Math.min(f2, ((glb0) it2.next()).b);
        }
        Iterator<T> it3 = mmb0Var.d.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        float f3 = ((glb0) it3.next()).a;
        while (it3.hasNext()) {
            f3 = Math.max(f3, ((glb0) it3.next()).a);
        }
        Iterator<T> it4 = mmb0Var.d.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        float f4 = ((glb0) it4.next()).b;
        while (it4.hasNext()) {
            f4 = Math.max(f4, ((glb0) it4.next()).b);
        }
        rectF.set(f, f2, f3, f4);
    }
}
