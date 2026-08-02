package xsna;

import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.collections.builders.ListBuilder;
import okhttp3.l;
import xsna.usn;

/* compiled from: DohProviders.kt */
/* loaded from: classes2.dex */
public final class ovn {

    /* compiled from: DohProviders.kt */
    public static final class a extends RuntimeException {
    }

    public static InetAddress a(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (UnknownHostException e) {
            throw new a(e);
        }
    }

    public static final ListBuilder b(okhttp3.o oVar) {
        ListBuilder e = e43.e();
        usn.a aVar = new usn.a();
        aVar.a = oVar;
        l.a aVar2 = new l.a();
        aVar2.e(null, "https://dns.google/dns-query");
        aVar.b = aVar2.b();
        aVar.d = rl3.u0(new InetAddress[]{a("8.8.4.4"), a("8.8.8.8")});
        e.add(aVar.a());
        usn.a aVar3 = new usn.a();
        aVar3.a = oVar;
        l.a aVar4 = new l.a();
        aVar4.e(null, "https://common.dot.dns.yandex.net/dns-query");
        aVar3.b = aVar4.b();
        aVar3.d = rl3.u0(new InetAddress[]{a("77.88.8.8"), a("77.88.8.1")});
        e.add(aVar3.a());
        usn.a aVar5 = new usn.a();
        aVar5.a = oVar;
        l.a aVar6 = new l.a();
        aVar6.e(null, "https://1.1.1.1/dns-query");
        aVar5.b = aVar6.b();
        aVar5.d = rl3.u0(new InetAddress[]{a("1.1.1.1"), a("1.0.0.1")});
        aVar5.c = false;
        e.add(aVar5.a());
        usn.a aVar7 = new usn.a();
        aVar7.a = oVar;
        l.a aVar8 = new l.a();
        aVar8.e(null, "https://1.1.1.1/dns-query");
        aVar7.b = aVar8.b();
        aVar7.c = false;
        e.add(aVar7.a());
        return e.g();
    }
}
