package com.yandex.mapkit.search;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.ClassHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;
import defpackage.nzs;
import java.util.List;

/* loaded from: classes15.dex */
public class PinHints implements Serializable {
    private boolean allowMultilineSubtitle;
    private boolean allowMultilineSubtitle__is_initialized;
    private SubtitleHint factoidHint;
    private boolean factoidHint__is_initialized;
    private SubtitleHint islandHint;
    private boolean islandHint__is_initialized;
    private NativeObject nativeObject;
    private PuckType puck;
    private boolean puck__is_initialized;
    private TitleType showTitle;
    private boolean showTitle__is_initialized;
    private List<SubtitleHint> subtitleHints;
    private boolean subtitleHints__is_initialized;

    public enum PuckType {
        DEFAULT,
        RUBRIC,
        CHAIN_LOGO,
        PHOTO
    }

    public enum TitleType {
        NO_TITLE,
        SHORT_TITLE,
        LONG_TITLE
    }

    public PinHints(PuckType puckType, TitleType titleType, List<SubtitleHint> list, SubtitleHint subtitleHint, SubtitleHint subtitleHint2, boolean z) {
        this.puck__is_initialized = false;
        this.showTitle__is_initialized = false;
        this.subtitleHints__is_initialized = false;
        this.islandHint__is_initialized = false;
        this.factoidHint__is_initialized = false;
        this.allowMultilineSubtitle__is_initialized = false;
        if (puckType == null) {
            ny61.g("Required field \"puck\" cannot be null");
            throw null;
        }
        if (list == null) {
            ny61.g("Required field \"subtitleHints\" cannot be null");
            throw null;
        }
        this.nativeObject = init(puckType, titleType, list, subtitleHint, subtitleHint2, z);
        this.puck = puckType;
        this.puck__is_initialized = true;
        this.showTitle = titleType;
        this.showTitle__is_initialized = true;
        this.subtitleHints = list;
        this.subtitleHints__is_initialized = true;
        this.islandHint = subtitleHint;
        this.islandHint__is_initialized = true;
        this.factoidHint = subtitleHint2;
        this.factoidHint__is_initialized = true;
        this.allowMultilineSubtitle = z;
        this.allowMultilineSubtitle__is_initialized = true;
    }

    private native boolean getAllowMultilineSubtitle__Native();

    private native SubtitleHint getFactoidHint__Native();

    private native SubtitleHint getIslandHint__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::PinHints";
    }

    private native PuckType getPuck__Native();

    private native TitleType getShowTitle__Native();

    private native List<SubtitleHint> getSubtitleHints__Native();

    private native NativeObject init(PuckType puckType, TitleType titleType, List<SubtitleHint> list, SubtitleHint subtitleHint, SubtitleHint subtitleHint2, boolean z);

    public synchronized boolean getAllowMultilineSubtitle() {
        try {
            if (!this.allowMultilineSubtitle__is_initialized) {
                this.allowMultilineSubtitle = getAllowMultilineSubtitle__Native();
                this.allowMultilineSubtitle__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.allowMultilineSubtitle;
    }

    public synchronized SubtitleHint getFactoidHint() {
        try {
            if (!this.factoidHint__is_initialized) {
                this.factoidHint = getFactoidHint__Native();
                this.factoidHint__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.factoidHint;
    }

    public synchronized SubtitleHint getIslandHint() {
        try {
            if (!this.islandHint__is_initialized) {
                this.islandHint = getIslandHint__Native();
                this.islandHint__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.islandHint;
    }

    public synchronized PuckType getPuck() {
        try {
            if (!this.puck__is_initialized) {
                this.puck = getPuck__Native();
                this.puck__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.puck;
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
            archive.add((Archive) getPuck(), false, (Class<Archive>) PuckType.class);
            archive.add((Archive) getShowTitle(), true, (Class<Archive>) TitleType.class);
            archive.add((List) getSubtitleHints(), false, (ArchivingHandler) new ClassHandler(SubtitleHint.class));
            archive.add((Archive) getIslandHint(), true, (Class<Archive>) SubtitleHint.class);
            archive.add((Archive) getFactoidHint(), true, (Class<Archive>) SubtitleHint.class);
            archive.add(getAllowMultilineSubtitle());
            return;
        }
        this.puck = (PuckType) archive.add((Archive) this.puck, false, (Class<Archive>) PuckType.class);
        this.puck__is_initialized = true;
        this.showTitle = (TitleType) archive.add((Archive) this.showTitle, true, (Class<Archive>) TitleType.class);
        this.showTitle__is_initialized = true;
        this.subtitleHints = nzs.e(SubtitleHint.class, archive, this.subtitleHints, false);
        this.subtitleHints__is_initialized = true;
        this.islandHint = (SubtitleHint) archive.add((Archive) this.islandHint, true, (Class<Archive>) SubtitleHint.class);
        this.islandHint__is_initialized = true;
        this.factoidHint = (SubtitleHint) archive.add((Archive) this.factoidHint, true, (Class<Archive>) SubtitleHint.class);
        this.factoidHint__is_initialized = true;
        boolean add = archive.add(this.allowMultilineSubtitle);
        this.allowMultilineSubtitle = add;
        this.allowMultilineSubtitle__is_initialized = true;
        this.nativeObject = init(this.puck, this.showTitle, this.subtitleHints, this.islandHint, this.factoidHint, add);
    }

    public PinHints() {
        this.puck__is_initialized = false;
        this.showTitle__is_initialized = false;
        this.subtitleHints__is_initialized = false;
        this.islandHint__is_initialized = false;
        this.factoidHint__is_initialized = false;
        this.allowMultilineSubtitle__is_initialized = false;
    }

    private PinHints(NativeObject nativeObject) {
        this.puck__is_initialized = false;
        this.showTitle__is_initialized = false;
        this.subtitleHints__is_initialized = false;
        this.islandHint__is_initialized = false;
        this.factoidHint__is_initialized = false;
        this.allowMultilineSubtitle__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
