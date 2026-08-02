package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiEvent;

/* compiled from: VkUiRxClipEvent.kt */
/* loaded from: classes6.dex */
public final class jvv0 extends cxv0 {
    public final JsApiEvent g;

    public jvv0(long j, long j2, int i, String str) {
        super(j, str, i, j2, true);
        this.g = JsApiEvent.CLIP_BOX_UPLOAD_FINISH;
    }

    @Override // xsna.cxv0
    public final JsApiEvent a() {
        return this.g;
    }
}
