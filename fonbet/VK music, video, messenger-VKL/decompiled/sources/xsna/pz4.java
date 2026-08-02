package xsna;

import android.content.Context;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: AudioTrackUtils.kt */
/* loaded from: classes8.dex */
public final class pz4 {
    public static LinkedHashMap a(Context context, List list) {
        String string = context.getString(R.string.one_video_playback_audio_default_name);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            one.video.player.tracks.a aVar = (one.video.player.tracks.a) it.next();
            so4 so4Var = (so4) aVar.c;
            String str = so4Var.g;
            if (str == null) {
                String str2 = so4Var.h;
                String displayLanguage = str2 != null ? new Locale(str2).getDisplayLanguage() : null;
                str = displayLanguage == null ? string : displayLanguage;
            }
            if (str.length() > 0) {
                str = ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
            }
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = s5a.a(str, linkedHashMap);
            }
            ((List) obj).add(aVar);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            List list3 = list2;
            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
            int i = 0;
            for (Object obj2 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                String str4 = ((one.video.player.tracks.a) obj2).b;
                StringBuilder e = fw3.e(str3);
                if (list2.size() > 1) {
                    e.append(" ");
                    e.append(i2);
                }
                linkedHashMap2.put(str4, e.toString());
                arrayList.add(s3q0.a);
                i = i2;
            }
        }
        return linkedHashMap2;
    }
}
