package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.input.g;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.chat.input.textsuggest.d;

/* loaded from: classes15.dex */
public final class pty0 extends x0 {
    public final g N;
    public final InputTextController O;
    public final d P;
    public final TextView Q;

    public pty0(View view, g gVar, InputTextController inputTextController, d dVar) {
        super(view);
        this.N = gVar;
        this.O = inputTextController;
        this.P = dVar;
        this.Q = (TextView) view.findViewById(e9h0.text_suggest_shown_name);
    }
}
