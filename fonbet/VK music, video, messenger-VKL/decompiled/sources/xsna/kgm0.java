package xsna;

import android.graphics.Bitmap;
import com.vk.dto.stories.model.StoryEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.khm0;

/* compiled from: StoryStatisticsReducer.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class kgm0 extends FunctionReferenceImpl implements izs<chm0, khm0.d> {
    @Override // xsna.izs
    public final khm0.d invoke(chm0 chm0Var) {
        chm0 chm0Var2 = chm0Var;
        ((igm0) this.receiver).getClass();
        List<StoryEntry> list = chm0Var2.e;
        Pair<Integer, Bitmap> pair = chm0Var2.g;
        List<StoryEntry> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            Bitmap bitmap = null;
            if (i < 0) {
                e43.t();
                throw null;
            }
            StoryEntry storyEntry = (StoryEntry) obj;
            boolean z = i == chm0Var2.d;
            boolean z2 = chm0Var2.b;
            Integer num = chm0Var2.f.get(Integer.valueOf(storyEntry.c));
            int intValue = num != null ? num.intValue() : 0;
            if (i == pair.i().intValue()) {
                bitmap = pair.j();
            }
            arrayList.add(new m4d0(z, z2, storyEntry, intValue, bitmap));
            i = i2;
        }
        return new khm0.d(arrayList);
    }
}
