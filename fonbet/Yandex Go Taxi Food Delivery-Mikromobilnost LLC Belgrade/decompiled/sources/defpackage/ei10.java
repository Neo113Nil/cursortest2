package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes.dex */
public final /* synthetic */ class ei10 implements sls {
    public final /* synthetic */ double a;
    public final /* synthetic */ Context b;

    public /* synthetic */ ei10(double d, Context context) {
        this.a = d;
        this.b = context;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i;
        Context context = this.b;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
            i = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            i = 256;
        }
        return Long.valueOf((long) (this.a * i * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
    }
}
