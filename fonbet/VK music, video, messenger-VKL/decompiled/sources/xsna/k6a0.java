package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import com.vk.gallerypicker.configuration.SpoilerConfiguration;
import java.io.File;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: PhotoEditorDelegate.kt */
/* loaded from: classes4.dex */
public final class k6a0 {
    public final vfk a;
    public final g760 b;
    public com.vk.core.simplescreen.a c;
    public s4p d;
    public final h6a0 e = new h6a0(this);

    public k6a0(vfk vfkVar, g760 g760Var) {
        this.a = vfkVar;
        this.b = g760Var;
    }

    public static void a(final k6a0 k6a0Var, File file, Activity activity) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        k6a0Var.d = k6a0Var.b.c(file, new j6a0(), k6a0Var.e, k6a0Var.c, "", new qte(7), new SpoilerConfiguration(false, false, false, false, false, null, 63, null));
        com.vk.core.simplescreen.a aVar = k6a0Var.c;
        if (aVar == null) {
            aVar = new com.vk.core.simplescreen.a(activity, false, true);
            k6a0Var.c = aVar;
            aVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xsna.d6a0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    k6a0.this.d = null;
                }
            });
        }
        s4p s4pVar = k6a0Var.d;
        if (s4pVar != null) {
            k6a0Var.b.a(activity, s4pVar, aVar, new ig1(24, k6a0Var, ref$ObjectRef));
        }
    }
}
