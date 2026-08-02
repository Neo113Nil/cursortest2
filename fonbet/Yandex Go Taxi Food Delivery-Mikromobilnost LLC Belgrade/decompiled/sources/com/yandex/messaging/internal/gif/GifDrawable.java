package com.yandex.messaging.internal.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.aht;
import defpackage.asb1;
import defpackage.bvf0;
import defpackage.drb1;
import defpackage.e3n;
import defpackage.e8m;
import defpackage.hjt;
import defpackage.i3y;
import defpackage.ie60;
import defpackage.jng0;
import defpackage.job1;
import defpackage.kjs0;
import defpackage.kp50;
import defpackage.n5;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pzt0;
import defpackage.s1r;
import defpackage.tje;
import defpackage.tse;
import defpackage.w3c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u0011J\u001f\u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0015H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0015H\u0002¢\u0006\u0004\b+\u0010*J\u0010\u0010,\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0015H\u0002¢\u0006\u0004\b1\u0010*J\u0019\u00104\u001a\u00020$2\b\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u00020\u0015*\u00020\u0018H\u0002¢\u0006\u0004\b6\u0010\u001bJ\u0013\u00107\u001a\u00020\u0015*\u00020\u0018H\u0002¢\u0006\u0004\b7\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u0014\u0010;\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010A\u001a\u0004\u0018\u00010@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010>R\u001b\u0010P\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010R¨\u0006T"}, d2 = {"Lcom/yandex/messaging/internal/gif/GifDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "Laht;", "gifWrapper", "stubDrawable", "Landroid/widget/ImageView;", "anchorView", "Ltse;", "parentScope", "Lw3c;", "clock", "<init>", "(Landroid/content/Context;Laht;Landroid/graphics/drawable/Drawable;Landroid/widget/ImageView;Ltse;Lw3c;)V", "", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "", "visible", "restart", "setVisible", "(ZZ)Z", "reset", "()V", "startAnimations", "waitTargetViewToGetOnScreen", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scope", "controlTargetViewToGetOffscreen", "(Ltse;)V", "scheduleRestartWhenOnScreen", "Landroid/view/View;", "view", "isViewOnScreen", "(Landroid/view/View;)Z", "drawBusy", "drawBusyIndicator", "Laht;", "Landroid/widget/ImageView;", "Lw3c;", "coroutineScope", "Ltse;", "bitmapWidth", CA20Status.STATUS_USER_I, "bitmapHeight", "Landroid/graphics/Bitmap;", "stubBitmap", "Landroid/graphics/Bitmap;", "currentBitmap", "drawBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "areAnimationsStarted", "Z", "fadeColor", "progressPaint$delegate", "Li3y;", "getProgressPaint", "()Landroid/graphics/Paint;", "progressPaint", "getAttachedView", "()Landroid/widget/ImageView;", "attachedView", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GifDrawable extends Drawable {
    public static final int $stable = 8;
    private final ImageView anchorView;
    private boolean areAnimationsStarted;
    private final int bitmapHeight;
    private final int bitmapWidth;
    private final w3c clock;
    private final tse coroutineScope;
    private Bitmap currentBitmap;
    private final Rect drawBounds;
    private final int fadeColor;
    private final aht gifWrapper;
    private final Paint paint;

    /* renamed from: progressPaint$delegate, reason: from kotlin metadata */
    private final i3y progressPaint;
    private final Bitmap stubBitmap;

    public GifDrawable(Context context, aht ahtVar, Drawable drawable, ImageView imageView, tse tseVar, w3c w3cVar) {
        this.gifWrapper = ahtVar;
        this.anchorView = imageView;
        this.clock = w3cVar;
        this.coroutineScope = tseVar != null ? asb1.d(tseVar) : bvf0.b();
        b bVar = (b) ahtVar;
        int i = bVar.k;
        this.bitmapWidth = i;
        int i2 = bVar.l;
        this.bitmapHeight = i2;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        this.stubBitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        this.currentBitmap = bVar.j;
        this.drawBounds = new Rect(0, 0, i, i2);
        this.paint = new Paint(2);
        this.fadeColor = job1.g(drb1.c(jng0.messagingViewerBackgroundColor, context), 0.5f);
        this.progressPaint = kotlin.a.a(new n5(context, 23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void controlTargetViewToGetOffscreen(tse scope) {
        tje.N(scope, null, null, new GifDrawable$controlTargetViewToGetOffscreen$1(this, null), 3);
    }

    private final void drawBusy(Canvas canvas) {
        canvas.drawColor(this.fadeColor);
        drawBusyIndicator(canvas);
    }

    private final void drawBusyIndicator(Canvas canvas) {
        int width = getAttachedView().getWidth();
        int height = getAttachedView().getHeight();
        Rect bounds = getBounds();
        float width2 = bounds.width();
        float height2 = bounds.height();
        float b = kjs0.b(24) / Math.min(width / width2, height / height2);
        if (width2 <= b || height2 <= b) {
            b *= 0.25f;
        }
        this.clock.getClass();
        float width3 = (getBounds().width() - b) / 2.0f;
        float height3 = (getBounds().height() - b) / 2.0f;
        canvas.drawArc(getBounds().left + width3, getBounds().top + height3, getBounds().right - width3, getBounds().bottom - height3, System.currentTimeMillis() % 360.0f, 300.0f, false, getProgressPaint());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getAttachedView() {
        Drawable.Callback callback = getCallback();
        ImageView imageView = callback instanceof ImageView ? (ImageView) callback : null;
        return imageView == null ? this.anchorView : imageView;
    }

    private final Paint getProgressPaint() {
        return (Paint) this.progressPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isViewOnScreen(View view) {
        if (isVisible() && view != null && view.isShown()) {
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (rect.intersect(new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels))) {
                if ((rect.height() * rect.width()) / (view.getHeight() * view.getWidth()) >= 0.5f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint progressPaint_delegate$lambda$1(Context context) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f * e8m.a.density);
        paint.setColor(drb1.c(jng0.messagingViewerIconsColor, context));
        paint.setDither(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reset() {
        kotlinx.coroutines.a.g(this.coroutineScope.getCoroutineContext(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleRestartWhenOnScreen() {
        tje.N(this.coroutineScope, null, null, new GifDrawable$scheduleRestartWhenOnScreen$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAnimations() {
        if (this.areAnimationsStarted) {
            return;
        }
        this.areAnimationsStarted = true;
        aht ahtVar = this.gifWrapper;
        boolean isHardwareAccelerated = getAttachedView().isHardwareAccelerated();
        b bVar = (b) ahtVar;
        if (!bVar.g) {
            isHardwareAccelerated = false;
        }
        bVar.h = isHardwareAccelerated;
        tje.N(this.coroutineScope, null, null, new GifDrawable$startAnimations$job$1(this, null), 3).w(new s1r(25, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, che0] */
    public static final zy11 startAnimations$lambda$6(GifDrawable gifDrawable, Throwable th) {
        gifDrawable.currentBitmap = null;
        b bVar = (b) gifDrawable.gifWrapper;
        bVar.f.j = -1;
        pzt0 pzt0Var = bVar.m;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        bVar.m = null;
        ?? r1 = bVar.i;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (r1 != 0) {
            ref$ObjectRef.element = r1;
            tje.N(hjt.a, ie60.a, null, new PrecachingGifWrapper$recycleBitmaps$1(ref$ObjectRef, bVar, null), 2);
        }
        bVar.i = null;
        bVar.j = null;
        gifDrawable.areAnimationsStarted = false;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:14:0x0032->B:22:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object waitTargetViewToGetOnScreen(Continuation<? super zy11> continuation) {
        GifDrawable$waitTargetViewToGetOnScreen$1 gifDrawable$waitTargetViewToGetOnScreen$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        long U;
        if (continuation instanceof GifDrawable$waitTargetViewToGetOnScreen$1) {
            gifDrawable$waitTargetViewToGetOnScreen$1 = (GifDrawable$waitTargetViewToGetOnScreen$1) continuation;
            int i2 = gifDrawable$waitTargetViewToGetOnScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gifDrawable$waitTargetViewToGetOnScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gifDrawable$waitTargetViewToGetOnScreen$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gifDrawable$waitTargetViewToGetOnScreen$1.label;
                if (i != 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (GifDrawable) gifDrawable$waitTargetViewToGetOnScreen$1.L$0;
                }
                kotlin.b.b(obj);
                while (kotlinx.coroutines.a.p(gifDrawable$waitTargetViewToGetOnScreen$1.get_context()) && !this.isViewOnScreen(this.getAttachedView())) {
                    o430 o430Var = e3n.b;
                    U = kp50.U(200, DurationUnit.MILLISECONDS);
                    gifDrawable$waitTargetViewToGetOnScreen$1.L$0 = this;
                    gifDrawable$waitTargetViewToGetOnScreen$1.label = 1;
                    if (kotlinx.coroutines.a.j(U, gifDrawable$waitTargetViewToGetOnScreen$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        gifDrawable$waitTargetViewToGetOnScreen$1 = new GifDrawable$waitTargetViewToGetOnScreen$1(this, continuation);
        Object obj2 = gifDrawable$waitTargetViewToGetOnScreen$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gifDrawable$waitTargetViewToGetOnScreen$1.label;
        if (i != 0) {
        }
        kotlin.b.b(obj2);
        while (kotlinx.coroutines.a.p(gifDrawable$waitTargetViewToGetOnScreen$1.get_context())) {
            o430 o430Var2 = e3n.b;
            U = kp50.U(200, DurationUnit.MILLISECONDS);
            gifDrawable$waitTargetViewToGetOnScreen$1.L$0 = this;
            gifDrawable$waitTargetViewToGetOnScreen$1.label = 1;
            if (kotlinx.coroutines.a.j(U, gifDrawable$waitTargetViewToGetOnScreen$1) != coroutineSingletons) {
            }
        }
        return zy11.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.currentBitmap;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            if (bitmap != null) {
                if (bitmap.getConfig() == Bitmap.Config.HARDWARE && !canvas.isHardwareAccelerated()) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, this.drawBounds, this.paint);
                    invalidateSelf();
                }
            }
        }
        Bitmap bitmap2 = this.stubBitmap;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, this.drawBounds, this.paint);
            drawBusy(canvas);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.bitmapHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.bitmapWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        this.drawBounds.set(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (alpha != this.paint.getAlpha()) {
            this.paint.setAlpha(alpha);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        if (visible != isVisible() || restart) {
            if (visible) {
                startAnimations();
            } else {
                reset();
            }
        }
        return super.setVisible(visible, restart);
    }

    public GifDrawable(Context context, aht ahtVar, Drawable drawable, ImageView imageView, tse tseVar, w3c w3cVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, ahtVar, drawable, imageView, (i & 16) != 0 ? null : tseVar, (i & 32) != 0 ? w3c.a : w3cVar);
    }
}
