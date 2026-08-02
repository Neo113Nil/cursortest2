package xsna;

import com.google.firebase.datatransport.TransportRegistrar;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class efz implements b9i, io.reactivex.rxjava3.functions.m {
    public static String a(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String b(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        top0 lambda$getComponents$1;
        lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(lcg0Var);
        return lambda$getComponents$1;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return bool.booleanValue();
    }
}
