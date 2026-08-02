package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import defpackage.b16;
import defpackage.g63;
import defpackage.izz;
import defpackage.lgt;
import defpackage.nw01;
import defpackage.ny61;
import defpackage.tgt;
import defpackage.tzt0;
import defpackage.u1n;
import defpackage.ugt;
import defpackage.z2a1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class GifDrawable extends Drawable implements ugt, Animatable, Animatable2Compat {
    private static final int GRAVITY = 119;
    public static final int LOOP_FOREVER = -1;
    public static final int LOOP_INTRINSIC = 0;
    private List<Animatable2Compat.a> animationCallbacks;
    private boolean applyGravity;
    private Rect destRect;
    private boolean isRecycled;
    private boolean isRunning;
    private boolean isStarted;
    private boolean isVisible;
    private int loopCount;
    private int maxLoopCount;
    private Paint paint;
    private final GifState state;

    public GifDrawable(Context context, lgt lgtVar, nw01 nw01Var, int i, int i2, Bitmap bitmap) {
        this(new GifState(new a(Glide.get(context), lgtVar, i, i2, nw01Var, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback findCallback() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect getDestRect() {
        if (this.destRect == null) {
            this.destRect = new Rect();
        }
        return this.destRect;
    }

    private Paint getPaint() {
        if (this.paint == null) {
            this.paint = new Paint(2);
        }
        return this.paint;
    }

    private void notifyAnimationEndToListeners() {
        List<Animatable2Compat.a> list = this.animationCallbacks;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.animationCallbacks.get(i).a(this);
            }
        }
    }

    private void resetLoopCount() {
        this.loopCount = 0;
    }

    private void startRunning() {
        z2a1.c("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.isRecycled);
        a aVar = this.state.frameLoader;
        if (((tzt0) aVar.a).l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        ArrayList arrayList = aVar.c;
        if (aVar.k) {
            ny61.r("Cannot subscribe to a cleared frame loader");
            return;
        }
        if (arrayList.contains(this)) {
            ny61.r("Cannot subscribe twice in a row");
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (isEmpty && !aVar.f) {
            aVar.f = true;
            aVar.k = false;
            aVar.a();
        }
        invalidateSelf();
    }

    private void stopRunning() {
        this.isRunning = false;
        a aVar = this.state.frameLoader;
        ArrayList arrayList = aVar.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            aVar.f = false;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List<Animatable2Compat.a> list = this.animationCallbacks;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.isRecycled) {
            return;
        }
        if (this.applyGravity) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), getDestRect());
            this.applyGravity = false;
        }
        a aVar = this.state.frameLoader;
        tgt tgtVar = aVar.j;
        canvas.drawBitmap(tgtVar != null ? tgtVar.z : aVar.m, (Rect) null, getDestRect(), getPaint());
    }

    public ByteBuffer getBuffer() {
        return ((tzt0) this.state.frameLoader.a).d.asReadOnlyBuffer();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.state;
    }

    public Bitmap getFirstFrame() {
        return this.state.frameLoader.m;
    }

    public int getFrameCount() {
        return ((tzt0) this.state.frameLoader.a).l.c;
    }

    public int getFrameIndex() {
        tgt tgtVar = this.state.frameLoader.j;
        if (tgtVar != null) {
            return tgtVar.x;
        }
        return -1;
    }

    public nw01 getFrameTransformation() {
        return this.state.frameLoader.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.state.frameLoader.r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.state.frameLoader.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int getSize() {
        a aVar = this.state.frameLoader;
        tzt0 tzt0Var = (tzt0) aVar.a;
        return (tzt0Var.j.length * 4) + tzt0Var.d.limit() + tzt0Var.i.length + aVar.p;
    }

    public boolean isRecycled() {
        return this.isRecycled;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.applyGravity = true;
    }

    @Override // defpackage.ugt
    public void onFrameReady() {
        if (findCallback() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (getFrameIndex() == getFrameCount() - 1) {
            this.loopCount++;
        }
        int i = this.maxLoopCount;
        if (i == -1 || this.loopCount < i) {
            return;
        }
        notifyAnimationEndToListeners();
        stop();
    }

    public void recycle() {
        g63 g63Var;
        g63 g63Var2;
        g63 g63Var3;
        this.isRecycled = true;
        a aVar = this.state.frameLoader;
        RequestManager requestManager = aVar.d;
        aVar.c.clear();
        Bitmap bitmap = aVar.m;
        if (bitmap != null) {
            aVar.e.c(bitmap);
            aVar.m = null;
        }
        aVar.f = false;
        tgt tgtVar = aVar.j;
        if (tgtVar != null) {
            requestManager.clear(tgtVar);
            aVar.j = null;
        }
        tgt tgtVar2 = aVar.l;
        if (tgtVar2 != null) {
            requestManager.clear(tgtVar2);
            aVar.l = null;
        }
        tgt tgtVar3 = aVar.o;
        if (tgtVar3 != null) {
            requestManager.clear(tgtVar3);
            aVar.o = null;
        }
        tzt0 tzt0Var = (tzt0) aVar.a;
        u1n u1nVar = tzt0Var.c;
        tzt0Var.l = null;
        byte[] bArr = tzt0Var.i;
        if (bArr != null && (g63Var3 = (g63) u1nVar.c) != null) {
            ((izz) g63Var3).g(bArr);
        }
        int[] iArr = tzt0Var.j;
        if (iArr != null && (g63Var2 = (g63) u1nVar.c) != null) {
            ((izz) g63Var2).g(iArr);
        }
        Bitmap bitmap2 = tzt0Var.m;
        if (bitmap2 != null) {
            ((b16) u1nVar.b).c(bitmap2);
        }
        tzt0Var.m = null;
        tzt0Var.d = null;
        tzt0Var.s = null;
        byte[] bArr2 = tzt0Var.e;
        if (bArr2 != null && (g63Var = (g63) u1nVar.c) != null) {
            ((izz) g63Var).g(bArr2);
        }
        aVar.k = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.animationCallbacks == null) {
            this.animationCallbacks = new ArrayList();
        }
        this.animationCallbacks.add(aVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        getPaint().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        getPaint().setColorFilter(colorFilter);
    }

    public void setFrameTransformation(nw01 nw01Var, Bitmap bitmap) {
        this.state.frameLoader.c(nw01Var, bitmap);
    }

    public void setIsRunning(boolean z) {
        this.isRunning = z;
    }

    public void setLoopCount(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            ny61.g("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else {
            if (i != 0) {
                this.maxLoopCount = i;
                return;
            }
            int i2 = ((tzt0) this.state.frameLoader.a).l.l;
            int i3 = i2 != -1 ? i2 == 0 ? 0 : 1 + i2 : 1;
            this.maxLoopCount = i3 != 0 ? i3 : -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        z2a1.c("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.isRecycled);
        this.isVisible = z;
        if (!z) {
            stopRunning();
        } else if (this.isStarted) {
            startRunning();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.isStarted = true;
        resetLoopCount();
        if (this.isVisible) {
            startRunning();
        }
    }

    public void startFromFirstFrame() {
        z2a1.c("You cannot restart a currently running animation.", !this.isRunning);
        a aVar = this.state.frameLoader;
        z2a1.c("Can't restart a running animation", !aVar.f);
        aVar.h = true;
        tgt tgtVar = aVar.o;
        if (tgtVar != null) {
            aVar.d.clear(tgtVar);
            aVar.o = null;
        }
        start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.isStarted = false;
        stopRunning();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.a aVar) {
        List<Animatable2Compat.a> list = this.animationCallbacks;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    public static final class GifState extends Drawable.ConstantState {
        final a frameLoader;

        public GifState(a aVar) {
            this.frameLoader = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new GifDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    @Deprecated
    public GifDrawable(Context context, lgt lgtVar, b16 b16Var, nw01 nw01Var, int i, int i2, Bitmap bitmap) {
        this(context, lgtVar, nw01Var, i, i2, bitmap);
    }

    public GifDrawable(GifState gifState) {
        this.isVisible = true;
        this.maxLoopCount = -1;
        z2a1.e(gifState, "Argument must not be null");
        this.state = gifState;
    }

    public GifDrawable(a aVar, Paint paint) {
        this(new GifState(aVar));
        this.paint = paint;
    }
}
