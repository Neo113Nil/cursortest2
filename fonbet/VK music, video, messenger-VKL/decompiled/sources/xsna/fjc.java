package xsna;

import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;

/* compiled from: ClickToEventTypeMapper.kt */
/* loaded from: classes17.dex */
public final class fjc {
    public static SchemeStat$TypeClipViewerItem.EventType a(SdkClipViewerClick sdkClipViewerClick) {
        if (sdkClipViewerClick instanceof SdkClipViewerClick.a) {
            return SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_ACTION_BUTTON;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.b) {
            return SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_AUTHOR;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.d) {
            return SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_COMPILATION;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.r) {
            return SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_MUSIC;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.k) {
            return SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_TREND_HASHTAG;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.m) {
            return SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_MARKET_ITEM_SNIPPET;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.u) {
            return SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_SUBSCRIPTION_BUTTON;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.f) {
            return SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_EXPAND_DESCRIPTION;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.e) {
            return SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_DESCRIPTION;
        }
        if (sdkClipViewerClick instanceof SdkClipViewerClick.t) {
            return SchemeStat$TypeClipViewerItem.EventType.CLICK_TO_SHOPS_MORE_BUTTON;
        }
        return null;
    }
}
