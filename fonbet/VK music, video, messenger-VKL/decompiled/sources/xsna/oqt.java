package xsna;

import com.vk.dto.shortvideo.ClipsChallenge;
import com.vk.dto.shortvideo.ClipsHashtagChallenge;

/* compiled from: GetClipsHashtagChallengeRequest.kt */
/* loaded from: classes15.dex */
public final class oqt extends com.vk.api.request.rx.batch.a<Long, ClipsChallenge, ClipsHashtagChallenge> {
    @Override // com.vk.api.request.rx.batch.a
    public final ClipsHashtagChallenge K0(bv6<Long> bv6Var, bv6<ClipsChallenge> bv6Var2) {
        long longValue = bv6Var.a.longValue();
        return new ClipsHashtagChallenge(Long.valueOf(longValue), bv6Var2.a);
    }
}
