package xsna;

import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.dto.common.id.UserId;
import xsna.uon0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ioc implements io.reactivex.rxjava3.core.a0, uon0.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ioc(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.uon0.a
    public Object execute() {
        qdq0 qdq0Var = (qdq0) this.b;
        return Boolean.valueOf(qdq0Var.c.R1((eo5) this.c));
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        ClipCoauthorListItem clipCoauthorListItem = (ClipCoauthorListItem) this.b;
        syf syfVar = (syf) this.c;
        boolean z = clipCoauthorListItem.h;
        UserId userId = clipCoauthorListItem.b.b;
        if (z) {
            if (syfVar != null) {
                syfVar.b(userId, new w8(yVar, 20));
            }
        } else if (syfVar != null) {
            syfVar.c(userId, new e5(yVar, 24));
        }
    }
}
