package xsna;

import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ParticipantsListener.kt */
/* loaded from: classes11.dex */
public interface il90 {

    /* compiled from: ParticipantsListener.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final CallMember a;
        public final List<CallMember> b;
        public final ArrayList c;

        public a(CallMember callMember, List list, ArrayList arrayList) {
            this.a = callMember;
            this.b = list;
            this.c = arrayList;
        }

        public final List<CallMember> a() {
            return this.b;
        }

        public final List<CallMember> b() {
            return this.c;
        }

        public final CallMember c() {
            return this.a;
        }
    }

    /* compiled from: ParticipantsListener.kt */
    /* loaded from: classes7.dex */
    public static final class b {
        public final CallMember a;
        public final List<CallMember> b;
        public final ArrayList c;

        public b(CallMember callMember, List list, ArrayList arrayList) {
            this.a = callMember;
            this.b = list;
            this.c = arrayList;
        }

        public final List<CallMember> a() {
            return this.c;
        }

        public final List<CallMember> b() {
            return this.b;
        }

        public final CallMember c() {
            return this.a;
        }
    }

    /* compiled from: ParticipantsListener.kt */
    /* loaded from: classes7.dex */
    public static final class c {
        public final CallMember a;
        public final ArrayList b;
        public final LinkedHashMap c;
        public final ArrayList d;

        public c(CallMember callMember, ArrayList arrayList, LinkedHashMap linkedHashMap, ArrayList arrayList2) {
            this.a = callMember;
            this.b = arrayList;
            this.c = linkedHashMap;
            this.d = arrayList2;
        }

        public final List<CallMember> a() {
            return this.d;
        }

        public final Map<CallMemberId, CallMemberId> b() {
            return this.c;
        }

        public final List<CallMember> c() {
            return this.b;
        }

        public final CallMember d() {
            return this.a;
        }
    }

    /* compiled from: ParticipantsListener.kt */
    /* loaded from: classes7.dex */
    public static final class d {
        public final CallMember a;
        public final List<CallMember> b;
        public final ArrayList c;

        public d(CallMember callMember, List list, ArrayList arrayList) {
            this.a = callMember;
            this.b = list;
            this.c = arrayList;
        }

        public final List<CallMember> a() {
            return this.c;
        }

        public final CallMember b() {
            return this.a;
        }

        public final List<CallMember> c() {
            return this.b;
        }
    }

    /* compiled from: ParticipantsListener.kt */
    /* loaded from: classes7.dex */
    public static final class e {
        public final CallMember a;
        public final ArrayList b;

        public e(CallMember callMember, ArrayList arrayList) {
            this.a = callMember;
            this.b = arrayList;
        }

        public final List<CallMember> a() {
            return this.b;
        }

        public final CallMember b() {
            return this.a;
        }
    }

    default void d(a aVar) {
    }

    default void h(c cVar) {
    }

    default void s(d dVar) {
    }

    default void t(e eVar) {
    }

    default void x(b bVar) {
    }
}
