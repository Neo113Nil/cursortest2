package xsna;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.progressindicator.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes13.dex */
public abstract class xko extends Drawable implements Animatable {
    public static final a l = new a(Float.class, "growFraction");
    public final Context b;
    public final tl6 c;
    public ObjectAnimator e;
    public ObjectAnimator f;
    public ArrayList g;
    public boolean h;
    public float i;
    public int k;
    public final Paint j = new Paint();
    public br2 d = new br2();

    /* compiled from: DrawableWithAnimatedVisibilityChange.java */
    public class a extends Property<xko, Float> {
        @Override // android.util.Property
        public final Float get(xko xkoVar) {
            return Float.valueOf(xkoVar.b());
        }

        @Override // android.util.Property
        public final void set(xko xkoVar, Float f) {
            xko xkoVar2 = xkoVar;
            float floatValue = f.floatValue();
            if (xkoVar2.i != floatValue) {
                xkoVar2.i = floatValue;
                xkoVar2.invalidateSelf();
            }
        }
    }

    public xko(@NonNull Context context, @NonNull tl6 tl6Var) {
        this.b = context;
        this.c = tl6Var;
        setAlpha(255);
    }

    public final float b() {
        tl6 tl6Var = this.c;
        if (tl6Var.e == 0 && tl6Var.f == 0) {
            return 1.0f;
        }
        return this.i;
    }

    public final boolean c(boolean z, boolean z2, boolean z3) {
        br2 br2Var = this.d;
        ContentResolver contentResolver = this.b.getContentResolver();
        br2Var.getClass();
        return d(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public boolean d(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.e;
        int i = 0;
        a aVar = l;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, aVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            this.e = ofFloat;
            ofFloat.setDuration(500L);
            this.e.setInterpolator(rq2.b);
            ObjectAnimator objectAnimator2 = this.e;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.e = objectAnimator2;
            objectAnimator2.addListener(new vko(this, i));
        }
        if (this.f == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, aVar, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f.setInterpolator(rq2.b);
            ObjectAnimator objectAnimator3 = this.f;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f = objectAnimator3;
            objectAnimator3.addListener(new wko(this, i));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.e : this.f;
            ObjectAnimator objectAnimator5 = z ? this.f : this.e;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.h;
                    this.h = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.h = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.h;
                    this.h = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.h = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                tl6 tl6Var = this.c;
                if (!z ? tl6Var.f != 0 : tl6Var.e != 0) {
                    boolean z7 = this.h;
                    this.h = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.h = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final void e(@NonNull a.d dVar) {
        ArrayList arrayList = this.g;
        if (arrayList == null || !arrayList.contains(dVar)) {
            return;
        }
        this.g.remove(dVar);
        if (this.g.isEmpty()) {
            this.g = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.k = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return c(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        d(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d(false, true, false);
    }
}
