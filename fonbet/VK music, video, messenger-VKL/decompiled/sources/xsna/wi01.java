package xsna;

import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import xsna.dz9;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class wi01 extends dz9.c {
    public final /* synthetic */ ExpandedControllerActivity a;

    public wi01(ExpandedControllerActivity expandedControllerActivity) {
        this.a = expandedControllerActivity;
    }

    @Override // xsna.dz9.c
    public final void onDeviceNameChanged() {
        this.a.T1();
    }
}
