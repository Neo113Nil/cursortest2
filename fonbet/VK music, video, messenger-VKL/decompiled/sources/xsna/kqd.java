package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.iqd;

/* compiled from: ClipsDescriptionEditProviderImpl.kt */
/* loaded from: classes17.dex */
public final class kqd implements jqd {
    public final p5f a;

    public kqd(p5f p5fVar) {
        this.a = p5fVar;
    }

    @Override // xsna.jqd
    public final void a(Context context, String str, izs<? super String, s3q0> izsVar, tw50 tw50Var, zih0 zih0Var) {
        p5f p5fVar = this.a;
        iqd iqdVar = new iqd(context, p5fVar, zih0Var);
        mqd mqdVar = new mqd(context, p5fVar, zih0Var);
        mqdVar.setLayoutParams(new CoordinatorLayout.f(-1, -1));
        mqdVar.setInitialText(str);
        mqdVar.setOnTextChangeListener(new eqd(iqdVar, 0));
        iqd.a.C3073a c3073a = new iqd.a.C3073a(context, null);
        int length = mqdVar.getFormattedText().length();
        dw20.b l = c3073a.w0(length == 0 ? context.getString(R.string.clips_edit_description_title) : l6g.a(length, "/4000")).A0(Integer.valueOf(R.style.VkUiTypography_DisplayTitle2SemiBold)).D0(mqdVar, false).l(e3m.f(R.attr.vk_ui_background_content, context));
        kad kadVar = new kad(iqdVar, str, mqdVar, 1);
        l.getClass();
        l.d.z1 = kadVar;
        l.d.A1 = new zwc(iqdVar, str, mqdVar, 1);
        ColorStateList valueOf = ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, context));
        Drawable drawable = context.getDrawable(R.drawable.vk_icon_done_outline_28);
        drawable.setTintList(valueOf);
        dw20.b t = ((dw20.b) l.F(drawable, null)).b0(new ki4(izsVar, mqdVar, iqdVar, 1)).d0(new fqd(0, tw50Var, iqdVar)).a0(new fu5(tw50Var, iqdVar, mqdVar, 2)).c(new ts90(1.0f, 2)).t();
        gqd gqdVar = new gqd();
        t.getClass();
        t.d.d1 = gqdVar;
        iqdVar.d = t.H0(((FragmentActivity) e3m.h(context)).getSupportFragmentManager(), "clip_description_edit");
    }
}
