package defpackage;

import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.wire.ProtoAdapter;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import okio.ByteString;

/* loaded from: classes15.dex */
public final class ouf0 {
    public final Moshi a;
    public final HashMap b = new HashMap();

    public ouf0(Moshi moshi) {
        this.a = moshi;
    }

    public final ProtoAdapter a(Type type) {
        if (type == Boolean.TYPE) {
            return k80.e;
        }
        if (type == Float.TYPE) {
            return ProtoAdapter.FLOAT;
        }
        if (type == Integer.TYPE) {
            return k80.c;
        }
        if (type == Long.TYPE) {
            return k80.a;
        }
        if (type == Boolean.class) {
            return k80.f;
        }
        if (type == Float.class) {
            return ProtoAdapter.FLOAT;
        }
        if (type == Integer.class) {
            return k80.d;
        }
        if (type == Long.class) {
            return k80.b;
        }
        if (type == String.class) {
            return ProtoAdapter.STRING;
        }
        if (type == ByteString.class) {
            return k80.h;
        }
        Class a = vp11.a(type);
        synchronized (this.b) {
            ProtoAdapter protoAdapter = (ProtoAdapter) this.b.get(type);
            if (protoAdapter != null) {
                return protoAdapter;
            }
            if (a.isArray() || a.isEnum()) {
                ny61.g("Proto Arrays and Enums are restricted ".concat(a.getName()));
                return null;
            }
            if (a.isInterface() && !a.equals(Map.class)) {
                ny61.g("Proto This interface is not allowed ".concat(a.getName()));
                return null;
            }
            if (Util.isPlatformType(a) && a != Boolean.class && a != Byte.class && a != Character.class && a != Double.class && a != Float.class && a != Integer.class && a != Long.class && a != Short.class && a != String.class && a != Object.class) {
                ny61.g("Proto This platform type is not allowed ".concat(a.getName()));
                return null;
            }
            if (a.isAnonymousClass()) {
                ny61.g("Proto Cannot serialize anonymous class ".concat(a.getName()));
                return null;
            }
            if (a.isLocalClass()) {
                ny61.g("Proto Cannot serialize local class ".concat(a.getName()));
                return null;
            }
            if (a.getEnclosingClass() != null && !Modifier.isStatic(a.getModifiers())) {
                ny61.g("Proto Cannot serialize non-static nested class ".concat(a.getName()));
                return null;
            }
            if (Modifier.isAbstract(a.getModifiers())) {
                ny61.g("Proto Cannot serialize abstract class ".concat(a.getName()));
                return null;
            }
            f0c f0cVar = new f0c(this, type, a);
            synchronized (this.b) {
            }
            return f0cVar;
        }
    }
}
