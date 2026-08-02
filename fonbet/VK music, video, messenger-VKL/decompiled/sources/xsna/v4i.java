package xsna;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.dto.user.deactivation.Deactivation;
import com.vkontakte.android.R;
import kotlin.Pair;
import org.chromium.net.NetError;
import xsna.tlo0;

/* compiled from: CommunityUserSubscribedItem.kt */
/* loaded from: classes5.dex */
public final class v4i extends we6 {
    public final w4i g;
    public final cwg h;
    public final defpackage.f i;
    public final c4h j;
    public final int k = NetError.ERR_CERT_REVOKED;

    /* compiled from: CommunityUserSubscribedItem.kt */
    public static final class a extends vif0<v4i> {
        public static final /* synthetic */ int o = 0;
        public final VkMiniInfoCell n;

        public a(VkMiniInfoCell vkMiniInfoCell) {
            super(vkMiniInfoCell);
            this.n = (VkMiniInfoCell) this.itemView;
        }

        @Override // xsna.vif0
        public final void i6(v4i v4iVar) {
            SpannableString spannableString;
            VkMiniInfoCell.Mode mode = VkMiniInfoCell.Mode.BaseAccent;
            VkMiniInfoCell vkMiniInfoCell = this.n;
            vkMiniInfoCell.setMode(mode);
            w4i w4iVar = v4iVar.g;
            Deactivation deactivation = w4iVar.d;
            if (deactivation == null || deactivation.getReason() == Deactivation.Reason.Hidden) {
                int i = w4iVar.e;
                String d = uqm0.d(i);
                Pair pair = new Pair(Integer.valueOf(R.plurals.community_subscribers), Integer.valueOf(R.string.community_subscribers_formatted));
                SpannableString spannableString2 = new SpannableString(uqm0.i(i, ((Number) pair.i()).intValue(), ((Number) pair.j()).intValue(), true));
                StyleSpan styleSpan = new StyleSpan(1);
                int K = drm0.K(0, 6, spannableString2, d, false);
                if (K != -1) {
                    spannableString2.setSpan(styleSpan, K, d.length() + K, 33);
                }
                spannableString2.setSpan(new t4i(this), 0, spannableString2.length(), 33);
                spannableString = spannableString2;
            } else {
                spannableString = null;
            }
            Context context = vkMiniInfoCell.getContext();
            boolean z = spannableString != null;
            SpannableString spannableString3 = new SpannableString(context.getString(R.string.community_status_button_group_joined));
            spannableString3.setSpan(new u4i(context, this), 0, spannableString3.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString3);
            if (z) {
                spannableStringBuilder.append((CharSequence) rik0.a);
            }
            tlo0.a aVar = tlo0.Companion;
            if (spannableString != null) {
                spannableStringBuilder = spannableStringBuilder.append((CharSequence) spannableString);
            }
            aVar.getClass();
            vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(new tlo0.h(spannableStringBuilder), false, false, false, true, null, 46));
        }
    }

    public v4i(w4i w4iVar, cwg cwgVar, defpackage.f fVar, c4h c4hVar) {
        this.g = w4iVar;
        this.h = cwgVar;
        this.i = fVar;
        this.j = c4hVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        int i = a.o;
        Context context = viewGroup.getContext();
        VkMiniInfoCell vkMiniInfoCell = new VkMiniInfoCell(context, null, 6);
        vkMiniInfoCell.setId(R.id.vk_community_user_subscribed_info_item);
        vkMiniInfoCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkMiniInfoCell.setBackgroundColor(krv0.m(R.attr.vk_ui_background_content, context));
        return new a(vkMiniInfoCell);
    }

    @Override // xsna.we6
    public final int h() {
        return this.k;
    }
}
