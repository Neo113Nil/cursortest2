package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.text.Editable;
import android.util.Size;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentMarketDto;
import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsInfoBlockDto;
import com.vk.channels.impl.donut.a;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Good;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.market.GoodBadge;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.polls.Poll;
import com.vk.im.channelcreation.impl.e;
import com.vk.im.channelcreation.impl.i;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.music.ui.bottomsheet.BottomNavigationGradientComposeView;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.profile.community.details.impl.contacts.a;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.profile.community.impl.ui.profile.state.MarketInfoBlockModel;
import com.vk.profile.core.scheduled_clips.b;
import com.vk.search.params.api.City;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseArguments;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragment;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.AlbumChooseFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.addpoll.AddPollView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bzd;
import xsna.ca9;
import xsna.l2s;
import xsna.o2j;
import xsna.osh;
import xsna.saf;
import xsna.sg90;
import xsna.wgb;
import xsna.xn50;
import xsna.yk8;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qu implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qu(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ed, code lost:
    
        if (r15 == false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v79, types: [xsna.dqb$a, xsna.j8i] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List<com.vk.dto.common.data.CallProducerButton>] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        ?? r9;
        MarketInfoBlockModel marketInfoBlockModel;
        ?? r7;
        Integer e;
        List<MarketMarketAlbumDto> d;
        String str2;
        String str3;
        Integer num;
        List<MarketMarketItemDto> g;
        ?? r12;
        boolean z;
        boolean z2;
        int i = 8;
        int i2 = 2;
        int i3 = 0;
        Integer num2 = null;
        switch (this.b) {
            case 0:
                su suVar = (su) this.c;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap b = suVar.b(bitmap);
                sg90 b2 = new sg90.b(b).b();
                if (!b.equals(bitmap)) {
                    b.recycle();
                }
                return suVar.a(b2);
            case 1:
                Poll poll = (Poll) obj;
                fn0 fn0Var = ((AddPollView) this.c).P;
                if (fn0Var != null) {
                    io.reactivex.rxjava3.disposables.c cVar = fn0Var.f;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    fn0Var.f = rsg0.y0(new u20("https://" + a0a.d + "/poll" + poll.c + '_' + poll.b), null, null, 3).subscribe(new az(new com.vk.movika.sdk.base.observable.c(fn0Var, 3), i2));
                }
                return s3q0.a;
            case 2:
                AlbumChooseFragment albumChooseFragment = (AlbumChooseFragment) this.c;
                final gzs gzsVar = (gzs) obj;
                qcy<Object>[] qcyVarArr = AlbumChooseFragment.P;
                final AlbumChooseFragmentInternalComponent albumChooseFragmentInternalComponent = (AlbumChooseFragmentInternalComponent) albumChooseFragment.N.getValue();
                nwy nwyVar = albumChooseFragmentInternalComponent.b;
                qcy<Object> qcyVar = AlbumChooseFragmentInternalComponent.h[0];
                final boolean i1 = ((fks0) nwyVar.c()).i1();
                final AlbumChooseArguments albumChooseArguments = albumChooseFragmentInternalComponent.a.a;
                return new cn50(up2.d(new gzs() { // from class: xsna.md1
                    @Override // xsna.gzs
                    public final Object invoke() {
                        AlbumChooseFragmentInternalComponent.a aVar = AlbumChooseFragmentInternalComponent.g;
                        AlbumChooseState albumChooseState = (AlbumChooseState) gzsVar.invoke();
                        return albumChooseState == null ? new AlbumChooseState(null, null, 0, false, false, false, i1, 63, null) : albumChooseState;
                    }
                }, new wb0() { // from class: xsna.kd1
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        AlbumChooseFragmentInternalComponent.a aVar = AlbumChooseFragmentInternalComponent.g;
                        AlbumChooseFragmentInternalComponent albumChooseFragmentInternalComponent2 = albumChooseFragmentInternalComponent;
                        nwy nwyVar2 = albumChooseFragmentInternalComponent2.d;
                        qcy<Object>[] qcyVarArr2 = AlbumChooseFragmentInternalComponent.h;
                        qcy<Object> qcyVar2 = qcyVarArr2[2];
                        cn1 cn1Var = (cn1) nwyVar2.c();
                        nwy nwyVar3 = albumChooseFragmentInternalComponent2.b;
                        qcy<Object> qcyVar3 = qcyVarArr2[0];
                        return new td1(AlbumChooseArguments.this, i1, cn1Var, (fks0) nwyVar3.c(), sj50Var);
                    }
                }, new cm20() { // from class: xsna.ld1
                    @Override // xsna.izs
                    /* renamed from: i */
                    public final rl50 invoke(sl50 sl50Var) {
                        AlbumChooseFragmentInternalComponent.a aVar = AlbumChooseFragmentInternalComponent.g;
                        return new dd1(AlbumChooseArguments.this, sl50Var);
                    }
                }));
            case 3:
                PhotoAlbum photoAlbum = (PhotoAlbum) this.c;
                PhotoAlbum photoAlbum2 = (PhotoAlbum) obj;
                photoAlbum2.g = photoAlbum.g;
                photoAlbum2.h = photoAlbum.h;
                photoAlbum2.f = photoAlbum.f;
                photoAlbum2.i = photoAlbum.i;
                photoAlbum2.j = photoAlbum.j;
                photoAlbum2.p = photoAlbum.p;
                photoAlbum2.n = photoAlbum.n;
                return photoAlbum2;
            case 4:
                AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = (AppearanceSettingsWithBackgroundsFragment) this.c;
                int i4 = AppearanceSettingsWithBackgroundsFragment.b0;
                zdw zdwVar = i7o0.b;
                ((b2s) (zdwVar != null ? zdwVar : null).p.a).a(appearanceSettingsWithBackgroundsFragment.requireContext(), l2s.a.a);
                return s3q0.a;
            case 5:
                iq5 iq5Var = (iq5) this.c;
                Bitmap bitmap2 = (Bitmap) ((it80) obj).a;
                if (bitmap2 != null) {
                    if (iq5Var.l * iq5Var.m == 0) {
                        iq5Var.tn(bitmap2.getWidth(), bitmap2.getHeight());
                    }
                    VKImageView vKImageView = iq5Var.i;
                    (vKImageView == null ? null : vKImageView).setImageBitmap(bitmap2);
                }
                return s3q0.a;
            case 6:
                ((VkCounter) obj).setCounterWithAnimation(((Number) ((mtk0) this.c).getValue()).intValue());
                return s3q0.a;
            case 7:
                om6 om6Var = (om6) this.c;
                ysg0<Object> ysg0Var = ysg0.b;
                ysg0Var.a(om6Var.d());
                ysg0Var.a(new hru0());
                return s3q0.a;
            case 8:
                final mu7 mu7Var = (mu7) this.c;
                g47 g47Var = (g47) obj;
                l370.o(g47Var, new in0(mu7Var, 12), f9t.z(mu7Var), new com.vk.movika.sdk.base.observable.m(mu7Var, 13));
                l370.n(g47Var, f9t.w(mu7Var), new nt(i));
                g47Var.d(new xy() { // from class: xsna.xt7
                    @Override // xsna.xy
                    public final void a(lj50 lj50Var) {
                        mu7.this.b((nt7) lj50Var);
                    }
                });
                return s3q0.a;
            case 9:
                Pair[] pairArr = (Pair[]) this.c;
                oio oioVar = (oio) obj;
                int i5 = BottomNavigationGradientComposeView.m;
                oio.x1(oioVar, yk8.a.h((Pair[]) Arrays.copyOf(pairArr, 6), Float.intBitsToFloat((int) (oioVar.d() & 4294967295L)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), 0L, oioVar.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                return s3q0.a;
            case 10:
                enj.r((Context) ((tj8) this.c).a, zk70.b((Throwable) obj), 0);
                return s3q0.a;
            case 11:
                m99 m99Var = (m99) this.c;
                Set set = (Set) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, set, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, -16385, ApiInvocationException.ErrorCodes.IDS_BLOCKED), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 12:
                w5w0 d2 = ((va9) this.c).d((UserId) obj);
                return d2 == null ? va9.r : d2;
            case 13:
                ((com.vk.im.channelcreation.impl.b) this.c).n(new i.d(new e.f(R.string.im_channel_creation)));
                return s3q0.a;
            case 14:
                com.vk.channels.impl.donut.c cVar2 = (com.vk.channels.impl.donut.c) this.c;
                Editable editable = (Editable) obj;
                if (!cVar2.k) {
                    x7 x7Var = cVar2.b;
                    if (editable == null || (str = editable.toString()) == null) {
                        str = "";
                    }
                    x7Var.invoke(new a.f(str));
                }
                return s3q0.a;
            case 15:
                izs izsVar = (izs) obj;
                wgb.b P0 = ((wgb) this.c).j.P0();
                if (P0 == null) {
                    throw new IllegalStateException("state is null");
                }
                izsVar.invoke(P0);
                return s3q0.a;
            case 16:
                ChannelsDb channelsDb = ((gkb) this.c).b;
                channelsDb.b.b().execSQL("UPDATE " + channelsDb.a.a + " SET sort_id_local = NULL WHERE id = " + ((bdb) obj).b);
                return s3q0.a;
            case 17:
                ((dqb) this.c).c.i0((Throwable) obj);
                return s3q0.a;
            case 18:
                uwb uwbVar = (uwb) this.c;
                Throwable th = (Throwable) obj;
                if (uwbVar.v && uwbVar.a1()) {
                    uwb.b1(uwbVar, th, null, 2);
                }
                return s3q0.a;
            case 19:
                ((com.vk.im.ui.components.chat_profile.a) this.c).t(new zxd0.a((View) obj));
                return s3q0.a;
            case 20:
                zcc zccVar = (zcc) this.c;
                jzd0 jzd0Var = zccVar.u;
                if (jzd0Var != null) {
                    jzd0Var.f((RecommendedProfile) zccVar.m);
                }
                return s3q0.a;
            case 21:
                ((uid) this.c).c.setEnabled(((ModalActionSheetListItem) obj).a == 0);
                return s3q0.a;
            case 22:
                bzd bzdVar = (bzd) this.c;
                final long longValue = ((Long) obj).longValue();
                final lzd lzdVar = (lzd) bzdVar.m.getValue();
                final com.vk.clips.editor.state.model.a g2 = bzdVar.g();
                lzdVar.getClass();
                return new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.izd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        lzd lzdVar2 = lzd.this;
                        Pair d3 = lzd.d(lzdVar2, g2, true, null, 12);
                        ClipsEncoderParameters clipsEncoderParameters = (ClipsEncoderParameters) d3.d();
                        List list = (List) d3.g();
                        Context context = lzdVar2.a;
                        lxd lxdVar = lzdVar2.g;
                        apk apkVar = new apk(list, context, lxdVar.b().Gd());
                        bzd.e eVar = lzdVar2.c;
                        Size size = new Size(eVar.b(), eVar.a());
                        List list2 = list;
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ((uq10) it.next()).f();
                        }
                        Bitmap a = lxdVar.b().O9(clipsEncoderParameters.b, apkVar).a(longValue * 1000, size);
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            ((uq10) it2.next()).e();
                        }
                        return a;
                    }
                }).q(lzdVar.f.i.e().e(1, "clips-frame-thread"));
            case 23:
                saf safVar = (saf) this.c;
                for (spp0 spp0Var : (List) obj) {
                    saf.d.put(spp0Var.a, spp0Var);
                }
                safVar.b = null;
                saf.e = saf.a.c.a;
                return s3q0.a;
            case 24:
                com.vk.profile.community.details.impl.contacts.b bVar = (com.vk.profile.community.details.impl.contacts.b) this.c;
                City city = (City) obj;
                int i6 = com.vk.profile.community.details.impl.contacts.b.m1;
                xn50.a.c(bVar, new a.f(city != null ? new CommunityAddContactsState.a(city.c, city.b) : null));
                return s3q0.a;
            case 25:
                osh oshVar = (osh) this.c;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentMarketDto l = groupsGetContentForTabsResponseDto.l();
                if (l == null || (g = l.g()) == null) {
                    r9 = EmptyList.b;
                } else {
                    List<MarketMarketItemDto> list = g;
                    r9 = new ArrayList(c5g.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Good c = b210.c((MarketMarketItemDto) it.next());
                        Parcel obtain = Parcel.obtain();
                        try {
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                            Serializer.g gVar = new Serializer.g(obtain);
                            gVar.i0(c);
                            obtain.setDataPosition(0);
                            Serializer.StreamParcelable G = gVar.G(Good.class.getClassLoader());
                            obtain.recycle();
                            Good good = (Good) G;
                            List<CallProducerButton> list2 = good.n0;
                            if (list2 != null) {
                                r12 = new ArrayList();
                                for (Object obj2 : list2) {
                                    CallProducerButton callProducerButton = (CallProducerButton) obj2;
                                    if (callProducerButton.b == 2) {
                                        Boolean bool = callProducerButton.f;
                                        if (bool != null) {
                                            z2 = bool.booleanValue();
                                            break;
                                        } else {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                    if (callProducerButton.b == 2) {
                                        z = false;
                                        if (!z) {
                                            r12.add(obj2);
                                        }
                                    }
                                    z = true;
                                    if (!z) {
                                    }
                                }
                            } else {
                                r12 = EmptyList.b;
                            }
                            good.n0 = r12;
                            r9.add(new o9h(good, ((q530) oshVar.l.getValue()).a(e530.b(good, null)).h(), false));
                        } catch (Throwable th2) {
                            obtain.recycle();
                            throw th2;
                        }
                    }
                }
                List list3 = r9;
                GroupsTabContentMarketDto l2 = groupsGetContentForTabsResponseDto.l();
                boolean i9 = l2 != null ? l2.i9() : false;
                GroupsTabContentMarketDto l3 = groupsGetContentForTabsResponseDto.l();
                String i7 = l3 != null ? l3.i() : null;
                GroupsTabContentMarketDto l4 = groupsGetContentForTabsResponseDto.l();
                MarketIntegrationsInfoBlockDto f = l4 != null ? l4.f() : null;
                if (f != null) {
                    SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                    soccomFeatures.getClass();
                    boolean a = com.vk.toggle.b.A.a(soccomFeatures);
                    List<BaseImageDto> e2 = f.e();
                    MarketInfoBlockModel.SubType.a aVar = MarketInfoBlockModel.SubType.Companion;
                    MarketIntegrationsInfoBlockDto.SubtypeDto f2 = f.f();
                    String i8 = f2 != null ? f2.i() : null;
                    aVar.getClass();
                    MarketInfoBlockModel.SubType a2 = MarketInfoBlockModel.SubType.a.a(i8);
                    String g3 = f.g();
                    if (e2 != null) {
                        Serializer.c<GoodBadge> cVar3 = GoodBadge.CREATOR;
                        str2 = GoodBadge.a.c(e2);
                    } else {
                        str2 = null;
                    }
                    if (e2 != null) {
                        Serializer.c<GoodBadge> cVar4 = GoodBadge.CREATOR;
                        str3 = GoodBadge.a.a(e2);
                    } else {
                        str3 = null;
                    }
                    if (e2 != null) {
                        Serializer.c<GoodBadge> cVar5 = GoodBadge.CREATOR;
                        num2 = GoodBadge.a.d(e2);
                    }
                    if (e2 != null) {
                        Serializer.c<GoodBadge> cVar6 = GoodBadge.CREATOR;
                        num = GoodBadge.a.b(e2);
                    } else {
                        num = null;
                    }
                    dly dlyVar = new dly(str2, str3, num2, num);
                    if (!a) {
                        dlyVar = null;
                    }
                    marketInfoBlockModel = new MarketInfoBlockModel(a2, g3, dlyVar, f.d());
                } else {
                    marketInfoBlockModel = null;
                }
                GroupsTabContentMarketDto l5 = groupsGetContentForTabsResponseDto.l();
                if (l5 == null || (d = l5.d()) == null) {
                    r7 = 0;
                } else {
                    List<MarketMarketAlbumDto> list4 = d;
                    r7 = new ArrayList(c5g.u(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        r7.add(new lsh((MarketMarketAlbumDto) it2.next(), false));
                    }
                }
                if (r7 == 0) {
                    r7 = EmptyList.b;
                }
                List list5 = r7;
                GroupsTabContentMarketDto l6 = groupsGetContentForTabsResponseDto.l();
                if (l6 != null && (e = l6.e()) != null) {
                    i3 = e.intValue();
                }
                return new osh.a(list3, i9, i7, marketInfoBlockModel, list5, i3, 144);
            case 26:
                ((com.vk.profile.core.scheduled_clips.h) this.c).d.invoke(new b.c((ClipVideoFile) obj));
                return s3q0.a;
            case 27:
                CommunityProfileViewState.Data.d.g gVar2 = (CommunityProfileViewState.Data.d.g) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "community_top_bar_notifications_icon");
                boolean z3 = gVar2.a;
                qcy<Object>[] qcyVarArr2 = j4i.a;
                sgi0<Boolean> sgi0Var = i4i.a;
                qcy<Object> qcyVar2 = j4i.a[0];
                tgi0Var.a(sgi0Var, Boolean.valueOf(z3));
                qgi0.n(tgi0Var, 6);
                return s3q0.a;
            case 28:
                ((a2j) this.c).T(o2j.i.b);
                L.g("Error on rooms re-creation", (Throwable) obj);
                return s3q0.a;
            default:
                ((v940) obj).b((ax1) this.c);
                return s3q0.a;
        }
    }
}
