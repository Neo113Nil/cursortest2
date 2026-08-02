package xsna;

import android.content.Context;
import com.google.zxing.pdf417.PDF417Common;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import xsna.k840;

/* compiled from: VkMusicSleepTimerActionsFactory.kt */
/* loaded from: classes3.dex */
public final class d6v0 implements gc40<Long> {
    public static final List<Long> d;
    public final List<Long> b;
    public final com.vk.music.player.d c;

    /* compiled from: VkMusicSleepTimerActionsFactory.kt */
    public static final class a {
        public static d6v0 a(com.vk.music.player.d dVar) {
            List<Long> list = d6v0.d;
            if (k840.b.c.a) {
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(0, Long.valueOf(TimeUnit.SECONDS.toMillis(15L)));
                list = arrayList;
            }
            return new d6v0(list, dVar);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        d = e43.l(Long.valueOf(timeUnit.toMillis(5L)), Long.valueOf(timeUnit.toMillis(10L)), Long.valueOf(timeUnit.toMillis(15L)), Long.valueOf(timeUnit.toMillis(30L)), Long.valueOf(timeUnit.toMillis(45L)), Long.valueOf(TimeUnit.HOURS.toMillis(1L)));
    }

    public d6v0(List<Long> list, com.vk.music.player.d dVar) {
        this.b = list;
        this.c = dVar;
    }

    @Override // xsna.gc40
    public final List<ec40<Long>> a() {
        List<Long> list = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            String f = enj.f((timeUnit.toHours(longValue) > 0L ? 1 : (timeUnit.toHours(longValue) == 0L ? 0 : -1)) > 0 ? R.plurals.music_hours : (timeUnit.toMinutes(longValue) > 0L ? 1 : (timeUnit.toMinutes(longValue) == 0L ? 0 : -1)) > 0 ? R.plurals.music_minutes : R.plurals.music_seconds, (int) ((timeUnit.toHours(longValue) > 0L ? 1 : (timeUnit.toHours(longValue) == 0L ? 0 : -1)) > 0 ? timeUnit.toHours(longValue) : timeUnit.toMinutes(longValue) > 0 ? timeUnit.toMinutes(longValue) : timeUnit.toSeconds(longValue)), context);
            arrayList.add(new ec40(R.id.music_action_without_id, Long.valueOf(longValue), f, f, -1, R.attr.vk_ui_icon_accent, R.attr.vk_ui_text_primary, (Integer) null, false, true));
        }
        if (!this.c.b()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(new ec40(R.id.music_action_cancel_music_sleep_timer, -1L, R.string.music_disable_sleep_timer, R.string.music_disable_sleep_timer, -1, 0, R.attr.vk_ui_accent_red, PDF417Common.MAX_CODEWORDS_IN_BARCODE));
        return arrayList2;
    }

    @Override // xsna.gc40
    public final EmptyList c() {
        return EmptyList.b;
    }
}
