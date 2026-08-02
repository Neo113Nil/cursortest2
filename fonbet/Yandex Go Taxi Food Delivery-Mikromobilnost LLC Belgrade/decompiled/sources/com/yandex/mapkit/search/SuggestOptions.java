package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class SuggestOptions implements Serializable {
    private List<String> linkSchemes;
    private String origin;
    private SuggestResultGrouping resultGrouping;
    private boolean strictBounds;
    private int suggestTypes;
    private boolean suggestWords;
    private Point userPosition;

    public SuggestOptions(int i, Point point, boolean z, List<String> list, SuggestResultGrouping suggestResultGrouping, boolean z2, String str) {
        this.suggestTypes = SuggestType.UNSPECIFIED.value;
        this.userPosition = null;
        this.suggestWords = false;
        this.linkSchemes = Collections.EMPTY_LIST;
        this.resultGrouping = SuggestResultGrouping.ITEMS;
        this.strictBounds = false;
        this.origin = null;
        if (list == null) {
            ny61.g("Required field \"linkSchemes\" cannot be null");
            throw null;
        }
        if (suggestResultGrouping == null) {
            ny61.g("Required field \"resultGrouping\" cannot be null");
            throw null;
        }
        this.suggestTypes = i;
        this.userPosition = point;
        this.suggestWords = z;
        this.linkSchemes = list;
        this.resultGrouping = suggestResultGrouping;
        this.strictBounds = z2;
        this.origin = str;
    }

    public List<String> getLinkSchemes() {
        return this.linkSchemes;
    }

    public String getOrigin() {
        return this.origin;
    }

    public SuggestResultGrouping getResultGrouping() {
        return this.resultGrouping;
    }

    public boolean getStrictBounds() {
        return this.strictBounds;
    }

    public int getSuggestTypes() {
        return this.suggestTypes;
    }

    public boolean getSuggestWords() {
        return this.suggestWords;
    }

    public Point getUserPosition() {
        return this.userPosition;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.suggestTypes = archive.add(Integer.valueOf(this.suggestTypes), false).intValue();
        this.userPosition = (Point) archive.add((Archive) this.userPosition, true, (Class<Archive>) Point.class);
        this.suggestWords = archive.add(this.suggestWords);
        this.linkSchemes = nnm.o(archive, this.linkSchemes, false);
        this.resultGrouping = (SuggestResultGrouping) archive.add((Archive) this.resultGrouping, false, (Class<Archive>) SuggestResultGrouping.class);
        this.strictBounds = archive.add(this.strictBounds);
        this.origin = archive.add(this.origin, true);
    }

    public SuggestOptions setLinkSchemes(List<String> list) {
        if (list != null) {
            this.linkSchemes = list;
            return this;
        }
        ny61.g("Required field \"linkSchemes\" cannot be null");
        return null;
    }

    public SuggestOptions setOrigin(String str) {
        this.origin = str;
        return this;
    }

    public SuggestOptions setResultGrouping(SuggestResultGrouping suggestResultGrouping) {
        if (suggestResultGrouping != null) {
            this.resultGrouping = suggestResultGrouping;
            return this;
        }
        ny61.g("Required field \"resultGrouping\" cannot be null");
        return null;
    }

    public SuggestOptions setStrictBounds(boolean z) {
        this.strictBounds = z;
        return this;
    }

    public SuggestOptions setSuggestTypes(int i) {
        this.suggestTypes = i;
        return this;
    }

    public SuggestOptions setSuggestWords(boolean z) {
        this.suggestWords = z;
        return this;
    }

    public SuggestOptions setUserPosition(Point point) {
        this.userPosition = point;
        return this;
    }

    public SuggestOptions() {
        this.suggestTypes = SuggestType.UNSPECIFIED.value;
        this.userPosition = null;
        this.suggestWords = false;
        this.linkSchemes = Collections.EMPTY_LIST;
        this.resultGrouping = SuggestResultGrouping.ITEMS;
        this.strictBounds = false;
        this.origin = null;
    }

    public SuggestOptions(int i, Point point, boolean z, boolean z2) {
        this.suggestTypes = SuggestType.UNSPECIFIED.value;
        this.userPosition = null;
        this.suggestWords = false;
        this.linkSchemes = Collections.EMPTY_LIST;
        this.resultGrouping = SuggestResultGrouping.ITEMS;
        this.origin = null;
        this.suggestTypes = i;
        this.userPosition = point;
        this.suggestWords = z;
        this.strictBounds = z2;
    }
}
