package xsna;

import android.text.TextPaint;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.camera.drawing.gradient.StoryEditText;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryCameraTarget;
import com.vk.log.L;
import com.vk.stickers.api.styles.b;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: StoryMentionDialogPresenter.kt */
/* loaded from: classes16.dex */
public final class u6m0 implements cc6, f420, r9m0 {
    public final q6m0 b;
    public final StoryCameraTarget c;
    public final cvu d;
    public a420 f;
    public final com.vk.stickers.api.styles.a h;
    public com.vk.ecomm.catalog.impl.geo.a i;
    public final io.reactivex.rxjava3.disposables.g e = new io.reactivex.rxjava3.disposables.g();
    public final HashMap<UserId, String> g = new HashMap<>();

    public u6m0(q6m0 q6m0Var, StoryCameraTarget storyCameraTarget, cvu cvuVar, com.vk.stickers.api.styles.b bVar, c7l0 c7l0Var) {
        this.b = q6m0Var;
        this.c = storyCameraTarget;
        this.d = cvuVar;
        this.h = b.C1791b.b(bVar, null, c7l0Var, 1);
    }

    @Override // xsna.f420
    public final void D0(b420 b420Var) {
        String str = b420Var.b;
        UserId userId = b420Var.a;
        Pattern pattern = n420.a;
        String str2 = b420Var.e;
        if (pattern.matcher(str2).matches()) {
            str2 = str;
        }
        o0m0 o0m0Var = o0m0.b;
        int a = y8g0.a(R.dimen.sticker_text_size_max);
        int a2 = y8g0.a(R.dimen.sticker_text_size_min);
        com.vk.ecomm.catalog.impl.geo.a aVar = this.i;
        if (aVar == null) {
            aVar = null;
        }
        int a3 = o0m0.a();
        int i = a - 1;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 > i) {
                aVar.getClass();
                break;
            }
            i3 = (i2 + i) >>> 1;
            TextPaint textPaint = (TextPaint) aVar.b;
            textPaint.setTextSize(i3);
            float measureText = textPaint.measureText(str2) - a3;
            if (measureText >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                if (measureText <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    break;
                }
                i3--;
                i = i3;
            } else {
                int i4 = i3 + 1;
                i3 = i2;
                i2 = i4;
            }
        }
        com.vk.ecomm.catalog.impl.geo.a aVar2 = this.i;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.getClass();
        String concat = (i3 >= a2 + (-1) || str2.length() <= 10) ? str2 : erm0.D0(15, str2).concat("…");
        this.g.put(userId, str2);
        q6m0 q6m0Var = this.b;
        StoryEditText storyEditText = q6m0Var.j;
        if (storyEditText == null) {
            storyEditText = null;
        }
        storyEditText.setText(concat);
        try {
            StoryEditText storyEditText2 = q6m0Var.j;
            if (storyEditText2 == null) {
                storyEditText2 = null;
            }
            storyEditText2.setSelection(concat.length());
        } catch (IndexOutOfBoundsException e) {
            L.g("Can't set selection", e);
        }
        this.f = new a420(userId, str);
        ViewGroup viewGroup = q6m0Var.k;
        (viewGroup != null ? viewGroup : null).post(new x52(this, 11));
    }

    @Override // xsna.r9m0
    public final void g() {
        this.b.h(true);
    }

    @Override // xsna.r9m0
    public final StoryCameraTarget getTarget() {
        return this.c;
    }

    public final void k() {
        q6m0 q6m0Var = this.b;
        v6m0 v6m0Var = q6m0Var.b;
        a420 a420Var = v6m0Var != null ? v6m0Var.c : null;
        n6m0 n6m0Var = q6m0Var.c;
        String obj = q6m0Var.getEditText().getText().toString();
        a420 a420Var2 = this.f;
        if (a420Var2 != null || a420Var == null) {
            a420Var = a420Var2;
        } else if (!brm0.y(obj, "@", "").toLowerCase(Locale.ROOT).equals(this.g.get(a420Var.a))) {
            a420Var = null;
        }
        StoryEditText storyEditText = q6m0Var.j;
        v6m0 v6m0Var2 = new v6m0(this.h, Float.valueOf((storyEditText != null ? storyEditText : null).getTextSize()), a420Var, obj);
        boolean z = drm0.p0(obj).toString().length() > 0;
        boolean z2 = v6m0Var != null;
        if (!z || z2) {
            if (z && z2) {
                if (n6m0Var != null) {
                    n6m0Var.g(v6m0Var2);
                }
            } else if (z || !z2) {
                if (n6m0Var != null) {
                    n6m0Var.Y();
                }
            } else if (n6m0Var != null) {
                n6m0Var.a();
            }
        } else if (n6m0Var != null) {
            n6m0Var.d(new x6m0(v6m0Var2, new om60(10)));
        }
        q6m0Var.dismiss();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.r9m0
    public final t9m0 x() {
        return this.b;
    }

    @Override // xsna.r9m0
    public final StoryEditText z() {
        StoryEditText storyEditText = this.b.j;
        if (storyEditText != null) {
            return storyEditText;
        }
        return null;
    }

    @Override // xsna.f420
    public final void S1() {
    }

    @Override // xsna.f420
    public final void e0() {
    }

    @Override // xsna.f420
    public final void s5(Attachment attachment) {
    }

    @Override // xsna.f420
    public final void v5(Throwable th) {
    }

    @Override // xsna.f420
    public final void x4(boolean z) {
    }
}
