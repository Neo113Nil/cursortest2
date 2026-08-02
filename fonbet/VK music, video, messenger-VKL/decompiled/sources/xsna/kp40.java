package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kp40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ kp40(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                lyd.g().i(this.c);
                return s3q0.a;
            case 1:
                return hd60.a().c1(this.c);
            default:
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable a = m33.a(R.drawable.vk_icon_donut_color_12, this.c);
                if (a != null) {
                    spannableStringBuilder.append((CharSequence) "⭐");
                    spannableStringBuilder.setSpan(new zs1(a), 0, spannableStringBuilder.length(), 33);
                }
                return spannableStringBuilder;
        }
    }

    public /* synthetic */ kp40(lp40 lp40Var, Context context) {
        this.b = 0;
        this.c = context;
    }
}
