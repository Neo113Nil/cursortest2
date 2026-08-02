package xsna;

import com.vk.api.generated.messages.dto.MessagesFolderDto;
import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.FolderType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.lqm;
import xsna.u2s;

/* compiled from: DialogsFolderEditLpTask.kt */
/* loaded from: classes2.dex */
public final class ypm extends e500 {
    public final xpm c;
    public final w2w d;

    public ypm(xpm xpmVar, w2w w2wVar) {
        super("DialogsFolderEditLpTask");
        this.c = xpmVar;
        this.d = w2wVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00eb, code lost:
    
        if (r2 != r1) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // xsna.e500
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c400 c400Var, f400 f400Var) {
        boolean o;
        boolean z;
        boolean z2;
        List<MessagesFolderDto> e;
        Object obj;
        xpm xpmVar = this.c;
        List<Peer> list = xpmVar.c;
        if (list != null) {
            for (Peer peer : list) {
                if (!c400Var.d.containsKey(Long.valueOf(peer.b))) {
                    f400Var.c.add(Long.valueOf(peer.b));
                }
            }
        }
        Integer num = xpmVar.e;
        int i = xpmVar.a;
        if (num != null) {
            int intValue = num.intValue();
            w2w w2wVar = this.d;
            com.vk.im.engine.models.c experiments = w2wVar.getExperiments();
            FolderType.b bVar = FolderType.Companion;
            int v = c4g0.v(intValue);
            bVar.getClass();
            FolderType b = FolderType.b.b(v);
            boolean z3 = true;
            switch (u2s.a.$EnumSwitchMapping$0[b.ordinal()]) {
                case 1:
                case 4:
                    o = true;
                    if (o) {
                        rdm e2 = w2wVar.I0().b().c().e(i);
                        ryr ryrVar = null;
                        ryr ryrVar2 = e2 != null ? new ryr(e2.d) : null;
                        MessagesFoldersInfoDto messagesFoldersInfoDto = c400Var.n;
                        if (messagesFoldersInfoDto != null && (e = messagesFoldersInfoDto.e()) != null) {
                            Iterator<T> it = e.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (((MessagesFolderDto) obj).getId() == i) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            MessagesFolderDto messagesFolderDto = (MessagesFolderDto) obj;
                            if (messagesFolderDto != null) {
                                ryrVar = new ryr(messagesFolderDto.d());
                            }
                        }
                        if (ryrVar2 == null && ryrVar == null) {
                            if ((intValue & 1) == 1) {
                                z = true;
                                if (ryrVar2 != null) {
                                    boolean z4 = (ryrVar2.a & 1) == 1;
                                    if ((intValue & 1) == 1) {
                                        z2 = true;
                                        break;
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                }
                                z3 = false;
                                if (!z || (z3 && ryrVar == null)) {
                                    f400Var.m.add(Integer.valueOf(i));
                                    return;
                                }
                                return;
                            }
                        }
                        z = false;
                        if (ryrVar2 != null) {
                        }
                        z3 = false;
                        if (z) {
                        }
                        f400Var.m.add(Integer.valueOf(i));
                        return;
                    }
                    return;
                case 2:
                    o = experiments.o();
                    if (o) {
                    }
                    break;
                case 3:
                    if (!BuildInfo.s()) {
                        experiments.getClass();
                    }
                    o = true;
                    if (o) {
                    }
                    break;
                case 5:
                    o = BuildInfo.s();
                    if (o) {
                    }
                    break;
                case 6:
                case 7:
                    o = false;
                    if (o) {
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        xpm xpmVar = this.c;
        int i = xpmVar.a;
        Iterable iterable = xpmVar.c;
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(c5g.u(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Peer) it.next()).b));
        }
        Iterable iterable3 = xpmVar.d;
        if (iterable3 == null) {
            iterable3 = EmptyList.b;
        }
        Iterable iterable4 = iterable3;
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable4, 10));
        Iterator it2 = iterable4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((Peer) it2.next()).b));
        }
        z300Var.K.add(new e580(i, arrayList, arrayList2, false));
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        xpm xpmVar = this.c;
        zpm zpmVar = new zpm(xpmVar.c, xpmVar.a, xpmVar.d, xpmVar.b, xpmVar.e);
        w2w w2wVar = this.d;
        zpmVar.o(w2wVar);
        List<Peer> list = xpmVar.c;
        if (list != null) {
            LinkedHashMap linkedHashMap = c400Var.d;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                if (list.contains(Peer.a.b(longValue))) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            new wfm(linkedHashMap2.values(), null, 0, 14).o(w2wVar);
        }
        MessagesFoldersInfoDto messagesFoldersInfoDto = c400Var.n;
        if (messagesFoldersInfoDto != null) {
            lqm.a.a(messagesFoldersInfoDto).o(w2wVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypm)) {
            return false;
        }
        ypm ypmVar = (ypm) obj;
        return epx.f(this.c, ypmVar.c) && epx.f(this.d, ypmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "DialogsFolderEditLpTask(data=" + this.c + ", env=" + this.d + ')';
    }
}
