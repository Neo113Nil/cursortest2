package xsna;

import android.os.Build;
import android.os.Bundle;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.external.nps.api.di.ClipsExternalNpsComponent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.components.text.VkText;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.donut.design.view.reaction.DonutReactionButtonView;
import com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.music.bottomsheets.di.AudioBookBottomSheetComponent;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.newsfeed.domain.model.NewsfeedSimilarFeedType;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.newsfeed.presentation.model.ExcerptConfigFeatureType;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchWithParamsCatalogRootVh;
import com.vk.sharing.api.di.SharingComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.dzh;
import xsna.emg;
import xsna.vrh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class dne implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dne(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018c  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        vrh0.a aVar;
        s1q s1qVar;
        s1q s1qVar2;
        Object obj;
        NewsfeedSimilarFeedType newsfeedSimilarFeedType;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((ClipsViewerComponent) ((k7m) m7m.f((ene) obj2)).a(fpf0.a(ClipsViewerComponent.class))).Y();
            case 1:
                int i2 = ClipsWrapperFragment.Q0;
                return ((ClipsExternalNpsComponent) m7m.d((ClipsWrapperFragment) obj2).a(fpf0.a(ClipsExternalNpsComponent.class))).Id();
            case 2:
                r2g r2gVar = (r2g) obj2;
                k3g k3gVar = r2gVar.v;
                if (k3gVar == null) {
                    return s3q0.a;
                }
                if (k3gVar.getAlpha() == 1.0f) {
                    return s3q0.a;
                }
                k3gVar.animate().alpha(1.0f).setStartDelay(100L).setDuration(100L).withEndAction(new t12(r2gVar, 5)).start();
                return s3q0.a;
            case 3:
                emg emgVar = (emg) obj2;
                if (epx.f(emgVar.g.getValue(emgVar, emg.h[0]), emg.a.b.a) && (aVar = emgVar.d) != null) {
                    aVar.d();
                }
                return s3q0.a;
            case 4:
                ung ungVar = (ung) obj2;
                return new qca((Map) ungVar.K.getValue(), ((vng) ungVar.F.a.c).a);
            case 5:
                return eug.B((eug) obj2);
            case 6:
                ((d4h) obj2).i.invoke(CommunityProfileAction.n.e.a.b);
                return s3q0.a;
            case 7:
                ((srh) obj2).b();
                return s3q0.a;
            case 8:
                return ((SharingComponent) ((h7m) obj2).a(fpf0.a(SharingComponent.class))).F2();
            case 9:
                lrh lrhVar = (lrh) obj2;
                return new xsh(lrhVar.s(), (afh) lrhVar.j.getValue());
            case 10:
                ((ryh) obj2).b.c(dzh.n.b.a);
                return s3q0.a;
            case 11:
                int i3 = com.vk.profile.community.impl.ui.trust_mark.a.p1;
                return ((VerifiedSellerComponent) m7m.d((com.vk.profile.community.impl.ui.trust_mark.a) obj2).a(fpf0.a(VerifiedSellerComponent.class))).a();
            case 12:
                qij qijVar = (qij) obj2;
                qijVar.e.invoke();
                qijVar.e(lij.b, true);
                qijVar.c.addOnLayoutChangeListener(new byt0(new mij(qijVar, 0)));
                qijVar.b.addOnLayoutChangeListener(new byt0(new nij(qijVar, 0)));
                return s3q0.a;
            case 13:
                return new bzb0(((j7k) obj2).a);
            case 14:
                Iterable<plm> iterable = ((aam) obj2).a;
                ArrayList arrayList = new ArrayList();
                Iterator<plm> it = iterable.iterator();
                while (it.hasNext()) {
                    Pair<com.vk.im.engine.models.dialogs.c, Map<VKTheme, DialogThemeImpl>> d = it.next().d();
                    p9m p9mVar = d != null ? new p9m(d.d().a, d.g()) : null;
                    if (p9mVar != null) {
                        arrayList.add(p9mVar);
                    }
                }
                return arrayList;
            case 15:
                return ((DialogsScreenFragment) obj2).b0.a(OpenChatListReporter.Span.ON_CREATE_VIEW);
            case 16:
                return ((DiscoverMediaTabFragment2) obj2).d0;
            case 17:
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                Bundle requireArguments = ((DiscoverSimilarFeedFragment) obj2).requireArguments();
                String string = requireArguments.getString("title");
                String str = string == null ? "" : string;
                String string2 = requireArguments.getString("feed_id");
                String str2 = string2 == null ? "" : string2;
                Lazy a = msy.a(LazyThreadSafetyMode.NONE, new mxj(requireArguments, 4));
                String string3 = requireArguments.getString("ref");
                if (string3 == null) {
                    string3 = "unknown";
                }
                String str3 = string3;
                String string4 = requireArguments.getString("scroll_to");
                boolean z = requireArguments.getBoolean("expand", false);
                int i4 = requireArguments.getInt("posts_excerpt_config_type");
                if (i4 == ExcerptConfigFeatureType.Post.h()) {
                    s1qVar2 = new s1q(3, 2, 48);
                } else if (i4 == ExcerptConfigFeatureType.Ads.h()) {
                    s1qVar2 = new s1q(3, 0, 48);
                } else {
                    if (i4 != ExcerptConfigFeatureType.DiscoverMediaPost.h()) {
                        s1qVar = null;
                        String string5 = requireArguments.getString("track_code");
                        Long valueOf = !requireArguments.containsKey("anchor_owner_id") ? Long.valueOf(requireArguments.getLong("anchor_owner_id")) : null;
                        Integer valueOf2 = !requireArguments.containsKey("anchor_item_id") ? Integer.valueOf(requireArguments.getInt("anchor_item_id")) : null;
                        if (Build.VERSION.SDK_INT < 33) {
                            obj = requireArguments.getSerializable("feed_type", NewsfeedSimilarFeedType.class);
                        } else {
                            Object serializable = requireArguments.getSerializable("feed_type");
                            obj = (NewsfeedSimilarFeedType) (serializable instanceof NewsfeedSimilarFeedType ? serializable : null);
                        }
                        newsfeedSimilarFeedType = (NewsfeedSimilarFeedType) obj;
                        if (newsfeedSimilarFeedType == null) {
                            newsfeedSimilarFeedType = NewsfeedSimilarFeedType.NONE;
                        }
                        return new w6n(str, str2, string4, z, str3, s1qVar, string5, valueOf, valueOf2, newsfeedSimilarFeedType, a);
                    }
                    s1qVar2 = new s1q(4, 2, 24);
                }
                s1qVar = s1qVar2;
                String string52 = requireArguments.getString("track_code");
                if (!requireArguments.containsKey("anchor_owner_id")) {
                }
                if (!requireArguments.containsKey("anchor_item_id")) {
                }
                if (Build.VERSION.SDK_INT < 33) {
                }
                newsfeedSimilarFeedType = (NewsfeedSimilarFeedType) obj;
                if (newsfeedSimilarFeedType == null) {
                }
                return new w6n(str, str2, string4, z, str3, s1qVar, string52, valueOf, valueOf2, newsfeedSimilarFeedType, a);
            case 18:
                int i5 = DisplayAudioBookChaptersFragment.b0;
                return ((AudioBookBottomSheetComponent) m7m.d((DisplayAudioBookChaptersFragment) obj2).mo408a(fpf0.a(AudioBookBottomSheetComponent.class))).Ie();
            case 19:
                int i6 = DonutReactionButtonView.h;
                return (VkText) ((DonutReactionButtonView) obj2).findViewById(R.id.donut_reaction_button_text);
            case 20:
                ((com.vk.photos.ui.editalbum.domain.c) obj2).C(a.e.b);
                return s3q0.a;
            case 21:
                int i7 = EntriesListFragment.m0;
                return ((AudioModelsComponent) m7m.d((EntriesListFragment) obj2).a(fpf0.a(AudioModelsComponent.class))).r();
            case 22:
                gzs<s3q0> gzsVar = ((txq) obj2).g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 23:
                dw20 dw20Var = ((udr) obj2).a;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 24:
                l1s l1sVar = (l1s) obj2;
                a1w a1wVar = l1sVar.s;
                vyr vyrVar = l1sVar.E;
                b1s b1sVar = l1sVar.B;
                ListBuilder e = e43.e();
                if (BuildInfo.s()) {
                    e.add(new mi00(vyrVar, (gi00) l1sVar.x.getValue()));
                }
                e.add(new afb(vyrVar, l1sVar.u.create()));
                s3q0 s3q0Var = s3q0.a;
                return new p0s(a1wVar, b1sVar, e.g());
            case 25:
                return ((GalleryFragmentImpl) obj2).g0;
            case 26:
                int i8 = GamesCatalogFragment.i0;
                return ((BridgeComponent) m7m.d((GamesCatalogFragment) obj2).a(fpf0.a(BridgeComponent.class))).F();
            case 27:
                qcy<Object>[] qcyVarArr2 = GeoFragment.c0;
                return ((GeoFragment) obj2).requireView();
            case 28:
                return ((SearchParamsComponent) ((k7m) m7m.f((GlobalSearchWithParamsCatalogRootVh) obj2)).a(fpf0.a(SearchParamsComponent.class))).M9();
            default:
                return ((y4u) obj2).g.I8();
        }
    }
}
