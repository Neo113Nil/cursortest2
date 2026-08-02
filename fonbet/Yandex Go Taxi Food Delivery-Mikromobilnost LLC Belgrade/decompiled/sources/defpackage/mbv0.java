package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.search.common.analytics.LegacyAddressSearchAnalytics$ZeroSuggestType;
import com.yandex.go.address.search.common.analytics.SuggestionsAnalytics$DefaultSuggestType;
import com.yandex.go.address.search.common.analytics.SuggestionsAnalytics$Type;
import java.util.HashMap;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.video.m3.player.impl.tracking.StrmManagerImplKt;

/* loaded from: classes12.dex */
public final class mbv0 {
    public final ah00 a;
    public final lx4 b;
    public final e51 c;
    public final r8h d;
    public final rwp0 e;
    public final ec00 f;
    public final b5v0 g;
    public final pj h;
    public final String i;
    public int j;
    public String m;
    public boolean o;
    public String k = "";
    public String l = "";
    public String n = "address_search";

    public mbv0(ah00 ah00Var, lx4 lx4Var, e51 e51Var, r8h r8hVar, rwp0 rwp0Var, SourcePicker sourcePicker, ec00 ec00Var, b5v0 b5v0Var, pj pjVar) {
        this.a = ah00Var;
        this.b = lx4Var;
        this.c = e51Var;
        this.d = r8hVar;
        this.e = rwp0Var;
        this.f = ec00Var;
        this.g = b5v0Var;
        this.h = pjVar;
        this.i = sourcePicker.getSource();
    }

    public static a5v0 i(mbv0 mbv0Var, String str, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if ((i & 2) != 0) {
            str = mbv0Var.e.c();
        }
        String str2 = str;
        String str3 = mbv0Var.i;
        String str4 = mbv0Var.m;
        return new a5v0(str2, str3, (str4 == null || str4.length() == 0) ? null : str4, mbv0Var.f.a(), currentTimeMillis);
    }

    public final i a(String str) {
        i d = ((j) this.b).d(str);
        String str2 = this.i;
        if (str2 != null) {
            d.d("address_search", str2);
        }
        String str3 = this.m;
        if (str3 != null && str3.length() != 0) {
            d.d("suggest_serpid", str3);
        }
        d.c(System.currentTimeMillis(), "event_milli_timestamp");
        d.d("client_reqid", this.e.c());
        this.f.b(d);
        return d;
    }

    public final kbv0 b() {
        gh00 gh00Var = (gh00) this.a;
        gh00Var.e.b();
        kbv0 kbv0Var = new kbv0();
        kbv0Var.e = this.j;
        kbv0Var.h = gh00Var.e.b().b();
        kbv0Var.i = "1,1";
        return kbv0Var;
    }

    public final void c(boolean z) {
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            String c = this.e.c();
            String str = this.m;
            this.g.A(c, this.i, (str == null || str.length() == 0) ? null : str, this.f.a(), currentTimeMillis);
        }
    }

    public final void d(String str, String str2, boolean z) {
        if (str == null) {
            str = "";
        }
        h(str);
        this.j = 0;
        this.m = str2;
        if (z) {
            String str3 = null;
            if (this.g.o(i(this, null, 3))) {
                return;
            }
            String str4 = this.n;
            long currentTimeMillis = System.currentTimeMillis();
            String c = this.e.c();
            String str5 = this.m;
            if (str5 != null && str5.length() != 0) {
                str3 = str5;
            }
            String a = this.f.a();
            pj pjVar = this.h;
            pjVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("event_context", str4);
            String str6 = this.i;
            if (str6 != null) {
                hashMap.put("address_search", str6);
            }
            if (str3 != null) {
                hashMap.put("suggest_serpid", str3);
            }
            hashMap.put("event_milli_timestamp", Long.valueOf(currentTimeMillis));
            hashMap.put("client_reqid", c);
            if (a != null) {
                hashMap.put("MainScreenVersion", a);
            }
            HashMap hashMap2 = new HashMap();
            Regex regex = sho.a;
            pjVar.a.a(sb2.q("${event_context}.SuggestFormOpen", hashMap), hashMap, 1, hashMap2);
        }
    }

    public final void e(String str, kbv0 kbv0Var) {
        i a = a(this.n + Extension.DOT_CHAR + str);
        String str2 = kbv0Var.b;
        if (str2 != null) {
            HashMap p = x4e.p("text", str2);
            int i = kbv0Var.e;
            if (i > -1) {
                p.put("editOpCount", Integer.valueOf(i));
            }
            a.f("searchFilter", p);
            a.d("part", str2);
        }
        String str3 = kbv0Var.a;
        if (str3 != null) {
            HashMap p2 = x4e.p("addressName", str3);
            Boolean bool = kbv0Var.c;
            if (bool != null) {
                p2.put("final", bool);
            }
            Address address = kbv0Var.d;
            if ((address != null ? address.B() : null) != null) {
                zzs B = address.B();
                HashMap hashMap = new HashMap();
                hashMap.put("lat", Double.valueOf(B.a));
                hashMap.put("lon", Double.valueOf(B.b));
                int i2 = B.c;
                if (i2 > 0) {
                    hashMap.put("acc", Integer.valueOf(i2));
                }
                p2.put("coordinate", hashMap);
            }
            String pickMethod = address != null ? address.getPickMethod() : null;
            if (pickMethod != null) {
                p2.put("method", pickMethod);
            }
            a.f("address", p2);
        }
        int i3 = kbv0Var.f;
        if (i3 >= 0) {
            a.b(i3, StrmManagerImplKt.QUERY_PARAMETER_SOURCE_INDEX);
        }
        String str4 = kbv0Var.g;
        if (str4 != null) {
            a.d("log_id", str4);
        }
        String str5 = kbv0Var.h;
        if (str5 != null) {
            a.d("ll", str5);
        }
        String str6 = kbv0Var.i;
        if (str6 != null) {
            a.d("spn", str6);
        }
        SuggestionsAnalytics$DefaultSuggestType suggestionsAnalytics$DefaultSuggestType = kbv0Var.k;
        if (suggestionsAnalytics$DefaultSuggestType != null) {
            a.d(suggestionsAnalytics$DefaultSuggestType.getAnalyticType(), suggestionsAnalytics$DefaultSuggestType.getAnalyticName());
        }
        String str7 = kbv0Var.l;
        if (str7 != null) {
            a.d("client_reqid", str7);
        }
        a.c(kbv0Var.m, "event_milli_timestamp");
        a.m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(String str, kbv0 kbv0Var) {
        HashMap hashMap;
        HashMap hashMap2;
        ec00 ec00Var;
        rwp0 rwp0Var;
        boolean x;
        j9y j9yVar;
        long j;
        h9y h9yVar;
        i9y i9yVar;
        zzs B;
        String pickMethod;
        zzs B2;
        if (str.equals("AddressSelectionSkipButtonTap")) {
            e(str, kbv0Var);
        }
        String str2 = kbv0Var.b;
        long j2 = kbv0Var.m;
        if (str2 != null) {
            HashMap p = x4e.p("text", str2);
            int i = kbv0Var.e;
            if (i > -1) {
                p.put("editOpCount", Integer.valueOf(i));
            }
            hashMap = p;
        } else {
            hashMap = null;
        }
        String str3 = kbv0Var.a;
        if (str3 != null) {
            HashMap p2 = x4e.p("addressName", str3);
            Boolean bool = kbv0Var.c;
            if (bool != null) {
                p2.put("final", bool);
            }
            Address address = kbv0Var.d;
            if (address != null && (B2 = address.B()) != null) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("lat", Double.valueOf(B2.a));
                hashMap3.put("lon", Double.valueOf(B2.b));
                int i2 = B2.c;
                if (i2 > 0) {
                    hashMap3.put("acc", Integer.valueOf(i2));
                }
                p2.put("coordinate", hashMap3);
            }
            Address address2 = kbv0Var.d;
            if (address2 != null && (pickMethod = address2.getPickMethod()) != null) {
                p2.put("method", pickMethod);
            }
            hashMap2 = p2;
        } else {
            hashMap2 = null;
        }
        String str4 = kbv0Var.l;
        rwp0 rwp0Var2 = this.e;
        if (str4 == null) {
            str4 = rwp0Var2.c();
        }
        String str5 = str4;
        String str6 = this.m;
        String str7 = (str6 == null || str6.length() == 0) ? null : str6;
        ec00 ec00Var2 = this.f;
        a5v0 a5v0Var = new a5v0(str5, this.i, str7, ec00Var2.a(), j2);
        int hashCode = str.hashCode();
        b5v0 b5v0Var = this.g;
        switch (hashCode) {
            case -1437518564:
                ec00Var = ec00Var2;
                rwp0Var = rwp0Var2;
                HashMap hashMap4 = hashMap2;
                if (str.equals("ZeroSuggestSelectAddress")) {
                    int i3 = kbv0Var.f;
                    String str8 = kbv0Var.h;
                    if (str8 != null) {
                        String str9 = kbv0Var.i;
                        if (str9 != null) {
                            SuggestionsAnalytics$DefaultSuggestType suggestionsAnalytics$DefaultSuggestType = kbv0Var.k;
                            if (suggestionsAnalytics$DefaultSuggestType != null) {
                                x = this.g.x(a5v0Var, i3, str8, str9, suggestionsAnalytics$DefaultSuggestType.getAnalyticName(), hashMap4);
                                if (!x) {
                                    String str10 = kbv0Var.l;
                                    if (str10 == null) {
                                        str10 = rwp0Var.c();
                                    }
                                    String str11 = kbv0Var.b;
                                    if (str11 != null) {
                                        int i4 = kbv0Var.e;
                                        Integer valueOf = Integer.valueOf(i4);
                                        if (i4 <= -1) {
                                            valueOf = null;
                                        }
                                        j9yVar = new j9y(str11, valueOf);
                                    } else {
                                        j9yVar = null;
                                    }
                                    String str12 = kbv0Var.a;
                                    if (str12 != null) {
                                        Boolean bool2 = kbv0Var.c;
                                        Address address3 = kbv0Var.d;
                                        if (address3 == null || (B = address3.B()) == null) {
                                            j = j2;
                                            i9yVar = null;
                                        } else {
                                            j = j2;
                                            i9yVar = new i9y(B.a, B.b, Double.valueOf(B.c));
                                        }
                                        Address address4 = kbv0Var.d;
                                        h9yVar = new h9y(str12, bool2, i9yVar, address4 != null ? address4.getPickMethod() : null);
                                    } else {
                                        j = j2;
                                        h9yVar = null;
                                    }
                                    String str13 = this.m;
                                    if (str13 == null || str13.length() == 0) {
                                        str13 = null;
                                    }
                                    String a = ec00Var.a();
                                    int hashCode2 = str.hashCode();
                                    h9y h9yVar2 = h9yVar;
                                    j9y j9yVar2 = j9yVar;
                                    String str14 = this.i;
                                    pj pjVar = this.h;
                                    switch (hashCode2) {
                                        case -1437518564:
                                            if (str.equals("ZeroSuggestSelectAddress")) {
                                                String str15 = this.n;
                                                int i5 = kbv0Var.f;
                                                String str16 = kbv0Var.h;
                                                if (str16 != null) {
                                                    String str17 = kbv0Var.i;
                                                    if (str17 != null) {
                                                        for (LegacyAddressSearchAnalytics$ZeroSuggestType legacyAddressSearchAnalytics$ZeroSuggestType : LegacyAddressSearchAnalytics$ZeroSuggestType.a()) {
                                                            String str18 = str17;
                                                            String eventValue = legacyAddressSearchAnalytics$ZeroSuggestType.getEventValue();
                                                            String str19 = str16;
                                                            SuggestionsAnalytics$DefaultSuggestType suggestionsAnalytics$DefaultSuggestType2 = kbv0Var.k;
                                                            if (suggestionsAnalytics$DefaultSuggestType2 == null) {
                                                                ny61.g("Required value was null.");
                                                                break;
                                                            } else if (jl40.l(eventValue, suggestionsAnalytics$DefaultSuggestType2.getAnalyticName())) {
                                                                pjVar.getClass();
                                                                HashMap hashMap5 = new HashMap();
                                                                hashMap5.put("event_context", str15);
                                                                if (str14 != null) {
                                                                    hashMap5.put("address_search", str14);
                                                                }
                                                                if (str13 != null) {
                                                                    hashMap5.put("suggest_serpid", str13);
                                                                }
                                                                hashMap5.put("event_milli_timestamp", Long.valueOf(j));
                                                                hashMap5.put("client_reqid", str10);
                                                                if (a != null) {
                                                                    hashMap5.put("MainScreenVersion", a);
                                                                }
                                                                hashMap5.put(StrmManagerImplKt.QUERY_PARAMETER_SOURCE_INDEX, Integer.valueOf(i5));
                                                                hashMap5.put("ll", str19);
                                                                hashMap5.put("spn", str18);
                                                                hashMap5.put("type", legacyAddressSearchAnalytics$ZeroSuggestType.getEventValue());
                                                                if (h9yVar2 != null) {
                                                                    hashMap5.put("address", h9yVar2.e);
                                                                }
                                                                HashMap hashMap6 = new HashMap();
                                                                Regex regex = sho.a;
                                                                pjVar.a.a(sb2.q("${event_context}.ZeroSuggestSelectAddress", hashMap5), hashMap5, 1, hashMap6);
                                                                break;
                                                            } else {
                                                                str17 = str18;
                                                                str16 = str19;
                                                            }
                                                        }
                                                        w511.i("Collection contains no element matching the predicate.");
                                                        break;
                                                    } else {
                                                        ny61.g("Required value was null.");
                                                        break;
                                                    }
                                                } else {
                                                    ny61.g("Required value was null.");
                                                    break;
                                                }
                                            }
                                            e(str, kbv0Var);
                                            break;
                                        case 231213521:
                                            if (str.equals("SuggestPointOnMap")) {
                                                String str20 = this.n;
                                                if (j9yVar2 != null) {
                                                    String str21 = kbv0Var.b;
                                                    if (str21 != null) {
                                                        pjVar.getClass();
                                                        HashMap hashMap7 = new HashMap();
                                                        hashMap7.put("event_context", str20);
                                                        if (str14 != null) {
                                                            hashMap7.put("address_search", str14);
                                                        }
                                                        if (str13 != null) {
                                                            hashMap7.put("suggest_serpid", str13);
                                                        }
                                                        hashMap7.put("event_milli_timestamp", Long.valueOf(j));
                                                        hashMap7.put("client_reqid", str10);
                                                        if (a != null) {
                                                            hashMap7.put("MainScreenVersion", a);
                                                        }
                                                        hashMap7.put("searchFilter", j9yVar2.c);
                                                        hashMap7.put("part", str21);
                                                        HashMap hashMap8 = new HashMap();
                                                        Regex regex2 = sho.a;
                                                        pjVar.a.a(sb2.q("${event_context}.SuggestPointOnMap", hashMap7), hashMap7, 1, hashMap8);
                                                        break;
                                                    } else {
                                                        ny61.g("Required value was null.");
                                                        break;
                                                    }
                                                } else {
                                                    ny61.g("Required value was null.");
                                                    break;
                                                }
                                            }
                                            e(str, kbv0Var);
                                            break;
                                        case 323737770:
                                            if (str.equals("ShowOnMapForRestrictedAddressable")) {
                                                String str22 = this.n;
                                                if (h9yVar2 != null) {
                                                    pjVar.getClass();
                                                    HashMap hashMap9 = new HashMap();
                                                    hashMap9.put("event_context", str22);
                                                    if (str14 != null) {
                                                        hashMap9.put("address_search", str14);
                                                    }
                                                    if (str13 != null) {
                                                        hashMap9.put("suggest_serpid", str13);
                                                    }
                                                    hashMap9.put("event_milli_timestamp", Long.valueOf(j));
                                                    hashMap9.put("client_reqid", str10);
                                                    if (a != null) {
                                                        hashMap9.put("MainScreenVersion", a);
                                                    }
                                                    hashMap9.put("address", h9yVar2.e);
                                                    HashMap hashMap10 = new HashMap();
                                                    Regex regex3 = sho.a;
                                                    pjVar.a.a(sb2.q("${event_context}.ShowOnMapForRestrictedAddressable", hashMap9), hashMap9, 1, hashMap10);
                                                    break;
                                                } else {
                                                    ny61.g("Required value was null.");
                                                    break;
                                                }
                                            }
                                            e(str, kbv0Var);
                                            break;
                                        case 1850996308:
                                            if (str.equals("SuggestSelectAddress")) {
                                                String str23 = this.n;
                                                String str24 = kbv0Var.h;
                                                if (str24 != null) {
                                                    String str25 = kbv0Var.i;
                                                    if (str25 != null) {
                                                        int i6 = kbv0Var.f;
                                                        Integer valueOf2 = i6 >= 0 ? Integer.valueOf(i6) : null;
                                                        String str26 = kbv0Var.b;
                                                        String str27 = kbv0Var.g;
                                                        pjVar.getClass();
                                                        HashMap hashMap11 = new HashMap();
                                                        hashMap11.put("event_context", str23);
                                                        if (str14 != null) {
                                                            hashMap11.put("address_search", str14);
                                                        }
                                                        if (str13 != null) {
                                                            hashMap11.put("suggest_serpid", str13);
                                                        }
                                                        hashMap11.put("event_milli_timestamp", Long.valueOf(j));
                                                        hashMap11.put("client_reqid", str10);
                                                        if (a != null) {
                                                            hashMap11.put("MainScreenVersion", a);
                                                        }
                                                        if (valueOf2 != null) {
                                                            hashMap11.put(StrmManagerImplKt.QUERY_PARAMETER_SOURCE_INDEX, valueOf2);
                                                        }
                                                        hashMap11.put("ll", str24);
                                                        hashMap11.put("spn", str25);
                                                        if (j9yVar2 != null) {
                                                            hashMap11.put("searchFilter", j9yVar2.c);
                                                        }
                                                        if (str26 != null) {
                                                            hashMap11.put("part", str26);
                                                        }
                                                        if (h9yVar2 != null) {
                                                            hashMap11.put("address", h9yVar2.e);
                                                        }
                                                        if (str27 != null) {
                                                            hashMap11.put("log_id", str27);
                                                        }
                                                        HashMap hashMap12 = new HashMap();
                                                        Regex regex4 = sho.a;
                                                        pjVar.a.a(sb2.q("${event_context}.SuggestSelectAddress", hashMap11), hashMap11, 1, hashMap12);
                                                        break;
                                                    } else {
                                                        ny61.g("Required value was null.");
                                                        break;
                                                    }
                                                } else {
                                                    ny61.g("Required value was null.");
                                                    break;
                                                }
                                            }
                                            e(str, kbv0Var);
                                            break;
                                        default:
                                            e(str, kbv0Var);
                                            break;
                                    }
                                }
                            } else {
                                ny61.g("Required value was null.");
                                break;
                            }
                        } else {
                            ny61.g("Required value was null.");
                            break;
                        }
                    } else {
                        ny61.g("Required value was null.");
                        break;
                    }
                }
                vg10.d("Unsupported suggest event: ".concat(str));
                break;
            case 231213521:
                ec00Var = ec00Var2;
                rwp0Var = rwp0Var2;
                HashMap hashMap13 = hashMap;
                if (str.equals("SuggestPointOnMap")) {
                    if (hashMap13 == null) {
                        ny61.g("Required value was null.");
                        break;
                    } else {
                        String str28 = kbv0Var.b;
                        if (str28 == null) {
                            ny61.g("Required value was null.");
                            break;
                        } else {
                            x = b5v0Var.c(a5v0Var, hashMap13, str28);
                            if (!x) {
                            }
                        }
                    }
                }
                vg10.d("Unsupported suggest event: ".concat(str));
                break;
            case 323737770:
                ec00Var = ec00Var2;
                rwp0Var = rwp0Var2;
                HashMap hashMap14 = hashMap2;
                if (str.equals("ShowOnMapForRestrictedAddressable")) {
                    if (hashMap14 == null) {
                        ny61.g("Required value was null.");
                        break;
                    } else {
                        x = b5v0Var.j(a5v0Var, hashMap14);
                        if (!x) {
                        }
                    }
                }
                vg10.d("Unsupported suggest event: ".concat(str));
                break;
            case 497082383:
                ec00Var = ec00Var2;
                rwp0Var = rwp0Var2;
                HashMap hashMap15 = hashMap;
                if (str.equals("SuggestSearchKeyPressed")) {
                    if (hashMap15 == null) {
                        ny61.g("Required value was null.");
                        break;
                    } else {
                        String str29 = kbv0Var.b;
                        if (str29 == null) {
                            ny61.g("Required value was null.");
                            break;
                        } else {
                            x = b5v0Var.s(a5v0Var, hashMap15, str29);
                            if (!x) {
                            }
                        }
                    }
                }
                vg10.d("Unsupported suggest event: ".concat(str));
                break;
            case 1850996308:
                if (str.equals("SuggestSelectAddress")) {
                    int i7 = kbv0Var.f;
                    String str30 = kbv0Var.h;
                    if (str30 == null) {
                        ny61.g("Required value was null.");
                        break;
                    } else {
                        String str31 = kbv0Var.i;
                        if (str31 == null) {
                            ny61.g("Required value was null.");
                            break;
                        } else {
                            ec00Var = ec00Var2;
                            rwp0Var = rwp0Var2;
                            x = this.g.t(a5v0Var, i7, str30, str31, hashMap, kbv0Var.b, hashMap2, kbv0Var.g);
                            if (!x) {
                            }
                        }
                    }
                }
                vg10.d("Unsupported suggest event: ".concat(str));
                break;
            default:
                vg10.d("Unsupported suggest event: ".concat(str));
                break;
        }
    }

    public final void g(kbv0 kbv0Var) {
        String str;
        SuggestionsAnalytics$Type suggestionsAnalytics$Type = kbv0Var.j;
        int i = suggestionsAnalytics$Type == null ? -1 : lbv0.a[suggestionsAnalytics$Type.ordinal()];
        if (i != -1) {
            if (i == 1) {
                str = "ZeroSuggestSelectAddress";
            } else if (i == 2) {
                str = "AddressSelectionSkipButtonTap";
            } else if (i != 3) {
                w511.b();
                return;
            }
            f(str, kbv0Var);
        }
        str = "SuggestSelectAddress";
        f(str, kbv0Var);
    }

    public final void h(String str) {
        this.k = str;
        this.l = str;
        this.d.getClass();
        String b = this.e.b(System.currentTimeMillis());
        long currentTimeMillis = System.currentTimeMillis();
        b5v0 b5v0Var = this.g;
        String str2 = this.i;
        if (b5v0Var.v(currentTimeMillis, b, str2)) {
            return;
        }
        i d = ((j) this.b).d(b64.j(this.n, ".SuggestUserInput"));
        if (str2 != null) {
            d.a.put("address_search", str2);
        }
        d.d("client_reqid", b);
        d.c(System.currentTimeMillis(), "event_milli_timestamp");
        d.m();
    }
}
