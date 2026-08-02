package xsna;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.progressindicator.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.qlo;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* loaded from: classes13.dex */
public final class a8z extends otw<ObjectAnimator> {
    public static final a i = new a(Float.class, "animationFraction");
    public ObjectAnimator c;
    public final ilq d;
    public final m8z e;
    public int f;
    public boolean g;
    public float h;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    public class a extends Property<a8z, Float> {
        @Override // android.util.Property
        public final Float get(a8z a8zVar) {
            return Float.valueOf(a8zVar.h);
        }

        @Override // android.util.Property
        public final void set(a8z a8zVar, Float f) {
            a8z a8zVar2 = a8zVar;
            float floatValue = f.floatValue();
            a8zVar2.h = floatValue;
            ArrayList arrayList = a8zVar2.b;
            ((qlo.a) arrayList.get(0)).a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float b = otw.b((int) (floatValue * 333.0f), 0, 667);
            qlo.a aVar = (qlo.a) arrayList.get(0);
            qlo.a aVar2 = (qlo.a) arrayList.get(1);
            ilq ilqVar = a8zVar2.d;
            float interpolation = ilqVar.getInterpolation(b);
            aVar2.a = interpolation;
            aVar.b = interpolation;
            qlo.a aVar3 = (qlo.a) arrayList.get(1);
            qlo.a aVar4 = (qlo.a) arrayList.get(2);
            float interpolation2 = ilqVar.getInterpolation(b + 0.49925038f);
            aVar4.a = interpolation2;
            aVar3.b = interpolation2;
            ((qlo.a) arrayList.get(2)).b = 1.0f;
            if (a8zVar2.g && ((qlo.a) arrayList.get(1)).b < 1.0f) {
                ((qlo.a) arrayList.get(2)).c = ((qlo.a) arrayList.get(1)).c;
                ((qlo.a) arrayList.get(1)).c = ((qlo.a) arrayList.get(0)).c;
                ((qlo.a) arrayList.get(0)).c = a8zVar2.e.c[a8zVar2.f];
                a8zVar2.g = false;
            }
            a8zVar2.a.invalidateSelf();
        }
    }

    public a8z(@NonNull m8z m8zVar) {
        super(3);
        this.f = 1;
        this.e = m8zVar;
        this.d = new ilq();
    }

    @Override // xsna.otw
    public final void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // xsna.otw
    public final void c() {
        h();
    }

    @Override // xsna.otw
    public final void f() {
        if (this.c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration(333L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new wko(this, 1));
        }
        h();
        this.c.start();
    }

    public final void h() {
        this.g = true;
        this.f = 1;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            qlo.a aVar = (qlo.a) it.next();
            m8z m8zVar = this.e;
            aVar.c = m8zVar.c[0];
            aVar.d = m8zVar.g / 2;
        }
    }

    @Override // xsna.otw
    public final void e() {
    }

    @Override // xsna.otw
    public final void g() {
    }

    @Override // xsna.otw
    public final void d(@Nullable a.c cVar) {
    }
}
