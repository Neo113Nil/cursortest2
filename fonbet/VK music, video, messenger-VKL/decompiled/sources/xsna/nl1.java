package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.tile.VkTile;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nl1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ nl1(Context context, int i) {
        this.b = i;
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
                c = new kmu0(context, new hy20()).w0("Свайп включен").s0("Можете свайпнуть для закрытия").c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
                ((dw20.b) c).p(true).I0(null);
                return s3q0.a;
            case 2:
                return Integer.valueOf(krv0.m(R.attr.vk_ui_icon_secondary, context));
            default:
                int i2 = VkTile.C;
                return new bsv0(context);
        }
    }

    public /* synthetic */ nl1(Context context, Object obj, int i) {
        this.b = i;
        this.c = context;
    }
}
