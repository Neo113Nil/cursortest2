package com.vkontakte.android.data;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.log.L;
import com.vk.statistic.DeprecatedStatisticInterface;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.apl;
import xsna.efz;
import xsna.i5s;
import xsna.qni0;

/* loaded from: classes7.dex */
public class PostInteract extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PostInteract> CREATOR = new a();
    public final String b;
    public final String c;
    public final List<DeprecatedStatisticUrl> d;
    public final ArrayList e;
    public String f;
    public final String g;

    @Nullable
    public final String h;
    public String i;
    public String j;

    @Nullable
    public String k;
    public int l;

    @Nullable
    public final String m;
    public int n;
    public final apl o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type attached_link_click;
        public static final Type caption_link_click;
        public static final Type click_next;
        public static final Type click_pretty_card;
        public static final Type click_previous;
        public static final Type expand;
        public static final Type expand_attach;
        public static final Type hide;
        public static final Type link_click;
        public static final Type open;
        public static final Type open_audio;
        public static final Type open_group;
        public static final Type open_photo;
        public static final Type open_photo_popup;
        public static final Type open_user;
        public static final Type report;
        public static final Type snippet_action;
        public static final Type snippet_button_action;
        public static final Type textlives_button_action;
        public static final Type translation_click;
        public static final Type video_start;
        public static final Type vk_link_click;
        public static final Type zoom_photo;

        static {
            Type type = new Type("hide", 0);
            hide = type;
            Type type2 = new Type("report", 1);
            report = type2;
            Type type3 = new Type("expand", 2);
            expand = type3;
            Type type4 = new Type("open", 3);
            open = type4;
            Type type5 = new Type("open_user", 4);
            open_user = type5;
            Type type6 = new Type("open_group", 5);
            open_group = type6;
            Type type7 = new Type("link_click", 6);
            link_click = type7;
            Type type8 = new Type("vk_link_click", 7);
            vk_link_click = type8;
            Type type9 = new Type("open_audio", 8);
            open_audio = type9;
            Type type10 = new Type("open_photo", 9);
            open_photo = type10;
            Type type11 = new Type("zoom_photo", 10);
            zoom_photo = type11;
            Type type12 = new Type("video_start", 11);
            video_start = type12;
            Type type13 = new Type("snippet_button_action", 12);
            snippet_button_action = type13;
            Type type14 = new Type("snippet_action", 13);
            snippet_action = type14;
            Type type15 = new Type("attached_link_click", 14);
            attached_link_click = type15;
            Type type16 = new Type("click_pretty_card", 15);
            click_pretty_card = type16;
            Type type17 = new Type("expand_attach", 16);
            expand_attach = type17;
            Type type18 = new Type("click_next", 17);
            click_next = type18;
            Type type19 = new Type("click_previous", 18);
            click_previous = type19;
            Type type20 = new Type("textlives_button_action", 19);
            textlives_button_action = type20;
            Type type21 = new Type("open_photo_popup", 20);
            open_photo_popup = type21;
            Type type22 = new Type("caption_link_click", 21);
            caption_link_click = type22;
            Type type23 = new Type("translation_click", 22);
            translation_click = type23;
            $VALUES = new Type[]{type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public class a extends Serializer.c<PostInteract> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PostInteract a(@NonNull Serializer serializer) {
            return new PostInteract(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostInteract[i];
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Type.values().length];
            a = iArr;
            try {
                iArr[Type.link_click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Type.snippet_action.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Type.snippet_button_action.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Type.attached_link_click.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Type.click_pretty_card.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Type.vk_link_click.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public PostInteract(String str, Post post) {
        this(str, post.m, post.n, post.L.b);
    }

    @Nullable
    public static PostInteract Ab(String str, NewsEntry newsEntry) {
        int zb = newsEntry.zb();
        if (zb == 0) {
            return new PostInteract(str, (Post) newsEntry);
        }
        if (zb != 1) {
            if (zb == 2) {
                return new PostInteract(str, (Videos) newsEntry);
            }
            if (zb != 7 && zb != 9) {
                if (zb == 55) {
                    return new PostInteract(str, (UxPollsEntry) newsEntry);
                }
                if (zb == 11) {
                    return new PostInteract(str, (ShitAttachment) newsEntry);
                }
                if (zb != 12) {
                    return null;
                }
                return new PostInteract(str, (PromoPost) newsEntry);
            }
        }
        return new PostInteract(str, (Photos) newsEntry);
    }

    public final void Bb(Type type, String str, boolean z) {
        String str2 = this.b;
        String str3 = this.c;
        L.e(type, str2, str3);
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        b.d a2 = io.reactivex.rxjava3.processors.b.a("post_interaction", "post_id", str3);
        a2.b(type.name(), "action");
        a2.b(str2, "ref");
        String str4 = this.h;
        if (!TextUtils.isEmpty(str4)) {
            a2.b(str4, "track_code");
        }
        if (!TextUtils.isEmpty(str)) {
            a2.b(str, "link");
            if (str.equals(this.f)) {
                this.f = null;
            }
        }
        String str5 = this.g;
        if (!TextUtils.isEmpty(str5)) {
            a2.b(str5, "ad_data");
        }
        if (!TextUtils.isEmpty(this.i)) {
            a2.b(this.i, "card_data");
        }
        if (!TextUtils.isEmpty(this.j)) {
            a2.b(this.j, "element");
            this.j = null;
        }
        String str6 = this.m;
        if (!TextUtils.isEmpty(str6)) {
            a2.b(str6, "type");
        }
        if (!TextUtils.isEmpty(this.k)) {
            a2.b(this.k, "media_id");
            this.k = null;
        }
        int i = this.l;
        if (i != -1) {
            a2.b(Integer.valueOf(i), "carousel_offset");
            this.l = -1;
        }
        if (!TextUtils.isEmpty(null)) {
            a2.b(null, "subtype");
        }
        int i2 = this.n;
        if (i2 >= 0) {
            a2.b(Integer.valueOf(i2), X3.i.L);
        }
        this.o.getClass();
        a2.b(Long.valueOf(qni0.a() * 1000), "timestamp");
        if (z) {
            a2.h();
        } else {
            a2.e();
        }
    }

    public final void Cb(Type type) {
        Db(type, this.f);
    }

    public final void Db(Type type, String str) {
        ArrayList arrayList;
        Bb(type, str, true);
        int i = b.a[type.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            List<DeprecatedStatisticUrl> list = this.d;
            if (list != null) {
                Iterator<DeprecatedStatisticUrl> it = list.iterator();
                while (it.hasNext()) {
                    com.vkontakte.android.data.b.p(it.next());
                }
                return;
            }
            return;
        }
        if (i == 6 && (arrayList = this.e) != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it2.next());
            }
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.o0(this.d);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.m);
    }

    public final void zb(Type type) {
        ArrayList arrayList;
        Bb(type, this.f, false);
        int i = b.a[type.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            List<DeprecatedStatisticUrl> list = this.d;
            if (list != null) {
                Iterator<DeprecatedStatisticUrl> it = list.iterator();
                while (it.hasNext()) {
                    com.vkontakte.android.data.b.p(it.next());
                }
                return;
            }
            return;
        }
        if (i == 6 && (arrayList = this.e) != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it2.next());
            }
        }
    }

    public PostInteract(String str, PromoPost promoPost) {
        this.l = -1;
        this.n = -1;
        this.o = new apl();
        Post post = promoPost.n;
        this.b = str;
        this.c = post.m + BundleUtil.UNDERLINE_TAG + post.n;
        this.h = post.L.b;
        this.g = promoPost.l;
        DeprecatedStatisticInterface.a aVar = promoPost.v;
        this.d = aVar.b("click_post_link");
        this.e = aVar.b("click_post_link_internal");
        this.m = com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    public PostInteract(String str, ShitAttachment shitAttachment) {
        this.l = -1;
        this.n = -1;
        this.o = new apl();
        this.b = str;
        this.c = shitAttachment.j + BundleUtil.UNDERLINE_TAG + shitAttachment.i;
        this.h = "";
        this.g = shitAttachment.v;
        DeprecatedStatisticInterface.a aVar = shitAttachment.S;
        this.d = aVar.b("click_post_link");
        this.e = aVar.b("click_post_link_internal");
        this.m = com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    public PostInteract(String str, Photos photos) {
        this.l = -1;
        this.n = -1;
        this.o = new apl();
        this.b = str;
        this.c = photos.n + BundleUtil.UNDERLINE_TAG + photos.m;
        this.h = photos.w.b;
        this.g = null;
        this.d = null;
        this.e = null;
        this.m = photos.Db();
    }

    public PostInteract(String str, Videos videos) {
        this.l = -1;
        this.n = -1;
        this.o = new apl();
        this.b = str;
        this.c = efz.b(videos.l, "_0", new StringBuilder());
        this.h = videos.r();
        this.g = null;
        this.d = null;
        this.e = null;
        this.m = "video";
    }

    public PostInteract(String str, UxPollsEntry uxPollsEntry) {
        this.l = -1;
        this.n = -1;
        this.o = new apl();
        this.b = str;
        this.c = i5s.a(new StringBuilder(), uxPollsEntry.i, "_0");
        NewsEntry.TrackData trackData = uxPollsEntry.j;
        this.h = trackData != null ? trackData.b : null;
        this.g = null;
        this.d = null;
        this.e = null;
        this.m = uxPollsEntry.k;
    }

    public PostInteract(String str, UserId userId, int i, String str2) {
        this(str, userId, i, str2, null, null);
    }

    public PostInteract(String str, UserId userId, int i, String str2, String str3, List<DeprecatedStatisticUrl> list) {
        this.l = -1;
        this.n = -1;
        this.o = new apl();
        this.b = str;
        this.c = userId + BundleUtil.UNDERLINE_TAG + i;
        this.h = str2;
        this.g = str3;
        this.d = list;
        this.m = "post";
    }

    public PostInteract(Serializer serializer) {
        this.l = -1;
        this.n = -1;
        this.o = new apl();
        this.b = serializer.H();
        this.c = serializer.H();
        this.d = serializer.j(DeprecatedStatisticUrl.CREATOR);
        this.g = serializer.H();
        this.h = serializer.H();
        this.m = serializer.H();
    }
}
