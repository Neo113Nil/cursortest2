package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Bh implements InterfaceC5355zn {
    public final /* synthetic */ C5241v9 a;
    public final /* synthetic */ Eh b;

    public Bh(Eh eh, C5241v9 c5241v9) {
        this.b = eh;
        this.a = c5241v9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5355zn
    public final void a(Object obj) {
        List list = (List) obj;
        C5241v9 c5241v9 = this.a;
        if (vo.a((Collection) list)) {
            return;
        }
        c5241v9.d = new C5190t9[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C5176sl c5176sl = (C5176sl) list.get(i);
            C5190t9[] c5190t9Arr = c5241v9.d;
            Map map = Zf.a;
            C5190t9 c5190t9 = new C5190t9();
            Integer num = c5176sl.a;
            if (num != null) {
                c5190t9.a = num.intValue();
            }
            Integer num2 = c5176sl.b;
            if (num2 != null) {
                c5190t9.b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c5176sl.d)) {
                c5190t9.c = c5176sl.d;
            }
            c5190t9.d = c5176sl.c;
            c5190t9Arr[i] = c5190t9;
            this.b.g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c5241v9.d[i]);
            this.b.g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
