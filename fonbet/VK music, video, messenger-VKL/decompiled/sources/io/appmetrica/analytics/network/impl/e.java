package io.appmetrica.analytics.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import xsna.gzs;
import xsna.s3q0;

/* loaded from: classes8.dex */
public abstract class e {
    public static byte[] a(int i, gzs gzsVar) {
        try {
            InputStream inputStream = (InputStream) gzsVar.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i2 = 0;
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (-1 == read || i2 > i) {
                                    break;
                                }
                                if (read > 0) {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                    i2 += read;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            inputStream.close();
                            return byteArray;
                        } catch (Throwable unused) {
                            s3q0 s3q0Var = s3q0.a;
                            byteArrayOutputStream.close();
                            inputStream.close();
                        }
                    } finally {
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    public static final Map a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
