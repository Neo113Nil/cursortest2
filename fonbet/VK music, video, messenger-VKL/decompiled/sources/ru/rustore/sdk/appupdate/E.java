package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class E {
    public final Context a;
    public final bpn0 b = new bpn0(new a());

    public static final class a extends Lambda implements gzs<String> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final String invoke() {
            Object failure;
            PackageInfo packageInfo;
            PackageManager.PackageInfoFlags of;
            E e = E.this;
            try {
                PackageManager packageManager = e.a.getPackageManager();
                String packageName = e.a.getPackageName();
                if (Build.VERSION.SDK_INT >= 33) {
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo(packageName, of);
                } else {
                    packageInfo = packageManager.getPackageInfo(packageName, 0);
                }
                failure = packageInfo.versionName;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            return (String) failure;
        }
    }

    public E(Context context) {
        this.a = context;
    }
}
