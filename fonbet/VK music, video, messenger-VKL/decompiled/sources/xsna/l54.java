package xsna;

import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class l54 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l54(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.d = obj2;
        this.f = obj3;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                p54.c((b64) this.e, (izs) this.d, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                vq5.b((String) this.e, this.c, (biq0) this.f, (izs) this.d, (androidx.compose.runtime.a) obj, I);
                break;
            case 2:
                ((Integer) obj2).getClass();
                s050.d((l050) this.e, (gzs) this.d, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.newsfeed.posting.privacy_picker.presentation.b.a((PrivacyViewState.a.C1434a) this.e, (izs) this.d, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((com.vk.core.compose.component.cell.content.t0) this.e).a((spg0) this.d, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ l54(String str, int i, biq0 biq0Var, izs izsVar, int i2) {
        this.b = 1;
        this.e = str;
        this.c = i;
        this.f = biq0Var;
        this.d = izsVar;
    }
}
