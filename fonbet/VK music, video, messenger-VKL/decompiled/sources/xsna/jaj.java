package xsna;

import android.app.Activity;
import com.vk.dto.common.AppState;
import xsna.c63;

/* compiled from: ContactSyncPermissionReporter.kt */
/* loaded from: classes.dex */
public final class jaj extends c63.b {
    public final /* synthetic */ kaj b;

    public jaj(kaj kajVar) {
        this.b = kajVar;
    }

    @Override // xsna.c63.b
    public final void x(Activity activity) {
        this.b.a(AppState.BACKGROUND);
    }
}
