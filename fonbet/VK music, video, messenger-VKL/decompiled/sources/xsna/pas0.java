package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.hints.HintCategories;
import com.vk.dto.video.LiveCategory;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.dw20;

/* compiled from: VideoCategoryBottomSheet.kt */
/* loaded from: classes2.dex */
public final class pas0 extends kq6 {
    public static final e520 e = new e520(R.id.video_copy_link, R.drawable.vk_icon_copy_outline_28, R.string.copy_link, 1, false, 0, 0, false, null, 0, null, false, 8176);
    public static final e520 f = new e520(R.id.share, R.drawable.vk_icon_share_outline_28, R.string.video_share, 2, false, 0, 0, false, null, 0, null, false, 8176);
    public final Context c;
    public final LiveCategory d;

    public pas0(Context context, LiveCategory liveCategory) {
        this.c = context;
        this.d = liveCategory;
    }

    @Override // xsna.kq6
    public final dw20 a() {
        av20.a aVar = new av20.a();
        final Context context = this.c;
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(context));
        aVar.d = new oas0(context);
        final LiveCategory liveCategory = this.d;
        aVar.c(new yzs() { // from class: xsna.nas0
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                l7m d;
                BridgeComponent bridgeComponent;
                e520 e520Var = (e520) obj2;
                ((Integer) obj3).getClass();
                boolean f2 = epx.f(e520Var, pas0.f);
                pas0 pas0Var = pas0.this;
                if (f2) {
                    dw20 dw20Var = pas0Var.b;
                    if (dw20Var != null && (d = m7m.d(dw20Var)) != null && (bridgeComponent = (BridgeComponent) d.a(fpf0.a(BridgeComponent.class))) != null) {
                        bridgeComponent.h8();
                    }
                } else if (epx.f(e520Var, pas0.e)) {
                    ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                    LiveCategory liveCategory2 = liveCategory;
                    liveCategory2.getClass();
                    String uri = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("vkvideo.ru").appendPath("lives").appendPath(HintCategories.PARAM_NAME).appendPath(liveCategory2.b).build().toString();
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(uri, uri));
                    cvk.u(R.string.link_copied, false);
                }
                pas0Var.dismiss();
                return s3q0.a;
            }
        });
        av20 b = aVar.b();
        boolean r = BuildInfo.r();
        e520 e520Var = f;
        e520 e520Var2 = e;
        b.setItems(r ? e43.l(e520Var2, e520Var) : e43.l(e520Var2, e520Var));
        return ((dw20.b) dw20.a.k(new dw20.b(context, null).a0(new hp30(this, 29)), b, 4)).I0("video_category_options");
    }
}
