package com.yandex.plus.pay.api.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b64;
import defpackage.qv10;
import defpackage.xvz;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB;\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/yandex/plus/pay/api/analytics/PlusPayPaymentAnalyticsParams;", "Landroid/os/Parcelable;", "", "clientPlace", "clientPage", "clientFrom", "", "clientParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "asString$pay_sdk_release", "()Ljava/lang/String;", "asString", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getClientPlace", "getClientPage", "getClientFrom", "Ljava/util/Map;", "getClientParams", "()Ljava/util/Map;", "Companion", "a", "com/yandex/plus/pay/api/analytics/b", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlusPayPaymentAnalyticsParams implements Parcelable {
    private final String clientFrom;
    private final String clientPage;
    private final Map<String, String> clientParams;
    private final String clientPlace;
    public static final b Companion = new b();
    public static final Parcelable.Creator<PlusPayPaymentAnalyticsParams> CREATOR = new Creator();

    public static final class a {
        public String a;
        public String b;
        public String c;
        public final LinkedHashMap d = new LinkedHashMap();

        public final void a(Object obj, String str) {
            this.d.put(str, obj.toString());
        }
    }

    private PlusPayPaymentAnalyticsParams(String str, String str2, String str3, Map<String, String> map) {
        this.clientPlace = str;
        this.clientPage = str2;
        this.clientFrom = str3;
        this.clientParams = map;
    }

    public final String asString$pay_sdk_release() {
        StringBuilder sb = new StringBuilder("PlusPayPaymentAnalyticsParams(");
        sb.append(this.clientPlace);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.clientParams);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.clientPage);
        sb.append(Extension.FIX_SPACE);
        return b64.p(sb, this.clientFrom, ')');
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getClientFrom() {
        return this.clientFrom;
    }

    public final String getClientPage() {
        return this.clientPage;
    }

    public final Map<String, String> getClientParams() {
        return this.clientParams;
    }

    public final String getClientPlace() {
        return this.clientPlace;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.clientPlace);
        dest.writeString(this.clientPage);
        dest.writeString(this.clientFrom);
        Iterator x = qv10.x(this.clientParams, dest);
        while (x.hasNext()) {
            Map.Entry entry = (Map.Entry) x.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PlusPayPaymentAnalyticsParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayPaymentAnalyticsParams createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            int i = 0;
            while (i != readInt) {
                i = xvz.b(parcel, linkedHashMap, parcel.readString(), i, 1);
            }
            return new PlusPayPaymentAnalyticsParams(readString, readString2, readString3, linkedHashMap, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlusPayPaymentAnalyticsParams[] newArray(int i) {
            return new PlusPayPaymentAnalyticsParams[i];
        }
    }

    public /* synthetic */ PlusPayPaymentAnalyticsParams(String str, String str2, String str3, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, map);
    }
}
