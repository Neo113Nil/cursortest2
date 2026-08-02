package defpackage;

import android.net.Uri;
import android.widget.EditText;
import com.yandex.go.zone.dto.objects.RequirementOverrideDto;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class b4a1 {
    public static final Object a = new Object();
    public static final Object b = new Object();
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static final Object e = new Object();

    public static no71 a(x281 x281Var, String str, of81 of81Var, int i) {
        pl71 pl71Var = new pl71();
        pl71Var.a = Uri.parse(cia1.a(str, of81Var.c));
        pl71Var.c = of81Var.a;
        pl71Var.d = of81Var.b;
        x281Var.getClass();
        pl71Var.e = Uri.parse(cia1.a(((ik71) x281Var.b.get(0)).a, of81Var.c)).toString();
        pl71Var.f = i;
        cha1.b(pl71Var.a, "The uri must be set.");
        return new no71(pl71Var.a, 0L, null, pl71Var.b, pl71Var.c, pl71Var.d, pl71Var.e, pl71Var.f);
    }

    public static final boolean b(b580 b580Var, List list, String str) {
        Object obj;
        if (str == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((RequirementOverrideDto) obj).a, b580Var.a)) {
                break;
            }
        }
        RequirementOverrideDto requirementOverrideDto = (RequirementOverrideDto) obj;
        if (requirementOverrideDto == null) {
            return false;
        }
        List list2 = requirementOverrideDto.f;
        return (list2.isEmpty() || list2.contains(str)) ? false : true;
    }

    public static boolean c(EditText editText) {
        return editText.getInputType() != 0;
    }
}
