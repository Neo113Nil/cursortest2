package xsna;

import android.content.DialogInterface;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.auth.main.AuthStatSender;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockFilter2D;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionEnterEditMode;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.holders.api.CatalogPaginatedListViewHolder;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.channels.api.Channel;
import com.vk.clips.entrypoints.feature.c;
import com.vk.clips.favorites.impl.ui.folders.list.e;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.CheckLinkResponse;
import com.vk.dto.articles.Article;
import com.vk.dto.common.VideoFile;
import com.vk.im.ui.views.WaveFormView;
import com.vk.photos.root.albums.presentation.g;
import com.vk.toggle.Features;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.b7d0;
import xsna.f29;
import xsna.g0v;
import xsna.is5;
import xsna.kea;
import xsna.m99;
import xsna.mwa;
import xsna.oap;
import xsna.rtb0;
import xsna.so3;
import xsna.ta7;
import xsna.tj1;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tl0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tl0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:479:0x0767, code lost:
    
        if (r8 == null) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0796, code lost:
    
        if (r4 != null) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x079c, code lost:
    
        if ((r8 instanceof com.vk.catalog2.common.dto.ui.UIBlockList) == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x079e, code lost:
    
        r3 = ((com.vk.catalog2.common.dto.ui.UIBlockList) r8).y;
        r5 = new java.util.ArrayList();
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x07af, code lost:
    
        if (r3.hasNext() == false) goto L629;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x07b1, code lost:
    
        r7 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x07b7, code lost:
    
        if ((r7 instanceof com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter) == false) goto L631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x07b9, code lost:
    
        r5.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x07bd, code lost:
    
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x07c5, code lost:
    
        if (r3.hasNext() == false) goto L633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x07c7, code lost:
    
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x07d7, code lost:
    
        if (xsna.brm0.v(((com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter) r5).z.b, r2, false) == false) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x07d9, code lost:
    
        r10 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x07dc, code lost:
    
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x07de, code lost:
    
        if (r10 != null) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x07e2, code lost:
    
        r2 = r1.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x07e4, code lost:
    
        if (r2 == null) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x07e6, code lost:
    
        r2.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x07e9, code lost:
    
        r1.B = xsna.eda.c(r4, r10.z.b, new xsna.oap.b(xsna.kea.r(r1)), r1.l, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x07db, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0802, code lost:
    
        if ((r8 instanceof com.vk.catalog2.common.dto.ui.UIBlockFilter2D) == false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0804, code lost:
    
        r8 = (com.vk.catalog2.common.dto.ui.UIBlockFilter2D) r8;
        r3 = r8.y.y;
        r5 = new java.util.ArrayList();
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0817, code lost:
    
        if (r3.hasNext() == false) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0819, code lost:
    
        r7 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x081f, code lost:
    
        if ((r7 instanceof com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter) == false) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0821, code lost:
    
        r5.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0825, code lost:
    
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x082d, code lost:
    
        if (r3.hasNext() == false) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x082f, code lost:
    
        r5 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x083f, code lost:
    
        if (xsna.brm0.v(((com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter) r5).z.b, r2, false) == false) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0843, code lost:
    
        r5 = (com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0845, code lost:
    
        if (r5 != null) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0847, code lost:
    
        r3 = r8.z.y;
        r5 = new java.util.ArrayList();
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0858, code lost:
    
        if (r3.hasNext() == false) goto L645;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x085a, code lost:
    
        r7 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0860, code lost:
    
        if ((r7 instanceof com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter) == false) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0862, code lost:
    
        r5.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0866, code lost:
    
        r3 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x086e, code lost:
    
        if (r3.hasNext() == false) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0870, code lost:
    
        r8 = r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0880, code lost:
    
        if (xsna.brm0.v(((com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter) r8).z.b, r2, false) == false) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0884, code lost:
    
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0883, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0887, code lost:
    
        if (r5 == null) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0889, code lost:
    
        r3 = r5.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x088b, code lost:
    
        if (r3 == null) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x088d, code lost:
    
        r8 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0891, code lost:
    
        if (r8 == null) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0893, code lost:
    
        r2 = r5.z.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x08b3, code lost:
    
        r3 = r1.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x08b5, code lost:
    
        if (r3 == null) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x08b7, code lost:
    
        r3.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x08ba, code lost:
    
        r1.B = xsna.eda.c(r4, r2, new xsna.oap.b(xsna.kea.r(r1)), r1.l, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0898, code lost:
    
        r3 = r1.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x089a, code lost:
    
        if (r3 == null) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x089c, code lost:
    
        r3 = r3.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x089e, code lost:
    
        if (r3 == null) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x08a0, code lost:
    
        r3 = r3.get(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x08a7, code lost:
    
        if (r3 == null) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x08a9, code lost:
    
        r10 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x08ad, code lost:
    
        r2 = xsna.v1v.a('/', r10, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x08ac, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0890, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0842, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x08cb, code lost:
    
        r1 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0792, code lost:
    
        if (r8 == null) goto L525;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0299 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(Object obj) {
        com.vk.lists.c cVar;
        io.reactivex.rxjava3.core.q g;
        UIBlock uIBlock;
        ArrayList<UIBlock> arrayList;
        Object obj2;
        ArrayList<UIBlock> arrayList2;
        Object obj3;
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder;
        Object obj4;
        UIBlockActionEnterEditMode uIBlockActionEnterEditMode;
        List list;
        CatalogPaginatedListViewHolder catalogPaginatedListViewHolder2;
        ArrayList arrayList3;
        List<UIBlockTopshelf.TopshelfItem> list2;
        zda zdaVar;
        boolean z;
        boolean z2;
        boolean z3;
        kea keaVar = (kea) this.c;
        n3a n3aVar = (n3a) obj;
        int i = 4;
        int i2 = 12;
        int i3 = 8;
        if (n3aVar instanceof oon0) {
            UIBlockList uIBlockList = keaVar.l;
            if (uIBlockList != null) {
                oon0 oon0Var = (oon0) n3aVar;
                boolean contains = uIBlockList.h.contains(oon0Var.a);
                hfr j = rli0.j(rli0.j(new i5g(uIBlockList.y), new ka(n3aVar, i2)), new i50(n3aVar, i3));
                Iterator it = j.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    }
                    if (((Boolean) j.c.invoke(it.next())).booleanValue() == j.b) {
                        z3 = true;
                        break;
                    }
                }
                r7 = z3;
                qda s = kea.s(n3aVar);
                if (contains || r7) {
                    kea.w(keaVar, oon0Var.c, s, false, 4);
                }
                s3q0 s3q0Var = s3q0.a;
            }
        } else {
            int i4 = 7;
            Throwable th = null;
            if (n3aVar instanceof mon0) {
                UIBlockList uIBlockList2 = keaVar.l;
                if (uIBlockList2 != null) {
                    ArrayList<UIBlock> arrayList4 = uIBlockList2.y;
                    if (arrayList4 == null || !arrayList4.isEmpty()) {
                        Iterator it2 = arrayList4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (k5a.b((UIBlock) it2.next(), new yx0(n3aVar, 18))) {
                                kea.w(keaVar, false, null, false, 7);
                                break;
                            }
                        }
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                }
            } else if (n3aVar instanceof qon0) {
                UIBlockList uIBlockList3 = keaVar.l;
                if (uIBlockList3 != null) {
                    qon0 qon0Var = (qon0) n3aVar;
                    if (qon0Var.b.invoke(uIBlockList3).booleanValue()) {
                        kea.w(keaVar, false, kea.s(n3aVar), qon0Var.c, 1);
                    }
                    s3q0 s3q0Var3 = s3q0.a;
                }
            } else {
                int i5 = 24;
                if (n3aVar instanceof ron0) {
                    UIBlockList uIBlockList4 = keaVar.l;
                    if (uIBlockList4 != null) {
                        ArrayList<UIBlock> arrayList5 = uIBlockList4.y;
                        if (arrayList5 == null || !arrayList5.isEmpty()) {
                            for (UIBlock uIBlock2 : arrayList5) {
                                ron0 ron0Var = (ron0) n3aVar;
                                boolean contains2 = ron0Var.a.contains(uIBlock2.Fb());
                                UIBlockList uIBlockList5 = uIBlock2 instanceof UIBlockList ? (UIBlockList) uIBlock2 : null;
                                boolean b = uIBlockList5 != null ? p4g.b(ron0Var.a, rli0.C(new ulp0(new i5g(uIBlockList5.y), new c220(i5)))) : false;
                                if (contains2 || b) {
                                    kea.w(keaVar, false, null, false, 7);
                                    break;
                                }
                            }
                        }
                        s3q0 s3q0Var4 = s3q0.a;
                    }
                } else if (n3aVar instanceof lon0) {
                    UIBlockList uIBlockList6 = keaVar.l;
                    if (uIBlockList6 != null) {
                        Iterator it3 = uIBlockList6.y.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                break;
                            }
                            UIBlock uIBlock3 = (UIBlock) it3.next();
                            ((lon0) n3aVar).getClass();
                            if (epx.f(null, uIBlock3.b)) {
                                kea.w(keaVar, false, null, false, 7);
                                break;
                            }
                        }
                        s3q0 s3q0Var5 = s3q0.a;
                    }
                } else {
                    int i6 = 14;
                    if (n3aVar instanceof xxf0) {
                        UIBlockList uIBlockList7 = keaVar.l;
                        if (uIBlockList7 != null) {
                            Iterator it4 = uIBlockList7.y.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z = false;
                                    break;
                                }
                                UIBlock uIBlock4 = (UIBlock) it4.next();
                                if (uIBlock4 instanceof UIBlockList ? rli0.C(new ulp0(new i5g(((UIBlockList) uIBlock4).y), new c220(i5))).contains(((xxf0) n3aVar).a) : epx.f(uIBlock4.Fb(), ((xxf0) n3aVar).a)) {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                UIBlockList zb = uIBlockList7.zb();
                                ArrayList<UIBlock> arrayList6 = zb.y;
                                ArrayList arrayList7 = new ArrayList();
                                int i7 = 0;
                                Object obj5 = null;
                                for (Object obj6 : arrayList6) {
                                    int i8 = i7 + 1;
                                    if (i7 < 0) {
                                        Throwable th2 = th;
                                        e43.t();
                                        throw th2;
                                    }
                                    UIBlock uIBlock5 = (UIBlock) obj6;
                                    boolean z4 = (i8 >= zb.y.size() || !epx.f(zb.y.get(i8).Fb(), ((xxf0) n3aVar).a)) ? false : r7;
                                    int i9 = i7 + 2;
                                    boolean z5 = (i9 >= zb.y.size() || !(zb.y.get(i9) instanceof UIBlockSeparator)) ? false : r7;
                                    Throwable th3 = th;
                                    boolean z6 = z5 || (((i9 >= zb.y.size() || !zb.y.get(i9).e.i()) ? false : r7) && (i8 < zb.y.size() && !zb.y.get(i8).e.i()));
                                    if ((uIBlock5 instanceof UIBlockHeader) && z4 && z6) {
                                        obj5 = z5 ? zb.y.get(i9).Fb() : th3;
                                    } else if (!epx.f(uIBlock5.Fb(), ((xxf0) n3aVar).a) && !epx.f(uIBlock5.Fb(), obj5)) {
                                        z2 = true;
                                        if (!z2) {
                                            arrayList7.add(obj6);
                                        }
                                        i7 = i8;
                                        th = th3;
                                        r7 = true;
                                    }
                                    z2 = false;
                                    if (!z2) {
                                    }
                                    i7 = i8;
                                    th = th3;
                                    r7 = true;
                                }
                                ArrayList<UIBlock> q = p4g.q(arrayList7);
                                zb.y = q;
                                kea.u(q);
                                for (UIBlock uIBlock6 : zb.y) {
                                    if (uIBlock6 instanceof UIBlockList) {
                                        UIBlockList uIBlockList8 = (UIBlockList) uIBlock6;
                                        g5g.D(uIBlockList8.y, true, new d7(n3aVar, i6));
                                        kea.u(uIBlockList8.y);
                                    }
                                }
                                keaVar.q(zb);
                                UIBlockList uIBlockList9 = keaVar.l;
                                if (uIBlockList9 != null) {
                                    zda zdaVar2 = keaVar.s;
                                    if (zdaVar2 != null) {
                                        zdaVar2.k(uIBlockList9);
                                        s3q0 s3q0Var6 = s3q0.a;
                                    }
                                    s3q0 s3q0Var7 = s3q0.a;
                                }
                            }
                            s3q0 s3q0Var8 = s3q0.a;
                        }
                    } else if (n3aVar instanceof lwf0) {
                        UIBlockList uIBlockList10 = keaVar.l;
                        if (uIBlockList10 != null) {
                            List<String> list3 = ((lwf0) n3aVar).a;
                            UIBlockList zb2 = uIBlockList10.zb();
                            g5g.D(zb2.y, true, new sa(list3, 16));
                            keaVar.q(zb2);
                            UIBlockList uIBlockList11 = keaVar.l;
                            if (uIBlockList11 != null && (zdaVar = keaVar.s) != null) {
                                zdaVar.k(uIBlockList11);
                            }
                            s3q0 s3q0Var9 = s3q0.a;
                        }
                    } else {
                        int i10 = 3;
                        if (n3aVar instanceof buz) {
                            UIBlockList uIBlockList12 = keaVar.l;
                            if (uIBlockList12 != null) {
                                buz buzVar = (buz) n3aVar;
                                if (buzVar.a.invoke(uIBlockList12).booleanValue() && (!buzVar.c || !keaVar.L)) {
                                    com.vk.movika.sdk.base.ui.s0 s0Var = new com.vk.movika.sdk.base.ui.s0(i, n3aVar, keaVar);
                                    if (buzVar.d) {
                                        UIBlockList zb3 = uIBlockList12.zb();
                                        mea meaVar = new mea(1, s0Var, izs.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 8, 0);
                                        io.reactivex.rxjava3.disposables.c cVar2 = keaVar.C;
                                        if (cVar2 != null) {
                                            cVar2.dispose();
                                        }
                                        ArrayList<UIBlock> arrayList8 = zb3.y;
                                        ArrayList arrayList9 = new ArrayList();
                                        for (Object obj7 : arrayList8) {
                                            if (obj7 instanceof UIBlockTopshelf) {
                                                arrayList9.add(obj7);
                                            }
                                        }
                                        UIBlockTopshelf uIBlockTopshelf = (UIBlockTopshelf) j5g.a0(arrayList9);
                                        if (uIBlockTopshelf == null || (list2 = uIBlockTopshelf.y) == null) {
                                            arrayList3 = null;
                                        } else {
                                            ArrayList arrayList10 = new ArrayList();
                                            for (Object obj8 : list2) {
                                                if (obj8 instanceof UIBlockTopshelf.TopshelfLive) {
                                                    arrayList10.add(obj8);
                                                }
                                            }
                                            arrayList3 = new ArrayList();
                                            Iterator it5 = arrayList10.iterator();
                                            while (it5.hasNext()) {
                                                VideoFile videoFile = ((UIBlockTopshelf.TopshelfLive) it5.next()).c;
                                                String a1 = videoFile != null ? videoFile.a1() : null;
                                                if (a1 != null) {
                                                    arrayList3.add(a1);
                                                }
                                            }
                                        }
                                        if (uIBlockTopshelf == null || arrayList3 == null || arrayList3.isEmpty()) {
                                            meaVar.invoke(zb3);
                                        } else {
                                            keaVar.C = rsg0.y0(yfb.x(tft0.s(new uft0(), arrayList3, null, 14)), null, null, 3).subscribe(new y50(new iea(keaVar, uIBlockTopshelf, zb3, meaVar), i4), new st0(new com.vk.im.engine.commands.messages.a(5, meaVar, zb3), i10));
                                        }
                                        s3q0 s3q0Var10 = s3q0.a;
                                    } else {
                                        s0Var.invoke(uIBlockList12.zb());
                                    }
                                }
                                s3q0 s3q0Var11 = s3q0.a;
                            }
                        } else if (n3aVar instanceof t8f0) {
                            UIBlockList uIBlockList13 = keaVar.l;
                            if (uIBlockList13 != null) {
                                t8f0 t8f0Var = (t8f0) n3aVar;
                                if (t8f0Var.a.invoke(uIBlockList13).booleanValue() && (catalogPaginatedListViewHolder2 = keaVar.c) != null) {
                                    catalogPaginatedListViewHolder2.Bl(t8f0Var.b);
                                    s3q0 s3q0Var12 = s3q0.a;
                                }
                                s3q0 s3q0Var13 = s3q0.a;
                            }
                        } else if (n3aVar instanceof qd3) {
                            CatalogPaginatedListViewHolder catalogPaginatedListViewHolder3 = keaVar.c;
                            if (catalogPaginatedListViewHolder3 != null) {
                                List<ozf0> gi = catalogPaginatedListViewHolder3.gi();
                                if (!gi.isEmpty()) {
                                    final List<ozf0> list4 = gi;
                                    UIBlockList uIBlockList14 = keaVar.l;
                                    if (uIBlockList14 == null || (list = uIBlockList14.y) == null) {
                                        list = EmptyList.b;
                                    }
                                    ArrayList a = i7o0.a(list);
                                    ArrayList arrayList11 = new ArrayList();
                                    for (Object obj9 : list4) {
                                        ozf0 ozf0Var = (ozf0) obj9;
                                        if (!epx.f(ozf0Var.a, ozf0Var.b)) {
                                            arrayList11.add(obj9);
                                        }
                                    }
                                    Iterator it6 = arrayList11.iterator();
                                    while (it6.hasNext()) {
                                        ozf0 ozf0Var2 = (ozf0) it6.next();
                                        Iterator it7 = list.iterator();
                                        int i11 = 0;
                                        while (true) {
                                            if (!it7.hasNext()) {
                                                i11 = -1;
                                                break;
                                            }
                                            if (epx.f(((UIBlock) it7.next()).Fb(), ozf0Var2.a)) {
                                                break;
                                            }
                                            i11++;
                                        }
                                        Iterator it8 = list.iterator();
                                        int i12 = 0;
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                i12 = -1;
                                                break;
                                            }
                                            if (epx.f(((UIBlock) it8.next()).Fb(), ozf0Var2.b)) {
                                                break;
                                            }
                                            i12++;
                                        }
                                        i9x q2 = i11 < i12 ? swe0.q(i11, i12) : swe0.m(i11, i12 + 1);
                                        int i13 = i11 < i12 ? 1 : -1;
                                        int i14 = q2.b;
                                        int i15 = q2.c;
                                        int i16 = q2.d;
                                        if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                                            while (true) {
                                                Collections.swap(list, i14, i14 + i13);
                                                if (i14 != i15) {
                                                    i14 += i16;
                                                }
                                            }
                                        }
                                    }
                                    catalogPaginatedListViewHolder3.um();
                                    final vd7 vd7Var = keaVar.j;
                                    qd3 qd3Var = (qd3) n3aVar;
                                    String str = qd3Var.a;
                                    final UIBlock uIBlock7 = qd3Var.b;
                                    new io.reactivex.rxjava3.internal.operators.observable.a0(rsg0.y0(vd7Var.f(str, list4, uIBlock7), null, null, 3).F(new jz(new iz(new mp3(i10, keaVar, a), 9), i4)), new io.reactivex.rxjava3.functions.a() { // from class: xsna.zca
                                        @Override // io.reactivex.rxjava3.functions.a
                                        public final void run() {
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                            for (ozf0 ozf0Var3 : list4) {
                                                String str2 = ozf0Var3.a;
                                                String str3 = ozf0Var3.b;
                                                linkedHashSet.add(str2);
                                                linkedHashSet.add(str3);
                                                if (epx.f(str2, str3)) {
                                                    linkedHashSet2.add(str2);
                                                }
                                            }
                                            q3a q3aVar = (q3a) vd7Var.b;
                                            UIBlock uIBlock8 = uIBlock7;
                                            q3aVar.b(uIBlock8 == null ? new ron0(linkedHashSet, linkedHashSet2) : new qon0(5, null, new ku1(7, linkedHashSet, uIBlock8)), false);
                                        }
                                    }).subscribe();
                                }
                                s3q0 s3q0Var14 = s3q0.a;
                            }
                        } else if (n3aVar instanceof non0) {
                            keaVar.l = ((non0) n3aVar).a;
                            com.vk.lists.c cVar3 = keaVar.d;
                            if (cVar3 != null) {
                                cVar3.d();
                            }
                            s3q0 s3q0Var15 = s3q0.a;
                        } else {
                            int i17 = 2;
                            if (n3aVar instanceof zra) {
                                CatalogPaginatedListViewHolder catalogPaginatedListViewHolder4 = keaVar.c;
                                UIBlockList uIBlockList15 = keaVar.l;
                                String str2 = (uIBlockList15 == null || (uIBlockActionEnterEditMode = uIBlockList15.C) == null) ? null : uIBlockActionEnterEditMode.b;
                                if (catalogPaginatedListViewHolder4 != null && str2 != null) {
                                    zra zraVar = (zra) n3aVar;
                                    int i18 = kea.c.$EnumSwitchMapping$0[zraVar.a.ordinal()];
                                    if (i18 == 1) {
                                        keaVar.L = true;
                                        UIBlockList uIBlockList16 = keaVar.l;
                                        if (epx.f(uIBlockList16 != null ? uIBlockList16.b : null, str2)) {
                                            catalogPaginatedListViewHolder4.n(zraVar.a);
                                            s3q0 s3q0Var16 = s3q0.a;
                                        }
                                    } else if (i18 == 2) {
                                        keaVar.L = false;
                                        catalogPaginatedListViewHolder4.um();
                                        catalogPaginatedListViewHolder4.n(zraVar.a);
                                        s3q0 s3q0Var17 = s3q0.a;
                                    } else {
                                        if (i18 != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        keaVar.L = false;
                                        catalogPaginatedListViewHolder4.um();
                                        catalogPaginatedListViewHolder4.n(zraVar.a);
                                        UIBlockList uIBlockList17 = keaVar.l;
                                        if (uIBlockList17 != null) {
                                            keaVar.l = null;
                                            keaVar.q(uIBlockList17);
                                            s3q0 s3q0Var18 = s3q0.a;
                                        }
                                    }
                                    s3q0 s3q0Var19 = s3q0.a;
                                }
                            } else if (n3aVar instanceof ltf0) {
                                UIBlockList uIBlockList18 = keaVar.l;
                                if (uIBlockList18 != null && k5a.b(uIBlockList18, new ay0(n3aVar, 17))) {
                                    ltf0 ltf0Var = (ltf0) n3aVar;
                                    keaVar.g.c(ltf0Var.b);
                                    if (ltf0Var.c) {
                                        Serializer.c<UIBlockList> cVar4 = UIBlockList.CREATOR;
                                        keaVar.q(UIBlockList.a.a());
                                    }
                                    com.vk.lists.c cVar5 = keaVar.d;
                                    if (cVar5 != null) {
                                        cVar5.d();
                                    }
                                }
                                s3q0 s3q0Var20 = s3q0.a;
                            } else if (n3aVar instanceof ktf0) {
                                UIBlockList uIBlockList19 = keaVar.l;
                                if (uIBlockList19 != null && k5a.b(uIBlockList19, new fm0(n3aVar, i2))) {
                                    keaVar.o();
                                }
                                s3q0 s3q0Var21 = s3q0.a;
                            } else if (n3aVar instanceof u0g0) {
                                UIBlockList uIBlockList20 = keaVar.l;
                                if (uIBlockList20 != null) {
                                    String str3 = (String) ((u0g0) n3aVar).a.invoke(uIBlockList20);
                                    if (str3 != null) {
                                        eda edaVar = keaVar.q;
                                        keaVar.B = edaVar != null ? eda.c(edaVar, str3, new oap.b(new gea(keaVar, false)), uIBlockList20, 8) : null;
                                    }
                                    s3q0 s3q0Var22 = s3q0.a;
                                }
                            } else if (n3aVar instanceof v0g0) {
                                UIBlockList uIBlockList21 = keaVar.l;
                                if (uIBlockList21 != null) {
                                    v0g0 v0g0Var = (v0g0) n3aVar;
                                    String str4 = v0g0Var.a.c;
                                    t62 t62Var = new t62(str4, i17);
                                    Iterator it9 = uIBlockList21.y.iterator();
                                    while (true) {
                                        if (!it9.hasNext()) {
                                            obj4 = null;
                                            break;
                                        }
                                        obj4 = it9.next();
                                        if (((Boolean) t62Var.invoke((UIBlock) obj4)).booleanValue()) {
                                            break;
                                        }
                                    }
                                    if (obj4 != null) {
                                        eda edaVar2 = keaVar.q;
                                        keaVar.B = edaVar2 != null ? eda.c(edaVar2, str4, new oap.a(v0g0Var.b), null, 12) : null;
                                    }
                                    s3q0 s3q0Var23 = s3q0.a;
                                }
                            } else if (n3aVar instanceof cer) {
                                UIBlockList uIBlockList22 = keaVar.l;
                                if (uIBlockList22 != null) {
                                    cer cerVar = (cer) n3aVar;
                                    if (cerVar.e.invoke(uIBlockList22).booleanValue()) {
                                        if (cerVar.d && (catalogPaginatedListViewHolder = keaVar.c) != null) {
                                            catalogPaginatedListViewHolder.t();
                                            s3q0 s3q0Var24 = s3q0.a;
                                        }
                                        io.reactivex.rxjava3.disposables.c cVar6 = keaVar.B;
                                        if (cVar6 != null) {
                                            cVar6.dispose();
                                            s3q0 s3q0Var25 = s3q0.a;
                                        }
                                        eda edaVar3 = keaVar.q;
                                        keaVar.B = edaVar3 != null ? edaVar3.b(cerVar.a, new oap.b(new gea(keaVar, cerVar.c)), uIBlockList22, cerVar.b) : null;
                                    }
                                    s3q0 s3q0Var26 = s3q0.a;
                                }
                            } else if (n3aVar instanceof ber) {
                                Features.Type type = Features.Type.FEATURE_VIDEO_CATALOG_NEW_FILTER_SWITCH;
                                type.getClass();
                                if (!com.vk.toggle.b.A.a(type)) {
                                    return s3q0.a;
                                }
                                UIBlockList uIBlockList23 = keaVar.l;
                                if (uIBlockList23 != null) {
                                    String str5 = ((ber) n3aVar).a;
                                    eda edaVar4 = keaVar.q;
                                    if (uIBlockList23 != null && (arrayList2 = uIBlockList23.y) != null) {
                                        Iterator it10 = arrayList2.iterator();
                                        loop16: while (true) {
                                            if (!it10.hasNext()) {
                                                obj3 = null;
                                                break;
                                            }
                                            obj3 = it10.next();
                                            UIBlock uIBlock8 = (UIBlock) obj3;
                                            if ((uIBlock8 instanceof UIBlockList) && uIBlock8.d == CatalogViewType.SLIDER) {
                                                ArrayList<UIBlock> arrayList12 = ((UIBlockList) uIBlock8).y;
                                                if (arrayList12 != null && arrayList12.isEmpty()) {
                                                    break;
                                                }
                                                Iterator it11 = arrayList12.iterator();
                                                while (it11.hasNext()) {
                                                    if (!(((UIBlock) it11.next()) instanceof UIBlockActionFilter)) {
                                                        break;
                                                    }
                                                }
                                                break loop16;
                                            }
                                        }
                                        uIBlock = (UIBlock) obj3;
                                    }
                                    UIBlockList uIBlockList24 = keaVar.l;
                                    if (uIBlockList24 == null || (arrayList = uIBlockList24.y) == null) {
                                        uIBlock = null;
                                    } else {
                                        Iterator it12 = arrayList.iterator();
                                        while (true) {
                                            if (!it12.hasNext()) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = it12.next();
                                            UIBlock uIBlock9 = (UIBlock) obj2;
                                            if ((uIBlock9 instanceof UIBlockFilter2D) && uIBlock9.d == CatalogViewType.SLIDER) {
                                                break;
                                            }
                                        }
                                        uIBlock = (UIBlock) obj2;
                                    }
                                }
                            } else if (n3aVar instanceof v1i0) {
                                UIBlockList uIBlockList25 = keaVar.l;
                                if (epx.f(uIBlockList25 != null ? uIBlockList25.b : null, ((v1i0) n3aVar).a) && (cVar = keaVar.d) != null && (g = cVar.g(keaVar.g.b(), true, true)) != null) {
                                    asu0 asu0Var = asu0.a;
                                    new io.reactivex.rxjava3.internal.operators.observable.n1(new io.reactivex.rxjava3.internal.operators.observable.a0(g.r0(asu0Var.c()).a0(asu0Var.d()), new hea(0, n3aVar, keaVar)), io.reactivex.rxjava3.internal.functions.a.g).subscribe();
                                }
                                s3q0 s3q0Var27 = s3q0.a;
                            } else if (n3aVar instanceof jwp0) {
                                UIBlockList uIBlockList26 = keaVar.l;
                                if (uIBlockList26 != null) {
                                    int i19 = 0;
                                    for (Object obj10 : uIBlockList26.y) {
                                        int i20 = i19 + 1;
                                        if (i19 < 0) {
                                            e43.t();
                                            throw null;
                                        }
                                        jwp0 jwp0Var = (jwp0) n3aVar;
                                        uIBlockList26.y.set(i19, jwp0Var.b.invoke((UIBlock) obj10, jwp0Var.a));
                                        i19 = i20;
                                    }
                                    keaVar.i.b.e.b(new t8f0(new xx0(i3), false), false);
                                    s3q0 s3q0Var28 = s3q0.a;
                                }
                            } else {
                                s3q0 s3q0Var29 = s3q0.a;
                            }
                        }
                    }
                }
            }
        }
        return s3q0.a;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = 14;
        int i2 = 3;
        int i3 = 0;
        switch (this.b) {
            case 0:
                AddLinkPresenter addLinkPresenter = (AddLinkPresenter) this.c;
                CheckLinkResponse checkLinkResponse = (CheckLinkResponse) obj;
                boolean z = checkLinkResponse.b;
                ActionLink actionLink = checkLinkResponse.d;
                if (z) {
                    cm0 cm0Var = addLinkPresenter.e;
                    (cm0Var != null ? cm0Var : null).dismiss();
                    if (actionLink != null && !addLinkPresenter.b) {
                        addLinkPresenter.b = true;
                        dm0 dm0Var = addLinkPresenter.g;
                        if (dm0Var != null) {
                            dm0Var.b(actionLink);
                        }
                    }
                } else {
                    wux wuxVar = addLinkPresenter.l;
                    if (wuxVar == null) {
                        wuxVar = null;
                    }
                    vux vuxVar = wuxVar.b;
                    if (vuxVar == null) {
                        vuxVar = null;
                    }
                    vuxVar.setValid(false);
                    cm0 cm0Var2 = addLinkPresenter.e;
                    (cm0Var2 != null ? cm0Var2 : null).h(R.string.collection_link_not_valid);
                }
                return s3q0.a;
            case 1:
                rtb0.a aVar = (rtb0.a) obj;
                b7d0.a invoke = ((np0) this.c).e.invoke();
                if (invoke != null) {
                    invoke.b0(aVar.a);
                }
                return s3q0.a;
            case 2:
                oj1 oj1Var = (oj1) this.c;
                wia0 wia0Var = (wia0) obj;
                wf90 wf90Var = oj1Var.h;
                boolean z2 = !wia0Var.a.isEmpty();
                com.vk.lists.c cVar = wf90Var.b;
                if (cVar != null) {
                    cVar.r(z2);
                }
                com.vk.lists.c cVar2 = wf90Var.b;
                if (cVar2 != null) {
                    cVar2.q(cVar2.k() + cVar2.i());
                }
                oj1Var.T(new tj1.a.c(wia0Var));
                return s3q0.a;
            case 3:
                return new g.c(((tj50.a) obj).a(new lp1((com.vk.photos.root.albums.presentation.e) this.c, 0), ao8.d));
            case 4:
                ((reb) this.c).c();
                return s3q0.a;
            case 5:
                so3.a aVar2 = (so3.a) this.c;
                Article article = aVar2.q;
                if (article != null) {
                    aVar2.l.a(article);
                }
                return s3q0.a;
            case 6:
                final ju3 ju3Var = (ju3) this.c;
                g0v g0vVar = ((iyu0) obj).f;
                if (epx.f(g0vVar, g0v.b.a)) {
                    ju3Var.h(true);
                } else {
                    if (!(g0vVar instanceof g0v.a) && !(g0vVar instanceof g0v.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FragmentActivity fragmentActivity = (FragmentActivity) ju3Var.c.invoke();
                    if (fragmentActivity != null) {
                        d.a aVar3 = new d.a(fragmentActivity);
                        aVar3.a.m = false;
                        aVar3.c(R.string.vk_permissions_go_to_settings_empty);
                        aVar3.j(fragmentActivity.getString(R.string.vk_permissions_go_to_settings_positive), new hu3(ju3Var, i3));
                        aVar3.f(fragmentActivity.getString(R.string.vk_permissions_go_to_settings_negative), new DialogInterface.OnClickListener() { // from class: xsna.iu3
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                ju3.this.h(false);
                            }
                        });
                        aVar3.m();
                    }
                }
                return s3q0.a;
            case 7:
                byte[] bArr = (byte[]) obj;
                WaveFormView waveFormView = ((pv4) this.c).k;
                (waveFormView != null ? waveFormView : null).c(bArr.length, bArr);
                return s3q0.a;
            case 8:
                ((fh5) this.c).S0(((gmq) obj).X());
                return s3q0.a;
            case 9:
                is5 is5Var = (is5) this.c;
                ((zak0) is5Var.h).setValue((is5.a) is5Var.c.get((String) obj));
                return s3q0.a;
            case 10:
                ((d06) this.c).b.lo(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 11:
                ((f56) this.c).invoke();
                return s3q0.a;
            case 12:
                ((com.vk.auth.verification.base.b) this.c).e.a(AuthStatSender.Screen.PHONE_CODE);
                return s3q0.a;
            case 13:
                ((ma7) this.c).T(new ta7.c.a((Throwable) obj));
                return s3q0.a;
            case 14:
                gp7 gp7Var = (gp7) this.c;
                gp7Var.i.c = true;
                ((izs) ((zak0) gp7Var.c).getValue()).invoke((String) obj);
                return s3q0.a;
            case 15:
                ((wak0) ((o48) this.c).i).C((int) ((Float) obj).floatValue());
                return s3q0.a;
            case 16:
                return rsg0.y0(new ros(), null, null, 3).L(new lp0(new com.vk.movika.sdk.base.hooks.p((dg8) this.c, 15), 7), false);
            case 17:
                ((z19) this.c).T(new f29.c(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 18:
                m99 m99Var = (m99) this.c;
                m99.a aVar4 = (m99.a) obj;
                if (aVar4.a != 0) {
                    m99Var.d(new h5(aVar4, i));
                }
                return s3q0.a;
            case 19:
                VideoFile videoFile = (VideoFile) this.c;
                UIBlock uIBlock = ((tca) obj).n;
                UIBlockVideo uIBlockVideo = uIBlock instanceof UIBlockVideo ? (UIBlockVideo) uIBlock : null;
                return Boolean.valueOf(epx.f(uIBlockVideo != null ? uIBlockVideo.B : null, videoFile));
            case 20:
                CatalogGetAudioSearchRequestFactory catalogGetAudioSearchRequestFactory = (CatalogGetAudioSearchRequestFactory) this.c;
                CatalogCatalogResponseObjectDto catalogCatalogResponseObjectDto = (CatalogCatalogResponseObjectDto) obj;
                SearchRequestFactory.a aVar5 = catalogGetAudioSearchRequestFactory.d;
                if (aVar5 == CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.SearchInService || aVar5 == CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.SearchInServiceKids) {
                    catalogGetAudioSearchRequestFactory.j().getClass();
                    return e3a.b(catalogCatalogResponseObjectDto);
                }
                catalogGetAudioSearchRequestFactory.j().getClass();
                return e3a.c(catalogCatalogResponseObjectDto);
            case 21:
                return a(obj);
            case 22:
                ((mwa) this.c).d = (mwa.a) obj;
                return s3q0.a;
            case 23:
                ((lxa) this.c).d.onNext((Channel) obj);
                return s3q0.a;
            case 24:
                ((qrb) this.c).a.b();
                return s3q0.a;
            case 25:
                return new zy9((ViewGroup) obj, ((y5c) this.c).i);
            case 26:
                if (((AtomicInteger) this.c).incrementAndGet() > 3) {
                    return io.reactivex.rxjava3.core.g.e(new RuntimeException("max retry count reached"));
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                int i4 = io.reactivex.rxjava3.core.g.b;
                return io.reactivex.rxjava3.core.g.p(5L, timeUnit, io.reactivex.rxjava3.schedulers.a.a());
            case 27:
                return ((thd) this.c).g().w();
            case 28:
                com.vk.clips.entrypoints.feature.b bVar = (com.vk.clips.entrypoints.feature.b) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean z3 = !booleanValue;
                if (!booleanValue) {
                    bVar.f.getClass();
                    nsd nsdVar = fvr.c;
                    i3 = nsdVar != null ? nsdVar.b() : (int) Preference.m(0L, "clips_draft_prefs", "unseen_drafts_pref");
                }
                bVar.T(new c.f(z3, i3));
                return s3q0.a;
            default:
                tj50.a aVar6 = (tj50.a) obj;
                n1d n1dVar = new n1d((com.vk.clips.favorites.impl.ui.folders.list.d) this.c, i2);
                ao8 ao8Var = ao8.d;
                return new e.a(aVar6.a(n1dVar, ao8Var), aVar6.a(new c2(i), ao8Var));
        }
    }
}
