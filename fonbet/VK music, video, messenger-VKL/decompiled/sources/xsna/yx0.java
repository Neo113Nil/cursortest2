package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelSliderView$AuthorsChannelState;
import com.vk.catalog2.common.dto.api.CatalogCatalog;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.holders.artist.ArtistInfoVhOld;
import com.vk.catalog2.feature.music.myaudio.MusicCollectionType;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.attachments.api.publish.cta.ClipsInvolvementAttachesState;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.bonus.StickersBonusHistoryRecords;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.log.L;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.cl7;
import xsna.cwb0;
import xsna.dw20;
import xsna.gm50;
import xsna.ij20;
import xsna.l1c;
import xsna.m7a0;
import xsna.npc;
import xsna.p29;
import xsna.qdd;
import xsna.tj50;
import xsna.tzp0;
import xsna.ym40;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class yx0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yx0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x040f, code lost:
    
        if (((xsna.m7a0.a) r3).a == r1.o) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x045b, code lost:
    
        if (((xsna.m7a0.e) r3).a == r1.o) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x046f, code lost:
    
        if (((xsna.m7a0.g) r3).a.d == r1.o) goto L149;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        bm9 presenter;
        int i = 10;
        boolean z = true;
        z = true;
        z = true;
        switch (this.b) {
            case 0:
                return com.vk.clips.sdk.shared.item.ads.c.o((com.vk.clips.sdk.shared.item.ads.c) this.c, (xw0) obj);
            case 1:
                gg1 gg1Var = (gg1) this.c;
                m7a0 m7a0Var = (m7a0) obj;
                if (!(m7a0Var instanceof m7a0.a)) {
                    if (m7a0Var instanceof m7a0.b) {
                        List<Photo> list = ((m7a0.b) m7a0Var).a;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((Photo) it.next()).d));
                        }
                        z = arrayList.contains(Integer.valueOf(gg1Var.o));
                    } else {
                        if (!(m7a0Var instanceof m7a0.d)) {
                            if (m7a0Var instanceof m7a0.e) {
                                break;
                            } else if (!(m7a0Var instanceof m7a0.f)) {
                                if (m7a0Var instanceof m7a0.g) {
                                    break;
                                } else if (!(m7a0Var instanceof m7a0.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                break;
            case 2:
                so3 so3Var = ((fp3) this.c).g;
                wia0 wia0Var = (wia0) obj;
                if (wia0Var.c) {
                    so3Var.clear();
                }
                so3Var.n0(wia0Var.a);
                return s3q0.a;
            case 3:
                ((ArtistInfoVhOld) this.c).m = null;
                return s3q0.a;
            case 4:
                ((pzw) obj).c = new zu3((ce4) this.c, z ? 1 : 0);
                return s3q0.a;
            case 5:
                zh4 zh4Var = (zh4) this.c;
                int i2 = zh4.k1;
                gm50.a.a(zh4Var, ((ti4) obj).a, new ay0(zh4Var, 5));
                return s3q0.a;
            case 6:
                ym40.a aVar = (ym40.a) this.c;
                ym40 ym40Var = ym40.this;
                ym40Var.h = null;
                String th = ((Throwable) obj).toString();
                ym40Var.o = th;
                L.G("vk", th);
                if (aVar.b == 0) {
                    ArrayList arrayList2 = ym40Var.p;
                    if (arrayList2 != null) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((ym40.b) it2.next()).yb(ym40Var);
                        }
                    }
                } else {
                    ArrayList arrayList3 = ym40Var.p;
                    if (arrayList3 != null) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            ((ym40.b) it3.next()).getClass();
                        }
                    }
                }
                return s3q0.a;
            case 7:
                ((pv4) this.c).b.b();
                return s3q0.a;
            case 8:
                return AuthorsChannelSliderView$AuthorsChannelState.a((AuthorsChannelSliderView$AuthorsChannelState) obj, ((sxm0) ((y4a) this.c)).c);
            case 9:
                Context context = (Context) this.c;
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                if (th2 instanceof VKApiExecutionException) {
                    rte0.z(context, (VKApiExecutionException) th2);
                } else {
                    cvk.u(R.string.error, false);
                }
                return s3q0.a;
            case 10:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) this.c;
                StickersBonusHistoryRecords stickersBonusHistoryRecords = (StickersBonusHistoryRecords) obj;
                int i3 = BonusCatalogFragment.f0;
                final cl7 cl7Var = new cl7();
                final Context requireContext = bonusCatalogFragment.requireContext();
                cl7.a aVar2 = cl7Var.c;
                aVar2.J0(stickersBonusHistoryRecords.b);
                RecyclerPaginatedView recyclerPaginatedView = new RecyclerPaginatedView(requireContext);
                AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView);
                dVar.f = 1;
                dVar.a();
                recyclerPaginatedView.getRecyclerView().setScrollBarStyle(33554432);
                recyclerPaginatedView.setSwipeRefreshEnabled(false);
                recyclerPaginatedView.setAdapter(aVar2);
                c.h hVar = new c.h(cl7Var);
                hVar.i = 20;
                hVar.l = false;
                hVar.m = false;
                hVar.k = stickersBonusHistoryRecords.c;
                com.vk.lists.f.a(hVar, recyclerPaginatedView);
                cl7Var.b = ((dw20.b) new dw20.b(requireContext, new tzp0.c.a(cl7Var, true)).w0(requireContext.getString(R.string.stickers_bonus_history_title)).l(dhr0.t.c(R.attr.vk_ui_background_content)).D0(recyclerPaginatedView, false).G0()).c(new a470()).Z(new DialogInterface.OnDismissListener() { // from class: xsna.bl7
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object obj2 = requireContext;
                        boolean z2 = obj2 instanceof ey50;
                        cl7 cl7Var2 = cl7.this;
                        if (z2) {
                            ((ey50) obj2).Y().H(cl7Var2);
                        }
                        cl7Var2.d.dispose();
                    }
                }).I0("bonus_history");
                if (requireContext instanceof ey50) {
                    ((ey50) requireContext).Y().S(cl7Var);
                }
                return s3q0.a;
            case 11:
                o48 o48Var = (o48) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) o48Var.b).setValue(bool);
                return s3q0.a;
            case 12:
                pg8 pg8Var = (pg8) this.c;
                bzb0.d(pg8Var.k, new cwb0.a1(R.string.voip_broadcast_stream_finish_submit_dialog_title, null, R.string.voip_broadcast_finish_submit_description, null, R.string.voip_broadcast_finish_submit_yes, null, R.string.voip_broadcast_finish_submit_no, null, null, null, 938), new ka0(pg8Var, i), null, null, 28);
                return s3q0.a;
            case 13:
                return new p29.b(((tj50.a) obj).a(new g29(1, (h29) this.c, h29.class, "composeData", "composeData(Lcom/vk/voip/ui/debug/menu/presentation/feature/CallDebugMenuFeatureState;)Lcom/vk/voip/ui/debug/menu/presentation/ui/CallDebugMenuViewState$ContentData;", 0), ao8.d));
            case 14:
                CameraUIView cameraUIView = (CameraUIView) this.c;
                float f = CameraUIView.w1;
                bm9 presenter2 = cameraUIView.getPresenter();
                if (presenter2 != null && presenter2.U3() && (presenter = cameraUIView.getPresenter()) != null) {
                    presenter.B3();
                }
                return s3q0.a;
            case 15:
                return new l9i0((ViewGroup) obj, new zx0((r3a) this.c, 14));
            case 16:
                nq40 nq40Var = ((laa) this.c).q;
                nq40Var.getClass();
                return nq40.a(nq40Var, MusicCollectionType.ALBUMS, ((laa) nq40Var.e.c).j, null, (List) obj, 20);
            case 17:
                UiTrackingScreen uiTrackingScreen = (UiTrackingScreen) this.c;
                View view = (View) obj;
                if (view instanceof m0q0) {
                    ((m0q0) view).y(uiTrackingScreen);
                }
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((UIBlock) obj).e == ((mon0) ((n3a) this.c)).a);
            case 19:
                ((com.vk.channels.impl.comments.b) this.c).u((Throwable) obj);
                return s3q0.a;
            case 20:
                ((ij20.a) obj).l(((x0b) this.c).c);
                return s3q0.a;
            case 21:
                ((w9b) this.c).s(new zxd0.a((View) obj));
                return s3q0.a;
            case 22:
                ((io.reactivex.rxjava3.subjects.d) this.c).onNext((Boolean) obj);
                return s3q0.a;
            case 23:
                asb asbVar = (asb) this.c;
                int i4 = asb.k1;
                g2v.c().getClass();
                Context requireContext2 = asbVar.requireContext();
                String str = (String) asbVar.j1.getValue();
                if (!drm0.N(str)) {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", str);
                    Intent createChooser = Intent.createChooser(intent, requireContext2.getString(R.string.share));
                    createChooser.addFlags(268435456);
                    requireContext2.startActivity(createChooser);
                }
                return s3q0.a;
            case 24:
                a1c a1cVar = (a1c) this.c;
                int i5 = a1c.k1;
                gm50.a.a(a1cVar, ((l1c.a) obj).a, new d7(a1cVar, 23));
                return s3q0.a;
            case 25:
                gpc gpcVar = (gpc) this.c;
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject == null) {
                    return null;
                }
                Serializer.c<ClipInvolvementActionButton.VkTicket.VkTicketParams> cVar = ClipInvolvementActionButton.VkTicket.VkTicketParams.CREATOR;
                String optString = jSONObject.optString("id");
                String optString2 = jSONObject.optString("title");
                String optString3 = jSONObject.optString("image");
                JSONObject optJSONObject = jSONObject.optJSONObject("seance");
                ClipInvolvementActionButton.VkTicket.VkTicketParams vkTicketParams = new ClipInvolvementActionButton.VkTicket.VkTicketParams(optString, optString2, optString3, optJSONObject != null ? new ClipInvolvementActionButton.VkTicket.WallActionButtonVkTicketSeanceDto(optJSONObject.optString("id"), optJSONObject.optString("city_alias"), optJSONObject.optString("city"), optJSONObject.optString("date")) : null);
                ClipsInvolvementAttachesState.VkTicketActionState vkTicketActionState = ((ppc) gpcVar.b.getCurrentState()).j;
                String str2 = vkTicketActionState != null ? vkTicketActionState.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                gpcVar.e(new npc.c(new ClipInvolvementActionButton.VkTicket(str2, false, vkTicketParams)));
                r3y.c("tickets_posting_select");
                return jSONObject;
            case 26:
                final sdd sddVar = (sdd) this.c;
                final hda hdaVar = (hda) obj;
                final Object obj2 = hdaVar.a;
                return (!(obj2 instanceof CatalogSection) ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.rdd
                    @Override // io.reactivex.rxjava3.functions.a
                    public final void run() {
                        hda hdaVar2;
                        bpn0 bpn0Var = sdd.this.D;
                        ((qdd) bpn0Var.getValue()).getClass();
                        qdd.c P0 = qdd.g.P0();
                        if (P0 instanceof qdd.c.b) {
                            hdaVar2 = ((qdd.c.b) P0).a;
                        } else if (P0 instanceof qdd.c.C3559c) {
                            hdaVar2 = ((qdd.c.C3559c) P0).a;
                        } else {
                            if (!(P0 instanceof qdd.c.a) && !(P0 instanceof qdd.c.d) && P0 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            hdaVar2 = null;
                        }
                        Object obj3 = hdaVar2 != null ? hdaVar2.a : null;
                        if (obj3 instanceof CatalogCatalog) {
                            qdd qddVar = (qdd) bpn0Var.getValue();
                            Object obj4 = obj2;
                            CatalogCatalog zb = CatalogCatalog.zb((CatalogCatalog) obj3, Collections.singletonList(obj4), ((CatalogSection) obj4).b, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                            CatalogExtendedData catalogExtendedData = hdaVar2.b;
                            hda hdaVar3 = hdaVar;
                            catalogExtendedData.zb(hdaVar3.b);
                            s3q0 s3q0Var = s3q0.a;
                            qddVar.b(new hda(zb, catalogExtendedData, hdaVar3.c));
                        }
                    }
                })).t(hdaVar);
            case 27:
                atd atdVar = (atd) this.c;
                atdVar.getClass();
                ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                i50 i50Var = new i50(atdVar, 12);
                clipsDraftPersistentStore.getClass();
                ClipsDraftPersistentStore.o(i50Var);
                return s3q0.a;
            case 28:
                return ((com.vk.clips.editor.state.model.a) obj).i(((com.vk.clips.editor.state.model.c) ((List) this.c).get(0)).j);
            default:
                ClipsFavoriteFolderContentListFragment.b bVar = (ClipsFavoriteFolderContentListFragment.b) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i6 = ClipsFavoriteFolderContentListFragment.W;
                bVar.b().setRefreshing(booleanValue);
                return s3q0.a;
        }
    }

    public /* synthetic */ yx0(sba sbaVar, UiTrackingScreen uiTrackingScreen) {
        this.b = 17;
        this.c = uiTrackingScreen;
    }
}
