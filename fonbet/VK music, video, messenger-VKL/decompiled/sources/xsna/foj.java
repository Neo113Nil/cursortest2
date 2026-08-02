package xsna;

import com.vk.design.demo.presentation.screens.ContextMenuScreenContent;
import com.vk.music.player.api.BottomPlayerAppearance;
import xsna.dz40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class foj implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ foj(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
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
                ((ContextMenuScreenContent) this.d).b((ContextMenuScreenContent.ImplementationType) this.e, (izs) this.f, (q630) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                tka0.b((lg90) this.d, (fb5) this.e, (vka0) this.f, (gzs) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vkb0.d((dz40.p) this.d, (f3b0) this.e, (BottomPlayerAppearance) this.g, (izs) this.f, (androidx.compose.runtime.a) obj, ne7.I(this.c | 1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ foj(dz40.p pVar, f3b0 f3b0Var, BottomPlayerAppearance bottomPlayerAppearance, izs izsVar, int i) {
        this.b = 2;
        this.d = pVar;
        this.e = f3b0Var;
        this.g = bottomPlayerAppearance;
        this.f = izsVar;
        this.c = i;
    }
}
