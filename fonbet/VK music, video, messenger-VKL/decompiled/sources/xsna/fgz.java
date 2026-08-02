package xsna;

import com.vk.dto.common.data.VKList;

/* compiled from: ListUiCallback.java */
@Deprecated
/* loaded from: classes7.dex */
public class fgz<S> extends rpj0<VKList<S>> {
    public final was<VKList<S>> d;

    public fgz(was<VKList<S>> wasVar) {
        super(wasVar);
        this.d = wasVar;
    }

    @Override // xsna.hx2
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void b(VKList<S> vKList) {
        this.d.onSuccess(vKList);
    }
}
