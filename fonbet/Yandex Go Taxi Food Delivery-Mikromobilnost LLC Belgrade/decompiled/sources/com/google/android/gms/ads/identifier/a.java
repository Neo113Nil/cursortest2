package com.google.android.gms.ads.identifier;

import android.net.Uri;
import defpackage.fma1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class a extends Thread {
    public final /* synthetic */ HashMap a;

    public a(HashMap hashMap) {
        this.a = hashMap;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            buildUpon.appendQueryParameter(str, (String) hashMap.get(str));
        }
        String uri = buildUpon.build().toString();
        try {
            try {
                int i = fma1.a;
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
                try {
                    if (httpURLConnection.getResponseCode() >= 200) {
                    }
                } finally {
                    httpURLConnection.disconnect();
                }
            } finally {
                int i2 = fma1.a;
            }
        } catch (IOException | IndexOutOfBoundsException | RuntimeException unused) {
        }
    }
}
