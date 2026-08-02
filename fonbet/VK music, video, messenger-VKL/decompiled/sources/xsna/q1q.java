package xsna;

import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q1q implements Comparator {
    public final /* synthetic */ f6g b;

    public /* synthetic */ q1q(f6g f6gVar) {
        this.b = f6gVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Number) this.b.invoke(obj, obj2)).intValue();
    }
}
