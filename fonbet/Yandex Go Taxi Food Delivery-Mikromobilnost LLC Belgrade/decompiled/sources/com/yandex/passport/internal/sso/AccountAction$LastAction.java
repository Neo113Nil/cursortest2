package com.yandex.passport.internal.sso;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/passport/internal/sso/AccountAction$LastAction", "", "Lcom/yandex/passport/internal/sso/AccountAction$LastAction;", "ADD", "DELETE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AccountAction$LastAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AccountAction$LastAction[] $VALUES;
    public static final AccountAction$LastAction ADD;
    public static final AccountAction$LastAction DELETE;

    static {
        AccountAction$LastAction accountAction$LastAction = new AccountAction$LastAction("ADD", 0);
        ADD = accountAction$LastAction;
        AccountAction$LastAction accountAction$LastAction2 = new AccountAction$LastAction("DELETE", 1);
        DELETE = accountAction$LastAction2;
        AccountAction$LastAction[] accountAction$LastActionArr = {accountAction$LastAction, accountAction$LastAction2};
        $VALUES = accountAction$LastActionArr;
        $ENTRIES = kotlin.enums.a.a(accountAction$LastActionArr);
    }

    public static AccountAction$LastAction valueOf(String str) {
        return (AccountAction$LastAction) Enum.valueOf(AccountAction$LastAction.class, str);
    }

    public static AccountAction$LastAction[] values() {
        return (AccountAction$LastAction[]) $VALUES.clone();
    }
}
