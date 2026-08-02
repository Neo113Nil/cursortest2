package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.polls.dto.PollsPollExtendedDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import java.util.List;

/* compiled from: PollsAddVoteBatchRequest.kt */
/* loaded from: classes18.dex */
public final class rtb0 extends awi<a> {
    public final UserId s;
    public final int t;
    public final List<Long> u;
    public final boolean v;
    public final String w;
    public final String x;
    public final String y;

    /* compiled from: PollsAddVoteBatchRequest.kt */
    public static final class a {
        public final Poll a;
        public final boolean b;

        public a(Poll poll, boolean z) {
            this.a = poll;
            this.b = z;
        }
    }

    public rtb0(UserId userId, String str, String str2, boolean z, List list, int i, String str3) {
        this.s = userId;
        this.t = i;
        this.u = list;
        this.v = z;
        this.w = str;
        this.x = str2;
        this.y = str3;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        kub0 kub0Var = new kub0();
        tfx tfxVar = new tfx("polls.addVote", new zy60(3), new wd10(8));
        tfx.l(tfxVar, "poll_id", this.t, 0, 0, 8);
        tfxVar.i("answer_ids", this.u);
        UserId userId = this.s;
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        boolean z = this.v;
        tfxVar.j("is_board", z);
        String str = this.w;
        if (str != null) {
            tfx.o(tfxVar, "ref", str, 0, 0, 12);
        }
        String str2 = this.x;
        if (str2 != null) {
            tfx.o(tfxVar, "track_code", str2, 0, 0, 12);
        }
        String str3 = this.y;
        if (str3 != null) {
            tfx.o(tfxVar, "material", str3, 0, 0, 12);
        }
        BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) yfb.x(tfxVar).f(l7r0Var);
        dz2 x = yfb.x(jub0.a(kub0Var, this.t, userId, Boolean.valueOf(z), 96));
        x.K("friends_fields", "photo_base");
        x.K("friends_name_case", "nom");
        return new a(fub0.a(new fub0(), (PollsPollExtendedDto) x.f(l7r0Var)), baseBoolIntDto == BaseBoolIntDto.YES);
    }
}
