package com.yandex.go.rida.bids.interactor;

import com.yandex.go.rida.bids.interactor.i;
import defpackage.ap5;
import defpackage.i3y;
import defpackage.mq5;
import defpackage.ny61;
import defpackage.pp5;
import defpackage.scc;
import defpackage.sls;
import defpackage.tq5;
import defpackage.uq5;
import defpackage.v1z;
import defpackage.vq5;
import defpackage.w1z;
import defpackage.w511;
import defpackage.x1z;
import defpackage.y1z;
import defpackage.zuj0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class i {
    public final pp5 a;
    public final zuj0 b;
    public final ru.yandex.taxi.widget.c c;
    public final i3y d;
    public final i3y e;
    public final i3y f;
    public final i3y g;
    public final i3y h;

    public i(pp5 pp5Var, zuj0 zuj0Var, ru.yandex.taxi.widget.c cVar) {
        this.a = pp5Var;
        this.b = zuj0Var;
        this.c = cVar;
        final int i = 0;
        this.d = kotlin.a.a(new sls(this) { // from class: wq5
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                i iVar = this.b;
                switch (i2) {
                    case 0:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_trip_price);
                    case 1:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_pickup_time);
                    case 2:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_decline);
                    case 3:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_accept);
                    default:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_fastest_chip);
                }
            }
        });
        final int i2 = 1;
        this.e = kotlin.a.a(new sls(this) { // from class: wq5
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                i iVar = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_trip_price);
                    case 1:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_pickup_time);
                    case 2:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_decline);
                    case 3:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_accept);
                    default:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_fastest_chip);
                }
            }
        });
        final int i3 = 2;
        this.f = kotlin.a.a(new sls(this) { // from class: wq5
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                i iVar = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_trip_price);
                    case 1:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_pickup_time);
                    case 2:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_decline);
                    case 3:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_accept);
                    default:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_fastest_chip);
                }
            }
        });
        final int i4 = 3;
        this.g = kotlin.a.a(new sls(this) { // from class: wq5
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                i iVar = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_trip_price);
                    case 1:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_pickup_time);
                    case 2:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_decline);
                    case 3:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_accept);
                    default:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_fastest_chip);
                }
            }
        });
        final int i5 = 4;
        this.h = kotlin.a.a(new sls(this) { // from class: wq5
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i5;
                i iVar = this.b;
                switch (i22) {
                    case 0:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_trip_price);
                    case 1:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_pickup_time);
                    case 2:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_decline);
                    case 3:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_accept);
                    default:
                        return ((avj0) iVar.b).h(gyh0.rida_bids_fastest_chip);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r18v9, types: [tq5] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v68, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v17, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01d7 -> B:26:0x03b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0341 -> B:12:0x0356). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, List list, ContinuationImpl continuationImpl) {
        BidsListUiStateInteractor$mapToUi$1 bidsListUiStateInteractor$mapToUi$1;
        int i;
        Map map;
        int i2;
        Iterator it;
        int i3;
        uq5 uq5Var;
        ArrayList arrayList;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        Object obj;
        String str;
        String str2;
        String str3;
        CharSequence charSequence;
        int i8;
        int i9;
        uq5 uq5Var2;
        int i10;
        BidsListUiStateInteractor$mapToUi$1 bidsListUiStateInteractor$mapToUi$12;
        Iterator it2;
        ArrayList arrayList2;
        y1z y1zVar;
        ru.yandex.taxi.widget.c cVar;
        CoroutineSingletons coroutineSingletons;
        ru.yandex.taxi.widget.c cVar2;
        y1z y1zVar2;
        Object i11;
        CoroutineSingletons coroutineSingletons2;
        Object obj2;
        int i12;
        uq5 uq5Var3;
        int i13;
        int i14;
        ArrayList arrayList3;
        Iterator it3;
        y1z y1zVar3;
        Object i15;
        String str4;
        iVar.getClass();
        ru.yandex.taxi.widget.c cVar3 = iVar.c;
        if (continuationImpl instanceof BidsListUiStateInteractor$mapToUi$1) {
            bidsListUiStateInteractor$mapToUi$1 = (BidsListUiStateInteractor$mapToUi$1) continuationImpl;
            int i16 = bidsListUiStateInteractor$mapToUi$1.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                bidsListUiStateInteractor$mapToUi$1.label = i16 - Integer.MIN_VALUE;
                Object obj3 = bidsListUiStateInteractor$mapToUi$1.result;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsListUiStateInteractor$mapToUi$1.label;
                if (i != 0) {
                    map = null;
                    kotlin.b.b(obj3);
                    List list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator it4 = list2.iterator();
                        i2 = 0;
                        while (it4.hasNext()) {
                            if (!(((y1z) it4.next()) instanceof x1z) && (i2 = i2 + 1) < 0) {
                                scc.l();
                                throw null;
                            }
                        }
                    }
                    int i17 = i2 > 1 ? 1 : 0;
                    uq5 uq5Var4 = vq5.c;
                    ArrayList arrayList4 = new ArrayList();
                    it = list2.iterator();
                    i3 = i2;
                    uq5Var = uq5Var4;
                    arrayList = arrayList4;
                    i4 = i17;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    int i18 = bidsListUiStateInteractor$mapToUi$1.I$5;
                    int i19 = bidsListUiStateInteractor$mapToUi$1.I$4;
                    int i20 = bidsListUiStateInteractor$mapToUi$1.I$3;
                    int i21 = bidsListUiStateInteractor$mapToUi$1.I$2;
                    i4 = bidsListUiStateInteractor$mapToUi$1.I$1;
                    i3 = bidsListUiStateInteractor$mapToUi$1.I$0;
                    uq5 uq5Var5 = (uq5) bidsListUiStateInteractor$mapToUi$1.L$12;
                    String str5 = (String) bidsListUiStateInteractor$mapToUi$1.L$11;
                    String str6 = (String) bidsListUiStateInteractor$mapToUi$1.L$10;
                    String str7 = (String) bidsListUiStateInteractor$mapToUi$1.L$9;
                    y1z y1zVar4 = (y1z) bidsListUiStateInteractor$mapToUi$1.L$8;
                    Iterator it5 = (Iterator) bidsListUiStateInteractor$mapToUi$1.L$5;
                    ?? r1 = (Collection) bidsListUiStateInteractor$mapToUi$1.L$3;
                    kotlin.b.b(obj3);
                    y1zVar3 = y1zVar4;
                    it3 = it5;
                    str2 = str6;
                    str = str7;
                    i12 = i21;
                    str3 = str5;
                    i13 = i19;
                    uq5Var3 = uq5Var5;
                    i14 = i18;
                    i9 = i20;
                    bidsListUiStateInteractor$mapToUi$12 = bidsListUiStateInteractor$mapToUi$1;
                    arrayList3 = r1;
                    obj2 = obj3;
                    CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                    CharSequence charSequence2 = (CharSequence) obj2;
                    ap5 ap5Var = (ap5) y1zVar3;
                    int i22 = i13;
                    int i23 = i4;
                    long c = ap5Var.c();
                    ru.yandex.taxi.widget.c cVar4 = cVar3;
                    int d = ap5Var.d();
                    FormattedText formattedText = ap5Var.a().d;
                    bidsListUiStateInteractor$mapToUi$12.L$0 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$1 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$2 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$3 = arrayList3;
                    bidsListUiStateInteractor$mapToUi$12.L$4 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$5 = it3;
                    bidsListUiStateInteractor$mapToUi$12.L$6 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$7 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$8 = y1zVar3;
                    bidsListUiStateInteractor$mapToUi$12.L$9 = str;
                    bidsListUiStateInteractor$mapToUi$12.L$10 = str2;
                    bidsListUiStateInteractor$mapToUi$12.L$11 = str3;
                    bidsListUiStateInteractor$mapToUi$12.L$12 = charSequence2;
                    bidsListUiStateInteractor$mapToUi$12.L$13 = uq5Var3;
                    bidsListUiStateInteractor$mapToUi$12.I$0 = i3;
                    bidsListUiStateInteractor$mapToUi$12.I$1 = i23;
                    bidsListUiStateInteractor$mapToUi$12.I$2 = i12;
                    bidsListUiStateInteractor$mapToUi$12.I$3 = i9;
                    y1z y1zVar5 = y1zVar3;
                    bidsListUiStateInteractor$mapToUi$12.I$4 = i22;
                    bidsListUiStateInteractor$mapToUi$12.I$5 = i14;
                    bidsListUiStateInteractor$mapToUi$12.I$6 = d;
                    Iterator it6 = it3;
                    bidsListUiStateInteractor$mapToUi$12.J$0 = c;
                    bidsListUiStateInteractor$mapToUi$12.label = 2;
                    cVar = cVar4;
                    i15 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, bidsListUiStateInteractor$mapToUi$12, 30);
                    coroutineSingletons = coroutineSingletons4;
                    if (i15 != coroutineSingletons) {
                    }
                } else if (i == 2) {
                    obj = obj3;
                    long j2 = bidsListUiStateInteractor$mapToUi$1.J$0;
                    int i24 = bidsListUiStateInteractor$mapToUi$1.I$6;
                    int i25 = bidsListUiStateInteractor$mapToUi$1.I$5;
                    int i26 = bidsListUiStateInteractor$mapToUi$1.I$4;
                    int i27 = bidsListUiStateInteractor$mapToUi$1.I$3;
                    int i28 = bidsListUiStateInteractor$mapToUi$1.I$2;
                    i8 = bidsListUiStateInteractor$mapToUi$1.I$1;
                    int i29 = bidsListUiStateInteractor$mapToUi$1.I$0;
                    uq5 uq5Var6 = (uq5) bidsListUiStateInteractor$mapToUi$1.L$13;
                    CharSequence charSequence3 = (CharSequence) bidsListUiStateInteractor$mapToUi$1.L$12;
                    String str8 = (String) bidsListUiStateInteractor$mapToUi$1.L$11;
                    String str9 = (String) bidsListUiStateInteractor$mapToUi$1.L$10;
                    String str10 = (String) bidsListUiStateInteractor$mapToUi$1.L$9;
                    y1z y1zVar6 = (y1z) bidsListUiStateInteractor$mapToUi$1.L$8;
                    Iterator it7 = (Iterator) bidsListUiStateInteractor$mapToUi$1.L$5;
                    ?? r12 = (Collection) bidsListUiStateInteractor$mapToUi$1.L$3;
                    kotlin.b.b(obj);
                    cVar = cVar3;
                    coroutineSingletons = coroutineSingletons3;
                    j = j2;
                    i6 = i25;
                    i5 = i26;
                    i7 = i28;
                    uq5Var2 = uq5Var6;
                    str3 = str8;
                    i10 = i24;
                    str = str10;
                    it2 = it7;
                    arrayList2 = r12;
                    bidsListUiStateInteractor$mapToUi$12 = bidsListUiStateInteractor$mapToUi$1;
                    i9 = i27;
                    i3 = i29;
                    charSequence = charSequence3;
                    y1zVar = y1zVar6;
                    str2 = str9;
                    CharSequence charSequence4 = (CharSequence) obj;
                    CoroutineSingletons coroutineSingletons5 = coroutineSingletons;
                    ru.yandex.taxi.widget.c cVar5 = cVar;
                    String str11 = (String) iVar.d.getValue();
                    FormattedText formattedText2 = ((ap5) y1zVar).a().e;
                    bidsListUiStateInteractor$mapToUi$12.L$0 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$1 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$2 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$3 = arrayList2;
                    bidsListUiStateInteractor$mapToUi$12.L$4 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$5 = it2;
                    bidsListUiStateInteractor$mapToUi$12.L$6 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$7 = null;
                    bidsListUiStateInteractor$mapToUi$12.L$8 = y1zVar;
                    bidsListUiStateInteractor$mapToUi$12.L$9 = str;
                    bidsListUiStateInteractor$mapToUi$12.L$10 = str2;
                    bidsListUiStateInteractor$mapToUi$12.L$11 = str3;
                    bidsListUiStateInteractor$mapToUi$12.L$12 = charSequence;
                    bidsListUiStateInteractor$mapToUi$12.L$13 = charSequence4;
                    bidsListUiStateInteractor$mapToUi$12.L$14 = str11;
                    bidsListUiStateInteractor$mapToUi$12.L$15 = uq5Var2;
                    bidsListUiStateInteractor$mapToUi$12.I$0 = i3;
                    bidsListUiStateInteractor$mapToUi$12.I$1 = i8;
                    bidsListUiStateInteractor$mapToUi$12.I$2 = i7;
                    bidsListUiStateInteractor$mapToUi$12.I$3 = i9;
                    int i30 = i5;
                    bidsListUiStateInteractor$mapToUi$12.I$4 = i30;
                    int i31 = i6;
                    bidsListUiStateInteractor$mapToUi$12.I$5 = i31;
                    bidsListUiStateInteractor$mapToUi$12.I$6 = i10;
                    long j3 = j;
                    bidsListUiStateInteractor$mapToUi$12.J$0 = j3;
                    bidsListUiStateInteractor$mapToUi$12.label = 3;
                    cVar2 = cVar5;
                    y1zVar2 = y1zVar;
                    i11 = ru.yandex.taxi.widget.c.i(cVar2, formattedText2, null, bidsListUiStateInteractor$mapToUi$12, 30);
                    coroutineSingletons2 = coroutineSingletons5;
                    if (i11 != coroutineSingletons2) {
                    }
                } else {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j4 = bidsListUiStateInteractor$mapToUi$1.J$0;
                    int i32 = bidsListUiStateInteractor$mapToUi$1.I$6;
                    int i33 = bidsListUiStateInteractor$mapToUi$1.I$5;
                    int i34 = bidsListUiStateInteractor$mapToUi$1.I$4;
                    int i35 = bidsListUiStateInteractor$mapToUi$1.I$1;
                    int i36 = bidsListUiStateInteractor$mapToUi$1.I$0;
                    uq5Var2 = (uq5) bidsListUiStateInteractor$mapToUi$1.L$15;
                    String str12 = (String) bidsListUiStateInteractor$mapToUi$1.L$14;
                    CharSequence charSequence5 = (CharSequence) bidsListUiStateInteractor$mapToUi$1.L$13;
                    CharSequence charSequence6 = (CharSequence) bidsListUiStateInteractor$mapToUi$1.L$12;
                    String str13 = (String) bidsListUiStateInteractor$mapToUi$1.L$11;
                    String str14 = (String) bidsListUiStateInteractor$mapToUi$1.L$10;
                    String str15 = (String) bidsListUiStateInteractor$mapToUi$1.L$9;
                    y1z y1zVar7 = (y1z) bidsListUiStateInteractor$mapToUi$1.L$8;
                    Iterator it8 = (Iterator) bidsListUiStateInteractor$mapToUi$1.L$5;
                    ?? r13 = (Collection) bidsListUiStateInteractor$mapToUi$1.L$3;
                    kotlin.b.b(obj3);
                    cVar2 = cVar3;
                    int i37 = i32;
                    String str16 = str12;
                    CharSequence charSequence7 = charSequence6;
                    CharSequence charSequence8 = charSequence5;
                    long j5 = j4;
                    i11 = obj3;
                    y1zVar2 = y1zVar7;
                    it2 = it8;
                    bidsListUiStateInteractor$mapToUi$12 = bidsListUiStateInteractor$mapToUi$1;
                    coroutineSingletons2 = coroutineSingletons3;
                    String str17 = str14;
                    arrayList2 = r13;
                    String str18 = str13;
                    String str19 = str15;
                    CharSequence charSequence9 = (CharSequence) i11;
                    String str20 = (String) iVar.e.getValue();
                    String str21 = (String) iVar.f.getValue();
                    String str22 = (String) iVar.g.getValue();
                    boolean z = i35 == 0 && ((ap5) y1zVar2).a().f;
                    if (z) {
                        str4 = (String) iVar.h.getValue();
                    } else {
                        if (z) {
                            w511.b();
                            return null;
                        }
                        str4 = null;
                    }
                    boolean z2 = i33 == 0;
                    boolean z3 = i34 == 0;
                    it = it2;
                    uq5Var = uq5Var2;
                    i4 = i35;
                    ArrayList arrayList5 = arrayList2;
                    i3 = i36;
                    Map map2 = new tq5(str18, z2, z3, str17, str19, charSequence7, j5, i37, charSequence8, str16, charSequence9, str20, str21, str22, str4);
                    if (map2 != null) {
                        arrayList5.add(map2);
                    }
                    cVar3 = cVar2;
                    coroutineSingletons3 = coroutineSingletons2;
                    arrayList = arrayList5;
                    bidsListUiStateInteractor$mapToUi$1 = bidsListUiStateInteractor$mapToUi$12;
                    map = null;
                    if (!it.hasNext()) {
                        y1z y1zVar8 = (y1z) it.next();
                        if (y1zVar8 instanceof ap5) {
                            ?? r5 = y1zVar8 instanceof w1z;
                            boolean z4 = y1zVar8 instanceof v1z;
                            String b = y1zVar8.b();
                            ap5 ap5Var2 = (ap5) y1zVar8;
                            String str23 = ap5Var2.a().a;
                            String str24 = ap5Var2.a().b;
                            FormattedText formattedText3 = ap5Var2.a().c;
                            Map map3 = map;
                            bidsListUiStateInteractor$mapToUi$1.L$0 = map3;
                            bidsListUiStateInteractor$mapToUi$1.L$1 = map3;
                            bidsListUiStateInteractor$mapToUi$1.L$2 = map3;
                            bidsListUiStateInteractor$mapToUi$1.L$3 = arrayList;
                            bidsListUiStateInteractor$mapToUi$1.L$4 = map3;
                            bidsListUiStateInteractor$mapToUi$1.L$5 = it;
                            bidsListUiStateInteractor$mapToUi$1.L$6 = map3;
                            bidsListUiStateInteractor$mapToUi$1.L$7 = map3;
                            bidsListUiStateInteractor$mapToUi$1.L$8 = y1zVar8;
                            bidsListUiStateInteractor$mapToUi$1.L$9 = str24;
                            bidsListUiStateInteractor$mapToUi$1.L$10 = str23;
                            bidsListUiStateInteractor$mapToUi$1.L$11 = b;
                            bidsListUiStateInteractor$mapToUi$1.L$12 = uq5Var;
                            bidsListUiStateInteractor$mapToUi$1.L$13 = map3;
                            bidsListUiStateInteractor$mapToUi$1.L$14 = map3;
                            bidsListUiStateInteractor$mapToUi$1.L$15 = map3;
                            bidsListUiStateInteractor$mapToUi$1.I$0 = i3;
                            bidsListUiStateInteractor$mapToUi$1.I$1 = i4;
                            bidsListUiStateInteractor$mapToUi$1.I$2 = r5 == true ? 1 : 0;
                            bidsListUiStateInteractor$mapToUi$1.I$3 = z4 ? 1 : 0;
                            bidsListUiStateInteractor$mapToUi$1.I$4 = z4 ? 1 : 0;
                            bidsListUiStateInteractor$mapToUi$1.I$5 = r5 == true ? 1 : 0;
                            ArrayList arrayList6 = arrayList;
                            bidsListUiStateInteractor$mapToUi$1.label = 1;
                            Object i38 = ru.yandex.taxi.widget.c.i(cVar3, formattedText3, map3, bidsListUiStateInteractor$mapToUi$1, 30);
                            if (i38 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            obj2 = i38;
                            y1zVar3 = y1zVar8;
                            it3 = it;
                            i13 = z4 ? 1 : 0;
                            str2 = str23;
                            str = str24;
                            bidsListUiStateInteractor$mapToUi$12 = bidsListUiStateInteractor$mapToUi$1;
                            i12 = r5 == true ? 1 : 0;
                            str3 = b;
                            arrayList3 = arrayList6;
                            uq5Var3 = uq5Var;
                            i9 = i13;
                            i14 = r5;
                            CoroutineSingletons coroutineSingletons42 = coroutineSingletons3;
                            CharSequence charSequence22 = (CharSequence) obj2;
                            ap5 ap5Var3 = (ap5) y1zVar3;
                            int i222 = i13;
                            int i232 = i4;
                            long c2 = ap5Var3.c();
                            ru.yandex.taxi.widget.c cVar42 = cVar3;
                            int d2 = ap5Var3.d();
                            FormattedText formattedText4 = ap5Var3.a().d;
                            bidsListUiStateInteractor$mapToUi$12.L$0 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$1 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$2 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$3 = arrayList3;
                            bidsListUiStateInteractor$mapToUi$12.L$4 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$5 = it3;
                            bidsListUiStateInteractor$mapToUi$12.L$6 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$7 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$8 = y1zVar3;
                            bidsListUiStateInteractor$mapToUi$12.L$9 = str;
                            bidsListUiStateInteractor$mapToUi$12.L$10 = str2;
                            bidsListUiStateInteractor$mapToUi$12.L$11 = str3;
                            bidsListUiStateInteractor$mapToUi$12.L$12 = charSequence22;
                            bidsListUiStateInteractor$mapToUi$12.L$13 = uq5Var3;
                            bidsListUiStateInteractor$mapToUi$12.I$0 = i3;
                            bidsListUiStateInteractor$mapToUi$12.I$1 = i232;
                            bidsListUiStateInteractor$mapToUi$12.I$2 = i12;
                            bidsListUiStateInteractor$mapToUi$12.I$3 = i9;
                            y1z y1zVar52 = y1zVar3;
                            bidsListUiStateInteractor$mapToUi$12.I$4 = i222;
                            bidsListUiStateInteractor$mapToUi$12.I$5 = i14;
                            bidsListUiStateInteractor$mapToUi$12.I$6 = d2;
                            Iterator it62 = it3;
                            bidsListUiStateInteractor$mapToUi$12.J$0 = c2;
                            bidsListUiStateInteractor$mapToUi$12.label = 2;
                            cVar = cVar42;
                            i15 = ru.yandex.taxi.widget.c.i(cVar, formattedText4, null, bidsListUiStateInteractor$mapToUi$12, 30);
                            coroutineSingletons = coroutineSingletons42;
                            if (i15 != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            uq5 uq5Var7 = uq5Var3;
                            i8 = i232;
                            uq5Var2 = uq5Var7;
                            i6 = i14;
                            i7 = i12;
                            it2 = it62;
                            i5 = i222;
                            j = c2;
                            charSequence = charSequence22;
                            obj = i15;
                            i10 = d2;
                            arrayList2 = arrayList3;
                            y1zVar = y1zVar52;
                            CharSequence charSequence42 = (CharSequence) obj;
                            CoroutineSingletons coroutineSingletons52 = coroutineSingletons;
                            ru.yandex.taxi.widget.c cVar52 = cVar;
                            String str112 = (String) iVar.d.getValue();
                            FormattedText formattedText22 = ((ap5) y1zVar).a().e;
                            bidsListUiStateInteractor$mapToUi$12.L$0 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$1 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$2 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$3 = arrayList2;
                            bidsListUiStateInteractor$mapToUi$12.L$4 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$5 = it2;
                            bidsListUiStateInteractor$mapToUi$12.L$6 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$7 = null;
                            bidsListUiStateInteractor$mapToUi$12.L$8 = y1zVar;
                            bidsListUiStateInteractor$mapToUi$12.L$9 = str;
                            bidsListUiStateInteractor$mapToUi$12.L$10 = str2;
                            bidsListUiStateInteractor$mapToUi$12.L$11 = str3;
                            bidsListUiStateInteractor$mapToUi$12.L$12 = charSequence;
                            bidsListUiStateInteractor$mapToUi$12.L$13 = charSequence42;
                            bidsListUiStateInteractor$mapToUi$12.L$14 = str112;
                            bidsListUiStateInteractor$mapToUi$12.L$15 = uq5Var2;
                            bidsListUiStateInteractor$mapToUi$12.I$0 = i3;
                            bidsListUiStateInteractor$mapToUi$12.I$1 = i8;
                            bidsListUiStateInteractor$mapToUi$12.I$2 = i7;
                            bidsListUiStateInteractor$mapToUi$12.I$3 = i9;
                            int i302 = i5;
                            bidsListUiStateInteractor$mapToUi$12.I$4 = i302;
                            int i312 = i6;
                            bidsListUiStateInteractor$mapToUi$12.I$5 = i312;
                            bidsListUiStateInteractor$mapToUi$12.I$6 = i10;
                            long j32 = j;
                            bidsListUiStateInteractor$mapToUi$12.J$0 = j32;
                            bidsListUiStateInteractor$mapToUi$12.label = 3;
                            cVar2 = cVar52;
                            y1zVar2 = y1zVar;
                            i11 = ru.yandex.taxi.widget.c.i(cVar2, formattedText22, null, bidsListUiStateInteractor$mapToUi$12, 30);
                            coroutineSingletons2 = coroutineSingletons52;
                            if (i11 != coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            str16 = str112;
                            i37 = i10;
                            i36 = i3;
                            i35 = i8;
                            str18 = str3;
                            str17 = str2;
                            charSequence8 = charSequence42;
                            j5 = j32;
                            i33 = i312;
                            charSequence7 = charSequence;
                            str19 = str;
                            i34 = i302;
                            CharSequence charSequence92 = (CharSequence) i11;
                            String str202 = (String) iVar.e.getValue();
                            String str212 = (String) iVar.f.getValue();
                            String str222 = (String) iVar.g.getValue();
                            if (i35 == 0) {
                            }
                            if (z) {
                            }
                            if (i33 == 0) {
                            }
                            if (i34 == 0) {
                            }
                            it = it2;
                            uq5Var = uq5Var2;
                            i4 = i35;
                            ArrayList arrayList52 = arrayList2;
                            i3 = i36;
                            Map map22 = new tq5(str18, z2, z3, str17, str19, charSequence7, j5, i37, charSequence8, str16, charSequence92, str202, str212, str222, str4);
                            if (map22 != null) {
                            }
                            cVar3 = cVar2;
                            coroutineSingletons3 = coroutineSingletons2;
                            arrayList = arrayList52;
                            bidsListUiStateInteractor$mapToUi$1 = bidsListUiStateInteractor$mapToUi$12;
                            map = null;
                            if (!it.hasNext()) {
                            }
                        } else {
                            arrayList52 = arrayList;
                            cVar2 = cVar3;
                            bidsListUiStateInteractor$mapToUi$12 = bidsListUiStateInteractor$mapToUi$1;
                            coroutineSingletons2 = coroutineSingletons3;
                            map22 = map;
                            if (map22 != null) {
                            }
                            cVar3 = cVar2;
                            coroutineSingletons3 = coroutineSingletons2;
                            arrayList = arrayList52;
                            bidsListUiStateInteractor$mapToUi$1 = bidsListUiStateInteractor$mapToUi$12;
                            map = null;
                            if (!it.hasNext()) {
                                uq5Var.getClass();
                                return com.yandex.go.design.compose.list.a.b(arrayList, new mq5(1));
                            }
                        }
                    }
                }
            }
        }
        bidsListUiStateInteractor$mapToUi$1 = new BidsListUiStateInteractor$mapToUi$1(iVar, continuationImpl);
        Object obj32 = bidsListUiStateInteractor$mapToUi$1.result;
        CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsListUiStateInteractor$mapToUi$1.label;
        if (i != 0) {
        }
    }
}
