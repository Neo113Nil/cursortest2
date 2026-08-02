package xsna;

import android.util.Base64;
import com.vk.core.serialize.Serializer;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.HashMap;

/* compiled from: SerializerExt.kt */
/* loaded from: classes17.dex */
public final class dni0 {
    public static final String a(Serializer.StreamParcelable streamParcelable) {
        return Base64.encodeToString(b(streamParcelable), 0);
    }

    public static final byte[] b(Serializer.StreamParcelable streamParcelable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            new Serializer.e(dataOutputStream).i0(streamParcelable);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } finally {
        }
    }
}
