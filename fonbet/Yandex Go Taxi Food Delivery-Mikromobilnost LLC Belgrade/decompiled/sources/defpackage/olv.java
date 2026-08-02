package defpackage;

import java.util.Map;

/* loaded from: classes9.dex */
public final class olv implements uo11 {
    public volatile Object a;

    @Override // defpackage.uo11
    public final void a(Map map) {
        this.a = map;
    }

    @Override // defpackage.uo11
    public final Object load() {
        return this.a;
    }
}
