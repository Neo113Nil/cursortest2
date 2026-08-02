package xsna;

import com.vk.api.generated.polls.dto.PollsAnswerDto;
import com.vk.api.generated.polls.dto.PollsBackgroundDto;
import com.vk.api.generated.polls.dto.PollsFriendDto;
import com.vk.api.generated.polls.dto.PollsPollExtendedDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: PollsPollExtendedDtoToPollMapper.kt */
/* loaded from: classes3.dex */
public final class fub0 {
    public final k2r0 a = new k2r0();
    public final stb0 b = new stb0();

    public static Poll a(fub0 fub0Var, PollsPollExtendedDto pollsPollExtendedDto) {
        k2r0 k2r0Var = fub0Var.a;
        List<UsersUserFullDto> F = pollsPollExtendedDto.F();
        if (F == null) {
            F = EmptyList.b;
        }
        LinkedHashMap b = k2r0Var.b(F);
        UserId g = pollsPollExtendedDto.g();
        if (g == null) {
            g = UserId.d;
        }
        List<PollsFriendDto> B = pollsPollExtendedDto.B();
        if (B == null) {
            B = EmptyList.b;
        }
        List<PollsFriendDto> list = B;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PollsFriendDto) it.next()).d());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : b.entrySet()) {
            if (arrayList.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        int id = pollsPollExtendedDto.getId();
        UserId q = pollsPollExtendedDto.q();
        String G = pollsPollExtendedDto.G();
        List<Long> e = pollsPollExtendedDto.e();
        if (e == null) {
            e = EmptyList.b;
        }
        List<PollsAnswerDto> f = pollsPollExtendedDto.f();
        List<Long> list2 = e;
        ArrayList arrayList2 = new ArrayList(c5g.u(f, 10));
        for (PollsAnswerDto pollsAnswerDto : f) {
            arrayList2.add(new PollOption(pollsAnswerDto.d(), pollsAnswerDto.f(), pollsAnswerDto.i(), pollsAnswerDto.e()));
        }
        boolean C = pollsPollExtendedDto.C();
        int K = pollsPollExtendedDto.K();
        boolean f2 = epx.f(pollsPollExtendedDto.d(), Boolean.TRUE);
        boolean M = pollsPollExtendedDto.M();
        long u = pollsPollExtendedDto.u();
        boolean n = pollsPollExtendedDto.n();
        boolean t0 = pollsPollExtendedDto.t0();
        boolean l = pollsPollExtendedDto.l();
        boolean p = pollsPollExtendedDto.p();
        boolean j = pollsPollExtendedDto.j();
        boolean k = pollsPollExtendedDto.k();
        stb0 stb0Var = fub0Var.b;
        PollsBackgroundDto D = pollsPollExtendedDto.D();
        PollsBackgroundDto i = pollsPollExtendedDto.i();
        stb0Var.getClass();
        return new Poll(id, q, G, list2, arrayList2, C, K, f2, M, u, n, t0, l, p, j, k, g, stb0.b(D, i), pollsPollExtendedDto.o(), arrayList, linkedHashMap2, (Owner) b.get(g));
    }
}
