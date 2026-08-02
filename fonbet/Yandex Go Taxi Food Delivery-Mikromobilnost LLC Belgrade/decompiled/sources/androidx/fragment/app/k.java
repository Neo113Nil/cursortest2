package androidx.fragment.app;

import defpackage.ims;
import defpackage.x50;

/* loaded from: classes10.dex */
public final class k implements ims {
    public final /* synthetic */ Fragment a;

    public k(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.ims
    /* renamed from: apply */
    public final Object mo104apply(Object obj) {
        Fragment fragment = this.a;
        Object obj2 = fragment.mHost;
        return obj2 instanceof x50 ? ((x50) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
    }
}
