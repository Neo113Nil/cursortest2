package defpackage;

import android.text.TextUtils;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.yandex.messaging.internal.view.input.mesix.Mesix;
import java.util.Objects;
import kotlin.time.DurationUnit;

/* loaded from: classes15.dex */
public final class m1w {
    public final j1w a;
    public final InputTextController b;
    public final Mesix c;
    public d1w d;

    public m1w(j1w j1wVar, InputTextController inputTextController, Mesix mesix) {
        this.a = j1wVar;
        this.b = inputTextController;
        this.c = mesix;
    }

    public final bs10 a(p1w p1wVar) {
        ds10 state = this.c.getState();
        if (!(state instanceof bs10)) {
            state = null;
        }
        if (state != null) {
            return (bs10) state;
        }
        o430 o430Var = e3n.b;
        return new bs10(kp50.V(p1wVar.c, DurationUnit.SECONDS));
    }

    public final void b(String str) {
        InputTextController inputTextController = this.b;
        if (TextUtils.equals(str, inputTextController.getText())) {
            return;
        }
        if (ydz.a.a()) {
            Objects.toString(inputTextController.getText());
            ydz.a();
        }
        inputTextController.setText(str, str.length());
    }
}
