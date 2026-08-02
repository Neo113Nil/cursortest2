package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;

/* compiled from: MusicTrackTapsHandler.kt */
/* loaded from: classes16.dex */
public final class zd50 implements ud40 {
    public final w950 a;

    /* compiled from: MusicTrackTapsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicAnalyticsInfo.ClickTarget.values().length];
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Play.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicAnalyticsInfo.ClickTarget.Pause.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zd50(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        String str = uIBlock.b;
        MusicAnalyticsInfo musicAnalyticsInfo = obj instanceof MusicAnalyticsInfo ? (MusicAnalyticsInfo) obj : null;
        if (musicAnalyticsInfo == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[musicAnalyticsInfo.a.ordinal()];
        w950 w950Var = this.a;
        if (i == 1) {
            w950Var.C(str, true);
        } else {
            if (i != 2) {
                return;
            }
            w950Var.C(str, false);
        }
    }
}
