package xsna;

import com.vk.design.demo.presentation.screens.SkeletonScreenContent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class cq0 implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cq0(SkeletonScreenContent skeletonScreenContent, int i) {
        this.d = skeletonScreenContent;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((dq0) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((d8d0) this.d).a(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).intValue();
                ((SkeletonScreenContent) this.d).e(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cq0(dq0 dq0Var, int i) {
        this.d = dq0Var;
        this.c = i;
    }

    public /* synthetic */ cq0(d8d0 d8d0Var, int i) {
        this.d = d8d0Var;
        this.c = i;
    }
}
