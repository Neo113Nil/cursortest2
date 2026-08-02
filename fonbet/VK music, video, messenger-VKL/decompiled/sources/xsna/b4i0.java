package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import one.video.controls.view.PositionDurationView;
import one.video.controls.view.seekbar.OneVideoSeekBarView;

/* compiled from: Seekbar.kt */
/* loaded from: classes7.dex */
public final class b4i0 extends FrameLayout {
    public izs<? super Long, s3q0> b;
    public final Object c;
    public final Object d;

    public b4i0(Context context) {
        super(context, null, 0);
        ln20 ln20Var = new ln20(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, ln20Var);
        this.d = msy.a(lazyThreadSafetyMode, new e550(this, 25));
        View.inflate(context, R.layout.video_seekbar, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final OneVideoSeekBarView getSeekBarView() {
        return (OneVideoSeekBarView) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final PositionDurationView getTimeView() {
        return (PositionDurationView) this.d.getValue();
    }

    public final void a(long j, long j2) {
        getSeekBarView().setVisibility(0);
        int i = (int) j;
        getSeekBarView().e.c(new hn80(false, false, null, (int) j2, i, i));
        long j3 = 1000;
        getTimeView().c.c(new ozb0((int) (j2 / j3), (int) (j / j3), true, false));
    }

    public final void setOnSeekListener(izs<? super Long, s3q0> izsVar) {
        this.b = izsVar;
    }
}
