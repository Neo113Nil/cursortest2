package com.yandex.go.scooters.photocontrol;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import defpackage.dio0;
import defpackage.e230;
import defpackage.ehn0;
import defpackage.iio0;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.w130;
import defpackage.xho0;
import defpackage.xjh0;
import defpackage.y1w;
import defpackage.z1w;
import defpackage.zdk0;
import java.util.Set;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.a;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yandex/go/scooters/photocontrol/ScootersPhotocontrolModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ldio0;", "Landroid/content/Context;", "context", "Lxho0;", "scootersPhotocontrolCameraUiFactory", "", "Lcom/yandex/go/scooters/photocontrol/api/ScootersExamType;", "allRequiredExamTypes", "Liio0;", "scootersPhotocontrolNavigator", "<init>", "(Landroid/content/Context;Lxho0;Ljava/util/Set;Liio0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldio0;", "Le230;", "insetsType", "()Le230;", "", "isArrowsPermanentlyHidden", "()Z", "Ljava/lang/Runnable;", "onTouchOutsideListener", "Lzy11;", "setOnTouchOutsideListener", "(Ljava/lang/Runnable;)V", "Ljava/util/Set;", "Liio0;", "Ly1w;", "insetsChangeRepository", "Ly1w;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPhotocontrolModalView extends SlideableBindingModalView<dio0> {
    public static final int $stable = 8;
    private final Set<ScootersExamType> allRequiredExamTypes;
    private final y1w insetsChangeRepository;
    private final iio0 scootersPhotocontrolNavigator;

    /* JADX WARN: Multi-variable type inference failed */
    public ScootersPhotocontrolModalView(Context context, xho0 xho0Var, Set<? extends ScootersExamType> set, iio0 iio0Var) {
        super(context);
        this.allRequiredExamTypes = set;
        this.scootersPhotocontrolNavigator = iio0Var;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        setDismissOnTouchOutside(false);
        Context context2 = xho0Var.a;
        zdk0 zdk0Var = new zdk0(27, xho0Var, set, iio0Var);
        ehn0 ehn0Var = new ehn0(18, iio0Var);
        GoFrameLayout goFrameLayout = new GoFrameLayout(context2, null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        z1w z1wVar = new z1w();
        a aVar = new a(goFrameLayout, null, ehn0Var, z1wVar);
        zdk0Var.invoke(aVar);
        CameraLayer cameraLayer = aVar.e;
        if (cameraLayer != null) {
            cameraLayer.e();
        }
        this.insetsChangeRepository = z1wVar;
        c.w(getBinding().b, goFrameLayout);
        getBottomSheet().setBackgroundColor(getContext().getColor(mqg0.component_fog_light));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public dio0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(xjh0.scooters_photocontrol_modal_view, parent, false);
        if (inflate != null) {
            ViewStub viewStub = (ViewStub) inflate;
            return new dio0(viewStub, viewStub);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(1, new ScootersPhotocontrolModalView$insetsType$1(1, this.insetsChangeRepository, y1w.class, "onChanged", "onChanged(Lru/yandex/taxi/utils/Insets;)V", 0));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void setOnTouchOutsideListener(Runnable onTouchOutsideListener) {
    }
}
