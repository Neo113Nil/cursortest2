package xsna;

import com.vk.core.compose.component.group.header.f;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class eku implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ eku(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((com.vk.core.compose.component.group.header.d) this.d).a((q630) this.e, (f.b) this.f, (com.vk.core.compose.component.group.header.b) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                com.vk.profile.design.view.profileheader.b.n((UserProfileBaseInfoState.d) this.d, (UserProfileBaseInfoState.b) this.e, (UserProfileBaseInfoState.VerifyInfo) this.f, (izs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }
}
