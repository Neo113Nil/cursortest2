package defpackage;

import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public final class n3s implements qdc {
    public final qdc a;
    public final t6s b;

    public n3s(qdc qdcVar, t6s t6sVar) {
        this.a = qdcVar;
        this.b = t6sVar;
    }

    @Override // defpackage.qdc
    public final Integer a(String str, ThemeStyle themeStyle) {
        return this.a.a(str, themeStyle);
    }

    @Override // defpackage.qdc
    public final Integer b(String str) {
        return this.a.a(str, (ThemeStyle) this.b.a.a.getValue());
    }
}
