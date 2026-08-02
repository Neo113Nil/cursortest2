package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.review.internal.zzf;
import defpackage.atx0;
import defpackage.ega1;
import defpackage.faa1;
import defpackage.gaa1;
import defpackage.zfa1;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class b extends zfa1 {
    public final /* synthetic */ atx0 b;
    public final /* synthetic */ faa1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(faa1 faa1Var, atx0 atx0Var, atx0 atx0Var2) {
        super(atx0Var);
        this.b = atx0Var2;
        this.c = faa1Var;
    }

    @Override // defpackage.zfa1
    public final void a() {
        HashMap hashMap;
        try {
            faa1 faa1Var = this.c;
            zzf zzfVar = faa1Var.a.m;
            String str = faa1Var.b;
            Bundle bundle = new Bundle();
            HashMap hashMap2 = ega1.a;
            synchronized (ega1.class) {
                hashMap = ega1.a;
                hashMap.put("java", 20002);
            }
            bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
            if (hashMap.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
            }
            if (hashMap.containsKey(PluginErrorDetails.Platform.UNITY)) {
                bundle.putInt("playcore_unity_version", ((Integer) hashMap.get(PluginErrorDetails.Platform.UNITY)).intValue());
            }
            faa1 faa1Var2 = this.c;
            zzfVar.zzc(str, bundle, new zzh(faa1Var2, this.b, faa1Var2.b));
        } catch (RemoteException e) {
            faa1 faa1Var3 = this.c;
            gaa1 gaa1Var = faa1.c;
            Object[] objArr = {faa1Var3.b};
            gaa1Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", gaa1.c(gaa1Var.a, "error requesting in-app review for %s", objArr), e);
            }
            this.b.b(new RuntimeException(e));
        }
    }
}
