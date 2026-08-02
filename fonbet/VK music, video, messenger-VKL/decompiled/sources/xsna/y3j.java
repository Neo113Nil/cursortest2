package xsna;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: ConnectionConfiguration.java */
/* loaded from: classes12.dex */
public final class y3j {
    public final Object a;
    public Object b;

    public /* synthetic */ y3j(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public byte[] a(g0q g0qVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.b;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(g0qVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(g0qVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(g0qVar.c);
            dataOutputStream.writeLong(g0qVar.d);
            dataOutputStream.write(g0qVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String b() {
        return zr.a("HealthData#", (String) this.a, "#androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE");
    }

    public void c(x0u0 x0u0Var) {
        if (x0u0Var.equals((x0u0) this.b)) {
            return;
        }
        this.b = x0u0Var;
        ((o7j) this.a).accept(x0u0Var);
    }

    public y3j(o7j o7jVar) {
        this.a = o7jVar;
    }

    public y3j() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }
}
