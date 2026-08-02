package xsna;

import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class asc implements wzs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ asc(int i, gzs gzsVar, boolean z) {
        this.c = z;
        this.d = gzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                bsc.a(this.c, (gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                UserProfileBaseInfoState.a aVar = (UserProfileBaseInfoState.a) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-558531613, intValue, -1, "com.vk.profile.design.view.profileheader.Description.<anonymous>.<anonymous>.<anonymous> (UserProfileBaseInfoView.kt:257)");
                    }
                    com.vk.profile.design.view.profileheader.b.d(aVar, this.c, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ asc(UserProfileBaseInfoState.a aVar, boolean z) {
        this.d = aVar;
        this.c = z;
    }
}
