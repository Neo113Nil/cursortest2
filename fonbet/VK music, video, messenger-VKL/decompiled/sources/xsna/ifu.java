package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ifu implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ ifu(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare;
        switch (this.b) {
            case 0:
                return Integer.parseInt(((String) obj).split(StringUtils.PROCESS_POSTFIX_DELIMITER)[0]) - Integer.parseInt(((String) obj2).split(StringUtils.PROCESS_POSTFIX_DELIMITER)[0]);
            default:
                compare = Long.compare(((yads.pp3) obj).b, ((yads.pp3) obj2).b);
                return compare;
        }
    }
}
