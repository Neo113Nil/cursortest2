package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import xsna.emb;
import xsna.nbr;

/* renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5036na implements Lo {
    public final Context a;
    public final String b;

    public C5036na(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.Lo
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, this.b);
            if (fileFromSdkStorage == null) {
                return null;
            }
            fileFromSdkStorage.exists();
            File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.a, this.b);
            if (fileFromAppStorage != null) {
                FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
            }
            return nbr.r(fileFromSdkStorage, emb.b);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Lo
    public final void a(String str) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.a, this.b);
            if (fileFromSdkStorage != null) {
                nbr.w(fileFromSdkStorage, str, emb.b);
            }
        } catch (Throwable unused) {
        }
    }
}
