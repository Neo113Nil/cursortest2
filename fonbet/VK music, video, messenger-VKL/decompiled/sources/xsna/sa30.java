package xsna;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import android.widget.TextView;
import androidx.annotation.CheckResult;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.a;
import com.google.android.gms.internal.measurement.zznn;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.parsers.BadgesParsers;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.stories.model.mention.StoryHashtagSpan;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.player.api.helper.AudioPlayer;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Triple;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MotionLayoutKeyFrameSetScope.kt */
@vby
/* loaded from: classes7.dex */
public final class sa30 implements q701, gn60, kvu {
    public static final jai b = new jai(-1660865126, new rii(0), false);
    public static final /* synthetic */ sa30 c = new sa30();

    public static int A(NewsEntry newsEntry) {
        boolean z = false;
        if (newsEntry instanceof Post) {
            if (!BuildInfo.s() ? false : !((Post) newsEntry).b9()) {
                z = true;
            }
        }
        return z ? R.drawable.vk_icon_message_forward_outline_24 : R.drawable.vk_icon_share_outline_24;
    }

    public static long B(double d) {
        fxc0.q(D(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    public static String C(UserId userId) {
        if (fkq0.b(userId)) {
            return "club";
        }
        if (fkq0.d(userId)) {
            return CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE;
        }
        return null;
    }

    public static boolean D(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static final float E(float f, k9x k9xVar, k9x k9xVar2) {
        float f2 = k9xVar.c;
        float f3 = k9xVar.b;
        float f4 = k9xVar2.c;
        float f5 = k9xVar2.b;
        return (((f - f3) / (f2 - f3)) * (f4 - f5)) + f5;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 F() {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new xga0(4)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.schedulers.a.b());
    }

    public static io.reactivex.rxjava3.internal.operators.observable.j1 G() {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new xga0(4)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.schedulers.a.b()).U(new hhj0(new d220(20), 2));
    }

    public static ArrayList H(NewsEntry newsEntry, List list) {
        ArrayList q = p4g.q(i7o0.a(list));
        int indexOf = q.indexOf(newsEntry);
        if (indexOf != -1) {
            q.remove(indexOf);
            q.add(0, newsEntry);
        }
        return q;
    }

    public static void I(int i, ByteBuffer byteBuffer) {
        byteBuffer.position(i);
    }

    public static final void J(zs4 zs4Var, Context context, aw40 aw40Var, boolean z) {
        if (zs4Var.a.isReleased()) {
            zs4Var.a = z ? new hk80(context, aw40Var) : new l5q(context, aw40Var);
        }
        zs4Var.b = at4.READY;
    }

    public static final void K(zjt zjtVar, Uri uri) {
        L(zjtVar, uri != null ? uri.toString() : null);
    }

    public static final void L(h5u0 h5u0Var, String str) {
        if (str != null) {
            m900<String, WeakReference<h5u0>> m900Var = mlw.a;
            mlw.a.put(str, new WeakReference<>(h5u0Var));
        }
    }

    public static final void M(AudioPlayer audioPlayer, boolean z) {
        if (audioPlayer.isReleased()) {
            return;
        }
        audioPlayer.stop();
        if (z) {
            return;
        }
        audioPlayer.release();
    }

    public static void N(VKFromList vKFromList, ArrayList arrayList) {
        Iterator<T> it = vKFromList.iterator();
        while (it.hasNext()) {
            NewsEntry newsEntry = (NewsEntry) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (epx.f(newsEntry, (NewsEntry) it2.next())) {
                    it.remove();
                    break;
                }
            }
        }
    }

    public static io.reactivex.rxjava3.disposables.c O(int i, gzs gzsVar) {
        return io.reactivex.rxjava3.core.x.t(Math.max(1L, i - (System.currentTimeMillis() / 1000)), TimeUnit.SECONDS).m(asu0.a.d()).subscribe(new f50(new vth(1, gzsVar), 21));
    }

    public static final void P(AppBarLayout appBarLayout, Toolbar toolbar, TextView textView, String str, Integer num) {
        Context context = toolbar.getContext();
        if (textView != null) {
            textView.setText(str);
            jno0.c(textView, R.attr.toolbar_title_textColor);
            if (!BuildInfo.g()) {
                textView.setTextAppearance(R.style.VkIm_Toolbar_AppIm_Title);
            }
        } else {
            toolbar.setTitle(str);
            dhr0.a.getClass();
            dhr0.n0(toolbar, R.attr.toolbar_title_textColor);
        }
        if (num != null) {
            int intValue = num.intValue();
            abg0 abg0Var = dhr0.t;
            toolbar.setNavigationIcon(new baf0(abg0Var.d(intValue), abg0Var.c(R.attr.vk_legacy_header_tint)));
        }
        bwt0.e0(toolbar, 0, 0, 0, 0);
        bwt0.c0(e3m.d(R.attr.actionBarSize, context), appBarLayout);
    }

    public static boolean Q(vqt vqtVar, sd90 sd90Var) {
        String str = vqtVar.i;
        if (!(sd90Var instanceof mdp0)) {
            return false;
        }
        NewsComment newsComment = (NewsComment) j5g.k0(vqtVar.a);
        if (str == null || drm0.N(str)) {
            return false;
        }
        if (newsComment != null && epx.f(String.valueOf(newsComment.i), str)) {
            return false;
        }
        mdp0 mdp0Var = sd90Var != null ? (mdp0) sd90Var : null;
        return mdp0Var == null || !mdp0Var.c;
    }

    public static final q630 R(wzs wzsVar) {
        return new yco0(wzsVar);
    }

    public static ArrayList S(NewsEntry newsEntry, ArrayList arrayList) {
        ArrayList q = p4g.q(i7o0.a(arrayList));
        if (!q.isEmpty()) {
            int u = di60.u(newsEntry);
            int size = q.size();
            int i = 0;
            for (int i2 = 1; i2 < size; i2++) {
                NewsEntry newsEntry2 = (NewsEntry) q.get(i2);
                if (na60.e(newsEntry2) && u > di60.u(newsEntry2)) {
                    break;
                }
                i++;
            }
            if (i != 0) {
                q.remove(0);
                q.add(i, newsEntry);
            }
        }
        return q;
    }

    public static final int T(float f, float[] fArr, int i) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return !Float.isNaN(f2) ? 1 : 0;
    }

    public static io.reactivex.rxjava3.internal.operators.observable.m1 b(io.reactivex.rxjava3.core.q qVar) {
        io.reactivex.rxjava3.core.w b2 = io.reactivex.rxjava3.schedulers.a.b();
        return qVar.r0(b2).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public static io.reactivex.rxjava3.internal.operators.single.b0 c(io.reactivex.rxjava3.core.x xVar) {
        io.reactivex.rxjava3.core.w b2 = io.reactivex.rxjava3.schedulers.a.b();
        return xVar.q(b2).m(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public static final WallWithCounters d(int i, JSONObject jSONObject, int i2, int i3) {
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            return WallWithCounters.b;
        }
        String optString = jSONObject.optString("next_from");
        int optInt = jSONObject.optInt("count");
        ArrayList arrayList = new ArrayList();
        bis.j(optJSONArray, vj90.e(jSONObject), tci.r(jSONObject), BadgesParsers.b(jSONObject), arrayList);
        WallWithCounters wallWithCounters = new WallWithCounters(optString, i2, i, i3, optInt);
        wallWithCounters.addAll(arrayList);
        return wallWithCounters;
    }

    public static final kp7 e(f1m f1mVar, f1m f1mVar2, rgy rgyVar, lg90 lg90Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        rgy rgyVar2;
        lg90 lg90Var2;
        izs izsVar2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-527970939, i, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.bookingEditOneLineInput (BookingEditOneLineInput.kt:32)");
        }
        boolean J = aVar.J(f1mVar);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            rgyVar2 = rgyVar;
            lg90Var2 = lg90Var;
            izsVar2 = izsVar;
            kp7 kp7Var = new kp7(f1mVar, izsVar2, f1mVar2, rgyVar2, lg90Var2);
            aVar.R(kp7Var);
            x = kp7Var;
        } else {
            rgyVar2 = rgyVar;
            lg90Var2 = lg90Var;
            izsVar2 = izsVar;
        }
        kp7 kp7Var2 = (kp7) x;
        ((zak0) kp7Var2.b).setValue(izsVar2);
        ((zak0) kp7Var2.c).setValue(rgyVar2);
        ((zak0) kp7Var2.d).setValue(lg90Var2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return kp7Var2;
    }

    public static void g(VKFromList vKFromList, Integer num) {
        Iterator it = vKFromList.iterator();
        while (it.hasNext()) {
            NewsEntry newsEntry = (NewsEntry) it.next();
            if (na60.e(newsEntry)) {
                int u = di60.u(newsEntry);
                if (num != null && u == num.intValue() && !na60.f(newsEntry)) {
                    vKFromList.remove(newsEntry);
                    return;
                }
            }
        }
    }

    public static void h(WallWithCounters wallWithCounters, Integer num) {
        Iterator it = wallWithCounters.iterator();
        while (it.hasNext()) {
            NewsEntry newsEntry = (NewsEntry) it.next();
            if (newsEntry instanceof Post) {
                int i = ((Post) newsEntry).n;
                if (num != null && i == num.intValue() && !na60.f(newsEntry)) {
                    wallWithCounters.remove(newsEntry);
                    return;
                }
            }
        }
    }

    public static void i(ByteBuffer byteBuffer) {
        byteBuffer.clear();
    }

    public static final wh50 j(wax waxVar, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1805515472, i, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:63)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = androidx.compose.runtime.k.b(Boolean.FALSE);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && aVar.J(waxVar)) || (i & 6) == 4;
        Object x2 = aVar.x();
        if (z || x2 == c0012a) {
            x2 = new rvr(waxVar, wh50Var, null);
            aVar.R(x2);
        }
        bap.g(waxVar, (wzs) x2, aVar, i2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }

    public static kdy k() {
        return new kdy();
    }

    public static final void l(SQLiteDatabase sQLiteDatabase, izs izsVar) {
        rdi.t(sQLiteDatabase, izsVar);
    }

    public static final ArrayList m(Collection collection, at4 at4Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((zs4) obj).b == at4Var) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @CheckResult
    public static final Size n(Size size, Size size2) {
        if (size.getWidth() <= 0 || size.getHeight() <= 0) {
            return null;
        }
        float min = Math.min(size2.getWidth() / size.getWidth(), size2.getHeight() / size.getHeight());
        return new Size(an10.b(size.getWidth() * min), an10.b(size.getHeight() * min));
    }

    public static String o(long j) {
        return defpackage.k0.a(j, "im-attach-download-");
    }

    public static String p(long j) {
        return defpackage.k0.a(j, "im-channel-");
    }

    public static String q(long j) {
        return defpackage.k0.a(j, "im-dialog-archive-unarchive-");
    }

    public static String r(String str) {
        return "im-dialog-background-process-".concat(str);
    }

    public static String s(long j) {
        return defpackage.k0.a(j, "im-dialog-info-bar-hide-");
    }

    public static String t(long j) {
        return defpackage.k0.a(j, "im-dialog-notification-change-network-");
    }

    public static String u(long j) {
        return defpackage.k0.a(j, "im-dialog-read-changes-server-");
    }

    public static String v(long j) {
        return defpackage.k0.a(j, "im-group-can-send-to-me-change-network-");
    }

    public static String w(long j) {
        return defpackage.k0.a(j, "im-msg-attach-send-network-");
    }

    public static String y(long j) {
        return defpackage.k0.a(j, "im-msg-send-network-");
    }

    public static String z(int i, s1c0 s1c0Var) {
        if (i <= 0) {
            return null;
        }
        xah0 xah0Var = s1c0Var.q;
        Integer valueOf = xah0Var != null ? Integer.valueOf(xah0Var.b) : null;
        return (valueOf != null ? valueOf.intValue() : iah0.f().widthPixels) < 768 ? uqm0.o(i) : uqm0.f(i);
    }

    @Override // xsna.kvu
    public p0m0 a(String str) {
        return new StoryHashtagSpan(str);
    }

    @Override // xsna.kvu
    public Class f() {
        return StoryHashtagSpan.class;
    }

    @Override // xsna.gn60
    public List x(Pair pair, bp5 bp5Var) {
        NewsEntry newsEntry = (NewsEntry) pair.d();
        ArticleAttachment articleAttachment = (ArticleAttachment) pair.g();
        new egi();
        String i = egi.i(articleAttachment.f.h);
        Article article = articleAttachment.f;
        Owner owner = article.h;
        int i2 = (owner == null || !fkq0.b(owner.b)) ? R.string.article_author_user : R.string.article_author_group;
        Float s = di60.s(newsEntry);
        String str = "H," + (s != null ? s.floatValue() : 1.7777778f) + ":1";
        String str2 = article.f;
        if (str2 == null) {
            str2 = "";
        }
        return Collections.singletonList(new u9d0(str2, new Triple(null, Integer.valueOf(i2), i), article.l, str, mnh0.G(bp5Var)));
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzr());
    }
}
