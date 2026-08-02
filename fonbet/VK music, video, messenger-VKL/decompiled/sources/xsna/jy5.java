package xsna;

import android.app.Activity;
import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorPatch;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.dto.ads.AdBlockItem;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.PurchaseDetails;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.qrcode.d;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import ru.ok.proto.PublisherConfiguration;
import xsna.e8v0;
import xsna.k8q0;
import xsna.mms;
import xsna.uns;
import xsna.wgb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class jy5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jy5(Activity activity, cme0 cme0Var, fme0 fme0Var, d.b bVar) {
        this.b = 8;
        this.c = activity;
        this.d = fme0Var;
        this.e = bVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                VkCounter vkCounter = new VkCounter((Context) obj, null);
                vkCounter.setCounterWithoutAnimation(PublisherConfiguration.DEFAULT_MAX_DELAY_MS);
                vkCounter.setMode((VkCounter.Mode) obj4);
                vkCounter.setSize((VkCounter.Size) obj3);
                vkCounter.setAppearance((VkCounter.CounterAppearance.Appearance) obj2);
                break;
            case 1:
                wgb wgbVar = (wgb) obj3;
                wgb.b bVar = (wgb.b) obj;
                ProfilesInfo profilesInfo = bVar.b;
                profilesInfo.Hb((ProfilesInfo) obj4);
                wgbVar.e(wgb.b.a(bVar, null, profilesInfo, null, 0, false, false, false, PsExtractor.PRIVATE_STREAM_1));
                wgbVar.b.a(new v43(5, wgbVar, (f1e0) obj2));
                break;
            case 2:
                String str = (String) obj4;
                bnd bndVar = (bnd) obj3;
                ClipsCoauthorsSelectorMviState clipsCoauthorsSelectorMviState = (ClipsCoauthorsSelectorMviState) obj2;
                Result result = (Result) obj;
                if (result.d() instanceof Result.Failure) {
                    if (result.d() instanceof Result.Failure) {
                        Throwable a = Result.a(result.d());
                        ClipsCoauthorsException clipsCoauthorsException = a instanceof ClipsCoauthorsException ? (ClipsCoauthorsException) a : null;
                        if (clipsCoauthorsException != null) {
                            bndVar.T(new ClipsCoauthorsSelectorPatch.b(clipsCoauthorsException));
                        }
                    }
                } else if (str.length() > 0) {
                    smd smdVar = smd.c;
                    Object d = result.d();
                    smd smdVar2 = smd.c;
                    if (d instanceof Result.Failure) {
                        d = smdVar2;
                    }
                    smd smdVar3 = (smd) d;
                    List<ClipsCoauthorSelectorUserItem> list = smdVar3.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : list) {
                        if (!((ClipsCoauthorSelectorUserItem) obj5).b.equals(clipsCoauthorsSelectorMviState.C())) {
                            arrayList.add(obj5);
                        }
                    }
                    bndVar.T(new ClipsCoauthorsSelectorPatch.e(arrayList, smdVar3.b));
                } else {
                    smd smdVar4 = smd.c;
                    Object d2 = result.d();
                    smd smdVar5 = smd.c;
                    if (d2 instanceof Result.Failure) {
                        d2 = smdVar5;
                    }
                    List<ClipsCoauthorSelectorUserItem> list2 = ((smd) d2).a;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : list2) {
                        if (!((ClipsCoauthorSelectorUserItem) obj6).b.equals(clipsCoauthorsSelectorMviState.C())) {
                            arrayList2.add(obj6);
                        }
                    }
                    bndVar.T(new ClipsCoauthorsSelectorPatch.g(arrayList2));
                }
                break;
            case 3:
                final EntriesListPresenter entriesListPresenter = (EntriesListPresenter) obj4;
                final k8q0 k8q0Var = (k8q0) obj3;
                final Photo photo = (Photo) obj2;
                final ArrayList arrayList3 = (ArrayList) obj;
                entriesListPresenter.b.Xm(new gzs() { // from class: xsna.erp
                    @Override // xsna.gzs
                    public final Object invoke() {
                        ArrayList<Post> arrayList4 = arrayList3;
                        k8q0 k8q0Var2 = k8q0Var;
                        Photo photo2 = photo;
                        EntriesListPresenter entriesListPresenter2 = entriesListPresenter;
                        if (arrayList4 != null) {
                            int size = arrayList4.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                Post post = (Post) arrayList4.get(i3);
                                if (epx.f(k8q0Var2, k8q0.a.a)) {
                                    post.wc(photo2);
                                }
                                entriesListPresenter2.H(post, null);
                            }
                        } else {
                            for (Post post2 : arrayList4) {
                                if (epx.f(k8q0Var2, k8q0.a.a)) {
                                    post2.wc(photo2);
                                }
                                entriesListPresenter2.H(post2, null);
                            }
                        }
                        return s3q0.a;
                    }
                });
                break;
            case 4:
                xms xmsVar = (xms) obj4;
                UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj3;
                mms.d dVar = (mms.d) obj2;
                f4z f4zVar = xmsVar.j;
                StringBuilder sb = new StringBuilder();
                sb.append(usersUserFullDto != null ? usersUserFullDto.D0() : null);
                sb.append(' ');
                sb.append(usersUserFullDto != null ? usersUserFullDto.x1() : null);
                f4zVar.b(new uns.c.b(sb.toString(), (usersUserFullDto != null ? usersUserFullDto.L2() : null) == BaseSexDto.FEMALE, dVar.c));
                xmsVar.T(new lns(dVar.b));
                break;
            case 5:
                StickerStockItem stickerStockItem = (StickerStockItem) obj4;
                t1z t1zVar = (t1z) obj3;
                PurchaseDetails purchaseDetails = (PurchaseDetails) obj2;
                if (stickerStockItem.G) {
                    g2v.d().v().c(t1zVar.b, purchaseDetails, new gzv(t1zVar, 3));
                } else {
                    dwg dwgVar = t1zVar.n;
                    if (dwgVar != null) {
                        dwgVar.invoke(stickerStockItem);
                    }
                }
                break;
            case 6:
                AdBlockItem adBlockItem = (AdBlockItem) obj;
                break;
            case 7:
                dn80 dn80Var = (dn80) obj4;
                String str2 = (String) obj3;
                MusicTrack musicTrack = (MusicTrack) obj2;
                if (((Boolean) obj).booleanValue()) {
                    va40.a(dn80Var.l, null, dn80Var.d.e(qni0.a(), str2, musicTrack.Fb()).c(dn80Var.g.b(dn80Var.g())).g(new zm80(dn80Var, i2)).q(asu0.a.c()).subscribe());
                }
                break;
            case 8:
                Activity activity = (Activity) obj4;
                fme0 fme0Var = (fme0) obj3;
                d.b bVar2 = (d.b) obj2;
                ApiApplication apiApplication = (ApiApplication) obj;
                if (apiApplication != null) {
                    com.vk.qrcode.d.k(com.vk.qrcode.d.b, activity, bVar2, null, apiApplication.d.Fb(com.vk.qrcode.d.c, false).d.d, null, null, null, apiApplication.c, null, activity.getString(R.string.qr_checkback_scanned), 0, null, new Pair(activity.getString(R.string.qr_action_open_vk_app, apiApplication.c), new xah(fme0Var.c, activity, apiApplication, 6)), null, null, null, null, null, 2059240);
                }
                break;
            default:
                q7v0 q7v0Var = (q7v0) obj4;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) obj3;
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a aVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.vh.a) obj2;
                if (((Boolean) obj).booleanValue()) {
                    q7v0Var.a(vkOnboardingCampaign, VkOnboardingType.Tooltip, e8v0.j.b);
                } else {
                    pk30 pk30Var = aVar.J;
                    Msg msg = aVar.p.R;
                    if (pk30Var != null && msg != null) {
                        pk30Var.U(msg, new sz30(true));
                    }
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ jy5(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
