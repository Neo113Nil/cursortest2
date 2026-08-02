package com.ybsdk.screens.notice.presentation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import defpackage.bnp0;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.j961;
import defpackage.jl40;
import defpackage.lfx;
import defpackage.p1b;
import defpackage.pxy0;
import defpackage.u8j0;
import defpackage.vmu0;
import defpackage.wxz0;
import defpackage.xa8;
import defpackage.xx60;
import defpackage.xxz0;
import defpackage.y8f;
import defpackage.ya8;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zgz0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00012\u00020\u0007:\u0001'B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\u00182\u0010\u0010\u001d\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/ybsdk/screens/notice/presentation/TopupNoticeDeprecatedFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Lj961;", "Lu8j0;", "Lyxz0;", "Lcom/ybsdk/screens/notice/presentation/TopupNoticeDeprecatedViewState;", "Lcom/ybsdk/screens/notice/presentation/a;", "Lce4;", "Lwxz0;", "viewModelFactory", "<init>", "(Lwxz0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lj961;", "createViewModel", "()Lcom/ybsdk/screens/notice/presentation/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "()V", "viewState", "render", "(Lu8j0;)V", "", "onBackPressed", "()Z", "Lwxz0;", "Lcom/ybsdk/screens/notice/presentation/TopupNoticeContentDeprecatedView;", "contentView", "Lcom/ybsdk/screens/notice/presentation/TopupNoticeContentDeprecatedView;", "Arguments", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TopupNoticeDeprecatedFragment extends BaseMvvmFragment<j961, u8j0, a> implements ce4 {
    private TopupNoticeContentDeprecatedView contentView;
    private final wxz0 viewModelFactory;

    public TopupNoticeDeprecatedFragment(wxz0 wxz0Var) {
        super(Boolean.FALSE, 48, null, null, a.class, 12, null);
        this.viewModelFactory = wxz0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View getViewBinding$lambda$5$lambda$4$lambda$1(TopupNoticeDeprecatedFragment topupNoticeDeprecatedFragment) {
        TopupNoticeContentDeprecatedView topupNoticeContentDeprecatedView = new TopupNoticeContentDeprecatedView(topupNoticeDeprecatedFragment.requireContext(), null, 0, 6, null);
        topupNoticeDeprecatedFragment.contentView = topupNoticeContentDeprecatedView;
        topupNoticeContentDeprecatedView.onPrimaryButtonClick(new TopupNoticeDeprecatedFragment$getViewBinding$1$1$1$1$1(topupNoticeDeprecatedFragment.getViewModel()));
        return topupNoticeContentDeprecatedView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$5$lambda$4$lambda$2(TopupNoticeDeprecatedFragment topupNoticeDeprecatedFragment, boolean z) {
        topupNoticeDeprecatedFragment.getViewModel().c0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getViewBinding$lambda$5$lambda$4$lambda$3(TopupNoticeDeprecatedFragment topupNoticeDeprecatedFragment, View view) {
        topupNoticeDeprecatedFragment.getViewModel().d0();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((xxz0) this.viewModelFactory).a(((Arguments) dcs.a(this)).getTopupValueEntity(), new TopupNoticeDeprecatedFragment$createViewModel$1(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public j961 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        j961 o = j961.o(getLayoutInflater());
        BottomSheetDialogView bottomSheetDialogView = o.b;
        bottomSheetDialogView.render(new BottomSheetDialogView.State((d) new e(null, null, new zgz0(9, this), 3), (YbButtonViewGroup.b) null, (h) null, false, BottomSheetDialogView.State.Background.TRANSPARENT, (l) null, (p1b) null, false, (com.ybsdk.widgets.common.bottomsheet.c) null, false, (z1x0) null, (z1x0) null, false, false, 65518));
        bottomSheetDialogView.onDismiss(new pxy0(11, this));
        bottomSheetDialogView.onPrimaryAction(new vmu0(15, this));
        return o;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        getViewModel().c0();
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
        }
        setSdkBackground(xa8.a);
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
        }
        setSdkBackground(ya8.a);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(u8j0 viewState) {
        TopupNoticeContentDeprecatedView topupNoticeContentDeprecatedView = this.contentView;
        if (topupNoticeContentDeprecatedView == null) {
            topupNoticeContentDeprecatedView = null;
        }
        topupNoticeContentDeprecatedView.render(viewState);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000eJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/ybsdk/screens/notice/presentation/TopupNoticeDeprecatedFragment$Arguments;", "Lcom/ybsdk/core/navigation/ScreenParams;", "Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;", "topupValueEntity", "<init>", "(Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;", "copy", "(Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;)Lcom/ybsdk/screens/notice/presentation/TopupNoticeDeprecatedFragment$Arguments;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/screens/notice/domain/entities/TopupValueEntity;", "getTopupValueEntity", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Arguments implements ScreenParams {
        public static final Parcelable.Creator<Arguments> CREATOR = new Creator();
        private final TopupValueEntity topupValueEntity;

        public Arguments(TopupValueEntity topupValueEntity) {
            this.topupValueEntity = topupValueEntity;
        }

        public static /* synthetic */ Arguments copy$default(Arguments arguments, TopupValueEntity topupValueEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                topupValueEntity = arguments.topupValueEntity;
            }
            return arguments.copy(topupValueEntity);
        }

        /* renamed from: component1, reason: from getter */
        public final TopupValueEntity getTopupValueEntity() {
            return this.topupValueEntity;
        }

        public final Arguments copy(TopupValueEntity topupValueEntity) {
            return new Arguments(topupValueEntity);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Arguments) && jl40.l(this.topupValueEntity, ((Arguments) other).topupValueEntity);
        }

        public final TopupValueEntity getTopupValueEntity() {
            return this.topupValueEntity;
        }

        public int hashCode() {
            return this.topupValueEntity.hashCode();
        }

        public String toString() {
            return "Arguments(topupValueEntity=" + this.topupValueEntity + Extension.C_BRAKE;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            this.topupValueEntity.writeToParcel(dest, flags);
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Arguments> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                return new Arguments(TopupValueEntity.CREATOR.createFromParcel(parcel));
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
