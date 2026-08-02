package com.ybsdk.screens.changephone.presentation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.screens.changephone.presentation.ChangePhoneStatusFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.fj3;
import defpackage.lfx;
import defpackage.o661;
import defpackage.qas0;
import defpackage.sls;
import defpackage.te9;
import defpackage.ue9;
import defpackage.w511;
import defpackage.we9;
import defpackage.xe9;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006#"}, d2 = {"Lcom/ybsdk/screens/changephone/presentation/ChangePhoneStatusFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lo661;", "Lxe9;", "Lcom/ybsdk/screens/changephone/presentation/c;", "Lce4;", "Lue9;", "factory", "Lfj3;", "authLandingFeature", "<init>", "(Lue9;Lfj3;)V", "Lzy11;", "showLogoutDialog", "()V", "createViewModel", "()Lcom/ybsdk/screens/changephone/presentation/c;", "viewState", "render", "(Lxe9;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lo661;", "", "onBackPressed", "()Z", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lue9;", "Lfj3;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ChangePhoneStatusFragment extends BaseMvvmFragment<o661, xe9, c> implements ce4 {
    private final fj3 authLandingFeature;
    private final ue9 factory;

    public ChangePhoneStatusFragment(ue9 ue9Var, fj3 fj3Var) {
        super(null, 48, null, null, c.class, 13, null);
        this.factory = ue9Var;
        this.authLandingFeature = fj3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$8$lambda$2(ChangePhoneStatusFragment changePhoneStatusFragment, View view) {
        changePhoneStatusFragment.getViewModel().d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$8$lambda$3(ChangePhoneStatusFragment changePhoneStatusFragment) {
        changePhoneStatusFragment.getViewModel().e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$8$lambda$4(ChangePhoneStatusFragment changePhoneStatusFragment, View view) {
        changePhoneStatusFragment.getViewModel().f0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$8$lambda$7$lambda$5(ChangePhoneStatusFragment changePhoneStatusFragment) {
        changePhoneStatusFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$8$lambda$7$lambda$6(ChangePhoneStatusFragment changePhoneStatusFragment) {
        changePhoneStatusFragment.getViewModel().g0();
        return zy11.a;
    }

    private final void showLogoutDialog() {
        this.authLandingFeature.getClass();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        super.consumeSideEffect(sideEffect);
        te9 te9Var = sideEffect instanceof te9 ? (te9) sideEffect : null;
        if (te9Var == null) {
            return;
        }
        if (te9Var == te9.a) {
            showLogoutDialog();
        } else {
            w511.b();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public c getFactoryOfViewModel() {
        return ((we9) this.factory).a((ChangePhoneStatusScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public o661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        o661 o = o661.o(inflater, container);
        final int i = 0;
        o.d.setOnClickListener(new View.OnClickListener(this) { // from class: je9
            public final /* synthetic */ ChangePhoneStatusFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                ChangePhoneStatusFragment changePhoneStatusFragment = this.b;
                switch (i2) {
                    case 0:
                        ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$2(changePhoneStatusFragment, view);
                        break;
                    default:
                        ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$4(changePhoneStatusFragment, view);
                        break;
                }
            }
        });
        o.h.setOnCloseButtonClickListener(new sls(this) { // from class: ke9
            public final /* synthetic */ ChangePhoneStatusFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$8$lambda$3;
                zy11 viewBinding$lambda$8$lambda$7$lambda$5;
                zy11 viewBinding$lambda$8$lambda$7$lambda$6;
                int i2 = i;
                ChangePhoneStatusFragment changePhoneStatusFragment = this.b;
                switch (i2) {
                    case 0:
                        viewBinding$lambda$8$lambda$3 = ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$3(changePhoneStatusFragment);
                        return viewBinding$lambda$8$lambda$3;
                    case 1:
                        viewBinding$lambda$8$lambda$7$lambda$5 = ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$7$lambda$5(changePhoneStatusFragment);
                        return viewBinding$lambda$8$lambda$7$lambda$5;
                    default:
                        viewBinding$lambda$8$lambda$7$lambda$6 = ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$7$lambda$6(changePhoneStatusFragment);
                        return viewBinding$lambda$8$lambda$7$lambda$6;
                }
            }
        });
        final int i2 = 1;
        o.c.setOnClickListener(new View.OnClickListener(this) { // from class: je9
            public final /* synthetic */ ChangePhoneStatusFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                ChangePhoneStatusFragment changePhoneStatusFragment = this.b;
                switch (i22) {
                    case 0:
                        ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$2(changePhoneStatusFragment, view);
                        break;
                    default:
                        ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$4(changePhoneStatusFragment, view);
                        break;
                }
            }
        });
        ErrorView errorView = o.b;
        errorView.setChangeVisibilityWithDelay(false);
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: ke9
            public final /* synthetic */ ChangePhoneStatusFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$8$lambda$3;
                zy11 viewBinding$lambda$8$lambda$7$lambda$5;
                zy11 viewBinding$lambda$8$lambda$7$lambda$6;
                int i22 = i2;
                ChangePhoneStatusFragment changePhoneStatusFragment = this.b;
                switch (i22) {
                    case 0:
                        viewBinding$lambda$8$lambda$3 = ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$3(changePhoneStatusFragment);
                        return viewBinding$lambda$8$lambda$3;
                    case 1:
                        viewBinding$lambda$8$lambda$7$lambda$5 = ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$7$lambda$5(changePhoneStatusFragment);
                        return viewBinding$lambda$8$lambda$7$lambda$5;
                    default:
                        viewBinding$lambda$8$lambda$7$lambda$6 = ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$7$lambda$6(changePhoneStatusFragment);
                        return viewBinding$lambda$8$lambda$7$lambda$6;
                }
            }
        });
        final int i3 = 2;
        errorView.setSecondaryButtonClickListener(new sls(this) { // from class: ke9
            public final /* synthetic */ ChangePhoneStatusFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$8$lambda$3;
                zy11 viewBinding$lambda$8$lambda$7$lambda$5;
                zy11 viewBinding$lambda$8$lambda$7$lambda$6;
                int i22 = i3;
                ChangePhoneStatusFragment changePhoneStatusFragment = this.b;
                switch (i22) {
                    case 0:
                        viewBinding$lambda$8$lambda$3 = ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$3(changePhoneStatusFragment);
                        return viewBinding$lambda$8$lambda$3;
                    case 1:
                        viewBinding$lambda$8$lambda$7$lambda$5 = ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$7$lambda$5(changePhoneStatusFragment);
                        return viewBinding$lambda$8$lambda$7$lambda$5;
                    default:
                        viewBinding$lambda$8$lambda$7$lambda$6 = ChangePhoneStatusFragment.getViewBinding$lambda$8$lambda$7$lambda$6(changePhoneStatusFragment);
                        return viewBinding$lambda$8$lambda$7$lambda$6;
                }
            }
        });
        return o;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        getViewModel().e0();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(xe9 viewState) {
        o661 o661Var = (o661) getBinding();
        TextView textView = o661Var.g;
        YbButtonView ybButtonView = o661Var.c;
        YbButtonView ybButtonView2 = o661Var.d;
        textView.setText(d.a(requireContext(), viewState.f()));
        TextView textView2 = o661Var.e;
        Text b = viewState.b();
        textView2.setText(b != null ? d.a(requireContext(), b) : null);
        textView2.setVisibility(viewState.b() != null ? 0 : 8);
        o661Var.f.render(viewState.e());
        o661Var.h.render(viewState.g());
        YbButtonView.a a = viewState.a();
        if (a != null) {
            ybButtonView2.render(a);
        }
        ybButtonView2.setVisibility(viewState.a() != null ? 0 : 8);
        YbButtonView.a d = viewState.d();
        if (d != null) {
            ybButtonView.render(d);
        }
        ybButtonView.setVisibility(viewState.d() != null ? 0 : 8);
        o661Var.b.render(viewState.c());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
