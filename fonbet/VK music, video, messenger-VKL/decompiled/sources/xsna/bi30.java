package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vkontakte.android.R;
import xsna.ucp;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class bi30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ bi30(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return context.getString(R.string.vkim_msg_list_time_today);
            default:
                ucp ucpVar = ucp.a;
                ucp.b bVar = ucp.r;
                return bVar == null ? Preference.h(context, 0, "emoji") : bVar.provide();
        }
    }
}
