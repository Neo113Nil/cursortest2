package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteStatement;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.clips.impl.authors.selector.list.delegate.ClipsAuthorSelectorAuthorDelegate;
import com.vk.catalog.mvi.block.video.impl.video.largelisttablet.VideoLargeListTabletView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.channels.impl.list.e;
import com.vk.channels.impl.list.g;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.group.Group;
import com.vk.ecomm.design.compose.product_info.MarketProductCardMainInfo;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.search.communities.map.impl.ui.map.SearchCommunitiesOnMapFragment;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemType;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemsView;
import com.vk.voip.ui.settings.participants_view.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.bxi;
import xsna.g49;
import xsna.omt0;
import xsna.yc1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ge0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ge0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0269, code lost:
    
        if (r6.simpleQueryForString() == null) goto L70;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        int i;
        List list;
        pni0 pni0Var;
        boolean z = false;
        int i2 = 1;
        switch (this.b) {
            case 0:
                ((ul1) this.c).invoke((b520) this.d);
                return s3q0.a;
            case 1:
                ((izs) this.c).invoke(new yc1.d(((vo1) this.d).b));
                return s3q0.a;
            case 2:
                ((s38) this.c).c.e((FragmentImpl) this.d, MultiAccountEntryPoint.LongTap.d);
                return s3q0.a;
            case 3:
                q49 q49Var = (q49) this.c;
                g49.b bVar = (g49.b) this.d;
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = q49Var.b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().f(bVar);
                }
                return s3q0.a;
            case 4:
                ((com.vk.channels.impl.list.f) this.c).O(new e.n(((g.C0539g) this.d).a));
                return s3q0.a;
            case 5:
                ((ClipsAuthorSelectorAuthorDelegate.a) this.c).l.invoke(((hhd) this.d).b);
                return s3q0.a;
            case 6:
                ArrayList arrayList = (ArrayList) this.c;
                List list2 = (List) this.d;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (!((UIBlock) listIterator.previous()).d.l()) {
                        i = listIterator.nextIndex();
                    }
                }
                Object b0 = j5g.b0(i, arrayList);
                UIBlockHeader uIBlockHeader = b0 instanceof UIBlockHeader ? (UIBlockHeader) b0 : null;
                if (uIBlockHeader != null) {
                    list = list2;
                    arrayList.set(i, new UIBlockHeader(com.vk.catalog2.common.dto.api.ui.a.a(sua.l(uIBlockHeader), null, null, CatalogViewType.SYNTHETIC_SEARCH_MAP_HEADER, null, null, null, 8187), uIBlockHeader.y, uIBlockHeader.z, uIBlockHeader.B, new mwp0(uIBlockHeader.C, uIBlockHeader.D, uIBlockHeader.E, uIBlockHeader.F, uIBlockHeader.G, uIBlockHeader.H, uIBlockHeader.I, uIBlockHeader.J, uIBlockHeader.K, uIBlockHeader.L), uIBlockHeader.A, null, 64, null));
                } else {
                    list = list2;
                }
                return Boolean.valueOf(arrayList.addAll(list));
            case 7:
                k1q k1qVar = (k1q) this.c;
                Event event = (Event) this.d;
                SQLiteStatement sQLiteStatement = (SQLiteStatement) k1qVar.i.getValue();
                sQLiteStatement.clearBindings();
                sQLiteStatement.bindString(1, event.a.c);
                sQLiteStatement.bindLong(2, k1qVar.e);
                sQLiteStatement.bindLong(3, ((Number) k1qVar.f.getValue()).longValue());
                try {
                    break;
                } catch (SQLiteDoneException unused) {
                    break;
                }
            case 8:
                ((yzr) this.c).l.f((xzr) this.d);
                return s3q0.a;
            case 9:
                a1w a1wVar = (a1w) this.c;
                pzv pzvVar = (pzv) this.d;
                StringBuilder sb2 = new StringBuilder("#tryToRecover - already tried to recover with failure. ");
                sb2.append("TriedClearCache=" + a1wVar.d + ", ");
                sb2.append("TriedInMemoryDb=" + a1wVar.e + ", ");
                StringBuilder sb3 = new StringBuilder("dbName=");
                sb3.append(pzvVar.k.get());
                sb2.append(sb3.toString());
                return sb2.toString();
            case 10:
                ((izs) this.c).invoke(((MarketProductCardMainInfo.a) this.d).a);
                return s3q0.a;
            case 11:
                new VkModal(VkModal.Mode.Card, (b.a.C0790b) this.c, null, false, 12).b((Context) this.d, null);
                return s3q0.a;
            case 12:
                ((com.vk.photos.root.photoflow.presentation.b) this.c).C((a.f) this.d);
                return s3q0.a;
            case 13:
                String str = ((bxi.a.C2631a) this.c).b;
                AppCompatActivity appCompatActivity = (AppCompatActivity) this.d;
                d6q0.a.getClass();
                Iterator<ny1> it2 = d6q0.d.iterator();
                while (it2.hasNext()) {
                    it2.next().e();
                }
                if (epx.f(str, "vpn_settings")) {
                    wp80.d(appCompatActivity);
                } else {
                    d6q0.a.getClass();
                    bxi bxiVar = d6q0.b;
                    if (bxiVar != null && (pni0Var = bxiVar.i) != null) {
                        pni0Var.invoke(appCompatActivity, str);
                    }
                }
                return s3q0.a;
            case 14:
                Group group = (Group) this.c;
                com.vk.qrcode.c cVar = (com.vk.qrcode.c) this.d;
                boolean z2 = group.k;
                q76.d(cVar, group, new zhw(group, z2, i2), 2);
                group.k = !z2;
                return s3q0.a;
            case 15:
                SearchCommunitiesOnMapFragment searchCommunitiesOnMapFragment = (SearchCommunitiesOnMapFragment) this.c;
                SearchCommunitiesOnMapFragment.i iVar = (SearchCommunitiesOnMapFragment.i) this.d;
                int i3 = SearchCommunitiesOnMapFragment.e0;
                BottomSheetBehavior<?> bottomSheetBehavior = iVar.d;
                WeakReference<?> weakReference = bottomSheetBehavior.W;
                float f = -1.0f;
                searchCommunitiesOnMapFragment.mo((weakReference == null || weakReference.get() == null) ? -1.0f : bottomSheetBehavior.H(((View) bottomSheetBehavior.W.get()).getTop()));
                searchCommunitiesOnMapFragment.no();
                BottomSheetBehavior<?> bottomSheetBehavior2 = iVar.d;
                WeakReference<?> weakReference2 = bottomSheetBehavior2.W;
                if (weakReference2 != null && weakReference2.get() != null) {
                    f = bottomSheetBehavior2.H(((View) bottomSheetBehavior2.W.get()).getTop());
                }
                searchCommunitiesOnMapFragment.lo(f);
                return s3q0.a;
            case 16:
                vtu vtuVar = (vtu) this.c;
                gzs gzsVar = (gzs) this.d;
                vtuVar.a(0);
                gzsVar.invoke();
                return s3q0.a;
            case 17:
                ((slq0) this.c).a(new UserProfileAction.s.c.a.C1694a(new qca0((VkButton) this.d, 9)));
                return s3q0.a;
            case 18:
                g0r0 g0r0Var = (g0r0) this.c;
                qtd0 qtd0Var = (qtd0) this.d;
                g0r0Var.l.a(qtd0Var.getId().longValue(), qtd0Var.t8());
                return s3q0.a;
            case 19:
                VkSearchView vkSearchView = (VkSearchView) this.c;
                fvr0 fvr0Var = (fvr0) this.d;
                dzp0.a(vkSearchView.getEditView(), "", fvr0Var.n);
                com.vk.movika.sdk.base.observable.a aVar = fvr0Var.m;
                if (aVar != null) {
                    aVar.invoke(new j.l(null));
                }
                return s3q0.a;
            case 20:
                ((izs) this.c).invoke(new VideoLargeListTabletView.c.a(((VideoLargeListTabletView.d) this.d).b));
                return s3q0.a;
            case 21:
                q1t0 q1t0Var = (q1t0) this.c;
                t95 t95Var = (t95) this.d;
                com.vk.repository.internal.repos.stickers.suggests.a aVar2 = t95Var.b;
                izs<Boolean, s3q0> izsVar = t95Var.a;
                boolean a = q1t0Var.a();
                q1t0Var.c(true);
                if (a) {
                    q1t0Var.b(true);
                }
                q1t0Var.f(false);
                q1t0Var.e(false);
                q1t0Var.d(false);
                aVar2.invoke(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                izsVar.invoke(Boolean.FALSE);
                return s3q0.a;
            case 22:
                return VideoProfileCreatorOnboardingItemsView.B((VideoProfileCreatorOnboardingItemsView) this.c, (VideoProfileCreatorOnboardingItemType) this.d);
            default:
                ((izs) this.c).invoke(new omt0.c.b(((vmt0) this.d).b));
                return s3q0.a;
        }
        z = true;
        return Boolean.valueOf(z);
    }

    public /* synthetic */ ge0(ArrayList arrayList, hmg hmgVar, List list) {
        this.b = 6;
        this.c = arrayList;
        this.d = list;
    }
}
