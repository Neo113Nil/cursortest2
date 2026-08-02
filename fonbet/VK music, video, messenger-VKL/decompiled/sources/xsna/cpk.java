package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cwb0;
import xsna.i3x0;

/* compiled from: CustomVirtualBackground.kt */
/* loaded from: classes7.dex */
public final class cpk {
    public final Context a;
    public final View b;
    public final bzb0 c;
    public final b5x0 d;
    public final i3x0.f e;
    public final a f;
    public final gpk g;
    public io.reactivex.rxjava3.disposables.c h;

    /* compiled from: CustomVirtualBackground.kt */
    public static final class a {
        public final c5x0 a;
        public final d5x0 b;
        public final e5x0 c;
        public final f5x0 d;

        public a(c5x0 c5x0Var, d5x0 d5x0Var, e5x0 e5x0Var, f5x0 f5x0Var) {
            this.a = c5x0Var;
            this.b = d5x0Var;
            this.c = e5x0Var;
            this.d = f5x0Var;
        }
    }

    public cpk(Context context, View view, bzb0 bzb0Var, b5x0 b5x0Var, i3x0.f fVar, a aVar, gpk gpkVar) {
        this.a = context;
        this.b = view;
        this.c = bzb0Var;
        this.d = b5x0Var;
        this.e = fVar;
        this.f = aVar;
        this.g = gpkVar;
        jjc.g(view, new k0j(this, 5));
    }

    public final void a() {
        this.d.invoke(new Intent(this.a, (Class<?>) PhotoVideoAttachActivity.class).putExtra("selection_limit", 1).putExtra("single_mode", true).putExtra("prevent_styling", false).putExtra("media_type", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE).putExtra("initialize_camera", false));
        this.f.a.invoke();
    }

    public final void b(int i) {
        bzb0.d(this.c, new cwb0.a1(R.string.upload_error, null, i, null, R.string.choose, null, R.string.cancel, null, null, null, 938), new com.vk.movika.sdk.base.logic.processor.actions.i(this, 26), null, null, 28);
    }
}
