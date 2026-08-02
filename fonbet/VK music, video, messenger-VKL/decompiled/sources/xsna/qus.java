package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.newsfeed.Owner;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import one.video.cast.session.action.CastAction;
import xsna.eqb;
import xsna.ph90;

/* compiled from: FtrTracker.kt */
/* loaded from: classes3.dex */
public final class qus implements yj90, iui0 {
    public static final Pair c = new Pair(0L, 0L);
    public final Object b;

    public /* synthetic */ qus(Object obj) {
        this.b = obj;
    }

    @Override // xsna.yj90
    public NewsEntry a(String str, izs izsVar) {
        return ((awq) this.b).a(str, izsVar);
    }

    public ArrayList b(int i, UserId userId, VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto) {
        LinkedHashMap a = b590.a((b590) this.b, null, videoGetCommentsExtendedResponseDto.k(), videoGetCommentsExtendedResponseDto.e(), 3);
        List<WallWallCommentDto> y0 = j5g.y0(videoGetCommentsExtendedResponseDto.f());
        ArrayList arrayList = new ArrayList(c5g.u(y0, 10));
        for (WallWallCommentDto wallWallCommentDto : y0) {
            arrayList.add(new LiveEventModel(wallWallCommentDto, i, userId, (Owner) a.get(wallWallCommentDto.k()), Boolean.FALSE));
        }
        return arrayList;
    }

    public LiveEventModel c(int i, UserId userId, VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto) {
        WallWallCommentDto wallWallCommentDto;
        LinkedHashMap a = b590.a((b590) this.b, null, videoGetCommentsExtendedResponseDto.k(), videoGetCommentsExtendedResponseDto.e(), 3);
        List<WallWallCommentDto> j = videoGetCommentsExtendedResponseDto.j();
        if (j == null || (wallWallCommentDto = (WallWallCommentDto) j5g.a0(j)) == null) {
            return null;
        }
        return new LiveEventModel(wallWallCommentDto, i, userId, (Owner) a.get(wallWallCommentDto.k()), Boolean.TRUE);
    }

    public void d(ph90 ph90Var) {
        eqb eqbVar = (eqb) this.b;
        eqb.a aVar = eqbVar.i;
        if (aVar != null) {
            aVar.a();
        }
        if (ph90Var instanceof ph90.i) {
            eqbVar.l.b = ph90Var.b;
            return;
        }
        if (ph90Var instanceof ph90.d) {
            eqbVar.l.c = ph90Var.b;
            return;
        }
        if (ph90Var instanceof ph90.e) {
            eqbVar.l.d = ph90Var.b;
            return;
        }
        if (ph90Var instanceof ph90.f) {
            eqbVar.l.d = ph90Var.b;
            return;
        }
        if (ph90Var instanceof ph90.k) {
            eqbVar.l.e = ph90Var.b;
            return;
        }
        if (ph90Var instanceof ph90.b) {
            eqbVar.l.h = ph90Var.b;
            return;
        }
        if (ph90Var instanceof ph90.j) {
            eqbVar.l.f = ph90Var.b;
            return;
        }
        if (ph90Var instanceof ph90.a) {
            eqbVar.l.g = ph90Var.b;
            return;
        }
        if (ph90Var instanceof ph90.c) {
            eqbVar.l.j = Boolean.valueOf(epx.f(ph90Var.b, "service"));
            return;
        }
        if (ph90Var instanceof ph90.g) {
            eqbVar.l.i = ph90Var.b;
            return;
        }
        if (ph90Var instanceof ph90.h) {
            eqbVar.l.i = ph90Var.b;
            return;
        }
        if (ph90Var instanceof ph90.l) {
            eqbVar.l.k = ph90Var.b;
        } else if (ph90Var instanceof ph90.n) {
            eqbVar.l.l = ph90Var.b;
        } else {
            if (!(ph90Var instanceof ph90.m)) {
                throw new NoWhenBranchMatchedException();
            }
            eqbVar.l.m = ph90Var.b;
        }
    }

    @Override // xsna.iui0
    public void onSessionEnded(ssi0 ssi0Var, int i) {
        CopyOnWriteArrayList<ez9> copyOnWriteArrayList = xsi0.a;
        xsi0.a(CastAction.SESSION_ENDED);
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionEnding(ssi0 ssi0Var) {
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionResumeFailed(ssi0 ssi0Var, int i) {
    }

    @Override // xsna.iui0
    public void onSessionResumed(ssi0 ssi0Var, boolean z) {
        ((k15) this.b).t((g0a) ssi0Var);
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionResuming(ssi0 ssi0Var, String str) {
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionStartFailed(ssi0 ssi0Var, int i) {
    }

    @Override // xsna.iui0
    public void onSessionStarted(ssi0 ssi0Var, String str) {
        ((k15) this.b).t((g0a) ssi0Var);
    }

    @Override // xsna.iui0
    public void onSessionStarting(ssi0 ssi0Var) {
        xsi0.c((g0a) ssi0Var);
        Iterator<tz9> it = xsi0.c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // xsna.iui0
    public /* bridge */ /* synthetic */ void onSessionSuspended(ssi0 ssi0Var, int i) {
    }

    public qus() {
        this.b = new b590();
    }
}
