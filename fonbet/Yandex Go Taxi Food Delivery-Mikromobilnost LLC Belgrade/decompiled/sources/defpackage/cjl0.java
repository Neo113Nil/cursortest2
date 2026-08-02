package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import java.util.List;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes10.dex */
public final class cjl0 {
    public final ImmutableListMultimap.a a;

    public cjl0(String str, String str2, int i) {
        this();
        a(ExtFunctionsKt.HEADER_USER_AGENT, str);
        a("CSeq", String.valueOf(i));
        if (str2 != null) {
            a("Session", str2);
        }
    }

    public final void a(String str, String str2) {
        String a = djl0.a(str.trim());
        String trim = str2.trim();
        ImmutableListMultimap.a aVar = this.a;
        aVar.getClass();
        y5e.h(a, trim);
        niv nivVar = (niv) aVar.a().get(a);
        if (nivVar == null) {
            piv pivVar = ImmutableList.b;
            y5e.i(4, "expectedSize");
            nivVar = new ImmutableList.a(4);
            aVar.a().put(a, nivVar);
        }
        nivVar.c(trim);
    }

    public final void b(List list) {
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = tw21.a;
            String[] split = str.split(":\\s?", 2);
            if (split.length == 2) {
                a(split[0], split[1]);
            }
        }
    }

    public cjl0() {
        this.a = new ImmutableListMultimap.a();
    }
}
