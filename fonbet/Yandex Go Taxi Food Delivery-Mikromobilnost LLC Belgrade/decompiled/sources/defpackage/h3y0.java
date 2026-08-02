package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.go.taxi.order.chat.ui.chat.b;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h3y0 extends b {
    public final int S;
    public final TextView T;
    public final View U;
    public final TextView V;
    public final TextView W;

    public h3y0(View view, int i) {
        super(view);
        this.S = i;
        int i2 = n8h0.time;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.T = (TextView) ((View) rp31.d(view, i2));
        this.U = (View) rp31.d(view, n8h0.content);
        this.V = (TextView) ((View) rp31.d(view, n8h0.translated_message_text));
        this.W = (TextView) ((View) rp31.d(view, n8h0.original_message_text));
    }

    @Override // com.yandex.go.taxi.order.chat.ui.chat.b
    public final void W(jv10 jv10Var, Consumer consumer) {
        iv10 iv10Var = (iv10) jv10Var;
        super.W(iv10Var, consumer);
        String str = iv10Var.E;
        TextView textView = this.V;
        textView.setText(str);
        String str2 = iv10Var.D;
        TextView textView2 = this.W;
        textView2.setText(str2);
        View view = this.U;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        float max = Math.max(textView2.getPaint().measureText((CharSequence) str2, 0, str2.length()), textView.getPaint().measureText((CharSequence) str, 0, str.length()));
        int i = this.S;
        if (max <= i) {
            i = -2;
        }
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
        view.setContentDescription(((Object) this.T.getText()) + Extension.FIX_SPACE + ((Object) textView.getText()) + Extension.FIX_SPACE + ((Object) textView2.getText()));
    }

    @Override // com.yandex.go.taxi.order.chat.ui.chat.b
    public final View X() {
        return this.U;
    }
}
