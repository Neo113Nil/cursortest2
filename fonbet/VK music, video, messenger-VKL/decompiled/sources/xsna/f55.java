package xsna;

import android.content.Context;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.auth.api.models.AuthResult;
import com.vk.channels.api.ChannelFilter;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.checklist.impl.presentation.CommunityCheckListFragment;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsHistoryMetaDb;
import com.vk.log.L;
import com.vk.photos.ui.editalbum.domain.e;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xsna.c2r0;
import xsna.gm50;
import xsna.ksd0;
import xsna.oem0;
import xsna.wk50;
import xsna.xwg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class f55 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f55(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.b;
        int i3 = 2;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                final Context context = (Context) obj4;
                final c2r0 c2r0Var = (c2r0) obj3;
                final AuthResult authResult = (AuthResult) obj2;
                final List list = (List) obj;
                return new io.reactivex.rxjava3.internal.operators.completable.o(new Runnable() { // from class: xsna.g55
                    @Override // java.lang.Runnable
                    public final void run() {
                        l55 l55Var = l55.a;
                        UserId userId = authResult.d;
                        l55Var.getClass();
                        List list2 = list;
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : list2) {
                            if (hashSet.add(((c2r0.b) obj5).a)) {
                                arrayList.add(obj5);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((c2r0.b) it.next()).g);
                        }
                        j2q.a(arrayList2).subscribe(new y00(new t35(list2, c2r0Var, context, userId, 0), 3), new np3(new am0(5), 1));
                    }
                });
            case 1:
                vcb vcbVar = (vcb) obj2;
                ChannelsHistoryMetaDb channelsHistoryMetaDb = ((gkb) obj4).c;
                channelsHistoryMetaDb.b.b().execSQL(xqm0.g("\n            UPDATE " + channelsHistoryMetaDb.a.a + " \n            SET " + ChannelsHistoryMetaDb.Column.OLDEST_SORT_ID.getKey() + " = ?, " + ChannelsHistoryMetaDb.Column.OLDEST_SORT_CHANNEL_ID + " = ? \n            WHERE " + ChannelsHistoryMetaDb.Column.FILTER_ID + " = ?\n            "), new Object[]{Long.valueOf(vcbVar.b.a()), Long.valueOf(vcbVar.c), Integer.valueOf(((ChannelFilter) obj3).i())});
                return s3q0.a;
            case 2:
                CommunityCheckListFragment communityCheckListFragment = (CommunityCheckListFragment) obj4;
                int i4 = CommunityCheckListFragment.Y;
                gm50.a.a(communityCheckListFragment, ((xwg.c) obj).a, new bwg((VkScreenSpinner) obj3, (SwipeRefreshLayout) obj2, communityCheckListFragment, 0));
                return s3q0.a;
            case 3:
                com.vk.photos.ui.editalbum.domain.c cVar = (com.vk.photos.ui.editalbum.domain.c) obj4;
                PhotoAlbum photoAlbum = (PhotoAlbum) obj3;
                com.vk.photos.ui.editalbum.domain.h hVar = (com.vk.photos.ui.editalbum.domain.h) obj2;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    cVar.g.b(new g.h(num.intValue(), new mi1(cVar, photoAlbum, hVar, 2)));
                } else {
                    cVar.T(e.f.b);
                    cVar.W(photoAlbum, hVar);
                }
                return s3q0.a;
            case 4:
                DownloadingState downloadingState = (DownloadingState) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                qyg0 V0 = ((hyg0) obj).V0((String) obj4);
                try {
                    vuu vuuVar = downloadingState instanceof vuu ? (vuu) downloadingState : null;
                    if (vuuVar != null) {
                        i = vuuVar.g5();
                    } else {
                        DownloadingState.NotLoaded.b.getClass();
                        i = 0;
                    }
                    V0.bindLong(1, i);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        V0.D3(i3, (String) it.next());
                        i3++;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.step()) {
                        arrayList2.add(V0.l2(0));
                    }
                    V0.close();
                    return arrayList2;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 5:
                L.i((Throwable) obj);
                ((fid0) obj4).f((wk50.a) obj3, (a.C0919a) obj2);
                return s3q0.a;
            case 6:
                ((lsd0) obj3).c((Context) obj4, (ksd0.c) obj2);
                return s3q0.a;
            case 7:
                LoadStrategy loadStrategy = (LoadStrategy) obj4;
                zgm0 zgm0Var = (zgm0) obj3;
                rqe0 rqe0Var = (rqe0) obj2;
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Can't get cached questions", (Throwable) obj));
                if (loadStrategy == LoadStrategy.ONLY_CACHE) {
                    zgm0Var.d.a(new oem0.c.a(rqe0Var.b));
                }
                return s3q0.a;
            default:
                ubr0 ubr0Var = (ubr0) obj4;
                UserId userId = (UserId) obj3;
                String str = (String) obj2;
                o0c o0cVar = (o0c) obj;
                String str2 = o0cVar.a;
                String str3 = o0cVar.b;
                if (myc0.f(str2) && myc0.f(str3)) {
                    String str4 = o0cVar.a;
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).j0(str4, str3, new vbr0(ubr0Var, userId, str));
                } else {
                    ubr0Var.c.m(JsApiMethodType.SHOW_INVITE_BOX, VkAppsErrors.Client.INVALID_PARAMS, null, null);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ f55(String str, fb50 fb50Var, DownloadingState downloadingState, ArrayList arrayList) {
        this.b = 4;
        this.c = str;
        this.d = downloadingState;
        this.e = arrayList;
    }

    public /* synthetic */ f55(lsd0 lsd0Var, Context context, ksd0.c cVar) {
        this.b = 6;
        this.d = lsd0Var;
        this.c = context;
        this.e = cVar;
    }
}
