package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;

/* loaded from: classes5.dex */
public final class gqf0 implements yyr0 {
    public final String a;
    public final q1 b;
    public final String c;
    public final BaseShortcutModel$Source d = BaseShortcutModel$Source.MAIN_SCREEN_PROMO;

    public gqf0(String str, q1 q1Var, String str2) {
        this.a = str;
        this.b = q1Var;
        this.c = str2;
    }

    @Override // defpackage.yyr0
    public final String d() {
        return null;
    }

    @Override // defpackage.yyr0
    public final String e() {
        return this.a;
    }

    @Override // defpackage.yyr0
    public final String f() {
        return this.c;
    }

    @Override // defpackage.yyr0
    /* renamed from: getAction */
    public final q1 getC() {
        return this.b;
    }

    @Override // defpackage.yyr0
    public final BaseShortcutModel$Source getSource() {
        return this.d;
    }
}
