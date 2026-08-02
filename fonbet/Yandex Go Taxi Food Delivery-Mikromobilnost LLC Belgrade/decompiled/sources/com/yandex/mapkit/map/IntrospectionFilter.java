package com.yandex.mapkit.map;

import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.map.GeoObjectInspectionMetadata;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.ArchivingHandler;
import com.yandex.runtime.bindings.EnumHandler;
import com.yandex.runtime.bindings.Serializable;
import defpackage.nnm;
import defpackage.ny61;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class IntrospectionFilter implements Serializable {
    private List<String> dataSourceNames;
    private ScreenRect rect;
    private List<GeoObjectInspectionMetadata.ObjectType> types;

    public IntrospectionFilter(ScreenRect screenRect, List<String> list, List<GeoObjectInspectionMetadata.ObjectType> list2) {
        this.rect = null;
        List list3 = Collections.EMPTY_LIST;
        this.dataSourceNames = list3;
        this.types = list3;
        if (list == null) {
            ny61.g("Required field \"dataSourceNames\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"types\" cannot be null");
            throw null;
        }
        this.rect = screenRect;
        this.dataSourceNames = list;
        this.types = list2;
    }

    public List<String> getDataSourceNames() {
        return this.dataSourceNames;
    }

    public ScreenRect getRect() {
        return this.rect;
    }

    public List<GeoObjectInspectionMetadata.ObjectType> getTypes() {
        return this.types;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.rect = (ScreenRect) archive.add((Archive) this.rect, true, (Class<Archive>) ScreenRect.class);
        this.dataSourceNames = nnm.o(archive, this.dataSourceNames, false);
        this.types = archive.add((List) this.types, false, (ArchivingHandler) new EnumHandler(GeoObjectInspectionMetadata.ObjectType.class));
    }

    public IntrospectionFilter setDataSourceNames(List<String> list) {
        if (list != null) {
            this.dataSourceNames = list;
            return this;
        }
        ny61.g("Required field \"dataSourceNames\" cannot be null");
        return null;
    }

    public IntrospectionFilter setRect(ScreenRect screenRect) {
        this.rect = screenRect;
        return this;
    }

    public IntrospectionFilter setTypes(List<GeoObjectInspectionMetadata.ObjectType> list) {
        if (list != null) {
            this.types = list;
            return this;
        }
        ny61.g("Required field \"types\" cannot be null");
        return null;
    }

    public IntrospectionFilter() {
        this.rect = null;
        List list = Collections.EMPTY_LIST;
        this.dataSourceNames = list;
        this.types = list;
    }
}
