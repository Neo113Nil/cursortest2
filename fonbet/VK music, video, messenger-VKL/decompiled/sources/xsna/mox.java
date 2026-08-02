package xsna;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: IntervalLayersDrawable.kt */
@ozl
/* loaded from: classes8.dex */
public final class mox extends LayerDrawable {
    public final int b;
    public final int c;
    public List<Float> d;
    public final ArrayList e;
    public final List<lox> f;
    public ValueAnimator g;
    public boolean h;
    public int i;

    public mox(lox loxVar, lox loxVar2, lox loxVar3, int i, int i2) {
        super(new Drawable[]{loxVar, new ClipDrawable(loxVar2, 8388611, 1), new ClipDrawable(loxVar3, 8388611, 1)});
        this.b = i;
        this.c = i2;
        this.d = EmptyList.b;
        this.e = new ArrayList();
        List<lox> l = e43.l(loxVar, loxVar2, loxVar3);
        this.f = l;
        setId(0, R.id.background);
        setId(1, R.id.secondaryProgress);
        setId(2, R.id.progress);
        Iterator<lox> it = l.iterator();
        while (it.hasNext()) {
            it.next().d = this.e;
        }
    }

    public final void a(float f, float f2) {
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setInterpolator(new ilq());
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new qf0(this, 1));
        ofFloat.start();
        this.g = ofFloat;
    }

    @Override // android.graphics.drawable.LayerDrawable
    public final Drawable findDrawableByLayerId(int i) {
        return i == 16908301 ? this : super.findDrawableByLayerId(i);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.d.isEmpty() || rect.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.e;
        arrayList.clear();
        float f = rect.left;
        int width = rect.width();
        int size = this.d.size();
        int i = 0;
        float f2 = 0.0f;
        while (i < size) {
            float floatValue = this.d.get(i).floatValue();
            int i2 = i + 1;
            Float f3 = (Float) j5g.b0(i2, this.d);
            float floatValue2 = ((f3 != null ? f3.floatValue() : 10000.0f) - floatValue) + f2;
            float f4 = width;
            float min = Math.min(f4 * 1.0f, ((floatValue2 / 10000.0f) * f4) + f);
            if (min >= this.c + f) {
                int h = e43.h(this.d);
                int i3 = this.b;
                if (i != h) {
                    min -= i3;
                }
                arrayList.add(new Pair(Float.valueOf(f), Float.valueOf(min)));
                f = min + i3;
                f2 = 0.0f;
            } else {
                if (i == e43.h(this.d)) {
                    Pair pair = (Pair) j5g.k0(arrayList);
                    float floatValue3 = pair != null ? ((Number) pair.i()).floatValue() : f;
                    if (arrayList.size() > 0) {
                        arrayList.remove(e43.h(arrayList));
                    }
                    arrayList.add(new Pair(Float.valueOf(floatValue3), Float.valueOf(min)));
                }
                f2 = floatValue2;
            }
            i = i2;
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.h) {
            int i2 = this.i;
            float width = (i / 10000.0f) * getBounds().width();
            ArrayList arrayList = this.e;
            int h = e43.h(arrayList);
            int i3 = 0;
            while (h > i3) {
                int i4 = (i3 + h) / 2;
                int i5 = i4 + 1;
                if (((Number) ((Pair) arrayList.get(i5)).i()).floatValue() <= width) {
                    i3 = i5;
                } else {
                    h = i4;
                }
            }
            this.i = h;
            if (i2 != h) {
                this.h = true;
                a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                Iterator<lox> it = this.f.iterator();
                while (it.hasNext()) {
                    it.next().e = this.i;
                }
            }
        }
        int numberOfLayers = getNumberOfLayers();
        for (int i6 = 0; i6 < numberOfLayers; i6++) {
            if (getId(i6) == 16908301) {
                Drawable drawable = getDrawable(i6);
                if (drawable.setLevel(i)) {
                    invalidateDrawable(drawable);
                }
            }
        }
        return true;
    }
}
