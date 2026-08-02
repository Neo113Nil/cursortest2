package xsna;

import java.util.regex.Pattern;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class i79 implements io.reactivex.rxjava3.functions.l, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i79(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        j79 j79Var = (j79) this.b;
        return Boolean.valueOf(((Pattern) ((bpn0) j79Var.c).getValue()).matcher((String) this.c).matches());
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }
}
