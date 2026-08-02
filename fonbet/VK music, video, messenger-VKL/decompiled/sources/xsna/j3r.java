package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.vk.accountmanager.di.AccountManagerComponent;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class j3r implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ j3r(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Drawable a = m33.a(R.drawable.bg_rounded_elevation_no_fill_16, this.c);
                if (a instanceof NinePatchDrawable) {
                    return (NinePatchDrawable) a;
                }
                return null;
            case 1:
                return this.c.getString(R.string.vkim_msg_list_time_yesterday);
            default:
                return ((AccountManagerComponent) m7m.e().a(fpf0.a(AccountManagerComponent.class))).c();
        }
    }
}
