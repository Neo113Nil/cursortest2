package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import xsna.kkz0;
import xsna.v1z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class ydz0 extends RelativeLayout implements ojz0 {
    public static final int z = View.generateViewId();
    public final bj50 b;
    public final oe40 c;
    public final whz0 d;
    public final acz0 e;
    public final uhz0 f;
    public final lly0 g;
    public final wvy0 h;
    public final ldy0 i;
    public final c1z0 j;
    public final wvy0 k;
    public final r5z0 l;
    public final Bitmap m;
    public final Bitmap n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public kkz0.a t;
    public float u;
    public v1z0.a v;
    public final s8z0 w;
    public z9z0 x;
    public boolean y;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface b {
        void a(View view, dhz0 dhz0Var);
    }

    public ydz0(Context context, bfz0 bfz0Var) {
        super(context);
        this.x = new y9z0();
        this.y = false;
        boolean z2 = (getContext().getResources().getConfiguration().screenLayout & 15) >= 3;
        c1z0 c1z0Var = new c1z0(context);
        this.j = c1z0Var;
        whz0 whz0Var = new whz0(context);
        this.d = whz0Var;
        Context context2 = bfz0Var.b;
        acz0 acz0Var = new acz0(context2, c1z0Var, z2);
        this.e = acz0Var;
        uhz0 uhz0Var = new uhz0(context2, c1z0Var, z2, bfz0Var.c);
        this.f = uhz0Var;
        int i = z;
        uhz0Var.setId(i);
        wvy0 wvy0Var = new wvy0(context);
        this.h = wvy0Var;
        ldy0 ldy0Var = new ldy0(context);
        this.i = ldy0Var;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, i);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(14, -1);
        lly0 lly0Var = new lly0(context, c1z0Var);
        this.g = lly0Var;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12, -1);
        lly0Var.setLayoutParams(layoutParams3);
        wvy0 wvy0Var2 = new wvy0(context);
        this.k = wvy0Var2;
        this.m = nhz0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAdVBMVEUAAAAAAAAgICDf398QEBDv7+/Pz8+fn58gICAQEBDe3t5AQEBwcHDv7+9/f3/f398wMDCAgIBgYGCQkJDAwMC/v7/Pz8+fn59QUFBAQECvr69QUFCPj4+/v79wcHBvb29gYGBfX1++vr6urq6Ojo5hYWH///+8blWlAAAAJnRSTlOAAJDviPfnzyAQ3qC478DfmICvx9/fz59QQK+oj79wb2Bfvq6OsPCmZBAAAAJhSURBVEjHndbXYuIwEAXQiSQXueAGtmkhJNn7/5+4I8JmbJAWw33iQYex7FGhN0/s9jT0FTjVcXfavvlC92o8lpil3J0fQ9s4FXdtrYij8qKLXeUhDUFhm8LQLKp1tknDcKyY5eRJnQDZOQDtwcOkrAa+rQ+mPaKC/pMiQpbew7SCVgEiRUWSuNjQg5hYJP26hBYkYTmFluvRosTo7QQeoM0yaDS+BX4gUrQwKsJ4hW6CRfBF6ruvgsxeYROcYB4BdJs1mh+YAoEHXQEemKO0FzgEvoRJAKbkL8mwQh3okygnhv6SxK80DkxPKxI4Lzky3KH1Ty8x9AM14mQ/f7GfDEso//SIfiEwWwEGpaUtYhke4Ro3vX+QU//hCdfTxtvSOzrpYIkigS6mm3ZXh3faSddEN8PlUTet+9vNL2wx0BH5ZFAAuhmbSEbW6KmCegTJFGC0kkZRyGRMEHIYbXi0ngxdCA0i9/sViNdggQ3ViCdDl72cFdBSO385PeqFn0NjL+vjkwa0DxsgcidDBz3p8t3ilktuWi7U5Ho/hWoV3TW5LWGWLKuN1COFktfjEcXDhayT2fHXYsdwxJo82evw1hHjzNCWyAObld57YY3ssss1WD+3PSYYHJSSCzdkBaQOSknfRD1QX48ALpk9eeikF8gZnzvmzi8erIfpUd4vP8ozO7s8ZK9dHpx8+roi8skLksjHV7I+DV0C42DRfA0cbODa+ZEBSR1i2Ri+6KYNuGp7U9YUzMpGygmc0CFztivyi1Z128UQ5oPywF+3l/njKEygL9vT12cGTtUPp631DfkLyeFPR/ZOiKIAAAAASUVORK5CYII=");
        this.n = nhz0.a(320, "iVBORw0KGgoAAAANSUhEUgAAADgAAAA4CAMAAACfWMssAAAAclBMVEUAAAAAAAAgICDf39+goKAgICAQEBDe3t7Pz88QEBDv7+9wcHBAQEDf39+AgIDv7+/AwMCQkJDPz8+/v7+vr69gYGCfn5+Pj49fX19QUFBAQEAwMDBQUFDu7u5/f39/f39wcHBvb2+/v78wMDCvr6////9R0hTPAAAAJXRSTlOAAJDvzyAQ3ueI97ig34Dv38fPv6+vn49fUECYqO7Av3Bv35fYiozA+AAAAjJJREFUSMe91um2mjAUBeBDGMOkjDJoe63d7/+KTbyxpzZJgXat7j8i8nkICUkocCRZ7mNbQaXq+vsSuEK2mrsT3nLqp22Y1FplzbAKUhFl0WS68hj7ILNvhaS3iEHbOvbDuVKsJEfWCEgnD0wuzOyIELgkLhi3yAv6Q4ocaWzDuEIoPISLsiR2maSNyIwl/XQR7Uj0lAwTVY92JUOb/AIvCOU+KENcGE7IBe2MyDEbqBtYeB9kaPUK0sTA2tvAMgesk2fUnzAGhNt9ARywxC15wtHTEzICvhpoldSwwuoZJ3lJBlolFZyQeZoXCjLQKjkr2GNwNy+S5IEFOgVPEO7mEfmgVPdKCzK+PIeJbp4fUoaFPtDwCOYIYihfXx5k0uCDeh41+dvlfBSGwvzx1ZwdMFKHki9yH0VQ0nx8ZkVLFcQGNIQdkUCqf9mEGrHTAXZBLdn9Fxgh/P4mgb9/OC3WLdhY3VGioxHD8QFQoN8z5IR89TvxkPMN8vC6NciTE+TR10rgFlDQoTj6Ig/oFZxxJkeuoX/qyDApqO61dEmh5NUJV6TPWa7G+dj0GGHUkEvunJAFEGvIJZ0NtWFolgBVMj246MQGBvOxZW7694U1SNr9S3mavG0e0uObh5c8vF1heXCDxHJ7S9bGvk1g5i1anq1NIGdKgejhY+ns3+jGNYBs+K2sLBQ71UnggEzHVNumKJ9aPIYmAzMH5Ez9DRytupkZQ1eWe9+l2lTteF+UsvMDBKFIvMRHIr8AAAAASUVORK5CYII=");
        this.b = new bj50(this, 26);
        this.c = new oe40(this, 22);
        this.o = c1z0Var.b(64);
        this.p = c1z0Var.b(20);
        r5z0 r5z0Var = new r5z0(context, null);
        this.l = r5z0Var;
        float f = 28;
        int b2 = c1z0Var.b(f);
        this.s = b2;
        r5z0Var.setFixedHeight(b2);
        c1z0.n(whz0Var, "icon_image");
        c1z0.n(wvy0Var2, "sound_button");
        c1z0.n(acz0Var, "vertical_view");
        c1z0.n(uhz0Var, "media_view");
        c1z0.n(lly0Var, "panel_view");
        c1z0.n(wvy0Var, "close_button");
        c1z0.n(ldy0Var, "progress_wheel");
        addView(lly0Var, 0);
        addView(whz0Var, 0);
        addView(acz0Var, 0, layoutParams);
        addView(uhz0Var, 0, layoutParams2);
        addView(wvy0Var2);
        addView(r5z0Var);
        addView(wvy0Var);
        addView(ldy0Var);
        this.q = c1z0Var.b(f);
        this.r = c1z0Var.b(10);
        this.w = new s8z0(new u730(this, 24));
    }

    @Override // xsna.ojz0
    public final void a() {
        uhz0 uhz0Var = this.f;
        uhz0Var.b.setVisibility(8);
        uhz0Var.h.setVisibility(8);
    }

    @Override // xsna.ojz0
    public final boolean b() {
        return this.f.g();
    }

    @Override // xsna.ojz0
    public final void c(boolean z2) {
        View[] viewArr = {this.k};
        lly0 lly0Var = this.g;
        if (lly0Var.getVisibility() == 0) {
            lly0Var.a(300, viewArr);
        }
        this.f.a(z2);
    }

    @Override // xsna.ojz0
    public final void destroy() {
        this.f.b();
    }

    @Override // xsna.kkz0
    @NonNull
    public View getCloseButton() {
        return this.h;
    }

    @Override // xsna.ojz0
    @NonNull
    public uhz0 getPromoMediaView() {
        return this.f;
    }

    @Override // xsna.ojz0
    public final boolean isPlaying() {
        return this.f.h();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        wvy0 wvy0Var = this.h;
        wvy0Var.layout(i3 - wvy0Var.getMeasuredWidth(), 0, i3, wvy0Var.getMeasuredHeight());
        ldy0 ldy0Var = this.i;
        int measuredWidth = ldy0Var.getMeasuredWidth();
        int i5 = this.r;
        ldy0Var.layout(i5, i5, measuredWidth + i5, ldy0Var.getMeasuredHeight() + i5);
        int left = wvy0Var.getLeft();
        r5z0 r5z0Var = this.l;
        c1z0.j(r5z0Var, left - r5z0Var.getMeasuredWidth(), wvy0Var.getTop(), wvy0Var.getLeft(), wvy0Var.getBottom());
        acz0 acz0Var = this.e;
        whz0 whz0Var = this.d;
        lly0 lly0Var = this.g;
        wvy0 wvy0Var2 = this.k;
        uhz0 uhz0Var = this.f;
        if (i4 > i3) {
            if (wvy0Var2.getTranslationY() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                wvy0Var2.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            setBackgroundColor(-1);
            int measuredWidth2 = (i3 - uhz0Var.getMeasuredWidth()) / 2;
            uhz0Var.layout(measuredWidth2, 0, uhz0Var.getMeasuredWidth() + measuredWidth2, uhz0Var.getMeasuredHeight());
            acz0Var.layout(0, uhz0Var.getBottom(), i3, i4);
            int measuredHeight = uhz0Var.getMeasuredHeight();
            int i6 = this.p;
            int bottom = measuredHeight != 0 ? uhz0Var.getBottom() - (whz0Var.getMeasuredHeight() / 2) : i6;
            whz0Var.layout(i6, bottom, whz0Var.getMeasuredWidth() + i6, whz0Var.getMeasuredHeight() + bottom);
            lly0Var.layout(0, 0, 0, 0);
            wvy0Var2.layout(i3 - wvy0Var2.getMeasuredWidth(), uhz0Var.getBottom() - wvy0Var2.getMeasuredHeight(), i3, uhz0Var.getBottom());
            return;
        }
        setBackgroundColor(-16777216);
        int measuredWidth3 = (i3 - uhz0Var.getMeasuredWidth()) / 2;
        int measuredHeight2 = (i4 - uhz0Var.getMeasuredHeight()) / 2;
        uhz0Var.layout(measuredWidth3, measuredHeight2, uhz0Var.getMeasuredWidth() + measuredWidth3, uhz0Var.getMeasuredHeight() + measuredHeight2);
        whz0Var.layout(0, 0, 0, 0);
        acz0Var.layout(0, 0, 0, 0);
        lly0Var.layout(0, i4 - lly0Var.getMeasuredHeight(), i3, i4);
        wvy0Var2.layout(i3 - wvy0Var2.getMeasuredWidth(), lly0Var.getTop() - wvy0Var2.getMeasuredHeight(), i3, lly0Var.getTop());
        if (uhz0Var.h()) {
            View[] viewArr = {wvy0Var2};
            if (lly0Var.getVisibility() == 0) {
                lly0Var.a(0, viewArr);
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.k.measure(i, i2);
        this.h.measure(i, i2);
        int i3 = this.q;
        this.i.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        r5z0 r5z0Var = this.l;
        int i4 = this.s;
        c1z0.i(r5z0Var, i4, i4, 1073741824);
        lly0 lly0Var = this.g;
        uhz0 uhz0Var = this.f;
        if (size2 > size) {
            uhz0Var.measure(makeMeasureSpec, makeMeasureSpec2);
            this.e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - uhz0Var.getMeasuredHeight(), Integer.MIN_VALUE));
            this.d.measure(View.MeasureSpec.makeMeasureSpec(this.o, Integer.MIN_VALUE), makeMeasureSpec2);
            lly0Var.setVisibility(8);
        } else {
            lly0Var.setVisibility(0);
            uhz0Var.measure(makeMeasureSpec, makeMeasureSpec2);
            lly0Var.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), makeMeasureSpec2);
        }
        setMeasuredDimension(i, i2);
    }

    @Override // xsna.ojz0
    public final void pause() {
        this.g.c(this.k);
        this.f.i();
    }

    @Override // xsna.ojz0
    public final void resume() {
        View[] viewArr = {this.k};
        lly0 lly0Var = this.g;
        if (lly0Var.getVisibility() == 0) {
            lly0Var.a(300, viewArr);
        }
        uhz0 uhz0Var = this.f;
        uhz0Var.d.setVisibility(8);
        loy0 loy0Var = uhz0Var.l;
        if (loy0Var == null || uhz0Var.m == null) {
            return;
        }
        loy0Var.resume();
        uhz0Var.b.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025b  */
    @Override // xsna.kkz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setBanner(@NonNull tez0 tez0Var) {
        boolean z2;
        boolean z3;
        boolean z4;
        c1z0 c1z0Var;
        float f;
        vvy0 vvy0Var;
        vvy0 vvy0Var2;
        int i;
        int b2;
        kiw kiwVar;
        Bitmap a2;
        kiw kiwVar2;
        int i2;
        int i3;
        RelativeLayout.LayoutParams layoutParams;
        wvy0 wvy0Var;
        wty0 wty0Var;
        int i4;
        int i5;
        c1z0 c1z0Var2 = this.j;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.q, c1z0Var2.b(28));
        layoutParams2.addRule(9);
        float f2 = 10;
        layoutParams2.topMargin = c1z0Var2.b(f2);
        layoutParams2.leftMargin = c1z0Var2.b(f2);
        ldy0 ldy0Var = this.i;
        ldy0Var.setLayoutParams(layoutParams2);
        ldy0Var.setVisibility(8);
        this.y = tez0Var.T.c;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(11);
        wvy0 wvy0Var2 = this.h;
        wvy0Var2.setVisibility(8);
        wvy0Var2.setLayoutParams(layoutParams3);
        lgz0 lgz0Var = tez0Var.c0;
        wvy0 wvy0Var3 = this.k;
        if (lgz0Var == null) {
            wvy0Var3.setVisibility(8);
        }
        Point q = c1z0.q(getContext());
        if (q.x + q.y >= 1280) {
            lgz0 lgz0Var2 = tez0Var.c0;
            if (lgz0Var2 != null) {
                sgz0 sgz0Var = (sgz0) lgz0Var2.v0;
                if (sgz0Var != null) {
                    i4 = sgz0Var.c;
                    i5 = sgz0Var.b;
                    if (i4 > 0 || i5 <= 0 || (i4 <= i5 && i5 / i4 >= 1.4f)) {
                        z2 = false;
                    }
                }
                i5 = 0;
                i4 = 0;
                if (i4 > 0) {
                }
                z2 = false;
            } else {
                kiw kiwVar3 = tez0Var.t;
                if (kiwVar3 != null) {
                    i4 = kiwVar3.c;
                    i5 = kiwVar3.b;
                    if (i4 > 0) {
                    }
                    z2 = false;
                }
                i5 = 0;
                i4 = 0;
                if (i4 > 0) {
                }
                z2 = false;
            }
            lly0 lly0Var = this.g;
            lly0Var.setBackgroundColor(1711276032);
            TextView textView = lly0Var.b;
            textView.setTextColor(-2236963);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            TextView textView2 = lly0Var.h;
            textView2.setTextColor(-6710887);
            textView2.setVisibility(8);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            gradientDrawable.setStroke(1, -3355444);
            TextView textView3 = lly0Var.d;
            c1z0 c1z0Var3 = lly0Var.k;
            float f3 = 4;
            z3 = z2;
            textView3.setPadding(c1z0Var3.b(f3), c1z0Var3.b(f3), c1z0Var3.b(f3), c1z0Var3.b(f3));
            textView3.setBackground(gradientDrawable);
            textView3.setTextSize(2, 12.0f);
            textView3.setTextColor(-3355444);
            textView3.setVisibility(8);
            LinearLayout linearLayout = lly0Var.e;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.setVisibility(8);
            TextView textView4 = lly0Var.g;
            textView4.setTextColor(-6710887);
            textView4.setGravity(16);
            textView4.setTextSize(2, 14.0f);
            Button button = lly0Var.i;
            float f4 = 15;
            button.setPadding(c1z0Var3.b(f4), 0, c1z0Var3.b(f4), 0);
            float f5 = 100;
            button.setMinimumWidth(c1z0Var3.b(f5));
            button.setTransformationMethod(null);
            button.setTextSize(2, 22.0f);
            button.setMaxEms(10);
            button.setSingleLine();
            button.setEllipsize(truncateAt);
            kdy0 kdy0Var = lly0Var.c;
            x9z0 rightBorderedView = kdy0Var.getRightBorderedView();
            rightBorderedView.a(-7829368, 0);
            float f6 = 2;
            rightBorderedView.setPadding(c1z0Var3.b(f6), 0, 0, 0);
            rightBorderedView.setTextColor(-1118482);
            float f7 = 3;
            rightBorderedView.a(-1118482, c1z0Var3.b(f7));
            rightBorderedView.setBackgroundColor(1711276032);
            qpk0 qpk0Var = lly0Var.f;
            float f8 = 12;
            qpk0Var.setStarSize(c1z0Var3.b(f8));
            linearLayout.addView(qpk0Var);
            linearLayout.addView(textView4);
            linearLayout.setVisibility(8);
            textView2.setVisibility(8);
            lly0Var.addView(kdy0Var);
            lly0Var.addView(linearLayout);
            lly0Var.addView(textView2);
            lly0Var.addView(textView);
            lly0Var.addView(textView3);
            lly0Var.addView(lly0Var.j);
            lly0Var.addView(button);
            lly0Var.setBanner(tez0Var);
            int i6 = q.x;
            int i7 = q.y;
            acz0 acz0Var = this.e;
            z4 = acz0Var.g;
            vvy0 vvy0Var3 = acz0Var.e;
            x9z0 x9z0Var = acz0Var.d;
            Button button2 = acz0Var.c;
            c1z0 c1z0Var4 = acz0Var.f;
            int max = Math.max(i7, i6) / 8;
            q8z0 q8z0Var = acz0Var.b;
            qpk0 qpk0Var2 = q8z0Var.h;
            TextView textView5 = q8z0Var.i;
            TextView textView6 = q8z0Var.g;
            LinearLayout linearLayout2 = q8z0Var.e;
            LinearLayout linearLayout3 = q8z0Var.f;
            linearLayout3.setOrientation(1);
            linearLayout3.setGravity(1);
            TextView textView7 = q8z0Var.b;
            textView7.setGravity(1);
            textView7.setTextColor(-16777216);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams4.gravity = 1;
            c1z0 c1z0Var5 = q8z0Var.j;
            float f9 = 8;
            layoutParams4.leftMargin = c1z0Var5.b(f9);
            layoutParams4.rightMargin = c1z0Var5.b(f9);
            textView7.setLayoutParams(layoutParams4);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams5.gravity = 1;
            TextView textView8 = q8z0Var.c;
            textView8.setLayoutParams(layoutParams5);
            textView8.setLines(1);
            textView8.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            TextView textView9 = q8z0Var.d;
            textView9.setGravity(1);
            textView9.setTextColor(-16777216);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
            if (z3) {
                c1z0Var = c1z0Var4;
                f = f3;
                vvy0Var = vvy0Var3;
                textView9.setTextSize(2, 16.0f);
                layoutParams6.topMargin = c1z0Var5.b(f9);
                float f10 = 16;
                layoutParams6.leftMargin = c1z0Var5.b(f10);
                layoutParams6.rightMargin = c1z0Var5.b(f10);
            } else {
                c1z0Var = c1z0Var4;
                textView9.setTextSize(2, 12.0f);
                textView9.setLines(2);
                textView9.setEllipsize(truncateAt);
                layoutParams6.topMargin = 0;
                f = f3;
                layoutParams6.leftMargin = c1z0Var5.b(f);
                layoutParams6.rightMargin = c1z0Var5.b(f);
                vvy0Var = vvy0Var3;
            }
            layoutParams6.gravity = 1;
            textView9.setLayoutParams(layoutParams6);
            linearLayout2.setOrientation(0);
            FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams7.gravity = 1;
            linearLayout2.setLayoutParams(layoutParams7);
            FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(c1z0Var5.b(73), c1z0Var5.b(f8));
            layoutParams8.topMargin = c1z0Var5.b(f);
            layoutParams8.rightMargin = c1z0Var5.b(f);
            qpk0Var2.setLayoutParams(layoutParams8);
            textView5.setTextColor(-6710887);
            textView5.setTextSize(2, 14.0f);
            textView6.setTextColor(-6710887);
            textView6.setGravity(1);
            FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams9.gravity = 1;
            if (z3) {
                float f11 = 16;
                layoutParams9.leftMargin = c1z0Var5.b(f11);
                layoutParams9.rightMargin = c1z0Var5.b(f11);
            } else {
                layoutParams9.leftMargin = c1z0Var5.b(f);
                layoutParams9.rightMargin = c1z0Var5.b(f);
            }
            layoutParams9.gravity = 1;
            textView6.setLayoutParams(layoutParams9);
            FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams10.gravity = 17;
            q8z0Var.addView(linearLayout3, layoutParams10);
            linearLayout3.addView(textView7);
            linearLayout3.addView(textView8);
            linearLayout3.addView(linearLayout2);
            linearLayout3.addView(textView9);
            linearLayout3.addView(textView6);
            linearLayout2.addView(qpk0Var2);
            linearLayout2.addView(textView5);
            vvy0Var.getClass();
            vvy0Var2 = vvy0Var;
            ImageView imageView = vvy0Var2.d;
            ImageView imageView2 = vvy0Var2.c;
            RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams11.addRule(12, -1);
            RelativeLayout relativeLayout = vvy0Var2.b;
            relativeLayout.setLayoutParams(layoutParams11);
            vvy0Var2.getContext();
            imageView2.setImageBitmap(nhz0.a(320, "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"));
            relativeLayout.addView(imageView2);
            relativeLayout.addView(imageView);
            vvy0Var2.addView(relativeLayout);
            View view = new View(acz0Var.getContext());
            view.setBackgroundColor(-5592406);
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, 1));
            int i8 = acz0.k;
            vvy0Var2.setId(i8);
            c1z0 c1z0Var6 = vvy0Var2.e;
            int i9 = max / 3;
            if (vvy0Var2.f) {
                i9 = max / 5;
            }
            RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-2, i9);
            if (z3) {
                float f12 = 24;
                float f13 = 16;
                layoutParams12.setMargins(c1z0Var6.b(f12), c1z0Var6.b(f13), c1z0Var6.b(f12), c1z0Var6.b(f13));
            } else {
                float f14 = 24;
                layoutParams12.setMargins(c1z0Var6.b(f14), c1z0Var6.b(f), c1z0Var6.b(f14), c1z0Var6.b(f9));
            }
            layoutParams12.addRule(15, -1);
            layoutParams12.addRule(20);
            imageView.setScaleType(ImageView.ScaleType.FIT_START);
            imageView.setLayoutParams(layoutParams12);
            RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, i9);
            if (z3) {
                float f15 = 24;
                float f16 = 16;
                layoutParams13.setMargins(c1z0Var6.b(f15), c1z0Var6.b(f16), c1z0Var6.b(f15), c1z0Var6.b(f16));
            } else {
                layoutParams13.setMargins(c1z0Var6.b(f9), c1z0Var6.b(f), c1z0Var6.b(f9), c1z0Var6.b(f9));
            }
            layoutParams13.addRule(15, -1);
            layoutParams13.addRule(21);
            imageView2.setScaleType(ImageView.ScaleType.FIT_END);
            imageView2.setLayoutParams(layoutParams13);
            imageView2.setOnClickListener(vvy0Var2.g);
            c1z0 c1z0Var7 = c1z0Var;
            button2.setPadding(c1z0Var7.b(f4), 0, c1z0Var7.b(f4), 0);
            button2.setMinimumWidth(c1z0Var7.b(f5));
            button2.setTransformationMethod(null);
            button2.setSingleLine();
            button2.setEllipsize(truncateAt);
            x9z0Var.a(-7829368, 0);
            x9z0Var.setPadding(c1z0Var7.b(f6), 0, 0, 0);
            x9z0Var.setTextColor(-1118482);
            x9z0Var.setMaxEms(5);
            x9z0Var.a(-1118482, c1z0Var7.b(f7));
            x9z0Var.setBackgroundColor(1711276032);
            int i10 = acz0.l;
            q8z0Var.setId(i10);
            if (z3) {
                float f17 = 16;
                q8z0Var.setPadding(c1z0Var7.b(f17), c1z0Var7.b(f17), c1z0Var7.b(f17), c1z0Var7.b(f17));
            } else {
                q8z0Var.setPadding(c1z0Var7.b(f), c1z0Var7.b(f), c1z0Var7.b(f), c1z0Var7.b(f));
            }
            RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams14.addRule(2, i8);
            q8z0Var.setLayoutParams(layoutParams14);
            RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, -2);
            if (z3) {
                i = 16;
                b2 = c1z0Var7.b(16);
            } else {
                b2 = c1z0Var7.b(f9);
                i = 16;
            }
            float f18 = i;
            layoutParams15.setMargins(c1z0Var7.b(f18), b2, c1z0Var7.b(f18), c1z0Var7.b(f));
            layoutParams15.addRule(21, -1);
            x9z0Var.setLayoutParams(layoutParams15);
            RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-2, !z4 ? c1z0Var7.b(64) : c1z0Var7.b(52));
            layoutParams16.addRule(14, -1);
            layoutParams16.addRule(8, i10);
            if (z3) {
                layoutParams16.bottomMargin = (-c1z0Var7.b(52)) / 2;
            } else {
                layoutParams16.bottomMargin = (int) ((-c1z0Var7.b(52)) / 1.5d);
            }
            button2.setLayoutParams(layoutParams16);
            RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, max);
            layoutParams17.addRule(12, -1);
            vvy0Var2.setLayoutParams(layoutParams17);
            acz0Var.addView(q8z0Var);
            acz0Var.addView(view);
            acz0Var.addView(x9z0Var);
            acz0Var.addView(vvy0Var2);
            acz0Var.addView(button2);
            acz0Var.setClickable(true);
            if (z4) {
                button2.setTextSize(2, 22.0f);
            } else {
                button2.setTextSize(2, 32.0f);
            }
            acz0Var.setBanner(tez0Var);
            uhz0 uhz0Var = this.f;
            uhz0Var.f();
            uhz0Var.d(tez0Var, 0);
            kiwVar = tez0Var.U;
            if (kiwVar != null || kiwVar.a() == null) {
                a2 = ywy0.a(this.s);
                if (a2 != null) {
                    wvy0Var2.a(a2, false);
                }
            } else {
                wvy0Var2.a(kiwVar.a(), true);
            }
            kiwVar2 = tez0Var.u;
            if (kiwVar2 == null) {
                i3 = kiwVar2.b;
                i2 = kiwVar2.c;
            } else {
                i2 = 0;
                i3 = 0;
            }
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = c1z0Var2.b(f);
            if (i3 != 0 && i2 != 0) {
                int b3 = (int) (c1z0Var2.b(64) * (i2 / i3));
                layoutParams.width = this.o;
                layoutParams.height = b3;
                if (!z3) {
                    layoutParams.bottomMargin = (-b3) / 2;
                }
            }
            layoutParams.addRule(8, z);
            layoutParams.setMarginStart(c1z0Var2.b(20));
            whz0 whz0Var = this.d;
            whz0Var.setLayoutParams(layoutParams);
            if (kiwVar2 != null) {
                whz0Var.setImageBitmap(kiwVar2.a());
            }
            if (lgz0Var != null && lgz0Var.h0) {
                c(true);
                post(new tsk(this, 14));
            }
            if (lgz0Var == null) {
                this.u = lgz0Var.D;
                if (lgz0Var.g0) {
                    wvy0Var = wvy0Var3;
                    wvy0Var.a(this.n, false);
                    wvy0Var.setContentDescription("sound_off");
                } else {
                    wvy0Var = wvy0Var3;
                    wvy0Var.a(this.m, false);
                    wvy0Var.setContentDescription("sound_on");
                }
            } else {
                wvy0Var = wvy0Var3;
            }
            wvy0Var.setOnClickListener(new naj(this, 10));
            wty0Var = tez0Var.L;
            r5z0 r5z0Var = this.l;
            if (wty0Var != null) {
                r5z0Var.setVisibility(8);
                return;
            } else {
                r5z0Var.setImageBitmap(wty0Var.a.a());
                r5z0Var.setOnClickListener(new ep6(this, 11));
                return;
            }
        }
        z2 = true;
        lly0 lly0Var2 = this.g;
        lly0Var2.setBackgroundColor(1711276032);
        TextView textView10 = lly0Var2.b;
        textView10.setTextColor(-2236963);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        textView10.setEllipsize(truncateAt2);
        TextView textView22 = lly0Var2.h;
        textView22.setTextColor(-6710887);
        textView22.setVisibility(8);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        gradientDrawable2.setStroke(1, -3355444);
        TextView textView32 = lly0Var2.d;
        c1z0 c1z0Var32 = lly0Var2.k;
        float f32 = 4;
        z3 = z2;
        textView32.setPadding(c1z0Var32.b(f32), c1z0Var32.b(f32), c1z0Var32.b(f32), c1z0Var32.b(f32));
        textView32.setBackground(gradientDrawable2);
        textView32.setTextSize(2, 12.0f);
        textView32.setTextColor(-3355444);
        textView32.setVisibility(8);
        LinearLayout linearLayout4 = lly0Var2.e;
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        linearLayout4.setVisibility(8);
        TextView textView42 = lly0Var2.g;
        textView42.setTextColor(-6710887);
        textView42.setGravity(16);
        textView42.setTextSize(2, 14.0f);
        Button button3 = lly0Var2.i;
        float f42 = 15;
        button3.setPadding(c1z0Var32.b(f42), 0, c1z0Var32.b(f42), 0);
        float f52 = 100;
        button3.setMinimumWidth(c1z0Var32.b(f52));
        button3.setTransformationMethod(null);
        button3.setTextSize(2, 22.0f);
        button3.setMaxEms(10);
        button3.setSingleLine();
        button3.setEllipsize(truncateAt2);
        kdy0 kdy0Var2 = lly0Var2.c;
        x9z0 rightBorderedView2 = kdy0Var2.getRightBorderedView();
        rightBorderedView2.a(-7829368, 0);
        float f62 = 2;
        rightBorderedView2.setPadding(c1z0Var32.b(f62), 0, 0, 0);
        rightBorderedView2.setTextColor(-1118482);
        float f72 = 3;
        rightBorderedView2.a(-1118482, c1z0Var32.b(f72));
        rightBorderedView2.setBackgroundColor(1711276032);
        qpk0 qpk0Var3 = lly0Var2.f;
        float f82 = 12;
        qpk0Var3.setStarSize(c1z0Var32.b(f82));
        linearLayout4.addView(qpk0Var3);
        linearLayout4.addView(textView42);
        linearLayout4.setVisibility(8);
        textView22.setVisibility(8);
        lly0Var2.addView(kdy0Var2);
        lly0Var2.addView(linearLayout4);
        lly0Var2.addView(textView22);
        lly0Var2.addView(textView10);
        lly0Var2.addView(textView32);
        lly0Var2.addView(lly0Var2.j);
        lly0Var2.addView(button3);
        lly0Var2.setBanner(tez0Var);
        int i62 = q.x;
        int i72 = q.y;
        acz0 acz0Var2 = this.e;
        z4 = acz0Var2.g;
        vvy0 vvy0Var32 = acz0Var2.e;
        x9z0 x9z0Var2 = acz0Var2.d;
        Button button22 = acz0Var2.c;
        c1z0 c1z0Var42 = acz0Var2.f;
        int max2 = Math.max(i72, i62) / 8;
        q8z0 q8z0Var2 = acz0Var2.b;
        qpk0 qpk0Var22 = q8z0Var2.h;
        TextView textView52 = q8z0Var2.i;
        TextView textView62 = q8z0Var2.g;
        LinearLayout linearLayout22 = q8z0Var2.e;
        LinearLayout linearLayout32 = q8z0Var2.f;
        linearLayout32.setOrientation(1);
        linearLayout32.setGravity(1);
        TextView textView72 = q8z0Var2.b;
        textView72.setGravity(1);
        textView72.setTextColor(-16777216);
        FrameLayout.LayoutParams layoutParams42 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams42.gravity = 1;
        c1z0 c1z0Var52 = q8z0Var2.j;
        float f92 = 8;
        layoutParams42.leftMargin = c1z0Var52.b(f92);
        layoutParams42.rightMargin = c1z0Var52.b(f92);
        textView72.setLayoutParams(layoutParams42);
        FrameLayout.LayoutParams layoutParams52 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams52.gravity = 1;
        TextView textView82 = q8z0Var2.c;
        textView82.setLayoutParams(layoutParams52);
        textView82.setLines(1);
        textView82.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        TextView textView92 = q8z0Var2.d;
        textView92.setGravity(1);
        textView92.setTextColor(-16777216);
        FrameLayout.LayoutParams layoutParams62 = new FrameLayout.LayoutParams(-2, -2);
        if (z3) {
        }
        layoutParams62.gravity = 1;
        textView92.setLayoutParams(layoutParams62);
        linearLayout22.setOrientation(0);
        FrameLayout.LayoutParams layoutParams72 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams72.gravity = 1;
        linearLayout22.setLayoutParams(layoutParams72);
        FrameLayout.LayoutParams layoutParams82 = new FrameLayout.LayoutParams(c1z0Var52.b(73), c1z0Var52.b(f82));
        layoutParams82.topMargin = c1z0Var52.b(f);
        layoutParams82.rightMargin = c1z0Var52.b(f);
        qpk0Var22.setLayoutParams(layoutParams82);
        textView52.setTextColor(-6710887);
        textView52.setTextSize(2, 14.0f);
        textView62.setTextColor(-6710887);
        textView62.setGravity(1);
        FrameLayout.LayoutParams layoutParams92 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams92.gravity = 1;
        if (z3) {
        }
        layoutParams92.gravity = 1;
        textView62.setLayoutParams(layoutParams92);
        FrameLayout.LayoutParams layoutParams102 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams102.gravity = 17;
        q8z0Var2.addView(linearLayout32, layoutParams102);
        linearLayout32.addView(textView72);
        linearLayout32.addView(textView82);
        linearLayout32.addView(linearLayout22);
        linearLayout32.addView(textView92);
        linearLayout32.addView(textView62);
        linearLayout22.addView(qpk0Var22);
        linearLayout22.addView(textView52);
        vvy0Var.getClass();
        vvy0Var2 = vvy0Var;
        ImageView imageView3 = vvy0Var2.d;
        ImageView imageView22 = vvy0Var2.c;
        RelativeLayout.LayoutParams layoutParams112 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams112.addRule(12, -1);
        RelativeLayout relativeLayout2 = vvy0Var2.b;
        relativeLayout2.setLayoutParams(layoutParams112);
        vvy0Var2.getContext();
        imageView22.setImageBitmap(nhz0.a(320, "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"));
        relativeLayout2.addView(imageView22);
        relativeLayout2.addView(imageView3);
        vvy0Var2.addView(relativeLayout2);
        View view2 = new View(acz0Var2.getContext());
        view2.setBackgroundColor(-5592406);
        view2.setLayoutParams(new RelativeLayout.LayoutParams(-1, 1));
        int i82 = acz0.k;
        vvy0Var2.setId(i82);
        c1z0 c1z0Var62 = vvy0Var2.e;
        int i92 = max2 / 3;
        if (vvy0Var2.f) {
        }
        RelativeLayout.LayoutParams layoutParams122 = new RelativeLayout.LayoutParams(-2, i92);
        if (z3) {
        }
        layoutParams122.addRule(15, -1);
        layoutParams122.addRule(20);
        imageView3.setScaleType(ImageView.ScaleType.FIT_START);
        imageView3.setLayoutParams(layoutParams122);
        RelativeLayout.LayoutParams layoutParams132 = new RelativeLayout.LayoutParams(-2, i92);
        if (z3) {
        }
        layoutParams132.addRule(15, -1);
        layoutParams132.addRule(21);
        imageView22.setScaleType(ImageView.ScaleType.FIT_END);
        imageView22.setLayoutParams(layoutParams132);
        imageView22.setOnClickListener(vvy0Var2.g);
        c1z0 c1z0Var72 = c1z0Var;
        button22.setPadding(c1z0Var72.b(f42), 0, c1z0Var72.b(f42), 0);
        button22.setMinimumWidth(c1z0Var72.b(f52));
        button22.setTransformationMethod(null);
        button22.setSingleLine();
        button22.setEllipsize(truncateAt2);
        x9z0Var2.a(-7829368, 0);
        x9z0Var2.setPadding(c1z0Var72.b(f62), 0, 0, 0);
        x9z0Var2.setTextColor(-1118482);
        x9z0Var2.setMaxEms(5);
        x9z0Var2.a(-1118482, c1z0Var72.b(f72));
        x9z0Var2.setBackgroundColor(1711276032);
        int i102 = acz0.l;
        q8z0Var2.setId(i102);
        if (z3) {
        }
        RelativeLayout.LayoutParams layoutParams142 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams142.addRule(2, i82);
        q8z0Var2.setLayoutParams(layoutParams142);
        RelativeLayout.LayoutParams layoutParams152 = new RelativeLayout.LayoutParams(-2, -2);
        if (z3) {
        }
        float f182 = i;
        layoutParams152.setMargins(c1z0Var72.b(f182), b2, c1z0Var72.b(f182), c1z0Var72.b(f));
        layoutParams152.addRule(21, -1);
        x9z0Var2.setLayoutParams(layoutParams152);
        RelativeLayout.LayoutParams layoutParams162 = new RelativeLayout.LayoutParams(-2, !z4 ? c1z0Var72.b(64) : c1z0Var72.b(52));
        layoutParams162.addRule(14, -1);
        layoutParams162.addRule(8, i102);
        if (z3) {
        }
        button22.setLayoutParams(layoutParams162);
        RelativeLayout.LayoutParams layoutParams172 = new RelativeLayout.LayoutParams(-1, max2);
        layoutParams172.addRule(12, -1);
        vvy0Var2.setLayoutParams(layoutParams172);
        acz0Var2.addView(q8z0Var2);
        acz0Var2.addView(view2);
        acz0Var2.addView(x9z0Var2);
        acz0Var2.addView(vvy0Var2);
        acz0Var2.addView(button22);
        acz0Var2.setClickable(true);
        if (z4) {
        }
        acz0Var2.setBanner(tez0Var);
        uhz0 uhz0Var2 = this.f;
        uhz0Var2.f();
        uhz0Var2.d(tez0Var, 0);
        kiwVar = tez0Var.U;
        if (kiwVar != null) {
        }
        a2 = ywy0.a(this.s);
        if (a2 != null) {
        }
        kiwVar2 = tez0Var.u;
        if (kiwVar2 == null) {
        }
        layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = c1z0Var2.b(f);
        if (i3 != 0) {
            int b32 = (int) (c1z0Var2.b(64) * (i2 / i3));
            layoutParams.width = this.o;
            layoutParams.height = b32;
            if (!z3) {
            }
        }
        layoutParams.addRule(8, z);
        layoutParams.setMarginStart(c1z0Var2.b(20));
        whz0 whz0Var2 = this.d;
        whz0Var2.setLayoutParams(layoutParams);
        if (kiwVar2 != null) {
        }
        if (lgz0Var != null) {
            c(true);
            post(new tsk(this, 14));
        }
        if (lgz0Var == null) {
        }
        wvy0Var.setOnClickListener(new naj(this, 10));
        wty0Var = tez0Var.L;
        r5z0 r5z0Var2 = this.l;
        if (wty0Var != null) {
        }
    }

    @Override // xsna.kkz0
    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickArea(@NonNull k6z0 k6z0Var) {
        if (this.y) {
            setClickAreaActual(k6z0Var);
        } else {
            setClickAreaLegacy(k6z0Var);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickAreaActual(@NonNull k6z0 k6z0Var) {
        StringBuilder sb = new StringBuilder("PromoDefaultStyleView: Apply click area ");
        int i = k6z0Var.o;
        boolean z2 = k6z0Var.m;
        sb.append(i);
        sb.append(" to view");
        gu8.c(null, sb.toString());
        boolean z3 = k6z0Var.c;
        s8z0 s8z0Var = this.w;
        whz0 whz0Var = this.d;
        if (z3 || z2) {
            whz0Var.setOnTouchListener(s8z0Var);
            whz0Var.setOnClickListener(new k6p(this, 8));
        } else {
            whz0Var.setOnClickListener(null);
        }
        uhz0 uhz0Var = this.f;
        if (z2 || k6z0Var.d) {
            uhz0Var.getImageView().setOnTouchListener(s8z0Var);
            uhz0Var.getImageView().setOnClickListener(new bn1(this, 15));
        }
        if (z2 || k6z0Var.n) {
            uhz0Var.getClickableLayout().setOnTouchListener(s8z0Var);
            uhz0Var.getClickableLayout().setOnClickListener(new v9b(this, 15));
        } else {
            uhz0Var.getClickableLayout().setOnClickListener(uhz0Var.e);
        }
        acz0 acz0Var = this.e;
        bj50 bj50Var = this.b;
        acz0Var.a(k6z0Var, bj50Var);
        this.g.b(k6z0Var, bj50Var);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        StringBuilder sb = new StringBuilder("PromoDefaultStyleView: Apply click area ");
        int i = k6z0Var.o;
        boolean z2 = k6z0Var.m;
        sb.append(i);
        sb.append(" to view");
        gu8.c(null, sb.toString());
        qp4 qp4Var = new qp4(this, 14);
        this.d.setOnClickListener((k6z0Var.c || z2) ? qp4Var : null);
        uhz0 uhz0Var = this.f;
        uhz0Var.getImageView().setOnClickListener((z2 || k6z0Var.d) ? qp4Var : null);
        if (z2 || k6z0Var.n) {
            uhz0Var.getClickableLayout().setOnClickListener(qp4Var);
        } else {
            uhz0Var.getClickableLayout().setOnClickListener(uhz0Var.e);
        }
        acz0 acz0Var = this.e;
        bj50 bj50Var = this.b;
        acz0Var.a(k6z0Var, bj50Var);
        this.g.b(k6z0Var, bj50Var);
    }

    @Override // xsna.kkz0
    public void setInterstitialPromoViewListener(@Nullable kkz0.a aVar) {
        this.t = aVar;
    }

    @Override // xsna.ojz0
    public void setMediaListener(@Nullable v1z0.a aVar) {
        this.v = aVar;
        uhz0 uhz0Var = this.f;
        uhz0Var.setInterstitialPromoViewListener(aVar);
        uhz0Var.d.setOnClickListener(uhz0Var.e);
    }

    @Override // xsna.ojz0
    public void setTimeChanged(float f) {
        ldy0 ldy0Var = this.i;
        ldy0Var.setVisibility(0);
        float f2 = this.u;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ldy0Var.setProgress(f / f2);
        }
        ldy0Var.setDigit((int) ((this.u - f) + 1.0f));
    }

    @Override // xsna.ojz0
    public final void b(boolean z2) {
        wvy0 wvy0Var = this.k;
        if (z2) {
            wvy0Var.a(this.n, false);
            wvy0Var.setContentDescription("sound_off");
        } else {
            wvy0Var.a(this.m, false);
            wvy0Var.setContentDescription("sound_on");
        }
    }

    @Override // xsna.ojz0
    public final void a(tez0 tez0Var) {
        this.k.setVisibility(8);
        this.h.setVisibility(0);
        a(false);
        uhz0 uhz0Var = this.f;
        uhz0Var.b();
        uhz0Var.c(tez0Var);
    }

    @Override // xsna.kkz0
    public final void c() {
        this.h.setVisibility(0);
    }

    @Override // xsna.ojz0
    public final void a(boolean z2) {
        this.i.setVisibility(8);
        this.g.c(this.k);
        this.f.e(z2);
    }

    @Override // xsna.ojz0
    public final void a(int i) {
        loy0 loy0Var = this.f.l;
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

    @Override // xsna.ojz0
    public final void d() {
    }

    @Override // xsna.kkz0
    @NonNull
    public View getView() {
        return this;
    }
}
