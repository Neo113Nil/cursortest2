package xsna;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: ProtobufEncoder.java */
/* loaded from: classes13.dex */
public final class y8e0 {
    public final HashMap a;
    public final HashMap b;
    public final mp70<Object> c;

    /* compiled from: ProtobufEncoder.java */
    public static final class a implements cjp<a> {
        public static final x8e0 a = new x8e0();
    }

    public y8e0(HashMap hashMap, HashMap hashMap2, x8e0 x8e0Var) {
        this.a = hashMap;
        this.b = hashMap2;
        this.c = x8e0Var;
    }

    public final void a(@NonNull Object obj, @NonNull ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        HashMap hashMap = this.b;
        mp70<Object> mp70Var = this.c;
        HashMap hashMap2 = this.a;
        com.google.firebase.encoders.proto.b bVar = new com.google.firebase.encoders.proto.b(byteArrayOutputStream, hashMap2, hashMap, mp70Var);
        if (obj == null) {
            return;
        }
        mp70 mp70Var2 = (mp70) hashMap2.get(obj.getClass());
        if (mp70Var2 != null) {
            mp70Var2.encode(obj, bVar);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }
}
