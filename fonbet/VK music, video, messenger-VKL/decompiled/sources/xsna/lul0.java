package xsna;

import com.vk.api.generated.stories.dto.StoriesMarkSkippedInputDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.internal.api.GsonHolder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StoriesRepositoryImpl.kt */
/* loaded from: classes11.dex */
public final class lul0 {
    public final avl0 a;
    public final k0x b;

    public lul0() {
        this(0);
    }

    public static io.reactivex.rxjava3.internal.operators.single.y c(xy2 xy2Var) {
        return rsg0.w0(yfb.x(xy2Var)).l(new pu50(new q520(20), 12));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y a(boolean z, String str, UserId userId, UserId userId2) {
        String a = zeq0.a();
        ArrayList a2 = isl0.a();
        return rsg0.w0(yfb.x(zul0.h(this.a, userId, Boolean.valueOf(z), str, userId2, a2, a, null, null, null, 32640))).l(new fhb0(new ou1(new rsl0()), 7));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y b(List list) {
        List<StoryEntry> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (StoryEntry storyEntry : list2) {
            arrayList.add(new StoriesMarkSkippedInputDto(storyEntry.d, Integer.valueOf(storyEntry.c), storyEntry.u));
        }
        this.a.getClass();
        tfx tfxVar = new tfx("stories.markSkipped", new fq(28), new joi0(4));
        tfx.o(tfxVar, "stories", GsonHolder.a().toJson(arrayList), 0, 0, 12);
        return c(tfxVar);
    }

    public lul0(int i) {
        avl0 avl0Var = new avl0();
        k0x k0xVar = new k0x(4);
        this.a = avl0Var;
        this.b = k0xVar;
    }
}
