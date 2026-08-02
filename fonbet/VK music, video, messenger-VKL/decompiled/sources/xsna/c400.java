package xsna;

import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import java.util.LinkedHashMap;

/* compiled from: LongPollEntityInfo.kt */
/* loaded from: classes2.dex */
public final class c400 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashMap k = new LinkedHashMap();
    public oeb l;
    public Boolean m;
    public MessagesFoldersInfoDto n;
    public boolean o;

    public final boolean a() {
        return this.l != null;
    }

    public final String toString() {
        return "LongPollEntityInfo(users=" + this.a + ", emails=" + this.b + ", groups=" + this.c + ", dialogs=" + this.d + ", contacts=" + this.e + ", chatsInfo=" + this.f + ", messagesByCnvId=" + this.h + ", channels=" + this.i + "channelsMessagesByCnvId=" + this.j + "channelsCounters=" + this.l + "firstMissedEntriesLoadingFinished=" + this.o + "incognitos=" + this.k + "folders=" + this.n + ')';
    }
}
