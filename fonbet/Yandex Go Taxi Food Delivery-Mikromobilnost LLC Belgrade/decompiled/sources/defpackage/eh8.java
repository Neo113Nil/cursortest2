package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class eh8 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ eh8(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                return a.a(((sg8) aVar.n.getValue()).a.a);
            default:
                aVar.r = null;
                aVar.s = null;
                a.i(aVar, null, 3);
                return zy11.a;
        }
    }
}
