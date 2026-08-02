package com.yandex.mobile.ads.common;

import android.location.Location;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/yandex/mobile/ads/common/AdTargeting;", "", "", "age", "gender", "Landroid/location/Location;", "location", "contextQuery", "", "contextTags", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/location/Location;Ljava/lang/String;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getAge", "()Ljava/lang/String;", "b", "getGender", "c", "Landroid/location/Location;", "getLocation", "()Landroid/location/Location;", "d", "getContextQuery", "e", "Ljava/util/List;", "getContextTags", "()Ljava/util/List;", "mobileads_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AdTargeting {

    /* renamed from: a, reason: from kotlin metadata */
    private final String age;

    /* renamed from: b, reason: from kotlin metadata */
    private final String gender;

    /* renamed from: c, reason: from kotlin metadata */
    private final Location location;

    /* renamed from: d, reason: from kotlin metadata */
    private final String contextQuery;

    /* renamed from: e, reason: from kotlin metadata */
    private final List contextTags;

    public /* synthetic */ AdTargeting(String str, String str2, Location location, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : location, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !AdTargeting.class.equals(other.getClass())) {
            return false;
        }
        AdTargeting adTargeting = (AdTargeting) other;
        if (jl40.l(this.age, adTargeting.age) && jl40.l(this.gender, adTargeting.gender) && jl40.l(this.location, adTargeting.location) && jl40.l(this.contextQuery, adTargeting.contextQuery)) {
            return jl40.l(this.contextTags, adTargeting.contextTags);
        }
        return false;
    }

    public int hashCode() {
        String str = this.age;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.gender;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Location location = this.location;
        int hashCode3 = (hashCode2 + (location != null ? location.hashCode() : 0)) * 31;
        String str3 = this.contextQuery;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.contextTags;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public AdTargeting(String str, String str2, Location location, String str3, List<String> list) {
        this.age = str;
        this.gender = str2;
        this.location = location;
        this.contextQuery = str3;
        this.contextTags = list;
    }

    public AdTargeting() {
        this(null, null, null, null, null, 31, null);
    }
}
