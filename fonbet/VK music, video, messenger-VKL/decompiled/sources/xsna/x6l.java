package xsna;

import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeDebugStatsItem;

/* compiled from: DebugStatsEventBuilder.kt */
/* loaded from: classes11.dex */
public final class x6l extends zzg0 {
    public x6l(SchemeStatSak$TypeDebugStatsItem schemeStatSak$TypeDebugStatsItem, boolean z) {
        super(z);
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.NOWHERE;
        SchemeStatSak$TypeAction a = SchemeStatSak$TypeAction.a.a(schemeStatSak$TypeDebugStatsItem);
        this.f = schemeStatSak$EventScreen;
        this.g = a;
    }
}
