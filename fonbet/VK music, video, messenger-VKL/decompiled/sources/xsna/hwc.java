package xsna;

import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import java.util.LinkedHashSet;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipFeedExternalNpsDelegate.kt */
/* loaded from: classes17.dex */
public final class hwc {
    public final kjh0 a;
    public final tl70 b;
    public final Object c;
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashSet e = new LinkedHashSet();
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashSet g = new LinkedHashSet();

    /* compiled from: ClipFeedExternalNpsDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SdkExternalNpsCondition.values().length];
            try {
                iArr[SdkExternalNpsCondition.CLIP_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SdkExternalNpsCondition.CLIP_LIKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SdkExternalNpsCondition.CLIP_SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SdkExternalNpsCondition.CLIP_COMMENTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hwc(kjh0 kjh0Var, tl70 tl70Var, ClipFeedTab clipFeedTab) {
        this.a = kjh0Var;
        this.b = tl70Var;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.interactor.b(clipFeedTab, 15));
    }

    public final boolean a(FeedItem feedItem, SdkExternalNpsCondition sdkExternalNpsCondition) {
        LinkedHashSet linkedHashSet;
        int i = a.$EnumSwitchMapping$0[sdkExternalNpsCondition.ordinal()];
        if (i == 1) {
            linkedHashSet = this.d;
        } else if (i == 2) {
            linkedHashSet = this.e;
        } else if (i == 3) {
            linkedHashSet = this.f;
        } else {
            if (i != 4) {
                throw new IllegalStateException(("unsupported ids for condition: " + sdkExternalNpsCondition).toString());
            }
            linkedHashSet = this.g;
        }
        return (feedItem instanceof FeedItem.d) && linkedHashSet.add(((FeedItem.d) feedItem).getItemId()) && this.b.d(sdkExternalNpsCondition);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final void c(FeedItem feedItem) {
        if (b()) {
            SdkExternalNpsCondition sdkExternalNpsCondition = SdkExternalNpsCondition.CLIP_COMMENTED;
            if (a(feedItem, sdkExternalNpsCondition)) {
                this.a.c(sdkExternalNpsCondition);
            }
        }
    }

    public final void d(FeedItem feedItem) {
        if (b()) {
            SdkExternalNpsCondition sdkExternalNpsCondition = SdkExternalNpsCondition.CLIP_STARTED;
            if (a(feedItem, sdkExternalNpsCondition)) {
                this.a.c(sdkExternalNpsCondition);
            }
        }
    }

    public final void e(FeedItem feedItem) {
        if (b()) {
            SdkExternalNpsCondition sdkExternalNpsCondition = SdkExternalNpsCondition.CLIP_SHARED;
            if (a(feedItem, sdkExternalNpsCondition)) {
                this.a.c(sdkExternalNpsCondition);
            }
        }
    }
}
