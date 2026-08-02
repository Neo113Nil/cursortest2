package xsna;

import com.vk.dto.group.Group;
import xsna.dhd;

/* compiled from: CameraAuthorsExt.kt */
/* loaded from: classes14.dex */
public final class qf9 {
    public static final jjd a(dhd dhdVar) {
        if (dhdVar == null) {
            return null;
        }
        if (dhdVar instanceof dhd.a) {
            Group group = ((dhd.a) dhdVar).b;
            return new jjd(group.f, group.n0);
        }
        if (!(dhdVar instanceof dhd.c)) {
            return null;
        }
        cn cnVar = ((dhd.c) dhdVar).a.a;
        return new jjd(cnVar.c, cnVar.j);
    }
}
