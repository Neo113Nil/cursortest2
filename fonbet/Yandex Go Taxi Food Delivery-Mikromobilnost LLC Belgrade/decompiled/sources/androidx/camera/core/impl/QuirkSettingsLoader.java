package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import defpackage.glg0;
import defpackage.hlg0;
import defpackage.ilg0;
import defpackage.ims;
import defpackage.sgb1;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes10.dex */
public class QuirkSettingsLoader implements ims {

    public static class MetadataHolderService extends Service {
        private MetadataHolderService() {
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    public static ilg0 a(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] b = b(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] b2 = b(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        sgb1.g(3, "QuirkSettingsLoader");
        sgb1.g(3, "QuirkSettingsLoader");
        Arrays.toString(b);
        sgb1.g(3, "QuirkSettingsLoader");
        Arrays.toString(b2);
        sgb1.g(3, "QuirkSettingsLoader");
        hlg0 hlg0Var = new hlg0();
        hlg0Var.a = z;
        hlg0Var.b = new HashSet(c(b));
        HashSet hashSet = new HashSet(c(b2));
        hlg0Var.c = hashSet;
        return new ilg0(hlg0Var.a, hlg0Var.b, hashSet);
    }

    public static String[] b(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            sgb1.g(5, "QuirkSettingsLoader");
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException unused) {
            sgb1.g(5, "QuirkSettingsLoader");
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashSet c(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException unused) {
                sgb1.g(5, "QuirkSettingsLoader");
            }
            if (glg0.class.isAssignableFrom(cls)) {
                if (cls == null) {
                    hashSet.add(cls);
                }
            } else {
                sgb1.g(5, "QuirkSettingsLoader");
                cls = null;
                if (cls == null) {
                }
            }
        }
        return hashSet;
    }

    @Override // defpackage.ims
    /* renamed from: apply */
    public final Object mo104apply(Object obj) {
        Context context = (Context) obj;
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) MetadataHolderService.class), 640).metaData;
            if (bundle != null) {
                return a(context, bundle);
            }
            sgb1.g(5, "QuirkSettingsLoader");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            sgb1.g(3, "QuirkSettingsLoader");
            return null;
        }
    }
}
