package xsna;

import com.vk.voip.OKVoipEngine;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: CatalogMusicOfflineProviderNewImpl.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class naa extends PropertyReference0Impl {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ naa(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                Boolean bool = (Boolean) ((laa) this.receiver).m.getValue();
                bool.booleanValue();
                return bool;
            default:
                ((OKVoipEngine) this.receiver).getClass();
                dhw0 dhw0Var = OKVoipEngine.B;
                boolean z = false;
                if (dhw0Var != null && dhw0Var.K) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public naa(Object obj) {
        super(obj, OKVoipEngine.class, "isCurrentCallRecurrent", "isCurrentCallRecurrent()Z", 0);
    }
}
