package com.google.gson.internal;

import defpackage.aqy;
import defpackage.zpy;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes11.dex */
public final class a extends AbstractSet {
    public final /* synthetic */ LinkedTreeMap a;

    public a(LinkedTreeMap linkedTreeMap) {
        this.a = linkedTreeMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        aqy a;
        if (obj instanceof Map.Entry) {
            LinkedTreeMap linkedTreeMap = this.a;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            aqy aqyVar = null;
            if (key != null) {
                try {
                    a = linkedTreeMap.a(key, false);
                } catch (ClassCastException unused) {
                }
                if (a != null && Objects.equals(a.A, entry.getValue())) {
                    aqyVar = a;
                }
                if (aqyVar == null) {
                    return true;
                }
            }
            a = null;
            if (a != null) {
                aqyVar = a;
            }
            if (aqyVar == null) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zpy(this.a, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(Object obj) {
        aqy a;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            LinkedTreeMap linkedTreeMap = this.a;
            aqy aqyVar = null;
            if (key != null) {
                try {
                    a = linkedTreeMap.a(key, false);
                } catch (ClassCastException unused) {
                }
                if (a != null && Objects.equals(a.A, entry.getValue())) {
                    aqyVar = a;
                }
                if (aqyVar != null) {
                    linkedTreeMap.c(aqyVar, true);
                    return true;
                }
            }
            a = null;
            if (a != null) {
                aqyVar = a;
            }
            if (aqyVar != null) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size;
    }
}
