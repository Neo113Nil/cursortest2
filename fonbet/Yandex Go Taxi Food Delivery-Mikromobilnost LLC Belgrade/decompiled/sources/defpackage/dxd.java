package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;

/* loaded from: classes9.dex */
public final /* synthetic */ class dxd implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dxd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return (ReentrantReadWriteLock) ((qu) obj2).invoke(obj);
            case 1:
                return (pz40) ((kn2) obj2).invoke(obj);
            case 2:
                return (Set) ((dsg) obj2).invoke(obj);
            case 3:
                return (ConcurrentHashMap) ((dsg) obj2).invoke(obj);
            case 4:
                return (lz40) ((dsg) obj2).invoke(obj);
            case 5:
                return ((m0a0) obj2).a((Context) obj);
            case 6:
                return (z1b0) ((y1b0) obj2).invoke(obj);
            case 7:
                return (Set) ((weu) obj2).invoke(obj);
            case 8:
                return (z1b0) ((y1b0) obj2).invoke(obj);
            case 9:
                return ((qda0) obj2).invoke(obj);
            case 10:
                return ((ate0) obj2).invoke(obj);
            default:
                return (List) ((ate0) obj2).invoke(obj);
        }
    }
}
