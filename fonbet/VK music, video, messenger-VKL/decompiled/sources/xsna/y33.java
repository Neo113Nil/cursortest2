package xsna;

import com.vk.auth.api.models.AuthResult;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y33 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, b9i {
    public final /* synthetic */ Object b;

    public /* synthetic */ y33(Object obj) {
        this.b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (AuthResult) ((p45) this.b).invoke(obj);
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return this.b;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((x33) this.b).invoke(obj)).booleanValue();
    }
}
