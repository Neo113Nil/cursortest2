package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$BatchUpload;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$VideoSeenItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$EventTimeItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
import java.util.ArrayList;

/* compiled from: StoryMetricsCollectorImpl.kt */
/* loaded from: classes6.dex */
public final class a7m0 implements z6m0 {
    public final ArrayList b = new ArrayList();

    public static ArrayList f(s0q s0qVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MobileOfficialAppsCoreEncodingStat$EventTimeItem(MobileOfficialAppsCoreEncodingStat$EventTimeItem.EventType.START, s0qVar.a));
        arrayList.add(new MobileOfficialAppsCoreEncodingStat$EventTimeItem(MobileOfficialAppsCoreEncodingStat$EventTimeItem.EventType.FINISH, s0qVar.b));
        if (z) {
            arrayList.add(new MobileOfficialAppsCoreEncodingStat$EventTimeItem(MobileOfficialAppsCoreEncodingStat$EventTimeItem.EventType.ERROR, s0qVar.c));
        }
        return arrayList;
    }

    @Override // xsna.z6m0
    public final void a(int i, s0q s0qVar, Long l, Throwable th) {
        ArrayList f = f(s0qVar, th != null);
        L.l("Encode: " + s0qVar);
        L.l("Encode : " + (s0qVar.b - s0qVar.a));
        long j = o25.a().c().b;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType contentType = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType.STORY;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype contentSubtype = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype.VIDEO;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType eventType = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType.ENCODE;
        String message = th != null ? th.getMessage() : null;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ErrorType errorType = th != null ? MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ErrorType.ENCODE : null;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem = new MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem(j, contentType, x260.b(com.vk.core.utils.newtork.b.c()), null, contentSubtype, vhk0.f(), f, this.b, null, null, null, errorType, message, eventType, null, null, Integer.valueOf(i), l != null ? new MobileOfficialAppsConStoriesStat$VideoSeenItem(l.longValue(), null, 2, null) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147272448, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
        kx6Var.q();
    }

    @Override // xsna.z6m0
    public final void b(int i, int i2) {
        int i3;
        L l = L.a;
        l.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            i3 = i2;
        } else {
            i3 = i2;
            L.u(l, L.LogType.d, new Object[]{sl9.c(i, i3, "batch upload count = ", ", throughput = ", " KB/s")});
        }
        long j = o25.a().c().b;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType contentType = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType.STORY;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype contentSubtype = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype.PHOTO;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType eventType = MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType.UPLOAD;
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem = new MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem(j, contentType, x260.b(com.vk.core.utils.newtork.b.c()), null, contentSubtype, vhk0.f(), null, null, null, null, null, null, null, eventType, null, null, null, null, new MobileOfficialAppsConStoriesStat$BatchUpload(i, Integer.valueOf(i3)), null, null, null, null, null, null, null, null, null, null, null, null, 2147213256, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
        kx6Var.q();
    }

    @Override // xsna.z6m0
    public final void c(int i) {
        b(i, -1);
    }

    @Override // xsna.z6m0
    public final void d(int i, Long l, boolean z, s0q s0qVar, Long l2, Exception exc, int i2, int i3, Integer num, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.EventType eventType) {
        String str;
        if (exc != null) {
            StringBuilder sb = new StringBuilder("Message: ");
            sb.append(exc.getMessage());
            sb.append(" cause: ");
            Throwable cause = exc.getCause();
            sb.append(cause != null ? cause.getMessage() : null);
            sb.append(" stackTrace: ");
            sb.append(sdi.l(exc));
            str = sb.toString();
        } else {
            str = null;
        }
        MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem = new MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem(o25.a().c().b, MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentType.STORY, x260.b(com.vk.core.utils.newtork.b.c()), l, z ? MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype.PHOTO : MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ContentSubtype.VIDEO, vhk0.f(), f(s0qVar, exc != null), null, Integer.valueOf(i2), Integer.valueOf(i3), num, exc != null ? MobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem.ErrorType.UPLOAD : null, str, eventType, null, null, Integer.valueOf(i), l2 != null ? new MobileOfficialAppsConStoriesStat$VideoSeenItem(l2.longValue(), null, 2, null) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147270656, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsCoreEncodingStat$TypeStoryVideoItem;
        kx6Var.q();
    }
}
