package xsna;

import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qg4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qg4(Object obj, q630 q630Var, int i, int i2, int i3) {
        this.b = i3;
        this.f = obj;
        this.c = q630Var;
        this.d = i;
        this.e = i2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                String str = (String) this.f;
                ((Integer) obj2).getClass();
                rg4.a(ne7.I(this.d | 1), this.e, (androidx.compose.runtime.a) obj, str, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int I = ne7.I(this.d | 1);
                tfj0.d((ShortVideoListView.e) this.f, this.c, (androidx.compose.runtime.a) obj, I, this.e);
                break;
        }
        return s3q0.a;
    }
}
