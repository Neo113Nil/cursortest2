package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jmb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ jmb(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return new PorterDuffColorFilter(context.getColor(R.color.vk_black_alpha24), PorterDuff.Mode.SRC_ATOP);
            default:
                c63 c63Var = c63.a;
                Activity b = c63.b();
                return b != null ? b : context;
        }
    }
}
