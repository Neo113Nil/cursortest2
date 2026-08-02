package com.yandex.messaging.internal.urlpreview.reporter;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.XAdES.cl_63;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/yandex/messaging/internal/urlpreview/reporter/UrlPreviewReporter$Element", "", "Lcom/yandex/messaging/internal/urlpreview/reporter/UrlPreviewReporter$Element;", "", "metricaName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Body", "Title", cl_63.t, "Image", "TurboButton", "OpenButton", "OpenVideo", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UrlPreviewReporter$Element {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UrlPreviewReporter$Element[] $VALUES;
    public static final UrlPreviewReporter$Element Body;
    public static final UrlPreviewReporter$Element Description;
    public static final UrlPreviewReporter$Element Image;
    public static final UrlPreviewReporter$Element OpenButton;
    public static final UrlPreviewReporter$Element OpenVideo;
    public static final UrlPreviewReporter$Element Title;
    public static final UrlPreviewReporter$Element TurboButton;
    private final String metricaName;

    static {
        UrlPreviewReporter$Element urlPreviewReporter$Element = new UrlPreviewReporter$Element("Body", 0, "body");
        Body = urlPreviewReporter$Element;
        UrlPreviewReporter$Element urlPreviewReporter$Element2 = new UrlPreviewReporter$Element("Title", 1, "title");
        Title = urlPreviewReporter$Element2;
        UrlPreviewReporter$Element urlPreviewReporter$Element3 = new UrlPreviewReporter$Element(cl_63.t, 2, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        Description = urlPreviewReporter$Element3;
        UrlPreviewReporter$Element urlPreviewReporter$Element4 = new UrlPreviewReporter$Element("Image", 3, "image");
        Image = urlPreviewReporter$Element4;
        UrlPreviewReporter$Element urlPreviewReporter$Element5 = new UrlPreviewReporter$Element("TurboButton", 4, "turbo button");
        TurboButton = urlPreviewReporter$Element5;
        UrlPreviewReporter$Element urlPreviewReporter$Element6 = new UrlPreviewReporter$Element("OpenButton", 5, "open button");
        OpenButton = urlPreviewReporter$Element6;
        UrlPreviewReporter$Element urlPreviewReporter$Element7 = new UrlPreviewReporter$Element("OpenVideo", 6, "open video");
        OpenVideo = urlPreviewReporter$Element7;
        UrlPreviewReporter$Element[] urlPreviewReporter$ElementArr = {urlPreviewReporter$Element, urlPreviewReporter$Element2, urlPreviewReporter$Element3, urlPreviewReporter$Element4, urlPreviewReporter$Element5, urlPreviewReporter$Element6, urlPreviewReporter$Element7};
        $VALUES = urlPreviewReporter$ElementArr;
        $ENTRIES = a.a(urlPreviewReporter$ElementArr);
    }

    public UrlPreviewReporter$Element(String str, int i, String str2) {
        this.metricaName = str2;
    }

    public static UrlPreviewReporter$Element valueOf(String str) {
        return (UrlPreviewReporter$Element) Enum.valueOf(UrlPreviewReporter$Element.class, str);
    }

    public static UrlPreviewReporter$Element[] values() {
        return (UrlPreviewReporter$Element[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getMetricaName() {
        return this.metricaName;
    }
}
