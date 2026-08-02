package xsna;

import android.content.Context;
import com.vk.superapp.multiaccount.api.UserSecurityStatus;
import com.vkontakte.android.R;
import xsna.b3i0;

/* compiled from: ProfileContentDescriptionHelper.kt */
/* loaded from: classes6.dex */
public final class bvd0 {
    public final Context a;
    public final jzq0 b;

    public bvd0(Context context, jzq0 jzq0Var) {
        this.a = context;
        this.b = jzq0Var;
    }

    public final String a(com.vk.superapp.multiaccount.api.f fVar) {
        String str;
        boolean d = fVar.a().d();
        str = "";
        Integer num = null;
        Context context = this.a;
        if (d) {
            String str2 = fVar.a().c;
            fVar.a().l.getClass();
            this.b.getClass();
        } else {
            String str3 = fVar.a().e;
            String string = (str3 == null || str3.length() == 0) ? null : context.getString(R.string.vk_auth_phone_end_of_number_talkback, erm0.E0(2, str3));
            StringBuilder sb = new StringBuilder();
            sb.append(fVar.a().c);
            sb.append(string != null ? string : "");
            str = sb.toString();
        }
        UserSecurityStatus.a aVar = UserSecurityStatus.Companion;
        Integer num2 = fVar.a().j;
        aVar.getClass();
        int i = b3i0.a.$EnumSwitchMapping$0[UserSecurityStatus.a.a(num2).ordinal()];
        if (i == 1) {
            num = Integer.valueOf(R.string.vk_auth_has_recommendations_on_protection);
        } else if (i == 2) {
            num = Integer.valueOf(R.string.vk_auth_protect_your_account);
        }
        if (num == null) {
            return str;
        }
        StringBuilder e = fw3.e(str);
        e.append(context.getString(num.intValue()));
        return e.toString();
    }
}
