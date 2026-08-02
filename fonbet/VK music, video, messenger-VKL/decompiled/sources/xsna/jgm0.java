package xsna;

import com.vk.dto.stories.model.StoryEntry;
import java.util.Set;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.khm0;

/* compiled from: StoryStatisticsReducer.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class jgm0 extends FunctionReferenceImpl implements izs<chm0, khm0.c> {
    @Override // xsna.izs
    public final khm0.c invoke(chm0 chm0Var) {
        chm0 chm0Var2 = chm0Var;
        ((igm0) this.receiver).getClass();
        boolean z = chm0Var2.b;
        boolean z2 = false;
        boolean z3 = (chm0Var2.j || chm0Var2.i == null) ? false : true;
        if (z) {
            Set<Integer> set = chm0Var2.h;
            StoryEntry b = chm0Var2.b();
            if (j5g.P(set, b != null ? Integer.valueOf(b.c) : null)) {
                z2 = true;
            }
        }
        return new khm0.c(z, z3, z2);
    }
}
