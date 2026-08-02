package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.log.L;
import kotlin.NoWhenBranchMatchedException;
import xsna.pum;

/* compiled from: DialogsHistoryGetCmd.kt */
/* loaded from: classes.dex */
public final class lrm extends xl6<DialogsHistory> {
    public final drm b;

    /* compiled from: DialogsHistoryGetCmd.kt */
    /* loaded from: classes2.dex */
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

    public lrm(drm drmVar) {
        this.b = drmVar;
    }

    @Override // xsna.m2w
    public final String a() {
        return a.$EnumSwitchMapping$0[this.b.d().ordinal()] == 1 ? "im-dialogs-history-get-cached" : "im-dialogs-history-refresh";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        drm drmVar = this.b;
        int i = a.$EnumSwitchMapping$0[drmVar.d().ordinal()];
        if (i == 1) {
            return hrm.b(w2wVar, drmVar);
        }
        if (i == 2) {
            DialogsHistory b = hrm.b(w2wVar, drmVar);
            return ((b.size() < drmVar.b() && b.i()) || b.m()) ? f(w2wVar) : b;
        }
        if (i == 3) {
            return f(w2wVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lrm) {
            return epx.f(this.b, ((lrm) obj).b);
        }
        return false;
    }

    public final DialogsHistory f(w2w w2wVar) {
        drm drmVar = this.b;
        try {
            return krm.a.a(w2wVar, drmVar, drmVar.a() + " -> DialogsHistoryGetCmd");
        } catch (VKApiExecutionException e) {
            if (e.s() == 974) {
                L.j(e, "GetConversationsForOtherAccountFoldersIssue");
                pum c = drmVar.c();
                if (w2wVar.getExperiments().w() && (c instanceof pum.b)) {
                    int a2 = ((pum.b) c).a();
                    rdm e2 = w2wVar.I0().b().c().e(a2);
                    boolean z = (e2 != null ? e2.a() : null) == FolderType.CHANNELS;
                    new wpm(a2).n(w2wVar);
                    if (z) {
                        w2wVar.e1(this, new v280("GetConversationsForOtherAccountFoldersIssue"));
                    }
                }
            }
            throw e;
        }
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsHistoryGetCmd(args=" + this.b + ')';
    }
}
