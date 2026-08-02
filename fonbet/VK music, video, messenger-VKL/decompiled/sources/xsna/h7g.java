package xsna;

import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;
import xsna.idh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h7g implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h7g(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.e = obj;
        this.f = obj2;
        this.c = obj3;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.e;
                izs izsVar2 = (izs) this.f;
                q630 q630Var = (q630) this.c;
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                i7g.a(this.d, I, (androidx.compose.runtime.a) obj, izsVar, izsVar2, q630Var);
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.preview.c.v((PreviewViewState.r) this.e, (PreviewViewState.Size) this.f, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.vk.newsfeed.posting.privacy_picker.presentation.b.c((PrivacyViewState.b) this.f, (izs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                ((ujg0) this.e).e((String) this.f, (yzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ich0.h((idh0.a) this.f, (izs) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ h7g(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.f = obj;
        this.e = izsVar;
        this.c = q630Var;
        this.d = i;
    }

    public /* synthetic */ h7g(int i, int i2, izs izsVar, izs izsVar2, q630 q630Var) {
        this.b = 0;
        this.d = i;
        this.e = izsVar;
        this.f = izsVar2;
        this.c = q630Var;
    }
}
