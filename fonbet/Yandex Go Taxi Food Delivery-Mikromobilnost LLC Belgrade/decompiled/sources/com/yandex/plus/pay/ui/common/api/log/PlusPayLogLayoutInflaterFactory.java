package com.yandex.plus.pay.ui.common.api.log;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.theme.MaterialComponentsViewInflater;
import com.yandex.plus.log.api.LogPriority;
import defpackage.g9h;
import defpackage.idd0;
import defpackage.mdd0;
import defpackage.t8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/plus/pay/ui/common/api/log/PlusPayLogLayoutInflaterFactory;", "Landroid/view/LayoutInflater$Factory2;", "", "tag", "Lmdd0;", "logger", "inflaterFactory", "<init>", "(Ljava/lang/String;Lmdd0;Landroid/view/LayoutInflater$Factory2;)V", "Landroid/view/View;", "view", "Lzy11;", "addClickLogging", "(Landroid/view/View;)V", "addPressLogging", "addFocusChangeLogging", "getLogViewName", "(Landroid/view/View;)Ljava/lang/String;", "name", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "onCreateView", "(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;", "parent", "(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;", "Ljava/lang/String;", "Lmdd0;", "Landroid/view/LayoutInflater$Factory2;", "Lcom/google/android/material/theme/MaterialComponentsViewInflater;", "fallbackInflater", "Lcom/google/android/material/theme/MaterialComponentsViewInflater;", "pay-sdk-ui-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PlusPayLogLayoutInflaterFactory implements LayoutInflater.Factory2 {
    private final MaterialComponentsViewInflater fallbackInflater;
    private final LayoutInflater.Factory2 inflaterFactory;
    private final mdd0 logger;
    private final String tag;

    public PlusPayLogLayoutInflaterFactory(String str, mdd0 mdd0Var, LayoutInflater.Factory2 factory2) {
        this.tag = str;
        this.logger = mdd0Var;
        this.inflaterFactory = factory2;
        this.fallbackInflater = new MaterialComponentsViewInflater();
    }

    private final void addClickLogging(View view) {
        if (view.isClickable()) {
            view.setOnTouchListener(new t8(16, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addClickLogging$lambda$2(PlusPayLogLayoutInflaterFactory plusPayLogLayoutInflaterFactory, View view, MotionEvent motionEvent) {
        boolean onTouchEvent = view.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            mdd0 mdd0Var = plusPayLogLayoutInflaterFactory.logger;
            String str = plusPayLogLayoutInflaterFactory.tag;
            LogPriority logPriority = LogPriority.INFO;
            mdd0Var.e(logPriority);
            mdd0Var.a(logPriority, str, "User clicked on " + plusPayLogLayoutInflaterFactory.getLogViewName(view));
        }
        return onTouchEvent;
    }

    private final void addFocusChangeLogging(View view) {
        if (view.isFocusable()) {
            view.setOnFocusChangeListener(new idd0(0, this, view.getOnFocusChangeListener(), view));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addFocusChangeLogging$lambda$7(PlusPayLogLayoutInflaterFactory plusPayLogLayoutInflaterFactory, View.OnFocusChangeListener onFocusChangeListener, View view, View view2, boolean z) {
        if (z) {
            mdd0 mdd0Var = plusPayLogLayoutInflaterFactory.logger;
            String str = plusPayLogLayoutInflaterFactory.tag;
            LogPriority logPriority = LogPriority.INFO;
            mdd0Var.e(logPriority);
            mdd0Var.a(logPriority, str, "User focused on " + plusPayLogLayoutInflaterFactory.getLogViewName(view));
        } else {
            mdd0 mdd0Var2 = plusPayLogLayoutInflaterFactory.logger;
            String str2 = plusPayLogLayoutInflaterFactory.tag;
            LogPriority logPriority2 = LogPriority.INFO;
            mdd0Var2.e(logPriority2);
            mdd0Var2.a(logPriority2, str2, "User unfocused " + plusPayLogLayoutInflaterFactory.getLogViewName(view));
        }
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    private final void addPressLogging(View view) {
        if (view.isClickable()) {
            view.setOnKeyListener(new g9h(3, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addPressLogging$lambda$4(PlusPayLogLayoutInflaterFactory plusPayLogLayoutInflaterFactory, View view, int i, KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        boolean onKeyUp = action != 0 ? action != 1 ? false : view.onKeyUp(i, keyEvent) : view.onKeyDown(i, keyEvent);
        if (keyEvent.getAction() == 1 && (i == 23 || i == 62 || i == 66 || i == 160)) {
            mdd0 mdd0Var = plusPayLogLayoutInflaterFactory.logger;
            String str = plusPayLogLayoutInflaterFactory.tag;
            LogPriority logPriority = LogPriority.INFO;
            mdd0Var.e(logPriority);
            mdd0Var.a(logPriority, str, "User pressed on " + plusPayLogLayoutInflaterFactory.getLogViewName(view));
        }
        return onKeyUp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getLogViewName(View view) {
        TextView textView;
        CharSequence text;
        StringBuilder sb = new StringBuilder();
        sb.append(view.getClass().getSimpleName());
        if (view.getId() != -1) {
            try {
                sb.append(" [id: " + view.getResources().getResourceEntryName(view.getId()) + ']');
            } catch (Resources.NotFoundException unused) {
                sb.append(" [id: " + view.getId() + ']');
            }
        }
        if ((view instanceof TextView) && (text = (textView = (TextView) view).getText()) != null && text.length() != 0) {
            sb.append(" \"" + ((Object) textView.getText()) + OpenList.CHAR_QUOTE);
        }
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null && contentDescription.length() != 0) {
            sb.append(Extension.O_BRAKE_SPACE + ((Object) view.getContentDescription()) + ')');
        }
        Object tag = view.getTag();
        if (tag != null) {
            sb.append(" {tag: " + tag + '}');
        }
        return sb.toString();
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        View f;
        LayoutInflater.Factory2 factory2 = this.inflaterFactory;
        if (factory2 == null || (f = factory2.onCreateView(parent, name, context, attrs)) == null) {
            f = this.fallbackInflater.f(parent, name, context, attrs, false, false, false, false);
        }
        if (f == null) {
            return null;
        }
        addClickLogging(f);
        addPressLogging(f);
        addFocusChangeLogging(f);
        return f;
    }

    public /* synthetic */ PlusPayLogLayoutInflaterFactory(String str, mdd0 mdd0Var, LayoutInflater.Factory2 factory2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, mdd0Var, (i & 4) != 0 ? null : factory2);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView(null, name, context, attrs);
    }
}
