package defpackage;

import com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.mapkit.directions.driving.Event;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;

/* loaded from: classes14.dex */
public final class a621 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a621(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        AnchorBottomSheetBehavior bottomSheetBehavior;
        xb31 binding;
        xb31 binding2;
        xb31 binding3;
        jyu jyuVar;
        jyu jyuVar2;
        xb31 binding4;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((blm) obj2).invoke((Event) obj);
                return zy11Var;
            case 1:
                VerticalHubV1ModalView verticalHubV1ModalView = (VerticalHubV1ModalView) obj;
                rc31 rc31Var = (rc31) obj2;
                if (rc31Var.e != null) {
                    bottomSheetBehavior = verticalHubV1ModalView.getBottomSheetBehavior();
                    if (bottomSheetBehavior.y() == 3) {
                        binding4 = verticalHubV1ModalView.getBinding();
                        binding4.c.updateSlide(1.0f);
                    } else {
                        binding = verticalHubV1ModalView.getBinding();
                        int i2 = 0;
                        int max = Math.max(0, binding.d.getHeight());
                        binding2 = verticalHubV1ModalView.getBinding();
                        int minContentHeight = binding2.c.minContentHeight();
                        if (rc31Var.e.c != null) {
                            jyuVar = verticalHubV1ModalView.buttonView;
                            int height = jyuVar.a.getHeight();
                            jyuVar2 = verticalHubV1ModalView.buttonView;
                            i2 = height - jyuVar2.a.getPaddingTop();
                            if (i2 <= 0) {
                                i2 = tje.u(48, verticalHubV1ModalView.getContext());
                            }
                        }
                        verticalHubV1ModalView.setBehaviorAnchorHeight(Integer.valueOf(Math.max(max + minContentHeight + i2, tje.u(100, verticalHubV1ModalView.getContext()) + minContentHeight + i2)));
                        binding3 = verticalHubV1ModalView.getBinding();
                        binding3.c.updateSlide(0.0f);
                    }
                }
                verticalHubV1ModalView.updateModalState();
                return zy11Var;
            default:
                return new dnd0(1, new u6s0((r941) obj, bpb1.d((WebViewFragment) obj2).resolveDependencies()));
        }
    }
}
