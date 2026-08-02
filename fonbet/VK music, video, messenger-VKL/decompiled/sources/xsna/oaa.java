package xsna;

import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: CatalogMusicOfflineProviderNewImpl.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class oaa extends PropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oaa(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) ((laa) this.receiver).o.getValue();
                bool.booleanValue();
                return bool;
            default:
                return ((mtk0) this.receiver).getValue();
        }
    }
}
