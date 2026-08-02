package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.text.links.a;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.ImageScreenSize;
import com.vk.libvideo.live.impl.views.addbutton.AddImgButtonView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dw20;

/* compiled from: DetailsView.kt */
/* loaded from: classes2.dex */
public final class c5m extends AppCompatTextView implements k4m, a.InterfaceC0867a {
    public final lfo0 b;
    public final String c;
    public final sjc d;
    public j4m e;
    public dw20 f;
    public final fiz g;
    public final a5m h;

    /* compiled from: DetailsView.kt */
    public static final class a implements jjv0 {
        public a() {
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            if (i == 0) {
                return 4;
            }
            return c5m.this.h.d.get(i) instanceof giz ? 3 : 0;
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            return 0;
        }
    }

    /* compiled from: DetailsView.kt */
    public static final class b implements fcn {
        public b() {
        }

        @Override // xsna.fcn
        public final boolean M4() {
            return true;
        }

        @Override // xsna.fcn
        public final boolean N8() {
            return false;
        }

        @Override // xsna.fcn
        public final void b(boolean z) {
            dw20 dw20Var = c5m.this.f;
            if (dw20Var != null) {
                dw20Var.hide();
            }
        }

        @Override // xsna.fcn
        public final void dismiss() {
            b(false);
        }

        @Override // xsna.fcn
        public final boolean v6() {
            return false;
        }
    }

    public c5m(Context context, boolean z) {
        super(context, null, 0);
        this.b = new lfo0(this);
        this.c = context.getString(R.string.live_description_expand_text);
        this.d = new sjc(this);
        fiz fizVar = new fiz(new cy0(9, this, context));
        this.g = fizVar;
        dy0 dy0Var = new dy0(8, this, context);
        qjz qjzVar = new qjz(qjz.g, 0, 0, ImageScreenSize.SIZE_32DP, dy0Var);
        a5m a5mVar = new a5m(false);
        a5mVar.y0(new cjz(z));
        a5mVar.y0(qjzVar);
        a5mVar.y0(fizVar);
        this.h = a5mVar;
    }

    public final void b(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - drm0.p0(this.c).toString().length();
        int length2 = spannableStringBuilder.length();
        b5m b5mVar = new b5m(this);
        spannableStringBuilder.setSpan(new TextAppearanceSpan(getContext(), R.style.VkUiTypography_SubheadMedium), length, length2, 33);
        spannableStringBuilder.setSpan(b5mVar, length, length2, 33);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.k4m
    public final void h2(List list, VideoFile videoFile) {
        dw20.a c;
        final Context context = getContext();
        final b bVar = new b();
        int color = getContext().getColor(R.color.vk_gray_900);
        dw20.b l = new dw20.b(context, tzp0.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, videoFile.r(), null, 40, null), 2)).v0(R.string.live_description_dialog_title).S(color).l(color);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        a5m a5mVar = this.h;
        recyclerView.setAdapter(a5mVar);
        a5mVar.setItems(list);
        float f = 16;
        recyclerView.setPadding(iah0.a(f), recyclerView.getPaddingTop(), iah0.a(f), recyclerView.getPaddingBottom());
        dhr0.a.getClass();
        gpu0 gpu0Var = new gpu0(dhr0.s());
        gpu0Var.j = new a();
        gpu0Var.g = iah0.a(18);
        gpu0Var.h = iah0.a(12);
        gpu0Var.i = 0;
        gpu0Var.c = R.attr.vk_ui_separator_primary;
        gpu0Var.Ng();
        recyclerView.addItemDecoration(gpu0Var);
        s3q0 s3q0Var = s3q0.a;
        c = l.D0(recyclerView, false).q0(true).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
        this.f = ((dw20.b) c).Z(new DialogInterface.OnDismissListener() { // from class: xsna.z4m
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object obj = context;
                if (obj instanceof ey50) {
                    ((ey50) obj).Y().H(bVar);
                }
                this.f = null;
            }
        }).I0(null);
        if (context instanceof ey50) {
            ((ey50) context).Y().S(bVar);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i);
        lfo0 lfo0Var = this.b;
        if (lfo0Var.e != size && size > 0) {
            CharSequence b2 = lfo0.b(lfo0Var, size, 0, 6);
            if ((b2 instanceof SpannableStringBuilder) && drm0.F(b2, this.c)) {
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) b2;
                b(spannableStringBuilder);
                charSequence = spannableStringBuilder;
            } else {
                charSequence = lfo0Var.b;
            }
            setText(charSequence);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.d.b(motionEvent) || super.onTouchEvent(motionEvent);
    }

    @Override // xsna.rr6
    public final void pause() {
        j4m j4mVar = this.e;
        if (j4mVar == null) {
            j4mVar = null;
        }
        j4mVar.pause();
    }

    @Override // xsna.rr6
    public final void release() {
        j4m j4mVar = this.e;
        if (j4mVar == null) {
            j4mVar = null;
        }
        j4mVar.release();
    }

    @Override // xsna.rr6
    public final void resume() {
        j4m j4mVar = this.e;
        if (j4mVar == null) {
            j4mVar = null;
        }
        j4mVar.resume();
    }

    @Override // xsna.k4m
    public void setAddButtonPresenter(lk0 lk0Var) {
        fiz fizVar = this.g;
        fizVar.c = lk0Var;
        AddImgButtonView addImgButtonView = fizVar.b;
        if (addImgButtonView != null) {
            addImgButtonView.setPresenter((AddImgButtonView) lk0Var);
            lk0Var.R1(addImgButtonView);
            addImgButtonView.setVisible(true);
        }
    }

    @Override // xsna.k4m
    public void setDescription(CharSequence charSequence) {
        CharSequence charSequence2;
        if (charSequence == null || drm0.N(charSequence)) {
            setText("");
            return;
        }
        lfo0 lfo0Var = this.b;
        lfo0Var.b = charSequence;
        String str = this.c;
        lfo0Var.c = str;
        if (getWidth() <= 0) {
            return;
        }
        CharSequence b2 = lfo0.b(lfo0Var, getWidth(), 0, 6);
        if ((b2 instanceof SpannableStringBuilder) && drm0.F(b2, str)) {
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) b2;
            int K = drm0.K(0, 6, spannableStringBuilder, str, false);
            char charAt = spannableStringBuilder.charAt(K - 1);
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            if (charAt == '\n') {
                int i = 0;
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (str.charAt(i2) == 160) {
                        i++;
                    }
                }
                spannableStringBuilder2 = spannableStringBuilder.delete(K, i + K);
            }
            b(spannableStringBuilder2);
            charSequence2 = spannableStringBuilder2;
        } else {
            charSequence2 = lfo0Var.b;
        }
        setText(charSequence2);
    }

    @Override // xsna.rr6
    public j4m getPresenter() {
        j4m j4mVar = this.e;
        if (j4mVar == null) {
            return null;
        }
        return j4mVar;
    }

    @Override // xsna.rr6
    public void setPresenter(j4m j4mVar) {
        this.e = j4mVar;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // com.vk.core.view.components.text.links.a.InterfaceC0867a
    public final void a(RectF rectF, float f) {
    }
}
