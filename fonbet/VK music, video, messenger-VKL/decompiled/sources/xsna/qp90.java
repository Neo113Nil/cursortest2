package xsna;

import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.calls.dto.CallsHistoryRecordDto;
import com.vk.api.generated.calls.dto.CallsHistoryRecordSingleDto;
import com.vk.voip.api.id.CallId;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a59;

/* compiled from: PastCallsApiModelMapper.kt */
/* loaded from: classes7.dex */
public final class qp90 {
    public static ArrayList a(CallsGetHistoryResponseDto callsGetHistoryResponseDto) {
        Object cVar;
        a59.f cVar2;
        a59.f eVar;
        List<CallsHistoryRecordDto> g = callsGetHistoryResponseDto.g();
        ArrayList arrayList = new ArrayList();
        for (CallsHistoryRecordDto callsHistoryRecordDto : g) {
            if (callsHistoryRecordDto instanceof CallsHistoryRecordDto.CallsHistoryRecordSingleDto) {
                CallsHistoryRecordDto.CallsHistoryRecordSingleDto callsHistoryRecordSingleDto = (CallsHistoryRecordDto.CallsHistoryRecordSingleDto) callsHistoryRecordDto;
                long l = callsHistoryRecordSingleDto.l();
                CallId callId = new CallId(callsHistoryRecordSingleDto.e());
                CallsHistoryRecordDto.CallsHistoryRecordSingleDto.ReachStatusDto k = callsHistoryRecordSingleDto.k();
                long j = 1000;
                long g2 = callsHistoryRecordSingleDto.g() * j;
                boolean u = callsHistoryRecordSingleDto.u();
                long p = callsHistoryRecordSingleDto.p() * j;
                a59.d b = a59.b.b(callsHistoryRecordSingleDto);
                Pair a = a59.b.a(p, g2);
                long longValue = ((Number) a.d()).longValue();
                long longValue2 = ((Number) a.g()).longValue();
                int i = a59.b.a.$EnumSwitchMapping$1[k.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        eVar = u ? new a59.f.e(g2) : new a59.f.a(g2);
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar = new a59.f.d(u, g2);
                    }
                    cVar2 = eVar;
                } else {
                    cVar2 = b instanceof a59.d.b ? new a59.f.c(u, longValue2, longValue) : new a59.f.b(u, longValue2, longValue);
                }
                cVar = new a59.e(cVar2, a59.b.b(callsHistoryRecordSingleDto), l, callId);
            } else {
                if (!(callsHistoryRecordDto instanceof CallsHistoryRecordDto.CallsHistoryRecordMergedDto)) {
                    throw new IllegalStateException("Unknown call type: " + callsHistoryRecordDto);
                }
                CallsHistoryRecordDto.CallsHistoryRecordMergedDto callsHistoryRecordMergedDto = (CallsHistoryRecordDto.CallsHistoryRecordMergedDto) callsHistoryRecordDto;
                CallsHistoryRecordSingleDto callsHistoryRecordSingleDto2 = (CallsHistoryRecordSingleDto) j5g.a0(callsHistoryRecordMergedDto.d());
                if (callsHistoryRecordSingleDto2 == null) {
                    cVar = null;
                } else {
                    a59.f d = a59.b.d(callsHistoryRecordSingleDto2);
                    a59.d c = a59.b.c(callsHistoryRecordSingleDto2);
                    List<CallsHistoryRecordSingleDto> d2 = callsHistoryRecordMergedDto.d();
                    ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
                    for (CallsHistoryRecordSingleDto callsHistoryRecordSingleDto3 : d2) {
                        arrayList2.add(new a59.e(a59.b.d(callsHistoryRecordSingleDto3), a59.b.c(callsHistoryRecordSingleDto3), callsHistoryRecordSingleDto3.l(), new CallId(callsHistoryRecordSingleDto3.e())));
                    }
                    cVar = new a59.c(d, c, arrayList2);
                }
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
