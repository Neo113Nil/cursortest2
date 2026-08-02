package xsna;

import com.vk.api.generated.wall.dto.WallGeoDto;
import com.vk.api.generated.wall.dto.WallPlaceOneOfDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoPlace;
import com.vkontakte.android.attachments.GeoAttachment;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: WallGeoDtoToGeoAttachmentMapper.kt */
/* loaded from: classes3.dex */
public final class l9x0 {
    /* JADX WARN: Removed duplicated region for block: B:144:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static GeoAttachment a(WallGeoDto wallGeoDto) {
        String[] strArr;
        WallPlaceOneOfDto e;
        GeoPlace geoPlace;
        Integer m;
        Integer m2;
        GeoPlace geoPlace2;
        Integer m3;
        Integer m4;
        int i;
        int i2;
        Integer f;
        Integer f2;
        Collection collection;
        if (wallGeoDto != null) {
            String d = wallGeoDto.d();
            if (d != null) {
                List a = n6j.a(0, " ", d);
                if (!a.isEmpty()) {
                    ListIterator listIterator = a.listIterator(a.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collection = j5g.H0(a, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = EmptyList.b;
                if (collection != null) {
                    strArr = (String[]) collection.toArray(new String[0]);
                    if (strArr != null && strArr.length >= 2) {
                        double parseDouble = Double.parseDouble(strArr[0]);
                        double parseDouble2 = Double.parseDouble(strArr[1]);
                        e = wallGeoDto.e();
                        if (e != null) {
                            return new GeoAttachment(parseDouble, parseDouble2, "title", "subtitle", -1, null, 0);
                        }
                        if (e instanceof WallPlaceOneOfDto.PlacesPlaceDto) {
                            WallPlaceOneOfDto.PlacesPlaceDto placesPlaceDto = (WallPlaceOneOfDto.PlacesPlaceDto) e;
                            int id = placesPlaceDto.getId();
                            String title = placesPlaceDto.getTitle();
                            double g = placesPlaceDto.g();
                            double i3 = placesPlaceDto.i();
                            int j = placesPlaceDto.j();
                            UserId userId = UserId.d;
                            String d2 = placesPlaceDto.d();
                            String str = d2 == null ? "" : d2;
                            Integer e2 = placesPlaceDto.e();
                            int intValue = e2 != null ? e2.intValue() : 0;
                            Integer f3 = placesPlaceDto.f();
                            geoPlace2 = new GeoPlace(id, title, g, i3, j, "", userId, str, intValue, f3 != null ? f3.intValue() : 0, 0);
                        } else {
                            if (e instanceof WallPlaceOneOfDto.PlacesPlaceWithTextInCityAndCountryDto) {
                                WallPlaceOneOfDto.PlacesPlaceWithTextInCityAndCountryDto placesPlaceWithTextInCityAndCountryDto = (WallPlaceOneOfDto.PlacesPlaceWithTextInCityAndCountryDto) e;
                                int id2 = placesPlaceWithTextInCityAndCountryDto.getId();
                                String title2 = placesPlaceWithTextInCityAndCountryDto.getTitle();
                                double g2 = placesPlaceWithTextInCityAndCountryDto.g();
                                double i4 = placesPlaceWithTextInCityAndCountryDto.i();
                                int j2 = placesPlaceWithTextInCityAndCountryDto.j();
                                UserId userId2 = UserId.d;
                                String d3 = placesPlaceWithTextInCityAndCountryDto.d();
                                String str2 = d3 == null ? "" : d3;
                                String e3 = placesPlaceWithTextInCityAndCountryDto.e();
                                int intValue2 = (e3 == null || (m4 = arm0.m(10, e3)) == null) ? 0 : m4.intValue();
                                String f4 = placesPlaceWithTextInCityAndCountryDto.f();
                                geoPlace = new GeoPlace(id2, title2, g2, i4, j2, "", userId2, str2, intValue2, (f4 == null || (m3 = arm0.m(10, f4)) == null) ? 0 : m3.intValue(), 0);
                            } else if (e instanceof WallPlaceOneOfDto.PlacesPlaceOldDto) {
                                WallPlaceOneOfDto.PlacesPlaceOldDto placesPlaceOldDto = (WallPlaceOneOfDto.PlacesPlaceOldDto) e;
                                int id3 = placesPlaceOldDto.getId();
                                String title3 = placesPlaceOldDto.getTitle();
                                double l = placesPlaceOldDto.l();
                                double n = placesPlaceOldDto.n();
                                Integer e4 = placesPlaceOldDto.e();
                                int intValue3 = e4 != null ? e4.intValue() : 0;
                                String k = placesPlaceOldDto.k();
                                String str3 = k == null ? "" : k;
                                UserId j3 = placesPlaceOldDto.j();
                                if (j3 == null) {
                                    j3 = UserId.d;
                                }
                                UserId userId3 = j3;
                                String d4 = placesPlaceOldDto.d();
                                String str4 = d4 == null ? "" : d4;
                                Integer f5 = placesPlaceOldDto.f();
                                int intValue4 = f5 != null ? f5.intValue() : 0;
                                Integer g3 = placesPlaceOldDto.g();
                                int intValue5 = g3 != null ? g3.intValue() : 0;
                                Integer i5 = placesPlaceOldDto.i();
                                geoPlace = new GeoPlace(id3, title3, l, n, intValue3, str3, userId3, str4, intValue4, intValue5, i5 != null ? i5.intValue() : 0);
                            } else {
                                if (!(e instanceof WallPlaceOneOfDto.PlacesPlaceOldWithTextInCityAndCountryDto)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                WallPlaceOneOfDto.PlacesPlaceOldWithTextInCityAndCountryDto placesPlaceOldWithTextInCityAndCountryDto = (WallPlaceOneOfDto.PlacesPlaceOldWithTextInCityAndCountryDto) e;
                                int id4 = placesPlaceOldWithTextInCityAndCountryDto.getId();
                                String title4 = placesPlaceOldWithTextInCityAndCountryDto.getTitle();
                                double l2 = placesPlaceOldWithTextInCityAndCountryDto.l();
                                double n2 = placesPlaceOldWithTextInCityAndCountryDto.n();
                                Integer e5 = placesPlaceOldWithTextInCityAndCountryDto.e();
                                int intValue6 = e5 != null ? e5.intValue() : 0;
                                String k2 = placesPlaceOldWithTextInCityAndCountryDto.k();
                                String str5 = k2 == null ? "" : k2;
                                UserId j4 = placesPlaceOldWithTextInCityAndCountryDto.j();
                                if (j4 == null) {
                                    j4 = UserId.d;
                                }
                                UserId userId4 = j4;
                                String d5 = placesPlaceOldWithTextInCityAndCountryDto.d();
                                String str6 = d5 == null ? "" : d5;
                                String f6 = placesPlaceOldWithTextInCityAndCountryDto.f();
                                int intValue7 = (f6 == null || (m2 = arm0.m(10, f6)) == null) ? 0 : m2.intValue();
                                String g4 = placesPlaceOldWithTextInCityAndCountryDto.g();
                                int intValue8 = (g4 == null || (m = arm0.m(10, g4)) == null) ? 0 : m.intValue();
                                Integer i6 = placesPlaceOldWithTextInCityAndCountryDto.i();
                                geoPlace = new GeoPlace(id4, title4, l2, n2, intValue6, str5, userId4, str6, intValue7, intValue8, i6 != null ? i6.intValue() : 0);
                            }
                            geoPlace2 = geoPlace;
                        }
                        WallGeoDto.TypeDto g5 = wallGeoDto.g();
                        WallGeoDto.TypeDto typeDto = WallGeoDto.TypeDto.POINT;
                        if (g5 != typeDto || (f2 = wallGeoDto.f()) == null) {
                            i = 1;
                        } else {
                            i = 1;
                            if (f2.intValue() == 1) {
                                i2 = 3;
                                return new GeoAttachment(parseDouble, parseDouble2, geoPlace2.i, geoPlace2.k, geoPlace2.c, geoPlace2.j, i2);
                            }
                        }
                        i2 = (wallGeoDto.g() != typeDto || ((f = wallGeoDto.f()) != null && f.intValue() == i)) ? wallGeoDto.g() == WallGeoDto.TypeDto.PLACE ? 2 : 0 : i;
                        return new GeoAttachment(parseDouble, parseDouble2, geoPlace2.i, geoPlace2.k, geoPlace2.c, geoPlace2.j, i2);
                    }
                }
            }
            strArr = null;
            if (strArr != null) {
                double parseDouble3 = Double.parseDouble(strArr[0]);
                double parseDouble22 = Double.parseDouble(strArr[1]);
                e = wallGeoDto.e();
                if (e != null) {
                }
            }
        }
        return null;
    }
}
