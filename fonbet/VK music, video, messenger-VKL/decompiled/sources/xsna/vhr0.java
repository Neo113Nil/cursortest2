package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.core.ui.VKToolbar;
import com.vk.core.ui.themes.ThemeKeyAttributes;
import com.vk.core.view.VKAppBarLayout;
import com.vk.core.view.components.radio.VkRadioButton;
import com.vk.design.inspector.DesignInspectorComponent;
import io.appmetrica.analytics.impl.L2;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import xsna.e5x;

/* compiled from: VKUILayoutFactory.kt */
/* loaded from: classes.dex */
public final class vhr0 implements LayoutInflater.Factory2 {
    public static final HashMap<String, wzs<Context, AttributeSet, View>> f;
    public static final Object g;
    public final gdr0 b;
    public final zzs<View, String, Context, AttributeSet, View> c;
    public int d;
    public final bpn0 e = new bpn0(new ib3(15));

    /* compiled from: VKUILayoutFactory.kt */
    public static final class a {
        public static final int a(Context context, AttributeSet attributeSet) {
            HashMap<String, wzs<Context, AttributeSet, View>> hashMap = vhr0.f;
            if (attributeSet == null || attributeSet.getStyleAttribute() == 0) {
                return 0;
            }
            int styleAttribute = attributeSet.getStyleAttribute();
            String resourceTypeName = context.getResources().getResourceTypeName(styleAttribute);
            if ("attr".equals(resourceTypeName)) {
                return e3m.g(styleAttribute, context);
            }
            if (TtmlNode.TAG_STYLE.equals(resourceTypeName)) {
                return styleAttribute;
            }
            return 0;
        }
    }

    static {
        HashMap<String, wzs<Context, AttributeSet, View>> hashMap = new HashMap<>();
        hashMap.put("TextView", new ghr0());
        hashMap.put("ImageView", new dzg0(2));
        hashMap.put("Button", new uhr0());
        hashMap.put("EditText", new hhr0());
        hashMap.put("Spinner", new ihr0());
        hashMap.put("ImageButton", new pni0(2));
        hashMap.put("CheckBox", new jhr0());
        hashMap.put("RadioButton", new khr0());
        hashMap.put("CheckedTextView", new s7r0(1));
        hashMap.put("AutoCompleteTextView", new lhr0());
        hashMap.put("MultiAutoCompleteTextView", new nhr0());
        hashMap.put("SeekBar", new ohr0());
        f = hashMap;
        g = pn00.k(new Pair("CheckBox", new phr0()), new Pair("androidx.appcompat.widget.AppCompatCheckBox", new qhr0()), new Pair("RadioButton", new rhr0()), new Pair("androidx.appcompat.widget.AppCompatRadioButton", new shr0()), new Pair("androidx.appcompat.widget.SwitchCompat", new thr0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vhr0(gdr0 gdr0Var, zzs<? super View, ? super String, ? super Context, ? super AttributeSet, ? extends View> zzsVar) {
        this.b = gdr0Var;
        this.c = zzsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a(Context context, View view, String str, AttributeSet attributeSet) {
        View view2;
        View vKToolbar = str.equals("androidx.appcompat.widget.Toolbar") ? new VKToolbar(context, attributeSet, 0) : null;
        if (vKToolbar == null) {
            wzs wzsVar = (wzs) g.get(str);
            if (wzsVar != null && (view2 = (View) wzsVar.invoke(context, attributeSet)) != null) {
                return view2;
            }
            if ((((Boolean) com.vk.core.apps.a.l.getValue()).booleanValue() ? e5x.a.a : null) != null) {
                Integer valueOf = Integer.valueOf(this.d);
                e5x n = ((DesignInspectorComponent) ((k7m) m7m.f(e5x.a.b)).a(fpf0.a(DesignInspectorComponent.class))).n();
                if (n != null) {
                    vKToolbar = ((q5x) n).b(str, context, attributeSet, valueOf);
                    if (vKToolbar == null) {
                        zzs<View, String, Context, AttributeSet, View> zzsVar = this.c;
                        vKToolbar = zzsVar != null ? zzsVar.invoke(view, str, context, attributeSet) : null;
                        if (vKToolbar == null) {
                            wzs<Context, AttributeSet, View> wzsVar2 = f.get(str);
                            vKToolbar = wzsVar2 != null ? wzsVar2.invoke(context, attributeSet) : null;
                            if (vKToolbar == null) {
                                gdr0 gdr0Var = this.b;
                                if (gdr0Var != null) {
                                    return gdr0Var.a(context, view, str, attributeSet);
                                }
                                return null;
                            }
                        }
                    }
                }
            }
            vKToolbar = null;
            if (vKToolbar == null) {
            }
        }
        return vKToolbar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(final View view, final String str, final Context context, final AttributeSet attributeSet) {
        Object invoke;
        View a2;
        izs izsVar = new izs() { // from class: xsna.mhr0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                String str2;
                Context context2 = context;
                AttributeSet attributeSet2 = attributeSet;
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder("parent=");
                View view2 = view;
                sb.append(view2 != null ? qjg.a(view2) : null);
                sb.append(':');
                String str3 = "FAILED_TO_GET_ID";
                if (view2 == null) {
                    str2 = "null";
                } else {
                    try {
                        str2 = view2.getId() == -1 ? "NO_ID" : view2.getContext().getResources().getResourceName(view2.getId());
                    } catch (Throwable unused) {
                        str2 = "FAILED_TO_GET_ID";
                    }
                }
                sb.append(str2);
                sb.append(", view=");
                sb.append(str);
                sb.append(':');
                try {
                    TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, new int[]{R.attr.id});
                    int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                    obtainStyledAttributes.recycle();
                    str3 = resourceId == -1 ? "NO_ID" : context2.getResources().getResourceName(resourceId);
                } catch (Throwable unused2) {
                }
                sb.append(str3);
                return new InflateException(sb.toString(), th);
            }
        };
        try {
            a2 = a(context, view, str, attributeSet);
        } catch (Throwable th) {
            bpn0 bpn0Var = this.e;
            ((mup0) bpn0Var.getValue()).getClass();
            if (!mup0.a(th) || !str.equals("TextView")) {
                throw ((Throwable) invoke);
            }
            ((mup0) bpn0Var.getValue()).getClass();
            mup0.b();
            try {
                a2 = a(context, view, str, attributeSet);
            } finally {
                Throwable th2 = (Throwable) izsVar.invoke(th);
            }
        }
        if (a2 == null) {
            a2 = (str.equals("android.support.design.widget.AppBarLayout") || str.equals("com.google.android.material.appbar.AppBarLayout")) ? new VKAppBarLayout(context, attributeSet) : null;
        }
        if (a2 != null) {
            Object tag = a2.getTag();
            if (!(tag instanceof String) || !epx.f(tag, context.getString(com.vkontakte.android.R.string.dynamic_theme_ignored))) {
                if (a2 instanceof TextView) {
                    TextView textView = (TextView) a2;
                    if (textView instanceof CheckBox) {
                        dhr0.a.getClass();
                        dhr0.S((CheckBox) a2);
                    } else if (textView instanceof RadioButton) {
                        RadioButton radioButton = (RadioButton) a2;
                        dhr0.a.getClass();
                        if (!(radioButton instanceof VkRadioButton)) {
                            dhr0.S(radioButton);
                        }
                    } else if (textView instanceof tm10) {
                        dhr0.a.getClass();
                        dhr0.T((tm10) a2);
                    } else if (textView instanceof SwitchCompat) {
                        dhr0.a.getClass();
                        dhr0.U((SwitchCompat) a2);
                    } else if (textView instanceof Switch) {
                        Switch r8 = (Switch) a2;
                        dhr0.a.getClass();
                        r8.getThumbDrawable().setTintList(new ColorStateList(dhr0.q(), dhr0.G()));
                        r8.getTrackDrawable().setTintList(new ColorStateList(dhr0.q(), dhr0.H()));
                    }
                } else if (a2 instanceof WebView) {
                    dhr0.a.getClass();
                    dhr0.D().getClass();
                    com.vk.core.ui.themes.a.f((WebView) a2);
                }
            }
            dhr0.a.getClass();
            com.vk.core.ui.themes.a D = dhr0.D();
            D.getClass();
            boolean z = a2.getContext() instanceof l7s;
            if (a2.getTag(com.vkontakte.android.R.id.theme_tag_key) == null && !z) {
                SparseIntArray sparseIntArray = new SparseIntArray(3);
                Iterator<ppo0> it = D.a.iterator();
                while (it.hasNext()) {
                    it.next().a(sparseIntArray, attributeSet);
                }
                int o = dhr0.o("textColor", attributeSet);
                dhr0.a.getClass();
                if (dhr0.J(o)) {
                    sparseIntArray.append(ThemeKeyAttributes.TEXT_COLOR.h(), o);
                }
                int o2 = dhr0.o("textColorHint", attributeSet);
                if (apo0.a.contains(Integer.valueOf(o))) {
                    sparseIntArray.append(ThemeKeyAttributes.HINT_TEXT_COLOR.h(), o2);
                }
                int o3 = dhr0.o(L2.g, attributeSet);
                if (dhr0.J(o3)) {
                    sparseIntArray.append(ThemeKeyAttributes.BACKGROUND.h(), o3);
                } else {
                    String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", L2.g);
                    int i = 0;
                    if (attributeValue != null && brm0.B(attributeValue, "@", false)) {
                        i = Integer.parseInt(brm0.y(attributeValue, "@", ""));
                    }
                    if (i > 0) {
                        sparseIntArray.append(ThemeKeyAttributes.BACKGROUND_RES.h(), i);
                    }
                }
                int o4 = dhr0.o("backgroundTint", attributeSet);
                if (dhr0.J(o4)) {
                    sparseIntArray.append(ThemeKeyAttributes.BACKGROUND_TINT.h(), o4);
                }
                int o5 = dhr0.o("tint", attributeSet);
                if (dhr0.J(o5)) {
                    sparseIntArray.append(ThemeKeyAttributes.IMAGE_TINT.h(), o5);
                } else {
                    int A = dhr0.A("tint", attributeSet);
                    if (dhr0.J(A)) {
                        sparseIntArray.append(ThemeKeyAttributes.IMAGE_TINT.h(), A);
                    }
                }
                int A2 = dhr0.A("contentScrim", attributeSet);
                if (dhr0.J(A2)) {
                    sparseIntArray.append(ThemeKeyAttributes.CONTENT_SCRIM.h(), A2);
                }
                int A3 = dhr0.A("drawableTint", attributeSet);
                if (A3 != 0) {
                    sparseIntArray.append(ThemeKeyAttributes.DRAWABLE_TINT.h(), A3);
                }
                if (sparseIntArray.size() > 0) {
                    a2.setTag(com.vkontakte.android.R.id.theme_tag_key, sparseIntArray);
                }
                if (a2 instanceof Toolbar) {
                    awt0.t(a2, new yaa(D, (Toolbar) a2));
                }
                com.vk.core.ui.themes.a.e(a2);
            }
            dhr0.a.getClass();
            dhr0.h.getClass();
        }
        return a2;
    }
}
