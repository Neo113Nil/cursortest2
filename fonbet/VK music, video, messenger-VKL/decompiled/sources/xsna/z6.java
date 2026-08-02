package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.ironsource.Ya;
import com.ironsource.sdk.controller.v;
import com.my.target.common.MyTargetActivity;
import com.my.target.common.views.Html5View;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.bottomsheet.about.delegate.n;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import kotlin.text.Regex;
import xsna.z8z0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z6 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        int i2 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                n.a aVar = (n.a) obj2;
                AboutVideoItem.o oVar = (AboutVideoItem.o) obj;
                CharSequence charSequence = oVar.b;
                int i3 = oVar.c;
                boolean z = aVar.n;
                lfo0 lfo0Var = aVar.p;
                TextView textView = aVar.o;
                CharSequence b = nik0.b(charSequence, new Regex("(?:(\\d+):)?([0-5]?\\d):([0-5]?\\d)(?![:\\d])"), new a7(aVar, i3, z ? Integer.valueOf(e3m.f(R.attr.vk_ui_text_link, aVar.itemView.getContext())) : null, i2));
                int i4 = 1;
                boolean z2 = z && iah0.s(aVar.itemView.getContext());
                Context context = aVar.itemView.getContext();
                HashSet hashSet = iah0.a;
                textView.setMaxLines((z2 || fnj.d(context)) ? Integer.MAX_VALUE : aVar.m ? 6 : 11);
                if (textView.getMaxLines() != Integer.MAX_VALUE) {
                    lfo0Var.b = b;
                    com.vk.voip.a aVar2 = new com.vk.voip.a(i4, aVar, b);
                    int color = aVar.itemView.getContext().getColor(R.color.vk_white);
                    SpannableString spannableString = new SpannableString(aVar.itemView.getContext().getString(R.string.more));
                    com.vk.libvideo.bottomsheet.about.delegate.l lVar = new com.vk.libvideo.bottomsheet.about.delegate.l(aVar2, color);
                    Typeface a = dbg0.a(R.font.vk_roboto_medium, aVar.itemView.getContext());
                    spannableString.setSpan(new StyleSpan(a != null ? a.getStyle() : Typeface.DEFAULT.getStyle()), 0, spannableString.length(), 0);
                    spannableString.setSpan(lVar, 0, spannableString.length(), 0);
                    if (z) {
                        spannableString.setSpan(new TextAppearanceSpan(aVar.itemView.getContext(), R.style.VkUiTypography_ParagraphSemiBold), 0, spannableString.length(), 0);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "…");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    lfo0Var.c = spannableStringBuilder;
                    lfo0Var.d = false;
                    View view = aVar.itemView;
                    textView.setText(lfo0.b(lfo0Var, (view.getMeasuredWidth() - view.getPaddingStart()) - view.getPaddingEnd(), 0, 6));
                    break;
                } else {
                    textView.setText(b);
                    break;
                }
            case 1:
                cvk.w(j03.g(((View) obj2).getContext(), (Throwable) obj, R.string.error), false);
                break;
            case 2:
                WebView webView = (WebView) obj;
                shv shvVar = ((Html5View.c) obj2).a;
                if (shvVar != null) {
                    shvVar.b(webView);
                    break;
                }
                break;
            case 3:
                ((ViewGroup) obj2).addView((View) obj);
                break;
            case 4:
                ((rxa0) obj2).b.v("original_tracks_order", i7o0.a((List) obj));
                break;
            case 5:
                Ya.b((Ya) obj2, (LevelPlayAdInfo) obj);
                break;
            case 6:
                Context context2 = (Context) obj2;
                try {
                    MyTargetActivity.f = new z8z0.a((String) obj);
                    Intent intent = new Intent(context2, (Class<?>) MyTargetActivity.class);
                    if (!(context2 instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    context2.startActivity(intent);
                    break;
                } catch (Exception e) {
                    gu8.e(null, "InternalNavigationRouterImpl: Error opening webview: " + e.getMessage());
                    return;
                }
            default:
                ((v.s) obj2).s((String) obj);
                break;
        }
    }

    public /* synthetic */ z6(z8z0 z8z0Var, Context context, String str) {
        this.b = 6;
        this.c = context;
        this.d = str;
    }
}
