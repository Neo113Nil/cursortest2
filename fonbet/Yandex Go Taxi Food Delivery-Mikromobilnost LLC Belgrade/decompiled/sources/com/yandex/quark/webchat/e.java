package com.yandex.quark.webchat;

import android.net.Uri;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.quark.contracts.theme.ThemeMode;
import com.yandex.quark.webchat.js.WebDataFormat;
import com.yandex.quark.webchat.params.WebChatParams;
import defpackage.ad41;
import defpackage.bd41;
import defpackage.cd41;
import defpackage.ct1;
import defpackage.dd41;
import defpackage.dt1;
import defpackage.ed41;
import defpackage.et1;
import defpackage.he41;
import defpackage.ie41;
import defpackage.j73;
import defpackage.je41;
import defpackage.jl40;
import defpackage.le41;
import defpackage.me41;
import defpackage.pd41;
import defpackage.qd41;
import defpackage.raj;
import defpackage.sbx;
import defpackage.tje;
import defpackage.u431;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wc41;
import defpackage.wls;
import defpackage.zcx;
import defpackage.zoc;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import kotlin.collections.builders.MapBuilder;
import kotlin.collections.builders.SetBuilder;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes8.dex */
public abstract class e {
    public static final zcx a = tje.a(sbx.d, new u431(12));
    public static final MessageDigest b = MessageDigest.getInstance("MD5");

    static {
        j73.f0(new String[]{"platform", "locale", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "listen", CommonUrlParts.APP_ID, "display_mode", "custom_session_id", "app_style", MetaDataField.DEVICE_ID_FIELD, "uuid", "capability_promise", "dialog_session_mode", "data_format", "show_request_partial"});
    }

    public static Uri a(Uri uri, qd41 qd41Var, wc41 wc41Var, String str, ThemeMode themeMode, List list, WebChatParams.DialogSessionMode dialogSessionMode, SetBuilder setBuilder, WebDataFormat webDataFormat) {
        String str2;
        String str3;
        String str4;
        String str5;
        raj rajVar;
        String str6;
        String str7;
        String str8;
        MapBuilder mapBuilder = new MapBuilder();
        for (String str9 : uri.getQueryParameterNames()) {
            mapBuilder.put(str9, uri.getQueryParameter(str9));
        }
        zoc zocVar = wc41Var.a;
        if (zocVar == null || (str2 = zocVar.b) == null) {
            wc41.a();
            throw null;
        }
        mapBuilder.put("platform", str2);
        mapBuilder.put("locale", qd41Var.a.toLanguageTag());
        mapBuilder.put("listen", String.valueOf(qd41Var.b));
        int i = me41.a[themeMode.ordinal()];
        if (i == 1) {
            str3 = "light";
        } else if (i == 2) {
            str3 = "dark";
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            str3 = "system";
        }
        mapBuilder.put(DivkitThemeChangeListener.THEME_VARIABLE_NAME, str3);
        ed41 ed41Var = qd41Var.e;
        if (jl40.l(ed41Var, bd41.a)) {
            str4 = "0";
        } else if (jl40.l(ed41Var, dd41.a)) {
            str4 = "1";
        } else if (jl40.l(ed41Var, cd41.a)) {
            str4 = "2";
        } else {
            if (!(ed41Var instanceof ad41)) {
                w511.b();
                return null;
            }
            je41 a2 = ((ad41) ed41Var).a();
            if (a2.equals(ie41.a)) {
                str4 = "3";
            } else {
                if (!a2.equals(he41.a)) {
                    w511.b();
                    return null;
                }
                str4 = "4";
            }
        }
        mapBuilder.put("display_mode", str4);
        mapBuilder.put(CommonUrlParts.APP_ID, str);
        zoc zocVar2 = wc41Var.a;
        if (zocVar2 == null) {
            wc41.a();
            throw null;
        }
        et1 et1Var = zocVar2.d;
        if (et1Var instanceof ct1) {
            str5 = ((ct1) et1Var).a;
        } else {
            if (!et1Var.equals(dt1.a)) {
                w511.b();
                return null;
            }
            str5 = null;
        }
        if (str5 != null) {
        }
        zoc zocVar3 = wc41Var.a;
        if (zocVar3 == null || (rajVar = zocVar3.e) == null) {
            wc41.a();
            throw null;
        }
        if (zocVar3 == null || (str6 = zocVar3.b) == null) {
            wc41.a();
            throw null;
        }
        raj a3 = rajVar.a(str6);
        if (a3.b) {
            a3 = null;
        }
        if (a3 != null) {
        }
        pd41 pd41Var = qd41Var.c;
        if (pd41Var != null) {
            zcx zcxVar = a;
            zcxVar.getClass();
        }
        String str10 = qd41Var.d;
        if (str10 != null) {
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        String str11 = qd41Var.f;
        if (str11 != null) {
        }
        if ((!setBuilder.isEmpty() ? setBuilder : null) != null) {
        }
        int i2 = me41.b[dialogSessionMode.ordinal()];
        if (i2 == 1) {
            str7 = "native";
        } else if (i2 == 2) {
            str7 = "split";
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            str7 = "web";
        }
        mapBuilder.put("dialog_session_mode", str7);
        int i3 = me41.c[webDataFormat.ordinal()];
        if (i3 == 1) {
            str8 = "json";
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            str8 = "proto";
        }
        mapBuilder.put("data_format", str8);
        mapBuilder.put("show_request_partial", String.valueOf(qd41Var.g));
        MapBuilder j = mapBuilder.j();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        final WebChatUrlBuilder$createUrl$parametrizedUri$1$1 webChatUrlBuilder$createUrl$parametrizedUri$1$1 = new WebChatUrlBuilder$createUrl$parametrizedUri$1$1(2, clearQuery, Uri.Builder.class, "appendQueryParameter", "appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;", 8);
        j.forEach(new BiConsumer() { // from class: com.yandex.quark.webchat.d
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((WebChatUrlBuilder$createUrl$parametrizedUri$1$1) wls.this).invoke(obj, obj2);
            }
        });
        Uri build = clearQuery.build();
        Set set = le41.b;
        return build;
    }
}
