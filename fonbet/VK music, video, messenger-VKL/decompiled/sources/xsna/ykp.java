package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.libvideo.design.view.recommended.RecommendedView;
import com.vk.libvideo.live.impl.views.addbutton.AddButtonView;
import com.vk.libvideo.live.impl.views.addbutton.AddImgButtonView;
import com.vkontakte.android.R;

/* compiled from: EndView.java */
/* loaded from: classes2.dex */
public final class ykp extends FrameLayout implements kkp {
    public final VkAvatar b;
    public final VkLinkedText c;
    public final AddButtonView d;
    public final AddImgButtonView e;
    public final FrameLayout f;
    public final RecommendedView g;
    public final View h;
    public final VkImage i;
    public final LinearLayout j;
    public final LinearLayout.LayoutParams k;
    public final LinearLayout.LayoutParams l;
    public final LinearLayout.LayoutParams m;
    public final LinearLayout.LayoutParams n;
    public final LinearLayout.LayoutParams o;
    public final LinearLayout.LayoutParams p;
    public final FrameLayout.LayoutParams q;
    public final FrameLayout.LayoutParams r;
    public final FrameLayout.LayoutParams s;
    public final boolean t;
    public jkp u;

    /* compiled from: EndView.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ykp.this.u.x();
        }
    }

    public ykp(Context context) {
        super(context, null, 0);
        new jwx(2, iah0.a(22.0f));
        a aVar = new a();
        View inflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.live_end, (ViewGroup) this, true);
        AddButtonView addButtonView = (AddButtonView) inflate.findViewById(R.id.liveEndAddButton);
        this.d = addButtonView;
        AddImgButtonView addImgButtonView = (AddImgButtonView) inflate.findViewById(R.id.liveEndAddImgButton);
        this.e = addImgButtonView;
        this.i = (VkImage) inflate.findViewById(R.id.liveEndViewBack);
        VkAvatar vkAvatar = (VkAvatar) inflate.findViewById(R.id.liveEndUserImage);
        this.b = vkAvatar;
        VkLinkedText vkLinkedText = (VkLinkedText) inflate.findViewById(R.id.liveEndUserName);
        this.c = vkLinkedText;
        VkText vkText = (VkText) inflate.findViewById(R.id.liveEndWatchNext);
        VkText vkText2 = (VkText) inflate.findViewById(R.id.liveEndText);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.liveEndViewContainer1);
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.liveEndViewContainer2);
        this.f = frameLayout2;
        this.g = (RecommendedView) inflate.findViewById(R.id.liveEndRecommended);
        this.h = inflate.findViewById(R.id.liveEndDelimiter);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.liveEndViewTopLinearHolder);
        this.j = linearLayout;
        setBackgroundColor(-1459617792);
        vkLinkedText.setOnClickListener(aVar);
        vkAvatar.setOnClickListener(aVar);
        this.k = (LinearLayout.LayoutParams) vkAvatar.getLayoutParams();
        this.l = (LinearLayout.LayoutParams) vkLinkedText.getLayoutParams();
        this.n = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
        this.o = (LinearLayout.LayoutParams) frameLayout2.getLayoutParams();
        this.r = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        this.m = (LinearLayout.LayoutParams) vkText2.getLayoutParams();
        this.p = (LinearLayout.LayoutParams) addButtonView.getLayoutParams();
        this.q = (FrameLayout.LayoutParams) addImgButtonView.getLayoutParams();
        this.s = (FrameLayout.LayoutParams) vkText.getLayoutParams();
        this.t = fnj.d(context);
    }

    @Override // xsna.kkp
    public final void F1() {
        this.f.setVisibility(8);
    }

    @Override // xsna.kkp
    public mk0 getAddButton() {
        return getWidth() > getHeight() ? this.e : this.d;
    }

    @Override // xsna.kkp
    public mk0 getImgAddButton() {
        return this.e;
    }

    @Override // xsna.kkp
    public wcf0 getRecommendedView() {
        return this.g;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.g.a();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int height = getHeight();
        if (getWidth() != size2 || height != size) {
            FrameLayout.LayoutParams layoutParams = this.s;
            FrameLayout.LayoutParams layoutParams2 = this.q;
            LinearLayout.LayoutParams layoutParams3 = this.p;
            LinearLayout.LayoutParams layoutParams4 = this.m;
            LinearLayout.LayoutParams layoutParams5 = this.l;
            LinearLayout.LayoutParams layoutParams6 = this.o;
            LinearLayout.LayoutParams layoutParams7 = this.n;
            FrameLayout.LayoutParams layoutParams8 = this.r;
            LinearLayout linearLayout = this.j;
            LinearLayout.LayoutParams layoutParams9 = this.k;
            if (size2 <= size || this.t) {
                layoutParams7.width = -1;
                layoutParams7.height = 0;
                layoutParams7.weight = 0.55f;
                layoutParams6.width = -1;
                layoutParams6.height = 0;
                layoutParams6.weight = 0.45f;
                linearLayout.setOrientation(1);
                layoutParams8.gravity = 17;
                layoutParams8.rightMargin = iah0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                linearLayout.setGravity(1);
                layoutParams9.height = iah0.a(64.0f);
                layoutParams9.width = iah0.a(64.0f);
                layoutParams9.setMargins(0, 0, 0, iah0.a(16.0f));
                layoutParams5.setMargins(iah0.a(32.0f), 0, iah0.a(32.0f), iah0.a(4.0f));
                layoutParams4.setMargins(0, 0, 0, iah0.a(16.0f));
                layoutParams3.width = -2;
                layoutParams2.width = 0;
                layoutParams.gravity = 1;
            } else {
                layoutParams7.width = -1;
                layoutParams7.height = iah0.a(56.0f);
                layoutParams7.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                layoutParams6.width = -1;
                layoutParams6.height = -1;
                layoutParams6.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                linearLayout.setOrientation(0);
                layoutParams8.gravity = 19;
                if (this.e.getVisibility() == 8) {
                    layoutParams8.rightMargin = iah0.a(60.0f);
                } else {
                    layoutParams8.rightMargin = iah0.a(94.0f);
                }
                linearLayout.setGravity(16);
                layoutParams9.height = iah0.a(32.0f);
                layoutParams9.width = iah0.a(32.0f);
                layoutParams9.setMargins(iah0.a(12.0f), 0, 0, 0);
                layoutParams5.setMargins(iah0.a(12.0f), 0, 0, 0);
                layoutParams4.setMargins(iah0.a(12.0f), 0, 0, 0);
                layoutParams3.width = 0;
                layoutParams2.width = -2;
                layoutParams.gravity = 3;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j.invalidate();
    }

    @Override // xsna.kkp
    public final void p(String str, String str2, String str3, boolean z, boolean z2) {
        this.b.o0(str2, null);
        ucp ucpVar = ucp.a;
        this.c.setText(ucp.i(str));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        VkImage vkImage = this.i;
        vkImage.A0(R.drawable.video_placeholder_130, scaleType);
        vkImage.o0(str3, null);
    }

    @Override // xsna.rr6
    public final void pause() {
        AddButtonView addButtonView = this.d;
        if (addButtonView != null) {
            addButtonView.pause();
        }
        RecommendedView recommendedView = this.g;
        if (recommendedView != null) {
            recommendedView.pause();
        }
        jkp jkpVar = this.u;
        if (jkpVar != null) {
            jkpVar.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        AddButtonView addButtonView = this.d;
        if (addButtonView != null) {
            addButtonView.release();
        }
        RecommendedView recommendedView = this.g;
        if (recommendedView != null) {
            recommendedView.release();
        }
        jkp jkpVar = this.u;
        if (jkpVar != null) {
            jkpVar.release();
        }
    }

    @Override // xsna.rr6
    public final void resume() {
        AddButtonView addButtonView = this.d;
        if (addButtonView != null) {
            addButtonView.resume();
        }
        RecommendedView recommendedView = this.g;
        if (recommendedView != null) {
            recommendedView.resume();
        }
        jkp jkpVar = this.u;
        if (jkpVar != null) {
            jkpVar.resume();
        }
    }

    @Override // xsna.rr6
    public jkp getPresenter() {
        return this.u;
    }

    @Override // xsna.rr6
    public void setPresenter(jkp jkpVar) {
        this.u = jkpVar;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    public void setAllowAddButton(boolean z) {
    }
}
