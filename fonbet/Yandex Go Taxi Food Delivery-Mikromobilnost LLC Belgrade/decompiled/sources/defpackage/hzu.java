package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.ScooterPriceDto;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class hzu implements pzu {
    public final String a;
    public final String b;
    public final HubOfferType c;
    public final String d;
    public final atj0 e;
    public final kz6 f;
    public final List g;
    public final List h;
    public final List i;
    public final List j;
    public final btj0 k;
    public final List l;
    public final Integer m;
    public final ScooterPriceDto n;
    public final String o;
    public final String p;

    public hzu(String str, String str2, HubOfferType hubOfferType, String str3, atj0 atj0Var, kz6 kz6Var, List list, List list2, List list3, List list4, btj0 btj0Var, List list5, Integer num, ScooterPriceDto scooterPriceDto, String str4, String str5, int i) {
        list3 = (i & 256) != 0 ? EmptyList.a : list3;
        String str6 = (i & 16384) != 0 ? null : str4;
        String str7 = (i & 32768) == 0 ? str5 : null;
        this.a = str;
        this.b = str2;
        this.c = hubOfferType;
        this.d = str3;
        this.e = atj0Var;
        this.f = kz6Var;
        this.g = list;
        this.h = list2;
        this.i = list3;
        this.j = list4;
        this.k = btj0Var;
        this.l = list5;
        this.m = num;
        this.n = scooterPriceDto;
        this.o = str6;
        this.p = str7;
    }
}
