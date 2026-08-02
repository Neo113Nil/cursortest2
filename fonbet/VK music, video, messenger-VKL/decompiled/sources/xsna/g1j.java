package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.catalog2.common.ui.holders.friend.FriendsBirthdaysPackableVh;
import com.vk.core.compose.component.datetime.EditingMode;
import com.vk.core.compose.component.modal.Mode;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.HighlightCover;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.e;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.ui.fragments.ImRequestsFragment;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.DonutLevelsFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.p810;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g1j implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 3;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((i1j) obj2).e.invoke((j0j) obj);
                break;
            case 1:
                fl00 fl00Var = ((nzj) obj2).f;
                Throwable th = ((tzj) obj).f;
                fl00Var.getClass();
                break;
            case 2:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                xwk.c(sQLiteDatabase, new f1j(sQLiteDatabase, 2));
                break;
            case 3:
                ((zak0) ((c0l) obj2).f).setValue((EditingMode) obj);
                break;
            case 4:
                int i3 = DonutLevelsFragment.R;
                ((DonutLevelsFragment) obj2).eo((DonutLevel) obj);
                break;
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VkAuthPasswordView vkAuthPasswordView = ((zop) obj2).u;
                (vkAuthPasswordView != null ? vkAuthPasswordView : null).setPasswordTransformationEnabled(booleanValue);
                break;
            case 6:
                EnterProfilePresenter enterProfilePresenter = (EnterProfilePresenter) obj2;
                enterProfilePresenter.B0(com.vk.auth.entername.a.b(enterProfilePresenter.A, null, (String) obj, null, null, null, 29));
                break;
            case 7:
                ((b.d) obj).b(((ClickableMusic) obj2).zb().zb(), "clickable_sticker");
                break;
            case 8:
                break;
            case 9:
                FriendRequestsFragment friendRequestsFragment = (FriendRequestsFragment) obj2;
                ijs ijsVar = friendRequestsFragment.a0;
                if (ijsVar != null) {
                    ijsVar.p = true;
                }
                com.vk.lists.c cVar = friendRequestsFragment.Y;
                if (cVar != null) {
                    cVar.p(false);
                }
                break;
            case 10:
                FriendsBirthdaysPackableVh friendsBirthdaysPackableVh = (FriendsBirthdaysPackableVh) obj2;
                ny3 ny3Var = (ny3) obj;
                friendsBirthdaysPackableVh.c = (LinkedTextView) ny3Var.findViewById(R.id.title);
                friendsBirthdaysPackableVh.d = (VKAvatarView) ny3Var.findViewById(R.id.first_photo);
                friendsBirthdaysPackableVh.f = (ImageView) ny3Var.findViewById(R.id.button);
                ((ConstraintLayout) ny3Var.findViewById(R.id.birthdays_layout_root)).setOnClickListener(friendsBirthdaysPackableVh);
                VKAvatarView vKAvatarView = friendsBirthdaysPackableVh.d;
                if (vKAvatarView == null) {
                    vKAvatarView = null;
                }
                vKAvatarView.setOnClickListener(friendsBirthdaysPackableVh);
                ImageView imageView = friendsBirthdaysPackableVh.f;
                if (imageView == null) {
                    imageView = null;
                }
                imageView.setOnClickListener(friendsBirthdaysPackableVh);
                PhotoStackView photoStackView = (PhotoStackView) ny3Var.findViewById(R.id.photos);
                friendsBirthdaysPackableVh.e = photoStackView;
                photoStackView.setMarginBetweenImages(8.0f);
                PhotoStackView photoStackView2 = friendsBirthdaysPackableVh.e;
                (photoStackView2 != null ? photoStackView2 : null).setListener(new FriendsBirthdaysPackableVh.b(friendsBirthdaysPackableVh));
                break;
            case 11:
                ((rg50) obj2).C(((ljo0) obj).b.f);
                break;
            case 12:
                da7 da7Var = (da7) obj2;
                List list = (List) obj;
                int e = on00.e(c5g.u(list, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj3 : list) {
                    linkedHashMap.put(Long.valueOf(((ba7) obj3).a.b), obj3);
                }
                ArrayList<ha7> arrayList = da7Var.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (ha7 ha7Var : arrayList) {
                    List<UserId> list2 = ha7Var.b;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        ba7 ba7Var = (ba7) linkedHashMap.get(Long.valueOf(((UserId) it.next()).b));
                        if (ba7Var != null) {
                            arrayList3.add(ba7Var);
                        }
                    }
                    arrayList2.add(new ga7(ha7Var.a, arrayList3));
                }
                break;
            case 13:
                llu lluVar = (llu) obj2;
                klu kluVar = (klu) obj;
                BroadcastAuthor.Group group = lluVar.j;
                if (group != null) {
                    lluVar.b().j().a(group.b, kluVar);
                }
                lluVar.b().j().b = kluVar;
                izs<? super rfd0, s3q0> izsVar = lluVar.h;
                if (izsVar != null) {
                    izsVar.invoke(new rfd0(null, 1));
                }
                break;
            case 14:
                HighlightChooseCoverFragment.c cVar2 = (HighlightChooseCoverFragment.c) obj2;
                cVar2.f.setValue(cVar2, HighlightChooseCoverFragment.c.g[1], (HighlightCover) obj);
                break;
            case 15:
                break;
            case 16:
                qcy<Object>[] qcyVarArr = ImRequestsFragment.Z;
                ((ImRequestsFragment) obj2).finish();
                break;
            case 17:
                qdw qdwVar = (qdw) obj2;
                io.reactivex.rxjava3.disposables.c e2 = qdwVar.c.e(new t3h(qdwVar, 28));
                io.reactivex.rxjava3.disposables.b bVar = qdwVar.f;
                bVar.b(e2);
                bVar.b(new io.reactivex.rxjava3.internal.operators.observable.i0(qdwVar.b.l.a(), new com.vk.movika.sdk.base.ui.j(new u4u(4), 23)).subscribe(new xn(new xgv(qdwVar, i2), 24)));
                break;
            case 18:
                wzx wzxVar = (wzx) obj2;
                ((gvw0) wzxVar.i.getValue()).i(new n7w(wzxVar, i2), null);
                break;
            case 19:
                ((tvj) obj2).invoke();
                break;
            case 20:
                ((k520) obj2).h.M0();
                break;
            case 21:
                break;
            case 22:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) obj2;
                e.c cVar3 = (e.c) obj;
                SwipeRefreshLayout swipeRefreshLayout = marketAllReviewsFragment.Q;
                if (swipeRefreshLayout == null) {
                    swipeRefreshLayout = null;
                }
                swipeRefreshLayout.setRefreshing(false);
                SwipeRefreshLayout swipeRefreshLayout2 = marketAllReviewsFragment.Q;
                if (swipeRefreshLayout2 == null) {
                    swipeRefreshLayout2 = null;
                }
                swipeRefreshLayout2.setEnabled(false);
                NestedScrollView nestedScrollView = marketAllReviewsFragment.U;
                if (nestedScrollView != null) {
                    bwt0.p0(nestedScrollView, false);
                }
                RecyclerView recyclerView = marketAllReviewsFragment.R;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                bwt0.p0(recyclerView, true);
                VkSpinner vkSpinner = marketAllReviewsFragment.S;
                if (vkSpinner != null) {
                    bwt0.p0(vkSpinner, false);
                }
                List<hfz> a = cVar3.a.a();
                if (a != null) {
                    wr00 wr00Var = marketAllReviewsFragment.V;
                    (wr00Var != null ? wr00Var : null).setItems(a);
                }
                break;
            case 23:
                ((z010) obj2).n.a();
                break;
            case 24:
                ((f810) obj2).T(new p810.p((Throwable) obj));
                break;
            case 25:
                h420 h420Var = (h420) obj2;
                Pair pair = (Pair) obj;
                h420Var.i = (List) pair.i();
                h420Var.j = (List) pair.j();
                break;
            case 26:
                ((ud20) obj2).b = null;
                break;
            case 27:
                ((zak0) ((n030) obj2).c).setValue((Mode) obj);
                break;
            case 28:
                ((ct30) obj2).l = (StickerItem) ((n1l0) obj);
                break;
            default:
                tam0 tam0Var = (tam0) obj2;
                txl0 txl0Var = (txl0) ((it80) obj).a;
                if (txl0Var != null) {
                    tam0Var.v = txl0Var;
                }
                break;
        }
        return s3q0.a;
    }
}
