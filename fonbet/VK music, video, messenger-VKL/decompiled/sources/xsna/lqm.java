package xsna;

import com.vk.api.generated.messages.dto.MessagesFolderDto;
import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import com.vk.api.generated.messages.dto.MessagesSublistInfoDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.dialogs.FolderType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: DialogsFoldersMergeTask.kt */
/* loaded from: classes2.dex */
public final class lqm extends b920 {
    public final List<rdm> c;
    public final Map<Integer, Collection<Peer>> d;
    public final Map<Integer, Collection<String>> e;
    public final List<gum0> f;

    /* compiled from: DialogsFoldersMergeTask.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r8v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
        public static lqm a(MessagesFoldersInfoDto messagesFoldersInfoDto) {
            ?? r2;
            ?? r8;
            List<MessagesSublistInfoDto> d = messagesFoldersInfoDto.d();
            if (d != null) {
                List<MessagesSublistInfoDto> list = d;
                r2 = new ArrayList(c5g.u(list, 10));
                for (MessagesSublistInfoDto messagesSublistInfoDto : list) {
                    String e = messagesSublistInfoDto.e();
                    String description = messagesSublistInfoDto.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    r2.add(new gum0(messagesSublistInfoDto.getType(), e, description, new fum0(messagesSublistInfoDto.d().d(), messagesSublistInfoDto.d().e())));
                }
            } else {
                r2 = EmptyList.b;
            }
            List<MessagesFolderDto> e2 = messagesFoldersInfoDto.e();
            ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
            for (MessagesFolderDto messagesFolderDto : e2) {
                int id = messagesFolderDto.getId();
                String g = messagesFolderDto.g();
                FolderType.b bVar = FolderType.Companion;
                String type = messagesFolderDto.getType();
                bVar.getClass();
                arrayList.add(new rdm(id, g, FolderType.b.a(type), messagesFolderDto.d()));
            }
            List<MessagesFolderDto> e3 = messagesFoldersInfoDto.e();
            int e4 = on00.e(c5g.u(e3, 10));
            if (e4 < 16) {
                e4 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e4);
            for (MessagesFolderDto messagesFolderDto2 : e3) {
                Integer valueOf = Integer.valueOf(messagesFolderDto2.getId());
                List<UserId> f = messagesFolderDto2.f();
                if (f != null) {
                    List<UserId> list2 = f;
                    r8 = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        r8.add(com.vk.dto.common.a.a((UserId) it.next()));
                    }
                } else {
                    r8 = 0;
                }
                if (r8 == 0) {
                    r8 = EmptyList.b;
                }
                Pair pair = new Pair(valueOf, r8);
                linkedHashMap.put(pair.i(), pair.j());
            }
            List<MessagesFolderDto> e5 = messagesFoldersInfoDto.e();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : e5) {
                List<String> e6 = ((MessagesFolderDto) obj).e();
                if (e6 != null && !e6.isEmpty()) {
                    arrayList2.add(obj);
                }
            }
            int e7 = on00.e(c5g.u(arrayList2, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e7 >= 16 ? e7 : 16);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                MessagesFolderDto messagesFolderDto3 = (MessagesFolderDto) it2.next();
                Integer valueOf2 = Integer.valueOf(messagesFolderDto3.getId());
                List<String> e8 = messagesFolderDto3.e();
                if (e8 == null) {
                    e8 = EmptyList.b;
                }
                Pair pair2 = new Pair(valueOf2, e8);
                linkedHashMap2.put(pair2.i(), pair2.j());
            }
            return new lqm(arrayList, linkedHashMap, linkedHashMap2, r2);
        }
    }

    public lqm(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, List list2) {
        this.c = list;
        this.d = linkedHashMap;
        this.e = linkedHashMap2;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqm)) {
            return false;
        }
        lqm lqmVar = (lqm) obj;
        return epx.f(this.c, lqmVar.c) && epx.f(this.d, lqmVar.d) && epx.f(this.e, lqmVar.e) && epx.f(this.f, lqmVar.f);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Map<Integer, Collection<Peer>> map = this.d;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<Integer, Collection<String>> map2 = this.e;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        List<gum0> list = this.f;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        w2wVar.I0().u(new b7(10, w2wVar, this));
        return s3q0.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsFoldersMergeTask(folders=");
        sb.append(this.c);
        sb.append(", peers=");
        sb.append(this.d);
        sb.append(", foldersToSublists=");
        sb.append(this.e);
        sb.append(", sublists=");
        return ms9.a(')', sb, this.f);
    }
}
