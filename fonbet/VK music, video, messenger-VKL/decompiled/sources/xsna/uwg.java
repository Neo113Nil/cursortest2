package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;
import com.vk.ecomm.checklist.impl.presentation.model.CommunityCheckListSubscribeVkBusinessArgs;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: CommunityCheckListSubscribeVkBusinessBottomSheet.kt */
/* loaded from: classes18.dex */
public final class uwg extends dw20 {
    public static final /* synthetic */ int g1 = 0;
    public final FrameLayout.LayoutParams f1 = new FrameLayout.LayoutParams(-1, -2);

    /* compiled from: CommunityCheckListSubscribeVkBusinessBottomSheet.kt */
    public static final class a extends dw20.b {
        public final CommunityCheckListTip.Type e;
        public final String f;

        public a(CommunityCheckListTip.Type type, String str, Context context) {
            super(context, null);
            this.e = type;
            this.f = str;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            View inflate = LayoutInflater.from(this.c).inflate(R.layout.community_check_list_subscribe_vk_business_bottom_sheet, (ViewGroup) null, false);
            y(enj.c(R.drawable.vk_bg_radius_12, e3m.f(R.attr.vk_ui_background_modal, this.c), this.c));
            this.d.x0 = iah0.a(8);
            D0(inflate, false);
            x(0);
            u(0);
            c(new d5j(inflate));
            F0(true);
            uwg uwgVar = new uwg();
            Bundle bundle = new Bundle();
            bundle.putParcelable(fpf0.a(CommunityCheckListSubscribeVkBusinessArgs.class).l(), new CommunityCheckListSubscribeVkBusinessArgs(this.e, this.f));
            uwgVar.setArguments(bundle);
            return uwgVar;
        }
    }

    @Override // xsna.dw20
    public final FrameLayout.LayoutParams In() {
        return this.f1;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        jjc.g((TextView) yn.findViewById(R.id.go), new l00(this, 26));
        return yn;
    }
}
