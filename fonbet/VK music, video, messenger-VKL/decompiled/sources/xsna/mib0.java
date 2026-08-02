package xsna;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Callable;

/* compiled from: PodcastPlaybackSpeedBottomSheetContentView.kt */
/* loaded from: classes3.dex */
public final class mib0 extends RecyclerView.t {
    public final /* synthetic */ nib0 b;

    public mib0(nib0 nib0Var) {
        this.b = nib0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        final int snapPosition;
        final nib0 nib0Var = this.b;
        snapPosition = nib0Var.getSnapPosition();
        if (nib0Var.e != snapPosition) {
            if (snapPosition != -1) {
                TextView textView = nib0Var.b;
                StringBuffer stringBuffer = nib0Var.f;
                stringBuffer.setLength(0);
                nib0Var.h.format((snapPosition + 5) * 0.1d, stringBuffer, nib0Var.g);
                stringBuffer.append('x');
                textView.setText(stringBuffer);
                if (nib0Var.p) {
                    io.reactivex.rxjava3.internal.operators.observable.l2 r0 = new io.reactivex.rxjava3.internal.operators.observable.s0(new Callable() { // from class: xsna.lib0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            nib0.this.r.s((float) ((snapPosition + 5) * 0.1d), true);
                            return s3q0.a;
                        }
                    }).r0(io.reactivex.rxjava3.schedulers.a.c());
                    int i3 = kwg0.a;
                    nib0Var.q.b(r0.subscribe(new iwg0(), new iwg0()));
                }
            }
            nib0Var.e = snapPosition;
        }
    }
}
