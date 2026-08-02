package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import xsna.jgz0;
import xsna.kkz0;
import xsna.v1z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class hhy0 extends ViewGroup implements ojz0 {
    public final int A;
    public kkz0.a B;
    public v1z0.a C;
    public int D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public String I;
    public String J;
    public boolean K;
    public z9z0 L;
    public boolean M;
    public final LinearLayout b;
    public final uhz0 c;
    public final ixy0 d;
    public final ixy0 e;
    public final r5z0 f;
    public final b g;
    public final c h;
    public final TextView i;
    public final qpk0 j;
    public final Button k;
    public final TextView l;
    public final c1z0 m;
    public final TextView n;
    public final ldy0 o;
    public final wvy0 p;
    public final ixy0 q;
    public final d r;
    public final a s;
    public final s8z0 t;
    public final TextView u;
    public final FrameLayout v;
    public final int w;
    public final int x;
    public final Bitmap y;
    public final Bitmap z;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            kkz0.a aVar;
            v1z0.a aVar2;
            hhy0 hhy0Var = hhy0.this;
            LinearLayout linearLayout = hhy0Var.b;
            uhz0 uhz0Var = hhy0Var.c;
            if (view == linearLayout) {
                v1z0.a aVar3 = hhy0Var.C;
                if (aVar3 != null) {
                    aVar3.q();
                }
                hhy0Var.e();
                return;
            }
            if (view == hhy0Var.d) {
                if (!uhz0Var.h() || (aVar2 = hhy0Var.C) == null) {
                    return;
                }
                aVar2.l();
                return;
            }
            if (view != hhy0Var.e) {
                if (view != hhy0Var.f || (aVar = hhy0Var.B) == null) {
                    return;
                }
                ((jgz0.b) aVar).c();
                return;
            }
            if (hhy0Var.C != null) {
                if (uhz0Var.g()) {
                    hhy0Var.C.n();
                } else {
                    hhy0Var.C.q();
                }
            }
            hhy0Var.e();
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            hhy0 hhy0Var = hhy0.this;
            int i = hhy0Var.D;
            if (i == 2 || i == 0) {
                hhy0Var.e();
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i;
            kkz0.a aVar;
            hhy0 hhy0Var = hhy0.this;
            int i2 = 1;
            if (!hhy0Var.M) {
                i = view != hhy0Var.k ? 1 : 2;
                if (!view.isEnabled() || (aVar = hhy0Var.B) == null) {
                    return;
                }
                ((jgz0.b) aVar).a(i, new akz0());
                return;
            }
            i = view != hhy0Var.k ? 1 : 2;
            if (view.isEnabled()) {
                if (view == hhy0Var.k) {
                    i2 = 64;
                } else if (view != hhy0Var.i) {
                    i2 = view == hhy0Var.j ? 16 : view == hhy0Var.n ? 512 : view == hhy0Var.c.getClickableLayout() ? 8192 : 2048;
                }
                viy0 viy0Var = new viy0(i2, hhy0Var.L);
                kkz0.a aVar2 = hhy0Var.B;
                if (aVar2 != null) {
                    ((jgz0.b) aVar2).a(i, viy0Var);
                }
            }
        }
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            hhy0 hhy0Var = hhy0.this;
            b bVar = hhy0Var.g;
            hhy0Var.removeCallbacks(bVar);
            int i = hhy0Var.D;
            if (i == 2) {
                hhy0Var.e();
                hhy0Var.postDelayed(bVar, 4000L);
            } else if (i == 0 || i == 3) {
                hhy0Var.D = 2;
                hhy0Var.b.setVisibility(8);
                hhy0Var.e.setVisibility(8);
                hhy0Var.d.setVisibility(0);
                hhy0Var.v.setVisibility(8);
                hhy0Var.postDelayed(bVar, 4000L);
            }
        }
    }

    public hhy0(Context context, boolean z) {
        super(context);
        this.L = new y9z0();
        this.M = false;
        TextView textView = new TextView(context);
        this.l = textView;
        TextView textView2 = new TextView(context);
        this.i = textView2;
        qpk0 qpk0Var = new qpk0(context);
        this.j = qpk0Var;
        Button button = new Button(context);
        this.k = button;
        TextView textView3 = new TextView(context);
        this.u = textView3;
        FrameLayout frameLayout = new FrameLayout(context);
        this.v = frameLayout;
        ixy0 ixy0Var = new ixy0(context);
        this.d = ixy0Var;
        ixy0 ixy0Var2 = new ixy0(context);
        this.e = ixy0Var2;
        ixy0 ixy0Var3 = new ixy0(context);
        this.q = ixy0Var3;
        TextView textView4 = new TextView(context);
        this.n = textView4;
        uhz0 uhz0Var = new uhz0(context, new c1z0(context), false, z);
        this.c = uhz0Var;
        ldy0 ldy0Var = new ldy0(context);
        this.o = ldy0Var;
        wvy0 wvy0Var = new wvy0(context);
        this.p = wvy0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        c1z0 c1z0Var = new c1z0(context);
        this.m = c1z0Var;
        this.g = new b();
        this.r = new d();
        a aVar = new a();
        this.s = aVar;
        r5z0 r5z0Var = new r5z0(context, null);
        this.f = r5z0Var;
        c1z0.n(textView, "dismiss_button");
        c1z0.n(textView2, "title_text");
        c1z0.n(qpk0Var, "stars_view");
        c1z0.n(button, "cta_button");
        c1z0.n(textView3, "replay_text");
        c1z0.n(frameLayout, "shadow");
        c1z0.n(ixy0Var, "pause_button");
        c1z0.n(ixy0Var2, "play_button");
        c1z0.n(ixy0Var3, "replay_button");
        c1z0.n(textView4, "domain_text");
        c1z0.n(uhz0Var, "media_view");
        c1z0.n(ldy0Var, "video_progress_wheel");
        c1z0.n(wvy0Var, "sound_button");
        int b2 = c1z0Var.b(28);
        this.A = b2;
        float f = 16;
        int b3 = c1z0Var.b(f);
        this.w = b3;
        float f2 = 4;
        this.x = c1z0Var.b(f2);
        this.y = nhz0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAdVBMVEUAAAAAAAAgICDf398QEBDv7+/Pz8+fn58gICAQEBDe3t5AQEBwcHDv7+9/f3/f398wMDCAgIBgYGCQkJDAwMC/v7/Pz8+fn59QUFBAQECvr69QUFCPj4+/v79wcHBvb29gYGBfX1++vr6urq6Ojo5hYWH///+8blWlAAAAJnRSTlOAAJDviPfnzyAQ3qC478DfmICvx9/fz59QQK+oj79wb2Bfvq6OsPCmZBAAAAJhSURBVEjHndbXYuIwEAXQiSQXueAGtmkhJNn7/5+4I8JmbJAWw33iQYex7FGhN0/s9jT0FTjVcXfavvlC92o8lpil3J0fQ9s4FXdtrYij8qKLXeUhDUFhm8LQLKp1tknDcKyY5eRJnQDZOQDtwcOkrAa+rQ+mPaKC/pMiQpbew7SCVgEiRUWSuNjQg5hYJP26hBYkYTmFluvRosTo7QQeoM0yaDS+BX4gUrQwKsJ4hW6CRfBF6ruvgsxeYROcYB4BdJs1mh+YAoEHXQEemKO0FzgEvoRJAKbkL8mwQh3okygnhv6SxK80DkxPKxI4Lzky3KH1Ty8x9AM14mQ/f7GfDEso//SIfiEwWwEGpaUtYhke4Ro3vX+QU//hCdfTxtvSOzrpYIkigS6mm3ZXh3faSddEN8PlUTet+9vNL2wx0BH5ZFAAuhmbSEbW6KmCegTJFGC0kkZRyGRMEHIYbXi0ngxdCA0i9/sViNdggQ3ViCdDl72cFdBSO385PeqFn0NjL+vjkwa0DxsgcidDBz3p8t3ilktuWi7U5Ho/hWoV3TW5LWGWLKuN1COFktfjEcXDhayT2fHXYsdwxJo82evw1hHjzNCWyAObld57YY3ssss1WD+3PSYYHJSSCzdkBaQOSknfRD1QX48ALpk9eeikF8gZnzvmzi8erIfpUd4vP8ozO7s8ZK9dHpx8+roi8skLksjHV7I+DV0C42DRfA0cbODa+ZEBSR1i2Ri+6KYNuGp7U9YUzMpGygmc0CFztivyi1Z128UQ5oPywF+3l/njKEygL9vT12cGTtUPp631DfkLyeFPR/ZOiKIAAAAASUVORK5CYII=");
        this.z = nhz0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAclBMVEUAAAAAAAAgICDf39+goKAgICAQEBDe3t7Pz88QEBDv7+9wcHBAQEDf39+AgIDv7+/AwMCQkJDPz8+/v7+vr69gYGCfn5+Pj49fX19QUFBAQEAwMDBQUFDu7u5/f39/f39wcHBvb2+/v78wMDCvr6////9R0hTPAAAAJXRSTlOAAJDvzyAQ3ueI97ig34Dv38fPv6+vn49fUECYqO7Av3Bv35fYiozA+AAAAjJJREFUSMe91um2mjAUBeBDGMOkjDJoe63d7/+KTbyxpzZJgXat7j8i8nkICUkocCRZ7mNbQaXq+vsSuEK2mrsT3nLqp22Y1FplzbAKUhFl0WS68hj7ILNvhaS3iEHbOvbDuVKsJEfWCEgnD0wuzOyIELgkLhi3yAv6Q4ocaWzDuEIoPISLsiR2maSNyIwl/XQR7Uj0lAwTVY92JUOb/AIvCOU+KENcGE7IBe2MyDEbqBtYeB9kaPUK0sTA2tvAMgesk2fUnzAGhNt9ARywxC15wtHTEzICvhpoldSwwuoZJ3lJBlolFZyQeZoXCjLQKjkr2GNwNy+S5IEFOgVPEO7mEfmgVPdKCzK+PIeJbp4fUoaFPtDwCOYIYihfXx5k0uCDeh41+dvlfBSGwvzx1ZwdMFKHki9yH0VQ0nx8ZkVLFcQGNIQdkUCqf9mEGrHTAXZBLdn9Fxgh/P4mgb9/OC3WLdhY3VGioxHD8QFQoN8z5IR89TvxkPMN8vC6NciTE+TR10rgFlDQoTj6Ig/oFZxxJkeuoX/qyDApqO61dEmh5NUJV6TPWa7G+dj0GGHUkEvunJAFEGvIJZ0NtWFolgBVMj246MQGBvOxZW7694U1SNr9S3mavG0e0uObh5c8vF1heXCDxHJ7S9bGvk1g5i1anq1NIGdKgejhY+ns3+jGNYBs+K2sLBQ71UnggEzHVNumKJ9aPIYmAzMH5Ez9DRytupkZQ1eWe9+l2lTteF+UsvMDBKFIvMRHIr8AAAAASUVORK5CYII=");
        this.h = new c();
        this.t = new s8z0(new j630(this, 25));
        setBackgroundColor(-16777216);
        uhz0Var.setBackgroundColor(-16777216);
        uhz0Var.f();
        frameLayout.setBackgroundColor(-1728053248);
        frameLayout.setVisibility(8);
        textView.setTextSize(2, 16.0f);
        textView.setTransformationMethod(null);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setVisibility(8);
        textView.setTextAlignment(4);
        textView.setTextColor(-1);
        float f3 = 1;
        c1z0.k(textView, -2013265920, -1, -1, c1z0Var.b(f3), c1z0Var.b(f2));
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setTextSize(2, 18.0f);
        textView2.setTextColor(-1);
        c1z0.k(button, -2013265920, -1, -1, c1z0Var.b(f3), c1z0Var.b(f2));
        button.setTextColor(-1);
        button.setTransformationMethod(null);
        button.setGravity(1);
        button.setTextSize(2, 16.0f);
        button.setMinimumWidth(c1z0Var.b(100));
        button.setPadding(b3, b3, b3, b3);
        textView2.setShadowLayer(c1z0Var.b(f3), c1z0Var.b(f3), c1z0Var.b(f3), -16777216);
        textView4.setTextColor(-3355444);
        textView4.setMaxEms(10);
        textView4.setShadowLayer(c1z0Var.b(f3), c1z0Var.b(f3), c1z0Var.b(f3), -16777216);
        linearLayout.setOnClickListener(aVar);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        float f4 = 8;
        linearLayout.setPadding(c1z0Var.b(f4), 0, c1z0Var.b(f4), 0);
        textView3.setSingleLine();
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(textView3.getTypeface(), 1);
        textView3.setTextColor(-1);
        textView3.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = c1z0Var.b(f2);
        ixy0Var3.setPadding(c1z0Var.b(f), c1z0Var.b(f), c1z0Var.b(f), c1z0Var.b(f));
        ixy0Var.setOnClickListener(aVar);
        ixy0Var.setVisibility(8);
        ixy0Var.setPadding(c1z0Var.b(f), c1z0Var.b(f), c1z0Var.b(f), c1z0Var.b(f));
        ixy0Var2.setOnClickListener(aVar);
        ixy0Var2.setVisibility(8);
        ixy0Var2.setPadding(c1z0Var.b(f), c1z0Var.b(f), c1z0Var.b(f), c1z0Var.b(f));
        getContext();
        Bitmap a2 = nhz0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCy8fw79+rQAAAhVJREFUeNrt2y9IXlEYx3H3ooIiiCAIC4JgMRgsCyaLwWaxLK0srZhWVtYWVtYWlpYMNsvK0sKKRTANBivDIIggIiLiZ+URDncHFgzbznN+8d77nvPwvec99zz/xsa6uv4oPMWjzADgK55kBnCvj3icGQBc4hWmsgK41w/sZAPwswLiC9ayAJjGa1wNrt/hAxaaBlBcW8ReZTVc4CUmmwZQ3FvHYQXEd2w3DyDuj/AMJxUQn7HaNIDiuRm8wfUAwi3eY75pAMXzS9ivrIZz7GKiaQDF7zZwVAHxDVvNAyj2h+c4rYD4hJWmARRjzOItbir7wzvMNQ2gGGsZB5XVcIYXGG8aQDHmJo4rII6x2TyAGHc83vpZBcQBlpsGUIw/F/vA7QDCTewbs00DKOZZiS/DUKfxJRk1DaCYbyvOCkMdYaN5ADHnRJwazysg9rHUNIBi7vnwI4b7w3X4HTNNAyhsWA3PcqiT8ERHTQMobNmOWMNQh1hvHkDYMxlRp4sKiD0sNg2gsGsh4pB3AwhXEbecbhpAYd9aRKZVItgPT+v96wAKO3ciVzHUw9J6/wuAsHUqslaXFRC/pfVGY139L9A3wf4Z7AehfhTuzlB3h3tApIfE/jqAtEHRtGHx1ImRtKmxtMnRtOnx1AUSaUtk0hZJpS2TS10ombZUNm2xdPpy+d4w0VtmetNU2ra51I2TuVtnuxrWL/YiKQ6CN9uRAAAAAElFTkSuQmCC");
        if (a2 != null) {
            ixy0Var2.setImageBitmap(a2);
        }
        getContext();
        Bitmap a3 = nhz0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjITNKc0rQAAAJFJREFUeNrt2tENgCAMQEEwLuD+QzpC3cBURWLsvV+JNRfhi9YkSSpbP3sYETF0WO89s27m3KX6H1AeYL2wdrs5Y3/4ja/OTZ8B2f074h0z5zoDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/lr6rvDoK+xfmWsLNEmSVLUD47EiX/OuE8UAAAAASUVORK5CYII=");
        if (a3 != null) {
            ixy0Var.setImageBitmap(a3);
        }
        c1z0.k(ixy0Var, -2013265920, -1, -1, c1z0Var.b(f3), c1z0Var.b(f2));
        c1z0.k(ixy0Var2, -2013265920, -1, -1, c1z0Var.b(f3), c1z0Var.b(f2));
        c1z0.k(ixy0Var3, -2013265920, -1, -1, c1z0Var.b(f3), c1z0Var.b(f2));
        qpk0Var.setStarSize(c1z0Var.b(12));
        ldy0Var.setVisibility(8);
        r5z0Var.setFixedHeight(b2);
        addView(uhz0Var);
        addView(frameLayout);
        addView(wvy0Var);
        addView(textView);
        addView(ldy0Var);
        addView(linearLayout);
        addView(ixy0Var);
        addView(ixy0Var2);
        addView(qpk0Var);
        addView(textView4);
        addView(button);
        addView(textView2);
        addView(r5z0Var);
        linearLayout.addView(ixy0Var3);
        linearLayout.addView(textView3, layoutParams);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickAreaActual(@NonNull k6z0 k6z0Var) {
        StringBuilder sb = new StringBuilder("PromoStyle1View: Apply click area ");
        int i = k6z0Var.o;
        boolean z = k6z0Var.m;
        sb.append(i);
        sb.append(" to view");
        gu8.c(null, sb.toString());
        s8z0 s8z0Var = this.t;
        setOnTouchListener(s8z0Var);
        Button button = this.k;
        button.setOnTouchListener(s8z0Var);
        TextView textView = this.i;
        textView.setOnTouchListener(s8z0Var);
        qpk0 qpk0Var = this.j;
        qpk0Var.setOnTouchListener(s8z0Var);
        TextView textView2 = this.n;
        textView2.setOnTouchListener(s8z0Var);
        uhz0 uhz0Var = this.c;
        uhz0Var.getClickableLayout().setOnTouchListener(s8z0Var);
        boolean z2 = k6z0Var.l;
        View.OnClickListener onClickListener = this.h;
        setOnClickListener((z2 || z) ? onClickListener : null);
        button.setOnClickListener((k6z0Var.g || z) ? onClickListener : null);
        textView.setOnClickListener((k6z0Var.a || z) ? onClickListener : null);
        qpk0Var.setOnClickListener((k6z0Var.e || z) ? onClickListener : null);
        textView2.setOnClickListener((k6z0Var.j || z) ? onClickListener : null);
        FrameLayout clickableLayout = uhz0Var.getClickableLayout();
        if (!k6z0Var.n && !z) {
            onClickListener = this.r;
        }
        clickableLayout.setOnClickListener(onClickListener);
    }

    private void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        StringBuilder sb = new StringBuilder("PromoStyle1View: Apply click area ");
        int i = k6z0Var.o;
        boolean z = k6z0Var.m;
        sb.append(i);
        sb.append(" to view");
        gu8.c(null, sb.toString());
        boolean z2 = k6z0Var.l;
        View.OnClickListener onClickListener = this.h;
        setOnClickListener((z2 || z) ? onClickListener : null);
        this.k.setOnClickListener((k6z0Var.g || z) ? onClickListener : null);
        this.i.setOnClickListener((k6z0Var.a || z) ? onClickListener : null);
        this.j.setOnClickListener((k6z0Var.e || z) ? onClickListener : null);
        this.n.setOnClickListener((k6z0Var.j || z) ? onClickListener : null);
        FrameLayout clickableLayout = this.c.getClickableLayout();
        if (!k6z0Var.n && !z) {
            onClickListener = this.r;
        }
        clickableLayout.setOnClickListener(onClickListener);
    }

    @Override // xsna.ojz0
    public final void a() {
        uhz0 uhz0Var = this.c;
        uhz0Var.b.setVisibility(8);
        uhz0Var.h.setVisibility(8);
        this.b.setVisibility(8);
        this.e.setVisibility(8);
        if (this.D != 2) {
            this.d.setVisibility(8);
        }
    }

    @Override // xsna.ojz0
    public final boolean b() {
        return this.c.g();
    }

    @Override // xsna.kkz0
    public final void c() {
        String str = this.I;
        TextView textView = this.l;
        textView.setText(str);
        textView.setTextSize(2, 16.0f);
        textView.setVisibility(0);
        textView.setTextColor(-1);
        textView.setEnabled(true);
        int i = this.w;
        textView.setPadding(i, i, i, i);
        c1z0 c1z0Var = this.m;
        c1z0.k(textView, -2013265920, -1, -1, c1z0Var.b(1), c1z0Var.b(4));
        this.K = true;
    }

    @Override // xsna.ojz0
    public final void d() {
        this.o.setVisibility(8);
        this.D = 4;
        if (this.H) {
            this.b.setVisibility(0);
            this.v.setVisibility(0);
        }
        this.e.setVisibility(8);
        this.d.setVisibility(8);
    }

    @Override // xsna.ojz0
    public final void destroy() {
        this.c.b();
    }

    public final void e() {
        this.D = 0;
        this.b.setVisibility(8);
        this.e.setVisibility(8);
        this.d.setVisibility(8);
        this.v.setVisibility(8);
    }

    @Override // xsna.kkz0
    @NonNull
    public View getCloseButton() {
        return this.l;
    }

    @Override // xsna.ojz0
    @NonNull
    public uhz0 getPromoMediaView() {
        return this.c;
    }

    @Override // xsna.ojz0
    public final boolean isPlaying() {
        return this.c.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        uhz0 uhz0Var = this.c;
        int measuredWidth = uhz0Var.getMeasuredWidth();
        int measuredHeight = uhz0Var.getMeasuredHeight();
        int i7 = (i5 - measuredWidth) >> 1;
        int i8 = (i6 - measuredHeight) >> 1;
        uhz0Var.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
        this.v.layout(uhz0Var.getLeft(), uhz0Var.getTop(), uhz0Var.getRight(), uhz0Var.getBottom());
        ixy0 ixy0Var = this.e;
        int i9 = i3 >> 1;
        int measuredWidth2 = ixy0Var.getMeasuredWidth() >> 1;
        int i10 = i4 >> 1;
        int measuredHeight2 = ixy0Var.getMeasuredHeight() >> 1;
        ixy0Var.layout(i9 - measuredWidth2, i10 - measuredHeight2, measuredWidth2 + i9, measuredHeight2 + i10);
        ixy0 ixy0Var2 = this.d;
        int measuredWidth3 = ixy0Var2.getMeasuredWidth() >> 1;
        int measuredHeight3 = ixy0Var2.getMeasuredHeight() >> 1;
        ixy0Var2.layout(i9 - measuredWidth3, i10 - measuredHeight3, measuredWidth3 + i9, measuredHeight3 + i10);
        LinearLayout linearLayout = this.b;
        int measuredWidth4 = linearLayout.getMeasuredWidth() >> 1;
        int measuredHeight4 = linearLayout.getMeasuredHeight() >> 1;
        linearLayout.layout(i9 - measuredWidth4, i10 - measuredHeight4, i9 + measuredWidth4, i10 + measuredHeight4);
        TextView textView = this.l;
        int measuredWidth5 = textView.getMeasuredWidth();
        int i11 = this.w;
        textView.layout(i11, i11, measuredWidth5 + i11, textView.getMeasuredHeight() + i11);
        r5z0 r5z0Var = this.f;
        ldy0 ldy0Var = this.o;
        TextView textView2 = this.n;
        qpk0 qpk0Var = this.j;
        TextView textView3 = this.i;
        wvy0 wvy0Var = this.p;
        Button button = this.k;
        if (i5 > i6) {
            int max = Math.max(button.getMeasuredHeight(), Math.max(textView3.getMeasuredHeight(), qpk0Var.getMeasuredHeight()));
            button.layout((i5 - i11) - button.getMeasuredWidth(), ((i6 - i11) - button.getMeasuredHeight()) - ((max - button.getMeasuredHeight()) >> 1), i5 - i11, (i6 - i11) - ((max - button.getMeasuredHeight()) >> 1));
            wvy0Var.layout(wvy0Var.getPadding() + (button.getRight() - wvy0Var.getMeasuredWidth()), wvy0Var.getPadding() + (((uhz0Var.getBottom() - (i11 << 1)) - wvy0Var.getMeasuredHeight()) - max), wvy0Var.getPadding() + button.getRight(), wvy0Var.getPadding() + ((uhz0Var.getBottom() - (i11 << 1)) - max));
            r5z0Var.layout(button.getRight() - r5z0Var.getMeasuredWidth(), i11, button.getRight(), r5z0Var.getMeasuredHeight() + i11);
            qpk0Var.layout((button.getLeft() - i11) - qpk0Var.getMeasuredWidth(), ((i6 - i11) - qpk0Var.getMeasuredHeight()) - ((max - qpk0Var.getMeasuredHeight()) >> 1), button.getLeft() - i11, (i6 - i11) - ((max - qpk0Var.getMeasuredHeight()) >> 1));
            textView2.layout((button.getLeft() - i11) - textView2.getMeasuredWidth(), ((i6 - i11) - textView2.getMeasuredHeight()) - ((max - textView2.getMeasuredHeight()) >> 1), button.getLeft() - i11, (i6 - i11) - ((max - textView2.getMeasuredHeight()) >> 1));
            int min = Math.min(qpk0Var.getLeft(), textView2.getLeft());
            textView3.layout((min - i11) - textView3.getMeasuredWidth(), ((i6 - i11) - textView3.getMeasuredHeight()) - ((max - textView3.getMeasuredHeight()) >> 1), min - i11, (i6 - i11) - ((max - textView3.getMeasuredHeight()) >> 1));
            ldy0Var.layout(i11, ((i6 - i11) - ldy0Var.getMeasuredHeight()) - ((max - ldy0Var.getMeasuredHeight()) >> 1), ldy0Var.getMeasuredWidth() + i11, (i6 - i11) - ((max - ldy0Var.getMeasuredHeight()) >> 1));
            return;
        }
        wvy0Var.layout(wvy0Var.getPadding() + ((uhz0Var.getRight() - i11) - wvy0Var.getMeasuredWidth()), wvy0Var.getPadding() + ((uhz0Var.getBottom() - i11) - wvy0Var.getMeasuredHeight()), wvy0Var.getPadding() + (uhz0Var.getRight() - i11), wvy0Var.getPadding() + (uhz0Var.getBottom() - i11));
        r5z0Var.layout((uhz0Var.getRight() - i11) - r5z0Var.getMeasuredWidth(), uhz0Var.getTop() + i11, uhz0Var.getRight() - i11, r5z0Var.getMeasuredHeight() + uhz0Var.getTop() + i11);
        int measuredHeight5 = button.getMeasuredHeight() + textView2.getMeasuredHeight() + qpk0Var.getMeasuredHeight() + textView3.getMeasuredHeight();
        int bottom = getBottom() - uhz0Var.getBottom();
        int i12 = (i11 * 3) + measuredHeight5 > bottom ? (bottom - measuredHeight5) / 3 : i11;
        int i13 = i5 >> 1;
        textView3.layout(i13 - (textView3.getMeasuredWidth() >> 1), uhz0Var.getBottom() + i12, (textView3.getMeasuredWidth() >> 1) + i13, textView3.getMeasuredHeight() + uhz0Var.getBottom() + i12);
        qpk0Var.layout(i13 - (qpk0Var.getMeasuredWidth() >> 1), textView3.getBottom() + i12, (qpk0Var.getMeasuredWidth() >> 1) + i13, qpk0Var.getMeasuredHeight() + textView3.getBottom() + i12);
        textView2.layout(i13 - (textView2.getMeasuredWidth() >> 1), textView3.getBottom() + i12, (textView2.getMeasuredWidth() >> 1) + i13, textView2.getMeasuredHeight() + textView3.getBottom() + i12);
        button.layout(i13 - (button.getMeasuredWidth() >> 1), qpk0Var.getBottom() + i12, i13 + (button.getMeasuredWidth() >> 1), button.getMeasuredHeight() + qpk0Var.getBottom() + i12);
        ldy0Var.layout(i11, (uhz0Var.getBottom() - i11) - ldy0Var.getMeasuredHeight(), ldy0Var.getMeasuredWidth() + i11, uhz0Var.getBottom() - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.A;
        this.p.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        ldy0 ldy0Var = this.o;
        ldy0Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        uhz0 uhz0Var = this.c;
        uhz0Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        int i4 = this.w;
        int i5 = i4 << 1;
        int i6 = size - i5;
        int i7 = size2 - i5;
        this.l.measure(View.MeasureSpec.makeMeasureSpec(i6 / 2, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        this.f.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        this.e.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        qpk0 qpk0Var = this.j;
        qpk0Var.measure(makeMeasureSpec5, makeMeasureSpec6);
        this.v.measure(View.MeasureSpec.makeMeasureSpec(uhz0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(uhz0Var.getMeasuredHeight(), 1073741824));
        int makeMeasureSpec7 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        int makeMeasureSpec8 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        Button button = this.k;
        button.measure(makeMeasureSpec7, makeMeasureSpec8);
        int makeMeasureSpec9 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        int makeMeasureSpec10 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        TextView textView = this.i;
        textView.measure(makeMeasureSpec9, makeMeasureSpec10);
        int makeMeasureSpec11 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        int makeMeasureSpec12 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        TextView textView2 = this.n;
        textView2.measure(makeMeasureSpec11, makeMeasureSpec12);
        if (size > size2) {
            int measuredWidth = button.getMeasuredWidth();
            int measuredWidth2 = textView.getMeasuredWidth();
            if ((i4 * 3) + ldy0Var.getMeasuredWidth() + measuredWidth2 + Math.max(qpk0Var.getMeasuredWidth(), textView2.getMeasuredWidth()) + measuredWidth > i6) {
                int measuredWidth3 = (i6 - ldy0Var.getMeasuredWidth()) - (i4 * 3);
                int i8 = measuredWidth3 / 3;
                button.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                qpk0Var.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                textView2.measure(View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
                textView.measure(View.MeasureSpec.makeMeasureSpec(((measuredWidth3 - button.getMeasuredWidth()) - textView2.getMeasuredWidth()) - qpk0Var.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
            }
        } else {
            if ((i4 * 3) + button.getMeasuredHeight() + textView2.getMeasuredHeight() + qpk0Var.getMeasuredHeight() + textView.getMeasuredHeight() > (size2 - uhz0Var.getMeasuredHeight()) / 2) {
                int i9 = i4 / 2;
                button.setPadding(i4, i9, i4, i9);
                button.measure(View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // xsna.ojz0
    public final void pause() {
        int i = this.D;
        if (i == 0 || i == 2) {
            this.D = 1;
            this.b.setVisibility(8);
            this.e.setVisibility(0);
            this.d.setVisibility(8);
            this.v.setVisibility(0);
            this.c.i();
        }
    }

    @Override // xsna.ojz0
    public final void resume() {
        uhz0 uhz0Var = this.c;
        uhz0Var.d.setVisibility(8);
        loy0 loy0Var = uhz0Var.l;
        if (loy0Var == null || uhz0Var.m == null) {
            return;
        }
        loy0Var.resume();
        uhz0Var.b.setVisibility(8);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xsna.kkz0
    public void setBanner(@NonNull tez0 tez0Var) {
        this.M = tez0Var.T.c;
        this.c.d(tez0Var, 1);
        lgz0 lgz0Var = tez0Var.c0;
        if (lgz0Var == null) {
            return;
        }
        this.o.setMax(tez0Var.D);
        this.H = lgz0Var.j0;
        this.G = tez0Var.Y;
        this.k.setText(tez0Var.n());
        this.i.setText(tez0Var.f);
        String str = tez0Var.p;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 117588:
                if (str.equals("web")) {
                    c2 = 0;
                    break;
                }
                break;
            case 109770977:
                if (str.equals(X3.i.U)) {
                    c2 = 1;
                    break;
                }
                break;
            case 1223953944:
                if (str.equals("webform")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        TextView textView = this.n;
        qpk0 qpk0Var = this.j;
        switch (c2) {
            case 0:
            case 2:
                qpk0Var.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(tez0Var.o);
                break;
            case 1:
                if (tez0Var.c() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    qpk0Var.setVisibility(0);
                    qpk0Var.setRating(tez0Var.c());
                } else {
                    qpk0Var.setVisibility(8);
                }
                textView.setVisibility(8);
                break;
        }
        String str2 = lgz0Var.a0;
        this.I = str2;
        this.J = lgz0Var.c0;
        TextView textView2 = this.l;
        textView2.setText(str2);
        if (lgz0Var.l0 && lgz0Var.h0) {
            float f = lgz0Var.q0;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.F = f;
                textView2.setEnabled(false);
                textView2.setTextColor(-3355444);
                int i = this.x;
                textView2.setPadding(i, i, i, i);
                c1z0 c1z0Var = this.m;
                c1z0.k(textView2, -2013265920, -2013265920, -3355444, c1z0Var.b(1), c1z0Var.b(4));
                textView2.setTextSize(2, 12.0f);
            } else {
                int i2 = this.w;
                textView2.setPadding(i2, i2, i2, i2);
                textView2.setVisibility(0);
            }
        }
        this.u.setText(lgz0Var.b0);
        getContext();
        Bitmap a2 = nhz0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjM59gfMOgAAA59JREFUeNrtmkloFEEUhl/N6KgxriiJOHEXF4gENYlgRFA8uyAoCNGggl68CCJ6EQx6cCFqUFzABQQRMYh4EfSi4IJbiFERQVxRgxuRMWri5yE1UBY9yWh6Znq6+z+96a6ZV/8/tbz3qkRChAgRwiMAFgJngWgQyVcDHXTiFKCCRH4Df6MFKAkK+W0W+VfAxCAQV8A+i/wTIB4E8lHgpEX+LjA8COQHAM8t8o3ATKC338kXA59IjXbgEVAPLAb6+k2AHRbhVrrGV+AwMNVPIpx3INncjRi/gTPAWL+IcMIieBGIAXFgGXAU+OggRALY7ItIEdhvkTsNRIz3MWCp3h1sXAGK/RAHnLKIHUzRdgnwwmr7Epjsh3jggkWsNkXbQuC4Q8g8Ld9F6ANctYht7KL9GiNpAnib94ujDo5uaUIdwMo00uafhghNQL98F2EYcA9YlGb75daoOeqHnSHyj+23WyLMC1oRJQpct7LJXkETYSrwyxBhlQQNwAFrFKigCTDK2hXmBnEUnDMEOBZEARYaArwLogAF1jRIq4YQ8YsASqmEiNw2HpUHSgCNB4Y9KYgCPDXs8UEU4LNhF6bzhW7DRmCEiFTqjx+VUtc8LECrYfd3RQA9lxq03SgiZR4WIGbYv9yaAt8Me5DHp8DAFP3ukQDvDTvu8WxrnGG/dUUApdQrEUkYU2a8hwWYnGJH6PEu0GzYczwaCSoRqTIeNbkpwFXDnu/Rf79URJKnyz9E5Kab6i4wYuxvQKEHR8BO8+DE7R+PAu8MB6s9Rj4GvDH6tzYTTvZaVZeIhwSoMfr2HRiUCSd21aXGI+T7WRcu6jLp7Ijh6AMw1AMCmKXxtozeLgOKgC+Gw4ZcFiCB2fpWSRLbsuF0nXUYsSlH5EfqE+IknmblSo0+1m6wRKjOMvnB+jzQHPpl2ezAEOCx0YEOYH2WfMct8rlZkIES4LXVkXqgTwZ9Vjn43JrLFXgC8Mzq0H2g0mU/BTrSa7d8bfHCPlwE3HC41XWyp9fbdIS3Tt8fxprzq7wUivYGdmnithCXgRXpxgw67K4A9ljhdxKPgVK3+q5cFqJcRA6JyAyn1zpFfaBz9RZdtYnpStNonc/PEpEhDt9vE5FaEdmtlPrh2YoEEAEWpbje9j9o1aNrhOQbgOlAncNC2R0SwCVgZaZTb5VFMUpEpEJEpojIGBEZLJ21+zbpLGe3iMgTEXkoIneUUj8lRIgQIUKECJFJ/AEepzU1TSID5QAAAABJRU5ErkJggg==");
        if (a2 != null) {
            this.q.setImageBitmap(a2);
        }
        if (lgz0Var.h0) {
            c(true);
            e();
        } else {
            this.D = 1;
            this.b.setVisibility(8);
            this.e.setVisibility(0);
            this.d.setVisibility(8);
            this.v.setVisibility(0);
        }
        this.E = lgz0Var.D;
        qj8 qj8Var = new qj8(this, 12);
        wvy0 wvy0Var = this.p;
        wvy0Var.setOnClickListener(qj8Var);
        if (lgz0Var.g0) {
            wvy0Var.a(this.z, false);
            wvy0Var.setContentDescription("sound_off");
        } else {
            wvy0Var.a(this.y, false);
            wvy0Var.setContentDescription("sound_on");
        }
        wty0 wty0Var = tez0Var.L;
        r5z0 r5z0Var = this.f;
        if (wty0Var == null) {
            r5z0Var.setVisibility(8);
        } else {
            r5z0Var.setImageBitmap(wty0Var.a.a());
            r5z0Var.setOnClickListener(this.s);
        }
    }

    @Override // xsna.kkz0
    public void setClickArea(@NonNull k6z0 k6z0Var) {
        if (this.M) {
            setClickAreaActual(k6z0Var);
        } else {
            setClickAreaLegacy(k6z0Var);
        }
    }

    @Override // xsna.kkz0
    public void setInterstitialPromoViewListener(@Nullable kkz0.a aVar) {
        this.B = aVar;
    }

    @Override // xsna.ojz0
    public void setMediaListener(@Nullable v1z0.a aVar) {
        this.C = aVar;
        this.c.setInterstitialPromoViewListener(aVar);
    }

    @Override // xsna.ojz0
    public void setTimeChanged(float f) {
        if (!this.K && this.G) {
            float f2 = this.F;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 >= f) {
                TextView textView = this.l;
                if (textView.getVisibility() != 0) {
                    textView.setVisibility(0);
                }
                if (this.J != null) {
                    int ceil = (int) Math.ceil(this.F - f);
                    String valueOf = String.valueOf(ceil);
                    if (this.F > 9.0f && ceil <= 9) {
                        valueOf = go9.b("0", valueOf);
                    }
                    textView.setText(this.J.replace("%d", valueOf));
                }
            }
        }
        ldy0 ldy0Var = this.o;
        if (ldy0Var.getVisibility() != 0) {
            ldy0Var.setVisibility(0);
        }
        ldy0Var.setProgress(f / this.E);
        ldy0Var.setDigit((int) Math.ceil(this.E - f));
    }

    @Override // xsna.ojz0
    public final void b(boolean z) {
        wvy0 wvy0Var = this.p;
        if (z) {
            wvy0Var.a(this.z, false);
            wvy0Var.setContentDescription("sound_off");
        } else {
            wvy0Var.a(this.y, false);
            wvy0Var.setContentDescription("sound_on");
        }
    }

    @Override // xsna.ojz0
    public final void a(tez0 tez0Var) {
        uhz0 uhz0Var = this.c;
        uhz0Var.setOnClickListener(null);
        this.p.setVisibility(8);
        uhz0Var.b();
        uhz0Var.c(tez0Var);
        c();
        this.D = 4;
        this.b.setVisibility(8);
        this.e.setVisibility(8);
        this.d.setVisibility(8);
        this.v.setVisibility(8);
        this.o.setVisibility(8);
    }

    @Override // xsna.ojz0
    public final void c(boolean z) {
        this.c.a(z);
        e();
    }

    @Override // xsna.kkz0
    @NonNull
    public View getView() {
        return this;
    }

    @Override // xsna.ojz0
    public final void a(boolean z) {
        this.c.e(true);
    }

    @Override // xsna.ojz0
    public final void a(int i) {
        loy0 loy0Var = this.c.l;
        if (loy0Var != null) {
            if (i == 0) {
                loy0Var.f();
            } else if (i != 1) {
                loy0Var.d();
            } else {
                loy0Var.e();
            }
        }
    }
}
