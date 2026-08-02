package one.video.controls.view.seekpreview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import one.video.controls.view.OptimizedTimeView;
import one.video.controls.view.seekpreview.FullSeekPreviewLayout;
import xsna.dgn;
import xsna.el80;
import xsna.epx;
import xsna.k9q0;
import xsna.o7j;
import xsna.owo0;
import xsna.r3i0;
import xsna.sox;
import xsna.u3i0;
import xsna.x5r0;
import xsna.y3j;
import xsna.zjw;

/* compiled from: FullSeekPreviewLayout.kt */
/* loaded from: classes8.dex */
public final class FullSeekPreviewLayout extends FrameLayout implements r3i0 {
    public static final /* synthetic */ int j = 0;
    public final el80 b;
    public final SeekPreviewImageView c;
    public owo0 d;
    public sox.a e;
    public View f;
    public long g;
    public long h;
    public final y3j i;

    /* compiled from: FullSeekPreviewLayout.kt */
    public static final class a {
        public static final void a(int i, int i2, View view) {
            int i3 = FullSeekPreviewLayout.j;
            dgn.b(view, i2, i, i2, view.getMeasuredWidth() + i);
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            FullSeekPreviewLayout fullSeekPreviewLayout = FullSeekPreviewLayout.this;
            fullSeekPreviewLayout.b.b.setPosition(fullSeekPreviewLayout.g);
        }
    }

    public FullSeekPreviewLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static void b(FullSeekPreviewLayout fullSeekPreviewLayout, u3i0 u3i0Var) {
        owo0 owo0Var = u3i0Var.c;
        sox.a aVar = u3i0Var.d;
        if (!u3i0Var.b) {
            fullSeekPreviewLayout.setVisibility(u3i0Var.a ? 0 : 8);
        }
        if (fullSeekPreviewLayout.getVisibility() == 0) {
            sox.a aVar2 = fullSeekPreviewLayout.e;
            el80 el80Var = fullSeekPreviewLayout.b;
            if (!epx.f(aVar2, aVar)) {
                fullSeekPreviewLayout.e = aVar;
                AppCompatTextView appCompatTextView = el80Var.d;
                appCompatTextView.setVisibility(aVar != null ? 0 : 8);
                CharSequence text = appCompatTextView.getText();
                sox.a aVar3 = fullSeekPreviewLayout.e;
                if (!epx.f(text, aVar3 != null ? aVar3.c : null)) {
                    sox.a aVar4 = fullSeekPreviewLayout.e;
                    appCompatTextView.setText(aVar4 != null ? aVar4.c : null);
                }
                fullSeekPreviewLayout.requestLayout();
            }
            if (!epx.f(fullSeekPreviewLayout.d, owo0Var)) {
                fullSeekPreviewLayout.setTimelineImages(owo0Var);
                el80Var.b.setTimelineImages(fullSeekPreviewLayout.d);
                el80Var.b.setVisibility(fullSeekPreviewLayout.d != null ? 0 : 8);
                el80Var.c.setVisibility(fullSeekPreviewLayout.d != null ? 0 : 8);
                fullSeekPreviewLayout.requestLayout();
            }
            long j2 = fullSeekPreviewLayout.h;
            long j3 = u3i0Var.f;
            if (j2 != j3) {
                fullSeekPreviewLayout.h = j3;
                if (fullSeekPreviewLayout.getVisibility() == 0) {
                    long j4 = fullSeekPreviewLayout.h;
                    if (j4 != -1) {
                        el80Var.b.setDuration(j4);
                    }
                }
                fullSeekPreviewLayout.requestLayout();
            }
            long j5 = fullSeekPreviewLayout.g;
            long j6 = u3i0Var.e;
            if (j5 != j6) {
                fullSeekPreviewLayout.g = j6;
                if (j6 != -1) {
                    if (!fullSeekPreviewLayout.isLaidOut() || fullSeekPreviewLayout.isLayoutRequested()) {
                        fullSeekPreviewLayout.addOnLayoutChangeListener(fullSeekPreviewLayout.new b());
                    } else {
                        el80Var.b.setPosition(fullSeekPreviewLayout.g);
                    }
                    el80Var.c.b((int) (fullSeekPreviewLayout.g / 1000));
                }
            }
        }
    }

    private final void setTimelineImages(owo0 owo0Var) {
        this.d = owo0Var;
        el80 el80Var = this.b;
        el80Var.b.setBackgroundColor(owo0Var == null ? 0 : -16777216);
        el80Var.b.setTimelineImages(owo0Var);
    }

    @Override // xsna.r3i0
    public final void a(u3i0 u3i0Var) {
        this.i.c(u3i0Var);
    }

    public View getAnchorView() {
        return this.f;
    }

    public final View getImage() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.g <= 0 || this.h <= 0) {
            return;
        }
        el80 el80Var = this.b;
        SeekPreviewImageView seekPreviewImageView = el80Var.b;
        AppCompatTextView appCompatTextView = el80Var.d;
        OptimizedTimeView optimizedTimeView = el80Var.c;
        if (seekPreviewImageView.getVisibility() == 0) {
            a.a(0, 0, el80Var.b);
        }
        View anchorView = getAnchorView();
        int top = anchorView != null ? anchorView.getTop() : getMeasuredHeight();
        if (optimizedTimeView.getVisibility() == 0) {
            int measuredWidth = (getMeasuredWidth() - optimizedTimeView.getMeasuredWidth()) / 2;
            top = (top - optimizedTimeView.getMeasuredHeight()) - x5r0.b();
            a.a(measuredWidth, top, optimizedTimeView);
        }
        if (appCompatTextView.getVisibility() == 0) {
            a.a((getMeasuredWidth() - appCompatTextView.getMeasuredWidth()) / 2, (top - appCompatTextView.getMeasuredHeight()) - x5r0.c(), appCompatTextView);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChildren(i, i2);
    }

    public void setAnchorView(View view) {
        this.f = view;
    }

    public final void setImageLoader(zjw zjwVar) {
        this.b.b.setImageLoader(zjwVar);
    }

    public FullSeekPreviewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public FullSeekPreviewLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ FullSeekPreviewLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public FullSeekPreviewLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.one_video_full_seek_preview_layout, this);
        int i3 = R.id.seek_preview_image;
        SeekPreviewImageView seekPreviewImageView = (SeekPreviewImageView) k9q0.j(R.id.seek_preview_image, this);
        if (seekPreviewImageView != null) {
            i3 = R.id.seek_preview_time;
            OptimizedTimeView optimizedTimeView = (OptimizedTimeView) k9q0.j(R.id.seek_preview_time, this);
            if (optimizedTimeView != null) {
                i3 = R.id.seek_preview_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.seek_preview_title, this);
                if (appCompatTextView != null) {
                    this.b = new el80(this, seekPreviewImageView, optimizedTimeView, appCompatTextView);
                    this.c = seekPreviewImageView;
                    seekPreviewImageView.setShowBorder(false);
                    seekPreviewImageView.setClipToOutline(false);
                    seekPreviewImageView.setOutlineProvider(null);
                    seekPreviewImageView.setBackgroundColor(0);
                    this.g = -1L;
                    this.h = -1L;
                    this.i = new y3j(new o7j() { // from class: xsna.hws
                        @Override // xsna.o7j
                        public final void accept(Object obj) {
                            FullSeekPreviewLayout.b(FullSeekPreviewLayout.this, (u3i0) obj);
                        }
                    });
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
