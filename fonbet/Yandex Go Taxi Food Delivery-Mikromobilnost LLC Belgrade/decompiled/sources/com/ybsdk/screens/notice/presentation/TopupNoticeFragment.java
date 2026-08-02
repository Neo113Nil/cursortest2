package com.ybsdk.screens.notice.presentation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import defpackage.ayz0;
import defpackage.bnp0;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.g961;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.p1b;
import defpackage.pxy0;
import defpackage.u8j0;
import defpackage.xa8;
import defpackage.xx60;
import defpackage.y8f;
import defpackage.ya8;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zgz0;
import defpackage.zxz0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00012\u00020\u0007:\u0001+B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\f2\u0010\u0010\u0017\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/ybsdk/screens/notice/presentation/TopupNoticeFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lg961;", "Lu8j0;", "Lrr51;", "Lcom/ybsdk/screens/notice/presentation/TopupNoticeViewState;", "Lcom/ybsdk/screens/notice/presentation/c;", "Lce4;", "Lzxz0;", "viewModelFactory", "<init>", "(Lzxz0;)V", "Lzy11;", "initBottomSheet", "()V", "createViewModel", "()Lcom/ybsdk/screens/notice/presentation/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lg961;", "viewState", "render", "(Lu8j0;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "", "onBackPressed", "()Z", "Lzxz0;", "Lcom/ybsdk/screens/notice/presentation/TopupNoticeContentView;", "topupNoticeContentView", "Lcom/ybsdk/screens/notice/presentation/TopupNoticeContentView;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "topupNoticeBottomSheet", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "Arguments", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TopupNoticeFragment extends BaseDivContextMvvmFragment<g961, u8j0, c> implements ce4 {
    private BottomSheetDialogView topupNoticeBottomSheet;
    private TopupNoticeContentView topupNoticeContentView;
    private final zxz0 viewModelFactory;

    public TopupNoticeFragment(zxz0 zxz0Var) {
        super(Boolean.FALSE, 48, null, null, c.class, 12, null);
        this.viewModelFactory = zxz0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBottomSheet() {
        if (this.topupNoticeBottomSheet == null) {
            BottomSheetDialogView.State state = new BottomSheetDialogView.State((d) new e(null, null, new zgz0(10, this), 3), (YbButtonViewGroup.b) null, (h) null, false, BottomSheetDialogView.State.Background.TRANSPARENT, (l) null, (p1b) null, false, (com.ybsdk.widgets.common.bottomsheet.c) null, false, (z1x0) null, (z1x0) null, false, false, 65518);
            BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
            bottomSheetDialogView.onDismiss(new pxy0(12, this));
            bottomSheetDialogView.render(state);
            bottomSheetDialogView.show(requireActivity(), ((g961) getBinding()).o());
            this.topupNoticeBottomSheet = bottomSheetDialogView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r6v1, types: [uc5] */
    public static final View initBottomSheet$lambda$1(TopupNoticeFragment topupNoticeFragment) {
        TopupNoticeContentView topupNoticeContentView = new TopupNoticeContentView(topupNoticeFragment.requireContext(), null, 0, 6, null);
        topupNoticeFragment.topupNoticeContentView = topupNoticeContentView;
        topupNoticeContentView.onDivAction(new TopupNoticeFragment$initBottomSheet$bottomSheetState$1$1$1(topupNoticeFragment.getViewModel()));
        topupNoticeContentView.onErrorViewPrimaryButtonClick(new TopupNoticeFragment$initBottomSheet$bottomSheetState$1$1$2(topupNoticeFragment.getViewModel()));
        return topupNoticeContentView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 initBottomSheet$lambda$3$lambda$2(TopupNoticeFragment topupNoticeFragment, boolean z) {
        ((c) topupNoticeFragment.getViewModel()).c0();
        return zy11.a;
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public c getFactoryOfViewModel() {
        return ((ayz0) this.viewModelFactory).a(((Arguments) dcs.a(this)).getTopupValueEntity(), ((Arguments) dcs.a(this)).getPaymentMethodId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((c) getViewModel()).c0();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [bnp0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ?? r0 = this;
        while (true) {
            if (r0 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof bnp0)) {
                    activity = null;
                }
                r0 = (bnp0) activity;
                if (r0 == 0) {
                    r0 = 0;
                }
            } else if (r0 instanceof bnp0) {
                break;
            } else {
                r0 = r0.getParentFragment();
            }
        }
        bnp0 bnp0Var = (bnp0) r0;
        if (bnp0Var != null) {
            bnp0Var.setGripVisible(true);
            bnp0Var.setBottomSheetBackgroundVisible(true);
        }
        setSdkBackground(xa8.a);
        this.topupNoticeBottomSheet = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v5, types: [bnp0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ?? r2 = this;
        while (true) {
            if (r2 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof bnp0)) {
                    activity = null;
                }
                r2 = (bnp0) activity;
                if (r2 == 0) {
                    r2 = 0;
                }
            } else if (r2 instanceof bnp0) {
                break;
            } else {
                r2 = r2.getParentFragment();
            }
        }
        bnp0 bnp0Var = (bnp0) r2;
        if (bnp0Var != null) {
            bnp0Var.setGripVisible(false);
            bnp0Var.setBottomSheetBackgroundVisible(false);
        }
        setSdkBackground(ya8.a);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u8j0 viewState) {
        initBottomSheet();
        TopupNoticeContentView topupNoticeContentView = this.topupNoticeContentView;
        if (topupNoticeContentView == null) {
            topupNoticeContentView = null;
        }
        topupNoticeContentView.render(viewState);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/screens/notice/presentation/TopupNoticeFragment$Arguments;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;", "topupValueEntity", "", "paymentMethodId", "<init>", "(Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;Ljava/lang/String;)Lcom/ybsdk/screens/notice/presentation/TopupNoticeFragment$Arguments;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;", "getTopupValueEntity", "Ljava/lang/String;", "getPaymentMethodId", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Arguments implements ScreenParams {
        public static final Parcelable.Creator<Arguments> CREATOR = new Creator();
        private final String paymentMethodId;
        private final TopupValueEntity topupValueEntity;

        public Arguments(TopupValueEntity topupValueEntity, String str) {
            this.topupValueEntity = topupValueEntity;
            this.paymentMethodId = str;
        }

        public static /* synthetic */ Arguments copy$default(Arguments arguments, TopupValueEntity topupValueEntity, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                topupValueEntity = arguments.topupValueEntity;
            }
            if ((i & 2) != 0) {
                str = arguments.paymentMethodId;
            }
            return arguments.copy(topupValueEntity, str);
        }

        /* renamed from: component1, reason: from getter */
        public final TopupValueEntity getTopupValueEntity() {
            return this.topupValueEntity;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public final Arguments copy(TopupValueEntity topupValueEntity, String paymentMethodId) {
            return new Arguments(topupValueEntity, paymentMethodId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) other;
            return jl40.l(this.topupValueEntity, arguments.topupValueEntity) && jl40.l(this.paymentMethodId, arguments.paymentMethodId);
        }

        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public final TopupValueEntity getTopupValueEntity() {
            return this.topupValueEntity;
        }

        public int hashCode() {
            int hashCode = this.topupValueEntity.hashCode() * 31;
            String str = this.paymentMethodId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Arguments(topupValueEntity=" + this.topupValueEntity + ", paymentMethodId=" + this.paymentMethodId + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.topupValueEntity.writeToParcel(dest, flags);
            dest.writeString(this.paymentMethodId);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Arguments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                return new Arguments(TopupValueEntity.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i) {
                return new Arguments[i];
            }
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public g961 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return g961.p(inflater, container);
    }
}
