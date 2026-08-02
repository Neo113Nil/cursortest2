package xsna;

import com.vk.api.generated.messages.dto.MessagesFoldersInfoDto;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.dialogs.FoldersSupportedType;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import xsna.lqm;
import xsna.u2s;

/* compiled from: DialogsFoldersGetAllCmd.kt */
/* loaded from: classes2.dex */
public final class jqm extends xl6<xpp<List<? extends rpm>>> {
    public final Source b;
    public final edi c = new edi(10);

    public jqm(Source source) {
        this.b = source;
    }

    @Override // xsna.m2w
    public final String a() {
        return this.b == Source.CACHE ? "im-dialog-folder-common" : "im-dialog-folders-network-download";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2 A[SYNTHETIC] */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(w2w w2wVar) {
        final xpp<List<rpm>> g;
        boolean o;
        pdm c = w2wVar.I0().b().c();
        u2s u2sVar = new u2s(w2wVar.getExperiments());
        Iterable f = c.b.I0().k().f("supported_folder_types");
        if (f == null) {
            f = EmptyList.b;
        }
        Set S0 = j5g.S0(f);
        SetBuilder a = u2sVar.a();
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        Object it = a.iterator();
        while (((MapBuilder.d) it).hasNext()) {
            arrayList.add(Integer.valueOf(((FolderType) ((MapBuilder.e) it).next()).k()));
        }
        boolean f2 = epx.f(j5g.S0(arrayList), S0);
        final boolean z = !f2;
        if (!f2) {
            c.r(-1);
        }
        Source source = Source.CACHE;
        ArrayList arrayList2 = null;
        Source source2 = this.b;
        if (source2 == source && !f2) {
            return new xpp(null, true);
        }
        if (source2 == Source.NETWORK || !f2) {
            g = g(w2wVar);
        } else if (source2 == Source.ACTUAL) {
            g = f(w2wVar);
            if (g.d()) {
                g = g(w2wVar);
            }
        } else {
            g = f(w2wVar);
        }
        SetBuilder a2 = u2sVar.a();
        ArrayList arrayList3 = new ArrayList(c5g.u(a2, 10));
        Object it2 = a2.iterator();
        while (((MapBuilder.d) it2).hasNext()) {
            arrayList3.add(Integer.valueOf(((FolderType) ((MapBuilder.e) it2).next()).k()));
        }
        c.b.I0().k().i("supported_folder_types", arrayList3);
        List<rpm> a3 = g.a();
        if (a3 != null) {
            arrayList2 = new ArrayList();
            for (Object obj : a3) {
                int i = u2s.a.$EnumSwitchMapping$0[((rpm) obj).c.ordinal()];
                com.vk.im.engine.models.c cVar = u2sVar.a;
                switch (i) {
                    case 1:
                    case 4:
                        o = true;
                        if (o) {
                            arrayList2.add(obj);
                        }
                    case 2:
                        o = cVar.o();
                        if (o) {
                        }
                        break;
                    case 3:
                        if (!BuildInfo.s()) {
                            cVar.getClass();
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
        g.e(arrayList2);
        L.c("Folders", new gzs() { // from class: xsna.iqm
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("loading folders\nsource: ");
                sb.append(jqm.this.b);
                sb.append(" is force update: ");
                sb.append(z);
                sb.append(" folders list is expired = ");
                xpp xppVar = g;
                sb.append(xppVar.a);
                sb.append(" or missed = ");
                sb.append(xppVar.c());
                sb.append(" list : ");
                List list = (List) xppVar.a();
                sb.append(list != null ? j5g.g0(list, null, null, null, 0, new l8k(2), 31) : null);
                return sb.toString();
            }
        });
        return g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqm) && this.b == ((jqm) obj).b;
    }

    public final xpp<List<rpm>> f(w2w w2wVar) {
        return (xpp) w2wVar.I0().c(new com.vk.movika.sdk.base.logic.interactor.i(8, w2wVar, this));
    }

    public final xpp<List<rpm>> g(w2w w2wVar) {
        w2wVar.c1(true, LongPollType.MESSAGES);
        Integer j = w2wVar.I0().b().c().j();
        int a = cq.a(w2wVar);
        if (j != null && j.intValue() == a) {
            return f(w2wVar);
        }
        if (k9q0.p(w2wVar)) {
            new lqm(EmptyList.b, null, null, null).o(w2wVar);
            w2wVar.S0().S();
            return f(w2wVar);
        }
        com.vk.im.engine.models.c experiments = w2wVar.getExperiments();
        ListBuilder e = e43.e();
        e.add(FoldersSupportedType.CHANNELS);
        p4g.a(FoldersSupportedType.BUSINESS, e, experiments.o());
        e.add(FoldersSupportedType.PERSONAL);
        p4g.a(FoldersSupportedType.MANAGED_GROUPS, e, BuildInfo.s());
        lqm.a.a((MessagesFoldersInfoDto) bz2.c(new ve20(e.g(), true), "DialogsFoldersGetAllCmd.MessagesGetFoldersApiCmd")).o(w2wVar);
        w2wVar.S0().S();
        return f(w2wVar);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsFoldersGetAllCmd(source=" + this.b + ')';
    }
}
