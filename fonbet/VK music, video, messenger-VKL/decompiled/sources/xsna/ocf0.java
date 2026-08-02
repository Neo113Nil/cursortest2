package xsna;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.text.VkText;
import com.vk.stat.scheme.SchemeStat$TypeChannelSource;
import com.vkontakte.android.R;
import xsna.ngv0;
import xsna.ss5;
import xsna.tlo0;

/* compiled from: RecommendedChannelItemViewHolderV2.kt */
/* loaded from: classes16.dex */
public final class ocf0 extends vfz<mcf0> implements ldb {
    public final VkRichCell l;
    public final lgb m;
    public final com.vk.im.ui.formatters.spans.dialogitem.a n;
    public mcf0 o;

    public ocf0(VkRichCell vkRichCell, com.vk.channels.impl.list.f fVar, com.vk.im.ui.formatters.spans.dialogitem.a aVar) {
        super(vkRichCell);
        this.l = vkRichCell;
        this.m = fVar;
        this.n = aVar;
        bwt0.i0(vkRichCell, new ap30(this, 13));
        vkRichCell.setLeftMainAvatarController(new ss5());
    }

    @Override // xsna.ldb
    public final SchemeStat$TypeChannelSource K4() {
        return SchemeStat$TypeChannelSource.FOLDER_RECOMM;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(mcf0 mcf0Var) {
        mcf0 mcf0Var2 = mcf0Var;
        this.o = mcf0Var2;
        VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new ss5.b(mcf0Var2.c, cn70.b(52)), 52));
        VkRichCell vkRichCell = this.l;
        vkRichCell.setLeft(a);
        VkText vkText = new VkText(this.itemView.getContext(), null, 6, 0);
        String str = mcf0Var2.d;
        vkText.setText(str);
        float textSize = vkText.getTextSize();
        CharSequence charSequence = mcf0Var2.e;
        com.vk.im.ui.formatters.spans.dialogitem.a aVar = this.n;
        aVar.getClass();
        boolean z = charSequence instanceof Spanned;
        Spanned spanned = z ? (Spanned) charSequence : null;
        if (spanned != null) {
            aVar.b(spanned);
        }
        Spanned spanned2 = z ? (Spanned) charSequence : null;
        if (spanned2 != null) {
            aVar.c(spanned2);
        }
        tlo0.a aVar2 = tlo0.Companion;
        ucp ucpVar = ucp.a;
        CharSequence j = ucp.j(str, Float.valueOf(textSize));
        bpn0 bpn0Var = cqm0.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        aVar2.getClass();
        vgv0 vgv0Var = new vgv0(new tlo0.h(spannableStringBuilder), (ngv0.a) null, (ngv0) null, 0, 30);
        tlo0.h hVar = new tlo0.h(charSequence);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vkRichCell.setMiddle(ahn.v(vgv0Var, null, new qgv0(hVar, (ngv0.a) null, (ngv0.a) null, 2, 6), null, null, new ogv0(new tlo0.f(R.string.vkapp_channels_suggested_subscribe_button_title), new defpackage.f0(24, this, mcf0Var2), null, VkButton.Size.Small, VkButton.Mode.Primary, null, false, false, 924), null, 442));
    }

    @Override // xsna.ldb
    public final String h2() {
        mcf0 mcf0Var = this.o;
        if (mcf0Var == null) {
            mcf0Var = null;
        }
        return mcf0Var.f;
    }
}
