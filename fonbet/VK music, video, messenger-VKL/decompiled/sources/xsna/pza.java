package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.channel.ChannelReactionsMappings;
import com.vk.log.L;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ChannelGetReactionsMappingCmd.kt */
/* loaded from: classes2.dex */
public final class pza extends le6<xpp<Map<Integer, ? extends Integer>>> {
    public final Source b;

    /* compiled from: ChannelGetReactionsMappingCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pza(Source source) {
        this.b = source;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xpp f(w2w w2wVar) {
        ChannelReactionsMappings channelReactionsMappings;
        long f1 = w2wVar.f1() - w2wVar.getConfig().I;
        byte[] b = w2wVar.I0().k().b("channel_reactions_mappings");
        if (b != null) {
            Serializer.c<ChannelReactionsMappings> cVar = ChannelReactionsMappings.CREATOR;
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(b));
                try {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    Serializer.StreamParcelable G = new Serializer.d(dataInputStream).G(ChannelReactionsMappings.class.getClassLoader());
                    dataInputStream.close();
                    channelReactionsMappings = (ChannelReactionsMappings) G;
                } finally {
                }
            } catch (Serializer.DeserializationError e) {
                L.i(e);
            }
            return new xpp(channelReactionsMappings != null ? channelReactionsMappings.b : null, channelReactionsMappings != null || channelReactionsMappings.c < f1);
        }
        channelReactionsMappings = null;
        if (channelReactionsMappings != null) {
        }
        return new xpp(channelReactionsMappings != null ? channelReactionsMappings.b : null, channelReactionsMappings != null || channelReactionsMappings.c < f1);
    }

    public static xpp g(w2w w2wVar) {
        Map map = (Map) bz2.c(new jfb(), null);
        if (!map.isEmpty()) {
            w2wVar.I0().k().k(dni0.b(new ChannelReactionsMappings((Map<Integer, Integer>) map, w2wVar.f1())), "channel_reactions_mappings");
        }
        return new xpp(map, false);
    }

    @Override // xsna.le6
    public final xpp<Map<Integer, ? extends Integer>> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        if (i == 2) {
            return g(w2wVar);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        xpp<Map<Integer, ? extends Integer>> f = f(w2wVar);
        return f.b() ? f : g(w2wVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pza) && this.b == ((pza) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelGetReactionsMappingCmd(source=" + this.b + ')';
    }
}
