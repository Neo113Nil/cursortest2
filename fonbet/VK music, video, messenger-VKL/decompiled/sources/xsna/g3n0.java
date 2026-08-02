package xsna;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.users.User;
import com.vk.im.engine.models.users.UserNameCase;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.ayv0;
import xsna.ngv0;
import xsna.ss5;
import xsna.tgv0;
import xsna.tlo0;

/* compiled from: SuggestItemHolder.kt */
/* loaded from: classes16.dex */
public final class g3n0 extends vfz<f3n0> {
    public static final int o = cn70.b(24);
    public final VkRichCell l;
    public final lgb m;
    public f3n0 n;

    public g3n0(VkRichCell vkRichCell, com.vk.channels.impl.list.f fVar) {
        super(vkRichCell);
        this.l = vkRichCell;
        this.m = fVar;
        bwt0.i0(vkRichCell, new b8e0(this, 12));
        vkRichCell.setLeftMainAvatarController(new ss5());
    }

    @Override // xsna.vfz
    public final void W5(f3n0 f3n0Var) {
        tgv0.a aVar;
        String str;
        f3n0 f3n0Var2 = f3n0Var;
        this.n = f3n0Var2;
        VkCell.Left.b a = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new ss5.b(f3n0Var2.c, cn70.b(52)), 52));
        VkRichCell vkRichCell = this.l;
        vkRichCell.setLeft(a);
        VkText vkText = new VkText(this.itemView.getContext(), null, 6, 0);
        CharSequence charSequence = f3n0Var2.d;
        vkText.setText(charSequence);
        float textSize = vkText.getTextSize();
        tlo0.a aVar2 = tlo0.Companion;
        ucp ucpVar = ucp.a;
        CharSequence j = ucp.j(charSequence, Float.valueOf(textSize));
        bpn0 bpn0Var = cqm0.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
        aVar2.getClass();
        tlo0.h hVar = new tlo0.h(spannableStringBuilder);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        Drawable h = VerifyInfoHelper.h(VerifyInfoHelper.a, new VerifyInfo(f3n0Var2.g, false, false, false, false, false, 62, null), this.itemView.getContext(), VerifyInfoHelper.ColorTheme.normal, 8);
        vgv0 vgv0Var = new vgv0(hVar, (ngv0.a) null, h != null ? new ngv0.a(new eko(h), null, null, null, 14) : null, 1, 2);
        qgv0 qgv0Var = new qgv0(new tlo0.h(f3n0Var2.e), (ngv0.a) null, (ngv0.a) null, 2, 6);
        User user = f3n0Var2.h;
        if (user != null) {
            ImageList imageList = user.h;
            int i = o;
            Image Bb = imageList.Bb(i, i);
            if (Bb != null && (str = Bb.d) != null) {
                aVar = new tgv0.a(Collections.singletonList(new ayv0.c(str)), null, tlo0.a.c(R.string.vkim_suggest_invitation_sent_from, user.Q2(UserNameCase.NOM)), null, null, 98);
                tlo0.f fVar = new tlo0.f(R.string.vkapp_channels_suggested_subscribe_button_title);
                VkButton.Size size = VkButton.Size.Small;
                vkRichCell.setMiddle(ahn.v(vgv0Var, null, qgv0Var, null, aVar, new ogv0(fVar, new xm6(15, this, f3n0Var2), null, size, VkButton.Mode.Primary, null, false, false, 924), new ogv0(new tlo0.f(R.string.vkapp_channels_suggested_hide_button_title), new xy0(23, this, f3n0Var2), null, size, VkButton.Mode.Secondary, null, false, false, 924), 298));
                vkRichCell.setRight(new VkCell.Right.d(new VkCell.Right.a.C0822a(VkBadge.Appearance.Design.Accent), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
            }
        }
        aVar = null;
        tlo0.f fVar2 = new tlo0.f(R.string.vkapp_channels_suggested_subscribe_button_title);
        VkButton.Size size2 = VkButton.Size.Small;
        vkRichCell.setMiddle(ahn.v(vgv0Var, null, qgv0Var, null, aVar, new ogv0(fVar2, new xm6(15, this, f3n0Var2), null, size2, VkButton.Mode.Primary, null, false, false, 924), new ogv0(new tlo0.f(R.string.vkapp_channels_suggested_hide_button_title), new xy0(23, this, f3n0Var2), null, size2, VkButton.Mode.Secondary, null, false, false, 924), 298));
        vkRichCell.setRight(new VkCell.Right.d(new VkCell.Right.a.C0822a(VkBadge.Appearance.Design.Accent), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
    }
}
