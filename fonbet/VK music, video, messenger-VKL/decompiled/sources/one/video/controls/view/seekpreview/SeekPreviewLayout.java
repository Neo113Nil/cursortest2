package one.video.controls.view.seekpreview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import one.video.controls.view.OptimizedTimeView;
import one.video.controls.view.seekpreview.SeekPreviewImageView;
import one.video.controls.view.seekpreview.SeekPreviewLayout;
import xsna.dgn;
import xsna.in80;
import xsna.k9q0;
import xsna.o7j;
import xsna.owo0;
import xsna.r3i0;
import xsna.sox;
import xsna.u3i0;
import xsna.x5r0;
import xsna.y3j;
import xsna.zjw;

/* compiled from: SeekPreviewLayout.kt */
/* loaded from: classes8.dex */
public final class SeekPreviewLayout extends ViewGroup implements r3i0 {
    public static final int i = (int) x5r0.a(160, 1);
    public static final int j = (int) x5r0.a(135, 1);
    public owo0 b;
    public sox.a c;
    public long d;
    public long e;
    public View f;
    public final in80 g;
    public final y3j h;

    /* compiled from: SeekPreviewLayout.kt */
    public static final class a {
        public static final void a(int i, View view) {
            int i2 = SeekPreviewLayout.i;
            dgn.b(view, i, 0, i, view.getMeasuredWidth());
        }
    }

    public SeekPreviewLayout(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // xsna.r3i0
    public final void a(u3i0 u3i0Var) {
        this.h.c(u3i0Var);
    }

    public final int b(View view, int i2, float f) {
        in80 in80Var = this.g;
        if (in80Var.b.getVisibility() != 0) {
            return c(view, f);
        }
        return Math.min(Math.max(getPaddingLeft(), ((in80Var.b.getMeasuredWidth() / 2) + i2) - (view.getMeasuredWidth() / 2)), (getMeasuredWidth() - view.getMeasuredWidth()) - getPaddingRight());
    }

    public final int c(View view, float f) {
        return Math.min(Math.max(getPaddingLeft(), (int) (((((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) * f) + getPaddingLeft()) - (view.getMeasuredWidth() / 2))), (getMeasuredWidth() - view.getMeasuredWidth()) - getPaddingRight());
    }

    public View getAnchorView() {
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.d != -1) {
            long j2 = this.e;
            if (j2 == -1 || j2 == 0) {
                return;
            }
            View anchorView = getAnchorView();
            int top = anchorView != null ? anchorView.getTop() : getMeasuredHeight();
            in80 in80Var = this.g;
            OptimizedTimeView optimizedTimeView = in80Var.c;
            OptimizedTimeView optimizedTimeView2 = in80Var.c;
            SeekPreviewImageView seekPreviewImageView = in80Var.b;
            AppCompatTextView appCompatTextView = in80Var.d;
            if (optimizedTimeView.getVisibility() == 0) {
                top = (top - optimizedTimeView2.getMeasuredHeight()) - x5r0.b();
                a.a(top, optimizedTimeView2);
            }
            if (appCompatTextView.getVisibility() == 0) {
                top = (top - appCompatTextView.getMeasuredHeight()) - ((Number) x5r0.c.getValue()).intValue();
                a.a(top, appCompatTextView);
            }
            if (seekPreviewImageView.getVisibility() == 0) {
                a.a((top - seekPreviewImageView.getMeasuredHeight()) - x5r0.c(), seekPreviewImageView);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        measureChildren(i2, i3);
    }

    public void setAnchorView(View view) {
        this.f = view;
    }

    public final void setImageLoader(zjw zjwVar) {
        this.g.b.setImageLoader(zjwVar);
    }

    public SeekPreviewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public SeekPreviewLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 8, 0);
    }

    public /* synthetic */ SeekPreviewLayout(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2, 0);
    }

    public SeekPreviewLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.d = -1L;
        this.e = -1L;
        LayoutInflater.from(context).inflate(R.layout.one_video_seek_preview_layout, this);
        int i4 = R.id.seek_preview_image;
        SeekPreviewImageView seekPreviewImageView = (SeekPreviewImageView) k9q0.j(R.id.seek_preview_image, this);
        if (seekPreviewImageView != null) {
            i4 = R.id.seek_preview_time;
            OptimizedTimeView optimizedTimeView = (OptimizedTimeView) k9q0.j(R.id.seek_preview_time, this);
            if (optimizedTimeView != null) {
                i4 = R.id.seek_preview_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.seek_preview_title, this);
                if (appCompatTextView != null) {
                    in80 in80Var = new in80(this, seekPreviewImageView, optimizedTimeView, appCompatTextView);
                    seekPreviewImageView.setVisibility(8);
                    appCompatTextView.setVisibility(8);
                    optimizedTimeView.setVisibility(8);
                    this.g = in80Var;
                    this.h = new y3j(new o7j() { // from class: xsna.t3i0
                        @Override // xsna.o7j
                        public final void accept(Object obj) {
                            u3i0 u3i0Var = (u3i0) obj;
                            int i5 = SeekPreviewLayout.j;
                            int i6 = SeekPreviewLayout.i;
                            owo0 owo0Var = u3i0Var.c;
                            sox.a aVar = u3i0Var.d;
                            boolean z = u3i0Var.b;
                            SeekPreviewLayout seekPreviewLayout = SeekPreviewLayout.this;
                            if (!z) {
                                seekPreviewLayout.setVisibility(u3i0Var.a ? 0 : 8);
                            }
                            if (seekPreviewLayout.getVisibility() == 0) {
                                sox.a aVar2 = seekPreviewLayout.c;
                                in80 in80Var2 = seekPreviewLayout.g;
                                if (!epx.f(aVar2, aVar)) {
                                    seekPreviewLayout.c = aVar;
                                    boolean z2 = aVar != null;
                                    in80Var2.d.setVisibility(z2 ? 0 : 8);
                                    if (z2) {
                                        AppCompatTextView appCompatTextView2 = in80Var2.d;
                                        sox.a aVar3 = seekPreviewLayout.c;
                                        appCompatTextView2.setText(aVar3 != null ? aVar3.c : null);
                                    }
                                    seekPreviewLayout.requestLayout();
                                }
                                if (!epx.f(seekPreviewLayout.b, owo0Var)) {
                                    seekPreviewLayout.b = owo0Var;
                                    SeekPreviewImageView seekPreviewImageView2 = in80Var2.b;
                                    seekPreviewImageView2.setTimelineImages(owo0Var);
                                    boolean z3 = owo0Var != null;
                                    seekPreviewImageView2.setVisibility(z3 ? 0 : 8);
                                    in80Var2.c.setVisibility(z3 ? 0 : 8);
                                    if (z3) {
                                        Size size = new Size(owo0Var.a, owo0Var.b);
                                        float width = size.getWidth() / size.getHeight();
                                        Size size2 = width > 1.0f ? new Size(i6, i5) : new Size(i5, i6);
                                        Size size3 = width > ((float) size2.getWidth()) / ((float) size2.getHeight()) ? new Size(size2.getWidth(), (int) (size2.getWidth() / width)) : new Size((int) (size2.getHeight() * width), size2.getHeight());
                                        ViewGroup.LayoutParams layoutParams = seekPreviewImageView2.getLayoutParams();
                                        layoutParams.width = size3.getWidth();
                                        layoutParams.height = size3.getHeight();
                                        seekPreviewImageView2.setLayoutParams(layoutParams);
                                    }
                                    seekPreviewLayout.requestLayout();
                                }
                                long j2 = seekPreviewLayout.e;
                                long j3 = u3i0Var.f;
                                if (j2 != j3) {
                                    seekPreviewLayout.e = j3;
                                    if (j3 != -1) {
                                        in80Var2.b.setDuration(j3);
                                    }
                                    seekPreviewLayout.requestLayout();
                                }
                                long j4 = seekPreviewLayout.d;
                                long j5 = u3i0Var.e;
                                if (j4 != j5) {
                                    seekPreviewLayout.d = j5;
                                    if (j5 != -1) {
                                        SeekPreviewImageView seekPreviewImageView3 = in80Var2.b;
                                        OptimizedTimeView optimizedTimeView2 = in80Var2.c;
                                        seekPreviewImageView3.setPosition(j5);
                                        optimizedTimeView2.b((int) (seekPreviewLayout.d / 1000));
                                        if (seekPreviewLayout.getVisibility() == 0) {
                                            long j6 = seekPreviewLayout.d;
                                            if (j6 != -1) {
                                                long j7 = seekPreviewLayout.e;
                                                if (j7 == -1 || j7 == 0) {
                                                    return;
                                                }
                                                float f = j6 / j7;
                                                SeekPreviewImageView seekPreviewImageView4 = in80Var2.b;
                                                AppCompatTextView appCompatTextView3 = in80Var2.d;
                                                int c = seekPreviewLayout.c(seekPreviewImageView4, f);
                                                if (optimizedTimeView2.getVisibility() == 0) {
                                                    optimizedTimeView2.setTranslationX(seekPreviewLayout.b(optimizedTimeView2, c, f));
                                                }
                                                if (appCompatTextView3.getVisibility() == 0) {
                                                    appCompatTextView3.setTranslationX(seekPreviewLayout.b(appCompatTextView3, c, f));
                                                }
                                                if (seekPreviewImageView4.getVisibility() == 0) {
                                                    seekPreviewImageView4.setTranslationX(c);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    });
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i4)));
    }
}
