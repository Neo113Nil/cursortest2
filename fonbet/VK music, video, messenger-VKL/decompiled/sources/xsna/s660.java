package xsna;

import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s660 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s660(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                x660 x660Var = (x660) this.c;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    boolean booleanValue = bool.booleanValue();
                    synchronized (x660Var) {
                        try {
                            if (booleanValue) {
                                x660Var.b();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return s3q0.a;
            default:
                return new per0(((k7r0) this.c).a((JSONObject) obj));
        }
    }
}
