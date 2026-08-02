package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.vkontakte.android.attachments.ChannelMessageAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.LazyThreadSafetyMode;
import xsna.rkk;

/* compiled from: CameraChannelDelegate.kt */
/* loaded from: classes16.dex */
public final class sg9 implements m0n0 {
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public sg9(v76 v76Var, u440 u440Var, ChannelMessageAttachment channelMessageAttachment, lh9 lh9Var) {
        this.b = v76Var;
        this.c = u440Var;
        this.d = channelMessageAttachment;
        this.e = lh9Var;
        this.f = msy.a(LazyThreadSafetyMode.NONE, new pd4(1));
    }

    @Override // xsna.m0n0
    public List getCues(long j) {
        usp0 usp0Var = (usp0) this.b;
        Map map = (Map) this.d;
        HashMap hashMap = (HashMap) this.e;
        HashMap hashMap2 = (HashMap) this.f;
        ArrayList arrayList = new ArrayList();
        usp0Var.g(j, usp0Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        usp0Var.i(j, false, usp0Var.h, treeMap);
        usp0Var.h(j, map, hashMap, usp0Var.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                wsp0 wsp0Var = (wsp0) hashMap.get(pair.first);
                wsp0Var.getClass();
                rkk.a aVar = new rkk.a();
                aVar.b = decodeByteArray;
                aVar.a = null;
                aVar.h = wsp0Var.b;
                aVar.i = 0;
                aVar.e = wsp0Var.c;
                aVar.f = 0;
                aVar.g = wsp0Var.e;
                aVar.l = wsp0Var.f;
                aVar.m = wsp0Var.g;
                aVar.p = wsp0Var.j;
                arrayList2.add(aVar.a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            wsp0 wsp0Var2 = (wsp0) hashMap.get(entry.getKey());
            wsp0Var2.getClass();
            rkk.a aVar2 = (rkk.a) entry.getValue();
            CharSequence charSequence = aVar2.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (kvl kvlVar : (kvl[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), kvl.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(kvlVar), spannableStringBuilder.getSpanEnd(kvlVar), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = wsp0Var2.c;
            int i9 = wsp0Var2.d;
            aVar2.e = f;
            aVar2.f = i9;
            aVar2.g = wsp0Var2.e;
            aVar2.h = wsp0Var2.b;
            aVar2.l = wsp0Var2.f;
            float f2 = wsp0Var2.i;
            int i10 = wsp0Var2.h;
            aVar2.k = f2;
            aVar2.j = i10;
            aVar2.p = wsp0Var2.j;
            arrayList2.add(aVar2.a());
        }
        return arrayList2;
    }

    @Override // xsna.m0n0
    public long getEventTime(int i) {
        return ((long[]) this.c)[i];
    }

    @Override // xsna.m0n0
    public int getEventTimeCount() {
        return ((long[]) this.c).length;
    }

    @Override // xsna.m0n0
    public int getNextEventTimeIndex(long j) {
        long[] jArr = (long[]) this.c;
        int b = y2r0.b(jArr, j, false);
        if (b < jArr.length) {
            return b;
        }
        return -1;
    }

    public sg9(usp0 usp0Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.b = usp0Var;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = Collections.unmodifiableMap(hashMap);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        usp0Var.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.c = jArr;
    }
}
