package com.yandex.passport.internal.ui.sloth.webcard;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/passport/internal/ui/sloth/webcard/WebCardSlothUi$WebCardPosition", "", "Lcom/yandex/passport/internal/ui/sloth/webcard/WebCardSlothUi$WebCardPosition;", "Top", "Mid", "Bottom", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebCardSlothUi$WebCardPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WebCardSlothUi$WebCardPosition[] $VALUES;
    public static final WebCardSlothUi$WebCardPosition Bottom;
    public static final WebCardSlothUi$WebCardPosition Mid;
    public static final WebCardSlothUi$WebCardPosition Top;

    static {
        WebCardSlothUi$WebCardPosition webCardSlothUi$WebCardPosition = new WebCardSlothUi$WebCardPosition("Top", 0);
        Top = webCardSlothUi$WebCardPosition;
        WebCardSlothUi$WebCardPosition webCardSlothUi$WebCardPosition2 = new WebCardSlothUi$WebCardPosition("Mid", 1);
        Mid = webCardSlothUi$WebCardPosition2;
        WebCardSlothUi$WebCardPosition webCardSlothUi$WebCardPosition3 = new WebCardSlothUi$WebCardPosition("Bottom", 2);
        Bottom = webCardSlothUi$WebCardPosition3;
        WebCardSlothUi$WebCardPosition[] webCardSlothUi$WebCardPositionArr = {webCardSlothUi$WebCardPosition, webCardSlothUi$WebCardPosition2, webCardSlothUi$WebCardPosition3};
        $VALUES = webCardSlothUi$WebCardPositionArr;
        $ENTRIES = kotlin.enums.a.a(webCardSlothUi$WebCardPositionArr);
    }

    public static WebCardSlothUi$WebCardPosition valueOf(String str) {
        return (WebCardSlothUi$WebCardPosition) Enum.valueOf(WebCardSlothUi$WebCardPosition.class, str);
    }

    public static WebCardSlothUi$WebCardPosition[] values() {
        return (WebCardSlothUi$WebCardPosition[]) $VALUES.clone();
    }
}
