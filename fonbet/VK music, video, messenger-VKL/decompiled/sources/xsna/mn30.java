package xsna;

import org.json.JSONStringer;

/* compiled from: MsgPackJsonStringer.kt */
/* loaded from: classes3.dex */
public final class mn30 extends JSONStringer {
    @Override // org.json.JSONStringer
    public final JSONStringer value(Object obj) {
        if (obj instanceof in30) {
            in30.d((in30) obj, this);
            return this;
        }
        if (obj instanceof jn30) {
            ((jn30) obj).d(this);
            return this;
        }
        super.value(obj);
        return this;
    }
}
