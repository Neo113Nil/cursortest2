package xsna;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ddh;

/* compiled from: CommunityProfilePriorityBlockReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class tsh {
    public final cph a;
    public final Object b;
    public final Object c;

    /* compiled from: CommunityProfilePriorityBlockReducerDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<CommunityProfileState, kdh, CommunityProfileState> {
        @Override // xsna.wzs
        public final CommunityProfileState invoke(CommunityProfileState communityProfileState, kdh kdhVar) {
            return ((tsh) this.receiver).b(communityProfileState, kdhVar);
        }
    }

    /* compiled from: CommunityProfilePriorityBlockReducerDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements wzs<CommunityProfileState, kdh, CommunityProfileState> {
        @Override // xsna.wzs
        public final CommunityProfileState invoke(CommunityProfileState communityProfileState, kdh kdhVar) {
            return ((tsh) this.receiver).b(communityProfileState, kdhVar);
        }
    }

    public tsh(cph cphVar) {
        this.a = cphVar;
        zqf zqfVar = new zqf(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = msy.a(lazyThreadSafetyMode, zqfVar);
        this.c = msy.a(lazyThreadSafetyMode, new defpackage.j(this, 26));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v28, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.util.List<com.vk.dto.common.data.CallProducerButton>] */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.util.ArrayList] */
    public final CommunityProfileState a(CommunityProfileState communityProfileState, d.n nVar) {
        ddh.b c;
        boolean z;
        ddh.b c2;
        ddh.b c3;
        Parcel obtain;
        ddh.b c4;
        ddh.b c5;
        List<CallProducerButton> list;
        boolean z2;
        ddh.b c6;
        ddh.a aVar;
        ddh.a b2;
        ddh.a b3;
        ddh.a b4;
        List<CallProducerButton> list2;
        ArrayList arrayList;
        ddh.a b5;
        ddh.a b6;
        ddh.a b7;
        ddh.a b8;
        ?? r8;
        ddh.a b9;
        ddh.a b10;
        ddh.a b11;
        ddh.a b12;
        kdh kdhVar = communityProfileState.x;
        if (nVar instanceof d.n.b) {
            if (kdhVar != null) {
                boolean z3 = ((d.n.b) nVar).b;
                r5 = kdh.a(kdhVar, null, false, !z3, z3, false, false, 7);
            }
            return b(communityProfileState, r5);
        }
        if (nVar instanceof d.n.a) {
            if (kdhVar != null) {
                boolean z4 = ((d.n.a) nVar).b;
                r5 = kdh.a(kdhVar, null, !z4, false, false, z4, false, 7);
            }
            return b(communityProfileState, r5);
        }
        int i = 10;
        Class<Good> cls = Good.class;
        if (!(nVar instanceof d.n.c.a)) {
            if (!(nVar instanceof d.n.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            d.n.c.b bVar = (d.n.c.b) nVar;
            b bVar2 = ((wsh) this.c.getValue()).a;
            if (bVar instanceof d.n.c.b.a) {
                d.n.c.b.a aVar2 = (d.n.c.b.a) bVar;
                if (kdhVar != null) {
                    ddh.b bVar3 = aVar2.b;
                    String str = bVar3.d;
                    r5 = kdh.a(kdhVar, bVar3, false, false, false, false, !(str == null || str.length() == 0), 99);
                }
                return (CommunityProfileState) bVar2.invoke(communityProfileState, r5);
            }
            if (bVar instanceof d.n.c.b.g) {
                d.n.c.b.g gVar = (d.n.c.b.g) bVar;
                ddh.b a2 = (kdhVar == null || (c6 = kdhVar.c()) == null) ? null : ddh.b.a(c6, gVar.b, null, gVar.c, 46);
                if (kdhVar != null) {
                    if (a2 != null) {
                        String str2 = a2.d;
                        z2 = !(str2 == null || str2.length() == 0);
                    } else {
                        z2 = false;
                    }
                    r5 = kdh.a(kdhVar, a2, false, false, false, false, z2, 3);
                }
                return (CommunityProfileState) bVar2.invoke(communityProfileState, r5);
            }
            if (bVar instanceof d.n.c.b.C1619d) {
                if (kdhVar != null && (c5 = kdhVar.c()) != null) {
                    List<p9h> list3 = c5.a;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    for (p9h p9hVar : list3) {
                        Good good = p9hVar.a;
                        if (0 == good.b) {
                            List<CallProducerButton> list4 = good.n0;
                            if (list4 != null) {
                                List<CallProducerButton> list5 = list4;
                                list = new ArrayList<>(c5g.u(list5, 10));
                                Iterator it = list5.iterator();
                                if (it.hasNext()) {
                                    throw null;
                                }
                            } else {
                                list = EmptyList.b;
                            }
                            Good good2 = p9hVar.a;
                            obtain = Parcel.obtain();
                            try {
                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                Serializer.g gVar2 = new Serializer.g(obtain);
                                gVar2.i0(good2);
                                obtain.setDataPosition(0);
                                Serializer.StreamParcelable G = gVar2.G(cls.getClassLoader());
                                obtain.recycle();
                                Good good3 = (Good) G;
                                good3.n0 = list;
                                p9hVar = new p9h(good3);
                            } finally {
                            }
                        }
                        arrayList2.add(p9hVar);
                    }
                    r5 = kdh.a(communityProfileState.x, ddh.b.a(c5, arrayList2, null, null, 62), false, false, false, false, false, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
                }
                return (CommunityProfileState) bVar2.invoke(communityProfileState, r5);
            }
            if (bVar instanceof d.n.c.b.e) {
                d.n.c.b.e eVar = (d.n.c.b.e) bVar;
                if (kdhVar != null && (c4 = kdhVar.c()) != null) {
                    r5 = kdh.a(communityProfileState.x, ddh.b.a(c4, null, eVar.b, null, 61), false, false, false, false, false, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
                }
                return (CommunityProfileState) bVar2.invoke(communityProfileState, r5);
            }
            if (!(bVar instanceof d.n.c.b.f)) {
                if (!(bVar instanceof d.n.c.b.C1617b)) {
                    if (bVar instanceof d.n.c.b.C1618c) {
                        return (CommunityProfileState) bVar2.invoke(communityProfileState, kdhVar != null ? kdh.a(kdhVar, (kdhVar == null || (c = kdhVar.c()) == null) ? null : ddh.b.a(c, EmptyList.b, null, null, 46), false, true, false, false, false, 3) : null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                d.n.c.b.C1617b c1617b = (d.n.c.b.C1617b) bVar;
                ddh.b a3 = (kdhVar == null || (c2 = kdhVar.c()) == null) ? null : ddh.b.a(c2, j5g.u0(c1617b.b, c2.a), null, c1617b.c, 46);
                if (kdhVar != null) {
                    if (a3 != null) {
                        String str3 = a3.d;
                        z = !(str3 == null || str3.length() == 0);
                    } else {
                        z = false;
                    }
                    r5 = kdh.a(kdhVar, a3, false, false, false, false, z, 3);
                }
                return (CommunityProfileState) bVar2.invoke(communityProfileState, r5);
            }
            d.n.c.b.f fVar = (d.n.c.b.f) bVar;
            if (kdhVar != null && (c3 = kdhVar.c()) != null) {
                List<p9h> list6 = c3.a;
                ArrayList arrayList3 = new ArrayList(c5g.u(list6, 10));
                for (p9h p9hVar2 : list6) {
                    long j = fVar.b;
                    Good good4 = p9hVar2.a;
                    if (j == good4.b) {
                        obtain = Parcel.obtain();
                        try {
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                            Serializer.g gVar3 = new Serializer.g(obtain);
                            gVar3.i0(good4);
                            obtain.setDataPosition(0);
                            Serializer.StreamParcelable G2 = gVar3.G(cls.getClassLoader());
                            obtain.recycle();
                            Good good5 = (Good) G2;
                            good5.J = fVar.c;
                            p9hVar2 = new p9h(good5);
                        } finally {
                        }
                    }
                    arrayList3.add(p9hVar2);
                }
                r5 = kdh.a(communityProfileState.x, ddh.b.a(c3, arrayList3, null, null, 62), false, false, false, false, false, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
            }
            return (CommunityProfileState) bVar2.invoke(communityProfileState, r5);
        }
        d.n.c.a aVar3 = (d.n.c.a) nVar;
        a aVar4 = ((ssh) this.b.getValue()).a;
        if (aVar3 instanceof d.n.c.a.C1614a) {
            return (CommunityProfileState) aVar4.invoke(communityProfileState, kdhVar != null ? kdh.a(kdhVar, ((d.n.c.a.C1614a) aVar3).b, false, false, false, false, false, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE) : null);
        }
        if (aVar3 instanceof d.n.c.a.l) {
            d.n.c.a.l lVar = (d.n.c.a.l) aVar3;
            if (kdhVar != null && (b12 = kdhVar.b()) != null) {
                List<o9h> list7 = b12.a;
                ArrayList arrayList4 = new ArrayList(c5g.u(list7, 10));
                for (o9h o9hVar : list7) {
                    lVar.getClass();
                    arrayList4.add(o9h.l(o9hVar, null, 5));
                }
                r5 = kdh.a(communityProfileState.x, ddh.a.a(b12, arrayList4, null, null, null, null, 254), false, false, false, false, false, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
            }
            return (CommunityProfileState) aVar4.invoke(communityProfileState, r5);
        }
        if (aVar3 instanceof d.n.c.a.j) {
            d.n.c.a.j jVar = (d.n.c.a.j) aVar3;
            return (CommunityProfileState) aVar4.invoke(communityProfileState, kdhVar != null ? kdh.a(kdhVar, (kdhVar == null || (b11 = kdhVar.b()) == null) ? null : ddh.a.a(b11, jVar.b, null, null, null, jVar.c, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), false, false, false, false, false, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) : null);
        }
        if (aVar3 instanceof d.n.c.a.f) {
            d.n.c.a.f fVar2 = (d.n.c.a.f) aVar3;
            return (CommunityProfileState) aVar4.invoke(communityProfileState, kdhVar != null ? kdh.a(kdhVar, (kdhVar == null || (b10 = kdhVar.b()) == null) ? null : ddh.a.a(b10, fVar2.b, fVar2.d, null, null, fVar2.c, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE), false, false, false, false, false, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) : null);
        }
        if (aVar3 instanceof d.n.c.a.e) {
            return (CommunityProfileState) aVar4.invoke(communityProfileState, kdhVar != null ? kdh.a(kdhVar, (kdhVar == null || (b9 = kdhVar.b()) == null) ? null : ddh.a.a(b9, null, ((d.n.c.a.e) aVar3).b, null, null, null, 253), false, false, false, false, false, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) : null);
        }
        if (aVar3 instanceof d.n.c.a.g) {
            d.n.c.a.g gVar4 = (d.n.c.a.g) aVar3;
            if (kdhVar != null && (b8 = kdhVar.b()) != null) {
                List<o9h> list8 = b8.a;
                ArrayList arrayList5 = new ArrayList(c5g.u(list8, 10));
                for (o9h o9hVar2 : list8) {
                    long j2 = gVar4.b;
                    Good good6 = o9hVar2.a;
                    Class<Good> cls2 = cls;
                    if (j2 == good6.b) {
                        List<CallProducerButton> list9 = good6.n0;
                        if (list9 != null) {
                            List<CallProducerButton> list10 = list9;
                            r8 = new ArrayList(c5g.u(list10, 10));
                            Iterator it2 = list10.iterator();
                            while (it2.hasNext()) {
                                r8.add(CallProducerButton.a((CallProducerButton) it2.next(), gVar4.c.h(), null, 4094));
                            }
                        } else {
                            r8 = EmptyList.b;
                        }
                        Good good7 = o9hVar2.a;
                        obtain = Parcel.obtain();
                        try {
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                            Serializer.g gVar5 = new Serializer.g(obtain);
                            gVar5.i0(good7);
                            obtain.setDataPosition(0);
                            Serializer.StreamParcelable G3 = gVar5.G(cls2.getClassLoader());
                            obtain.recycle();
                            Good good8 = (Good) G3;
                            good8.n0 = r8;
                            o9hVar2 = o9h.l(o9hVar2, good8, 6);
                        } finally {
                        }
                    }
                    arrayList5.add(o9hVar2);
                    cls = cls2;
                }
                r5 = kdh.a(communityProfileState.x, ddh.a.a(b8, arrayList5, null, null, null, null, 254), false, false, false, false, false, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
            }
            return (CommunityProfileState) aVar4.invoke(communityProfileState, r5);
        }
        if (aVar3 instanceof d.n.c.a.h) {
            d.n.c.a.h hVar = (d.n.c.a.h) aVar3;
            if (kdhVar != null && (b7 = kdhVar.b()) != null) {
                r5 = kdh.a(communityProfileState.x, ddh.a.a(b7, null, null, hVar.b, null, null, 247), false, false, false, false, false, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
            }
            return (CommunityProfileState) aVar4.invoke(communityProfileState, r5);
        }
        if (aVar3 instanceof d.n.c.a.i) {
            d.n.c.a.i iVar = (d.n.c.a.i) aVar3;
            if (kdhVar != null && (b6 = kdhVar.b()) != null) {
                List<o9h> list11 = b6.a;
                ArrayList arrayList6 = new ArrayList(c5g.u(list11, 10));
                for (o9h o9hVar3 : list11) {
                    long j3 = iVar.b;
                    Good good9 = o9hVar3.a;
                    if (j3 == good9.b) {
                        obtain = Parcel.obtain();
                        try {
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap4 = Serializer.a;
                            Serializer.g gVar6 = new Serializer.g(obtain);
                            gVar6.i0(good9);
                            obtain.setDataPosition(0);
                            Serializer.StreamParcelable G4 = gVar6.G(cls.getClassLoader());
                            obtain.recycle();
                            Good good10 = (Good) G4;
                            good10.J = iVar.c;
                            o9hVar3 = o9h.l(o9hVar3, good10, 6);
                        } finally {
                        }
                    }
                    arrayList6.add(o9hVar3);
                }
                r5 = kdh.a(communityProfileState.x, ddh.a.a(b6, arrayList6, null, null, null, null, 254), false, false, false, false, false, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
            }
            return (CommunityProfileState) aVar4.invoke(communityProfileState, r5);
        }
        if (aVar3 instanceof d.n.c.a.k) {
            d.n.c.a.k kVar = (d.n.c.a.k) aVar3;
            if (kdhVar != null && (b5 = kdhVar.b()) != null) {
                Integer num = b5.f;
                int intValue = (num != null ? num.intValue() : 0) + kVar.b;
                r5 = kdh.a(communityProfileState.x, ddh.a.a(b5, null, null, null, (intValue <= 0 || !Boolean.valueOf(b5.b()).equals(Boolean.FALSE)) ? null : Integer.valueOf(intValue), null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), false, false, false, false, false, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
            }
            return (CommunityProfileState) aVar4.invoke(communityProfileState, r5);
        }
        if (!(aVar3 instanceof d.n.c.a.C1615c)) {
            if (aVar3 instanceof d.n.c.a.b) {
                d.n.c.a.b bVar4 = (d.n.c.a.b) aVar3;
                return (CommunityProfileState) aVar4.invoke(communityProfileState, kdhVar != null ? kdh.a(kdhVar, (kdhVar == null || (b3 = kdhVar.b()) == null) ? null : ddh.a.a(b3, j5g.u0(bVar4.b, b3.a), null, null, null, bVar4.c, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), false, false, false, false, false, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) : null);
            }
            if (!(aVar3 instanceof d.n.c.a.C1616d)) {
                throw new NoWhenBranchMatchedException();
            }
            if (kdhVar == null || (b2 = kdhVar.b()) == null) {
                aVar = null;
            } else {
                EmptyList emptyList = EmptyList.b;
                aVar = ddh.a.a(b2, emptyList, emptyList, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            }
            return (CommunityProfileState) aVar4.invoke(communityProfileState, kdhVar != null ? kdh.a(kdhVar, aVar, false, true, false, false, false, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) : null);
        }
        d.n.c.a.C1615c c1615c = (d.n.c.a.C1615c) aVar3;
        if (kdhVar != null && (b4 = kdhVar.b()) != null) {
            UserId userId = c1615c.b;
            UserId a4 = userId != null ? fkq0.a(userId) : null;
            List<o9h> list12 = b4.a;
            ArrayList arrayList7 = new ArrayList(c5g.u(list12, 10));
            for (o9h o9hVar4 : list12) {
                if (a4 != null) {
                    Good good11 = o9hVar4.a;
                    if (fkq0.a(good11.c).equals(a4) && (list2 = good11.n0) != null) {
                        List<CallProducerButton> list13 = list2;
                        if (!(list13 instanceof Collection) || !list13.isEmpty()) {
                            Iterator it3 = list13.iterator();
                            while (it3.hasNext()) {
                                if (((CallProducerButton) it3.next()).b == 3) {
                                    obtain = Parcel.obtain();
                                    try {
                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap5 = Serializer.a;
                                        Serializer.g gVar7 = new Serializer.g(obtain);
                                        gVar7.i0(good11);
                                        obtain.setDataPosition(0);
                                        Serializer.StreamParcelable G5 = gVar7.G(cls.getClassLoader());
                                        obtain.recycle();
                                        Good good12 = (Good) G5;
                                        List<CallProducerButton> list14 = good11.n0;
                                        if (list14 != null) {
                                            List<CallProducerButton> list15 = list14;
                                            arrayList = new ArrayList(c5g.u(list15, i));
                                            for (CallProducerButton callProducerButton : list15) {
                                                if (callProducerButton.b == 3) {
                                                    callProducerButton = CallProducerButton.a(callProducerButton, 4, null, 4094);
                                                }
                                                arrayList.add(callProducerButton);
                                            }
                                        } else {
                                            arrayList = null;
                                        }
                                        good12.n0 = arrayList;
                                        o9hVar4 = o9h.l(o9hVar4, good12, 6);
                                        arrayList7.add(o9hVar4);
                                        i = 10;
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList7.add(o9hVar4);
                i = 10;
            }
            r5 = kdh.a(communityProfileState.x, ddh.a.a(b4, arrayList7, null, null, null, null, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE), false, false, false, false, false, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);
        }
        return (CommunityProfileState) aVar4.invoke(communityProfileState, r5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CommunityProfileState b(CommunityProfileState communityProfileState, kdh kdhVar) {
        List<r4h> list;
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        if (extendedCommunityProfile != null) {
            list = this.a.a(communityProfileState, extendedCommunityProfile, new frg(kdhVar, 2));
        }
        list = EmptyList.b;
        return CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, null, null, list, null, null, 0, false, null, null, null, 0, kdhVar, null, null, false, 260038655);
    }
}
