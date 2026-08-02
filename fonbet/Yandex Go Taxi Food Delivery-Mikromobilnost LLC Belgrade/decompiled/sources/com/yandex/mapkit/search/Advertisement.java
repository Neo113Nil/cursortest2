package com.yandex.mapkit.search;

import com.yandex.mapkit.Image;
import com.yandex.mapkit.Money;
import com.yandex.runtime.KeyValuePair;
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
public class Advertisement implements Serializable {
    private String about;
    private boolean about__is_initialized;
    private List<Action> actions;
    private boolean actions__is_initialized;
    private boolean highlighted;
    private boolean highlighted__is_initialized;
    private List<Icon> icons;
    private boolean icons__is_initialized;
    private List<Image> images;
    private boolean images__is_initialized;
    private String logId;
    private boolean logId__is_initialized;
    private String logInfo;
    private boolean logInfo__is_initialized;
    private AdvertImage logo;
    private boolean logo__is_initialized;
    private NativeObject nativeObject;
    private OrdInfo ordInfo;
    private boolean ordInfo__is_initialized;
    private OrdToken ordToken;
    private boolean ordToken__is_initialized;
    private AdvertImage photo;
    private boolean photo__is_initialized;
    private List<Product> products;
    private boolean products__is_initialized;
    private Promo promo;
    private boolean promo__is_initialized;
    private List<KeyValuePair> properties;
    private boolean properties__is_initialized;
    private TextData textData;
    private boolean textData__is_initialized;

    public Advertisement(TextData textData, Promo promo, List<Product> list, String str, AdvertImage advertImage, AdvertImage advertImage2, List<Image> list2, List<Action> list3, String str2, List<KeyValuePair> list4, List<Icon> list5, boolean z, OrdInfo ordInfo, OrdToken ordToken, String str3) {
        this.textData__is_initialized = false;
        this.promo__is_initialized = false;
        this.products__is_initialized = false;
        this.about__is_initialized = false;
        this.logo__is_initialized = false;
        this.photo__is_initialized = false;
        this.images__is_initialized = false;
        this.actions__is_initialized = false;
        this.logId__is_initialized = false;
        this.properties__is_initialized = false;
        this.icons__is_initialized = false;
        this.highlighted__is_initialized = false;
        this.ordInfo__is_initialized = false;
        this.ordToken__is_initialized = false;
        this.logInfo__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"products\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"images\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"actions\" cannot be null");
            throw null;
        }
        if (list4 == null) {
            ny61.g("Required field \"properties\" cannot be null");
            throw null;
        }
        if (list5 == null) {
            ny61.g("Required field \"icons\" cannot be null");
            throw null;
        }
        this.nativeObject = init(textData, promo, list, str, advertImage, advertImage2, list2, list3, str2, list4, list5, z, ordInfo, ordToken, str3);
        this.textData = textData;
        this.textData__is_initialized = true;
        this.promo = promo;
        this.promo__is_initialized = true;
        this.products = list;
        this.products__is_initialized = true;
        this.about = str;
        this.about__is_initialized = true;
        this.logo = advertImage;
        this.logo__is_initialized = true;
        this.photo = advertImage2;
        this.photo__is_initialized = true;
        this.images = list2;
        this.images__is_initialized = true;
        this.actions = list3;
        this.actions__is_initialized = true;
        this.logId = str2;
        this.logId__is_initialized = true;
        this.properties = list4;
        this.properties__is_initialized = true;
        this.icons = list5;
        this.icons__is_initialized = true;
        this.highlighted = z;
        this.highlighted__is_initialized = true;
        this.ordInfo = ordInfo;
        this.ordInfo__is_initialized = true;
        this.ordToken = ordToken;
        this.ordToken__is_initialized = true;
        this.logInfo = str3;
        this.logInfo__is_initialized = true;
    }

    private native String getAbout__Native();

    private native List<Action> getActions__Native();

    private native boolean getHighlighted__Native();

    private native List<Icon> getIcons__Native();

    private native List<Image> getImages__Native();

    private native String getLogId__Native();

    private native String getLogInfo__Native();

    private native AdvertImage getLogo__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Advertisement";
    }

    private native OrdInfo getOrdInfo__Native();

    private native OrdToken getOrdToken__Native();

    private native AdvertImage getPhoto__Native();

    private native List<Product> getProducts__Native();

    private native Promo getPromo__Native();

    private native List<KeyValuePair> getProperties__Native();

    private native TextData getTextData__Native();

    private native NativeObject init(TextData textData, Promo promo, List<Product> list, String str, AdvertImage advertImage, AdvertImage advertImage2, List<Image> list2, List<Action> list3, String str2, List<KeyValuePair> list4, List<Icon> list5, boolean z, OrdInfo ordInfo, OrdToken ordToken, String str3);

    public synchronized String getAbout() {
        try {
            if (!this.about__is_initialized) {
                this.about = getAbout__Native();
                this.about__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.about;
    }

    public synchronized List<Action> getActions() {
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

    public synchronized boolean getHighlighted() {
        try {
            if (!this.highlighted__is_initialized) {
                this.highlighted = getHighlighted__Native();
                this.highlighted__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.highlighted;
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

    public synchronized String getLogInfo() {
        try {
            if (!this.logInfo__is_initialized) {
                this.logInfo = getLogInfo__Native();
                this.logInfo__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.logInfo;
    }

    public synchronized AdvertImage getLogo() {
        try {
            if (!this.logo__is_initialized) {
                this.logo = getLogo__Native();
                this.logo__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.logo;
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

    public synchronized OrdToken getOrdToken() {
        try {
            if (!this.ordToken__is_initialized) {
                this.ordToken = getOrdToken__Native();
                this.ordToken__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ordToken;
    }

    public synchronized AdvertImage getPhoto() {
        try {
            if (!this.photo__is_initialized) {
                this.photo = getPhoto__Native();
                this.photo__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.photo;
    }

    public synchronized List<Product> getProducts() {
        try {
            if (!this.products__is_initialized) {
                this.products = getProducts__Native();
                this.products__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.products;
    }

    public synchronized Promo getPromo() {
        try {
            if (!this.promo__is_initialized) {
                this.promo = getPromo__Native();
                this.promo__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.promo;
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

    public synchronized TextData getTextData() {
        try {
            if (!this.textData__is_initialized) {
                this.textData = getTextData__Native();
                this.textData__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.textData;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getTextData(), true, (Class<Archive>) TextData.class);
            archive.add((Archive) getPromo(), true, (Class<Archive>) Promo.class);
            archive.add((List) getProducts(), false, (ArchivingHandler) new ClassHandler(Product.class));
            archive.add(getAbout(), true);
            archive.add((Archive) getLogo(), true, (Class<Archive>) AdvertImage.class);
            archive.add((Archive) getPhoto(), true, (Class<Archive>) AdvertImage.class);
            archive.add((List) getImages(), false, (ArchivingHandler) new ClassHandler(Image.class));
            archive.add((List) getActions(), false, (ArchivingHandler) new ClassHandler(Action.class));
            archive.add(getLogId(), true);
            archive.add((List) getProperties(), false, (ArchivingHandler) new ClassHandler(KeyValuePair.class));
            archive.add((List) getIcons(), false, (ArchivingHandler) new ClassHandler(Icon.class));
            archive.add(getHighlighted());
            archive.add((Archive) getOrdInfo(), true, (Class<Archive>) OrdInfo.class);
            archive.add((Archive) getOrdToken(), true, (Class<Archive>) OrdToken.class);
            archive.add(getLogInfo(), true);
            return;
        }
        this.textData = (TextData) archive.add((Archive) this.textData, true, (Class<Archive>) TextData.class);
        this.textData__is_initialized = true;
        this.promo = (Promo) archive.add((Archive) this.promo, true, (Class<Archive>) Promo.class);
        this.promo__is_initialized = true;
        this.products = nzs.e(Product.class, archive, this.products, false);
        this.products__is_initialized = true;
        this.about = archive.add(this.about, true);
        this.about__is_initialized = true;
        this.logo = (AdvertImage) archive.add((Archive) this.logo, true, (Class<Archive>) AdvertImage.class);
        this.logo__is_initialized = true;
        this.photo = (AdvertImage) archive.add((Archive) this.photo, true, (Class<Archive>) AdvertImage.class);
        this.photo__is_initialized = true;
        this.images = nzs.e(Image.class, archive, this.images, false);
        this.images__is_initialized = true;
        this.actions = nzs.e(Action.class, archive, this.actions, false);
        this.actions__is_initialized = true;
        this.logId = archive.add(this.logId, true);
        this.logId__is_initialized = true;
        this.properties = nzs.e(KeyValuePair.class, archive, this.properties, false);
        this.properties__is_initialized = true;
        this.icons = nzs.e(Icon.class, archive, this.icons, false);
        this.icons__is_initialized = true;
        this.highlighted = archive.add(this.highlighted);
        this.highlighted__is_initialized = true;
        this.ordInfo = (OrdInfo) archive.add((Archive) this.ordInfo, true, (Class<Archive>) OrdInfo.class);
        this.ordInfo__is_initialized = true;
        this.ordToken = (OrdToken) archive.add((Archive) this.ordToken, true, (Class<Archive>) OrdToken.class);
        this.ordToken__is_initialized = true;
        String add = archive.add(this.logInfo, true);
        this.logInfo = add;
        this.logInfo__is_initialized = true;
        this.nativeObject = init(this.textData, this.promo, this.products, this.about, this.logo, this.photo, this.images, this.actions, this.logId, this.properties, this.icons, this.highlighted, this.ordInfo, this.ordToken, add);
    }

    public static class Link implements Serializable {
        private String type;
        private String uri;

        public Link(String str, String str2) {
            if (str2 == null) {
                ny61.g("Required field \"uri\" cannot be null");
                throw null;
            }
            this.type = str;
            this.uri = str2;
        }

        public String getType() {
            return this.type;
        }

        public String getUri() {
            return this.uri;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.type = archive.add(this.type, true);
            this.uri = archive.add(this.uri, false);
        }

        public Link() {
        }
    }

    public static class Product implements Serializable {
        private NativeObject nativeObject;
        private OrdToken ordToken;
        private boolean ordToken__is_initialized;
        private AdvertImage photo;
        private boolean photo__is_initialized;
        private Money price;
        private boolean price__is_initialized;
        private String title;
        private boolean title__is_initialized;
        private String url;
        private boolean url__is_initialized;

        public Product(String str, String str2, AdvertImage advertImage, Money money, OrdToken ordToken) {
            this.title__is_initialized = false;
            this.url__is_initialized = false;
            this.photo__is_initialized = false;
            this.price__is_initialized = false;
            this.ordToken__is_initialized = false;
            this.nativeObject = init(str, str2, advertImage, money, ordToken);
            this.title = str;
            this.title__is_initialized = true;
            this.url = str2;
            this.url__is_initialized = true;
            this.photo = advertImage;
            this.photo__is_initialized = true;
            this.price = money;
            this.price__is_initialized = true;
            this.ordToken = ordToken;
            this.ordToken__is_initialized = true;
        }

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::Advertisement::Product";
        }

        private native OrdToken getOrdToken__Native();

        private native AdvertImage getPhoto__Native();

        private native Money getPrice__Native();

        private native String getTitle__Native();

        private native String getUrl__Native();

        private native NativeObject init(String str, String str2, AdvertImage advertImage, Money money, OrdToken ordToken);

        public synchronized OrdToken getOrdToken() {
            try {
                if (!this.ordToken__is_initialized) {
                    this.ordToken = getOrdToken__Native();
                    this.ordToken__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.ordToken;
        }

        public synchronized AdvertImage getPhoto() {
            try {
                if (!this.photo__is_initialized) {
                    this.photo = getPhoto__Native();
                    this.photo__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.photo;
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
                archive.add(getTitle(), true);
                archive.add(getUrl(), true);
                archive.add((Archive) getPhoto(), true, (Class<Archive>) AdvertImage.class);
                archive.add((Archive) getPrice(), true, (Class<Archive>) Money.class);
                archive.add((Archive) getOrdToken(), true, (Class<Archive>) OrdToken.class);
                return;
            }
            this.title = archive.add(this.title, true);
            this.title__is_initialized = true;
            this.url = archive.add(this.url, true);
            this.url__is_initialized = true;
            this.photo = (AdvertImage) archive.add((Archive) this.photo, true, (Class<Archive>) AdvertImage.class);
            this.photo__is_initialized = true;
            this.price = (Money) archive.add((Archive) this.price, true, (Class<Archive>) Money.class);
            this.price__is_initialized = true;
            OrdToken ordToken = (OrdToken) archive.add((Archive) this.ordToken, true, (Class<Archive>) OrdToken.class);
            this.ordToken = ordToken;
            this.ordToken__is_initialized = true;
            this.nativeObject = init(this.title, this.url, this.photo, this.price, ordToken);
        }

        public Product() {
            this.title__is_initialized = false;
            this.url__is_initialized = false;
            this.photo__is_initialized = false;
            this.price__is_initialized = false;
            this.ordToken__is_initialized = false;
        }

        private Product(NativeObject nativeObject) {
            this.title__is_initialized = false;
            this.url__is_initialized = false;
            this.photo__is_initialized = false;
            this.price__is_initialized = false;
            this.ordToken__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public static class TextData implements Serializable {
        private List<String> disclaimers;
        private boolean disclaimers__is_initialized;
        private NativeObject nativeObject;
        private String text;
        private boolean text__is_initialized;
        private String title;
        private boolean title__is_initialized;
        private String url;
        private boolean url__is_initialized;

        public TextData(String str, String str2, List<String> list, String str3) {
            this.title__is_initialized = false;
            this.text__is_initialized = false;
            this.disclaimers__is_initialized = false;
            this.url__is_initialized = false;
            if (list == null) {
                ny61.g("Required field \"disclaimers\" cannot be null");
                throw null;
            }
            this.nativeObject = init(str, str2, list, str3);
            this.title = str;
            this.title__is_initialized = true;
            this.text = str2;
            this.text__is_initialized = true;
            this.disclaimers = list;
            this.disclaimers__is_initialized = true;
            this.url = str3;
            this.url__is_initialized = true;
        }

        private native List<String> getDisclaimers__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::Advertisement::TextData";
        }

        private native String getText__Native();

        private native String getTitle__Native();

        private native String getUrl__Native();

        private native NativeObject init(String str, String str2, List<String> list, String str3);

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
                archive.add(getTitle(), true);
                archive.add(getText(), true);
                archive.add((List) getDisclaimers(), false, (ArchivingHandler) new StringHandler());
                archive.add(getUrl(), true);
                return;
            }
            this.title = archive.add(this.title, true);
            this.title__is_initialized = true;
            this.text = archive.add(this.text, true);
            this.text__is_initialized = true;
            this.disclaimers = nnm.o(archive, this.disclaimers, false);
            this.disclaimers__is_initialized = true;
            String add = archive.add(this.url, true);
            this.url = add;
            this.url__is_initialized = true;
            this.nativeObject = init(this.title, this.text, this.disclaimers, add);
        }

        public TextData() {
            this.title__is_initialized = false;
            this.text__is_initialized = false;
            this.disclaimers__is_initialized = false;
            this.url__is_initialized = false;
        }

        private TextData(NativeObject nativeObject) {
            this.title__is_initialized = false;
            this.text__is_initialized = false;
            this.disclaimers__is_initialized = false;
            this.url__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public static class Promo implements Serializable {
        private AdvertImage banner;
        private boolean banner__is_initialized;
        private String details;
        private boolean details__is_initialized;
        private List<String> disclaimers;
        private boolean disclaimers__is_initialized;
        private String fullDisclaimer;
        private boolean fullDisclaimer__is_initialized;
        private NativeObject nativeObject;
        private OrdToken ordToken;
        private boolean ordToken__is_initialized;
        private String title;
        private boolean title__is_initialized;
        private String url;
        private boolean url__is_initialized;

        public Promo(String str, String str2, List<String> list, String str3, AdvertImage advertImage, String str4, OrdToken ordToken) {
            this.title__is_initialized = false;
            this.details__is_initialized = false;
            this.disclaimers__is_initialized = false;
            this.url__is_initialized = false;
            this.banner__is_initialized = false;
            this.fullDisclaimer__is_initialized = false;
            this.ordToken__is_initialized = false;
            if (list == null) {
                ny61.g("Required field \"disclaimers\" cannot be null");
                throw null;
            }
            this.nativeObject = init(str, str2, list, str3, advertImage, str4, ordToken);
            this.title = str;
            this.title__is_initialized = true;
            this.details = str2;
            this.details__is_initialized = true;
            this.disclaimers = list;
            this.disclaimers__is_initialized = true;
            this.url = str3;
            this.url__is_initialized = true;
            this.banner = advertImage;
            this.banner__is_initialized = true;
            this.fullDisclaimer = str4;
            this.fullDisclaimer__is_initialized = true;
            this.ordToken = ordToken;
            this.ordToken__is_initialized = true;
        }

        private native AdvertImage getBanner__Native();

        private native String getDetails__Native();

        private native List<String> getDisclaimers__Native();

        private native String getFullDisclaimer__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::Advertisement::Promo";
        }

        private native OrdToken getOrdToken__Native();

        private native String getTitle__Native();

        private native String getUrl__Native();

        private native NativeObject init(String str, String str2, List<String> list, String str3, AdvertImage advertImage, String str4, OrdToken ordToken);

        public synchronized AdvertImage getBanner() {
            try {
                if (!this.banner__is_initialized) {
                    this.banner = getBanner__Native();
                    this.banner__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.banner;
        }

        public synchronized String getDetails() {
            try {
                if (!this.details__is_initialized) {
                    this.details = getDetails__Native();
                    this.details__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.details;
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

        public synchronized String getFullDisclaimer() {
            try {
                if (!this.fullDisclaimer__is_initialized) {
                    this.fullDisclaimer = getFullDisclaimer__Native();
                    this.fullDisclaimer__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.fullDisclaimer;
        }

        public synchronized OrdToken getOrdToken() {
            try {
                if (!this.ordToken__is_initialized) {
                    this.ordToken = getOrdToken__Native();
                    this.ordToken__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.ordToken;
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
                archive.add(getTitle(), true);
                archive.add(getDetails(), true);
                archive.add((List) getDisclaimers(), false, (ArchivingHandler) new StringHandler());
                archive.add(getUrl(), true);
                archive.add((Archive) getBanner(), true, (Class<Archive>) AdvertImage.class);
                archive.add(getFullDisclaimer(), true);
                archive.add((Archive) getOrdToken(), true, (Class<Archive>) OrdToken.class);
                return;
            }
            this.title = archive.add(this.title, true);
            this.title__is_initialized = true;
            this.details = archive.add(this.details, true);
            this.details__is_initialized = true;
            this.disclaimers = nnm.o(archive, this.disclaimers, false);
            this.disclaimers__is_initialized = true;
            this.url = archive.add(this.url, true);
            this.url__is_initialized = true;
            this.banner = (AdvertImage) archive.add((Archive) this.banner, true, (Class<Archive>) AdvertImage.class);
            this.banner__is_initialized = true;
            this.fullDisclaimer = archive.add(this.fullDisclaimer, true);
            this.fullDisclaimer__is_initialized = true;
            OrdToken ordToken = (OrdToken) archive.add((Archive) this.ordToken, true, (Class<Archive>) OrdToken.class);
            this.ordToken = ordToken;
            this.ordToken__is_initialized = true;
            this.nativeObject = init(this.title, this.details, this.disclaimers, this.url, this.banner, this.fullDisclaimer, ordToken);
        }

        public Promo() {
            this.title__is_initialized = false;
            this.details__is_initialized = false;
            this.disclaimers__is_initialized = false;
            this.url__is_initialized = false;
            this.banner__is_initialized = false;
            this.fullDisclaimer__is_initialized = false;
            this.ordToken__is_initialized = false;
        }

        private Promo(NativeObject nativeObject) {
            this.title__is_initialized = false;
            this.details__is_initialized = false;
            this.disclaimers__is_initialized = false;
            this.url__is_initialized = false;
            this.banner__is_initialized = false;
            this.fullDisclaimer__is_initialized = false;
            this.ordToken__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public Advertisement() {
        this.textData__is_initialized = false;
        this.promo__is_initialized = false;
        this.products__is_initialized = false;
        this.about__is_initialized = false;
        this.logo__is_initialized = false;
        this.photo__is_initialized = false;
        this.images__is_initialized = false;
        this.actions__is_initialized = false;
        this.logId__is_initialized = false;
        this.properties__is_initialized = false;
        this.icons__is_initialized = false;
        this.highlighted__is_initialized = false;
        this.ordInfo__is_initialized = false;
        this.ordToken__is_initialized = false;
        this.logInfo__is_initialized = false;
    }

    private Advertisement(NativeObject nativeObject) {
        this.textData__is_initialized = false;
        this.promo__is_initialized = false;
        this.products__is_initialized = false;
        this.about__is_initialized = false;
        this.logo__is_initialized = false;
        this.photo__is_initialized = false;
        this.images__is_initialized = false;
        this.actions__is_initialized = false;
        this.logId__is_initialized = false;
        this.properties__is_initialized = false;
        this.icons__is_initialized = false;
        this.highlighted__is_initialized = false;
        this.ordInfo__is_initialized = false;
        this.ordToken__is_initialized = false;
        this.logInfo__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
