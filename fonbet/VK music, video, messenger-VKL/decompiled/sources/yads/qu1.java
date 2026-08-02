package yads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import xsna.i7o0;
import xsna.izs;

/* loaded from: classes10.dex */
public final class qu1 extends Lambda implements izs {
    public final /* synthetic */ ru1 b;
    public final /* synthetic */ Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu1(ru1 ru1Var, Map map) {
        super(1);
        this.b = ru1Var;
        this.c = map;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        byte[] bArr;
        qp2 qp2Var = (qp2) obj;
        ru1 ru1Var = this.b;
        a21 b = ru1Var.b(qp2Var, this.c);
        ru1Var.c.getClass();
        try {
            InputStream inputStream = b.d;
            if (inputStream == null) {
                inputStream = b.e != null ? new ByteArrayInputStream(b.e) : null;
            }
            InputStream inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    bArr = i7o0.h(inputStream2);
                    inputStream2.close();
                } finally {
                }
            } else {
                bArr = new byte[0];
            }
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        byte[] bArr2 = bArr;
        int i = b.a;
        List unmodifiableList = Collections.unmodifiableList(b.b);
        a21 a21Var = new a21(i, unmodifiableList, bArr2);
        List unmodifiableList2 = Collections.unmodifiableList(unmodifiableList);
        wp2.a(System.currentTimeMillis(), qp2Var, new g92(i, bArr2, g92.a(unmodifiableList2), unmodifiableList2, true));
        return a21Var;
    }
}
