package androidx.compose.ui.semantics;

import defpackage.wls;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lnif;", "parentValue", "childValue", "invoke", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
/* loaded from: classes.dex */
final class SemanticsActions$CustomActions$1 extends Lambda implements wls {
    public static final SemanticsActions$CustomActions$1 w = new SemanticsActions$CustomActions$1(2);

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Collection collection = (List) obj;
        List list = (List) obj2;
        if (collection == null) {
            collection = EmptyList.a;
        }
        return kotlin.collections.a.m0(list, collection);
    }
}
