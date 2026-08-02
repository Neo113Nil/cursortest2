package defpackage;

import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.design.AddressInputComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class cct0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SourceDestinationComponent b;
    public final /* synthetic */ AddressInputComponent c;

    public /* synthetic */ cct0(SourceDestinationComponent sourceDestinationComponent, AddressInputComponent addressInputComponent, int i) {
        this.a = i;
        this.b = sourceDestinationComponent;
        this.c = addressInputComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AddressInputComponent addressInputComponent = this.c;
        SourceDestinationComponent sourceDestinationComponent = this.b;
        switch (i) {
            case 0:
                SourceDestinationComponent.onAttachedToWindow$lambda$0$1(sourceDestinationComponent, addressInputComponent);
                break;
            case 1:
                SourceDestinationComponent.onAttachedToWindow$lambda$1$1(sourceDestinationComponent, addressInputComponent);
                break;
            default:
                SourceDestinationComponent.applySourceTrailMode$lambda$0$0(sourceDestinationComponent, addressInputComponent);
                break;
        }
    }
}
