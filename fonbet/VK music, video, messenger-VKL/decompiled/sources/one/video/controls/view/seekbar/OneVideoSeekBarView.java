package one.video.controls.view.seekbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.controls.components.R$styleable;
import one.video.controls.view.LiveLabelView;
import one.video.controls.view.LiveTimeView;
import one.video.controls.view.seekbar.CompositeSeekBarView;
import one.video.controls.view.seekbar.OneVideoSeekBarView;
import xsna.e43;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.jn80;
import xsna.kn80;
import xsna.o7j;
import xsna.s3q0;
import xsna.sox;
import xsna.y3j;
import xsna.zsm0;

/* compiled from: OneVideoSeekBarView.kt */
@SuppressLint({"CustomViewStyleable", "ClickableViewAccessibility"})
/* loaded from: classes8.dex */
public final class OneVideoSeekBarView extends FrameLayout {
    public final one.video.controls.view.seekbar.b b;
    public final CopyOnWriteArrayList<a> c;
    public sox d;
    public final y3j e;

    /* compiled from: OneVideoSeekBarView.kt */
    public static final class b implements CompositeSeekBarView.a {
        public int a = -1;

        public b() {
        }

        @Override // one.video.controls.view.seekbar.CompositeSeekBarView.a
        public final void b() {
            Iterator<a> it = OneVideoSeekBarView.this.c.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        @Override // one.video.controls.view.seekbar.CompositeSeekBarView.a
        public final void c(long j, boolean z) {
            int b;
            OneVideoSeekBarView oneVideoSeekBarView = OneVideoSeekBarView.this;
            CopyOnWriteArrayList<a> copyOnWriteArrayList = oneVideoSeekBarView.c;
            Iterator<a> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().c(j, z);
            }
            sox soxVar = oneVideoSeekBarView.d;
            if (soxVar != null) {
                ArrayList arrayList = soxVar.a;
                int i = this.a;
                final int i2 = (int) j;
                sox.a aVar = (sox.a) j5g.k0(arrayList);
                if (aVar == null || aVar.b >= i2) {
                    b = e43.b(arrayList.size(), arrayList, new izs() { // from class: xsna.rox
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            sox.a aVar2 = (sox.a) obj;
                            long j2 = aVar2.a;
                            long j3 = i2;
                            return Integer.valueOf(j2 > j3 ? 1 : aVar2.b <= j3 ? -1 : 0);
                        }
                    });
                } else {
                    b = e43.h(arrayList);
                }
                this.a = b;
                if (i != b) {
                    if (z) {
                        ThumbSeekBarView thumbSeekBarView = oneVideoSeekBarView.getThumbSeekBarView();
                        if (thumbSeekBarView.isHapticFeedbackEnabled()) {
                            thumbSeekBarView.performHapticFeedback(11);
                        }
                    }
                    Iterator<a> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(soxVar, this.a);
                    }
                }
            }
        }

        @Override // one.video.controls.view.seekbar.CompositeSeekBarView.a
        public final void d() {
            Iterator<a> it = OneVideoSeekBarView.this.c.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    public OneVideoSeekBarView(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final CompositeSeekBarView getCompositeSeekBarView() {
        CompositeSeekBarView compositeSeekBarView;
        one.video.controls.view.seekbar.b bVar = this.b;
        kn80 kn80Var = bVar.d;
        if (kn80Var != null && (compositeSeekBarView = kn80Var.b) != null) {
            return compositeSeekBarView;
        }
        jn80 jn80Var = bVar.e;
        if (jn80Var != null) {
            return jn80Var.d;
        }
        return null;
    }

    public final gzs<s3q0> getLiveButtonClickListener() {
        return this.b.c;
    }

    public final LiveLabelView getLiveLabelView() {
        jn80 jn80Var = this.b.e;
        if (jn80Var != null) {
            return jn80Var.b;
        }
        return null;
    }

    public final LiveTimeView getLiveTimeView() {
        jn80 jn80Var = this.b.e;
        if (jn80Var != null) {
            return jn80Var.c;
        }
        return null;
    }

    public final ProgressSeekBarView getProgressSeekBarView() {
        return getCompositeSeekBarView().getProgressSeekBarView();
    }

    public final ThumbSeekBarView getThumbSeekBarView() {
        return getCompositeSeekBarView().getThumbSeekBarView();
    }

    public final void setLiveButtonClickListener(gzs<s3q0> gzsVar) {
        this.b.c = gzsVar;
    }

    public OneVideoSeekBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public OneVideoSeekBarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ OneVideoSeekBarView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public OneVideoSeekBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        b bVar = new b();
        TypedArray obtainStyledAttributes = attributeSet != null ? getContext().obtainStyledAttributes(attributeSet, R$styleable.a, R.attr.one_video_SeekBarStyle, R.style.OneVideoSeekBarViewDefaultStyle) : null;
        zsm0 zsm0Var = new zsm0(obtainStyledAttributes != null ? obtainStyledAttributes.getColor(0, 0) : 0, obtainStyledAttributes != null ? obtainStyledAttributes.getColor(2, 0) : 0, obtainStyledAttributes != null ? obtainStyledAttributes.getColor(3, 0) : 0, obtainStyledAttributes != null ? obtainStyledAttributes.getColor(1, 0) : 0, obtainStyledAttributes != null ? obtainStyledAttributes.getColor(4, 0) : 0, getContext().getResources().getDimension(R.dimen.one_video_seek_view_progress_height_small));
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        this.b = new one.video.controls.view.seekbar.b(this, zsm0Var, bVar);
        this.c = new CopyOnWriteArrayList<>();
        this.e = new y3j(new o7j() { // from class: xsna.gn80
            @Override // xsna.o7j
            public final void accept(Object obj) {
                hn80 hn80Var = (hn80) obj;
                OneVideoSeekBarView oneVideoSeekBarView = OneVideoSeekBarView.this;
                one.video.controls.view.seekbar.b bVar2 = oneVideoSeekBarView.b;
                boolean z = hn80Var.a;
                boolean z2 = hn80Var.b;
                OneVideoSeekBarView oneVideoSeekBarView2 = bVar2.a;
                one.video.controls.view.seekbar.a aVar = bVar2.h;
                bVar2.g = z2;
                if (z && bVar2.e == null) {
                    oneVideoSeekBarView2.removeAllViews();
                    bVar2.e = null;
                    bVar2.d = null;
                    LayoutInflater.from(oneVideoSeekBarView2.getContext()).inflate(R.layout.one_video_seekbar_live_view_new, oneVideoSeekBarView2);
                    int i3 = R.id.live_label;
                    LiveLabelView liveLabelView = (LiveLabelView) k9q0.j(R.id.live_label, oneVideoSeekBarView2);
                    if (liveLabelView != null) {
                        i3 = R.id.live_time;
                        LiveTimeView liveTimeView = (LiveTimeView) k9q0.j(R.id.live_time, oneVideoSeekBarView2);
                        if (liveTimeView != null) {
                            i3 = R.id.seek_bar;
                            CompositeSeekBarView compositeSeekBarView = (CompositeSeekBarView) k9q0.j(R.id.seek_bar, oneVideoSeekBarView2);
                            if (compositeSeekBarView != null) {
                                jn80 jn80Var = new jn80(oneVideoSeekBarView2, liveLabelView, liveTimeView, compositeSeekBarView);
                                compositeSeekBarView.setThumbListener(aVar);
                                liveLabelView.setOnClickListener(new l37(0, bVar2, jn80Var));
                                bVar2.e = jn80Var;
                                bVar2.a(bVar2.f);
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(oneVideoSeekBarView2.getResources().getResourceName(i3)));
                }
                if (!z && bVar2.d == null) {
                    oneVideoSeekBarView2.removeAllViews();
                    bVar2.d = null;
                    bVar2.e = null;
                    kn80 a2 = kn80.a(LayoutInflater.from(oneVideoSeekBarView2.getContext()), oneVideoSeekBarView2);
                    a2.b.setThumbListener(aVar);
                    bVar2.d = a2;
                    bVar2.a(bVar2.f);
                }
                sox soxVar = hn80Var.c;
                oneVideoSeekBarView.d = soxVar;
                if (!epx.f(bVar2.f, soxVar)) {
                    bVar2.f = soxVar;
                    bVar2.a(soxVar);
                }
                int i4 = hn80Var.d;
                kn80 kn80Var = bVar2.d;
                if (kn80Var != null) {
                    kn80Var.b.setMax(i4);
                }
                jn80 jn80Var2 = bVar2.e;
                if (jn80Var2 != null) {
                    jn80Var2.d.setMax(i4);
                }
                int i5 = hn80Var.e;
                kn80 kn80Var2 = bVar2.d;
                if (kn80Var2 != null) {
                    kn80Var2.b.setProgress(i5);
                }
                jn80 jn80Var3 = bVar2.e;
                if (jn80Var3 != null) {
                    jn80Var3.d.setProgress(i5);
                }
                int i6 = hn80Var.f;
                kn80 kn80Var3 = bVar2.d;
                if (kn80Var3 != null) {
                    kn80Var3.b.setSecondaryProgress(i6);
                }
                jn80 jn80Var4 = bVar2.e;
                if (jn80Var4 != null) {
                    jn80Var4.d.setSecondaryProgress(i6);
                }
            }
        });
    }

    /* compiled from: OneVideoSeekBarView.kt */
    public interface a {
        default void a() {
        }

        default void d() {
        }

        default void b(sox soxVar, int i) {
        }

        default void c(long j, boolean z) {
        }
    }

    public final void setDragEnabled(boolean z) {
    }
}
