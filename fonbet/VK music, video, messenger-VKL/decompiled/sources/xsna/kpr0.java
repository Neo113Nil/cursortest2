package xsna;

import android.net.Uri;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.log.L;
import xsna.zdh0;

/* compiled from: VerticalizationDelegate.kt */
/* loaded from: classes16.dex */
public final class kpr0 implements zdh0.b {
    public Uri a;
    public final /* synthetic */ jpr0 b;

    public kpr0(jpr0 jpr0Var) {
        this.b = jpr0Var;
    }

    @Override // xsna.zdh0.b
    public final void a(Throwable th) {
        L.i(th);
    }

    @Override // xsna.zdh0.b
    public final void b(Uri uri) {
        if (epx.f(this.a, uri)) {
            return;
        }
        this.a = uri;
        jpr0 jpr0Var = this.b;
        if (jpr0Var.k == null) {
            jpr0Var.c().i(StoryEditorEvents.TAKE_SCREENSHOT);
        } else {
            jpr0Var.c().i(StoryEditorEvents.SCREENSHOT_OF_VERTICALIZATION_PICKER);
        }
    }
}
