package defpackage;

import com.yandex.div.legacy.view.DivView;

/* loaded from: classes11.dex */
public abstract class l9y extends k9v {
    public final String a;

    public l9y(DivView divView) {
        this.a = divView.getDivTag().a;
    }

    @Override // defpackage.k9v
    public final String a() {
        return this.a;
    }
}
