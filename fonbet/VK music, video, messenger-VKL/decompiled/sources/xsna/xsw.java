package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.notifications.dto.NotificationsNotificationSettingRedesignDto;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.catalog2.feature.music.ui.holder.MusicDownloadsHistoryCatalogRootVh;
import com.vk.common.links.generator.impl.di.LinksGeneratorComponentImpl;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.dto.Push;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.geo.impl.model.BoundingBox;
import com.vk.geo.impl.model.Coordinate;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.settings.impl.presentation.base.fragment.setting.NotificationSettingFragment;
import com.vk.video.music.impl.di.MusicInVideoComponentImpl;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.voip.ui.notifications.incoming.d;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import xsna.ahe0;
import xsna.bzx;
import xsna.e0o0;
import xsna.hfr;
import xsna.i0c0;
import xsna.ofe0;
import xsna.ydl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class xsw implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xsw(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v80, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        BoundingBox a;
        Parcelable parcelable;
        Object parcelable2;
        UserId userId;
        int i = 1;
        switch (this.b) {
            case 0:
                d.a aVar = (d.a) this.c;
                L.A("IncomingCallNotifierInitializer", "accept");
                aVar.b.invoke();
                return s3q0.a;
            case 1:
                b2x b2xVar = (b2x) this.c;
                ((izs) ((zak0) b2xVar.d).getValue()).invoke(tho0.a((tho0) ((zak0) b2xVar.c).getValue(), ""));
                return s3q0.a;
            case 2:
                ((wzx) this.c).c.invoke(bzx.f.b);
                return s3q0.a;
            case 3:
                LinksGeneratorComponentImpl linksGeneratorComponentImpl = (LinksGeneratorComponentImpl) this.c;
                return new hss0(linksGeneratorComponentImpl.a.B9(), linksGeneratorComponentImpl.b.getExperiments());
            case 4:
                jo00 jo00Var = (jo00) this.c;
                StringBuilder sb = new StringBuilder("updateMarkers ");
                if (jo00Var.i) {
                    a = null;
                } else {
                    el3 el3Var = new el3(jo00Var.h);
                    Iterator<do00> it = jo00Var.b.iterator();
                    while (it.hasNext()) {
                        el3Var.add(new Coordinate(it.next().k));
                    }
                    Iterator<do00> it2 = jo00Var.d.iterator();
                    while (it2.hasNext()) {
                        el3Var.add(new Coordinate(it2.next().k));
                    }
                    Iterator<do00> it3 = jo00Var.c.iterator();
                    while (it3.hasNext()) {
                        el3Var.add(new Coordinate(it3.next().k));
                    }
                    Parcelable.Creator<BoundingBox> creator = BoundingBox.CREATOR;
                    a = BoundingBox.a.a(el3Var);
                }
                if (a != null) {
                    Parcelable.Creator<BoundingBox> creator2 = BoundingBox.CREATOR;
                    r2 = a.geoJsonString(true);
                }
                sb.append(r2);
                return sb.toString();
            case 5:
                final com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar = ((com.vk.newsfeed.posting.market_picker.presentation.base.view.e) this.c).d;
                LinkedHashMap linkedHashMap = fVar.p;
                FragmentActivity fragmentActivity = fVar.c;
                com.vk.core.view.components.spinner.c e = qv20.e(fragmentActivity, Integer.valueOf(R.string.rx_loading));
                e.setCancelable(false);
                e.create();
                e.show();
                fVar.k = e;
                final ArrayList arrayList = new ArrayList();
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                io.reactivex.rxjava3.functions.f fVar2 = new io.reactivex.rxjava3.functions.f() { // from class: xsna.aa10
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj) {
                        com.vk.newsfeed.posting.market_picker.presentation.base.view.h hVar;
                        com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar3 = com.vk.newsfeed.posting.market_picker.presentation.base.view.f.this;
                        ?? r1 = fVar3.f;
                        Pair pair = (Pair) obj;
                        Photo photo = (Photo) pair.d();
                        List list = (List) pair.g();
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            Object d = ((Result) it4.next()).d();
                            boolean z = d instanceof Result.Failure;
                            if (!z) {
                                if (z) {
                                    d = null;
                                }
                                e0o0 e0o0Var = (e0o0) d;
                                if (e0o0Var == null) {
                                    continue;
                                } else if (e0o0Var instanceof e0o0.a) {
                                    fVar3.i(photo, e0o0Var);
                                } else if (e0o0Var instanceof e0o0.b) {
                                    fVar3.i(photo, e0o0Var);
                                    List<Tag> list2 = photo.x;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj2 : list2) {
                                        if (((Tag) obj2).a != ((e0o0.b) e0o0Var).a.a.a) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(arrayList2);
                                    arrayList3.add(((e0o0.b) e0o0Var).a.a);
                                    photo.x = arrayList3;
                                } else {
                                    if (!(e0o0Var instanceof e0o0.c)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fVar3.i(photo, e0o0Var);
                                    List<Tag> list3 = photo.x;
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj3 : list3) {
                                        if (((Tag) obj3).a != ((e0o0.c) e0o0Var).a.a.a) {
                                            arrayList4.add(obj3);
                                        }
                                    }
                                    photo.x = arrayList4;
                                }
                            }
                        }
                        com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar = fVar3.t;
                        if (eVar != null && (hVar = eVar.l) != null) {
                            hVar.c(photo, fVar3.e(photo), com.vk.newsfeed.posting.market_picker.presentation.base.view.f.g(photo));
                        }
                        photo.r = true;
                        photo.l = false;
                        photo.m = false;
                        hfr.a aVar2 = new hfr.a(rli0.j(new ulp0(new i5g(fVar3.l), new j60(29)), new ire(photo, 27)));
                        while (aVar2.hasNext()) {
                            PhotoAttachment photoAttachment = (PhotoAttachment) aVar2.next();
                            Photo photo2 = photoAttachment.l;
                            photo2.r = photo.r;
                            photo2.x = photo.x;
                            ((p870) r1.getValue()).e(120, photoAttachment);
                        }
                        ((p870) r1.getValue()).e(113, photo);
                        fVar3.d(photo, true);
                        g5g.y(list, arrayList);
                        linkedHashSet.add(photo);
                    }
                };
                qwj qwjVar = new qwj(fVar, linkedHashSet, arrayList, i);
                io.reactivex.rxjava3.core.q m = hg1.m(new io.reactivex.rxjava3.internal.operators.observable.o0(io.reactivex.rxjava3.core.q.O(rn00.x(linkedHashMap)), new v20(new f2s(fVar, 20), 27)).a0(asu0.a.d()), fragmentActivity.getApplicationContext(), 0L, false, 60);
                int i2 = kwg0.a;
                fVar.m.b(m.subscribe(fVar2, new hwg0(), qwjVar));
                return s3q0.a;
            case 6:
                return ((ev10) this.c).l;
            case 7:
                ine0.m((Push) this.c, ahe0.m.b);
                return s3q0.a;
            case 8:
                ((gm20) this.c).l.e();
                return s3q0.a;
            case 9:
                return ((MiniPlayerControllersWrapper) this.c).q;
            case 10:
                return (qdz) ((com.vk.catalog2.feature.music.configuration.b) this.c).e0.getValue();
            case 11:
                ((MusicDownloadsHistoryCatalogRootVh) this.c).u.d();
                return s3q0.a;
            case 12:
                MusicInVideoComponentImpl musicInVideoComponentImpl = (MusicInVideoComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = MusicInVideoComponentImpl.e;
                return new ksf0(new gsf0(new uft0(), musicInVideoComponentImpl.a.I4(), musicInVideoComponentImpl.b.s()));
            case 13:
                ydl0.a aVar2 = ((yy40) this.c).b;
                if (aVar2 != null) {
                    aVar2.onClose();
                }
                return s3q0.a;
            case 14:
                return new r3c0((t3c0) ((pq50) this.c).I.getValue());
            case 15:
                NewsfeedCustomFragment2 newsfeedCustomFragment2 = (NewsfeedCustomFragment2) this.c;
                return new uq60(newsfeedCustomFragment2, newsfeedCustomFragment2.X, newsfeedCustomFragment2.fo().a.Y, newsfeedCustomFragment2.fo().f);
            case 16:
                return (LinksBridgeComponent) ((mo60) this.c).c().a(fpf0.a(LinksBridgeComponent.class));
            case 17:
                NotificationSettingFragment notificationSettingFragment = (NotificationSettingFragment) this.c;
                qcy<Object>[] qcyVarArr2 = NotificationSettingFragment.W;
                Bundle requireArguments = notificationSettingFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("setting", NotificationsNotificationSettingRedesignDto.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable("setting");
                    parcelable = (NotificationsNotificationSettingRedesignDto) (parcelable3 instanceof NotificationsNotificationSettingRedesignDto ? parcelable3 : null);
                }
                return (NotificationsNotificationSettingRedesignDto) parcelable;
            case 18:
                return "LivePlayerImpl.handleUnpublished() - closure state= " + wl80.this.G;
            case 19:
                OnlineBookingInternalComponent onlineBookingInternalComponent = (OnlineBookingInternalComponent) this.c;
                OnlineBookingInternalComponent.a aVar3 = OnlineBookingInternalComponent.n;
                return new yy7(onlineBookingInternalComponent.Ef());
            case 20:
                return new cp90(((dp90) this.c).c);
            case 21:
                return ((e2b0) this.c).y;
            case 22:
                h7b0 h7b0Var = (h7b0) this.c;
                if (h7b0Var.i != null) {
                    return s3q0.a;
                }
                io.reactivex.rxjava3.internal.operators.observable.m1 a0 = h7b0Var.d.z().a0(io.reactivex.rxjava3.android.schedulers.a.b());
                pdw pdwVar = new pdw(new jjx(h7b0Var, 28), 16);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                h7b0Var.i = itg0.m(new io.reactivex.rxjava3.internal.operators.observable.a0(a0.E(pdwVar, lVar, kVar, kVar), new u00(h7b0Var, 4)));
                return s3q0.a;
            case 23:
                ((i0c0.a) this.c).a();
                return s3q0.a;
            case 24:
                PostingFragment postingFragment = (PostingFragment) this.c;
                int i3 = PostingFragment.L0;
                Bundle arguments = postingFragment.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                return new rbc0(arguments);
            case 25:
                ((enc0) this.c).U.invoke(new PostingAction.Navigation.Close(false, false, false, 7, null));
                return s3q0.a;
            case 26:
                return new ofe0.c((ofe0) this.c);
            case 27:
                return Float.valueOf(((wak0) ((wfh0) this.c).p.a).getIntValue());
            case 28:
                SearchDocumentsListFragment searchDocumentsListFragment = (SearchDocumentsListFragment) this.c;
                int i4 = SearchDocumentsListFragment.h0;
                Bundle arguments2 = searchDocumentsListFragment.getArguments();
                return (arguments2 == null || (userId = (UserId) arguments2.getParcelable("ownerId")) == null) ? UserId.d : userId;
            default:
                dw20 dw20Var = ((s8i0) this.c).u;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
        }
    }
}
