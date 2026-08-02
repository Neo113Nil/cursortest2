package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class lh91 implements yyn {
    public static final hh91 d = new ip60() { // from class: hh91
        @Override // defpackage.uyn
        public final void a(Object obj, Object obj2) {
            hh91 hh91Var = lh91.d;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final hh91 c = d;

    @Override // defpackage.yyn
    public final /* bridge */ /* synthetic */ yyn a(Class cls, ip60 ip60Var) {
        this.a.put(cls, ip60Var);
        this.b.remove(cls);
        return this;
    }
}
