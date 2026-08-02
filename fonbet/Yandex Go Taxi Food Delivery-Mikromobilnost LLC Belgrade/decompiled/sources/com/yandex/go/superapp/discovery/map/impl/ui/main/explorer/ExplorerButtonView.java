package com.yandex.go.superapp.discovery.map.impl.ui.main.explorer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import defpackage.cma1;
import defpackage.cmi;
import defpackage.dto;
import defpackage.eto;
import defpackage.evu0;
import defpackage.fto;
import defpackage.i8h0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.pav;
import defpackage.skh0;
import defpackage.sls;
import defpackage.tls;
import defpackage.uhm;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.SwitchComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\u0013R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010.\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/explorer/ExplorerButtonView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "hideAll", "()V", "setupClickListeners", "Lfto;", ClidProvider.STATE, "Lpav;", "imageLoader", "renderWithPermission", "(Lfto;Lpav;)V", "renderNoPermission", "", "showPermission", "switchVisibility", "(Z)V", "Lcom/yandex/go/design/view/GoImageView;", "imageView", "", "url", "loadBackgroundImage", "(Lcom/yandex/go/design/view/GoImageView;Ljava/lang/String;Lpav;)V", "render", "Ldto;", "permissionBinding", "Ldto;", "Leto;", "noPermissionBinding", "Leto;", "Lkotlin/Function1;", "onToggleClicked", "Ltls;", "getOnToggleClicked", "()Ltls;", "setOnToggleClicked", "(Ltls;)V", "Lkotlin/Function0;", "onNoPermissionClicked", "Lsls;", "getOnNoPermissionClicked", "()Lsls;", "setOnNoPermissionClicked", "(Lsls;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ExplorerButtonView extends FrameLayout {
    private final eto noPermissionBinding;
    private sls onNoPermissionClicked;
    private tls onToggleClicked;
    private final dto permissionBinding;

    public ExplorerButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View O2;
        View inflate = LayoutInflater.from(context).inflate(skh0.explorer_button_item, (ViewGroup) this, false);
        addView(inflate);
        int i2 = i8h0.animated_border;
        ExplorerAnimatedBorderView explorerAnimatedBorderView = (ExplorerAnimatedBorderView) cma1.O(i2, inflate);
        if (explorerAnimatedBorderView != null) {
            i2 = i8h0.background_image;
            GoImageView goImageView = (GoImageView) cma1.O(i2, inflate);
            if (goImageView != null && (O = cma1.O((i2 = i8h0.explorer_dot), inflate)) != null) {
                i2 = i8h0.title;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, inflate);
                if (robotoTextView != null) {
                    i2 = i8h0.toggle;
                    SwitchComponent switchComponent = (SwitchComponent) cma1.O(i2, inflate);
                    if (switchComponent != null) {
                        this.permissionBinding = new dto((GoConstraintLayout) inflate, explorerAnimatedBorderView, goImageView, O, robotoTextView, switchComponent);
                        View inflate2 = LayoutInflater.from(context).inflate(skh0.explorer_button_no_permission_item, (ViewGroup) this, false);
                        addView(inflate2);
                        int i3 = i8h0.background_image;
                        GoImageView goImageView2 = (GoImageView) cma1.O(i3, inflate2);
                        if (goImageView2 != null) {
                            i3 = i8h0.no_permission_arrow;
                            if (((GoImageView) cma1.O(i3, inflate2)) != null && (O2 = cma1.O((i3 = i8h0.no_permission_border), inflate2)) != null) {
                                i3 = i8h0.subtitle;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, inflate2);
                                if (robotoTextView2 != null) {
                                    i3 = i8h0.title;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i3, inflate2);
                                    if (robotoTextView3 != null) {
                                        this.noPermissionBinding = new eto((GoConstraintLayout) inflate2, goImageView2, O2, robotoTextView2, robotoTextView3);
                                        hideAll();
                                        setupClickListeners();
                                        return;
                                    }
                                }
                            }
                        }
                        ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
                        throw null;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void hideAll() {
        this.permissionBinding.a.setVisibility(8);
        this.noPermissionBinding.a.setVisibility(8);
    }

    private final void loadBackgroundImage(GoImageView imageView, String url, pav imageLoader) {
        imageView.setVisibility(!evu0.J(url) ? 0 : 8);
        if (evu0.J(url)) {
            return;
        }
        ((nac) imageLoader.a(imageView)).c(url);
    }

    private final void renderNoPermission(fto state, pav imageLoader) {
        switchVisibility(false);
        eto etoVar = this.noPermissionBinding;
        etoVar.e.setText(state.a);
        GoConstraintLayout goConstraintLayout = etoVar.a;
        goConstraintLayout.setClipToOutline(true);
        loadBackgroundImage(etoVar.b, state.c, imageLoader);
        etoVar.d.setText(state.b);
        goConstraintLayout.setContentDescription(state.a);
    }

    private final void renderWithPermission(fto state, pav imageLoader) {
        switchVisibility(true);
        dto dtoVar = this.permissionBinding;
        RobotoTextView robotoTextView = dtoVar.e;
        View view = dtoVar.d;
        ExplorerAnimatedBorderView explorerAnimatedBorderView = dtoVar.b;
        String str = state.a;
        boolean z = state.e;
        robotoTextView.setText(str);
        GoConstraintLayout goConstraintLayout = dtoVar.a;
        goConstraintLayout.setClipToOutline(true);
        loadBackgroundImage(dtoVar.c, state.c, imageLoader);
        if (!state.f || z) {
            explorerAnimatedBorderView.stopAnimation();
            explorerAnimatedBorderView.setVisibility(8);
            view.setVisibility(4);
        } else {
            explorerAnimatedBorderView.setVisibility(0);
            explorerAnimatedBorderView.startAnimation();
            view.setVisibility(0);
        }
        dtoVar.f.setChecked(z);
        goConstraintLayout.setContentDescription(state.a);
    }

    private final void setupClickListeners() {
        c.A(this.permissionBinding.a, 500L, new uhm(24, this));
        this.noPermissionBinding.a.setOnClickListener(new cmi(20, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$0(ExplorerButtonView explorerButtonView) {
        boolean z = !explorerButtonView.permissionBinding.f.getIsChecked();
        explorerButtonView.permissionBinding.f.setChecked(z);
        tls tlsVar = explorerButtonView.onToggleClicked;
        if (tlsVar != null) {
            tlsVar.invoke(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupClickListeners$lambda$1(ExplorerButtonView explorerButtonView, View view) {
        sls slsVar = explorerButtonView.onNoPermissionClicked;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    private final void switchVisibility(boolean showPermission) {
        this.permissionBinding.a.setVisibility(showPermission ? 0 : 8);
        this.noPermissionBinding.a.setVisibility(showPermission ? 8 : 0);
    }

    public final sls getOnNoPermissionClicked() {
        return this.onNoPermissionClicked;
    }

    public final tls getOnToggleClicked() {
        return this.onToggleClicked;
    }

    public final void render(fto state, pav imageLoader) {
        if (state == null) {
            setVisibility(8);
            hideAll();
            return;
        }
        setVisibility(0);
        if (state.d) {
            renderWithPermission(state, imageLoader);
        } else {
            renderNoPermission(state, imageLoader);
        }
    }

    public final void setOnNoPermissionClicked(sls slsVar) {
        this.onNoPermissionClicked = slsVar;
    }

    public final void setOnToggleClicked(tls tlsVar) {
        this.onToggleClicked = tlsVar;
    }

    public ExplorerButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ExplorerButtonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ExplorerButtonView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
