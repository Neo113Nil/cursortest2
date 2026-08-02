package xsna;

import android.widget.FrameLayout;
import com.vk.notifications.common.NotificationCSatRate;

/* compiled from: NotificationCSatView.kt */
/* loaded from: classes4.dex */
public abstract class n870 extends FrameLayout {
    public gzs<s3q0> b;
    public izs<? super NotificationCSatRate, s3q0> c;

    public final gzs<s3q0> getOnClose() {
        return this.b;
    }

    public final izs<NotificationCSatRate, s3q0> getOnSubmit() {
        return this.c;
    }

    public final void setOnClose(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    public final void setOnSubmit(izs<? super NotificationCSatRate, s3q0> izsVar) {
        this.c = izsVar;
    }
}
