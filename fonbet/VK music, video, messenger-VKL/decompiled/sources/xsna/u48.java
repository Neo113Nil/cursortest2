package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;
import com.vk.camera.editor.stories.impl.bottompanel.BottomControlPanelSkeletonView;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.stories.design.view.AvatarButton;
import com.vk.storycamera.builder.StoryEditorCameraParams;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.h7u0;
import xsna.ikv0;

/* compiled from: BottomControlPanelView.kt */
/* loaded from: classes6.dex */
public final class u48 extends FrameLayout implements q3p {
    public static final int q = cn70.b(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
    public static final int r = cn70.b(64);
    public static final int s = cn70.b(10);
    public static final int t = cn70.b(60);
    public static final int u = cn70.b(6);
    public final boolean b;
    public int c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final s3p g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public u76 m;
    public View n;
    public boolean o;
    public boolean p;

    /* compiled from: BottomControlPanelView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryPrivacyType.values().length];
            try {
                iArr[StoryPrivacyType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoryPrivacyType.BEST_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoryPrivacyType.ONLY_ME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoryPrivacyType.FRIENDS_OF_FRIENDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoryPrivacyType.SOME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoryPrivacyType.EXCLUDED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public u48(l7s l7sVar) {
        super(l7sVar, null, 0);
        StoriesFeatures storiesFeatures = StoriesFeatures.VERTICALIZATION;
        storiesFeatures.getClass();
        this.b = com.vk.toggle.b.A.a(storiesFeatures);
        il1 il1Var = new il1(this, 6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, il1Var);
        this.e = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.d(this, 5));
        this.f = msy.a(lazyThreadSafetyMode, new hg(this, 8));
        View.inflate(l7sVar, R.layout.layout_story_editor_bottom_panel_new, this);
        s3p s3pVar = new s3p(l7sVar);
        s3pVar.setPadding(0, cn70.b(6), 0, cn70.b(6));
        s3pVar.setGalleryPickerPreviewAdapter(null);
        s3pVar.setClipToPadding(false);
        f4m.j(s3pVar);
        addView(s3pVar);
        this.g = s3pVar;
        this.h = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.f(this, 8));
        this.i = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.g(this, 9));
        this.j = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 11));
        int i = 6;
        this.k = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.processor.actions.i(this, i));
        this.l = msy.a(lazyThreadSafetyMode, new bu1(this, i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkToolButton getChangePrivacyButton() {
        return (VkToolButton) this.j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final g9m0 getPrivacyController() {
        return (g9m0) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkToolButton getRecipientsButton() {
        return (VkToolButton) this.k.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final u1m0 getRouter() {
        return (u1m0) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AvatarButton getShareButton() {
        return (AvatarButton) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getSingleStoryActionsPanel() {
        return (View) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final BottomControlPanelSkeletonView getSkeleton() {
        return (BottomControlPanelSkeletonView) this.h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final b2m0 getStoryEditorUtils() {
        return (b2m0) this.d.getValue();
    }

    @Override // xsna.q3p
    public final void T(StoryCameraTarget storyCameraTarget) {
        setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c(storyCameraTarget);
    }

    @Override // xsna.q3p
    public final void a() {
        StoryEditorCameraParams A0;
        StoryEditorCameraParams A02;
        StoryEditorCameraParams.PublishInfo publishInfo;
        u76 u76Var = this.m;
        setSendButtonAvatar((u76Var == null || (A02 = u76Var.A0()) == null || (publishInfo = A02.m) == null) ? null : publishInfo.d);
        VkToolButton changePrivacyButton = getChangePrivacyButton();
        iut0.q(changePrivacyButton, new v48(changePrivacyButton, Integer.valueOf(R.string.story_button_privacy_action)));
        VkToolButton recipientsButton = getRecipientsButton();
        iut0.q(recipientsButton, new v48(recipientsButton, Integer.valueOf(R.string.story_button_recipients_action)));
        AvatarButton shareButton = getShareButton();
        iut0.q(shareButton, new v48(shareButton, null));
        VkToolButton.c(getRecipientsButton(), Integer.valueOf(R.drawable.vk_icon_share_outline_20));
        getRecipientsButton().setText(R.string.story_choose_receivers_share);
        getRecipientsButton().setStyle(new vml());
        bwt0.i0(getChangePrivacyButton(), new sa(this, 12));
        bwt0.i0(getRecipientsButton(), new r7(this, 13));
        bwt0.i0(getShareButton(), new za(this, 10));
        if (!m()) {
            bwt0.k0(getShareButton(), new tm0(this, 13));
        }
        this.g.setOnAction(new bb(this, 10));
        u76 u76Var2 = this.m;
        if (u76Var2 == null || (A0 = u76Var2.A0()) == null) {
            return;
        }
        getSkeleton().setupViews(A0);
        getChangePrivacyButton().setVisibility(A0.d() ? 0 : 8);
        getRecipientsButton().setVisibility(!A0.e() ? 0 : 8);
        getShareButton().setVisibility(A0.k.h.m ? 0 : 8);
    }

    @Override // xsna.q3p
    public final void b(int i) {
        this.c = i;
        l(i, false);
    }

    @Override // xsna.q3p
    public final void c(StoryCameraTarget storyCameraTarget) {
        StoryEditorCameraParams A0;
        StoryEditorCameraParams A02;
        StoryEditorCameraParams.PublishInfo publishInfo;
        UserId userId;
        boolean m = m();
        boolean z = iah0.z(getContext()) < cn70.b(360);
        if (storyCameraTarget.h() || z) {
            getShareButton().setAvatarVisibility(false);
        } else {
            getShareButton().setAvatarVisibility(true);
        }
        u76 u76Var = this.m;
        boolean z2 = (u76Var == null || (A02 = u76Var.A0()) == null || (publishInfo = A02.m) == null || (userId = publishInfo.b) == null || !fkq0.b(userId)) ? false : true;
        if (m || z2) {
            VkToolButton changePrivacyButton = getChangePrivacyButton();
            u76 u76Var2 = this.m;
            changePrivacyButton.setVisibility((u76Var2 == null || (A0 = u76Var2.A0()) == null) ? false : A0.d() ? 0 : 8);
            getRecipientsButton().setVisibility(m ? 8 : 0);
            boolean h = storyCameraTarget.h();
            int i = R.string.story_publish_button_send;
            getShareButton().setTitle(h ? R.string.story_publish_button_send : R.string.story_publish_short);
            if (!storyCameraTarget.h()) {
                i = R.string.story_button_recipients_action;
            }
            this.g.setActionContentDescription(getContext().getString(i));
        }
    }

    @Override // xsna.q3p
    public final boolean d() {
        return this.p;
    }

    @Override // xsna.q3p
    public final boolean e() {
        return this.o;
    }

    @Override // xsna.q3p
    public final void f() {
        Context context = getContext();
        lpj lpjVar = context instanceof lpj ? (lpj) context : null;
        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
        dhr0.a.getClass();
        int i = dhr0.u().c;
        if (valueOf == null || valueOf.intValue() != i) {
            context = new l7s(context, dhr0.u().c);
        }
        int i2 = h7u0.p;
        h7u0.a c = h7u0.b.c(context);
        c.g0(R.string.cant_open_profile);
        c.U(R.string.try_again);
        c.c0(R.string.close, new t48(0));
        c.m();
    }

    @Override // xsna.q3p
    public final void g(StoryPrivacyType storyPrivacyType, StoryPrivacyType storyPrivacyType2, q9m0 q9m0Var, vn7 vn7Var) {
        getRouter().a(getContext(), new hed0(storyPrivacyType, storyPrivacyType2, q9m0Var), getPrivacyController(), false, vn7Var);
    }

    @Override // xsna.q3p
    public int getBottomMargin() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    @Override // xsna.q3p
    public View getPrivacyButtonView() {
        return getChangePrivacyButton();
    }

    @Override // xsna.q3p
    public Rect getSendButtonRect() {
        return bwt0.C(getShareButton());
    }

    @Override // xsna.q3p
    public final void h(boolean z, boolean z2) {
        boolean z3 = false;
        getRecipientsButton().setEnabled(z && z2);
        AvatarButton shareButton = getShareButton();
        if (z && z2) {
            z3 = true;
        }
        shareButton.setEnabled(z3);
    }

    @Override // xsna.q3p
    public final void i(ImageView imageView) {
        this.n = imageView;
    }

    @Override // xsna.q3p
    public final void j(f640 f640Var, androidx.recyclerview.widget.r rVar) {
        s3p s3pVar = this.g;
        s3pVar.setVisibility(0);
        if (s3pVar.isAttachedToWindow()) {
            int x = (int) s3pVar.getX();
            int y = (int) s3pVar.getY();
            int i = q;
            xo2.c(s3pVar, x, y + i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.hypot(i, iah0.z(s3pVar.getContext())), 600L, null);
        }
        s3pVar.setGalleryPickerPreviewAdapter(f640Var);
        s3pVar.setItemTouchHelper(rVar);
        l(this.c, true);
    }

    @Override // xsna.q3p
    public final ey0 k(Throwable th, izs izsVar) {
        Context context = getContext();
        lpj lpjVar = context instanceof lpj ? (lpj) context : null;
        Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
        dhr0.a.getClass();
        int i = dhr0.u().c;
        if (valueOf == null || valueOf.intValue() != i) {
            context = new l7s(context, dhr0.u().c);
        }
        ikv0.a aVar = new ikv0.a(context);
        aVar.u = new ikv0.d(getContext().getString(h03.a(th) ? R.string.network_error : R.string.download_error), (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, getContext().getString(R.string.viewer_retry), new jy(izsVar, 14));
        aVar.e = -1L;
        aVar.o = Integer.valueOf(cn70.b(88));
        return new ey0(pkv0.f(aVar), 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0014, code lost:
    
        if (r4 < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0016, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0028, code lost:
    
        if (r4 < 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(int i, boolean z) {
        if (z) {
            int i2 = u;
            int i3 = t;
            if (i < i3 - i2) {
                setOnViewPort(true);
            } else {
                setOnViewPort(false);
                i -= i3;
            }
        } else {
            int i4 = s;
            int i5 = r;
            if (i < i5 - i4) {
                setOnViewPort(true);
            } else {
                setOnViewPort(false);
                i -= i5;
            }
        }
        f4m.q(i, this);
        if (this.b) {
            if (this.p) {
                setBackground(null);
            } else {
                setBackgroundColor(-16777216);
            }
        }
    }

    public final boolean m() {
        StoryEditorCameraParams A0;
        u76 u76Var = this.m;
        return (u76Var == null || (A0 = u76Var.A0()) == null || !A0.e()) ? false : true;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        View view = this.n;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    @Override // xsna.q3p
    public void setInstantSendEnabled(boolean z) {
        AvatarButton shareButton = getShareButton();
        shareButton.setAlpha(z ? 1.0f : 0.4f);
        shareButton.setEnabled(z);
    }

    @Override // xsna.q3p
    public void setIsMultiStories(boolean z) {
        setMultiStoryMode(z);
    }

    @Override // xsna.q3p
    public void setLoading(boolean z) {
        if (this.o) {
            return;
        }
        BottomControlPanelSkeletonView skeleton = getSkeleton();
        ShimmerFrameLayout shimmerFrameLayout = skeleton.b;
        bwt0.p0(skeleton, z);
        if (z) {
            shimmerFrameLayout.c();
        } else {
            shimmerFrameLayout.a();
        }
        getSingleStoryActionsPanel().setVisibility(!z ? 0 : 8);
    }

    public void setMultiStoryMode(boolean z) {
        this.o = z;
    }

    public void setOnViewPort(boolean z) {
        this.p = z;
    }

    @Override // xsna.q3p
    public void setPresenter(u76 u76Var) {
        this.m = u76Var;
    }

    @Override // xsna.q3p
    public void setPrivacy(StoryPrivacyType storyPrivacyType) {
        com.vk.core.view.components.button.tool.a vmlVar;
        if (storyPrivacyType == null) {
            getChangePrivacyButton().setVisibility(8);
            f4m.s(iah0.a(8), getRecipientsButton());
            return;
        }
        f4m.s(0, getRecipientsButton());
        getChangePrivacyButton().setVisibility(0);
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[storyPrivacyType.ordinal()];
        int i2 = R.string.story_privacy_editor_all;
        int i3 = R.drawable.vk_icon_lock_outline_20;
        switch (i) {
            case 1:
                i3 = R.drawable.vk_icon_unlock_outline_20;
                break;
            case 2:
                i2 = R.string.story_privacy_editor_friends;
                break;
            case 3:
                i2 = R.string.story_privacy_editor_best_friend;
                break;
            case 4:
                i2 = R.string.story_privacy_editor_me;
                break;
            case 5:
                i2 = R.string.story_privacy_editor_friends_of_friends;
                break;
            case 6:
                i2 = R.string.story_privacy_editor_some;
                break;
            case 7:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        VkToolButton changePrivacyButton = getChangePrivacyButton();
        switch (iArr[storyPrivacyType.ordinal()]) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 7:
                vmlVar = new vml();
                break;
            case 2:
                vmlVar = new qts();
                break;
            case 3:
                vmlVar = new ay6();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        changePrivacyButton.setStyle(vmlVar);
        VkToolButton.c(getChangePrivacyButton(), Integer.valueOf(i3));
        getChangePrivacyButton().setText(i2);
    }

    @Override // xsna.q3p
    public void setSelectRecipientsEnabled(boolean z) {
        getRecipientsButton().setEnabled(z);
    }

    @Override // xsna.q3p
    public void setSendButtonAlpha(float f) {
        getShareButton().setAlpha(f);
    }

    @Override // xsna.q3p
    public void setSendButtonAvatar(String str) {
        if (str == null && (str = getStoryEditorUtils().c()) == null) {
            str = "";
        }
        getShareButton().c.setContent(new c.d(str, null));
    }

    @Override // xsna.q3p
    public void setStoryActionsPanelVisible(boolean z) {
        getSingleStoryActionsPanel().setVisibility(z ? 0 : 8);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.o) {
            View view = this.n;
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            return;
        }
        View view2 = this.n;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }
}
