package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.iv0;

/* compiled from: AdsCarouselHolderHelper.kt */
/* loaded from: classes4.dex */
public final class jv0 {
    public final View a;
    public final View b;
    public final boolean c;
    public final RecyclerView d;
    public final int f;
    public final ev0 e = new ev0();
    public final Object g = msy.a(LazyThreadSafetyMode.NONE, new z4(this, 2));

    public jv0(ViewGroup viewGroup, View view, Resources resources, boolean z) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = (RecyclerView) view.findViewById(R.id.recycler_items);
        this.f = resources.getDimensionPixelSize(R.dimen.post_ad_block_item_size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(u1c0 u1c0Var, iv0.a aVar) {
        ol60 ol60Var = u1c0Var.h;
        int intValue = !this.c ? ((Number) this.g.getValue()).intValue() : this.f;
        if (ol60Var instanceof wt9) {
            List<ShitAttachment.Card> list = ((wt9) ol60Var).h;
            ev0 ev0Var = this.e;
            ArrayList arrayList = ev0Var.c;
            arrayList.clear();
            List<ShitAttachment.Card> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                arrayList.addAll(list2);
            }
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ShitAttachment.Card card = (ShitAttachment.Card) it.next();
                    if (myc0.f(card.f) || myc0.f(card.n)) {
                        break;
                    }
                }
            }
            ev0Var.d = intValue;
            ev0Var.e = (wf0) aVar;
            boolean z = false;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((ShitAttachment.Card) it2.next()).r) {
                        z = true;
                        break;
                    }
                }
            }
            ev0Var.f = z;
            ev0Var.notifyDataSetChanged();
        }
    }

    public final void b(Context context, View.OnClickListener onClickListener) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        RecyclerView recyclerView = this.d;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.e);
        int b = cn70.b(12);
        int b2 = cn70.b(8);
        recyclerView.addItemDecoration(new v98(b, b2, b2, true));
        f4m.v(cn70.b(4), recyclerView);
        this.b.setOnClickListener(onClickListener);
    }
}
