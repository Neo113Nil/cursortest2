package defpackage;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.DocumentEngineCreator;

/* loaded from: classes10.dex */
public final /* synthetic */ class kyl implements oao {
    public final /* synthetic */ int a;

    public /* synthetic */ kyl(int i) {
        this.a = i;
    }

    @Override // defpackage.oao
    public final mao a(l1o l1oVar) {
        mao maoVar;
        switch (this.a) {
            case 0:
                maoVar = DocumentEngineCreator.get$lambda$0(l1oVar);
                return maoVar;
            case 1:
                return null;
            default:
                return new ijf(l1oVar.b);
        }
    }
}
