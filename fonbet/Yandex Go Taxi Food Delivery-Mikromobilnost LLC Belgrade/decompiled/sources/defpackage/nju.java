package defpackage;

import android.view.View;
import ru.yandex.taxi.address.entrances.ui.v1.PorchNumberInputModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class nju implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ View c;

    public /* synthetic */ nju(View view, int i, float f) {
        this.a = i;
        this.c = view;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        float f = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                view.setTranslationX(f);
                break;
            default:
                PorchNumberInputModalView.onInsetsChanged$lambda$0((PorchNumberInputModalView) view, f);
                break;
        }
    }
}
