package xsna;

import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class cyh0 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cyh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Pair) ((hre) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        d5s0 d5s0Var = (d5s0) this.c;
        myc0.h(d5s0Var.f, null, null, new c5s0(d5s0Var, rVar, null), 3);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
        }
        return ((Boolean) ((b1o0) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (hda) ((o8) this.c).invoke(obj);
            case 1:
                return (List) ((xka0) this.c).invoke(obj);
            case 2:
            case 4:
            case 5:
            case 7:
            default:
                return (it80) ((jz30) this.c).invoke(obj);
            case 3:
                return (it80) ((b1o0) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.t) ((byb) this.c).invoke(obj);
            case 8:
                return (String) ((zjb) this.c).invoke(obj);
        }
    }
}
