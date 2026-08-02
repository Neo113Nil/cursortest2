package xsna;

import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ikv0;
import xsna.y7f;

/* compiled from: ClipsTemplateEditorAlertHandlerImpl.kt */
/* loaded from: classes16.dex */
public final class h6f implements f6f {
    public final y7f.b a;
    public androidx.appcompat.app.d b;

    public h6f(y7f.b bVar) {
        this.a = bVar;
    }

    @Override // xsna.f6f
    public final void a() {
        b(y8g0.e(R.string.clips_template_editor_item_cropper_slow_down_alert));
    }

    public final void b(String str) {
        y7f.b bVar = this.a;
        ikv0.a aVar = new ikv0.a(bVar.b());
        aVar.i = FloatingViewGesturesHelper.SwipeDirection.Horizontal;
        aVar.o = Integer.valueOf(y7f.this.a.Fd());
        aVar.d = true;
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, bVar.b().getString(R.string.clips_template_editor_min_fragments_count_duration_text_accept), new rl2(10));
        aVar.d = true;
        aVar.n();
    }
}
