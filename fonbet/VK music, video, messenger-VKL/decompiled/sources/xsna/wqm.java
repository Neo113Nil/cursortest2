package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.FolderType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.u2s;

/* compiled from: DialogsGetFoldersByTypeCmd.kt */
/* loaded from: classes18.dex */
public final class wqm extends xl6<xpp<List<? extends rpm>>> {
    public final FolderType b;
    public final Source c;
    public final edi d = new edi(10);

    /* compiled from: DialogsGetFoldersByTypeCmd.kt */
    public static final /* synthetic */ class a {
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

    public wqm(FolderType folderType, Source source) {
        this.b = folderType;
        this.c = source;
    }

    @Override // xsna.m2w
    public final String a() {
        return this.c == Source.CACHE ? "im-dialog-folder-common" : "im-dialog-folders-network-download";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(w2w w2wVar) {
        com.vk.im.engine.models.c experiments = w2wVar.getExperiments();
        boolean z = false;
        switch (u2s.a.$EnumSwitchMapping$0[this.b.ordinal()]) {
            case 1:
            case 4:
                z = true;
                if (!z) {
                    return new xpp(null, true);
                }
                int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
                if (i == 1) {
                    return (xpp) w2wVar.I0().c(new by5(11, w2wVar, this));
                }
                if (i == 2) {
                    xpp xppVar = (xpp) w2wVar.I0().c(new by5(11, w2wVar, this));
                    return xppVar.a ? f(w2wVar) : xppVar;
                }
                if (i == 3) {
                    return f(w2wVar);
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                z = experiments.o();
                if (!z) {
                }
                break;
            case 3:
                if (!BuildInfo.s()) {
                    experiments.getClass();
                }
                z = true;
                if (!z) {
                }
                break;
            case 5:
                z = BuildInfo.s();
                if (!z) {
                }
                break;
            case 6:
            case 7:
                if (!z) {
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqm)) {
            return false;
        }
        wqm wqmVar = (wqm) obj;
        return this.b == wqmVar.b && this.c == wqmVar.c;
    }

    public final xpp<List<rpm>> f(w2w w2wVar) {
        ArrayList arrayList;
        List list = (List) ((xpp) w2wVar.b1(this, new jqm(Source.NETWORK))).a();
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((rpm) obj).c == this.b) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return new xpp<>(arrayList, false);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsGetFoldersByTypeCmd(type=" + this.b + ", source=" + this.c + ')';
    }
}
