package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.fave.entities.FaveEntry;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ikv0;
import xsna.xoq;

/* compiled from: FaveFeedFragment.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class toq implements iyp, g0t {
    public final /* synthetic */ eoq b;

    public toq(eoq eoqVar) {
        this.b = eoqVar;
    }

    @Override // xsna.iyp
    public final void a(pk50 pk50Var) {
        FragmentImpl fragmentImpl;
        RecyclerView recyclerView;
        Activity activity;
        xoq xoqVar = (xoq) pk50Var;
        boolean z = xoqVar instanceof xoq.a;
        eoq eoqVar = this.b;
        gmq gmqVar = null;
        if (!z) {
            eoqVar.getClass();
            if (xoqVar instanceof xoq.c) {
                if (eoqVar.b.get() != null && eoqVar.c.get() != null) {
                    throw null;
                }
                return;
            }
            if (!(xoqVar instanceof xoq.b)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = eoqVar.b.get();
            if (context == null || (fragmentImpl = eoqVar.c.get()) == null) {
                return;
            }
            String string = context.getString(R.string.post_action_sb_report_sent);
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = ikv0.c.f.a;
            aVar.u = new ikv0.d(string, (String) null, (ikv0.d.a) null, 6);
            aVar.e = 4000L;
            ikv0 f = pkv0.f(aVar);
            if (f != null) {
                pkv0.b(f, fragmentImpl);
                return;
            }
            return;
        }
        bin0<FragmentImpl> bin0Var = eoqVar.c;
        mo60 mo60Var = eoqVar.a;
        FragmentImpl fragmentImpl2 = bin0Var.get();
        if (fragmentImpl2 == null || (recyclerView = eoqVar.d.get()) == null || (activity = eoqVar.e.get()) == null) {
            return;
        }
        xoq.a aVar2 = (xoq.a) xoqVar;
        yo60 yo60Var = aVar2.a;
        if (!(yo60Var instanceof up60)) {
            ((fq60) eoqVar.f.getValue()).b(mo60Var, fragmentImpl2, activity, recyclerView, aVar2.a);
            return;
        }
        up60 up60Var = (up60) yo60Var;
        Parcelable parcelable = up60Var.a;
        if (parcelable instanceof Post) {
            gmqVar = (gmq) parcelable;
        } else if (parcelable instanceof FaveEntry) {
            gmqVar = ((FaveEntry) parcelable).i.f;
        }
        gmq gmqVar2 = gmqVar;
        if (gmqVar2 == null) {
            return;
        }
        gd60.X0(hd60.a(), activity, gmqVar2, new pqq(null, (String) ((AtomicReference) mo60Var.a.b).get(), null, up60Var.b, 5), new a73(4, eoqVar, up60Var), null, 48);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof iyp) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.b, eoq.class, "handle", "handle(Lcom/vk/newsfeed/impl/fave_feed/presentation/feature/FaveFeedMviEvent;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
