package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.function.BiPredicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class qry0 implements BiPredicate {
    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        return !((String) obj).startsWith(StringUtils.PROCESS_POSTFIX_DELIMITER);
    }
}
