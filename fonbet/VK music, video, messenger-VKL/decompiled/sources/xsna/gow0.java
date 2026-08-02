package xsna;

import com.vk.voip.userid.CallsUserId;
import java.util.HashMap;

/* compiled from: VoipFirstCallCacheImpl.kt */
/* loaded from: classes11.dex */
public final class gow0 implements fow0 {
    public final HashMap<CallsUserId, Boolean> a = new HashMap<>();

    @Override // xsna.fow0
    public final void a(CallsUserId callsUserId, boolean z) {
        this.a.put(callsUserId, Boolean.valueOf(z));
    }

    @Override // xsna.fow0
    public final boolean b(CallsUserId callsUserId) {
        return this.a.getOrDefault(callsUserId, Boolean.TRUE).booleanValue();
    }
}
