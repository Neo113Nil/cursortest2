package xsna;

import com.vk.catalog.mvi.section.screen.impl.ui.entity.CatalogSectionScreenState;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListState;
import com.vk.clips.editor.templates.impl.views.main.ClipsTemplateEditorFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dto.clips.model.ClipsEditorInitParams;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.BookingMastersScreenFragmentMvi2;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.BookingScreenParams;
import com.vk.ecomm.onlinebooking.impl.navhostfragment.b;
import com.vk.im.channelcreation.impl.j;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.log.L;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.voip.ui.asr.ui.start.AsrRecordStartFragment;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.as7;
import xsna.ca9;
import xsna.coc;
import xsna.fpe;
import xsna.gzb;
import xsna.m0f;
import xsna.mm7;
import xsna.ph4;
import xsna.tj50;
import xsna.ygb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class iz implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iz(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01fb, code lost:
    
        if (((xsna.n280) r2).c == r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0238, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0208, code lost:
    
        if (((xsna.i280) r2).c == r5) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x021b, code lost:
    
        if (((xsna.o280) r2).c.get(java.lang.Long.valueOf(r5)) != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0235, code lost:
    
        if ((r2 instanceof com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent) == false) goto L72;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z = true;
        z = true;
        z = true;
        z = true;
        z = true;
        switch (this.b) {
            case 0:
                com.vk.superapp.browser.internal.ui.shortcats.a aVar = (com.vk.superapp.browser.internal.ui.shortcats.a) this.c;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                aVar.g = cVar;
                ((ggu0) aVar.a.b).r.b(cVar);
                return s3q0.a;
            case 1:
                it80 it80Var = (it80) obj;
                ow3 ow3Var = ((AsrRecordStartFragment) this.c).Q;
                if (ow3Var != null) {
                    rw3 rw3Var = (rw3) it80Var.a;
                    ow3Var.a();
                    ow3Var.h.b(rw3Var);
                }
                return s3q0.a;
            case 2:
                ((ng4) this.c).j.b(new ph4.e(false));
                return s3q0.a;
            case 3:
                BookingMastersScreenFragmentMvi2 bookingMastersScreenFragmentMvi2 = (BookingMastersScreenFragmentMvi2) this.c;
                com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d dVar = (com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.d) obj;
                BookingScreenParams bookingScreenParams = ((ar7) bookingMastersScreenFragmentMvi2.R.getValue()).a;
                b.d dVar2 = bookingMastersScreenFragmentMvi2.P;
                if (dVar instanceof d.b) {
                    d.b bVar = (d.b) dVar;
                    if (bVar instanceof d.b.C0976d) {
                        wr7.a(bookingMastersScreenFragmentMvi2, new as7.j(BookingScreenParams.a(bookingScreenParams, 0, null, null, ((d.b.C0976d) bVar).a, null, 0, null, 0, null, 131055)));
                    } else if (bVar instanceof d.b.c) {
                        wr7.a(bookingMastersScreenFragmentMvi2, new as7.j(BookingScreenParams.a(bookingScreenParams, 0, null, null, null, null, 0, null, 0, null, 131055)));
                    } else if (bVar instanceof d.b.C0975b) {
                        wr7.a(bookingMastersScreenFragmentMvi2, as7.b.a);
                    } else {
                        if (!(bVar instanceof d.b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wr7.a(bookingMastersScreenFragmentMvi2, new as7.a(bookingScreenParams.q));
                    }
                } else if (dVar instanceof d.a) {
                    d.a aVar2 = (d.a) dVar;
                    if (aVar2 instanceof d.a.b) {
                        wr7.b(bookingMastersScreenFragmentMvi2, dVar2, new mm7.b.g(bookingScreenParams.b, Integer.valueOf(bookingScreenParams.l), bookingScreenParams.q, false));
                    } else if (aVar2 instanceof d.a.C0974a) {
                        wr7.b(bookingMastersScreenFragmentMvi2, dVar2, new mm7.b.C3352b(bookingScreenParams.b, Integer.valueOf(bookingScreenParams.l), bookingScreenParams.q));
                    } else {
                        if (!epx.f(aVar2, d.a.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        wr7.b(bookingMastersScreenFragmentMvi2, dVar2, new mm7.b.d(bookingScreenParams.b, null));
                    }
                } else {
                    if (!(dVar instanceof d.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rwp.a(bookingMastersScreenFragmentMvi2.requireContext(), ((d.c) dVar).a, true);
                }
                return s3q0.a;
            case 4:
                com.vk.voip.ui.settings.participants_view.c cVar2 = (com.vk.voip.ui.settings.participants_view.c) this.c;
                final List<? extends CallSettingsItem> list = (List) obj;
                int s = cVar2.c.s();
                long currentTimeMillis = System.currentTimeMillis();
                com.vk.voip.ui.settings.participants_view.a aVar3 = cVar2.d;
                n89 n89Var = new n89(currentTimeMillis, s, cVar2);
                final f89 f89Var = aVar3.e;
                com.vk.voip.ui.settings.participants_view.a aVar4 = f89Var.a;
                io.reactivex.rxjava3.disposables.c cVar3 = f89Var.c;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                f89Var.c = null;
                final List<? extends CallSettingsItem> list2 = f89Var.d;
                if (list == list2) {
                    n89Var.run();
                } else if (list.isEmpty()) {
                    f89Var.d = list;
                    aVar4.notifyItemRangeRemoved(0, list2.size());
                    n89Var.run();
                } else if (f89Var.d.isEmpty()) {
                    f89Var.d = list;
                    aVar4.notifyItemRangeInserted(0, list.size());
                    n89Var.run();
                } else if (Math.abs(list.size() - list2.size()) > 200) {
                    f89Var.d = list;
                    aVar4.notifyDataSetChanged();
                    n89Var.run();
                } else {
                    io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.c89
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            f89 f89Var2 = f89Var;
                            f89Var2.getClass();
                            return androidx.recyclerview.widget.m.a(new d89(list2, list, f89Var2), true);
                        }
                    });
                    asu0 asu0Var = asu0.a;
                    asu0Var.getClass();
                    f89Var.c = io.reactivex.rxjava3.kotlin.c.e(vVar.q(asu0.p()).m(asu0Var.d()), new e89(L.a, 0), new z63(f89Var, list, n89Var, z ? 1 : 0));
                }
                return s3q0.a;
            case 5:
                whr0 whr0Var = (whr0) this.c;
                ca9.c cVar4 = (ca9.c) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(cVar4.m);
                linkedHashMap.put(whr0Var.a, whr0Var);
                return ca9.c.a(cVar4, pn00.t(linkedHashMap), null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, false, null, false, null, -4097, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 6:
                ((m99) this.c).r();
                return s3q0.a;
            case 7:
                ((k9k) this.c).a((Throwable) obj);
                return s3q0.a;
            case 8:
                laa laaVar = (laa) this.c;
                vua0 vua0Var = laaVar.k;
                String str = laaVar.j;
                vua0Var.getClass();
                return vua0.C(str, (List) obj);
            case 9:
                mp3 mp3Var = (mp3) this.c;
                Throwable th = (Throwable) obj;
                cvk.u(R.string.error, false);
                L.j(th, "Catalog");
                mp3Var.invoke(th);
                return s3q0.a;
            case 10:
                return CatalogSectionScreenState.a((CatalogSectionScreenState) obj, null, null, null, null, (mm50) this.c, 15);
            case 11:
                ((zak0) ((noa) this.c).q).setValue((String) obj);
                return s3q0.a;
            case 12:
                com.vk.channels.impl.comments.b bVar2 = (com.vk.channels.impl.comments.b) this.c;
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, com.vk.channels.impl.comments.b.s(bVar2, bVar2.k.a(), false, 2), null, null, false, 14);
            case 13:
                return com.vk.im.channelcreation.impl.j.a((com.vk.im.channelcreation.impl.j) obj, j.a.a(((com.vk.im.channelcreation.impl.b) this.c).g().b, null, null, !r1.g().b.d, 7), null, 5);
            case 14:
                sxp sxpVar = (sxp) obj;
                long j = ((i2b) this.c).b;
                if (!(sxpVar instanceof n280)) {
                    if (!(sxpVar instanceof i280)) {
                        if (!(sxpVar instanceof o280)) {
                            if (sxpVar instanceof w280) {
                                z = ((w280) sxpVar).c.contains(Long.valueOf(j));
                            } else if (!(sxpVar instanceof y080)) {
                                break;
                            }
                            return Boolean.valueOf(z);
                        }
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 15:
                g7b g7bVar = (g7b) this.c;
                uib a = ((xgl0) obj).a();
                long j2 = g7bVar.d;
                long j3 = g7bVar.c;
                a.Y(j2, j3 < 0 ? new ChannelNotificationsSettings(false, 0L, 2, null) : j3 > 0 ? new ChannelNotificationsSettings(false, j3) : new ChannelNotificationsSettings(true, 0L, 2, null));
                return s3q0.a;
            case 16:
                ((i9b) this.c).s.onNext((xxd0) obj);
                return s3q0.a;
            case 17:
                qdb qdbVar = (qdb) this.c;
                final h6o0 h6o0Var = qdbVar.f;
                final long j4 = qdbVar.d;
                ((Boolean) ((w2w) h6o0Var.b).I0().u(new izs() { // from class: xsna.cua
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(h6o0.this.e(j4, false));
                    }
                })).getClass();
                return s3q0.a;
            case 18:
                ((com.vk.channels.impl.list.b) this.c).s.onNext(Boolean.valueOf(!((ygb.a) obj).a.a.isEmpty()));
                return s3q0.a;
            case 19:
                ((gzb.a) this.c).m.f();
                return s3q0.a;
            case 20:
                ((slc) this.c).a();
                return s3q0.a;
            case 21:
                coc.e eVar = (coc.e) this.c;
                ClipCoauthorListState clipCoauthorListState = (ClipCoauthorListState) obj;
                List<ClipCoauthorListItem> list3 = clipCoauthorListState.c;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                for (ClipCoauthorListItem clipCoauthorListItem : list3) {
                    if (clipCoauthorListItem.b.b.equals(eVar.b)) {
                        ClipCoauthorListItem.SubscribeState subscribeState = clipCoauthorListItem.d;
                        if (subscribeState instanceof ClipCoauthorListItem.SubscribeState.Visible) {
                            clipCoauthorListItem = ClipCoauthorListItem.a(clipCoauthorListItem, null, new ClipCoauthorListItem.SubscribeState.Visible(((ClipCoauthorListItem.SubscribeState.Visible) subscribeState).b, false), 59);
                        }
                    }
                    arrayList.add(clipCoauthorListItem);
                }
                return ClipCoauthorListState.a(clipCoauthorListState, arrayList);
            case 22:
                int i = ClipFeedListFragment.a2;
                ((ClipFeedListFragment) this.c).Lo((m0f.a) obj);
                return s3q0.a;
            case 23:
                ajd ajdVar = (ajd) this.c;
                io.reactivex.rxjava3.subjects.h hVar = (io.reactivex.rxjava3.subjects.h) ajdVar.b.c;
                hVar.getClass();
                io.reactivex.rxjava3.internal.operators.observable.z0 z0Var = new io.reactivex.rxjava3.internal.operators.observable.z0(hVar);
                io.reactivex.rxjava3.subjects.h hVar2 = ajdVar.c.e;
                hVar2.getClass();
                io.reactivex.rxjava3.core.q n0 = io.reactivex.rxjava3.core.q.X(z0Var, new io.reactivex.rxjava3.internal.operators.observable.z0(hVar2)).n0(io.reactivex.rxjava3.core.q.T(Boolean.valueOf(ajdVar.isEnabled())));
                a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                n0.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.y(n0, qVar, io.reactivex.rxjava3.internal.functions.b.a);
            case 24:
                bzd bzdVar = (bzd) this.c;
                e2e e2eVar = bzdVar.e;
                oxd oxdVar = bzdVar.s;
                ClipsEditorInitParams clipsEditorInitParams = bzdVar.b;
                cxd cxdVar = e2eVar.k;
                oxdVar.a(sxd.a((com.vk.clips.editor.state.model.a) obj), clipsEditorInitParams.c.u);
                return oxdVar.b();
            case 25:
                return ((com.vk.clips.favorites.impl.ui.folders.content.f) this.c).f.a((ClipsFavoriteFolderContentListState.Content) obj);
            case 26:
                return new fpe.a(((tj50.a) obj).a(new zoe(1, ((ape) this.c).e, gpe.class, "map", "map(Lcom/vk/clips/viewer/impl/owner/presentation/state/ClipsOwnerSwipeMviState;)Lcom/vk/clips/viewer/impl/owner/ui/state/ClipsOwnerSwipeViewState$ItemsData;", 0), ao8.d));
            case 27:
                ClipsTemplateEditorFragment clipsTemplateEditorFragment = (ClipsTemplateEditorFragment) this.c;
                int i2 = ClipsTemplateEditorFragment.h0;
                clipsTemplateEditorFragment.eo().v();
                return s3q0.a;
            case 28:
                CommentThreadFragment commentThreadFragment = (CommentThreadFragment) this.c;
                ArrayList<dl60> arrayList2 = CommentThreadFragment.y0;
                qgi0.h((tgi0) obj, commentThreadFragment.getString(R.string.accessibility_back));
                return s3q0.a;
            default:
                CommunitiesManageNotificationsFragment communitiesManageNotificationsFragment = (CommunitiesManageNotificationsFragment) this.c;
                int i3 = CommunitiesManageNotificationsFragment.Z;
                communitiesManageNotificationsFragment.finish();
                return s3q0.a;
        }
    }
}
