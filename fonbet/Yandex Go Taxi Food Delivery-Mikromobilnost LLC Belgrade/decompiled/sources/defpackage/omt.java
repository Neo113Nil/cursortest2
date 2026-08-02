package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class omt {
    public final int a;
    public final x4j0 b;
    public final /* synthetic */ ArrayList c;

    public omt(ArrayList arrayList, int i, x4j0 x4j0Var) {
        this.c = arrayList;
        this.a = i;
        this.b = x4j0Var;
    }

    public final Object a(x4j0 x4j0Var, ContinuationImpl continuationImpl) {
        int i = this.a;
        ArrayList arrayList = this.c;
        return ((qjr) arrayList.get(i)).a(new omt(arrayList, i + 1, x4j0Var), continuationImpl);
    }
}
