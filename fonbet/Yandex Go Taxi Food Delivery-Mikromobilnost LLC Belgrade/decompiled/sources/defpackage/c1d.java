package defpackage;

import com.google.firebase.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final /* synthetic */ class c1d implements zvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c1d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zvf0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    return null;
                } catch (IllegalAccessException e) {
                    throw new InvalidRegistrarException(oyr.p("Could not instantiate ", str, Extension.DOT_CHAR), e);
                } catch (InstantiationException e2) {
                    throw new InvalidRegistrarException(oyr.p("Could not instantiate ", str, Extension.DOT_CHAR), e2);
                } catch (NoSuchMethodException e3) {
                    throw new InvalidRegistrarException(g8e.o("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new InvalidRegistrarException(g8e.o("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new a7v((a) obj);
        }
    }
}
