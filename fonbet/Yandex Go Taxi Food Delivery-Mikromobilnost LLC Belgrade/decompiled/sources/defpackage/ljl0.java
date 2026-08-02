package defpackage;

import android.os.Handler;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.a;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class ljl0 implements pyy {
    public final DataInputStream a;
    public final kjl0 b = new kjl0();
    public volatile boolean c;
    public final /* synthetic */ njl0 w;

    public ljl0(njl0 njl0Var, InputStream inputStream) {
        this.w = njl0Var;
        this.a = new DataInputStream(inputStream);
    }

    @Override // defpackage.pyy
    public final void d() {
        this.c = true;
    }

    @Override // defpackage.pyy
    public final void load() {
        String str;
        while (!this.c) {
            byte readByte = this.a.readByte();
            int i = 0;
            if (readByte == 36) {
                int readUnsignedByte = this.a.readUnsignedByte();
                int readUnsignedShort = this.a.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.a.readFully(bArr, 0, readUnsignedShort);
                ws01 ws01Var = (ws01) this.w.c.get(Integer.valueOf(readUnsignedByte));
                if (ws01Var != null && !this.w.y) {
                    ws01Var.a.add(bArr);
                }
            } else if (this.w.y) {
                continue;
            } else {
                o8g0 o8g0Var = this.w.a;
                kjl0 kjl0Var = this.b;
                DataInputStream dataInputStream = this.a;
                kjl0Var.getClass();
                ImmutableList a = kjl0Var.a(kjl0.b(readByte, dataInputStream));
                while (a == null) {
                    if (kjl0Var.b == 3) {
                        long j = kjl0Var.c;
                        if (j <= 0) {
                            ny61.r("Expects a greater than zero Content-Length.");
                            return;
                        }
                        int b = a.b(j);
                        d6z.x(b != -1);
                        byte[] bArr2 = new byte[b];
                        dataInputStream.readFully(bArr2, 0, b);
                        ArrayList arrayList = kjl0Var.a;
                        d6z.x(kjl0Var.b == 3);
                        if (b > 0) {
                            int i2 = b - 1;
                            if (bArr2[i2] == 10) {
                                if (b > 1) {
                                    int i3 = b - 2;
                                    if (bArr2[i3] == 13) {
                                        str = new String(bArr2, 0, i3, njl0.z);
                                        arrayList.add(str);
                                        a = ImmutableList.l(arrayList);
                                        kjl0Var.a.clear();
                                        kjl0Var.b = 1;
                                        kjl0Var.c = 0L;
                                    }
                                }
                                str = new String(bArr2, 0, i2, njl0.z);
                                arrayList.add(str);
                                a = ImmutableList.l(arrayList);
                                kjl0Var.a.clear();
                                kjl0Var.b = 1;
                                kjl0Var.c = 0L;
                            }
                        }
                        ny61.g("Message body is empty or does not end with a LF.");
                        return;
                    }
                    a = kjl0Var.a(kjl0.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) o8g0Var.a).post(new ajl0(i, o8g0Var, a));
            }
        }
    }
}
