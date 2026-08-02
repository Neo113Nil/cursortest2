package com.yandex.passport.sloth.ui.dependencies;

import android.util.Size;
import androidx.camera.core.impl.Timebase;
import com.squareup.moshi.Moshi;
import defpackage.d94;
import defpackage.e94;
import defpackage.g3r;
import defpackage.lrp0;
import defpackage.ny61;
import defpackage.uvj0;
import defpackage.uza;
import defpackage.uzn;
import defpackage.x4c;
import defpackage.zy11;
import java.io.File;
import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.Map;
import kotlin.Result;

/* loaded from: classes15.dex */
public final class m {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
        this.j = obj10;
    }

    public d94 a() {
        String str = ((String) this.a) == null ? " mimeType" : "";
        if (((Integer) this.b) == null) {
            str = str.concat(" profile");
        }
        if (((Timebase) this.c) == null) {
            str = str.concat(" inputTimebase");
        }
        if (((Size) this.d) == null) {
            str = str.concat(" resolution");
        }
        if (((Integer) this.e) == null) {
            str = str.concat(" colorFormat");
        }
        if (((e94) this.f) == null) {
            str = str.concat(" dataSpace");
        }
        if (((Integer) this.g) == null) {
            str = str.concat(" captureFrameRate");
        }
        if (((Integer) this.h) == null) {
            str = str.concat(" encodeFrameRate");
        }
        if (((Integer) this.i) == null) {
            str = str.concat(" IFrameInterval");
        }
        if (((Integer) this.j) == null) {
            str = str.concat(" bitrate");
        }
        if (str.isEmpty()) {
            return new d94((String) this.a, ((Integer) this.b).intValue(), (Timebase) this.c, (Size) this.d, ((Integer) this.e).intValue(), (e94) this.f, ((Integer) this.g).intValue(), ((Integer) this.h).intValue(), ((Integer) this.i).intValue(), ((Integer) this.j).intValue());
        }
        ny61.r("Missing required properties:".concat(str));
        return null;
    }

    public void b(String str) {
        Object failure;
        try {
            new File((File) this.g, str).delete();
            failure = Boolean.valueOf(new File((File) this.h, str.concat("_meta")).delete());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Failed to delete file from persistent storage", a, null, Collections.singletonList(lrp0.z), 4);
        }
    }

    public void c(Map map) {
        Object failure;
        try {
            uzn a = ((uvj0) this.c).a(((Moshi) this.a).adapter((ParameterizedType) this.i).toJson(map).getBytes(uza.a));
            g3r.f((File) this.e, a.b);
            g3r.g((File) this.f, a.a);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            x4c.g("Failed to save new common data", a2, null, Collections.singletonList(lrp0.z), 4);
        }
    }
}
