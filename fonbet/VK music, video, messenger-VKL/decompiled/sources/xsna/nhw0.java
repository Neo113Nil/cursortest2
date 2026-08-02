package xsna;

import com.vk.voip.dto.call_member.CallMember;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.VoipViewModelState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: VoipCallParticipantsInfo.kt */
/* loaded from: classes7.dex */
public final class nhw0 {
    public volatile List<CallMember> a;
    public volatile VoipViewModelState b;

    /* compiled from: VoipCallParticipantsInfo.kt */
    public static final class a {
        public final CallMemberId a;
        public final CallMemberId b;

        public a(CallMemberId callMemberId, CallMemberId callMemberId2) {
            this.a = callMemberId;
            this.b = callMemberId2;
        }
    }

    /* compiled from: VoipCallParticipantsInfo.kt */
    public static final class b {
        public final LinkedHashSet a;
        public final int b;
        public final LinkedHashSet c;
        public final LinkedHashSet d;
        public final LinkedHashSet e;
        public final CallMemberId f;
        public final LinkedHashSet g;
        public final LinkedHashSet h;
        public final LinkedHashSet i;
        public final HashMap j;
        public final LinkedHashSet k;
        public final LinkedHashMap l;
        public final LinkedHashMap m;
        public final LinkedHashMap n;
        public final LinkedHashMap o;
        public final LinkedHashSet p;
        public final LinkedHashSet q;
        public final CallMemberId r;
        public final CallMemberId s;
        public final boolean t;

        public b(LinkedHashSet linkedHashSet, int i, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, LinkedHashSet linkedHashSet4, CallMemberId callMemberId, LinkedHashSet linkedHashSet5, LinkedHashSet linkedHashSet6, LinkedHashSet linkedHashSet7, HashMap hashMap, LinkedHashSet linkedHashSet8, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashSet linkedHashSet9, LinkedHashSet linkedHashSet10, CallMemberId callMemberId2, CallMemberId callMemberId3, boolean z) {
            this.a = linkedHashSet;
            this.b = i;
            this.c = linkedHashSet2;
            this.d = linkedHashSet3;
            this.e = linkedHashSet4;
            this.f = callMemberId;
            this.g = linkedHashSet5;
            this.h = linkedHashSet6;
            this.i = linkedHashSet7;
            this.j = hashMap;
            this.k = linkedHashSet8;
            this.l = linkedHashMap;
            this.m = linkedHashMap2;
            this.n = linkedHashMap3;
            this.o = linkedHashMap4;
            this.p = linkedHashSet9;
            this.q = linkedHashSet10;
            this.r = callMemberId2;
            this.s = callMemberId3;
            this.t = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fe, code lost:
    
        if (r1.b.compareTo(r4.b) < 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b a(VoipViewModelState voipViewModelState, List list, dhw0 dhw0Var, a aVar) {
        LinkedHashMap linkedHashMap;
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        this.a = list;
        this.b = voipViewModelState;
        if (dhw0Var == null) {
            return null;
        }
        boolean z = voipViewModelState == VoipViewModelState.InCall;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        boolean z2 = z;
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        LinkedHashSet linkedHashSet11 = new LinkedHashSet();
        LinkedHashSet linkedHashSet12 = new LinkedHashSet();
        Iterator it = list.iterator();
        LinkedHashSet linkedHashSet13 = linkedHashSet12;
        CallMemberId callMemberId = null;
        CallMemberId callMemberId2 = null;
        while (it.hasNext()) {
            LinkedHashSet linkedHashSet14 = linkedHashSet11;
            CallMember callMember = (CallMember) it.next();
            CallMemberId callMemberId3 = callMember.a;
            linkedHashSet3.add(callMemberId3);
            LinkedHashSet linkedHashSet15 = linkedHashSet3;
            if (!callMember.n && !callMember.j) {
                linkedHashSet4.add(callMemberId3);
            }
            if (!z2) {
                linkedHashSet5.add(callMemberId3);
            }
            if (z2 || callMember.n) {
                if (!callMember.n && !callMember.k) {
                    linkedHashSet5.add(callMemberId3);
                }
                if (callMember.f) {
                    linkedHashSet6.add(callMemberId3);
                }
                if (callMember.i) {
                    linkedHashSet7.add(callMemberId3);
                }
                if (callMember.g) {
                    linkedHashSet8.add(callMemberId3);
                }
                if (callMember.h) {
                    linkedHashSet9.add(callMemberId3);
                }
                if (!callMember.s.isEmpty()) {
                    hashMap.put(callMemberId3, callMember.s);
                }
                linkedHashMap2.put(callMemberId3, callMember.b);
                linkedHashMap3.put(callMemberId3, callMember.c);
                linkedHashMap4.put(callMemberId3, callMember.d);
                linkedHashMap5.put(callMemberId3, callMember.e);
                if (callMember.m) {
                    linkedHashSet10.add(callMemberId3);
                    if (callMemberId != null) {
                        linkedHashMap = linkedHashMap4;
                    } else {
                        linkedHashMap = linkedHashMap4;
                    }
                    callMemberId = callMemberId3;
                } else {
                    linkedHashMap = linkedHashMap4;
                }
                if (callMember.l && callMemberId2 == null) {
                    callMemberId2 = callMemberId3;
                }
            } else {
                linkedHashMap = linkedHashMap4;
            }
            if (voipViewModelState == VoipViewModelState.InCall || voipViewModelState == VoipViewModelState.CallingPeer) {
                if (callMember.p) {
                    linkedHashSet = linkedHashSet14;
                    linkedHashSet.add(callMemberId3);
                } else {
                    linkedHashSet = linkedHashSet14;
                }
                if (callMember.q) {
                    linkedHashSet2 = linkedHashSet13;
                    linkedHashSet2.add(callMemberId3);
                    linkedHashSet13 = linkedHashSet2;
                    linkedHashSet3 = linkedHashSet15;
                    linkedHashSet11 = linkedHashSet;
                    linkedHashMap4 = linkedHashMap;
                }
            } else {
                linkedHashSet = linkedHashSet14;
            }
            linkedHashSet2 = linkedHashSet13;
            linkedHashSet13 = linkedHashSet2;
            linkedHashSet3 = linkedHashSet15;
            linkedHashSet11 = linkedHashSet;
            linkedHashMap4 = linkedHashMap;
        }
        LinkedHashMap linkedHashMap6 = linkedHashMap4;
        LinkedHashSet linkedHashSet16 = linkedHashSet11;
        LinkedHashSet linkedHashSet17 = linkedHashSet3;
        LinkedHashSet linkedHashSet18 = linkedHashSet13;
        if (z2 && callMemberId2 == null) {
            callMemberId2 = callMemberId;
        }
        boolean P = j5g.P(linkedHashSet17, aVar.b);
        boolean P2 = j5g.P(linkedHashSet17, dhw0Var.y);
        return new b(linkedHashSet17, Math.max(dhw0Var.i, linkedHashSet17.size()), linkedHashSet4, linkedHashSet5, linkedHashSet10, callMemberId2, linkedHashSet6, linkedHashSet8, linkedHashSet9, hashMap, linkedHashSet7, linkedHashMap2, linkedHashMap3, linkedHashMap6, linkedHashMap5, linkedHashSet16, linkedHashSet18, (P || !P2) ? null : dhw0Var.y, P ? aVar.b : null, j5g.P(linkedHashSet16, aVar.a) || j5g.P(linkedHashSet18, aVar.a));
    }
}
