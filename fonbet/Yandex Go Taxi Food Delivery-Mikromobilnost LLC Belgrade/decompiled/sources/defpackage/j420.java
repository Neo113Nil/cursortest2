package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import com.yandex.messaging.ui.pollinfo.PollInfoActivity;
import kotlin.a;

/* loaded from: classes8.dex */
public final class j420 {
    public final Context a;
    public final i3y b;
    public final i3y c;
    public final i3y d;
    public final i3y e;

    public j420(Context context) {
        this.a = context;
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: i420
            public final /* synthetic */ j420 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                boolean z = true;
                j420 j420Var = this.b;
                switch (i2) {
                    case 0:
                        return j420Var.a.getPackageManager();
                    case 1:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, "com.yandex.messaging.activity.MessengerActivity"), 0);
                        } catch (PackageManager.NameNotFoundException unused) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, (Class<?>) PollInfoActivity.class), 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    default:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, (Class<?>) ProxyPassportActivity.class), 0);
                        } catch (PackageManager.NameNotFoundException unused3) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: i420
            public final /* synthetic */ j420 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                boolean z = true;
                j420 j420Var = this.b;
                switch (i22) {
                    case 0:
                        return j420Var.a.getPackageManager();
                    case 1:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, "com.yandex.messaging.activity.MessengerActivity"), 0);
                        } catch (PackageManager.NameNotFoundException unused) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, (Class<?>) PollInfoActivity.class), 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    default:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, (Class<?>) ProxyPassportActivity.class), 0);
                        } catch (PackageManager.NameNotFoundException unused3) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i3 = 2;
        this.d = a.a(new sls(this) { // from class: i420
            public final /* synthetic */ j420 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                boolean z = true;
                j420 j420Var = this.b;
                switch (i22) {
                    case 0:
                        return j420Var.a.getPackageManager();
                    case 1:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, "com.yandex.messaging.activity.MessengerActivity"), 0);
                        } catch (PackageManager.NameNotFoundException unused) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, (Class<?>) PollInfoActivity.class), 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    default:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, (Class<?>) ProxyPassportActivity.class), 0);
                        } catch (PackageManager.NameNotFoundException unused3) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i4 = 3;
        this.e = a.a(new sls(this) { // from class: i420
            public final /* synthetic */ j420 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                boolean z = true;
                j420 j420Var = this.b;
                switch (i22) {
                    case 0:
                        return j420Var.a.getPackageManager();
                    case 1:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, "com.yandex.messaging.activity.MessengerActivity"), 0);
                        } catch (PackageManager.NameNotFoundException unused) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, (Class<?>) PollInfoActivity.class), 0);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    default:
                        try {
                            ((PackageManager) j420Var.b.getValue()).getActivityInfo(new ComponentName(j420Var.a, (Class<?>) ProxyPassportActivity.class), 0);
                        } catch (PackageManager.NameNotFoundException unused3) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }
}
