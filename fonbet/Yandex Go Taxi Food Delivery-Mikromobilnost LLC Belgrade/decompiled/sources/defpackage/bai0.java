package defpackage;

import com.yandex.go.flex.common.data.bdui.RawResponseBody$State;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.a;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public final class bai0 extends v4y {
    public final rvj0 b;
    public final wg10 c;
    public final AtomicReference d = new AtomicReference(RawResponseBody$State.INITIAL);
    public final i3y e = a.a(new csf0(5, this));

    public bai0(rvj0 rvj0Var, wg10 wg10Var) {
        this.b = rvj0Var;
        this.c = wg10Var;
    }

    @Override // defpackage.v4y
    public final b b() {
        return sbx.d.d(toString());
    }

    public final InputStream c() {
        RawResponseBody$State rawResponseBody$State = (RawResponseBody$State) this.d.getAndSet(RawResponseBody$State.TERMINAL);
        int i = rawResponseBody$State == null ? -1 : aai0.a[rawResponseBody$State.ordinal()];
        if (i == 1) {
            return this.b.byteStream();
        }
        if (i == 2) {
            Object value = ((Result) this.e.getValue()).getValue();
            kotlin.b.b(value);
            return new ByteArrayInputStream(((String) value).getBytes(uza.a));
        }
        if (i != 3) {
            w511.b();
            return null;
        }
        ny61.r("byteStream must be called no more than once");
        return null;
    }

    @Override // defpackage.s76
    public final wg10 getContentType() {
        return this.c;
    }

    @Override // defpackage.s76
    public final String toString() {
        AtomicReference atomicReference;
        RawResponseBody$State rawResponseBody$State = RawResponseBody$State.INITIAL;
        RawResponseBody$State rawResponseBody$State2 = RawResponseBody$State.PARSED_TO_STRING;
        do {
            atomicReference = this.d;
            if (atomicReference.compareAndSet(rawResponseBody$State, rawResponseBody$State2)) {
                break;
            }
        } while (atomicReference.get() == rawResponseBody$State);
        Object value = ((Result) this.e.getValue()).getValue();
        kotlin.b.b(value);
        return (String) value;
    }
}
