package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.avatar.badge.VkAvatarBadge;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.aq5;
import xsna.l9r0;
import xsna.o9r0;

/* compiled from: VKAvatarViewDelegateOnDrawImpl.kt */
/* loaded from: classes15.dex */
public final class far0 extends ear0 {
    public o9r0 b;
    public w9r0 c;
    public final bq5 d;
    public u9r0 e;
    public j9r0 f;
    public final m9r0 g;
    public final ArrayList h;
    public aar0 i;

    public far0(zjt<?> zjtVar, AttributeSet attributeSet) {
        super(zjtVar);
        aq5.a.getClass();
        this.d = aq5.a.b;
        this.g = new m9r0();
        this.h = new ArrayList();
        this.i = new aar0(an10.b(hbh0.c(zjtVar.getContext(), r0)), zjtVar.getMeasuredWidth());
        TypedArray obtainStyledAttributes = zjtVar.getContext().obtainStyledAttributes(attributeSet, R$styleable.d);
        try {
            boolean z = obtainStyledAttributes.getBoolean(6, false);
            int color = obtainStyledAttributes.getColor(5, 0);
            this.b = new o9r0(z, color == 0 ? null : Integer.valueOf(color), n9r0.a(obtainStyledAttributes, 1), n9r0.a(obtainStyledAttributes, 2), obtainStyledAttributes.getBoolean(3, false), new o9r0.a(obtainStyledAttributes.getString(4)), n9r0.a(obtainStyledAttributes, 8), n9r0.a(obtainStyledAttributes, 7), n9r0.a(obtainStyledAttributes, 0), 1536);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // xsna.ear0
    public final o9r0 a() {
        return this.b;
    }

    @Override // xsna.ear0
    public final void b(o9r0 o9r0Var) {
        this.b = o9r0Var;
    }

    @Override // xsna.ear0
    public final void c(AvatarBorderType avatarBorderType, cq5 cq5Var, wp5 wp5Var) {
        f(avatarBorderType, cq5Var, wp5Var);
        this.a.invalidate();
    }

    public final void e(Canvas canvas, izs<? super Canvas, s3q0> izsVar) {
        bgd bgdVar;
        Path path;
        r9r0 r9r0Var;
        j9r0 j9r0Var = this.f;
        zjt<?> zjtVar = this.a;
        if (j9r0Var != null && (r9r0Var = j9r0Var.c) != null) {
            r9r0Var.b(zjtVar.getContext(), canvas);
        }
        canvas.save();
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Path b = ((VkAvatarBadge) it.next()).b(zjtVar.getContext(), this.i);
            if (b != null) {
                canvas.clipPath(b, Region.Op.DIFFERENCE);
            }
        }
        canvas.save();
        j9r0 j9r0Var2 = this.f;
        if (j9r0Var2 != null) {
            canvas.clipPath((Path) j9r0Var2.b.a);
        }
        izsVar.invoke(canvas);
        canvas.restore();
        j9r0 j9r0Var3 = this.f;
        if (j9r0Var3 != null && (bgdVar = j9r0Var3.e) != null && (path = (Path) bgdVar.a) != null) {
            canvas.save();
            canvas.clipPath(path, Region.Op.INTERSECT);
            j9r0 j9r0Var4 = this.f;
            if (j9r0Var4 != null) {
                Iterator it2 = j9r0Var4.d.iterator();
                while (it2.hasNext()) {
                    ((r9r0) it2.next()).b(zjtVar.getContext(), canvas);
                }
            }
            canvas.restore();
        } else if (j9r0Var3 != null) {
            Iterator it3 = j9r0Var3.d.iterator();
            while (it3.hasNext()) {
                ((r9r0) it3.next()).b(zjtVar.getContext(), canvas);
            }
        }
        canvas.restore();
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((VkAvatarBadge) it4.next()).a(zjtVar.getContext(), this.i, canvas);
        }
    }

    public final void f(AvatarBorderType avatarBorderType, cq5 cq5Var, xp5 xp5Var) {
        float a;
        float a2;
        float max;
        Float f;
        o9r0.a aVar;
        Float f2;
        Float f3;
        Float f4;
        Float f5;
        zjt<?> zjtVar = this.a;
        Context context = zjtVar.getContext();
        aar0 aar0Var = this.i;
        o9r0 o9r0Var = this.b;
        this.g.getClass();
        float f6 = aar0Var.a;
        boolean z = o9r0Var != null ? o9r0Var.a : false;
        String str = null;
        Integer num = o9r0Var != null ? o9r0Var.b : null;
        float f7 = 4.0f;
        if (o9r0Var == null || (f5 = o9r0Var.c) == null) {
            a = hbh0.a(context, f6 < 57.0f ? 2.0f : f6 < 95.0f ? 3.0f : 4.0f);
        } else {
            a = f5.floatValue();
        }
        if (o9r0Var == null || (f4 = o9r0Var.g) == null) {
            if (f6 < 41.0f) {
                f7 = 1.0f;
            } else if (f6 < 95.0f) {
                f7 = 2.0f;
            } else if (f6 < 115.0f) {
                f7 = 3.0f;
            }
            a2 = hbh0.a(context, f7);
        } else {
            a2 = f4.floatValue();
        }
        float f8 = a2;
        float floatValue = (o9r0Var == null || (f3 = o9r0Var.h) == null) ? f8 : f3.floatValue();
        if (o9r0Var == null || (f2 = o9r0Var.i) == null) {
            max = (o9r0Var == null || (f = o9r0Var.d) == null) ? Math.max(2 * a, f8 + floatValue) : f.floatValue();
        } else {
            max = (aar0Var.b - f2.floatValue()) / 2.0f;
        }
        float f9 = max;
        boolean z2 = o9r0Var != null ? o9r0Var.e : false;
        if (o9r0Var != null && (aVar = o9r0Var.f) != null) {
            str = aVar.a;
        }
        boolean z3 = o9r0Var != null ? o9r0Var.k : true;
        u9r0 u9r0Var = new u9r0(this.i.b, new l9r0(z, num, a, f9, z2, new l9r0.a(str), f8, floatValue, z3), avatarBorderType, cq5Var, this.c);
        this.f = this.d.b(zjtVar.getContext(), u9r0Var, xp5Var);
        if (z3) {
            int i = (int) f9;
            zjtVar.setPadding(i, i, i, i);
        } else {
            zjtVar.setPadding(0, 0, 0, 0);
        }
        this.e = u9r0Var;
    }

    public final void g() {
        int i;
        zjt<?> zjtVar = this.a;
        if (zjtVar.getFixedWidth() > 0) {
            i = zjtVar.getFixedWidth();
        } else if (zjtVar.getWidth() > 0) {
            i = zjtVar.getWidth();
        } else {
            ViewGroup.LayoutParams layoutParams = zjtVar.getLayoutParams();
            i = layoutParams != null ? layoutParams.width : 0;
        }
        this.i = new aar0(an10.b(hbh0.c(zjtVar.getContext(), i)), i);
        u9r0 u9r0Var = this.e;
        if (u9r0Var == null) {
            return;
        }
        l9r0 l9r0Var = u9r0Var.b;
        if (!l9r0Var.i) {
            zjtVar.setPadding(0, 0, 0, 0);
        } else {
            int i2 = (int) l9r0Var.d;
            zjtVar.setPadding(i2, i2, i2, i2);
        }
    }
}
