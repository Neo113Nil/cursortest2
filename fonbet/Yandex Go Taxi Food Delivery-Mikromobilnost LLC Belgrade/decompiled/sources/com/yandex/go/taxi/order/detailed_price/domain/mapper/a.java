package com.yandex.go.taxi.order.detailed_price.domain.mapper;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$DetailedPrice;
import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$Icon;
import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$Spacer;
import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$Text;
import com.yandex.go.taxi.order.detailed_price.data.api.response.i;
import com.yandex.go.taxi.order.detailed_price.data.api.response.j;
import defpackage.a4j;
import defpackage.b3j;
import defpackage.b4j;
import defpackage.bss0;
import defpackage.css0;
import defpackage.fef;
import defpackage.j73;
import defpackage.jl40;
import defpackage.kdc;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.t2j;
import defpackage.u2j;
import defpackage.ufu;
import defpackage.v2j;
import defpackage.v3j;
import defpackage.w2j;
import defpackage.w511;
import defpackage.x2j;
import defpackage.xrs0;
import defpackage.y3j;
import defpackage.ycc;
import defpackage.yrs0;
import defpackage.z3j;
import defpackage.zrs0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class a {
    public final pdc a;
    public final v3j b;
    public final c c;
    public final e d;

    public a(pdc pdcVar, v3j v3jVar, c cVar, e eVar) {
        this.a = pdcVar;
        this.b = v3jVar;
        this.c = cVar;
        this.d = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0133 -> B:12:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x013d -> B:13:0x0153). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0151 -> B:13:0x0153). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, fef fefVar, ContinuationImpl continuationImpl) {
        DetailedPriceMapper$map$1 detailedPriceMapper$map$1;
        int i;
        Iterator it;
        fef fefVar2;
        Collection collection;
        fef fefVar3;
        x2j x2jVar;
        if (continuationImpl instanceof DetailedPriceMapper$map$1) {
            detailedPriceMapper$map$1 = (DetailedPriceMapper$map$1) continuationImpl;
            int i2 = detailedPriceMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailedPriceMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailedPriceMapper$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedPriceMapper$map$1.label;
                if (i == 0) {
                    if (i == 1) {
                        it = (Iterator) detailedPriceMapper$map$1.L$6;
                        collection = (Collection) detailedPriceMapper$map$1.L$4;
                        fefVar3 = (fef) detailedPriceMapper$map$1.L$1;
                        b.b(obj);
                        x2jVar = (x2j) obj;
                    } else if (i == 2) {
                        it = (Iterator) detailedPriceMapper$map$1.L$6;
                        collection = (Collection) detailedPriceMapper$map$1.L$4;
                        fefVar3 = (fef) detailedPriceMapper$map$1.L$1;
                        b.b(obj);
                        x2jVar = (x2j) obj;
                    } else {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) detailedPriceMapper$map$1.L$6;
                        collection = (Collection) detailedPriceMapper$map$1.L$4;
                        fefVar3 = (fef) detailedPriceMapper$map$1.L$1;
                        b.b(obj);
                        x2jVar = (x2j) obj;
                    }
                    if (x2jVar != null) {
                        collection.add(x2jVar);
                    }
                    fefVar2 = fefVar3;
                    if (it.hasNext()) {
                        j jVar = (j) it.next();
                        if (jVar instanceof DetailedPriceItem$DetailedPrice) {
                            detailedPriceMapper$map$1.L$0 = null;
                            detailedPriceMapper$map$1.L$1 = fefVar2;
                            detailedPriceMapper$map$1.L$2 = null;
                            detailedPriceMapper$map$1.L$3 = null;
                            detailedPriceMapper$map$1.L$4 = collection;
                            detailedPriceMapper$map$1.L$5 = null;
                            detailedPriceMapper$map$1.L$6 = it;
                            detailedPriceMapper$map$1.L$7 = null;
                            detailedPriceMapper$map$1.L$8 = null;
                            detailedPriceMapper$map$1.L$9 = null;
                            detailedPriceMapper$map$1.label = 1;
                            Object b = b((DetailedPriceItem$DetailedPrice) jVar, fefVar2, detailedPriceMapper$map$1);
                            if (b != obj2) {
                                fefVar3 = fefVar2;
                                x2jVar = (x2j) b;
                                if (x2jVar != null) {
                                }
                                fefVar2 = fefVar3;
                            }
                            return obj2;
                        }
                        if (jVar instanceof DetailedPriceItem$Icon) {
                            detailedPriceMapper$map$1.L$0 = null;
                            detailedPriceMapper$map$1.L$1 = fefVar2;
                            detailedPriceMapper$map$1.L$2 = null;
                            detailedPriceMapper$map$1.L$3 = null;
                            detailedPriceMapper$map$1.L$4 = collection;
                            detailedPriceMapper$map$1.L$5 = null;
                            detailedPriceMapper$map$1.L$6 = it;
                            detailedPriceMapper$map$1.L$7 = null;
                            detailedPriceMapper$map$1.L$8 = null;
                            detailedPriceMapper$map$1.L$9 = null;
                            detailedPriceMapper$map$1.label = 2;
                            Object d = d((DetailedPriceItem$Icon) jVar, detailedPriceMapper$map$1);
                            if (d != obj2) {
                                fefVar3 = fefVar2;
                                x2jVar = (x2j) d;
                                if (x2jVar != null) {
                                }
                                fefVar2 = fefVar3;
                            }
                            return obj2;
                        }
                        if (jVar instanceof DetailedPriceItem$Text) {
                            detailedPriceMapper$map$1.L$0 = null;
                            detailedPriceMapper$map$1.L$1 = fefVar2;
                            detailedPriceMapper$map$1.L$2 = null;
                            detailedPriceMapper$map$1.L$3 = null;
                            detailedPriceMapper$map$1.L$4 = collection;
                            detailedPriceMapper$map$1.L$5 = null;
                            detailedPriceMapper$map$1.L$6 = it;
                            detailedPriceMapper$map$1.L$7 = null;
                            detailedPriceMapper$map$1.L$8 = null;
                            detailedPriceMapper$map$1.L$9 = null;
                            detailedPriceMapper$map$1.label = 3;
                            Object e = e((DetailedPriceItem$Text) jVar, detailedPriceMapper$map$1);
                            if (e != obj2) {
                                fefVar3 = fefVar2;
                                obj = e;
                                x2jVar = (x2j) obj;
                                if (x2jVar != null) {
                                }
                                fefVar2 = fefVar3;
                            }
                            return obj2;
                        }
                        if (jVar instanceof DetailedPriceItem$Spacer) {
                            v2j v2jVar = new v2j(((DetailedPriceItem$Spacer) jVar).a);
                            fefVar3 = fefVar2;
                            x2jVar = v2jVar;
                        } else {
                            if (!jl40.l(jVar, i.INSTANCE)) {
                                w511.b();
                                return null;
                            }
                            fefVar3 = fefVar2;
                            x2jVar = null;
                        }
                        if (x2jVar != null) {
                        }
                        fefVar2 = fefVar3;
                        if (it.hasNext()) {
                            return (List) collection;
                        }
                    }
                } else {
                    b.b(obj);
                    if (list == null) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    it = list.iterator();
                    fefVar2 = fefVar;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        detailedPriceMapper$map$1 = new DetailedPriceMapper$map$1(this, continuationImpl);
        Object obj3 = detailedPriceMapper$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedPriceMapper$map$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yandex.go.taxi.order.detailed_price.domain.mapper.a] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0088 -> B:10:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(DetailedPriceItem$DetailedPrice detailedPriceItem$DetailedPrice, fef fefVar, ContinuationImpl continuationImpl) {
        DetailedPriceMapper$mapDetailedPrice$1 detailedPriceMapper$mapDetailedPrice$1;
        int i;
        ArrayList arrayList;
        DetailedPriceItem$DetailedPrice detailedPriceItem$DetailedPrice2;
        Iterator it;
        fef fefVar2;
        if (continuationImpl instanceof DetailedPriceMapper$mapDetailedPrice$1) {
            detailedPriceMapper$mapDetailedPrice$1 = (DetailedPriceMapper$mapDetailedPrice$1) continuationImpl;
            int i2 = detailedPriceMapper$mapDetailedPrice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailedPriceMapper$mapDetailedPrice$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailedPriceMapper$mapDetailedPrice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedPriceMapper$mapDetailedPrice$1.label;
                if (i != 0) {
                    b.b(obj);
                    List list = detailedPriceItem$DetailedPrice.a.a;
                    arrayList = new ArrayList();
                    detailedPriceItem$DetailedPrice2 = detailedPriceItem$DetailedPrice;
                    it = list.iterator();
                    fefVar2 = fefVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) detailedPriceMapper$mapDetailedPrice$1.L$5;
                    ?? r9 = (Collection) detailedPriceMapper$mapDetailedPrice$1.L$4;
                    fef fefVar3 = (fef) detailedPriceMapper$mapDetailedPrice$1.L$1;
                    DetailedPriceItem$DetailedPrice detailedPriceItem$DetailedPrice3 = (DetailedPriceItem$DetailedPrice) detailedPriceMapper$mapDetailedPrice$1.L$0;
                    b.b(obj);
                    ArrayList arrayList2 = r9;
                    detailedPriceItem$DetailedPrice2 = detailedPriceItem$DetailedPrice3;
                    ycc.r((Iterable) obj, arrayList2);
                    fefVar2 = fefVar3;
                    arrayList = arrayList2;
                    if (it.hasNext()) {
                        DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem detailedPriceItem = (DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem) it.next();
                        detailedPriceMapper$mapDetailedPrice$1.L$0 = detailedPriceItem$DetailedPrice2;
                        detailedPriceMapper$mapDetailedPrice$1.L$1 = fefVar2;
                        detailedPriceMapper$mapDetailedPrice$1.L$2 = null;
                        detailedPriceMapper$mapDetailedPrice$1.L$3 = null;
                        detailedPriceMapper$mapDetailedPrice$1.L$4 = arrayList;
                        detailedPriceMapper$mapDetailedPrice$1.L$5 = it;
                        detailedPriceMapper$mapDetailedPrice$1.L$6 = null;
                        detailedPriceMapper$mapDetailedPrice$1.L$7 = null;
                        detailedPriceMapper$mapDetailedPrice$1.label = 1;
                        Object c = c(detailedPriceItem, fefVar2, detailedPriceMapper$mapDetailedPrice$1);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ArrayList arrayList3 = arrayList;
                        fefVar3 = fefVar2;
                        obj = c;
                        arrayList2 = arrayList3;
                        ycc.r((Iterable) obj, arrayList2);
                        fefVar2 = fefVar3;
                        arrayList = arrayList2;
                        if (it.hasNext()) {
                            List M = kotlin.collections.a.M(arrayList);
                            kdc b = ((ufu) this.a).b(detailedPriceItem$DetailedPrice2.a.b);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj2 : M) {
                                if (obj2 instanceof z3j) {
                                    arrayList4.add(obj2);
                                }
                            }
                            boolean isEmpty = arrayList4.isEmpty();
                            boolean z = arrayList4.size() != detailedPriceItem$DetailedPrice2.a.a.size();
                            if (isEmpty || z) {
                                return null;
                            }
                            return new t2j(new b4j(M, b));
                        }
                    }
                }
            }
        }
        detailedPriceMapper$mapDetailedPrice$1 = new DetailedPriceMapper$mapDetailedPrice$1(this, continuationImpl);
        Object obj3 = detailedPriceMapper$mapDetailedPrice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedPriceMapper$mapDetailedPrice$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem detailedPriceItem, fef fefVar, ContinuationImpl continuationImpl) {
        DetailedPriceMapper$mapDetailedPriceItem$1 detailedPriceMapper$mapDetailedPriceItem$1;
        int i;
        DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem detailedPriceItem2;
        css0 css0Var;
        Pair pair;
        z3j z3jVar;
        int i2;
        CharSequence charSequence;
        if (continuationImpl instanceof DetailedPriceMapper$mapDetailedPriceItem$1) {
            detailedPriceMapper$mapDetailedPriceItem$1 = (DetailedPriceMapper$mapDetailedPriceItem$1) continuationImpl;
            int i3 = detailedPriceMapper$mapDetailedPriceItem$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                detailedPriceMapper$mapDetailedPriceItem$1.label = i3 - Integer.MIN_VALUE;
                Object obj = detailedPriceMapper$mapDetailedPriceItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedPriceMapper$mapDetailedPriceItem$1.label;
                y3j y3jVar = null;
                if (i != 0) {
                    b.b(obj);
                    List list = detailedPriceItem.a.d;
                    detailedPriceMapper$mapDetailedPriceItem$1.L$0 = detailedPriceItem;
                    detailedPriceMapper$mapDetailedPriceItem$1.L$1 = null;
                    detailedPriceMapper$mapDetailedPriceItem$1.label = 1;
                    obj = ((com.yandex.go.detailed_price.mapper.a) this.b).a(list, fefVar, detailedPriceMapper$mapDetailedPriceItem$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    detailedPriceItem2 = detailedPriceItem;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    detailedPriceItem2 = (DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem) detailedPriceMapper$mapDetailedPriceItem$1.L$0;
                    b.b(obj);
                }
                css0Var = (css0) obj;
                if (!(css0Var instanceof xrs0)) {
                    xrs0 xrs0Var = (xrs0) css0Var;
                    pair = new Pair(xrs0Var.a, xrs0Var.b);
                } else if (css0Var instanceof zrs0) {
                    pair = new Pair(((zrs0) css0Var).a, null);
                } else {
                    if (!jl40.l(css0Var, yrs0.a)) {
                        w511.b();
                        return null;
                    }
                    pair = null;
                }
                if (pair == null) {
                    CharSequence charSequence2 = ((bss0) pair.c()).a;
                    String obj2 = charSequence2 != null ? charSequence2.toString() : null;
                    bss0 bss0Var = (bss0) pair.f();
                    List A = j73.A(new String[]{obj2, (bss0Var == null || (charSequence = bss0Var.a) == null) ? null : charSequence.toString(), detailedPriceItem2.e.a});
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : A) {
                        if (((String) obj3).length() > 0) {
                            arrayList.add(obj3);
                        }
                    }
                    String X = kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62);
                    bss0 bss0Var2 = (bss0) pair.c();
                    bss0 bss0Var3 = (bss0) pair.f();
                    int i4 = (int) detailedPriceItem2.b;
                    int i5 = (int) detailedPriceItem2.c;
                    String str = detailedPriceItem2.e.a;
                    z3jVar = new z3j(bss0Var2, bss0Var3, i4, i5, str.length() == 0 ? null : str, detailedPriceItem2.f, X);
                } else {
                    z3jVar = null;
                }
                i2 = b3j.a[detailedPriceItem2.d.ordinal()];
                if (i2 != 1) {
                    y3jVar = new y3j(DividerType.NORMAL);
                } else if (i2 != 2) {
                    w511.b();
                    return null;
                }
                return j73.A(new a4j[]{z3jVar, y3jVar});
            }
        }
        detailedPriceMapper$mapDetailedPriceItem$1 = new DetailedPriceMapper$mapDetailedPriceItem$1(this, continuationImpl);
        Object obj4 = detailedPriceMapper$mapDetailedPriceItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedPriceMapper$mapDetailedPriceItem$1.label;
        y3j y3jVar2 = null;
        if (i != 0) {
        }
        css0Var = (css0) obj4;
        if (!(css0Var instanceof xrs0)) {
        }
        if (pair == null) {
        }
        i2 = b3j.a[detailedPriceItem2.d.ordinal()];
        if (i2 != 1) {
        }
        return j73.A(new a4j[]{z3jVar, y3jVar2});
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(DetailedPriceItem$Icon detailedPriceItem$Icon, ContinuationImpl continuationImpl) {
        DetailedPriceMapper$mapIcon$1 detailedPriceMapper$mapIcon$1;
        int i;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof DetailedPriceMapper$mapIcon$1) {
            detailedPriceMapper$mapIcon$1 = (DetailedPriceMapper$mapIcon$1) continuationImpl;
            int i2 = detailedPriceMapper$mapIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailedPriceMapper$mapIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailedPriceMapper$mapIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedPriceMapper$mapIcon$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str = detailedPriceItem$Icon.a;
                    if (str != null) {
                        detailedPriceMapper$mapIcon$1.L$0 = null;
                        detailedPriceMapper$mapIcon$1.L$1 = null;
                        detailedPriceMapper$mapIcon$1.label = 1;
                        obj = e.f(this.d, str, null, detailedPriceMapper$mapIcon$1, 6);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    return new u2j(bitmapDrawable);
                }
                return null;
            }
        }
        detailedPriceMapper$mapIcon$1 = new DetailedPriceMapper$mapIcon$1(this, continuationImpl);
        Object obj2 = detailedPriceMapper$mapIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedPriceMapper$mapIcon$1.label;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(DetailedPriceItem$Text detailedPriceItem$Text, ContinuationImpl continuationImpl) {
        DetailedPriceMapper$mapText$1 detailedPriceMapper$mapText$1;
        int i;
        if (continuationImpl instanceof DetailedPriceMapper$mapText$1) {
            detailedPriceMapper$mapText$1 = (DetailedPriceMapper$mapText$1) continuationImpl;
            int i2 = detailedPriceMapper$mapText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailedPriceMapper$mapText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = detailedPriceMapper$mapText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedPriceMapper$mapText$1.label;
                if (i != 0) {
                    b.b(obj);
                    FormattedText formattedText = detailedPriceItem$Text.a;
                    detailedPriceMapper$mapText$1.L$0 = null;
                    detailedPriceMapper$mapText$1.label = 1;
                    obj = c.i(this.c, formattedText, null, detailedPriceMapper$mapText$1, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return new w2j((CharSequence) obj);
            }
        }
        detailedPriceMapper$mapText$1 = new DetailedPriceMapper$mapText$1(this, continuationImpl);
        Object obj2 = detailedPriceMapper$mapText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedPriceMapper$mapText$1.label;
        if (i != 0) {
        }
        return new w2j((CharSequence) obj2);
    }
}
