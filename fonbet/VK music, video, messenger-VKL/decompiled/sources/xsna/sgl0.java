package xsna;

import android.database.DatabaseUtils;
import java.io.Serializable;
import java.lang.Enum;
import xsna.qgl0;

/* compiled from: StorageDatabaseHelper.kt */
/* loaded from: classes2.dex */
public final class sgl0<T extends Enum<T> & qgl0> {
    public final String a;
    public final bpn0 b;
    public final bpn0 c = new bpn0(new os30(this, 26));
    public final bpn0 d = new bpn0(new qah0(this, 7));
    public final bpn0 e = new bpn0(new qbc0(this, 15));

    public sgl0(String str, Class<T> cls) {
        this.a = str;
        this.b = new bpn0(new irc0(cls, 13));
    }

    public final String a(Object obj, Object obj2) {
        Object obj3 = (Enum) obj;
        return "SELECT " + c() + " FROM " + this.a + " WHERE " + ((qgl0) obj3).getKey() + " = " + (obj2 instanceof Number ? (Serializable) obj2 : DatabaseUtils.sqlEscapeString(String.valueOf(obj2)));
    }

    public final String b(Iterable iterable, Object obj) {
        return "SELECT " + c() + " FROM " + this.a + " WHERE " + ((qgl0) ((Enum) obj)).getKey() + " in (" + j5g.g0(iterable, null, null, null, 0, new n9w(28), 31) + ')';
    }

    public final String c() {
        return (String) this.c.getValue();
    }

    public final String d() {
        return (String) this.d.getValue();
    }

    public final String e() {
        return (String) this.e.getValue();
    }
}
