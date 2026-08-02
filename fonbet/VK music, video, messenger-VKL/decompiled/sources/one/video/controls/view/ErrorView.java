package one.video.controls.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import one.video.controls.view.ErrorView;
import xsna.cxp;
import xsna.k9q0;
import xsna.ko3;
import xsna.o7j;
import xsna.pk80;
import xsna.y3j;

/* compiled from: ErrorView.kt */
/* loaded from: classes8.dex */
public final class ErrorView extends ConstraintLayout {
    public static final /* synthetic */ int w = 0;
    public Runnable t;
    public final pk80 u;
    public final y3j v;

    public ErrorView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final Runnable getRetryRunnable() {
        return this.t;
    }

    public final void setRetryRunnable(Runnable runnable) {
        this.t = runnable;
    }

    public ErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public ErrorView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ ErrorView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public ErrorView(final Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.t = new cxp();
        LayoutInflater.from(context).inflate(R.layout.one_video_error_view, this);
        int i3 = R.id.retry_button;
        AppCompatTextView appCompatTextView = (AppCompatTextView) k9q0.j(R.id.retry_button, this);
        if (appCompatTextView != null) {
            i3 = R.id.text_view;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) k9q0.j(R.id.text_view, this);
            if (appCompatTextView2 != null) {
                pk80 pk80Var = new pk80(this, appCompatTextView, appCompatTextView2);
                appCompatTextView.setOnClickListener(new ko3(this, 5));
                this.u = pk80Var;
                this.v = new y3j(new o7j() { // from class: xsna.dxp
                    @Override // xsna.o7j
                    public final void accept(Object obj) {
                        ixp ixpVar = (ixp) obj;
                        int i4 = ErrorView.w;
                        boolean z = ixpVar.a;
                        int i5 = z ? 0 : 8;
                        ErrorView errorView = ErrorView.this;
                        errorView.setVisibility(i5);
                        if (z) {
                            Integer num = ixpVar.b;
                            errorView.u.b.setText(num != null ? context.getString(num.intValue()) : null);
                        }
                    }
                });
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
