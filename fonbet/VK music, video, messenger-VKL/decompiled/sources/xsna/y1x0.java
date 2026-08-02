package xsna;

import com.vk.voip.ui.share.link.pager_new.model.SharingReason;
import xsna.tlo0;

/* compiled from: VoipShareLinkSheetPatch.kt */
/* loaded from: classes7.dex */
public interface y1x0 extends xl50 {

    /* compiled from: VoipShareLinkSheetPatch.kt */
    public static final class a implements y1x0 {
        public final tlo0.g b;
        public final com.vk.voip.ui.share.link.pager.view.b c;
        public final SharingReason d;
        public final qtd0 e;

        public a(tlo0.g gVar, com.vk.voip.ui.share.link.pager.view.b bVar, SharingReason sharingReason, qtd0 qtd0Var) {
            this.b = gVar;
            this.c = bVar;
            this.d = sharingReason;
            this.e = qtd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitPatch(title=");
            sb.append(this.b);
            sb.append(", sharingDelegate=");
            sb.append(this.c);
            sb.append(", reason=");
            sb.append(this.d);
            sb.append(", profile=");
            return qq.f(sb, this.e, ')');
        }
    }
}
