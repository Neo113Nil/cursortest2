package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.chromium.net.NetError;

/* compiled from: RecyclerPaginatedViewExt.kt */
/* loaded from: classes6.dex */
public final class gjf0 {
    public static final int a(Context context, boolean z) {
        int i = context.getResources().getConfiguration().screenWidthDp;
        return z ? iah0.a(Math.max(64.0f, (i + NetError.ERR_DNS_MALFORMED_RESPONSE) / 2.0f)) : iah0.a(Math.max(16.0f, (i - 924) / 2.0f));
    }

    public static void b(RecyclerPaginatedView recyclerPaginatedView) {
        Context context = recyclerPaginatedView.getRecyclerView().getContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(context);
        Object adapter = recyclerPaginatedView.getRecyclerView().getAdapter();
        if (adapter instanceof pd90) {
            adapter = ((pd90) adapter).c;
        }
        kt9 kt9Var = new kt9(recyclerPaginatedView.getRecyclerView(), (mf7) adapter, !d);
        int a = iah0.a(2.0f);
        int a2 = iah0.a(3.0f);
        int a3 = d ? iah0.a(8.0f) : 0;
        kt9Var.i = a;
        kt9Var.j = a2;
        kt9Var.k = a3;
        kt9Var.l = 0;
        recyclerPaginatedView.setTag(R.id.vk_pending_decoration, kt9Var);
        wjf0.c(recyclerPaginatedView.getRecyclerView(), new fyd0(recyclerPaginatedView, 4));
        e(recyclerPaginatedView, recyclerPaginatedView.getRecyclerView().getContext(), 0, 10);
        if (d) {
            recyclerPaginatedView.setDecoration(new cjf0());
        }
    }

    public static final void c(RecyclerView recyclerView, Context context, boolean z, int i) {
        HashSet hashSet = iah0.a;
        int a = fnj.d(context) ? a(context, z) : 0;
        recyclerView.setPadding(a, i, a, 0);
    }

    public static /* synthetic */ void d(RecyclerView recyclerView, Context context, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        c(recyclerView, context, true, i);
    }

    public static void e(RecyclerPaginatedView recyclerPaginatedView, Context context, int i, int i2) {
        boolean z = (i2 & 2) == 0;
        if ((i2 & 4) != 0) {
            i = 0;
        }
        recyclerPaginatedView.getRecyclerView().setScrollBarStyle(33554432);
        recyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        c(recyclerPaginatedView.getRecyclerView(), context, z, i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.recyclerview.widget.RecyclerView$Adapter] */
    public static final void f(RecyclerPaginatedView recyclerPaginatedView, final int i, boolean z, final boolean z2, final boolean z3) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? adapter = recyclerPaginatedView.getRecyclerView().getAdapter();
        ref$ObjectRef.element = adapter;
        if (adapter instanceof pd90) {
            ref$ObjectRef.element = ((pd90) adapter).c;
        }
        final mf7 mf7Var = (mf7) ref$ObjectRef.element;
        Context context = recyclerPaginatedView.getContext();
        HashSet hashSet = iah0.a;
        final boolean d = fnj.d(context);
        oog0 oog0Var = new oog0(iah0.b(18.0f), iah0.a(8), new mf7() { // from class: xsna.djf0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.mf7
            public final int e0(int i2) {
                int e0 = mf7.this.e0(i2);
                boolean z4 = d;
                if (z4 && i != 0 && !z3) {
                    return e0;
                }
                if (i2 == 0) {
                    e0 = (e0 & (-3)) | 1;
                }
                RecyclerView.Adapter adapter2 = (RecyclerView.Adapter) ref$ObjectRef.element;
                if (!z2) {
                    if (e0 == 0) {
                        e0 = 1;
                    }
                    if (i2 == adapter2.getItemCount() - 1 && !z4) {
                        return (e0 & (-5)) | 1;
                    }
                }
                return e0;
            }
        });
        oog0Var.n = z;
        int i2 = 0;
        oog0Var.o = z2 || d;
        recyclerPaginatedView.setTag(R.id.vk_pending_decoration, oog0Var);
        wjf0.c(recyclerPaginatedView.getRecyclerView(), new ejf0(recyclerPaginatedView, i2));
        e(recyclerPaginatedView, recyclerPaginatedView.getContext(), i, 8);
        if (d) {
            recyclerPaginatedView.setDecoration(new cjf0());
        }
    }

    public static /* synthetic */ void g(RecyclerPaginatedView recyclerPaginatedView, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        f(recyclerPaginatedView, i, (i2 & 2) != 0, (i2 & 4) != 0, (i2 & 8) == 0);
    }
}
