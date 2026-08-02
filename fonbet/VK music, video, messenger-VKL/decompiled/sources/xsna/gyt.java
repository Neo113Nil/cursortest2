package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.kyt;

/* compiled from: GifDrawable.java */
/* loaded from: classes12.dex */
public final class gyt extends Drawable implements kyt.b, Animatable {
    public final a b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public final int h;
    public boolean i;
    public Paint j;
    public Rect k;

    /* compiled from: GifDrawable.java */
    public static final class a extends Drawable.ConstantState {
        public final kyt a;

        public a(kyt kytVar) {
            this.a = kytVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new gyt(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new gyt(this);
        }
    }

    public gyt() {
        throw null;
    }

    public gyt(a aVar) {
        this.f = true;
        this.h = -1;
        this.b = aVar;
    }

    @Override // xsna.kyt.b
    public final void a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        kyt.a aVar = this.b.a.i;
        if ((aVar != null ? aVar.f : -1) == r0.a.l.c - 1) {
            this.g++;
        }
        int i = this.h;
        if (i == -1 || this.g < i) {
            return;
        }
        stop();
    }

    public final void b() {
        nr2.p("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.e);
        kyt kytVar = this.b.a;
        if (kytVar.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.c) {
            return;
        }
        this.c = true;
        ArrayList arrayList = kytVar.c;
        if (kytVar.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !kytVar.f) {
            kytVar.f = true;
            kytVar.j = false;
            kytVar.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.e) {
            return;
        }
        if (this.i) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.k == null) {
                this.k = new Rect();
            }
            Gravity.apply(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, intrinsicWidth, intrinsicHeight, bounds, this.k);
            this.i = false;
        }
        kyt kytVar = this.b.a;
        kyt.a aVar = kytVar.i;
        Bitmap bitmap = aVar != null ? aVar.h : kytVar.l;
        if (this.k == null) {
            this.k = new Rect();
        }
        Rect rect = this.k;
        if (this.j == null) {
            this.j = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b.a.q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b.a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.j == null) {
            this.j = new Paint(2);
        }
        this.j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.j == null) {
            this.j = new Paint(2);
        }
        this.j.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        nr2.p("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.e);
        this.f = z;
        if (!z) {
            this.c = false;
            kyt kytVar = this.b.a;
            ArrayList arrayList = kytVar.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                kytVar.f = false;
            }
        } else if (this.d) {
            b();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.d = true;
        this.g = 0;
        if (this.f) {
            b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d = false;
        this.c = false;
        kyt kytVar = this.b.a;
        ArrayList arrayList = kytVar.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            kytVar.f = false;
        }
    }
}
