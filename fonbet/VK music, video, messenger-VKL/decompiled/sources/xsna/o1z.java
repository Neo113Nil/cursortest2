package xsna;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: LegacyUpdatePaddingProfileRoundedCardAction.kt */
@ozl
/* loaded from: classes4.dex */
public final class o1z extends gux {
    public final RecyclerPaginatedView a;
    public final boolean b;

    public o1z(RecyclerPaginatedView recyclerPaginatedView, boolean z) {
        this.a = recyclerPaginatedView;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [T, androidx.recyclerview.widget.RecyclerView$Adapter] */
    @Override // xsna.gux
    public final void a() {
        int b = this.b ? cn70.b(8) : 0;
        final u9a u9aVar = new u9a(this, 2);
        log logVar = new log(9);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        RecyclerPaginatedView recyclerPaginatedView = this.a;
        ?? adapter = recyclerPaginatedView.getRecyclerView().getAdapter();
        ref$ObjectRef.element = adapter;
        if (adapter instanceof pd90) {
            ref$ObjectRef.element = ((pd90) adapter).c;
        }
        final mf7 mf7Var = (mf7) ref$ObjectRef.element;
        Context context = recyclerPaginatedView.getContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(context);
        recyclerPaginatedView.setTag(R.id.vk_pending_decoration, new kzd0(iah0.b(20.0f), iah0.a(8), new mf7() { // from class: xsna.fjf0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.mf7
            public final int e0(int i) {
                return ((Number) u9aVar.invoke(Integer.valueOf(mf7.this.e0(i)), Integer.valueOf(i), Integer.valueOf(((RecyclerView.Adapter) ref$ObjectRef.element).getItemCount()))).intValue();
            }
        }, logVar));
        wjf0.c(recyclerPaginatedView.getRecyclerView(), new jz70(recyclerPaginatedView, 17));
        gjf0.e(recyclerPaginatedView, recyclerPaginatedView.getContext(), b, 8);
        if (d) {
            recyclerPaginatedView.setDecoration(new cjf0());
        }
    }
}
