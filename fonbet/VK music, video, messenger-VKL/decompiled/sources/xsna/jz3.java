package xsna;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: AsyncRotationSensorEventInterpreter.kt */
/* loaded from: classes4.dex */
public final class jz3 {
    public static final /* synthetic */ qcy<Object>[] i;
    public final wqo0 a = new wqo0(new nh(3));
    public final wqo0 b = new wqo0(new sv0(2));
    public final wqo0 c = new wqo0(new uv0(2));
    public final wqo0 d = new wqo0(new vv0(1));
    public final wqo0 e = new wqo0(new iz3(0));
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final float g = 2.0f;
    public int h;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(jz3.class, "tiltVector", "getTiltVector()[F", 0);
        hpf0 hpf0Var = fpf0.a;
        i = new qcy[]{propertyReference1Impl, fp.c(0, jz3.class, "targetMatrix", "getTargetMatrix()[F", hpf0Var), ep.a(0, jz3.class, "rotationMatrix", "getRotationMatrix()[F", hpf0Var), ep.a(0, jz3.class, "orientedRotationMatrix", "getOrientedRotationMatrix()[F", hpf0Var), ep.a(0, jz3.class, "rotationVector", "getRotationVector()[F", hpf0Var)};
    }

    public final float[] a() {
        qcy<Object> qcyVar = i[3];
        wqo0 wqo0Var = this.d;
        wqo0Var.getClass();
        return (float[]) wqo0Var.get();
    }

    public final float[] b() {
        qcy<Object> qcyVar = i[2];
        wqo0 wqo0Var = this.c;
        wqo0Var.getClass();
        return (float[]) wqo0Var.get();
    }

    public final float[] c() {
        qcy<Object> qcyVar = i[4];
        wqo0 wqo0Var = this.e;
        wqo0Var.getClass();
        return (float[]) wqo0Var.get();
    }

    public final float[] d() {
        qcy<Object> qcyVar = i[1];
        wqo0 wqo0Var = this.b;
        wqo0Var.getClass();
        return (float[]) wqo0Var.get();
    }

    public final float[] e() {
        qcy<Object> qcyVar = i[0];
        wqo0 wqo0Var = this.a;
        wqo0Var.getClass();
        return (float[]) wqo0Var.get();
    }
}
