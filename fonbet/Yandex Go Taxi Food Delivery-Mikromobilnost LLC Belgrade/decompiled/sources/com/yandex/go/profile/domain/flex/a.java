package com.yandex.go.profile.domain.flex;

import com.yandex.go.profile.analytics.ProfileMenuAnalytics$Source;
import com.yandex.go.profile.domain.data.Sources;
import defpackage.fef0;
import defpackage.h3y;
import defpackage.i3m;
import defpackage.l1o;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.u1m;
import defpackage.uyj;
import defpackage.w511;
import defpackage.xzl;
import defpackage.zef0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class a implements i3m {
    public final tse a;
    public final zef0 b;
    public final ru.yandex.taxi.perf.b c;
    public final h3y d;
    public final String e;
    public final String f;

    public a(tse tseVar, zef0 zef0Var, ru.yandex.taxi.perf.b bVar, h3y h3yVar, String str, String str2) {
        this.a = tseVar;
        this.b = zef0Var;
        this.c = bVar;
        this.d = h3yVar;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    @Override // defpackage.i3m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDocumentApplied(l1o l1oVar, xzl xzlVar, List list) {
        Sources sources;
        int i;
        ProfileMenuAnalytics$Source profileMenuAnalytics$Source;
        String str;
        String str2;
        Long l = xzlVar.c.a;
        if (l == null || l.longValue() != 0) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.contains("fromFallback")) {
                sources = arrayList.contains("fromCache") ? Sources.CACHE : Sources.NETWORK;
                sjh sjhVar = uyj.a;
                tje.N(this.a, mdh.b, null, new ProfileDocumentTracker$onDocumentApplied$1(this, sources, null), 2);
                i = fef0.a[sources.ordinal()];
                if (i != 1) {
                    profileMenuAnalytics$Source = ProfileMenuAnalytics$Source.Fallback;
                } else if (i == 2) {
                    profileMenuAnalytics$Source = ProfileMenuAnalytics$Source.Cache;
                } else {
                    if (i != 3) {
                        w511.b();
                        return;
                    }
                    profileMenuAnalytics$Source = ProfileMenuAnalytics$Source.Network;
                }
                String c = this.c.c();
                zef0 zef0Var = this.b;
                zef0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("time_since_app_launch_sec", c);
                hashMap.put("source", profileMenuAnalytics$Source.getEventValue());
                hashMap.put("item_list", EmptyList.a);
                str = this.e;
                if (str != null) {
                    hashMap.put("service_name", str);
                }
                str2 = this.f;
                if (str2 != null) {
                    hashMap.put("extra_layout", str2);
                }
                zef0Var.a.a("ProfileMenu.Loaded", hashMap, 2, new HashMap());
            }
        }
        sources = Sources.FALLBACK;
        sjh sjhVar2 = uyj.a;
        tje.N(this.a, mdh.b, null, new ProfileDocumentTracker$onDocumentApplied$1(this, sources, null), 2);
        i = fef0.a[sources.ordinal()];
        if (i != 1) {
        }
        String c2 = this.c.c();
        zef0 zef0Var2 = this.b;
        zef0Var2.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("time_since_app_launch_sec", c2);
        hashMap2.put("source", profileMenuAnalytics$Source.getEventValue());
        hashMap2.put("item_list", EmptyList.a);
        str = this.e;
        if (str != null) {
        }
        str2 = this.f;
        if (str2 != null) {
        }
        zef0Var2.a.a("ProfileMenu.Loaded", hashMap2, 2, new HashMap());
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list) {
        if (((ArrayList) list).contains("fromNetwork")) {
            zef0 zef0Var = this.b;
            zef0Var.getClass();
            HashMap hashMap = new HashMap();
            String str = this.e;
            if (str != null) {
                hashMap.put("service_name", str);
            }
            String str2 = this.f;
            if (str2 != null) {
                hashMap.put("extra_layout", str2);
            }
            zef0Var.a.a("ProfileMenu.LoadingStarted", hashMap, 2, new HashMap());
        }
    }
}
