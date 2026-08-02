package xsna;

import android.content.Context;
import android.os.StatFs;

/* compiled from: StorageTrackerImpl.kt */
/* loaded from: classes5.dex */
public final class bil0 implements ail0 {
    public final Context a;

    public bil0(Context context) {
        this.a = context;
    }

    @Override // xsna.ail0
    public final boolean a() {
        long freeSpace;
        Context context = this.a;
        try {
            StatFs statFs = new StatFs(context.getFilesDir().getPath());
            freeSpace = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (Throwable unused) {
            freeSpace = context.getFilesDir().getFreeSpace();
        }
        return freeSpace < 5242880;
    }
}
