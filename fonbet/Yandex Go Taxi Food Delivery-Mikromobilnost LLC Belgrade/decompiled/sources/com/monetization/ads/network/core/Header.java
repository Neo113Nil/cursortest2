package com.monetization.ads.network.core;

import android.text.TextUtils;
import defpackage.oyr;

/* loaded from: classes11.dex */
public final class Header {
    private final String mName;
    private final String mValue;

    public Header(String str, String str2) {
        this.mName = str;
        this.mValue = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Header.class == obj.getClass()) {
            Header header = (Header) obj;
            if (TextUtils.equals(this.mName, header.mName) && TextUtils.equals(this.mValue, header.mValue)) {
                return true;
            }
        }
        return false;
    }

    public final String getName() {
        return this.mName;
    }

    public final String getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return this.mValue.hashCode() + (this.mName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.mName);
        sb.append(",value=");
        return oyr.t(sb, this.mValue, "]");
    }
}
