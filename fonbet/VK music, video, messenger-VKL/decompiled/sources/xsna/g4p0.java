package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.vk.core.tips.TipAnchorView;
import com.vk.core.tips.Tooltip;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class g4p0 implements izs {
    public final /* synthetic */ Tooltip b;
    public final /* synthetic */ TipAnchorView c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Tooltip.g g;

    public /* synthetic */ g4p0(Tooltip tooltip, TipAnchorView tipAnchorView, Activity activity, boolean z, int i, Tooltip.g gVar) {
        this.b = tooltip;
        this.c = tipAnchorView;
        this.d = activity;
        this.e = z;
        this.f = i;
        this.g = gVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        final int intValue = ((Integer) obj).intValue();
        final Tooltip tooltip = this.b;
        if (tooltip.l <= 3) {
            final Activity activity = this.d;
            final TipAnchorView tipAnchorView = this.c;
            final boolean z = this.e;
            final int i = this.f;
            final Tooltip.g gVar = this.g;
            tipAnchorView.post(new Runnable() { // from class: xsna.n4p0
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
                
                    if (r2 == false) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
                
                    r0.setRequestedOrientation(r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
                
                    r4.e(r6, r7);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
                
                    if (r2 != false) goto L15;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    Activity activity2 = activity;
                    TipAnchorView tipAnchorView2 = tipAnchorView;
                    boolean z2 = z;
                    int i2 = i;
                    Tooltip tooltip2 = Tooltip.this;
                    tooltip2.getClass();
                    try {
                        ViewGroup viewGroup = (ViewGroup) tipAnchorView2.findViewById(R.id.fl_custom_tip_container);
                        if (viewGroup != null) {
                            viewGroup.removeAllViews();
                        }
                        try {
                            ViewParent parent = tipAnchorView2.getParent();
                            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(tipAnchorView2);
                                s3q0 s3q0Var = s3q0.a;
                            }
                        } catch (Throwable unused) {
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            });
        }
        return s3q0.a;
    }
}
