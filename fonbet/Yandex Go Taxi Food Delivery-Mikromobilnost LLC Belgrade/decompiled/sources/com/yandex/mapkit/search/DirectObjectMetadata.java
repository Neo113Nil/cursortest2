package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.Image;
import com.yandex.mapkit.atom.Link;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class DirectObjectMetadata implements BaseMetadata, Serializable {
    private String age;
    private boolean age__is_initialized;
    private ContactInfo contactInfo;
    private boolean contactInfo__is_initialized;
    private List<Counter> counters;
    private boolean counters__is_initialized;
    private List<String> disclaimers;
    private boolean disclaimers__is_initialized;
    private String domain;
    private boolean domain__is_initialized;
    private String extra;
    private boolean extra__is_initialized;
    private Image favicon;
    private boolean favicon__is_initialized;
    private List<Link> links;
    private boolean links__is_initialized;
    private NativeObject nativeObject;
    private OrdInfo ordInfo;
    private boolean ordInfo__is_initialized;
    private Float rating;
    private boolean rating__is_initialized;
    private String text;
    private boolean text__is_initialized;
    private String title;
    private boolean title__is_initialized;
    private String url;
    private boolean url__is_initialized;

    public DirectObjectMetadata(String str, String str2, String str3, List<String> list, String str4, String str5, List<Counter> list2, List<Link> list3, ContactInfo contactInfo, OrdInfo ordInfo, Image image, Float f, String str6) {
        this.title__is_initialized = false;
        this.text__is_initialized = false;
        this.extra__is_initialized = false;
        this.disclaimers__is_initialized = false;
        this.domain__is_initialized = false;
        this.url__is_initialized = false;
        this.counters__is_initialized = false;
        this.links__is_initialized = false;
        this.contactInfo__is_initialized = false;
        this.ordInfo__is_initialized = false;
        this.favicon__is_initialized = false;
        this.rating__is_initialized = false;
        this.age__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"title\" cannot be null");
            throw null;
        }
        if (str2 == null) {
            ny61.g("Required field \"text\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"disclaimers\" cannot be null");
            throw null;
        }
        if (str5 == null) {
            ny61.g("Required field \"url\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"counters\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"links\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3, list, str4, str5, list2, list3, contactInfo, ordInfo, image, f, str6);
        this.title = str;
        this.title__is_initialized = true;
        this.text = str2;
        this.text__is_initialized = true;
        this.extra = str3;
        this.extra__is_initialized = true;
        this.disclaimers = list;
        this.disclaimers__is_initialized = true;
        this.domain = str4;
        this.domain__is_initialized = true;
        this.url = str5;
        this.url__is_initialized = true;
        this.counters = list2;
        this.counters__is_initialized = true;
        this.links = list3;
        this.links__is_initialized = true;
        this.contactInfo = contactInfo;
        this.contactInfo__is_initialized = true;
        this.ordInfo = ordInfo;
        this.ordInfo__is_initialized = true;
        this.favicon = image;
        this.favicon__is_initialized = true;
        this.rating = f;
        this.rating__is_initialized = true;
        this.age = str6;
        this.age__is_initialized = true;
    }

    private native String getAge__Native();

    private native ContactInfo getContactInfo__Native();

    private native List<Counter> getCounters__Native();

    private native List<String> getDisclaimers__Native();

    private native String getDomain__Native();

    private native String getExtra__Native();

    private native Image getFavicon__Native();

    private native List<Link> getLinks__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::DirectObjectMetadata";
    }

    private native OrdInfo getOrdInfo__Native();

    private native Float getRating__Native();

    private native String getText__Native();

    private native String getTitle__Native();

    private native String getUrl__Native();

    private native NativeObject init(String str, String str2, String str3, List<String> list, String str4, String str5, List<Counter> list2, List<Link> list3, ContactInfo contactInfo, OrdInfo ordInfo, Image image, Float f, String str6);

    public synchronized String getAge() {
        try {
            if (!this.age__is_initialized) {
                this.age = getAge__Native();
                this.age__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.age;
    }

    public synchronized ContactInfo getContactInfo() {
        try {
            if (!this.contactInfo__is_initialized) {
                this.contactInfo = getContactInfo__Native();
                this.contactInfo__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.contactInfo;
    }

    public synchronized List<Counter> getCounters() {
        try {
            if (!this.counters__is_initialized) {
                this.counters = getCounters__Native();
                this.counters__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.counters;
    }

    public synchronized List<String> getDisclaimers() {
        try {
            if (!this.disclaimers__is_initialized) {
                this.disclaimers = getDisclaimers__Native();
                this.disclaimers__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.disclaimers;
    }

    public synchronized String getDomain() {
        try {
            if (!this.domain__is_initialized) {
                this.domain = getDomain__Native();
                this.domain__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.domain;
    }

    public synchronized String getExtra() {
        try {
            if (!this.extra__is_initialized) {
                this.extra = getExtra__Native();
                this.extra__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.extra;
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

    public synchronized List<Link> getLinks() {
        try {
            if (!this.links__is_initialized) {
                this.links = getLinks__Native();
                this.links__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.links;
    }

    public synchronized OrdInfo getOrdInfo() {
        try {
            if (!this.ordInfo__is_initialized) {
                this.ordInfo = getOrdInfo__Native();
                this.ordInfo__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ordInfo;
    }

    public synchronized Float getRating() {
        try {
            if (!this.rating__is_initialized) {
                this.rating = getRating__Native();
                this.rating__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.rating;
    }

    public synchronized String getText() {
        try {
            if (!this.text__is_initialized) {
                this.text = getText__Native();
                this.text__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.text;
    }

    public synchronized String getTitle() {
        try {
            if (!this.title__is_initialized) {
                this.title = getTitle__Native();
                this.title__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.title;
    }

    public synchronized String getUrl() {
        try {
            if (!this.url__is_initialized) {
                this.url = getUrl__Native();
                this.url__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.url;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getTitle(), false);
            archive.add(getText(), false);
            archive.add(getExtra(), true);
            archive.add((List) getDisclaimers(), false, (ArchivingHandler) new StringHandler());
            archive.add(getDomain(), true);
            archive.add(getUrl(), false);
            archive.add((List) getCounters(), false, (ArchivingHandler) new ClassHandler(Counter.class));
            archive.add((List) getLinks(), false, (ArchivingHandler) new ClassHandler(Link.class));
            archive.add((Archive) getContactInfo(), true, (Class<Archive>) ContactInfo.class);
            archive.add((Archive) getOrdInfo(), true, (Class<Archive>) OrdInfo.class);
            archive.add((Archive) getFavicon(), true, (Class<Archive>) Image.class);
            archive.add(getRating(), true);
            archive.add(getAge(), true);
            return;
        }
        this.title = archive.add(this.title, false);
        this.title__is_initialized = true;
        this.text = archive.add(this.text, false);
        this.text__is_initialized = true;
        this.extra = archive.add(this.extra, true);
        this.extra__is_initialized = true;
        this.disclaimers = nnm.o(archive, this.disclaimers, false);
        this.disclaimers__is_initialized = true;
        this.domain = archive.add(this.domain, true);
        this.domain__is_initialized = true;
        this.url = archive.add(this.url, false);
        this.url__is_initialized = true;
        this.counters = nzs.e(Counter.class, archive, this.counters, false);
        this.counters__is_initialized = true;
        this.links = nzs.e(Link.class, archive, this.links, false);
        this.links__is_initialized = true;
        this.contactInfo = (ContactInfo) archive.add((Archive) this.contactInfo, true, (Class<Archive>) ContactInfo.class);
        this.contactInfo__is_initialized = true;
        this.ordInfo = (OrdInfo) archive.add((Archive) this.ordInfo, true, (Class<Archive>) OrdInfo.class);
        this.ordInfo__is_initialized = true;
        this.favicon = (Image) archive.add((Archive) this.favicon, true, (Class<Archive>) Image.class);
        this.favicon__is_initialized = true;
        this.rating = archive.add(this.rating, true);
        this.rating__is_initialized = true;
        String add = archive.add(this.age, true);
        this.age = add;
        this.age__is_initialized = true;
        this.nativeObject = init(this.title, this.text, this.extra, this.disclaimers, this.domain, this.url, this.counters, this.links, this.contactInfo, this.ordInfo, this.favicon, this.rating, add);
    }

    public DirectObjectMetadata() {
        this.title__is_initialized = false;
        this.text__is_initialized = false;
        this.extra__is_initialized = false;
        this.disclaimers__is_initialized = false;
        this.domain__is_initialized = false;
        this.url__is_initialized = false;
        this.counters__is_initialized = false;
        this.links__is_initialized = false;
        this.contactInfo__is_initialized = false;
        this.ordInfo__is_initialized = false;
        this.favicon__is_initialized = false;
        this.rating__is_initialized = false;
        this.age__is_initialized = false;
    }

    private DirectObjectMetadata(NativeObject nativeObject) {
        this.title__is_initialized = false;
        this.text__is_initialized = false;
        this.extra__is_initialized = false;
        this.disclaimers__is_initialized = false;
        this.domain__is_initialized = false;
        this.url__is_initialized = false;
        this.counters__is_initialized = false;
        this.links__is_initialized = false;
        this.contactInfo__is_initialized = false;
        this.ordInfo__is_initialized = false;
        this.favicon__is_initialized = false;
        this.rating__is_initialized = false;
        this.age__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
