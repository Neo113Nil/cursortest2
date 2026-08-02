package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: ItemGroupPresenter.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public final class mux implements kux {
    public nux b;
    public gzs<s3q0> c;
    public gzs<s3q0> d;
    public final pxo0 e = new pxo0(1000);

    @Override // xsna.bux
    public final gzs<s3q0> H1() {
        return this.c;
    }

    @Override // xsna.bux
    public final gzs<s3q0> J0() {
        return this.d;
    }

    @Override // xsna.kux
    public final void R3(Group group, gzs gzsVar, gzs gzsVar2) {
        CharSequence charSequence;
        VerifyInfo verifyInfo = group.y;
        nux nuxVar = this.b;
        if (nuxVar == null) {
            nuxVar = null;
        }
        if (verifyInfo.Cb()) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) group.b;
            charSequence = spannableStringBuilder;
            if (spannableStringBuilder == null) {
                ucp ucpVar = ucp.a;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ucp.i(group.d));
                spannableStringBuilder2.append((char) 160);
                spannableStringBuilder2.append((char) 160);
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                nux nuxVar2 = this.b;
                if (nuxVar2 == null) {
                    nuxVar2 = null;
                }
                spannableStringBuilder2.setSpan(new dqa(VerifyInfoHelper.h(verifyInfoHelper, verifyInfo, nuxVar2.getContext(), null, 28)), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 0);
                group.b = spannableStringBuilder2;
                charSequence = spannableStringBuilder2;
            }
        } else {
            CharSequence charSequence2 = group.b;
            charSequence = charSequence2;
            if (charSequence2 == null) {
                ucp ucpVar2 = ucp.a;
                CharSequence i = ucp.i(group.d);
                group.b = i;
                charSequence = i;
            }
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(group.z);
        if (group.G) {
            ylw ylwVar = new ylw(R.drawable.vk_icon_badge_vk_pay_14);
            ylwVar.f = iah0.a(2.0f);
            ylwVar.g = iah0.a(8.0f);
            ylwVar.h = R.attr.vk_ui_icon_secondary;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            spannableStringBuilder3.append((CharSequence) ylwVar.b(context));
        }
        VkCell vkCell = nuxVar.c;
        VkCell.Middle.a aVar = VkCell.Middle.Companion;
        tlo0.h f = u11.f(tlo0.Companion, charSequence);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(f, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(spannableStringBuilder3), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
        nux nuxVar3 = this.b;
        if (nuxVar3 == null) {
            nuxVar3 = null;
        }
        nuxVar3.setAvatarParams(group.e);
        nux nuxVar4 = this.b;
        (nuxVar4 != null ? nuxVar4 : null).setActionVisibility(false);
        this.c = gzsVar;
        this.d = gzsVar2;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.bux
    public final pxo0 q3() {
        return this.e;
    }
}
