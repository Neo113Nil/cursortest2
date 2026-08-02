package ru.rustore.sdk.metrics.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;
import xsna.moy0;

/* loaded from: classes11.dex */
public final class e0 {
    public final Context a;
    public final bpn0 b = new bpn0(new a());

    public static final class a extends Lambda implements gzs<moy0> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final moy0 invoke() {
            Object failure;
            PackageInfo packageInfo;
            String str;
            PackageManager.PackageInfoFlags of;
            e0 e0Var = e0.this;
            try {
                PackageManager packageManager = e0Var.a.getPackageManager();
                String packageName = e0Var.a.getPackageName();
                if (Build.VERSION.SDK_INT >= 33) {
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo(packageName, of);
                } else {
                    packageInfo = packageManager.getPackageInfo(packageName, 0);
                }
                str = packageInfo.versionName;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            failure = new moy0(str);
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            moy0 moy0Var = (moy0) failure;
            String str2 = moy0Var != null ? moy0Var.a : null;
            if (str2 != null) {
                return new moy0(str2);
            }
            return null;
        }
    }

    public e0(Context context) {
        this.a = context;
    }
}
