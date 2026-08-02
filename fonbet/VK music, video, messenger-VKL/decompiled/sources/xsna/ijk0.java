package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import java.util.Iterator;

/* compiled from: SpecialEventIconSwitcher.kt */
/* loaded from: classes.dex */
public final class ijk0 {
    public final Context a;
    public final hjk0 b;
    public final v1v0 c;
    public final hd60 d = new hd60();

    public ijk0(Context context, hjk0 hjk0Var, v1v0 v1v0Var) {
        this.a = context;
        this.b = hjk0Var;
        this.c = v1v0Var;
    }

    public final void a(String str) {
        Object obj;
        Preference.C("__launcher_event_icon_change__", "__from_non_special_launcher_name__");
        Preference.C("__launcher_event_icon_change__", "__to_special_launcher_name__");
        Preference.I("__launcher_event_icon_change__", "__last_feature_availability__", false);
        Iterator<T> it = this.c.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((ymy) obj).e().name(), str)) {
                    break;
                }
            }
        }
        ymy ymyVar = (ymy) obj;
        Context context = this.a;
        if (ymyVar != null) {
            bny.a.getClass();
            bny.a(context, ymyVar.e());
        } else {
            bny.a.getClass();
            v1v0 v1v0Var = bny.i;
            bny.a(context, (v1v0Var != null ? v1v0Var : null).d);
        }
    }
}
