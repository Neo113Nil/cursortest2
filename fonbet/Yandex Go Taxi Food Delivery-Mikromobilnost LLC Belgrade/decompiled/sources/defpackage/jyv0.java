package defpackage;

import android.view.View;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.SuperAppDiscoveryMapV2ModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class jyv0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SuperAppDiscoveryMapV2ModalView b;

    public /* synthetic */ jyv0(SuperAppDiscoveryMapV2ModalView superAppDiscoveryMapV2ModalView, int i) {
        this.a = i;
        this.b = superAppDiscoveryMapV2ModalView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                this.b.updateMapViewportInsets();
                break;
            default:
                SuperAppDiscoveryMapV2ModalView.setupFloatingHeader$lambda$0(this.b, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
