package xsna;

import android.widget.PopupWindow;
import com.vkontakte.android.VKActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class avo implements izs {
    public final /* synthetic */ VKActivity b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ avo(VKActivity vKActivity, int i, int i2, int i3, int i4) {
        this.b = vKActivity;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        try {
            ((PopupWindow) obj).showAtLocation(this.b.getWindow().getDecorView().getRootView(), this.c | this.d, iah0.a(this.e), iah0.a(this.f));
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
        }
        return s3q0.a;
    }
}
