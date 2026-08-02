package defpackage;

import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"EvgenDiagnostic$WebViewType", "", "LEvgenDiagnostic$WebViewType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Home", "Smart", "Simple", "Story", "System", "plus-home-domain-evgen_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EvgenDiagnostic$WebViewType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EvgenDiagnostic$WebViewType[] $VALUES;
    public static final EvgenDiagnostic$WebViewType Home;
    public static final EvgenDiagnostic$WebViewType Simple;
    public static final EvgenDiagnostic$WebViewType Smart;
    public static final EvgenDiagnostic$WebViewType Story;
    public static final EvgenDiagnostic$WebViewType System;
    private final String eventValue;

    static {
        EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType = new EvgenDiagnostic$WebViewType("Home", 0, "home");
        Home = evgenDiagnostic$WebViewType;
        EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType2 = new EvgenDiagnostic$WebViewType("Smart", 1, "smart");
        Smart = evgenDiagnostic$WebViewType2;
        EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType3 = new EvgenDiagnostic$WebViewType("Simple", 2, "simple");
        Simple = evgenDiagnostic$WebViewType3;
        EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType4 = new EvgenDiagnostic$WebViewType("Story", 3, "story");
        Story = evgenDiagnostic$WebViewType4;
        EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType5 = new EvgenDiagnostic$WebViewType("System", 4, "system");
        System = evgenDiagnostic$WebViewType5;
        EvgenDiagnostic$WebViewType[] evgenDiagnostic$WebViewTypeArr = {evgenDiagnostic$WebViewType, evgenDiagnostic$WebViewType2, evgenDiagnostic$WebViewType3, evgenDiagnostic$WebViewType4, evgenDiagnostic$WebViewType5};
        $VALUES = evgenDiagnostic$WebViewTypeArr;
        $ENTRIES = a.a(evgenDiagnostic$WebViewTypeArr);
    }

    public EvgenDiagnostic$WebViewType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EvgenDiagnostic$WebViewType valueOf(String str) {
        return (EvgenDiagnostic$WebViewType) Enum.valueOf(EvgenDiagnostic$WebViewType.class, str);
    }

    public static EvgenDiagnostic$WebViewType[] values() {
        return (EvgenDiagnostic$WebViewType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
