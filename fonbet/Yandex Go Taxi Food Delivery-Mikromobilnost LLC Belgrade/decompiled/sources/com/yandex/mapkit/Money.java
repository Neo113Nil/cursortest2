package com.yandex.mapkit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class Money implements Serializable {
    private String currency;
    private String text;
    private double value;

    public Money(double d, String str, String str2) {
        if (str == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"currency\" cannot be null");
            throw null;
        }
        this.value = d;
        this.text = str;
        this.currency = str2;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getText() {
        return this.text;
    }

    public double getValue() {
        return this.value;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.value = archive.add(this.value);
        this.text = archive.add(this.text, false);
        this.currency = archive.add(this.currency, false);
    }

    public Money() {
    }
}
