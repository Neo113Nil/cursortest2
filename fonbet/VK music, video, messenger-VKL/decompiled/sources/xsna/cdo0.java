package xsna;

import android.app.RemoteAction;

/* compiled from: DefaultTextContextMenuDropdownProvider.android.kt */
/* loaded from: classes11.dex */
public final class cdo0 implements yzs<l5g, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ RemoteAction b;

    public cdo0(RemoteAction remoteAction) {
        this.b = remoteAction;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(l5g l5gVar, androidx.compose.runtime.a aVar, Integer num) {
        long j = l5gVar.a;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1261173016, intValue, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:257)");
            }
            ddo0.a.b(this.b.getIcon(), aVar2, 48);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
