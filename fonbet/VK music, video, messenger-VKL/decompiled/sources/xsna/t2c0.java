package xsna;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import kotlin.NoWhenBranchMatchedException;
import xsna.d5c0;
import xsna.yo60;

/* compiled from: PostEventsHandler.kt */
/* loaded from: classes4.dex */
public final class t2c0 {
    public static void a(r1c0 r1c0Var, FragmentImpl fragmentImpl, Activity activity, RecyclerView recyclerView, d5c0 d5c0Var) {
        mo60 mo60Var = r1c0Var.a;
        if (d5c0Var instanceof d5c0.a) {
            yo60 yo60Var = ((d5c0.a) d5c0Var).a;
            if (!(yo60Var instanceof yo60.j)) {
                r1c0Var.a().b(mo60Var, fragmentImpl, activity, recyclerView, yo60Var);
                return;
            }
            fq60 a = r1c0Var.a();
            gq60 gq60Var = mo60Var.i0;
            a.getClass();
            fq60.c((yo60.j) yo60Var, gq60Var);
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (d5c0Var instanceof y4c0) {
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        if (d5c0Var instanceof z4c0) {
            s3q0 s3q0Var3 = s3q0.a;
            return;
        }
        if (d5c0Var instanceof x4c0) {
            s3q0 s3q0Var4 = s3q0.a;
            return;
        }
        if (d5c0Var instanceof b5c0) {
            s3q0 s3q0Var5 = s3q0.a;
            return;
        }
        if (d5c0Var instanceof a5c0) {
            s3q0 s3q0Var6 = s3q0.a;
            return;
        }
        if (d5c0Var instanceof e5c0) {
            s3q0 s3q0Var7 = s3q0.a;
        } else if (d5c0Var instanceof w4c0) {
            s3q0 s3q0Var8 = s3q0.a;
        } else {
            if (!(d5c0Var instanceof c5c0)) {
                throw new NoWhenBranchMatchedException();
            }
            s3q0 s3q0Var9 = s3q0.a;
        }
    }
}
