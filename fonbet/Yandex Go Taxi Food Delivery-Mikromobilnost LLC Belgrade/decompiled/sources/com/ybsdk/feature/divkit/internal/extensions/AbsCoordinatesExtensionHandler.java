package com.ybsdk.feature.divkit.internal.extensions;

import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.div.core.view2.Div2View;
import defpackage.bpk;
import defpackage.dpk;
import defpackage.egk;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.o6;
import defpackage.p6;
import defpackage.rvo;
import defpackage.x4c;
import defpackage.xah0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AbsCoordinatesExtensionHandler implements dpk {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/extensions/AbsCoordinatesExtensionHandler$Type;", "", "CENTER", "CENTER_TOP", "CENTER_LEFT", "CENTER_RIGHT", "CENTER_BOTTOM", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BOTTOM_LEFT;
        public static final Type BOTTOM_RIGHT;
        public static final Type CENTER;
        public static final Type CENTER_BOTTOM;
        public static final Type CENTER_LEFT;
        public static final Type CENTER_RIGHT;
        public static final Type CENTER_TOP;
        public static final Type TOP_LEFT;
        public static final Type TOP_RIGHT;

        static {
            Type type = new Type("CENTER", 0);
            CENTER = type;
            Type type2 = new Type("CENTER_TOP", 1);
            CENTER_TOP = type2;
            Type type3 = new Type("CENTER_LEFT", 2);
            CENTER_LEFT = type3;
            Type type4 = new Type("CENTER_RIGHT", 3);
            CENTER_RIGHT = type4;
            Type type5 = new Type("CENTER_BOTTOM", 4);
            CENTER_BOTTOM = type5;
            Type type6 = new Type("TOP_LEFT", 5);
            TOP_LEFT = type6;
            Type type7 = new Type("TOP_RIGHT", 6);
            TOP_RIGHT = type7;
            Type type8 = new Type("BOTTOM_LEFT", 7);
            BOTTOM_LEFT = type8;
            Type type9 = new Type("BOTTOM_RIGHT", 8);
            BOTTOM_RIGHT = type9;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object obj;
        JSONObject jSONObject;
        Type type;
        List extensions = egkVar.getExtensions();
        if (extensions != null) {
            Iterator it = extensions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (jl40.l(((bpk) obj).a, "abs_coordinates")) {
                        break;
                    }
                }
            }
            bpk bpkVar = (bpk) obj;
            if (bpkVar != null && (jSONObject = bpkVar.b) != null) {
                String optString = jSONObject.optString("abs_coordinates_type");
                if (evu0.J(optString)) {
                    optString = null;
                }
                if (optString == null || (type = Type.valueOf(optString)) == null) {
                    type = Type.TOP_LEFT;
                }
                Type type2 = type;
                String optString2 = jSONObject.optString("var_name_x");
                String optString3 = jSONObject.optString("var_name_y");
                if (optString2 == null || evu0.J(optString2) || optString3 == null || evu0.J(optString3)) {
                    x4c.g("Either var_name_x or var_name_y is missing for abs_coordinates", null, null, null, 14);
                    return;
                }
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = Integer.MIN_VALUE;
                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                ref$IntRef2.element = Integer.MIN_VALUE;
                a aVar = new a(view, this, type2, ref$IntRef, ref$IntRef2, div2View, optString2, optString3);
                int i = 0;
                o6 o6Var = new o6(i, aVar);
                p6 p6Var = new p6(i, aVar);
                view.getViewTreeObserver().addOnGlobalLayoutListener(o6Var);
                view.getViewTreeObserver().addOnScrollChangedListener(p6Var);
                view.setTag(xah0.ybsdk_abs_coordinates_layout_change_listener_id, o6Var);
                view.setTag(xah0.ybsdk_abs_coordinates_scroll_listener_id, p6Var);
                return;
            }
        }
        x4c.g("No params found for extension abs_coordinates", null, null, null, 14);
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        if (extensions == null) {
            return false;
        }
        List list = extensions;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, "abs_coordinates")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            Object tag = view.getTag(xah0.ybsdk_abs_coordinates_layout_change_listener_id);
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = tag instanceof ViewTreeObserver.OnGlobalLayoutListener ? (ViewTreeObserver.OnGlobalLayoutListener) tag : null;
            if (onGlobalLayoutListener != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            Object tag2 = view.getTag(xah0.ybsdk_abs_coordinates_scroll_listener_id);
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = tag2 instanceof ViewTreeObserver.OnScrollChangedListener ? (ViewTreeObserver.OnScrollChangedListener) tag2 : null;
            if (onScrollChangedListener != null) {
                viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
            }
        }
    }
}
