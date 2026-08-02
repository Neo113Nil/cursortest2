package xsna;

import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class jpy implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ xzs b;

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (Pair) ((ipy) this.b).invoke(obj);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((a43) this.b).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (List) ((got0) this.b).invoke(obj, obj2);
    }
}
