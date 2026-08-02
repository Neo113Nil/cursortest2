package defpackage;

import ru.yandex.taxi.address.design.SourceDestinationComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class bct0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SourceDestinationComponent b;

    public /* synthetic */ bct0(SourceDestinationComponent sourceDestinationComponent, int i) {
        this.a = i;
        this.b = sourceDestinationComponent;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        kq0 _init_$lambda$0;
        zy11 onAttachedToWindow$lambda$0$0;
        zy11 onAttachedToWindow$lambda$1$0;
        int i = this.a;
        SourceDestinationComponent sourceDestinationComponent = this.b;
        switch (i) {
            case 0:
                _init_$lambda$0 = SourceDestinationComponent._init_$lambda$0(sourceDestinationComponent);
                return _init_$lambda$0;
            case 1:
                onAttachedToWindow$lambda$0$0 = SourceDestinationComponent.onAttachedToWindow$lambda$0$0(sourceDestinationComponent);
                return onAttachedToWindow$lambda$0$0;
            default:
                onAttachedToWindow$lambda$1$0 = SourceDestinationComponent.onAttachedToWindow$lambda$1$0(sourceDestinationComponent);
                return onAttachedToWindow$lambda$1$0;
        }
    }
}
