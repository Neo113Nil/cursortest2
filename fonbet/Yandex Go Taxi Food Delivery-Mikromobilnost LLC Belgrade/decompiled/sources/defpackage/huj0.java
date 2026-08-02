package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class huj0 implements r430 {
    public final /* synthetic */ int a;
    public final Resources b;

    public /* synthetic */ huj0(Resources resources, int i) {
        this.a = i;
        this.b = resources;
    }

    @Override // defpackage.r430
    public final q430 a(ul40 ul40Var) {
        int i = this.a;
        Resources resources = this.b;
        switch (i) {
            case 0:
                return new s93(resources, ul40Var.c(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new s93(resources, ul40Var.c(Uri.class, InputStream.class));
            default:
                return new s93(resources, cz11.a);
        }
    }
}
