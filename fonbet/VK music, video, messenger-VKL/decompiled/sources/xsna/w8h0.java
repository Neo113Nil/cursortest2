package xsna;

import android.content.Context;

/* compiled from: SchemaManager_Factory.java */
/* loaded from: classes.dex */
public final class w8h0 implements xhq<v8h0> {
    public final e9e0<Context> b;

    public w8h0(e9e0 e9e0Var) {
        this.b = e9e0Var;
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new v8h0(this.b.get(), "com.google.android.datatransport.events", Integer.valueOf(v8h0.e).intValue());
    }
}
