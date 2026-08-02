package com.ybsdk.feature.settings.internal.screens.settings.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.settings.api.SettingsTheme;
import com.ybsdk.feature.settings.internal.screens.settings.presentation.SettingsFragment;
import com.ybsdk.feature.settings.internal.view.b;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.a5p0;
import defpackage.a8r0;
import defpackage.c8r0;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.ffr0;
import defpackage.g9r0;
import defpackage.gfr0;
import defpackage.gyp0;
import defpackage.hua1;
import defpackage.if6;
import defpackage.lfx;
import defpackage.nl;
import defpackage.p861;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.rer0;
import defpackage.ser0;
import defpackage.ter0;
import defpackage.tls;
import defpackage.uer0;
import defpackage.unr0;
import defpackage.v6r0;
import defpackage.ver0;
import defpackage.w511;
import defpackage.w7r0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z7r0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 /2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u00010B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/ybsdk/feature/settings/internal/screens/settings/presentation/SettingsFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lp861;", "Lgfr0;", "Lcom/ybsdk/feature/settings/internal/screens/settings/presentation/a;", "Lrer0;", "viewModelFactory", "Lgyp0;", "secondFactorScreenProvider", "Lcom/ybsdk/feature/settings/internal/view/b;", "adapterFactory", "<init>", "(Lrer0;Lgyp0;Lcom/ybsdk/feature/settings/internal/view/b;)V", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "showChangePriorityBankBottomSheet", "()Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "showWipeNfcDialogBottomSheet", "createViewModel", "()Lcom/ybsdk/feature/settings/internal/screens/settings/presentation/a;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lp861;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "viewState", "render", "(Lgfr0;)V", "Lrer0;", "Lgyp0;", "Lqa3;", "Le9r0;", "adapter", "Lqa3;", "Companion", "c8r0", "feature-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SettingsFragment extends BaseMvvmFragment<p861, gfr0, a> {
    public static final c8r0 Companion = new c8r0();
    private static final long PROGRESS_ANIMATION_TIME_MS = 200;
    private final qa3 adapter;
    private final gyp0 secondFactorScreenProvider;
    private final rer0 viewModelFactory;

    /* JADX WARN: Type inference failed for: r5v1, types: [b8r0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [b8r0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [b8r0] */
    public SettingsFragment(rer0 rer0Var, gyp0 gyp0Var, b bVar) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelFactory = rer0Var;
        this.secondFactorScreenProvider = gyp0Var;
        final int i = 0;
        z7r0 z7r0Var = new z7r0(this, i);
        tls tlsVar = new tls(this) { // from class: b8r0
            public final /* synthetic */ SettingsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 adapter$lambda$1;
                zy11 adapter$lambda$2;
                zy11 adapter$lambda$4;
                zy11 adapter$lambda$5;
                int i2 = i;
                SettingsFragment settingsFragment = this.b;
                switch (i2) {
                    case 0:
                        adapter$lambda$1 = SettingsFragment.adapter$lambda$1(settingsFragment, (SettingsTheme) obj);
                        return adapter$lambda$1;
                    case 1:
                        adapter$lambda$2 = SettingsFragment.adapter$lambda$2(settingsFragment, (tls) obj);
                        return adapter$lambda$2;
                    case 2:
                        adapter$lambda$4 = SettingsFragment.adapter$lambda$4(settingsFragment, (v6r0) obj);
                        return adapter$lambda$4;
                    default:
                        adapter$lambda$5 = SettingsFragment.adapter$lambda$5(settingsFragment, (v6r0) obj);
                        return adapter$lambda$5;
                }
            }
        };
        final int i2 = 1;
        ?? r5 = new tls(this) { // from class: b8r0
            public final /* synthetic */ SettingsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 adapter$lambda$1;
                zy11 adapter$lambda$2;
                zy11 adapter$lambda$4;
                zy11 adapter$lambda$5;
                int i22 = i2;
                SettingsFragment settingsFragment = this.b;
                switch (i22) {
                    case 0:
                        adapter$lambda$1 = SettingsFragment.adapter$lambda$1(settingsFragment, (SettingsTheme) obj);
                        return adapter$lambda$1;
                    case 1:
                        adapter$lambda$2 = SettingsFragment.adapter$lambda$2(settingsFragment, (tls) obj);
                        return adapter$lambda$2;
                    case 2:
                        adapter$lambda$4 = SettingsFragment.adapter$lambda$4(settingsFragment, (v6r0) obj);
                        return adapter$lambda$4;
                    default:
                        adapter$lambda$5 = SettingsFragment.adapter$lambda$5(settingsFragment, (v6r0) obj);
                        return adapter$lambda$5;
                }
            }
        };
        final int i3 = 2;
        a8r0 a8r0Var = new a8r0(this, i3);
        ?? r7 = new tls(this) { // from class: b8r0
            public final /* synthetic */ SettingsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 adapter$lambda$1;
                zy11 adapter$lambda$2;
                zy11 adapter$lambda$4;
                zy11 adapter$lambda$5;
                int i22 = i3;
                SettingsFragment settingsFragment = this.b;
                switch (i22) {
                    case 0:
                        adapter$lambda$1 = SettingsFragment.adapter$lambda$1(settingsFragment, (SettingsTheme) obj);
                        return adapter$lambda$1;
                    case 1:
                        adapter$lambda$2 = SettingsFragment.adapter$lambda$2(settingsFragment, (tls) obj);
                        return adapter$lambda$2;
                    case 2:
                        adapter$lambda$4 = SettingsFragment.adapter$lambda$4(settingsFragment, (v6r0) obj);
                        return adapter$lambda$4;
                    default:
                        adapter$lambda$5 = SettingsFragment.adapter$lambda$5(settingsFragment, (v6r0) obj);
                        return adapter$lambda$5;
                }
            }
        };
        final int i4 = 3;
        this.adapter = b.a(bVar, z7r0Var, tlsVar, null, r5, a8r0Var, r7, new tls(this) { // from class: b8r0
            public final /* synthetic */ SettingsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 adapter$lambda$1;
                zy11 adapter$lambda$2;
                zy11 adapter$lambda$4;
                zy11 adapter$lambda$5;
                int i22 = i4;
                SettingsFragment settingsFragment = this.b;
                switch (i22) {
                    case 0:
                        adapter$lambda$1 = SettingsFragment.adapter$lambda$1(settingsFragment, (SettingsTheme) obj);
                        return adapter$lambda$1;
                    case 1:
                        adapter$lambda$2 = SettingsFragment.adapter$lambda$2(settingsFragment, (tls) obj);
                        return adapter$lambda$2;
                    case 2:
                        adapter$lambda$4 = SettingsFragment.adapter$lambda$4(settingsFragment, (v6r0) obj);
                        return adapter$lambda$4;
                    default:
                        adapter$lambda$5 = SettingsFragment.adapter$lambda$5(settingsFragment, (v6r0) obj);
                        return adapter$lambda$5;
                }
            }
        }, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean adapter$lambda$0(SettingsFragment settingsFragment, g9r0 g9r0Var, boolean z) {
        return settingsFragment.getViewModel().n0(g9r0Var.getKey(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$1(SettingsFragment settingsFragment, SettingsTheme settingsTheme) {
        settingsFragment.getViewModel().o0(settingsTheme);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$2(SettingsFragment settingsFragment, tls tlsVar) {
        tlsVar.invoke(settingsFragment.requireActivity());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$3(SettingsFragment settingsFragment) {
        settingsFragment.getViewModel().q0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$4(SettingsFragment settingsFragment, v6r0 v6r0Var) {
        settingsFragment.getViewModel().h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 adapter$lambda$5(SettingsFragment settingsFragment, v6r0 v6r0Var) {
        settingsFragment.getViewModel().g0(v6r0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$6(SettingsFragment settingsFragment, String str, Bundle bundle) {
        settingsFragment.getViewModel().l0(((w7r0) settingsFragment.secondFactorScreenProvider).a(bundle));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$8(SettingsFragment settingsFragment) {
        settingsFragment.getViewModel().k0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$9(SettingsFragment settingsFragment) {
        settingsFragment.getViewModel().i0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final BottomSheetDialogView showChangePriorityBankBottomSheet() {
        BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView.onPrimaryAction(new if6(bottomSheetDialogView, 5));
        Object[] objArr = 0 == true ? 1 : 0;
        bottomSheetDialogView.render(new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(new Text.Resource(dzh0.ybsdk_settings_change_priority_bank_title), new Text.Resource(dzh0.ybsdk_settings_change_priority_bank_description), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_settings_button_got_it), objArr, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068));
        BottomSheetDialogView.show$default(bottomSheetDialogView, requireActivity(), null, 2, null);
        return bottomSheetDialogView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final BottomSheetDialogView showWipeNfcDialogBottomSheet() {
        BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        getViewModel().m0();
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        bottomSheetDialogView.onPrimaryAction(new nl(15, this, ref$BooleanRef, bottomSheetDialogView));
        bottomSheetDialogView.onSecondaryAction(new if6(bottomSheetDialogView, 6));
        bottomSheetDialogView.onDismiss(new a5p0(21, ref$BooleanRef, this));
        ColorModel colorModel = null;
        ColorModel colorModel2 = null;
        ColorModel colorModel3 = null;
        boolean z = false;
        YbButtonView.a aVar = new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_settings_wipe_nfc_dialog_submit_action_title), null, null, null, colorModel, colorModel2, colorModel3, false, z, null, 4094);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        bottomSheetDialogView.render(new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(new Text.Resource(dzh0.ybsdk_settings_wipe_nfc_dialog_title), new Text.Resource(dzh0.ybsdk_settings_wipe_nfc_dialog_description), null, null, null, null, HProv.PP_SAME_MEDIA), aVar, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_settings_wipe_nfc_dialog_dismiss_action_title), objArr, objArr2, colorModel, colorModel2, colorModel3, null, z, false, null, 4094), null, null, null, null, null, null, 131064));
        BottomSheetDialogView.show$default(bottomSheetDialogView, requireActivity(), null, 2, null);
        return bottomSheetDialogView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showWipeNfcDialogBottomSheet$lambda$16$lambda$13(SettingsFragment settingsFragment, Ref$BooleanRef ref$BooleanRef, BottomSheetDialogView bottomSheetDialogView, View view) {
        settingsFragment.getViewModel().r0();
        ref$BooleanRef.element = true;
        bottomSheetDialogView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showWipeNfcDialogBottomSheet$lambda$16$lambda$15(Ref$BooleanRef ref$BooleanRef, SettingsFragment settingsFragment, boolean z) {
        if (!ref$BooleanRef.element) {
            settingsFragment.getViewModel().j0();
        }
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof ver0) {
            ver0 ver0Var = (ver0) sideEffect;
            if (ver0Var instanceof ter0) {
                com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((ter0) sideEffect).a(), null, 12);
                return;
            }
            if (ver0Var instanceof ser0) {
                showChangePriorityBankBottomSheet();
            } else if (ver0Var instanceof uer0) {
                showWipeNfcDialogBottomSheet();
            } else {
                w511.b();
            }
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((ffr0) this.viewModelFactory).a(((SettingsScreenParams) dcs.a(this)).getSource());
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public p861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        p861 o = p861.o(inflater, container);
        o.c.setAdapter(this.adapter);
        return o;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.secondFactorScreenProvider.getClass();
        hua1.g(this, "request_key_authorization", new z7r0(this, 1));
        getViewModel().f0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getViewModel().p0();
        ((p861) getBinding()).e.announceTitleForAccessibility();
        ((p861) getBinding()).b.setPrimaryButtonOnClickListener(new a8r0(this, 0));
        ((p861) getBinding()).b.setSecondaryButtonClickListener(new a8r0(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(gfr0 viewState) {
        p861 p861Var = (p861) getBinding();
        p861Var.b.render(viewState.a());
        com.ybsdk.core.utils.ext.view.b.c(p861Var.d.p(), viewState.c(), 200L, 0, 0L, null, 28);
        if (viewState.a() == null) {
            this.adapter.g(viewState.b());
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
