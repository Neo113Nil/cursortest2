package xsna;

import com.vk.api.generated.polls.dto.PollsAnswerDto;
import com.vk.api.generated.polls.dto.PollsFriendDto;
import com.vk.api.generated.polls.dto.PollsPollDto;
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

/* compiled from: PollsPollDtoToPollMapper.kt */
/* loaded from: classes3.dex */
public final class eub0 {
    public final Poll a(PollsPollDto pollsPollDto, Map<UserId, Owner> map) {
        UserId g = pollsPollDto.g();
        if (g == null) {
            g = UserId.d;
        }
        List<PollsFriendDto> B = pollsPollDto.B();
        if (B == null) {
            B = EmptyList.b;
        }
        List<PollsFriendDto> list = B;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PollsFriendDto) it.next()).d());
        }
        Map<UserId, Owner> map2 = map == null ? jgp.b : map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<UserId, Owner> entry : map2.entrySet()) {
            if (arrayList.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        int id = pollsPollDto.getId();
        UserId q = pollsPollDto.q();
        String F = pollsPollDto.F();
        List<Long> e = pollsPollDto.e();
        if (e == null) {
            e = EmptyList.b;
        }
        List<PollsAnswerDto> f = pollsPollDto.f();
        List<Long> list2 = e;
        ArrayList arrayList2 = new ArrayList(c5g.u(f, 10));
        for (PollsAnswerDto pollsAnswerDto : f) {
            arrayList2.add(new PollOption(pollsAnswerDto.d(), pollsAnswerDto.f(), pollsAnswerDto.i(), pollsAnswerDto.e()));
        }
        return new Poll(id, q, F, list2, arrayList2, pollsPollDto.C(), pollsPollDto.G(), epx.f(pollsPollDto.d(), Boolean.TRUE), pollsPollDto.K(), pollsPollDto.u(), pollsPollDto.n(), pollsPollDto.t0(), pollsPollDto.l(), pollsPollDto.p(), pollsPollDto.j(), pollsPollDto.k(), g, stb0.b(pollsPollDto.D(), pollsPollDto.i()), pollsPollDto.o(), arrayList, linkedHashMap, map != null ? map.get(g) : null);
    }
}
