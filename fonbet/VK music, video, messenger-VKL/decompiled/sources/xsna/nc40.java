package xsna;

import android.text.TextUtils;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;

/* compiled from: MusicBroadcastManagerImpl.kt */
/* loaded from: classes3.dex */
public final class nc40 implements mc40 {
    public ArrayList a;

    @Override // xsna.mc40
    public final void a(MusicTrack musicTrack, ArrayList arrayList) {
        List<UserId> b = b();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!b.contains((UserId) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : b) {
            if (!arrayList.contains((UserId) obj2)) {
                arrayList3.add(obj2);
            }
        }
        this.a = arrayList;
        bn40.f("vk", "Set broadcast: enable=", arrayList2, ", disable=", arrayList3);
        Preference.l().edit().putString("audio_broadcast", TextUtils.join(StringUtils.COMMA, arrayList)).apply();
        d(musicTrack, arrayList2);
        d(null, arrayList3);
    }

    @Override // xsna.mc40
    public final List<UserId> b() {
        Iterable iterable;
        UserId userId;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            return arrayList;
        }
        List a = n6j.a(0, StringUtils.COMMA, Preference.l().getString("audio_broadcast", ""));
        if (!a.isEmpty()) {
            ListIterator listIterator = a.listIterator(a.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    iterable = j5g.H0(a, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        iterable = EmptyList.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Long n = arm0.n((String) it.next());
            if (n != null) {
                long longValue = n.longValue();
                gzs<s3q0> gzsVar = fkq0.a;
                userId = new UserId(longValue);
            } else {
                userId = null;
            }
            if (userId != null) {
                arrayList2.add(userId);
            }
        }
        return j5g.O0(arrayList2);
    }

    @Override // xsna.mc40
    public final void c(MusicTrack musicTrack) {
        d(musicTrack, b());
    }

    public final void d(MusicTrack musicTrack, List<UserId> list) {
        tfx tfxVar;
        if (list.isEmpty()) {
            return;
        }
        if (musicTrack == null || !musicTrack.Vb()) {
            String Ib = musicTrack != null ? musicTrack.Ib() : null;
            String str = musicTrack != null ? musicTrack.y : null;
            tfx tfxVar2 = new tfx("audio.setBroadcast", new er(4), new fr(3));
            if (Ib != null) {
                tfxVar = tfxVar2;
                tfx.o(tfxVar, "audio", Ib, 0, 0, 12);
            } else {
                tfxVar = tfxVar2;
            }
            if (str != null) {
                tfx.o(tfxVar, "track_code", str, 0, 0, 12);
            }
            tfx.p(tfxVar, "target_ids", list, 0L, 12);
            yfb.x(tfxVar).p();
        }
    }
}
