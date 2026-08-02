package com.ybsdk.feature.divkit.api.ui.screen;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.yandex.div.core.Div2Context;
import com.ybsdk.core.design.theme.ThemeType;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.internal.ui.DivContextThemeWrapper;
import defpackage.bvf0;
import defpackage.eja1;
import defpackage.f02;
import defpackage.gwy0;
import defpackage.h9g;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.lfx;
import defpackage.mpk;
import defpackage.n4u0;
import defpackage.nkp;
import defpackage.uc5;
import defpackage.x4c;
import defpackage.xx60;
import defpackage.y8f;
import defpackage.yqq0;
import defpackage.yr31;
import defpackage.zo31;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0012\b\u0002\u0010\u0005*\f\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006BE\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lzo31;", "VB", "VS", "Luc5;", "VM", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "", "backVisible", "", "softInputMode", "Lcom/ybsdk/core/utils/ColorModel;", "statusBarColor", "Lyqq0;", "sensitiveDataMode", "Ljava/lang/Class;", "viewModelClass", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/ybsdk/core/utils/ColorModel;Lyqq0;Ljava/lang/Class;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "(Landroid/os/Bundle;)Landroid/view/LayoutInflater;", "Lzy11;", "onDetach", "()V", "Ln4u0;", "Lcom/ybsdk/core/design/theme/ThemeType;", "themeType$delegate", "Li3y;", "getThemeType", "()Ln4u0;", "themeType", "Lcom/ybsdk/feature/divkit/internal/ui/DivContextThemeWrapper;", "divContextWrapper", "Lcom/ybsdk/feature/divkit/internal/ui/DivContextThemeWrapper;", "Lcom/yandex/div/core/Div2Context;", "getDivContext", "()Lcom/yandex/div/core/Div2Context;", "divContext", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class BaseDivContextMvvmFragment<VB extends zo31, VS, VM extends uc5> extends BaseMvvmFragment<VB, VS, VM> {
    private DivContextThemeWrapper divContextWrapper;

    /* renamed from: themeType$delegate, reason: from kotlin metadata */
    private final i3y themeType;

    public /* synthetic */ BaseDivContextMvvmFragment(Boolean bool, Integer num, ColorModel colorModel, yqq0 yqq0Var, Class cls, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : colorModel, (i & 8) != 0 ? null : yqq0Var, cls);
    }

    private final n4u0 getThemeType() {
        return (n4u0) this.themeType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [gwy0] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final n4u0 themeType_delegate$lambda$2(BaseDivContextMvvmFragment baseDivContextMvvmFragment) {
        ThemeType themeType;
        n4u0 themeType2;
        ?? r0 = baseDivContextMvvmFragment;
        while (true) {
            if (r0 == 0) {
                xx60 activity = baseDivContextMvvmFragment.getActivity();
                if (!(activity instanceof gwy0)) {
                    activity = null;
                }
                r0 = (gwy0) activity;
                if (r0 == 0) {
                    r0 = 0;
                }
            } else {
                if (r0 instanceof gwy0) {
                    break;
                }
                r0 = r0.getParentFragment();
            }
        }
        gwy0 gwy0Var = (gwy0) r0;
        if (gwy0Var != null && (themeType2 = gwy0Var.getThemeType()) != null) {
            e.H(eja1.s(baseDivContextMvvmFragment), new jqr(themeType2, new BaseDivContextMvvmFragment$themeType$2$1$1(baseDivContextMvvmFragment, null), 3));
            return themeType2;
        }
        ThemeType.Companion.getClass();
        themeType = ThemeType.DEFAULT_THEME_TYPE;
        return bvf0.c(themeType);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public Context getContext() {
        mpk divFeatureDependencies;
        DivContextThemeWrapper divContextThemeWrapper = this.divContextWrapper;
        if (divContextThemeWrapper != null) {
            return divContextThemeWrapper;
        }
        Context context = super.getContext();
        if (context == null) {
            return null;
        }
        ?? r2 = this;
        while (true) {
            if (r2 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof nkp)) {
                    activity = null;
                }
                nkp nkpVar = (nkp) activity;
                r2 = nkpVar != null ? nkpVar : null;
            } else {
                if (r2 instanceof nkp) {
                    break;
                }
                r2 = r2.getParentFragment();
            }
        }
        nkp nkpVar2 = (nkp) r2;
        DivContextThemeWrapper divContextThemeWrapper2 = new DivContextThemeWrapper(context, (ThemeType) getThemeType().getValue(), (nkpVar2 == null || (divFeatureDependencies = nkpVar2.getDivFeatureDependencies()) == null) ? false : ((h9g) divFeatureDependencies).i().u());
        this.divContextWrapper = divContextThemeWrapper2;
        return divContextThemeWrapper2;
    }

    public final Div2Context getDivContext() {
        Div2Context divContext;
        DivContextThemeWrapper divContextThemeWrapper = this.divContextWrapper;
        if (divContextThemeWrapper != null && (divContext = divContextThemeWrapper.getDivContext()) != null) {
            return divContext;
        }
        x4c.g("Invalid request to get div context", null, null, null, 14);
        return new DivContextThemeWrapper(requireContext(), (ThemeType) getThemeType().getValue(), false, 4, null).getDivContext();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        this.divContextWrapper = null;
        super.onDetach();
    }

    @Override // com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        return LayoutInflater.from(this.divContextWrapper);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    public BaseDivContextMvvmFragment(Boolean bool, Integer num, ColorModel colorModel, yqq0 yqq0Var, Class<VM> cls) {
        super(bool, num, colorModel, yqq0Var, cls);
        this.themeType = a.b(LazyThreadSafetyMode.NONE, new f02(19, this));
    }
}
