package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class clj implements r430 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ clj(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.r430
    public final q430 a(ul40 ul40Var) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return new s93(context, this);
            case 1:
                return new s93(context, this);
            case 2:
                return new s93(context, this);
            case 3:
                return new lg10(context, 0);
            case 4:
                return new lg10(context, 1);
            case 5:
                return new lg10(context, 2);
            case 6:
                return new s93(context, ul40Var.c(Integer.class, AssetFileDescriptor.class));
            default:
                return new s93(context, ul40Var.c(Integer.class, InputStream.class));
        }
    }
}
