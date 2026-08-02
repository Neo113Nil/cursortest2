package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class gs31 extends is31 {
    public static gs31 w;
    public static final a x = new a();
    public final Application c;

    public static final class a implements x8f {
    }

    public gs31(Application application) {
        this.c = application;
    }

    public static yr31 a(Class cls, Application application) {
        if (!hd2.class.isAssignableFrom(cls)) {
            return q5z.n(cls);
        }
        try {
            return (yr31) cls.getConstructor(Application.class).newInstance(application);
        } catch (IllegalAccessException e) {
            ny61.n(qv10.l(cls, "Cannot create an instance of "), e);
            return null;
        } catch (InstantiationException e2) {
            ny61.n(qv10.l(cls, "Cannot create an instance of "), e2);
            return null;
        } catch (NoSuchMethodException e3) {
            ny61.n(qv10.l(cls, "Cannot create an instance of "), e3);
            return null;
        } catch (InvocationTargetException e4) {
            ny61.n(qv10.l(cls, "Cannot create an instance of "), e4);
            return null;
        }
    }

    @Override // defpackage.is31, defpackage.hs31
    public final yr31 create(Class cls, y8f y8fVar) {
        if (this.c != null) {
            return create(cls);
        }
        Application application = (Application) y8fVar.a(x);
        if (application != null) {
            return a(cls, application);
        }
        if (!hd2.class.isAssignableFrom(cls)) {
            return q5z.n(cls);
        }
        ny61.g("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public gs31() {
        this(null);
    }

    @Override // defpackage.is31, defpackage.hs31
    public final yr31 create(Class cls) {
        Application application = this.c;
        if (application != null) {
            return a(cls, application);
        }
        w511.x("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }
}
