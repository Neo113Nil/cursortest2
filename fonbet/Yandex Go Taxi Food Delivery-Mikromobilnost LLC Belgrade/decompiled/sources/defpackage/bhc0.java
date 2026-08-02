package defpackage;

import com.yandex.go.dto.response.m0;
import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import com.yandex.go.shortcuts.view.adapter.model.model.PlainButtonModel$Style;

/* loaded from: classes13.dex */
public final class bhc0 implements yyr0, e6v {
    public final String a;
    public final PlainButtonModel$Style b;
    public final q1 c;
    public final BaseShortcutModel$Source d;
    public final String e;
    public final String f;
    public final String g;

    public bhc0(String str, PlainButtonModel$Style plainButtonModel$Style, m0 m0Var) {
        BaseShortcutModel$Source baseShortcutModel$Source = BaseShortcutModel$Source.LOCAL;
        this.a = str;
        this.b = plainButtonModel$Style;
        this.c = m0Var;
        this.d = baseShortcutModel$Source;
        this.e = "";
        this.f = "";
        this.g = "";
    }

    @Override // defpackage.yyr0
    public final String d() {
        return null;
    }

    @Override // defpackage.yyr0
    public final String e() {
        return this.e;
    }

    @Override // defpackage.yyr0
    public final String f() {
        return this.g;
    }

    @Override // defpackage.yyr0
    /* renamed from: getAction */
    public final q1 getC() {
        return this.c;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.f;
    }

    @Override // defpackage.yyr0
    public final BaseShortcutModel$Source getSource() {
        return this.d;
    }
}
