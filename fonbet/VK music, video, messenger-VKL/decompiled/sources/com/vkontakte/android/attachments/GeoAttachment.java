package com.vkontakte.android.attachments;

import androidx.annotation.NonNull;
import com.ironsource.O6;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Attachment;
import com.vk.metrics.eventtracking.b;
import com.vkontakte.android.R;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.dd80;
import xsna.tec0;
import xsna.xus;

/* loaded from: classes7.dex */
public class GeoAttachment extends Attachment implements tec0 {
    public static final Serializer.c<GeoAttachment> CREATOR = new a();
    public double f;
    public double g;
    public String h;
    public String i;
    public String j;
    public int k;
    public int l;

    public class a extends Serializer.c<GeoAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GeoAttachment a(@NonNull Serializer serializer) {
            GeoAttachment geoAttachment = new GeoAttachment();
            geoAttachment.k = -1;
            geoAttachment.l = 0;
            geoAttachment.f = serializer.r();
            geoAttachment.g = serializer.r();
            geoAttachment.h = serializer.H();
            geoAttachment.i = serializer.H();
            geoAttachment.k = serializer.u();
            geoAttachment.j = serializer.H();
            geoAttachment.l = serializer.u();
            return geoAttachment;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GeoAttachment[i];
        }
    }

    public GeoAttachment() {
        this.k = -1;
        this.l = 0;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Ab() {
        return 17;
    }

    @Override // com.vk.dto.common.Attachment
    public final int Bb() {
        return dd80.s;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.O(this.f);
        serializer.O(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.S(this.k);
        serializer.j0(this.j);
        serializer.S(this.l);
    }

    @Override // xsna.tec0
    public final JSONObject Q3() {
        JSONObject e = xus.e(this);
        try {
            e.put("id", this.k).put(O6.s, this.f).put("lon", this.g).put("title", this.h).put(RTCStatsConstants.KEY_ADDRESS, this.i).put("photoUri", this.j);
            return e;
        } catch (JSONException e2) {
            b.a.a(new IllegalArgumentException("Can not serialize GeoAttachment to json", e2));
            return e;
        }
    }

    @Override // com.vk.dto.common.Attachment
    @NonNull
    public final int zb() {
        return R.string.attach_place;
    }

    public GeoAttachment(double d, double d2, String str, String str2, int i, String str3, int i2) {
        this.f = d;
        this.g = d2;
        this.k = i;
        this.l = i2;
        if (str != null && str.length() > 0) {
            this.h = str;
        }
        if (str2 != null && str2.length() > 0) {
            this.i = str2;
        }
        if (str3 == null || str3.length() <= 0) {
            return;
        }
        this.j = str3;
    }

    public GeoAttachment(@NonNull JSONObject jSONObject) {
        this.k = -1;
        this.l = 0;
        this.k = jSONObject.optInt("id");
        this.f = jSONObject.optDouble(O6.s);
        this.g = jSONObject.optDouble("lon");
        this.h = jSONObject.optString("title");
        this.i = jSONObject.optString(RTCStatsConstants.KEY_ADDRESS);
        this.j = jSONObject.optString("photoUri");
    }
}
