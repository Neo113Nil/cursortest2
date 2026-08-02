package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vk.fullscreenvideo.ControlsState;
import java.util.ArrayList;
import java.util.List;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qwq implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ xzs c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ xzs g;
    public final /* synthetic */ Object h;

    public /* synthetic */ qwq(int i, ControlsState.b bVar, rqj rqjVar, izs izsVar, izs izsVar2, q630 q630Var) {
        this.e = bVar;
        this.c = izsVar;
        this.f = rqjVar;
        this.g = izsVar2;
        this.h = q630Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((rwq) this.e).a((gzs) this.f, (gzs) this.g, (x5) this.h, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                return s3q0.a;
            case 1:
                ControlsState.b bVar = (ControlsState.b) this.e;
                izs izsVar = (izs) this.c;
                rqj rqjVar = (rqj) this.f;
                izs izsVar2 = (izs) this.g;
                q630 q630Var = (q630) this.h;
                ((Integer) obj2).getClass();
                p8p0.d(ne7.I(this.d | 1), (androidx.compose.runtime.a) obj, bVar, rqjVar, izsVar, izsVar2, q630Var);
                return s3q0.a;
            default:
                final wzs wzsVar = (wzs) this.e;
                final wzs wzsVar2 = (wzs) this.f;
                final wzs wzsVar3 = (wzs) this.g;
                final wzs wzsVar4 = (wzs) this.h;
                final jai jaiVar = (jai) this.c;
                final ztm0 ztm0Var = (ztm0) obj;
                o6j o6jVar = (o6j) obj2;
                final int i = o6j.i(o6jVar.a);
                final int h = o6j.h(o6jVar.a);
                final long b = o6j.b(0, o6jVar.a, 0, 0, 0, 10);
                final int i2 = this.d;
                return ztm0Var.Q(i, h, jgp.b, new izs() { // from class: xsna.ohv0
                    /* JADX WARN: Removed duplicated region for block: B:105:0x0241  */
                    /* JADX WARN: Removed duplicated region for block: B:107:0x0233  */
                    /* JADX WARN: Removed duplicated region for block: B:108:0x021b  */
                    /* JADX WARN: Removed duplicated region for block: B:109:0x01eb  */
                    /* JADX WARN: Removed duplicated region for block: B:50:0x01c9 A[LOOP:3: B:49:0x01c7->B:50:0x01c9, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x01e9  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x0218  */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x021e  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x0236  */
                    /* JADX WARN: Removed duplicated region for block: B:70:0x0275 A[LOOP:4: B:69:0x0273->B:70:0x0275, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x02ad A[LOOP:5: B:73:0x02ab->B:74:0x02ad, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:78:0x02c2 A[LOOP:6: B:77:0x02c0->B:78:0x02c2, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:82:0x02d5 A[LOOP:7: B:81:0x02d3->B:82:0x02d5, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:86:0x02ea A[LOOP:8: B:85:0x02e8->B:86:0x02ea, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:90:0x0301  */
                    @Override // xsna.izs
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj3) {
                        long j;
                        Object obj4;
                        Object obj5;
                        int i3;
                        fhq fhqVar;
                        ArrayList arrayList;
                        int size;
                        int i4;
                        Object obj6;
                        Integer num;
                        int size2;
                        int i5;
                        int size3;
                        int i6;
                        int size4;
                        int i7;
                        int size5;
                        int i8;
                        int size6;
                        int i9;
                        int size7;
                        int i10;
                        int r0;
                        Object obj7;
                        Object obj8;
                        tra0.a aVar = (tra0.a) obj3;
                        float f = phv0.b;
                        c4h0 c4h0Var = c4h0.TopBar;
                        ztm0 ztm0Var2 = ztm0.this;
                        List<zo10> t1 = ztm0Var2.t1(c4h0Var, wzsVar);
                        ArrayList arrayList2 = new ArrayList(t1.size());
                        int size8 = t1.size();
                        int i11 = 0;
                        while (true) {
                            j = b;
                            if (i11 >= size8) {
                                break;
                            }
                            i11 = rf3.a(t1.get(i11), j, arrayList2, i11, 1);
                        }
                        int i12 = 1;
                        if (arrayList2.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList2.get(0);
                            int i13 = ((tra0) obj4).c;
                            int h2 = e43.h(arrayList2);
                            if (1 <= h2) {
                                int i14 = 1;
                                while (true) {
                                    Object obj9 = arrayList2.get(i14);
                                    int i15 = ((tra0) obj9).c;
                                    if (i13 < i15) {
                                        obj4 = obj9;
                                        i13 = i15;
                                    }
                                    if (i14 == h2) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                        }
                        tra0 tra0Var = (tra0) obj4;
                        int i16 = tra0Var != null ? tra0Var.c : 0;
                        List<zo10> t12 = ztm0Var2.t1(c4h0.Snackbar, wzsVar2);
                        ArrayList arrayList3 = new ArrayList(t12.size());
                        for (int i17 = 0; i17 < t12.size(); i17 = rf3.a(t12.get(i17), j, arrayList3, i17, 1)) {
                        }
                        if (arrayList3.isEmpty()) {
                            obj5 = null;
                        } else {
                            obj5 = arrayList3.get(0);
                            int i18 = ((tra0) obj5).c;
                            int h3 = e43.h(arrayList3);
                            if (1 <= h3) {
                                int i19 = 1;
                                while (true) {
                                    Object obj10 = arrayList3.get(i19);
                                    int i20 = ((tra0) obj10).c;
                                    if (i18 < i20) {
                                        i18 = i20;
                                        obj5 = obj10;
                                    }
                                    if (i19 == h3) {
                                        break;
                                    }
                                    i19++;
                                }
                            }
                        }
                        tra0 tra0Var2 = (tra0) obj5;
                        int i21 = tra0Var2 != null ? tra0Var2.c : 0;
                        List<zo10> t13 = ztm0Var2.t1(c4h0.Fab, wzsVar3);
                        ArrayList arrayList4 = new ArrayList(t13.size());
                        for (int i22 = 0; i22 < t13.size(); i22 = rf3.a(t13.get(i22), j, arrayList4, i22, 1)) {
                        }
                        if (arrayList4.isEmpty()) {
                            i3 = i21;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList4.get(0);
                                int i23 = ((tra0) obj7).b;
                                int h4 = e43.h(arrayList4);
                                if (1 <= h4) {
                                    while (true) {
                                        Object obj11 = arrayList4.get(i12);
                                        int i24 = ((tra0) obj11).b;
                                        if (i23 < i24) {
                                            i23 = i24;
                                            obj7 = obj11;
                                        }
                                        if (i12 == h4) {
                                            break;
                                        }
                                        i12++;
                                    }
                                }
                            }
                            tra0 tra0Var3 = (tra0) obj7;
                            int i25 = tra0Var3 != null ? tra0Var3.b : 0;
                            if (arrayList4.isEmpty()) {
                                i3 = i21;
                                obj8 = null;
                            } else {
                                obj8 = arrayList4.get(0);
                                int i26 = ((tra0) obj8).c;
                                int h5 = e43.h(arrayList4);
                                if (1 <= h5) {
                                    int i27 = 1;
                                    while (true) {
                                        Object obj12 = arrayList4.get(i27);
                                        i3 = i21;
                                        int i28 = ((tra0) obj12).c;
                                        if (i26 < i28) {
                                            i26 = i28;
                                            obj8 = obj12;
                                        }
                                        if (i27 == h5) {
                                            break;
                                        }
                                        i27++;
                                        i21 = i3;
                                    }
                                } else {
                                    i3 = i21;
                                }
                            }
                            tra0 tra0Var4 = (tra0) obj8;
                            int i29 = tra0Var4 != null ? tra0Var4.c : 0;
                            if (i25 != 0 && i29 != 0) {
                                int i30 = i2;
                                int i31 = i;
                                fhqVar = new fhq(i30 == 2 ? ztm0Var2.getLayoutDirection() == LayoutDirection.Ltr ? (i31 - aVar.r0(f)) - i25 : aVar.r0(f) : (i31 - i25) / 2, i29);
                                int i32 = 1;
                                List<zo10> t14 = ztm0Var2.t1(c4h0.BottomBar, new jai(111919143, new ljf(9, fhqVar, wzsVar4), true));
                                arrayList = new ArrayList(t14.size());
                                size = t14.size();
                                i4 = 0;
                                while (i4 < size) {
                                    int i33 = i32;
                                    i4 = rf3.a(t14.get(i4), j, arrayList, i4, i33);
                                    i32 = i33;
                                }
                                int i34 = i32;
                                if (arrayList.isEmpty()) {
                                    obj6 = arrayList.get(0);
                                    int i35 = ((tra0) obj6).c;
                                    int h6 = e43.h(arrayList);
                                    if (i34 <= h6) {
                                        while (true) {
                                            Object obj13 = arrayList.get(i34);
                                            Object obj14 = obj6;
                                            int i36 = ((tra0) obj13).c;
                                            if (i35 < i36) {
                                                i35 = i36;
                                                obj6 = obj13;
                                            } else {
                                                obj6 = obj14;
                                            }
                                            if (i34 == h6) {
                                                break;
                                            }
                                            i34++;
                                        }
                                    }
                                } else {
                                    obj6 = null;
                                }
                                tra0 tra0Var5 = (tra0) obj6;
                                int i37 = tra0Var5 == null ? tra0Var5.c : 0;
                                if (fhqVar == null) {
                                    int i38 = fhqVar.b;
                                    if (i37 == 0) {
                                        r0 = aVar.r0(f);
                                    } else {
                                        i38 += i37;
                                        r0 = aVar.r0(f);
                                    }
                                    num = Integer.valueOf(r0 + i38);
                                } else {
                                    num = null;
                                }
                                int intValue = i3 == 0 ? i3 + (num != null ? num.intValue() : i37) : 0;
                                int i39 = h;
                                int i40 = i39 - i16;
                                int i41 = intValue;
                                Integer num2 = num;
                                ArrayList arrayList5 = arrayList;
                                int i42 = 1;
                                List<zo10> t15 = ztm0Var2.t1(c4h0.MainContent, new jai(-1103777544, new ra5(aVar, i37, jaiVar), true));
                                ArrayList arrayList6 = new ArrayList(t15.size());
                                size2 = t15.size();
                                i5 = 0;
                                while (i5 < size2) {
                                    int i43 = i42;
                                    ArrayList arrayList7 = arrayList6;
                                    i5 = rf3.a(t15.get(i5), o6j.b(0, j, 0, 0, i40, 7), arrayList7, i5, i43);
                                    i40 = i40;
                                    arrayList6 = arrayList7;
                                    i42 = i43;
                                    arrayList5 = arrayList5;
                                }
                                ArrayList arrayList8 = arrayList6;
                                ArrayList arrayList9 = arrayList5;
                                size3 = arrayList8.size();
                                for (i6 = 0; i6 < size3; i6++) {
                                    aVar.q((tra0) arrayList8.get(i6), 0, i16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                size4 = arrayList2.size();
                                for (i7 = 0; i7 < size4; i7++) {
                                    aVar.q((tra0) arrayList2.get(i7), 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                size5 = arrayList3.size();
                                for (i8 = 0; i8 < size5; i8++) {
                                    aVar.q((tra0) arrayList3.get(i8), 0, i39 - i41, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                size6 = arrayList9.size();
                                for (i9 = 0; i9 < size6; i9++) {
                                    aVar.q((tra0) arrayList9.get(i9), 0, i39 - i37, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                size7 = arrayList4.size();
                                for (i10 = 0; i10 < size7; i10++) {
                                    aVar.q((tra0) arrayList4.get(i10), fhqVar != null ? fhqVar.a : 0, i39 - (num2 != null ? num2.intValue() : 0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                return s3q0.a;
                            }
                        }
                        fhqVar = null;
                        int i322 = 1;
                        List<zo10> t142 = ztm0Var2.t1(c4h0.BottomBar, new jai(111919143, new ljf(9, fhqVar, wzsVar4), true));
                        arrayList = new ArrayList(t142.size());
                        size = t142.size();
                        i4 = 0;
                        while (i4 < size) {
                        }
                        int i342 = i322;
                        if (arrayList.isEmpty()) {
                        }
                        tra0 tra0Var52 = (tra0) obj6;
                        if (tra0Var52 == null) {
                        }
                        if (fhqVar == null) {
                        }
                        if (i3 == 0) {
                        }
                        int i392 = h;
                        int i402 = i392 - i16;
                        int i412 = intValue;
                        Integer num22 = num;
                        ArrayList arrayList52 = arrayList;
                        int i422 = 1;
                        List<zo10> t152 = ztm0Var2.t1(c4h0.MainContent, new jai(-1103777544, new ra5(aVar, i37, jaiVar), true));
                        ArrayList arrayList62 = new ArrayList(t152.size());
                        size2 = t152.size();
                        i5 = 0;
                        while (i5 < size2) {
                        }
                        ArrayList arrayList82 = arrayList62;
                        ArrayList arrayList92 = arrayList52;
                        size3 = arrayList82.size();
                        while (i6 < size3) {
                        }
                        size4 = arrayList2.size();
                        while (i7 < size4) {
                        }
                        size5 = arrayList3.size();
                        while (i8 < size5) {
                        }
                        size6 = arrayList92.size();
                        while (i9 < size6) {
                        }
                        size7 = arrayList4.size();
                        while (i10 < size7) {
                        }
                        return s3q0.a;
                    }
                });
        }
    }

    public /* synthetic */ qwq(int i, jai jaiVar, wzs wzsVar, wzs wzsVar2, wzs wzsVar3, wzs wzsVar4) {
        this.e = wzsVar;
        this.f = wzsVar2;
        this.g = wzsVar3;
        this.d = i;
        this.h = wzsVar4;
        this.c = jaiVar;
    }

    public /* synthetic */ qwq(rwq rwqVar, gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, int i) {
        this.e = rwqVar;
        this.f = gzsVar;
        this.g = gzsVar2;
        this.h = x5Var;
        this.c = izsVar;
        this.d = i;
    }
}
