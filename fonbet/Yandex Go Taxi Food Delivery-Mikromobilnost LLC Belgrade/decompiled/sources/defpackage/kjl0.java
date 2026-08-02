package defpackage;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* loaded from: classes10.dex */
public final class kjl0 {
    public final ArrayList a = new ArrayList();
    public int b = 1;
    public long c;

    public static byte[] b(byte b, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public final ImmutableList a(byte[] bArr) {
        long j;
        d6z.l(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, njl0.z);
        ArrayList arrayList = this.a;
        arrayList.add(str);
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                ny61.k();
                return null;
            }
            try {
                Matcher matcher = ojl0.c.matcher(str);
                if (matcher.find()) {
                    String group = matcher.group(1);
                    group.getClass();
                    j = Long.parseLong(group);
                } else {
                    j = -1;
                }
                if (j != -1) {
                    this.c = j;
                }
                if (str.isEmpty()) {
                    if (this.c <= 0) {
                        ImmutableList l = ImmutableList.l(arrayList);
                        arrayList.clear();
                        this.b = 1;
                        this.c = 0L;
                        return l;
                    }
                    this.b = 3;
                }
            } catch (NumberFormatException e) {
                throw ParserException.b(e, str);
            }
        } else if (ojl0.a.matcher(str).matches() || ojl0.b.matcher(str).matches()) {
            this.b = 2;
        }
        return null;
    }
}
