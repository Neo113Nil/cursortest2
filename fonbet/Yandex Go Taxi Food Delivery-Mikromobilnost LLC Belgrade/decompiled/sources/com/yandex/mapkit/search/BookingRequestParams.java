package com.yandex.mapkit.search;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class BookingRequestParams implements Serializable {
    private String checkIn;
    private int nights;
    private int persons;

    public BookingRequestParams(String str, int i, int i2) {
        if (str == null) {
            ny61.g("Required field \"checkIn\" cannot be null");
            throw null;
        }
        this.checkIn = str;
        this.nights = i;
        this.persons = i2;
    }

    public String getCheckIn() {
        return this.checkIn;
    }

    public int getNights() {
        return this.nights;
    }

    public int getPersons() {
        return this.persons;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.checkIn = archive.add(this.checkIn, false);
        this.nights = archive.add(this.nights);
        this.persons = archive.add(this.persons);
    }

    public BookingRequestParams() {
    }
}
