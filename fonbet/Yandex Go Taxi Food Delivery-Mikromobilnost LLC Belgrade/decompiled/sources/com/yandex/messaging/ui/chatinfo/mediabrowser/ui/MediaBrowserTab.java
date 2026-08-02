package com.yandex.messaging.ui.chatinfo.mediabrowser.ui;

import defpackage.gb10;
import defpackage.k4o;
import defpackage.nyh0;
import defpackage.oyh0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/ui/chatinfo/mediabrowser/ui/MediaBrowserTab;", "", "", "titleRes", CA20Status.STATUS_USER_I, "getTitleRes", "()I", "searchHintRes", "Ljava/lang/Integer;", "getSearchHintRes", "()Ljava/lang/Integer;", "", "searchEnabled", "Z", "getSearchEnabled", "()Z", "Companion", "gb10", "Photos", "Files", "Links", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MediaBrowserTab {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MediaBrowserTab[] $VALUES;
    public static final gb10 Companion;
    public static final MediaBrowserTab Files;
    public static final MediaBrowserTab Links;
    public static final MediaBrowserTab Photos;
    private static final int size;
    private final boolean searchEnabled;
    private final Integer searchHintRes;
    private final int titleRes;

    static {
        MediaBrowserTab mediaBrowserTab = new MediaBrowserTab(0, nyh0.messenger_media_browser_photos_tab_title_new, 2, null, "Photos");
        Photos = mediaBrowserTab;
        MediaBrowserTab mediaBrowserTab2 = new MediaBrowserTab(1, oyh0.messenger_media_browser_files_tab_title, 4, Integer.valueOf(oyh0.messenger_media_browser_files_search_hint), "Files");
        Files = mediaBrowserTab2;
        MediaBrowserTab mediaBrowserTab3 = new MediaBrowserTab(2, oyh0.messenger_media_browser_links_tab_title, 4, Integer.valueOf(oyh0.messenger_media_browser_links_search_hint), "Links");
        Links = mediaBrowserTab3;
        MediaBrowserTab[] mediaBrowserTabArr = {mediaBrowserTab, mediaBrowserTab2, mediaBrowserTab3};
        $VALUES = mediaBrowserTabArr;
        $ENTRIES = a.a(mediaBrowserTabArr);
        Companion = new gb10();
        size = values().length;
    }

    public MediaBrowserTab(int i, int i2, int i3, Integer num, String str) {
        num = (i3 & 2) != 0 ? null : num;
        boolean z = (i3 & 4) != 0;
        this.titleRes = i2;
        this.searchHintRes = num;
        this.searchEnabled = z;
    }

    public static MediaBrowserTab valueOf(String str) {
        return (MediaBrowserTab) Enum.valueOf(MediaBrowserTab.class, str);
    }

    public static MediaBrowserTab[] values() {
        return (MediaBrowserTab[]) $VALUES.clone();
    }
}
