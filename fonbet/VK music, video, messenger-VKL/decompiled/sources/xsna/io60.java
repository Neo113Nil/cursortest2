package xsna;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.unity3d.ads.core.domain.om.GetOmData;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.di.PhotoEditorComponentImpl;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.search.ModernSearchView;
import com.vk.libvideo.offline.settings.api.di.VideoOfflineSettingsComponent;
import com.vk.mapper.newsfeed.di.NewsfeedMappersComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.newsfeed.posting.api.model.PostingMediaEntryPoint;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.story.api.di.StoriesComponent;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import ru.rustore.sdk.core.config.a;
import xsna.c090;
import xsna.hcg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class io60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ io60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        p880 state;
        GetOmData initialize$lambda$220$lambda$160;
        int i = this.b;
        int i2 = 4;
        int i3 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                mo60 mo60Var = (mo60) obj;
                return new fq60((AtomicReference) mo60Var.a.b, mo60Var.d, mo60Var.c.g, mo60Var.j, mo60Var.i, mo60Var.u, mo60Var.m, mo60Var.f0);
            case 1:
                NewsfeedMappersComponentImpl newsfeedMappersComponentImpl = (NewsfeedMappersComponentImpl) obj;
                ?? r0 = newsfeedMappersComponentImpl.a;
                b25 s = ((BridgeComponent) r0.getValue()).s();
                cpu O = ((BridgeComponent) r0.getValue()).O();
                nwy nwyVar = newsfeedMappersComponentImpl.g;
                qcy<Object>[] qcyVarArr = NewsfeedMappersComponentImpl.o;
                qcy<Object> qcyVar = qcyVarArr[3];
                yax0 yax0Var = (yax0) nwyVar.c();
                nwy nwyVar2 = newsfeedMappersComponentImpl.k;
                qcy<Object> qcyVar2 = qcyVarArr[7];
                u9x0 u9x0Var = (u9x0) nwyVar2.c();
                nwy nwyVar3 = newsfeedMappersComponentImpl.l;
                qcy<Object> qcyVar3 = qcyVarArr[8];
                return new zax0(s, O, yax0Var, u9x0Var, (mb6) nwyVar3.c());
            case 2:
                return (qz60) ((dv60) obj).b.getCurrentState();
            case 3:
                return ((StoriesComponent) ((j070) obj).j.getValue()).r2();
            case 4:
                int i4 = t270.j1;
                return ((VideoOfflineSettingsComponent) ((k7m) m7m.f((t270) obj)).a(fpf0.a(VideoOfflineSettingsComponent.class))).ce();
            case 5:
                int b = cn70.b(44);
                n880 n880Var = ((com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a) obj).o;
                if (n880Var != null && (state = n880Var.getState()) != null) {
                    i3 = state.b;
                }
                return Integer.valueOf(b + i3);
            case 6:
                c090.a.C2632a c2632a = (c090.a.C2632a) obj;
                c2632a.u.onClick(c2632a.t);
                return s3q0.a;
            case 7:
                return (ImageView) ((rm90) obj).itemView.findViewById(R.id.past_asr_menu);
            case 8:
                PhotoEditorComponentImpl photoEditorComponentImpl = (PhotoEditorComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = PhotoEditorComponentImpl.e;
                return new naa0(photoEditorComponentImpl.Df().z(), photoEditorComponentImpl.Df().A(), photoEditorComponentImpl.Df().B(), photoEditorComponentImpl.Df().y());
            case 9:
                PhotoVideoAttachActivity photoVideoAttachActivity = (PhotoVideoAttachActivity) obj;
                int i5 = PhotoVideoAttachActivity.g0;
                if (photoVideoAttachActivity.getIntent().getBooleanExtra("FROM_COLLAGE", false)) {
                    ArrayList b2 = photoVideoAttachActivity.v.b();
                    Bundle bundleExtra = photoVideoAttachActivity.getIntent().getBundleExtra("COLLAGE_PARAMS");
                    FragmentImpl f = photoVideoAttachActivity.n().f(R.id.fl_container);
                    if (f instanceof GalleryFragmentImpl) {
                        ((GalleryFragmentImpl) f).ij(b2, bundleExtra, new hd4(photoVideoAttachActivity, i2));
                    }
                }
                return s3q0.a;
            case 10:
                kga0 b3 = ((com.vk.photos.root.presentation.h) obj).b();
                if (b3 != null) {
                    return b3.vh();
                }
                return null;
            case 11:
                xia0 xia0Var = (xia0) obj;
                ModernSearchView modernSearchView = xia0Var.k;
                if (epx.f(modernSearchView != null ? modernSearchView.getQuery() : null, "")) {
                    int i6 = ify.a;
                    if (ify.e(ify.c)) {
                        mhy.d(xia0Var.k);
                        xia0Var.q.postDelayed(new vb(xia0Var, 14), 300L);
                    } else {
                        View view = xia0Var.j;
                        if (view != null) {
                            view.setVisibility(4);
                        }
                        d98 d98Var = xia0Var.l;
                        if (d98Var != null) {
                            d98Var.a();
                        }
                    }
                } else {
                    ModernSearchView modernSearchView2 = xia0Var.k;
                    if (modernSearchView2 != null) {
                        modernSearchView2.setQuery("");
                    }
                }
                return Boolean.TRUE;
            case 12:
                PopupStickerView popupStickerView = (PopupStickerView) obj;
                gzs<s3q0> gzsVar = popupStickerView.l;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                popupStickerView.animate().setListener(null);
                PopupStickerView.q.decrementAndGet();
                popupStickerView.setVisibility(8);
                ViewParent parent = popupStickerView.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                while (i3 < popupStickerView.getChildCount()) {
                    int i7 = i3 + 1;
                    View childAt = popupStickerView.getChildAt(i3);
                    mwb0 mwb0Var = childAt instanceof mwb0 ? (mwb0) childAt : null;
                    if (mwb0Var != null) {
                        mwb0Var.clear();
                    }
                    i3 = i7;
                }
                popupStickerView.e.clear();
                popupStickerView.j = null;
                popupStickerView.removeAllViews();
                if (viewGroup != null) {
                    viewGroup.removeView(popupStickerView);
                }
                return s3q0.a;
            case 13:
                return new t2r(false, ((y1c0) obj).b);
            case 14:
                y8c0 y8c0Var = (y8c0) obj;
                return new s2c0(new rka0(y8c0Var, i2), new iia0(y8c0Var, 6), new Cnew(y8c0Var, 29), new m130(y8c0Var, 22));
            case 15:
                String string = ((rbc0) obj).a.getString("media_entry_point");
                if (string != null) {
                    PostingMediaEntryPoint.Companion.getClass();
                    Iterator<E> it = PostingMediaEntryPoint.h().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (epx.f(((PostingMediaEntryPoint) next).name(), string)) {
                                r4 = next;
                            }
                        }
                    }
                    PostingMediaEntryPoint postingMediaEntryPoint = (PostingMediaEntryPoint) r4;
                    if (postingMediaEntryPoint == null) {
                        postingMediaEntryPoint = PostingMediaEntryPoint.Default;
                    }
                    if (postingMediaEntryPoint != null) {
                        return postingMediaEntryPoint;
                    }
                }
                return PostingMediaEntryPoint.Default;
            case 16:
                qcy<Object>[] qcyVarArr3 = PostponedPostsFragment.q0;
                h3p0.b((PostponedPostsFragment) obj);
                return s3q0.a;
            case 17:
                return ((g7s0) ((rkd0) obj).r.getValue()).Y();
            case 18:
                efe0 efe0Var = (efe0) obj;
                return new wce0(efe0Var.h.plus(efe0Var.b), efe0Var.a, new dfe0(efe0Var, null));
            case 19:
                qcy<Object>[] qcyVarArr4 = ReactionsFeedFragment.q0;
                return ((ReactionsFeedFragment) obj).ho();
            case 20:
                return (obf0) obj;
            case 21:
                return ((NewsFeedComponent) ((k7m) m7m.f((c2g0) obj)).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 22:
                return new hcg0.a((hcg0) obj);
            case 23:
                Activity activity = ((lsg0) obj).a;
                xx1.A(activity, activity.getPackageName(), new pjh0(a.C2396a.a().a.h()));
                return new mrn0(activity);
            case 24:
                dz20 dz20Var = (dz20) obj;
                if (dz20Var != null) {
                    dz20Var.Ff("GoodsMultiPicker");
                }
                return s3q0.a;
            case 25:
                initialize$lambda$220$lambda$160 = ServiceProvider.initialize$lambda$220$lambda$160((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$160;
            case 26:
                ((io.reactivex.rxjava3.core.b) obj).onComplete();
                return s3q0.a;
            case 27:
                SettingsListFragment settingsListFragment = (SettingsListFragment) obj;
                ((mh70) settingsListFragment.U0.getValue()).c(settingsListFragment.B());
                return s3q0.a;
            case 28:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_settings_layout);
            default:
                HorizontalRecyclerPaginationView a = ((znj0) obj).h().a();
                if (a != null) {
                    a.gl();
                }
                return s3q0.a;
        }
    }
}
