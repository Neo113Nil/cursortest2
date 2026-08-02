package com.google.vr.dynamite.client;

import android.os.IBinder;
import defpackage.ny61;
import defpackage.yci0;
import java.lang.reflect.Field;

/* loaded from: classes11.dex */
public final class ObjectWrapper<T> extends c {
    private final T wrappedObject;

    /* JADX WARN: Multi-variable type inference failed */
    private ObjectWrapper(Object obj) {
        this.wrappedObject = obj;
    }

    public static IObjectWrapper b(Object obj) {
        return new ObjectWrapper(obj);
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper, Class<T> cls) {
        if (iObjectWrapper == null) {
            return null;
        }
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).wrappedObject;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        Field field = null;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field2 = declaredFields[i];
            if (!field2.isSynthetic()) {
                if (field != null) {
                    field = null;
                    break;
                }
                field = field2;
            }
            i++;
        }
        if (field == null) {
            ny61.g("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
            return null;
        }
        if (field.isAccessible()) {
            ny61.g("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            return null;
        }
        field.setAccessible(true);
        try {
            Object obj = field.get(asBinder);
            if (obj == null) {
                return null;
            }
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
            throw new IllegalArgumentException("remoteBinder is the wrong class.");
        } catch (IllegalAccessException e) {
            yci0.p("Could not access the field in remoteBinder.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            yci0.p("remoteBinder is the wrong class.", e2);
            return null;
        } catch (NullPointerException e3) {
            yci0.p("Binder object is null.", e3);
            return null;
        }
    }
}
