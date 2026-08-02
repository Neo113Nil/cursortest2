package com.ybsdk.core.compose;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.r;
import com.ybsdk.core.presentation.BaseThemeFragment;
import defpackage.egd;
import defpackage.fid;
import defpackage.n751;
import defpackage.oz40;
import defpackage.xdr;
import defpackage.zjf;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\bR\u001f\u0010\u001d\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/ybsdk/core/compose/ComposeFragment;", "Lcom/ybsdk/core/presentation/BaseThemeFragment;", "Lzjf;", "Lxdr;", "<init>", "()V", "", "fitsSystemWindow", "()Z", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lzy11;", "Content", "(Lfid;I)V", "isNewInsetsHandlingEnabled", "Z", "Loz40;", "Lkotlin/jvm/internal/EnhancedNullability;", "windowInsetsState", "Loz40;", "Lcom/ybsdk/core/design/theme/ThemeType;", "themeType", "core-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ComposeFragment extends BaseThemeFragment implements zjf, xdr {
    public static final int $stable = 8;
    private final boolean isNewInsetsHandlingEnabled = true;
    private final oz40 windowInsetsState = f.j(n751.b);

    public abstract void Content(fid fidVar, int i);

    @Override // defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // defpackage.zjf
    /* renamed from: isNewInsetsHandlingEnabled, reason: from getter */
    public boolean getIsNewInsetsHandlingEnabled() {
        return this.isNewInsetsHandlingEnabled;
    }

    @Override // defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        this.windowInsetsState.setValue(insets);
        return insets;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(r.c);
        composeView.setContent(new a(-471240637, new egd(this), true));
        return composeView;
    }
}
