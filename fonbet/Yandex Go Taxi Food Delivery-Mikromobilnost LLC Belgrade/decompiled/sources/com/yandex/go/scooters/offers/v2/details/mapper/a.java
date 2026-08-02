package com.yandex.go.scooters.offers.v2.details.mapper;

import defpackage.a9j;
import defpackage.b9j;
import defpackage.bvf0;
import defpackage.f1j;
import defpackage.noh;
import defpackage.ny61;
import defpackage.p1j;
import defpackage.q1j;
import defpackage.qoh;
import defpackage.r1j;
import defpackage.s1j;
import defpackage.t1j;
import defpackage.tje;
import defpackage.tse;
import defpackage.u1j;
import defpackage.u8j;
import defpackage.v1j;
import defpackage.v8j;
import defpackage.w511;
import defpackage.w8j;
import defpackage.x8j;
import defpackage.y8j;
import defpackage.z8j;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class a {
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, tse tseVar, b9j b9jVar, ContinuationImpl continuationImpl) {
        ScootersOfferDetailItemsMapper$mapToDetailItem$1 scootersOfferDetailItemsMapper$mapToDetailItem$1;
        noh h;
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        noh nohVar4;
        noh nohVar5;
        noh nohVar6;
        noh nohVar7;
        Object k;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        b9j b9jVar2;
        Object k2;
        CharSequence charSequence4;
        Object k3;
        CharSequence charSequence5;
        CharSequence charSequence6;
        b9j b9jVar3;
        Object k4;
        CharSequence charSequence7;
        CharSequence charSequence8;
        Object k5;
        CharSequence charSequence9;
        CharSequence charSequence10;
        CharSequence charSequence11;
        b9j b9jVar4;
        aVar.getClass();
        if (continuationImpl instanceof ScootersOfferDetailItemsMapper$mapToDetailItem$1) {
            scootersOfferDetailItemsMapper$mapToDetailItem$1 = (ScootersOfferDetailItemsMapper$mapToDetailItem$1) continuationImpl;
            int i = scootersOfferDetailItemsMapper$mapToDetailItem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scootersOfferDetailItemsMapper$mapToDetailItem$1.label = i - Integer.MIN_VALUE;
                Object obj = scootersOfferDetailItemsMapper$mapToDetailItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (scootersOfferDetailItemsMapper$mapToDetailItem$1.label) {
                    case 0:
                        b.b(obj);
                        qoh h2 = tje.h(tseVar, null, null, new ScootersOfferDetailItemsMapper$mapToDetailItem$titleAsync$1(b9jVar, aVar, null), 3);
                        qoh h3 = tje.h(tseVar, null, null, new ScootersOfferDetailItemsMapper$mapToDetailItem$subtitleAsync$1(b9jVar, aVar, null), 3);
                        h = tje.h(tseVar, null, null, new ScootersOfferDetailItemsMapper$mapToDetailItem$valueAsync$1(b9jVar, aVar, null), 3);
                        if (b9jVar instanceof a9j) {
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = h3;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 1;
                            obj = h2.s(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                            if (obj != coroutineSingletons) {
                                nohVar7 = h3;
                                CharSequence charSequence12 = (CharSequence) obj;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence12;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 2;
                                k = nohVar7.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                if (k != coroutineSingletons) {
                                    obj = k;
                                    charSequence = charSequence12;
                                    CharSequence charSequence13 = (CharSequence) obj;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6 = charSequence13;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 3;
                                    obj = h.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                    if (obj != coroutineSingletons) {
                                        charSequence2 = charSequence13;
                                        return new f1j(new v1j(3, charSequence, charSequence2, (CharSequence) obj));
                                    }
                                }
                            }
                        } else if (b9jVar instanceof z8j) {
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = h3;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 4;
                            obj = h2.s(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                            if (obj != coroutineSingletons) {
                                nohVar6 = h3;
                                CharSequence charSequence14 = (CharSequence) obj;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence14;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 5;
                                obj = nohVar6.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                if (obj != coroutineSingletons) {
                                    charSequence3 = charSequence14;
                                    b9jVar2 = b9jVar;
                                    return new f1j(new u1j(charSequence3, (CharSequence) obj, ((z8j) b9jVar2).d));
                                }
                            }
                        } else if (b9jVar instanceof v8j) {
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = h3;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 6;
                            obj = h2.s(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                            if (obj != coroutineSingletons) {
                                nohVar5 = h3;
                                CharSequence charSequence15 = (CharSequence) obj;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence15;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 7;
                                k2 = nohVar5.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                if (k2 != coroutineSingletons) {
                                    obj = k2;
                                    charSequence4 = charSequence15;
                                    CharSequence charSequence16 = (CharSequence) obj;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence4;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6 = charSequence16;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 8;
                                    k3 = h.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                    if (k3 != coroutineSingletons) {
                                        charSequence5 = charSequence16;
                                        obj = k3;
                                        v8j v8jVar = (v8j) b9jVar;
                                        return new f1j(new q1j(charSequence4, charSequence5, (CharSequence) obj, v8jVar.d, v8jVar.e, v8jVar.f));
                                    }
                                }
                            }
                        } else if (b9jVar instanceof u8j) {
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = h3;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 9;
                            obj = h2.s(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                            if (obj != coroutineSingletons) {
                                nohVar4 = h3;
                                CharSequence charSequence17 = (CharSequence) obj;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence17;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 10;
                                obj = nohVar4.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                if (obj != coroutineSingletons) {
                                    charSequence6 = charSequence17;
                                    b9jVar3 = b9jVar;
                                    return new f1j(new p1j(charSequence6, (CharSequence) obj, ((u8j) b9jVar3).d));
                                }
                            }
                        } else if (b9jVar instanceof y8j) {
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = h3;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 11;
                            obj = h2.s(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                            if (obj != coroutineSingletons) {
                                nohVar3 = h3;
                                CharSequence charSequence18 = (CharSequence) obj;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence18;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 12;
                                k4 = nohVar3.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                if (k4 != coroutineSingletons) {
                                    obj = k4;
                                    charSequence7 = charSequence18;
                                    CharSequence charSequence19 = (CharSequence) obj;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence7;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6 = charSequence19;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 13;
                                    obj = h.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                    if (obj != coroutineSingletons) {
                                        charSequence8 = charSequence19;
                                        return new f1j(new t1j(3, charSequence7, charSequence8, (CharSequence) obj));
                                    }
                                }
                            }
                        } else if (b9jVar instanceof w8j) {
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = h3;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 14;
                            obj = h2.s(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                            if (obj != coroutineSingletons) {
                                nohVar2 = h3;
                                CharSequence charSequence20 = (CharSequence) obj;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence20;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 15;
                                k5 = nohVar2.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                if (k5 != coroutineSingletons) {
                                    obj = k5;
                                    charSequence9 = charSequence20;
                                    CharSequence charSequence21 = (CharSequence) obj;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence9;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6 = charSequence21;
                                    scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 16;
                                    obj = h.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                    if (obj != coroutineSingletons) {
                                        charSequence10 = charSequence21;
                                        return new f1j(new r1j(3, charSequence9, charSequence10, (CharSequence) obj));
                                    }
                                }
                            }
                        } else {
                            if (!(b9jVar instanceof x8j)) {
                                w511.b();
                                return null;
                            }
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = h3;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                            scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 17;
                            obj = h2.s(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                            if (obj != coroutineSingletons) {
                                nohVar = h3;
                                CharSequence charSequence22 = (CharSequence) obj;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence22;
                                scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 18;
                                obj = nohVar.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                                if (obj != coroutineSingletons) {
                                    charSequence11 = charSequence22;
                                    b9jVar4 = b9jVar;
                                    return new f1j(new s1j(charSequence11, (CharSequence) obj, ((x8j) b9jVar4).d));
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        h = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4;
                        nohVar7 = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3;
                        b.b(obj);
                        CharSequence charSequence122 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence122;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 2;
                        k = nohVar7.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (k != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 2:
                        CharSequence charSequence23 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        noh nohVar8 = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4;
                        b.b(obj);
                        charSequence = charSequence23;
                        h = nohVar8;
                        CharSequence charSequence132 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6 = charSequence132;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 3;
                        obj = h.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        charSequence2 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6;
                        charSequence = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        b.b(obj);
                        return new f1j(new v1j(3, charSequence, charSequence2, (CharSequence) obj));
                    case 4:
                        nohVar6 = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3;
                        b9jVar = (b9j) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1;
                        b.b(obj);
                        CharSequence charSequence142 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence142;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 5;
                        obj = nohVar6.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        charSequence3 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        b9jVar2 = (b9j) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1;
                        b.b(obj);
                        return new f1j(new u1j(charSequence3, (CharSequence) obj, ((z8j) b9jVar2).d));
                    case 6:
                        h = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4;
                        nohVar5 = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3;
                        b9jVar = (b9j) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1;
                        b.b(obj);
                        CharSequence charSequence152 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence152;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 7;
                        k2 = nohVar5.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (k2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 7:
                        CharSequence charSequence24 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        noh nohVar9 = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4;
                        b9jVar = (b9j) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1;
                        b.b(obj);
                        charSequence4 = charSequence24;
                        h = nohVar9;
                        CharSequence charSequence162 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence4;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6 = charSequence162;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 8;
                        k3 = h.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (k3 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 8:
                        CharSequence charSequence25 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6;
                        charSequence4 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        b9jVar = (b9j) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1;
                        b.b(obj);
                        charSequence5 = charSequence25;
                        v8j v8jVar2 = (v8j) b9jVar;
                        return new f1j(new q1j(charSequence4, charSequence5, (CharSequence) obj, v8jVar2.d, v8jVar2.e, v8jVar2.f));
                    case 9:
                        nohVar4 = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3;
                        b9jVar = (b9j) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1;
                        b.b(obj);
                        CharSequence charSequence172 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence172;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 10;
                        obj = nohVar4.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 10:
                        charSequence6 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        b9jVar3 = (b9j) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1;
                        b.b(obj);
                        return new f1j(new p1j(charSequence6, (CharSequence) obj, ((u8j) b9jVar3).d));
                    case 11:
                        h = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4;
                        nohVar3 = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3;
                        b.b(obj);
                        CharSequence charSequence182 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence182;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 12;
                        k4 = nohVar3.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (k4 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 12:
                        CharSequence charSequence26 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        noh nohVar10 = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4;
                        b.b(obj);
                        charSequence7 = charSequence26;
                        h = nohVar10;
                        CharSequence charSequence192 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence7;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6 = charSequence192;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 13;
                        obj = h.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 13:
                        charSequence8 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6;
                        charSequence7 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        b.b(obj);
                        return new f1j(new t1j(3, charSequence7, charSequence8, (CharSequence) obj));
                    case 14:
                        h = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4;
                        nohVar2 = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3;
                        b.b(obj);
                        CharSequence charSequence202 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = h;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence202;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 15;
                        k5 = nohVar2.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (k5 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 15:
                        CharSequence charSequence27 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        noh nohVar11 = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4;
                        b.b(obj);
                        charSequence9 = charSequence27;
                        h = nohVar11;
                        CharSequence charSequence212 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence9;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6 = charSequence212;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 16;
                        obj = h.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 16:
                        charSequence10 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$6;
                        charSequence9 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        b.b(obj);
                        return new f1j(new r1j(3, charSequence9, charSequence10, (CharSequence) obj));
                    case 17:
                        nohVar = (noh) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3;
                        b9jVar = (b9j) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1;
                        b.b(obj);
                        CharSequence charSequence222 = (CharSequence) obj;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$0 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1 = b9jVar;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$2 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$3 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$4 = null;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5 = charSequence222;
                        scootersOfferDetailItemsMapper$mapToDetailItem$1.label = 18;
                        obj = nohVar.k(scootersOfferDetailItemsMapper$mapToDetailItem$1);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 18:
                        charSequence11 = (CharSequence) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$5;
                        b9jVar4 = (b9j) scootersOfferDetailItemsMapper$mapToDetailItem$1.L$1;
                        b.b(obj);
                        return new f1j(new s1j(charSequence11, (CharSequence) obj, ((x8j) b9jVar4).d));
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scootersOfferDetailItemsMapper$mapToDetailItem$1 = new ScootersOfferDetailItemsMapper$mapToDetailItem$1(aVar, continuationImpl);
        Object obj2 = scootersOfferDetailItemsMapper$mapToDetailItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (scootersOfferDetailItemsMapper$mapToDetailItem$1.label) {
        }
    }

    public final Object b(List list, Continuation continuation) {
        return bvf0.n(new ScootersOfferDetailItemsMapper$mapToDetailItems$2(list, this, null), continuation);
    }
}
