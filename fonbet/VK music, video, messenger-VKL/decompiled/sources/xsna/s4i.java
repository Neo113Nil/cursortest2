package xsna;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.profile.core.tabs.state.CommunityProfileContent;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;

/* compiled from: CommunityUpdateContentItemReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class s4i {
    public static CommunityProfileState a(CommunityProfileState communityProfileState, d.t tVar) {
        boolean z;
        osi0 osi0Var;
        Parcel obtain;
        CommunityProfileContentItem.d dVar;
        p8u i;
        CommunityProfileContentItem.d dVar2;
        com.vk.profile.core.tabs.state.a aVar;
        Integer num;
        a9u a9uVar;
        char c;
        ArrayList arrayList;
        a9u a9uVar2;
        ArrayList arrayList2;
        a9u a9uVar3;
        ArrayList arrayList3;
        a9u a9uVar4;
        CommunityProfileContent communityProfileContent = communityProfileState.d;
        int i2 = 10;
        int i3 = 0;
        if (tVar instanceof d.t.a) {
            d.t.a aVar2 = (d.t.a) tVar;
            if (communityProfileContent != null) {
                List<CommunityProfileContentItem> list = communityProfileContent.b;
                ArrayList arrayList4 = new ArrayList(c5g.u(list, 10));
                for (CommunityProfileContentItem communityProfileContentItem : list) {
                    if (communityProfileContentItem instanceof p8u) {
                        p8u p8uVar = (p8u) communityProfileContentItem;
                        if (aVar2 instanceof d.t.a.e) {
                            a9u a9uVar5 = p8uVar.j;
                            if (a9uVar5 != null) {
                                ArrayList<f5u> arrayList5 = a9uVar5.a;
                                ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, i2));
                                for (f5u f5uVar : arrayList5) {
                                    d.t.a.e eVar = (d.t.a.e) aVar2;
                                    if (epx.f(f5uVar, eVar.b)) {
                                        Good good = f5uVar.b;
                                        obtain = Parcel.obtain();
                                        try {
                                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                                            Serializer.g gVar = new Serializer.g(obtain);
                                            gVar.i0(good);
                                            obtain.setDataPosition(i3);
                                            Serializer.StreamParcelable G = gVar.G(Good.class.getClassLoader());
                                            obtain.recycle();
                                            Good good2 = (Good) G;
                                            good2.J = eVar.c;
                                            f5uVar = new f5u(good2);
                                        } finally {
                                        }
                                    }
                                    arrayList6.add(f5uVar);
                                }
                                a9uVar4 = new a9u(arrayList6);
                            } else {
                                a9uVar4 = null;
                            }
                            communityProfileContentItem = p8u.i(p8uVar, a9uVar4, null, null, false, false, null, null, null, null, null, null, null, 65534);
                        } else {
                            if (aVar2 instanceof d.t.a.C1621d) {
                                a9u a9uVar6 = p8uVar.j;
                                if (a9uVar6 != null) {
                                    ArrayList<f5u> arrayList7 = a9uVar6.a;
                                    ArrayList arrayList8 = new ArrayList(c5g.u(arrayList7, i2));
                                    for (f5u f5uVar2 : arrayList7) {
                                        Good good3 = f5uVar2.b;
                                        ArrayList arrayList9 = arrayList8;
                                        d.t.a.C1621d c1621d = (d.t.a.C1621d) aVar2;
                                        if (good3.b == c1621d.b) {
                                            obtain = Parcel.obtain();
                                            try {
                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                                                Serializer.g gVar2 = new Serializer.g(obtain);
                                                gVar2.i0(good3);
                                                obtain.setDataPosition(0);
                                                Serializer.StreamParcelable G2 = gVar2.G(Good.class.getClassLoader());
                                                obtain.recycle();
                                                Good good4 = (Good) G2;
                                                List<CallProducerButton> list2 = f5uVar2.b.n0;
                                                if (list2 != null) {
                                                    List<CallProducerButton> list3 = list2;
                                                    arrayList3 = new ArrayList(c5g.u(list3, 10));
                                                    Iterator<T> it = list3.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList3.add(CallProducerButton.a((CallProducerButton) it.next(), c1621d.c.h(), null, 4094));
                                                    }
                                                } else {
                                                    arrayList3 = null;
                                                }
                                                good4.n0 = arrayList3;
                                                f5uVar2 = new f5u(good4);
                                            } finally {
                                            }
                                        }
                                        arrayList9.add(f5uVar2);
                                        arrayList8 = arrayList9;
                                    }
                                    a9uVar3 = new a9u(arrayList8);
                                } else {
                                    a9uVar3 = null;
                                }
                                i = p8u.i(p8uVar, a9uVar3, null, null, false, false, null, null, null, null, null, null, null, 65534);
                            } else if (aVar2 instanceof d.t.a.C1620a) {
                                a9u a9uVar7 = p8uVar.j;
                                if (a9uVar7 != null) {
                                    ArrayList<f5u> arrayList10 = a9uVar7.a;
                                    ArrayList arrayList11 = new ArrayList(c5g.u(arrayList10, 10));
                                    for (f5u f5uVar3 : arrayList10) {
                                        Good good5 = f5uVar3.b;
                                        UserId a = fkq0.a(good5.c);
                                        UserId userId = ((d.t.a.C1620a) aVar2).b;
                                        if (a.equals(userId != null ? fkq0.a(userId) : null)) {
                                            obtain = Parcel.obtain();
                                            try {
                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                                                Serializer.g gVar3 = new Serializer.g(obtain);
                                                gVar3.i0(good5);
                                                obtain.setDataPosition(0);
                                                Serializer.StreamParcelable G3 = gVar3.G(Good.class.getClassLoader());
                                                obtain.recycle();
                                                Good good6 = (Good) G3;
                                                List<CallProducerButton> list4 = good5.n0;
                                                if (list4 != null) {
                                                    List<CallProducerButton> list5 = list4;
                                                    arrayList2 = new ArrayList(c5g.u(list5, 10));
                                                    for (CallProducerButton callProducerButton : list5) {
                                                        if (callProducerButton.b == 3) {
                                                            callProducerButton = CallProducerButton.a(callProducerButton, 4, null, 4094);
                                                        }
                                                        arrayList2.add(callProducerButton);
                                                    }
                                                } else {
                                                    arrayList2 = null;
                                                }
                                                good6.n0 = arrayList2;
                                                f5uVar3 = new f5u(good6);
                                            } finally {
                                            }
                                        }
                                        arrayList11.add(f5uVar3);
                                    }
                                    a9uVar2 = new a9u(arrayList11);
                                } else {
                                    a9uVar2 = null;
                                }
                                i = p8u.i(p8uVar, a9uVar2, null, null, false, false, null, null, null, null, null, null, null, 65534);
                            } else if (aVar2 instanceof d.t.a.b) {
                                d.t.a.b bVar = (d.t.a.b) aVar2;
                                a9u a9uVar8 = p8uVar.j;
                                if (a9uVar8 != null) {
                                    ArrayList<f5u> arrayList12 = a9uVar8.a;
                                    ArrayList arrayList13 = new ArrayList(c5g.u(arrayList12, 10));
                                    for (f5u f5uVar4 : arrayList12) {
                                        Good good7 = f5uVar4.b;
                                        boolean z2 = good7.b == bVar.c;
                                        boolean z3 = good7.x == 1;
                                        if (z2 && z3) {
                                            obtain = Parcel.obtain();
                                            try {
                                                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap4 = Serializer.a;
                                                Serializer.g gVar4 = new Serializer.g(obtain);
                                                gVar4.i0(good7);
                                                obtain.setDataPosition(0);
                                                Serializer.StreamParcelable G4 = gVar4.G(Good.class.getClassLoader());
                                                obtain.recycle();
                                                Good good8 = (Good) G4;
                                                List<CallProducerButton> list6 = f5uVar4.b.n0;
                                                if (list6 != null) {
                                                    List<CallProducerButton> list7 = list6;
                                                    arrayList = new ArrayList(c5g.u(list7, 10));
                                                    for (CallProducerButton callProducerButton2 : list7) {
                                                        if (callProducerButton2.b == 3) {
                                                            callProducerButton2 = CallProducerButton.a(callProducerButton2, 4, null, 4094);
                                                        }
                                                        arrayList.add(callProducerButton2);
                                                    }
                                                } else {
                                                    arrayList = null;
                                                }
                                                c = 4;
                                                good8.n0 = arrayList;
                                                f5uVar4 = new f5u(good8);
                                            } finally {
                                            }
                                        } else {
                                            c = 4;
                                        }
                                        arrayList13.add(f5uVar4);
                                    }
                                    a9uVar = new a9u(arrayList13);
                                } else {
                                    a9uVar = null;
                                }
                                i = p8u.i(p8uVar, a9uVar, null, null, false, false, null, null, null, null, null, null, null, 65534);
                            } else if (aVar2 instanceof d.t.a.f) {
                                CommunityProfileContentItem.d dVar3 = p8uVar.y;
                                int intValue = (dVar3 == null || (aVar = dVar3.a) == null || (num = aVar.c) == null) ? 0 : num.intValue();
                                Integer num2 = ((d.t.a.f) aVar2).b;
                                int intValue2 = intValue + (num2 != null ? num2.intValue() : 0);
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0 || p8uVar.m) {
                                    valueOf = null;
                                }
                                CommunityProfileContentItem.d dVar4 = p8uVar.y;
                                if (dVar4 != null) {
                                    com.vk.profile.core.tabs.state.a aVar3 = dVar4.a;
                                    dVar2 = CommunityProfileContentItem.d.a(dVar4, aVar3 != null ? com.vk.profile.core.tabs.state.a.a(aVar3, valueOf) : null);
                                } else {
                                    dVar2 = null;
                                }
                                i = p8u.i(p8uVar, null, null, null, false, false, null, null, null, null, null, null, dVar2, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
                            } else {
                                if (!(aVar2 instanceof d.t.a.c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                CommunityProfileContentItem.d dVar5 = p8uVar.y;
                                if (dVar5 != null) {
                                    com.vk.profile.core.tabs.state.a aVar4 = dVar5.a;
                                    dVar = CommunityProfileContentItem.d.a(dVar5, aVar4 != null ? com.vk.profile.core.tabs.state.a.a(aVar4, null) : null);
                                } else {
                                    dVar = null;
                                }
                                i = p8u.i(p8uVar, null, null, null, false, false, null, null, null, null, null, null, dVar, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
                            }
                            communityProfileContentItem = i;
                        }
                    }
                    arrayList4.add(communityProfileContentItem);
                    i2 = 10;
                    i3 = 0;
                }
                return CommunityProfileState.a(communityProfileState, null, 0, CommunityProfileContent.a(communityProfileContent, arrayList4, null, null, 2045), null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435451);
            }
        } else {
            if (!(tVar instanceof d.t.b)) {
                throw new NoWhenBranchMatchedException();
            }
            d.t.b bVar2 = (d.t.b) tVar;
            if (communityProfileContent != null) {
                List<CommunityProfileContentItem> list8 = communityProfileContent.b;
                ArrayList arrayList14 = new ArrayList(c5g.u(list8, 10));
                for (Object obj : list8) {
                    if (obj instanceof Services) {
                        Services services = (Services) obj;
                        if (!(bVar2 instanceof d.t.b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        osi0 osi0Var2 = services.j;
                        if (osi0Var2 != null) {
                            ArrayList<f5u> arrayList15 = osi0Var2.a;
                            ArrayList arrayList16 = new ArrayList(c5g.u(arrayList15, 10));
                            for (f5u f5uVar5 : arrayList15) {
                                d.t.b.a aVar5 = (d.t.b.a) bVar2;
                                if (epx.f(f5uVar5, aVar5.b)) {
                                    Good good9 = f5uVar5.b;
                                    obtain = Parcel.obtain();
                                    try {
                                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap5 = Serializer.a;
                                        Serializer.g gVar5 = new Serializer.g(obtain);
                                        gVar5.i0(good9);
                                        obtain.setDataPosition(0);
                                        Serializer.StreamParcelable G5 = gVar5.G(Good.class.getClassLoader());
                                        obtain.recycle();
                                        Good good10 = (Good) G5;
                                        good10.J = aVar5.c;
                                        f5uVar5 = new f5u(good10);
                                    } finally {
                                    }
                                }
                                arrayList16.add(f5uVar5);
                            }
                            z = false;
                            osi0Var = new osi0(arrayList16);
                        } else {
                            z = false;
                            osi0Var = null;
                        }
                        obj = Services.i(services, osi0Var, null, null, false, false, null, null, null, null, null, null, 65534);
                    }
                    arrayList14.add(obj);
                }
                return CommunityProfileState.a(communityProfileState, null, 0, CommunityProfileContent.a(communityProfileContent, arrayList14, null, null, 2045), null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435451);
            }
        }
        return communityProfileState;
    }
}
