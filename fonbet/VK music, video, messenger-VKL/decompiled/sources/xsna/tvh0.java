package xsna;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.B5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import ru.ok.android.utils.Logger;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.wtw;

/* compiled from: SearchIndexer.java */
/* loaded from: classes11.dex */
public final class tvh0<T extends wtw> {
    public static final String[] e = {"щ", "ж", "ч", "ш", "ю", "я", "а", "б", "в", "г", "д", "е", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ъ", "ы", "ь", "э"};
    public static final String[] f = {"sch", "zh", "ch", com.mbridge.msdk.foundation.entity.b.JSON_KEY_SH, "yu", "ya", "a", "b", "v", com.vungle.ads.internal.task.g.e, "d", Logger.METHOD_E, "z", "i", com.mbridge.msdk.foundation.same.report.j.b, CampaignEx.JSON_KEY_AD_K, "l", InneractiveMediationDefs.GENDER_MALE, B5.q, "o", TtmlNode.TAG_P, "r", UcumUtils.UCUM_SECONDS, "t", "u", InneractiveMediationDefs.GENDER_FEMALE, "h", "c", "", "y", "", Logger.METHOD_E};
    public Future<?> a = null;
    public final Object b = new Object();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public final void a(T t) {
        for (char c : t.w7()) {
            String ch = Character.toString(c);
            ConcurrentHashMap concurrentHashMap = this.d;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) concurrentHashMap.get(ch);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                concurrentHashMap.put(ch, copyOnWriteArrayList);
            }
            if (!copyOnWriteArrayList.contains(t)) {
                copyOnWriteArrayList.add(t);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        Future<?> future = this.a;
        if (future != null) {
            future.cancel(true);
        }
        asu0.a.getClass();
        this.a = asu0.o().submit(new rm3(7, this, arrayList));
    }

    public final ArrayList c(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        String lowerCase = str.toLowerCase();
        String str2 = lowerCase;
        String str3 = str2;
        for (int i = 0; i < 32; i++) {
            String[] strArr = e;
            String str4 = strArr[i];
            String[] strArr2 = f;
            str2 = str2.replace(str4, strArr2[i]);
            if (strArr2[i].length() > 0) {
                str3 = str3.replace(strArr2[i], strArr[i]);
            }
        }
        if (str2.equals(lowerCase)) {
            str2 = str3;
        }
        ArrayList arrayList = new ArrayList();
        if (lowerCase == null || lowerCase.length() <= 0) {
            arrayList.addAll(this.c);
            return arrayList;
        }
        String substring = lowerCase.substring(0, 1);
        ConcurrentHashMap concurrentHashMap = this.d;
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) concurrentHashMap.get(substring);
        if (copyOnWriteArrayList2 != null) {
            Iterator it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                wtw wtwVar = (wtw) it.next();
                if (wtwVar != null && wtwVar.E3(lowerCase)) {
                    arrayList.add(wtwVar);
                }
            }
        }
        if (str2.length() > 0 && (copyOnWriteArrayList = (CopyOnWriteArrayList) concurrentHashMap.get(str2.substring(0, 1))) != null) {
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                wtw wtwVar2 = (wtw) it2.next();
                if (wtwVar2 != null && wtwVar2.E3(str2) && !arrayList.contains(wtwVar2)) {
                    arrayList.add(wtwVar2);
                }
            }
        }
        return arrayList;
    }
}
