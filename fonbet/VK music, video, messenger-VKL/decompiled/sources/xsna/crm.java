package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import xsna.g1e0;

/* compiled from: DialogsHistoryExtGetCmd.kt */
@ozl
/* loaded from: classes2.dex */
public final class crm extends xl6<brm> {
    public final drm b;

    /* compiled from: DialogsHistoryExtGetCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public crm(drm drmVar) {
        this.b = drmVar;
    }

    @Override // xsna.m2w
    public final String a() {
        return a.$EnumSwitchMapping$0[this.b.d.ordinal()] == 1 ? "im-dialogs-history-get-cached" : "im-dialogs-history-refresh";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        ProfilesInfo profilesInfo;
        StringBuilder sb = new StringBuilder("DialogsHistoryExtGetCmd ");
        drm drmVar = this.b;
        sb.append(drmVar.f);
        DialogsHistory dialogsHistory = (DialogsHistory) w2wVar.b1(this, new lrm(new drm(drmVar.a, drmVar.b, drmVar.c, drmVar.d, drmVar.e, sb.toString(), drmVar.g)));
        f1e0 f1e0Var = new f1e0();
        if (dialogsHistory.isEmpty()) {
            profilesInfo = new ProfilesInfo();
        } else {
            List<Dialog> k = dialogsHistory.k();
            f1e0 f1e0Var2 = new f1e0();
            Iterator<T> it = k.iterator();
            while (it.hasNext()) {
                ijm.b((Dialog) it.next(), f1e0Var2);
            }
            f1e0Var.e(f1e0Var2);
            Collection<Msg> values = dialogsHistory.s().values();
            f1e0 f1e0Var3 = new f1e0();
            if ((values instanceof List) && (values instanceof RandomAccess)) {
                List list = (List) values;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    lv30.b((Msg) list.get(i), f1e0Var3);
                }
            } else {
                Iterator<T> it2 = values.iterator();
                while (it2.hasNext()) {
                    lv30.b((Msg) it2.next(), f1e0Var3);
                }
            }
            f1e0Var.e(f1e0Var3);
            Source source = drmVar.d;
            if (source == Source.NETWORK) {
                source = Source.ACTUAL;
            }
            g1e0.a aVar = new g1e0.a();
            aVar.a.e(f1e0Var);
            aVar.b = source;
            aVar.c = drmVar.e;
            aVar.d = drmVar.f;
            profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        }
        return new brm(dialogsHistory, profilesInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof crm) {
            return epx.f(this.b, ((crm) obj).b);
        }
        return false;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsHistoryExtGetCmd(args=" + this.b + ')';
    }
}
