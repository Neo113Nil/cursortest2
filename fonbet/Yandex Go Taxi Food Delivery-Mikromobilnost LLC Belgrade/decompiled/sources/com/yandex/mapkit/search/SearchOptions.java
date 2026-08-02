package com.yandex.mapkit.search;

import com.yandex.mapkit.geometry.Geometry;
import com.yandex.mapkit.geometry.Point;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class SearchOptions implements Serializable {
    private String advertPageId;
    private String appleCtx;
    private String complianceContext;
    private String directPageId;
    private boolean disableSpellingCorrection;
    private List<String> experimentalSnippets;
    private Integer extendedSearchTypes;
    private FilterCollection filters;
    private boolean geometry;
    private String origin;
    private Integer resultPageSize;
    private Geometry searchArea;
    private int searchTypes;
    private Integer similarOrgsRequest;
    private int snippets;
    private String suggestReqId;
    private Point userPosition;

    public SearchOptions(int i, Integer num, Integer num2, int i2, List<String> list, Point point, String str, String str2, String str3, boolean z, String str4, boolean z2, FilterCollection filterCollection, String str5, String str6, Integer num3, Geometry geometry) {
        this.searchTypes = SearchType.NONE.value;
        this.extendedSearchTypes = null;
        this.resultPageSize = null;
        this.snippets = Snippet.NONE.value;
        this.experimentalSnippets = Collections.EMPTY_LIST;
        this.userPosition = null;
        this.origin = null;
        this.directPageId = null;
        this.appleCtx = null;
        this.geometry = false;
        this.advertPageId = null;
        this.disableSpellingCorrection = false;
        this.filters = null;
        this.suggestReqId = null;
        this.complianceContext = null;
        this.similarOrgsRequest = null;
        this.searchArea = null;
        if (list == null) {
            ny61.g("Required field \"experimentalSnippets\" cannot be null");
            throw null;
        }
        this.searchTypes = i;
        this.extendedSearchTypes = num;
        this.resultPageSize = num2;
        this.snippets = i2;
        this.experimentalSnippets = list;
        this.userPosition = point;
        this.origin = str;
        this.directPageId = str2;
        this.appleCtx = str3;
        this.geometry = z;
        this.advertPageId = str4;
        this.disableSpellingCorrection = z2;
        this.filters = filterCollection;
        this.suggestReqId = str5;
        this.complianceContext = str6;
        this.similarOrgsRequest = num3;
        this.searchArea = geometry;
    }

    public String getAdvertPageId() {
        return this.advertPageId;
    }

    public String getAppleCtx() {
        return this.appleCtx;
    }

    public String getComplianceContext() {
        return this.complianceContext;
    }

    public String getDirectPageId() {
        return this.directPageId;
    }

    public boolean getDisableSpellingCorrection() {
        return this.disableSpellingCorrection;
    }

    public List<String> getExperimentalSnippets() {
        return this.experimentalSnippets;
    }

    public Integer getExtendedSearchTypes() {
        return this.extendedSearchTypes;
    }

    public FilterCollection getFilters() {
        return this.filters;
    }

    public boolean getGeometry() {
        return this.geometry;
    }

    public String getOrigin() {
        return this.origin;
    }

    public Integer getResultPageSize() {
        return this.resultPageSize;
    }

    public Geometry getSearchArea() {
        return this.searchArea;
    }

    public int getSearchTypes() {
        return this.searchTypes;
    }

    public Integer getSimilarOrgsRequest() {
        return this.similarOrgsRequest;
    }

    public int getSnippets() {
        return this.snippets;
    }

    public String getSuggestReqId() {
        return this.suggestReqId;
    }

    public Point getUserPosition() {
        return this.userPosition;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.searchTypes = archive.add(Integer.valueOf(this.searchTypes), false).intValue();
        this.extendedSearchTypes = archive.add(this.extendedSearchTypes, true);
        this.resultPageSize = archive.add(this.resultPageSize, true);
        this.snippets = archive.add(Integer.valueOf(this.snippets), false).intValue();
        this.experimentalSnippets = nnm.o(archive, this.experimentalSnippets, false);
        this.userPosition = (Point) archive.add((Archive) this.userPosition, true, (Class<Archive>) Point.class);
        this.origin = archive.add(this.origin, true);
        this.directPageId = archive.add(this.directPageId, true);
        this.appleCtx = archive.add(this.appleCtx, true);
        this.geometry = archive.add(this.geometry);
        this.advertPageId = archive.add(this.advertPageId, true);
        this.disableSpellingCorrection = archive.add(this.disableSpellingCorrection);
        this.filters = (FilterCollection) archive.add((Archive) this.filters, true, (Class<Archive>) FilterCollection.class);
        this.suggestReqId = archive.add(this.suggestReqId, true);
        this.complianceContext = archive.add(this.complianceContext, true);
        this.similarOrgsRequest = archive.add(this.similarOrgsRequest, true);
        this.searchArea = (Geometry) archive.add((Archive) this.searchArea, true, (Class<Archive>) Geometry.class);
    }

    public SearchOptions setAdvertPageId(String str) {
        this.advertPageId = str;
        return this;
    }

    public SearchOptions setAppleCtx(String str) {
        this.appleCtx = str;
        return this;
    }

    public SearchOptions setComplianceContext(String str) {
        this.complianceContext = str;
        return this;
    }

    public SearchOptions setDirectPageId(String str) {
        this.directPageId = str;
        return this;
    }

    public SearchOptions setDisableSpellingCorrection(boolean z) {
        this.disableSpellingCorrection = z;
        return this;
    }

    public SearchOptions setExperimentalSnippets(List<String> list) {
        if (list != null) {
            this.experimentalSnippets = list;
            return this;
        }
        ny61.g("Required field \"experimentalSnippets\" cannot be null");
        return null;
    }

    public SearchOptions setExtendedSearchTypes(Integer num) {
        this.extendedSearchTypes = num;
        return this;
    }

    public SearchOptions setFilters(FilterCollection filterCollection) {
        this.filters = filterCollection;
        return this;
    }

    public SearchOptions setGeometry(boolean z) {
        this.geometry = z;
        return this;
    }

    public SearchOptions setOrigin(String str) {
        this.origin = str;
        return this;
    }

    public SearchOptions setResultPageSize(Integer num) {
        this.resultPageSize = num;
        return this;
    }

    public SearchOptions setSearchArea(Geometry geometry) {
        this.searchArea = geometry;
        return this;
    }

    public SearchOptions setSearchTypes(int i) {
        this.searchTypes = i;
        return this;
    }

    public SearchOptions setSimilarOrgsRequest(Integer num) {
        this.similarOrgsRequest = num;
        return this;
    }

    public SearchOptions setSnippets(int i) {
        this.snippets = i;
        return this;
    }

    public SearchOptions setSuggestReqId(String str) {
        this.suggestReqId = str;
        return this;
    }

    public SearchOptions setUserPosition(Point point) {
        this.userPosition = point;
        return this;
    }

    public SearchOptions() {
        this.searchTypes = SearchType.NONE.value;
        this.extendedSearchTypes = null;
        this.resultPageSize = null;
        this.snippets = Snippet.NONE.value;
        this.experimentalSnippets = Collections.EMPTY_LIST;
        this.userPosition = null;
        this.origin = null;
        this.directPageId = null;
        this.appleCtx = null;
        this.geometry = false;
        this.advertPageId = null;
        this.disableSpellingCorrection = false;
        this.filters = null;
        this.suggestReqId = null;
        this.complianceContext = null;
        this.similarOrgsRequest = null;
        this.searchArea = null;
    }

    public SearchOptions(int i, Integer num, int i2, Point point, String str, boolean z, boolean z2, FilterCollection filterCollection) {
        this.searchTypes = SearchType.NONE.value;
        this.extendedSearchTypes = null;
        this.resultPageSize = null;
        this.snippets = Snippet.NONE.value;
        this.experimentalSnippets = Collections.EMPTY_LIST;
        this.directPageId = null;
        this.appleCtx = null;
        this.advertPageId = null;
        this.suggestReqId = null;
        this.complianceContext = null;
        this.similarOrgsRequest = null;
        this.searchArea = null;
        this.searchTypes = i;
        this.resultPageSize = num;
        this.snippets = i2;
        this.userPosition = point;
        this.origin = str;
        this.geometry = z;
        this.disableSpellingCorrection = z2;
        this.filters = filterCollection;
    }
}
