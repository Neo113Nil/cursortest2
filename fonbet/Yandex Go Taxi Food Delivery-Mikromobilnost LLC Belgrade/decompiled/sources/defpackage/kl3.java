package defpackage;

import ru.yandex.taxi.shortcuts.dto.response.RequiredAccount;

/* loaded from: classes12.dex */
public abstract class kl3 {
    public final boolean a;

    public kl3(RequiredAccount requiredAccount) {
        this.a = requiredAccount == RequiredAccount.NOT_PHONISH;
    }

    public boolean a() {
        return this.a;
    }

    public abstract boolean b(String str);
}
