package com.yandex.mapkit.search;

import com.yandex.mapkit.Image;
import com.yandex.mapkit.Money;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class BookingOffer implements Serializable {
    private List<BookingLink> bookingLinks;
    private boolean bookingLinks__is_initialized;
    private Image favicon;
    private boolean favicon__is_initialized;
    private NativeObject nativeObject;
    private String partnerName;
    private boolean partnerName__is_initialized;
    private Money price;
    private boolean price__is_initialized;

    public BookingOffer(String str, List<BookingLink> list, Image image, Money money) {
        this.partnerName__is_initialized = false;
        this.bookingLinks__is_initialized = false;
        this.favicon__is_initialized = false;
        this.price__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"partnerName\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"bookingLinks\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, list, image, money);
        this.partnerName = str;
        this.partnerName__is_initialized = true;
        this.bookingLinks = list;
        this.bookingLinks__is_initialized = true;
        this.favicon = image;
        this.favicon__is_initialized = true;
        this.price = money;
        this.price__is_initialized = true;
    }

    private native List<BookingLink> getBookingLinks__Native();

    private native Image getFavicon__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BookingOffer";
    }

    private native String getPartnerName__Native();

    private native Money getPrice__Native();

    private native NativeObject init(String str, List<BookingLink> list, Image image, Money money);

    public synchronized List<BookingLink> getBookingLinks() {
        try {
            if (!this.bookingLinks__is_initialized) {
                this.bookingLinks = getBookingLinks__Native();
                this.bookingLinks__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.bookingLinks;
    }

    public synchronized Image getFavicon() {
        try {
            if (!this.favicon__is_initialized) {
                this.favicon = getFavicon__Native();
                this.favicon__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.favicon;
    }

    public synchronized String getPartnerName() {
        try {
            if (!this.partnerName__is_initialized) {
                this.partnerName = getPartnerName__Native();
                this.partnerName__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.partnerName;
    }

    public synchronized Money getPrice() {
        try {
            if (!this.price__is_initialized) {
                this.price = getPrice__Native();
                this.price__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.price;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getPartnerName(), false);
            archive.add((List) getBookingLinks(), false, (ArchivingHandler) new ClassHandler(BookingLink.class));
            archive.add((Archive) getFavicon(), true, (Class<Archive>) Image.class);
            archive.add((Archive) getPrice(), true, (Class<Archive>) Money.class);
            return;
        }
        this.partnerName = archive.add(this.partnerName, false);
        this.partnerName__is_initialized = true;
        this.bookingLinks = nzs.e(BookingLink.class, archive, this.bookingLinks, false);
        this.bookingLinks__is_initialized = true;
        this.favicon = (Image) archive.add((Archive) this.favicon, true, (Class<Archive>) Image.class);
        this.favicon__is_initialized = true;
        Money money = (Money) archive.add((Archive) this.price, true, (Class<Archive>) Money.class);
        this.price = money;
        this.price__is_initialized = true;
        this.nativeObject = init(this.partnerName, this.bookingLinks, this.favicon, money);
    }

    public BookingOffer() {
        this.partnerName__is_initialized = false;
        this.bookingLinks__is_initialized = false;
        this.favicon__is_initialized = false;
        this.price__is_initialized = false;
    }

    private BookingOffer(NativeObject nativeObject) {
        this.partnerName__is_initialized = false;
        this.bookingLinks__is_initialized = false;
        this.favicon__is_initialized = false;
        this.price__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
