package xsna;

import android.content.Context;
import com.google.firebase.FirebaseCommonRegistrar;
import xsna.v2z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bir implements v2z.a {
    @Override // xsna.v2z.a
    public final String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }
}
