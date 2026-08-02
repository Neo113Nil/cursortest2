package defpackage;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.input.g;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.chat.input.textsuggest.d;

/* loaded from: classes15.dex */
public final class kty0 extends RecyclerView.Adapter {
    public final g a;
    public final InputTextController b;
    public final d c;
    public mty0 w;

    public kty0(g gVar, InputTextController inputTextController, d dVar) {
        this.a = gVar;
        this.b = inputTextController;
        this.c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        mty0 mty0Var = this.w;
        if (mty0Var != null) {
            return mty0Var.a.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        oty0 oty0Var;
        pty0 pty0Var = (pty0) x0Var;
        mty0 mty0Var = this.w;
        if (mty0Var == null || (oty0Var = (oty0) mty0Var.a.get(i)) == null) {
            return;
        }
        TextView textView = pty0Var.Q;
        textView.setText(oty0Var.a);
        textView.setOnClickListener(new tai0(29, pty0Var, oty0Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new pty0(g8a1.g(viewGroup, olh0.msg_vh_text_suggest_item_view), this.a, this.b, this.c);
    }
}
