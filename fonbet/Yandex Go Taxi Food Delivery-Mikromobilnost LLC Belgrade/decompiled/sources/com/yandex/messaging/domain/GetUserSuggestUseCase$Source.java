package com.yandex.messaging.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/messaging/domain/GetUserSuggestUseCase$Source", "", "Lcom/yandex/messaging/domain/GetUserSuggestUseCase$Source;", "", "s", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ChatList", "Search", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetUserSuggestUseCase$Source {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GetUserSuggestUseCase$Source[] $VALUES;
    public static final GetUserSuggestUseCase$Source ChatList;
    public static final GetUserSuggestUseCase$Source Search;
    private final String s;

    static {
        GetUserSuggestUseCase$Source getUserSuggestUseCase$Source = new GetUserSuggestUseCase$Source("ChatList", 0, "chatlist");
        ChatList = getUserSuggestUseCase$Source;
        GetUserSuggestUseCase$Source getUserSuggestUseCase$Source2 = new GetUserSuggestUseCase$Source("Search", 1, "zero_suggest");
        Search = getUserSuggestUseCase$Source2;
        GetUserSuggestUseCase$Source[] getUserSuggestUseCase$SourceArr = {getUserSuggestUseCase$Source, getUserSuggestUseCase$Source2};
        $VALUES = getUserSuggestUseCase$SourceArr;
        $ENTRIES = kotlin.enums.a.a(getUserSuggestUseCase$SourceArr);
    }

    public GetUserSuggestUseCase$Source(String str, int i, String str2) {
        this.s = str2;
    }

    public static GetUserSuggestUseCase$Source valueOf(String str) {
        return (GetUserSuggestUseCase$Source) Enum.valueOf(GetUserSuggestUseCase$Source.class, str);
    }

    public static GetUserSuggestUseCase$Source[] values() {
        return (GetUserSuggestUseCase$Source[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getS() {
        return this.s;
    }
}
