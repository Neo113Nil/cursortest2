package com.yandex.mapkit.search;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class OrgOfferObjectMetadata implements BaseMetadata, Serializable {
    private OrgOfferImage banner;
    private boolean banner__is_initialized;
    private String buttonText;
    private boolean buttonText__is_initialized;
    private String buttonUrl;
    private boolean buttonUrl__is_initialized;
    private String description;
    private boolean description__is_initialized;
    private String logId;
    private boolean logId__is_initialized;
    private NativeObject nativeObject;
    private OrdInfo ordInfo;
    private boolean ordInfo__is_initialized;
    private OrdToken ordToken;
    private boolean ordToken__is_initialized;
    private OrgOfferImage titleIcon;
    private boolean titleIcon__is_initialized;
    private String titleText;
    private boolean titleText__is_initialized;

    public OrgOfferObjectMetadata(OrgOfferImage orgOfferImage, String str, OrgOfferImage orgOfferImage2, String str2, String str3, String str4, OrdToken ordToken, OrdInfo ordInfo, String str5) {
        this.titleIcon__is_initialized = false;
        this.titleText__is_initialized = false;
        this.banner__is_initialized = false;
        this.description__is_initialized = false;
        this.buttonText__is_initialized = false;
        this.buttonUrl__is_initialized = false;
        this.ordToken__is_initialized = false;
        this.ordInfo__is_initialized = false;
        this.logId__is_initialized = false;
        this.nativeObject = init(orgOfferImage, str, orgOfferImage2, str2, str3, str4, ordToken, ordInfo, str5);
        this.titleIcon = orgOfferImage;
        this.titleIcon__is_initialized = true;
        this.titleText = str;
        this.titleText__is_initialized = true;
        this.banner = orgOfferImage2;
        this.banner__is_initialized = true;
        this.description = str2;
        this.description__is_initialized = true;
        this.buttonText = str3;
        this.buttonText__is_initialized = true;
        this.buttonUrl = str4;
        this.buttonUrl__is_initialized = true;
        this.ordToken = ordToken;
        this.ordToken__is_initialized = true;
        this.ordInfo = ordInfo;
        this.ordInfo__is_initialized = true;
        this.logId = str5;
        this.logId__is_initialized = true;
    }

    private native OrgOfferImage getBanner__Native();

    private native String getButtonText__Native();

    private native String getButtonUrl__Native();

    private native String getDescription__Native();

    private native String getLogId__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::OrgOfferObjectMetadata";
    }

    private native OrdInfo getOrdInfo__Native();

    private native OrdToken getOrdToken__Native();

    private native OrgOfferImage getTitleIcon__Native();

    private native String getTitleText__Native();

    private native NativeObject init(OrgOfferImage orgOfferImage, String str, OrgOfferImage orgOfferImage2, String str2, String str3, String str4, OrdToken ordToken, OrdInfo ordInfo, String str5);

    public synchronized OrgOfferImage getBanner() {
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

    public synchronized String getButtonText() {
        try {
            if (!this.buttonText__is_initialized) {
                this.buttonText = getButtonText__Native();
                this.buttonText__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.buttonText;
    }

    public synchronized String getButtonUrl() {
        try {
            if (!this.buttonUrl__is_initialized) {
                this.buttonUrl = getButtonUrl__Native();
                this.buttonUrl__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.buttonUrl;
    }

    public synchronized String getDescription() {
        try {
            if (!this.description__is_initialized) {
                this.description = getDescription__Native();
                this.description__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.description;
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

    public synchronized OrgOfferImage getTitleIcon() {
        try {
            if (!this.titleIcon__is_initialized) {
                this.titleIcon = getTitleIcon__Native();
                this.titleIcon__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.titleIcon;
    }

    public synchronized String getTitleText() {
        try {
            if (!this.titleText__is_initialized) {
                this.titleText = getTitleText__Native();
                this.titleText__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.titleText;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getTitleIcon(), true, (Class<Archive>) OrgOfferImage.class);
            archive.add(getTitleText(), true);
            archive.add((Archive) getBanner(), true, (Class<Archive>) OrgOfferImage.class);
            archive.add(getDescription(), true);
            archive.add(getButtonText(), true);
            archive.add(getButtonUrl(), true);
            archive.add((Archive) getOrdToken(), true, (Class<Archive>) OrdToken.class);
            archive.add((Archive) getOrdInfo(), true, (Class<Archive>) OrdInfo.class);
            archive.add(getLogId(), true);
            return;
        }
        this.titleIcon = (OrgOfferImage) archive.add((Archive) this.titleIcon, true, (Class<Archive>) OrgOfferImage.class);
        this.titleIcon__is_initialized = true;
        this.titleText = archive.add(this.titleText, true);
        this.titleText__is_initialized = true;
        this.banner = (OrgOfferImage) archive.add((Archive) this.banner, true, (Class<Archive>) OrgOfferImage.class);
        this.banner__is_initialized = true;
        this.description = archive.add(this.description, true);
        this.description__is_initialized = true;
        this.buttonText = archive.add(this.buttonText, true);
        this.buttonText__is_initialized = true;
        this.buttonUrl = archive.add(this.buttonUrl, true);
        this.buttonUrl__is_initialized = true;
        this.ordToken = (OrdToken) archive.add((Archive) this.ordToken, true, (Class<Archive>) OrdToken.class);
        this.ordToken__is_initialized = true;
        this.ordInfo = (OrdInfo) archive.add((Archive) this.ordInfo, true, (Class<Archive>) OrdInfo.class);
        this.ordInfo__is_initialized = true;
        String add = archive.add(this.logId, true);
        this.logId = add;
        this.logId__is_initialized = true;
        this.nativeObject = init(this.titleIcon, this.titleText, this.banner, this.description, this.buttonText, this.buttonUrl, this.ordToken, this.ordInfo, add);
    }

    public OrgOfferObjectMetadata() {
        this.titleIcon__is_initialized = false;
        this.titleText__is_initialized = false;
        this.banner__is_initialized = false;
        this.description__is_initialized = false;
        this.buttonText__is_initialized = false;
        this.buttonUrl__is_initialized = false;
        this.ordToken__is_initialized = false;
        this.ordInfo__is_initialized = false;
        this.logId__is_initialized = false;
    }

    private OrgOfferObjectMetadata(NativeObject nativeObject) {
        this.titleIcon__is_initialized = false;
        this.titleText__is_initialized = false;
        this.banner__is_initialized = false;
        this.description__is_initialized = false;
        this.buttonText__is_initialized = false;
        this.buttonUrl__is_initialized = false;
        this.ordToken__is_initialized = false;
        this.ordInfo__is_initialized = false;
        this.logId__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
