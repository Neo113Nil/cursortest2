package xsna;

import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d400 implements wzs {
    public final /* synthetic */ int b;

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Set set = (Set) obj2;
        set.remove(Integer.valueOf(this.b));
        if (set.isEmpty()) {
            return null;
        }
        return set;
    }
}
