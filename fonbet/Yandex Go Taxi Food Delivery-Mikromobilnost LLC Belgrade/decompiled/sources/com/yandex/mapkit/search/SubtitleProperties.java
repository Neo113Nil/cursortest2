package com.yandex.mapkit.search;

import com.yandex.mapkit.Money;
import com.yandex.mapkit.Time;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class SubtitleProperties implements Serializable {
    private NativeObject nativeObject;
    private NextMovieSubtitle nextMovie;
    private boolean nextMovie__is_initialized;
    private PriceSubtitle price;
    private boolean price__is_initialized;
    private SocialSubtitle social;
    private boolean social__is_initialized;
    private TravelTimeSubtitle travelTime;
    private boolean travelTime__is_initialized;
    private WorkingHoursSubtitle workingHours;
    private boolean workingHours__is_initialized;

    public SubtitleProperties(WorkingHoursSubtitle workingHoursSubtitle, NextMovieSubtitle nextMovieSubtitle, TravelTimeSubtitle travelTimeSubtitle, PriceSubtitle priceSubtitle, SocialSubtitle socialSubtitle) {
        this.workingHours__is_initialized = false;
        this.nextMovie__is_initialized = false;
        this.travelTime__is_initialized = false;
        this.price__is_initialized = false;
        this.social__is_initialized = false;
        this.nativeObject = init(workingHoursSubtitle, nextMovieSubtitle, travelTimeSubtitle, priceSubtitle, socialSubtitle);
        this.workingHours = workingHoursSubtitle;
        this.workingHours__is_initialized = true;
        this.nextMovie = nextMovieSubtitle;
        this.nextMovie__is_initialized = true;
        this.travelTime = travelTimeSubtitle;
        this.travelTime__is_initialized = true;
        this.price = priceSubtitle;
        this.price__is_initialized = true;
        this.social = socialSubtitle;
        this.social__is_initialized = true;
    }

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::SubtitleProperties";
    }

    private native NextMovieSubtitle getNextMovie__Native();

    private native PriceSubtitle getPrice__Native();

    private native SocialSubtitle getSocial__Native();

    private native TravelTimeSubtitle getTravelTime__Native();

    private native WorkingHoursSubtitle getWorkingHours__Native();

    private native NativeObject init(WorkingHoursSubtitle workingHoursSubtitle, NextMovieSubtitle nextMovieSubtitle, TravelTimeSubtitle travelTimeSubtitle, PriceSubtitle priceSubtitle, SocialSubtitle socialSubtitle);

    public synchronized NextMovieSubtitle getNextMovie() {
        try {
            if (!this.nextMovie__is_initialized) {
                this.nextMovie = getNextMovie__Native();
                this.nextMovie__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.nextMovie;
    }

    public synchronized PriceSubtitle getPrice() {
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

    public synchronized SocialSubtitle getSocial() {
        try {
            if (!this.social__is_initialized) {
                this.social = getSocial__Native();
                this.social__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.social;
    }

    public synchronized TravelTimeSubtitle getTravelTime() {
        try {
            if (!this.travelTime__is_initialized) {
                this.travelTime = getTravelTime__Native();
                this.travelTime__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.travelTime;
    }

    public synchronized WorkingHoursSubtitle getWorkingHours() {
        try {
            if (!this.workingHours__is_initialized) {
                this.workingHours = getWorkingHours__Native();
                this.workingHours__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.workingHours;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getWorkingHours(), true, (Class<Archive>) WorkingHoursSubtitle.class);
            archive.add((Archive) getNextMovie(), true, (Class<Archive>) NextMovieSubtitle.class);
            archive.add((Archive) getTravelTime(), true, (Class<Archive>) TravelTimeSubtitle.class);
            archive.add((Archive) getPrice(), true, (Class<Archive>) PriceSubtitle.class);
            archive.add((Archive) getSocial(), true, (Class<Archive>) SocialSubtitle.class);
            return;
        }
        this.workingHours = (WorkingHoursSubtitle) archive.add((Archive) this.workingHours, true, (Class<Archive>) WorkingHoursSubtitle.class);
        this.workingHours__is_initialized = true;
        this.nextMovie = (NextMovieSubtitle) archive.add((Archive) this.nextMovie, true, (Class<Archive>) NextMovieSubtitle.class);
        this.nextMovie__is_initialized = true;
        this.travelTime = (TravelTimeSubtitle) archive.add((Archive) this.travelTime, true, (Class<Archive>) TravelTimeSubtitle.class);
        this.travelTime__is_initialized = true;
        this.price = (PriceSubtitle) archive.add((Archive) this.price, true, (Class<Archive>) PriceSubtitle.class);
        this.price__is_initialized = true;
        SocialSubtitle socialSubtitle = (SocialSubtitle) archive.add((Archive) this.social, true, (Class<Archive>) SocialSubtitle.class);
        this.social = socialSubtitle;
        this.social__is_initialized = true;
        this.nativeObject = init(this.workingHours, this.nextMovie, this.travelTime, this.price, socialSubtitle);
    }

    public static class TravelTimeSubtitle implements Serializable {
        private String type;

        public TravelTimeSubtitle(String str) {
            this.type = str;
        }

        public String getType() {
            return this.type;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.type = archive.add(this.type, true);
        }

        public TravelTimeSubtitle() {
        }
    }

    public static class NextMovieSubtitle implements Serializable {
        private Money price;
        private Time time;
        private String title;

        public NextMovieSubtitle(String str, Time time, Money money) {
            this.title = str;
            this.time = time;
            this.price = money;
        }

        public Money getPrice() {
            return this.price;
        }

        public Time getTime() {
            return this.time;
        }

        public String getTitle() {
            return this.title;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.title = archive.add(this.title, true);
            this.time = (Time) archive.add((Archive) this.time, true, (Class<Archive>) Time.class);
            this.price = (Money) archive.add((Archive) this.price, true, (Class<Archive>) Money.class);
        }

        public NextMovieSubtitle() {
        }
    }

    public static class PriceSubtitle implements Serializable {
        private Money exactPrice;
        private String name;
        private String photoLink;
        private MoneyRange priceRange;

        public PriceSubtitle(String str, String str2, Money money, MoneyRange moneyRange) {
            this.name = str;
            this.photoLink = str2;
            this.exactPrice = money;
            this.priceRange = moneyRange;
        }

        public Money getExactPrice() {
            return this.exactPrice;
        }

        public String getName() {
            return this.name;
        }

        public String getPhotoLink() {
            return this.photoLink;
        }

        public MoneyRange getPriceRange() {
            return this.priceRange;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            this.name = archive.add(this.name, true);
            this.photoLink = archive.add(this.photoLink, true);
            this.exactPrice = (Money) archive.add((Archive) this.exactPrice, true, (Class<Archive>) Money.class);
            this.priceRange = (MoneyRange) archive.add((Archive) this.priceRange, true, (Class<Archive>) MoneyRange.class);
        }

        public PriceSubtitle() {
        }
    }

    public static class SocialSubtitle implements Serializable {
        private List<String> avatarLinks;
        private boolean avatarLinks__is_initialized;
        private NativeObject nativeObject;

        public SocialSubtitle(List<String> list) {
            this.avatarLinks__is_initialized = false;
            if (list == null) {
                ny61.g("Required field \"avatarLinks\" cannot be null");
                throw null;
            }
            this.nativeObject = init(list);
            this.avatarLinks = list;
            this.avatarLinks__is_initialized = true;
        }

        private native List<String> getAvatarLinks__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::SubtitleProperties::SocialSubtitle";
        }

        private native NativeObject init(List<String> list);

        public synchronized List<String> getAvatarLinks() {
            try {
                if (!this.avatarLinks__is_initialized) {
                    this.avatarLinks = getAvatarLinks__Native();
                    this.avatarLinks__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.avatarLinks;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                nzs.l(archive, getAvatarLinks(), false);
                return;
            }
            List<String> o = nnm.o(archive, this.avatarLinks, false);
            this.avatarLinks = o;
            this.avatarLinks__is_initialized = true;
            this.nativeObject = init(o);
        }

        public SocialSubtitle() {
            this.avatarLinks__is_initialized = false;
        }

        private SocialSubtitle(NativeObject nativeObject) {
            this.avatarLinks__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public static class WorkingHoursSubtitle implements Serializable {
        private Boolean isOpen;
        private boolean isOpen__is_initialized;
        private NativeObject nativeObject;
        private String shortText;
        private boolean shortText__is_initialized;
        private List<String> tags;
        private boolean tags__is_initialized;

        public WorkingHoursSubtitle(String str, Boolean bool, List<String> list) {
            this.shortText__is_initialized = false;
            this.isOpen__is_initialized = false;
            this.tags__is_initialized = false;
            if (list == null) {
                ny61.g("Required field \"tags\" cannot be null");
                throw null;
            }
            this.nativeObject = init(str, bool, list);
            this.shortText = str;
            this.shortText__is_initialized = true;
            this.isOpen = bool;
            this.isOpen__is_initialized = true;
            this.tags = list;
            this.tags__is_initialized = true;
        }

        private native Boolean getIsOpen__Native();

        public static String getNativeName() {
            return "yandex::maps::mapkit::search::SubtitleProperties::WorkingHoursSubtitle";
        }

        private native String getShortText__Native();

        private native List<String> getTags__Native();

        private native NativeObject init(String str, Boolean bool, List<String> list);

        public synchronized Boolean getIsOpen() {
            try {
                if (!this.isOpen__is_initialized) {
                    this.isOpen = getIsOpen__Native();
                    this.isOpen__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.isOpen;
        }

        public synchronized String getShortText() {
            try {
                if (!this.shortText__is_initialized) {
                    this.shortText = getShortText__Native();
                    this.shortText__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.shortText;
        }

        public synchronized List<String> getTags() {
            try {
                if (!this.tags__is_initialized) {
                    this.tags = getTags__Native();
                    this.tags__is_initialized = true;
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.tags;
        }

        @Override // com.yandex.runtime.bindings.Serializable
        public void serialize(Archive archive) {
            if (!archive.isReader()) {
                archive.add(getShortText(), true);
                archive.add(getIsOpen(), true);
                nzs.l(archive, getTags(), false);
                return;
            }
            this.shortText = archive.add(this.shortText, true);
            this.shortText__is_initialized = true;
            this.isOpen = archive.add(this.isOpen, true);
            this.isOpen__is_initialized = true;
            List<String> o = nnm.o(archive, this.tags, false);
            this.tags = o;
            this.tags__is_initialized = true;
            this.nativeObject = init(this.shortText, this.isOpen, o);
        }

        public WorkingHoursSubtitle() {
            this.shortText__is_initialized = false;
            this.isOpen__is_initialized = false;
            this.tags__is_initialized = false;
        }

        private WorkingHoursSubtitle(NativeObject nativeObject) {
            this.shortText__is_initialized = false;
            this.isOpen__is_initialized = false;
            this.tags__is_initialized = false;
            this.nativeObject = nativeObject;
        }
    }

    public SubtitleProperties() {
        this.workingHours__is_initialized = false;
        this.nextMovie__is_initialized = false;
        this.travelTime__is_initialized = false;
        this.price__is_initialized = false;
        this.social__is_initialized = false;
    }

    private SubtitleProperties(NativeObject nativeObject) {
        this.workingHours__is_initialized = false;
        this.nextMovie__is_initialized = false;
        this.travelTime__is_initialized = false;
        this.price__is_initialized = false;
        this.social__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
