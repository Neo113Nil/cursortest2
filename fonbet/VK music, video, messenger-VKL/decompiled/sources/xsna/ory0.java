package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class ory0 implements Predicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((String) ((Map.Entry) obj).getKey()).startsWith(StringUtils.PROCESS_POSTFIX_DELIMITER);
            default:
                return ((List) obj).get(0).equals(2);
        }
    }
}
