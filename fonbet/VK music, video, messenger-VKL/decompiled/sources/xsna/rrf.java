package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;

/* compiled from: ClipsWrapperHeaderMviStateMapper.kt */
/* loaded from: classes17.dex */
public final class rrf {
    public final boolean a;
    public final int b;
    public final iaf c;

    /* compiled from: ClipsWrapperHeaderMviStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipFeedTab.SingleClipFromBlock.SourceBlockType.values().length];
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.RETENTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.SHOPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.OZON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rrf(boolean z, int i, iaf iafVar) {
        this.a = z;
        this.b = i;
        this.c = iafVar;
    }
}
