package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoModalView;
import com.yandex.go.pickup_from_photo.ui.CircularProgressView;
import com.yandex.go.rida.header.ui.RidaHeaderView;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;
import ru.yandex.taxi.address.experiment.r;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.ComparisonItemView;
import ru.yandex.taxi.altpins.confirmation_screen.modal.comparison_block.ComparisonView;
import ru.yandex.taxi.altpins.map.AlternativeDestinationOnMapControl;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.surge.modal.SurgeShortcutModalView;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class ax1 extends dv31 {
    public final /* synthetic */ int k;
    public final /* synthetic */ ViewGroup l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax1(PickupFromPhotoModalView pickupFromPhotoModalView, PickupFromPhotoModalView pickupFromPhotoModalView2) {
        super(pickupFromPhotoModalView, ppb0.l);
        this.k = 4;
        this.l = pickupFromPhotoModalView2;
    }

    private final void h(Object obj, Object obj2) {
    }

    private final void i(Object obj, Object obj2) {
    }

    private final void j(Object obj, Object obj2) {
    }

    private final void k(Object obj, Object obj2) {
    }

    private final void l(Object obj, Object obj2) {
    }

    private final void m(Object obj, Object obj2) {
    }

    private final void n(Object obj, Object obj2) {
    }

    private final void o(Object obj, Object obj2) {
    }

    private final void p(float f) {
    }

    private final void q(float f) {
    }

    private final void r(float f) {
    }

    private final void s(float f) {
    }

    private final void t(float f) {
    }

    private final void u(float f) {
    }

    private final void v(float f) {
    }

    private final void w(float f) {
    }

    @Override // defpackage.dv31
    public final void a(Object obj, Object obj2) {
        int i = this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00af, code lost:
    
        if (r9.b == true) goto L21;
     */
    @Override // defpackage.dv31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Object obj, Object obj2) {
        bry0 bry0Var;
        ImageView iconView;
        ImageView iconView2;
        mvc mvcVar;
        rvc rvcVar;
        zmb0 binding;
        zmb0 binding2;
        zmb0 binding3;
        CircularProgressView circularProgressView;
        CircularProgressView circularProgressView2;
        zmb0 binding4;
        zmb0 binding5;
        zmb0 binding6;
        zmb0 binding7;
        zmb0 binding8;
        g18 g18Var;
        pav pavVar;
        zmb0 binding9;
        zmb0 binding10;
        zmb0 binding11;
        zmb0 binding12;
        zmb0 binding13;
        o5k0 o5k0Var;
        o5k0 o5k0Var2;
        boolean z;
        o5k0 o5k0Var3;
        AddressInputView addressInputView;
        AddressInputView addressInputView2;
        AddressInputView addressInputView3;
        fbv binding14;
        c57 c57Var;
        int i = this.k;
        ViewGroup viewGroup = this.l;
        switch (i) {
            case 0:
                qy1 qy1Var = (qy1) obj2;
                AlternativeDestinationOnMapControl alternativeDestinationOnMapControl = (AlternativeDestinationOnMapControl) viewGroup;
                bry0Var = alternativeDestinationOnMapControl.titleHelper;
                CharSequence charSequence = qy1Var.c;
                boolean z2 = qy1Var.e;
                if (!z2 || evu0.J(charSequence)) {
                    charSequence = qy1Var.b;
                }
                bry0Var.g(charSequence);
                iconView = alternativeDestinationOnMapControl.getIconView();
                Drawable drawable = qy1Var.d;
                iconView.setImageDrawable(drawable);
                iconView2 = alternativeDestinationOnMapControl.getIconView();
                iconView2.setVisibility(drawable == null ? 8 : 0);
                alternativeDestinationOnMapControl.applySelected(z2);
                break;
            case 1:
                q47 q47Var = (q47) obj2;
                if (!jl40.l((q47) obj, q47Var)) {
                    ((ButtonsView) viewGroup).renderButtonsWithCorrection(q47Var);
                    break;
                }
                break;
            case 2:
                kvc kvcVar = (kvc) obj2;
                kvc kvcVar2 = (kvc) obj;
                ComparisonItemView comparisonItemView = (ComparisonItemView) viewGroup;
                mvcVar = comparisonItemView.binding;
                comparisonItemView.renderTitle(kvcVar, kvcVar2);
                RobotoTextView robotoTextView = mvcVar.d;
                RobotoTextView robotoTextView2 = mvcVar.e;
                String str = kvcVar.b;
                CharSequence charSequence2 = kvcVar.d;
                robotoTextView.setText(str);
                RobotoTextView robotoTextView3 = mvcVar.d;
                boolean z3 = kvcVar.e;
                robotoTextView3.setVisibility((!z3 || evu0.J(kvcVar.b)) ? 8 : 0);
                comparisonItemView.renderPrice(kvcVar, kvcVar2);
                robotoTextView2.setText(charSequence2);
                robotoTextView2.setVisibility((!z3 || evu0.J(charSequence2)) ? 8 : 0);
                comparisonItemView.setChecked(z3);
                comparisonItemView.setAccessibilityDescription(kvcVar);
                break;
            case 3:
                svc svcVar = (svc) obj2;
                rvcVar = ((ComparisonView) viewGroup).binding;
                rvcVar.b.render(svcVar.a);
                rvcVar.c.render(svcVar.b);
                break;
            case 4:
                ppb0 ppb0Var = (ppb0) obj2;
                ppb0 ppb0Var2 = (ppb0) obj;
                PickupFromPhotoModalView pickupFromPhotoModalView = (PickupFromPhotoModalView) viewGroup;
                binding = pickupFromPhotoModalView.getBinding();
                binding.j.b.setVisibility(8);
                binding2 = pickupFromPhotoModalView.getBinding();
                ListItemComponent listItemComponent = binding2.i;
                String str2 = ppb0Var.a;
                String str3 = ppb0Var.e;
                Uri uri = ppb0Var.j;
                opb0 opb0Var = ppb0Var.c;
                listItemComponent.setTitle(str2);
                binding3 = pickupFromPhotoModalView.getBinding();
                binding3.i.setSubtitle(ppb0Var.b);
                circularProgressView = pickupFromPhotoModalView.circularProgressView;
                if (circularProgressView != null) {
                    circularProgressView.setMaxProgress(ppb0Var.h);
                }
                circularProgressView2 = pickupFromPhotoModalView.circularProgressView;
                if (circularProgressView2 != null) {
                    circularProgressView2.setProgress(ppb0Var.g);
                }
                binding4 = pickupFromPhotoModalView.getBinding();
                binding4.k.setVisibility(0);
                binding5 = pickupFromPhotoModalView.getBinding();
                binding5.e.setVisibility(0);
                if (!opb0Var.equals(ppb0Var2.c)) {
                    pickupFromPhotoModalView.renderCameraButton(opb0Var);
                    binding13 = pickupFromPhotoModalView.getBinding();
                    binding13.e.setEnabled(opb0Var.d);
                }
                boolean z4 = ppb0Var2.i;
                boolean z5 = ppb0Var.i;
                if (z4 != z5) {
                    pickupFromPhotoModalView.updateFlashMode(z5);
                }
                if (uri != null) {
                    binding11 = pickupFromPhotoModalView.getBinding();
                    binding11.l.setImageURI(uri);
                    pickupFromPhotoModalView.hideAnimatedHint();
                    binding12 = pickupFromPhotoModalView.getBinding();
                    binding12.l.setVisibility(0);
                } else {
                    binding6 = pickupFromPhotoModalView.getBinding();
                    binding6.l.setVisibility(8);
                    binding7 = pickupFromPhotoModalView.getBinding();
                    binding7.l.setImageURI(null);
                }
                if (!jl40.l(ppb0Var2.e, str3)) {
                    g18Var = pickupFromPhotoModalView.flashImageLoadingCancellable;
                    if (g18Var != null) {
                        g18Var.cancel();
                    }
                    pavVar = pickupFromPhotoModalView.imageLoader;
                    binding9 = pickupFromPhotoModalView.getBinding();
                    pickupFromPhotoModalView.flashImageLoadingCancellable = ((nac) pavVar.f(vom.H, binding9.e)).c(str3);
                    binding10 = pickupFromPhotoModalView.getBinding();
                    binding10.e.setContentDescription(ppb0Var.f);
                }
                binding8 = pickupFromPhotoModalView.getBinding();
                binding8.m.setScanAnimationEnabled(ppb0Var.d);
                pickupFromPhotoModalView.tryAnnounceForAccessibility(ppb0Var2, ppb0Var);
                break;
            case 5:
                RidaHeaderView ridaHeaderView = (RidaHeaderView) viewGroup;
                d6k0 d6k0Var = (d6k0) obj2;
                d6k0 d6k0Var2 = (d6k0) obj;
                if (!(d6k0Var instanceof z5k0)) {
                    if (!(d6k0Var instanceof y5k0)) {
                        if (!jl40.l(d6k0Var, x5k0.a)) {
                            if (!jl40.l(d6k0Var, a6k0.a)) {
                                w511.b();
                                break;
                            } else {
                                ridaHeaderView.renderLogo(false);
                                o5k0Var = ridaHeaderView.binding;
                                o5k0Var.e.setVisibility(8);
                                RidaHeaderView.renderTitle$default(ridaHeaderView, null, false, false, 0, 14, null);
                                ridaHeaderView.renderSubtitle(null);
                                break;
                            }
                        } else {
                            RidaHeaderView.renderTitle$default(ridaHeaderView, null, false, false, 0, 14, null);
                            if (!(d6k0Var2 instanceof x5k0)) {
                                cma1.b(0.0f, ridaHeaderView).withEndAction(new ii30(20, ridaHeaderView));
                                break;
                            }
                        }
                    } else {
                        y5k0 y5k0Var = (y5k0) d6k0Var;
                        ridaHeaderView.renderGradient(d6k0Var2, y5k0Var.c);
                        ridaHeaderView.renderLogo(y5k0Var.d);
                        o5k0Var2 = ridaHeaderView.binding;
                        o5k0Var2.e.setVisibility(8);
                        c6k0 c6k0Var = y5k0Var.a;
                        CharSequence charSequence3 = c6k0Var != null ? c6k0Var.a : null;
                        if (c6k0Var != null) {
                            z = true;
                            break;
                        }
                        z = false;
                        RidaHeaderView.renderTitle$default(ridaHeaderView, charSequence3, false, z, c6k0Var != null ? c6k0Var.c : 2, 2, null);
                        ridaHeaderView.renderSubtitle(y5k0Var.b);
                        break;
                    }
                } else {
                    z5k0 z5k0Var = (z5k0) d6k0Var;
                    ridaHeaderView.renderGradient(d6k0Var2, z5k0Var.b);
                    ridaHeaderView.renderLogo(z5k0Var.c);
                    o5k0Var3 = ridaHeaderView.binding;
                    o5k0Var3.e.setVisibility(0);
                    RidaHeaderView.renderTitle$default(ridaHeaderView, z5k0Var.a, true, false, 0, 12, null);
                    ridaHeaderView.renderSubtitle(null);
                    break;
                }
                break;
            case 6:
                r rVar = (r) obj2;
                SourceDestinationComponentV2 sourceDestinationComponentV2 = (SourceDestinationComponentV2) viewGroup;
                addressInputView = sourceDestinationComponentV2.sourceAddress;
                addressInputView.render(rVar.a);
                addressInputView2 = sourceDestinationComponentV2.sourceAddress;
                addressInputView2.setDividers(DividerPosition.BOTTOM, DividerType.ICON_MARGIN);
                addressInputView3 = sourceDestinationComponentV2.destinationAddress;
                addressInputView3.render(rVar.b);
                break;
            default:
                uvw0 uvw0Var = (uvw0) obj2;
                SurgeShortcutModalView surgeShortcutModalView = (SurgeShortcutModalView) viewGroup;
                binding14 = surgeShortcutModalView.getBinding();
                binding14.c.setImageDrawable(uvw0Var.f);
                binding14.e.setText(uvw0Var.d);
                binding14.d.setText(uvw0Var.e);
                c57Var = surgeShortcutModalView.buttonsContract;
                ((pm5) c57Var).d(uvw0Var.b);
                break;
        }
    }

    @Override // defpackage.dv31
    public final void f(float f) {
        int i = this.k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ax1(ViewGroup viewGroup, Object obj, ViewGroup viewGroup2, int i) {
        super(viewGroup, obj);
        this.k = i;
        this.l = viewGroup2;
    }
}
