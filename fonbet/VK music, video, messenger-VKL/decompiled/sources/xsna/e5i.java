package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.vk.common.links.LinksParserData;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vkontakte.android.R;
import org.chromium.net.NetError;
import org.json.JSONObject;
import xsna.tlo0;

/* compiled from: CommunityWebsiteItem.kt */
/* loaded from: classes5.dex */
public final class e5i extends we6 {
    public final f5i g;
    public final ynh h;
    public final int i = NetError.ERR_CERT_NO_REVOCATION_MECHANISM;

    /* compiled from: CommunityWebsiteItem.kt */
    public static final class a extends vif0<e5i> {
        public static final /* synthetic */ int p = 0;
        public final VkMiniInfoCell n;
        public e5i o;

        public a(VkMiniInfoCell vkMiniInfoCell) {
            super(vkMiniInfoCell);
            VkMiniInfoCell vkMiniInfoCell2 = (VkMiniInfoCell) this.itemView;
            this.n = vkMiniInfoCell2;
            vkMiniInfoCell2.setMode(VkMiniInfoCell.Mode.Link);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.vif0
        public final void i6(e5i e5iVar) {
            e5i e5iVar2 = e5iVar;
            if (epx.f(this.o, e5iVar2)) {
                return;
            }
            this.o = e5iVar2;
            VkMiniInfoCell.d dVar = new VkMiniInfoCell.d(new eko(enj.e(R.drawable.vk_icon_globe_outline_20, R.attr.vk_ui_icon_secondary, this.itemView.getContext())), null, 6);
            VkMiniInfoCell vkMiniInfoCell = this.n;
            vkMiniInfoCell.setIcon(dVar);
            String str = e5iVar2.g.b;
            if (!defpackage.b.b(str)) {
                if (e5iVar2.h.e().g(!brm0.B(str, "http", false) ? "http://".concat(str) : str)) {
                    vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(oq.d(tlo0.Companion, str), false, false, false, true, null, 46));
                    bwt0.i0(vkMiniInfoCell, new ut6(9, this, str));
                    bwt0.k0(vkMiniInfoCell, new mp3(7, this, str));
                    return;
                }
            }
            tlo0.a aVar = tlo0.Companion;
            ucp ucpVar = ucp.a;
            CharSequence i = ucp.i(((e5i) this.m).h.e().d(str, new LinksParserData(0, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) new e7(this, 18), 0, (taz) null, false, 15359)));
            aVar.getClass();
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(new tlo0.h(i), false, false, false, true, null, 46));
            vkMiniInfoCell.setOnClickListener(null);
            vkMiniInfoCell.setOnLongClickListener(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void q6(String str, String str2) {
            g2h g2hVar = new g2h(((e5i) this.m).g.c);
            g2hVar.e = "group";
            g2hVar.b = "site";
            g2hVar.c = str2;
            if (str2.equals("tap") || str2.equals("long_tap")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("link", str);
                jSONObject.put("source", "group");
                g2hVar.g = jSONObject;
            } else {
                g2hVar.f = str;
            }
            g2hVar.a();
        }
    }

    public e5i(f5i f5iVar, ynh ynhVar) {
        this.g = f5iVar;
        this.h = ynhVar;
    }

    @Override // xsna.we6
    public final vif0<e5i> a(ViewGroup viewGroup) {
        int i = a.p;
        Context context = viewGroup.getContext();
        VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(context, null, 6);
        vkMiniInfoCell.setId(R.id.vk_community_website_info_item);
        vkMiniInfoCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkMiniInfoCell.setBackgroundColor(krv0.m(R.attr.vk_ui_background_content, context));
        return new a(vkMiniInfoCell);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
