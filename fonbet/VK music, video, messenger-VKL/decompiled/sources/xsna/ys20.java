package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.music.view.MusicRoundPlayView;

/* compiled from: MixTapsHandler.kt */
/* loaded from: classes16.dex */
public final class ys20 implements ud40 {
    public final w950 a;

    /* compiled from: MixTapsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MusicAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Menu.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.PlayAll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Play.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Pause.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.AUDIO_STREAM_MIX_INTERACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CatalogViewType.AUDIO_STREAM_MIX.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ys20(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        String str = uIBlock.b;
        int i = a.$EnumSwitchMapping$1[uIBlock.d.ordinal()];
        w950 w950Var = this.a;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            MusicRoundPlayView.State state = obj instanceof MusicRoundPlayView.State ? (MusicRoundPlayView.State) obj : null;
            if (state == null) {
                return;
            }
            if (state != MusicRoundPlayView.State.PAUSE) {
                w950Var.l(str);
                return;
            } else {
                w950Var.c(str);
                return;
            }
        }
        MusicAnalyticsInfo musicAnalyticsInfo = obj instanceof MusicAnalyticsInfo ? (MusicAnalyticsInfo) obj : null;
        if (musicAnalyticsInfo == null) {
            return;
        }
        int i2 = a.$EnumSwitchMapping$0[musicAnalyticsInfo.a.ordinal()];
        if (i2 == 1) {
            w950Var.q(str);
            return;
        }
        if (i2 == 2) {
            w950Var.i(str);
        } else if (i2 == 3) {
            w950Var.l(str);
        } else {
            if (i2 != 4) {
                return;
            }
            w950Var.c(str);
        }
    }
}
