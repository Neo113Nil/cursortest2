package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: MarketBadgeButtonHolder.kt */
@ozl
/* loaded from: classes18.dex */
public final class qt00 {
    public final View a;
    public final TextView b;

    public qt00(int i, int i2, View view, izs izsVar) {
        this.a = view;
        ImageView imageView = (ImageView) view.findViewById(R.id.image_icon);
        TextView textView = (TextView) view.findViewById(R.id.text_badge);
        this.b = textView;
        view.setContentDescription(view.getContext().getString(i2));
        imageView.setImageResource(i);
        f4m.j(textView);
        view.setOnClickListener(izsVar != null ? new pt00(izsVar, 0) : null);
        awt0.o(view, new zqh(this, 27));
    }

    public final void a() {
        f4m.j(this.a);
    }

    public final void b(String str) {
        TextView textView = this.b;
        if (str == null || str.length() == 0) {
            f4m.j(textView);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    public final void c() {
        this.a.setVisibility(0);
    }
}
