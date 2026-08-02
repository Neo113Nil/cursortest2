package xsna;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import org.chromium.base.version_info.VersionConstants;
import xsna.dvy0;
import xsna.loy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class uhz0 extends ViewGroup implements dvy0.a {
    public final whz0 b;
    public final c1z0 c;
    public final wvy0 d;
    public final b e;
    public final dvy0 f;
    public final FrameLayout g;
    public final ProgressBar h;
    public final boolean i;
    public final boolean j;
    public a k;
    public loy0 l;
    public sgz0 m;
    public Bitmap n;
    public int o;
    public int p;
    public boolean q;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a extends AudioManager.OnAudioFocusChangeListener, loy0.a {
        void l();

        void n();

        void o();

        void q();
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            uhz0 uhz0Var = uhz0.this;
            if (uhz0Var.k == null) {
                return;
            }
            if (!uhz0Var.h() && !uhz0Var.g()) {
                uhz0Var.k.q();
            } else if (uhz0Var.g()) {
                uhz0Var.k.n();
            } else {
                uhz0Var.k.l();
            }
        }
    }

    public uhz0(Context context, c1z0 c1z0Var, boolean z, boolean z2) {
        super(context);
        this.q = true;
        this.c = c1z0Var;
        this.i = z;
        this.j = z2;
        this.b = new whz0(context);
        this.d = new wvy0(context);
        this.h = new ProgressBar(context, null, R.attr.progressBarStyleLarge);
        this.g = new FrameLayout(context);
        dvy0 dvy0Var = new dvy0(context);
        this.f = dvy0Var;
        dvy0Var.setAdVideoViewListener(this);
        this.e = new b();
    }

    public final void a(boolean z) {
        loy0 loy0Var;
        this.d.setVisibility(8);
        this.h.setVisibility(0);
        if (this.m == null || (loy0Var = this.l) == null) {
            return;
        }
        loy0Var.x(this.k);
        loy0 loy0Var2 = this.l;
        dvy0 dvy0Var = this.f;
        loy0Var2.A(dvy0Var);
        sgz0 sgz0Var = this.m;
        dvy0Var.b(sgz0Var.b, sgz0Var.c);
        sgz0 sgz0Var2 = this.m;
        String str = (String) sgz0Var2.d;
        if (!z || str == null) {
            this.l.B(dvy0Var.getContext(), Uri.parse(sgz0Var2.a));
        } else {
            this.l.B(dvy0Var.getContext(), Uri.parse(str));
        }
    }

    public final void b() {
        loy0 loy0Var = this.l;
        if (loy0Var != null) {
            loy0Var.destroy();
        }
        this.l = null;
    }

    public final void c(tez0 tez0Var) {
        this.g.setVisibility(8);
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        this.f.setVisibility(8);
        whz0 whz0Var = this.b;
        whz0Var.setVisibility(0);
        kiw kiwVar = tez0Var.t;
        if (kiwVar == null || kiwVar.a() == null) {
            return;
        }
        int i = kiwVar.b;
        this.p = i;
        int i2 = kiwVar.c;
        this.o = i2;
        if (i == 0 || i2 == 0) {
            this.p = kiwVar.a().getWidth();
            this.o = kiwVar.a().getHeight();
        }
        whz0Var.setImageBitmap(kiwVar.a());
        whz0Var.setClickable(false);
    }

    public final void d(tez0 tez0Var, int i) {
        Bitmap bitmap;
        lgz0 lgz0Var = tez0Var.c0;
        if (lgz0Var == null) {
            c(tez0Var);
            return;
        }
        sgz0 sgz0Var = (sgz0) lgz0Var.v0;
        this.m = sgz0Var;
        if (sgz0Var == null) {
            return;
        }
        loy0 a2 = kqz0.a(getContext(), this.j);
        this.l = a2;
        a2.x(this.k);
        if (lgz0Var.g0) {
            this.l.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        sgz0 sgz0Var2 = this.m;
        int i2 = sgz0Var2.b;
        this.p = i2;
        int i3 = sgz0Var2.c;
        this.o = i3;
        kiw kiwVar = lgz0Var.Z;
        whz0 whz0Var = this.b;
        if (kiwVar != null) {
            Bitmap a3 = kiwVar.a();
            this.n = a3;
            if (this.p <= 0 || this.o <= 0) {
                this.p = kiwVar.b;
                this.o = kiwVar.c;
            }
            whz0Var.setImageBitmap(a3);
        } else {
            kiw kiwVar2 = tez0Var.t;
            if (kiwVar2 != null) {
                if (i2 <= 0 || i3 <= 0) {
                    this.p = kiwVar2.b;
                    this.o = kiwVar2.c;
                }
                Bitmap a4 = kiwVar2.a();
                this.n = a4;
                whz0Var.setImageBitmap(a4);
            }
        }
        if (i != 1) {
            boolean z = this.i;
            c1z0 c1z0Var = this.c;
            int b2 = z ? c1z0Var.b(VersionConstants.PRODUCT_MAJOR_VERSION) : c1z0Var.b(96);
            int i4 = (b2 / 32) + (b2 / 4);
            int i5 = b2 / 8;
            Bitmap bitmap2 = null;
            try {
                bitmap = Bitmap.createBitmap(b2, b2, Bitmap.Config.ARGB_8888);
            } catch (OutOfMemoryError unused) {
                gu8.c(null, "InterstitialAdResources: Cannot build play icon - OOME");
                bitmap = null;
            }
            if (bitmap != null) {
                Canvas canvas = new Canvas(bitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(-2013265920);
                float f = b2;
                canvas.drawOval(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f), paint);
                Paint paint2 = new Paint();
                paint2.setColor(0);
                canvas.drawPaint(paint2);
                paint2.setStrokeWidth(4.0f);
                paint2.setColor(-16733198);
                paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                paint2.setAntiAlias(true);
                int i6 = i5 * 3;
                Point point = new Point(i6, i4);
                Point point2 = new Point(i6, b2 - i4);
                Point point3 = new Point(b2 - (i5 * 2), b2 / 2);
                Path path = new Path();
                path.setFillType(Path.FillType.EVEN_ODD);
                path.moveTo(point.x, point.y);
                path.lineTo(point2.x, point2.y);
                path.lineTo(point3.x, point3.y);
                path.lineTo(point.x, point.y);
                path.close();
                canvas.drawPath(path, paint2);
                bitmap2 = bitmap;
            }
            this.d.a(bitmap2, false);
        }
    }

    public final void e(boolean z) {
        loy0 loy0Var = this.l;
        if (loy0Var != null) {
            loy0Var.stop();
        }
        this.h.setVisibility(8);
        whz0 whz0Var = this.b;
        whz0Var.setVisibility(0);
        whz0Var.setImageBitmap(this.n);
        this.q = z;
        wvy0 wvy0Var = this.d;
        if (z) {
            wvy0Var.setVisibility(0);
            return;
        }
        whz0Var.setOnClickListener(null);
        wvy0Var.setOnClickListener(null);
        setOnClickListener(null);
    }

    public final void f() {
        View view = this.d;
        c1z0.n(view, "play_button");
        whz0 whz0Var = this.b;
        c1z0.n(whz0Var, "media_image");
        View view2 = this.f;
        c1z0.n(view2, "video_texture");
        View view3 = this.g;
        c1z0.n(view3, "clickable_layout");
        whz0Var.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        whz0Var.setAdjustViewBounds(true);
        addView(view2);
        View view4 = this.h;
        view4.setVisibility(8);
        addView(whz0Var);
        addView(view4);
        addView(view3);
        addView(view);
    }

    public final boolean g() {
        loy0 loy0Var = this.l;
        return loy0Var != null && loy0Var.b();
    }

    @NonNull
    public FrameLayout getClickableLayout() {
        return this.g;
    }

    @NonNull
    public whz0 getImageView() {
        return this.b;
    }

    @Nullable
    public loy0 getVideoPlayer() {
        return this.l;
    }

    public final boolean h() {
        loy0 loy0Var = this.l;
        return loy0Var != null && loy0Var.isPlaying();
    }

    public final void i() {
        loy0 loy0Var = this.l;
        if (loy0Var == null) {
            return;
        }
        loy0Var.pause();
        whz0 whz0Var = this.b;
        whz0Var.setVisibility(0);
        Bitmap screenShot = this.f.getScreenShot();
        if (screenShot != null && this.l.g()) {
            whz0Var.setImageBitmap(screenShot);
        }
        if (this.q) {
            this.d.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((i3 - i) - measuredWidth) / 2;
                int i7 = ((i4 - i2) - measuredHeight) / 2;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.o;
        if (i4 == 0 || (i3 = this.p) == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            return;
        }
        if (mode2 == 0 && size2 == 0) {
            size2 = i4;
            size = i3;
            mode = Integer.MIN_VALUE;
            mode2 = Integer.MIN_VALUE;
        }
        if (size2 == 0 || mode2 == 0) {
            size2 = (int) ((size / i3) * i4);
        }
        if (size == 0 || mode == 0) {
            size = (int) ((size2 / i4) * i3);
        }
        float f = i3 / i4;
        float f2 = size / f;
        float f3 = size2;
        if (f2 > f3) {
            size = (int) (f * f3);
        } else {
            size2 = (int) f2;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6 = (childAt == this.b || childAt == this.g || childAt == this.f) ? 1073741824 : Integer.MIN_VALUE;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i6), View.MeasureSpec.makeMeasureSpec(size2, i6));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // xsna.dvy0.a
    public final void r() {
        a aVar;
        if (!(this.l instanceof qfy0)) {
            a aVar2 = this.k;
            if (aVar2 != null) {
                aVar2.a("Playback within no hardware accelerated view is available only with ExoPlayer");
                return;
            }
            return;
        }
        dvy0 dvy0Var = this.f;
        dvy0Var.setViewMode(1);
        sgz0 sgz0Var = this.m;
        if (sgz0Var != null) {
            dvy0Var.b(sgz0Var.b, sgz0Var.c);
        }
        this.l.A(dvy0Var);
        if (!this.l.isPlaying() || (aVar = this.k) == null) {
            return;
        }
        aVar.o();
    }

    public void setInterstitialPromoViewListener(@Nullable a aVar) {
        this.k = aVar;
        loy0 loy0Var = this.l;
        if (loy0Var != null) {
            loy0Var.x(aVar);
        }
    }
}
