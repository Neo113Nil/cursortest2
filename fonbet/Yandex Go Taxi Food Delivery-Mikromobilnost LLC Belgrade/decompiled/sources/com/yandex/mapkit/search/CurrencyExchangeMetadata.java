package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class CurrencyExchangeMetadata implements BaseMetadata, Serializable {
    private List<CurrencyExchangeType> currencies;
    private boolean currencies__is_initialized;
    private NativeObject nativeObject;

    public CurrencyExchangeMetadata(List<CurrencyExchangeType> list) {
        this.currencies__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"currencies\" cannot be null");
            throw null;
        }
        this.nativeObject = init(list);
        this.currencies = list;
        this.currencies__is_initialized = true;
    }

    private native List<CurrencyExchangeType> getCurrencies__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::CurrencyExchangeMetadata";
    }

    private native NativeObject init(List<CurrencyExchangeType> list);

    public synchronized List<CurrencyExchangeType> getCurrencies() {
        try {
            if (!this.currencies__is_initialized) {
                this.currencies = getCurrencies__Native();
                this.currencies__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.currencies;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            nzs.m(CurrencyExchangeType.class, archive, getCurrencies(), false);
            return;
        }
        List<CurrencyExchangeType> e = nzs.e(CurrencyExchangeType.class, archive, this.currencies, false);
        this.currencies = e;
        this.currencies__is_initialized = true;
        this.nativeObject = init(e);
    }

    public CurrencyExchangeMetadata() {
        this.currencies__is_initialized = false;
    }

    private CurrencyExchangeMetadata(NativeObject nativeObject) {
        this.currencies__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
