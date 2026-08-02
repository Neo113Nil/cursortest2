package xsna;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.Preference;
import com.vk.api.base.VkPaginationList;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.AuthorsCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.video.AuthorsCatalogFragment;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.ui.refresh.BottomSwipePaginatedView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.story.api.media.StoryMediaData;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;
import com.vk.voip.miniapps.impl.picture_in_picture.overlay.MiniAppCallPiPOverlayService;
import com.vk.voip.ui.groupcalls.grid.a;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import ru.ok.pattern.keypoints.KeypointPatternMatcher;
import ru.ok.tensorflow.util.Function;
import xsna.h7u0;
import xsna.ir5;
import xsna.mwa;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class lp0 implements io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.l, pcs, SwipeDrawableRefreshLayout.g, Preference.c, a.InterfaceC2053a, Function {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lp0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        hlb0 lambda$findHomography$0;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (NewsEntry) ((com.vk.movika.sdk.base.hooks.p) obj2).invoke(obj);
            case 2:
                return (Result) ((ak) obj2).invoke(obj);
            case 3:
            case 6:
            case 8:
            case 16:
            case 22:
            default:
                int i2 = MiniAppCallPiPOverlayService.e;
                return (Boolean) ((n1d) obj2).invoke(obj);
            case 4:
                return (ir5.b) ((jp5) obj2).invoke(obj);
            case 5:
                return (VkPaginationList) ((xx6) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((com.vk.movika.sdk.base.hooks.p) obj2).invoke(obj);
            case 9:
                return (StoryMediaData) ((jp5) obj2).invoke(obj);
            case 10:
                return (Pair) ((d05) obj2).invoke(obj);
            case 11:
                return (hda) ((com.vk.movika.sdk.base.hooks.p) obj2).invoke(obj);
            case 12:
                return (mwa.a) ((com.vk.movika.sdk.base.hooks.p) obj2).invoke(obj);
            case 13:
                return (a7c) ((td5) obj2).invoke(obj);
            case 14:
                return (dhd) ((ak) obj2).invoke(obj);
            case 15:
                return (List) ((dj1) obj2).invoke(obj);
            case 17:
                return (List) ((acm) obj2).invoke(obj);
            case 18:
                return (io.reactivex.rxjava3.core.b0) ((n1d) obj2).invoke(obj);
            case 19:
                return (b0l0) ((ak) obj2).invoke(obj);
            case 20:
                return (Boolean) ((n1d) obj2).invoke(obj);
            case 21:
                return (WebIdentityPhone) ((n1d) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.b0) ((n1d) obj2).invoke(obj);
            case 24:
                lambda$findHomography$0 = KeypointPatternMatcher.lambda$findHomography$0((List) obj2, (yrk) obj);
                return lambda$findHomography$0;
            case 25:
                return (Boolean) ((qm0) obj2).invoke(obj);
            case 26:
                return (List) ((uuz) obj2).invoke(obj);
            case 27:
                return (Boolean) ((uuz) obj2).invoke(obj);
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        final DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        wjy.a.getClass();
        final uek b = wjy.b();
        final ky6 j = com.vk.core.preference.Preference.j();
        h7u0.a aVar = new h7u0.a(debugDevSettingsFragment.mo2getContext());
        aVar.h0("Сбросить внтурений state HttpExecutor?");
        aVar.a.f = "Включает настройки 0-RTT и т.д.";
        aVar.d0("Сбросить", new DialogInterface.OnClickListener() { // from class: xsna.t3l
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                String[] strArr2 = DebugDevSettingsFragment.t0;
                asu0.a.getClass();
                asu0.n().submit(new b5l(DebugDevSettingsFragment.this, b, j));
            }
        });
        aVar.X("Отмена", null);
        aVar.m();
        return true;
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        BottomSwipePaginatedView bottomSwipePaginatedView = (BottomSwipePaginatedView) this.c;
        int i = BottomSwipePaginatedView.O;
        gzs<s3q0> gzsVar = bottomSwipePaginatedView.F;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        AuthorsCatalogFragment authorsCatalogFragment = (AuthorsCatalogFragment) this.c;
        int i = AuthorsCatalogFragment.Q;
        CatalogRootViewHolder catalogRootViewHolder = authorsCatalogFragment.P;
        AuthorsCatalogRootVh authorsCatalogRootVh = catalogRootViewHolder instanceof AuthorsCatalogRootVh ? (AuthorsCatalogRootVh) catalogRootViewHolder : null;
        if (authorsCatalogRootVh != null) {
            authorsCatalogRootVh.q.d();
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((Boolean) ((com.vk.movika.sdk.base.hooks.p) this.c).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((ak) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((tnd) this.c).invoke(obj)).booleanValue();
        }
    }
}
