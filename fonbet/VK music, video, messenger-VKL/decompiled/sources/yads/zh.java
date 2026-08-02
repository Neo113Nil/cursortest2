package yads;

import android.app.ActivityManager;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class zh extends Lambda implements gzs {
    public final /* synthetic */ ei b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(ei eiVar) {
        super(0);
        this.b = eiVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        try {
            Object systemService = this.b.a.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                return (ActivityManager) systemService;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
