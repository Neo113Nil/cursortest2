package xsna;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.install.InstallException;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class ijq implements ra3 {
    public final r501 a;
    public final Context b;
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public boolean e = false;
    public int f = 0;

    @Nullable
    public Integer g;

    public ijq(Context context) {
        this.a = new r501(context);
        this.b = context;
    }

    @Override // xsna.ra3
    public final Task<qa3> a() {
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        PendingIntent pendingIntent4;
        int i;
        PendingIntent pendingIntent5;
        PendingIntent pendingIntent6;
        boolean z = this.e;
        int i2 = 1;
        Context context = this.b;
        if (z && ((i = this.d) == 0 || i == 4 || i == 5 || i == 6)) {
            ArrayList arrayList = this.c;
            if (arrayList.contains(0)) {
                pendingIntent5 = PendingIntent.getBroadcast(context, 0, new Intent(), 67108864);
                pendingIntent6 = PendingIntent.getBroadcast(context, 0, new Intent(), 67108864);
            } else {
                pendingIntent5 = null;
                pendingIntent6 = null;
            }
            if (arrayList.contains(1)) {
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(), 67108864);
                pendingIntent3 = PendingIntent.getBroadcast(context, 0, new Intent(), 67108864);
                pendingIntent = broadcast;
            } else {
                pendingIntent = null;
                pendingIntent3 = null;
            }
            pendingIntent2 = pendingIntent5;
            pendingIntent4 = pendingIntent6;
        } else {
            pendingIntent = null;
            pendingIntent2 = null;
            pendingIntent3 = null;
            pendingIntent4 = null;
        }
        String packageName = context.getPackageName();
        int i3 = this.f;
        if (this.e) {
            int i4 = this.d;
            i2 = (i4 == 0 || i4 == 4 || i4 == 5 || i4 == 6) ? 2 : 3;
        }
        return Tasks.forResult(new qa3(packageName, i3, i2, this.d, 0L, 0L, 0L, 0L, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, new HashMap()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        if (r8.a(new xsna.zr01(r6)) != null) goto L39;
     */
    @Override // xsna.ra3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(qa3 qa3Var, int i, Activity activity) {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        if (b != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" appUpdateType");
            }
            if ((b & 2) == 0) {
                sb.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        zr01 zr01Var = new zr01(i);
        PendingIntent a = qa3Var.a(zr01Var);
        int i2 = zr01Var.a;
        if (a == null) {
            byte b2 = (byte) (((byte) 1) | 2);
            if (b2 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b2 & 1) == 0) {
                    sb2.append(" appUpdateType");
                }
                if ((b2 & 2) == 0) {
                    sb2.append(" allowAssetPackDeletion");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            if (new zr01(i2).equals(zr01Var)) {
                byte b3 = (byte) (((byte) 1) | 2);
                if (b3 != 3) {
                    StringBuilder sb3 = new StringBuilder();
                    if ((b3 & 1) == 0) {
                        sb3.append(" appUpdateType");
                    }
                    if ((b3 & 2) == 0) {
                        sb3.append(" allowAssetPackDeletion");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb3.toString()));
                }
            }
            return false;
        }
        if (i2 == 1) {
            this.g = 1;
            return true;
        }
        this.g = 0;
        return true;
    }

    @Override // xsna.ra3
    public final void c(a3u a3uVar) {
        this.a.b(a3uVar);
    }

    @Override // xsna.ra3
    public final void d(a3u a3uVar) {
        this.a.a(a3uVar);
    }

    @Override // xsna.ra3
    public final Task<Void> e() {
        int i = this.d;
        if (i != 11) {
            return i == 3 ? Tasks.forException(new InstallException(-8)) : Tasks.forException(new InstallException(-7));
        }
        this.d = 3;
        Integer num = 0;
        if (num.equals(this.g)) {
            this.a.c(new ctz0(this.d, this.b.getPackageName(), 0L, 0L, 0));
        }
        return Tasks.forResult(null);
    }
}
