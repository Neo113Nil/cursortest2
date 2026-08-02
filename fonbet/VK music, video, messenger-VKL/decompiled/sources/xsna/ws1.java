package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: AlfaSettings.kt */
/* loaded from: classes4.dex */
public class ws1 {
    public final String a;
    public final String b;
    public final String c;

    public ws1(Context context, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = er.a(str3).authority(context.getString(R.string.vk_alfa_deeplink_host)).build().toString();
    }
}
