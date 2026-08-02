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
public class Goals implements Serializable {
    private String call;
    private boolean call__is_initialized;
    private String cta;
    private boolean cta__is_initialized;
    private List<CustomGoal> customGoals;
    private boolean customGoals__is_initialized;
    private NativeObject nativeObject;
    private String route;
    private boolean route__is_initialized;
    private String site;
    private boolean site__is_initialized;
    private List<CustomGoal> socials;
    private boolean socials__is_initialized;

    public Goals(String str, String str2, String str3, String str4, List<CustomGoal> list, List<CustomGoal> list2) {
        this.call__is_initialized = false;
        this.route__is_initialized = false;
        this.cta__is_initialized = false;
        this.site__is_initialized = false;
        this.socials__is_initialized = false;
        this.customGoals__is_initialized = false;
        if (list == null) {
            ny61.g("Required field \"socials\" cannot be null");
            throw null;
        }
        if (list2 == null) {
            ny61.g("Required field \"customGoals\" cannot be null");
            throw null;
        }
        this.nativeObject = init(str, str2, str3, str4, list, list2);
        this.call = str;
        this.call__is_initialized = true;
        this.route = str2;
        this.route__is_initialized = true;
        this.cta = str3;
        this.cta__is_initialized = true;
        this.site = str4;
        this.site__is_initialized = true;
        this.socials = list;
        this.socials__is_initialized = true;
        this.customGoals = list2;
        this.customGoals__is_initialized = true;
    }

    private native String getCall__Native();

    private native String getCta__Native();

    private native List<CustomGoal> getCustomGoals__Native();

    public static String getNativeName() {
        return "yandex::maps::mapkit::search::Goals";
    }

    private native String getRoute__Native();

    private native String getSite__Native();

    private native List<CustomGoal> getSocials__Native();

    private native NativeObject init(String str, String str2, String str3, String str4, List<CustomGoal> list, List<CustomGoal> list2);

    public synchronized String getCall() {
        try {
            if (!this.call__is_initialized) {
                this.call = getCall__Native();
                this.call__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.call;
    }

    public synchronized String getCta() {
        try {
            if (!this.cta__is_initialized) {
                this.cta = getCta__Native();
                this.cta__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.cta;
    }

    public synchronized List<CustomGoal> getCustomGoals() {
        try {
            if (!this.customGoals__is_initialized) {
                this.customGoals = getCustomGoals__Native();
                this.customGoals__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.customGoals;
    }

    public synchronized String getRoute() {
        try {
            if (!this.route__is_initialized) {
                this.route = getRoute__Native();
                this.route__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.route;
    }

    public synchronized String getSite() {
        try {
            if (!this.site__is_initialized) {
                this.site = getSite__Native();
                this.site__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.site;
    }

    public synchronized List<CustomGoal> getSocials() {
        try {
            if (!this.socials__is_initialized) {
                this.socials = getSocials__Native();
                this.socials__is_initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.socials;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getCall(), true);
            archive.add(getRoute(), true);
            archive.add(getCta(), true);
            archive.add(getSite(), true);
            archive.add((List) getSocials(), false, (ArchivingHandler) new ClassHandler(CustomGoal.class));
            nzs.m(CustomGoal.class, archive, getCustomGoals(), false);
            return;
        }
        this.call = archive.add(this.call, true);
        this.call__is_initialized = true;
        this.route = archive.add(this.route, true);
        this.route__is_initialized = true;
        this.cta = archive.add(this.cta, true);
        this.cta__is_initialized = true;
        this.site = archive.add(this.site, true);
        this.site__is_initialized = true;
        this.socials = nzs.e(CustomGoal.class, archive, this.socials, false);
        this.socials__is_initialized = true;
        List<CustomGoal> e = nzs.e(CustomGoal.class, archive, this.customGoals, false);
        this.customGoals = e;
        this.customGoals__is_initialized = true;
        this.nativeObject = init(this.call, this.route, this.cta, this.site, this.socials, e);
    }

    public Goals() {
        this.call__is_initialized = false;
        this.route__is_initialized = false;
        this.cta__is_initialized = false;
        this.site__is_initialized = false;
        this.socials__is_initialized = false;
        this.customGoals__is_initialized = false;
    }

    private Goals(NativeObject nativeObject) {
        this.call__is_initialized = false;
        this.route__is_initialized = false;
        this.cta__is_initialized = false;
        this.site__is_initialized = false;
        this.socials__is_initialized = false;
        this.customGoals__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
