package com.yandex.go.trusted_contacts.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/trusted_contacts/domain/entities/RenderedContactState;", "", "DEFAULT", "DELETABLE", "DELETED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class RenderedContactState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RenderedContactState[] $VALUES;
    public static final RenderedContactState DEFAULT;
    public static final RenderedContactState DELETABLE;
    public static final RenderedContactState DELETED;

    static {
        RenderedContactState renderedContactState = new RenderedContactState("DEFAULT", 0);
        DEFAULT = renderedContactState;
        RenderedContactState renderedContactState2 = new RenderedContactState("DELETABLE", 1);
        DELETABLE = renderedContactState2;
        RenderedContactState renderedContactState3 = new RenderedContactState("DELETED", 2);
        DELETED = renderedContactState3;
        RenderedContactState[] renderedContactStateArr = {renderedContactState, renderedContactState2, renderedContactState3};
        $VALUES = renderedContactStateArr;
        $ENTRIES = a.a(renderedContactStateArr);
    }

    public static RenderedContactState valueOf(String str) {
        return (RenderedContactState) Enum.valueOf(RenderedContactState.class, str);
    }

    public static RenderedContactState[] values() {
        return (RenderedContactState[]) $VALUES.clone();
    }
}
