package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public abstract class ka31 {
    public final w53 a;
    public final w53 b;
    public final w53 c;

    public ka31(w53 w53Var, w53 w53Var2, w53 w53Var3) {
        this.a = w53Var;
        this.b = w53Var2;
        this.c = w53Var3;
    }

    public abstract la31 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        w53 w53Var = this.c;
        Class cls2 = (Class) w53Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(unr0.o(cls.getPackage().getName(), Extension.DOT_CHAR, cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
        w53Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) {
        w53 w53Var = this.a;
        Method method = (Method) w53Var.get(str);
        if (method != null) {
            return method;
        }
        Method declaredMethod = Class.forName(str, true, ka31.class.getClassLoader()).getDeclaredMethod("read", ka31.class);
        w53Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        w53 w53Var = this.b;
        Method method = (Method) w53Var.get(name);
        if (method != null) {
            return method;
        }
        Method declaredMethod = b(cls).getDeclaredMethod("write", cls, ka31.class);
        w53Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((la31) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((la31) this).e.readParcelable(la31.class.getClassLoader());
    }

    public final ma31 h() {
        String readString = ((la31) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (ma31) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            ny61.n("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            ny61.n("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            ny61.n("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            ny61.n("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((la31) this).e.writeInt(i);
    }

    public final void k(Parcelable parcelable, int i) {
        i(i);
        ((la31) this).e.writeParcelable(parcelable, 0);
    }

    public final void l(ma31 ma31Var) {
        if (ma31Var == null) {
            ((la31) this).e.writeString(null);
            return;
        }
        try {
            ((la31) this).e.writeString(b(ma31Var.getClass()).getName());
            la31 a = a();
            try {
                d(ma31Var.getClass()).invoke(null, ma31Var, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                ny61.n("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                ny61.n("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                ny61.n("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                ny61.n("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            ny61.n(ma31Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
