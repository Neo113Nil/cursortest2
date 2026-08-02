package xsna;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: snapshot.kt */
/* loaded from: classes4.dex */
public final class pak0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, android.graphics.Bitmap] */
    public static final Bitmap a(jio jioVar, int i, int i2) {
        gak0 gak0Var = gak0.b;
        pb7 pb7Var = gak0.c;
        pb7Var.a(i, i2);
        gak0.d.a(i, i2);
        gak0Var.clear();
        jioVar.a(gak0Var);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        pb7Var.b();
        Bitmap bitmap = pb7Var.a;
        if (bitmap != null) {
            ref$ObjectRef.element = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            s3q0 s3q0Var = s3q0.a;
        }
        return (Bitmap) ref$ObjectRef.element;
    }
}
