package xsna;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Trace;
import android.text.Spanned;
import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.measurement.zznz;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemColorDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderActionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderDescriptionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderImageDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTextDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedNewsfeedItemHeaderTooltipDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.video.dto.VideoNavigationDto;
import com.vk.api.generated.video.dto.VideoRecomInfoDto;
import com.vk.api.generated.video.dto.VideoSearchInfoDto;
import com.vk.api.generated.video.dto.VideoVideoTrackingInfoDto;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.header.HeaderTooltip;
import com.vk.log.L;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CommunityProfileContentGoodsViewHolder.kt */
/* loaded from: classes5.dex */
public final class rdi implements q701, kho, ea60 {
    public static volatile ScheduledExecutorService h;
    public static Context j;
    public static final jai b = new jai(-82179392, new qdi(0), false);
    public static final jai c = new jai(-888269893, new tx3(0, 1), false);
    public static final jai d = new jai(573680000, new uhd(2), false);
    public static final av70 e = new av70(5);
    public static final cbi f = new cbi(2);
    public static final rdi g = new rdi();
    public static final /* synthetic */ rdi i = new rdi();

    public static final ArrayList A(int i2, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            if (i3 != i2) {
                arrayList.add(obj);
            }
            i3 = i4;
        }
        return arrayList;
    }

    public static final void B(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.4f);
    }

    public static final void C(s8u0 s8u0Var, String str, h2v0 h2v0Var) {
        klv0 klv0Var = new klv0(VkTypographyToken.Headline1, VkColorToken.TextLink);
        StringBuilder sb = s8u0Var.a;
        s8u0Var.d(klv0Var, sb.length() - (str == null ? "" : str).length(), sb.length());
        if (h2v0Var != null) {
            int length = sb.length();
            if (str == null) {
                str = "";
            }
            s8u0Var.a(h2v0Var, length - str.length(), sb.length());
        }
    }

    public static final void D(s8u0 s8u0Var, String str, h2v0 h2v0Var) {
        s8u0Var.d(new klv0(VkTypographyToken.Headline1, VkColorToken.TextPrimary), 0, str.length());
        s8u0Var.a(h2v0Var, 0, str.length());
    }

    public static final void E() {
        F(s3q0.a);
    }

    public static final void F(Object obj) {
        L.l("This function is not implemented, but was called. Consider adding real or default implementation");
    }

    public static final String G(VideoVideoTrackingInfoDto videoVideoTrackingInfoDto) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        VideoNavigationDto d2 = videoVideoTrackingInfoDto.d();
        JSONObject jSONObject4 = null;
        if (d2 != null) {
            jSONObject = new JSONObject();
            jSONObject.putOpt("source_screen", d2.f());
            jSONObject.putOpt("source_block", d2.d());
            jSONObject.putOpt("source_prev_screen", d2.e());
        } else {
            jSONObject = null;
        }
        jSONObject3.putOpt(NotificationCompat.CATEGORY_NAVIGATION, jSONObject);
        VideoRecomInfoDto e2 = videoVideoTrackingInfoDto.e();
        if (e2 != null) {
            jSONObject2 = new JSONObject();
            jSONObject2.putOpt("feature_sampling_uuid", e2.d());
            List<Integer> e3 = e2.e();
            if (e3 != null) {
                jSONObject2.put("recom_sources", new JSONArray((Collection) e3));
            }
        } else {
            jSONObject2 = null;
        }
        jSONObject3.putOpt("recom_info", jSONObject2);
        VideoSearchInfoDto f2 = videoVideoTrackingInfoDto.f();
        if (f2 != null) {
            jSONObject4 = new JSONObject();
            jSONObject4.putOpt("search_query_id", f2.e());
            jSONObject4.putOpt("search_iid", f2.d());
        }
        jSONObject3.putOpt("search_info", jSONObject4);
        return jSONObject3.toString();
    }

    public static final ArrayList H(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final ArrayList I(int i2, Object obj, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        int i3 = 0;
        for (Object obj2 : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                e43.t();
                throw null;
            }
            if (i2 == i3) {
                obj2 = obj;
            }
            arrayList.add(obj2);
            i3 = i4;
        }
        return arrayList;
    }

    public static final int e(int i2, ci50 ci50Var) {
        int i3 = ci50Var.d - 1;
        int i4 = 0;
        while (i4 < i3) {
            int b2 = x9.b(i3, i4, 2, i4);
            Object[] objArr = ci50Var.b;
            int i5 = ((nox) objArr[b2]).a;
            if (i5 != i2) {
                if (i5 < i2) {
                    i4 = b2 + 1;
                    if (i2 < ((nox) objArr[i4]).a) {
                    }
                } else {
                    i3 = b2 - 1;
                }
            }
            return b2;
        }
        return i4;
    }

    public static final int f(androidx.compose.ui.node.f fVar, gt1 gt1Var) {
        androidx.compose.ui.node.f F0 = fVar.F0();
        if (F0 == null) {
            uzw.b("Child of " + fVar + " cannot be null when calculating alignment line");
        }
        if (fVar.J0().q().containsKey(gt1Var)) {
            Integer num = fVar.J0().q().get(gt1Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int g0 = F0.g0(gt1Var);
            if (g0 != Integer.MIN_VALUE) {
                F0.k = true;
                fVar.l = true;
                fVar.U0();
                F0.k = false;
                fVar.l = false;
                return g0 + ((int) (gt1Var instanceof icv ? F0.N0() & 4294967295L : F0.N0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final List g(List list) {
        return ttp0.f(list) ? list : new ArrayList(list);
    }

    public static final void h(SQLiteStatement sQLiteStatement, int i2, byte[] bArr) {
        if (bArr == null) {
            sQLiteStatement.bindNull(i2);
        } else {
            sQLiteStatement.bindBlob(i2, bArr);
        }
    }

    public static final void i(SQLiteStatement sQLiteStatement, int i2, boolean z) {
        sQLiteStatement.bindLong(i2, z ? 1L : 0L);
    }

    public static final void j(SQLiteStatement sQLiteStatement, int i2, Boolean bool) {
        if (bool == null) {
            sQLiteStatement.bindNull(i2);
        } else {
            i(sQLiteStatement, i2, bool.booleanValue());
        }
    }

    public static final void k(SQLiteStatement sQLiteStatement, int i2, Integer num) {
        if (num == null) {
            sQLiteStatement.bindNull(i2);
        } else {
            sQLiteStatement.bindLong(i2, num.intValue());
        }
    }

    public static final void l(SQLiteStatement sQLiteStatement, int i2, Long l) {
        if (l == null) {
            sQLiteStatement.bindNull(i2);
        } else {
            sQLiteStatement.bindLong(i2, l.longValue());
        }
    }

    public static final void m(SQLiteStatement sQLiteStatement, int i2, String str) {
        if (str == null) {
            sQLiteStatement.bindNull(i2);
        } else {
            sQLiteStatement.bindString(i2, str);
        }
    }

    public static final void n(long j2, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            if (o6j.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            xzw.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (o6j.i(j2) != Integer.MAX_VALUE) {
                return;
            }
            xzw.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final boolean o(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA table_info(" + str + ')', null);
        try {
            if (rawQuery.moveToFirst()) {
                while (!rawQuery.isAfterLast()) {
                    String string = rawQuery.getString(1);
                    String string2 = rawQuery.getString(2);
                    if (epx.f(string, str2)) {
                        if (brm0.B(str3, string2, true)) {
                            rawQuery.close();
                            return true;
                        }
                        throw new IllegalStateException(("Table " + str + " already contains column " + str2 + " with type " + string2).toString());
                    }
                    rawQuery.moveToNext();
                }
            }
            rawQuery.close();
            return false;
        } finally {
        }
    }

    public static final ez20 p(Activity activity, gzs gzsVar) {
        return new ez20(activity, new fz20(gzsVar));
    }

    public static final bxk q(String str) {
        String W = drm0.W(brm0.y(new Regex("y{1,4}").g(z23.c("M{1,2}", z23.c("d{1,2}", z23.c("[^dMy/\\-.]", str, ""), "dd"), "MM"), "yyyy"), "My", "M/y"), ".");
        return new bxk(W, new Regex("[/\\-.]").b(W).c.c(0).a.charAt(0));
    }

    public static final void r(SQLiteDatabase sQLiteDatabase) {
        s(sQLiteDatabase, new dxh(sQLiteDatabase, 4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0065, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        throw r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(SQLiteDatabase sQLiteDatabase, izs izsVar) {
        Trace.beginSection(ndp0.f("SQLiteDatabase.execTransactionDeferred"));
        try {
            Trace.beginSection(ndp0.f("SQLiteDatabase.beginTransactionDeferred"));
            sQLiteDatabase.beginTransactionDeferred();
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
            Trace.beginSection(ndp0.f("SQLiteDatabase.execTransactionDeferred action"));
            try {
                izsVar.invoke(sQLiteDatabase);
                Trace.endSection();
                sQLiteDatabase.setTransactionSuccessful();
                Trace.beginSection(ndp0.f("SQLiteDatabase.endTransaction"));
                sQLiteDatabase.endTransaction();
                Trace.endSection();
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0066, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        throw r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(SQLiteDatabase sQLiteDatabase, izs izsVar) {
        Trace.beginSection(ndp0.f("SQLiteDatabase.execTransactionImmediate"));
        try {
            Trace.beginSection(ndp0.f("SQLiteDatabase.beginTransactionImmediate"));
            sQLiteDatabase.beginTransactionNonExclusive();
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
            Trace.beginSection(ndp0.f("SQLiteDatabase.execTransactionImmediate action"));
            try {
                Object invoke = izsVar.invoke(sQLiteDatabase);
                Trace.endSection();
                sQLiteDatabase.setTransactionSuccessful();
                Trace.beginSection(ndp0.f("SQLiteDatabase.endTransaction"));
                sQLiteDatabase.endTransaction();
                Trace.endSection();
                return invoke;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        } finally {
        }
    }

    public static final void u() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-686234704, 0, -1, "com.vk.core.compose.component.defaults.<get-VkFormFieldDefaults> (VkFormFieldDefaults.kt:16)");
        }
        hn20 hn20Var = hn20.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static final boolean v(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static Description w(NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto, Map map) {
        Text text;
        ImagePhoto imagePhoto;
        NewsfeedNewsfeedItemHeaderTextDto g2 = newsfeedNewsfeedItemHeaderDescriptionDto.g();
        if (g2 != null) {
            String e2 = g2.e();
            NewsfeedNewsfeedItemColorDto d2 = g2.d();
            text = new Text(e2, d2 != null ? elg.b(d2) : null);
        } else {
            text = null;
        }
        NewsfeedNewsfeedItemHeaderImageDto f2 = newsfeedNewsfeedItemHeaderDescriptionDto.f();
        if (f2 != null) {
            List<PhotosPhotoSizesDto> g3 = f2.g();
            imagePhoto = new ImagePhoto(g3 != null ? elg.a(g3) : null, f2.e(), f2.f(), null, null);
        } else {
            imagePhoto = null;
        }
        NewsfeedNewsfeedItemHeaderActionDto e3 = newsfeedNewsfeedItemHeaderDescriptionDto.e();
        HeaderAction a = e3 != null ? ju60.a(e3, map) : null;
        NewsfeedNewsfeedItemHeaderTooltipDto i2 = newsfeedNewsfeedItemHeaderDescriptionDto.i();
        return new Description(text, imagePhoto, a, i2 != null ? new HeaderTooltip(i2.d()) : null, newsfeedNewsfeedItemHeaderDescriptionDto.d(), false, false, false, PsExtractor.AUDIO_STREAM, null);
    }

    public static final List x(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static final lm50 y(el50 el50Var, izs izsVar) {
        return el50Var.D(el50Var, new ngt(izsVar, 1));
    }

    public static final buv0 z(boolean z, izs izsVar, izs izsVar2, androidx.compose.runtime.a aVar, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = false;
        }
        if ((i3 & 2) != 0) {
            izsVar = null;
        }
        if ((i3 & 4) != 0) {
            izsVar2 = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(691455172, i2, -1, "com.vk.core.tool.onboarding.rememberVkOnboardingTooltipState (VkTooltip.kt:338)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new buv0(izsVar2, izsVar, z);
            aVar.R(x);
        }
        buv0 buv0Var = (buv0) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return buv0Var;
    }

    @Override // xsna.kho
    public void b(View view) {
        view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(100L).start();
    }

    @Override // xsna.kho
    public void d(View view) {
        view.animate().alpha(0.75f).scaleX(0.8f).scaleY(0.8f).setDuration(100L).start();
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zznz.zzd());
    }

    @Override // xsna.kho
    public void a(ArrayList arrayList) {
    }

    @Override // xsna.kho
    public void c(ArrayList arrayList) {
    }
}
