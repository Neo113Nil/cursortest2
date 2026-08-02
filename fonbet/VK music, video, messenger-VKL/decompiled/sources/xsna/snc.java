package xsna;

import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorDecisionState;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.dto.common.ClipVideoFile;

/* compiled from: ClipCoauthorDecisionStore.kt */
/* loaded from: classes16.dex */
public final class snc {
    public final gzs<ClipCoauthorDecisionState> a;
    public final ClipVideoFile b;
    public final ClipCoauthorsDecisionLaunchType c;
    public final qmd d;
    public final co50 e;

    public snc(gzs gzsVar, ClipVideoFile clipVideoFile, ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType, qmd qmdVar) {
        co50 co50Var = new co50();
        this.a = gzsVar;
        this.b = clipVideoFile;
        this.c = clipCoauthorsDecisionLaunchType;
        this.d = qmdVar;
        this.e = co50Var;
    }
}
