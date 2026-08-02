package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class jcx implements ip60 {
    public final /* synthetic */ int a;

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                jcx jcxVar = mcx.e;
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                jp60 jp60Var = (jp60) obj2;
                jp60Var.f(kvf0.g, entry.getKey());
                jp60Var.f(kvf0.h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
