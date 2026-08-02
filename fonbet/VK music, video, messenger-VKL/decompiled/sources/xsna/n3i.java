package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.communities.GroupsSuggestionsFragment;
import com.vk.core.snackbar.HideReason;
import com.vk.core.view.components.search.ExpandableActionVkSearchView;
import com.vk.dto.photo.Photo;
import com.vk.file_picker.external.c;
import com.vk.im.design.view.listitem.ImCallBubble;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.posting.impl.domain.model.PlacesLoadingState;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsViewState;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVhOld;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.Pair;
import xsna.bcw0;
import xsna.h8n;
import xsna.r1n;
import xsna.ukl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class n3i implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n3i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                RecyclerPaginatedView recyclerPaginatedView = ((com.vk.profile.community.suggestions.impl.ui.suggestions.g) obj2).h;
                CommunitySuggestionsViewState.b bVar = (CommunitySuggestionsViewState.b) obj;
                if (bVar != null) {
                    if (bVar.b) {
                        recyclerPaginatedView.Fe();
                    } else {
                        recyclerPaginatedView.r(bVar.a);
                    }
                    break;
                } else {
                    break;
                }
            case 1:
                break;
            case 2:
                int i2 = p0j.j1;
                ((p0j) obj2).tn();
                break;
            case 3:
                utj utjVar = (utj) obj2;
                HideReason hideReason = HideReason.Swipe;
                utjVar.n = null;
                Object obj3 = flv0.a;
                flv0.d(utjVar.r);
                izs<? super HideReason, s3q0> izsVar = utjVar.p;
                if (izsVar != null) {
                    izsVar.invoke(hideReason);
                }
                utjVar.d();
                break;
            case 4:
                ((y6k) obj2).Z0();
                break;
            case 5:
                onb0 onb0Var = (onb0) obj;
                ukl.a aVar = ((ukl) obj2).a;
                break;
            case 6:
                hkp hkpVar = ((tim) obj2).p;
                if (hkpVar != null) {
                    pim pimVar = (pim) hkpVar.b;
                    btk0 btk0Var = pimVar.l;
                    if (btk0Var.b) {
                        DialogExt dialogExt = btk0Var.a;
                        pimVar.b1();
                        pimVar.a1(dialogExt);
                    }
                }
                break;
            case 7:
                com.vk.im.engine.models.dialogs.b bVar2 = (com.vk.im.engine.models.dialogs.b) obj;
                ((hpm) obj2).b.b().execSQL("UPDATE dialogs SET read_till_in_msg_cnv_id_local = ?, count_unread_local = ? WHERE id = ?", new Object[]{Integer.valueOf(bVar2.g), Integer.valueOf(bVar2.l), Long.valueOf(bVar2.b)});
                break;
            case 8:
                break;
            case 9:
                k5n k5nVar = (k5n) obj2;
                jse0 jse0Var = k5nVar.p0;
                if (jse0Var != null) {
                    NewsEntriesContainer.Info info = k5nVar.s0;
                    jse0Var.c(info != null ? true ^ (((q1n) k5nVar.l0.getValue()).f(info) instanceof r1n.c) : true);
                }
                k5nVar.t();
                break;
            case 10:
                h8n.b bVar3 = (h8n.b) obj2;
                h8n.b.a(bVar3, new atm(h8n.this, r2 ? 1 : 0));
                break;
            case 11:
                break;
            case 12:
                ((kzo) obj2).b.invoke(a.g.b);
                break;
            case 13:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                cvk.u(R.string.picker_saving_error, false);
                ((com.vk.attachpicker.screen.h) obj2).B = null;
                break;
            case 14:
                User user = (User) ((wpp) obj).c.get(Long.valueOf(((z6p) obj2).i));
                if (user == null || (r1 = Optional.of(user)) == null) {
                    break;
                }
                break;
            case 15:
                Photo photo = (Photo) obj2;
                Photo photo2 = ((PhotoAttachment) obj).l;
                break;
            case 16:
                ExpandableActionVkSearchView expandableActionVkSearchView = (ExpandableActionVkSearchView) obj2;
                String str = ((bcw0.a) obj).a;
                if (str != null) {
                    expandableActionVkSearchView.setQuery(str);
                    izs<String, s3q0> onVoiceInputListener = expandableActionVkSearchView.getOnVoiceInputListener();
                    if (onVoiceInputListener != null) {
                        onVoiceInputListener.invoke(str);
                    }
                }
                break;
            case 17:
                com.vk.file_picker.external.b bVar4 = (com.vk.file_picker.external.b) obj2;
                bVar4.T(new c.b(bVar4.f.getString(R.string.error)));
                break;
            case 18:
                qcy<Object>[] qcyVarArr = FaveFeedFragment.s0;
                ((SwipeDrawableRefreshLayout) obj2).setProgressDrawableFactory((d2e0) obj);
                break;
            case 19:
                m6r m6rVar = (m6r) obj2;
                Pair pair = (Pair) obj;
                m6rVar.a.a(new com.vk.newsfeed.posting.impl.domain.model.f(PlacesLoadingState.Success));
                m6rVar.a.a(new com.vk.newsfeed.posting.impl.domain.model.g((List) pair.i(), ((Number) pair.j()).intValue()));
                break;
            case 20:
                t2s t2sVar = (t2s) obj;
                Set R0 = j5g.R0(t2sVar.f);
                R0.add(Integer.valueOf(((d580) obj2).b));
                break;
            case 21:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((fxt0) obj2).d).setValue(bool);
                break;
            case 22:
                ((io.reactivex.rxjava3.subjects.f) obj2).onNext(Boolean.TRUE);
                break;
            case 23:
                GlobalSearchGroupsCatalogRootVhOld globalSearchGroupsCatalogRootVhOld = (GlobalSearchGroupsCatalogRootVhOld) obj2;
                int i3 = 8;
                globalSearchGroupsCatalogRootVhOld.J.b(rsg0.y0(yfb.x(globalSearchGroupsCatalogRootVhOld.K.d(Collections.singletonList(((ap0) obj).a))), null, null, 3).subscribe(new com.vk.im.ui.components.dialogs_list.b(new leq(i3), 25), new pis(new j5n(i3))));
                break;
            case 24:
                break;
            case 25:
                z7u z7uVar = (z7u) obj2;
                break;
            case 26:
                int i4 = GroupsSuggestionsFragment.Y;
                FragmentActivity activity = ((GroupsSuggestionsFragment) obj2).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                break;
            case 27:
                c8v c8vVar = (c8v) obj2;
                c8vVar.d1().f(false);
                l56<?> d1 = c8vVar.d1();
                d1.getClass();
                ArrayList arrayList = new ArrayList();
                g5g.y(d1.getState().Bb(), arrayList);
                List list = (List) obj;
                izs<HistoryAttach, ?> b = d1.b();
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add((hfz) b.invoke((HistoryAttach) it.next()));
                }
                g5g.y(arrayList2, arrayList);
                d1.c().onNext(PageLoadingState.Ab(d1.getState(), arrayList, null, null, null, 14));
                break;
            case 28:
                int i5 = ImCallBubble.j;
                ((cyv) obj2).a.b.invoke();
                break;
            default:
                k8w k8wVar = (k8w) obj2;
                sxp sxpVar = (sxp) obj;
                if ((sxpVar instanceof nc80) || (sxpVar instanceof oc80)) {
                    k8wVar.a();
                } else if ((sxpVar instanceof i980) || (sxpVar instanceof l980)) {
                    k8wVar.b();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ n3i(c4u c4uVar, cxo cxoVar) {
        this.b = 24;
        this.c = cxoVar;
    }

    public /* synthetic */ n3i(d580 d580Var, i2s i2sVar) {
        this.b = 20;
        this.c = d580Var;
    }
}
