package defpackage;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class dry {
    public final String a(List list) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }
}
