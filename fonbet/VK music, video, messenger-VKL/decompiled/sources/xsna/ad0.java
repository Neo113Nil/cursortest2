package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.compose.runtime.a;
import com.google.android.gms.internal.measurement.zznn;
import com.ironsource.X3;
import com.vk.api.generated.tabbar.dto.TabbarItemNameDto;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MessageSource;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.attachment.AttachmentStyle;
import com.vk.feed.core.models.attachment.ChipAttachmentStyle;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.NewsEntryWithAttachments;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import okhttp3.Interceptor;
import okhttp3.p;
import xsna.wkj;

/* compiled from: AdBehaviorConfig.kt */
/* loaded from: classes18.dex */
public final class ad0 implements kwn, q701, gn60, io.reactivex.rxjava3.functions.c {
    public static se8 d;
    public static eh8 e;
    public static boolean f;
    public static ixd g;
    public static final ad0 b = new ad0();
    public static final ad0 c = new ad0();
    public static final jai h = new jai(-32438219, new bei(1), false);
    public static final ad0 i = new ad0();
    public static final /* synthetic */ ad0 j = new ad0();

    public static boolean A(NewsEntry newsEntry, NewsEntry newsEntry2) {
        boolean z = z(newsEntry, newsEntry2);
        return z || (!z && !(newsEntry2 instanceof ShitAttachment) && !(newsEntry instanceof ShitAttachment));
    }

    public static final boolean B(ChannelType channelType) {
        return channelType == ChannelType.COMMUNITY_CHANNEL || channelType == ChannelType.PERSONAL_CHANNEL;
    }

    public static String C(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static void D(UserId userId, int i2, List list) {
        List<Parcelable> list2 = list;
        ArrayList<VideoFile> arrayList = new ArrayList(c5g.u(list2, 10));
        for (Parcelable parcelable : list2) {
            if (parcelable instanceof ClipVideoFile) {
                ClipVideoFile clipVideoFile = (ClipVideoFile) parcelable;
                List<ClipsDraftablePlaylist> list3 = clipVideoFile.M1;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list3) {
                    ClipsDraftablePlaylist clipsDraftablePlaylist = (ClipsDraftablePlaylist) obj;
                    if (!epx.f(clipsDraftablePlaylist.e, userId) || clipsDraftablePlaylist.b != i2) {
                        arrayList2.add(obj);
                    }
                }
                parcelable = ClipVideoFile.Kb(clipVideoFile, false, null, arrayList2, null, null, null, null, 8372223);
            }
            arrayList.add(parcelable);
        }
        for (VideoFile videoFile : arrayList) {
            if (videoFile instanceof ClipVideoFile) {
                wjs0.a(new fyr0(videoFile));
            }
        }
    }

    public static boolean E(NewsEntry newsEntry) {
        List<EntryAttachment> Gb;
        int i2;
        NewsEntryWithAttachments newsEntryWithAttachments = newsEntry instanceof NewsEntryWithAttachments ? (NewsEntryWithAttachments) newsEntry : null;
        if (newsEntryWithAttachments != null && (Gb = newsEntryWithAttachments.Gb()) != null) {
            List<EntryAttachment> list = Gb;
            if ((list instanceof Collection) && list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    AttachmentStyle attachmentStyle = ((EntryAttachment) it.next()).c;
                    if ((attachmentStyle instanceof ChipAttachmentStyle) && ((ChipAttachmentStyle) attachmentStyle).c && (i2 = i2 + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            if (i2 >= 3) {
                return true;
            }
        }
        return false;
    }

    public static xy2 F(ad0 ad0Var, List list) {
        ad0Var.getClass();
        tfx tfxVar = new tfx("tabbar.get", new nq(27), new hun0(0));
        if (list != null) {
            tfxVar.i("active_features", list);
        }
        return tfxVar;
    }

    public static xy2 G(ad0 ad0Var, List list) {
        ad0Var.getClass();
        tfx tfxVar = new tfx("tabbar.getSettings", new rjk0(5), new fbj0(4));
        if (list != null) {
            tfxVar.i("active_features", list);
        }
        return tfxVar;
    }

    public static final Collection J(Collection collection, MessageSource messageSource) {
        Collection collection2 = collection;
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            ((Msg) it.next()).A = messageSource;
        }
        return collection2;
    }

    public static final void K(nuu nuuVar, MessageSource messageSource) {
        Msg G0 = nuuVar.G0();
        if (G0 != null) {
            G0.A = messageSource;
        }
    }

    public static void L(long j2, int i2, ByteBuffer byteBuffer) {
        if (i2 == 1) {
            aqw.w((int) (j2 & 255), byteBuffer);
            return;
        }
        if (i2 == 2) {
            aqw.u((int) (j2 & 65535), byteBuffer);
            return;
        }
        if (i2 == 3) {
            aqw.v((int) (j2 & 16777215), byteBuffer);
        } else if (i2 == 4) {
            byteBuffer.putInt((int) j2);
        } else {
            if (i2 != 8) {
                throw new RuntimeException(tgw.b(i2, "I don't know how to read ", " bytes"));
            }
            byteBuffer.putLong(j2);
        }
    }

    public static final long b(float f2, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void c(com.vk.mvi.binder.a aVar, izs izsVar) {
        com.vk.mvi.binder.c cVar = new com.vk.mvi.binder.c(h3q.c);
        s3q0 s3q0Var = s3q0.a;
        ArrayList arrayList = cVar.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((uic) it.next()).clear();
        }
        arrayList.clear();
        cVar.b = aVar;
        izsVar.invoke(cVar);
        s3q0 s3q0Var2 = s3q0.a;
    }

    public static final void d(dql dqlVar, o2q0 o2q0Var) {
        String str = o2q0Var.d;
        boolean z = o2q0Var.i;
        boolean z2 = o2q0Var.g;
        if (!o2q0Var.h) {
            h(dqlVar, z2, z, str, o2q0Var.c);
            return;
        }
        if (o2q0Var.k) {
            dqlVar.o(R.drawable.vk_icon_check_circle_outline_56, R.attr.vk_ui_icon_positive, dqlVar.getContext().getString(R.string.unavailable_tab_title_friend_added, str), z2 ? dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_following_f) : dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_following_m));
            return;
        }
        if (z) {
            int i2 = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        }
        if (z) {
            dqlVar.o(R.drawable.vk_icon_check_circle_outline_56, R.attr.vk_ui_icon_positive, dqlVar.getContext().getString(R.string.unavailable_tab_title_following, str), z2 ? dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_following_f) : dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_following_m));
        }
    }

    public static final void f(dql dqlVar, o2q0 o2q0Var, q7 q7Var) {
        if (o2q0Var.b || o2q0Var.k || o2q0Var.i) {
            dqlVar.setBottom((VkPlaceholder.a) null);
            return;
        }
        if (!o2q0Var.h) {
            ComFeatures comFeatures = ComFeatures.COM_FOLLOWERS_ONLINE_TAB;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                dqlVar.n(null, dqlVar.getContext().getString(R.string.follow), new qkd0(q7Var, 15));
                return;
            }
        }
        if (o2q0Var.j) {
            dqlVar.n(Integer.valueOf(R.drawable.vk_icon_user_add_outline_24), dqlVar.getContext().getString(R.string.add_to_friends), new hbj0(q7Var, 13));
        } else {
            dqlVar.n(Integer.valueOf(R.drawable.vk_icon_add_square_outline_24), dqlVar.getContext().getString(R.string.follow), new pwh0(q7Var, 15));
        }
    }

    public static final void g(dql dqlVar, String str, boolean z, String str2) {
        dqlVar.o(R.drawable.vk_icon_users_outline_56, R.attr.vk_ui_icon_secondary, str, z ? dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_add_friend_suggestion_f, str2) : dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_add_friend_suggestion_m, str2));
    }

    public static final void h(dql dqlVar, boolean z, boolean z2, String str, String str2) {
        if (!z2) {
            ComFeatures comFeatures = ComFeatures.COM_FOLLOWERS_ONLINE_TAB;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                dqlVar.o(R.drawable.vk_icon_lock_outline_56, R.attr.vk_ui_icon_secondary, dqlVar.getContext().getString(R.string.unavailable_tab_title_closed_profile_short), dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_closed_profile_add_friend));
                return;
            }
        }
        if (!z2) {
            int i2 = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        }
        if (!z2) {
            dqlVar.o(R.drawable.vk_icon_lock_outline_56, R.attr.vk_ui_icon_secondary, dqlVar.getContext().getString(R.string.unavailable_tab_title_closed_profile, str2), z ? dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_closed_profile_f, str) : dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_closed_profile_m, str));
            return;
        }
        int i3 = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen2 = LegoCustomRedesignedScreen.EXAMPLE;
        dqlVar.o(R.drawable.vk_icon_check_circle_outline_56, R.attr.vk_ui_icon_positive, dqlVar.getContext().getString(R.string.unavailable_tab_title_following, str), z ? dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_closed_profile_following_f, str2) : dqlVar.getContext().getString(R.string.unavailable_tab_subtitle_closed_profile_following_m, str2));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static xsna.pc30 i(xsna.g8r r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.ad0.i(xsna.g8r):xsna.pc30");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.xx70] */
    public static xx70 j(final BaseHttpHeadersHolder baseHttpHeadersHolder) {
        return new Interceptor() { // from class: xsna.xx70
            @Override // okhttp3.Interceptor
            public final okhttp3.u intercept(Interceptor.a aVar) {
                p.a b2 = aVar.request().b();
                for (Map.Entry<String, String> entry : BaseHttpHeadersHolder.this.get().entrySet()) {
                    b2.a(entry.getKey(), entry.getValue());
                }
                return aVar.a(b2.b());
            }
        };
    }

    public static void k() {
        mcd mcdVar = new mcd(0, o25.a(), b25.class, "isLoggedIn", "isLoggedIn()Z", 0, 2);
        rvq rvqVar = new rvq(15);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        new w970(mcdVar, rvqVar, context);
    }

    public static final int l(int i2, View view) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object m = fvr.m(view);
            view = m instanceof View ? (View) m : null;
        }
        return i4;
    }

    public static final View m(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int min = Math.min(l(R.id.view_tree_lifecycle_owner, view), l(R.id.view_tree_saved_state_registry_owner, view));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == min) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (q(view) == null) {
                i2++;
                Object m = fvr.m(view);
                View view4 = view2;
                view2 = view;
                view = m instanceof View ? (View) m : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final ArrayList n(mla mlaVar) {
        ArrayList arrayList = new ArrayList();
        while (mlaVar != null) {
            String str = mlaVar.c;
            if (str.equals(X3.i.Z)) {
                break;
            }
            arrayList.add(str);
            mlaVar = mlaVar.a();
        }
        return arrayList;
    }

    public static Pair o(NewsEntry newsEntry) {
        Owner owner;
        if (!(newsEntry instanceof Post) || (owner = ((Post) newsEntry).q) == null) {
            return new Pair(null, "");
        }
        String a = cqm0.a(owner.h);
        String a2 = cqm0.a(owner.i);
        return new Pair(a, a2 != null ? a2 : "");
    }

    public static List p(NewsEntry newsEntry) {
        if (!(newsEntry instanceof NewsEntryWithAttachments)) {
            return EmptyList.b;
        }
        List<EntryAttachment> Gb = ((NewsEntryWithAttachments) newsEntry).Gb();
        ArrayList arrayList = new ArrayList();
        for (Object obj : Gb) {
            AttachmentStyle attachmentStyle = ((EntryAttachment) obj).c;
            ChipAttachmentStyle chipAttachmentStyle = attachmentStyle instanceof ChipAttachmentStyle ? (ChipAttachmentStyle) attachmentStyle : null;
            if (chipAttachmentStyle != null && chipAttachmentStyle.c) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final iri q(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (iri) weakReference.get();
        }
        return null;
    }

    public static cqj0 r(Exception exc) {
        cqj0 cqj0Var = new cqj0();
        exc.getClass();
        cqj0Var.h(exc, null);
        return cqj0Var;
    }

    public static u8p0 s(lg90 lg90Var, long j2, Drawable drawable, d6g d6gVar, String str, wkj wkjVar, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i2) {
        if ((i2 & 2) != 0) {
            j2 = 9205357640488583168L;
        }
        long j3 = j2;
        Drawable drawable2 = (i2 & 4) != 0 ? null : drawable;
        d6g d6gVar2 = (i2 & 8) != 0 ? null : d6gVar;
        String str2 = (i2 & 16) != 0 ? null : str;
        wkj wkjVar2 = (i2 & 32) != 0 ? null : wkjVar;
        SemanticsConfiguration semanticsConfiguration2 = (i2 & 64) != 0 ? null : semanticsConfiguration;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1747626838, 12582920, -1, "com.vk.core.compose.component.placeholder.Placeholder.Top.Image.Companion.invoke (Placeholder.kt:88)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1297182379, 70, -1, "com.vk.core.compose.component.placeholder.remember (TopImageImpl.kt:64)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        wkj.a.e eVar = wkj.a.b;
        if (x == c0012a) {
            u8p0 u8p0Var = new u8p0(lg90Var, j3, drawable2, d6gVar2, str2, wkjVar2 == null ? eVar : wkjVar2, semanticsConfiguration2);
            aVar.R(u8p0Var);
            x = u8p0Var;
        }
        u8p0 u8p0Var2 = (u8p0) x;
        ((zak0) u8p0Var2.a).setValue(lg90Var);
        ((zak0) u8p0Var2.b).setValue(new uco(j3));
        ((zak0) u8p0Var2.c).setValue(drawable2);
        ((zak0) u8p0Var2.d).setValue(d6gVar2);
        ((zak0) u8p0Var2.e).setValue(str2);
        if (wkjVar2 == null) {
            wkjVar2 = eVar;
        }
        ((zak0) u8p0Var2.f).setValue(wkjVar2);
        ((zak0) u8p0Var2.g).setValue(semanticsConfiguration2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return u8p0Var2;
    }

    public static boolean t(CharSequence charSequence, String str) {
        if (charSequence.length() != 0 && str.length() != 0 && str.length() <= charSequence.length()) {
            char charAt = str.charAt(0);
            int length = charSequence.length() - str.length();
            int i2 = 0;
            while (i2 <= length) {
                if (charSequence.charAt(i2) != charAt) {
                    do {
                        i2++;
                        if (i2 > length) {
                            break;
                        }
                    } while (charSequence.charAt(i2) != charAt);
                }
                if (i2 <= length) {
                    int i3 = i2 + 1;
                    int length2 = (str.length() + i3) - 1;
                    for (int i4 = 1; i3 < length2 && charSequence.charAt(i3) == str.charAt(i4); i4++) {
                        i3++;
                    }
                    if (i3 == length2) {
                        return true;
                    }
                }
                i2++;
            }
        }
        return false;
    }

    public static boolean u(@Nullable Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean v(NewsEntry newsEntry, NewsEntry newsEntry2) {
        if (z(newsEntry, newsEntry2)) {
            return true;
        }
        if (!(newsEntry2 instanceof ShitAttachment) && !(newsEntry instanceof ShitAttachment)) {
            Post post = newsEntry2 instanceof Post ? (Post) newsEntry2 : null;
            if (!epx.f(post != null ? post.t : null, "reply")) {
                return true;
            }
        }
        return false;
    }

    public static boolean w() {
        return qu5.c().d() > 1;
    }

    public static boolean y(@Nullable Collection collection) {
        return !u(collection);
    }

    public static boolean z(NewsEntry newsEntry, NewsEntry newsEntry2) {
        if (newsEntry instanceof Post) {
            Post post = (Post) newsEntry;
            if (post.dc() || post.F) {
                return true;
            }
        }
        if (!(newsEntry2 instanceof Post)) {
            return false;
        }
        Post post2 = (Post) newsEntry2;
        return post2.dc() || post2.F;
    }

    public tfx H(UserId userId, ArrayList arrayList, List list) {
        tfx tfxVar = new tfx("tabbar.setSettings", new pq(22), new iun0(0));
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TabbarItemNameDto) it.next()).i());
        }
        tfxVar.i("items", arrayList2);
        if (userId != null) {
            tfx.n(tfxVar, "pinned_group_owner_id", userId, 0L, 0L, 12);
        }
        if (list != null) {
            tfxVar.i("active_features", list);
        }
        return tfxVar;
    }

    public List I(int i2, Triple triple) {
        float height;
        wjz0 content;
        lhz0 lhz0Var;
        ArrayList arrayList;
        nnx nnxVar;
        MyTargetNativeAdEntry myTargetNativeAdEntry = (MyTargetNativeAdEntry) triple.d();
        VideoAttachment videoAttachment = (VideoAttachment) triple.g();
        int intValue = ((Number) triple.h()).intValue();
        gjx gjxVar = myTargetNativeAdEntry.B;
        if (gjxVar == null) {
            return EmptyList.b;
        }
        if (videoAttachment.C2()) {
            height = 1.3333334f;
        } else {
            gjx gjxVar2 = myTargetNativeAdEntry.B;
            height = (gjxVar2 == null || (content = gjxVar2.getContent()) == null || (lhz0Var = content.g) == null || (arrayList = lhz0Var.c) == null || (nnxVar = (nnx) j5g.b0(0, arrayList)) == null) ? 1.0f : nnxVar.getHeight() / nnxVar.getWidth();
        }
        return Collections.singletonList(new qr50(gjxVar, myTargetNativeAdEntry, sni.t(videoAttachment), height, intValue));
    }

    @Override // xsna.kwn
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(Pair pair, zzs zzsVar, androidx.compose.runtime.a aVar, int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(2032908303);
        if ((i2 & 6) == 0) {
            i3 = (M.J(pair) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(zzsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2032908303, i3, -1, "com.vk.design.demo.presentation.screens.DonutUserStackContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (DonutUserStackContent.kt:124)");
            }
            zzsVar.invoke(fwu0.l(null, (String) pair.i(), null, null, M, 0, 61), pair.j(), M, Integer.valueOf(((i3 << 3) & 896) | 8));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sol(i2, 1, this, pair, zzsVar);
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        ((Number) obj2).longValue();
        return (Pair) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return I(0, (Triple) pair);
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzj());
    }
}
