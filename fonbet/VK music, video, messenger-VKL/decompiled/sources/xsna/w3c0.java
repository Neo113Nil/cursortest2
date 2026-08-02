package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.core.serialize.Serializer;
import com.vk.core.tips.Tooltip;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.ThemedColor;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.newsfeed.entries.post.NewsfeedCoowners;
import com.vk.dto.user.ImageStatus;
import com.vk.dto.user.SocialButtonType;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.ActionOpenGeoFeed;
import com.vk.feed.core.models.actions.HeaderAction;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.header.HeaderIcon;
import com.vk.feed.core.models.header.HeaderTitle;
import com.vk.feed.core.models.header.HeaderTooltip;
import com.vk.feed.core.models.header.SourcePhoto;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.header.VkFeedPostHeaderView;
import com.vk.feed.design.view.newsfeed.header.avatar.VkFeedHeaderAvatarView;
import com.vk.feed.design.view.newsfeed.header.avatar.VkFeedHeaderAvatarViewV2;
import com.vk.feed.design.view.newsfeed.header.description.VkFeedNewsfeedHeaderDescriptionLayout;
import com.vk.feed.design.view.newsfeed.header.subtitle.VkFeedPostHeaderSubtitleTextView;
import com.vk.feed.design.view.newsfeed.header.type.VkFeedHeaderActionButtonType;
import com.vk.feed.design.view.newsfeed.header.type.VkFeedHeaderDisplayModeType;
import com.vk.feed.design.view.newsfeed.header.type.VkFeedHeaderIconSizeType;
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;
import com.vk.newsfeed.common.presentation.model.items.header.IconSize;
import com.vk.newsfeed.common.recycler.holders.headers.DisplayMode;
import com.vk.newsfeed.presentation.model.ActionButtonType;
import com.vk.newsfeed.presentation.model.AdClickContext;
import com.vk.newsfeed.presentation.model.actions.ActionOpenClipMusicGrid;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.profile.core.npo.OrganizationModalVariant;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedItemMenuAction;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick;
import com.vk.subscription.api.SubscribeStatus;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.e670;
import xsna.q3c0;
import xsna.rwm0;
import xsna.sau;

/* compiled from: PostHeaderHolderV2.kt */
/* loaded from: classes4.dex */
public final class w3c0 extends rp6<v3c0, NewsEntry> implements i7o {
    public final DisplayMode E;
    public final h170 F;
    public final rv0 G;
    public final rwm0 H;
    public final c I;
    public VkFeedHeaderActionButtonType J;
    public final Object K;
    public final Object L;
    public final VkFeedPostHeaderView M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final Object R;

    /* compiled from: PostHeaderHolderV2.kt */
    public final class a implements VkFeedPostHeaderSubtitleTextView.a {
        public a() {
        }

        @Override // com.vk.feed.design.view.newsfeed.header.subtitle.VkFeedPostHeaderSubtitleTextView.a
        public final waz a(String str, evu0 evu0Var) {
            waz wazVar = new waz(str, new i3u(evu0Var, 8));
            w3c0.this.itemView.getContext();
            wazVar.g(false);
            wazVar.b(R.attr.vk_ui_text_secondary);
            wazVar.b = true;
            return wazVar;
        }

        @Override // com.vk.feed.design.view.newsfeed.header.subtitle.VkFeedPostHeaderSubtitleTextView.a
        public final Integer b(String str) {
            w3c0 w3c0Var = w3c0.this;
            w3c0Var.itemView.getContext();
            Integer o = znk0.o(w3c0Var.itemView.getContext(), str);
            if (o == null) {
                return null;
            }
            w3c0Var.itemView.getContext();
            LinkedHashMap linkedHashMap = x1z.a;
            return o;
        }

        @Override // com.vk.feed.design.view.newsfeed.header.subtitle.VkFeedPostHeaderSubtitleTextView.a
        public final int c(String str) {
            w3c0.this.itemView.getContext();
            return epx.f(str, "fire") ? R.attr.vk_ui_accent_orange_fire : R.attr.vk_ui_icon_secondary;
        }

        @Override // com.vk.feed.design.view.newsfeed.header.subtitle.VkFeedPostHeaderSubtitleTextView.a
        public final j9g d(String str, int i, dvu0 dvu0Var) {
            j9g j9gVar = new j9g(str, i, new nm3(dvu0Var, 26));
            w3c0.this.itemView.getContext();
            j9gVar.g(false);
            j9gVar.b = true;
            return j9gVar;
        }
    }

    /* compiled from: PostHeaderHolderV2.kt */
    public final class b implements cvu0 {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v21, types: [T, xsna.dw20] */
        /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.cvu0
        public final void a(zjt zjtVar) {
            NewsEntry q6;
            SourcePhoto sourcePhoto;
            Owner d;
            SocialButtonType socialButtonType;
            EntryHeader header;
            SourcePhoto sourcePhoto2;
            Owner d2;
            String string;
            brj0 brj0Var;
            brj0 brj0Var2;
            String string2;
            EntryHeader header2;
            w3c0 w3c0Var = w3c0.this;
            NewsEntry q62 = w3c0Var.q6();
            if (q62 instanceof MyTargetNativeAdEntry) {
                w3c0Var.h7((MyTargetNativeAdEntry) q62, 2);
                return;
            }
            if (q62 instanceof ShitAttachment) {
                w3c0Var.i7((ShitAttachment) q62, AdClickContext.ICON);
                return;
            }
            if (jjc.c(700L) || (q6 = w3c0Var.q6()) == 0) {
                return;
            }
            if (w3c0Var.J == VkFeedHeaderActionButtonType.SUBSCRIBE_AVATAR) {
                ViewGroup viewGroup = w3c0Var.H.c;
                if (viewGroup != null ? bwt0.K(viewGroup) : false) {
                    la60 la60Var = (la60) w3c0Var.P.getValue();
                    crf crfVar = new crf(w3c0Var, zjtVar, q6, 2);
                    vt30 vt30Var = new vt30(w3c0Var, 18);
                    ww wwVar = new ww(19, w3c0Var, q6);
                    la60Var.getClass();
                    l490 l490Var = q6 instanceof l490 ? (l490) q6 : null;
                    Owner s = l490Var != null ? l490Var.s() : null;
                    boolean z = q6 instanceof wsx0;
                    wsx0 wsx0Var = z ? (wsx0) q6 : null;
                    if (wsx0Var == null || (header2 = wsx0Var.getHeader()) == null || (socialButtonType = header2.i) == null) {
                        socialButtonType = s != null ? s.s : null;
                    }
                    String str = s != null ? s.j : null;
                    boolean i = s != null ? s.i(512) : false;
                    boolean z2 = socialButtonType == SocialButtonType.ADD || i;
                    boolean z3 = sni.q(q6) || i;
                    wsx0 wsx0Var2 = z ? (wsx0) q6 : null;
                    boolean z4 = (wsx0Var2 == null || (header = wsx0Var2.getHeader()) == null || (sourcePhoto2 = header.b) == null || (d2 = sourcePhoto2.d()) == null || !d2.q) ? false : true;
                    boolean b = fkq0.b(sni.l(q6));
                    zzb0 zzb0Var = new zzb0();
                    Context context = zjtVar.getContext();
                    String str2 = str;
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ListBuilder e = e43.e();
                    if (z4) {
                        e.add((brj0) zzb0Var.a.getValue());
                    }
                    ?? r5 = zzb0Var.e;
                    if (b) {
                        e.add((brj0) zzb0Var.c.getValue());
                        e.add(z3 ? (brj0) r5.getValue() : (brj0) zzb0Var.d.getValue());
                    } else {
                        if (z3 && z2 && !i) {
                            brj0Var2 = (brj0) zzb0Var.g.getValue();
                        } else if (z3 && z2) {
                            brj0Var2 = (brj0) zzb0Var.f.getValue();
                        } else if (!z3 || z2) {
                            if (z3 || !z2) {
                                if (str2 == null || (string = context.getString(R.string.modal_dialog_option_subscribe_with_name, str2)) == null) {
                                    string = context.getString(R.string.modal_dialog_option_subscribe);
                                }
                                String str3 = string;
                                dhr0.a.getClass();
                                brj0Var = new brj0(2, 0, dhr0.t.b(R.drawable.vk_icon_add_square_outline_28, R.attr.vk_ui_icon_accent), 0, str3, false, false, null, 0, null, null, null, null, null, 131050);
                            } else {
                                if (str2 == null || (string2 = context.getString(R.string.modal_dialog_option_add_to_friends_with_name, str2)) == null) {
                                    string2 = context.getString(R.string.modal_dialog_option_add_to_friends);
                                }
                                String str4 = string2;
                                dhr0.a.getClass();
                                brj0Var = new brj0(2, 0, dhr0.t.b(R.drawable.vk_icon_add_square_outline_28, R.attr.vk_ui_icon_accent), 0, str4, false, false, null, 0, null, null, null, null, null, 131050);
                            }
                            brj0Var2 = brj0Var;
                        } else {
                            brj0Var2 = (brj0) r5.getValue();
                        }
                        e.add((brj0) zzb0Var.b.getValue());
                        e.add(brj0Var2);
                    }
                    ListBuilder g = e.g();
                    ref$ObjectRef.element = new dw20.b(context, null).v0(R.string.common_actions).A0(Integer.valueOf(R.style.VkUiTypography_DisplayTitle2)).z0(8388611).x(zzb0.h).c(new cpo(false, iah0.a(g.size() <= 2 ? 112 : 164), 3)).t().s(enj.e(R.drawable.vk_icon_cancel_28, R.attr.vk_ui_icon_accent, context)).P(g, new n37(crfVar, vt30Var, wwVar, ref$ObjectRef, 4)).I0(null);
                    return;
                }
            }
            if (w3c0Var.d7(q6)) {
                w3c0Var.c7(q6);
                return;
            }
            EntryHeader d3 = na60.d(q6);
            if (d3 == null || (sourcePhoto = d3.b) == null || (d = sourcePhoto.d()) == null || !d.q) {
                w3c0Var.c7(q6);
            } else {
                w3c0Var.D.sa(new NewsfeedExternalAction.Navigation.u(w3c0Var.itemView.getContext(), zjtVar, q6, w3c0Var.u, w3c0Var.v, MobileOfficialAppsFeedStat$TypeFeedOpenStoryClick.EntryPoint.HEADER_PHOTO));
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.cvu0
        public final void b() {
            HeaderAction headerAction;
            w3c0 w3c0Var = w3c0.this;
            v3c0 v3c0Var = (v3c0) w3c0Var.C;
            if (v3c0Var == null) {
                ((t3c0) w3c0Var.K.getValue()).getClass();
                return;
            }
            HeaderIcon headerIcon = v3c0Var.u;
            if (headerIcon == null || (headerAction = headerIcon.d) == null) {
                return;
            }
            di60.O(headerAction, w3c0Var.itemView.getContext(), null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.cvu0
        public final void c() {
            w3c0 w3c0Var = w3c0.this;
            N q6 = w3c0Var.q6();
            if (q6 == 0) {
                return;
            }
            if (q6 instanceof Html5Entry) {
                w3c0Var.D.sa(new NewsfeedExternalAction.Navigation.l(w3c0Var.itemView.getContext(), (Html5Entry) q6));
            } else if (q6 instanceof ShitAttachment) {
                w3c0Var.i7((ShitAttachment) q6, AdClickContext.TITLE);
            } else if (q6 instanceof MyTargetNativeAdEntry) {
                w3c0Var.h7((MyTargetNativeAdEntry) q6, 0);
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.feed.core.models.news.NewsEntry] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.vk.feed.core.models.news.NewsEntry] */
        /* JADX WARN: Type inference failed for: r1v2, types: [com.vk.feed.core.models.news.NewsEntry] */
        @Override // xsna.cvu0
        public final void d() {
            w3c0 w3c0Var = w3c0.this;
            ?? q6 = w3c0Var.q6();
            if (q6 != 0 && di60.E(q6)) {
                new e670.a(w3c0Var.itemView.getContext(), OrganizationModalVariant.VERIFIED_NON_PROFIT).I0(null);
                return;
            }
            ?? q62 = w3c0Var.q6();
            if (q62 != 0 && di60.F(q62)) {
                new e670.a(w3c0Var.itemView.getContext(), OrganizationModalVariant.NON_PROFIT).I0(null);
                return;
            }
            ?? q63 = w3c0Var.q6();
            if (q63 == 0 || !di60.D(q63)) {
                f();
                return;
            }
            sau.a aVar = new sau.a(w3c0Var.itemView.getContext(), tzp0.a(null, 3));
            aVar.I(true);
            int a = iah0.a(8);
            aVar.n0(a);
            aVar.p0(a);
            aVar.o0(a);
            aVar.m0(a);
            aVar.x(0);
            aVar.u(0);
            aVar.I0(null);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.feed.core.models.news.NewsEntry] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.cvu0
        public final void e(View view) {
            w3c0 w3c0Var = w3c0.this;
            ?? q6 = w3c0Var.q6();
            if (q6 == 0) {
                return;
            }
            w3c0Var.G6(view);
            p4r p4rVar = (p4r) w3c0Var.O.getValue();
            u1c0 J0 = w3c0Var.J0();
            Integer valueOf = J0 != null ? Integer.valueOf(J0.k) : null;
            UserId o = k9q0.o(q6);
            int n = di60.n(q6);
            String str = q6.Cb().b;
            MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action action = MobileOfficialAppsFeedStat$TypeFeedItemMenuAction.Action.CLICK_TO_DOTS;
            Integer valueOf2 = Integer.valueOf(n);
            p4rVar.getClass();
            p4r.d(action, o, valueOf2, str, valueOf);
        }

        @Override // xsna.cvu0
        public final void f() {
            w3c0.this.f7();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.vk.feed.core.models.news.NewsEntry] */
        @Override // xsna.cvu0
        public final void g() {
            UserId d;
            ImageStatus imageStatus;
            EntryHeader d2;
            w3c0 w3c0Var = w3c0.this;
            v3c0 v3c0Var = (v3c0) w3c0Var.C;
            if (v3c0Var != null) {
                d = v3c0Var.l;
                if (d == null || (imageStatus = v3c0Var.q) == null) {
                    return;
                }
            } else {
                ?? q6 = w3c0Var.q6();
                HeaderTitle headerTitle = (q6 == 0 || (d2 = na60.d(q6)) == null) ? null : d2.c;
                if (headerTitle == null || (d = headerTitle.d()) == null || (imageStatus = headerTitle.d) == null) {
                    return;
                }
            }
            hd60.a().R0(w3c0Var.itemView.getContext(), d, imageStatus);
        }
    }

    /* compiled from: PostHeaderHolderV2.kt */
    public static final class c implements bvu0 {
        public NewsEntry a;
        public hi60 b;
        public View c;
        public u1c0 d;

        @Override // xsna.bvu0
        public final void a(Description description, VkFeedPostHeaderSubtitleTextView vkFeedPostHeaderSubtitleTextView, Rect rect) {
            s3q0 s3q0Var;
            HeaderAction headerAction = description.d;
            HeaderTooltip headerTooltip = description.e;
            if (headerTooltip != null) {
                Rect e = f4m.e(vkFeedPostHeaderSubtitleTextView);
                int i = e.left;
                e.right = rect.right + i;
                e.left = i + rect.left;
                Tooltip.l(new Tooltip(vkFeedPostHeaderSubtitleTextView.getContext(), null, headerTooltip.b, null, null, null, null, e3m.f(R.attr.vk_ui_background_modal_inverse, vkFeedPostHeaderSubtitleTextView.getContext()), vkFeedPostHeaderSubtitleTextView.getContext().getColor(dhr0.M() ? R.color.vk_black : R.color.vk_white), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, false, null, 0, false, null, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -392, 15), vkFeedPostHeaderSubtitleTextView.getContext(), new RectF(e), false, false, false, false, 236);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            if (s3q0Var != null) {
                return;
            }
            if (epx.f(headerAction != null ? Boolean.valueOf(di60.O(headerAction, vkFeedPostHeaderSubtitleTextView.getContext(), this.a)) : null, Boolean.TRUE)) {
                return;
            }
            c(headerAction);
        }

        @Override // xsna.bvu0
        public final void b(Description description, View view) {
            s3q0 s3q0Var;
            HeaderAction headerAction = description.d;
            HeaderTooltip headerTooltip = description.e;
            if (headerTooltip != null) {
                di60.P(headerTooltip, view);
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            if (s3q0Var != null) {
                return;
            }
            if (epx.f(headerAction != null ? Boolean.valueOf(di60.O(headerAction, view.getContext(), this.a)) : null, Boolean.TRUE)) {
                return;
            }
            c(headerAction);
        }

        public final void c(HeaderAction headerAction) {
            View view;
            Context context;
            hi60 hi60Var;
            NewsEntry newsEntry;
            Post R;
            Object obj;
            hi60 hi60Var2;
            if (!(headerAction instanceof ActionOpenGeoFeed)) {
                if (!(headerAction instanceof ActionOpenClipMusicGrid) || (view = this.c) == null || (context = view.getContext()) == null || (hi60Var = this.b) == null) {
                    return;
                }
                ActionOpenClipMusicGrid actionOpenClipMusicGrid = (ActionOpenClipMusicGrid) headerAction;
                hi60Var.sa(new NewsfeedExternalAction.Navigation.e(actionOpenClipMusicGrid.b, actionOpenClipMusicGrid.c, context));
                return;
            }
            View view2 = this.c;
            if (view2 == null || (newsEntry = this.a) == null || (R = di60.R(newsEntry)) == null) {
                return;
            }
            Iterator<T> it = R.z.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((EntryAttachment) obj).b instanceof GeoAttachment) {
                        break;
                    }
                }
            }
            EntryAttachment entryAttachment = (EntryAttachment) obj;
            Serializer.StreamParcelableAdapter streamParcelableAdapter = entryAttachment != null ? entryAttachment.b : null;
            GeoAttachment geoAttachment = streamParcelableAdapter instanceof GeoAttachment ? (GeoAttachment) streamParcelableAdapter : null;
            if (geoAttachment == null || (hi60Var2 = this.b) == null) {
                return;
            }
            hi60Var2.sa(new NewsfeedExternalAction.Navigation.k(view2, newsEntry, geoAttachment, this.d));
        }
    }

    /* compiled from: PostHeaderHolderV2.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[DisplayMode.values().length];
            try {
                iArr[DisplayMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DisplayMode.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SubscribeStatus.values().length];
            try {
                iArr2[SubscribeStatus.MEMBER_STATUS_MEMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SubscribeStatus.MEMBER_STATUS_NOT_MEMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ActionButtonType.values().length];
            try {
                iArr3[ActionButtonType.SUBSCRIBE_IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[ActionButtonType.SUBSCRIBE_TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ActionButtonType.SUBSCRIBE_TEXT_WITH_BG.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ActionButtonType.SUBSCRIBE_AVATAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[VkFeedHeaderActionButtonType.values().length];
            try {
                iArr4[VkFeedHeaderActionButtonType.SUBSCRIBE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[VkFeedHeaderActionButtonType.SUBSCRIBE_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[VkFeedHeaderActionButtonType.SUBSCRIBE_AVATAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[VkFeedHeaderActionButtonType.SUBSCRIBE_TEXT_WITH_BG.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[IconSize.values().length];
            try {
                iArr5[IconSize.DP_12.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[IconSize.DP_16.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public w3c0(ViewGroup viewGroup, DisplayMode displayMode, h170 h170Var, rv0 rv0Var) {
        super(R.layout.feed_post_header_holder_v2, viewGroup);
        this.E = displayMode;
        this.F = h170Var;
        this.G = rv0Var;
        rwm0 rwm0Var = new rwm0(cn70.b(32), cn70.b(48));
        this.H = rwm0Var;
        c cVar = new c();
        this.I = cVar;
        this.J = VkFeedHeaderActionButtonType.SUBSCRIBE_IMAGE;
        uh80 uh80Var = new uh80(2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.K = msy.a(lazyThreadSafetyMode, uh80Var);
        this.L = msy.a(lazyThreadSafetyMode, new fr20(this, 17));
        VkFeedPostHeaderView vkFeedPostHeaderView = (VkFeedPostHeaderView) this.itemView;
        this.M = vkFeedPostHeaderView;
        this.N = msy.a(lazyThreadSafetyMode, new z260(this, 15));
        this.O = msy.a(lazyThreadSafetyMode, new xs6(19));
        this.P = msy.a(lazyThreadSafetyMode, new d14(22));
        this.R = msy.a(lazyThreadSafetyMode, new p6y(this, 24));
        getContext();
        getContext();
        int i = d.$EnumSwitchMapping$0[displayMode.ordinal()];
        if (i == 1) {
            vkFeedPostHeaderView.setDisplayMode(VkFeedHeaderDisplayModeType.DEFAULT);
            View view = vkFeedPostHeaderView.y;
            qcy<Object>[] qcyVarArr = bwt0.a;
            dhr0.f0(R.drawable.vk_icon_pin_12, R.attr.vk_ui_icon_medium, view);
            this.itemView.getContext();
            LinkedHashMap linkedHashMap = x1z.a;
            omw.d(vkFeedPostHeaderView.G, R.drawable.vk_icon_more_vertical_24, R.attr.vk_ui_icon_secondary);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vkFeedPostHeaderView.setDisplayMode(VkFeedHeaderDisplayModeType.OVERLAY);
            vkFeedPostHeaderView.setPinBackgroundResource(R.drawable.vk_icon_pin_12);
            vkFeedPostHeaderView.setPinBackgroundTintList(R.color.vk_white);
            this.itemView.getContext();
            LinkedHashMap linkedHashMap2 = x1z.a;
            vkFeedPostHeaderView.setOptionsImageResource(R.drawable.vk_icon_more_vertical_shadow_medium_48);
            vkFeedPostHeaderView.setOptionsImageTintList(null);
        }
        x3c0 x3c0Var = new x3c0(this);
        rwm0Var.f = x3c0Var;
        View view2 = rwm0Var.e;
        if (view2 != null) {
            view2.setOnClickListener(x3c0Var);
        }
        vkFeedPostHeaderView.setDescriptionClickListener(cVar);
        int b2 = cn70.b(36);
        this.Q = b2;
        vkFeedPostHeaderView.setMinimumHeight(cn70.b(56));
        vkFeedPostHeaderView.setMinHeight(cn70.b(56));
        zq70.G(vkFeedPostHeaderView);
        VkFeedHeaderAvatarView vkFeedHeaderAvatarView = vkFeedPostHeaderView.t;
        if (vkFeedHeaderAvatarView != null) {
            bwt0.m0(b2, b2, vkFeedHeaderAvatarView);
        }
        VkFeedHeaderAvatarViewV2 vkFeedHeaderAvatarViewV2 = vkFeedPostHeaderView.u;
        if (vkFeedHeaderAvatarViewV2 != null) {
            bwt0.m0(b2, b2, vkFeedHeaderAvatarViewV2);
        }
        vkFeedPostHeaderView.setExternalSourcesProvider(new a());
        vkFeedPostHeaderView.setHeaderListener(new b());
        hg1.b(this.itemView, xwk.e().T().m().d.subscribe(new bqs(new af50(this, 12), 17)));
    }

    public static ActionButtonType e7(VkFeedHeaderActionButtonType vkFeedHeaderActionButtonType) {
        int i = d.$EnumSwitchMapping$3[vkFeedHeaderActionButtonType.ordinal()];
        if (i == 1) {
            return ActionButtonType.SUBSCRIBE_TEXT;
        }
        if (i == 2) {
            return ActionButtonType.SUBSCRIBE_IMAGE;
        }
        if (i == 3) {
            return ActionButtonType.SUBSCRIBE_AVATAR;
        }
        if (i == 4) {
            return ActionButtonType.SUBSCRIBE_TEXT_WITH_BG;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.qi6
    public final boolean A6() {
        NewsEntry t6 = t6();
        if (super.A6()) {
            return !(t6 instanceof Digest) || (((Digest) t6).n & 1) == 0 || t6 == q6();
        }
        return false;
    }

    @Override // xsna.qi6
    public final void I6() {
        c cVar = this.I;
        cVar.a = null;
        cVar.b = null;
        cVar.c = null;
        cVar.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0389 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03ad A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v71, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R6(v3c0 v3c0Var) {
        boolean A6;
        boolean z;
        VkFeedHeaderActionButtonType vkFeedHeaderActionButtonType;
        ActionButtonType e7;
        rwm0 rwm0Var;
        int i;
        ViewGroup viewGroup;
        int i2;
        VkFeedHeaderActionButtonType vkFeedHeaderActionButtonType2;
        Integer num;
        boolean z2;
        boolean z3;
        boolean z4;
        NewsEntry newsEntry;
        DisplayMode displayMode;
        int i3;
        VerifyInfoHelper.VerifiedIconDisplayMode verifiedIconDisplayMode;
        int i4;
        VkFeedHeaderIconSizeType vkFeedHeaderIconSizeType;
        h170 h170Var;
        boolean z5;
        String str;
        List<Description> list;
        int i5;
        Context context;
        StringBuilder sb;
        String str2;
        String str3;
        String k;
        String m;
        Object obj;
        Text text;
        Text text2;
        ThemedColor themedColor;
        Integer a2;
        boolean z6;
        VkFeedHeaderDisplayModeType vkFeedHeaderDisplayModeType;
        View view;
        v3c0 v3c0Var2 = v3c0Var;
        NewsEntry newsEntry2 = v3c0Var2.O;
        hi60 hi60Var = this.D;
        u1c0 J0 = J0();
        c cVar = this.I;
        cVar.a = newsEntry2;
        cVar.b = hi60Var;
        VkFeedPostHeaderView vkFeedPostHeaderView = this.M;
        cVar.c = vkFeedPostHeaderView;
        cVar.d = J0;
        if (newsEntry2 instanceof Photos) {
            if (v3c0Var2.M || !A6()) {
                A6 = false;
            }
            A6 = true;
        } else {
            if (!(newsEntry2 instanceof FaveEntry) && !(newsEntry2 instanceof Html5Entry)) {
                A6 = A6();
            }
            A6 = true;
        }
        if (A6) {
            s1c0 s1c0Var = this.x;
            if ((s1c0Var != null && s1c0Var.I) == false) {
                z = true;
                vkFeedPostHeaderView.setOptionsIsVisible(z);
                DisplayMode displayMode2 = DisplayMode.OVERLAY;
                vkFeedHeaderActionButtonType = this.E == displayMode2 ? VkFeedHeaderActionButtonType.SUBSCRIBE_TEXT_WITH_BG : VkFeedHeaderActionButtonType.SUBSCRIBE_TEXT_WITH_BG;
                this.J = vkFeedHeaderActionButtonType;
                Context context2 = vkFeedPostHeaderView.getContext();
                ViewGroup containerSubscribeButton = vkFeedPostHeaderView.getContainerSubscribeButton();
                ViewGroup containerSubscribeAvatarButton = vkFeedPostHeaderView.getContainerSubscribeAvatarButton();
                e7 = e7(vkFeedHeaderActionButtonType);
                rwm0Var = this.H;
                if (rwm0Var.d != e7) {
                    i = 12;
                } else {
                    ViewGroup viewGroup2 = rwm0Var.c;
                    if (viewGroup2 != null) {
                        bwt0.p0(viewGroup2, false);
                    }
                    View view2 = rwm0Var.e;
                    i = 12;
                    if (view2 != null && (viewGroup = rwm0Var.c) != null) {
                        viewGroup.removeView(view2);
                    }
                    rwm0Var.d = e7;
                    int i6 = rwm0.b.$EnumSwitchMapping$0[e7.ordinal()];
                    if (i6 == 1) {
                        rwm0Var.c = containerSubscribeAvatarButton;
                        AppCompatImageView appCompatImageView = new AppCompatImageView(context2);
                        int i7 = rwm0.g;
                        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(i7, i7));
                        appCompatImageView.setBackgroundResource(R.drawable.vk_ripple_circle_highlight_18);
                        appCompatImageView.setContentDescription(context2.getString(R.string.profile_subscribe));
                        int i8 = rwm0.i;
                        appCompatImageView.setPadding(i8, i8, i8, i8);
                        ViewGroup viewGroup3 = rwm0Var.c;
                        if (viewGroup3 != null) {
                            viewGroup3.addView(appCompatImageView);
                        }
                        rwm0Var.e = appCompatImageView;
                    } else if (i6 == 2) {
                        rwm0Var.c = containerSubscribeButton;
                        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
                        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        appCompatTextView.setPadding(cn70.b(10), cn70.b(12), cn70.b(6), cn70.b(12));
                        appCompatTextView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_link));
                        com.vk.typography.b.k(appCompatTextView, FontFamily.MEDIUM, Float.valueOf(14.0f), 4);
                        appCompatTextView.setText(context2.getString(R.string.profile_subscribe));
                        appCompatTextView.setGravity(17);
                        ViewGroup viewGroup4 = rwm0Var.c;
                        if (viewGroup4 != null) {
                            viewGroup4.addView(appCompatTextView);
                        }
                        rwm0Var.e = appCompatTextView;
                    } else if (i6 != 3) {
                        rwm0Var.c = containerSubscribeButton;
                        int i9 = rwm0Var.a;
                        int i10 = rwm0Var.b;
                        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context2);
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i9, i10);
                        bwt0.b0(16, appCompatImageView2);
                        appCompatImageView2.setLayoutParams(layoutParams);
                        appCompatImageView2.setBackgroundResource(R.drawable.vk_ripple_circle_highlight_18);
                        appCompatImageView2.setContentDescription(context2.getString(R.string.profile_subscribe));
                        appCompatImageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                        ViewGroup viewGroup5 = rwm0Var.c;
                        if (viewGroup5 != null) {
                            viewGroup5.addView(appCompatImageView2);
                        }
                        rwm0Var.e = appCompatImageView2;
                    } else {
                        rwm0Var.c = containerSubscribeButton;
                        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
                        appCompatTextView2.setId(R.id.post_header_subscribe_button);
                        appCompatTextView2.setLayoutParams(new ViewGroup.LayoutParams(cn70.b(108), cn70.b(28)));
                        f4m.x(cn70.b(6), appCompatTextView2);
                        f4m.w(cn70.b(6), appCompatTextView2);
                        f4m.v(cn70.b(2), appCompatTextView2);
                        appCompatTextView2.setTextColor(dhr0.t.c(R.attr.vk_ui_text_link));
                        qcy<Object>[] qcyVarArr = bwt0.a;
                        appCompatTextView2.setTextAppearance(R.style.VkUiTypography_Caption1Medium);
                        appCompatTextView2.setLineHeight(cn70.b(12));
                        appCompatTextView2.setTextSize(12.0f);
                        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                        appCompatTextView2.setLines(1);
                        appCompatTextView2.setBackground(m33.a(R.drawable.bg_subscribe_button, context2));
                        appCompatTextView2.setText(context2.getString(R.string.profile_subscribe));
                        appCompatTextView2.setGravity(17);
                        ViewGroup viewGroup6 = rwm0Var.c;
                        if (viewGroup6 != null) {
                            viewGroup6.addView(appCompatTextView2);
                        }
                        rwm0Var.e = appCompatTextView2;
                    }
                    View view3 = rwm0Var.e;
                    if (view3 != null) {
                        view3.setOnClickListener(rwm0Var.f);
                    }
                }
                VkFeedHeaderActionButtonType vkFeedHeaderActionButtonType3 = VkFeedHeaderActionButtonType.SUBSCRIBE_TEXT_WITH_BG;
                boolean z7 = vkFeedHeaderActionButtonType != vkFeedHeaderActionButtonType3;
                if (vkFeedHeaderActionButtonType == VkFeedHeaderActionButtonType.SUBSCRIBE_IMAGE || (view = rwm0Var.e) == null) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    f4m.w(0, view);
                }
                vkFeedPostHeaderView.getContext();
                int b2 = cn70.b(8);
                if (z) {
                    b2 = cn70.b(i2);
                }
                vkFeedPostHeaderView.setContainerSubscribeButtonPaddingEnd(b2);
                vkFeedPostHeaderView.setupTitleAndSubtitleViews(z7);
                q3c0 q3c0Var = (q3c0) this.N.getValue();
                vkFeedHeaderActionButtonType2 = this.J;
                w9r0 w9r0Var = (w9r0) this.R.getValue();
                rwm0 rwm0Var2 = q3c0Var.c;
                VkFeedPostHeaderView vkFeedPostHeaderView2 = q3c0Var.a;
                num = v3c0Var2.o;
                z2 = v3c0Var2.H;
                z3 = v3c0Var2.t;
                z4 = v3c0Var2.w;
                newsEntry = v3c0Var2.L;
                DisplayMode displayMode3 = this.E;
                if (newsEntry == null) {
                    Context context3 = vkFeedPostHeaderView2.getContext();
                    boolean z8 = v3c0Var2.I;
                    if (z8) {
                        boolean z9 = displayMode3 == displayMode2;
                        if (v3c0Var2.J) {
                            z6 = z8;
                            displayMode = displayMode3;
                            q3c0Var.c.a(context3, v3c0Var2.K, newsEntry, displayMode, z9, z9);
                        } else {
                            z6 = z8;
                            displayMode = displayMode3;
                            q3c0Var.c.b(context3, v3c0Var2.K, newsEntry, displayMode, z9, z9);
                        }
                        boolean z10 = rwm0Var2.e != null;
                        ViewGroup viewGroup7 = rwm0Var2.c;
                        if (viewGroup7 != null) {
                            bwt0.p0(viewGroup7, z10);
                        }
                    } else {
                        z6 = z8;
                        displayMode = displayMode3;
                        ViewGroup viewGroup8 = rwm0Var2.c;
                        if (viewGroup8 != null) {
                            bwt0.p0(viewGroup8, false);
                        }
                    }
                    int i11 = DisplayMode.a.$EnumSwitchMapping$0[displayMode.ordinal()];
                    if (i11 == 1) {
                        vkFeedHeaderDisplayModeType = VkFeedHeaderDisplayModeType.DEFAULT;
                    } else {
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        vkFeedHeaderDisplayModeType = VkFeedHeaderDisplayModeType.OVERLAY;
                    }
                    int b3 = (z6 && (vkFeedHeaderActionButtonType2 == vkFeedHeaderActionButtonType3 && vkFeedHeaderDisplayModeType != VkFeedHeaderDisplayModeType.OVERLAY)) ? cn70.b(8) : 0;
                    f4m.w(b3, vkFeedPostHeaderView2.B);
                    f4m.w(b3, vkFeedPostHeaderView2.C);
                } else {
                    displayMode = displayMode3;
                    ViewGroup viewGroup9 = rwm0Var2.c;
                    if (viewGroup9 != null) {
                        bwt0.p0(viewGroup9, false);
                    }
                }
                vkFeedPostHeaderView2.setIsHeaderClickable(v3c0Var2.v);
                vkFeedPostHeaderView2.setTitleText(v3c0Var2.k);
                vkFeedPostHeaderView2.setIsPinVisible(z4);
                if (z3) {
                    vkFeedPostHeaderView2.setImageStatusUrl(v3c0Var2.s);
                }
                vkFeedPostHeaderView2.setIsImageStatusVisible(z3);
                i3 = DisplayMode.a.$EnumSwitchMapping$0[displayMode.ordinal()];
                if (i3 != 1) {
                    verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.DEFAULT;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    verifiedIconDisplayMode = VerifyInfoHelper.VerifiedIconDisplayMode.OVERLAY;
                }
                Context context4 = vkFeedPostHeaderView2.getContext();
                Drawable b4 = b4c0.b(v3c0Var2.C, v3c0Var2.A, v3c0Var2.B, verifiedIconDisplayMode);
                boolean z11 = b4 == null;
                i4 = q3c0.a.$EnumSwitchMapping$0[v3c0Var2.D.ordinal()];
                if (i4 != 1) {
                    vkFeedHeaderIconSizeType = VkFeedHeaderIconSizeType.DP_12;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vkFeedHeaderIconSizeType = VkFeedHeaderIconSizeType.DP_16;
                }
                vkFeedPostHeaderView2.setVerifiedDrawableSize(vkFeedHeaderIconSizeType);
                vkFeedPostHeaderView2.setVerifiedImageDrawable(b4);
                vkFeedPostHeaderView2.setIsVerifiedVisible(z11);
                vkFeedPostHeaderView2.setVerifiedContentDescription(context4.getString(v3c0Var2.E));
                h170Var = q3c0Var.d;
                if (vkFeedHeaderActionButtonType2 == VkFeedHeaderActionButtonType.SUBSCRIBE_AVATAR) {
                    ViewGroup viewGroup10 = rwm0Var2.c;
                    if (viewGroup10 != null ? bwt0.K(viewGroup10) : false) {
                        z5 = true;
                        boolean z12 = v3c0Var2.y;
                        boolean z13 = v3c0Var2.N;
                        boolean b5 = jvi.b(newsEntry2, h170Var);
                        String str4 = null;
                        if (z5 || !v3c0Var2.i) {
                            w9r0Var = null;
                        }
                        vkFeedPostHeaderView2.setPhotoCutout(w9r0Var);
                        r3c0 r3c0Var = q3c0Var.b;
                        vkFeedPostHeaderView2.setAvatarState(new vtu0(v3c0Var2.h, AvatarBorderType.CIRCLE, (h170Var.f() || !z13) && z12, (h170Var.f() || !z13) ? z12 ? (o9r0) r3c0Var.c.getValue() : (o9r0) r3c0Var.d.getValue() : (o9r0) r3c0Var.c.getValue(), q3c0.f, v3c0Var2.N));
                        vkFeedPostHeaderView2.setHasLiveBadge(z13);
                        vkFeedPostHeaderView2.setAvatarImportantForAccessibility((!z12 || z5) ? 1 : 2);
                        Context context5 = vkFeedPostHeaderView2.getContext();
                        vkFeedPostHeaderView2.setAvatarContentDescription(z5 ? context5.getString(R.string.accessibility_post_header_avatar) : (h170Var.f() && z13) ? context5.getString(R.string.accessibility_open_profile) : z12 ? context5.getString(R.string.accessibility_post_header_stories) : b5 ? context5.getString(R.string.accessibility_open_profile) : null);
                        NewsEntry newsEntry3 = v3c0Var2.P;
                        boolean z14 = !z12 || z5 || (newsEntry3 instanceof MyTargetNativeAdEntry) || (h170Var.f() && z13) || b5 || ((newsEntry3 instanceof ShitAttachment) && ((ShitAttachment) newsEntry3).h0 != null);
                        vkFeedPostHeaderView2.setIsAvatarClickable(z14);
                        vkFeedPostHeaderView2.setIsAvatarFocusable(z14);
                        if (z2) {
                            ThemedColor themedColor2 = v3c0Var2.G;
                            vkFeedPostHeaderView2.setBadgeTextColor((themedColor2 == null || (a2 = themedColor2.a(dhr0.M())) == null) ? -1 : a2.intValue());
                            vkFeedPostHeaderView2.setBadgeText(v3c0Var2.F);
                        }
                        vkFeedPostHeaderView2.setIsBadgeVisible(z2);
                        Context context6 = vkFeedPostHeaderView2.getContext();
                        HeaderIcon headerIcon = v3c0Var2.u;
                        str = headerIcon != null ? headerIcon.b : null;
                        if (str != null) {
                            str.length();
                        }
                        int q = (str != null || str.length() == 0) ? 0 : znk0.q(context6, str);
                        Integer a3 = (headerIcon != null || (themedColor = headerIcon.c) == null) ? null : themedColor.a(dhr0.M());
                        ColorStateList valueOf = a3 != null ? ColorStateList.valueOf(a3.intValue()) : null;
                        LinkedHashMap linkedHashMap = x1z.a;
                        vkFeedPostHeaderView2.setHeaderIconResId(q);
                        vkFeedPostHeaderView2.setHeaderIconImageTintList(valueOf);
                        vkFeedPostHeaderView2.setHeaderIconContentDescription(headerIcon != null ? headerIcon.e : null);
                        vkFeedPostHeaderView2.setHeaderIconVisible(q != 0);
                        List<Description> list2 = v3c0Var2.m;
                        list = list2;
                        if (list != null || list.isEmpty()) {
                            i5 = 0;
                            vkFeedPostHeaderView2.setSubtitleIsVisible(false);
                        } else {
                            vkFeedPostHeaderView2.getContext();
                            VkFeedNewsfeedHeaderDescriptionLayout vkFeedNewsfeedHeaderDescriptionLayout = vkFeedPostHeaderView2.C;
                            List<Description> list3 = list2;
                            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                Iterator<T> it = list3.iterator();
                                while (it.hasNext()) {
                                    if (!((Description) it.next()).h) {
                                        break;
                                    }
                                }
                            }
                            if (!v3c0Var2.x) {
                                i5 = 0;
                                vkFeedPostHeaderView2.setSubtitleIsVisible(false);
                            }
                            vkFeedPostHeaderView2.setSubtitleForEachIsVisible(false);
                            vkFeedPostHeaderView2.setSubtitleIsVisible(true);
                            if (v3c0Var2.z) {
                                if (!list.isEmpty()) {
                                    int size = list.size();
                                    for (int i12 = 0; i12 < size; i12++) {
                                        Description description = list2.get(i12);
                                        View P4 = vkFeedPostHeaderView2.P4(vkFeedNewsfeedHeaderDescriptionLayout, i12, description);
                                        if (P4 instanceof VkFeedPostHeaderSubtitleTextView) {
                                            ((VkFeedPostHeaderSubtitleTextView) P4).setDescriptions(Collections.singletonList(description));
                                        } else if (P4 instanceof LinearLayout) {
                                            Text text3 = description.b;
                                            String str5 = text3 != null ? text3.b : null;
                                            RunningLineTextView runningLineTextView = (RunningLineTextView) P4.findViewById(R.id.post_header_subtitle);
                                            if (runningLineTextView != null) {
                                                runningLineTextView.setText(str5);
                                            }
                                            if (runningLineTextView != null) {
                                                runningLineTextView.b();
                                            }
                                        }
                                        bwt0.p0(P4, true);
                                    }
                                }
                            } else if (!list.isEmpty()) {
                                Iterator<T> it2 = list3.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        if (((Description) obj).h) {
                                            break;
                                        }
                                    } else {
                                        obj = null;
                                        break;
                                    }
                                }
                                Description description2 = (Description) obj;
                                View P42 = vkFeedPostHeaderView2.P4(vkFeedNewsfeedHeaderDescriptionLayout, 0, description2);
                                if (P42 instanceof VkFeedPostHeaderSubtitleTextView) {
                                    ((VkFeedPostHeaderSubtitleTextView) P42).setDescriptions(list2);
                                } else if (P42 instanceof LinearLayout) {
                                    String str6 = (description2 == null || (text2 = description2.b) == null) ? null : text2.b;
                                    RunningLineTextView runningLineTextView2 = (RunningLineTextView) P42.findViewById(R.id.post_header_subtitle);
                                    if (runningLineTextView2 != null) {
                                        runningLineTextView2.setText(str6);
                                    }
                                    if (runningLineTextView2 != null) {
                                        runningLineTextView2.b();
                                    }
                                } else if (P42 instanceof RunningLineTextView) {
                                    RunningLineTextView runningLineTextView3 = (RunningLineTextView) P42;
                                    runningLineTextView3.setText((description2 == null || (text = description2.b) == null) ? null : text.b);
                                    runningLineTextView3.b();
                                }
                                bwt0.p0(P42, true);
                            }
                            vkFeedPostHeaderView2.setSubtitleContentDescription(v3c0Var2.n);
                            i5 = 0;
                        }
                        context = vkFeedPostHeaderView2.getContext();
                        sb = q3c0Var.e;
                        sb.setLength(i5);
                        str2 = v3c0Var2.j;
                        if (str2 != null && str2.length() != 0) {
                            sb.append(str2);
                        }
                        str3 = v3c0Var2.r;
                        if (str3 != null && str3.length() != 0) {
                            if (sb.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(context.getString(R.string.accessibility_emoji_status_title));
                            sb.append(" ");
                            sb.append(str3);
                        }
                        if (z4) {
                            if (sb.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(context.getString(R.string.accessibility_post_header_pin));
                        }
                        k = num != null ? pvo0.k(num.intValue(), context.getResources(), false) : null;
                        if (k != null && k.length() != 0) {
                            if (sb.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(k);
                        }
                        vkFeedPostHeaderView2.setContentDescription(sb.toString());
                        if (num != null) {
                            int intValue = num.intValue();
                            boolean z15 = v3c0Var2.p;
                            emi emiVar = new emi(14);
                            if (z15) {
                                Context context7 = e43.a;
                                Resources resources = (context7 != null ? context7 : null).getResources();
                                Calendar d2 = pvo0.d();
                                d2.set(i, 0);
                                d2.set(11, 0);
                                d2.set(13, 0);
                                d2.set(14, 0);
                                d2.setTimeInMillis(intValue * 1000);
                                String string = resources.getString(R.string.date_format_day_month_year, Integer.valueOf(d2.get(5)), resources.getStringArray(R.array.months_short)[Math.min(d2.get(2), 11)], Integer.valueOf(d2.get(1)));
                                m = string + " " + String.format(Locale.ENGLISH, "%s %d:%02d", Arrays.copyOf(new Object[]{resources.getString(d2.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(d2.get(11)), Integer.valueOf(d2.get(12))}, 3));
                                d2.clear();
                            } else {
                                m = emiVar.m(intValue);
                            }
                            str4 = m;
                        }
                        vkFeedPostHeaderView2.setDateText(str4);
                    }
                }
                z5 = false;
                boolean z122 = v3c0Var2.y;
                boolean z132 = v3c0Var2.N;
                boolean b52 = jvi.b(newsEntry2, h170Var);
                String str42 = null;
                if (z5) {
                }
                w9r0Var = null;
                vkFeedPostHeaderView2.setPhotoCutout(w9r0Var);
                r3c0 r3c0Var2 = q3c0Var.b;
                vkFeedPostHeaderView2.setAvatarState(new vtu0(v3c0Var2.h, AvatarBorderType.CIRCLE, (h170Var.f() || !z132) && z122, (h170Var.f() || !z132) ? z122 ? (o9r0) r3c0Var2.c.getValue() : (o9r0) r3c0Var2.d.getValue() : (o9r0) r3c0Var2.c.getValue(), q3c0.f, v3c0Var2.N));
                vkFeedPostHeaderView2.setHasLiveBadge(z132);
                vkFeedPostHeaderView2.setAvatarImportantForAccessibility((!z122 || z5) ? 1 : 2);
                Context context52 = vkFeedPostHeaderView2.getContext();
                vkFeedPostHeaderView2.setAvatarContentDescription(z5 ? context52.getString(R.string.accessibility_post_header_avatar) : (h170Var.f() && z132) ? context52.getString(R.string.accessibility_open_profile) : z122 ? context52.getString(R.string.accessibility_post_header_stories) : b52 ? context52.getString(R.string.accessibility_open_profile) : null);
                NewsEntry newsEntry32 = v3c0Var2.P;
                if (z122) {
                }
                vkFeedPostHeaderView2.setIsAvatarClickable(z14);
                vkFeedPostHeaderView2.setIsAvatarFocusable(z14);
                if (z2) {
                }
                vkFeedPostHeaderView2.setIsBadgeVisible(z2);
                Context context62 = vkFeedPostHeaderView2.getContext();
                HeaderIcon headerIcon2 = v3c0Var2.u;
                if (headerIcon2 != null) {
                }
                if (str != null) {
                }
                if (str != null) {
                }
                if (headerIcon2 != null) {
                }
                if (a3 != null) {
                }
                LinkedHashMap linkedHashMap2 = x1z.a;
                vkFeedPostHeaderView2.setHeaderIconResId(q);
                vkFeedPostHeaderView2.setHeaderIconImageTintList(valueOf);
                vkFeedPostHeaderView2.setHeaderIconContentDescription(headerIcon2 != null ? headerIcon2.e : null);
                vkFeedPostHeaderView2.setHeaderIconVisible(q != 0);
                List<Description> list22 = v3c0Var2.m;
                list = list22;
                if (list != null) {
                }
                i5 = 0;
                vkFeedPostHeaderView2.setSubtitleIsVisible(false);
                context = vkFeedPostHeaderView2.getContext();
                sb = q3c0Var.e;
                sb.setLength(i5);
                str2 = v3c0Var2.j;
                if (str2 != null) {
                    sb.append(str2);
                }
                str3 = v3c0Var2.r;
                if (str3 != null) {
                    if (sb.length() > 0) {
                    }
                    sb.append(context.getString(R.string.accessibility_emoji_status_title));
                    sb.append(" ");
                    sb.append(str3);
                }
                if (z4) {
                }
                if (num != null) {
                }
                if (k != null) {
                    if (sb.length() > 0) {
                    }
                    sb.append(k);
                }
                vkFeedPostHeaderView2.setContentDescription(sb.toString());
                if (num != null) {
                }
                vkFeedPostHeaderView2.setDateText(str42);
            }
        }
        z = false;
        vkFeedPostHeaderView.setOptionsIsVisible(z);
        DisplayMode displayMode22 = DisplayMode.OVERLAY;
        if (this.E == displayMode22) {
        }
        this.J = vkFeedHeaderActionButtonType;
        Context context22 = vkFeedPostHeaderView.getContext();
        ViewGroup containerSubscribeButton2 = vkFeedPostHeaderView.getContainerSubscribeButton();
        ViewGroup containerSubscribeAvatarButton2 = vkFeedPostHeaderView.getContainerSubscribeAvatarButton();
        e7 = e7(vkFeedHeaderActionButtonType);
        rwm0Var = this.H;
        if (rwm0Var.d != e7) {
        }
        VkFeedHeaderActionButtonType vkFeedHeaderActionButtonType32 = VkFeedHeaderActionButtonType.SUBSCRIBE_TEXT_WITH_BG;
        if (vkFeedHeaderActionButtonType != vkFeedHeaderActionButtonType32) {
        }
        if (vkFeedHeaderActionButtonType == VkFeedHeaderActionButtonType.SUBSCRIBE_IMAGE) {
        }
        i2 = 0;
        vkFeedPostHeaderView.getContext();
        int b22 = cn70.b(8);
        if (z) {
        }
        vkFeedPostHeaderView.setContainerSubscribeButtonPaddingEnd(b22);
        vkFeedPostHeaderView.setupTitleAndSubtitleViews(z7);
        q3c0 q3c0Var2 = (q3c0) this.N.getValue();
        vkFeedHeaderActionButtonType2 = this.J;
        w9r0 w9r0Var2 = (w9r0) this.R.getValue();
        rwm0 rwm0Var22 = q3c0Var2.c;
        VkFeedPostHeaderView vkFeedPostHeaderView22 = q3c0Var2.a;
        num = v3c0Var2.o;
        z2 = v3c0Var2.H;
        z3 = v3c0Var2.t;
        z4 = v3c0Var2.w;
        newsEntry = v3c0Var2.L;
        DisplayMode displayMode32 = this.E;
        if (newsEntry == null) {
        }
        vkFeedPostHeaderView22.setIsHeaderClickable(v3c0Var2.v);
        vkFeedPostHeaderView22.setTitleText(v3c0Var2.k);
        vkFeedPostHeaderView22.setIsPinVisible(z4);
        if (z3) {
        }
        vkFeedPostHeaderView22.setIsImageStatusVisible(z3);
        i3 = DisplayMode.a.$EnumSwitchMapping$0[displayMode.ordinal()];
        if (i3 != 1) {
        }
        Context context42 = vkFeedPostHeaderView22.getContext();
        Drawable b42 = b4c0.b(v3c0Var2.C, v3c0Var2.A, v3c0Var2.B, verifiedIconDisplayMode);
        if (b42 == null) {
        }
        i4 = q3c0.a.$EnumSwitchMapping$0[v3c0Var2.D.ordinal()];
        if (i4 != 1) {
        }
        vkFeedPostHeaderView22.setVerifiedDrawableSize(vkFeedHeaderIconSizeType);
        vkFeedPostHeaderView22.setVerifiedImageDrawable(b42);
        vkFeedPostHeaderView22.setIsVerifiedVisible(z11);
        vkFeedPostHeaderView22.setVerifiedContentDescription(context42.getString(v3c0Var2.E));
        h170Var = q3c0Var2.d;
        if (vkFeedHeaderActionButtonType2 == VkFeedHeaderActionButtonType.SUBSCRIBE_AVATAR) {
        }
        z5 = false;
        boolean z1222 = v3c0Var2.y;
        boolean z1322 = v3c0Var2.N;
        boolean b522 = jvi.b(newsEntry2, h170Var);
        String str422 = null;
        if (z5) {
        }
        w9r0Var2 = null;
        vkFeedPostHeaderView22.setPhotoCutout(w9r0Var2);
        r3c0 r3c0Var22 = q3c0Var2.b;
        vkFeedPostHeaderView22.setAvatarState(new vtu0(v3c0Var2.h, AvatarBorderType.CIRCLE, (h170Var.f() || !z1322) && z1222, (h170Var.f() || !z1322) ? z1222 ? (o9r0) r3c0Var22.c.getValue() : (o9r0) r3c0Var22.d.getValue() : (o9r0) r3c0Var22.c.getValue(), q3c0.f, v3c0Var2.N));
        vkFeedPostHeaderView22.setHasLiveBadge(z1322);
        vkFeedPostHeaderView22.setAvatarImportantForAccessibility((!z1222 || z5) ? 1 : 2);
        Context context522 = vkFeedPostHeaderView22.getContext();
        vkFeedPostHeaderView22.setAvatarContentDescription(z5 ? context522.getString(R.string.accessibility_post_header_avatar) : (h170Var.f() && z1322) ? context522.getString(R.string.accessibility_open_profile) : z1222 ? context522.getString(R.string.accessibility_post_header_stories) : b522 ? context522.getString(R.string.accessibility_open_profile) : null);
        NewsEntry newsEntry322 = v3c0Var2.P;
        if (z1222) {
        }
        vkFeedPostHeaderView22.setIsAvatarClickable(z14);
        vkFeedPostHeaderView22.setIsAvatarFocusable(z14);
        if (z2) {
        }
        vkFeedPostHeaderView22.setIsBadgeVisible(z2);
        Context context622 = vkFeedPostHeaderView22.getContext();
        HeaderIcon headerIcon22 = v3c0Var2.u;
        if (headerIcon22 != null) {
        }
        if (str != null) {
        }
        if (str != null) {
        }
        if (headerIcon22 != null) {
        }
        if (a3 != null) {
        }
        LinkedHashMap linkedHashMap22 = x1z.a;
        vkFeedPostHeaderView22.setHeaderIconResId(q);
        vkFeedPostHeaderView22.setHeaderIconImageTintList(valueOf);
        vkFeedPostHeaderView22.setHeaderIconContentDescription(headerIcon22 != null ? headerIcon22.e : null);
        vkFeedPostHeaderView22.setHeaderIconVisible(q != 0);
        List<Description> list222 = v3c0Var2.m;
        list = list222;
        if (list != null) {
        }
        i5 = 0;
        vkFeedPostHeaderView22.setSubtitleIsVisible(false);
        context = vkFeedPostHeaderView22.getContext();
        sb = q3c0Var2.e;
        sb.setLength(i5);
        str2 = v3c0Var2.j;
        if (str2 != null) {
        }
        str3 = v3c0Var2.r;
        if (str3 != null) {
        }
        if (z4) {
        }
        if (num != null) {
        }
        if (k != null) {
        }
        vkFeedPostHeaderView22.setContentDescription(sb.toString());
        if (num != null) {
        }
        vkFeedPostHeaderView22.setDateText(str422);
    }

    public final MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint b7() {
        int i = d.$EnumSwitchMapping$2[e7(this.J).ordinal()];
        if (i == 1) {
            return MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint.HEADER_FOLLOW_BUTTON;
        }
        if (i == 2 || i == 3) {
            return MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint.HEADER_FOLLOW_TEXT;
        }
        if (i == 4) {
            return MobileOfficialAppsFeedStat$TypeFeedFollowSourceEntryPoint.EntryPoint.HEADER_PHOTO_FOLLOW_BUTTON;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean c7(NewsEntry newsEntry) {
        h170 h170Var = this.F;
        boolean b2 = jvi.b(newsEntry, h170Var);
        ?? r0 = h170Var.C;
        if (!b2) {
            return false;
        }
        boolean d7 = d7(newsEntry);
        Long valueOf = Long.valueOf(k9q0.o(newsEntry).b);
        UiTracker uiTracker = UiTracker.a;
        new ejc(d7, valueOf, null, UiTracker.c(), (((Boolean) r0.getValue()).booleanValue() && d7(newsEntry)) ? CommonVideoStat$CommunityClickInfo.Direction.TO_PLAYER_LIVE : CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR, 4).q();
        if (((Boolean) r0.getValue()).booleanValue() && d7(newsEntry)) {
            this.D.sa(new NewsfeedExternalAction.Navigation.m(this.itemView.getContext(), newsEntry, this.u, this.v));
            return true;
        }
        f7();
        return true;
    }

    public final boolean d7(NewsEntry newsEntry) {
        Owner owner;
        if (!this.F.f()) {
            return false;
        }
        Post R = di60.R(newsEntry);
        return epx.f((R == null || (owner = R.o) == null) ? null : Boolean.valueOf(owner.w), Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f7() {
        boolean z;
        N q6 = q6();
        if (q6 == 0) {
            return;
        }
        if (q6 instanceof Html5Entry) {
            this.D.sa(new NewsfeedExternalAction.Navigation.l(this.itemView.getContext(), (Html5Entry) q6));
            return;
        }
        if (q6 instanceof ShitAttachment) {
            ShitAttachment shitAttachment = (ShitAttachment) q6;
            if (!shitAttachment.Gb()) {
                i7(shitAttachment, AdClickContext.TITLE);
                return;
            } else {
                this.G.d(shitAttachment);
                j7(MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME);
                return;
            }
        }
        if (q6 instanceof PromoPost) {
            PromoPost promoPost = (PromoPost) q6;
            Context context = this.itemView.getContext();
            hi60 hi60Var = this.D;
            String str = this.u;
            String str2 = this.v;
            u1c0 J0 = J0();
            hi60Var.sa(new NewsfeedExternalAction.Navigation.r(context, promoPost, str, str2, J0 != null ? J0.k : -1));
            return;
        }
        boolean z2 = false;
        if (q6 instanceof MyTargetNativeAdEntry) {
            h7((MyTargetNativeAdEntry) q6, 0);
            return;
        }
        MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint = MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint.HEADER_NAME;
        N q62 = q6();
        if (q62 instanceof Post) {
            Post post = (Post) q62;
            NewsfeedCoowners newsfeedCoowners = post.f0;
            Boolean bool = null;
            if (epx.f(newsfeedCoowners != null ? Boolean.valueOf(newsfeedCoowners.b) : null, Boolean.TRUE)) {
                NewsfeedCoowners newsfeedCoowners2 = post.f0;
                if (newsfeedCoowners2 != null) {
                    List<NewsfeedCoowners.CoownerStatus> list = newsfeedCoowners2.f;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (epx.f(((NewsfeedCoowners.CoownerStatus) it.next()).c, "pending")) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    bool = Boolean.valueOf(z);
                }
                if (epx.f(bool, Boolean.TRUE)) {
                    z2 = true;
                }
            }
            if (Boolean.valueOf(z2).equals(Boolean.TRUE)) {
                this.D.sa(new NewsfeedExternalAction.Navigation.f(post));
                return;
            }
        }
        j7(entryPoint);
    }

    public final void h7(MyTargetNativeAdEntry myTargetNativeAdEntry, int i) {
        Context context = this.itemView.getContext();
        hi60 hi60Var = this.D;
        NewsfeedExternalAction.Navigation.OpenMyTargetAds.a aVar = new NewsfeedExternalAction.Navigation.OpenMyTargetAds.a(NewsfeedExternalAction.Navigation.OpenMyTargetAds.Element.BANNER, "DEFAULT", i, null);
        u1c0 J0 = J0();
        hi60Var.sa(new NewsfeedExternalAction.Navigation.OpenMyTargetAds(context, myTargetNativeAdEntry, aVar, J0 != null ? J0.k : -1));
    }

    public final void i7(ShitAttachment shitAttachment, AdClickContext adClickContext) {
        Context context = this.itemView.getContext();
        u1c0 J0 = J0();
        this.D.sa(new NewsfeedExternalAction.Navigation.c(context, shitAttachment, J0 != null ? J0.k : -1, adClickContext));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    public final void j7(MobileOfficialAppsFeedStat$TypeFeedOpenSourceEntryPoint.EntryPoint entryPoint) {
        ?? q6 = q6();
        UserId e = q6 != 0 ? rv60.e(q6) : null;
        if (e != null) {
            s1c0 s1c0Var = this.x;
            if (epx.f(s1c0Var != null ? s1c0Var.x : null, e)) {
                return;
            }
        }
        ?? q62 = q6();
        if (q62 != 0) {
            this.D.sa(new NewsfeedExternalAction.b.a(q62, this.u, this.v, entryPoint, null));
        }
    }
}
