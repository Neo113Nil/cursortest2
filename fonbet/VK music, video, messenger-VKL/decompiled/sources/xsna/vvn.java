package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import xsna.sg90;

/* compiled from: DominantColorPostProcessor.kt */
/* loaded from: classes2.dex */
public final class vvn extends mk6 {
    public static final HashMap<String, Integer> d = new HashMap<>();
    public final io.reactivex.rxjava3.subjects.d<Integer> c = io.reactivex.rxjava3.subjects.d.N0();

    /* compiled from: DominantColorPostProcessor.kt */
    public static final class a extends WeakReference<View> implements io.reactivex.rxjava3.functions.f<Integer> {
        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Integer num) {
            int intValue = num.intValue();
            View view = get();
            if (view != null) {
                view.setBackgroundColor(intValue);
            }
        }
    }

    /* compiled from: DominantColorPostProcessor.kt */
    public static final class b extends WeakReference<View> implements io.reactivex.rxjava3.functions.f<Integer> {
        public final int b;

        public b(View view, int i) {
            super(view);
            this.b = i;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Integer num) {
            int intValue = num.intValue();
            View view = get();
            if (view == null) {
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setShape(0);
            gradientDrawable.setColors(new int[]{intValue, this.b});
            view.setBackground(gradientDrawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.mk6
    public final void d(Bitmap bitmap) {
        int intValue;
        HashMap<String, Integer> hashMap = d;
        Integer num = hashMap.get(null);
        if (num != null) {
            intValue = num.intValue();
        } else {
            sg90.b bVar = new sg90.b(bitmap);
            ArrayList arrayList = bVar.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            v3o0 v3o0Var = v3o0.e;
            bVar.a(v3o0Var);
            bVar.d = 256;
            bVar.e = -1;
            sg90 b2 = bVar.b();
            sg90.d dVar = (sg90.d) b2.c.get(v3o0Var);
            Integer valueOf = (dVar == null && (dVar = b2.e) == null) ? null : Integer.valueOf(dVar.d);
            intValue = valueOf != null ? valueOf.intValue() : 0;
        }
        this.c.onNext(Integer.valueOf(intValue));
        if (hashMap.size() < 64) {
            return;
        }
        for (String str : hashMap.keySet()) {
            if (!mcr0.p(str)) {
                hashMap.remove(str);
            }
        }
    }

    @Override // xsna.mk6, xsna.ktc0
    public final String getName() {
        return "ExtractDominantColorPostProcessor";
    }

    public final String toString() {
        return "ExtractDominantColorPostProcessor";
    }
}
