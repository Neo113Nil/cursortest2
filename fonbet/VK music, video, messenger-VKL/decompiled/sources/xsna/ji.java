package xsna;

import com.google.firebase.abt.component.AbtRegistrar;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ji implements b9i {
    public static Object a(int i, List list) {
        return list.get(list.size() - i);
    }

    public static StringBuilder b(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        hi lambda$getComponents$0;
        lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(lcg0Var);
        return lambda$getComponents$0;
    }
}
