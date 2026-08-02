package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.api_commands.diff.MessageFlag;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ConversationInfo.kt */
/* loaded from: classes2.dex */
public final class bsj {
    public final com.vk.im.engine.models.dialogs.a a;
    public final a b;
    public final List<Msg> c;
    public final boolean d;
    public final List<k9x> e;
    public final List<k9x> f;
    public final Map<Integer, List<MessageFlag>> g;
    public final List<Integer> h;
    public final Peer.Contact i;
    public final boolean j;

    /* compiled from: ConversationInfo.kt */
    public static final class a {
        public final long a;
        public final b b;
        public final Integer c;
        public final Integer d;
        public final Integer e;
        public final Integer f;
        public final Integer g;
        public final Boolean h;
        public final Long i;
        public final Integer j;

        public a(long j, b bVar, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Boolean bool, Long l, Integer num6) {
            this.a = j;
            this.b = bVar;
            this.c = num;
            this.d = num2;
            this.e = num3;
            this.f = num4;
            this.g = num5;
            this.h = bool;
            this.i = l;
            this.j = num6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            b bVar = this.b;
            int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.d;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.e;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f;
            int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.g;
            int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Boolean bool = this.h;
            int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
            Long l = this.i;
            int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
            Integer num6 = this.j;
            return hashCode9 + (num6 != null ? num6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DialogDiff(id=");
            sb.append(this.a);
            sb.append(',');
            sb.append(this.b);
            sb.append(",inrd=");
            sb.append(this.c);
            sb.append(",outrd=");
            sb.append(this.d);
            sb.append(",unrdcnt=");
            sb.append(this.e);
            sb.append(",srt=");
            sb.append(this.f);
            sb.append(':');
            sb.append(this.g);
            sb.append(",isarch=");
            sb.append(this.h);
            sb.append(",vrsn=");
            return iq.b(sb, this.i, ')');
        }
    }

    /* compiled from: ConversationInfo.kt */
    public static final class b {
        public final List<Integer> a;
        public final List<Integer> b;
        public final List<Integer> c;

        public b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.a = arrayList;
            this.b = arrayList2;
            this.c = arrayList3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            List<Integer> list = this.a;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<Integer> list2 = this.b;
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<Integer> list3 = this.c;
            return hashCode2 + (list3 != null ? list3.hashCode() : 0);
        }

        public final String toString() {
            String str;
            String str2;
            String c;
            StringBuilder sb = new StringBuilder("NewMessages(");
            String str3 = "";
            List<Integer> list = this.a;
            if (list == null || (str = go9.c("cmids=", list)) == null) {
                str = "";
            }
            sb.append(str);
            List<Integer> list2 = this.b;
            if (list2 == null || (str2 = go9.c(",mntn=", list2)) == null) {
                str2 = "";
            }
            sb.append(str2);
            List<Integer> list3 = this.c;
            if (list3 != null && (c = go9.c(",expr=", list3)) != null) {
                str3 = c;
            }
            return ho8.a(sb, str3, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bsj(com.vk.im.engine.models.dialogs.a aVar, a aVar2, List<? extends Msg> list, boolean z, List<k9x> list2, List<k9x> list3, Map<Integer, ? extends List<? extends MessageFlag>> map, List<Integer> list4, Peer.Contact contact, boolean z2) {
        this.a = aVar;
        this.b = aVar2;
        this.c = list;
        this.d = z;
        this.e = list2;
        this.f = list3;
        this.g = map;
        this.h = list4;
        this.i = contact;
        this.j = z2;
    }

    public final long a() {
        com.vk.im.engine.models.dialogs.a aVar = this.a;
        if (aVar != null) {
            return aVar.a;
        }
        a aVar2 = this.b;
        return (aVar2 != null ? Long.valueOf(aVar2.a) : null).longValue();
    }

    public final int b(w2w w2wVar) {
        com.vk.im.engine.models.dialogs.a aVar = this.a;
        if (aVar != null) {
            return aVar.b;
        }
        com.vk.im.engine.models.dialogs.b c = sn.c(w2wVar).c(a());
        Integer valueOf = c != null ? Integer.valueOf(c.c) : null;
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    public final int c() {
        Object obj;
        com.vk.im.engine.models.dialogs.a aVar = this.a;
        if (aVar != null) {
            return aVar.f;
        }
        Iterator<T> it = this.c.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int i = ((Msg) next).d;
                do {
                    Object next2 = it.next();
                    int i2 = ((Msg) next2).d;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Msg msg = (Msg) obj;
        if (msg != null) {
            return msg.d;
        }
        return 0;
    }

    public final List<Integer> d() {
        b bVar;
        List<Integer> list;
        com.vk.im.engine.models.dialogs.a aVar = this.a;
        if (aVar != null && (list = aVar.w) != null) {
            return list;
        }
        a aVar2 = this.b;
        List<Integer> list2 = (aVar2 == null || (bVar = aVar2.b) == null) ? null : bVar.b;
        return list2 == null ? EmptyList.b : list2;
    }

    public final List<Integer> e(w2w w2wVar) {
        List<Integer> list;
        com.vk.im.engine.models.dialogs.a aVar = this.a;
        if (aVar != null && (list = aVar.F) != null) {
            return list;
        }
        com.vk.im.engine.models.dialogs.b c = sn.c(w2wVar).c(a());
        return c != null ? c.U : EmptyList.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsj)) {
            return false;
        }
        bsj bsjVar = (bsj) obj;
        return epx.f(this.a, bsjVar.a) && epx.f(this.b, bsjVar.b) && epx.f(this.c, bsjVar.c) && this.d == bsjVar.d && epx.f(this.e, bsjVar.e) && epx.f(this.f, bsjVar.f) && epx.f(this.g, bsjVar.g) && epx.f(this.h, bsjVar.h) && epx.f(this.i, bsjVar.i) && this.j == bsjVar.j;
    }

    public final int hashCode() {
        com.vk.im.engine.models.dialogs.a aVar = this.a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        a aVar2 = this.b;
        int a2 = fw3.a(v11.a(fw3.a(fw3.a(qoy.b(fw3.a((hashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        Peer.Contact contact = this.i;
        return Boolean.hashCode(this.j) + ((a2 + (contact != null ? Long.hashCode(contact.b) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationInfo(dialog=");
        sb.append(this.a);
        sb.append(", dialogDiff=");
        sb.append(this.b);
        sb.append(", messages=");
        sb.append(this.c);
        sb.append(", invalidate=");
        sb.append(this.d);
        sb.append(", updatedCmidsRanges=");
        sb.append(this.e);
        sb.append(", deletedCmidsRanges=");
        sb.append(this.f);
        sb.append(", updatedCmidsWithReasons=");
        sb.append(this.g);
        sb.append(", updatedCmidsReactions=");
        sb.append(this.h);
        sb.append(", migratedFromContact=");
        sb.append(this.i);
        sb.append(", membersChanged=");
        return defpackage.q0.a(sb, this.j, ')');
    }
}
