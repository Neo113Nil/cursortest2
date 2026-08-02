package com.yandex.go.fragment.router;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.ihf;
import defpackage.jcs;
import defpackage.qep0;
import defpackage.rep0;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.ui.FragmentBackground;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0018B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/yandex/go/fragment/router/ScreenStackRootFragment;", "Lru/yandex/taxi/fragment/YandexTaxiFragment;", "Lzy11;", "Ljcs;", "Lihf;", "<init>", "()V", "Lru/yandex/taxi/ui/FragmentBackground;", "getBackground", "()Lru/yandex/taxi/ui/FragmentBackground;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/yandex/go/navigation/screen/api/Screen;", "getTrackedScreen", "()Lcom/yandex/go/navigation/screen/api/Screen;", "trackedScreen", "Companion", "qep0", "fragment"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScreenStackRootFragment extends YandexTaxiFragment<zy11, jcs> implements ihf {
    private static final String ARG_BACKGROUND = "arg_background";
    private static final String ARG_SCREEN = "arg_screen";
    public static final qep0 Companion = new qep0();

    @Override // ru.yandex.taxi.fragment.YandexTaxiFragment
    public FragmentBackground getBackground() {
        int i = rep0.a[((BaseRootNavigationRouter.Background) BaseRootNavigationRouter.Background.a().get(requireArguments().getInt(ARG_BACKGROUND))).ordinal()];
        if (i == 1) {
            return FragmentBackground.MAP;
        }
        if (i == 2) {
            return FragmentBackground.BLANK;
        }
        if (i == 3) {
            return FragmentBackground.NONE;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.ihf
    /* renamed from: getTrackedScreen */
    public Screen getScreen() {
        return (Screen) Screen.a().get(requireArguments().getInt(ARG_SCREEN));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }
}
