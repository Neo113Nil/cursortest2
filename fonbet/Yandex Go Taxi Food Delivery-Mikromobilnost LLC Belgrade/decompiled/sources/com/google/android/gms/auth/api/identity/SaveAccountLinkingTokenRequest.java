package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bb1;
import defpackage.cvw;
import defpackage.ooc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new zbq();
    public static final String EXTRA_TOKEN = "extra_token";
    public static final String TOKEN_TYPE_AUTH_CODE = "auth_code";
    private final PendingIntent zba;
    private final String zbb;
    private final String zbc;
    private final List zbd;
    private final String zbe;
    private final int zbf;

    public static final class a {
        public a() {
            new ArrayList();
        }
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i) {
        this.zba = pendingIntent;
        this.zbb = str;
        this.zbc = str2;
        this.zbd = list;
        this.zbe = str3;
        this.zbf = i;
    }

    public static a builder() {
        return new a();
    }

    public static a zba(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        cvw.l(saveAccountLinkingTokenRequest);
        a builder = builder();
        saveAccountLinkingTokenRequest.getScopes();
        builder.getClass();
        saveAccountLinkingTokenRequest.getServiceId();
        saveAccountLinkingTokenRequest.getConsentPendingIntent();
        saveAccountLinkingTokenRequest.getTokenType();
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.zbe);
        return builder;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        return this.zbd.size() == saveAccountLinkingTokenRequest.zbd.size() && this.zbd.containsAll(saveAccountLinkingTokenRequest.zbd) && ooc.m(this.zba, saveAccountLinkingTokenRequest.zba) && ooc.m(this.zbb, saveAccountLinkingTokenRequest.zbb) && ooc.m(this.zbc, saveAccountLinkingTokenRequest.zbc) && ooc.m(this.zbe, saveAccountLinkingTokenRequest.zbe) && this.zbf == saveAccountLinkingTokenRequest.zbf;
    }

    public PendingIntent getConsentPendingIntent() {
        return this.zba;
    }

    public List<String> getScopes() {
        return this.zbd;
    }

    public String getServiceId() {
        return this.zbc;
    }

    public String getTokenType() {
        return this.zbb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.zba, this.zbb, this.zbc, this.zbd, this.zbe});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, getConsentPendingIntent(), i, false);
        bb1.g0(parcel, 2, getTokenType(), false);
        bb1.g0(parcel, 3, getServiceId(), false);
        bb1.i0(parcel, 4, getScopes());
        bb1.g0(parcel, 5, this.zbe, false);
        int i2 = this.zbf;
        bb1.m0(6, parcel, 4);
        parcel.writeInt(i2);
        bb1.o0(parcel, n0);
    }
}
