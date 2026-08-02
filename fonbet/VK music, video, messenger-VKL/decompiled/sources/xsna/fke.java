package xsna;

import com.vk.clips.attachments.api.publish.links.ClipsLinksAttachEntryParams;
import kotlin.NoWhenBranchMatchedException;
import xsna.gke;
import xsna.lke;
import xsna.uje;

/* compiled from: ClipsLinksEditFeature.kt */
/* loaded from: classes16.dex */
public final class fke extends wk50<jke, ike, uje, gke> {
    public final f4z f;

    public fke(ClipsLinksAttachEntryParams clipsLinksAttachEntryParams) {
        super(new uje.a(clipsLinksAttachEntryParams.c, clipsLinksAttachEntryParams.b, clipsLinksAttachEntryParams.d), new hke(ike.f));
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(ike ikeVar, uje ujeVar) {
        ike ikeVar2 = ikeVar;
        uje ujeVar2 = ujeVar;
        String str = ikeVar2.c;
        String str2 = ikeVar2.b;
        if (ujeVar2 instanceof uje.a) {
            uje.a aVar = (uje.a) ujeVar2;
            T(new gke.c(aVar.b, aVar.c, aVar.d));
            return;
        }
        if (ujeVar2 instanceof uje.b) {
            T(new gke.a(((uje.b) ujeVar2).b));
            return;
        }
        if (ujeVar2 instanceof uje.c) {
            T(new gke.b(((uje.c) ujeVar2).b));
            return;
        }
        boolean equals = ujeVar2.equals(uje.e.b);
        f4z f4zVar = this.f;
        if (equals) {
            f4zVar.b(new lke.b(str2, str));
        } else {
            if (!ujeVar2.equals(uje.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(new lke.a(str2, str));
        }
    }
}
