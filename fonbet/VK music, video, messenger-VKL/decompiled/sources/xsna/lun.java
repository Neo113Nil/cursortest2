package xsna;

import com.vk.newsfeed.common.recycler.holders.clips.SingleClipV2Holder;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: DocumentThumbnailHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class lun extends MutablePropertyReference0Impl {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lun(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                iun iunVar = (iun) this.receiver;
                int i = iun.K;
                return Boolean.valueOf(iunVar.t);
            case 1:
                return ((SingleClipV2Holder) this.receiver).x;
            default:
                c6y0 c6y0Var = (c6y0) this.receiver;
                int i2 = c6y0.G;
                return Boolean.valueOf(c6y0Var.t);
        }
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        switch (this.b) {
            case 0:
                iun iunVar = (iun) this.receiver;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i = iun.K;
                iunVar.t = booleanValue;
                break;
            case 1:
                ((SingleClipV2Holder) this.receiver).x = (s1c0) obj;
                break;
            default:
                c6y0 c6y0Var = (c6y0) this.receiver;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i2 = c6y0.G;
                c6y0Var.t = booleanValue2;
                break;
        }
    }
}
