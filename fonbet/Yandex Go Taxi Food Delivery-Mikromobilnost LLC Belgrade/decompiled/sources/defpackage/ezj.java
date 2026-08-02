package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import kotlin.a;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes.dex */
public final class ezj implements ru00 {
    public final Context a;
    public final i3y b = a.a(new sbc(11, this));

    public ezj(Context context) {
        this.a = context;
    }

    @Override // defpackage.ru00
    public final Object getHeaders(Continuation continuation) {
        String str;
        int i;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("x-device-has-hinge", (String) this.b.getValue());
        Context context = this.a;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        mapBuilder.put("x-device-display", displayMetrics.widthPixels + RemoteBioParameters.X + displayMetrics.heightPixels + "@" + d6z.E(displayMetrics.density));
        String E = d6z.E(context.getResources().getDisplayMetrics().density / fzj.a);
        String E2 = d6z.E(context.getResources().getConfiguration().fontScale);
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getResources().getConfiguration().fontWeightAdjustment;
            str = String.valueOf(i);
        } else {
            str = "none";
        }
        mapBuilder.put("x-device-display-multiplicators", oyr.q(E, ";", E2, ";", str));
        return mapBuilder.j();
    }
}
