package com.yandex.div.core.view2;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.internal.view.DivImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivGallery;
import defpackage.egk;
import defpackage.evu0;
import defpackage.ffl;
import defpackage.hal;
import defpackage.mdl;
import defpackage.mp31;
import defpackage.muk;
import defpackage.oyr;
import defpackage.psk;
import defpackage.qje;
import defpackage.rvo;
import defpackage.tls;
import defpackage.uvo;
import defpackage.vih0;
import defpackage.w511;
import defpackage.wzo;
import defpackage.x7l;
import defpackage.xrk;
import defpackage.ycl;
import defpackage.yh;
import defpackage.zy11;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d {
    public final boolean a;
    public final yh b;

    public d(boolean z, yh yhVar) {
        this.a = z;
        this.b = yhVar;
    }

    public static void a(View view, egk egkVar, Boolean bool) {
        DivAccessibility.Type type;
        DivAccessibility q = egkVar.q();
        DivAccessibilityBinder$AccessibilityType e = (q == null || (type = q.g) == null) ? null : e(type, egkVar);
        if (e == DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON) {
            AccessibilityDelegateCompat f = androidx.core.view.b.f(view);
            wzo wzoVar = f instanceof wzo ? (wzo) f : null;
            if (wzoVar != null) {
                wzoVar.a(bool);
            }
        }
    }

    public static void b(View view, String str, String str2) {
        if (str == null) {
            str = str2;
        } else if (str2 != null && !str.equals(str2)) {
            str = oyr.f('\n', str, str2);
        }
        view.setContentDescription(str);
    }

    public static void c(View view, egk egkVar, DivAccessibility.Mode mode) {
        CharSequence contentDescription;
        DivAccessibility.Mode mode2 = DivAccessibility.Mode.MERGE;
        int i = 0;
        boolean z = mode == mode2;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        new mp31(vih0.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).e(view, Boolean.valueOf(z));
        if (mode == DivAccessibility.Mode.EXCLUDE) {
            i = 4;
        } else {
            DivAccessibility q = egkVar.q();
            if ((q != null ? q.g : null) == DivAccessibility.Type.HEADER || ((contentDescription = view.getContentDescription()) != null && !evu0.J(contentDescription) && (mode == mode2 || (view instanceof DivImageView) || (view instanceof DivGifImageView)))) {
                i = 1;
            }
        }
        view.setImportantForAccessibility(i);
    }

    public static DivAccessibilityBinder$AccessibilityType e(DivAccessibility.Type type, egk egkVar) {
        switch (c.a[type.ordinal()]) {
            case 1:
                if (egkVar instanceof muk) {
                    return DivAccessibilityBinder$AccessibilityType.EDIT_TEXT;
                }
                if (egkVar instanceof ffl) {
                    return DivAccessibilityBinder$AccessibilityType.TEXT;
                }
                if (egkVar instanceof mdl) {
                    return DivAccessibilityBinder$AccessibilityType.TAB_WIDGET;
                }
                if (egkVar instanceof x7l) {
                    return DivAccessibilityBinder$AccessibilityType.SELECT;
                }
                if (egkVar instanceof hal) {
                    return DivAccessibilityBinder$AccessibilityType.SLIDER;
                }
                if (!(egkVar instanceof psk) && !(egkVar instanceof xrk)) {
                    if (egkVar instanceof DivGallery) {
                        DivAccessibility divAccessibility = ((DivGallery) egkVar).a;
                        if ((divAccessibility != null ? divAccessibility.a : null) != null) {
                            return DivAccessibilityBinder$AccessibilityType.PAGER;
                        }
                    }
                    return egkVar instanceof DivContainer ? DivAccessibilityBinder$AccessibilityType.CONTAINER : egkVar instanceof ycl ? DivAccessibilityBinder$AccessibilityType.SWITCH : DivAccessibilityBinder$AccessibilityType.NONE;
                }
                return DivAccessibilityBinder$AccessibilityType.IMAGE;
            case 2:
                return DivAccessibilityBinder$AccessibilityType.NONE;
            case 3:
                return DivAccessibilityBinder$AccessibilityType.BUTTON;
            case 4:
                return DivAccessibilityBinder$AccessibilityType.IMAGE;
            case 5:
                return DivAccessibilityBinder$AccessibilityType.TEXT;
            case 6:
                return DivAccessibilityBinder$AccessibilityType.EDIT_TEXT;
            case 7:
                return DivAccessibilityBinder$AccessibilityType.HEADER;
            case 8:
                return DivAccessibilityBinder$AccessibilityType.LIST;
            case 9:
                return DivAccessibilityBinder$AccessibilityType.SELECT;
            case 10:
                return DivAccessibilityBinder$AccessibilityType.TAB_WIDGET;
            case 11:
                return DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON;
            case 12:
                return DivAccessibilityBinder$AccessibilityType.CHECK_BOX;
            default:
                w511.b();
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0180, code lost:
    
        if ((r11 != null ? r11.g : null) == ((r13 == null || (r12 = r13.q()) == null) ? null : r12.g)) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        if (r0 == (r3 != null ? r3.g : null)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0100, code lost:
    
        if (defpackage.qje.k(r8, (r13 == null || (r0 = r13.q()) == null) ? null : r0.b) != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:155:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(View view, egk egkVar, egk egkVar2, rvo rvoVar, uvo uvoVar) {
        final d dVar;
        final View view2;
        final egk egkVar3;
        final rvo rvoVar2;
        Expression expression;
        Expression expression2;
        DivAccessibility q;
        DivAccessibility q2;
        DivAccessibility q3;
        DivAccessibility q4;
        boolean z;
        AccessibilityDelegateCompat accessibilityDelegateCompat;
        DivAccessibility q5 = egkVar.q();
        boolean z2 = this.a;
        if (q5 == null) {
            if ((egkVar2 != null ? egkVar2.q() : null) == null) {
                if (z2) {
                    c(view, egkVar, null);
                    return;
                }
                return;
            }
        }
        if (this.b.a(view.getContext())) {
            if (egkVar2 != null) {
                DivAccessibility q6 = egkVar.q();
                DivAccessibility.Type type = q6 != null ? q6.g : null;
                DivAccessibility q7 = egkVar2.q();
            }
            DivAccessibility q8 = egkVar.q();
            DivAccessibility.Type type2 = q8 != null ? q8.g : null;
            if (type2 == null) {
                type2 = DivAccessibility.Type.AUTO;
            }
            DivAccessibilityBinder$AccessibilityType e = e(type2, egkVar);
            if (e != DivAccessibilityBinder$AccessibilityType.LIST || !(view instanceof BackHandlingRecyclerView)) {
                String str = "";
                switch (c.b[e.ordinal()]) {
                    case 1:
                    case 4:
                    case 6:
                    case 8:
                        z = e != DivAccessibilityBinder$AccessibilityType.HEADER;
                        CharSequence accessibilityClassName = view.getAccessibilityClassName();
                        if ((str.length() == 0 || str.equals(accessibilityClassName)) && !z) {
                            accessibilityDelegateCompat = null;
                            break;
                        } else {
                            accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                            break;
                        }
                        break;
                    case 2:
                        str = "android.widget.Button";
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName2 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                            if (e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX) {
                                break;
                            }
                            accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                            break;
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    case 3:
                        str = AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName;
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName22 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    case 5:
                        str = "android.widget.ImageView";
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName222 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    case 7:
                        str = "androidx.viewpager.widget.ViewPager";
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName2222 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    case 9:
                        str = "android.widget.Spinner";
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName22222 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    case 10:
                        str = "android.widget.TabWidget";
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName222222 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    case 11:
                        str = AndroidComposeViewAccessibilityDelegateCompat.TextClassName;
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName2222222 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    case 12:
                        str = "android.widget.CheckBox";
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName22222222 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    case 13:
                        str = "android.widget.RadioButton";
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName222222222 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    case 14:
                        str = "android.view.ViewGroup";
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName2222222222 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    case 15:
                        str = "android.widget.Switch";
                        if (e != DivAccessibilityBinder$AccessibilityType.HEADER) {
                        }
                        CharSequence accessibilityClassName22222222222 = view.getAccessibilityClassName();
                        if (str.length() == 0) {
                        }
                        accessibilityDelegateCompat = new wzo(str, z, e != DivAccessibilityBinder$AccessibilityType.CHECK_BOX || e == DivAccessibilityBinder$AccessibilityType.RADIO_BUTTON);
                        break;
                    default:
                        w511.b();
                        break;
                }
                return;
            }
            accessibilityDelegateCompat = new a((BackHandlingRecyclerView) view);
            if (accessibilityDelegateCompat != null) {
                androidx.core.view.b.p(view, accessibilityDelegateCompat);
            }
        }
        DivAccessibility q9 = egkVar.q();
        final Expression expression3 = q9 != null ? q9.a : null;
        DivAccessibility q10 = egkVar.q();
        final Expression expression4 = q10 != null ? q10.b : null;
        if (qje.k(expression3, (egkVar2 == null || (q4 = egkVar2.q()) == null) ? null : q4.a)) {
        }
        b(view, expression3 != null ? (String) expression3.a(rvoVar) : null, expression4 != null ? (String) expression4.a(rvoVar) : null);
        if (!qje.B(expression3) || !qje.B(expression4)) {
            dVar = this;
            view2 = view;
            egkVar3 = egkVar;
            rvoVar2 = rvoVar;
            tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindDescriptionAndHint$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    Expression expression5;
                    d dVar2 = d.this;
                    View view3 = view2;
                    Expression expression6 = expression3;
                    DivAccessibility.Mode mode = null;
                    String str2 = expression6 != null ? (String) expression6.a(rvoVar2) : null;
                    Expression expression7 = expression4;
                    String str3 = expression7 != null ? (String) expression7.a(rvoVar2) : null;
                    dVar2.getClass();
                    d.b(view3, str2, str3);
                    d dVar3 = d.this;
                    View view4 = view2;
                    egk egkVar4 = egkVar3;
                    DivAccessibility q11 = egkVar4.q();
                    if (q11 != null && (expression5 = q11.d) != null) {
                        mode = (DivAccessibility.Mode) expression5.a(rvoVar2);
                    }
                    dVar3.getClass();
                    d.c(view4, egkVar4, mode);
                    return zy11.a;
                }
            };
            uvoVar.addSubscription(expression3 != null ? expression3.c(rvoVar2, tlsVar) : null);
            uvoVar.addSubscription(expression4 != null ? expression4.c(rvoVar2, tlsVar) : null);
            if (z2) {
                DivAccessibility q11 = egkVar3.q();
                Expression expression5 = q11 != null ? q11.d : null;
                if (qje.k(expression5, (egkVar2 == null || (q3 = egkVar2.q()) == null) ? null : q3.d)) {
                    DivAccessibility q12 = egkVar3.q();
                }
                c(view2, egkVar3, expression5 != null ? (DivAccessibility.Mode) expression5.a(rvoVar2) : null);
                if (!qje.B(expression5)) {
                    uvoVar.addSubscription(expression5 != null ? expression5.c(rvoVar2, new tls() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindMode$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            d dVar2 = d.this;
                            View view3 = view2;
                            egk egkVar4 = egkVar3;
                            dVar2.getClass();
                            d.c(view3, egkVar4, (DivAccessibility.Mode) obj);
                            return zy11.a;
                        }
                    }) : null);
                }
            }
            DivAccessibility q13 = egkVar3.q();
            expression = q13 == null ? q13.f : null;
            if (!qje.k(expression, (egkVar2 != null || (q2 = egkVar2.q()) == null) ? null : q2.f)) {
                androidx.core.view.b.t(view2, expression != null ? (String) expression.a(rvoVar2) : null);
                if (!qje.B(expression)) {
                    uvoVar.addSubscription(expression != null ? expression.c(rvoVar2, new tls() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindStateDescription$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            d dVar2 = d.this;
                            View view3 = view2;
                            dVar2.getClass();
                            androidx.core.view.b.t(view3, (String) obj);
                            return zy11.a;
                        }
                    }) : null);
                }
            }
            DivAccessibility q14 = egkVar3.q();
            expression2 = q14 == null ? q14.c : null;
            if (qje.k(expression2, (egkVar2 != null || (q = egkVar2.q()) == null) ? null : q.c)) {
                a(view2, egkVar3, expression2 != null ? (Boolean) expression2.a(rvoVar2) : null);
                if (qje.B(expression2)) {
                    return;
                }
                uvoVar.addSubscription(expression2 != null ? expression2.c(rvoVar2, new tls() { // from class: com.yandex.div.core.view2.DivAccessibilityBinder$bindCheckedState$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        d dVar2 = d.this;
                        View view3 = view2;
                        egk egkVar4 = egkVar3;
                        dVar2.getClass();
                        d.a(view3, egkVar4, bool);
                        return zy11.a;
                    }
                }) : null);
                return;
            }
            return;
        }
        dVar = this;
        view2 = view;
        egkVar3 = egkVar;
        rvoVar2 = rvoVar;
        if (z2) {
        }
        DivAccessibility q132 = egkVar3.q();
        if (q132 == null) {
        }
        if (!qje.k(expression, (egkVar2 != null || (q2 = egkVar2.q()) == null) ? null : q2.f)) {
        }
        DivAccessibility q142 = egkVar3.q();
        if (q142 == null) {
        }
        if (qje.k(expression2, (egkVar2 != null || (q = egkVar2.q()) == null) ? null : q.c)) {
        }
    }
}
