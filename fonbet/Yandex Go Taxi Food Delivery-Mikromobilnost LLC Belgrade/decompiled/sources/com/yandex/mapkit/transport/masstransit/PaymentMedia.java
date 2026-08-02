package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class PaymentMedia implements Serializable {
    private String id;
    private String name;
    private MediaType type;

    public enum MediaType {
        UNKNOWN,
        CASH,
        PAPER_TICKET,
        TRANSIT_CARD,
        CONTACTLESS_PAYMENT_DEVICE,
        MOBILE_APPLICATION
    }

    public PaymentMedia(String str, String str2, MediaType mediaType) {
        if (str == null) {
            ny61.g("Required field \"id\" cannot be null");
            throw null;
        }
        if (mediaType == null) {
            ny61.g("Required field \"type\" cannot be null");
            throw null;
        }
        this.id = str;
        this.name = str2;
        this.type = mediaType;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public MediaType getType() {
        return this.type;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.id = archive.add(this.id, false);
        this.name = archive.add(this.name, true);
        this.type = (MediaType) archive.add((Archive) this.type, false, (Class<Archive>) MediaType.class);
    }

    public PaymentMedia() {
    }
}
