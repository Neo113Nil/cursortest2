package xsna;

import android.widget.PopupWindow;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.ui.core.util.EditorMode;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarVh;
import com.vkontakte.android.R;
import xsna.huw0;
import xsna.mp90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dtv0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dtv0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        UIBlockActionEnterEditMode uIBlockActionEnterEditMode;
        String str;
        izs<String, s3q0> izsVar;
        WebViewEvent sendUserConsentChange$lambda$19;
        switch (this.b) {
            case 0:
                ((PopupWindow) this.c).dismiss();
                return s3q0.a;
            case 1:
                VkTopBarVh vkTopBarVh = (VkTopBarVh) this.c;
                UIBlockList uIBlockList = vkTopBarVh.q;
                q3a q3aVar = vkTopBarVh.c;
                if (uIBlockList == null || (uIBlockActionEnterEditMode = uIBlockList.C) == null || (str = uIBlockActionEnterEditMode.z) == null) {
                    return s3q0.a;
                }
                if (vkTopBarVh.r) {
                    q3aVar.b(new qd3(str, null), true);
                    q3aVar.b(new zra(EditorMode.EXIT_EDITOR_MODE, str), true);
                } else {
                    String str2 = uIBlockList.c;
                    if (str2 != null && (izsVar = vkTopBarVh.l) != null) {
                        izsVar.invoke(str2);
                    }
                    q3aVar.b(new zra(EditorMode.ENTER_EDITOR_MODE, str), true);
                }
                vkTopBarVh.d(!vkTopBarVh.r);
                return s3q0.a;
            case 2:
                ((mjw0) this.c).f(false);
                return s3q0.a;
            case 3:
                ((huw0.a) this.c).l.a(mp90.c.a.a);
                return s3q0.a;
            case 4:
                r4x0 r4x0Var = (r4x0) this.c;
                return Boolean.valueOf(r4x0Var.e() && r4x0Var.j());
            case 5:
                sendUserConsentChange$lambda$19 = WebViewAdPlayer.sendUserConsentChange$lambda$19((byte[]) this.c);
                return sendUserConsentChange$lambda$19;
            case 6:
                return ((y0y0) this.c).a.findViewById(R.id.comment_restriction_attach_divider);
            default:
                r6y0 r6y0Var = (r6y0) this.c;
                r6y0Var.setCancelable(true);
                r6y0Var.dismiss();
                return s3q0.a;
        }
    }
}
