package xsna;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public final class qmz0 implements OnCompleteListener {
    public final d9u b;
    public final int c;
    public final ty2 d;
    public final long e;
    public final long f;

    public qmz0(d9u d9uVar, int i, ty2 ty2Var, long j, long j2) {
        this.b = d9uVar;
        this.c = i;
        this.d = ty2Var;
        this.e = j;
        this.f = j2;
    }

    @Nullable
    public static ConnectionTelemetryConfiguration a(hmz0 hmz0Var, rd6 rd6Var, int i) {
        ConnectionTelemetryConfiguration telemetryConfiguration = rd6Var.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.l()) {
            return null;
        }
        int[] j = telemetryConfiguration.j();
        int i2 = 0;
        if (j != null) {
            while (i2 < j.length) {
                if (j[i2] != i) {
                    i2++;
                }
            }
            return null;
        }
        int[] k = telemetryConfiguration.k();
        if (k != null) {
            while (i2 < k.length) {
                if (k[i2] == i) {
                    return null;
                }
                i2++;
            }
        }
        if (hmz0Var.n < telemetryConfiguration.i()) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        d9u d9uVar = this.b;
        if (d9uVar.g()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = mmg0.a().a;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.c) {
                hmz0 hmz0Var = (hmz0) d9uVar.k.get(this.d);
                if (hmz0Var != null) {
                    Object obj = hmz0Var.b;
                    if (obj instanceof rd6) {
                        rd6 rd6Var = (rd6) obj;
                        long j3 = this.e;
                        boolean z = j3 > 0;
                        int gCoreServiceId = rd6Var.getGCoreServiceId();
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.d;
                            int i7 = rootTelemetryConfiguration.e;
                            int i8 = rootTelemetryConfiguration.f;
                            i = rootTelemetryConfiguration.b;
                            if (rd6Var.hasConnectionInfo() && !rd6Var.isConnecting()) {
                                ConnectionTelemetryConfiguration a = a(hmz0Var, rd6Var, this.c);
                                if (a == null) {
                                    return;
                                }
                                boolean z2 = a.n() && j3 > 0;
                                i8 = a.i();
                                z = z2;
                            }
                            i3 = i7;
                            i2 = i8;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        int i9 = -1;
                        if (task.isSuccessful()) {
                            i6 = 0;
                            i5 = 0;
                        } else if (task.isCanceled()) {
                            i5 = -1;
                            i6 = 100;
                        } else {
                            Exception exception = task.getException();
                            if (exception instanceof ApiException) {
                                Status d = ((ApiException) exception).d();
                                i4 = d.b;
                                ConnectionResult connectionResult = d.e;
                                if (connectionResult != null) {
                                    i5 = connectionResult.c;
                                    i6 = i4;
                                }
                            } else {
                                i4 = 101;
                            }
                            i5 = -1;
                            i6 = i4;
                        }
                        if (z) {
                            long currentTimeMillis = System.currentTimeMillis();
                            i9 = (int) (SystemClock.elapsedRealtime() - this.f);
                            j = j3;
                            j2 = currentTimeMillis;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        rmz0 rmz0Var = new rmz0(new MethodInvocation(this.c, i6, i5, j, j2, null, null, gCoreServiceId, i9), i, i3, i2);
                        com.google.android.gms.internal.base.zar zarVar = d9uVar.o;
                        zarVar.sendMessage(zarVar.obtainMessage(18, rmz0Var));
                    }
                }
            }
        }
    }
}
