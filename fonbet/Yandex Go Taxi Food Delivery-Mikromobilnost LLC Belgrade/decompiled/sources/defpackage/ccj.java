package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class ccj implements i231 {
    @Override // defpackage.i231
    public final c231 create() {
        return new y131("device.viewport.width", Resources.getSystem().getConfiguration().screenWidthDp);
    }
}
