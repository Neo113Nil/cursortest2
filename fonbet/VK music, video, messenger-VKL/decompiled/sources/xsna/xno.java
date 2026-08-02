package xsna;

import com.fasterxml.jackson.core.JsonParseException;
import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;

/* compiled from: DupDetector.java */
/* loaded from: classes12.dex */
public final class xno {
    public final Object a;
    public Serializable b;
    public Object c;
    public Object d;

    public xno(one.video.streaming.oktp.a aVar, jdy jdyVar) {
        this.a = aVar;
        this.c = new zvo0(aVar.s);
        aVar.setSecret(n5j.a);
        this.d = jdyVar;
    }

    public boolean a(String str) throws JsonParseException {
        String str2 = (String) this.b;
        if (str2 == null) {
            this.b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = (String) this.c;
        if (str3 == null) {
            this.c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (((HashSet) this.d) == null) {
            HashSet hashSet = new HashSet(16);
            this.d = hashSet;
            hashSet.add((String) this.b);
            ((HashSet) this.d).add((String) this.c);
        }
        return !((HashSet) this.d).add(str);
    }

    public xno(Closeable closeable) {
        this.a = closeable;
    }
}
