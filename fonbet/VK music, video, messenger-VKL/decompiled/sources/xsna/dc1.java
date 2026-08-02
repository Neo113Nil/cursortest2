package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class dc1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dc1(int i, int i2, Object obj, boolean z) {
        this.b = i2;
        this.e = obj;
        this.d = z;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.e;
                ((Integer) obj2).intValue();
                com.vk.catalog2.common.ui.mvp.holder.video.assistant.b.e(ne7.I(this.c | 1), (androidx.compose.runtime.a) obj, izsVar, this.d);
                return s3q0.a;
            case 1:
                UIBlockList uIBlockList = (UIBlockList) obj;
                ((nk40) this.e).getClass();
                edi.y(uIBlockList, new cju(this.c, 1), new aom(this.d, 1));
                return uIBlockList;
            default:
                ((Integer) obj2).intValue();
                int I = ne7.I(this.c | 1);
                ((plo0) this.e).i(this.d, (androidx.compose.runtime.a) obj, I);
                return s3q0.a;
        }
    }

    public /* synthetic */ dc1(nk40 nk40Var, int i, boolean z) {
        this.b = 1;
        this.e = nk40Var;
        this.c = i;
        this.d = z;
    }
}
