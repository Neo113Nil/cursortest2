package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.go.taxi.order.chat.ui.chat.b;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class g3y0 extends b {
    public final int S;
    public final TextView T;
    public final TextView U;

    public g3y0(View view, int i) {
        super(view);
        this.S = i;
        int i2 = n8h0.time;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.T = (TextView) ((View) rp31.d(view, i2));
        this.U = (TextView) ((View) rp31.d(view, n8h0.message_text));
    }

    @Override // com.yandex.go.taxi.order.chat.ui.chat.b
    public final void W(jv10 jv10Var, Consumer consumer) {
        hv10 hv10Var = (hv10) jv10Var;
        super.W(hv10Var, consumer);
        String str = hv10Var.D;
        TextView textView = this.U;
        textView.setText(str);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        float measureText = textView.getPaint().measureText((CharSequence) str, 0, str.length());
        int i = this.S;
        if (measureText <= i) {
            i = -2;
        }
        layoutParams.width = i;
        textView.setLayoutParams(layoutParams);
        this.a.setContentDescription(((Object) this.T.getText()) + Extension.FIX_SPACE + ((Object) textView.getText()));
    }

    @Override // com.yandex.go.taxi.order.chat.ui.chat.b
    public final View X() {
        return this.U;
    }
}
