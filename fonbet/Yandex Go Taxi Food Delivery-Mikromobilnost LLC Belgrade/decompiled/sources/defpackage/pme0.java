package defpackage;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.serialization.KSerializer;

/* loaded from: classes10.dex */
public final class pme0 {
    public static final /* synthetic */ kgx[] f = {new MutablePropertyReference1Impl("stringProperty", 0, "getStringProperty()Ljava/lang/String;", pme0.class)};
    public final wnt a;
    public final KSerializer b;
    public final qme0 c;
    public volatile Object d;
    public final Object e;

    public pme0(cne0 cne0Var, String str, wnt wntVar, Object obj, KSerializer kSerializer) {
        this.a = wntVar;
        this.b = kSerializer;
        this.c = new qme0(1, cne0Var, cne0Var, str);
        this.e = obj;
    }

    public final void a(Object obj) {
        String str;
        synchronized (this) {
            try {
                this.d = obj;
                if (obj != null) {
                    str = ((xnt) this.a).e(obj, this.b);
                } else {
                    str = "";
                }
                this.c.setValue(this, f[0], str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
