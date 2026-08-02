package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import java.util.List;

/* loaded from: classes15.dex */
public class CardHints implements Serializable {
    private NativeObject nativeObject;
    private List<String> promoBadgeFeature;
    private boolean promoBadgeFeature__is_initialized;
    private boolean showAddPhotoButton;
    private boolean showAddPhotoButton__is_initialized;
    private boolean showClaimOrganization;
    private boolean showClaimOrganization__is_initialized;
    private boolean showCourierButton;
    private boolean showCourierButton__is_initialized;
    private boolean showFeedbackButton;
    private boolean showFeedbackButton__is_initialized;
    private boolean showFriendsLiked;
    private boolean showFriendsLiked__is_initialized;
    private boolean showReviews;
    private boolean showReviews__is_initialized;
    private boolean showTaxiButton;
    private boolean showTaxiButton__is_initialized;

    public CardHints(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<String> list, boolean z7) {
        this.showClaimOrganization__is_initialized = false;
        this.showTaxiButton__is_initialized = false;
        this.showFeedbackButton__is_initialized = false;
        this.showReviews__is_initialized = false;
        this.showAddPhotoButton__is_initialized = false;
        this.showFriendsLiked__is_initialized = false;
        this.promoBadgeFeature__is_initialized = false;
        this.showCourierButton__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"promoBadgeFeature\" cannot be null");
            throw null;
        }
        this.nativeObject = init(z, z2, z3, z4, z5, z6, list, z7);
        this.showClaimOrganization = z;
        this.showClaimOrganization__is_initialized = true;
        this.showTaxiButton = z2;
        this.showTaxiButton__is_initialized = true;
        this.showFeedbackButton = z3;
        this.showFeedbackButton__is_initialized = true;
        this.showReviews = z4;
        this.showReviews__is_initialized = true;
        this.showAddPhotoButton = z5;
        this.showAddPhotoButton__is_initialized = true;
        this.showFriendsLiked = z6;
        this.showFriendsLiked__is_initialized = true;
        this.promoBadgeFeature = list;
        this.promoBadgeFeature__is_initialized = true;
        this.showCourierButton = z7;
        this.showCourierButton__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::CardHints";
    }

    private native List<String> getPromoBadgeFeature__Native();

    private native boolean getShowAddPhotoButton__Native();

    private native boolean getShowClaimOrganization__Native();

    private native boolean getShowCourierButton__Native();

    private native boolean getShowFeedbackButton__Native();

    private native boolean getShowFriendsLiked__Native();

    private native boolean getShowReviews__Native();

    private native boolean getShowTaxiButton__Native();

    private native NativeObject init(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<String> list, boolean z7);

    public synchronized List<String> getPromoBadgeFeature() {
        try {
            if (!this.promoBadgeFeature__is_initialized) {
                this.promoBadgeFeature = getPromoBadgeFeature__Native();
                this.promoBadgeFeature__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.promoBadgeFeature;
    }

    public synchronized boolean getShowAddPhotoButton() {
        try {
            if (!this.showAddPhotoButton__is_initialized) {
                this.showAddPhotoButton = getShowAddPhotoButton__Native();
                this.showAddPhotoButton__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showAddPhotoButton;
    }

    public synchronized boolean getShowClaimOrganization() {
        try {
            if (!this.showClaimOrganization__is_initialized) {
                this.showClaimOrganization = getShowClaimOrganization__Native();
                this.showClaimOrganization__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showClaimOrganization;
    }

    public synchronized boolean getShowCourierButton() {
        try {
            if (!this.showCourierButton__is_initialized) {
                this.showCourierButton = getShowCourierButton__Native();
                this.showCourierButton__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showCourierButton;
    }

    public synchronized boolean getShowFeedbackButton() {
        try {
            if (!this.showFeedbackButton__is_initialized) {
                this.showFeedbackButton = getShowFeedbackButton__Native();
                this.showFeedbackButton__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showFeedbackButton;
    }

    public synchronized boolean getShowFriendsLiked() {
        try {
            if (!this.showFriendsLiked__is_initialized) {
                this.showFriendsLiked = getShowFriendsLiked__Native();
                this.showFriendsLiked__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showFriendsLiked;
    }

    public synchronized boolean getShowReviews() {
        try {
            if (!this.showReviews__is_initialized) {
                this.showReviews = getShowReviews__Native();
                this.showReviews__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showReviews;
    }

    public synchronized boolean getShowTaxiButton() {
        try {
            if (!this.showTaxiButton__is_initialized) {
                this.showTaxiButton = getShowTaxiButton__Native();
                this.showTaxiButton__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showTaxiButton;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getShowClaimOrganization());
            archive.add(getShowTaxiButton());
            archive.add(getShowFeedbackButton());
            archive.add(getShowReviews());
            archive.add(getShowAddPhotoButton());
            archive.add(getShowFriendsLiked());
            archive.add((List) getPromoBadgeFeature(), false, (ArchivingHandler) new StringHandler());
            archive.add(getShowCourierButton());
            return;
        }
        this.showClaimOrganization = archive.add(this.showClaimOrganization);
        this.showClaimOrganization__is_initialized = true;
        this.showTaxiButton = archive.add(this.showTaxiButton);
        this.showTaxiButton__is_initialized = true;
        this.showFeedbackButton = archive.add(this.showFeedbackButton);
        this.showFeedbackButton__is_initialized = true;
        this.showReviews = archive.add(this.showReviews);
        this.showReviews__is_initialized = true;
        this.showAddPhotoButton = archive.add(this.showAddPhotoButton);
        this.showAddPhotoButton__is_initialized = true;
        this.showFriendsLiked = archive.add(this.showFriendsLiked);
        this.showFriendsLiked__is_initialized = true;
        this.promoBadgeFeature = nnm.o(archive, this.promoBadgeFeature, false);
        this.promoBadgeFeature__is_initialized = true;
        boolean add = archive.add(this.showCourierButton);
        this.showCourierButton = add;
        this.showCourierButton__is_initialized = true;
        this.nativeObject = init(this.showClaimOrganization, this.showTaxiButton, this.showFeedbackButton, this.showReviews, this.showAddPhotoButton, this.showFriendsLiked, this.promoBadgeFeature, add);
    }

    public CardHints() {
        this.showClaimOrganization__is_initialized = false;
        this.showTaxiButton__is_initialized = false;
        this.showFeedbackButton__is_initialized = false;
        this.showReviews__is_initialized = false;
        this.showAddPhotoButton__is_initialized = false;
        this.showFriendsLiked__is_initialized = false;
        this.promoBadgeFeature__is_initialized = false;
        this.showCourierButton__is_initialized = false;
    }

    private CardHints(NativeObject nativeObject) {
        this.showClaimOrganization__is_initialized = false;
        this.showTaxiButton__is_initialized = false;
        this.showFeedbackButton__is_initialized = false;
        this.showReviews__is_initialized = false;
        this.showAddPhotoButton__is_initialized = false;
        this.showFriendsLiked__is_initialized = false;
        this.promoBadgeFeature__is_initialized = false;
        this.showCourierButton__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
