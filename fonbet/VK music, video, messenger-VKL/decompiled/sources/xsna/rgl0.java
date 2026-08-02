package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.log.L;
import com.vk.voip.ui.VoipStatManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bjw0;
import xsna.qr60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rgl0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ rgl0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return "?";
            case 1:
                return new tfu(n34.a(((ery) obj).a()));
            case 2:
                qgi0.r((tgi0) obj, "storefront_add_icon");
                return s3q0.a;
            case 3:
                qgi0.r((tgi0) obj, "cancel_button");
                return s3q0.a;
            case 4:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    g5g.y(((fv6) ((com.vk.upload.impl.b) it.next())).e().a, arrayList);
                }
                return arrayList;
            case 5:
                qgi0.r((tgi0) obj, "toolbar_title");
                return s3q0.a;
            case 6:
                qgi0.r((tgi0) obj, "template_picker_toolbar_title");
                return s3q0.a;
            case 7:
                String str = (String) obj;
                return drm0.N(str) ? str.length() < 4 ? "    " : str : "    ".concat(str);
            case 8:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 9:
                j5n0 j5n0Var = (j5n0) obj;
                return new s4n0(new qr60.a.f(j5n0Var.a, j5n0Var.b, j5n0Var.d));
            case 10:
                L.j((Throwable) obj, "toggles: can't track toggle");
                return s3q0.a;
            case 11:
                L.g("USER_PROFILE_LEGO_AVATAR", (Throwable) obj);
                return s3q0.a;
            case 12:
                return s3q0.a;
            case 13:
                UIBlock uIBlock = (UIBlock) obj;
                return Boolean.valueOf(((uIBlock instanceof UIBlockVideo) && drm0.D(((UIBlockVideo) uIBlock).Sb(), "my/bookmarks", false)) || (uIBlock instanceof UIBlockPlaceholder));
            case 14:
                return Boolean.valueOf(((UIBlock) obj) instanceof UIBlockPlaceholder);
            case 15:
                return bjw0.d.a;
            default:
                if (VoipStatManager.c) {
                    VoipStatManager.a.d = VoipStatManager.StatData.ConnectionType.relay;
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ rgl0(dks0 dks0Var) {
        this.b = 13;
    }
}
