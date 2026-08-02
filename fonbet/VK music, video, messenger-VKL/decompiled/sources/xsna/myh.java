package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.common.ui.holders.group.GroupInviteVh;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dialogsscreen.impl.DialogsScreenFragment;
import com.vk.donut.design.view.reaction.DonutReactionButtonView;
import com.vk.dto.common.Peer;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.goodpreview.presentation.GoodPreviewFragment;
import com.vk.geo.impl.presentation.GeoFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import com.vk.im.reporters.api.di.ImReportersComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.rules.api.DependencyAnyRule;
import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.profile.community.address.api.di.CommunityAddressComponent;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.fragment.DiscoverSearchTabs;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.superapp.dating.js.bridge.api.di.JsDatingDelegateComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.dw20;
import xsna.e3m;
import xsna.mqw;
import xsna.xxu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class myh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ myh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x03ad, code lost:
    
        if (r3.a.equals(r5 != null ? r5.a : null) == false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ef  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.vk.photo.editor.ivm.d] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3, types: [xsna.e4p] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        EditorMessage.Source source;
        zhk zhkVar;
        com.vk.photo.editor.ivm.d dVar;
        uik uikVar;
        jfk jfkVar;
        ?? r6;
        kif0 kif0Var;
        plm plmVar;
        String c;
        int i = this.b;
        int i2 = 2;
        boolean z = false;
        z = false;
        z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                dw20 dw20Var = ((ryh) obj).g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 1:
                int i3 = com.vk.profile.community.impl.ui.trust_mark.a.p1;
                return ((CommunityAddressComponent) m7m.d((com.vk.profile.community.impl.ui.trust_mark.a) obj).a(fpf0.a(CommunityAddressComponent.class))).a();
            case 2:
                j7k j7kVar = (j7k) obj;
                RecyclerView recyclerView = j7kVar.f;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.setVisibility(4);
                View view = j7kVar.g;
                d3m.c(view == null ? null : view, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 3:
                gik gikVar = (gik) obj;
                oik oikVar = gikVar.d;
                v3p v3pVar = gikVar.c;
                cc0 H = gikVar.H(false);
                oikVar.getClass();
                if (H != null) {
                    cfk cfkVar = H.b;
                    cc0 cc0Var = oikVar.c;
                    if (cfkVar.equals(cc0Var != null ? cc0Var.b : null)) {
                        CropAspectRatioFormat cropAspectRatioFormat = H.c;
                        cc0 cc0Var2 = oikVar.c;
                        if (cropAspectRatioFormat == (cc0Var2 != null ? cc0Var2.c : null)) {
                            break;
                        }
                    }
                    source = null;
                    zhkVar = H;
                    dVar = oikVar.b;
                    ?? r1 = dVar;
                    if (dVar == null) {
                        r1 = source;
                    }
                    r1.a(new EditorMessage.i(zhkVar, source, 6));
                    v3pVar.c(true);
                    uikVar = gikVar.n;
                    if (uikVar != null && (jfkVar = uikVar.o) != null) {
                        CropStatEvent.Format a = fhk.a(uikVar.k);
                        i4p i4pVar = ((EditorState) v3pVar.d().b.b.getValue()).a;
                        r6 = i4pVar == null ? i4pVar.b : source;
                        tnt tntVar = jfkVar.j;
                        if (r6 == 0) {
                            float[] fArr = zek.a;
                            int width = r6.getWidth();
                            int height = r6.getHeight();
                            zek.b(jfkVar.c, tntVar);
                            zek.a(width, height);
                            Matrix matrix = zek.g;
                            matrix.reset();
                            float[] fArr2 = zek.d;
                            matrix.setPolyToPoly(fArr2, 0, zek.e, 0, 4);
                            new Matrix(matrix);
                            kif0Var = edi.D(edi.C(fArr2));
                        } else {
                            kif0Var = kif0.c;
                        }
                        gikVar.j.b(new CropStatEvent.j((int) (tntVar.i + tntVar.h), a, (int) kif0Var.a, (int) kif0Var.b));
                    }
                    return s3q0.a;
                }
                source = null;
                zhkVar = new pfp(null);
                dVar = oikVar.b;
                ?? r12 = dVar;
                if (dVar == null) {
                }
                r12.a(new EditorMessage.i(zhkVar, source, 6));
                v3pVar.c(true);
                uikVar = gikVar.n;
                if (uikVar != null) {
                    CropStatEvent.Format a2 = fhk.a(uikVar.k);
                    i4p i4pVar2 = ((EditorState) v3pVar.d().b.b.getValue()).a;
                    if (i4pVar2 == null) {
                    }
                    tnt tntVar2 = jfkVar.j;
                    if (r6 == 0) {
                    }
                    gikVar.j.b(new CropStatEvent.j((int) (tntVar2.i + tntVar2.h), a2, (int) kif0Var.a, (int) kif0Var.b));
                }
                return s3q0.a;
            case 4:
                String str = ((DependencyAnyRule) obj).d;
                if (str != null) {
                    return new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_negative), new PostingUserMessageText.StringText(str), null, 4, null);
                }
                return null;
            case 5:
                Iterator<plm> it = ((aam) obj).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        plm next = it.next();
                        if (next.c().isEmpty()) {
                            plmVar = next;
                        }
                    } else {
                        plmVar = null;
                    }
                }
                return plmVar;
            case 6:
                return (EduCommonComponent) ((k7m) m7m.f((shm) obj)).mo408a(fpf0.a(EduCommonComponent.class));
            case 7:
                int i4 = DialogsScreenFragment.p0;
                return ((ImReportersComponent) m7m.d((DialogsScreenFragment) obj).a(fpf0.a(ImReportersComponent.class))).K();
            case 8:
                return ((DiscoverMediaTabFragment2) obj).p0;
            case 9:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) obj;
                int i5 = DiscoverSearchFragment.s0;
                FragmentManager fragmentManager = discoverSearchFragment.In().a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(DiscoverSearchTabs.SearchTabName.SearchAll, (DiscoverSearchTabs.a) discoverSearchFragment.m0.getValue());
                DiscoverSearchTabs.SearchTabName searchTabName = DiscoverSearchTabs.SearchTabName.SearchPeople;
                Object obj2 = DiscoverSearchTabs.a;
                int i6 = 11;
                gbh gbhVar = new gbh(fragmentManager, i6);
                ?? r122 = discoverSearchFragment.c0;
                int i7 = 8;
                linkedHashMap.put(searchTabName, new DiscoverSearchTabs.a(R.string.discover_search_people, new i21(i7), new t6n((xsh0) r122.getValue(), gbhVar, discoverSearchFragment.W, z ? 1 : 0), R.string.search_people, searchTabName.i()));
                DiscoverSearchTabs.SearchTabName searchTabName2 = DiscoverSearchTabs.SearchTabName.SearchGroups;
                gbh gbhVar2 = new gbh(fragmentManager, i6);
                xsh0 xsh0Var = (xsh0) r122.getValue();
                VkGroupsSearchParams vkGroupsSearchParams = discoverSearchFragment.X;
                Bundle arguments = discoverSearchFragment.getArguments();
                linkedHashMap.put(searchTabName2, new DiscoverSearchTabs.a(R.string.discover_search_communities, new u6n(arguments != null ? arguments.getString("KEY_AD_CAMPAIGN_SOURCE") : null, z ? 1 : 0), new nn7(xsh0Var, gbhVar2, vkGroupsSearchParams, i2), R.string.search_communities, searchTabName2.i()));
                DiscoverSearchTabs.SearchTabName searchTabName3 = DiscoverSearchTabs.SearchTabName.SearchChannels;
                linkedHashMap.put(searchTabName3, new DiscoverSearchTabs.a(R.string.discover_search_channels, new ig(i7), null, R.string.search_channels, searchTabName3.i()));
                DiscoverSearchTabs.SearchTabName searchTabName4 = DiscoverSearchTabs.SearchTabName.SearchGoods;
                int i8 = 13;
                linkedHashMap.put(searchTabName4, new DiscoverSearchTabs.a(R.string.discover_search_market, new f20(i8), new wa5(new u0d(discoverSearchFragment, 1), 4), R.string.search_goods, searchTabName4.i()));
                DiscoverSearchTabs.SearchTabName searchTabName5 = DiscoverSearchTabs.SearchTabName.SearchGames;
                int i9 = 10;
                linkedHashMap.put(searchTabName5, new DiscoverSearchTabs.a(R.string.discover_search_games, new lg(i9), null, R.string.search_games, searchTabName5.i()));
                DiscoverSearchTabs.SearchTabName searchTabName6 = DiscoverSearchTabs.SearchTabName.SearchMusic;
                linkedHashMap.put(searchTabName6, new DiscoverSearchTabs.a(R.string.discover_search_music, new e20(i9), null, R.string.search_music, searchTabName6.i()));
                DiscoverSearchTabs.SearchTabName searchTabName7 = DiscoverSearchTabs.SearchTabName.SearchMiniApps;
                linkedHashMap.put(searchTabName7, new DiscoverSearchTabs.a(R.string.discover_search_apps, new nm0(i8), null, R.string.search_apps, searchTabName7.i()));
                DiscoverSearchTabs.SearchTabName searchTabName8 = DiscoverSearchTabs.SearchTabName.SearchNews;
                final gbh gbhVar3 = new gbh(fragmentManager, i6);
                final xsh0 xsh0Var2 = (xsh0) r122.getValue();
                final VkFeedSearchParams vkFeedSearchParams = discoverSearchFragment.Z;
                final bxh0 bxh0Var = discoverSearchFragment.a0;
                linkedHashMap.put(searchTabName8, new DiscoverSearchTabs.a(R.string.discover_search_news, new zq3(i8), new wzs() { // from class: xsna.s6n
                    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        Activity activity = (Activity) obj4;
                        if (((Boolean) DiscoverSearchTabs.a.getValue()).booleanValue()) {
                            Context baseContext = activity.getBaseContext();
                            FragmentManager fragmentManager2 = (FragmentManager) gbhVar3.c;
                            int i10 = DiscoverSearchFragment.s0;
                            xsh0.this.a(baseContext, fragmentManager2, vkFeedSearchParams);
                        } else {
                            final bxh0 bxh0Var2 = bxh0Var;
                            bxh0Var2.getClass();
                            Activity h = e3m.h(activity);
                            if (h != null) {
                                Pair pair = (Pair) bxh0Var2.c.invoke();
                                View view2 = (View) pair.d();
                                final xwh0 xwh0Var = (xwh0) pair.g();
                                xwh0Var.A0(bxh0Var2.b);
                                bxh0Var2.e = new dw20.b(h, null).D0(view2, false).v0(R.string.video_catalog_filters).i0(R.string.video_catalog_filters_show_results, new hz20() { // from class: xsna.axh0
                                    @Override // xsna.hz20
                                    public final void a(int i11) {
                                        bxh0 bxh0Var3 = bxh0Var2;
                                        xwh0.this.J0(bxh0Var3.b);
                                        VkFeedSearchParams vkFeedSearchParams2 = bxh0Var3.b;
                                        if (vkFeedSearchParams2.I()) {
                                            vkFeedSearchParams2.reset();
                                            int i12 = DiscoverSearchFragment.s0;
                                            s3q0 s3q0Var = s3q0.a;
                                        } else {
                                            int i13 = DiscoverSearchFragment.s0;
                                            s3q0 s3q0Var2 = s3q0.a;
                                        }
                                        bxh0Var3.d.invoke(vkFeedSearchParams2);
                                        dw20 dw20Var2 = bxh0Var3.e;
                                        if (dw20Var2 != null) {
                                            dw20Var2.dismiss();
                                        }
                                        bxh0Var3.e = null;
                                    }
                                }).t().c(new cpo(false, iah0.a(150), 3)).I0(null);
                            }
                        }
                        return s3q0.a;
                    }
                }, R.string.search_news, searchTabName8.i()));
                DiscoverSearchTabs.SearchTabName searchTabName9 = DiscoverSearchTabs.SearchTabName.SearchVideo;
                linkedHashMap.put(searchTabName9, new DiscoverSearchTabs.a(R.string.discover_search_videos, new dv2(12), null, R.string.search_videos, searchTabName9.i()));
                DiscoverSearchTabs.SearchTabName searchTabName10 = DiscoverSearchTabs.SearchTabName.SearchClips;
                linkedHashMap.put(searchTabName10, new DiscoverSearchTabs.a(R.string.discover_search_clips, new kk1(i7), null, R.string.search_clips, searchTabName10.i()));
                List<DiscoverSearchTabs.SearchTabName> list = DiscoverSearchTabs.c;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    DiscoverSearchTabs.a aVar = (DiscoverSearchTabs.a) linkedHashMap.get((DiscoverSearchTabs.SearchTabName) it2.next());
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                return arrayList;
            case 10:
                int i10 = DonutReactionButtonView.h;
                return (VkImageSimple) ((DonutReactionButtonView) obj).findViewById(R.id.donut_reaction_button_icon);
            case 11:
                vop vopVar = (vop) obj;
                ((tdk) vopVar.M.getValue()).a();
                cop copVar = (cop) vopVar.a;
                if (copVar != null) {
                    copVar.X2();
                }
                return s3q0.a;
            case 12:
                gzs<s3q0> gzsVar = ((txq) obj).g;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 13:
                return Integer.valueOf(((qor) obj).e);
            case 14:
                Peer peer = ((l1s) obj).s.r().a.c;
                peer.getClass();
                return String.valueOf(peer.Ab(Peer.Type.GROUP));
            case 15:
                ((zak0) ((v1z) obj).k).setValue("");
                return s3q0.a;
            case 16:
                return Boolean.valueOf(!((GalleryFragmentImpl) obj).u0);
            case 17:
                qcy<Object>[] qcyVarArr = GeoFragment.c0;
                return ((GeoFragment) obj).getFeature();
            case 18:
                ViewGroup viewGroup = (ViewGroup) obj;
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                return viewGroup;
            case 19:
                return ((y4u) obj).g.Ob();
            case 20:
                int i11 = GoodPreviewFragment.X;
                return ((MarketComponent) m7m.d((GoodPreviewFragment) obj).a(fpf0.a(MarketComponent.class))).U1();
            case 21:
                ((GroupInviteVh) obj).d();
                return s3q0.a;
            case 22:
                return new xxu.b((xxu) obj);
            case 23:
                int i12 = HomeFragment2.x0;
                return ((VkClientMultiAccountComponent) m7m.d((HomeFragment2) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 24:
                Context d = ((l4w) obj).d();
                e3m.a aVar2 = e3m.a;
                return m33.a(R.drawable.vkim_bg_video_live_label, d);
            case 25:
                owv owvVar = ((lqw) obj).h1;
                if (owvVar != null) {
                    owvVar.invoke(mqw.b.a);
                }
                return s3q0.a;
            case 26:
                xwv0 xwv0Var = (xwv0) ((a2y) obj).c.invoke();
                if (xwv0Var != null && (c = xwv0Var.c()) != null && drm0.D(c, "restore", false)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 27:
                g7y g7yVar = (g7y) obj;
                return ((JsDatingDelegateComponent) x6y.H().a(fpf0.a(JsDatingDelegateComponent.class))).y2().a(new krh(g7yVar, 27), new rjd(g7yVar, 2), g7yVar);
            case 28:
                pw pwVar = ((boz) obj).h;
                if (pwVar != null) {
                    pwVar.invoke();
                }
                return s3q0.a;
            default:
                return Integer.valueOf(((xvy) obj).h());
        }
    }
}
