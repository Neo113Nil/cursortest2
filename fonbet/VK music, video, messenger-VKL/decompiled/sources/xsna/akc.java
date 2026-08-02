package xsna;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.common.links.AwayLink;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.stories.model.clickable.ClickableServiceYcItem;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$CastConnectOfferModalType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class akc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ akc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AwayLink awayLink;
        String str;
        switch (this.b) {
            case 0:
                qkc qkcVar = (qkc) this.c;
                ClickableServiceYcItem clickableServiceYcItem = (ClickableServiceYcItem) this.d;
                qkcVar.m(clickableServiceYcItem);
                SnippetAttachment snippetAttachment = clickableServiceYcItem.h;
                if (snippetAttachment != null && (awayLink = snippetAttachment.f) != null && (str = awayLink.b) != null) {
                    g2v.c().k().b(view.getContext(), str);
                    break;
                }
                break;
            case 1:
                llu lluVar = (llu) this.c;
                lluVar.f = new rs0(8, lluVar, (View) this.d);
                dw20 dw20Var = lluVar.b;
                if (dw20Var != null) {
                    dw20Var.hide();
                    break;
                }
                break;
            case 2:
                ((god0) this.c).a.d((FragmentActivity) this.d);
                break;
            default:
                ctp0 ctp0Var = (ctp0) this.c;
                VkButton vkButton = (VkButton) this.d;
                ctp0Var.c.c(MobileOfficialAppsVideoStat$CastConnectOfferModalType.OFFER_MODAL_FIRST);
                if (ctp0Var.a == null) {
                    vkButton.getContext();
                    fwb0 fwb0Var = ctp0Var.f;
                    if (fwb0Var == null) {
                        fwb0Var = null;
                    }
                    fwb0Var.b();
                    ctp0Var.d.getClass();
                } else {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"RETRANSLATION_UTILS", "Connecting to device Xiaomi MI TV Stick"});
                    }
                    qu5.c().getClass();
                }
                fwb0 fwb0Var2 = ctp0Var.f;
                (fwb0Var2 != null ? fwb0Var2 : null).b();
                break;
        }
    }
}
