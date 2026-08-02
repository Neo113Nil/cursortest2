package defpackage;

import com.yandex.go.zone.dto.response.EstimatedWaitingDto$Exact;
import com.yandex.go.zone.dto.response.EstimatedWaitingDto$Range;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class aco extends xqt {
    public static final aco e = new aco();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, EstimatedWaitingDto$Exact.Companion.serializer(), qoi0.a(EstimatedWaitingDto$Exact.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("exact", EstimatedWaitingDto$Exact.Companion.serializer(), qoi0.a(EstimatedWaitingDto$Exact.class)), new f9("range", EstimatedWaitingDto$Range.Companion.serializer(), qoi0.a(EstimatedWaitingDto$Range.class)));
    }
}
