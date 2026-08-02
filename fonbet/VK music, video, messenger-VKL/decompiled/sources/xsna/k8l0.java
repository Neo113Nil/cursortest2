package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.StickerSuggestion;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.kcl0;

/* compiled from: StickerWordsWindow.kt */
/* loaded from: classes6.dex */
public final class k8l0 implements n0q0 {
    public final kcl0.e b;
    public final StickerStockItemWithStickerId c;
    public final List<StickerSuggestion> d;
    public final View e;
    public final a f;
    public final u390 g;
    public final g8l0 h;

    /* compiled from: StickerWordsWindow.kt */
    public interface a {
        void a(int i);
    }

    public k8l0(Context context, kcl0.e eVar, StickerStockItemWithStickerId stickerStockItemWithStickerId, List<StickerSuggestion> list, View view, a aVar) {
        this.b = eVar;
        this.c = stickerStockItemWithStickerId;
        this.d = list;
        this.e = view;
        this.f = aVar;
        g8l0 g8l0Var = new g8l0();
        g8l0Var.x0(u4l0.class, new d230(14));
        g8l0Var.x0(kxu.class, new dl70(16));
        g8l0Var.x0(rux0.class, new nl30(this, 28));
        g8l0Var.x0(vn0.class, new ie90(this, 17));
        this.h = g8l0Var;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context);
        flexboxLayoutManager.J(1);
        if (flexboxLayoutManager.d != 0) {
            flexboxLayoutManager.d = 0;
            flexboxLayoutManager.requestLayout();
        }
        flexboxLayoutManager.H(0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.sticker_suggest_list, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        View findViewById = inflate.findViewById(R.id.shadow_view);
        View findViewById2 = inflate.findViewById(R.id.background);
        View findViewById3 = inflate.findViewById(R.id.separator);
        jjc.g(inflate.findViewById(R.id.close), new nt10(this, 28));
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setAdapter(g8l0Var);
        recyclerView.setClipToPadding(false);
        recyclerView.setPadding(cn70.b(16), 0, cn70.b(16), cn70.b(16));
        recyclerView.addOnScrollListener(new z2p0(findViewById2, findViewById, findViewById3));
        u390 u390Var = new u390(inflate, this);
        this.g = u390Var;
        u390Var.d = new PopupWindow.OnDismissListener() { // from class: xsna.j8l0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                k8l0 k8l0Var = k8l0.this;
                int i = k8l0Var.c.c;
                k8l0Var.b.d(i);
                k8l0Var.f.a(i);
            }
        };
    }

    public final void a(List<StickerSuggestion> list) {
        g8l0 g8l0Var = this.h;
        g8l0Var.getClass();
        StickerStockItemWithStickerId stickerStockItemWithStickerId = this.c;
        int i = stickerStockItemWithStickerId.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new u4l0(stickerStockItemWithStickerId));
        List<StickerSuggestion> list2 = list;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (!((StickerSuggestion) obj).d) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new kxu(R.string.sticker_details_overlay_general_suggests));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new rux0(i, (StickerSuggestion) it.next()));
            }
        }
        boolean z = stickerStockItemWithStickerId.b.h && ((StickerItem) stickerStockItemWithStickerId.d.getValue()).h;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (((StickerSuggestion) obj2).d) {
                arrayList3.add(obj2);
            }
        }
        if (!arrayList3.isEmpty() || (z && arrayList2.isEmpty())) {
            arrayList.add(new kxu(R.string.sticker_details_overlay_user_suggests));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList.add(new rux0(i, (StickerSuggestion) it2.next()));
            }
        }
        if (z) {
            arrayList.add(new vn0(i, list));
        }
        g8l0Var.setItems(arrayList);
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
