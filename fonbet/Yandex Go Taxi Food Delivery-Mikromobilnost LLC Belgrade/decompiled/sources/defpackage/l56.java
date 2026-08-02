package defpackage;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Ll56;", "Lzxf0;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface l56 extends zxf0 {
    void clearBlockedZones();

    default void hideBlockedZones() {
    }

    default void showBlockedZones() {
    }

    void updateBlockedZones(List list);
}
