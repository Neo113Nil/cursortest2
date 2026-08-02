package xsna;

import com.vk.dto.geo.GeoLocation;
import com.vk.dto.stories.model.GetStoriesResponse;
import java.util.ArrayList;

/* compiled from: GeoNewsResponse.kt */
/* loaded from: classes18.dex */
public final class blt {
    public final ArrayList a;
    public final String b;
    public final GeoLocation c;
    public final GetStoriesResponse d;

    public blt(ArrayList arrayList, String str, GeoLocation geoLocation, GetStoriesResponse getStoriesResponse) {
        this.a = arrayList;
        this.b = str;
        this.c = geoLocation;
        this.d = getStoriesResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blt)) {
            return false;
        }
        blt bltVar = (blt) obj;
        return this.a.equals(bltVar.a) && epx.f(this.b, bltVar.b) && epx.f(this.c, bltVar.c) && epx.f(this.d, bltVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        GeoLocation geoLocation = this.c;
        int hashCode3 = (hashCode2 + (geoLocation == null ? 0 : geoLocation.hashCode())) * 31;
        GetStoriesResponse getStoriesResponse = this.d;
        return hashCode3 + (getStoriesResponse != null ? getStoriesResponse.hashCode() : 0);
    }

    public final String toString() {
        return "GeoNewsResponse(entries=" + this.a + ", nextFrom=" + this.b + ", place=" + this.c + ", storiesResponse=" + this.d + ')';
    }
}
