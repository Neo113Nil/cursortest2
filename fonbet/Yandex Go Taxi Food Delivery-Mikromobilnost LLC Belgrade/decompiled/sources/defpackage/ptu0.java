package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.Set;

/* loaded from: classes4.dex */
public final class ptu0 extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        Set f0 = j73.f0(new String[]{"java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;"});
        String name = objectStreamClass != null ? objectStreamClass.getName() : null;
        if (name == null || f0.contains(name)) {
            return super.resolveClass(objectStreamClass);
        }
        throw new ClassNotFoundException(objectStreamClass.getName());
    }
}
