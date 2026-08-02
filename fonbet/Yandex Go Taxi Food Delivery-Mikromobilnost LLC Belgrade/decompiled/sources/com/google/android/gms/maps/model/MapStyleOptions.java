package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.b3b1;
import defpackage.bb1;
import defpackage.cvw;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new zzh();
    private static final String zza = "MapStyleOptions";
    private String zzb;

    public MapStyleOptions(String str) {
        cvw.m(str, "json must not be null");
        this.zzb = str;
    }

    public static MapStyleOptions loadRawResourceStyle(Context context, int i) throws Resources.NotFoundException {
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int read = openRawResource.read(bArr, 0, 1024);
                    if (read == -1) {
                        b3b1.b(openRawResource);
                        b3b1.b(byteArrayOutputStream);
                        return new MapStyleOptions(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    b3b1.b(openRawResource);
                    b3b1.b(byteArrayOutputStream);
                    throw th;
                }
            }
        } catch (IOException e) {
            String obj = e.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 37);
            sb.append("Failed to read resource ");
            sb.append(i);
            sb.append(Extension.COLON_SPACE);
            sb.append(obj);
            throw new Resources.NotFoundException(sb.toString());
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.g0(parcel, 2, this.zzb, false);
        bb1.o0(parcel, n0);
    }
}
