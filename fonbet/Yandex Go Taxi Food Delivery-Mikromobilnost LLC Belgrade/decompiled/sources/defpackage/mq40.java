package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes8.dex */
public final class mq40 {
    public static final mq40 f = new mq40(EmptyList.a, null, null, null, null);
    public final List a;
    public final String b;
    public final String c;
    public final FormattedText d;
    public final FormattedText e;

    public mq40(List list, String str, String str2, FormattedText formattedText, FormattedText formattedText2) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = formattedText;
        this.e = formattedText2;
    }

    public final wq40 a() {
        jr40 jr40Var = (jr40) a.R(this.a);
        if (jr40Var != null) {
            return (wq40) a.R(jr40Var.c);
        }
        return null;
    }

    public final wq40 b() {
        Object obj;
        Object obj2;
        Iterator it = this.a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((jr40) obj2).a.equals(this.b)) {
                break;
            }
        }
        jr40 jr40Var = (jr40) obj2;
        if (jr40Var == null) {
            return null;
        }
        Iterator it2 = jr40Var.c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((wq40) next).b().equals(this.c)) {
                obj = next;
                break;
            }
        }
        return (wq40) obj;
    }

    public final jr40 c(wq40 wq40Var) {
        Object obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (a.G(((jr40) obj).c, wq40Var)) {
                break;
            }
        }
        return (jr40) obj;
    }
}
