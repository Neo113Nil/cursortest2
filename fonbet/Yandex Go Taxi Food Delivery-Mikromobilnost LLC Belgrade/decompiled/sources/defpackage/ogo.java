package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class ogo {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public ogo() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(mgo mgoVar) {
        DataOutputStream dataOutputStream = this.b;
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(mgoVar.a);
            dataOutputStream.writeByte(0);
            String str = mgoVar.b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(mgoVar.c);
            dataOutputStream.writeLong(mgoVar.w);
            dataOutputStream.write(mgoVar.x);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            ny61.j(e);
            return null;
        }
    }
}
