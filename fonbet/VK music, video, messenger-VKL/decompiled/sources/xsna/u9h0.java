package xsna;

import android.content.Context;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vkontakte.android.R;

/* compiled from: SchoolsRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class u9h0 {
    public final Object a;
    public final Object b;

    public /* synthetic */ u9h0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public CharSequence a(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        ucp ucpVar = (ucp) this.b;
        String d = ((DisplayNameFormatter) this.a).d(dialog, profilesSimpleInfo);
        ucpVar.getClass();
        return ucp.i(d);
    }

    public edr0 b() {
        return (edr0) this.b;
    }

    public edr0 c() {
        return (edr0) this.a;
    }

    public u9h0(Context context) {
        this.a = new DisplayNameFormatter(null, 2, context.getString(R.string.vkim_loading));
        this.b = ucp.a;
    }
}
