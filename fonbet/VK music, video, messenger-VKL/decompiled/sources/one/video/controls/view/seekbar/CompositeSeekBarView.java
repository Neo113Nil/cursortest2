package one.video.controls.view.seekbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import com.vkontakte.android.R;
import one.video.controls.view.seekbar.CompositeSeekBarView;
import one.video.controls.view.seekbar.CustomSeekBar;
import one.video.controls.view.seekbar.ThumbSeekBarView;
import xsna.k9q0;
import xsna.nui;

/* compiled from: CompositeSeekBarView.kt */
/* loaded from: classes8.dex */
public final class CompositeSeekBarView extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public boolean b;
    public a c;
    public int d;
    public int e;
    public int f;
    public final ThumbSeekBarView g;
    public final ProgressSeekBarView h;
    public final ProgressSeekBarView i;

    /* compiled from: CompositeSeekBarView.kt */
    public interface a {
        void b();

        void c(long j, boolean z);

        void d();
    }

    /* compiled from: CompositeSeekBarView.kt */
    public final class b implements SeekBar.OnSeekBarChangeListener {
        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            a thumbListener = CompositeSeekBarView.this.getThumbListener();
            if (thumbListener != null) {
                thumbListener.c(i, z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            CompositeSeekBarView compositeSeekBarView = CompositeSeekBarView.this;
            compositeSeekBarView.setThumbStartTrackingTouch(true);
            a thumbListener = compositeSeekBarView.getThumbListener();
            if (thumbListener != null) {
                thumbListener.d();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            CompositeSeekBarView compositeSeekBarView = CompositeSeekBarView.this;
            compositeSeekBarView.setThumbStartTrackingTouch(false);
            a thumbListener = compositeSeekBarView.getThumbListener();
            if (thumbListener != null) {
                thumbListener.b();
            }
        }
    }

    public CompositeSeekBarView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final int getMax() {
        return this.d;
    }

    public final int getProgress() {
        return this.e;
    }

    public final Drawable getProgressDrawable() {
        return this.i.getProgressDrawable();
    }

    public final ProgressSeekBarView getProgressSeekBarView() {
        return this.h;
    }

    public final int getSecondaryProgress() {
        return this.f;
    }

    public final a getThumbListener() {
        return this.c;
    }

    public final ThumbSeekBarView getThumbSeekBarView() {
        return this.g;
    }

    public final void setMax(int i) {
        if (this.d != i) {
            this.d = i;
            ProgressSeekBarView progressSeekBarView = this.h;
            if (progressSeekBarView.getVisibility() == 0) {
                progressSeekBarView.setMax(i);
                progressSeekBarView.setProgress(this.e);
                progressSeekBarView.setSecondaryProgress(this.f);
            }
            ThumbSeekBarView thumbSeekBarView = this.g;
            if (thumbSeekBarView.getVisibility() == 0) {
                thumbSeekBarView.setMax(i);
                if (this.b) {
                    return;
                }
                thumbSeekBarView.setProgress(this.e);
            }
        }
    }

    public final void setProgress(int i) {
        if (this.e != i) {
            this.e = i;
            ProgressSeekBarView progressSeekBarView = this.h;
            if (progressSeekBarView.getVisibility() == 0) {
                progressSeekBarView.setProgress(i);
            }
            if (this.b) {
                return;
            }
            ThumbSeekBarView thumbSeekBarView = this.g;
            if (thumbSeekBarView.getVisibility() == 0) {
                thumbSeekBarView.setProgress(i);
            }
        }
    }

    public final void setProgressDrawable(Drawable drawable) {
        this.i.setProgressDrawable(drawable);
    }

    public final void setSecondaryProgress(int i) {
        if (this.f != i) {
            this.f = i;
            ProgressSeekBarView progressSeekBarView = this.h;
            if (progressSeekBarView.getVisibility() == 0) {
                progressSeekBarView.setSecondaryProgress(i);
            }
        }
    }

    public final void setThumbListener(a aVar) {
        this.c = aVar;
    }

    public final void setThumbStartTrackingTouch(boolean z) {
        this.b = z;
    }

    public CompositeSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public CompositeSeekBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ CompositeSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public CompositeSeekBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.one_video_composite_seek_bar_view, this);
        int i3 = R.id.progress_seek_bar;
        ProgressSeekBarView progressSeekBarView = (ProgressSeekBarView) k9q0.j(R.id.progress_seek_bar, this);
        if (progressSeekBarView != null) {
            i3 = R.id.thumb_seek_bar;
            final ThumbSeekBarView thumbSeekBarView = (ThumbSeekBarView) k9q0.j(R.id.thumb_seek_bar, this);
            if (thumbSeekBarView != null) {
                thumbSeekBarView.setOnSeekBarChangeListener(new b());
                thumbSeekBarView.setVisibilityChangeListener$one_video_controls_components_release(new CustomSeekBar.a() { // from class: xsna.mui
                    @Override // one.video.controls.view.seekbar.CustomSeekBar.a
                    public final void a(boolean z) {
                        if (!z) {
                            int i4 = CompositeSeekBarView.j;
                            return;
                        }
                        CompositeSeekBarView compositeSeekBarView = this;
                        int i5 = compositeSeekBarView.d;
                        ThumbSeekBarView thumbSeekBarView2 = ThumbSeekBarView.this;
                        thumbSeekBarView2.setMax(i5);
                        if (compositeSeekBarView.b) {
                            return;
                        }
                        thumbSeekBarView2.setProgress(compositeSeekBarView.e);
                    }
                });
                this.g = thumbSeekBarView;
                progressSeekBarView.setVisibilityChangeListener$one_video_controls_components_release(new nui(progressSeekBarView, this));
                this.h = progressSeekBarView;
                this.i = progressSeekBarView;
                if (isInEditMode()) {
                    setMax(1000);
                    setProgress(300);
                    setSecondaryProgress(400);
                    return;
                }
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
