package defpackage;

import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public class ngt implements puj0 {
    @Override // defpackage.puj0
    public final otj0 b(otj0 otj0Var, mg70 mg70Var) {
        wz5 wz5Var;
        byte[] bArr;
        ByteBuffer buffer = ((GifDrawable) otj0Var.get()).getBuffer();
        AtomicReference atomicReference = g77.a;
        if (buffer.isReadOnly() || !buffer.hasArray()) {
            wz5Var = null;
        } else {
            byte[] array = buffer.array();
            int arrayOffset = buffer.arrayOffset();
            int limit = buffer.limit();
            wz5Var = new wz5();
            wz5Var.c = array;
            wz5Var.a = arrayOffset;
            wz5Var.b = limit;
        }
        if (wz5Var != null && wz5Var.a == 0 && wz5Var.b == wz5Var.c.length) {
            bArr = buffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer = buffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
            asReadOnlyBuffer.get(bArr2);
            bArr = bArr2;
        }
        return new cf2(bArr);
    }
}
