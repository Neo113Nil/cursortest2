package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;

/* compiled from: AutoSuggestStickersPopupWindow.kt */
/* loaded from: classes5.dex */
public final class ik5 extends RecyclerView.n {
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int i = AutoSuggestStickersPopupWindow.I;
        rect.set(i, i, i, i);
    }
}
