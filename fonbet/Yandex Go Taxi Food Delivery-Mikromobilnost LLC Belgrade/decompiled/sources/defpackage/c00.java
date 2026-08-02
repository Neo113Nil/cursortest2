package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.directives.Button;

/* loaded from: classes15.dex */
public final class c00 extends RecyclerView.Adapter {
    public static final Button[] x = new Button[0];
    public final w3i a;
    public final ChatRequest b;
    public final w7b c;
    public Button[] w = x;

    public c00(w3i w3iVar, ChatRequest chatRequest, w7b w7bVar) {
        this.a = w3iVar;
        this.b = chatRequest;
        this.c = w7bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ez ezVar = (ez) x0Var;
        ezVar.O = this.b;
        ezVar.P = this.c;
        Button button = this.w[i];
        ezVar.R = button;
        ezVar.Q.setText(button.title);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ez(LayoutInflater.from(viewGroup.getContext()).inflate(olh0.msg_vh_chat_action, viewGroup, false), this.a);
    }
}
