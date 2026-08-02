package xsna;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vk.community.design.view.avatar.CommunityProfileAvatarViewContainer;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.l3h;
import xsna.qeh;
import xsna.xrh;

/* compiled from: CommunityAvatarViewDataDelegate.kt */
/* loaded from: classes5.dex */
public final class ksg {
    public final String a;
    public final h7v b;
    public final FunctionReferenceImpl c;
    public final FunctionReferenceImpl d;
    public final FunctionReferenceImpl e;
    public final FunctionReferenceImpl f;
    public final FunctionReferenceImpl g;
    public final Lifecycle h;
    public final f5z i;
    public boolean j;

    /* compiled from: CommunityAvatarViewDataDelegate.kt */
    public static abstract class a {
        public final int a;
        public final int b;

        /* compiled from: CommunityAvatarViewDataDelegate.kt */
        /* renamed from: xsna.ksg$a$a, reason: collision with other inner class name */
        public static final class C3202a extends a {
            public static final C3202a c = new C3202a(R.string.community_avatar_menu_option_change_photo, R.drawable.vk_icon_pen_outline_24);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3202a);
            }

            public final int hashCode() {
                return -1390772721;
            }

            public final String toString() {
                return "ChangePhoto";
            }
        }

        /* compiled from: CommunityAvatarViewDataDelegate.kt */
        public static final class b extends a {
            public static final b c = new b(R.string.community_avatar_menu_option_create_story, R.drawable.vk_icon_story_reply_outline_24);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -226747642;
            }

            public final String toString() {
                return "CreateStory";
            }
        }

        /* compiled from: CommunityAvatarViewDataDelegate.kt */
        public static final class c extends a {
            public static final c c = new c(R.string.community_avatar_menu_option_open_live, R.drawable.vk_icon_live_outline_24);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 261244873;
            }

            public final String toString() {
                return "OpenLive";
            }
        }

        /* compiled from: CommunityAvatarViewDataDelegate.kt */
        public static final class d extends a {
            public static final d c = new d(R.string.community_avatar_menu_option_open_photos, R.drawable.vk_icon_picture_outline_24);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 2061622302;
            }

            public final String toString() {
                return "OpenPhotos";
            }
        }

        /* compiled from: CommunityAvatarViewDataDelegate.kt */
        public static final class e extends a {
            public static final e c = new e(R.string.community_avatar_menu_option_open_stories, R.drawable.vk_icon_story_outline_24);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -1803190186;
            }

            public final String toString() {
                return "OpenStories";
            }
        }

        /* compiled from: CommunityAvatarViewDataDelegate.kt */
        public static final class f extends a {
            public static final f c = new f(R.string.community_avatar_menu_option_open_stories_single, R.drawable.vk_icon_story_outline_24);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -484557384;
            }

            public final String toString() {
                return "OpenStory";
            }
        }

        /* compiled from: CommunityAvatarViewDataDelegate.kt */
        public static final class g extends a {
            public static final g c = new g(R.string.community_avatar_menu_option_upload_photo, R.drawable.vk_icon_pen_outline_24);

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 1328696926;
            }

            public final String toString() {
                return "UploadPhoto";
            }
        }

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ksg(String str, h7v h7vVar, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, yzs<? super View, ? super String, ? super Boolean, s3q0> yzsVar, izs<? super Boolean, s3q0> izsVar, gzs<s3q0> gzsVar3, Lifecycle lifecycle, f5z f5zVar) {
        this.a = str;
        this.b = h7vVar;
        this.c = (FunctionReferenceImpl) gzsVar;
        this.d = (FunctionReferenceImpl) gzsVar2;
        this.e = (FunctionReferenceImpl) yzsVar;
        this.f = (FunctionReferenceImpl) izsVar;
        this.g = (FunctionReferenceImpl) gzsVar3;
        this.h = lifecycle;
        this.i = f5zVar;
    }

    public final void a(CommunityProfileAvatarViewContainer communityProfileAvatarViewContainer, l3h.a aVar, UserId userId, xrh.d dVar) {
        communityProfileAvatarViewContainer.u(new qeh.a(aVar.a, aVar.b, aVar.c), aVar.d, aVar.e, aVar.h && !aVar.k, aVar.l, aVar.m);
        if (aVar.e || aVar.f) {
            return;
        }
        bwt0.i0(communityProfileAvatarViewContainer, new jsg(this, aVar, communityProfileAvatarViewContainer, userId, 0));
        if (dVar instanceof xrh.d.f) {
            xrh.d.f fVar = (xrh.d.f) dVar;
            if (!this.b.a(fVar.b) || this.j) {
                return;
            }
            this.j = true;
            bwt0.j(communityProfileAvatarViewContainer, new isg(fVar, this, communityProfileAvatarViewContainer, 0));
        }
    }
}
