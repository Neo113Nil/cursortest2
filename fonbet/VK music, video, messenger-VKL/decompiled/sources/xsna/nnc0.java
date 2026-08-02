package xsna;

import com.vk.catalog2.common.ui.mvp.holder.search.SearchFriendFriendsCatalogRootVh;
import com.vk.dto.common.id.UserId;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class nnc0 extends MutablePropertyReference0Impl {
    public final /* synthetic */ int b = 0;

    public nnc0(Object obj) {
        super(obj, enc0.class, "pickerMediaOwnerId", "getPickerMediaOwnerId()Lcom/vk/dto/common/id/UserId;", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.rcy
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((enc0) this.receiver).Z;
            default:
                return ((vth0) this.receiver).d;
        }
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, xsna.mcy
    public final void set(Object obj) {
        switch (this.b) {
            case 0:
                ((enc0) this.receiver).Z = (UserId) obj;
                break;
            default:
                ((vth0) this.receiver).d = (SearchFriendFriendsCatalogRootVh) obj;
                break;
        }
    }

    public /* synthetic */ nnc0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
