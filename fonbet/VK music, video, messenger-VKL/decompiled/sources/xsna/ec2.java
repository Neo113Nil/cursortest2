package xsna;

import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ec2 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ec2(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = this.c;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                nc2.a((wv70) obj5, (dt1) obj4, (jai) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 1:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                ((Integer) obj2).getClass();
                int I = ne7.I(i2 | 1);
                ((com.vk.profile.community.details.impl.contacts.h) obj5).j(I, aVar, (List) obj3, (izs) obj4);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ie30.a((ee30) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                s050.e((l050) obj5, (q630) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(3073);
                zc70.a((List) obj5, (yjl) obj4, this.c, (wh50) obj3, (androidx.compose.runtime.a) obj, I2);
                break;
            case 5:
                ((Integer) obj2).intValue();
                ((com.vk.newsfeed.posting.privacy_picker.presentation.c) obj5).a((String) obj4, (yzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                int i3 = VideoProfileCreatorOnboardingItemsView.q;
                ((VideoProfileCreatorOnboardingItemsView) obj5).C((wh50) obj4, (hbk0) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ec2(List list, yjl yjlVar, int i, wh50 wh50Var, int i2) {
        this.b = 4;
        this.d = list;
        this.e = yjlVar;
        this.c = i;
        this.f = wh50Var;
    }
}
