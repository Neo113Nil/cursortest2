package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.camera.editor.stories.impl.background.BackgroundEditorState;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.lists.AbstractPaginatedView;
import com.vk.stories.design.view.editor.PipetteColorPicker;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: StoryBackgroundEditorView.kt */
/* loaded from: classes6.dex */
public final class myl0 extends FrameLayout implements com.vk.camera.editor.stories.impl.background.a {
    public final Object b;
    public gyl0 c;
    public final PipetteColorPicker d;
    public final ImageView e;
    public final View f;
    public final View g;
    public final VkRecyclerPaginatedView h;
    public final VkTabs i;
    public final View j;
    public final View k;
    public LayerDrawable l;
    public final ryl0 m;
    public List<syl0> n;

    /* compiled from: StoryBackgroundEditorView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BackgroundEditorState.StoryBackgroundState.values().length];
            try {
                iArr[BackgroundEditorState.StoryBackgroundState.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BackgroundEditorState.StoryBackgroundState.PIPETTE_PICKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StoryBackgroundType.values().length];
            try {
                iArr2[StoryBackgroundType.BLUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StoryBackgroundType.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[StoryBackgroundType.GRAPHICS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public myl0(Context context) {
        super(context, null, 0);
        this.b = msy.a(LazyThreadSafetyMode.NONE, new pwh0(this, 10));
        ryl0 ryl0Var = new ryl0(context);
        this.m = ryl0Var;
        this.n = EmptyList.b;
        LayoutInflater.from(context).inflate(R.layout.view_camera_background_editor_new, this);
        this.f = findViewById(R.id.top_container);
        this.g = findViewById(R.id.bottom_container);
        VkRecyclerPaginatedView vkRecyclerPaginatedView = (VkRecyclerPaginatedView) findViewById(R.id.list);
        this.h = vkRecyclerPaginatedView;
        this.i = (VkTabs) findViewById(R.id.type_tabs);
        View findViewById = findViewById(R.id.cancel);
        this.j = findViewById;
        View findViewById2 = findViewById(R.id.done);
        this.k = findViewById2;
        bwt0.i0(findViewById, new hij0(this, 2));
        bwt0.i0(findViewById2, new whg0(this, 9));
        this.d = (PipetteColorPicker) findViewById(R.id.pipette_color_picker);
        this.e = (ImageView) findViewById(R.id.pipette_image_layer);
        PipetteColorPicker pipetteColorPicker = this.d;
        (pipetteColorPicker == null ? null : pipetteColorPicker).setColorSelectedListener(new qjg0(this, 5));
        PipetteColorPicker pipetteColorPicker2 = this.d;
        (pipetteColorPicker2 != null ? pipetteColorPicker2 : null).setDoneClickListener(new mga0(this, 18));
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, vkRecyclerPaginatedView);
        dVar.f = 0;
        dVar.a();
        vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        vkRecyclerPaginatedView.getRecyclerView().setOverScrollMode(2);
        RecyclerView recyclerView = vkRecyclerPaginatedView.getRecyclerView();
        int i = ryl0Var.a;
        recyclerView.setPadding(i, 0, i, 0);
        vkRecyclerPaginatedView.getRecyclerView().setClipToPadding(false);
        setPresenter((gyl0) new com.vk.camera.editor.stories.impl.background.b(this));
    }

    public static s3q0 b(myl0 myl0Var, qyl0 qyl0Var) {
        if (!jjc.c(250L)) {
            myl0Var.performHapticFeedback(0);
            if (qyl0Var.a.h) {
                myl0Var.getAnalytics().k();
                gyl0 presenter = myl0Var.getPresenter();
                if (presenter != null) {
                    presenter.m2();
                }
            } else {
                myl0Var.c(null);
                gyl0 presenter2 = myl0Var.getPresenter();
                if (presenter2 != null) {
                    presenter2.Y1(qyl0Var, (r5 & 4) == 0, (r5 & 8) != 0);
                }
            }
        }
        return s3q0.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final y3p getAnalytics() {
        return (y3p) this.b.getValue();
    }

    public final void c(t2l0 t2l0Var) {
        xpa0 m1;
        gyl0 presenter = getPresenter();
        if (presenter != null && (m1 = presenter.m1()) != null && m1.P()) {
            m1.playVideo();
        }
        gyl0 presenter2 = getPresenter();
        if (presenter2 != null) {
            presenter2.c1(t2l0Var);
        }
    }

    public final void d(Bitmap bitmap, Integer num) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new ColorDrawable(-1), new ColorDrawable(num != null ? num.intValue() : 0), new BitmapDrawable(getContext().getResources(), bitmap)});
        this.l = layerDrawable;
        ImageView imageView = this.e;
        (imageView == null ? null : imageView).setImageDrawable(layerDrawable);
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, true);
    }

    public final View getBottomView() {
        return this.g;
    }

    public final View getTopView() {
        return this.f;
    }

    public void setCadreSize(iz8 iz8Var) {
        int b = cn70.b(52);
        float f = iz8Var.d;
        if (f > b) {
            f4m.q(((int) f) - b, this);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = iz8Var.b;
        setLayoutParams(layoutParams);
    }

    @Override // xsna.dc6
    public gyl0 getPresenter() {
        return this.c;
    }

    @Override // xsna.dc6
    public void setPresenter(gyl0 gyl0Var) {
        this.c = gyl0Var;
    }

    @Override // com.vk.camera.editor.stories.impl.background.a
    public View getView() {
        return this;
    }
}
