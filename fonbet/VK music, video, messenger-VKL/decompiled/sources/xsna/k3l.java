package xsna;

import com.vk.dto.common.VideoUrl;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class k3l implements Function {
    public final /* synthetic */ int a;

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return VideoUrl.valueOf((String) obj);
            default:
                return ((ihy0) obj).toString();
        }
    }
}
