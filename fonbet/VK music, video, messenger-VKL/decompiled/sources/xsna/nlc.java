package xsna;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ClientMetrics.java */
/* loaded from: classes12.dex */
public final class nlc {
    public final svo0 a;
    public final List<t000> b;
    public final l1u c;
    public final String d;

    /* compiled from: ClientMetrics.java */
    public static final class a {
        public svo0 a;
        public ArrayList b;
        public l1u c;
        public String d;
    }

    static {
        Collections.unmodifiableList(new ArrayList());
    }

    public nlc(svo0 svo0Var, List<t000> list, l1u l1uVar, String str) {
        this.a = svo0Var;
        this.b = list;
        this.c = l1uVar;
        this.d = str;
    }

    public static a a() {
        a aVar = new a();
        aVar.a = null;
        aVar.b = new ArrayList();
        aVar.c = null;
        aVar.d = "";
        return aVar;
    }

    public final byte[] b() {
        y8e0 y8e0Var = o8e0.a;
        y8e0Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            y8e0Var.a(this, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
