package xsna;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.feed.core.models.discover.DiscoverMediaBlock;
import com.vk.feed.core.models.news.NewsEntry;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3n;
import xsna.yo60;

/* compiled from: DiscoverMediaEventsHandler.kt */
/* loaded from: classes4.dex */
public final class i3n {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public static void a(a3n a3nVar, FragmentImpl fragmentImpl, Activity activity, RecyclerView recyclerView, e3n e3nVar) {
        if (!(e3nVar instanceof e3n.a)) {
            throw new NoWhenBranchMatchedException();
        }
        yo60 yo60Var = ((e3n.a) e3nVar).a;
        if (yo60Var instanceof yo60.j) {
            pn0 pn0Var = a3nVar.o;
            fq60 fq60Var = (fq60) ((Lazy) pn0Var.a).getValue();
            gq60 gq60Var = (gq60) pn0Var.b;
            fq60Var.getClass();
            fq60.c((yo60.j) yo60Var, gq60Var);
            s3q0 s3q0Var = s3q0.a;
            return;
        }
        if (!(yo60Var instanceof yo60.e.C4117e)) {
            ((fq60) a3nVar.a.v.getValue()).b(a3nVar.a, fragmentImpl, activity, recyclerView, yo60Var);
            return;
        }
        c3n c3nVar = (c3n) a3nVar.m.getValue();
        yo60.e.C4117e c4117e = (yo60.e.C4117e) yo60Var;
        c3nVar.getClass();
        View view = c4117e.a;
        s1c0 s1c0Var = c4117e.e;
        if (c3nVar.d == null) {
            NewsEntry newsEntry = c4117e.c;
            DiscoverMediaBlock discoverMediaBlock = newsEntry instanceof DiscoverMediaBlock ? (DiscoverMediaBlock) newsEntry : null;
            boolean z = ((c4117e.b instanceof DiscoverMediaBlock) || discoverMediaBlock == null) ? false : true;
            boolean z2 = discoverMediaBlock != null;
            boolean z3 = s1c0Var.v || s1c0Var.w;
            view.getContext();
            if (z) {
                c3nVar.a(view);
            } else {
                c3nVar.a(null);
            }
            la60 la60Var = c3nVar.b;
            View view2 = c4117e.a;
            xm60 xm60Var = new xm60(c4117e.b, c4117e.c, null, true, z2, z, s1c0Var.o, ((BridgeComponent) c3nVar.e.getValue()).s().c(), z3, false, false, false, false, false, false, 129220);
            b3n b3nVar = new b3n(c3nVar, c4117e);
            wqf wqfVar = new wqf(c3nVar, 13);
            la60Var.getClass();
            c3nVar.d = la60.d(view2, xm60Var, b3nVar, wqfVar, null);
        }
        s3q0 s3q0Var2 = s3q0.a;
    }
}
