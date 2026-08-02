package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.nativeads.views.MediaAdView;
import java.lang.ref.WeakReference;
import xsna.c1z0;
import xsna.c9z0;
import xsna.zu50;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class yhz0 extends ViewGroup {
    public static final int B = View.generateViewId();
    public static final int C = View.generateViewId();
    public static final int D = View.generateViewId();
    public static final int E = View.generateViewId();
    public static final int F = View.generateViewId();
    public static final int G = View.generateViewId();
    public static final int H = View.generateViewId();
    public static final int I = View.generateViewId();
    public static final int J = View.generateViewId();
    public static final int K = View.generateViewId();
    public static final int L = View.generateViewId();
    public static final int M = View.generateViewId();
    public static final int N = View.generateViewId();
    public boolean A;
    public final TextView b;
    public final qpk0 c;
    public final Button d;
    public final Button e;
    public final c1z0 f;
    public final LinearLayout g;
    public final TextView h;
    public final FrameLayout i;
    public final MediaAdView j;
    public final TextView k;
    public final ohy0 l;
    public final wvy0 m;
    public final dvy0 n;
    public final tyy0 o;
    public final tyy0 p;
    public final tyy0 q;
    public final b r;
    public final c s;
    public final a t;
    public final Bitmap u;
    public final Bitmap v;
    public final int w;
    public final int x;
    public d y;
    public int z;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            yhz0 yhz0Var;
            yhz0 yhz0Var2 = yhz0.this;
            if (yhz0Var2.y != null) {
                int id = view.getId();
                if (id == yhz0.C) {
                    ady0 ady0Var = (ady0) yhz0Var2.y;
                    if (ady0Var.u == 1) {
                        loy0 loy0Var = ady0Var.m;
                        if (loy0Var != null) {
                            loy0Var.pause();
                        }
                        ady0Var.f();
                    }
                    c9z0.a aVar = ady0Var.w;
                    if (aVar != null) {
                        aVar.c(view, 2);
                        return;
                    }
                    return;
                }
                if (id == yhz0.D) {
                    ady0 ady0Var2 = (ady0) yhz0Var2.y;
                    ady0Var2.u();
                    WeakReference weakReference = ady0Var2.l;
                    if (weakReference != null && (yhz0Var = (yhz0) weakReference.get()) != null) {
                        yhz0Var.j.getImageView().setVisibility(0);
                    }
                    zu50.c cVar = ady0Var2.i.b.a.i;
                    if (cVar != null) {
                        cVar.onVideoPlay();
                        return;
                    }
                    return;
                }
                if (id == yhz0.F) {
                    ady0 ady0Var3 = (ady0) yhz0Var2.y;
                    if (ady0Var3.u != 1) {
                        return;
                    }
                    ady0Var3.t();
                    ady0Var3.u = 2;
                    WeakReference weakReference2 = ady0Var3.k;
                    if (weakReference2 == null || ((j7z0) weakReference2.get()) == null) {
                        return;
                    }
                    ady0Var3.h.k();
                    return;
                }
                if (id == yhz0.E) {
                    ady0 ady0Var4 = (ady0) yhz0Var2.y;
                    WeakReference weakReference3 = ady0Var4.k;
                    if (weakReference3 != null && ((j7z0) weakReference3.get()) != null) {
                        ady0Var4.u();
                        ady0Var4.h.n();
                    }
                    zu50.c cVar2 = ady0Var4.i.b.a.i;
                    if (cVar2 != null) {
                        cVar2.onVideoPlay();
                        return;
                    }
                    return;
                }
                if (id == yhz0.B) {
                    WeakReference weakReference4 = ((ady0) yhz0Var2.y).k;
                    j7z0 j7z0Var = weakReference4 == null ? null : (j7z0) weakReference4.get();
                    if (j7z0Var == null || !j7z0Var.isShowing()) {
                        return;
                    }
                    j7z0Var.dismiss();
                    return;
                }
                if (id == yhz0.K) {
                    ady0 ady0Var5 = (ady0) yhz0Var2.y;
                    kwy0 kwy0Var = ady0Var5.h;
                    loy0 loy0Var2 = ady0Var5.m;
                    if (loy0Var2 == null) {
                        ady0Var5.t = !ady0Var5.t;
                        return;
                    }
                    if (loy0Var2.c()) {
                        ady0Var5.m.d();
                        kwy0Var.f(true);
                        ady0Var5.t = false;
                    } else {
                        ady0Var5.m.f();
                        kwy0Var.f(false);
                        ady0Var5.t = true;
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            yhz0 yhz0Var = yhz0.this;
            if (yhz0Var.z == 2) {
                yhz0.a(yhz0Var);
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            yhz0 yhz0Var = yhz0.this;
            b bVar = yhz0Var.r;
            yhz0Var.removeCallbacks(bVar);
            int i = yhz0Var.z;
            if (i == 2) {
                yhz0.a(yhz0Var);
                return;
            }
            if (i == 0) {
                MediaAdView mediaAdView = yhz0Var.j;
                if (i != 2) {
                    yhz0Var.z = 2;
                    mediaAdView.getImageView().setVisibility(8);
                    mediaAdView.getProgressBarView().setVisibility(8);
                    yhz0Var.g.setVisibility(8);
                    yhz0Var.p.setVisibility(8);
                    yhz0Var.o.setVisibility(0);
                    yhz0Var.i.setVisibility(8);
                }
            }
            yhz0Var.postDelayed(bVar, 4000L);
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface d {
    }

    public yhz0(Context context) {
        super(context);
        Bitmap bitmap;
        tyy0 tyy0Var;
        tyy0 tyy0Var2;
        Bitmap bitmap2;
        Bitmap bitmap3;
        float f;
        Bitmap bitmap4;
        Button button = new Button(context);
        this.e = button;
        TextView textView = new TextView(context);
        this.b = textView;
        qpk0 qpk0Var = new qpk0(context);
        this.c = qpk0Var;
        Button button2 = new Button(context);
        this.d = button2;
        TextView textView2 = new TextView(context);
        this.h = textView2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        tyy0 tyy0Var3 = new tyy0(context);
        this.o = tyy0Var3;
        tyy0 tyy0Var4 = new tyy0(context);
        this.p = tyy0Var4;
        tyy0 tyy0Var5 = new tyy0(context);
        this.q = tyy0Var5;
        TextView textView3 = new TextView(context);
        this.k = textView3;
        MediaAdView mediaAdView = new MediaAdView(context);
        this.j = mediaAdView;
        ohy0 ohy0Var = new ohy0(context);
        this.l = ohy0Var;
        wvy0 wvy0Var = new wvy0(context);
        this.m = wvy0Var;
        this.g = new LinearLayout(context);
        c1z0 c1z0Var = new c1z0(context);
        this.f = c1z0Var;
        this.r = new b();
        this.s = new c();
        this.t = new a();
        this.n = new dvy0(context);
        float f2 = 28;
        int b2 = c1z0Var.b(f2);
        try {
            bitmap = Bitmap.createBitmap(b2, b2, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            gu8.c(null, "NativeAdResources: Cannot build icon - OOME");
            bitmap = null;
        }
        if (bitmap == null) {
            tyy0Var2 = tyy0Var4;
            tyy0Var = tyy0Var5;
            bitmap2 = null;
        } else {
            float f3 = b2 / 100.0f;
            tyy0Var = tyy0Var5;
            Paint paint = new Paint();
            tyy0Var2 = tyy0Var4;
            paint.setColor(0);
            paint.setStyle(Paint.Style.STROKE);
            Canvas canvas = new Canvas(bitmap);
            ngz0.a(f3, b2, paint, canvas);
            canvas.drawArc(new RectF(f3 * 57.0f, f3 * 45.0f, f3 * 67.0f, f3 * 55.0f), 90.0f, -180.0f, false, paint);
            canvas.drawArc(new RectF(f3 * 52.0f, f3 * 40.0f, 72.0f * f3, f3 * 60.0f), 90.0f, -180.0f, false, paint);
            bitmap2 = bitmap;
        }
        this.u = bitmap2;
        int b3 = c1z0Var.b(f2);
        try {
            bitmap3 = Bitmap.createBitmap(b3, b3, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused2) {
            gu8.c(null, "NativeAdResources: Cannot build icon - OOME");
            bitmap3 = null;
        }
        if (bitmap3 == null) {
            f = f2;
            bitmap4 = null;
        } else {
            float f4 = b3 / 100.0f;
            Paint paint2 = new Paint();
            paint2.setColor(0);
            paint2.setStyle(Paint.Style.STROKE);
            Canvas canvas2 = new Canvas(bitmap3);
            ngz0.a(f4, b3, paint2, canvas2);
            Path path = new Path();
            path.setFillType(Path.FillType.EVEN_ODD);
            float f5 = 62.0f * f4;
            Bitmap bitmap5 = bitmap3;
            float f6 = f4 * 40.0f;
            path.moveTo(f5, f6);
            float f7 = f4 * 82.0f;
            f = f2;
            float f8 = f4 * 60.0f;
            path.lineTo(f7, f8);
            path.moveTo(f5, f8);
            path.lineTo(f7, f6);
            canvas2.drawPath(path, paint2);
            bitmap4 = bitmap5;
        }
        this.v = bitmap4;
        c1z0.n(button, "dismiss_button");
        c1z0.n(textView, "title_text");
        c1z0.n(qpk0Var, "stars_view");
        c1z0.n(button2, "cta_button");
        c1z0.n(textView2, "replay_text");
        c1z0.n(frameLayout, "shadow");
        c1z0.n(tyy0Var3, "pause_button");
        c1z0.n(tyy0Var2, "play_button");
        c1z0.n(tyy0Var, "replay_button");
        c1z0.n(textView3, "domain_text");
        c1z0.n(mediaAdView, "media_view");
        c1z0.n(ohy0Var, "video_progress_wheel");
        c1z0.n(wvy0Var, "sound_button");
        this.x = c1z0Var.b(f);
        float f9 = 16;
        int b4 = c1z0Var.b(f9);
        this.w = b4;
        qpk0 qpk0Var2 = this.c;
        setBackgroundColor(-16777216);
        View view = this.m;
        view.setId(K);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        MediaAdView mediaAdView2 = this.j;
        mediaAdView2.setId(N);
        mediaAdView2.setLayoutParams(layoutParams);
        mediaAdView2.setId(J);
        mediaAdView2.setOnClickListener(this.s);
        mediaAdView2.setBackgroundColor(-16777216);
        View view2 = this.i;
        view2.setBackgroundColor(-1728053248);
        view2.setVisibility(8);
        Button button3 = this.e;
        button3.setId(B);
        button3.setTextSize(2, 16.0f);
        button3.setTransformationMethod(null);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button3.setEllipsize(truncateAt);
        button3.setMaxLines(2);
        button3.setPadding(b4, b4, b4, b4);
        button3.setTextColor(-1);
        Button button4 = this.e;
        c1z0 c1z0Var2 = this.f;
        float f10 = 1;
        float f11 = 4;
        c1z0.k(button4, -2013265920, -1, -1, c1z0Var2.b(f10), c1z0Var2.b(f11));
        TextView textView4 = this.b;
        textView4.setId(H);
        textView4.setMaxLines(2);
        textView4.setEllipsize(truncateAt);
        textView4.setTextSize(2, 18.0f);
        textView4.setTextColor(-1);
        c1z0.k(this.d, -2013265920, -1, -1, c1z0Var2.b(f10), c1z0Var2.b(f11));
        Button button5 = this.d;
        button5.setId(C);
        button5.setTextColor(-1);
        button5.setTransformationMethod(null);
        button5.setGravity(1);
        button5.setTextSize(2, 16.0f);
        button5.setLines(1);
        button5.setEllipsize(truncateAt);
        button5.setMinimumWidth(c1z0Var2.b(100));
        button5.setPadding(b4, b4, b4, b4);
        textView4.setShadowLayer(c1z0Var2.b(f10), c1z0Var2.b(f10), c1z0Var2.b(f10), -16777216);
        TextView textView5 = this.k;
        textView5.setId(I);
        textView5.setTextColor(-3355444);
        textView5.setMaxEms(10);
        textView5.setShadowLayer(c1z0Var2.b(f10), c1z0Var2.b(f10), c1z0Var2.b(f10), -16777216);
        LinearLayout linearLayout = this.g;
        linearLayout.setId(D);
        View.OnClickListener onClickListener = this.t;
        linearLayout.setOnClickListener(onClickListener);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        float f12 = 8;
        linearLayout.setPadding(c1z0Var2.b(f12), 0, c1z0Var2.b(f12), 0);
        TextView textView6 = this.h;
        textView6.setSingleLine();
        textView6.setEllipsize(truncateAt);
        textView6.setTypeface(textView6.getTypeface(), 1);
        textView6.setTextColor(-1);
        textView6.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = c1z0Var2.b(f11);
        this.q.setPadding(c1z0Var2.b(f9), c1z0Var2.b(f9), c1z0Var2.b(f9), c1z0Var2.b(f9));
        tyy0 tyy0Var6 = this.o;
        tyy0Var6.setId(F);
        tyy0Var6.setOnClickListener(onClickListener);
        tyy0Var6.setVisibility(8);
        tyy0Var6.setPadding(c1z0Var2.b(f9), c1z0Var2.b(f9), c1z0Var2.b(f9), c1z0Var2.b(f9));
        tyy0 tyy0Var7 = this.p;
        tyy0Var7.setId(E);
        tyy0Var7.setOnClickListener(onClickListener);
        tyy0Var7.setVisibility(8);
        tyy0Var7.setPadding(c1z0Var2.b(f9), c1z0Var2.b(f9), c1z0Var2.b(f9), c1z0Var2.b(f9));
        view2.setId(L);
        byte[] decode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCy8fw79+rQAAAhVJREFUeNrt2y9IXlEYx3H3ooIiiCAIC4JgMRgsCyaLwWaxLK0srZhWVtYWVtYWlpYMNsvK0sKKRTANBivDIIggIiLiZ+URDncHFgzbznN+8d77nvPwvec99zz/xsa6uv4oPMWjzADgK55kBnCvj3icGQBc4hWmsgK41w/sZAPwswLiC9ayAJjGa1wNrt/hAxaaBlBcW8ReZTVc4CUmmwZQ3FvHYQXEd2w3DyDuj/AMJxUQn7HaNIDiuRm8wfUAwi3eY75pAMXzS9ivrIZz7GKiaQDF7zZwVAHxDVvNAyj2h+c4rYD4hJWmARRjzOItbir7wzvMNQ2gGGsZB5XVcIYXGG8aQDHmJo4rII6x2TyAGHc83vpZBcQBlpsGUIw/F/vA7QDCTewbs00DKOZZiS/DUKfxJRk1DaCYbyvOCkMdYaN5ADHnRJwazysg9rHUNIBi7vnwI4b7w3X4HTNNAyhsWA3PcqiT8ERHTQMobNmOWMNQh1hvHkDYMxlRp4sKiD0sNg2gsGsh4pB3AwhXEbecbhpAYd9aRKZVItgPT+v96wAKO3ciVzHUw9J6/wuAsHUqslaXFRC/pfVGY139L9A3wf4Z7AehfhTuzlB3h3tApIfE/jqAtEHRtGHx1ImRtKmxtMnRtOnx1AUSaUtk0hZJpS2TS10ombZUNm2xdPpy+d4w0VtmetNU2ra51I2TuVtnuxrWL/YiKQ6CN9uRAAAAAElFTkSuQmCC", 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = 420;
        int i = c1z0.a.b;
        options.inTargetDensity = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        if (decodeByteArray != null) {
            tyy0Var7.setImageBitmap(decodeByteArray);
        }
        byte[] decode2 = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjITNKc0rQAAAJFJREFUeNrt2tENgCAMQEEwLuD+QzpC3cBURWLsvV+JNRfhi9YkSSpbP3sYETF0WO89s27m3KX6H1AeYL2wdrs5Y3/4ja/OTZ8B2f074h0z5zoDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/lr6rvDoK+xfmWsLNEmSVLUD47EiX/OuE8UAAAAASUVORK5CYII=", 0);
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inDensity = 420;
        options2.inTargetDensity = i;
        Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(decode2, 0, decode2.length, options2);
        if (decodeByteArray2 != null) {
            tyy0Var6.setImageBitmap(decodeByteArray2);
        }
        c1z0.k(this.o, -2013265920, -1, -1, c1z0Var2.b(f10), c1z0Var2.b(f11));
        c1z0.k(this.p, -2013265920, -1, -1, c1z0Var2.b(f10), c1z0Var2.b(f11));
        c1z0.k(this.q, -2013265920, -1, -1, c1z0Var2.b(f10), c1z0Var2.b(f11));
        qpk0Var2.setId(M);
        qpk0Var2.setStarSize(c1z0Var2.b(12));
        this.l.setId(G);
        this.l.setVisibility(8);
        mediaAdView2.addView(this.n, new ViewGroup.LayoutParams(-1, -1));
        addView(mediaAdView2);
        addView(view2);
        addView(view);
        addView(button3);
        addView(this.l);
        addView(linearLayout);
        addView(tyy0Var6);
        addView(tyy0Var7);
        addView(qpk0Var2);
        addView(textView5);
        addView(button5);
        addView(textView4);
        linearLayout.addView(this.q);
        linearLayout.addView(textView6, layoutParams2);
        button5.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        view.setOnClickListener(onClickListener);
    }

    public static void a(yhz0 yhz0Var) {
        MediaAdView mediaAdView = yhz0Var.j;
        if (yhz0Var.z != 0) {
            yhz0Var.z = 0;
            mediaAdView.getImageView().setVisibility(8);
            mediaAdView.getProgressBarView().setVisibility(8);
            yhz0Var.g.setVisibility(8);
            yhz0Var.p.setVisibility(8);
            yhz0Var.o.setVisibility(8);
            yhz0Var.i.setVisibility(8);
        }
    }

    @NonNull
    public dvy0 getAdVideoView() {
        return this.n;
    }

    @NonNull
    public MediaAdView getMediaAdView() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        MediaAdView mediaAdView = this.j;
        int measuredWidth = mediaAdView.getMeasuredWidth();
        int measuredHeight = mediaAdView.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) >> 1;
        int i8 = (i6 - measuredHeight) >> 1;
        mediaAdView.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        this.i.layout(mediaAdView.getLeft(), mediaAdView.getTop(), mediaAdView.getRight(), mediaAdView.getBottom());
        tyy0 tyy0Var = this.p;
        int i9 = i3 >> 1;
        int measuredWidth2 = tyy0Var.getMeasuredWidth() >> 1;
        int i10 = i4 >> 1;
        int measuredHeight2 = tyy0Var.getMeasuredHeight() >> 1;
        tyy0Var.layout(i9 - measuredWidth2, i10 - measuredHeight2, measuredWidth2 + i9, measuredHeight2 + i10);
        tyy0 tyy0Var2 = this.o;
        int measuredWidth3 = tyy0Var2.getMeasuredWidth() >> 1;
        int measuredHeight3 = tyy0Var2.getMeasuredHeight() >> 1;
        tyy0Var2.layout(i9 - measuredWidth3, i10 - measuredHeight3, measuredWidth3 + i9, measuredHeight3 + i10);
        LinearLayout linearLayout = this.g;
        int measuredWidth4 = linearLayout.getMeasuredWidth() >> 1;
        int measuredHeight4 = linearLayout.getMeasuredHeight() >> 1;
        linearLayout.layout(i9 - measuredWidth4, i10 - measuredHeight4, i9 + measuredWidth4, i10 + measuredHeight4);
        Button button = this.e;
        int measuredWidth5 = button.getMeasuredWidth();
        int i11 = this.w;
        button.layout(i11, i11, measuredWidth5 + i11, button.getMeasuredHeight() + i11);
        ohy0 ohy0Var = this.l;
        TextView textView = this.k;
        qpk0 qpk0Var = this.c;
        TextView textView2 = this.b;
        wvy0 wvy0Var = this.m;
        Button button2 = this.d;
        if (i5 > i6) {
            int max = Math.max(button2.getMeasuredHeight(), Math.max(textView2.getMeasuredHeight(), qpk0Var.getMeasuredHeight()));
            button2.layout((i5 - i11) - button2.getMeasuredWidth(), ((i6 - i11) - button2.getMeasuredHeight()) - ((max - button2.getMeasuredHeight()) >> 1), i5 - i11, (i6 - i11) - ((max - button2.getMeasuredHeight()) >> 1));
            wvy0Var.layout(wvy0Var.getPadding() + (button2.getRight() - wvy0Var.getMeasuredWidth()), wvy0Var.getPadding() + (((mediaAdView.getBottom() - (i11 << 1)) - wvy0Var.getMeasuredHeight()) - max), wvy0Var.getPadding() + button2.getRight(), wvy0Var.getPadding() + ((mediaAdView.getBottom() - (i11 << 1)) - max));
            qpk0Var.layout((button2.getLeft() - i11) - qpk0Var.getMeasuredWidth(), ((i6 - i11) - qpk0Var.getMeasuredHeight()) - ((max - qpk0Var.getMeasuredHeight()) >> 1), button2.getLeft() - i11, (i6 - i11) - ((max - qpk0Var.getMeasuredHeight()) >> 1));
            textView.layout((button2.getLeft() - i11) - textView.getMeasuredWidth(), ((i6 - i11) - textView.getMeasuredHeight()) - ((max - textView.getMeasuredHeight()) >> 1), button2.getLeft() - i11, (i6 - i11) - ((max - textView.getMeasuredHeight()) >> 1));
            int min = Math.min(qpk0Var.getLeft(), textView.getLeft());
            textView2.layout((min - i11) - textView2.getMeasuredWidth(), ((i6 - i11) - textView2.getMeasuredHeight()) - ((max - textView2.getMeasuredHeight()) >> 1), min - i11, (i6 - i11) - ((max - textView2.getMeasuredHeight()) >> 1));
            ohy0Var.layout(i11, ((i6 - i11) - ohy0Var.getMeasuredHeight()) - ((max - ohy0Var.getMeasuredHeight()) >> 1), ohy0Var.getMeasuredWidth() + i11, (i6 - i11) - ((max - ohy0Var.getMeasuredHeight()) >> 1));
            return;
        }
        wvy0Var.layout(wvy0Var.getPadding() + ((mediaAdView.getRight() - i11) - wvy0Var.getMeasuredWidth()), wvy0Var.getPadding() + ((mediaAdView.getBottom() - i11) - wvy0Var.getMeasuredHeight()), wvy0Var.getPadding() + (mediaAdView.getRight() - i11), wvy0Var.getPadding() + (mediaAdView.getBottom() - i11));
        int i12 = i5 >> 1;
        textView2.layout(i12 - (textView2.getMeasuredWidth() >> 1), mediaAdView.getBottom() + i11, (textView2.getMeasuredWidth() >> 1) + i12, textView2.getMeasuredHeight() + mediaAdView.getBottom() + i11);
        qpk0Var.layout(i12 - (qpk0Var.getMeasuredWidth() >> 1), textView2.getBottom() + i11, (qpk0Var.getMeasuredWidth() >> 1) + i12, qpk0Var.getMeasuredHeight() + textView2.getBottom() + i11);
        textView.layout(i12 - (textView.getMeasuredWidth() >> 1), textView2.getBottom() + i11, (textView.getMeasuredWidth() >> 1) + i12, textView.getMeasuredHeight() + textView2.getBottom() + i11);
        button2.layout(i12 - (button2.getMeasuredWidth() >> 1), qpk0Var.getBottom() + i11, i12 + (button2.getMeasuredWidth() >> 1), button2.getMeasuredHeight() + qpk0Var.getBottom() + i11);
        ohy0Var.layout(i11, (mediaAdView.getBottom() - i11) - ohy0Var.getMeasuredHeight(), ohy0Var.getMeasuredWidth() + i11, mediaAdView.getBottom() - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.x;
        this.m.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        ohy0 ohy0Var = this.l;
        ohy0Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        MediaAdView mediaAdView = this.j;
        mediaAdView.measure(makeMeasureSpec3, makeMeasureSpec4);
        int i4 = this.w;
        int i5 = i4 << 1;
        int i6 = size - i5;
        int i7 = size2 - i5;
        this.e.measure(View.MeasureSpec.makeMeasureSpec(i6 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        this.p.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i6 - (i4 * 4), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        qpk0 qpk0Var = this.c;
        qpk0Var.measure(makeMeasureSpec5, makeMeasureSpec6);
        this.i.measure(View.MeasureSpec.makeMeasureSpec(mediaAdView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(mediaAdView.getMeasuredHeight(), 1073741824));
        int makeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(i6 - (i4 * 4), Integer.MIN_VALUE);
        int makeMeasureSpec8 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        Button button = this.d;
        button.measure(makeMeasureSpec7, makeMeasureSpec8);
        int makeMeasureSpec9 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        int makeMeasureSpec10 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        TextView textView = this.b;
        textView.measure(makeMeasureSpec9, makeMeasureSpec10);
        int makeMeasureSpec11 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        int makeMeasureSpec12 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        TextView textView2 = this.k;
        textView2.measure(makeMeasureSpec11, makeMeasureSpec12);
        if (size > size2) {
            int measuredWidth = button.getMeasuredWidth();
            int measuredWidth2 = textView.getMeasuredWidth();
            if ((i4 * 3) + ohy0Var.getMeasuredWidth() + measuredWidth2 + Math.max(qpk0Var.getMeasuredWidth(), textView2.getMeasuredWidth()) + measuredWidth > i6) {
                int measuredWidth3 = (i6 - ohy0Var.getMeasuredWidth()) - (i4 * 3);
                int i8 = measuredWidth3 / 3;
                button.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                qpk0Var.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                textView2.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                textView.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - button.getMeasuredWidth()) - textView2.getMeasuredWidth()) - qpk0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void setVideoDialogViewListener(@Nullable d dVar) {
        this.y = dVar;
    }
}
