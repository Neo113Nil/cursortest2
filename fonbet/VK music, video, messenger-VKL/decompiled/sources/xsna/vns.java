package xsna;

import android.content.Context;
import android.util.Size;
import com.vkontakte.android.R;
import kotlin.Lazy;
import xsna.ikv0;

/* compiled from: FriendsCleanupSnackbars.kt */
/* loaded from: classes15.dex */
public final class vns {
    public final Object a;

    public vns(Lazy<? extends zvm0> lazy) {
        this.a = lazy;
    }

    public static void a(Context context, String str) {
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        aVar.n();
    }
}
