package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoOwner;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.live.impl.widgets.timeprogress.CircularTimeBar;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.jec;

/* compiled from: RecommendedElement.java */
/* loaded from: classes3.dex */
public final class xcf0 extends FrameLayout {
    public final VkText b;
    public final VkText c;
    public final VkImage d;
    public final CircularTimeBar e;
    public String f;
    public baf0 g;
    public final View h;
    public VideoOwner i;
    public WeakReference<vcf0> j;

    /* compiled from: RecommendedElement.java */
    public class a implements View.OnLayoutChangeListener {

        /* compiled from: RecommendedElement.java */
        /* renamed from: xsna.xcf0$a$a, reason: collision with other inner class name */
        public class RunnableC3995a implements Runnable {
            public RunnableC3995a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                xcf0.a(xcf0.this);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            xcf0 xcf0Var = xcf0.this;
            xcf0.a(xcf0Var);
            xcf0Var.post(new RunnableC3995a());
        }
    }

    /* compiled from: RecommendedElement.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            xcf0.a(xcf0.this);
        }
    }

    public xcf0(Context context) {
        super(context, null, 0);
        a aVar = new a();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.live_recommended_element, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.liveRecommendedTop);
        this.d = (VkImage) findViewById(R.id.liveRecommendedImg);
        VkText vkText = (VkText) findViewById(R.id.liveRecommendedName);
        this.b = vkText;
        this.c = (VkText) findViewById(R.id.liveRecommendedViews);
        this.e = (CircularTimeBar) findViewById(R.id.liveRecommendedTimeBar);
        this.h = findViewById(R.id.liveRecommendedVerified);
        frameLayout.setOnClickListener(new ycf0(this));
        vkText.addOnLayoutChangeListener(aVar);
        setLayoutParams(new RecyclerView.p(-1, -1));
    }

    public static void a(xcf0 xcf0Var) {
        View view = xcf0Var.h;
        VkText vkText = xcf0Var.b;
        if (xcf0Var.getContext() == null || xcf0Var.g == null || vkText == null || vkText.getLayout() == null) {
            return;
        }
        view.setVisibility(0);
        view.setBackground(xcf0Var.g);
        int lineCount = vkText.getLineCount();
        if (lineCount > vkText.getMaxLines()) {
            lineCount = vkText.getMaxLines();
        }
        view.setTranslationX(iah0.a(24.0f) + vkText.getLayout().getPrimaryHorizontal(vkText.getLayout().getLineVisibleEnd(lineCount - 1)));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * 0.63f), 1073741824), i2);
    }

    public void setModel(VideoOwner videoOwner) {
        this.i = videoOwner;
        this.g = null;
        VideoFile videoFile = videoOwner.f;
        if (videoFile != null) {
            ImageSize Cb = videoFile.e1().Cb(ImageScreenSize.MID.h(), true, false);
            this.d.o0(Cb == null ? null : Cb.d.d, null);
            boolean d = fkq0.d(this.i.f.I0());
            View view = this.h;
            if (d) {
                UserProfile userProfile = this.i.g;
                if (userProfile != null) {
                    this.f = userProfile.e;
                    if (userProfile.B.Cb()) {
                        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
                        this.g = VerifyInfoHelper.f(getContext(), VerifyInfoHelper.ColorTheme.white, this.i.g.B);
                        view.setVisibility(0);
                    } else {
                        view.setVisibility(8);
                    }
                }
            } else {
                Group group = this.i.h;
                if (group != null) {
                    this.f = group.d;
                    if (group.y.Cb()) {
                        VerifyInfoHelper verifyInfoHelper2 = VerifyInfoHelper.a;
                        this.g = VerifyInfoHelper.f(getContext(), VerifyInfoHelper.ColorTheme.white, this.i.h.y);
                        view.setVisibility(0);
                    } else {
                        view.setVisibility(8);
                    }
                }
            }
            this.c.setText(crx0.l(this.i.f.B4()));
        }
        ucp ucpVar = ucp.a;
        this.b.setText(ucp.i(this.f));
        post(new b());
        CircularTimeBar circularTimeBar = this.e;
        circularTimeBar.setVisibility(8);
        jec circularTimeDrawable = circularTimeBar.getCircularTimeDrawable();
        circularTimeDrawable.b = jec.a.IDLE;
        circularTimeDrawable.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        circularTimeDrawable.n = 0L;
        circularTimeDrawable.o = 0L;
        circularTimeDrawable.a = null;
    }

    public void setPresenter(vcf0 vcf0Var) {
        this.j = new WeakReference<>(vcf0Var);
    }
}
