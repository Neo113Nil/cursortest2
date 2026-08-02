package xsna;

import com.vk.api.generated.narratives.dto.NarrativesBatchEditInputDto;
import com.vk.api.generated.narratives.dto.NarrativesGetByIdResponseDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import java.util.Collections;
import java.util.List;

/* compiled from: NarrativeDeleteStoryRequest.kt */
/* loaded from: classes3.dex */
public final class ku50 extends awi<Narrative> {
    public final UserId s;
    public final int t;
    public final int u;

    public ku50(UserId userId, int i, int i2) {
        this.s = userId;
        this.t = i;
        this.u = i2;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        pq3 pq3Var = new pq3();
        NarrativesBatchEditInputDto.OpDto opDto = NarrativesBatchEditInputDto.OpDto.DELETE;
        Integer valueOf = Integer.valueOf(this.u);
        int i = this.t;
        List singletonList = Collections.singletonList(new NarrativesBatchEditInputDto(opDto, valueOf, Integer.valueOf(i), null, null, 24, null));
        UserId userId = this.s;
        yfb.x(pq3Var.h(userId, singletonList)).f(l7r0Var);
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append('_');
        sb.append(i);
        NarrativesGetByIdResponseDto narrativesGetByIdResponseDto = (NarrativesGetByIdResponseDto) yfb.x(pq3.j(pq3Var, Collections.singletonList(sb.toString()), null, null, 26)).f(l7r0Var);
        new xu50();
        VKList vKList = new VKList(xu50.b(narrativesGetByIdResponseDto.f(), narrativesGetByIdResponseDto.d(), narrativesGetByIdResponseDto.e()));
        vKList.o(narrativesGetByIdResponseDto.getCount());
        return (Narrative) j5g.Y(vKList);
    }
}
