package xsna;

import com.vk.api.generated.narratives.dto.NarrativesEditResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesGetByIdResponseDto;
import com.vk.api.generated.narratives.dto.NarrativesNarrativeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import java.util.Collections;

/* compiled from: NarrativeChangeStoryCover.kt */
/* loaded from: classes3.dex */
public final class eu50 extends awi<Narrative> {
    public final UserId s;
    public final int t;
    public final int u;

    public eu50(UserId userId, int i, int i2) {
        this.s = userId;
        this.t = i;
        this.u = i2;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        pq3 pq3Var = new pq3();
        StringBuilder sb = new StringBuilder();
        sb.append(this.s);
        sb.append('_');
        sb.append(this.t);
        NarrativesNarrativeDto narrativesNarrativeDto = (NarrativesNarrativeDto) j5g.Y(((NarrativesGetByIdResponseDto) yfb.x(pq3.j(pq3Var, Collections.singletonList(sb.toString()), null, null, 30)).f(l7r0Var)).e());
        NarrativesEditResponseDto narrativesEditResponseDto = (NarrativesEditResponseDto) yfb.x(pq3.i(pq3Var, narrativesNarrativeDto.q(), narrativesNarrativeDto.getId(), narrativesNarrativeDto.getTitle(), narrativesNarrativeDto.i(), Integer.valueOf(this.u), null, null, null, null, null, 3040)).f(l7r0Var);
        new xu50();
        return xu50.a(narrativesEditResponseDto.e(), narrativesEditResponseDto.f(), narrativesEditResponseDto.d());
    }
}
