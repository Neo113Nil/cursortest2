package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import com.yandex.runtime.bindings.StringHandler;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class SerpHints implements Serializable {
    private List<ActionButton> actionButtons;
    private boolean actionButtons__is_initialized;
    private List<Award> awards;
    private boolean awards__is_initialized;
    private List<GalleryButton> galleryButtons;
    private boolean galleryButtons__is_initialized;
    private List<InfoBlock> infoBlock;
    private boolean infoBlock__is_initialized;
    private NativeObject nativeObject;
    private List<String> promoBadgeFeature;
    private boolean promoBadgeFeature__is_initialized;
    private List<SerpActionButton> serpActionButtons;
    private boolean serpActionButtons__is_initialized;
    private AddressType showAddress;
    private boolean showAddress__is_initialized;
    private boolean showBookmark;
    private boolean showBookmark__is_initialized;
    private CategoryType showCategory;
    private boolean showCategory__is_initialized;
    private boolean showCourierButton;
    private boolean showCourierButton__is_initialized;
    private boolean showDistanceFromTransit;
    private boolean showDistanceFromTransit__is_initialized;
    private boolean showEta;
    private boolean showEta__is_initialized;
    private boolean showFriendsLiked;
    private boolean showFriendsLiked__is_initialized;
    private boolean showGeoproductOffer;
    private boolean showGeoproductOffer__is_initialized;
    private boolean showNeurosummary;
    private boolean showNeurosummary__is_initialized;
    private PhotoType showPhoto;
    private boolean showPhoto__is_initialized;
    private RatingType showRating;
    private boolean showRating__is_initialized;
    private TitleType showTitle;
    private boolean showTitle__is_initialized;
    private boolean showVerified;
    private boolean showVerified__is_initialized;
    private boolean showWorkHours;
    private boolean showWorkHours__is_initialized;
    private boolean showYandexEatsOrderButton;
    private boolean showYandexEatsOrderButton__is_initialized;
    private int shownGoodsNumber;
    private boolean shownGoodsNumber__is_initialized;
    private List<SubtitleHint> subtitleHints;
    private boolean subtitleHints__is_initialized;

    public enum ActionButton {
        MAKE_CALL,
        MAKE_ROUTE,
        OPEN_PRIMARY_URL
    }

    public enum AddressType {
        NO_ADDRESS,
        SHORT_ADDRESS,
        LONG_ADDRESS
    }

    public enum Award {
        GOOD_PLACE,
        GREATLIST,
        ULTIMA
    }

    public enum CategoryType {
        NO_CATEGORY,
        SINGLE_CATEGORY,
        ALL_CATEGORIES
    }

    public enum GalleryButton {
        NONE,
        BOOKING,
        MENU,
        PRICES,
        HOTEL_BOOKING
    }

    public enum PhotoType {
        NO_PHOTO,
        GALLERY,
        LOGO,
        SINGLE_PHOTO
    }

    public enum RatingType {
        NO_RATING,
        FIVE_STAR_RATING,
        NUMERIC_RATING
    }

    public enum TitleType {
        SHORT_TITLE,
        LONG_TITLE
    }

    public SerpHints(TitleType titleType, AddressType addressType, CategoryType categoryType, RatingType ratingType, PhotoType photoType, List<ActionButton> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<GalleryButton> list2, int i, boolean z7, List<SubtitleHint> list3, List<InfoBlock> list4, List<Award> list5, List<String> list6, List<SerpActionButton> list7, boolean z8, boolean z9, boolean z10) {
        this.showTitle__is_initialized = false;
        this.showAddress__is_initialized = false;
        this.showCategory__is_initialized = false;
        this.showRating__is_initialized = false;
        this.showPhoto__is_initialized = false;
        this.actionButtons__is_initialized = false;
        this.showWorkHours__is_initialized = false;
        this.showVerified__is_initialized = false;
        this.showDistanceFromTransit__is_initialized = false;
        this.showBookmark__is_initialized = false;
        this.showEta__is_initialized = false;
        this.showGeoproductOffer__is_initialized = false;
        this.galleryButtons__is_initialized = false;
        this.shownGoodsNumber__is_initialized = false;
        this.showNeurosummary__is_initialized = false;
        this.subtitleHints__is_initialized = false;
        this.infoBlock__is_initialized = false;
        this.awards__is_initialized = false;
        this.promoBadgeFeature__is_initialized = false;
        this.serpActionButtons__is_initialized = false;
        this.showFriendsLiked__is_initialized = false;
        this.showCourierButton__is_initialized = false;
        this.showYandexEatsOrderButton__is_initialized = false;
        if (titleType == null) {
            ny61.g("Required field \"showTitle\" cannot be null");
            throw null;
        }
        if (addressType == null) {
            ny61.g("Required field \"showAddress\" cannot be null");
            throw null;
        }
        if (categoryType == null) {
            ny61.g("Required field \"showCategory\" cannot be null");
            throw null;
        }
        if (ratingType == null) {
            ny61.g("Required field \"showRating\" cannot be null");
            throw null;
        }
        if (photoType == null) {
            ny61.g("Required field \"showPhoto\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"actionButtons\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"galleryButtons\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"subtitleHints\" cannot be null");
            throw null;
        }
        if (list4 == null) {
            ny61.g("Required field \"infoBlock\" cannot be null");
            throw null;
        }
        if (list5 == null) {
            ny61.g("Required field \"awards\" cannot be null");
            throw null;
        }
        if (list6 == null) {
            ny61.g("Required field \"promoBadgeFeature\" cannot be null");
            throw null;
        }
        if (list7 == null) {
            ny61.g("Required field \"serpActionButtons\" cannot be null");
            throw null;
        }
        this.nativeObject = init(titleType, addressType, categoryType, ratingType, photoType, list, z, z2, z3, z4, z5, z6, list2, i, z7, list3, list4, list5, list6, list7, z8, z9, z10);
        this.showTitle = titleType;
        this.showTitle__is_initialized = true;
        this.showAddress = addressType;
        this.showAddress__is_initialized = true;
        this.showCategory = categoryType;
        this.showCategory__is_initialized = true;
        this.showRating = ratingType;
        this.showRating__is_initialized = true;
        this.showPhoto = photoType;
        this.showPhoto__is_initialized = true;
        this.actionButtons = list;
        this.actionButtons__is_initialized = true;
        this.showWorkHours = z;
        this.showWorkHours__is_initialized = true;
        this.showVerified = z2;
        this.showVerified__is_initialized = true;
        this.showDistanceFromTransit = z3;
        this.showDistanceFromTransit__is_initialized = true;
        this.showBookmark = z4;
        this.showBookmark__is_initialized = true;
        this.showEta = z5;
        this.showEta__is_initialized = true;
        this.showGeoproductOffer = z6;
        this.showGeoproductOffer__is_initialized = true;
        this.galleryButtons = list2;
        this.galleryButtons__is_initialized = true;
        this.shownGoodsNumber = i;
        this.shownGoodsNumber__is_initialized = true;
        this.showNeurosummary = z7;
        this.showNeurosummary__is_initialized = true;
        this.subtitleHints = list3;
        this.subtitleHints__is_initialized = true;
        this.infoBlock = list4;
        this.infoBlock__is_initialized = true;
        this.awards = list5;
        this.awards__is_initialized = true;
        this.promoBadgeFeature = list6;
        this.promoBadgeFeature__is_initialized = true;
        this.serpActionButtons = list7;
        this.serpActionButtons__is_initialized = true;
        this.showFriendsLiked = z8;
        this.showFriendsLiked__is_initialized = true;
        this.showCourierButton = z9;
        this.showCourierButton__is_initialized = true;
        this.showYandexEatsOrderButton = z10;
        this.showYandexEatsOrderButton__is_initialized = true;
    }

    private native List<ActionButton> getActionButtons__Native();

    private native List<Award> getAwards__Native();

    private native List<GalleryButton> getGalleryButtons__Native();

    private native List<InfoBlock> getInfoBlock__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SerpHints";
    }

    private native List<String> getPromoBadgeFeature__Native();

    private native List<SerpActionButton> getSerpActionButtons__Native();

    private native AddressType getShowAddress__Native();

    private native boolean getShowBookmark__Native();

    private native CategoryType getShowCategory__Native();

    private native boolean getShowCourierButton__Native();

    private native boolean getShowDistanceFromTransit__Native();

    private native boolean getShowEta__Native();

    private native boolean getShowFriendsLiked__Native();

    private native boolean getShowGeoproductOffer__Native();

    private native boolean getShowNeurosummary__Native();

    private native PhotoType getShowPhoto__Native();

    private native RatingType getShowRating__Native();

    private native TitleType getShowTitle__Native();

    private native boolean getShowVerified__Native();

    private native boolean getShowWorkHours__Native();

    private native boolean getShowYandexEatsOrderButton__Native();

    private native int getShownGoodsNumber__Native();

    private native List<SubtitleHint> getSubtitleHints__Native();

    private native NativeObject init(TitleType titleType, AddressType addressType, CategoryType categoryType, RatingType ratingType, PhotoType photoType, List<ActionButton> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List<GalleryButton> list2, int i, boolean z7, List<SubtitleHint> list3, List<InfoBlock> list4, List<Award> list5, List<String> list6, List<SerpActionButton> list7, boolean z8, boolean z9, boolean z10);

    public synchronized List<ActionButton> getActionButtons() {
        try {
            if (!this.actionButtons__is_initialized) {
                this.actionButtons = getActionButtons__Native();
                this.actionButtons__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.actionButtons;
    }

    public synchronized List<Award> getAwards() {
        try {
            if (!this.awards__is_initialized) {
                this.awards = getAwards__Native();
                this.awards__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.awards;
    }

    public synchronized List<GalleryButton> getGalleryButtons() {
        try {
            if (!this.galleryButtons__is_initialized) {
                this.galleryButtons = getGalleryButtons__Native();
                this.galleryButtons__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.galleryButtons;
    }

    public synchronized List<InfoBlock> getInfoBlock() {
        try {
            if (!this.infoBlock__is_initialized) {
                this.infoBlock = getInfoBlock__Native();
                this.infoBlock__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.infoBlock;
    }

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

    public synchronized List<SerpActionButton> getSerpActionButtons() {
        try {
            if (!this.serpActionButtons__is_initialized) {
                this.serpActionButtons = getSerpActionButtons__Native();
                this.serpActionButtons__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.serpActionButtons;
    }

    public synchronized AddressType getShowAddress() {
        try {
            if (!this.showAddress__is_initialized) {
                this.showAddress = getShowAddress__Native();
                this.showAddress__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showAddress;
    }

    public synchronized boolean getShowBookmark() {
        try {
            if (!this.showBookmark__is_initialized) {
                this.showBookmark = getShowBookmark__Native();
                this.showBookmark__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showBookmark;
    }

    public synchronized CategoryType getShowCategory() {
        try {
            if (!this.showCategory__is_initialized) {
                this.showCategory = getShowCategory__Native();
                this.showCategory__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showCategory;
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

    public synchronized boolean getShowDistanceFromTransit() {
        try {
            if (!this.showDistanceFromTransit__is_initialized) {
                this.showDistanceFromTransit = getShowDistanceFromTransit__Native();
                this.showDistanceFromTransit__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showDistanceFromTransit;
    }

    public synchronized boolean getShowEta() {
        try {
            if (!this.showEta__is_initialized) {
                this.showEta = getShowEta__Native();
                this.showEta__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showEta;
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

    public synchronized boolean getShowGeoproductOffer() {
        try {
            if (!this.showGeoproductOffer__is_initialized) {
                this.showGeoproductOffer = getShowGeoproductOffer__Native();
                this.showGeoproductOffer__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showGeoproductOffer;
    }

    public synchronized boolean getShowNeurosummary() {
        try {
            if (!this.showNeurosummary__is_initialized) {
                this.showNeurosummary = getShowNeurosummary__Native();
                this.showNeurosummary__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showNeurosummary;
    }

    public synchronized PhotoType getShowPhoto() {
        try {
            if (!this.showPhoto__is_initialized) {
                this.showPhoto = getShowPhoto__Native();
                this.showPhoto__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showPhoto;
    }

    public synchronized RatingType getShowRating() {
        try {
            if (!this.showRating__is_initialized) {
                this.showRating = getShowRating__Native();
                this.showRating__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showRating;
    }

    public synchronized TitleType getShowTitle() {
        try {
            if (!this.showTitle__is_initialized) {
                this.showTitle = getShowTitle__Native();
                this.showTitle__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showTitle;
    }

    public synchronized boolean getShowVerified() {
        try {
            if (!this.showVerified__is_initialized) {
                this.showVerified = getShowVerified__Native();
                this.showVerified__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showVerified;
    }

    public synchronized boolean getShowWorkHours() {
        try {
            if (!this.showWorkHours__is_initialized) {
                this.showWorkHours = getShowWorkHours__Native();
                this.showWorkHours__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showWorkHours;
    }

    public synchronized boolean getShowYandexEatsOrderButton() {
        try {
            if (!this.showYandexEatsOrderButton__is_initialized) {
                this.showYandexEatsOrderButton = getShowYandexEatsOrderButton__Native();
                this.showYandexEatsOrderButton__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.showYandexEatsOrderButton;
    }

    public synchronized int getShownGoodsNumber() {
        try {
            if (!this.shownGoodsNumber__is_initialized) {
                this.shownGoodsNumber = getShownGoodsNumber__Native();
                this.shownGoodsNumber__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.shownGoodsNumber;
    }

    public synchronized List<SubtitleHint> getSubtitleHints() {
        try {
            if (!this.subtitleHints__is_initialized) {
                this.subtitleHints = getSubtitleHints__Native();
                this.subtitleHints__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.subtitleHints;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getShowTitle(), false, (Class<Archive>) TitleType.class);
            archive.add((Archive) getShowAddress(), false, (Class<Archive>) AddressType.class);
            archive.add((Archive) getShowCategory(), false, (Class<Archive>) CategoryType.class);
            archive.add((Archive) getShowRating(), false, (Class<Archive>) RatingType.class);
            archive.add((Archive) getShowPhoto(), false, (Class<Archive>) PhotoType.class);
            archive.add((List) getActionButtons(), false, (ArchivingHandler) new EnumHandler(ActionButton.class));
            archive.add(getShowWorkHours());
            archive.add(getShowVerified());
            archive.add(getShowDistanceFromTransit());
            archive.add(getShowBookmark());
            archive.add(getShowEta());
            archive.add(getShowGeoproductOffer());
            archive.add((List) getGalleryButtons(), false, (ArchivingHandler) new EnumHandler(GalleryButton.class));
            archive.add(getShownGoodsNumber());
            archive.add(getShowNeurosummary());
            archive.add((List) getSubtitleHints(), false, (ArchivingHandler) new ClassHandler(SubtitleHint.class));
            archive.add((List) getInfoBlock(), false, (ArchivingHandler) new ClassHandler(InfoBlock.class));
            archive.add((List) getAwards(), false, (ArchivingHandler) new EnumHandler(Award.class));
            archive.add((List) getPromoBadgeFeature(), false, (ArchivingHandler) new StringHandler());
            archive.add((List) getSerpActionButtons(), false, (ArchivingHandler) new EnumHandler(SerpActionButton.class));
            archive.add(getShowFriendsLiked());
            archive.add(getShowCourierButton());
            archive.add(getShowYandexEatsOrderButton());
            return;
        }
        this.showTitle = (TitleType) archive.add((Archive) this.showTitle, false, (Class<Archive>) TitleType.class);
        this.showTitle__is_initialized = true;
        this.showAddress = (AddressType) archive.add((Archive) this.showAddress, false, (Class<Archive>) AddressType.class);
        this.showAddress__is_initialized = true;
        this.showCategory = (CategoryType) archive.add((Archive) this.showCategory, false, (Class<Archive>) CategoryType.class);
        this.showCategory__is_initialized = true;
        this.showRating = (RatingType) archive.add((Archive) this.showRating, false, (Class<Archive>) RatingType.class);
        this.showRating__is_initialized = true;
        this.showPhoto = (PhotoType) archive.add((Archive) this.showPhoto, false, (Class<Archive>) PhotoType.class);
        this.showPhoto__is_initialized = true;
        this.actionButtons = archive.add((List) this.actionButtons, false, (ArchivingHandler) new EnumHandler(ActionButton.class));
        this.actionButtons__is_initialized = true;
        this.showWorkHours = archive.add(this.showWorkHours);
        this.showWorkHours__is_initialized = true;
        this.showVerified = archive.add(this.showVerified);
        this.showVerified__is_initialized = true;
        this.showDistanceFromTransit = archive.add(this.showDistanceFromTransit);
        this.showDistanceFromTransit__is_initialized = true;
        this.showBookmark = archive.add(this.showBookmark);
        this.showBookmark__is_initialized = true;
        this.showEta = archive.add(this.showEta);
        this.showEta__is_initialized = true;
        this.showGeoproductOffer = archive.add(this.showGeoproductOffer);
        this.showGeoproductOffer__is_initialized = true;
        this.galleryButtons = archive.add((List) this.galleryButtons, false, (ArchivingHandler) new EnumHandler(GalleryButton.class));
        this.galleryButtons__is_initialized = true;
        this.shownGoodsNumber = archive.add(this.shownGoodsNumber);
        this.shownGoodsNumber__is_initialized = true;
        this.showNeurosummary = archive.add(this.showNeurosummary);
        this.showNeurosummary__is_initialized = true;
        this.subtitleHints = nzs.e(SubtitleHint.class, archive, this.subtitleHints, false);
        this.subtitleHints__is_initialized = true;
        this.infoBlock = nzs.e(InfoBlock.class, archive, this.infoBlock, false);
        this.infoBlock__is_initialized = true;
        this.awards = archive.add((List) this.awards, false, (ArchivingHandler) new EnumHandler(Award.class));
        this.awards__is_initialized = true;
        this.promoBadgeFeature = nnm.o(archive, this.promoBadgeFeature, false);
        this.promoBadgeFeature__is_initialized = true;
        this.serpActionButtons = archive.add((List) this.serpActionButtons, false, (ArchivingHandler) new EnumHandler(SerpActionButton.class));
        this.serpActionButtons__is_initialized = true;
        this.showFriendsLiked = archive.add(this.showFriendsLiked);
        this.showFriendsLiked__is_initialized = true;
        this.showCourierButton = archive.add(this.showCourierButton);
        this.showCourierButton__is_initialized = true;
        boolean add = archive.add(this.showYandexEatsOrderButton);
        this.showYandexEatsOrderButton = add;
        this.showYandexEatsOrderButton__is_initialized = true;
        this.nativeObject = init(this.showTitle, this.showAddress, this.showCategory, this.showRating, this.showPhoto, this.actionButtons, this.showWorkHours, this.showVerified, this.showDistanceFromTransit, this.showBookmark, this.showEta, this.showGeoproductOffer, this.galleryButtons, this.shownGoodsNumber, this.showNeurosummary, this.subtitleHints, this.infoBlock, this.awards, this.promoBadgeFeature, this.serpActionButtons, this.showFriendsLiked, this.showCourierButton, add);
    }

    public SerpHints() {
        this.showTitle__is_initialized = false;
        this.showAddress__is_initialized = false;
        this.showCategory__is_initialized = false;
        this.showRating__is_initialized = false;
        this.showPhoto__is_initialized = false;
        this.actionButtons__is_initialized = false;
        this.showWorkHours__is_initialized = false;
        this.showVerified__is_initialized = false;
        this.showDistanceFromTransit__is_initialized = false;
        this.showBookmark__is_initialized = false;
        this.showEta__is_initialized = false;
        this.showGeoproductOffer__is_initialized = false;
        this.galleryButtons__is_initialized = false;
        this.shownGoodsNumber__is_initialized = false;
        this.showNeurosummary__is_initialized = false;
        this.subtitleHints__is_initialized = false;
        this.infoBlock__is_initialized = false;
        this.awards__is_initialized = false;
        this.promoBadgeFeature__is_initialized = false;
        this.serpActionButtons__is_initialized = false;
        this.showFriendsLiked__is_initialized = false;
        this.showCourierButton__is_initialized = false;
        this.showYandexEatsOrderButton__is_initialized = false;
    }

    private SerpHints(NativeObject nativeObject) {
        this.showTitle__is_initialized = false;
        this.showAddress__is_initialized = false;
        this.showCategory__is_initialized = false;
        this.showRating__is_initialized = false;
        this.showPhoto__is_initialized = false;
        this.actionButtons__is_initialized = false;
        this.showWorkHours__is_initialized = false;
        this.showVerified__is_initialized = false;
        this.showDistanceFromTransit__is_initialized = false;
        this.showBookmark__is_initialized = false;
        this.showEta__is_initialized = false;
        this.showGeoproductOffer__is_initialized = false;
        this.galleryButtons__is_initialized = false;
        this.shownGoodsNumber__is_initialized = false;
        this.showNeurosummary__is_initialized = false;
        this.subtitleHints__is_initialized = false;
        this.infoBlock__is_initialized = false;
        this.awards__is_initialized = false;
        this.promoBadgeFeature__is_initialized = false;
        this.serpActionButtons__is_initialized = false;
        this.showFriendsLiked__is_initialized = false;
        this.showCourierButton__is_initialized = false;
        this.showYandexEatsOrderButton__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
