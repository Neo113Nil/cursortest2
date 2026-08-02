package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.io.File;

/* loaded from: classes7.dex */
public final class e591 implements id91 {
    public final /* synthetic */ int a;
    public final s491 b;

    public /* synthetic */ e591(s491 s491Var, int i) {
        this.a = i;
        this.b = s491Var;
    }

    @Override // defpackage.id91
    public final Object zza() {
        String string;
        int i = this.a;
        s491 s491Var = this.b;
        switch (i) {
            case 0:
                Context context = s491Var.b.a;
                try {
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle == null || (string = bundle.getString("local_testing_dir")) == null) {
                        return null;
                    }
                    return new File(context.getExternalFilesDir(null), string);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            default:
                return new d991(s491Var.b.a);
        }
    }
}
