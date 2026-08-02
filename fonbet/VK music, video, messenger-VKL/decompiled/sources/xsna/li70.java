package xsna;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.common.links.LinksParserData;
import com.vk.core.view.links.LinkedTextView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.group.Group;
import com.vk.dto.notifications.NotificationButton;
import com.vk.dto.notifications.NotificationEntity;
import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.photo.Photo;
import com.vk.dto.user.ObsceneTextFilter;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.notifications.core.NotificationIconType;
import com.vk.notifications.core.avatar.NotificationAvatarViewContainer;
import com.vk.reactions.view.ElevationImageView;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import xsna.cq5;
import xsna.f5h0;

/* compiled from: NotificationView.kt */
/* loaded from: classes4.dex */
public final class li70 extends ViewGroup implements too0 {
    public static final b R = new b();
    public static final a S;
    public static final HashSet<String> T;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final na70 E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public boolean L;
    public final GestureDetector M;
    public c970 N;
    public final vpa O;
    public final io.reactivex.rxjava3.disposables.b P;
    public final Object Q;
    public final iwu b;
    public NotificationItem c;
    public final NotificationAvatarViewContainer d;
    public final ElevationImageView e;
    public final LinkedTextView f;
    public final LinkedTextView g;
    public final LinkedTextView h;
    public final NotificationAvatarViewContainer i;
    public final View[] j;
    public final TextView[] k;
    public final v770 l;
    public final ImageView m;
    public final TextView n;
    public m870 o;
    public Float p;
    public RectF q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* compiled from: NotificationView.kt */
    public static final class a implements Comparator<ImageSize> {
        public int b;

        @Override // java.util.Comparator
        public final int compare(ImageSize imageSize, ImageSize imageSize2) {
            return Math.abs(this.b - imageSize.e6()) - Math.abs(this.b - imageSize2.e6());
        }
    }

    /* compiled from: NotificationView.kt */
    public static final class b {
        public static String a(Image image, int i, int i2) {
            String str;
            li70.S.b = i * i2;
            ArrayList arrayList = image.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                com.vk.dto.common.im.Image image2 = ((ImageSize) obj).d;
                if (image2.c > 0 && image2.b > 0 && (str = image2.d) != null && str.length() != 0) {
                    arrayList2.add(obj);
                }
            }
            ImageSize imageSize = (ImageSize) j5g.r0(li70.S, arrayList2);
            if (imageSize != null) {
                return imageSize.d.d;
            }
            return null;
        }

        public static String b(NotificationEntity notificationEntity, ImageScreenSize imageScreenSize) {
            Photo photo;
            Image image;
            UserProfile userProfile = notificationEntity.e;
            if (userProfile != null) {
                return userProfile.h;
            }
            Group group = notificationEntity.f;
            if (group != null) {
                return group.e;
            }
            Photo photo2 = notificationEntity.g;
            if (photo2 != null) {
                Image image2 = photo2.y;
                if (image2 != null) {
                    return a(image2, imageScreenSize.h(), imageScreenSize.h());
                }
                return null;
            }
            VideoFile videoFile = notificationEntity.h;
            if (videoFile != null) {
                Image image3 = videoFile.getImage();
                if (image3 != null) {
                    return a(image3, imageScreenSize.h(), imageScreenSize.h());
                }
                return null;
            }
            NotificationImage notificationImage = notificationEntity.i;
            if (notificationImage != null) {
                return NotificationImage.Db(notificationImage, imageScreenSize.h());
            }
            ApiApplication apiApplication = notificationEntity.j;
            if (apiApplication == null || (photo = apiApplication.d) == null || (image = photo.y) == null) {
                return null;
            }
            return a(image, imageScreenSize.h(), imageScreenSize.h());
        }

        public static CharSequence c(b bVar, NotificationItem notificationItem, String str, int i) {
            String str2 = str;
            boolean z = (i & 4) == 0;
            boolean z2 = (i & 8) != 0;
            if (str2 == null) {
                return null;
            }
            sdz a = xwk.d().a();
            LinksParserData linksParserData = new LinksParserData(41855, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, o25.a().i().U == ObsceneTextFilter.ENABLED, 7678);
            vdz vdzVar = new vdz(0);
            ucp ucpVar = ucp.a;
            if (drm0.D(str2, "{date}", false)) {
                int i2 = notificationItem.c;
                Context context = e43.a;
                String k = pvo0.k(i2, (context != null ? context : null).getResources(), false);
                if (k != null && k.length() != 0) {
                    if (z2 && brm0.B(str2, "{date}", false) && k.length() > 1) {
                        k = brm0.o(k.substring(0, 1)) + k.substring(1);
                    }
                    str2 = brm0.y(str2, "{date}", k);
                }
            }
            CharSequence i3 = ucp.i(a.o(str2, linksParserData, vdzVar));
            boolean z3 = vdzVar.a;
            if (z3) {
                notificationItem.w = z3;
            }
            return z ? a.h(i3) : i3;
        }
    }

    static {
        a aVar = new a();
        aVar.b = ImageScreenSize.SIZE_48DP.h();
        S = aVar;
        T = new HashSet<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public li70(bj70 bj70Var, final Context context) {
        super(context, null, 0);
        int dimension = (int) getResources().getDimension(R.dimen.not_main_item_size);
        this.r = dimension;
        int dimension2 = (int) getResources().getDimension(R.dimen.not_icon_size);
        this.s = dimension2;
        this.t = (int) getResources().getDimension(R.dimen.not_attachment_size);
        this.u = (int) getResources().getDimension(R.dimen.not_buttons_height);
        this.v = (int) getResources().getDimension(R.dimen.not_action_completed_height);
        this.w = (int) getResources().getDimension(R.dimen.not_action_completed_icon_height);
        int dimension3 = (int) getResources().getDimension(R.dimen.not_main_item_size);
        this.x = dimension3;
        int dimension4 = (int) getResources().getDimension(R.dimen.standard_list_item_padding);
        this.y = dimension4;
        int dimension5 = (int) getResources().getDimension(R.dimen.not_image_ver_margin);
        this.z = dimension5;
        int dimension6 = (int) getResources().getDimension(R.dimen.not_content_ver_margin);
        int dimension7 = (int) getResources().getDimension(R.dimen.not_content_image_hor_margin);
        this.A = dimension7;
        this.B = (int) getResources().getDimension(R.dimen.not_buttons_padding);
        this.C = (int) getResources().getDimension(R.dimen.not_action_completed_padding);
        this.D = (int) getResources().getDimension(R.dimen.not_attachment_padding);
        this.E = new na70(getResources());
        int b2 = cn70.b(3);
        int i = b2 * 2;
        int dimension8 = (int) getResources().getDimension(R.dimen.not_main_container_size);
        this.F = dimension8;
        int i2 = b2 * 4;
        int i3 = dimension8 - i2;
        int dimension9 = (int) getResources().getDimension(R.dimen.not_additional_container_size);
        this.G = dimension9;
        int i4 = dimension9 - i2;
        int i5 = dimension4 - i;
        this.H = i5;
        int i6 = dimension5 - i;
        this.I = i6;
        this.J = i5;
        this.K = i6;
        this.O = new vpa();
        this.P = new io.reactivex.rxjava3.disposables.b();
        this.Q = msy.a(LazyThreadSafetyMode.NONE, new i21(24));
        setBackgroundResource(R.drawable.highlight);
        setWillNotDraw(false);
        setClipChildren(false);
        bwt0.i0(this, new rm0(20, this, context));
        setOnLongClickListener(new q4w(this, 1));
        NotificationAvatarViewContainer notificationAvatarViewContainer = new NotificationAvatarViewContainer(context, null, 6);
        c(notificationAvatarViewContainer, dimension8, dimension8, i5, i6, i5, i6);
        notificationAvatarViewContainer.setRoundAvatarSize(i3);
        notificationAvatarViewContainer.setBorderParams(new o9r0(false, null, com.vk.movika.sdk.base.model.n.a(3.0f), null, false, null, null, null, null, 2043));
        abg0 abg0Var = dhr0.t;
        notificationAvatarViewContainer.setPlaceholder(new ColorDrawable(abg0Var.c(R.attr.vk_ui_image_placeholder)));
        bwt0.i0(notificationAvatarViewContainer, new ya(26, this, context));
        this.d = notificationAvatarViewContainer;
        ElevationImageView elevationImageView = new ElevationImageView(context, null, 6, 0);
        c(elevationImageView, dimension2, dimension2, 0, 0, 0, 0);
        bwt0.i0(elevationImageView, new by5(22, this, context));
        elevationImageView.setElevationDp(4.0f);
        elevationImageView.setShadowDy(4.0f);
        elevationImageView.setImportantForAccessibility(2);
        this.e = elevationImageView;
        LinkedTextView linkedTextView = new LinkedTextView(context, null, 6, 0);
        int i7 = dimension4 + dimension + dimension7;
        int i8 = dimension4 + dimension3 + dimension7;
        c(linkedTextView, -1, -2, i7, dimension6, i8, dimension6);
        linkedTextView.setOnLinkClickListenerWithoutLock(new kn9(this, 9));
        linkedTextView.setLineSpacing((int) iah0.y(2.0f), 1.0f);
        jno0.c(linkedTextView, R.attr.vk_ui_text_primary);
        linkedTextView.setTextDirection(5);
        Float valueOf = Float.valueOf(14.0f);
        linkedTextView.setTextSize(14.0f);
        this.f = linkedTextView;
        LinkedTextView linkedTextView2 = new LinkedTextView(context, null, 6, 0);
        c(linkedTextView2, -1, -2, i7, dimension6, i8, dimension6);
        linkedTextView2.setOnLinkClickListener(new um3(this, 7));
        linkedTextView2.setLineSpacing((int) iah0.y(2.0f), 1.0f);
        jno0.c(linkedTextView2, R.attr.vk_ui_text_primary);
        linkedTextView2.setTextDirection(5);
        linkedTextView2.setTextSize(14.0f);
        this.g = linkedTextView2;
        LinkedTextView linkedTextView3 = new LinkedTextView(context, null, 6, 0);
        c(linkedTextView3, -1, -2, i7, dimension6, i8, dimension6);
        linkedTextView3.setOnLinkClickListener(new bg0(this, 10));
        linkedTextView3.setLineSpacing((int) iah0.y(1.0f), 1.0f);
        jno0.c(linkedTextView3, R.attr.vk_ui_text_secondary);
        linkedTextView3.setTextDirection(5);
        linkedTextView3.setTextSize(13.0f);
        this.h = linkedTextView3;
        NotificationAvatarViewContainer notificationAvatarViewContainer2 = new NotificationAvatarViewContainer(context, null, 6);
        c(notificationAvatarViewContainer2, dimension9, dimension9, i5, i6, i5, i6);
        notificationAvatarViewContainer2.setRoundAvatarSize(i4);
        notificationAvatarViewContainer2.setBorderParams(new o9r0(false, null, com.vk.movika.sdk.base.model.n.a(3.0f), null, false, null, null, null, null, 2043));
        notificationAvatarViewContainer2.setPlaceholder(new ColorDrawable(abg0Var.c(R.attr.vk_ui_image_placeholder)));
        notificationAvatarViewContainer2.setContentDescription(context.getString(R.string.accessibility_photo));
        bwt0.i0(notificationAvatarViewContainer2, new az2(23, this, context));
        this.i = notificationAvatarViewContainer2;
        TextView[] textViewArr = new TextView[5];
        for (final int i9 = 0; i9 < 5; i9++) {
            final TextView textView = new TextView(context);
            c(textView, -2, this.u, 0, 0, 0, 0);
            com.vk.typography.b.k(textView, FontFamily.MEDIUM, valueOf, 4);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity(17);
            textView.setPadding(iah0.a(12.0f), 0, iah0.a(12.0f), 0);
            textView.setVisibility(4);
            s3q0 s3q0Var = s3q0.a;
            bwt0.i0(textView, new izs() { // from class: xsna.ii70
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v0, types: [xsna.bj70, xsna.iwu] */
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    li70 li70Var = li70.this;
                    NotificationItem notificationItem = li70Var.c;
                    ArrayList<NotificationButton> arrayList = notificationItem != null ? notificationItem.m : null;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i10 = i9;
                        if (size > i10) {
                            c970 c970Var = li70Var.N;
                            if (c970Var != 0) {
                                c970Var.c(context, textView, arrayList.get(i10).f, li70Var.c, li70Var.b);
                            }
                            li70Var.d("button" + (i10 + 1));
                        }
                    }
                    return s3q0.a;
                }
            });
            textViewArr[i9] = textView;
        }
        this.k = textViewArr;
        v770 v770Var = new v770(context, this.t, this.D, new aq1(15, this, context));
        this.l = v770Var;
        c(v770Var, -1, -2, 0, 0, 0, 0);
        ImageView imageView = new ImageView(context);
        omw.b(imageView, R.attr.vk_ui_icon_secondary);
        int i10 = this.w;
        c(imageView, i10, i10, 0, 0, 0, 0);
        this.m = imageView;
        TextView textView2 = new TextView(context);
        jno0.c(textView2, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(textView2, FontFamily.REGULAR, valueOf, 4);
        textView2.setMinHeight(this.v);
        textView2.setGravity(8388627);
        c(textView2, -1, -2, 0, 0, 0, 0);
        textView2.setTextDirection(5);
        this.n = textView2;
        this.j = new View[]{this.d, this.e, this.i, imageView};
        this.M = new GestureDetector(context, new ki70(this));
        this.b = (iwu) bj70Var;
    }

    public static boolean e(View view) {
        return view.getVisibility() == 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final jwx getBlur() {
        return (jwx) this.Q.getValue();
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.d.setPlaceholder(new ColorDrawable(abg0Var.c(R.attr.vk_ui_image_placeholder)));
        this.i.setPlaceholder(new ColorDrawable(abg0Var.c(R.attr.vk_ui_image_placeholder)));
    }

    public final void a(NotificationAvatarViewContainer notificationAvatarViewContainer, NotificationEntity notificationEntity, ImageScreenSize imageScreenSize, boolean z) {
        String str;
        String str2;
        String str3;
        jwx blur;
        if (notificationEntity == null) {
            notificationAvatarViewContainer.clear();
            notificationAvatarViewContainer.setVisibility(4);
            return;
        }
        String str4 = notificationEntity.b;
        boolean z2 = false;
        notificationAvatarViewContainer.setVisibility(0);
        if (z || notificationEntity.Ab() || notificationEntity.zb()) {
            if ("image".equals(str4)) {
                notificationAvatarViewContainer.setImportantForAccessibility(2);
            } else {
                notificationAvatarViewContainer.setImportantForAccessibility(1);
            }
            String str5 = "";
            if (notificationEntity.Ab()) {
                Context context = getContext();
                UserProfile userProfile = notificationEntity.e;
                if (userProfile != null && (str3 = userProfile.e) != null) {
                    str5 = str3;
                }
                notificationAvatarViewContainer.setContentDescription(context.getString(R.string.accessibility_user, str5));
            } else if (notificationEntity.zb()) {
                Context context2 = getContext();
                Group group = notificationEntity.f;
                if (group != null && (str2 = group.d) != null) {
                    str5 = str2;
                }
                notificationAvatarViewContainer.setContentDescription(context2.getString(R.string.accessibility_group, str5));
            } else if (MBridgeConstans.DYNAMIC_VIEW_WX_APP.equals(str4)) {
                Context context3 = getContext();
                ApiApplication apiApplication = notificationEntity.j;
                if (apiApplication != null && (str = apiApplication.c) != null) {
                    str5 = str;
                }
                notificationAvatarViewContainer.setContentDescription(context3.getString(R.string.accessibility_app, str5));
            } else if ("photo".equals(str4)) {
                notificationAvatarViewContainer.setContentDescription(getContext().getString(R.string.accessibility_photo));
            } else if ("video".equals(str4)) {
                notificationAvatarViewContainer.setContentDescription(getContext().getString(R.string.accessibility_video));
            }
            z2 = true;
        }
        if (fxc0.B().c(notificationEntity.h)) {
            blur = getBlur();
        } else {
            Photo photo = notificationEntity.g;
            blur = (photo == null || !photo.Hb()) ? null : getBlur();
        }
        notificationAvatarViewContainer.f(blur, z2);
        Photo photo2 = notificationEntity.g;
        PhotoRestriction photoRestriction = photo2 != null ? photo2.L : null;
        baf0 baf0Var = photoRestriction == null ? null : photoRestriction.d ? new baf0(dhr0.t.a(R.drawable.vk_icon_hide_outline_28), -1) : dhr0.t.b(R.drawable.vk_icon_block_outline_28, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary);
        notificationAvatarViewContainer.setOverlay(baf0Var != null ? new a5h0(baf0Var, f5h0.g.a) : null);
        if (photoRestriction == null || photoRestriction.d) {
            notificationAvatarViewContainer.a(b.b(notificationEntity, imageScreenSize), notificationEntity.Ab() ? AvatarBorderType.CIRCLE : notificationEntity.zb() ? AvatarBorderType.CIRCLE : AvatarBorderType.CIRCLE, cq5.b.a);
        } else {
            notificationAvatarViewContainer.clear();
        }
    }

    public final void b(boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new ji70(this, 0));
        ofFloat.addListener(new d(z));
        ofFloat.start();
    }

    public final void c(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        view.setVisibility(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i2);
        marginLayoutParams.leftMargin = i3;
        marginLayoutParams.topMargin = i4;
        marginLayoutParams.rightMargin = i5;
        marginLayoutParams.bottomMargin = i6;
        addView(view, marginLayoutParams);
    }

    public final void d(String str) {
        NotificationItem notificationItem = this.c;
        if (notificationItem != null) {
            b.d dVar = new b.d("notify");
            dVar.b("click", "action");
            dVar.b(str, TtmlNode.TAG_REGION);
            dVar.b(notificationItem.b, "notify_id");
            dVar.h();
        }
    }

    public final TextView[] getButtons() {
        return this.k;
    }

    public final NotificationItem getItem() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RectF rectF = this.q;
        if (!(rectF != null ? rectF.contains(motionEvent.getX(), motionEvent.getY()) : false)) {
            this.M.onTouchEvent(motionEvent);
            if (this.L || super.onInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        NotificationAvatarViewContainer notificationAvatarViewContainer = this.d;
        boolean e = e(notificationAvatarViewContainer);
        int i6 = this.F;
        int i7 = this.I;
        if (e) {
            int i8 = this.H;
            notificationAvatarViewContainer.layout(i8, i7, i8 + i6, i7 + i6);
        }
        ElevationImageView elevationImageView = this.e;
        boolean e2 = e(elevationImageView);
        int i9 = this.r;
        int i10 = this.y;
        if (e2) {
            int a2 = iah0.a(2);
            int i11 = i10 + i9;
            int i12 = this.s;
            int i13 = this.z + i9;
            elevationImageView.layout((i11 - i12) + a2, (i13 - i12) + a2, i11 + a2, i13 + a2);
        }
        NotificationAvatarViewContainer notificationAvatarViewContainer2 = this.i;
        if (e(notificationAvatarViewContainer2)) {
            int i14 = i5 - this.J;
            int i15 = this.G;
            int i16 = this.K;
            notificationAvatarViewContainer2.layout(i14 - i15, i16, i14, i15 + i16);
        }
        int i17 = this.A;
        int i18 = i9 + i10 + i17;
        int i19 = notificationAvatarViewContainer2.getVisibility() == 0 ? ((i5 - i10) - this.x) - i17 : i5 - i10;
        na70 na70Var = this.E;
        na70Var.q = na70Var.a;
        na70Var.r = 0;
        LinkedTextView linkedTextView = this.f;
        if (e(linkedTextView)) {
            int d2 = na70Var.d(linkedTextView.getMeasuredHeight());
            linkedTextView.layout(i18, d2, linkedTextView.getMeasuredWidth() + i18, linkedTextView.getMeasuredHeight() + d2);
        }
        LinkedTextView linkedTextView2 = this.g;
        if (e(linkedTextView2)) {
            int d3 = na70Var.d(linkedTextView2.getMeasuredHeight());
            linkedTextView2.layout(i18, d3, linkedTextView2.getMeasuredWidth() + i18, linkedTextView2.getMeasuredHeight() + d3);
        }
        v770 v770Var = this.l;
        if (e(v770Var)) {
            int a3 = na70Var.a(v770Var.getMeasuredHeight());
            v770Var.layout(i18, a3, v770Var.getMeasuredWidth() + i18, v770Var.getMeasuredHeight() + a3);
        }
        LinkedTextView linkedTextView3 = this.h;
        if (e(linkedTextView3)) {
            int c2 = na70Var.c(linkedTextView3.getMeasuredHeight());
            linkedTextView3.layout(i18, c2, linkedTextView3.getMeasuredWidth() + i18, linkedTextView3.getMeasuredHeight() + c2);
        }
        TextView textView = this.n;
        if (e(textView)) {
            int measuredHeight = textView.getMeasuredHeight();
            int i20 = this.v;
            int b2 = na70Var.b(Math.max(measuredHeight, i20));
            ImageView imageView = this.m;
            if (e(imageView)) {
                int b3 = x9.b(i20, this.w, 2, b2);
                imageView.layout(i18, b3, imageView.getMeasuredWidth() + i18, imageView.getMeasuredHeight() + b3);
                i18 = this.C + imageView.getMeasuredWidth() + i18;
            }
            textView.layout(i18, b2, textView.getMeasuredWidth() + i18, textView.getMeasuredHeight() + b2);
        } else {
            TextView[] textViewArr = this.k;
            int i21 = 0;
            for (TextView textView2 : textViewArr) {
                if (textView2.getVisibility() == 0) {
                    i21++;
                }
            }
            if (i21 > 0) {
                int i22 = 0;
                for (int i23 = 0; i23 < i21; i23++) {
                    if (i23 != 0) {
                        int i24 = i22 + this.B;
                        if (textViewArr[i23].getMeasuredWidth() + i24 <= i19) {
                            i22 = textViewArr[i23].getMeasuredWidth() + i24;
                            TextView textView3 = textViewArr[i23];
                            textView3.layout(i22 - textView3.getMeasuredWidth(), na70Var.q - textViewArr[i23].getMeasuredHeight(), i22, na70Var.q);
                        }
                    }
                    i22 = textViewArr[i23].getMeasuredWidth() + i18;
                    na70Var.b(this.u);
                    TextView textView32 = textViewArr[i23];
                    textView32.layout(i22 - textView32.getMeasuredWidth(), na70Var.q - textViewArr[i23].getMeasuredHeight(), i22, na70Var.q);
                }
            }
        }
        m870 m870Var = this.o;
        if (m870Var != null) {
            int max = Math.max(na70Var.q, i7 + i6);
            m870Var.layout(i10, max, m870Var.getMeasuredWidth() + i10, m870Var.getMeasuredHeight() + max);
            RectF rectF = this.q;
            if (rectF == null) {
                rectF = new RectF(i10, max, m870Var.getMeasuredWidth() + i10, m870Var.getMeasuredHeight() + max);
            }
            this.q = rectF;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        View[] viewArr = this.j;
        int length = viewArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (e(viewArr[i3])) {
                measureChild(viewArr[i3], i, i2);
            }
        }
        int max = e(this.d) ? Math.max(0, (this.I * 2) + this.F) : 0;
        NotificationAvatarViewContainer notificationAvatarViewContainer = this.i;
        if (e(notificationAvatarViewContainer)) {
            max = Math.max(max, (this.K * 2) + this.G);
        }
        na70 na70Var = this.E;
        na70Var.q = na70Var.a;
        na70Var.r = 0;
        int visibility = notificationAvatarViewContainer.getVisibility();
        int i4 = this.A;
        int i5 = this.r;
        int i6 = this.y;
        if (visibility == 0) {
            size = (((View.MeasureSpec.getSize(i) - i6) - i5) - i4) - i4;
            i4 = this.x;
        } else {
            size = (View.MeasureSpec.getSize(i) - i6) - i5;
        }
        int i7 = (size - i4) - i6;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
        LinkedTextView linkedTextView = this.f;
        if (e(linkedTextView)) {
            measureChild(linkedTextView, makeMeasureSpec, makeMeasureSpec2);
            na70Var.d(linkedTextView.getMeasuredHeight());
        }
        LinkedTextView linkedTextView2 = this.g;
        if (e(linkedTextView2)) {
            measureChild(linkedTextView2, makeMeasureSpec, makeMeasureSpec2);
            na70Var.d(linkedTextView2.getMeasuredHeight());
        }
        v770 v770Var = this.l;
        if (e(v770Var)) {
            measureChild(v770Var, makeMeasureSpec, makeMeasureSpec2);
            na70Var.a(v770Var.getMeasuredHeight());
        }
        LinkedTextView linkedTextView3 = this.h;
        if (e(linkedTextView3)) {
            measureChild(linkedTextView3, makeMeasureSpec, makeMeasureSpec2);
            na70Var.c(linkedTextView3.getMeasuredHeight());
        }
        TextView textView = this.n;
        if (e(textView)) {
            boolean e = e(this.m);
            int i8 = this.v;
            measureChild(textView, e ? View.MeasureSpec.makeMeasureSpec((i7 - i8) - this.C, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), makeMeasureSpec2);
            na70Var.b(Math.max(textView.getMeasuredHeight(), i8));
        } else {
            TextView[] textViewArr = this.k;
            int i9 = 0;
            for (TextView textView2 : textViewArr) {
                if (textView2.getVisibility() == 0) {
                    i9++;
                }
            }
            if (i9 > 0) {
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    measureChild(textViewArr[i11], makeMeasureSpec3, makeMeasureSpec2);
                    if (i11 != 0) {
                        int i12 = i10 + this.B;
                        if (textViewArr[i11].getMeasuredWidth() + i12 <= i7) {
                            i10 = textViewArr[i11].getMeasuredWidth() + i12;
                        }
                    }
                    i10 = textViewArr[i11].getMeasuredWidth();
                    na70Var.b(this.u);
                }
            }
        }
        m870 m870Var = this.o;
        if (m870Var != null) {
            measureChild(m870Var, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (i6 * 2), 1073741824), makeMeasureSpec2);
            int measuredHeight = m870Var.getMeasuredHeight();
            Float f = this.p;
            if (f != null) {
                measuredHeight = an10.b(measuredHeight * f.floatValue());
            }
            max = Math.max(max, na70Var.q) + measuredHeight;
        }
        int i13 = na70Var.r;
        if (i13 == na70Var.o) {
            na70Var.q += na70Var.h;
        } else if (i13 == na70Var.p) {
            na70Var.q += na70Var.j;
        }
        int i14 = na70Var.q + na70Var.a;
        na70Var.q = i14;
        na70Var.r = 0;
        setMeasuredDimension(View.MeasureSpec.getSize(i), Math.max(max, i14));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.M.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z = true;
        if (action != 1 && action != 3 && action != 5) {
            z = false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (z) {
            setPressed(false);
            this.L = false;
        }
        return onTouchEvent;
    }

    @Override // android.view.View
    public final boolean performLongClick() {
        if (!this.L) {
            return false;
        }
        setPressed(false);
        return super.performLongClick();
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0348  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setItem(NotificationItem notificationItem) {
        int i;
        CharSequence charSequence;
        CharSequence charSequence2;
        m870 m870Var;
        String str;
        NotificationItem notificationItem2;
        this.c = notificationItem;
        setEnabled(notificationItem.l != null);
        NotificationItem notificationItem3 = this.c;
        NotificationEntity notificationEntity = notificationItem3 != null ? notificationItem3.d : null;
        ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_48DP;
        a(this.d, notificationEntity, imageScreenSize, true);
        NotificationItem notificationItem4 = this.c;
        ElevationImageView elevationImageView = this.e;
        if (notificationItem4 == null) {
            elevationImageView.clear();
            elevationImageView.setVisibility(4);
        } else {
            String str2 = notificationItem4.e;
            String str3 = notificationItem4.f;
            elevationImageView.setVisibility(0);
            if ((str3 == null || str3.length() == 0) && !"custom".equals(str2)) {
                if ((str3 == null || str3.length() == 0) && !"custom".equals(str2)) {
                    if (epx.f(str2, NotificationIconType.Achievements.h())) {
                        i = R.drawable.vk_icon_achievement_circle_fill_blue_20;
                    } else if (epx.f(str2, NotificationIconType.Ads.h())) {
                        i = R.drawable.vk_icon_rouble_circle_fill_blue_20;
                    } else if (epx.f(str2, NotificationIconType.Birthday.h())) {
                        i = R.drawable.vk_icon_gift_circle_fill_red_20;
                    } else if (epx.f(str2, NotificationIconType.Call.h())) {
                        i = R.drawable.vk_icon_phone_circle_fill_green_20;
                    } else if (epx.f(str2, NotificationIconType.Cancel.h())) {
                        i = R.drawable.vk_icon_cancel_circle_fill_red_20;
                    } else if (epx.f(str2, NotificationIconType.Comment.h())) {
                        i = R.drawable.vk_icon_comment_circle_fill_green_20;
                    } else if (epx.f(str2, NotificationIconType.CommentGray.h())) {
                        i = R.drawable.vk_icon_comment_circle_fill_gray_20;
                    } else if (epx.f(str2, NotificationIconType.Discussions.h())) {
                        i = R.drawable.vk_icon_discussions_circle_fill_blue_20;
                    } else if (epx.f(str2, NotificationIconType.Event.h())) {
                        i = R.drawable.vk_icon_calendar_circle_fill_red_20;
                    } else {
                        if (!epx.f(str2, NotificationIconType.Follow.h())) {
                            if (!epx.f(str2, NotificationIconType.FriendAccepted.h())) {
                                if (epx.f(str2, NotificationIconType.FriendFound.h())) {
                                    i = R.drawable.vk_icon_user_circle_fill_blue_20;
                                } else if (!epx.f(str2, NotificationIconType.FriendSuggest.h())) {
                                    if (epx.f(str2, NotificationIconType.Gift.h())) {
                                        i = R.drawable.vk_icon_gift_circle_fill_yellow_20;
                                    } else if (epx.f(str2, NotificationIconType.Interesting.h())) {
                                        i = R.drawable.vk_icon_fire_circle_fill_red_20;
                                    } else if (epx.f(str2, NotificationIconType.InviteApp.h())) {
                                        i = R.drawable.vk_icon_game_circle_fill_blue_20;
                                    } else if (epx.f(str2, NotificationIconType.InviteGroup.h())) {
                                        i = R.drawable.vk_icon_box_circle_fill_blue_20;
                                    } else if (!epx.f(str2, NotificationIconType.InviteGroupAccepted.h())) {
                                        if (epx.f(str2, NotificationIconType.Like.h())) {
                                            i = R.drawable.vk_icon_like_circle_fill_red_20;
                                        } else if (epx.f(str2, NotificationIconType.LikeGray.h())) {
                                            i = R.drawable.vk_icon_like_circle_fill_gray_20;
                                        } else if (epx.f(str2, NotificationIconType.Live.h())) {
                                            i = R.drawable.vk_icon_video_camera_circle_fill_red_20;
                                        } else if (epx.f(str2, NotificationIconType.Mention.h())) {
                                            i = R.drawable.vk_icon_mention_circle_fill_blue_20;
                                        } else if (epx.f(str2, NotificationIconType.Message.h())) {
                                            i = R.drawable.vk_icon_message_circle_fill_green_20;
                                        } else if (epx.f(str2, NotificationIconType.MessageRequest.h())) {
                                            i = R.drawable.vk_icon_message_circle_fill_blue_20;
                                        } else if (epx.f(str2, NotificationIconType.NewPost.h())) {
                                            i = R.drawable.vk_icon_rss_circle_fill_yellow_20;
                                        } else if (epx.f(str2, NotificationIconType.PhotoTag.h())) {
                                            i = R.drawable.vk_icon_camera_circle_fill_green_20;
                                        } else if (epx.f(str2, NotificationIconType.Podcast.h())) {
                                            i = R.drawable.vk_icon_podcast_circle_fill_red_20;
                                        } else if (epx.f(str2, NotificationIconType.PrivatePost.h())) {
                                            i = R.drawable.vk_icon_rss_circle_fill_black_20;
                                        } else if (epx.f(str2, NotificationIconType.Reply.h())) {
                                            i = R.drawable.vk_icon_reply_circle_fill_green_20;
                                        } else if (epx.f(str2, NotificationIconType.ReplyGray.h())) {
                                            i = R.drawable.vk_icon_reply_circle_fill_gray_20;
                                        } else if (epx.f(str2, NotificationIconType.Repost.h())) {
                                            i = R.drawable.vk_icon_repost_circle_fill_green_20;
                                        } else if (epx.f(str2, NotificationIconType.RequestMoney.h())) {
                                            i = R.drawable.vk_icon_money_request_circle_fill_blue_20;
                                        } else if (epx.f(str2, NotificationIconType.StoryReply.h())) {
                                            i = R.drawable.vk_icon_story_reply_circle_fill_violet_20;
                                        } else if (epx.f(str2, NotificationIconType.StoryQuestion.h())) {
                                            i = R.drawable.vk_icon_question_circle_fill_violet_20;
                                        } else if (epx.f(str2, NotificationIconType.StoryQuestionAnswer.h())) {
                                            i = R.drawable.vk_icon_question_circle_fill_green_20;
                                        } else if (epx.f(str2, NotificationIconType.SuggestedPostPublished.h())) {
                                            i = R.drawable.vk_icon_check_circle_fill_yellow_20;
                                        } else if (epx.f(str2, NotificationIconType.TransferMoney.h())) {
                                            i = R.drawable.vk_icon_money_transfer_circle_fill_turquoise_20;
                                        } else if (epx.f(str2, NotificationIconType.TransferMoneyCancelled.h())) {
                                            i = R.drawable.vk_icon_money_transfer_circle_fill_red_20;
                                        } else if (epx.f(str2, NotificationIconType.TransferVotes.h())) {
                                            i = R.drawable.vk_icon_votest_transfer_circle_fill_turquoise_20;
                                        } else if (epx.f(str2, NotificationIconType.Voting.h())) {
                                            i = R.drawable.vk_icon_poll_circle_fill_green_20;
                                        } else if (epx.f(str2, NotificationIconType.Wall.h())) {
                                            i = R.drawable.vk_icon_edit_circle_fill_blue_20;
                                        } else if (epx.f(str2, NotificationIconType.WishlistBirthday.h())) {
                                            i = R.drawable.vk_icon_list_like_circle_fill_blue_20;
                                        } else if (epx.f(str2, NotificationIconType.Donut.h())) {
                                            i = R.drawable.vk_icon_donate_circle_fill_yellow_20;
                                        } else if (epx.f(str2, NotificationIconType.MarketOrderStatusCollecting.h())) {
                                            i = R.drawable.vk_icon_recent_circle_fill_yellow_20;
                                        }
                                    }
                                }
                            }
                            i = R.drawable.vk_icon_check_circle_fill_green_20;
                        }
                        i = R.drawable.vk_icon_add_circle_fill_blue_20;
                    }
                    if (i == 0) {
                        elevationImageView.setImageDrawable(m33.a(i, elevationImageView.getContext()));
                    } else {
                        elevationImageView.clear();
                        elevationImageView.setVisibility(4);
                    }
                }
                i = 0;
                if (i == 0) {
                }
            } else {
                elevationImageView.O0(str3, ImageScreenSize.SIZE_20DP);
            }
        }
        NotificationItem notificationItem5 = this.c;
        a(this.i, notificationItem5 != null ? notificationItem5.j : null, imageScreenSize, false);
        NotificationItem notificationItem6 = this.c;
        b bVar = R;
        if (notificationItem6 == null) {
            charSequence = null;
        } else {
            if (notificationItem6.s == null) {
                String str4 = notificationItem6.g;
                notificationItem6.s = str4 != null ? b.c(bVar, notificationItem6, str4, 28) : null;
            }
            charSequence = notificationItem6.s;
        }
        k15.b(this.f, charSequence);
        NotificationItem notificationItem7 = this.c;
        if (notificationItem7 == null) {
            charSequence2 = null;
        } else {
            String str5 = notificationItem7.h;
            if (notificationItem7.r) {
                if (notificationItem7.u == null) {
                    notificationItem7.u = b.c(bVar, notificationItem7, str5, 28);
                }
                charSequence2 = notificationItem7.u;
            } else {
                if (notificationItem7.t == null) {
                    notificationItem7.t = b.c(bVar, notificationItem7, str5, 24);
                }
                charSequence2 = notificationItem7.t;
            }
        }
        if (charSequence2 != null && charSequence2.length() != 0 && (notificationItem2 = this.c) != null && notificationItem2.w) {
            hi70 hi70Var = new hi70(this, notificationItem2);
            vpa vpaVar = this.O;
            vpaVar.getClass();
            io.reactivex.rxjava3.internal.operators.completable.m mVar = new io.reactivex.rxjava3.internal.operators.completable.m(new upa(vpaVar, charSequence2, hi70Var));
            asu0.a.getClass();
            this.P.b(itg0.l(mVar.q(asu0.i()).o(io.reactivex.rxjava3.android.schedulers.a.b())));
        }
        k15.b(this.g, charSequence2);
        NotificationItem notificationItem8 = this.c;
        k15.b(this.h, (notificationItem8 == null || (str = notificationItem8.i) == null) ? null : b.c(bVar, notificationItem8, str, 20));
        NotificationItem notificationItem9 = this.c;
        this.l.setNotification(notificationItem9 != null ? notificationItem9.k : null);
        NotificationItem notificationItem10 = this.c;
        NotificationItem.b bVar2 = notificationItem10 != null ? notificationItem10.v : null;
        TextView textView = this.n;
        TextView[] textViewArr = this.k;
        ImageView imageView = this.m;
        if (bVar2 != null) {
            NotificationItem.b bVar3 = notificationItem10 != null ? notificationItem10.v : null;
            if (bVar3 != null) {
                Integer num = bVar3.a;
                Context context = getContext();
                Integer num2 = bVar3.b;
                k15.b(textView, num2 == null ? bVar3.c : context.getResources().getString(num2.intValue()));
                if (num != null) {
                    imageView.setVisibility(0);
                    imageView.setImageResource(num.intValue());
                } else {
                    imageView.setVisibility(4);
                }
            } else {
                imageView.setVisibility(4);
                textView.setVisibility(4);
            }
            for (TextView textView2 : textViewArr) {
                textView2.setVisibility(4);
            }
        } else {
            imageView.setVisibility(4);
            textView.setVisibility(4);
            NotificationItem notificationItem11 = this.c;
            ArrayList<NotificationButton> arrayList = notificationItem11 != null ? notificationItem11.m : null;
            int length = textViewArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (arrayList == null || i2 >= arrayList.size()) {
                    textViewArr[i2].setVisibility(4);
                } else {
                    TextView textView3 = textViewArr[i2];
                    NotificationButton notificationButton = arrayList.get(i2);
                    if (notificationButton == null) {
                        textView3.setVisibility(4);
                    } else {
                        textView3.setVisibility(0);
                        textView3.setText(notificationButton.b);
                        if ("primary".equals(notificationButton.c)) {
                            jno0.c(textView3, R.attr.vk_legacy_button_primary_foreground);
                            textView3.setBackgroundResource(R.drawable.vkui_bg_button_primary);
                        } else {
                            jno0.c(textView3, R.attr.vk_legacy_button_secondary_foreground);
                            textView3.setBackgroundResource(R.drawable.vkui_bg_button_secondary);
                        }
                    }
                }
            }
        }
        if (this.p == null) {
            NotificationItem notificationItem12 = this.c;
            if (!j5g.P(T, notificationItem12 != null ? notificationItem12.b : null)) {
                NotificationItem notificationItem13 = this.c;
                if (notificationItem13 != null && notificationItem13.q && this.o == null) {
                    m870 m870Var2 = new m870(getContext());
                    c(m870Var2, -1, -2, 0, 0, 0, 0);
                    m870Var2.setVisibility(0);
                    m870Var2.setOnClose(new obh(this, 28));
                    m870Var2.setOnSubmit(new gy(1, this, li70.class, "submitCSat", "submitCSat(Lcom/vk/notifications/common/NotificationCSatRate;)V", 0, 12));
                    this.o = m870Var2;
                } else if (notificationItem13 != null && !notificationItem13.q && (m870Var = this.o) != null) {
                    ViewParent parent = m870Var.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(m870Var);
                    }
                    this.o = null;
                    this.q = null;
                }
            }
        }
        requestLayout();
    }

    public final void setNotificationClickHandler(c970 c970Var) {
        this.N = c970Var;
    }

    /* compiled from: NotificationView.kt */
    public static final class c implements raz {
        public static final c a = new c();

        @Override // xsna.raz
        public final String n() {
            return "notification";
        }

        @Override // xsna.raz
        public final void a(String str) {
        }

        @Override // xsna.raz
        public final void b(String str) {
        }
    }

    /* compiled from: Animator.kt */
    public static final class d implements Animator.AnimatorListener {
        public final /* synthetic */ boolean c;

        public d(boolean z) {
            this.c = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            c970 c970Var;
            String str;
            li70 li70Var = li70.this;
            m870 m870Var = li70Var.o;
            if (m870Var != null) {
                ViewParent parent = m870Var.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(m870Var);
                }
            }
            li70Var.o = null;
            li70Var.q = null;
            li70Var.p = null;
            NotificationItem notificationItem = li70Var.c;
            if (notificationItem != null && (str = notificationItem.b) != null) {
                li70.T.add(str);
            }
            li70Var.requestLayout();
            if (this.c || (c970Var = li70Var.N) == null) {
                return;
            }
            li70Var.getContext();
            c970Var.a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }
}
