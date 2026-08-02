package xsna;

import com.google.firebase.storage.StorageRegistrar;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ms9 implements b9i {
    public static String a(char c, StringBuilder sb, List list) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static String b(String str, Throwable th) {
        return str + th;
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        tkr lambda$getComponents$0;
        lambda$getComponents$0 = StorageRegistrar.lambda$getComponents$0(lcg0Var);
        return lambda$getComponents$0;
    }
}
