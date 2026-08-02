package sg.bigo.ads.cg;

import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.an.f;
import sg.bigo.ads.an.n;
import sg.bigo.ads.cf.j;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes9.dex */
public final class f extends g implements sg.bigo.ads.an.f {
    public static final long a = s.c.a(2);
    private long e;
    private List<a> d = c();
    private long b = a;

    public static class a extends sg.bigo.ads.cg.a {
        private static final f.a<a> e = new f.a<a>() { // from class: sg.bigo.ads.cg.f.a.1
            @Override // sg.bigo.ads.an.f.a
            public final /* synthetic */ a a() {
                return new a();
            }
        };
        private String f;

        public a() {
        }

        @Override // sg.bigo.ads.cf.j, sg.bigo.ads.an.f
        public final void b(@NonNull Parcel parcel) {
            super.b(parcel);
            this.f = n.a(parcel, "");
        }

        public a(String str, String str2, boolean z, String str3) {
            super(str, str2, z);
            this.f = str3;
        }

        @Override // sg.bigo.ads.cf.j, sg.bigo.ads.an.f
        public final void a(@NonNull Parcel parcel) {
            super.a(parcel);
            parcel.writeString(this.f);
        }
    }

    @Nullable
    private j b(final String str) {
        j jVar;
        synchronized (this) {
            try {
                if (!l.a((Collection) this.d)) {
                    a aVar = (a) g.a(l.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.cg.f.1
                        @Override // java.lang.Comparable
                        public final /* synthetic */ int compareTo(a aVar2) {
                            a aVar3 = aVar2;
                            return (aVar3 == null || !aVar3.d || aVar3.b || !TextUtils.equals(aVar3.f, str)) ? 0 : 1;
                        }
                    }));
                    if (aVar != null) {
                        return aVar;
                    }
                    List a2 = l.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.cg.f.2
                        @Override // java.lang.Comparable
                        public final /* synthetic */ int compareTo(a aVar2) {
                            a aVar3 = aVar2;
                            return (aVar3 != null && aVar3.d && aVar3.b && TextUtils.equals(aVar3.f, str)) ? 1 : 0;
                        }
                    });
                    if (l.a((Collection) a2)) {
                        List a3 = l.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.cg.f.3
                            @Override // java.lang.Comparable
                            public final /* bridge */ /* synthetic */ int compareTo(a aVar2) {
                                a aVar3 = aVar2;
                                return (aVar3 == null || !aVar3.d || aVar3.b) ? 0 : 1;
                            }
                        });
                        if (l.a((Collection) a3)) {
                            jVar = (a) g.a(l.a(this.d, new Comparable<a>() { // from class: sg.bigo.ads.cg.f.4
                                @Override // java.lang.Comparable
                                public final /* bridge */ /* synthetic */ int compareTo(a aVar2) {
                                    a aVar3 = aVar2;
                                    return (aVar3 != null && aVar3.d && aVar3.b) ? 1 : 0;
                                }
                            }));
                            if (jVar != null) {
                            }
                        } else {
                            jVar = g.a((List<j>) a3);
                        }
                    } else {
                        jVar = g.a((List<j>) a2);
                    }
                    return jVar;
                }
                return null;
            } finally {
            }
        }
    }

    private static List<a> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("AWS", "https://ad-host-backup-asia.oss-ap-southeast-1.aliyuncs.com/uni/v2/au.pj", true, "asia"));
        arrayList.add(new a("AWS", "https://ad-host-backup-europe.oss-eu-central-1.aliyuncs.com/uni/v2/au.pj", true, "europe"));
        arrayList.add(new a("AWS", "https://ad-host-backup-america.oss-us-west-1.aliyuncs.com/uni/v2/au.pj", true, "america"));
        return arrayList;
    }

    @Override // sg.bigo.ads.cg.g
    @Nullable
    public final j a(String str) {
        if (l.a((Collection) this.d)) {
            return null;
        }
        return b(sg.bigo.ads.cf.h.a(str));
    }

    @Override // sg.bigo.ads.an.f
    public final void a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.b);
            n.a(parcel, this.d);
            parcel.writeLong(this.e);
        }
    }

    public final void b() {
        this.e = System.currentTimeMillis();
        synchronized (this) {
            try {
                if (!l.a((Collection) this.d)) {
                    Iterator<a> it = this.d.iterator();
                    while (it.hasNext()) {
                        it.next().d = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(@NonNull JSONObject jSONObject) {
        synchronized (this) {
            try {
                long max = Math.max(jSONObject.optLong("interval", a / 1000) * 1000, g.c);
                List<a> c = c();
                JSONArray optJSONArray = jSONObject.optJSONArray("urls");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        String optString = optJSONObject.optString("name", "");
                        String optString2 = optJSONObject.optString("url", "");
                        String optString3 = optJSONObject.optString(TtmlNode.TAG_REGION, "");
                        if (URLUtil.isNetworkUrl(optString2)) {
                            c.add(new a(optString, optString2, false, optString3));
                        }
                    }
                }
                this.b = max;
                this.d = c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // sg.bigo.ads.an.f
    public final void b(@NonNull Parcel parcel) {
        synchronized (this) {
            try {
                this.b = n.a(parcel, a);
                List<a> a2 = n.a(parcel, a.e);
                this.d = a2;
                if (l.a((Collection) a2)) {
                    this.d = c();
                }
                this.e = n.a(parcel, 0L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a() {
        return Math.abs(System.currentTimeMillis() - this.e) > this.b;
    }
}
