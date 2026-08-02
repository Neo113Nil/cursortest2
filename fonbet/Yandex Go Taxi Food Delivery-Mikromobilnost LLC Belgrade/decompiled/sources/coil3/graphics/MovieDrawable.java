package coil3.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil3.size.Scale;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.fg2;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.nb30;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.sb2;
import defpackage.w511;
import defpackage.xis0;
import defpackage.y5e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 d2\u00020\u00012\u00020\u0002:\u0001eB%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010\u001bJ\u000f\u0010&\u001a\u00020\u0018H\u0017¢\u0006\u0004\b&\u0010\u001dJ\u0019\u0010)\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010\u001dJ\u000f\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010\rJ\u000f\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u000b2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0010H\u0016¢\u0006\u0004\b7\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u0002010B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0016\u0010Q\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\u0016\u0010R\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010OR\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010VR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010XR\u0016\u0010Y\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010XR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010SR\u0018\u0010\u0014\u001a\u00020\u0013*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006f"}, d2 = {"Lcoil3/gif/MovieDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat;", "Landroid/graphics/Movie;", "movie", "Landroid/graphics/Bitmap$Config;", ConfigConstants.CONFIG, "Lcoil3/size/Scale;", "scale", "<init>", "(Landroid/graphics/Movie;Landroid/graphics/Bitmap$Config;Lcoil3/size/Scale;)V", "", "updateFrameTime", "()Z", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "drawFrame", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Rect;", "bounds", "updateBounds", "(Landroid/graphics/Rect;)V", "draw", "", "repeatCount", "setRepeatCount", "(I)V", "getRepeatCount", "()I", "Lfg2;", "animatedTransformation", "setAnimatedTransformation", "(Lfg2;)V", "getAnimatedTransformation", "()Lfg2;", CaretView.ALPHA_PROPERTY, "setAlpha", "getOpacity", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getIntrinsicWidth", "getIntrinsicHeight", "isRunning", "start", "()V", "stop", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$a;", "callback", "registerAnimationCallback", "(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$a;)V", "unregisterAnimationCallback", "(Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$a;)Z", "clearAnimationCallbacks", "Landroid/graphics/Movie;", "Landroid/graphics/Bitmap$Config;", "getConfig", "()Landroid/graphics/Bitmap$Config;", "Lcoil3/size/Scale;", "getScale", "()Lcoil3/size/Scale;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "", "callbacks", "Ljava/util/List;", "currentBounds", "Landroid/graphics/Rect;", "tempCanvasBounds", "softwareCanvas", "Landroid/graphics/Canvas;", "Landroid/graphics/Bitmap;", "softwareBitmap", "Landroid/graphics/Bitmap;", "", "softwareScale", "F", "hardwareScale", "hardwareDx", "hardwareDy", "Z", "", "startTimeMillis", "J", "frameTimeMillis", CA20Status.STATUS_USER_I, "loopIteration", "Lfg2;", "Landroid/graphics/Picture;", "animatedTransformationPicture", "Landroid/graphics/Picture;", "Lcoil3/gif/PixelOpacity;", "pixelOpacity", "Lcoil3/gif/PixelOpacity;", "isSoftwareScalingEnabled", "getBounds", "(Landroid/graphics/Canvas;)Landroid/graphics/Rect;", "Companion", "nb30", "coil-gif"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MovieDrawable extends Drawable implements Animatable2Compat {
    public static final nb30 Companion = new nb30();
    public static final int REPEAT_INFINITE = -1;
    private fg2 animatedTransformation;
    private Picture animatedTransformationPicture;
    private final List<Animatable2Compat.a> callbacks;
    private final Bitmap.Config config;
    private final Rect currentBounds;
    private long frameTimeMillis;
    private float hardwareDx;
    private float hardwareDy;
    private float hardwareScale;
    private boolean isRunning;
    private boolean isSoftwareScalingEnabled;
    private int loopIteration;
    private final Movie movie;
    private final Paint paint;
    private PixelOpacity pixelOpacity;
    private int repeatCount;
    private final Scale scale;
    private Bitmap softwareBitmap;
    private Canvas softwareCanvas;
    private float softwareScale;
    private long startTimeMillis;
    private final Rect tempCanvasBounds;

    public MovieDrawable(Movie movie, Bitmap.Config config, Scale scale) {
        this.movie = movie;
        this.config = config;
        this.scale = scale;
        this.paint = new Paint(3);
        this.callbacks = new ArrayList();
        this.currentBounds = new Rect();
        this.tempCanvasBounds = new Rect();
        this.softwareScale = 1.0f;
        this.hardwareScale = 1.0f;
        this.repeatCount = -1;
        this.pixelOpacity = PixelOpacity.UNCHANGED;
        if (sb2.x(config)) {
            ny61.g("Bitmap config must not be hardware.");
            throw null;
        }
    }

    private final void drawFrame(Canvas canvas) {
        Canvas canvas2 = this.softwareCanvas;
        Bitmap bitmap = this.softwareBitmap;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int save = canvas2.save();
        try {
            float f = this.softwareScale;
            canvas2.scale(f, f);
            this.movie.draw(canvas2, 0.0f, 0.0f, this.paint);
            Picture picture = this.animatedTransformationPicture;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(save);
            int save2 = canvas.save();
            try {
                canvas.translate(this.hardwareDx, this.hardwareDy);
                float f2 = this.hardwareScale;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.paint);
            } finally {
                canvas.restoreToCount(save2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(save);
            throw th;
        }
    }

    private final Rect getBounds(Canvas canvas) {
        Rect rect = this.tempCanvasBounds;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        return rect;
    }

    private final void updateBounds(Rect bounds) {
        if (jl40.l(this.currentBounds, bounds)) {
            return;
        }
        this.currentBounds.set(bounds);
        int width = bounds.width();
        int height = bounds.height();
        int width2 = this.movie.width();
        int height2 = this.movie.height();
        if (width2 <= 0 || height2 <= 0) {
            return;
        }
        Scale scale = this.scale;
        xis0 xis0Var = xis0.c;
        double m = y5e.m(width2, height2, width, height, scale, xis0Var);
        if (!this.isSoftwareScalingEnabled && m > 1.0d) {
            m = 1.0d;
        }
        float f = (float) m;
        this.softwareScale = f;
        int i = (int) (width2 * f);
        int i2 = (int) (f * height2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, this.config);
        Bitmap bitmap = this.softwareBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.softwareBitmap = createBitmap;
        this.softwareCanvas = new Canvas(createBitmap);
        if (this.isSoftwareScalingEnabled) {
            this.hardwareScale = 1.0f;
            this.hardwareDx = 0.0f;
            this.hardwareDy = 0.0f;
        } else {
            float m2 = (float) y5e.m(i, i2, width, height, this.scale, xis0Var);
            this.hardwareScale = m2;
            this.hardwareDx = ((width - (i * m2)) / 2.0f) + bounds.left;
            this.hardwareDy = ((height - (m2 * i2)) / 2.0f) + bounds.top;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean updateFrameTime() {
        boolean z;
        int duration = this.movie.duration();
        if (duration == 0) {
            z = 0;
        } else {
            if (this.isRunning) {
                this.frameTimeMillis = SystemClock.uptimeMillis();
            }
            int i = (int) (this.frameTimeMillis - this.startTimeMillis);
            int i2 = i / duration;
            this.loopIteration = i2;
            int i3 = this.repeatCount;
            r1 = (i3 == -1 || i2 <= i3) ? 1 : 0;
            if (r1 != 0) {
                duration = i - (i2 * duration);
            }
            int i4 = r1;
            r1 = duration;
            z = i4;
        }
        this.movie.setTime(r1);
        return z;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        this.callbacks.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean updateFrameTime = updateFrameTime();
        if (this.isSoftwareScalingEnabled) {
            updateBounds(getBounds(canvas));
            int save = canvas.save();
            try {
                float f = 1.0f / this.softwareScale;
                canvas.scale(f, f);
                drawFrame(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            updateBounds(getBounds());
            drawFrame(canvas);
        }
        if (this.isRunning && updateFrameTime) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    public final fg2 getAnimatedTransformation() {
        return null;
    }

    public final Bitmap.Config getConfig() {
        return this.config;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.movie.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.movie.width();
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        if (this.paint.getAlpha() != 255) {
            return -3;
        }
        PixelOpacity pixelOpacity = this.pixelOpacity;
        if (pixelOpacity != PixelOpacity.OPAQUE) {
            return (pixelOpacity == PixelOpacity.UNCHANGED && this.movie.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    public final int getRepeatCount() {
        return this.repeatCount;
    }

    public final Scale getScale() {
        return this.scale;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.a callback) {
        this.callbacks.add(callback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (alpha < 0 || alpha >= 256) {
            w511.f(oyr.i(alpha, "Invalid alpha: "));
        } else {
            this.paint.setAlpha(alpha);
        }
    }

    public final void setAnimatedTransformation(fg2 animatedTransformation) {
        if (animatedTransformation == null || this.movie.width() <= 0 || this.movie.height() <= 0) {
            this.animatedTransformationPicture = null;
            this.pixelOpacity = PixelOpacity.UNCHANGED;
            this.isSoftwareScalingEnabled = false;
        } else {
            Picture picture = new Picture();
            picture.beginRecording(this.movie.width(), this.movie.height());
            this.pixelOpacity = animatedTransformation.a();
            picture.endRecording();
            this.animatedTransformationPicture = picture;
            this.isSoftwareScalingEnabled = true;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void setRepeatCount(int repeatCount) {
        if (repeatCount >= -1) {
            this.repeatCount = repeatCount;
        } else {
            w511.f(oyr.i(repeatCount, "Invalid repeatCount: "));
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        this.loopIteration = 0;
        this.startTimeMillis = SystemClock.uptimeMillis();
        int size = this.callbacks.size();
        for (int i = 0; i < size; i++) {
            this.callbacks.get(i).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.isRunning) {
            this.isRunning = false;
            int size = this.callbacks.size();
            for (int i = 0; i < size; i++) {
                this.callbacks.get(i).a(this);
            }
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.a callback) {
        return this.callbacks.remove(callback);
    }

    public MovieDrawable(Movie movie, Bitmap.Config config) {
        this(movie, config, null, 4, null);
    }

    public MovieDrawable(Movie movie) {
        this(movie, null, null, 6, null);
    }

    public /* synthetic */ MovieDrawable(Movie movie, Bitmap.Config config, Scale scale, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(movie, (i & 2) != 0 ? Bitmap.Config.ARGB_8888 : config, (i & 4) != 0 ? Scale.FIT : scale);
    }
}
