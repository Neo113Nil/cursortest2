package com.yandex.mapkit.directions.driving;

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
public class Annotation implements Serializable {
    private Action action;
    private ActionMetadata actionMetadata;
    private boolean actionMetadata__is_initialized;
    private boolean action__is_initialized;
    private AnnotationPhrase annotationPhrase;
    private boolean annotationPhrase__is_initialized;
    private String descriptionText;
    private boolean descriptionText__is_initialized;
    private HDAnnotation hdAnnotation;
    private boolean hdAnnotation__is_initialized;
    private Boolean inSeriesWithNext;
    private boolean inSeriesWithNext__is_initialized;
    private List<Landmark> landmarks;
    private boolean landmarks__is_initialized;
    private NativeObject nativeObject;
    private String toponym;
    private List<ToponymPhrase> toponymPhrase;
    private boolean toponymPhrase__is_initialized;
    private boolean toponym__is_initialized;

    public Annotation(Action action, String str, String str2, ActionMetadata actionMetadata, List<Landmark> list, List<ToponymPhrase> list2, AnnotationPhrase annotationPhrase, HDAnnotation hDAnnotation, Boolean bool) {
        this.action__is_initialized = false;
        this.toponym__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.actionMetadata__is_initialized = false;
        this.landmarks__is_initialized = false;
        this.toponymPhrase__is_initialized = false;
        this.annotationPhrase__is_initialized = false;
        this.hdAnnotation__is_initialized = false;
        this.inSeriesWithNext__is_initialized = false;
        if (str2 == null) {
            ny61.g("Required field \"descriptionText\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"landmarks\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"toponymPhrase\" cannot be null");
            throw null;
        }
        this.nativeObject = init(action, str, str2, actionMetadata, list, list2, annotationPhrase, hDAnnotation, bool);
        this.action = action;
        this.action__is_initialized = true;
        this.toponym = str;
        this.toponym__is_initialized = true;
        this.descriptionText = str2;
        this.descriptionText__is_initialized = true;
        this.actionMetadata = actionMetadata;
        this.actionMetadata__is_initialized = true;
        this.landmarks = list;
        this.landmarks__is_initialized = true;
        this.toponymPhrase = list2;
        this.toponymPhrase__is_initialized = true;
        this.annotationPhrase = annotationPhrase;
        this.annotationPhrase__is_initialized = true;
        this.hdAnnotation = hDAnnotation;
        this.hdAnnotation__is_initialized = true;
        this.inSeriesWithNext = bool;
        this.inSeriesWithNext__is_initialized = true;
    }

    private native ActionMetadata getActionMetadata__Native();

    private native Action getAction__Native();

    private native AnnotationPhrase getAnnotationPhrase__Native();

    private native String getDescriptionText__Native();

    private native HDAnnotation getHdAnnotation__Native();

    private native Boolean getInSeriesWithNext__Native();

    private native List<Landmark> getLandmarks__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::directions::driving::Annotation";
    }

    private native List<ToponymPhrase> getToponymPhrase__Native();

    private native String getToponym__Native();

    private native NativeObject init(Action action, String str, String str2, ActionMetadata actionMetadata, List<Landmark> list, List<ToponymPhrase> list2, AnnotationPhrase annotationPhrase, HDAnnotation hDAnnotation, Boolean bool);

    private native NativeObject initPublic(Action action, String str, String str2, ActionMetadata actionMetadata, List<Landmark> list, List<ToponymPhrase> list2);

    public synchronized Action getAction() {
        try {
            if (!this.action__is_initialized) {
                this.action = getAction__Native();
                this.action__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.action;
    }

    public synchronized ActionMetadata getActionMetadata() {
        try {
            if (!this.actionMetadata__is_initialized) {
                this.actionMetadata = getActionMetadata__Native();
                this.actionMetadata__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.actionMetadata;
    }

    public synchronized AnnotationPhrase getAnnotationPhrase() {
        try {
            if (!this.annotationPhrase__is_initialized) {
                this.annotationPhrase = getAnnotationPhrase__Native();
                this.annotationPhrase__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.annotationPhrase;
    }

    public synchronized String getDescriptionText() {
        try {
            if (!this.descriptionText__is_initialized) {
                this.descriptionText = getDescriptionText__Native();
                this.descriptionText__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.descriptionText;
    }

    public synchronized HDAnnotation getHdAnnotation() {
        try {
            if (!this.hdAnnotation__is_initialized) {
                this.hdAnnotation = getHdAnnotation__Native();
                this.hdAnnotation__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hdAnnotation;
    }

    public synchronized Boolean getInSeriesWithNext() {
        try {
            if (!this.inSeriesWithNext__is_initialized) {
                this.inSeriesWithNext = getInSeriesWithNext__Native();
                this.inSeriesWithNext__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.inSeriesWithNext;
    }

    public synchronized List<Landmark> getLandmarks() {
        try {
            if (!this.landmarks__is_initialized) {
                this.landmarks = getLandmarks__Native();
                this.landmarks__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.landmarks;
    }

    public synchronized String getToponym() {
        try {
            if (!this.toponym__is_initialized) {
                this.toponym = getToponym__Native();
                this.toponym__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.toponym;
    }

    public synchronized List<ToponymPhrase> getToponymPhrase() {
        try {
            if (!this.toponymPhrase__is_initialized) {
                this.toponymPhrase = getToponymPhrase__Native();
                this.toponymPhrase__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.toponymPhrase;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add((Archive) getAction(), true, (Class<Archive>) Action.class);
            archive.add(getToponym(), true);
            archive.add(getDescriptionText(), false);
            archive.add((Archive) getActionMetadata(), true, (Class<Archive>) ActionMetadata.class);
            archive.add((List) getLandmarks(), false, (ArchivingHandler) new EnumHandler(Landmark.class));
            archive.add((List) getToponymPhrase(), false, (ArchivingHandler) new ClassHandler(ToponymPhrase.class));
            archive.add((Archive) getAnnotationPhrase(), true, (Class<Archive>) AnnotationPhrase.class);
            archive.add((Archive) getHdAnnotation(), true, (Class<Archive>) HDAnnotation.class);
            archive.add(getInSeriesWithNext(), true);
            return;
        }
        this.action = (Action) archive.add((Archive) this.action, true, (Class<Archive>) Action.class);
        this.action__is_initialized = true;
        this.toponym = archive.add(this.toponym, true);
        this.toponym__is_initialized = true;
        this.descriptionText = archive.add(this.descriptionText, false);
        this.descriptionText__is_initialized = true;
        this.actionMetadata = (ActionMetadata) archive.add((Archive) this.actionMetadata, true, (Class<Archive>) ActionMetadata.class);
        this.actionMetadata__is_initialized = true;
        this.landmarks = archive.add((List) this.landmarks, false, (ArchivingHandler) new EnumHandler(Landmark.class));
        this.landmarks__is_initialized = true;
        this.toponymPhrase = nzs.e(ToponymPhrase.class, archive, this.toponymPhrase, false);
        this.toponymPhrase__is_initialized = true;
        this.annotationPhrase = (AnnotationPhrase) archive.add((Archive) this.annotationPhrase, true, (Class<Archive>) AnnotationPhrase.class);
        this.annotationPhrase__is_initialized = true;
        this.hdAnnotation = (HDAnnotation) archive.add((Archive) this.hdAnnotation, true, (Class<Archive>) HDAnnotation.class);
        this.hdAnnotation__is_initialized = true;
        Boolean add = archive.add(this.inSeriesWithNext, true);
        this.inSeriesWithNext = add;
        this.inSeriesWithNext__is_initialized = true;
        this.nativeObject = init(this.action, this.toponym, this.descriptionText, this.actionMetadata, this.landmarks, this.toponymPhrase, this.annotationPhrase, this.hdAnnotation, add);
    }

    public Annotation() {
        this.action__is_initialized = false;
        this.toponym__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.actionMetadata__is_initialized = false;
        this.landmarks__is_initialized = false;
        this.toponymPhrase__is_initialized = false;
        this.annotationPhrase__is_initialized = false;
        this.hdAnnotation__is_initialized = false;
        this.inSeriesWithNext__is_initialized = false;
    }

    private Annotation(NativeObject nativeObject) {
        this.action__is_initialized = false;
        this.toponym__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.actionMetadata__is_initialized = false;
        this.landmarks__is_initialized = false;
        this.toponymPhrase__is_initialized = false;
        this.annotationPhrase__is_initialized = false;
        this.hdAnnotation__is_initialized = false;
        this.inSeriesWithNext__is_initialized = false;
        this.nativeObject = nativeObject;
    }

    public Annotation(Action action, String str, String str2, ActionMetadata actionMetadata, List<Landmark> list, List<ToponymPhrase> list2) {
        this.action__is_initialized = false;
        this.toponym__is_initialized = false;
        this.descriptionText__is_initialized = false;
        this.actionMetadata__is_initialized = false;
        this.landmarks__is_initialized = false;
        this.toponymPhrase__is_initialized = false;
        this.annotationPhrase__is_initialized = false;
        this.hdAnnotation__is_initialized = false;
        this.inSeriesWithNext__is_initialized = false;
        if (str2 == null) {
            ny61.g("Required field \"descriptionText\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"landmarks\" cannot be null");
            throw null;
        }
        if (list2 != null) {
            this.nativeObject = initPublic(action, str, str2, actionMetadata, list, list2);
            this.action = action;
            this.action__is_initialized = true;
            this.toponym = str;
            this.toponym__is_initialized = true;
            this.descriptionText = str2;
            this.descriptionText__is_initialized = true;
            this.actionMetadata = actionMetadata;
            this.actionMetadata__is_initialized = true;
            this.landmarks = list;
            this.landmarks__is_initialized = true;
            this.toponymPhrase = list2;
            this.toponymPhrase__is_initialized = true;
            return;
        }
        ny61.g("Required field \"toponymPhrase\" cannot be null");
        throw null;
    }
}
