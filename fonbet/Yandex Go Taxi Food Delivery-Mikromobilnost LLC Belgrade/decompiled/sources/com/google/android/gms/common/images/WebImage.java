package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.b64;
import defpackage.bb1;
import defpackage.ny61;
import defpackage.ooc;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes11.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = new zah();
    final int zaa;
    private final Uri zab;
    private final int zac;
    private final int zad;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WebImage(JSONObject jSONObject) throws IllegalArgumentException {
        this(r0, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            if (ooc.m(this.zab, webImage.zab) && this.zac == webImage.zac && this.zad == webImage.zad) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zad;
    }

    public Uri getUrl() {
        return this.zab;
    }

    public int getWidth() {
        return this.zac;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad)});
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.zab.toString());
            jSONObject.put("width", this.zac);
            jSONObject.put("height", this.zad);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        Locale locale = Locale.US;
        int i = this.zac;
        int i2 = this.zad;
        String uri = this.zab.toString();
        StringBuilder s = b64.s(i, i2, "Image ", RemoteBioParameters.X, " ");
        s.append(uri);
        return s.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zaa;
        int n0 = bb1.n0(parcel, 20293);
        bb1.m0(1, parcel, 4);
        parcel.writeInt(i2);
        bb1.f0(parcel, 2, getUrl(), i, false);
        int width = getWidth();
        bb1.m0(3, parcel, 4);
        parcel.writeInt(width);
        int height = getHeight();
        bb1.m0(4, parcel, 4);
        parcel.writeInt(height);
        bb1.o0(parcel, n0);
    }

    public WebImage(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }

    public WebImage(Uri uri, int i, int i2) throws IllegalArgumentException {
        this(1, uri, i, i2);
        if (uri == null) {
            ny61.g("url cannot be null");
            throw null;
        }
        if (i < 0 || i2 < 0) {
            ny61.g("width and height must not be negative");
            throw null;
        }
    }

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.zaa = i;
        this.zab = uri;
        this.zac = i2;
        this.zad = i3;
    }
}
