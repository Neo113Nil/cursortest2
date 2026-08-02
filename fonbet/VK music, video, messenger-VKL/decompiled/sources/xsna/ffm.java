package xsna;

import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeImChatItem;
import xsna.gzp0;

/* compiled from: DialogHeaderReporter.kt */
/* loaded from: classes.dex */
public final class ffm {
    public static final ffm a = new ffm();

    public static void a(long j, SchemeStat$TypeImChatItem.Subtype subtype) {
        gzp0.a.b(SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.GROUP, Long.valueOf(j), null, null, null, null, 60, null), new SchemeStat$TypeImChatItem(subtype), 2));
    }
}
