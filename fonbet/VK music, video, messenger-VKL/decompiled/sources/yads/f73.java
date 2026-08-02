package yads;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes10.dex */
public final class f73 extends ll3 {
    public f73(TextView textView) {
        super(textView);
    }

    @Override // yads.ll3
    public final void a(View view) {
        TextView textView = (TextView) view;
        textView.setText("");
        textView.setVisibility(8);
        textView.setOnClickListener(null);
        textView.setOnTouchListener(null);
        textView.setSelected(false);
    }

    @Override // yads.ll3
    public final void b(View view, Object obj) {
        ((TextView) view).setText((String) obj);
    }

    @Override // yads.ll3
    public final boolean a(View view, Object obj) {
        String str = (String) obj;
        CharSequence text = ((TextView) view).getText();
        if (text != null) {
            return String.valueOf(text).equalsIgnoreCase(str);
        }
        return false;
    }
}
