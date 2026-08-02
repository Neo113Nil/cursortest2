package defpackage;

import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.TsarButtonConfigV2;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes3.dex */
public final class g5j0 implements f5j0 {
    public final b a;

    public g5j0(b bVar) {
        this.a = bVar;
    }

    public final Map a() {
        b bVar = this.a;
        return gw00.e(new Pair("tsar_button_enabled", Boolean.valueOf(bVar.q().getTsarButton() != null || ((TsarButtonConfigV2) bVar.d(zi11.a).getData()).isEnabled())));
    }
}
