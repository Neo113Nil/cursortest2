package xsna;

import android.content.Context;
import com.vk.core.files.PrivateSubdir;
import java.io.File;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dgd0 implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PrivateSubdir privateSubdir = (PrivateSubdir) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        Context context = ((zfd0) obj).a;
        return booleanValue ? zfd0.c(context.getFilesDir(), privateSubdir) : new File(context.getFilesDir(), privateSubdir.i());
    }
}
