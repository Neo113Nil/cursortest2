package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class byd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ byd(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                g620.f().a().i(this.c, fpf0.a(ClipFeedTab.TopVideo.class), null);
                return s3q0.a;
            default:
                return new b1g(this.c);
        }
    }
}
