package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.builders.SetBuilder;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;

/* compiled from: ProfilesIds.kt */
/* loaded from: classes2.dex */
public final class f1e0 {
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;
    public final LinkedHashSet e;

    /* compiled from: ProfilesIds.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Peer.Type.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Peer.Type.GROUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Peer.Type.CHANNEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f1e0() {
        this.a = new LinkedHashSet();
        this.b = new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
    }

    public static String i(String str, LinkedHashSet linkedHashSet, izs izsVar) {
        if ((!linkedHashSet.isEmpty() ? linkedHashSet : null) == null) {
            return null;
        }
        StringBuilder b = v1v.b(str, ':');
        b.append((String) izsVar.invoke(linkedHashSet));
        return b.toString();
    }

    public final void a(long j, Peer.Type type) {
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            this.a.add(Long.valueOf(j));
            return;
        }
        if (i == 2) {
            this.b.add(Long.valueOf(j));
            return;
        }
        if (i == 3) {
            this.c.add(Long.valueOf(j));
        } else if (i == 4) {
            this.d.add(Long.valueOf(j));
        } else {
            if (i != 5) {
                return;
            }
            this.e.add(Long.valueOf(j));
        }
    }

    public final void b(Peer.Type type, Collection<Long> collection) {
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            this.a.addAll(collection);
            return;
        }
        if (i == 2) {
            this.b.addAll(collection);
            return;
        }
        if (i == 3) {
            this.c.addAll(collection);
        } else if (i == 4) {
            this.d.addAll(collection);
        } else {
            if (i != 5) {
                return;
            }
            this.e.addAll(collection);
        }
    }

    public final void c(Peer peer) {
        long j = peer.d;
        int i = a.$EnumSwitchMapping$0[peer.c.ordinal()];
        if (i == 1) {
            this.a.add(Long.valueOf(j));
            return;
        }
        if (i == 2) {
            this.b.add(Long.valueOf(j));
            return;
        }
        if (i == 3) {
            this.c.add(Long.valueOf(j));
        } else if (i == 4) {
            this.d.add(Long.valueOf(j));
        } else {
            if (i != 5) {
                return;
            }
            this.e.add(Long.valueOf(j));
        }
    }

    public final void d(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((Peer) it.next());
        }
    }

    public final void e(f1e0 f1e0Var) {
        this.a.addAll(f1e0Var.a);
        this.b.addAll(f1e0Var.b);
        this.c.addAll(f1e0Var.c);
        this.d.addAll(f1e0Var.d);
        this.e.addAll(f1e0Var.e);
    }

    public final boolean f() {
        return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.isEmpty() && this.e.isEmpty();
    }

    public final boolean g() {
        return !f();
    }

    public final SetBuilder h() {
        SetBuilder setBuilder = new SetBuilder();
        LinkedHashSet linkedHashSet = this.a;
        ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.a(longValue, Peer.Type.USER));
        }
        setBuilder.addAll(arrayList);
        LinkedHashSet linkedHashSet2 = this.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(linkedHashSet2, 10));
        Iterator it2 = linkedHashSet2.iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Number) it2.next()).longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList2.add(Peer.a.a(longValue2, Peer.Type.CONTACT));
        }
        setBuilder.addAll(arrayList2);
        LinkedHashSet linkedHashSet3 = this.c;
        ArrayList arrayList3 = new ArrayList(c5g.u(linkedHashSet3, 10));
        Iterator it3 = linkedHashSet3.iterator();
        while (it3.hasNext()) {
            long longValue3 = ((Number) it3.next()).longValue();
            Serializer.c<Peer> cVar3 = Peer.CREATOR;
            arrayList3.add(Peer.a.a(longValue3, Peer.Type.EMAIL));
        }
        setBuilder.addAll(arrayList3);
        LinkedHashSet linkedHashSet4 = this.d;
        ArrayList arrayList4 = new ArrayList(c5g.u(linkedHashSet4, 10));
        Iterator it4 = linkedHashSet4.iterator();
        while (it4.hasNext()) {
            long longValue4 = ((Number) it4.next()).longValue();
            Serializer.c<Peer> cVar4 = Peer.CREATOR;
            arrayList4.add(Peer.a.a(longValue4, Peer.Type.GROUP));
        }
        setBuilder.addAll(arrayList4);
        LinkedHashSet linkedHashSet5 = this.e;
        ArrayList arrayList5 = new ArrayList(c5g.u(linkedHashSet5, 10));
        Iterator it5 = linkedHashSet5.iterator();
        while (it5.hasNext()) {
            arrayList5.add(new Peer.Channel(((Number) it5.next()).longValue()));
        }
        setBuilder.addAll(arrayList5);
        return setBuilder.d();
    }

    public final String j(izs<? super Set<Long>, String> izsVar) {
        return air.b(']', "ProfilesIds[", j5g.g0(rl3.I(new String[]{i("users", this.a, izsVar), i("contacts", this.b, izsVar), i("emails", this.c, izsVar), i("groups", this.d, izsVar), i(RTCStatsConstants.KEY_CHANNELS, this.e, izsVar)}), null, null, null, 0, null, 63));
    }

    public final String toString() {
        return j(new q520(18));
    }

    public f1e0(Collection<Long> collection, Collection<Long> collection2, Collection<Long> collection3, Collection<Long> collection4, Collection<Long> collection5) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.b = linkedHashSet2;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        this.c = linkedHashSet3;
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        this.d = linkedHashSet4;
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        this.e = linkedHashSet5;
        linkedHashSet.addAll(collection);
        linkedHashSet2.addAll(collection2);
        linkedHashSet3.addAll(collection3);
        linkedHashSet4.addAll(collection4);
        linkedHashSet5.addAll(collection5);
    }

    public f1e0(Collection<? extends Peer> collection) {
        this();
        d(collection);
    }
}
