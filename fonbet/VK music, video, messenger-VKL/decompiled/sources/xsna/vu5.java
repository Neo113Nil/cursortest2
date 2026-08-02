package xsna;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class vu5 implements b9i {
    public final /* synthetic */ int b;

    public /* synthetic */ vu5(int i) {
        this.b = i;
    }

    public static String a(char c, long j, StringBuilder sb) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static String b(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        fkr components$lambda$0;
        switch (this.b) {
            case 1:
                return ExecutorsRegistrar.b.get();
            default:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(lcg0Var);
                return components$lambda$0;
        }
    }
}
