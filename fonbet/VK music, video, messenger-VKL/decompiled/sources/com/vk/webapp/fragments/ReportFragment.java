package com.vk.webapp.fragments;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.JavascriptInterface;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.ahn;
import xsna.arm0;
import xsna.ce60;
import xsna.epx;
import xsna.er;
import xsna.f370;
import xsna.fkq0;
import xsna.fvv0;
import xsna.h4l0;
import xsna.i1v0;
import xsna.jyp0;
import xsna.nf6;
import xsna.oz50;
import xsna.p870;
import xsna.po40;
import xsna.r6y;
import xsna.s3q0;
import xsna.wwv0;

/* compiled from: ReportFragment.kt */
/* loaded from: classes7.dex */
public final class ReportFragment extends VKSuperAppBrowserFragment {
    public static final /* synthetic */ int a0 = 0;

    /* compiled from: ReportFragment.kt */
    public static final class a extends d {
    }

    /* compiled from: ReportFragment.kt */
    public static final class b {
        public static a a() {
            a aVar = new a(ReportFragment.class, null, null);
            Uri.Builder a = er.a(HttpRequest.DEFAULT_SCHEME);
            int i = VKSuperAppBrowserFragment.Y;
            aVar.m = a.authority(VKSuperAppBrowserFragment.a.a()).appendPath("reports").appendEncodedPath("").build();
            aVar.N();
            return aVar;
        }
    }

    /* compiled from: ReportFragment.kt */
    public final class c extends r6y {
        public fvv0 d0;
        public final po40 e0;
        public final /* synthetic */ ReportFragment f0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ReportFragment reportFragment, fvv0 fvv0Var) {
            super(fvv0Var);
            po40 po40Var = new po40();
            this.f0 = reportFragment;
            this.d0 = fvv0Var;
            this.e0 = po40Var;
        }

        @Override // xsna.x6y
        public final fvv0 M() {
            return this.d0;
        }

        @Override // xsna.x6y
        public final void O(fvv0 fvv0Var) {
            this.d0 = fvv0Var;
        }

        @Override // xsna.r6y, xsna.x6y, xsna.q2y
        @JavascriptInterface
        public void VKWebAppClose(String str) {
            JSONObject jSONObject;
            Boolean q;
            ReportFragment reportFragment = this.f0;
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable unused) {
            }
            if (jSONObject.length() == 0) {
                super.VKWebAppClose(str);
                return;
            }
            String D = f370.D(jSONObject, "status");
            p870.f().d(9, 1010, D);
            JSONObject optJSONObject = jSONObject.optJSONObject("payload");
            boolean booleanValue = (optJSONObject == null || (q = f370.q(optJSONObject, "contentReported")) == null) ? false : q.booleanValue();
            if (epx.f(D, "success")) {
                int i = ReportFragment.a0;
                Bundle arguments = reportFragment.getArguments();
                NewsEntry newsEntry = arguments != null ? (NewsEntry) arguments.getParcelable("ads_item") : null;
                if (newsEntry != null) {
                    ce60.b.getClass();
                    p870 f = p870.f();
                    Bundle arguments2 = reportFragment.getArguments();
                    f.e(100, arguments2 != null ? (NewsEntry) arguments2.getParcelable("ads_item") : null);
                    h4l0.a.a(jyp0.a);
                    a0(newsEntry);
                }
                Z();
            }
            if (booleanValue) {
                Z();
            }
            super.VKWebAppClose(str);
        }

        public final void Z() {
            Parcelable parcelable;
            UserId userId;
            Bundle bundle = new Bundle();
            ReportFragment reportFragment = this.f0;
            Bundle arguments = reportFragment.getArguments();
            bundle.putString("type", arguments != null ? arguments.getString("type") : null);
            Bundle arguments2 = reportFragment.getArguments();
            if (arguments2 != null && arguments2.containsKey("uid")) {
                Bundle arguments3 = reportFragment.getArguments();
                if (arguments3 == null || (userId = (UserId) arguments3.getParcelable("uid")) == null) {
                    userId = UserId.d;
                }
                bundle.putParcelable("uid", userId);
            }
            Bundle arguments4 = reportFragment.getArguments();
            if (arguments4 != null && arguments4.containsKey("item_id")) {
                Bundle arguments5 = reportFragment.getArguments();
                bundle.putLong("item_id", arguments5 != null ? arguments5.getLong("item_id") : 0L);
            }
            Bundle arguments6 = reportFragment.getArguments();
            if (arguments6 != null && arguments6.containsKey("owner_id")) {
                Bundle arguments7 = reportFragment.getArguments();
                if (arguments7 == null || (parcelable = arguments7.getParcelable("owner_id")) == null) {
                    parcelable = UserId.d;
                }
                bundle.putParcelable("owner_id", parcelable);
            }
            p870.f().e(9, bundle);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a0(NewsEntry newsEntry) {
            boolean z = newsEntry instanceof ShitAttachment;
            Integer num = null;
            Integer valueOf = z ? Integer.valueOf(((ShitAttachment) newsEntry).i) : newsEntry instanceof PromoPost ? Integer.valueOf(((PromoPost) newsEntry).i) : newsEntry instanceof Html5Entry ? Integer.valueOf(((Html5Entry) newsEntry).i) : null;
            if (z) {
                num = Integer.valueOf(((ShitAttachment) newsEntry).j);
            } else if (newsEntry instanceof PromoPost) {
                num = Integer.valueOf(((PromoPost) newsEntry).j);
            } else if (newsEntry instanceof Html5Entry) {
                num = Integer.valueOf(((Html5Entry) newsEntry).j);
            }
            if (!(newsEntry instanceof DeprecatedStatisticInterface) || valueOf == null || num == null) {
                return;
            }
            DeprecatedStatisticInterface deprecatedStatisticInterface = (DeprecatedStatisticInterface) newsEntry;
            int intValue = valueOf.intValue();
            int intValue2 = num.intValue();
            this.e0.getClass();
            ahn.g(deprecatedStatisticInterface, 0, intValue, intValue2, "closed_by_user");
            ahn.g(deprecatedStatisticInterface, 0, intValue, intValue2, "hide");
        }
    }

    /* compiled from: ReportFragment.kt */
    public static abstract class d extends oz50 {
        public Uri m;

        public final void A(String str) {
            this.m = this.m.buildUpon().appendQueryParameter("ad_data", str).build();
            N();
        }

        public final void B(long j) {
            this.m = this.m.buildUpon().appendQueryParameter("app_id", String.valueOf(j)).build();
            N();
        }

        public final void C(UserId userId) {
            if (userId != null) {
                this.m = this.m.buildUpon().appendQueryParameter("group_id", String.valueOf(fkq0.a(userId).b)).build();
                N();
            }
        }

        public final void D(long j) {
            E(String.valueOf(j));
            this.j.putLong("item_id", j);
        }

        public final void E(String str) {
            this.m = this.m.buildUpon().appendQueryParameter("item_id", str).build();
            N();
        }

        public final void F(int i) {
            D(i);
        }

        public final void G(UserId userId) {
            this.m = this.m.buildUpon().appendQueryParameter("owner_id", String.valueOf(userId.b)).build();
            N();
            this.j.putParcelable("owner_id", userId);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r0v8, types: [xsna.s3q0] */
        public final void H(LinkedHashMap linkedHashMap) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                try {
                    switch (str.hashCode()) {
                        case -1411074055:
                            if (str.equals("app_id")) {
                                B(Long.parseLong(str2));
                                break;
                            } else {
                                this.m = this.m.buildUpon().appendQueryParameter(str, str2).build();
                                str2 = s3q0.a;
                                break;
                            }
                        case -147132913:
                            if (str.equals("user_id")) {
                                L(new UserId(Long.parseLong(str2)));
                                break;
                            } else {
                                this.m = this.m.buildUpon().appendQueryParameter(str, str2).build();
                                str2 = s3q0.a;
                                break;
                            }
                        case 112787:
                            if (str.equals("ref")) {
                                I(str2);
                                break;
                            } else {
                                this.m = this.m.buildUpon().appendQueryParameter(str, str2).build();
                                str2 = s3q0.a;
                                break;
                            }
                        case 3575610:
                            if (str.equals("type")) {
                                K(str2);
                                break;
                            } else {
                                this.m = this.m.buildUpon().appendQueryParameter(str, str2).build();
                                str2 = s3q0.a;
                                break;
                            }
                        case 506361563:
                            if (str.equals("group_id")) {
                                Long n = arm0.n(str2);
                                C(n != null ? new UserId(n.longValue()) : null);
                                break;
                            } else {
                                this.m = this.m.buildUpon().appendQueryParameter(str, str2).build();
                                str2 = s3q0.a;
                                break;
                            }
                        case 1663147559:
                            if (str.equals("owner_id")) {
                                G(new UserId(Long.parseLong(str2)));
                                break;
                            } else {
                                this.m = this.m.buildUpon().appendQueryParameter(str, str2).build();
                                str2 = s3q0.a;
                                break;
                            }
                        case 2116204999:
                            if (str.equals("item_id")) {
                                D(Long.parseLong(str2));
                                break;
                            } else {
                                this.m = this.m.buildUpon().appendQueryParameter(str, str2).build();
                                str2 = s3q0.a;
                                break;
                            }
                        default:
                            this.m = this.m.buildUpon().appendQueryParameter(str, str2).build();
                            str2 = s3q0.a;
                            break;
                    }
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Error while append qp: " + str + ':' + str2, th));
                    this.m = this.m.buildUpon().appendQueryParameter(str, str2).build();
                }
            }
            N();
        }

        public final void I(String str) {
            this.m = this.m.buildUpon().appendQueryParameter("ref", str).build();
            N();
        }

        public final void J(String str) {
            this.m = this.m.buildUpon().appendQueryParameter("track_code", str).build();
            N();
        }

        public final void K(String str) {
            this.m = this.m.buildUpon().appendQueryParameter("type", str).build();
            N();
            this.j.putString("type", str);
        }

        public final void L(UserId userId) {
            this.m = this.m.buildUpon().appendQueryParameter("user_id", String.valueOf(userId.b)).build();
            N();
            this.j.putParcelable("uid", userId);
        }

        public final void M(String str) {
            this.m = this.m.buildUpon().appendQueryParameter("video_time_code", str).build();
            N();
        }

        public final void N() {
            this.j.putString("key_url", this.m.toString());
        }

        public final void y(String str) {
            this.m = this.m.buildUpon().appendQueryParameter("ad_data", str).build();
            N();
        }

        public final void z(String str, NewsEntry newsEntry) {
            this.m = this.m.buildUpon().appendQueryParameter("ad_data", str).build();
            N();
            this.j.putParcelable("ads_item", newsEntry);
        }
    }

    /* compiled from: ReportFragment.kt */
    public static final class e extends nf6 {
        public final /* synthetic */ wwv0 b;

        public e(wwv0 wwv0Var) {
            this.b = wwv0Var;
        }

        @Override // xsna.nf6
        public final r6y a() {
            return new c(ReportFragment.this, this.b);
        }
    }

    @Override // com.vk.superapp.ui.miniapp.VKSuperAppBrowserFragment, xsna.ok8
    public final i1v0 z3(wwv0 wwv0Var) {
        return new e(wwv0Var);
    }
}
