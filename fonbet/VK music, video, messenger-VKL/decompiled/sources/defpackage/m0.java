package defpackage;

import com.vk.dto.newsfeed.FaveTag;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import xsna.xwv0;
import xsna.y1o0;

/* compiled from: JsCommonDelegateImpl.kt */
/* loaded from: classes8.dex */
public final /* synthetic */ class m0 extends MutablePropertyReference0Impl {
    public final /* synthetic */ int b = 0;

    public m0(Object obj) {
        super(obj, l0.class, "presenter", "getPresenter()Lcom/vk/superapp/base/js/bridge/VkUiPresenter;", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((l0) this.receiver).d;
            default:
                return ((y1o0) this.receiver).f;
        }
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        switch (this.b) {
            case 0:
                ((l0) this.receiver).d = (xwv0) obj;
                break;
            default:
                ((y1o0) this.receiver).K0((FaveTag) obj);
                break;
        }
    }

    public /* synthetic */ m0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
