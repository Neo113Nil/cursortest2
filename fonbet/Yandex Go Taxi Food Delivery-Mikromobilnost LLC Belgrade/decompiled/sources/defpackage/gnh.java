package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes.dex */
public final class gnh {
    public final String a;
    public final vit b;

    public gnh(Set set, vit vitVar) {
        this.a = b(set);
        this.b = vitVar;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            d74 d74Var = (d74) it.next();
            sb.append(d74Var.a);
            sb.append('/');
            sb.append(d74Var.b);
            if (it.hasNext()) {
                sb.append(HexString.CHAR_SPACE);
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        vit vitVar = this.b;
        synchronized (((HashSet) vitVar.b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) vitVar.b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(HexString.CHAR_SPACE);
        synchronized (((HashSet) vitVar.b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) vitVar.b);
        }
        sb.append(b(unmodifiableSet2));
        return sb.toString();
    }
}
