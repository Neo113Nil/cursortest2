package xsna;

import android.util.LruCache;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.exceptions.InvalidCredentialsException;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogTheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.re20;

/* compiled from: DialogsGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class tqm extends xl6<wpp<Long, Dialog>> {
    public final sqm b;

    /* compiled from: DialogsGetByIdCmd.kt */
    public static final class a {
        public final wpp<Long, Dialog> a;
        public final wpp<Long, Dialog> b;
        public final ProfilesSimpleInfo c;

        public a(wpp<Long, Dialog> wppVar, wpp<Long, Dialog> wppVar2, ProfilesSimpleInfo profilesSimpleInfo) {
            this.a = wppVar;
            this.b = wppVar2;
            this.c = profilesSimpleInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Result(dialogs=" + this.a + ", changesDialogs=" + this.b + ", changesInfo=" + this.c + ')';
        }
    }

    /* compiled from: DialogsGetByIdCmd.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tqm(Peer peer, Source source) {
        this((List<? extends Peer>) Collections.singletonList(peer), source);
    }

    @Override // xsna.m2w
    public final String a() {
        if (this.b.b == Source.CACHE) {
            return null;
        }
        return "im-dialogs-load-from-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        a f;
        sqm sqmVar = this.b;
        List list = sqmVar.a;
        Object obj = sqmVar.d;
        boolean z = sqmVar.c;
        if (!list.isEmpty()) {
            Peer H0 = w2wVar.H0();
            H0.getClass();
            if (!H0.Ab(Peer.Type.UNKNOWN)) {
                int i = b.$EnumSwitchMapping$0[sqmVar.b.ordinal()];
                if (i == 1) {
                    f = f(list, w2wVar);
                } else if (i == 2) {
                    a f2 = f(list, w2wVar);
                    a aVar = new a(new wpp(), new wpp(), new ProfilesSimpleInfo());
                    wpp<Long, Dialog> wppVar = f2.a;
                    if (wppVar.f()) {
                        Collection<Long> a2 = wppVar.a();
                        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
                        Iterator<T> it = a2.iterator();
                        while (it.hasNext()) {
                            long longValue = ((Number) it.next()).longValue();
                            Serializer.c<Peer> cVar = Peer.CREATOR;
                            arrayList.add(Peer.a.b(longValue));
                        }
                        aVar = g(w2wVar, arrayList, z);
                    }
                    wppVar.m(aVar.a);
                    f = new a(wppVar, aVar.b, aVar.c);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = g(w2wVar, list, z);
                }
                ProfilesSimpleInfo profilesSimpleInfo = f.c;
                wpp<Long, Dialog> wppVar2 = f.b;
                if (!wppVar2.i()) {
                    w2wVar.S0().A(obj, wppVar2);
                }
                if (profilesSimpleInfo.Gb()) {
                    w2wVar.S0().p(obj, profilesSimpleInfo);
                }
                return f.a;
            }
        }
        return new wpp();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tqm) {
            return epx.f(this.b, ((tqm) obj).b);
        }
        return false;
    }

    public final a f(List list, w2w w2wVar) {
        hpm c = sn.c(w2wVar);
        elm i = w2wVar.I0().i();
        frn0 system = w2wVar.I0().system();
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Peer) it.next()).b));
        }
        Map J = c.J(this.b.e, arrayList);
        int d = system.d();
        wpp wppVar = new wpp();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            long j = ((Peer) it2.next()).b;
            com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) J.get(Long.valueOf(j));
            if (bVar == null) {
                wppVar.a.add(Long.valueOf(j));
            } else {
                com.vk.im.engine.models.dialogs.c cVar = bVar.C;
                LruCache<com.vk.im.engine.models.dialogs.c, DialogTheme> lruCache = mkm.a;
                DialogTheme dialogTheme = lruCache.get(cVar);
                if (dialogTheme == null) {
                    dialogTheme = i.e(cVar);
                    if (dialogTheme != null) {
                        lruCache.put(dialogTheme.b, dialogTheme);
                    } else {
                        dialogTheme = null;
                    }
                }
                wppVar.p(Long.valueOf(j), w0w.a(w2wVar, bVar, dialogTheme));
                if (bVar.O != d) {
                    wppVar.b.add(Long.valueOf(j));
                }
            }
        }
        return new a(wppVar, new wpp(), new ProfilesSimpleInfo());
    }

    public final a g(w2w w2wVar, List<? extends Peer> list, boolean z) {
        if (w2wVar.X0()) {
            re20.b bVar = (re20.b) bz2.c(new re20(list, w2wVar.Q0(), z, w2wVar.c()), "MessagesGetConversationsByIdApiCmd");
            new wfm(bVar.a.values(), null, 0, 14).o(w2wVar);
            wpp<Long, Dialog> wppVar = f(list, w2wVar).a;
            wpp<Long, Dialog> c = wppVar.c();
            xuo0.a.getClass();
            return new a(wppVar, c, (ProfilesSimpleInfo) new h1e0(bVar.b, xuo0.a(), true).o(w2wVar));
        }
        StringBuilder sb = new StringBuilder("DialogsGetByIdCmd unauthorized usage: ");
        mla mlaVar = this.a;
        if (mlaVar == null) {
            mlaVar = null;
        }
        sb.append(mlaVar);
        String sb2 = sb.toString();
        mla mlaVar2 = this.a;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb2, (mlaVar2 != null ? mlaVar2 : null).b());
        com.vk.metrics.eventtracking.b.a.a(illegalArgumentException);
        throw new InvalidCredentialsException(illegalArgumentException);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsGetByIdCmd(args=" + this.b + ')';
    }

    public tqm(sqm sqmVar) {
        this.b = sqmVar;
    }

    public tqm(List<? extends Peer> list, Source source) {
        this(new sqm(list, source, true, null, 0, 16));
    }
}
