package xsna;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import kotlin.NoWhenBranchMatchedException;
import xsna.xlt;
import xsna.yo60;

/* compiled from: GeoPostsEventsHandler.kt */
/* loaded from: classes4.dex */
public final class jlt {
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(flt fltVar, FragmentImpl fragmentImpl, Activity activity, RecyclerView recyclerView, xlt xltVar) {
        mo60 mo60Var = fltVar.a;
        if (!(xltVar instanceof xlt.a)) {
            throw new NoWhenBranchMatchedException();
        }
        yo60 yo60Var = ((xlt.a) xltVar).a;
        if (!(yo60Var instanceof yo60.j)) {
            ((fq60) mo60Var.v.getValue()).b(mo60Var, fragmentImpl, activity, recyclerView, yo60Var);
            return;
        }
        fq60 fq60Var = (fq60) mo60Var.v.getValue();
        gq60 gq60Var = mo60Var.i0;
        fq60Var.getClass();
        fq60.c((yo60.j) yo60Var, gq60Var);
        s3q0 s3q0Var = s3q0.a;
    }
}
