package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.education.EduAchievement;
import com.vk.im.engine.models.education.UserAchievementsCache;
import com.vk.log.L;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AchievementsGetCmd.kt */
/* loaded from: classes2.dex */
public final class wt extends le6<xpp<List<? extends EduAchievement>>> {
    public final Peer b;
    public final Source c;

    /* compiled from: AchievementsGetCmd.kt */
    public static final class a extends RuntimeException {
    }

    /* compiled from: AchievementsGetCmd.kt */
    public static final /* synthetic */ class b {
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

    public wt(Peer peer, Source source) {
        this.b = peer;
        this.c = source;
    }

    public static String h(Peer peer) {
        return efz.b(peer.d, "_user_achievements", new StringBuilder());
    }

    @Override // xsna.le6
    public final xpp<List<? extends EduAchievement>> e(w2w w2wVar) {
        int i = b.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        if (i == 2) {
            xpp<List<EduAchievement>> f = f(w2wVar);
            return (f.c() || f.a) ? g(w2wVar) : f;
        }
        if (i == 3) {
            return g(w2wVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt)) {
            return false;
        }
        wt wtVar = (wt) obj;
        return epx.f(this.b, wtVar.b) && this.c == wtVar.c;
    }

    public final xpp<List<EduAchievement>> f(w2w w2wVar) {
        long f1 = w2wVar.f1() - w2wVar.getConfig().x;
        rey k = w2wVar.I0().k();
        Peer peer = this.b;
        byte[] b2 = k.b(h(peer));
        if (b2 == null) {
            return new xpp<>(null, false);
        }
        try {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            UserAchievementsCache userAchievementsCache = (UserAchievementsCache) Serializer.b.a(b2, UserAchievementsCache.class.getClassLoader());
            return new xpp<>(userAchievementsCache != null ? userAchievementsCache.b : null, userAchievementsCache == null || userAchievementsCache.c < f1);
        } catch (Serializer.DeserializationError e) {
            L.j(e, "user achievements deserialization error");
            com.vk.metrics.eventtracking.b.a.q(new a(e));
            w2wVar.I0().k().delete(h(peer));
            return new xpp<>(null, false);
        }
    }

    public final xpp<List<EduAchievement>> g(w2w w2wVar) {
        Peer peer = this.b;
        List list = (List) bz2.c(new vt(peer), null);
        UserAchievementsCache userAchievementsCache = new UserAchievementsCache((List<EduAchievement>) list, w2wVar.f1());
        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
        w2wVar.I0().k().k(Serializer.b.e(userAchievementsCache), h(peer));
        return new xpp<>(list, false);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(false) + io.reactivex.rxjava3.internal.operators.mixed.k.c(Long.hashCode(this.b.b) * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "AchievementsGetCmd(peer=" + this.b + ", source=" + this.c + ", awaitNetwork=false)";
    }
}
