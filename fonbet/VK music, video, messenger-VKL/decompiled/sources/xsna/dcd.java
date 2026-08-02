package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.video.seekbar.ClipSeekBarView;
import com.vk.clips.design.view.component.video.seekbar.model.SeekBarUpdateMode;
import com.vk.clips.sdk.shared.api.deps.SdkTimelineThumbs;
import com.vk.clips.sdk.shared.api.ui.ClipSeekBarController;
import com.vk.clips.viewer.impl.adapters.TimelineThumbsAdapter;
import com.vk.dto.common.TimelineThumbs;
import com.vkontakte.android.R;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.d3i0;
import xsna.l3i0;

/* compiled from: ClipSeekBarControllerImpl.kt */
/* loaded from: classes17.dex */
public final class dcd implements ClipSeekBarController {
    public static final a i;
    public static final /* synthetic */ qcy<Object>[] j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public final ClipSeekBarView a;
    public ClipSeekBarController.SeekBarVisibilityPermission b;
    public Float c;
    public Float d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final d80 f = new d80();
    public d3i0 g;
    public TimelineThumbs h;

    /* compiled from: ClipSeekBarControllerImpl.kt */
    public static final class a {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(dcd.class, "currentLoadingImageDisposable", "getCurrentLoadingImageDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        j = new qcy[]{mutablePropertyReference1Impl};
        i = new a();
        k = cn70.b(2);
        l = cn70.b(6);
        m = cn70.b(1);
        n = cn70.b(3);
    }

    public dcd(ClipSeekBarView clipSeekBarView) {
        this.a = clipSeekBarView;
        i.getClass();
        d3i0 d3i0Var = d3i0.c;
        this.g = new d3i0(new d3i0.b(m, new x7g(R.attr.vk_ui_icon_contrast), new z7g(android.R.color.transparent)), new d3i0.a(k, cn70.b(0), new x7g(R.attr.vk_ui_icon_contrast)));
        o19.l(clipSeekBarView.getContext());
        clipSeekBarView.setTranslationZ(cn70.b(8));
        clipSeekBarView.setTranslationY(cn70.b(16));
        clipSeekBarView.setSeekBarUpdateMode(SeekBarUpdateMode.MANUAL);
        clipSeekBarView.setSeekBarAppearance(this.g);
        clipSeekBarView.setPreviewControllerFactory(new ccd(clipSeekBarView.getContext(), this));
        clipSeekBarView.i.add(new ecd(this));
        clipSeekBarView.j.add(new fcd(this));
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void a(boolean z) {
        l3i0 dVar;
        if (z) {
            dVar = l3i0.b.a;
        } else {
            Float f = this.c;
            if (f == null) {
                return;
            }
            float floatValue = f.floatValue();
            Float f2 = this.d;
            if (f2 == null) {
                return;
            } else {
                dVar = new l3i0.d(floatValue, f2.floatValue());
            }
        }
        this.a.setSeekBarState(dVar);
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void b() {
        ClipSeekBarView clipSeekBarView = this.a;
        if (clipSeekBarView.getSeekingEnabled()) {
            clipSeekBarView.setSeekingEnabled(false);
            n(k, m);
        }
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void c(ClipSeekBarController.SeekBarVisibilityPermission seekBarVisibilityPermission) {
        this.b = seekBarVisibilityPermission;
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void d(ClipSeekBarController.b bVar) {
        d3i0 d3i0Var = new d3i0(d3i0.b.a(this.g.a, 0, new z7g(bVar.a), new z7g(android.R.color.transparent), 1), d3i0.a.a(this.g.b, 0, new z7g(R.color.vk_white), 3));
        this.g = d3i0Var;
        this.a.setSeekBarAppearance(d3i0Var);
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void e(float f) {
        Float f2 = this.d;
        if (f2 != null) {
            l3i0.d dVar = new l3i0.d(f, f2.floatValue());
            Float valueOf = Float.valueOf(f);
            if (!epx.e(this.c, valueOf)) {
                this.c = valueOf;
            }
            this.a.setSeekBarState(dVar);
        }
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final float f() {
        Float f = this.c;
        return f != null ? f.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void g(ClipSeekBarController.a aVar) {
        this.e.add(aVar);
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final ClipSeekBarView getView() {
        return this.a;
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void h(ClipSeekBarController.a aVar) {
        this.e.remove(aVar);
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void i() {
        ClipSeekBarView clipSeekBarView = this.a;
        if (clipSeekBarView.getSeekingEnabled()) {
            return;
        }
        clipSeekBarView.setSeekingEnabled(true);
        n(l, n);
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final ClipSeekBarController.SeekBarVisibilityPermission j() {
        ClipSeekBarController.SeekBarVisibilityPermission seekBarVisibilityPermission = this.b;
        return seekBarVisibilityPermission == null ? ClipSeekBarController.SeekBarVisibilityPermission.DISABLED_TOGGLE : seekBarVisibilityPermission;
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void k(SdkTimelineThumbs sdkTimelineThumbs) {
        TimelineThumbs timelineThumbs;
        if (sdkTimelineThumbs == null) {
            timelineThumbs = null;
        } else {
            if (!(sdkTimelineThumbs instanceof TimelineThumbsAdapter)) {
                throw new IllegalStateException("TimelineThumbsAdapter must be used as SharedTimelineThumbs");
            }
            timelineThumbs = ((TimelineThumbsAdapter) sdkTimelineThumbs).b;
        }
        this.h = timelineThumbs;
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void l(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        Float valueOf2 = valueOf != null ? Float.valueOf(valueOf.intValue()) : null;
        if (epx.e(this.d, valueOf2)) {
            return;
        }
        this.d = valueOf2;
        if (valueOf2 != null) {
            float floatValue = valueOf2.floatValue();
            Float f = this.d;
            if (f != null) {
                this.a.setSeekBarState(new l3i0.d(floatValue, f.floatValue()));
            }
        }
    }

    @Override // com.vk.clips.sdk.shared.api.ui.ClipSeekBarController
    public final void m() {
        ((hfd) this.a.findViewById(R.id.clips_fullscreen_main_overlay_seekbar_preview)).setConfig(null);
    }

    public final void n(int i2, int i3) {
        d3i0 d3i0Var = new d3i0(d3i0.b.a(this.g.a, i3, null, null, 6), d3i0.a.a(this.g.b, i2, null, 6));
        this.g = d3i0Var;
        this.a.setSeekBarAppearance(d3i0Var);
    }
}
