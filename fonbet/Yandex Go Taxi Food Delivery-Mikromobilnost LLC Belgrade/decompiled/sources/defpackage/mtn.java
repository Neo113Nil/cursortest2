package defpackage;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.bricks.d;
import com.yandex.messaging.internal.view.input.emojipanel.EmojiView;
import com.yandex.messaging.internal.view.input.emojipanel.a;

/* loaded from: classes15.dex */
public final class mtn extends RecyclerView.Adapter {
    public final SharedPreferences a;
    public final a b;
    public tsn c;
    public ntn[] w;

    public mtn(SharedPreferences sharedPreferences, a aVar, ntn[] ntnVarArr) {
        this.w = ntnVarArr;
        this.a = sharedPreferences;
        this.b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.w[i].b ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        d dVar = (d) x0Var;
        if (!(dVar instanceof ktn)) {
            if (!(dVar instanceof ltn)) {
                vg10.g(dVar.getClass(), "No type ");
                return;
            }
            ltn ltnVar = (ltn) dVar;
            int i2 = this.w[i].d;
            TextView textView = ltnVar.R;
            ltnVar.c(textView.getResources().getString(i2));
            textView.setText(i2);
            return;
        }
        ktn ktnVar = (ktn) dVar;
        String str = this.w[i].c;
        ktnVar.c(str);
        ktnVar.S.close();
        EmojiView emojiView = ktnVar.R;
        emojiView.setData(null);
        ktnVar.S = ktnVar.T.b.a(ktnVar, str, (int) (emojiView.getResources().getDimension(gvg0.emoji_view_size) - (emojiView.getResources().getDimension(gvg0.emoji_view_padding) * 2.0f)));
        emojiView.setContentDescription(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new ktn(this, LayoutInflater.from(viewGroup.getContext()).inflate(olh0.msg_vh_emoji_list_item, viewGroup, false));
        }
        if (i == 1) {
            return new ltn(LayoutInflater.from(viewGroup.getContext()).inflate(olh0.msg_vh_emoji_list_title, viewGroup, false));
        }
        ny61.g(oyr.i(i, "No type "));
        return null;
    }
}
