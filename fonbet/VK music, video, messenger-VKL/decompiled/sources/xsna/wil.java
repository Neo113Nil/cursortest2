package xsna;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Iterator;
import kotlin.Result;
import xsna.n6q0;

/* compiled from: DefaultModalDialogProvider.kt */
/* loaded from: classes3.dex */
public final class wil {
    public static final wil a = new wil();
    public static n6q0.b b;
    public static Boolean c;

    public static void a() {
        Object failure;
        f370 f370Var;
        try {
            n6q0.b bVar = b;
            if (bVar != null) {
                n6q0 n6q0Var = bVar.a;
                ViewParent parent = n6q0Var.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(n6q0Var);
                }
                failure = s3q0.a;
            } else {
                failure = null;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            d6q0.a.getClass();
            bxi bxiVar = d6q0.b;
            if (bxiVar != null && (f370Var = bxiVar.h) != null) {
                f370Var.n(a2);
            }
        }
        if (b != null) {
            d6q0.a.getClass();
            Iterator<ny1> it = d6q0.d.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            d6q0.a.getClass();
            bxi bxiVar2 = d6q0.b;
            if (bxiVar2 != null && !bxiVar2.s) {
                d6q0.c.e();
            }
        }
        c = null;
        b = null;
    }
}
