package xsna;

import android.content.Context;
import com.vk.android.launcher.icons.IconAlias;
import com.vk.core.apps.BuildInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.k1v0;

/* compiled from: VkLauncherIconList.kt */
/* loaded from: classes.dex */
public final class v1v0 {
    public final eu2 a;
    public final k1v0 b;
    public final bpn0 c;
    public final IconAlias d;
    public final IconAlias[] e;
    public final bpn0 f;

    public v1v0(eu2 eu2Var) {
        this.a = eu2Var;
        this.b = BuildInfo.o() ? k1v0.b.C3160b.a : k1v0.a.e.a;
        this.c = new bpn0(new sz2(this, 7));
        this.d = IconAlias.DefaultIcon;
        this.e = IconAlias.values();
        this.f = new bpn0(new bia(this, 10));
    }

    public final ymy a(Context context) {
        Object obj;
        Iterator<T> it = c().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            bny bnyVar = bny.a;
            IconAlias e = ((ymy) obj).e();
            bnyVar.getClass();
            if (bny.c(context, e)) {
                break;
            }
        }
        ymy ymyVar = (ymy) obj;
        return ymyVar == null ? this.b : ymyVar;
    }

    public final ArrayList b(Context context) {
        ArrayList arrayList = new ArrayList();
        for (IconAlias iconAlias : this.e) {
            bny.a.getClass();
            if (bny.c(context, iconAlias)) {
                arrayList.add(iconAlias);
            }
        }
        return arrayList;
    }

    public final List<ymy> c() {
        return (List) this.c.getValue();
    }
}
