package androidx.emoji2.emojipicker;

import android.content.Context;
import android.content.res.TypedArray;
import defpackage.bvf0;
import defpackage.cy11;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.nyq;
import defpackage.tcc;
import defpackage.tun;
import defpackage.uu6;
import defpackage.vmg0;
import defpackage.wly0;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a {
    public static final a a = new a();
    public static List b;
    public static LinkedHashMap c;

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bb A[LOOP:0: B:11:0x00b5->B:13:0x00bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c A[LOOP:4: B:40:0x0146->B:42:0x014c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ContinuationImpl continuationImpl) {
        BundledEmojiListLoader$load$1 bundledEmojiListLoader$load$1;
        int i;
        TypedArray typedArray;
        Iterator it;
        Iterator it2;
        Iterator it3;
        int d;
        Iterator it4;
        if (continuationImpl instanceof BundledEmojiListLoader$load$1) {
            bundledEmojiListLoader$load$1 = (BundledEmojiListLoader$load$1) continuationImpl;
            int i2 = bundledEmojiListLoader$load$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bundledEmojiListLoader$load$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bundledEmojiListLoader$load$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bundledEmojiListLoader$load$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String[] stringArray = context.getResources().getStringArray(vmg0.category_names);
                    TypedArray obtainTypedArray = context.getResources().obtainTypedArray(vmg0.emoji_categories_icons);
                    int length = obtainTypedArray.length();
                    int[] iArr = new int[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr[i3] = obtainTypedArray.getResourceId(i3, 0);
                    }
                    obtainTypedArray.recycle();
                    int i4 = cy11.a("🥱") ? vmg0.emoji_by_category_raw_resources_gender_inclusive : vmg0.emoji_by_category_raw_resources;
                    wly0 wly0Var = nyq.d;
                    nyq nyqVar = nyq.e;
                    if (nyqVar == null) {
                        synchronized (wly0Var) {
                            nyqVar = nyq.e;
                            if (nyqVar == null) {
                                nyqVar = new nyq(context);
                                nyq.e = nyqVar;
                            }
                        }
                    }
                    nyq nyqVar2 = nyqVar;
                    TypedArray obtainTypedArray2 = context.getResources().obtainTypedArray(i4);
                    bundledEmojiListLoader$load$1.L$0 = obtainTypedArray2;
                    bundledEmojiListLoader$load$1.label = 1;
                    obj = bvf0.n(new BundledEmojiListLoader$loadEmoji$2(obtainTypedArray2, nyqVar2, context, iArr, stringArray, null), bundledEmojiListLoader$load$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    typedArray = obtainTypedArray2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    typedArray = (TypedArray) bundledEmojiListLoader$load$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                typedArray.recycle();
                b = list;
                ArrayList arrayList = new ArrayList();
                it = list.iterator();
                while (it.hasNext()) {
                    ycc.r(((uu6) it.next()).c, arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!((tun) next).b.isEmpty()) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    tun tunVar = (tun) it3.next();
                    List list2 = tunVar.b;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list2, 10));
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(new tun((String) it5.next(), tunVar.b));
                    }
                    ycc.r(arrayList4, arrayList3);
                }
                d = gw00.d(tcc.n(arrayList3, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    tun tunVar2 = (tun) it4.next();
                    Pair pair = new Pair(tunVar2.a, tunVar2.b);
                    linkedHashMap.put(pair.c(), pair.f());
                }
                c = linkedHashMap;
                return zy11.a;
            }
        }
        bundledEmojiListLoader$load$1 = new BundledEmojiListLoader$load$1(this, continuationImpl);
        Object obj2 = bundledEmojiListLoader$load$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bundledEmojiListLoader$load$1.label;
        if (i != 0) {
        }
        List list3 = (List) obj2;
        typedArray.recycle();
        b = list3;
        ArrayList arrayList5 = new ArrayList();
        it = list3.iterator();
        while (it.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        it2 = arrayList5.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList();
        it3 = arrayList22.iterator();
        while (it3.hasNext()) {
        }
        d = gw00.d(tcc.n(arrayList32, 10));
        if (d < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
        it4 = arrayList32.iterator();
        while (it4.hasNext()) {
        }
        c = linkedHashMap2;
        return zy11.a;
    }
}
