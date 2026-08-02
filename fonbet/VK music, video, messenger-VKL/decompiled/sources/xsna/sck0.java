package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: SnippetSectionItemView.kt */
/* loaded from: classes3.dex */
public final class sck0 extends RecyclerView.n {
    public final /* synthetic */ tck0 b;
    public final /* synthetic */ Ref$IntRef c;

    public sck0(tck0 tck0Var, Ref$IntRef ref$IntRef) {
        this.b = tck0Var;
        this.c = ref$IntRef;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        tck0 tck0Var = this.b;
        int y = (bwt0.y(R.dimen.music_snippet_track_margin, tck0Var) * 2) + bwt0.y(R.dimen.music_snippet_track_thumb_size, tck0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        Ref$IntRef ref$IntRef = this.c;
        if (childAdapterPosition == 0) {
            pVar.setMargins((ref$IntRef.element - y) / 2, 0, 0, 0);
            view.setLayoutParams(pVar);
            return;
        }
        if (recyclerView.getChildAdapterPosition(view) == (recyclerView.getAdapter() != null ? r6.getItemCount() : 0) - 1) {
            pVar.setMargins(0, 0, (ref$IntRef.element - y) / 2, 0);
            view.setLayoutParams(pVar);
        } else {
            pVar.setMargins(0, 0, 0, 0);
            view.setLayoutParams(pVar);
        }
    }
}
