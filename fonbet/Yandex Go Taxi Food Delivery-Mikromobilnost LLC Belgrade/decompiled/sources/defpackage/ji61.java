package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.play.integrity.internal.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ji61 {
    public final sa81 a;
    public final String b;
    public final vms c;
    public final e d;

    public ji61(Context context, sa81 sa81Var, vms vmsVar) {
        this.b = context.getPackageName();
        this.a = sa81Var;
        this.c = vmsVar;
        sa81 sa81Var2 = di61.a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr != null && (signatureArr.length) != 0) {
                    for (Signature signature : signatureArr) {
                        String a = u3a1.a(signature.toByteArray());
                        if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a)) {
                            String str = Build.TAGS;
                            if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a)) {
                            }
                        }
                        this.d = new e(context, sa81Var, mi61.a);
                        return;
                    }
                }
                sa81 sa81Var3 = di61.a;
                Object[] objArr = new Object[0];
                sa81Var3.getClass();
                if (Log.isLoggable("PlayCore", 5)) {
                    sa81.b(sa81Var3.a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr2 = new Object[0];
        sa81Var.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", sa81.b(sa81Var.a, "Phonesky is not installed.", objArr2));
        }
        this.d = null;
    }

    public static /* bridge */ /* synthetic */ Bundle a(ji61 ji61Var, byte[] bArr, Long l) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ji61Var.b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        ArrayList arrayList = new ArrayList();
        u7a1.f(arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(u7a1.e(arrayList)));
        return bundle;
    }
}
