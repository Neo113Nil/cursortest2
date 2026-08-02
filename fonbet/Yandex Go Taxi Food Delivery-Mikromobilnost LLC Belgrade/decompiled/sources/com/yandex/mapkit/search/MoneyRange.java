package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class MoneyRange implements Serializable {
    private String currency;
    private Double lower;
    private String text;
    private String timeUnit;
    private Double upper;

    public MoneyRange(Double d, Double d2, String str, String str2, String str3) {
        if (str == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"currency\" cannot be null");
            throw null;
        }
        this.lower = d;
        this.upper = d2;
        this.text = str;
        this.currency = str2;
        this.timeUnit = str3;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Double getLower() {
        return this.lower;
    }

    public String getText() {
        return this.text;
    }

    public String getTimeUnit() {
        return this.timeUnit;
    }

    public Double getUpper() {
        return this.upper;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.lower = archive.add(this.lower, true);
        this.upper = archive.add(this.upper, true);
        this.text = archive.add(this.text, false);
        this.currency = archive.add(this.currency, false);
        this.timeUnit = archive.add(this.timeUnit, true);
    }

    public MoneyRange() {
    }
}
