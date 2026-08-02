package xsna;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: DensityCompatHelper.kt */
/* loaded from: classes12.dex */
public final class czl implements bzl {
    public static final czl b = new czl();

    @Override // xsna.bzl
    public final float a(Context context) {
        return ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
