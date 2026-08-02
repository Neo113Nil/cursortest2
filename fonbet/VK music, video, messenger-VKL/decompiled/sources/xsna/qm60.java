package xsna;

import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: NewsfeedItemDecorations.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class qm60 extends PropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm60(Object obj, int i) {
        super(obj, rm60.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(obj, zzz.class, "currentAngle", "getCurrentAngle()F", 0);
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((rm60) this.receiver).a;
            default:
                return Float.valueOf(((zzz) this.receiver).c());
        }
    }
}
