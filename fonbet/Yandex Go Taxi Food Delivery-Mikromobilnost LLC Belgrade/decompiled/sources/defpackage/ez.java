package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.core.net.entities.directives.Button;

/* loaded from: classes15.dex */
public final class ez extends x0 {
    public final w3i N;
    public ChatRequest O;
    public w7b P;
    public final TextView Q;
    public Button R;

    public ez(View view, w3i w3iVar) {
        super(view);
        this.N = w3iVar;
        TextView textView = (TextView) g8a1.e(e9h0.chat_action_text, view);
        this.Q = textView;
        textView.setOnClickListener(new tf(3, this));
    }
}
