package com.ybsdk.core.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.ybsdk.core.design.theme.ThemeType;
import defpackage.bvf0;
import defpackage.eja1;
import defpackage.gwy0;
import defpackage.i3y;
import defpackage.jqr;
import defpackage.l95;
import defpackage.n4u0;
import defpackage.xx60;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u0003R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/core/presentation/BaseThemeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "(Landroid/os/Bundle;)Landroid/view/LayoutInflater;", "Lzy11;", "onDestroyView", "Ln4u0;", "Lcom/ybsdk/core/design/theme/ThemeType;", "themeType$delegate", "Li3y;", "getThemeType", "()Ln4u0;", "themeType", "appCompatContext", "Landroid/content/Context;", "core-presentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class BaseThemeFragment extends Fragment {
    private Context appCompatContext;

    /* renamed from: themeType$delegate, reason: from kotlin metadata */
    private final i3y themeType = a.b(LazyThreadSafetyMode.NONE, new l95(6, this));

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
    public static final n4u0 themeType_delegate$lambda$1(BaseThemeFragment baseThemeFragment) {
        ThemeType themeType;
        n4u0 themeType2;
        ?? r0 = baseThemeFragment;
        while (true) {
            if (r0 == 0) {
                xx60 activity = baseThemeFragment.getActivity();
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
            e.H(eja1.s(baseThemeFragment), new jqr(themeType2, new BaseThemeFragment$themeType$2$1$1(baseThemeFragment, null), 3));
            return themeType2;
        }
        ThemeType.Companion.getClass();
        themeType = ThemeType.DEFAULT_THEME_TYPE;
        return bvf0.c(themeType);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        Context context = this.appCompatContext;
        if (context != null) {
            return context;
        }
        Context context2 = super.getContext();
        if (context2 == null) {
            return null;
        }
        AppCompatContextThemeWrapper appCompatContextThemeWrapper = new AppCompatContextThemeWrapper(context2, ((ThemeType) getThemeType().getValue()).getStyleRes());
        this.appCompatContext = appCompatContextThemeWrapper;
        return appCompatContextThemeWrapper;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.appCompatContext = null;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        return LayoutInflater.from(getContext());
    }
}
