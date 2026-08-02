package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: JoinCallErrorBottomSheet.kt */
/* loaded from: classes7.dex */
public final class izx extends dw20.b {
    public int e;
    public int f;
    public Integer g;

    public izx(Context context) {
        super(context, null);
        this.e = R.string.error;
        this.f = R.string.error;
    }

    public final dw20 S0() {
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.join_call_error_modal, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.vk_error_modal_title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.vk_error_modal_icon);
        TextView textView2 = (TextView) inflate.findViewById(R.id.vk_error_modal_subtitle);
        TextView textView3 = (TextView) inflate.findViewById(R.id.vk_error_modal_close);
        textView.setText(this.e);
        textView2.setText(this.f);
        Integer num = this.g;
        if (num != null) {
            imageView.setColorFilter(num.intValue());
        }
        D0(inflate, false);
        F0(true);
        u(0);
        x(0);
        q(true);
        p(true);
        I(true);
        dw20 a = a();
        jjc.f(new w16(a, 6), textView3);
        return a;
    }
}
