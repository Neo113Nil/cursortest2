package com.yandex.go.requirements.comment.api.summary.data.models;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/requirements/comment/api/summary/data/models/CommentViewSource;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TARIFF_CARD", "DEEPLINK", "INTERCITY_DASHBOARD", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommentViewSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommentViewSource[] $VALUES;
    public static final CommentViewSource DEEPLINK;
    public static final CommentViewSource INTERCITY_DASHBOARD;
    public static final CommentViewSource TARIFF_CARD;
    private final String analyticsName;

    static {
        CommentViewSource commentViewSource = new CommentViewSource("TARIFF_CARD", 0, "tariff_card");
        TARIFF_CARD = commentViewSource;
        CommentViewSource commentViewSource2 = new CommentViewSource("DEEPLINK", 1, Constants.DEEPLINK);
        DEEPLINK = commentViewSource2;
        CommentViewSource commentViewSource3 = new CommentViewSource("INTERCITY_DASHBOARD", 2, "intercity_dashboard");
        INTERCITY_DASHBOARD = commentViewSource3;
        CommentViewSource[] commentViewSourceArr = {commentViewSource, commentViewSource2, commentViewSource3};
        $VALUES = commentViewSourceArr;
        $ENTRIES = a.a(commentViewSourceArr);
    }

    public CommentViewSource(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static CommentViewSource valueOf(String str) {
        return (CommentViewSource) Enum.valueOf(CommentViewSource.class, str);
    }

    public static CommentViewSource[] values() {
        return (CommentViewSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
