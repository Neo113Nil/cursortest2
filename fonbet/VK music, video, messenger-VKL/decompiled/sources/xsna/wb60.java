package xsna;

import com.vk.dto.newsfeed.entries.Post;

/* compiled from: RxExt.kt */
/* loaded from: classes4.dex */
public final class wb60 implements izs {
    public static final wb60 c = new wb60(0);
    public static final wb60 d = new wb60(1);
    public final /* synthetic */ int b;

    public /* synthetic */ wb60(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return Boolean.valueOf(obj instanceof ced);
            default:
                return Boolean.valueOf(obj instanceof Post);
        }
    }
}
