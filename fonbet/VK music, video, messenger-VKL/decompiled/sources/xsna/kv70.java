package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.common.VideoFile;
import xsna.dw20;

/* compiled from: OfflineVideoMenuBottomSheet.kt */
/* loaded from: classes3.dex */
public final class kv70 extends dw20 {

    /* compiled from: OfflineVideoMenuBottomSheet.kt */
    public static final class a extends dw20.b {
        public final VideoFile e;
        public final kar f;

        public a(Activity activity, VideoFile videoFile) {
            super(activity, null);
            this.e = videoFile;
            Context context = e43.a;
            this.f = new kar(context != null ? context : null);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new kv70();
        }
    }
}
