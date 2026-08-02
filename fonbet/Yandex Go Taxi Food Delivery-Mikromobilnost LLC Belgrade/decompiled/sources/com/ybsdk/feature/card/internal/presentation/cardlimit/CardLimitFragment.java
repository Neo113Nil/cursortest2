package com.ybsdk.feature.card.internal.presentation.cardlimit;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.ThousandSeparatorTextWatcher;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$Request;
import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.keyboard.NumberKeyboardView;
import com.ybsdk.widgets.common.snackbar.SnackbarView;
import defpackage.ci8;
import defpackage.cyy;
import defpackage.dcs;
import defpackage.di8;
import defpackage.dzh0;
import defpackage.ei8;
import defpackage.fi8;
import defpackage.hh8;
import defpackage.hi8;
import defpackage.hua1;
import defpackage.i3y;
import defpackage.i661;
import defpackage.j5x0;
import defpackage.ji8;
import defpackage.jl40;
import defpackage.k5x0;
import defpackage.ki8;
import defpackage.lfx;
import defpackage.li8;
import defpackage.mf8;
import defpackage.mi8;
import defpackage.ni8;
import defpackage.oyr;
import defpackage.qas0;
import defpackage.qn8;
import defpackage.r501;
import defpackage.r8j0;
import defpackage.rk6;
import defpackage.s8j0;
import defpackage.sd8;
import defpackage.stz0;
import defpackage.t8j0;
import defpackage.tls;
import defpackage.u8j0;
import defpackage.unr0;
import defpackage.utb1;
import defpackage.w511;
import defpackage.wz51;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ,2\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0002-.B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u000f2\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardlimit/CardLimitFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Li661;", "Lu8j0;", "Lhi8;", "Lcom/ybsdk/feature/card/internal/presentation/cardlimit/CardLimitViewState;", "Lcom/ybsdk/feature/card/internal/presentation/cardlimit/a;", "Lmi8;", "viewModelFactory", "Lqn8;", "secondFactorHelper", "<init>", "(Lmi8;Lqn8;)V", "Lr8j0;", "viewState", "Lzy11;", "renderInput", "(Lr8j0;)V", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/cardlimit/a;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Li661;", "render", "(Lu8j0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lmi8;", "Lqn8;", "Lcom/ybsdk/feature/card/internal/presentation/cardlimit/CardLimitFragment$Arguments;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/card/internal/presentation/cardlimit/CardLimitFragment$Arguments;", "screenParams", "Companion", "Arguments", "fi8", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardLimitFragment extends BaseMvvmFragment<i661, u8j0, a> {
    private static final String CARD_ID_KEY = "CARD_ID_KEY";
    public static final fi8 Companion = new fi8();
    public static final String SAVE_LIMIT_RESULT = "SAVE_LIMIT_RESULT_KEY";

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final qn8 secondFactorHelper;
    private final mi8 viewModelFactory;

    public CardLimitFragment(mi8 mi8Var, qn8 qn8Var) {
        super(null, 3, null, null, a.class, 13, null);
        this.viewModelFactory = mi8Var;
        this.secondFactorHelper = qn8Var;
        this.screenParams = dcs.c(this);
    }

    private final Arguments getScreenParams() {
        return (Arguments) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$1(CardLimitFragment cardLimitFragment, k5x0 k5x0Var) {
        cardLimitFragment.getViewModel().f0(k5x0Var.a());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$2(CardLimitFragment cardLimitFragment, Editable editable) {
        cardLimitFragment.getViewModel().c0(editable.toString());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$6$lambda$3(CardLimitFragment cardLimitFragment) {
        cardLimitFragment.getViewModel().b0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final stz0 getViewBinding$lambda$6$lambda$4(stz0 stz0Var) {
        return stz0.a(stz0Var, unr0.h(Text.Companion, dzh0.ybsdk_card_card_period_limit_title), null, null, null, null, null, false, false, null, null, 0, 32766);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$6$lambda$5(CardLimitFragment cardLimitFragment, View view) {
        cardLimitFragment.getViewModel().d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreate$lambda$0(CardLimitFragment cardLimitFragment, String str, Bundle bundle) {
        cardLimitFragment.getViewModel().e0(((mf8) cardLimitFragment.secondFactorHelper).a(bundle));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j5x0 render$lambda$8$lambda$7(u8j0 u8j0Var, j5x0 j5x0Var) {
        return ((hi8) ((r8j0) u8j0Var).e()).f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderInput(r8j0 viewState) {
        LoadableInput.render$default(((i661) getBinding()).i, false, new di8(viewState, 0), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g renderInput$lambda$10(r8j0 r8j0Var, g gVar) {
        return g.a(gVar, ((hi8) r8j0Var.e()).a(), new cyy(2), false, null, ((hi8) r8j0Var.e()).e(), null, null, false, null, null, ((hi8) r8j0Var.e()).c(), false, null, null, false, 0, false, 0, 0, null, null, null, 33549292);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof li8) {
            li8 li8Var = (li8) sideEffect;
            if (li8Var instanceof ki8) {
                SnackbarView.show$default(((i661) getBinding()).h, ((ki8) sideEffect).a(), 0L, null, 6, null);
            } else {
                if (!li8Var.equals(ji8.a)) {
                    w511.b();
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString(CARD_ID_KEY, getScreenParams().getCardId());
                hua1.f(bundle, this, SAVE_LIMIT_RESULT);
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
        return ((ni8) this.viewModelFactory).a(getScreenParams().getCardId());
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public i661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        i661 o = i661.o(inflater);
        NumberKeyboardView numberKeyboardView = o.f;
        LoadableInput loadableInput = o.i;
        utb1.d(numberKeyboardView, loadableInput.getEditText());
        final int i = 0;
        o.j.setOnTabSelectedListener(new tls(this) { // from class: bi8
            public final /* synthetic */ CardLimitFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 viewBinding$lambda$6$lambda$1;
                zy11 viewBinding$lambda$6$lambda$2;
                int i2 = i;
                CardLimitFragment cardLimitFragment = this.b;
                switch (i2) {
                    case 0:
                        viewBinding$lambda$6$lambda$1 = CardLimitFragment.getViewBinding$lambda$6$lambda$1(cardLimitFragment, (k5x0) obj);
                        return viewBinding$lambda$6$lambda$1;
                    default:
                        viewBinding$lambda$6$lambda$2 = CardLimitFragment.getViewBinding$lambda$6$lambda$2(cardLimitFragment, (Editable) obj);
                        return viewBinding$lambda$6$lambda$2;
                }
            }
        });
        loadableInput.setCanShowSoftInputOnFocus(false);
        loadableInput.getEditText().requestFocus();
        final int i2 = 1;
        loadableInput.getEditText().addTextChangedListener(new ThousandSeparatorTextWatcher(new tls(this) { // from class: bi8
            public final /* synthetic */ CardLimitFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                zy11 viewBinding$lambda$6$lambda$1;
                zy11 viewBinding$lambda$6$lambda$2;
                int i22 = i2;
                CardLimitFragment cardLimitFragment = this.b;
                switch (i22) {
                    case 0:
                        viewBinding$lambda$6$lambda$1 = CardLimitFragment.getViewBinding$lambda$6$lambda$1(cardLimitFragment, (k5x0) obj);
                        return viewBinding$lambda$6$lambda$1;
                    default:
                        viewBinding$lambda$6$lambda$2 = CardLimitFragment.getViewBinding$lambda$6$lambda$2(cardLimitFragment, (Editable) obj);
                        return viewBinding$lambda$6$lambda$2;
                }
            }
        }));
        ErrorView errorView = o.b;
        errorView.setPrimaryButtonOnClickListener(new rk6(25, this));
        errorView.setChangeVisibilityWithDelay(false);
        o.d.render(new sd8(10));
        o.g.setOnClickListener(new ci8(i, this));
        return o;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, CardSecondFactorHelper$Request.PERIOD_LIMIT.getKey(), new hh8(1, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u8j0 viewState) {
        i661 i661Var = (i661) getBinding();
        i661Var.b.render(null);
        wz51 wz51Var = i661Var.e;
        wz51Var.p().setVisibility(8);
        NumberKeyboardView numberKeyboardView = i661Var.f;
        int i = 0;
        numberKeyboardView.setSkeletonMode(false);
        if (viewState instanceof r8j0) {
            r8j0 r8j0Var = (r8j0) viewState;
            i661Var.g.render(((hi8) r8j0Var.e()).b());
            i661Var.j.render(new ei8(viewState, i));
            renderInput(r8j0Var);
            xty0.d(i661Var.c, ((hi8) r8j0Var.e()).d());
            return;
        }
        if (viewState instanceof t8j0) {
            wz51Var.p().setVisibility(0);
            numberKeyboardView.setSkeletonMode(true);
        } else if (!(viewState instanceof s8j0)) {
            w511.b();
        } else {
            i661Var.b.render(r501.a(((s8j0) viewState).d(), null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardlimit/CardLimitFragment$Arguments;", "Lcom/ybsdk/core/navigation/ScreenParams;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/ybsdk/feature/card/internal/presentation/cardlimit/CardLimitFragment$Arguments;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCardId", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Arguments implements ScreenParams {
        public static final Parcelable.Creator<Arguments> CREATOR = new Creator();
        private final String cardId;

        public Arguments(String str) {
            this.cardId = str;
        }

        public static /* synthetic */ Arguments copy$default(Arguments arguments, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = arguments.cardId;
            }
            return arguments.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCardId() {
            return this.cardId;
        }

        public final Arguments copy(String cardId) {
            return new Arguments(cardId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Arguments) && jl40.l(this.cardId, ((Arguments) other).cardId);
        }

        public final String getCardId() {
            return this.cardId;
        }

        public int hashCode() {
            return this.cardId.hashCode();
        }

        public String toString() {
            return oyr.p("Arguments(cardId=", this.cardId, Extension.C_BRAKE);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.cardId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Arguments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                return new Arguments(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i) {
                return new Arguments[i];
            }
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
