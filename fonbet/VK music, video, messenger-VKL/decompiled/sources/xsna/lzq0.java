package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: ScopeType.kt */
/* loaded from: classes6.dex */
public final class lzq0 extends czi {
    public final String c;
    public final String d;

    public lzq0(String str) {
        super(8);
        this.c = str;
        this.d = "user";
    }

    @Override // xsna.czi
    public final String i(Context context) {
        return context.getString(R.string.vk_apps_request_access_title, this.c);
    }

    @Override // xsna.czi
    public final String k() {
        return this.d;
    }
}
