package one.video.controls.views.preview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Pair;
import one.video.controls.utils.ScreenSize;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.akw;
import xsna.aw5;
import xsna.dog0;
import xsna.epx;
import xsna.k4d0;
import xsna.o19;
import xsna.ozl;
import xsna.zjq;
import xsna.zwo0;

/* compiled from: VideoSeekPreviewImage.kt */
@ozl
/* loaded from: classes8.dex */
public final class VideoSeekPreviewImage extends AppCompatImageView {
    public static final /* synthetic */ int q = 0;
    public final k4d0 b;
    public final Paint c;
    public final float d;
    public Future<Bitmap> e;
    public String f;
    public long g;
    public long h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public zwo0 m;
    public akw n;
    public a o;
    public boolean p;

    /* compiled from: VideoSeekPreviewImage.kt */
    public interface a {
        void a();

        void b();

        void c();
    }

    public VideoSeekPreviewImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final void setCurrentImageIndex(int i) {
        ArrayList f;
        ArrayList f2;
        zwo0 zwo0Var = this.m;
        int min = Math.min(i, ((zwo0Var == null || (f2 = zwo0Var.f()) == null) ? 1 : f2.size()) - 1);
        if (min == this.l) {
            return;
        }
        this.l = min;
        zwo0 zwo0Var2 = this.m;
        if (zwo0Var2 == null || (f = zwo0Var2.f()) == null || f.isEmpty()) {
            return;
        }
        V((String) zwo0Var2.f().get(min));
    }

    public final void U() {
        zwo0 zwo0Var = this.m;
        if (zwo0Var == null) {
            a aVar = this.o;
            if (aVar != null) {
                aVar.b();
                return;
            }
            return;
        }
        if (zwo0Var.b() == 0 || zwo0Var.h() == 0 || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        double min = (!zwo0Var.d() || zwo0Var.e() <= 0) ? Math.min(Math.max(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, Math.floor((zwo0Var.a() * (this.g / this.h)) - 0.5d)), zwo0Var.a() - 1) : Math.min((int) (this.g / zwo0Var.e()), zwo0Var.a() - 1);
        if (getDrawable() == null && this.k) {
            setCurrentImageIndex((int) (min / zwo0Var.c()));
            return;
        }
        if (getDrawable() == null) {
            return;
        }
        int size = zwo0Var.f().size();
        if (this.i <= 0 || this.j <= 0) {
            float h = (zwo0Var.h() * (size == 1 ? (int) Math.ceil(zwo0Var.a() / zwo0Var.g()) : zwo0Var.c() / zwo0Var.g())) / getDrawable().getIntrinsicHeight();
            this.i = (int) (zwo0Var.b() / h);
            this.j = (int) (zwo0Var.h() / h);
        }
        if (min < zwo0Var.c() * (this.l + 1)) {
            if (min >= zwo0Var.c() * this.l) {
                double c = min % zwo0Var.c();
                float width = getWidth() / this.i;
                float height = getHeight() / this.j;
                double min2 = Math.min(zwo0Var.g(), zwo0Var.a());
                int floor = (int) Math.floor(c % min2);
                int floor2 = (int) Math.floor(c / min2);
                Matrix matrix = new Matrix();
                matrix.setScale(width, height);
                matrix.postTranslate((-width) * this.i * floor, (-height) * this.j * floor2);
                setImageMatrix(matrix);
                return;
            }
        }
        setCurrentImageIndex((int) (min / zwo0Var.c()));
    }

    @SuppressLint({"CheckResult"})
    public final void V(String str) {
        if (!epx.f(str, this.f) || this.k) {
            this.f = str;
            this.k = false;
            Future<Bitmap> future = this.e;
            if (future != null) {
                future.cancel(true);
            }
            Future<Bitmap> b = this.n.b(getContext(), Uri.parse(str));
            this.e = b;
            ExecutorService executorService = o19.b;
            if (executorService == null) {
                executorService = null;
            }
            executorService.submit(new aw5(3, this, b));
        }
    }

    public final boolean getHasBorder() {
        return this.p;
    }

    public final a getImageCallback() {
        return this.o;
    }

    public final akw getImageLoader() {
        return this.n;
    }

    public final zwo0 getTimelineThumbs() {
        return this.m;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        super.onConfigurationChanged(configuration);
        zwo0 zwo0Var = this.m;
        Context context = getContext();
        if (context != null) {
            if (ScreenSize.a(context.getResources().getConfiguration().screenLayout & 15).h() > ScreenSize.NORMAL.h()) {
                z = true;
                Pair<Integer, Integer> a2 = this.b.a(zwo0Var, z, configuration == null && configuration.orientation == 2);
                getLayoutParams().width = a2.i().intValue();
                getLayoutParams().height = a2.j().intValue();
            }
        }
        z = false;
        Pair<Integer, Integer> a22 = this.b.a(zwo0Var, z, configuration == null && configuration.orientation == 2);
        getLayoutParams().width = a22.i().intValue();
        getLayoutParams().height = a22.j().intValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.p) {
            float width = getWidth();
            float height = getHeight();
            float f = this.d;
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, f, f, this.c);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        U();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public final void setHasBorder(boolean z) {
        if (z != this.p) {
            this.p = z;
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        U();
    }

    public final void setImageCallback(a aVar) {
        this.o = aVar;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        U();
    }

    public final void setImageLoader(akw akwVar) {
        this.n = akwVar;
    }

    public final void setTimelineThumbs(zwo0 zwo0Var) {
        zwo0 zwo0Var2 = this.m;
        if (!epx.f(zwo0Var2 != null ? zwo0Var2.f() : null, zwo0Var != null ? zwo0Var.f() : null)) {
            setImageBitmap(null);
        }
        this.m = zwo0Var;
        if (zwo0Var == null) {
            this.i = -1;
            this.j = -1;
            setImageBitmap(null);
            return;
        }
        boolean z = false;
        if (this.l != 0) {
            setCurrentImageIndex(0);
            return;
        }
        Context context = getContext();
        boolean z2 = context != null && ScreenSize.a(context.getResources().getConfiguration().screenLayout & 15).h() > ScreenSize.NORMAL.h();
        Context context2 = getContext();
        if (context2 != null) {
            int i = context2.getResources().getConfiguration().orientation;
            if (!(i == 0 || i == 1)) {
                z = true;
            }
        }
        Pair<Integer, Integer> a2 = this.b.a(zwo0Var, z2, z);
        if (getWidth() != a2.i().intValue() || getHeight() != a2.j().intValue()) {
            getLayoutParams().width = a2.i().intValue();
            getLayoutParams().height = a2.j().intValue();
        }
        ArrayList f = zwo0Var.f();
        if (f == null || f.isEmpty()) {
            return;
        }
        this.i = -1;
        this.j = -1;
        V((String) zwo0Var.f().get(this.l));
    }

    public VideoSeekPreviewImage(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = new k4d0();
        float dimension = getResources().getDimension(R.dimen.one_video_collage_view_corners);
        this.d = dimension;
        this.i = -1;
        this.j = -1;
        this.n = new zjq();
        this.p = true;
        setBackgroundResource(android.R.color.black);
        setClipToOutline(true);
        setOutlineProvider(new dog0(dimension));
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(context.getColor(R.color.one_video_white_alpha60));
        paint.setAntiAlias(true);
        paint.setStrokeWidth(getResources().getDimension(R.dimen.one_video_collage_view_stroke));
        paint.setStyle(Paint.Style.STROKE);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
