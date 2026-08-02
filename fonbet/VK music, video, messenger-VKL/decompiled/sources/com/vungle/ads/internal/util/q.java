package com.vungle.ads.internal.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import xsna.emb;

/* loaded from: classes7.dex */
public abstract class q {
    public static String a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(str.getBytes(emb.b));
                gZIPOutputStream.close();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return encodeToString;
            } finally {
            }
        } finally {
        }
    }
}
