package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.provider.FontsContractCompat$Columns;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.superapp.print_animation_text.PrintAnimationTextView;
import com.yandex.go.wallet.custom.plaque_container.PlaqueContainerHolder;
import com.yandex.passport.internal.network.m;
import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class kkc0 implements plk {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ kkc0(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    private final void a(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
    }

    private final void b(View view, clk clkVar) {
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        switch (this.b) {
            case 0:
                break;
            default:
                FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
                KeyEvent.Callback childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
                PrintAnimationTextView printAnimationTextView = childAt instanceof PrintAnimationTextView ? (PrintAnimationTextView) childAt : null;
                if (printAnimationTextView != null) {
                    c(printAnimationTextView, clkVar.i);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(PrintAnimationTextView printAnimationTextView, JSONObject jSONObject) {
        z2f0 a;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        String e;
        Float j;
        String e2;
        Integer l;
        String e3;
        Integer l2;
        String e4;
        Integer l3;
        w76 w76Var = (w76) this.c;
        w76Var.getClass();
        JSONObject optJSONObject2 = jSONObject != null ? jSONObject.optJSONObject("font_style") : null;
        k5a1.b(printAnimationTextView, new u2f0((optJSONObject2 == null || (e4 = m.e("font_size", optJSONObject2)) == null || (l3 = bvu0.l(10, e4)) == null) ? 16 : l3.intValue(), (optJSONObject2 == null || (e3 = m.e(FontsContractCompat$Columns.WEIGHT, optJSONObject2)) == null || (l2 = bvu0.l(10, e3)) == null) ? 500 : l2.intValue(), (optJSONObject2 == null || (e2 = m.e("line_height", optJSONObject2)) == null || (l = bvu0.l(10, e2)) == null) ? 17 : l.intValue(), (optJSONObject2 == null || (e = m.e("letter_spacing", optJSONObject2)) == null || (j = avu0.j(e)) == null) ? -0.005f : j.floatValue()));
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("animated_title")) == null) {
            a = y2f0.a();
        } else {
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("items");
            if (optJSONObject3 == null) {
                a = y2f0.a();
            } else {
                MapBuilder mapBuilder = new MapBuilder();
                Iterator<String> keys = optJSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject(next);
                    if (optJSONObject4 != null) {
                        String optString = optJSONObject4.optString("text");
                        if (optString.length() <= 0) {
                            optString = null;
                        }
                        if (optString != null) {
                            kdc i = ((ufu) w76Var.b).i(optJSONObject4.optString("color"));
                            if (i != null) {
                                SpannableString spannableString = new SpannableString(optString);
                                spannableString.setSpan(new ForegroundColorSpan(s8o.m(i, w76Var.a)), 0, optString.length(), 17);
                                optString = spannableString;
                            }
                            mapBuilder.put(next, new v2f0(optString));
                        }
                    }
                }
                MapBuilder j2 = mapBuilder.j();
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("keyframes");
                if (optJSONArray2 == null) {
                    a = y2f0.a();
                } else {
                    int length = optJSONArray2.length();
                    ListBuilder listBuilder = new ListBuilder(length);
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject optJSONObject5 = optJSONArray2.optJSONObject(i2);
                        if (optJSONObject5 != null && (optJSONArray = optJSONObject5.optJSONArray("items")) != null) {
                            int length2 = optJSONArray.length();
                            ListBuilder listBuilder2 = new ListBuilder(length2);
                            for (int i3 = 0; i3 < length2; i3++) {
                                String optString2 = optJSONArray.optString(i3);
                                if (evu0.J(optString2)) {
                                    optString2 = null;
                                }
                                if (optString2 != null) {
                                    listBuilder2.add(optString2);
                                }
                            }
                            listBuilder.add(new w2f0(listBuilder2.j()));
                        }
                    }
                    ListBuilder j3 = listBuilder.j();
                    long optLong = optJSONObject.optLong("hide_delay");
                    long optLong2 = optJSONObject.optLong("hide_animation_duration");
                    long optLong3 = optJSONObject.optLong("show_delay");
                    long optLong4 = optJSONObject.optLong("show_animation_duration");
                    Object opt = optJSONObject.opt("repeat_count");
                    a = new x2f0(j2, j3, null, optLong, optLong2, optLong3, optLong4, opt instanceof Integer ? (Integer) opt : null);
                }
            }
        }
        printAnimationTextView.render(a);
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        switch (this.b) {
            case 0:
                mkc0 mkc0Var = (mkc0) this.c;
                Context context = div2View.getContext();
                h0t h0tVar = mkc0Var.a;
                return new PlaqueContainerHolder(context, (tse) h0tVar.a.get(), (jn4) h0tVar.b.get(), (f1d0) h0tVar.c.get());
            default:
                PrintAnimationTextView printAnimationTextView = new PrintAnimationTextView(div2View.getContext(), null, 0, 6, null);
                printAnimationTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                c(printAnimationTextView, clkVar.i);
                GoFrameLayout goFrameLayout = new GoFrameLayout(div2View.getContext(), null, 0, 0, 14, null);
                goFrameLayout.addView(printAnimationTextView, new FrameLayout.LayoutParams(-2, -2, 17));
                return goFrameLayout;
        }
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        switch (this.b) {
            case 0:
                return jl40.l(str, "plaque_container");
            default:
                return jl40.l(str, "diff_animation_text");
        }
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        switch (this.b) {
            case 0:
                break;
            default:
                FrameLayout frameLayout = view instanceof FrameLayout ? (FrameLayout) view : null;
                KeyEvent.Callback childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
                PrintAnimationTextView printAnimationTextView = childAt instanceof PrintAnimationTextView ? (PrintAnimationTextView) childAt : null;
                if (printAnimationTextView != null) {
                    printAnimationTextView.pauseAnimation();
                    break;
                }
                break;
        }
    }
}
