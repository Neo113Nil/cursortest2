package xsna;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.video.VideoSave;
import com.vk.clips.favorites.api.params.ClipsFavoritesFolderRenamingParams;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.core.compose.component.banner.Banner$Notification$Appearance;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.im.engine.models.channels.ChannelsCounters;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.a;
import com.vk.log.L;
import com.vk.media.pipeline.codec.CodecDrainer;
import com.vk.profile.community.creationonboarding.api.models.CommunityData;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.a4e;
import xsna.aw6;
import xsna.dob;
import xsna.du;
import xsna.dug0;
import xsna.emc;
import xsna.n7b;
import xsna.tj50;
import xsna.tlo0;
import xsna.u6x;
import xsna.y7f.f;
import xsna.yqu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class n40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n40(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x04d0  */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Uri uri;
        String str;
        pk30 pk30Var;
        List<CallProducerButton> list;
        FragmentManager supportFragmentManager;
        int i = this.b;
        int i2 = 12;
        int i3 = 1;
        int i4 = 15;
        int i5 = 0;
        Uri uri2 = null;
        uri2 = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                x60 x60Var = (x60) obj2;
                Throwable th = (Throwable) obj;
                L.j(th, "Offline:ActionRemoteRepositoryImpl", "Error sending add like action " + ((Object) b70.c(x60Var.a)) + " to backend.");
                com.vk.metrics.eventtracking.b.a.a(th);
                return io.reactivex.rxjava3.core.x.k(((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1) ? new du.a(x60Var) : new du.c(x60Var));
            case 1:
                hp0 hp0Var = (hp0) obj2;
                VideoSave.a aVar = (VideoSave.a) obj;
                int i6 = aVar.c;
                String str2 = aVar.b;
                new jx2(new gns0(hp0Var.b, i6, str2), new gp0(hp0Var, i6, str2)).a();
                return s3q0.a;
            case 2:
                AlbumLink albumLink = (AlbumLink) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(albumLink.b), "id");
                w9yVar.e(albumLink.d, "access_key");
                w9yVar.d(Long.valueOf(albumLink.c.b), "owner_id");
                w9yVar.e(albumLink.e, "title");
                w9yVar.g("thumb", albumLink.f);
                w9yVar.e(albumLink.g, "main_color");
                return s3q0.a;
            case 3:
                com.vk.catalog2.common.ui.mvp.auto.a aVar2 = (com.vk.catalog2.common.ui.mvp.auto.a) obj2;
                bn40.d("Failed to load searched tracks");
                aVar2.c(aVar2.a, "net_error");
                return s3q0.a;
            case 4:
                AudioBookChapter audioBookChapter = (AudioBookChapter) obj2;
                w9y w9yVar2 = (w9y) obj;
                w9yVar2.e(audioBookChapter.b, "id");
                w9yVar2.e(audioBookChapter.c, "title");
                w9yVar2.g("audio_file", audioBookChapter.d);
                w9yVar2.c(Integer.valueOf(audioBookChapter.e), "progress_time");
                w9yVar2.e(audioBookChapter.f, "progress_status");
                w9yVar2.e(audioBookChapter.g, "track_code");
                w9yVar2.c(audioBookChapter.h, "special_project_id");
                w9yVar2.c(Integer.valueOf(audioBookChapter.i), "flags_context");
                w9yVar2.g("moosic_audio", audioBookChapter.k);
                return s3q0.a;
            case 5:
                ((dz4) obj2).a((CodecDrainer) obj);
                return s3q0.a;
            case 6:
                return Boolean.valueOf(!((mp5) obj2).l.get());
            case 7:
                ow5 ow5Var = (ow5) obj2;
                DialogBackground dialogBackground = (DialogBackground) obj;
                String str3 = dialogBackground.b;
                String str4 = dialogBackground.c;
                if (str4 != null) {
                    if (drm0.N(str4)) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        uri = Uri.parse(str4);
                        str = dialogBackground.d;
                        if (str != null) {
                            if (drm0.N(str)) {
                                str = null;
                            }
                            if (str != null) {
                                uri2 = Uri.parse(str);
                            }
                        }
                        return new mka0(str3, uri, uri2, epx.f(str3, ow5Var.b));
                    }
                }
                uri = null;
                str = dialogBackground.d;
                if (str != null) {
                }
                return new mka0(str3, uri, uri2, epx.f(str3, ow5Var.b));
            case 8:
                ((wh50) obj2).setValue((Banner$Notification$Appearance) obj);
                return s3q0.a;
            case 9:
                ((gw6) obj2).a.onNext(aw6.a.a);
                return s3q0.a;
            case 10:
                VkGroupHeader vkGroupHeader = new VkGroupHeader(((ViewGroup) obj).getContext(), null, 6);
                vkGroupHeader.setId(R.id.shop_header_container);
                ok7 ok7Var = new ok7(vkGroupHeader);
                View view = ok7Var.itemView;
                VkGroupHeader vkGroupHeader2 = (VkGroupHeader) view;
                f4m.y(cn70.b(10) + view.getPaddingTop(), view);
                bwt0.i0(ok7Var.itemView, new com.vk.movika.sdk.base.observable.m((BonusCatalogFragment) obj2, i2));
                vkGroupHeader2.setSize(VkGroupHeader.Size.Medium);
                vkGroupHeader2.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.stickers_bonus_catalog_buy_title), null, null, null, 0, 510));
                vkGroupHeader2.setSubtitle(new VkGroupHeader.c(new tlo0.f(R.string.stickers_bonus_catalog_buy_hint), null, null));
                return ok7Var;
            case 11:
                gdj0 gdj0Var = (gdj0) obj2;
                tdu tduVar = (tdu) obj;
                float floatValue = ((vak0) gdj0Var.d.j).getFloatValue();
                float d = gdj0Var.d.e().d();
                float f = floatValue < d ? d - floatValue : 0.0f;
                tduVar.B(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (Float.intBitsToFloat((int) (tduVar.d() & 4294967295L)) + f) / Float.intBitsToFloat((int) (tduVar.d() & 4294967295L)) : 1.0f);
                tduVar.Y0(f370.i(0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                return s3q0.a;
            case 12:
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.b bVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.msgparts.carousel.b) obj2;
                a.C1167a c1167a = bVar.w;
                if ((c1167a == null ? null : c1167a).b.e) {
                    pk30 pk30Var2 = bVar.l;
                    Msg msg = (c1167a == null ? null : c1167a).g;
                    if (pk30Var2 != null && msg != null) {
                        pk30Var2.o((c1167a != null ? c1167a : null).b.f, msg, bVar.getAdapterPosition());
                    }
                } else {
                    String str5 = (c1167a != null ? c1167a : null).b.d;
                    if (str5 != null && (pk30Var = bVar.l) != null) {
                        pk30Var.d(bVar.getAdapterPosition(), str5);
                    }
                }
                return s3q0.a;
            case 13:
                acd acdVar = ((g3a) obj2).r;
                if (acdVar != null) {
                    acdVar.invoke();
                }
                return s3q0.a;
            case 14:
                UserId userId = (UserId) obj2;
                Good good = (Good) obj;
                if (userId != null && fkq0.a(good.c).equals(fkq0.a(userId)) && (list = good.n0) != null) {
                    List<CallProducerButton> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((CallProducerButton) it.next()).b == 3) {
                                    Parcel obtain = Parcel.obtain();
                                    try {
                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                        Serializer.g gVar = new Serializer.g(obtain);
                                        gVar.i0(good);
                                        obtain.setDataPosition(0);
                                        Serializer.StreamParcelable G = gVar.G(Good.class.getClassLoader());
                                        obtain.recycle();
                                        good = (Good) G;
                                        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                                        for (CallProducerButton callProducerButton : list2) {
                                            if (callProducerButton.b == 3) {
                                                callProducerButton = CallProducerButton.a(callProducerButton, 4, null, 4094);
                                            }
                                            arrayList.add(callProducerButton);
                                        }
                                        good.n0 = arrayList;
                                    } catch (Throwable th2) {
                                        obtain.recycle();
                                        throw th2;
                                    }
                                }
                            }
                        }
                    }
                }
                return good;
            case 15:
                ((ikv0) obj).a();
                ((a8b) obj2).c.invoke(n7b.h.b);
                return s3q0.a;
            case 16:
                ((i9b) obj2).o();
                return s3q0.a;
            case 17:
                ((veb) obj2).f.onNext((ChannelsCounters) obj);
                return s3q0.a;
            case 18:
                nnb nnbVar = (nnb) obj2;
                tj50.a aVar3 = (tj50.a) obj;
                fj1 fj1Var = new fj1(5);
                ao8 ao8Var = ao8.d;
                return new dob.g(aVar3.a(new s9(nnbVar, i4), ao8Var), aVar3.a(new p1(nnbVar, 21), ao8Var), aVar3.a(new t9(nnbVar, 19), ao8Var), aVar3.a(new md(i2), ao8Var), aVar3.a(new v9(nnbVar, 18), ao8Var), aVar3.a(fj1Var, ao8Var));
            case 19:
                return new emc.c((emc) obj2, (ViewGroup) obj);
            case 20:
                u6x.a aVar4 = (u6x.a) obj2;
                dug0.c cVar = (dug0.c) obj;
                if (cVar.d()) {
                    aVar4.a((int) (cVar.b * 100), 100);
                }
                return s3q0.a;
            case 21:
                return o1d.z((o1d) obj2, (String) obj);
            case 22:
                ClipsFavoriteFoldersListFragment clipsFavoriteFoldersListFragment = (ClipsFavoriteFoldersListFragment) obj2;
                ?? r0 = clipsFavoriteFoldersListFragment.R;
                ?? r2 = clipsFavoriteFoldersListFragment.Q;
                a4e a4eVar = (a4e) obj;
                int i7 = ClipsFavoriteFoldersListFragment.U;
                if (a4eVar instanceof a4e.a) {
                    FragmentActivity kn = clipsFavoriteFoldersListFragment.kn();
                    FragmentActivity fragmentActivity = kn != null ? kn : null;
                    if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                        ((ClipsFavoritesComponentImpl) r2.getValue()).e().b(new ClipsFavoritesFolderRenamingParams.CreateFolder(((Boolean) r0.getValue()).booleanValue(), ((a4e.a) a4eVar).a, false, 4, null), clipsFavoriteFoldersListFragment.requireContext(), supportFragmentManager);
                    }
                } else {
                    if (!(a4eVar instanceof a4e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a4e.b bVar2 = (a4e.b) a4eVar;
                    ((ClipsFavoritesComponentImpl) r2.getValue()).b8().b(bVar2.a, bVar2.b, bVar2.c, ((Boolean) r0.getValue()).booleanValue()).l(clipsFavoriteFoldersListFragment);
                }
                return s3q0.a;
            case 23:
                lyd.a.e("ClipsFilesClearer", "unable to delete files: " + ((LinkedHashSet) obj2), (Throwable) obj);
                return s3q0.a;
            case 24:
                ((yg) obj2).invoke();
                return s3q0.a;
            case 25:
                y7f y7fVar = (y7f) obj2;
                bpn0 bpn0Var = y7fVar.l;
                z7f z7fVar = (z7f) obj;
                k6f k6fVar = y7fVar.a;
                StringBuilder sb = new StringBuilder("init music info = ");
                sb.append(z7fVar.c);
                sb.append(" items = ");
                List<n7f> list3 = z7fVar.d;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((n7f) it2.next()).b);
                }
                sb.append(arrayList2);
                L.e("ClipsTemplateEditorPresenter", sb.toString());
                y7fVar.C(z7fVar);
                dc50 dc50Var = z7fVar.c;
                ((qyd) bpn0Var.getValue()).c(false);
                qyd qydVar = (qyd) bpn0Var.getValue();
                ClipsEditorMusicTrack b = hxd.b(dc50Var.a);
                int i8 = dc50Var.b;
                int i9 = dc50Var.c;
                int i10 = dc50Var.d;
                qydVar.j.removeCallbacksAndMessages(null);
                qydVar.b = b;
                qydVar.c = i8;
                qydVar.d = i9;
                qydVar.e = i10;
                ((q850) qydVar.a.b).G(hxd.c(b), i8, i9);
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(fz5.x((n7f) it3.next(), z7fVar.f));
                }
                k6fVar.Mm(arrayList3);
                k6fVar.Ai(y7fVar.new f());
                k6fVar.H5();
                return s3q0.a;
            case 26:
                hjf hjfVar = (hjf) obj2;
                g47 g47Var = (g47) obj;
                String str6 = ClipsUploadFragmentImpl.a0;
                g47Var.b(tci.l(hjfVar));
                g47Var.a(tci.k(hjfVar));
                g47Var.d(new wff(hjfVar, i5));
                return s3q0.a;
            case 27:
                com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b bVar3 = (com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.b) obj2;
                awg0 awg0Var = (awg0) obj;
                List<CommunityData> list4 = ((CommunityCreationOnboardingFinishState) bVar3.b.getCurrentState()).e;
                ArrayList arrayList4 = new ArrayList(c5g.u(list4, 10));
                Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new io.reactivex.rxjava3.internal.operators.completable.v(rsg0.Z(yfb.x(yqu.a.e(bVar3.c, fkq0.a(((CommunityData) it4.next()).d), null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE))), io.reactivex.rxjava3.internal.functions.a.g));
                }
                return awg0Var.h(io.reactivex.rxjava3.core.a.m(arrayList4), new defpackage.i0(bVar3, i4), new sd6(bVar3, i3));
            case 28:
                lhh lhhVar = (lhh) obj2;
                Parcelable parcelable = ((paq0) obj).b;
                DocumentAttachment documentAttachment = parcelable instanceof DocumentAttachment ? (DocumentAttachment) parcelable : null;
                return Boolean.valueOf(epx.f(documentAttachment != null ? documentAttachment.o : null, lhhVar.a));
            default:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) obj2;
                NestedScrollView nestedScrollView = communityRepliesFragment.R;
                if (nestedScrollView != null) {
                    nestedScrollView.setVisibility(8);
                }
                RepliesView repliesView = communityRepliesFragment.S;
                if (repliesView != null) {
                    repliesView.d();
                }
                RepliesView repliesView2 = communityRepliesFragment.S;
                if (repliesView2 != null) {
                    repliesView2.b();
                }
                RepliesView repliesView3 = communityRepliesFragment.S;
                if (repliesView3 != null) {
                    repliesView3.setVisibility(8);
                }
                VkSpinner vkSpinner = communityRepliesFragment.T;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(0);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ n40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ n40(x60 x60Var, r40 r40Var) {
        this.b = 0;
        this.c = x60Var;
    }
}
