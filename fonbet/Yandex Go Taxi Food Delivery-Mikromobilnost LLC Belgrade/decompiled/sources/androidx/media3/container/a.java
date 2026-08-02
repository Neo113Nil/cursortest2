package androidx.media3.container;

import defpackage.jr60;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes10.dex */
public abstract class a {
    public static void a(boolean z) {
        if (z) {
            throw new ObuParser$NotYetImplementedException();
        }
    }

    public static ArrayList b(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            byte b = asReadOnlyBuffer.get();
            int i = (b >> 3) & 15;
            if (((b >> 2) & 1) != 0) {
                asReadOnlyBuffer.get();
            }
            if (((b >> 1) & 1) != 0) {
                remaining = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    byte b2 = asReadOnlyBuffer.get();
                    remaining |= (b2 & Byte.MAX_VALUE) << (i2 * 7);
                    if ((b2 & DerValue.TAG_CONTEXT) == 0) {
                        break;
                    }
                }
            } else {
                remaining = asReadOnlyBuffer.remaining();
            }
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            duplicate.limit(asReadOnlyBuffer.position() + remaining);
            arrayList.add(new jr60(i, duplicate));
            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
        }
        return arrayList;
    }
}
