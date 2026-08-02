package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.dto.user.UserProfile;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.npf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class eqf implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eqf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.b) {
            case 0:
                opf opfVar = (opf) ((npf.c) this.c);
                return new utf(opfVar.b, opfVar.c);
            case 1:
                UserProfile userProfile = ((o1i) this.c).c.a;
                if (userProfile == null || (str = userProfile.h) == null) {
                    str = "";
                }
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                z9r0 z9r0Var = new z9r0(context);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                z9r0Var.setOnLoadCallback(new y9r0(z9r0Var, ref$ObjectRef, countDownLatch));
                pro0.c(new rm3(8, z9r0Var, str));
                countDownLatch.await();
                return (Bitmap) ref$ObjectRef.element;
            case 2:
                return Boolean.valueOf(((r0p0) this.c).b());
            default:
                File file = (File) this.c;
                if (!(tax.c(file) == null && tax.d(file) == null) && file.length() > 0) {
                    return file;
                }
                throw new Exception("Can't resolve this file " + file.getName());
        }
    }
}
