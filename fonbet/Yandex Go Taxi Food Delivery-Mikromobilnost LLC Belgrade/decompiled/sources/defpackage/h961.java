package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.screens.notice.presentation.TopupNoticeContentView;

/* loaded from: classes2.dex */
public final class h961 implements zo31 {
    public final TopupNoticeContentView a;
    public final YbDivView b;
    public final rm c;
    public final FrameLayout d;
    public final DivSkeletonsView e;
    public final FrameLayout f;

    public h961(TopupNoticeContentView topupNoticeContentView, YbDivView ybDivView, rm rmVar, FrameLayout frameLayout, DivSkeletonsView divSkeletonsView, FrameLayout frameLayout2) {
        this.a = topupNoticeContentView;
        this.b = ybDivView;
        this.c = rmVar;
        this.d = frameLayout;
        this.e = divSkeletonsView;
        this.f = frameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
