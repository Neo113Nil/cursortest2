package xsna;

import com.vk.catalog.mvi.block.music.models.MusicMviAnalyticsInfo;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.yc40;

/* compiled from: MusicCustomCatalogAnalytics.kt */
/* loaded from: classes.dex */
public final class yf40 implements qmk {
    public final w950 a;

    /* compiled from: MusicCustomCatalogAnalytics.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicMviAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr[MusicMviAnalyticsInfo.ClickTarget.Play.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicMviAnalyticsInfo.ClickTarget.PlayAll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicMviAnalyticsInfo.ClickTarget.Pause.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MusicMviAnalyticsInfo.ClickTarget.Open.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public yf40(w950 w950Var) {
        this.a = w950Var;
    }

    public static void b(t0a t0aVar) {
        com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Event consumption with incorrect parameters: " + t0aVar + ", the event must be processed or prevented from being sent"));
    }

    @Override // xsna.qmk
    public final void a(rmk rmkVar) {
        if (rmkVar instanceof yc40) {
            yc40 yc40Var = (yc40) rmkVar;
            boolean z = yc40Var instanceof yc40.g;
            w950 w950Var = this.a;
            if (z) {
                yc40.g gVar = (yc40.g) rmkVar;
                int i = a.$EnumSwitchMapping$0[gVar.getInfo().a().ordinal()];
                if (i == 1 || i == 2) {
                    w950Var.h(gVar.a());
                    return;
                } else if (i != 3) {
                    b(gVar);
                    return;
                } else {
                    w950Var.s(gVar.a());
                    return;
                }
            }
            if (yc40Var instanceof yc40.b) {
                yc40.b bVar = (yc40.b) rmkVar;
                int i2 = a.$EnumSwitchMapping$0[bVar.getInfo().a().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    w950Var.H(bVar.a());
                    return;
                }
                if (i2 == 3) {
                    w950Var.L(bVar.a());
                    return;
                } else if (i2 != 4) {
                    b(bVar);
                    return;
                } else {
                    w950Var.G(bVar.a(), false);
                    w950Var.t(bVar.a(), CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
                    return;
                }
            }
            if (yc40Var instanceof yc40.c) {
                w950Var.e(((yc40.c) rmkVar).a());
                return;
            }
            if (!(yc40Var instanceof yc40.f)) {
                if (yc40Var instanceof yc40.d) {
                    w950Var.F(((yc40.d) rmkVar).a());
                    return;
                } else {
                    if (!(yc40Var instanceof yc40.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    w950Var.B(((yc40.e) rmkVar).a());
                    return;
                }
            }
            yc40.f fVar = (yc40.f) rmkVar;
            int i3 = a.$EnumSwitchMapping$0[fVar.getInfo().a().ordinal()];
            if (i3 == 1 || i3 == 2) {
                w950Var.h(fVar.a());
                return;
            }
            if (i3 == 3) {
                w950Var.s(fVar.a());
            } else if (i3 != 4) {
                b(fVar);
            } else {
                w950Var.G(fVar.a(), true);
                w950Var.t(fVar.a(), CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
            }
        }
    }
}
