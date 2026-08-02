package defpackage;

import java.util.Hashtable;
import java.util.Map;

/* loaded from: classes4.dex */
public class et61 implements i87 {
    public String a = null;
    public boolean b = true;
    public byte[] c = null;

    @Override // defpackage.i87
    public final xc3 b(Map map) {
        Hashtable hashtable = new Hashtable();
        String str = this.a;
        if (str != null) {
            hashtable.put(new u2("1.2.643.7.1.3.44.5"), new vc3(new u2("1.2.643.7.1.3.44.5"), new lqf(new hqf(str))));
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            hashtable.put(new u2("1.2.643.7.1.0.6.1.1"), new vc3(new u2("1.2.643.7.1.0.6.1.1"), new lqf(new dqf(bArr))));
        }
        return new xc3(hashtable);
    }
}
