package ru.rustore.sdk.pushclient.v;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.Lambda;
import xsna.bpn0;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class c {
    public final Context a;
    public final bpn0 b = new bpn0(new b());

    public static final class a {
        public final Integer a;
        public final Integer b;
        public final String c;

        public a(Integer num, Integer num2, String str) {
            this.a = num;
            this.b = num2;
            this.c = str;
        }
    }

    public static final class b extends Lambda implements gzs<a> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final a invoke() {
            c cVar = c.this;
            Bundle bundle = cVar.a.getPackageManager().getApplicationInfo(cVar.a.getPackageName(), 128).metaData;
            return new a((bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_icon")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_icon")) : null, (bundle != null && bundle.containsKey("ru.rustore.sdk.pushclient.default_notification_color")) ? Integer.valueOf(bundle.getInt("ru.rustore.sdk.pushclient.default_notification_color")) : null, bundle != null ? bundle.getString("ru.rustore.sdk.pushclient.default_notification_channel_id") : null);
        }
    }

    public c(Context context) {
        this.a = context;
    }
}
