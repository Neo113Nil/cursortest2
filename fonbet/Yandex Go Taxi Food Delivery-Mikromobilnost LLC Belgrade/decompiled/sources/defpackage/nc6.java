package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;

/* loaded from: classes13.dex */
public abstract class nc6 implements yyr0, e6v {
    public final String a;
    public final q1 b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final BaseShortcutModel$Source g = BaseShortcutModel$Source.BOTTOM_ITEMS;

    public nc6(String str, q1 q1Var, String str2, String str3, int i) {
        this.a = str;
        this.b = q1Var;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.yyr0
    public final String d() {
        return null;
    }

    @Override // defpackage.yyr0
    public final String e() {
        return this.f;
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

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.yyr0
    public final BaseShortcutModel$Source getSource() {
        return this.g;
    }
}
