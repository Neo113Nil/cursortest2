package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DialogsCountersGetCmd.kt */
/* loaded from: classes2.dex */
public final class gnm extends xl6<DialogsCounters> {
    public final Source b;
    public final boolean c;

    /* compiled from: DialogsCountersGetCmd.kt */
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

    public gnm() {
        this(3, (Source) null);
    }

    public static DialogsCounters f(w2w w2wVar) {
        xgl0 I0 = w2wVar.I0();
        int i = 8;
        xpp xppVar = (xpp) w2wVar.I0().c(new bhh(DialogsCounters.Type.UNREAD, i));
        xpp xppVar2 = (xpp) w2wVar.I0().c(new bhh(DialogsCounters.Type.UNREAD_UNMUTED, i));
        xpp xppVar3 = (xpp) I0.c(new sc(21));
        return new DialogsCounters(xppVar, xppVar2, h(I0, DialogsCounters.Type.BUSINESS_NOTIFY_TOTAL), h(I0, DialogsCounters.Type.BUSINESS_NOTIFY_UNREAD), xppVar3, h(I0, DialogsCounters.Type.ARCHIVE_UNREAD), h(I0, DialogsCounters.Type.ARCHIVE_UNREAD_UNMUTED), h(I0, DialogsCounters.Type.ARCHIVE_MENTIONS), h(I0, DialogsCounters.Type.ARCHIVE_TOTAL));
    }

    public static xpp h(xgl0 xgl0Var, DialogsCounters.Type type) {
        int d = xgl0Var.system().d();
        com.vk.im.engine.models.dialogs.d b = xgl0Var.b().a().b(type);
        if (b == null) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"CycleRefresh", "loadCachedCountByType: Type " + type + " is missed in cache"});
            }
            return new xpp(null, true);
        }
        int i = b.c;
        if (i != d) {
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.d, new Object[]{"CycleRefresh", "loadCachedCountByType: Type " + type + " is expired, phase " + i + ", system phase " + d});
            }
        }
        return new xpp(Integer.valueOf(b.b), i != d);
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialogs-unread-count-refresh";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        if (i != 2) {
            if (i == 3) {
                return g(w2wVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        DialogsCounters f = f(w2wVar);
        Collection values = f.h.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (!((xpp) it.next()).b()) {
                    return g(w2wVar);
                }
            }
        }
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnm)) {
            return false;
        }
        gnm gnmVar = (gnm) obj;
        return this.b == gnmVar.b && this.c == gnmVar.c;
    }

    public final DialogsCounters g(w2w w2wVar) {
        LongPollType longPollType = LongPollType.MESSAGES;
        boolean z = this.c;
        w2wVar.c1(z, longPollType);
        w2wVar.I0().u(new rlh((ai30) bz2.c(new se20(z), null), 4));
        return f(w2wVar);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsCountersGetCmd(source=");
        sb.append(this.b);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public /* synthetic */ gnm(int i, Source source) {
        this((i & 1) != 0 ? Source.CACHE : source, false);
    }

    public gnm(Source source, boolean z) {
        this.b = source;
        this.c = z;
    }
}
