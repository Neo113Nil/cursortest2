package xsna;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.vk.core.tips.TipAnchorView;
import com.vk.core.tips.Tooltip;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class p4p0 implements izs {
    public final /* synthetic */ Tooltip b;
    public final /* synthetic */ TipAnchorView c;
    public final /* synthetic */ WindowManager d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Tooltip.g h;

    public /* synthetic */ p4p0(Tooltip tooltip, TipAnchorView tipAnchorView, WindowManager windowManager, boolean z, Activity activity, int i, Tooltip.g gVar) {
        this.b = tooltip;
        this.c = tipAnchorView;
        this.d = windowManager;
        this.e = z;
        this.f = activity;
        this.g = i;
        this.h = gVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        TipAnchorView tipAnchorView = this.c;
        WindowManager windowManager = this.d;
        boolean z = this.e;
        Activity activity = this.f;
        int i = this.g;
        int intValue = ((Integer) obj).intValue();
        Tooltip tooltip = this.b;
        if (tooltip.l <= 3) {
            try {
                ViewGroup viewGroup = (ViewGroup) tipAnchorView.findViewById(R.id.fl_custom_tip_container);
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                if (tipAnchorView.isAttachedToWindow()) {
                    windowManager.removeViewImmediate(tipAnchorView);
                }
                if (z) {
                    activity.setRequestedOrientation(i);
                }
                tooltip.e(this.h, intValue);
            } catch (Throwable th) {
                if (z) {
                    activity.setRequestedOrientation(i);
                }
                throw th;
            }
        }
        return s3q0.a;
    }
}
