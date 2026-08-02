package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import androidx.credentials.provider.CredentialEntry;
import com.vk.api.generated.account.dto.AccountSetPrivacyKeyDto;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh;
import com.vk.catalog2.feature.music.ui.holder.MusicHistoryRemoveAllVh;
import com.vk.channels.impl.list.e;
import com.vk.channels.impl.list.f;
import com.vk.channels.impl.list.g;
import com.vk.clips.edit.di.ClipEditComponent;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.common.VideoFile;
import com.vk.lists.ListDataSet;
import com.vk.movika.sdk.base.flow.binding.a;
import com.vk.movika.sdk.base.ui.l0;
import com.vk.movika.sdk.base.ui.y;
import com.vk.movika.sdk.player.base.observable.b;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileViewState;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$EditorEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$PhotoParams;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.base.js.bridge.data.OnboardingModalArguments;
import com.vk.superapp.dating.js.bridge.api.events.AllowLocationPermission$Response;
import com.vk.toggle.features.ComFeatures;
import com.vk.video.growth.api.VideoGrowthTrapArguments;
import com.vk.video.growth.impl.ui.entity.TrapState;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.subjects.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import one.video.player.BaseVideoPlayer;
import xsna.ajh;
import xsna.asu0;
import xsna.boh;
import xsna.bs;
import xsna.buz;
import xsna.deb0;
import xsna.djc;
import xsna.dnh;
import xsna.du1;
import xsna.dw20;
import xsna.ea7;
import xsna.ei90;
import xsna.enc0;
import xsna.epp0;
import xsna.epx;
import xsna.f8d;
import xsna.fbh;
import xsna.fyg;
import xsna.fyw;
import xsna.gzs;
import xsna.h0c0;
import xsna.h7u0;
import xsna.haa0;
import xsna.hb40;
import xsna.hll0;
import xsna.if6;
import xsna.izs;
import xsna.jcf0;
import xsna.jvh;
import xsna.ko50;
import xsna.laa0;
import xsna.lak;
import xsna.lnd;
import xsna.m8t0;
import xsna.mat;
import xsna.mcf0;
import xsna.mph;
import xsna.nnd;
import xsna.nph;
import xsna.o6a0;
import xsna.o9t;
import xsna.ocf0;
import xsna.paa0;
import xsna.pb60;
import xsna.q530;
import xsna.qcy;
import xsna.qjh;
import xsna.qmd;
import xsna.qwe;
import xsna.rl1;
import xsna.rs0;
import xsna.rsg0;
import xsna.s290;
import xsna.s3q0;
import xsna.s530;
import xsna.t8o;
import xsna.u2b0;
import xsna.u6x;
import xsna.u6x.a;
import xsna.uet;
import xsna.uh3;
import xsna.uph;
import xsna.ur0;
import xsna.v3y;
import xsna.ver0;
import xsna.vph;
import xsna.vt5;
import xsna.vw3;
import xsna.w6x;
import xsna.w7t;
import xsna.we6;
import xsna.wih;
import xsna.wo1;
import xsna.xv;
import xsna.xwv0;
import xsna.y6b0;
import xsna.yfb;
import xsna.yls;
import xsna.ynh;
import xsna.ys8;
import xsna.zf00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class f0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        VkUiView view;
        we6 bohVar;
        PostingUserMessage postingUserMessage;
        int i = 7;
        int i2 = 1;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.b) {
            case 0:
                l0 l0Var = (l0) this.c;
                OnboardingModalArguments onboardingModalArguments = (OnboardingModalArguments) this.d;
                xwv0 xwv0Var = l0Var.d;
                if (xwv0Var != null && (view = xwv0Var.getView()) != null) {
                    view.Va(onboardingModalArguments, new n0(l0Var));
                }
                return s3q0.a;
            case 1:
                ((b) this.c).n((a) this.d);
                return s3q0.a;
            case 2:
                l0.a aVar = (l0.a) this.c;
                y yVar = (y) this.d;
                if (aVar.f) {
                    yVar.d.g.k();
                }
                if (aVar.g) {
                    yVar.d.e.onStart();
                }
                if (aVar.h) {
                    yVar.d.h.o();
                }
                return s3q0.a;
            case 3:
                ((izs) this.c).invoke((rl1) this.d);
                return s3q0.a;
            case 4:
                return ((s290) ((AttachVideoFragment.b) this.c).A.getValue()).a(((VideoFile) this.d).w2());
            case 5:
                y6b0 y6b0Var = (y6b0) this.c;
                deb0 deb0Var = (deb0) this.d;
                vw3 vw3Var = BaseVideoPlayer.H;
                return "prepare() playlist= " + y6b0Var + " position= " + deb0Var;
            case 6:
                ((ys8) this.c).b((ys8.b) this.d);
                return s3q0.a;
            case 7:
                ((f) this.c).O(new e.i(((g.f) this.d).a));
                return s3q0.a;
            case 8:
                ver0.a(rsg0.Z(yfb.x(bs.n((bs) ((qmd) ((nnd) this.c).c.getValue()).d.getValue(), AccountSetPrivacyKeyDto.CLOSED_PROFILE, Collections.singletonList(CredentialEntry.FALSE_STRING), null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE))).o(asu0.a.d()).subscribe(new xv((uh3) this.d, 2), new lnd(new ur0(i))));
                return s3q0.a;
            case 9:
                ((qjh.b) this.c).n.invoke((GoodAlbum) this.d);
                return s3q0.a;
            case 10:
                com.vk.profile.community.impl.ui.profile.f fVar = (com.vk.profile.community.impl.ui.profile.f) this.c;
                CommunityProfileViewState.Data.b bVar = (CommunityProfileViewState.Data.b) this.d;
                mph mphVar = fVar.C;
                CommunityProfileContent communityProfileContent = bVar != null ? bVar.a : null;
                ExtendedCommunityProfile extendedCommunityProfile = bVar != null ? bVar.c : null;
                com.vk.lists.a<we6> aVar2 = mphVar.a;
                ListDataSet.ArrayListImpl<T> arrayListImpl = aVar2.d;
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListImpl.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    we6 we6Var = (we6) next;
                    if (!(we6Var instanceof wih) && !(we6Var instanceof boh)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (communityProfileContent != null) {
                    com.vk.profile.community.impl.ui.profile.b bVar2 = mphVar.c;
                    ynh ynhVar = mphVar.b;
                    if (communityProfileContent.b.isEmpty()) {
                        bohVar = communityProfileContent.h ? new boh(7) : null;
                    } else {
                        nph nphVar = new nph(mphVar);
                        uph uphVar = new uph(mphVar);
                        com.vk.profile.community.impl.ui.profile.b bVar3 = mphVar.c;
                        vph vphVar = new vph(mphVar);
                        d<jvh> dVar = mphVar.n;
                        s530 s530Var = (s530) ynhVar.d0.getValue();
                        FragmentImpl fragmentImpl = bVar2.a;
                        FragmentImpl fragmentImpl2 = bVar2.a;
                        q530 b = s530Var.b(fragmentImpl.requireContext(), fragmentImpl2, false);
                        ComFeatures comFeatures = ComFeatures.COM_MAIN_TAB;
                        comFeatures.getClass();
                        f8d f8dVar = com.vk.toggle.b.A.a(comFeatures) ? (f8d) ynhVar.B.getValue() : null;
                        qwe d6 = ((ClipEditComponent) ynhVar.l0.getValue()).d6();
                        q<ajh> qVar = mphVar.j;
                        bohVar = new wih(communityProfileContent, new fyg(communityProfileContent, bVar3, vphVar, nphVar, b, dVar, f8dVar, d6, extendedCommunityProfile, qVar, new wo1(3, mphVar, communityProfileContent)), new vt5(fragmentImpl2), nphVar, uphVar, qVar, ynhVar.d(), new fbh(mphVar, 2), new dnh(mphVar, 1), 128);
                    }
                    if (bohVar != null) {
                        if6.b bVar4 = new if6.b(Collections.singletonList(bohVar));
                        List<we6> list = bVar4.e;
                        bVar4.a(list, false);
                        if ((bohVar instanceof wih) || (bohVar instanceof boh)) {
                            bohVar.i(2);
                        }
                        arrayList2.addAll(list);
                    }
                }
                aVar2.setItems(arrayList2);
                return s3q0.a;
            case 11:
                return lak.m((lak) this.c, (io.reactivex.rxjava3.disposables.b) this.d);
            case 12:
                ((yls.b) this.c).c.invoke(((ea7.b) this.d).a.a);
                return s3q0.a;
            case 13:
                ((FriendsItemSearchListVh) this.c).b((UIBlockProfile) this.d);
                return s3q0.a;
            case 14:
                ((u2b0) this.c).n0((fyw.a) this.d);
                return s3q0.a;
            case 15:
                w6x w6xVar = (w6x) this.c;
                u6x u6xVar = (u6x) this.d;
                w6xVar.e.w(u6xVar.d, u6xVar.new a(w6xVar));
                return s3q0.a;
            case 16:
                v3y v3yVar = (v3y) this.c;
                String str = (String) this.d;
                com.vk.superapp.base.js.bridge.b.p(v3yVar.d, new JsMethod("VKWebAppAllowLocationPermission"), new AllowLocationPermission$Response(null, new AllowLocationPermission$Response.Data(true, str), str, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 17:
                MusicHistoryRemoveAllVh musicHistoryRemoveAllVh = (MusicHistoryRemoveAllVh) this.c;
                UIBlock uIBlock = (UIBlock) this.d;
                qcy<Object>[] qcyVarArr = MusicHistoryRemoveAllVh.h;
                Context context = musicHistoryRemoveAllVh.a().getContext();
                rs0 rs0Var = new rs0(10, musicHistoryRemoveAllVh, uIBlock);
                h7u0.a aVar3 = new h7u0.a(context, R.style.OfflineRemoveAlert, objArr2 == true ? 1 : 0, 4);
                aVar3.g0(R.string.music_offline_download_clear_downloads_history_title);
                aVar3.c0(R.string.clear, new t8o(rs0Var, objArr == true ? 1 : 0));
                aVar3.W(R.string.cancel, new du1(i2));
                aVar3.m();
                return s3q0.a;
            case 18:
                ((izs) this.c).invoke(new mat.e(new djc.b(((ko50) this.d).a, null, null, null)));
                return s3q0.a;
            case 19:
                ((pb60.b) this.c).b.b((buz) this.d, false);
                return s3q0.a;
            case 20:
                zf00.b bVar5 = (zf00.b) this.c;
                o6a0 o6a0Var = (o6a0) this.d;
                if (bVar5 != null) {
                    haa0 haa0Var = bVar5.a;
                    ei90 ei90Var = o6a0Var.b;
                    ReentrantLock reentrantLock = ei90Var.e;
                    reentrantLock.lock();
                    try {
                        ei90Var.b = ei90Var.b != null ? new paa0(ei90Var.c, haa0Var) : new paa0(ei90Var.c, haa0Var);
                        s3q0 s3q0Var = s3q0.a;
                        reentrantLock.unlock();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                MobileOfficialAppsCorePhotoEditorStat$PhotoParams mobileOfficialAppsCorePhotoEditorStat$PhotoParams = null;
                MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType c = o6a0Var.c();
                String a = o6a0Var.b.a();
                MobileOfficialAppsCorePhotoEditorStat$EditorEvent mobileOfficialAppsCorePhotoEditorStat$EditorEvent = MobileOfficialAppsCorePhotoEditorStat$EditorEvent.SAVE_PHOTO;
                ei90 ei90Var2 = o6a0Var.b;
                ReentrantLock reentrantLock2 = ei90Var2.e;
                reentrantLock2.lock();
                try {
                    paa0 paa0Var = ei90Var2.b;
                    if (paa0Var != null) {
                        mobileOfficialAppsCorePhotoEditorStat$PhotoParams = laa0.a(paa0Var);
                    }
                    return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(c, a, null, mobileOfficialAppsCorePhotoEditorStat$EditorEvent, null, null, null, null, null, null, null, null, null, null, null, mobileOfficialAppsCorePhotoEditorStat$PhotoParams, 32752, null);
                } finally {
                    reentrantLock2.unlock();
                }
            case 21:
                ((h0c0) this.c).b.invoke(new PostingAction.Navigation.OpenPhotoVideoViewer((PostingAttachment) this.d));
                return s3q0.a;
            case 22:
                enc0 enc0Var = (enc0) this.c;
                ActionsAvailabilityState.Availability availability = (ActionsAvailabilityState.Availability) this.d;
                hb40 hb40Var = enc0Var.U;
                PostingAction.Navigation.NextStep nextStep = PostingAction.Navigation.NextStep.b;
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    hb40Var.invoke(nextStep);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    hb40Var.invoke(new PostingAction.ShowMessage(postingUserMessage, nextStep, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                return s3q0.a;
            case 23:
                w7t w7tVar = (w7t) this.c;
                izs izsVar = (izs) this.d;
                uet uetVar = w7tVar.b;
                if (uetVar != null) {
                    izsVar.invoke(new o9t.b(uetVar));
                }
                return s3q0.a;
            case 24:
                ocf0 ocf0Var = (ocf0) this.c;
                mcf0 mcf0Var = (mcf0) this.d;
                ocf0Var.m.L(mcf0Var.b, mcf0Var.d);
                return s3q0.a;
            case 25:
                SearchHistoryItemVh searchHistoryItemVh = (SearchHistoryItemVh) this.c;
                ComposeView composeView = (ComposeView) this.d;
                UIBlockSearchHistory<?> uIBlockSearchHistory = searchHistoryItemVh.d;
                Context context2 = composeView.getContext();
                if (uIBlockSearchHistory != null && context2 != null) {
                    searchHistoryItemVh.c.z(0, uIBlockSearchHistory);
                    searchHistoryItemVh.c(uIBlockSearchHistory, context2);
                }
                return s3q0.a;
            case 26:
                hll0 hll0Var = (hll0) this.c;
                jcf0 jcf0Var = (jcf0) this.d;
                dw20 dw20Var = hll0Var.d;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                jcf0Var.invoke();
                return s3q0.a;
            case 27:
                gzs gzsVar = (gzs) this.c;
                epp0 epp0Var = (epp0) this.d;
                TrapState trapState = (TrapState) gzsVar.invoke();
                if (trapState != null) {
                    return trapState;
                }
                VideoGrowthTrapArguments d = epp0Var.d();
                return new TrapState(d.b, d.c, d.d);
            case 28:
                WeakReference weakReference = (WeakReference) this.c;
                WeakReference weakReference2 = (WeakReference) this.d;
                FragmentImpl fragmentImpl3 = (FragmentImpl) weakReference.get();
                if (fragmentImpl3 != null) {
                    com.vk.core.fragments.a aVar4 = (com.vk.core.fragments.a) weakReference2.get();
                    z = epx.f(aVar4 != null ? Boolean.valueOf(aVar4.y(fragmentImpl3)) : null, Boolean.TRUE);
                }
                return Boolean.valueOf(z);
            default:
                m8t0 m8t0Var = (m8t0) this.c;
                gzs gzsVar2 = (gzs) this.d;
                m8t0Var.a.b.invoke();
                gzsVar2.invoke();
                return s3q0.a;
        }
    }
}
