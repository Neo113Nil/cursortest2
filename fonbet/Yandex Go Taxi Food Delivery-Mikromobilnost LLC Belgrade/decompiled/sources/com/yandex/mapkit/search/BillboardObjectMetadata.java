package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.Image;
import com.yandex.runtime.KeyValuePair;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class BillboardObjectMetadata implements BaseMetadata, Serializable {
    private List<BillboardAction> actions;
    private boolean actions__is_initialized;
    private String address;
    private boolean address__is_initialized;
    private Chance chance;
    private boolean chance__is_initialized;
    private List<Creative> creatives;
    private boolean creatives__is_initialized;
    private List<Disclaimer> disclaimers;
    private boolean disclaimers__is_initialized;
    private List<Icon> icons;
    private boolean icons__is_initialized;
    private List<Image> images;
    private boolean images__is_initialized;
    private String logId;
    private boolean logId__is_initialized;
    private NativeObject nativeObject;
    private String placeId;
    private boolean placeId__is_initialized;
    private List<KeyValuePair> properties;
    private boolean properties__is_initialized;
    private String title;
    private boolean title__is_initialized;

    public BillboardObjectMetadata(String str, String str2, String str3, List<BillboardAction> list, List<Creative> list2, List<Disclaimer> list3, List<Icon> list4, List<Image> list5, List<KeyValuePair> list6, String str4, Chance chance) {
        this.placeId__is_initialized = false;
        this.title__is_initialized = false;
        this.address__is_initialized = false;
        this.actions__is_initialized = false;
        this.creatives__is_initialized = false;
        this.disclaimers__is_initialized = false;
        this.icons__is_initialized = false;
        this.images__is_initialized = false;
        this.properties__is_initialized = false;
        this.logId__is_initialized = false;
        this.chance__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"placeId\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"actions\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"creatives\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"disclaimers\" cannot be null");
            throw null;
        }
        if (list4 == null) {
            ny61.g("Required field \"icons\" cannot be null");
            throw null;
        }
        if (list5 == null) {
            ny61.g("Required field \"images\" cannot be null");
            throw null;
        }
        if (list6 == null) {
            ny61.g("Required field \"properties\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3, list, list2, list3, list4, list5, list6, str4, chance);
        this.placeId = str;
        this.placeId__is_initialized = true;
        this.title = str2;
        this.title__is_initialized = true;
        this.address = str3;
        this.address__is_initialized = true;
        this.actions = list;
        this.actions__is_initialized = true;
        this.creatives = list2;
        this.creatives__is_initialized = true;
        this.disclaimers = list3;
        this.disclaimers__is_initialized = true;
        this.icons = list4;
        this.icons__is_initialized = true;
        this.images = list5;
        this.images__is_initialized = true;
        this.properties = list6;
        this.properties__is_initialized = true;
        this.logId = str4;
        this.logId__is_initialized = true;
        this.chance = chance;
        this.chance__is_initialized = true;
    }

    private native List<BillboardAction> getActions__Native();

    private native String getAddress__Native();

    private native Chance getChance__Native();

    private native List<Creative> getCreatives__Native();

    private native List<Disclaimer> getDisclaimers__Native();

    private native List<Icon> getIcons__Native();

    private native List<Image> getImages__Native();

    private native String getLogId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::BillboardObjectMetadata";
    }

    private native String getPlaceId__Native();

    private native List<KeyValuePair> getProperties__Native();

    private native String getTitle__Native();

    private native NativeObject init(String str, String str2, String str3, List<BillboardAction> list, List<Creative> list2, List<Disclaimer> list3, List<Icon> list4, List<Image> list5, List<KeyValuePair> list6, String str4, Chance chance);

    public synchronized List<BillboardAction> getActions() {
        try {
            if (!this.actions__is_initialized) {
                this.actions = getActions__Native();
                this.actions__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.actions;
    }

    public synchronized String getAddress() {
        try {
            if (!this.address__is_initialized) {
                this.address = getAddress__Native();
                this.address__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.address;
    }

    public synchronized Chance getChance() {
        try {
            if (!this.chance__is_initialized) {
                this.chance = getChance__Native();
                this.chance__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.chance;
    }

    public synchronized List<Creative> getCreatives() {
        try {
            if (!this.creatives__is_initialized) {
                this.creatives = getCreatives__Native();
                this.creatives__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.creatives;
    }

    public synchronized List<Disclaimer> getDisclaimers() {
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

    public synchronized List<Icon> getIcons() {
        try {
            if (!this.icons__is_initialized) {
                this.icons = getIcons__Native();
                this.icons__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.icons;
    }

    public synchronized List<Image> getImages() {
        try {
            if (!this.images__is_initialized) {
                this.images = getImages__Native();
                this.images__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.images;
    }

    public synchronized String getLogId() {
        try {
            if (!this.logId__is_initialized) {
                this.logId = getLogId__Native();
                this.logId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.logId;
    }

    public synchronized String getPlaceId() {
        try {
            if (!this.placeId__is_initialized) {
                this.placeId = getPlaceId__Native();
                this.placeId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.placeId;
    }

    public synchronized List<KeyValuePair> getProperties() {
        try {
            if (!this.properties__is_initialized) {
                this.properties = getProperties__Native();
                this.properties__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.properties;
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

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getPlaceId(), false);
            archive.add(getTitle(), true);
            archive.add(getAddress(), true);
            archive.add((List) getActions(), false, (ArchivingHandler) new ClassHandler(BillboardAction.class));
            archive.add((List) getCreatives(), false, (ArchivingHandler) new ClassHandler(Creative.class));
            archive.add((List) getDisclaimers(), false, (ArchivingHandler) new ClassHandler(Disclaimer.class));
            archive.add((List) getIcons(), false, (ArchivingHandler) new ClassHandler(Icon.class));
            archive.add((List) getImages(), false, (ArchivingHandler) new ClassHandler(Image.class));
            archive.add((List) getProperties(), false, (ArchivingHandler) new ClassHandler(KeyValuePair.class));
            archive.add(getLogId(), true);
            archive.add((Archive) getChance(), true, (Class<Archive>) Chance.class);
            return;
        }
        this.placeId = archive.add(this.placeId, false);
        this.placeId__is_initialized = true;
        this.title = archive.add(this.title, true);
        this.title__is_initialized = true;
        this.address = archive.add(this.address, true);
        this.address__is_initialized = true;
        this.actions = nzs.e(BillboardAction.class, archive, this.actions, false);
        this.actions__is_initialized = true;
        this.creatives = nzs.e(Creative.class, archive, this.creatives, false);
        this.creatives__is_initialized = true;
        this.disclaimers = nzs.e(Disclaimer.class, archive, this.disclaimers, false);
        this.disclaimers__is_initialized = true;
        this.icons = nzs.e(Icon.class, archive, this.icons, false);
        this.icons__is_initialized = true;
        this.images = nzs.e(Image.class, archive, this.images, false);
        this.images__is_initialized = true;
        this.properties = nzs.e(KeyValuePair.class, archive, this.properties, false);
        this.properties__is_initialized = true;
        this.logId = archive.add(this.logId, true);
        this.logId__is_initialized = true;
        Chance chance = (Chance) archive.add((Archive) this.chance, true, (Class<Archive>) Chance.class);
        this.chance = chance;
        this.chance__is_initialized = true;
        this.nativeObject = init(this.placeId, this.title, this.address, this.actions, this.creatives, this.disclaimers, this.icons, this.images, this.properties, this.logId, chance);
    }

    public BillboardObjectMetadata() {
        this.placeId__is_initialized = false;
        this.title__is_initialized = false;
        this.address__is_initialized = false;
        this.actions__is_initialized = false;
        this.creatives__is_initialized = false;
        this.disclaimers__is_initialized = false;
        this.icons__is_initialized = false;
        this.images__is_initialized = false;
        this.properties__is_initialized = false;
        this.logId__is_initialized = false;
        this.chance__is_initialized = false;
    }

    private BillboardObjectMetadata(NativeObject nativeObject) {
        this.placeId__is_initialized = false;
        this.title__is_initialized = false;
        this.address__is_initialized = false;
        this.actions__is_initialized = false;
        this.creatives__is_initialized = false;
        this.disclaimers__is_initialized = false;
        this.icons__is_initialized = false;
        this.images__is_initialized = false;
        this.properties__is_initialized = false;
        this.logId__is_initialized = false;
        this.chance__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
