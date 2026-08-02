package one.video.controls.view.faskseek;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import one.video.controls.view.faskseek.DownEventProcessor;
import one.video.controls.view.faskseek.FastSeekView;
import xsna.dl80;
import xsna.gv;
import xsna.k9q0;
import xsna.nb;
import xsna.o7j;
import xsna.pb;
import xsna.y3j;

/* compiled from: FastSeekView.kt */
/* loaded from: classes8.dex */
public final class FastSeekView extends ViewGroup {
    public final dl80 b;
    public a c;
    public final y3j d;
    public final one.video.controls.view.faskseek.a e;
    public final one.video.controls.view.faskseek.a f;
    public DownEventProcessor.a g;
    public final DownEventProcessor h;

    /* compiled from: FastSeekView.kt */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: FastSeekView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownEventProcessor.Side.values().length];
            try {
                iArr[DownEventProcessor.Side.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownEventProcessor.Side.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FastSeekView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final a getFastSeekListener() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = i5 / 2;
        dl80 dl80Var = this.b;
        int measuredWidth = i7 - dl80Var.b.getMeasuredWidth();
        int i8 = i6 / 2;
        int measuredHeight = i8 - (dl80Var.b.getMeasuredHeight() / 2);
        int measuredWidth2 = dl80Var.b.getMeasuredWidth() + measuredWidth;
        dl80Var.b.layout(measuredWidth, measuredHeight, measuredWidth2, dl80Var.b.getMeasuredHeight() + measuredHeight);
        int measuredWidth3 = (measuredWidth2 / 2) - (dl80Var.c.getMeasuredWidth() / 2);
        int measuredHeight2 = i8 - (dl80Var.c.getMeasuredHeight() / 2);
        dl80Var.c.layout(measuredWidth3, measuredHeight2, dl80Var.c.getMeasuredWidth() + measuredWidth3, dl80Var.c.getMeasuredHeight() + measuredHeight2);
        int measuredHeight3 = i8 - (dl80Var.e.getMeasuredHeight() / 2);
        dl80Var.e.layout(i7, measuredHeight3, dl80Var.e.getMeasuredWidth() + i7, dl80Var.e.getMeasuredHeight() + measuredHeight3);
        int measuredWidth4 = (((i5 - i7) / 2) + i7) - (dl80Var.f.getMeasuredWidth() / 2);
        int measuredHeight4 = i8 - (dl80Var.f.getMeasuredHeight() / 2);
        dl80Var.f.layout(measuredWidth4, measuredHeight4, dl80Var.f.getMeasuredWidth() + measuredWidth4, dl80Var.f.getMeasuredHeight() + measuredHeight4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        double size = View.MeasureSpec.getSize(i);
        double size2 = View.MeasureSpec.getSize(i2) / 2;
        int max = (int) (Math.max(size2 / Math.sin(3.141592653589793d - (Math.atan(size2 / (size / 4)) * 2.0d)), size / 2.0d) * 2.0d);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        dl80 dl80Var = this.b;
        dl80Var.b.measure(makeMeasureSpec, makeMeasureSpec2);
        dl80Var.e.measure(makeMeasureSpec, makeMeasureSpec2);
        measureChild(dl80Var.c, i, i2);
        measureChild(dl80Var.f, i, i2);
    }

    public final void setFastSeekListener(a aVar) {
        this.c = aVar;
    }

    public FastSeekView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public FastSeekView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ FastSeekView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public FastSeekView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.one_video_fast_seek_view, this);
        int i3 = R.id.arrow_left_1;
        AppCompatImageView appCompatImageView = (AppCompatImageView) k9q0.j(R.id.arrow_left_1, this);
        if (appCompatImageView != null) {
            i3 = R.id.arrow_left_2;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) k9q0.j(R.id.arrow_left_2, this);
            if (appCompatImageView2 != null) {
                i3 = R.id.arrow_left_3;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) k9q0.j(R.id.arrow_left_3, this);
                if (appCompatImageView3 != null) {
                    i3 = R.id.arrow_right_1;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) k9q0.j(R.id.arrow_right_1, this);
                    if (appCompatImageView4 != null) {
                        i3 = R.id.arrow_right_2;
                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) k9q0.j(R.id.arrow_right_2, this);
                        if (appCompatImageView5 != null) {
                            i3 = R.id.arrow_right_3;
                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) k9q0.j(R.id.arrow_right_3, this);
                            if (appCompatImageView6 != null) {
                                i3 = R.id.left;
                                View j = k9q0.j(R.id.left, this);
                                if (j != null) {
                                    i3 = R.id.left_arrows;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) k9q0.j(R.id.left_arrows, this);
                                    if (constraintLayout != null) {
                                        i3 = R.id.left_text;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.left_text, this);
                                        if (appCompatTextView != null) {
                                            i3 = R.id.right;
                                            View j2 = k9q0.j(R.id.right, this);
                                            if (j2 != null) {
                                                i3 = R.id.right_arrows;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) k9q0.j(R.id.right_arrows, this);
                                                if (constraintLayout2 != null) {
                                                    i3 = R.id.right_text;
                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) k9q0.j(R.id.right_text, this);
                                                    if (appCompatTextView2 != null) {
                                                        this.b = new dl80(this, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, j, constraintLayout, appCompatTextView, j2, constraintLayout2, appCompatTextView2);
                                                        this.d = new y3j(new o7j() { // from class: xsna.vlq
                                                            @Override // xsna.o7j
                                                            public final void accept(Object obj) {
                                                                wlq wlqVar = (wlq) obj;
                                                                FastSeekView fastSeekView = FastSeekView.this;
                                                                fastSeekView.b.e.setEnabled(wlqVar.a);
                                                                fastSeekView.b.b.setEnabled(wlqVar.b);
                                                            }
                                                        });
                                                        this.e = new one.video.controls.view.faskseek.a(appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatTextView, new nb(this, 15));
                                                        this.f = new one.video.controls.view.faskseek.a(appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatTextView2, new gv(this, 20));
                                                        this.h = new DownEventProcessor(j, j2, new pb(this, 18));
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
