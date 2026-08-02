package com.ybsdk.feature.card.internal.presentation.singlecard;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$SecondFactorResult;
import com.ybsdk.feature.card.internal.entities.CardProductTypeEntity;
import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardFragment;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.settings.api.SettingsTheme;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.ahs0;
import defpackage.bhs0;
import defpackage.buz0;
import defpackage.chs0;
import defpackage.dcs;
import defpackage.frb1;
import defpackage.g9r0;
import defpackage.hf8;
import defpackage.hua1;
import defpackage.if8;
import defpackage.jl40;
import defpackage.kgs0;
import defpackage.lfx;
import defpackage.lgs0;
import defpackage.m161;
import defpackage.mf8;
import defpackage.mgs0;
import defpackage.n6r0;
import defpackage.nab1;
import defpackage.ogs0;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.qn8;
import defpackage.rbv;
import defpackage.rje;
import defpackage.rr51;
import defpackage.sls;
import defpackage.t26;
import defpackage.te8;
import defpackage.tgs0;
import defpackage.tls;
import defpackage.ugs0;
import defpackage.ukr0;
import defpackage.v4b1;
import defpackage.vgs0;
import defpackage.w511;
import defpackage.wgs0;
import defpackage.wm8;
import defpackage.wyr0;
import defpackage.xgs0;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.ygs0;
import defpackage.yr31;
import defpackage.z8r0;
import defpackage.zgs0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J;\u00102\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u001d0-2\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u001d00H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u001dH\u0002¢\u0006\u0004\b4\u0010!J\u0013\u00106\u001a\u00020\u001d*\u000205H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00109R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010:R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?¨\u0006B"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/singlecard/SingleCardFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lm161;", "Lchs0;", "Lcom/ybsdk/feature/card/internal/presentation/singlecard/a;", "Ltgs0;", "viewModelProvider", "Lqn8;", "secondFactorHelper", "Lwm8;", "remoteConfig", "Lte8;", "bottomSheetInteractor", "Ln6r0;", "settingsAdapterFactory", "<init>", "(Ltgs0;Lqn8;Lwm8;Lte8;Ln6r0;)V", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/singlecard/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lm161;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "()V", "onCreate", "(Landroid/os/Bundle;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "viewState", "render", "(Lchs0;)V", "Lcom/ybsdk/feature/card/api/CardSecondFactorHelper$Request;", "request", "Lkotlin/Function1;", "", "onSuccess", "Lkotlin/Function0;", "onCancel", "handle2faResult", "(Lcom/ybsdk/feature/card/api/CardSecondFactorHelper$Request;Ltls;Lsls;)V", "setupClickListeners", "Lzgs0;", "renderCardPublicInfo", "(Lzgs0;)V", "Ltgs0;", "Lqn8;", "Lwm8;", "Lte8;", "Lqa3;", "Le9r0;", "settingsAdapter", "Lqa3;", "managementAdapter", "cardAdditionalAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SingleCardFragment extends BaseDivContextMvvmFragment<m161, chs0, a> {
    private final te8 bottomSheetInteractor;
    private final qa3 cardAdditionalAdapter;
    private final qa3 managementAdapter;
    private final wm8 remoteConfig;
    private final qn8 secondFactorHelper;
    private final qa3 settingsAdapter;
    private final tgs0 viewModelProvider;

    public SingleCardFragment(tgs0 tgs0Var, qn8 qn8Var, wm8 wm8Var, te8 te8Var, n6r0 n6r0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelProvider = tgs0Var;
        this.secondFactorHelper = qn8Var;
        this.remoteConfig = wm8Var;
        this.bottomSheetInteractor = te8Var;
        int i = 5;
        int i2 = 2;
        int i3 = 3;
        int i4 = 1;
        this.settingsAdapter = nab1.d(n6r0Var, new mgs0(this, i), new ukr0(17), new lgs0(this, i2), new lgs0(this, i3), new mgs0(this, i4));
        this.managementAdapter = nab1.d(n6r0Var, new mgs0(this, i2), new ukr0(18), new lgs0(this, 4), new lgs0(this, i), new mgs0(this, i3));
        int i5 = 0;
        this.cardAdditionalAdapter = nab1.d(n6r0Var, new mgs0(this, 6), new ukr0(19), new lgs0(this, i5), new lgs0(this, i4), new mgs0(this, i5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean cardAdditionalAdapter$lambda$10(SingleCardFragment singleCardFragment, g9r0 g9r0Var, boolean z) {
        return ((a) singleCardFragment.getViewModel()).l0(g9r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 cardAdditionalAdapter$lambda$11(SettingsTheme settingsTheme) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 cardAdditionalAdapter$lambda$12(SingleCardFragment singleCardFragment, z8r0 z8r0Var) {
        ((a) singleCardFragment.getViewModel()).d0(z8r0Var.getKey(), null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 cardAdditionalAdapter$lambda$13(SingleCardFragment singleCardFragment, String str) {
        ((a) singleCardFragment.getViewModel()).c0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 cardAdditionalAdapter$lambda$14(SingleCardFragment singleCardFragment, String str, boolean z) {
        ((a) singleCardFragment.getViewModel()).p0(str, z);
        return zy11.a;
    }

    private final void handle2faResult(CardSecondFactorHelper$Request request, tls onSuccess, sls onCancel) {
        getParentFragmentManager().m0(request.getKey(), this, new t26(20, this, onSuccess, onCancel));
    }

    public static /* synthetic */ void handle2faResult$default(SingleCardFragment singleCardFragment, CardSecondFactorHelper$Request cardSecondFactorHelper$Request, tls tlsVar, sls slsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            slsVar = new wyr0(15);
        }
        singleCardFragment.handle2faResult(cardSecondFactorHelper$Request, tlsVar, slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handle2faResult$lambda$20(SingleCardFragment singleCardFragment, tls tlsVar, sls slsVar, String str, Bundle bundle) {
        CardSecondFactorHelper$SecondFactorResult a = ((mf8) singleCardFragment.secondFactorHelper).a(bundle);
        if (a instanceof CardSecondFactorHelper$SecondFactorResult.VerificationToken) {
            tlsVar.invoke(((CardSecondFactorHelper$SecondFactorResult.VerificationToken) a).getVerificationToken());
        } else if (jl40.l(a, CardSecondFactorHelper$SecondFactorResult.Cancel.INSTANCE) || a == null) {
            slsVar.invoke();
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean managementAdapter$lambda$5(SingleCardFragment singleCardFragment, g9r0 g9r0Var, boolean z) {
        return ((a) singleCardFragment.getViewModel()).l0(g9r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 managementAdapter$lambda$6(SettingsTheme settingsTheme) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 managementAdapter$lambda$7(SingleCardFragment singleCardFragment, z8r0 z8r0Var) {
        ((a) singleCardFragment.getViewModel()).d0(z8r0Var.getKey(), null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 managementAdapter$lambda$8(SingleCardFragment singleCardFragment, String str) {
        ((a) singleCardFragment.getViewModel()).c0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 managementAdapter$lambda$9(SingleCardFragment singleCardFragment, String str, boolean z) {
        ((a) singleCardFragment.getViewModel()).p0(str, z);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$17(SingleCardFragment singleCardFragment, String str) {
        ((a) singleCardFragment.getViewModel()).d0(null, str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$18(SingleCardFragment singleCardFragment) {
        ((a) singleCardFragment.getViewModel()).e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$15(SingleCardFragment singleCardFragment, String str, Bundle bundle) {
        ((a) singleCardFragment.getViewModel()).f0(false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$16(SingleCardFragment singleCardFragment) {
        ((a) singleCardFragment.getViewModel()).f0(false);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderCardPublicInfo(zgs0 zgs0Var) {
        ((m161) getBinding()).o.setVisibility(zgs0Var.c() != null ? 0 : 8);
        ((m161) getBinding()).q.setVisibility(zgs0Var.c() != null ? 0 : 8);
        ((m161) getBinding()).p.setVisibility(zgs0Var.c() != null ? 0 : 8);
        ((m161) getBinding()).w.setVisibility(zgs0Var.c() != null ? 0 : 8);
        ((m161) getBinding()).b.setVisibility(zgs0Var.c() != null ? 0 : 8);
        if (zgs0Var.c() == null) {
            return;
        }
        ((m161) getBinding()).o.render(zgs0Var.c().b());
        ((m161) getBinding()).q.render(zgs0Var.c().a());
        ((m161) getBinding()).p.render(zgs0Var.c().c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean settingsAdapter$lambda$0(SingleCardFragment singleCardFragment, g9r0 g9r0Var, boolean z) {
        return ((a) singleCardFragment.getViewModel()).l0(g9r0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 settingsAdapter$lambda$1(SettingsTheme settingsTheme) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 settingsAdapter$lambda$2(SingleCardFragment singleCardFragment, z8r0 z8r0Var) {
        ((a) singleCardFragment.getViewModel()).d0(z8r0Var.getKey(), null);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 settingsAdapter$lambda$3(SingleCardFragment singleCardFragment, String str) {
        ((a) singleCardFragment.getViewModel()).c0(str);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 settingsAdapter$lambda$4(SingleCardFragment singleCardFragment, String str, boolean z) {
        ((a) singleCardFragment.getViewModel()).p0(str, z);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupClickListeners() {
        m161 m161Var = (m161) getBinding();
        final int i = 0;
        m161Var.k.setPrimaryButtonOnClickListener(new kgs0(this, i));
        m161Var.q.setOnClickListener(new View.OnClickListener(this) { // from class: ngs0
            public final /* synthetic */ SingleCardFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                SingleCardFragment singleCardFragment = this.b;
                switch (i2) {
                    case 0:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$22(singleCardFragment, view);
                        break;
                    case 1:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$23(singleCardFragment, view);
                        break;
                    case 2:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$24(singleCardFragment, view);
                        break;
                    case 3:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$25(singleCardFragment, view);
                        break;
                    default:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$26(singleCardFragment, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        m161Var.p.setOnClickListener(new View.OnClickListener(this) { // from class: ngs0
            public final /* synthetic */ SingleCardFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                SingleCardFragment singleCardFragment = this.b;
                switch (i22) {
                    case 0:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$22(singleCardFragment, view);
                        break;
                    case 1:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$23(singleCardFragment, view);
                        break;
                    case 2:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$24(singleCardFragment, view);
                        break;
                    case 3:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$25(singleCardFragment, view);
                        break;
                    default:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$26(singleCardFragment, view);
                        break;
                }
            }
        });
        final int i3 = 2;
        m161Var.o.setOnClickListener(new View.OnClickListener(this) { // from class: ngs0
            public final /* synthetic */ SingleCardFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                SingleCardFragment singleCardFragment = this.b;
                switch (i22) {
                    case 0:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$22(singleCardFragment, view);
                        break;
                    case 1:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$23(singleCardFragment, view);
                        break;
                    case 2:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$24(singleCardFragment, view);
                        break;
                    case 3:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$25(singleCardFragment, view);
                        break;
                    default:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$26(singleCardFragment, view);
                        break;
                }
            }
        });
        final int i4 = 3;
        m161Var.b.setOnClickListener(new View.OnClickListener(this) { // from class: ngs0
            public final /* synthetic */ SingleCardFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i4;
                SingleCardFragment singleCardFragment = this.b;
                switch (i22) {
                    case 0:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$22(singleCardFragment, view);
                        break;
                    case 1:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$23(singleCardFragment, view);
                        break;
                    case 2:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$24(singleCardFragment, view);
                        break;
                    case 3:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$25(singleCardFragment, view);
                        break;
                    default:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$26(singleCardFragment, view);
                        break;
                }
            }
        });
        final int i5 = 4;
        m161Var.x.setOnClickListener(new View.OnClickListener(this) { // from class: ngs0
            public final /* synthetic */ SingleCardFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i5;
                SingleCardFragment singleCardFragment = this.b;
                switch (i22) {
                    case 0:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$22(singleCardFragment, view);
                        break;
                    case 1:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$23(singleCardFragment, view);
                        break;
                    case 2:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$24(singleCardFragment, view);
                        break;
                    case 3:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$25(singleCardFragment, view);
                        break;
                    default:
                        SingleCardFragment.setupClickListeners$lambda$28$lambda$26(singleCardFragment, view);
                        break;
                }
            }
        });
        m161Var.i.setActionHandler(new lgs0(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 setupClickListeners$lambda$28$lambda$21(SingleCardFragment singleCardFragment) {
        ((a) singleCardFragment.getViewModel()).f0(true);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupClickListeners$lambda$28$lambda$22(SingleCardFragment singleCardFragment, View view) {
        ((a) singleCardFragment.getViewModel()).g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupClickListeners$lambda$28$lambda$23(SingleCardFragment singleCardFragment, View view) {
        ((a) singleCardFragment.getViewModel()).i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupClickListeners$lambda$28$lambda$24(SingleCardFragment singleCardFragment, View view) {
        ((a) singleCardFragment.getViewModel()).h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupClickListeners$lambda$28$lambda$25(SingleCardFragment singleCardFragment, View view) {
        ((a) singleCardFragment.getViewModel()).m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupClickListeners$lambda$28$lambda$26(SingleCardFragment singleCardFragment, View view) {
        ((a) singleCardFragment.getViewModel()).k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean setupClickListeners$lambda$28$lambda$27(SingleCardFragment singleCardFragment, Uri uri) {
        return ((a) singleCardFragment.getViewModel()).j0(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        ImageView icon;
        xgs0 xgs0Var = sideEffect instanceof xgs0 ? (xgs0) sideEffect : null;
        if (xgs0Var == null) {
            return;
        }
        if (xgs0Var instanceof ugs0) {
            ugs0 ugs0Var = (ugs0) xgs0Var;
            rje.b(requireContext(), ugs0Var.b(), getString(ugs0Var.a()));
            return;
        }
        if (xgs0Var instanceof vgs0) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((vgs0) xgs0Var).a(), null, 12);
            return;
        }
        if (!(xgs0Var instanceof wgs0)) {
            w511.b();
            return;
        }
        wgs0 wgs0Var = (wgs0) xgs0Var;
        int i = ogs0.a[wgs0Var.b().ordinal()];
        if (i == 1) {
            icon = ((m161) getBinding()).q.getIcon();
        } else if (i == 2) {
            icon = ((m161) getBinding()).p.getIcon();
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            icon = ((m161) getBinding()).o.getIcon();
        }
        buz0 d = frb1.d(requireContext());
        b bVar = Text.Companion;
        String string = getString(wgs0Var.a());
        bVar.getClass();
        d.l(new Text.Constant(string));
        d.a().f(icon, 0L);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((ygs0) this.viewModelProvider).a((SingleCardScreenScreenParams) dcs.a(this));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [uc5] */
    /* JADX WARN: Type inference failed for: r1v4, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v2, types: [uc5] */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handle2faResult(CardSecondFactorHelper$Request.FREEZING, new lgs0(this, 6), new kgs0(this, 1));
        handle2faResult(CardSecondFactorHelper$Request.SETTINGS, new SingleCardFragment$onCreate$3(getViewModel()), new SingleCardFragment$onCreate$4(getViewModel()));
        handle2faResult(CardSecondFactorHelper$Request.REQUISITES, new SingleCardFragment$onCreate$5(getViewModel()), new SingleCardFragment$onCreate$6(getViewModel()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((a) getViewModel()).f0(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((m161) getBinding()).s.setAdapter(this.settingsAdapter);
        ((m161) getBinding()).m.setAdapter(this.managementAdapter);
        ((m161) getBinding()).c.setAdapter(this.cardAdditionalAdapter);
        setupClickListeners();
        hua1.g(this, "SETTINGS_TERM_FRAGMENT_CLOSED_RESULT_KEY", new mgs0(this, 4));
        ((hf8) this.bottomSheetInteractor).b(getViewLifecycleOwner().getLifecycle(), new kgs0(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(chs0 viewState) {
        ErrorView errorView = ((m161) getBinding()).k;
        boolean z = viewState instanceof ahs0;
        ahs0 ahs0Var = z ? (ahs0) viewState : null;
        errorView.render(ahs0Var != null ? ahs0Var.a() : null);
        boolean z2 = viewState instanceof bhs0;
        ((m161) getBinding()).t.p().setVisibility(z2 ? 0 : 8);
        boolean z3 = viewState instanceof zgs0;
        ((m161) getBinding()).l.setVisibility(z3 ? 0 : 8);
        if (!z2) {
            ((m161) getBinding()).v.p().setVisibility(8);
            ((m161) getBinding()).u.p().setVisibility(8);
            ((m161) getBinding()).t.p().setVisibility(8);
        }
        if (z2) {
            ((m161) getBinding()).u.p().setVisibility((((if8) this.remoteConfig).e() && ((bhs0) viewState).a() == CardProductTypeEntity.SPLIT) ? 0 : 8);
            ((m161) getBinding()).v.p().setVisibility((((if8) this.remoteConfig).e() || ((bhs0) viewState).a() != CardProductTypeEntity.SPLIT) ? 8 : 0);
            ((m161) getBinding()).t.p().setVisibility(((bhs0) viewState).a() != CardProductTypeEntity.SPLIT ? 0 : 8);
            return;
        }
        if (!z3) {
            if (z) {
                return;
            }
            w511.b();
            return;
        }
        zgs0 zgs0Var = (zgs0) viewState;
        v4b1.k(zgs0Var.d(), ((m161) getBinding()).f, null, null, 6);
        ((m161) getBinding()).h.setText(zgs0Var.b().c().d());
        xty0.e(((m161) getBinding()).g, zgs0Var.b().c().e());
        ((m161) getBinding()).g.setText(zgs0Var.b().c().b());
        xty0.e(((m161) getBinding()).g, zgs0Var.b().c().c());
        ((m161) getBinding()).e.setVisibility(zgs0Var.i() != null ? 0 : 8);
        rbv i = zgs0Var.i();
        if (i != null) {
            v4b1.k(i, ((m161) getBinding()).e, null, null, 6);
        }
        renderCardPublicInfo(zgs0Var);
        v4b1.k(zgs0Var.g(), ((m161) getBinding()).b, null, null, 6);
        ((m161) getBinding()).b.setContentDescription(d.a(requireContext(), zgs0Var.f()));
        this.settingsAdapter.g(zgs0Var.h());
        this.managementAdapter.g(zgs0Var.e());
        ((m161) getBinding()).r.setText(zgs0Var.b().f());
        ((m161) getBinding()).n.setText(zgs0Var.b().d());
        rbv a = zgs0Var.b().c().a();
        if (a != null) {
            v4b1.k(a, ((m161) getBinding()).x, null, null, 6);
        }
        ((m161) getBinding()).x.setVisibility(zgs0Var.b().c().a() != null ? 0 : 8);
        ((m161) getBinding()).i.setVisibility(zgs0Var.b().e() != null ? 0 : 8);
        ((m161) getBinding()).j.setVisibility(zgs0Var.b().a() != null ? 0 : 8);
        rr51 e = zgs0Var.b().e();
        if (e != null) {
            YbDivView.setData$default(((m161) getBinding()).i, e, null, null, false, 14, null);
        }
        rr51 a2 = zgs0Var.b().a();
        if (a2 != null) {
            YbDivView.setData$default(((m161) getBinding()).j, a2, null, null, false, 14, null);
        }
        this.cardAdditionalAdapter.g(zgs0Var.a());
        ((m161) getBinding()).d.setText(zgs0Var.b().b());
        boolean z4 = zgs0Var.b().b() != null;
        ((m161) getBinding()).d.setVisibility(z4 ? 0 : 8);
        ((m161) getBinding()).c.setVisibility(z4 ? 0 : 8);
        boolean isEmpty = this.managementAdapter.f().isEmpty();
        ((m161) getBinding()).m.setVisibility(!isEmpty ? 0 : 8);
        ((m161) getBinding()).n.setVisibility(!isEmpty ? 0 : 8);
        boolean isEmpty2 = this.settingsAdapter.f().isEmpty();
        ((m161) getBinding()).r.setVisibility(!isEmpty2 ? 0 : 8);
        ((m161) getBinding()).s.setVisibility(isEmpty2 ? 8 : 0);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public m161 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return m161.o(inflater, container);
    }
}
