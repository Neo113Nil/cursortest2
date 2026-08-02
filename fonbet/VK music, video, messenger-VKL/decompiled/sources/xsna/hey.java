package xsna;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.ka20;

/* compiled from: KeyTypeManager.java */
/* loaded from: classes.dex */
public abstract class hey<KeyProtoT extends ka20> {
    public final Class<KeyProtoT> a;
    public final Map<Class<?>, b<?, KeyProtoT>> b;
    public final Class<?> c;

    /* compiled from: KeyTypeManager.java */
    /* loaded from: classes13.dex */
    public static abstract class a<KeyFormatProtoT extends ka20, KeyT> {
        public final Class<KeyFormatProtoT> a;

        public a(Class<KeyFormatProtoT> cls) {
            this.a = cls;
        }

        public abstract KeyT a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        public abstract KeyFormatProtoT b(ByteString byteString) throws InvalidProtocolBufferException;

        public abstract void c(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    /* compiled from: KeyTypeManager.java */
    public static abstract class b<PrimitiveT, KeyT> {
        public final Class<PrimitiveT> a;

        public b(Class<PrimitiveT> cls) {
            this.a = cls;
        }

        public abstract Object a(ka20 ka20Var) throws GeneralSecurityException;
    }

    @SafeVarargs
    public hey(Class<KeyProtoT> cls, b<?, KeyProtoT>... bVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (b<?, KeyProtoT> bVar : bVarArr) {
            Class<?> cls2 = bVar.a;
            if (hashMap.containsKey(cls2)) {
                throw new IllegalArgumentException(xlg0.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            hashMap.put(cls2, bVar);
        }
        if (bVarArr.length > 0) {
            this.c = bVarArr[0].a;
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public abstract String a();

    public final <P> P b(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        b<?, KeyProtoT> bVar = this.b.get(cls);
        if (bVar != null) {
            return (P) bVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> c();

    public abstract KeyData.KeyMaterialType d();

    public abstract KeyProtoT e(ByteString byteString) throws InvalidProtocolBufferException;

    public abstract void f(KeyProtoT keyprotot) throws GeneralSecurityException;
}
