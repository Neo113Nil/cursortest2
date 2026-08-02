package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public final class a0c extends imb1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Class c;
    public final /* synthetic */ Executable d;

    public /* synthetic */ a0c(Executable executable, Class cls, int i) {
        this.b = i;
        this.d = executable;
        this.c = cls;
    }

    @Override // defpackage.imb1
    public final Object c() {
        int i = this.b;
        Executable executable = this.d;
        switch (i) {
            case 0:
                return ((Constructor) executable).newInstance(null);
            default:
                return ((Method) executable).invoke(null, this.c, Object.class);
        }
    }

    public final String toString() {
        int i = this.b;
        Class cls = this.c;
        switch (i) {
        }
        return cls.getName();
    }
}
