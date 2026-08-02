package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: StoriesArchiveInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class vpl0 implements upl0 {
    public final ou50 a;
    public final xpl0 b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public vpl0(ou50 ou50Var, xpl0 xpl0Var) {
        this.a = ou50Var;
        this.b = xpl0Var;
    }

    @Override // xsna.upl0
    public final io.reactivex.rxjava3.internal.operators.single.o a(int i, UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.single.o(this.a.a(i, userId, null).l(new wx40(new ye40(15), 7)), new c120(new zb60(this, 26), 26));
    }

    @Override // xsna.upl0
    public final io.reactivex.rxjava3.internal.operators.single.o b(int i, UserId userId, int i2) {
        ArrayList arrayList;
        avl0 avl0Var = this.b.a;
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        List<BaseUserGroupFieldsDto> list = isl0.a;
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.getArchive", new yul0(0), new ful0(1));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf.intValue(), 0, 0, 8);
        tfxVar.f(valueOf2.intValue(), 0, 500, "count");
        tfxVar.j("extended", true);
        if (list != null) {
            List<BaseUserGroupFieldsDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return new io.reactivex.rxjava3.internal.operators.single.o(rsg0.w0(yfb.x(tfxVar)).l(new uxb0(new wpl0(userId, 0), 6)), new hu50(new whg0(this, 8), 19));
    }

    @Override // xsna.upl0
    public final ArrayList c(UserId userId, Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            StoryEntry storyEntry = (StoryEntry) this.c.get(r11.b(new StringBuilder(), userId.b, '_', ((Number) it.next()).intValue()));
            if (storyEntry != null) {
                arrayList.add(storyEntry);
            }
        }
        return arrayList;
    }

    @Override // xsna.upl0
    public final StoryEntry d(int i, UserId userId) {
        return (StoryEntry) this.c.get(r11.b(new StringBuilder(), userId.b, '_', i));
    }
}
