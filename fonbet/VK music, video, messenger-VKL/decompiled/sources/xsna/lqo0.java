package xsna;

import kotlin.coroutines.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class lqo0 implements wzs {
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        d.b bVar = (d.b) obj2;
        if (!(bVar instanceof kqo0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num != null ? num.intValue() : 1;
        return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
    }
}
