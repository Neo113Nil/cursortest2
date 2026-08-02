package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.channels.ChannelsCounters;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChannelsCountersGetCmd.kt */
/* loaded from: classes2.dex */
public final class peb extends xl6<ChannelsCounters> {
    public final Source b;

    /* compiled from: ChannelsCountersGetCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[ChannelsCounters.Type.values().length];
            try {
                iArr2[ChannelsCounters.Type.UNREAD_UNMUTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public peb() {
        this(3, null);
    }

    public static xpp f(ChannelsCounters.Type type, Map map, int i, Collection collection) {
        com.vk.im.engine.models.channels.a aVar = (com.vk.im.engine.models.channels.a) map.get(type);
        if (aVar == null) {
            return new xpp(null, true);
        }
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bdb bdbVar = (bdb) it.next();
            if (bdbVar.f > 0) {
                boolean z = bdbVar.e > bdbVar.d && bdbVar.g == 0;
                if (a.$EnumSwitchMapping$1[type.ordinal()] == 1) {
                    ChannelNotificationsSettings channelNotificationsSettings = bdbVar.p;
                    boolean z2 = (channelNotificationsSettings == null || channelNotificationsSettings.b || channelNotificationsSettings.c > 0) ? false : true;
                    ChannelNotificationsSettings channelNotificationsSettings2 = bdbVar.q;
                    boolean z3 = channelNotificationsSettings2 != null;
                    boolean z4 = (channelNotificationsSettings2 == null || channelNotificationsSettings2.b || channelNotificationsSettings2.c > 0) ? false : true;
                    boolean z5 = z3 && !z4;
                    if (z2 || !z4) {
                        if (z2 && z5 && !z) {
                            i2--;
                        }
                    }
                    i2++;
                } else if (z) {
                    i2++;
                }
            }
        }
        int i3 = aVar.b - i2;
        if (i3 < 0) {
            i3 = 0;
        }
        return new xpp(Integer.valueOf(i3), aVar.c != i);
    }

    public static xpp g(Map map, ChannelsCounters.Type type, int i) {
        com.vk.im.engine.models.channels.a aVar = (com.vk.im.engine.models.channels.a) map.get(type);
        if (aVar != null) {
            return new xpp(Integer.valueOf(aVar.b), i != aVar.c);
        }
        return new xpp(null, true);
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-channels-unread-count-refresh";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return (ChannelsCounters) w2wVar.I0().c(new k9(w2wVar, this));
        }
        if (i != 2) {
            if (i == 3) {
                return h(w2wVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        ChannelsCounters channelsCounters = (ChannelsCounters) w2wVar.I0().c(new k9(w2wVar, this));
        Collection values = channelsCounters.e.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                if (!((xpp) it.next()).b()) {
                    return h(w2wVar);
                }
            }
        }
        return channelsCounters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof peb) && this.b == ((peb) obj).b;
    }

    public final ChannelsCounters h(w2w w2wVar) {
        w2wVar.c1(false, LongPollType.CHANNELS);
        new qeb((oeb) bz2.c(new ifb(), null)).o(w2wVar);
        return (ChannelsCounters) w2wVar.I0().c(new k9(w2wVar, this));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelsCountersGetCmd(source=" + this.b + ", isAwaitNetwork=false)";
    }

    public /* synthetic */ peb(int i, Source source) {
        this((i & 1) != 0 ? Source.CACHE : source);
    }

    public peb(Source source) {
        this.b = source;
    }
}
