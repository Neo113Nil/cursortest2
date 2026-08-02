package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.profile.Address;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.stories.design.view.stats.tabs.stickers.mvi.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.cvd0;
import xsna.ig3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ii3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ii3(com.vk.billing.h hVar, boolean z, ner0 ner0Var) {
        this.b = 4;
        this.c = hVar;
        this.d = z;
        this.e = ner0Var;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int size;
        CommunityProfileContentItem.State state;
        int i;
        ArrayList arrayList;
        cvd0.e eVar;
        CommunityProfileContentItem.ContentType contentType;
        String str;
        boolean z;
        boolean z2;
        String str2;
        CommunityProfileContentItem.State state2;
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.c;
                ki3 ki3Var = (ki3) this.e;
                boolean z3 = this.d;
                VKList vKList = (VKList) obj;
                String j = vKList.j();
                boolean z4 = (j == null || j.length() == 0 || epx.f(vKList.j(), "0")) ? false : true;
                cVar.s(vKList.j());
                cVar.r(z4);
                ki3Var.d.invoke(new ig3.a(vKList, !z4, z3));
                return s3q0.a;
            case 1:
                com.vk.lists.c cVar2 = (com.vk.lists.c) this.c;
                vqg vqgVar = (vqg) this.e;
                boolean z5 = this.d;
                List list = (List) obj;
                if (((Boolean) vqgVar.h.getValue()).booleanValue()) {
                    trg trgVar = vqgVar.g;
                    if (trgVar == null) {
                        trgVar = null;
                    }
                    size = trgVar.h;
                } else {
                    trg trgVar2 = vqgVar.g;
                    if (trgVar2 == null) {
                        trgVar2 = null;
                    }
                    size = trgVar2.e.size();
                }
                cVar2.l(size);
                CommunityAddressesFragment communityAddressesFragment = vqgVar.c;
                crg crgVar = communityAddressesFragment.T;
                if (crgVar != null) {
                    ArrayList<Address> arrayList2 = crgVar.d;
                    if (z5) {
                        arrayList2.clear();
                    }
                    if (list != null) {
                        arrayList2.addAll(list);
                        crgVar.notifyDataSetChanged();
                    }
                }
                crg crgVar2 = communityAddressesFragment.T;
                if (crgVar2 != null) {
                    RecyclerView recyclerView = communityAddressesFragment.V;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    crgVar2.x0(recyclerView, communityAddressesFragment.D0);
                }
                communityAddressesFragment.g0 = true;
                CommunityAddressesFragment.g gVar = communityAddressesFragment.S;
                (gVar != null ? gVar : null).e();
                return s3q0.a;
            case 2:
                h3t h3tVar = (h3t) this.e;
                com.vk.lists.c cVar3 = (com.vk.lists.c) this.c;
                boolean z6 = this.d;
                List<? extends MediaStoreEntry> list2 = (List) obj;
                if (h3tVar.g) {
                    ArrayList u0 = j5g.u0(list2, h3tVar.i);
                    h3tVar.i = u0;
                    if (h3tVar.h) {
                        int size2 = u0.size();
                        AlbumEntry albumEntry = (AlbumEntry) h3tVar.f.get();
                        int i2 = albumEntry != null ? albumEntry.f : 0;
                        if (cVar3.i == null) {
                            throw new IllegalStateException("You shouldn't call incrementPageForStream with pagedDataProviderWithStartFrom");
                        }
                        if (cVar3.f) {
                            ktp0 ktp0Var = cVar3.d;
                            synchronized (ktp0Var) {
                                try {
                                    if (ktp0Var.i() + size2 >= i2) {
                                        ktp0Var.f(null);
                                    } else {
                                        ktp0Var.e(ktp0Var.i() + size2);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                    cVar3.r(false);
                } else {
                    h3tVar.i = list2;
                    AlbumEntry albumEntry2 = (AlbumEntry) h3tVar.f.get();
                    cVar3.l(albumEntry2 != null ? albumEntry2.f : 0);
                    cVar3.r(true);
                }
                h3tVar.e.b(list2, z6, h3tVar.k);
                h3tVar.k = false;
                return s3q0.a;
            case 3:
                dcc0 dcc0Var = (dcc0) this.e;
                boolean z7 = this.d;
                com.vk.lists.c cVar4 = (com.vk.lists.c) this.c;
                List list3 = (List) obj;
                AlbumEntry albumEntry3 = (AlbumEntry) j5g.b0(dcc0Var.j, dcc0Var.k);
                if (albumEntry3 == null) {
                    return s3q0.a;
                }
                if (z7) {
                    dcc0Var.i.put(albumEntry3, EmptyList.b);
                }
                Object obj2 = dcc0Var.i.get(albumEntry3);
                if (obj2 == null) {
                    obj2 = EmptyList.b;
                }
                ArrayList u02 = j5g.u0(list3, (List) obj2);
                dcc0Var.i.put(albumEntry3, u02);
                boolean z8 = albumEntry3.f > u02.size();
                if (z8) {
                    cVar4.q(u02.size());
                }
                cVar4.r(z8);
                PostingAttachGalleryFragment postingAttachGalleryFragment = dcc0Var.b;
                ArrayList arrayList3 = new ArrayList(u02);
                ik90 ik90Var = dcc0Var.d;
                if (ik90Var != null && PermissionHelper.o(ik90Var.b)) {
                    arrayList3.add(0, jk90.a);
                }
                if (dcc0Var.j == 0) {
                    arrayList3.add(0, x2t.a);
                }
                postingAttachGalleryFragment.ko(arrayList3, dcc0Var.j == 0);
                return s3q0.a;
            case 4:
                com.vk.billing.h hVar = (com.vk.billing.h) this.c;
                boolean z9 = this.d;
                ner0 ner0Var = (ner0) this.e;
                Throwable th2 = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.w(l, L.LogType.e, th2, new Object[]{"Billing : PurchasesManager", "Error during #consumePurchase"}, null, null, 24);
                }
                hVar.a(z9, ner0Var, th2);
                return s3q0.a;
            case 5:
                boolean z10 = this.d;
                com.vk.lists.c cVar5 = (com.vk.lists.c) this.c;
                ghm0 ghm0Var = (ghm0) this.e;
                VKList vKList2 = (VKList) obj;
                if (z10) {
                    cVar5.q(0);
                }
                cVar5.r(vKList2.size() + cVar5.i() < vKList2.i());
                cVar5.q(cVar5.k() + cVar5.i());
                ghm0Var.c.invoke(new a.c.i(vKList2, z10));
                return s3q0.a;
            default:
                boq0 boq0Var = (boq0) this.c;
                sst0 sst0Var = (sst0) this.e;
                if (this.d) {
                    state2 = CommunityProfileContentItem.State.ERROR;
                    state = null;
                    i = 31743;
                    arrayList = null;
                    eVar = null;
                    contentType = null;
                    str = null;
                    z = false;
                    z2 = false;
                    str2 = null;
                } else {
                    state = CommunityProfileContentItem.State.ERROR;
                    i = 28671;
                    arrayList = null;
                    eVar = null;
                    contentType = null;
                    str = null;
                    z = false;
                    z2 = false;
                    str2 = null;
                    state2 = null;
                }
                boq0Var.D(sst0.i(sst0Var, arrayList, eVar, contentType, str, z, z2, str2, state2, state, i));
                return s3q0.a;
        }
    }

    public /* synthetic */ ii3(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.c = obj;
        this.e = obj2;
        this.d = z;
    }

    public /* synthetic */ ii3(h3t h3tVar, com.vk.lists.c cVar, boolean z) {
        this.b = 2;
        this.e = h3tVar;
        this.c = cVar;
        this.d = z;
    }

    public /* synthetic */ ii3(dcc0 dcc0Var, boolean z, com.vk.lists.c cVar) {
        this.b = 3;
        this.e = dcc0Var;
        this.d = z;
        this.c = cVar;
    }

    public /* synthetic */ ii3(boolean z, com.vk.lists.c cVar, ghm0 ghm0Var) {
        this.b = 5;
        this.d = z;
        this.c = cVar;
        this.e = ghm0Var;
    }
}
