package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.soloader.MinElf;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import xsna.o0r0;

/* compiled from: ImWriteByPhoneModal.kt */
/* loaded from: classes2.dex */
public final class dfw {
    public final Context a;
    public final ezv b;
    public final b25 c;
    public final o0r0 d;
    public final hpj e;
    public final View f;
    public final VkButton g;
    public final VkInputSelect h;
    public VkModal i;

    public dfw(Context context, ezv ezvVar, b25 b25Var, o0r0 o0r0Var) {
        this.a = context;
        this.b = ezvVar;
        this.c = b25Var;
        this.d = o0r0Var;
        bdn bdnVar = bdn.a;
        this.e = zvj.a(ie00.a);
        View inflate = LayoutInflater.from(context).inflate(R.layout.vkim_popup_write_by_phone_number_content, (ViewGroup) null);
        this.f = inflate;
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.write_button);
        this.g = vkButton;
        VkButton vkButton2 = (VkButton) inflate.findViewById(R.id.create_contact_button);
        VkInputSelect vkInputSelect = (VkInputSelect) inflate.findViewById(R.id.phone_edit_text);
        this.h = vkInputSelect;
        vkInputSelect.getEditText().addTextChangedListener(new yfb0(context));
        vkButton.setEnabled(false);
        vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_message_outline_24));
        vkInputSelect.getEditText().addTextChangedListener(new bfw(this));
        bwt0.i0(vkButton, new k7f(this, 22));
        bwt0.i0(vkButton2, new xcd(this, 28));
    }

    public static final void a(dfw dfwVar, qtd0 qtd0Var) {
        dfwVar.getClass();
        Context context = dfwVar.a;
        if (BuildInfo.g()) {
            dfwVar.d.m(context, new UserId(qtd0Var.G3()), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
        } else if (qtd0Var.t8() != Peer.Type.UNKNOWN) {
            o0w.x(g2v.c().b(), dfwVar.a, null, qtd0Var.G3(), qv20.m(qtd0Var), null, null, false, null, null, null, null, null, null, "conversations_search", null, null, null, false, null, null, null, null, null, 1073733618);
        } else {
            g2v.c().getClass();
            k9u0.a.g(context, (q2a0) qtd0Var);
        }
    }
}
