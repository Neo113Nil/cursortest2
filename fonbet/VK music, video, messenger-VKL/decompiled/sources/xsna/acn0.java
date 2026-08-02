package xsna;

import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.text.SquareExcerptTextView;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.api.dto.widgets.actions.WebActionSubscribe;
import com.vk.superapp.api.dto.widgets.actions.WebSubscribeExtra;
import com.vk.superapp.ui.widgets.subscribe_tile.SubIcon;
import com.vk.superapp.ui.widgets.subscribe_tile.SubscribeTileIcon;
import com.vk.superapp.ui.widgets.subscribe_tile.SuperAppWidgetSubscribeTile;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import com.vk.superapp.ui.widgets.tile.TileBottomContent;
import com.vk.superapp.ui.widgets.tile.TileStyle;
import com.vk.superapp.ui.widgets.tile.TileType;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.f5h0;
import xsna.zdn0;

/* compiled from: SuperAppSubscribeTileWidgetHolder.kt */
/* loaded from: classes6.dex */
public final class acn0 extends ucn0<ien0> {
    public static final int A = iah0.a(173);
    public final u7n0 p;
    public final ConstraintLayout q;
    public final VKImageView r;
    public final SquareExcerptTextView s;
    public final TextView t;
    public final PhotoStackView u;
    public final TextView v;
    public final VKImageView w;
    public final ImageView x;
    public final FrameLayout y;
    public final ImageButton z;

    /* compiled from: SuperAppSubscribeTileWidgetHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TileBottomContent.BottomContentType.values().length];
            try {
                iArr[TileBottomContent.BottomContentType.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileBottomContent.BottomContentType.SUBTITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TileBottomContent.BottomContentType.USER_STACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TileBottomContent.BottomContentType.BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TileType.values().length];
            try {
                iArr2[TileType.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public acn0(View view, zdn0.b bVar) {
        super(view, null);
        this.p = bVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView.findViewById(R.id.subscribe_tile_root_view);
        this.q = constraintLayout;
        this.r = (VKImageView) this.itemView.findViewById(R.id.cover_image);
        SquareExcerptTextView squareExcerptTextView = (SquareExcerptTextView) this.itemView.findViewById(R.id.title);
        this.s = squareExcerptTextView;
        this.t = (TextView) this.itemView.findViewById(R.id.group_category);
        PhotoStackView photoStackView = (PhotoStackView) this.itemView.findViewById(R.id.friends_photos);
        this.u = photoStackView;
        this.v = (TextView) this.itemView.findViewById(R.id.subscribers_count);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.avatar_image);
        this.w = vKImageView;
        this.x = (ImageView) this.itemView.findViewById(R.id.icon_meta);
        this.y = (FrameLayout) this.itemView.findViewById(R.id.subscribe_button_layout);
        this.z = (ImageButton) this.itemView.findViewById(R.id.subscribe_button);
        this.itemView.setClipToOutline(true);
        bwt0.i0(this.itemView, new mdm0(this, 5));
        constraintLayout.setForeground(this.itemView.getContext().getDrawable(R.drawable.vk_tile_ripple_foreground));
        photoStackView.v(14.0f, 1.0f, 16.0f);
        squareExcerptTextView.setShowMoreText("");
        squareExcerptTextView.setMaxExcerptLines(squareExcerptTextView.getMaxLines());
        squareExcerptTextView.setShouldTruncate(true);
        squareExcerptTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (vKImageView != null) {
            njt hierarchy = vKImageView.getHierarchy();
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.c(cn70.c(2), krv0.m(R.attr.vk_ui_background_tertiary, vKImageView.getContext()));
            roundingParams.g(cn70.c(1));
            hierarchy.u(roundingParams);
            vKImageView.getHierarchy().o(f5h0.f.a);
        }
        squareExcerptTextView.setGradientColor(krv0.m(R.attr.vk_ui_background_modal, this.itemView.getContext()));
        constraintLayout.setBackground(this.itemView.getContext().getDrawable(R.drawable.vk_bg_tile_radius_12_v6));
        constraintLayout.setElevation(iah0.b(0.7f));
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        TileStyle tileStyle;
        WebImage webImage;
        WebImageSize d;
        WebImageSize f;
        List A2;
        ien0 ien0Var = (ien0) zif0Var;
        StringBuilder sb = new StringBuilder();
        SuperAppWidgetSubscribeTile.Payload payload = ien0Var.h.o;
        Iterator it = j5g.H0(payload.f, 3).iterator();
        int i = 0;
        while (true) {
            int i2 = 1;
            if (!it.hasNext()) {
                this.q.setContentDescription(sb.toString());
                WebImage webImage2 = payload.e;
                VKImageView vKImageView = this.r;
                if (vKImageView != null) {
                    vKImageView.setVisibility(0);
                    vKImageView.setClipToOutline(true);
                    vKImageView.setOutlineProvider(new t0w0(4, cn70.a() * 12.0f, false, false));
                    vKImageView.setActualScaleType(f5h0.f.a);
                    vKImageView.load((webImage2 == null || (f = webImage2.f(A)) == null) ? null : f.b);
                }
                SubscribeTileIcon subscribeTileIcon = payload.b;
                String str = (subscribeTileIcon == null || (webImage = subscribeTileIcon.b) == null || (d = webImage.d()) == null) ? null : d.b;
                VKImageView vKImageView2 = this.w;
                vKImageView2.load(str);
                TileType tileType = (subscribeTileIcon == null || (tileStyle = subscribeTileIcon.c) == null) ? null : tileStyle.b;
                if ((tileType == null ? -1 : a.$EnumSwitchMapping$1[tileType.ordinal()]) == 1) {
                    vKImageView2.setRound(true);
                } else {
                    vKImageView2.setRound(false);
                }
                VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                VerifyInfoHelper.k(this.x, true, new VerifyInfo((subscribeTileIcon != null ? subscribeTileIcon.d : null) instanceof SubIcon.Verified, false, false, false, false, false, 62, null), false, false, 56);
                ImageButton imageButton = this.z;
                if (imageButton != null) {
                    abg0 abg0Var = dhr0.t;
                    imageButton.setBackgroundTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_background_accent_themed)));
                    imageButton.setImageTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_icon_contrast_themed)));
                }
                this.y.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                g6(ien0Var.i());
                bwt0.i0(imageButton, new btl0(i2, ien0Var, this));
                return;
            }
            Object next = it.next();
            int i3 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            TileBottomContent tileBottomContent = (TileBottomContent) next;
            TileBottomContent.BottomContentType bottomContentType = tileBottomContent.b;
            String str2 = tileBottomContent.c;
            int i4 = a.$EnumSwitchMapping$0[bottomContentType.ordinal()];
            if (i4 != 1) {
                PhotoStackView photoStackView = this.u;
                TextView textView = this.v;
                if (i4 != 2) {
                    if (i4 == 3) {
                        textView.setText(str2);
                        int b = cn70.b(16);
                        int i5 = 0;
                        photoStackView.setVisibility(0);
                        List<ImageWithAction> list = tileBottomContent.d;
                        if (list != null && (A2 = rli0.A(rli0.y(rli0.t(new i5g(list), new ybn0(b, i5)), 3))) != null) {
                            photoStackView.r(-1, A2);
                        }
                        sb.append(str2);
                        sb.append(" ");
                    } else {
                        if (i4 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s3q0 s3q0Var = s3q0.a;
                    }
                } else if (i == 2) {
                    textView.setText(str2);
                    f4m.j(photoStackView);
                    sb.append(str2);
                    sb.append(" ");
                } else {
                    this.t.setText(str2);
                    sb.append(str2);
                    sb.append(" ");
                }
            } else {
                this.s.setText(str2);
                sb.append(str2);
                sb.append(" ");
            }
            i = i3;
        }
    }

    public final void g6(boolean z) {
        ImageButton imageButton = this.z;
        imageButton.setContentDescription(z ? imageButton.getContext().getString(R.string.leave_group) : imageButton.getContext().getString(R.string.join_group));
        imageButton.setImageResource(z ? R.drawable.vk_icon_check_alt_20 : R.drawable.vk_icon_add_alt_20);
    }

    public final void h6(ien0 ien0Var, boolean z) {
        WebSubscribeExtra webSubscribeExtra;
        WebActionSubscribe h = ien0Var.h();
        if (h == null || (webSubscribeExtra = h.e) == null) {
            return;
        }
        WebSubscribeExtra.MemberStatus memberStatus = webSubscribeExtra.e;
        boolean z2 = webSubscribeExtra.d;
        boolean j = ien0.j(webSubscribeExtra);
        ver0.c(this.itemView.getContext(), o0r0.g(xwk.e(), fkq0.e(new UserId(h.d)), j, null, z, null, 52).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ox80(new ru4(j, webSubscribeExtra), 15), new cx00(new zbn0(webSubscribeExtra, memberStatus, z2, this, ien0Var), 29)));
    }
}
