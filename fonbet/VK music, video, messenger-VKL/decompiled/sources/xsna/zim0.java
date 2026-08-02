package xsna;

import android.os.Handler;
import android.os.Looper;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.clickable.ClickableSituationalTemplate;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stories.design.view.sticker.TemplateButton;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: StoryTemplateButtonController.kt */
/* loaded from: classes6.dex */
public final class zim0 {
    public final fnm0 a;
    public final StoryBottomViewGroup b;
    public final StoryEntry c;
    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint d;
    public final u8m0 e;
    public final nzl0 f;
    public io.reactivex.rxjava3.disposables.c g = EmptyDisposable.INSTANCE;
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final bpn0 j = new bpn0(new rka0(this, 21));
    public final Object k = msy.a(LazyThreadSafetyMode.NONE, new iia0(this, 25));
    public final TemplateButton l;
    public etv0 m;
    public final w4u0 n;

    public zim0(fnm0 fnm0Var, StoryBottomViewGroup storyBottomViewGroup, StoryEntry storyEntry, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, u8m0 u8m0Var, nzl0 nzl0Var) {
        ClickableSituationalTemplate clickableSituationalTemplate;
        List<ClickableSticker> list;
        this.a = fnm0Var;
        this.b = storyBottomViewGroup;
        this.c = storyEntry;
        this.d = mobileOfficialAppsConStoriesStat$ViewEntryPoint;
        this.e = u8m0Var;
        this.f = nzl0Var;
        this.l = (TemplateButton) storyBottomViewGroup.findViewById(R.id.template_button_new);
        w4u0 w4u0Var = new w4u0(storyBottomViewGroup, new lbc0(this, 21), new myd0(this, 16), 6);
        this.n = w4u0Var;
        ClickableStickers clickableStickers = storyEntry.X;
        if (clickableStickers == null || (list = clickableStickers.d) == null) {
            clickableSituationalTemplate = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ClickableSituationalTemplate) {
                    arrayList.add(obj);
                }
            }
            clickableSituationalTemplate = (ClickableSituationalTemplate) j5g.a0(arrayList);
        }
        boolean z = false;
        if (clickableSituationalTemplate == null || storyEntry.b) {
            bwt0.p0(this.l, false);
            w4u0Var.i = false;
            return;
        }
        w4u0Var.a();
        boolean f = qr.f(storyEntry.d);
        com.vk.movika.sdk.base.ui.l lVar = new com.vk.movika.sdk.base.ui.l(1, this, clickableSituationalTemplate);
        if (!f && fnm0Var.g().a().booleanValue()) {
            z = true;
        }
        a(z, lVar);
        if (f) {
            return;
        }
        this.h.b(fnm0Var.g().a0(asu0.a.d()).subscribe(new n240(new zsl0(2, this, lVar), 20)));
    }

    public final void a(boolean z, com.vk.movika.sdk.base.ui.l lVar) {
        TemplateButton templateButton = this.l;
        bwt0.p0(templateButton, true);
        templateButton.setOnClickListener(new vr6(lVar, 7));
        w4u0 w4u0Var = this.n;
        if (!z) {
            templateButton.setAlpha(1.0f);
            templateButton.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            w4u0Var.i = false;
        } else {
            templateButton.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            templateButton.setY(iah0.p(this.b.getContext()));
            w4u0Var.i = true;
            w4u0Var.b();
        }
    }
}
