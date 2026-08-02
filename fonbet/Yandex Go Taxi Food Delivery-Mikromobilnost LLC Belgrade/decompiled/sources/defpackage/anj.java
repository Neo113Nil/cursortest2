package defpackage;

import java.util.Map;
import okio.ByteString;
import ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective;

/* loaded from: classes2.dex */
public abstract class anj {
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final syj0 a(smj smjVar, gcx gcxVar, zwf0 zwf0Var) {
        syj0 jyj0Var;
        syj0 jyj0Var2;
        TDirective tDirective;
        gnj gnjVar = smjVar.b;
        if (gnjVar instanceof enj) {
            String str = smjVar.a;
            byte[] bArr = ((enj) gnjVar).a;
            int length = bArr.length;
            j.b(bArr.length, 0L, length);
            tDirective = new TDirective("client_action", str, null, false, null, new ByteString(f73.m(0, length, bArr)), null, null, false, null, false, 0, null, null, null, null, false, null, null, 524252, null);
        } else {
            if (!(gnjVar instanceof fnj)) {
                w511.b();
                return null;
            }
            String str2 = smjVar.a;
            syj0 a = ((t830) gcxVar).a(Map.class, ((fnj) gnjVar).a);
            if (a instanceof lyj0) {
                jyj0Var = new lyj0((Map) ((lyj0) a).a);
            } else {
                if (!(a instanceof jyj0)) {
                    w511.b();
                    return null;
                }
                jyj0Var = new jyj0(new tw10("Failed to convert json to struct ".concat(((ecx) ((jyj0) a).a).a)));
            }
            if (!(jyj0Var instanceof lyj0)) {
                if (!(jyj0Var instanceof jyj0)) {
                    w511.b();
                    return null;
                }
                jyj0Var2 = new jyj0(new umj(((tw10) ((jyj0) jyj0Var).a).a));
                if (!(jyj0Var2 instanceof lyj0)) {
                    return new lyj0(new zmj(gcxVar, (TDirective) ((lyj0) jyj0Var2).a, zwf0Var));
                }
                if (jyj0Var2 instanceof jyj0) {
                    return new jyj0((wmj) ((jyj0) jyj0Var2).a);
                }
                w511.b();
                return null;
            }
            tDirective = new TDirective("client_action", str2, null, false, (Map) ((lyj0) jyj0Var).a, null, null, null, false, null, false, 0, null, null, null, null, false, null, null, 524268, null);
        }
        jyj0Var2 = new lyj0(tDirective);
        if (!(jyj0Var2 instanceof lyj0)) {
        }
    }
}
