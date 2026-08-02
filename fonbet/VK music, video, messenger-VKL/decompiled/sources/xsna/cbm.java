package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.messages.Msg;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import xsna.jdm;

/* compiled from: DialogBusinessNotificationsMetaCmd.kt */
/* loaded from: classes2.dex */
public final class cbm extends jdm<a> {

    /* compiled from: DialogBusinessNotificationsMetaCmd.kt */
    public static final class a {
        public final xpp<Boolean> a;
        public final xpp<Integer> b;
        public final Dialog c;
        public final Msg d;
        public final ProfilesInfo e;

        public a(xpp<Boolean> xppVar, xpp<Integer> xppVar2, Dialog dialog, Msg msg, ProfilesInfo profilesInfo) {
            this.a = xppVar;
            this.b = xppVar2;
            this.c = dialog;
            this.d = msg;
            this.e = profilesInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            Dialog dialog = this.c;
            int hashCode2 = (hashCode + (dialog == null ? 0 : dialog.hashCode())) * 31;
            Msg msg = this.d;
            int hashCode3 = (hashCode2 + (msg == null ? 0 : msg.hashCode())) * 31;
            ProfilesInfo profilesInfo = this.e;
            return hashCode3 + (profilesInfo != null ? profilesInfo.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BusinessNotificationsMeta(isEnabled=");
            sb.append(this.a);
            sb.append(", unreadCount=");
            sb.append(this.b);
            sb.append(", lastDialog=");
            sb.append(this.c);
            sb.append(", lastMsg=");
            sb.append(this.d);
            sb.append(", profilesInfo=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.e, ')');
        }
    }

    public cbm() {
        super(DialogsFilter.BUSINESS_NOTIFY);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005a  */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(w2w w2wVar) {
        boolean z;
        xpp xppVar;
        com.vk.im.engine.models.dialogs.d b;
        xpp xppVar2;
        oo8 a2 = w2wVar.I0().r().a();
        int a3 = cq.a(w2wVar);
        xvm b2 = w2wVar.I0().b();
        if (!b2.e().U()) {
            com.vk.im.engine.models.dialogs.d b3 = b2.a().b(DialogsCounters.Type.BUSINESS_NOTIFY_TOTAL);
            if ((b3 != null ? b3.b : 0) <= 0) {
                z = false;
                xppVar = new xpp(Boolean.valueOf(!(a2 == null && a2.a) && z), (a2 == null ? Integer.valueOf(a2.b) : null) == null && a2.b != a3);
                b = b2.a().b(DialogsCounters.Type.BUSINESS_NOTIFY_UNREAD);
                if (b == null) {
                    xppVar2 = new xpp(Integer.valueOf(b.b), b.c != a3);
                } else {
                    xppVar2 = new xpp(null, true);
                }
                if (xppVar.d()) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.LogType logType = L.LogType.d;
                        StringBuilder sb = new StringBuilder("DialogBusinessNotificationsMetaCmd: isEnabled missedOrExpired, config phase ");
                        sb.append(a2 != null ? Integer.valueOf(a2.b) : null);
                        sb.append(", system phase ");
                        sb.append(a3);
                        L.u(l, logType, new Object[]{"CycleRefresh", sb.toString()});
                    }
                }
                if (xppVar2.d()) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"CycleRefresh", "DialogBusinessNotificationsMetaCmd: unread missedOrExpired, value: " + b + ", system phase " + a3});
                    }
                }
                if (!xppVar.d() || epx.f(xppVar.b, Boolean.FALSE)) {
                    return new a(xppVar, xppVar2, null, null, null);
                }
                jdm.a f = f(w2wVar, true);
                if (f == null && (f = f(w2wVar, false)) == null) {
                    f = jdm.a.d;
                }
                return new a(xppVar, xppVar2, f.a, f.b, f.c);
            }
        }
        z = true;
        xppVar = new xpp(Boolean.valueOf(!(a2 == null && a2.a) && z), (a2 == null ? Integer.valueOf(a2.b) : null) == null && a2.b != a3);
        b = b2.a().b(DialogsCounters.Type.BUSINESS_NOTIFY_UNREAD);
        if (b == null) {
        }
        if (xppVar.d()) {
        }
        if (xppVar2.d()) {
        }
        if (xppVar.d()) {
        }
        return new a(xppVar, xppVar2, null, null, null);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogBusinessNotificationsMetaCmd";
    }
}
