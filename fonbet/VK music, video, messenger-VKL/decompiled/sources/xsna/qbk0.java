package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlayableType;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSnippetItem;
import xsna.agl0;
import xsna.hr90;
import xsna.k840;
import xsna.kw40;
import xsna.ry40;
import xsna.xua0;

/* compiled from: SnippetAnalyticsManager.kt */
/* loaded from: classes3.dex */
public final class qbk0 extends tn6 {
    public final ex40 b;
    public final ca50 c;
    public jx4 d = m80.i;
    public final uzp e = new uzp();
    public final u750 f;

    public qbk0(dx40 dx40Var, ca50 ca50Var) {
        this.b = dx40Var;
        this.c = ca50Var;
        s750 s750Var = k840.a.e;
        this.f = s750Var == null ? null : s750Var;
    }

    public static CommonAudioStat$TypeAudioSnippetItem.EventSubtype f(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        bn40.d(lhg.a(i, "Unknown event trigger skip type: "));
                        return CommonAudioStat$TypeAudioSnippetItem.EventSubtype.NEXT;
                    }
                }
            }
            return CommonAudioStat$TypeAudioSnippetItem.EventSubtype.PREV;
        }
        return CommonAudioStat$TypeAudioSnippetItem.EventSubtype.NEXT;
    }

    @Override // xsna.tn6
    public final void a(v0q<? extends kw40> v0qVar) {
        CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype;
        CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype2;
        CommonAudioStat$TypeAudioSnippetItem.EventSubtype eventSubtype3;
        boolean z = v0qVar instanceof ry40.e.b;
        u750 u750Var = this.f;
        ca50 ca50Var = this.c;
        if (z) {
            ca50Var.a(((m80) this.d).h.c, PlayableType.SNIPPET);
            kw40.b bVar = ((ry40.e.b) v0qVar).e;
            if (bVar != null) {
                xua0 xua0Var = bVar.b;
                if (xua0Var instanceof xua0.i) {
                    eventSubtype3 = f(((xua0.i) xua0Var).a);
                } else if ((xua0Var instanceof xua0.b) || (xua0Var instanceof xua0.a)) {
                    eventSubtype3 = CommonAudioStat$TypeAudioSnippetItem.EventSubtype.AUTOPLAY;
                } else if (!(xua0Var instanceof xua0.k) && !(xua0Var instanceof xua0.c) && !(xua0Var instanceof xua0.e)) {
                    return;
                } else {
                    eventSubtype3 = CommonAudioStat$TypeAudioSnippetItem.EventSubtype.PLAY_BTN;
                }
                u750Var.m(eventSubtype3, e(v0qVar));
                return;
            }
            return;
        }
        if ((v0qVar instanceof ry40.d) || (v0qVar instanceof ry40.f)) {
            ca50Var.d();
            kw40 a = v0qVar.a();
            if (a instanceof kw40.a) {
                hr90 hr90Var = ((kw40.a) a).b;
                if ((hr90Var instanceof hr90.j) || (hr90Var instanceof hr90.h) || (hr90Var instanceof hr90.b)) {
                    eventSubtype2 = CommonAudioStat$TypeAudioSnippetItem.EventSubtype.PLAY_BTN;
                } else if (hr90Var instanceof hr90.d) {
                    eventSubtype2 = CommonAudioStat$TypeAudioSnippetItem.EventSubtype.SESSION_TERMINATED;
                } else if (!(hr90Var instanceof hr90.a)) {
                    return;
                } else {
                    eventSubtype2 = CommonAudioStat$TypeAudioSnippetItem.EventSubtype.ERROR;
                }
                u750Var.I0(eventSubtype2, e(v0qVar));
                return;
            }
            if (a instanceof kw40.c) {
                agl0 agl0Var = ((kw40.c) a).b;
                if (agl0Var instanceof agl0.f) {
                    eventSubtype = f(((agl0.f) agl0Var).a);
                } else if (agl0Var instanceof agl0.c) {
                    eventSubtype = CommonAudioStat$TypeAudioSnippetItem.EventSubtype.AUTOPLAY;
                } else if (agl0Var instanceof agl0.b) {
                    eventSubtype = CommonAudioStat$TypeAudioSnippetItem.EventSubtype.CLOSE;
                } else if (agl0Var instanceof agl0.d) {
                    eventSubtype = CommonAudioStat$TypeAudioSnippetItem.EventSubtype.ERROR;
                } else if (!(agl0Var instanceof agl0.a)) {
                    return;
                } else {
                    eventSubtype = CommonAudioStat$TypeAudioSnippetItem.EventSubtype.CHANGE_SOURCE;
                }
                u750Var.Z0(eventSubtype, e(v0qVar));
            }
        }
    }

    @Override // xsna.tn6
    public final void b(ry40 ry40Var) {
        if (ry40Var instanceof ry40.e.a) {
            this.c.b();
        }
    }

    @Override // xsna.tn6
    public final void c(jx4 jx4Var) {
        m80 m80Var = (m80) jx4Var;
        c650 d = d(m80Var.h.c, 0L, 0L);
        boolean z = m80Var.g;
        u750 u750Var = this.f;
        if (z) {
            u750Var.O0(d);
        }
        int i = m80Var.f;
        if (i == 1) {
            u750Var.x(CommonAudioStat$TypeAudioSnippetItem.EventType.SNIPPET_FEED_PLAYLIST_DOWN, d);
        } else if (i == 2) {
            u750Var.x(CommonAudioStat$TypeAudioSnippetItem.EventType.SNIPPET_FEED_PLAYLIST_UP, d);
        } else if (i == 3) {
            u750Var.r0(CommonAudioStat$TypeAudioSnippetItem.EventType.NEXT_SNIPPET, d);
        } else if (i == 4) {
            u750Var.r0(CommonAudioStat$TypeAudioSnippetItem.EventType.PREV_SNIPPET, d);
        }
        this.d = jx4Var;
    }

    public final c650 d(MusicTrack musicTrack, long j, long j2) {
        int b = an10.b((this.d.b() + j) / 1000.0f);
        int b2 = an10.b(j2 / 1000.0f);
        m80 m80Var = (m80) this.d;
        int i = m80Var.e;
        int i2 = m80Var.d;
        String str = m80Var.c;
        int b3 = an10.b(this.b.C());
        this.e.getClass();
        return new c650(musicTrack, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(b3), Integer.valueOf(b), Integer.valueOf(b2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c650 e(v0q<? extends kw40> v0qVar) {
        return d(((ry40) v0qVar).c.b.a, v0qVar.a().a.a, v0qVar.a().a.a);
    }
}
