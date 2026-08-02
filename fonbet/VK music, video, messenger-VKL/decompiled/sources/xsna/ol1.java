package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.tile.VkTile;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ol1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ ol1(Context context) {
        this.b = 2;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        dw20.a c;
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                hny hnyVar = new hny(context);
                hnyVar.c(iah0.b(4.0f), R.attr.vk_ui_background_secondary);
                return hnyVar;
            case 1:
                c = new kmu0(context, new hy20()).w0("Закрытие по тапу выключено").c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
                ((dw20.b) c).q(false).I0(null);
                return s3q0.a;
            default:
                int i2 = VkTile.C;
                return new csv0(context);
        }
    }

    public /* synthetic */ ol1(Context context, Object obj, int i) {
        this.b = i;
        this.c = context;
    }
}
