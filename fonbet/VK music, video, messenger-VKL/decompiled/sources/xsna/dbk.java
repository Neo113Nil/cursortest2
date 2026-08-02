package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: CreatedContactErrorAlert.kt */
/* loaded from: classes2.dex */
public abstract class dbk extends dw20 {
    public static final /* synthetic */ int g1 = 0;
    public final int f1 = R.drawable.vk_icon_error_outline_28;

    /* compiled from: CreatedContactErrorAlert.kt */
    public static abstract class a extends dw20.a<a, dbk> {
        public final a e;

        public a(Context context) {
            super(context, null);
            this.e = this;
            D0(LayoutInflater.from(context).inflate(R.layout.vkim_error_modal, (ViewGroup) null, false), false);
            F0(true);
            u(0);
            x(0);
            q(true);
            p(true);
            I(true);
        }

        @Override // xsna.dw20.a
        public final a g() {
            return this.e;
        }
    }

    @Override // xsna.dw20
    public final void Nn(FrameLayout frameLayout) {
        ((TextView) frameLayout.findViewById(R.id.vkim_error_modal_title)).setText(ao());
        ((TextView) frameLayout.findViewById(R.id.vkim_error_modal_subtitle)).setText(Zn());
        TextView textView = (TextView) frameLayout.findViewById(R.id.vkim_error_modal_close);
        textView.setText(Yn());
        jjc.g(textView, new zqh(this, 4));
        ((ImageView) frameLayout.findViewById(R.id.vkim_error_modal_icon)).setImageResource(this.f1);
    }

    public abstract int Yn();

    public abstract int Zn();

    public abstract int ao();
}
