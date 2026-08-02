package xsna;

import com.vk.dto.newsfeed.Counters;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.b;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ModalPostRepostsTabReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class f230 extends FunctionReferenceImpl implements izs<x130, b.C1398b> {
    @Override // xsna.izs
    public final b.C1398b invoke(x130 x130Var) {
        ((com.vk.newsfeed.impl.postmodal.reactions.tabs.reposts.a) this.receiver).getClass();
        Counters counters = x130Var.c;
        if (counters != null) {
            return new b.C1398b(counters.g);
        }
        return null;
    }
}
