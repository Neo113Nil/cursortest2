package xsna;

import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.posting.presentation.model.VideoAttachParams;
import com.vk.repository.data.api.ExtendedProfilesRepository;

/* compiled from: PostingLoadingCounterProfileHelper.kt */
/* loaded from: classes4.dex */
public final class xgc0 {
    public final qdc0 a;
    public final rdc0 b;
    public final b25 c;
    public final ExtendedProfilesRepository d;
    public VideoAttachParams e = new VideoAttachParams(null, null, null, null, 15, null);

    public xgc0(qdc0 qdc0Var, PostingFragment postingFragment, b25 b25Var, ExtendedProfilesRepository extendedProfilesRepository) {
        this.a = qdc0Var;
        this.b = postingFragment;
        this.c = b25Var;
        this.d = extendedProfilesRepository;
    }
}
