package xsna;

import com.vk.superapp.browser.internal.bridges.JsApiEvent;

/* compiled from: VkUiRxClipEvent.kt */
/* loaded from: classes6.dex */
public abstract class cxv0 extends dxv0 {
    public final int e;
    public final long f;

    public cxv0(long j, String str, int i, long j2, boolean z) {
        super(j, false, str, z);
        this.e = i;
        this.f = j2;
    }

    public abstract JsApiEvent a();
}
