package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public abstract class o2 implements a2 {
    public static boolean hasEncodedTagValue(Object obj, int i) {
        return (obj instanceof byte[]) && ((byte[]) obj)[0] == i;
    }

    public void encodeTo(OutputStream outputStream) throws IOException {
        toASN1Primitive().encodeTo(outputStream);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a2) {
            return toASN1Primitive().q(((a2) obj).toASN1Primitive());
        }
        return false;
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        toASN1Primitive().encodeTo(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public String getName() {
        return toString();
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    public void encodeTo(OutputStream outputStream, String str) throws IOException {
        toASN1Primitive().encodeTo(outputStream, str);
    }

    public byte[] getEncoded(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        toASN1Primitive().encodeTo(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
