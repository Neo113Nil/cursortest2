package defpackage;

import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto;
import ru.yandex.taxi.requirements.models.net.experiment.c;

/* loaded from: classes14.dex */
public final class bqj0 {
    public final dqe0 a;
    public final zuj0 b;

    public bqj0(dqe0 dqe0Var, zuj0 zuj0Var) {
        this.a = dqe0Var;
        this.b = zuj0Var;
    }

    public static String a(bqj0 bqj0Var, c cVar, RequirementBubbleDto requirementBubbleDto, String str, String str2, int i) {
        List list;
        je70 b;
        if ((i & 8) != 0) {
            str2 = "";
        }
        boolean z = (i & 16) != 0;
        bqj0Var.getClass();
        if (requirementBubbleDto != null) {
            String str3 = z ? requirementBubbleDto.b : requirementBubbleDto.d;
            if (d6z.Z(cVar, str3)) {
                return d6z.Y(cVar, str3);
            }
        }
        if (str2.length() == 0) {
            return bqj0Var.d(str);
        }
        Zone c = bqj0Var.a.c();
        if (c == null || (list = c.k) == null) {
            list = EmptyList.a;
        }
        Iterator it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                return null;
            }
            Iterator it2 = ((ZoneTariffInfo) it.next()).o.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (jl40.l(((ru.yandex.taxi.requirements.models.net.c) next).c, str)) {
                    obj = next;
                    break;
                }
            }
            ru.yandex.taxi.requirements.models.net.c cVar2 = (ru.yandex.taxi.requirements.models.net.c) obj;
            if (cVar2 != null && (b = cVar2.b(str2)) != null) {
                return b.a;
            }
        }
    }

    public final String b(c cVar, RequirementBubbleDto requirementBubbleDto, String str) {
        String str2 = requirementBubbleDto.e;
        if (str2 != null) {
            return d6z.Y(cVar, str2);
        }
        String Y = d6z.Y(cVar, requirementBubbleDto.b);
        if (evu0.J(Y)) {
            Y = null;
        }
        if (Y == null) {
            Y = d(str);
        }
        return c(Y);
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        int i = kyh0.supported_requirement_prefix;
        zuj0 zuj0Var = this.b;
        return oyr.q(((avj0) zuj0Var).h(kyh0.unsupported_requirement_suffix), " ", ((avj0) zuj0Var).h(i), " ", str);
    }

    public final String d(String str) {
        List list;
        ru.yandex.taxi.requirements.models.net.c cVar;
        Zone c = this.a.c();
        if (c == null || (list = c.k) == null) {
            list = EmptyList.a;
        }
        Iterator it = list.iterator();
        do {
            Object obj = null;
            if (!it.hasNext()) {
                return null;
            }
            Iterator it2 = ((ZoneTariffInfo) it.next()).o.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (jl40.l(((ru.yandex.taxi.requirements.models.net.c) next).c, str)) {
                    obj = next;
                    break;
                }
            }
            cVar = (ru.yandex.taxi.requirements.models.net.c) obj;
        } while (cVar == null);
        return cVar.a;
    }
}
