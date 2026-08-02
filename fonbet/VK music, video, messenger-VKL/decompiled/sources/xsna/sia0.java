package xsna;

import com.vk.im.engine.models.messages.MsgSendSource;

/* compiled from: PickerState.kt */
/* loaded from: classes2.dex */
public abstract class sia0 {
    public static final a c = new a(null, MsgSendSource.e.a);
    public final String a;
    public final MsgSendSource b;

    /* compiled from: PickerState.kt */
    public static final class a extends sia0 {
        @Override // xsna.sia0
        public final boolean c() {
            return false;
        }
    }

    public sia0(String str, MsgSendSource msgSendSource) {
        this.a = str;
        this.b = msgSendSource;
    }

    public int b(int i) {
        return 0;
    }

    public abstract boolean c();

    public void a() {
    }

    public void f() {
    }

    public void g() {
    }

    public void d(float f) {
    }

    public void e(CharSequence charSequence) {
    }
}
