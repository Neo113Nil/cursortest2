package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.ProductMode$Taxi;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;

/* loaded from: classes13.dex */
public abstract class gwz0 implements yyr0, e6v {
    public final String a;
    public final q1 b;
    public final String c;
    public final ProductMode$Taxi.TopItemAlign d;
    public final BaseShortcutModel$Source e = BaseShortcutModel$Source.TOP_ITEMS;

    public gwz0(String str, q1 q1Var, String str2, ProductMode$Taxi.TopItemAlign topItemAlign) {
        this.a = str;
        this.b = q1Var;
        this.c = str2;
        this.d = topItemAlign;
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

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.yyr0
    public final BaseShortcutModel$Source getSource() {
        return this.e;
    }
}
