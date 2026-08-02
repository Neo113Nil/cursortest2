package xsna;

import android.os.Bundle;
import android.view.ViewGroup;
import com.vk.common.links.LinksParserData;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.user.deactivation.Deactivation;
import com.vkontakte.android.R;
import org.chromium.net.NetError;

/* compiled from: CommunityBlockedOrPrivateItem.kt */
/* loaded from: classes5.dex */
public final class atg extends we6 {
    public final btg g;
    public final sdz h;
    public final int i = NetError.ERR_CERTIFICATE_TRANSPARENCY_REQUIRED;

    /* compiled from: CommunityBlockedOrPrivateItem.kt */
    public static final class a extends vif0<atg> {
        public final VkLinkedText n;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.item_community_blocked, 0);
            this.n = (VkLinkedText) this.itemView.findViewById(R.id.community_blocked_text);
        }

        @Override // xsna.vif0
        public final void i6(atg atgVar) {
            atg atgVar2 = atgVar;
            btg btgVar = atgVar2.g;
            boolean z = btgVar.b;
            VkLinkedText vkLinkedText = this.n;
            if (z) {
                f4m.y(cn70.b(18), this.itemView);
                vkLinkedText.setText(R.string.community_private_text);
            } else {
                sdz sdzVar = atgVar2.h;
                Deactivation deactivation = btgVar.c;
                vkLinkedText.setText(sdzVar.d(deactivation != null ? deactivation.q5() : null, new LinksParserData(112, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382)));
            }
        }
    }

    public atg(btg btgVar, sdz sdzVar) {
        this.g = btgVar;
        this.h = sdzVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
