package defpackage;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class dko implements ol11, Cloneable {
    public static final dko c = new dko();
    public final List a;
    public final List b;

    public dko() {
        List list = Collections.EMPTY_LIST;
        this.a = list;
        this.b = list;
    }

    public final boolean a(boolean z, Class cls) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            lia1 lia1Var = xoi0.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.a : this.b).iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (dko) super.clone();
        } catch (CloneNotSupportedException e) {
            ny61.f(e);
            return null;
        }
    }

    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean a = a(true, rawType);
        boolean a2 = a(false, rawType);
        if (a || a2) {
            return new cko(this, a2, a, u3uVar, typeToken);
        }
        return null;
    }
}
