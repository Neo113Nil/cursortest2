package xsna;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes13.dex */
public interface cec {

    /* compiled from: CircularRevealWidget.java */
    public static class a implements TypeEvaluator<d> {
        public static final a b = new a();
        public final d a = new d();

        @Override // android.animation.TypeEvaluator
        @NonNull
        public final d evaluate(float f, @NonNull d dVar, @NonNull d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            float l = zjq.l(dVar3.a, dVar4.a, f);
            float l2 = zjq.l(dVar3.b, dVar4.b, f);
            float l3 = zjq.l(dVar3.c, dVar4.c, f);
            d dVar5 = this.a;
            dVar5.a = l;
            dVar5.b = l2;
            dVar5.c = l3;
            return dVar5;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class b extends Property<cec, d> {
        public static final b a = new b(d.class, "circularReveal");

        @Override // android.util.Property
        @Nullable
        public final d get(@NonNull cec cecVar) {
            return cecVar.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(@NonNull cec cecVar, @Nullable d dVar) {
            cecVar.setRevealInfo(dVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class c extends Property<cec, Integer> {
        public static final c a = new c(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        @NonNull
        public final Integer get(@NonNull cec cecVar) {
            return Integer.valueOf(cecVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(@NonNull cec cecVar, @NonNull Integer num) {
            cecVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class d {
        public float a;
        public float b;
        public float c;

        public d() {
        }

        public d(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    @Nullable
    d getRevealInfo();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(@Nullable d dVar);
}
