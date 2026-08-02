package xsna;

import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qq3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qq3(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((rq3) obj3).a(ne7.I(i2 | 1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                fy80.a(I, i2, (androidx.compose.runtime.a) obj, (q630) obj3);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((w8d0) obj3).c0(ne7.I(i2 | 1), (androidx.compose.runtime.a) obj);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((z1f0) obj3).A(ne7.I(i2 | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                int i3 = VideoProfileCreatorOnboardingVideoCounterView.o;
                ((VideoProfileCreatorOnboardingVideoCounterView) obj3).C(ne7.I(i2 | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qq3(rq3 rq3Var, int i) {
        this.b = 0;
        this.d = rq3Var;
        this.c = i;
    }

    public /* synthetic */ qq3(q630 q630Var, int i, int i2) {
        this.b = 1;
        this.d = q630Var;
        this.c = i2;
    }
}
