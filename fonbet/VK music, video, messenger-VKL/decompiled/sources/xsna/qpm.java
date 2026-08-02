package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DialogsFilterEnabledCmd.kt */
/* loaded from: classes2.dex */
public final class qpm extends le6<xpp<Boolean>> {
    public final DialogsFilter b;
    public final Source c;
    public final boolean d;
    public final Object e;

    /* compiled from: DialogsFilterEnabledCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DialogsFilter.values().length];
            try {
                iArr[DialogsFilter.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogsFilter.UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogsFilter.REQUESTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DialogsFilter.CHATS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DialogsFilter.ARCHIVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Source.values().length];
            try {
                iArr2[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ qpm(DialogsFilter dialogsFilter, Source source, int i) {
        this(dialogsFilter, (i & 2) != 0 ? Source.CACHE : source, (i & 4) == 0, null);
    }

    @Override // xsna.le6
    public final xpp<Boolean> e(w2w w2wVar) {
        switch (a.$EnumSwitchMapping$0[this.b.ordinal()]) {
            case 1:
                return new xpp<>(Boolean.TRUE, false);
            case 2:
                return new xpp<>(Boolean.TRUE, false);
            case 3:
                return new xpp<>(Boolean.TRUE, false);
            case 4:
                return new xpp<>(Boolean.TRUE, false);
            case 5:
                int i = a.$EnumSwitchMapping$1[this.c.ordinal()];
                if (i == 1) {
                    return g(w2wVar);
                }
                if (i != 2) {
                    if (i == 3) {
                        return h(w2wVar);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                xpp<Boolean> g = g(w2wVar);
                boolean d = g.d();
                if (d) {
                    return h(w2wVar);
                }
                if (d) {
                    throw new NoWhenBranchMatchedException();
                }
                return g;
            case 6:
                int a2 = cq.a(w2wVar);
                com.vk.im.engine.internal.storage.delegates.dialogs.b a3 = w2wVar.I0().b().a();
                DialogsCounters.Type type = DialogsCounters.Type.ARCHIVE_TOTAL;
                com.vk.im.engine.models.dialogs.d b = a3.b(type);
                if (b == null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"CycleRefresh", "loadForArchive: Type " + type + " is missed in cache"});
                    }
                    return new xpp<>(null, true);
                }
                int i2 = b.c;
                if (i2 != a2) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.d, new Object[]{"CycleRefresh", "loadForArchive: Type " + type + " is expired, phase " + i2 + ", system phase " + a2});
                    }
                }
                return new xpp<>(Boolean.valueOf(b.b > 0), i2 != a2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpm)) {
            return false;
        }
        qpm qpmVar = (qpm) obj;
        return this.b == qpmVar.b && this.c == qpmVar.c && this.d == qpmVar.d && epx.f(this.e, qpmVar.e);
    }

    public final boolean f(w2w w2wVar, Source source) {
        int i;
        if (w2wVar.I0().b().e().U()) {
            return true;
        }
        Source source2 = Source.NETWORK;
        if (source == source2) {
            DialogsCounters.a aVar = ((DialogsCounters) w2wVar.J0(this, new gnm(2, source2)).await()).d;
            qcy<Object> qcyVar = DialogsCounters.i[3];
            Integer num = (Integer) aVar.a().a();
            if (num != null) {
                i = num.intValue();
            }
            i = 0;
        } else {
            com.vk.im.engine.models.dialogs.d b = w2wVar.I0().b().a().b(DialogsCounters.Type.BUSINESS_NOTIFY_TOTAL);
            if (b != null) {
                i = b.b;
            }
            i = 0;
        }
        return i > 0;
    }

    public final xpp<Boolean> g(w2w w2wVar) {
        oo8 a2 = w2wVar.I0().r().a();
        if (a2 == null) {
            return new xpp<>();
        }
        return new xpp<>(Boolean.valueOf(a2.a && f(w2wVar, Source.CACHE)), a2.b != cq.a(w2wVar));
    }

    public final xpp<Boolean> h(w2w w2wVar) {
        LongPollType longPollType = LongPollType.MESSAGES;
        boolean z = this.d;
        w2wVar.c1(z, longPollType);
        boolean booleanValue = ((Boolean) bz2.c(new po8(z), "BusinessNotifyConfigGetApiCmd")).booleanValue();
        w2wVar.I0().r().b(new oo8(booleanValue, cq.a(w2wVar)));
        return new xpp<>(Boolean.valueOf(booleanValue && f(w2wVar, Source.NETWORK)), false);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Object obj = this.e;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsFilterEnabledCmd(filter=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        return k73.c(sb, this.e, ')');
    }

    public qpm(DialogsFilter dialogsFilter, Source source, boolean z, Object obj) {
        this.b = dialogsFilter;
        this.c = source;
        this.d = z;
        this.e = obj;
    }
}
