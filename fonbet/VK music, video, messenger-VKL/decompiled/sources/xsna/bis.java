package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Spannable;
import android.util.ArrayMap;
import android.util.SparseArray;
import android.view.View;
import com.vk.api.parsers.BadgesParsers;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.newsfeed.Caption;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.photo.Photo;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.parse.NewsfeedParseException;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.toggle.features.SmbAdFeatures;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FriendButtonTransformer.kt */
/* loaded from: classes16.dex */
public class bis implements gn60 {
    public static final Object b = new Object();
    public static boolean c = true;
    public static Field d;
    public static boolean e;

    public static final s0v0 a() {
        return new s0v0();
    }

    public static final String b(Context context, LocalMediaEntry localMediaEntry, gk gkVar, StringBuilder sb) {
        sb.setLength(0);
        if (localMediaEntry instanceof LocalMediaEntry.Image) {
            sb.append(context.getString(R.string.accessibility_photo));
        } else {
            if (!(localMediaEntry instanceof LocalMediaEntry.Video)) {
                throw new NoWhenBranchMatchedException();
            }
            sb.append(context.getString(R.string.accessibility_video));
        }
        long e2 = localMediaEntry.ba().e();
        if (e2 != 0) {
            sb.append(", ");
            sb.append(context.getString(R.string.accessibility_vk_photo_added, gkVar.a(e2)));
        }
        return sb.toString();
    }

    public static final String c(Context context, Photo photo, String str, StringBuilder sb, gk gkVar) {
        sb.setLength(0);
        sb.append(context.getString(R.string.accessibility_photo));
        long j = photo.g * 1000;
        if (str != null) {
            sb.append(", ");
            sb.append(context.getString(R.string.accessibility_vk_photo_album_name, str));
        }
        if (j != 0) {
            sb.append(", ");
            sb.append(context.getString(R.string.accessibility_vk_photo_added, gkVar.a(j)));
        }
        return sb.toString();
    }

    public static oz50 d(op20 op20Var) {
        mq20 mq20Var = op20Var.c;
        ApiApplication apiApplication = op20Var.a;
        Boolean bool = apiApplication.c0;
        Boolean bool2 = Boolean.TRUE;
        if (epx.f(bool, bool2)) {
            return new a2((int) apiApplication.b.b, true, apiApplication, mq20Var.a, mq20Var.b);
        }
        aq20 aq20Var = op20Var.e;
        String str = mq20Var.a;
        if (str == null) {
            str = "https://static.vkontakte.com/vkui-connect-test/";
        }
        String str2 = mq20Var.g;
        ApiApplication apiApplication2 = op20Var.a;
        if (str2 != null && str2.length() != 0) {
            str = str.concat(str2);
        }
        String str3 = str;
        iq20 iq20Var = op20Var.d;
        String str4 = iq20Var.b;
        Long l = aq20Var.a;
        String str5 = mq20Var.b;
        String str6 = iq20Var.a;
        Long l2 = aq20Var.b;
        String str7 = iq20Var.c;
        String str8 = mq20Var.d;
        BrowserPerfState browserPerfState = iq20Var.d;
        if (browserPerfState == null) {
            browserPerfState = new BrowserPerfState();
            iq20Var.d = browserPerfState;
        }
        egr0 egr0Var = new egr0(apiApplication2, str3, str4, str5, l, false, str6, l2, str7, str8, browserPerfState, mq20Var.e, aq20Var.k);
        if (epx.f(aq20Var.d, bool2)) {
            egr0Var.j.putBoolean("no_bottom_navigation", true);
        }
        return egr0Var;
    }

    public static oz50 e(bis bisVar, ApiApplication apiApplication, String str, String str2, String str3, BrowserPerfState browserPerfState) {
        return epx.f(apiApplication.c0, Boolean.TRUE) ? new a2((int) apiApplication.b.b, true, apiApplication, str, str3) : new egr0(apiApplication, str, str2, str3, null, true, null, null, null, null, browserPerfState, null, false);
    }

    public static jgr0 f(bis bisVar, String str, long j, int i) {
        thx a = uhx.a();
        if ((i & 4) != 0) {
            j = -1;
        }
        if (!a.equals(uhx.a())) {
            j = a.a;
        }
        return new jgr0(str, j, null, false, 28);
    }

    public static final ArrayList g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((MusicTrack) obj).B()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean i(long j, WebApiApplication webApiApplication) {
        boolean z;
        if (!(webApiApplication != null && webApiApplication.B)) {
            if (webApiApplication == null) {
                qex0 qex0Var = e370.y;
                if (qex0Var == null) {
                    qex0Var = null;
                }
                if (f870.F(qex0Var.b()).contains(Long.valueOf(j))) {
                    z = true;
                    if (z) {
                        return false;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return true;
    }

    public static final void j(JSONArray jSONArray, Map map, ArrayMap arrayMap, SparseArray sparseArray, ArrayList arrayList) {
        com.vk.dto.newsfeed.entries.a aVar = new com.vk.dto.newsfeed.entries.a();
        SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
        smbAdFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(smbAdFeatures);
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            Map map2 = map;
            ArrayMap arrayMap2 = arrayMap;
            SparseArray sparseArray2 = sparseArray;
            try {
                NewsEntry c2 = com.vk.dto.newsfeed.entries.a.c(aVar, jSONArray.getJSONObject(i), arrayMap2, sparseArray2, map2, a, 32);
                if (c2 != null) {
                    arrayList.add(c2);
                }
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(new NewsfeedParseException(th));
            }
            i++;
            arrayMap = arrayMap2;
            sparseArray = sparseArray2;
            map = map2;
        }
    }

    public static void k(ArrayList arrayList, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            return;
        }
        Map e2 = vj90.e(jSONObject);
        ArrayMap r = tci.r(jSONObject);
        SparseArray<BadgeItem> b2 = BadgesParsers.b(jSONObject);
        com.vk.dto.newsfeed.entries.a aVar = new com.vk.dto.newsfeed.entries.a();
        SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
        smbAdFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(smbAdFeatures);
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            try {
                NewsEntry b3 = com.vk.dto.newsfeed.entries.a.b(aVar, jSONObject2.optString("type", "post"), jSONObject2, r, b2, e2, a, null, 64);
                if (b3 != null) {
                    arrayList.add(b3);
                }
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b.a.a(new NewsfeedParseException(th));
            }
        }
    }

    public static Set l(int i) {
        return i >= 1000 ? new HashSet(i) : new el3(i);
    }

    public static final void p() {
        throw new UnsupportedOperationException();
    }

    @SuppressLint({"NewApi"})
    public float h(View view) {
        float transitionAlpha;
        if (c) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    public void m(View view, float f) {
        if (c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        view.setAlpha(f);
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public void n(int i, View view) {
        if (!e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    @Override // xsna.gn60
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public List x(NewsEntry newsEntry, wm60 wm60Var) {
        Integer num;
        CharSequence charSequence;
        boolean z;
        qaz[] qazVarArr;
        Caption caption = newsEntry instanceof Post ? ((Post) newsEntry).x : newsEntry instanceof PromoPost ? ((PromoPost) newsEntry).n.x : newsEntry instanceof Videos ? ((Videos) newsEntry).p : null;
        if (caption == null) {
            throw new IllegalArgumentException("This NewsEntry doesn't have a caption");
        }
        CharSequence n0 = hd60.a().n0(caption.c);
        if ((n0 instanceof Spannable) && (qazVarArr = (qaz[]) ((Spannable) n0).getSpans(0, n0.length(), qaz.class)) != null) {
            for (qaz qazVar : qazVarArr) {
                qazVar.b(R.attr.vk_ui_text_secondary);
            }
        }
        boolean x = di60.x(newsEntry);
        if (caption.f.length() <= 0 || caption.e.length() <= 0) {
            num = null;
            charSequence = n0;
            z = false;
        } else {
            num = null;
            charSequence = n0;
            z = true;
        }
        boolean z2 = !z && epx.f(caption.b, "fake_news");
        if (epx.f(caption.k, "info")) {
            num = Integer.valueOf(R.drawable.vk_icon_info_outline_16);
        }
        return Collections.singletonList(new sr9(charSequence, z, caption.f, caption.e, z2, false, x, false, num, newsEntry));
    }

    public void q() {
        xuo0.a.getClass();
        if (!xuo0.d || xuo0.b()) {
            return;
        }
        xuo0.e(((Number) bz2.c(new tni0(), null)).longValue());
    }
}
