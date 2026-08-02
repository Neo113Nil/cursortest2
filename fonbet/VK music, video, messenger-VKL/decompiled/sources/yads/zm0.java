package yads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class zm0 {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public zm0() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(xm0 xm0Var) {
        this.a.reset();
        try {
            DataOutputStream dataOutputStream = this.b;
            dataOutputStream.writeBytes(xm0Var.b);
            dataOutputStream.writeByte(0);
            String str = xm0Var.c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.b.writeLong(xm0Var.d);
            this.b.writeLong(xm0Var.e);
            this.b.write(xm0Var.f);
            this.b.flush();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
