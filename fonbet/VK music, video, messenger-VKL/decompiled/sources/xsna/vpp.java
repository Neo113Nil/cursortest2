package xsna;

import java.util.Objects;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EntityMap.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class vpp extends FunctionReferenceImpl implements wzs<Object, Object, Boolean> {
    public static final vpp b = new vpp(2, Objects.class, "equals", "equals(Ljava/lang/Object;Ljava/lang/Object;)Z", 0);

    @Override // xsna.wzs
    public final Boolean invoke(Object obj, Object obj2) {
        return Boolean.valueOf(Objects.equals(obj, obj2));
    }
}
