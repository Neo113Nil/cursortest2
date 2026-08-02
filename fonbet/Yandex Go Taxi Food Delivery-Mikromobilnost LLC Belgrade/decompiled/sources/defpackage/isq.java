package defpackage;

import com.yandex.go.feedback_common.data.model.QuestionInfo;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class isq {
    public final String a;
    public Boolean b;
    public List c;
    public List d;
    public wrq e;
    public boolean f;
    public TipsType g;
    public String h;
    public boolean i;
    public int j;
    public String k;
    public List l;

    public isq(String str, ksq ksqVar) {
        this(str);
        this.e = ksqVar.c;
        List list = ksqVar.b;
        this.c = list == null ? EmptyList.a : list;
        this.f = ksqVar.e;
        this.h = ksqVar.f;
        this.g = ksqVar.g;
        this.d = ksqVar.d;
        this.i = ksqVar.h;
        this.j = ksqVar.i;
        this.k = ksqVar.j;
        this.b = ksqVar.k;
        a(ksqVar.l);
    }

    public final void a(List list) {
        List list2 = this.l;
        if (list2 != null && list != null) {
            List list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (list.contains((QuestionInfo) it.next())) {
                        list = null;
                        break;
                    }
                }
            }
        }
        this.l = list;
    }

    public isq(String str) {
        this.a = str;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = wrq.f;
        this.g = TipsType.PERCENT;
    }
}
