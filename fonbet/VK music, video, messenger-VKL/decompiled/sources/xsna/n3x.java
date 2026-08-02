package xsna;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: InputView.kt */
/* loaded from: classes17.dex */
public final class n3x extends LinearLayout {
    public final TextView b;
    public final TextView c;
    public final EditText d;
    public final TextView e;
    public final TextView f;
    public final TextView g;

    public n3x(Context context) {
        super(context, null, 0);
        setOrientation(1);
        View.inflate(context, R.layout.vk_alert_input, this);
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.message);
        this.d = (EditText) findViewById(R.id.input_text);
        this.e = (TextView) findViewById(R.id.ok_button);
        this.f = (TextView) findViewById(R.id.tv_positive_btn);
        this.g = (TextView) findViewById(R.id.tv_negative_btn);
    }

    public final TextView getButtonOk() {
        return this.e;
    }

    public final EditText getEtInput() {
        return this.d;
    }

    public final TextView getNegativeBtn() {
        return this.g;
    }

    public final TextView getPositiveBtn() {
        return this.f;
    }

    public final TextView getTvMessage() {
        return this.c;
    }

    public final TextView getTvTitle() {
        return this.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        TextView textView = this.c;
        CharSequence text = textView.getText();
        if (text == null || drm0.N(text)) {
            f4m.j(textView);
        }
        TextView textView2 = this.b;
        CharSequence text2 = textView2.getText();
        if (text2 == null || drm0.N(text2)) {
            f4m.j(textView2);
        }
        boolean f = f4m.f(textView);
        EditText editText = this.d;
        if (!f) {
            f4m.t(iah0.a(16), editText);
        } else if (f4m.f(textView2) && f4m.f(textView)) {
            f4m.t(0, editText);
        }
        super.onMeasure(i, i2);
    }
}
