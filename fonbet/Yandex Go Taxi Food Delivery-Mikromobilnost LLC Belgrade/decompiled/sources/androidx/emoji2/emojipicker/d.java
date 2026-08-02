package androidx.emoji2.emojipicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.d2x;
import defpackage.d6w;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.ytn;
import defpackage.ztn;

/* loaded from: classes10.dex */
public final class d extends RecyclerView.g {
    public final /* synthetic */ ytn a;
    public final /* synthetic */ EmojiPickerView b;
    public final /* synthetic */ GridLayoutManager c;

    public d(ytn ytnVar, EmojiPickerView emojiPickerView, GridLayoutManager gridLayoutManager) {
        this.a = ytnVar;
        this.b = emojiPickerView;
        this.c = gridLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ztn ztnVar;
        boolean z;
        ztn ztnVar2;
        d2x d2xVar;
        tse tseVar;
        EmojiPickerView emojiPickerView = this.b;
        ztnVar = emojiPickerView.emojiPickerItems;
        if (ztnVar == null) {
            ztnVar = null;
        }
        GridLayoutManager gridLayoutManager = this.c;
        int H1 = gridLayoutManager.H1();
        int i3 = 0;
        for (d2x d2xVar2 : ztnVar.a) {
            if (H1 < d2xVar2.b()) {
                ytn ytnVar = this.a;
                int i4 = ytnVar.w;
                if (i3 != i4) {
                    ytnVar.notifyItemChanged(i4);
                    ytnVar.notifyItemChanged(i3);
                    ytnVar.w = i3;
                }
                z = emojiPickerView.recentNeedsRefreshing;
                if (z) {
                    ztnVar2 = emojiPickerView.emojiPickerItems;
                    if (ztnVar2 == null) {
                        ztnVar2 = null;
                    }
                    d2xVar = emojiPickerView.recentItemGroup;
                    if (d2xVar == null) {
                        d2xVar = null;
                    }
                    d6w d = ztnVar2.d(d2xVar);
                    int i5 = d.a;
                    int i6 = d.b;
                    int K1 = gridLayoutManager.K1();
                    if (i5 > K1 || K1 > i6) {
                        tseVar = emojiPickerView.scope;
                        tje.N(tseVar, null, null, new EmojiPickerView$showEmojiPickerView$1$2$3$onScrolled$1(emojiPickerView, null), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            H1 -= d2xVar2.b();
            i3++;
        }
        ny61.s();
    }
}
