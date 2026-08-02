package xsna;

import com.vk.core.tool.view.vkblur.VkBlurContentView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yq8 implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ q630 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ yq8(com.vk.newsfeed.impl.items.posting.item.modals.d dVar, int i, m7b m7bVar, q630 q630Var, gzs gzsVar, int i2) {
        this.e = dVar;
        this.d = i;
        this.f = m7bVar;
        this.c = q630Var;
        this.g = gzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((hr8) this.e).b(this.c, (rv5) this.f, (VkBlurContentView) this.g, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int I = ne7.I(385);
                tzi0.a((uzi0) this.e, (gzs) this.f, this.c, (gzs) this.g, (androidx.compose.runtime.a) obj, I, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int I2 = ne7.I(1);
                ((com.vk.newsfeed.impl.items.posting.item.modals.d) this.e).a(this.d, (m7b) this.f, this.c, (gzs) this.g, (androidx.compose.runtime.a) obj, I2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yq8(hr8 hr8Var, q630 q630Var, rv5 rv5Var, VkBlurContentView vkBlurContentView, int i) {
        this.e = hr8Var;
        this.c = q630Var;
        this.f = rv5Var;
        this.g = vkBlurContentView;
        this.d = i;
    }

    public /* synthetic */ yq8(uzi0 uzi0Var, gzs gzsVar, q630 q630Var, gzs gzsVar2, int i, int i2) {
        this.e = uzi0Var;
        this.f = gzsVar;
        this.c = q630Var;
        this.g = gzsVar2;
        this.d = i2;
    }
}
