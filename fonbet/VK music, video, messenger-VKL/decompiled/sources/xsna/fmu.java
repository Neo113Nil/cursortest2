package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: ScopeType.kt */
/* loaded from: classes6.dex */
public final class fmu extends czi {
    public String c;
    public final String d;

    public fmu(String str) {
        super(8);
        this.c = str;
        this.d = "group";
    }

    @Override // xsna.czi
    public final String i(Context context) {
        return context.getString(R.string.vk_apps_app_request_group_access_title, this.c);
    }

    @Override // xsna.czi
    public final String k() {
        return this.d;
    }
}
