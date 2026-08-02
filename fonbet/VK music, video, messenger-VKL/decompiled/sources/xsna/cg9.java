package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cg9 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cg9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                dg9 dg9Var = (dg9) obj4;
                ClipGridParams.Data data = (ClipGridParams.Data) obj2;
                ClipCameraParams clipCameraParams = (ClipCameraParams) obj;
                if (!j8.d(((View) obj3).getContext())) {
                    dg9Var.a.h2(data, clipCameraParams);
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            case 1:
                ((FriendsItemListVh) obj4).b((Context) obj3, (UIBlockProfile) obj2, (CatalogViewType) obj);
                break;
            default:
                x1c x1cVar = (x1c) obj3;
                wh50 wh50Var = (wh50) obj;
                wh50Var.setValue((y1c) obj4);
                x1cVar.f = (y1c) wh50Var.getValue();
                ((bod0) obj2).l.invoke(x1cVar);
                break;
        }
        return s3q0.a;
    }
}
