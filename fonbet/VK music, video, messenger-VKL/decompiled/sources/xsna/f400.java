package xsna;

import com.vk.dto.common.Peer;
import com.vk.metrics.trackers.CriticalException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: LongPollEntityMissed.kt */
/* loaded from: classes2.dex */
public final class f400 {
    public boolean k;
    public boolean l;
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashSet g = new LinkedHashSet();
    public final LinkedHashSet h = new LinkedHashSet();
    public final LinkedHashSet i = new LinkedHashSet();
    public final LinkedHashMap j = new LinkedHashMap();
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashMap n = new LinkedHashMap();

    /* compiled from: LongPollEntityMissed.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Peer.Type.GROUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Peer.Type.EMAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Peer.Type.CHANNEL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Peer.Type.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: LongPollEntityMissed.kt */
    public static final class b extends CriticalException {
    }

    /* compiled from: LongPollEntityMissed.kt */
    public static final class c extends CriticalException {
    }

    public final void a(f400 f400Var) {
        this.a.addAll(f400Var.a);
        for (Map.Entry entry : f400Var.b.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            Set set = (Set) entry.getValue();
            Long valueOf = Long.valueOf(longValue);
            LinkedHashMap linkedHashMap = this.b;
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new HashSet();
                linkedHashMap.put(valueOf, obj);
            }
            ((Set) obj).addAll(set);
        }
        this.c.addAll(f400Var.c);
        for (Map.Entry entry2 : f400Var.d.entrySet()) {
            long longValue2 = ((Number) entry2.getKey()).longValue();
            Set set2 = (Set) entry2.getValue();
            Long valueOf2 = Long.valueOf(longValue2);
            LinkedHashMap linkedHashMap2 = this.d;
            Object obj2 = linkedHashMap2.get(valueOf2);
            if (obj2 == null) {
                obj2 = new HashSet();
                linkedHashMap2.put(valueOf2, obj2);
            }
            ((Set) obj2).addAll(set2);
        }
        this.e.addAll(f400Var.e);
        this.f.addAll(f400Var.f);
        this.g.addAll(f400Var.g);
        this.h.addAll(f400Var.h);
        this.i.addAll(f400Var.i);
        for (Map.Entry entry3 : f400Var.j.entrySet()) {
            long longValue3 = ((Number) entry3.getKey()).longValue();
            Set set3 = (Set) entry3.getValue();
            Long valueOf3 = Long.valueOf(longValue3);
            LinkedHashMap linkedHashMap3 = this.j;
            Object obj3 = linkedHashMap3.get(valueOf3);
            if (obj3 == null) {
                obj3 = new HashSet();
                linkedHashMap3.put(valueOf3, obj3);
            }
            ((Set) obj3).addAll(set3);
        }
        this.k = f400Var.k;
        this.l = f400Var.l;
        this.m.addAll(f400Var.m);
        for (Map.Entry entry4 : f400Var.n.entrySet()) {
            long longValue4 = ((Number) entry4.getKey()).longValue();
            Set set4 = (Set) entry4.getValue();
            Long valueOf4 = Long.valueOf(longValue4);
            LinkedHashMap linkedHashMap4 = this.n;
            Object obj4 = linkedHashMap4.get(valueOf4);
            if (obj4 == null) {
                obj4 = new HashSet();
                linkedHashMap4.put(valueOf4, obj4);
            }
            ((Set) obj4).addAll(set4);
        }
    }

    public final void b(int i, long j) {
        Long valueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.j;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new HashSet();
            linkedHashMap.put(valueOf, obj);
        }
        ((Set) obj).add(Integer.valueOf(i));
    }

    public final void c(long j) {
        if (j == 0) {
            com.vk.metrics.eventtracking.b.a.a(new b("Contact with id 0"));
        }
        this.e.add(Long.valueOf(j));
    }

    public final void d(int i, long j) {
        Long valueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.d;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new HashSet();
            linkedHashMap.put(valueOf, obj);
        }
        ((Set) obj).add(Integer.valueOf(i));
    }

    public final void e(long j) {
        if (j == 1900000000) {
            com.vk.metrics.eventtracking.b.a.a(new c("User with id 1_900_000_000"));
        }
        this.f.add(Long.valueOf(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f400)) {
            return false;
        }
        f400 f400Var = (f400) obj;
        return epx.f(this.a, f400Var.a) && epx.f(this.b, f400Var.b) && epx.f(this.c, f400Var.c) && epx.f(this.e, f400Var.e) && epx.f(this.f, f400Var.f) && epx.f(this.g, f400Var.g) && epx.f(this.h, f400Var.h) && epx.f(this.i, f400Var.a) && epx.f(this.j, f400Var.j) && this.k == f400Var.k && this.l == f400Var.l && epx.f(this.m, f400Var.m) && epx.f(this.n, f400Var.n);
    }

    public final void f() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.k = false;
        this.l = false;
        this.m.clear();
        this.n.clear();
    }

    public final boolean g() {
        return this.c.isEmpty() && this.a.isEmpty() && this.b.isEmpty() && this.d.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.g.isEmpty() && this.h.isEmpty() && this.i.isEmpty() && this.j.isEmpty() && !this.k && !this.l && this.m.isEmpty() && this.n.isEmpty();
    }

    public final int hashCode() {
        return this.m.hashCode() + uf3.b(this.n, qoy.b(qoy.b(uf3.b(this.j, (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + uf3.b(this.d, (this.c.hashCode() + uf3.b(this.b, this.a.hashCode() * 31, 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31, this.k), 31, this.l), 31);
    }

    public final String toString() {
        return "LongPollEntityMissed(chatsInfoIds=" + this.a + ", chatMemberInfoIds=" + this.b + ", conversationDialogIds=" + this.c + ", messageCnvIds=" + this.d + ", contactIds=" + this.e + ", userIds=" + this.f + ", emailIds=" + this.g + ", groupIds=" + this.h + ", channelIds=" + this.i + ", channelMessageIds=" + this.j + ", channelsCounterIsMissed=" + this.k + ", includeChannelNotificationsIsMissed=" + this.l + ", incognitoIds=" + this.n + ", missedFolderIds=" + this.m + ')';
    }
}
