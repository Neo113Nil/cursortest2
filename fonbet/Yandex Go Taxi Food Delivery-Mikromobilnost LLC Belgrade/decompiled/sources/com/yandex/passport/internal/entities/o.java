package com.yandex.passport.internal.entities;

import android.content.pm.Signature;
import android.util.Base64;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class o {
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final o f;
    public static final o g;
    public static final Map h;
    public final List a;
    public final Signature[] b;

    static {
        byte[] decode = Base64.decode("rKQF3tiyXLLoxtppQl0rQwfQh8Enb8Bq1ZQnMczFHbo=", 0);
        c = decode;
        byte[] decode2 = Base64.decode("HanLri3MxqWNbJR76UzbtzPWXaTRdw+hSlNky0oo60k=", 0);
        d = decode2;
        e = Base64.decode("+W185YaP0Dh3wF6PWAzgc55WjrJCxMX398YiHh5p75Y=", 0);
        f = new o(Collections.singletonList(decode), new Signature[0]);
        Collections.singletonList(decode2);
        g = new o(Collections.singletonList(new byte[0]), new Signature[0]);
        h = kotlin.collections.b.i(new Pair("com.edadeal.android", "Ucyt+WfG7scFrG9ix/DZjXnG3IJ9xqlHqcHBWZfJRC0="), new Pair("ru.kinopoisk", "bmQ8wpHeuihpnDrkPvnJoa7NZi0UUtd473a2MH7txIU="), new Pair("ru.foodfox.client", "3bydYEVOdzTJomTdNLyOSwskCDmcBgzr7HX+DHBhgMc="), new Pair("ru.auto.ara", "JixOZnbLEArntZeEyjeuy0WMm+mdwqN5IeXYw78PTjk="), new Pair("com.deliveryclub", "Oey4SFV8MM29BUDKKHPppyHtJtcaWDsj9NPTnzUekLk="), new Pair("com.scb.android", "q\\/6Eilpo3MC4DTSH01kxzZATSxRkzz29iymP5o1K3Lc="), new Pair("com.zebrainy.skazbuka", "QjM\\\\/yweNUDwGqMuNleLUWlqiyFov71hRR2Mcxoz9NYk="), new Pair("ru.vseapteki", "nmVYHwla4iKhErfvVWYhuh7vCDZLb3vYAHfdfes6DbY="), new Pair("uz.allplay.app", "UbaGU2rO43WTeRiGncAbrDbwCfiMjG3xN1NfwXCz64E="), new Pair("uz.allplay.apptv", "409SkfHnCWPyWHcHrgy7J2VQ8peroUd3P/YTLwmUrjw="), new Pair("jamhome.ru.lktsj", "+zAtZrdNtZYevaXkDN7rvyCOgV8UfSGB3afDdHfipZU="), new Pair("ru.berizaryad", "ejaKxCA91wCo1mYxoBY9Um\\/Gx7HbjgCWiX3kebaXheE="), new Pair("com.yandex.scooters", "0Fp2Qr9Mv0Cv38tO4qaq38AKDwiIMtiVJ1etcaVqH00="));
    }

    public o(List list, Signature[] signatureArr) {
        this.a = list;
        this.b = signatureArr;
    }

    public final byte[] a() {
        return (byte[]) kotlin.collections.a.P(this.a);
    }

    public final boolean b() {
        return Arrays.equals(d, a()) || Arrays.equals(e, a());
    }

    public final boolean c() {
        return Arrays.equals(c, a());
    }
}
