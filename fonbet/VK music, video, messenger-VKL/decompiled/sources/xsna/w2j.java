package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: ConfirmSubscriptionCancelBottomSheet.kt */
/* loaded from: classes6.dex */
public final class w2j {
    public final Context a;
    public final a b;
    public dw20 c;

    /* compiled from: ConfirmSubscriptionCancelBottomSheet.kt */
    public interface a {
        void a();

        void onDismiss();
    }

    public w2j(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public final void a(GameSubscription gameSubscription) {
        Context context = this.a;
        View inflate = LayoutInflater.from(context).inflate(R.layout.vk_layout_cancel_subscription_bottom_sheet, (ViewGroup) null, false);
        boolean z = gameSubscription.q;
        Button button = (Button) inflate.findViewById(R.id.dismiss_button);
        Button button2 = (Button) inflate.findViewById(R.id.confirm_cancel_button);
        TextView textView = (TextView) inflate.findViewById(R.id.date);
        TextView textView2 = (TextView) inflate.findViewById(R.id.title);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.image);
        int i = bix0.a;
        long j = gameSubscription.m;
        String str = gameSubscription.j;
        textView.setText(context.getString(R.string.vk_next_bill_will, bix0.a((int) j, context)));
        textView2.setText(context.getString(z ? R.string.vk_cancel_subscription_in_game : R.string.vk_cancel_subscription_in_miniapp, gameSubscription.k, gameSubscription.l));
        if (drm0.N(str)) {
            frameLayout.setVisibility(8);
        } else {
            ifx0 ifx0Var = e370.c;
            if (ifx0Var == null) {
                ifx0Var = null;
            }
            VKImageController<View> create = ifx0Var.b().create(context);
            if (!drm0.N(str)) {
                frameLayout.addView(((com.vk.core.ui.image.c) create).getView());
                create.f(str, new VKImageController.b(14.0f, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65534));
            }
        }
        button.setOnClickListener(new v9b(this, 2));
        button2.setOnClickListener(new um3(this, 4));
        this.c = new dw20.b(context, null).D0(inflate, false).P0().X(new sbg(this, 10)).I0("");
    }
}
