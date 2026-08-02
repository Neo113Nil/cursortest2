package xsna;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class nuy0 extends ViewGroup implements ary0, View.OnClickListener {
    public final s8z0 A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final View L;
    public int M;
    public int N;
    public final int O;
    public z9z0 P;
    public boolean Q;
    public final auy0 b;
    public final riz0 c;
    public final auy0 d;
    public final tjz0 e;
    public final gdy0 f;
    public final phz0 g;
    public final ixy0 h;
    public final Button i;
    public final whz0 j;
    public final whz0 k;
    public final r5z0 l;
    public final ProgressBar m;
    public final View n;
    public final View o;
    public final View p;
    public final Button q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final ldy0 u;
    public final Bitmap v;
    public final Bitmap w;
    public final Bitmap x;
    public final Bitmap y;
    public final Bitmap z;

    public nuy0(tjz0 tjz0Var, gdy0 gdy0Var, phz0 phz0Var, View view, riz0 riz0Var, Context context) {
        super(context);
        this.A = new s8z0(new mlh0(this, 11));
        this.P = new y9z0();
        this.Q = false;
        this.g = phz0Var;
        this.L = view;
        this.f = gdy0Var;
        this.e = tjz0Var;
        this.c = riz0Var;
        int i = riz0Var.a.get(riz0.j);
        this.F = i;
        int i2 = riz0.V;
        SparseIntArray sparseIntArray = riz0Var.a;
        int i3 = sparseIntArray.get(i2);
        this.I = sparseIntArray.get(riz0.T);
        this.J = sparseIntArray.get(riz0.H);
        this.K = sparseIntArray.get(riz0.W);
        this.G = sparseIntArray.get(riz0.Y);
        auy0 auy0Var = new auy0(context);
        this.d = auy0Var;
        auy0Var.setVisibility(8);
        auy0Var.setOnClickListener(this);
        auy0Var.setPadding(i);
        ixy0 ixy0Var = new ixy0(context);
        this.h = ixy0Var;
        ixy0Var.setVisibility(8);
        ixy0Var.setOnClickListener(this);
        c1z0.k(ixy0Var, -2013265920, -1, -1, sparseIntArray.get(riz0.e), sparseIntArray.get(riz0.f));
        Button button = new Button(context);
        this.i = button;
        button.setTextColor(-1);
        button.setLines(sparseIntArray.get(riz0.g));
        button.setTextSize(1, sparseIntArray.get(riz0.h));
        button.setMaxWidth(sparseIntArray.get(riz0.d));
        button.setOnClickListener(this);
        button.setBackgroundColor(0);
        button.setIncludeFontPadding(false);
        int i4 = sparseIntArray.get(riz0.i);
        this.B = i4;
        this.C = sparseIntArray.get(riz0.m);
        this.D = sparseIntArray.get(riz0.n);
        int i5 = sparseIntArray.get(riz0.r);
        this.E = i5;
        this.O = sparseIntArray.get(riz0.o);
        this.H = sparseIntArray.get(riz0.p);
        r5z0 r5z0Var = new r5z0(context, null);
        this.l = r5z0Var;
        r5z0Var.setFixedHeight(i5);
        this.x = nhz0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCy8fw79+rQAAAhVJREFUeNrt2y9IXlEYx3H3ooIiiCAIC4JgMRgsCyaLwWaxLK0srZhWVtYWVtYWlpYMNsvK0sKKRTANBivDIIggIiLiZ+URDncHFgzbznN+8d77nvPwvec99zz/xsa6uv4oPMWjzADgK55kBnCvj3icGQBc4hWmsgK41w/sZAPwswLiC9ayAJjGa1wNrt/hAxaaBlBcW8ReZTVc4CUmmwZQ3FvHYQXEd2w3DyDuj/AMJxUQn7HaNIDiuRm8wfUAwi3eY75pAMXzS9ivrIZz7GKiaQDF7zZwVAHxDVvNAyj2h+c4rYD4hJWmARRjzOItbir7wzvMNQ2gGGsZB5XVcIYXGG8aQDHmJo4rII6x2TyAGHc83vpZBcQBlpsGUIw/F/vA7QDCTewbs00DKOZZiS/DUKfxJRk1DaCYbyvOCkMdYaN5ADHnRJwazysg9rHUNIBi7vnwI4b7w3X4HTNNAyhsWA3PcqiT8ERHTQMobNmOWMNQh1hvHkDYMxlRp4sKiD0sNg2gsGsh4pB3AwhXEbecbhpAYd9aRKZVItgPT+v96wAKO3ciVzHUw9J6/wuAsHUqslaXFRC/pfVGY139L9A3wf4Z7AehfhTuzlB3h3tApIfE/jqAtEHRtGHx1ImRtKmxtMnRtOnx1AUSaUtk0hZJpS2TS10ombZUNm2xdPpy+d4w0VtmetNU2ra51I2TuVtnuxrWL/YiKQ6CN9uRAAAAAElFTkSuQmCC");
        this.y = nhz0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjM59gfMOgAAA59JREFUeNrtmkloFEEUhl/N6KgxriiJOHEXF4gENYlgRFA8uyAoCNGggl68CCJ6EQx6cCFqUFzABQQRMYh4EfSi4IJbiFERQVxRgxuRMWri5yE1UBY9yWh6Znq6+z+96a6ZV/8/tbz3qkRChAgRwiMAFgJngWgQyVcDHXTiFKCCRH4Df6MFKAkK+W0W+VfAxCAQV8A+i/wTIB4E8lHgpEX+LjA8COQHAM8t8o3ATKC338kXA59IjXbgEVAPLAb6+k2AHRbhVrrGV+AwMNVPIpx3INncjRi/gTPAWL+IcMIieBGIAXFgGXAU+OggRALY7ItIEdhvkTsNRIz3MWCp3h1sXAGK/RAHnLKIHUzRdgnwwmr7Epjsh3jggkWsNkXbQuC4Q8g8Ld9F6ANctYht7KL9GiNpAnib94ujDo5uaUIdwMo00uafhghNQL98F2EYcA9YlGb75daoOeqHnSHyj+23WyLMC1oRJQpct7LJXkETYSrwyxBhlQQNwAFrFKigCTDK2hXmBnEUnDMEOBZEARYaArwLogAF1jRIq4YQ8YsASqmEiNw2HpUHSgCNB4Y9KYgCPDXs8UEU4LNhF6bzhW7DRmCEiFTqjx+VUtc8LECrYfd3RQA9lxq03SgiZR4WIGbYv9yaAt8Me5DHp8DAFP3ukQDvDTvu8WxrnGG/dUUApdQrEUkYU2a8hwWYnGJH6PEu0GzYczwaCSoRqTIeNbkpwFXDnu/Rf79URJKnyz9E5Kab6i4wYuxvQKEHR8BO8+DE7R+PAu8MB6s9Rj4GvDH6tzYTTvZaVZeIhwSoMfr2HRiUCSd21aXGI+T7WRcu6jLp7Ijh6AMw1AMCmKXxtozeLgOKgC+Gw4ZcFiCB2fpWSRLbsuF0nXUYsSlH5EfqE+IknmblSo0+1m6wRKjOMvnB+jzQHPpl2ezAEOCx0YEOYH2WfMct8rlZkIES4LXVkXqgTwZ9Vjn43JrLFXgC8Mzq0H2g0mU/BTrSa7d8bfHCPlwE3HC41XWyp9fbdIS3Tt8fxprzq7wUivYGdmnithCXgRXpxgw67K4A9ljhdxKPgVK3+q5cFqJcRA6JyAyn1zpFfaBz9RZdtYnpStNonc/PEpEhDt9vE5FaEdmtlPrh2YoEEAEWpbje9j9o1aNrhOQbgOlAncNC2R0SwCVgZaZTb5VFMUpEpEJEpojIGBEZLJ21+zbpLGe3iMgTEXkoIneUUj8lRIgQIUKECJFJ/AEepzU1TSID5QAAAABJRU5ErkJggg==");
        this.z = nhz0.a(420, "iVBORw0KGgoAAAANSUhEUgAAAEAAAABACAYAAACqaXHeAAAABmJLR0QA/wD/AP+gvaeTAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAB3RJTUUH4AMXCjITNKc0rQAAAJFJREFUeNrt2tENgCAMQEEwLuD+QzpC3cBURWLsvV+JNRfhi9YkSSpbP3sYETF0WO89s27m3KX6H1AeYL2wdrs5Y3/4ja/OTZ8B2f074h0z5zoDAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/lr6rvDoK+xfmWsLNEmSVLUD47EiX/OuE8UAAAAASUVORK5CYII=");
        this.v = nhz0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAdVBMVEUAAAAAAAAgICDf398QEBDv7+/Pz8+fn58gICAQEBDe3t5AQEBwcHDv7+9/f3/f398wMDCAgIBgYGCQkJDAwMC/v7/Pz8+fn59QUFBAQECvr69QUFCPj4+/v79wcHBvb29gYGBfX1++vr6urq6Ojo5hYWH///+8blWlAAAAJnRSTlOAAJDviPfnzyAQ3qC478DfmICvx9/fz59QQK+oj79wb2Bfvq6OsPCmZBAAAAJhSURBVEjHndbXYuIwEAXQiSQXueAGtmkhJNn7/5+4I8JmbJAWw33iQYex7FGhN0/s9jT0FTjVcXfavvlC92o8lpil3J0fQ9s4FXdtrYij8qKLXeUhDUFhm8LQLKp1tknDcKyY5eRJnQDZOQDtwcOkrAa+rQ+mPaKC/pMiQpbew7SCVgEiRUWSuNjQg5hYJP26hBYkYTmFluvRosTo7QQeoM0yaDS+BX4gUrQwKsJ4hW6CRfBF6ruvgsxeYROcYB4BdJs1mh+YAoEHXQEemKO0FzgEvoRJAKbkL8mwQh3okygnhv6SxK80DkxPKxI4Lzky3KH1Ty8x9AM14mQ/f7GfDEso//SIfiEwWwEGpaUtYhke4Ro3vX+QU//hCdfTxtvSOzrpYIkigS6mm3ZXh3faSddEN8PlUTet+9vNL2wx0BH5ZFAAuhmbSEbW6KmCegTJFGC0kkZRyGRMEHIYbXi0ngxdCA0i9/sViNdggQ3ViCdDl72cFdBSO385PeqFn0NjL+vjkwa0DxsgcidDBz3p8t3ilktuWi7U5Ho/hWoV3TW5LWGWLKuN1COFktfjEcXDhayT2fHXYsdwxJo82evw1hHjzNCWyAObld57YY3ssss1WD+3PSYYHJSSCzdkBaQOSknfRD1QX48ALpk9eeikF8gZnzvmzi8erIfpUd4vP8ozO7s8ZK9dHpx8+roi8skLksjHV7I+DV0C42DRfA0cbODa+ZEBSR1i2Ri+6KYNuGp7U9YUzMpGygmc0CFztivyi1Z128UQ5oPywF+3l/njKEygL9vT12cGTtUPp631DfkLyeFPR/ZOiKIAAAAASUVORK5CYII=");
        this.w = nhz0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAclBMVEUAAAAAAAAgICDf39+goKAgICAQEBDe3t7Pz88QEBDv7+9wcHBAQEDf39+AgIDv7+/AwMCQkJDPz8+/v7+vr69gYGCfn5+Pj49fX19QUFBAQEAwMDBQUFDu7u5/f39/f39wcHBvb2+/v78wMDCvr6////9R0hTPAAAAJXRSTlOAAJDvzyAQ3ueI97ig34Dv38fPv6+vn49fUECYqO7Av3Bv35fYiozA+AAAAjJJREFUSMe91um2mjAUBeBDGMOkjDJoe63d7/+KTbyxpzZJgXat7j8i8nkICUkocCRZ7mNbQaXq+vsSuEK2mrsT3nLqp22Y1FplzbAKUhFl0WS68hj7ILNvhaS3iEHbOvbDuVKsJEfWCEgnD0wuzOyIELgkLhi3yAv6Q4ocaWzDuEIoPISLsiR2maSNyIwl/XQR7Uj0lAwTVY92JUOb/AIvCOU+KENcGE7IBe2MyDEbqBtYeB9kaPUK0sTA2tvAMgesk2fUnzAGhNt9ARywxC15wtHTEzICvhpoldSwwuoZJ3lJBlolFZyQeZoXCjLQKjkr2GNwNy+S5IEFOgVPEO7mEfmgVPdKCzK+PIeJbp4fUoaFPtDwCOYIYihfXx5k0uCDeh41+dvlfBSGwvzx1ZwdMFKHki9yH0VQ0nx8ZkVLFcQGNIQdkUCqf9mEGrHTAXZBLdn9Fxgh/P4mgb9/OC3WLdhY3VGioxHD8QFQoN8z5IR89TvxkPMN8vC6NciTE+TR10rgFlDQoTj6Ig/oFZxxJkeuoX/qyDApqO61dEmh5NUJV6TPWa7G+dj0GGHUkEvunJAFEGvIJZ0NtWFolgBVMj246MQGBvOxZW7694U1SNr9S3mavG0e0uObh5c8vF1heXCDxHJ7S9bGvk1g5i1anq1NIGdKgejhY+ns3+jGNYBs+K2sLBQ71UnggEzHVNumKJ9aPIYmAzMH5Ez9DRytupkZQ1eWe9+l2lTteF+UsvMDBKFIvMRHIr8AAAAASUVORK5CYII=");
        whz0 whz0Var = new whz0(context);
        this.j = whz0Var;
        ProgressBar progressBar = new ProgressBar(context, null, R.attr.progressBarStyleLarge);
        this.m = progressBar;
        progressBar.setVisibility(8);
        View view2 = new View(context);
        this.n = view2;
        view2.setBackgroundColor(-1728053248);
        view2.setVisibility(8);
        View view3 = new View(context);
        this.p = view3;
        View view4 = new View(context);
        this.o = view4;
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setTextSize(1, sparseIntArray.get(riz0.s));
        textView.setTextColor(-1);
        textView.setMaxLines(sparseIntArray.get(riz0.t));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity(17);
        textView.setIncludeFontPadding(false);
        TextView textView2 = new TextView(context);
        this.s = textView2;
        textView2.setTextSize(1, sparseIntArray.get(riz0.u));
        textView2.setTextColor(-1);
        textView2.setMaxLines(sparseIntArray.get(riz0.v));
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setIncludeFontPadding(false);
        Button button2 = new Button(context);
        this.q = button2;
        button2.setLines(1);
        button2.setTextSize(1, sparseIntArray.get(riz0.w));
        button2.setEllipsize(truncateAt);
        button2.setIncludeFontPadding(false);
        button2.setMinimumWidth(i3);
        button2.setPadding(i4, 0, i4, 0);
        TextView textView3 = new TextView(context);
        this.t = textView3;
        textView3.setPadding(sparseIntArray.get(riz0.y), 0, 0, 0);
        textView3.setTextColor(-1);
        textView3.setMaxLines(sparseIntArray.get(riz0.B));
        textView3.setIncludeFontPadding(false);
        textView3.setTextSize(1, sparseIntArray.get(riz0.X));
        ldy0 ldy0Var = new ldy0(context);
        this.u = ldy0Var;
        auy0 auy0Var2 = new auy0(context);
        this.b = auy0Var2;
        auy0Var2.setPadding(i);
        whz0 whz0Var2 = new whz0(context);
        this.k = whz0Var2;
        setContentDescription("ad_view");
        c1z0.n(this, "ad_view");
        textView.setContentDescription("title");
        c1z0.n(textView, "title");
        textView2.setContentDescription("description");
        c1z0.n(textView2, "description");
        whz0Var.setContentDescription("image");
        c1z0.n(whz0Var, "image");
        button2.setContentDescription(X3.i.G0);
        c1z0.n(button2, X3.i.G0);
        auy0Var.setContentDescription("dismiss");
        c1z0.n(auy0Var, "dismiss");
        ixy0Var.setContentDescription("play");
        c1z0.n(ixy0Var, "play");
        whz0Var2.setContentDescription("ads_logo");
        c1z0.n(whz0Var2, "ads_logo");
        view2.setContentDescription("media_dim");
        c1z0.n(view2, "media_dim");
        view4.setContentDescription("top_dim");
        c1z0.n(view4, "top_dim");
        view3.setContentDescription("bot_dim");
        c1z0.n(view3, "bot_dim");
        textView3.setContentDescription("age_bordering");
        c1z0.n(textView3, "age_bordering");
        r5z0Var.setContentDescription("ad_choices");
        c1z0.n(r5z0Var, "ad_choices");
        c1z0.n(auy0Var2, "sound_button");
        if (view != null) {
            addView(view);
        }
        addView(whz0Var);
        addView(view2);
        addView(view3);
        addView(view4);
        addView(tjz0Var);
        addView(auy0Var);
        addView(textView);
        addView(textView2);
        addView(button2);
        addView(textView3);
        addView(whz0Var2);
        addView(r5z0Var);
        addView(ldy0Var);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickArea(@NonNull k6z0 k6z0Var) {
        s8z0 s8z0Var = this.A;
        setOnTouchListener(s8z0Var);
        Button button = this.q;
        button.setOnTouchListener(s8z0Var);
        TextView textView = this.r;
        textView.setOnTouchListener(s8z0Var);
        TextView textView2 = this.t;
        textView2.setOnTouchListener(s8z0Var);
        TextView textView3 = this.s;
        textView3.setOnTouchListener(s8z0Var);
        whz0 whz0Var = this.j;
        whz0Var.setOnTouchListener(s8z0Var);
        boolean z = k6z0Var.m;
        boolean z2 = k6z0Var.g;
        if (z) {
            setOnClickListener(this);
            button.setOnClickListener(this);
            textView.setOnClickListener(this);
            textView2.setOnClickListener(this);
            textView3.setOnClickListener(this);
            whz0Var.setOnClickListener(this);
            return;
        }
        setOnClickListener(k6z0Var.l ? this : null);
        button.setEnabled(z2);
        button.setOnClickListener(z2 ? this : null);
        textView.setOnClickListener(k6z0Var.a ? this : null);
        textView2.setOnClickListener((k6z0Var.h || k6z0Var.i) ? this : null);
        textView3.setOnClickListener(k6z0Var.b ? this : null);
        whz0Var.setOnClickListener(k6z0Var.d ? this : null);
    }

    private void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        boolean z = k6z0Var.m;
        boolean z2 = k6z0Var.g;
        Button button = this.q;
        if (z) {
            setOnClickListener(this);
            button.setOnClickListener(this);
            return;
        }
        setOnClickListener(k6z0Var.l ? this : null);
        button.setEnabled(z2);
        button.setOnClickListener(z2 ? this : null);
        this.r.setOnClickListener(k6z0Var.a ? this : null);
        this.t.setOnClickListener((k6z0Var.h || k6z0Var.i) ? this : null);
        this.s.setOnClickListener(k6z0Var.b ? this : null);
        this.j.setOnClickListener(k6z0Var.d ? this : null);
    }

    public final void a(int i, String str) {
        ixy0 ixy0Var = this.h;
        ixy0Var.setVisibility(0);
        if (i == 1) {
            ixy0Var.setImageBitmap(this.z);
        } else if (i == 2) {
            ixy0Var.setImageBitmap(this.y);
        } else {
            ixy0Var.setImageBitmap(this.x);
        }
        Button button = this.i;
        if (str == null) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
            button.setText(str);
        }
    }

    public final void b(boolean z) {
        this.j.setVisibility(z ? 0 : 4);
    }

    public final boolean c(int i) {
        View view = this.L;
        return ((double) c1z0.e(view != null ? view.getMeasuredWidth() : 0, this.j.getMeasuredWidth())) * 1.6d <= ((double) i);
    }

    public final void d(boolean z) {
        this.n.setVisibility(z ? 0 : 8);
    }

    public final void e(boolean z) {
        this.m.setVisibility(z ? 0 : 8);
    }

    public final void f() {
        this.h.setVisibility(8);
        this.i.setVisibility(8);
    }

    @NonNull
    public View getCloseButton() {
        return this.d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = this.Q;
        r5z0 r5z0Var = this.l;
        whz0 whz0Var = this.k;
        View view2 = this.n;
        View view3 = this.L;
        Button button = this.i;
        ixy0 ixy0Var = this.h;
        auy0 auy0Var = this.b;
        auy0 auy0Var2 = this.d;
        phz0 phz0Var = this.g;
        Button button2 = this.q;
        int i = 2;
        if (!z) {
            if (view == auy0Var2) {
                vez0 vez0Var = phz0Var.l;
                if (vez0Var != null) {
                    vez0Var.g.j();
                    vez0Var.d();
                    vez0Var.d.destroy();
                    vez0Var.e.b();
                }
                phz0Var.o();
                phz0Var.d.f(phz0Var.b);
                return;
            }
            if (view == auy0Var) {
                phz0Var.k();
                return;
            }
            if (view == ixy0Var || view == button) {
                phz0Var.j();
                return;
            }
            if (view == view3) {
                phz0Var.b(new y9z0());
                return;
            }
            if (view == view2) {
                phz0Var.g(new y9z0());
                return;
            }
            if (view == whz0Var) {
                phz0Var.o();
                String str = phz0Var.b.f0;
                if (str == null) {
                    return;
                }
                nuy0 nuy0Var = phz0Var.e;
                nuy0Var.getClass();
                de.L(str, null, null, null, nuy0Var.getContext());
                return;
            }
            if (view == r5z0Var) {
                phz0Var.f();
                return;
            } else if (view == button2 && button2.isEnabled()) {
                phz0Var.a(null, 2, new akz0());
                return;
            } else {
                phz0Var.a(null, 1, new akz0());
                return;
            }
        }
        if (view == auy0Var2) {
            vez0 vez0Var2 = phz0Var.l;
            if (vez0Var2 != null) {
                vez0Var2.g.j();
                vez0Var2.d();
                vez0Var2.d.destroy();
                vez0Var2.e.b();
            }
            phz0Var.o();
            phz0Var.d.f(phz0Var.b);
            return;
        }
        if (view == auy0Var) {
            phz0Var.k();
            return;
        }
        if (view == ixy0Var || view == button) {
            phz0Var.j();
            return;
        }
        if (view == view3) {
            phz0Var.b(this.P);
            return;
        }
        if (view == view2) {
            phz0Var.g(this.P);
            return;
        }
        if (view == whz0Var) {
            phz0Var.o();
            String str2 = phz0Var.b.f0;
            if (str2 == null) {
                return;
            }
            nuy0 nuy0Var2 = phz0Var.e;
            nuy0Var2.getClass();
            de.L(str2, null, null, null, nuy0Var2.getContext());
            return;
        }
        if (view == r5z0Var) {
            phz0Var.f();
            return;
        }
        if (view == button2 && button2.isEnabled()) {
            phz0Var.a(null, 2, new viy0(64, this.P));
            return;
        }
        if (view == button2) {
            i = 64;
        } else if (view == this.r) {
            i = 1;
        } else if (view == this.t) {
            i = 128;
        } else if (view != this.s) {
            i = view == this.j ? 8 : 2048;
        }
        phz0Var.a(null, 1, new viy0(i, this.P));
    }

    public void setBackgroundImage(@Nullable kiw kiwVar) {
        this.j.setImageData(kiwVar);
    }

    public void setBanner(@NonNull tez0 tez0Var) {
        oly0 oly0Var = tez0Var.a0;
        setBackgroundColor(oly0Var.d);
        int i = oly0Var.e;
        int i2 = oly0Var.f;
        TextView textView = this.r;
        textView.setTextColor(i2);
        TextView textView2 = this.s;
        textView2.setTextColor(i);
        this.Q = tez0Var.T.c;
        boolean isEmpty = TextUtils.isEmpty(tez0Var.h);
        TextView textView3 = this.t;
        if (isEmpty && TextUtils.isEmpty(tez0Var.r)) {
            textView3.setVisibility(8);
        } else {
            String str = tez0Var.r;
            if (!TextUtils.isEmpty(tez0Var.h) && !TextUtils.isEmpty(tez0Var.r)) {
                str = fo8.a(str, " ");
            }
            StringBuilder e = fw3.e(str);
            e.append(tez0Var.h);
            String sb = e.toString();
            textView3.setVisibility(0);
            textView3.setText(sb);
        }
        kiw kiwVar = tez0Var.U;
        auy0 auy0Var = this.d;
        if (kiwVar == null || kiwVar.a() == null) {
            Bitmap a = ywy0.a(this.c.a.get(riz0.r));
            if (a != null) {
                auy0Var.a(a, false);
            }
        } else {
            auy0Var.a(kiwVar.a(), true);
        }
        int i3 = oly0Var.a;
        int i4 = oly0Var.b;
        int i5 = this.O;
        Button button = this.q;
        c1z0.o(button, i3, i4, i5);
        button.setTextColor(oly0Var.e);
        button.setText(tez0Var.n());
        textView.setText(tez0Var.f);
        textView2.setText(tez0Var.c);
        kiw kiwVar2 = tez0Var.e0;
        if (kiwVar2 != null && kiwVar2.a() != null) {
            whz0 whz0Var = this.k;
            whz0Var.setImageData(kiwVar2);
            whz0Var.setOnClickListener(this);
        }
        wty0 wty0Var = tez0Var.L;
        r5z0 r5z0Var = this.l;
        if (wty0Var != null) {
            r5z0Var.setImageBitmap(wty0Var.a.a());
            r5z0Var.setOnClickListener(this);
        } else {
            r5z0Var.setVisibility(8);
        }
        if (this.Q) {
            setClickArea(tez0Var.v);
        } else {
            setClickAreaLegacy(tez0Var.v);
        }
    }

    public void setPanelColor(int i) {
        this.p.setBackgroundColor(i);
        this.o.setBackgroundColor(i);
    }

    public void setSoundState(boolean z) {
        auy0 auy0Var = this.b;
        if (z) {
            auy0Var.a(this.v, false);
            auy0Var.setContentDescription("sound_on");
        } else {
            auy0Var.a(this.w, false);
            auy0Var.setContentDescription("sound_off");
        }
    }
}
