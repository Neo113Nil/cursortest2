package com.yandex.mapkit.road_events;

import com.yandex.mapkit.Attribution;
import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.Time;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class RoadEventMetadata implements BaseMetadata, Serializable {
    private Attribution.Author author;
    private boolean author__is_initialized;
    private List<FeedbackReason> commentVoteDownReasons;
    private boolean commentVoteDownReasons__is_initialized;
    private Integer commentsCount;
    private boolean commentsCount__is_initialized;
    private String description;
    private boolean description__is_initialized;
    private String eventId;
    private boolean eventId__is_initialized;
    private List<FeedbackReason> eventVoteDownReasons;
    private boolean eventVoteDownReasons__is_initialized;
    private Time modificationTime;
    private boolean modificationTime__is_initialized;
    private NativeObject nativeObject;
    private List<EventTag> tags;
    private boolean tags__is_initialized;
    private TimePeriod timePeriod;
    private boolean timePeriod__is_initialized;

    public RoadEventMetadata(String str, String str2, List<EventTag> list, TimePeriod timePeriod, Time time, Integer num, Attribution.Author author, List<FeedbackReason> list2, List<FeedbackReason> list3) {
        this.eventId__is_initialized = false;
        this.description__is_initialized = false;
        this.tags__is_initialized = false;
        this.timePeriod__is_initialized = false;
        this.modificationTime__is_initialized = false;
        this.commentsCount__is_initialized = false;
        this.author__is_initialized = false;
        this.eventVoteDownReasons__is_initialized = false;
        this.commentVoteDownReasons__is_initialized = false;
        if (str == null) {
            ny61.g("Required field \"eventId\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"tags\" cannot be null");
            throw null;
        }
        if (time == null) {
            ny61.g("Required field \"modificationTime\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"eventVoteDownReasons\" cannot be null");
            throw null;
        }
        if (list3 == null) {
            ny61.g("Required field \"commentVoteDownReasons\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, list, timePeriod, time, num, author, list2, list3);
        this.eventId = str;
        this.eventId__is_initialized = true;
        this.description = str2;
        this.description__is_initialized = true;
        this.tags = list;
        this.tags__is_initialized = true;
        this.timePeriod = timePeriod;
        this.timePeriod__is_initialized = true;
        this.modificationTime = time;
        this.modificationTime__is_initialized = true;
        this.commentsCount = num;
        this.commentsCount__is_initialized = true;
        this.author = author;
        this.author__is_initialized = true;
        this.eventVoteDownReasons = list2;
        this.eventVoteDownReasons__is_initialized = true;
        this.commentVoteDownReasons = list3;
        this.commentVoteDownReasons__is_initialized = true;
    }

    private native Attribution.Author getAuthor__Native();

    private native List<FeedbackReason> getCommentVoteDownReasons__Native();

    private native Integer getCommentsCount__Native();

    private native String getDescription__Native();

    private native String getEventId__Native();

    private native List<FeedbackReason> getEventVoteDownReasons__Native();

    private native Time getModificationTime__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::road_events::RoadEventMetadata";
    }

    private native List<EventTag> getTags__Native();

    private native TimePeriod getTimePeriod__Native();

    private native NativeObject init(String str, String str2, List<EventTag> list, TimePeriod timePeriod, Time time, Integer num, Attribution.Author author, List<FeedbackReason> list2, List<FeedbackReason> list3);

    public synchronized Attribution.Author getAuthor() {
        try {
            if (!this.author__is_initialized) {
                this.author = getAuthor__Native();
                this.author__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.author;
    }

    public synchronized List<FeedbackReason> getCommentVoteDownReasons() {
        try {
            if (!this.commentVoteDownReasons__is_initialized) {
                this.commentVoteDownReasons = getCommentVoteDownReasons__Native();
                this.commentVoteDownReasons__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.commentVoteDownReasons;
    }

    public synchronized Integer getCommentsCount() {
        try {
            if (!this.commentsCount__is_initialized) {
                this.commentsCount = getCommentsCount__Native();
                this.commentsCount__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.commentsCount;
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

    public synchronized String getEventId() {
        try {
            if (!this.eventId__is_initialized) {
                this.eventId = getEventId__Native();
                this.eventId__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.eventId;
    }

    public synchronized List<FeedbackReason> getEventVoteDownReasons() {
        try {
            if (!this.eventVoteDownReasons__is_initialized) {
                this.eventVoteDownReasons = getEventVoteDownReasons__Native();
                this.eventVoteDownReasons__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.eventVoteDownReasons;
    }

    public synchronized Time getModificationTime() {
        try {
            if (!this.modificationTime__is_initialized) {
                this.modificationTime = getModificationTime__Native();
                this.modificationTime__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.modificationTime;
    }

    public synchronized List<EventTag> getTags() {
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

    public synchronized TimePeriod getTimePeriod() {
        try {
            if (!this.timePeriod__is_initialized) {
                this.timePeriod = getTimePeriod__Native();
                this.timePeriod__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.timePeriod;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getEventId(), false);
            archive.add(getDescription(), true);
            archive.add((List) getTags(), false, (ArchivingHandler) new EnumHandler(EventTag.class));
            archive.add((Archive) getTimePeriod(), true, (Class<Archive>) TimePeriod.class);
            archive.add((Archive) getModificationTime(), false, (Class<Archive>) Time.class);
            archive.add(getCommentsCount(), true);
            archive.add((Archive) getAuthor(), true, (Class<Archive>) Attribution.Author.class);
            archive.add((List) getEventVoteDownReasons(), false, (ArchivingHandler) new ClassHandler(FeedbackReason.class));
            nzs.m(FeedbackReason.class, archive, getCommentVoteDownReasons(), false);
            return;
        }
        this.eventId = archive.add(this.eventId, false);
        this.eventId__is_initialized = true;
        this.description = archive.add(this.description, true);
        this.description__is_initialized = true;
        this.tags = archive.add((List) this.tags, false, (ArchivingHandler) new EnumHandler(EventTag.class));
        this.tags__is_initialized = true;
        this.timePeriod = (TimePeriod) archive.add((Archive) this.timePeriod, true, (Class<Archive>) TimePeriod.class);
        this.timePeriod__is_initialized = true;
        this.modificationTime = (Time) archive.add((Archive) this.modificationTime, false, (Class<Archive>) Time.class);
        this.modificationTime__is_initialized = true;
        this.commentsCount = archive.add(this.commentsCount, true);
        this.commentsCount__is_initialized = true;
        this.author = (Attribution.Author) archive.add((Archive) this.author, true, (Class<Archive>) Attribution.Author.class);
        this.author__is_initialized = true;
        this.eventVoteDownReasons = nzs.e(FeedbackReason.class, archive, this.eventVoteDownReasons, false);
        this.eventVoteDownReasons__is_initialized = true;
        List<FeedbackReason> e = nzs.e(FeedbackReason.class, archive, this.commentVoteDownReasons, false);
        this.commentVoteDownReasons = e;
        this.commentVoteDownReasons__is_initialized = true;
        this.nativeObject = init(this.eventId, this.description, this.tags, this.timePeriod, this.modificationTime, this.commentsCount, this.author, this.eventVoteDownReasons, e);
    }

    public RoadEventMetadata() {
        this.eventId__is_initialized = false;
        this.description__is_initialized = false;
        this.tags__is_initialized = false;
        this.timePeriod__is_initialized = false;
        this.modificationTime__is_initialized = false;
        this.commentsCount__is_initialized = false;
        this.author__is_initialized = false;
        this.eventVoteDownReasons__is_initialized = false;
        this.commentVoteDownReasons__is_initialized = false;
    }

    private RoadEventMetadata(NativeObject nativeObject) {
        this.eventId__is_initialized = false;
        this.description__is_initialized = false;
        this.tags__is_initialized = false;
        this.timePeriod__is_initialized = false;
        this.modificationTime__is_initialized = false;
        this.commentsCount__is_initialized = false;
        this.author__is_initialized = false;
        this.eventVoteDownReasons__is_initialized = false;
        this.commentVoteDownReasons__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
