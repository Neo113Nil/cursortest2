package defpackage;

import com.yandex.go.places.impl.domain.interactors.b;
import java.time.ZonedDateTime;
import kotlin.random.Random;

/* loaded from: classes13.dex */
public final class c601 extends d601 {
    public static final c601 b = new c601("\\{browser_info\\}");

    @Override // defpackage.d601
    public final String a(br brVar) {
        String str;
        long epochSecond = ZonedDateTime.now().toEpochSecond();
        StringBuilder sb = new StringBuilder();
        boolean z = brVar instanceof zq;
        if (z) {
            sb.append("pv:1:ar:1:");
        }
        sb.append("et:" + epochSecond);
        sb.append(":");
        sb.append("st:" + epochSecond);
        sb.append(":");
        sb.append("rn:" + y6i0.j(b.f, Random.a));
        sb.append(":");
        sb.append("u:" + brVar.a());
        if (z && (str = ((zq) brVar).b) != null) {
            sb.append(":");
            sb.append("t:".concat(str));
        }
        return sb.toString();
    }
}
