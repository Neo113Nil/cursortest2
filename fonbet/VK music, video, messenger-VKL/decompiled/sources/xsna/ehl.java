package xsna;

import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: DefaultItemDecorations.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class ehl extends PropertyReference0Impl {
    public final /* synthetic */ int b = 0;

    public /* synthetic */ ehl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((fhl) this.receiver).a;
            default:
                return Float.valueOf(((zzz) this.receiver).c());
        }
    }

    public ehl(Object obj) {
        super(obj, fhl.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
    }
}
