package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.model.PollAnswerDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.dsb0;
import xsna.vhc0;
import xsna.xn50;

/* compiled from: PostingRouterImpl.kt */
/* loaded from: classes4.dex */
public final class jlc0 implements kob0 {
    public final /* synthetic */ xhy a;
    public final /* synthetic */ vhc0.b b;

    public jlc0(xhy xhyVar, klc0 klc0Var, vhc0.b bVar) {
        this.a = xhyVar;
        this.b = bVar;
    }

    @Override // xsna.kob0
    public final void b(PostingPollDto postingPollDto) {
        int i;
        Object obj;
        Poll poll = this.b.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (Object obj2 : postingPollDto.e) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            PollAnswerDto pollAnswerDto = (PollAnswerDto) obj2;
            Iterator it = poll.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it.next();
                Iterator it2 = it;
                if (((PollOption) next).b == pollAnswerDto.b) {
                    obj = next;
                    break;
                }
                it = it2;
            }
            PollOption pollOption = (PollOption) obj;
            long j = pollAnswerDto.b;
            arrayList.add(new PollOption(j, pollAnswerDto.c, pollOption != null ? pollOption.d : 0, pollOption != null ? pollOption.e : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            if (poll.e.contains(Long.valueOf(j))) {
                arrayList2.add(Long.valueOf(j));
                z2 = true;
                z = false;
            }
            i2 = i3;
        }
        Poll zb = Poll.zb(poll, postingPollDto.d, arrayList2, arrayList, (z2 || (i = poll.h) <= 0) ? poll.h : i - 1, postingPollDto.i ? postingPollDto.j / 1000 : 0L, z, null, null, null, 4189603);
        xhy xhyVar = this.a;
        PollAttachment pollAttachment = (PollAttachment) xhyVar.b;
        msb0 msb0Var = (msb0) xhyVar.c;
        int i4 = msb0.n1;
        pollAttachment.f = zb;
        xn50.a.c(msb0Var, new dsb0.e(pollAttachment));
    }

    @Override // xsna.kob0
    public final void c() {
    }

    @Override // xsna.kob0
    public final void a(PickerTechMetrics pickerTechMetrics) {
    }
}
