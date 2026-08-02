package xsna;

import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import com.vk.reefton.dto.ReefContentQuality;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.OneVideoPlayer;

/* compiled from: ReefEventSender.kt */
/* loaded from: classes3.dex */
public final class knf0 {
    public final Reef a;

    /* compiled from: ReefEventSender.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OneVideoPlayer.DiscontinuityReason.values().length];
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.AUTO_TRANSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.SEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.SEEK_ADJUSTMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.REMOVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OneVideoPlayer.DiscontinuityReason.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public knf0(Reef reef) {
        this.a = reef;
    }

    public final void a(one.video.player.tracks.c cVar, long j, List<? extends one.video.player.tracks.c> list) {
        if (cVar == null) {
            return;
        }
        cms0 cms0Var = (cms0) cVar.c;
        ReefEvent.z zVar = new ReefEvent.z(cms0Var.d, cms0Var.b().getHeight(), j);
        Reef reef = this.a;
        reef.a(zVar);
        ReefContentQuality a2 = d5b0.a(d5b0.b(cms0Var.b().getWidth(), cms0Var.b().getHeight()));
        Iterator<T> it = list.iterator();
        while (true) {
            er10 er10Var = cVar.c;
            if (!it.hasNext()) {
                cms0 cms0Var2 = (cms0) er10Var;
                reef.a(new ReefEvent.PlayerQualityChange(a2, ReefEvent.PlayerQualityChange.Reason.ACTUAL, d5b0.a(d5b0.b(cms0Var2.b().getWidth(), cms0Var2.b().getHeight()))));
                return;
            } else {
                one.video.player.tracks.c cVar2 = (one.video.player.tracks.c) it.next();
                cms0 cms0Var3 = (cms0) er10Var;
                if (((cms0) cVar2.c).b().getHeight() > cms0Var3.b().getHeight() || ((cms0) cVar2.c).b().getWidth() > cms0Var3.b().getWidth()) {
                    cVar = cVar2;
                }
            }
        }
    }

    public final void b(OneVideoPlayer.DiscontinuityReason discontinuityReason, deb0 deb0Var, long j) {
        int i;
        OneVideoPlayer.DiscontinuityReason discontinuityReason2 = OneVideoPlayer.DiscontinuityReason.SEEK;
        Reef reef = this.a;
        if (discontinuityReason == discontinuityReason2) {
            reef.a(new ReefEvent.v(deb0Var.b, j));
        }
        switch (a.$EnumSwitchMapping$0[discontinuityReason.ordinal()]) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = -1;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        reef.a(new ReefEvent.t(i, deb0Var.b, j));
    }
}
