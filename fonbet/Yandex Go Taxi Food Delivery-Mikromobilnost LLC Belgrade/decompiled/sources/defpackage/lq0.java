package defpackage;

import android.text.Layout;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.design.ellipsize.TextMiddleEllipsizer$EllipsizingMode;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes6.dex */
public final /* synthetic */ class lq0 implements jms {
    public final /* synthetic */ mq0 a;

    public lq0(mq0 mq0Var) {
        this.a = mq0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r4.getLineEnd(r6) > r4.getLineVisibleEnd(r6)) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        mq0 mq0Var = this.a;
        AddressInputComponent addressInputComponent = mq0Var.b;
        if (mq0Var.f) {
            String str = mq0Var.h;
            int length = str != null ? str.length() : 0;
            int i = length + 3;
            Layout layout = addressInputComponent.getAddressEditText().getLayout();
            if (layout == null) {
                return;
            }
            mq0Var.f = false;
            int lineCount = layout.getLineCount();
            if (lineCount <= addressInputComponent.getAddressEditText().getMaxLines()) {
                if (lineCount > 0) {
                    int i2 = lineCount - 1;
                }
                if (((kq0) mq0Var.d.invoke()).a.length() == 0) {
                    return;
                }
                for (int i3 = 1; i3 < lineCount; i3++) {
                    int lineStart = layout.getLineStart(i3);
                    if (lineStart >= length && lineStart < i) {
                        addressInputComponent.setAddress(mq0Var.a(false));
                        return;
                    }
                }
                return;
            }
            int i4 = mq0Var.i;
            if (i4 == 1) {
                addressInputComponent.getAddressEditText().setText(new pry0(new auy0(addressInputComponent.getAddressEditText())).a(mq0Var.a(true), TextMiddleEllipsizer$EllipsizingMode.CUSTOM_ELLIPSE));
                return;
            }
            String u = c.u(addressInputComponent, dwh0.summary_route_stops, i4, Integer.valueOf(i4));
            mq0Var.j = g8e.p(u, Extension.SEMICOLON_SPACE, mq0Var.l);
            mq0Var.h = u;
            addressInputComponent.setTextWithoutNotifying(mq0Var.a(true));
            mq0Var.c(mq0Var.j);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lq0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, mq0.class, "autoFitAddressDestinationTitle", "autoFitAddressDestinationTitle()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
