package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.newsfeed.Owner;

/* compiled from: AttachLinkGeneratorImpl.kt */
/* loaded from: classes17.dex */
public final class k24 implements j24 {
    @Override // xsna.j24
    public final String a(Owner owner, Attach attach) {
        String o = emi.o(owner);
        return o != null ? attach.N4(o) : attach.N4(a0a.d);
    }
}
